package com.example.junekelectric.vocabnotebook;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    ListView listView;
    CustomAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Vocab> objects = new ArrayList<Vocab>();

        objects.add(new Vocab("", ""));

        objects.add(new Vocab("ww", "笑笑"));
        objects.add(new Vocab("ktkr", "キタコレ"));
        objects.add(new Vocab("自宅警備員","ニート"));
        objects.add(new Vocab("jk","常識的に考えて"));
        objects.add(new Vocab("乙","お疲れ様でーす"));
        objects.add(new Vocab("ROM","発言しないで黙ってみておけ"));
        objects.add(new Vocab("wktk", "ワクワクテカテカ"));
        objects.add(new Vocab("gdgd", "グダグダ"));
        objects.add(new Vocab("フルボッコ", "フルパワーでボッコボコォォ"));
        objects.add(new Vocab("マターリ", "まったり"));
        objects.add(new Vocab("リア充", "現実世界的に充実してる→恋人居る、週末に友達と遊ぶ…と充実してる"));
        objects.add(new Vocab("kwsk", "詳しく"));
        objects.add(new Vocab("orz", "人の頭・上半身・下半身で、落胆/挫折の際の心理状態を表している"));
        objects.add(new Vocab("age", "あげ"));
        objects.add(new Vocab("sage", "さげ"));
        objects.add(new Vocab("ノシ (・ω・)ノシ", "手を振るような動作"));
        objects.add(new Vocab("コテハン", "固定ハンドルネーム"));
        objects.add(new Vocab("うp", "アップ"));
        objects.add(new Vocab("なう", "now…つまり今"));
        objects.add(new Vocab("情弱", "情報に弱い"));
        objects.add(new Vocab("ようつべ", "YouTube"));
        objects.add(new Vocab("←", "ツッコミ・イタい発言を指す"));
        objects.add(new Vocab("※", "ただし、イケメンに限る"));
        objects.add(new Vocab("スレ", "スレッド（掲示板の）"));
        objects.add(new Vocab("鯖", "サーバー"));
        objects.add(new Vocab("メンヘラ", "精神が病んでいる人・行動が超ネガティブ"));;
        objects.add(new Vocab("ディスる・disる", "侮辱する"));
        objects.add(new Vocab("オワコン", "終わったコンテンツ"));
        objects.add(new Vocab("誰得", "誰が得するんだ"));
        objects.add(new Vocab("ワロタ・ワロス", "笑える・笑えた"));
        objects.add(new Vocab("キモス", "気持ち悪い"));
        objects.add(new Vocab("草生えた", "草→www"));
        objects.add(new Vocab("草不可能", "笑わずにはいられん"));
        objects.add(new Vocab("△", "◯◯さん、カッケェ〜"));
        objects.add(new Vocab("ふぁぼる", "お気に入り登録する"));
        objects.add(new Vocab("DQN", "反社会的な人やヤンキー等"));
        objects.add(new Vocab("メシウマ", "他人の不幸で飯がうまい"));
        objects.add(new Vocab("自演乙", "自演お疲れ様ー"));
        objects.add(new Vocab("り", "了解"));
        objects.add(new Vocab(">>（番号No.）", "２chやあらゆるスレッドに存在するとあるコメントへの返信"));
        objects.add(new Vocab("", ""));
        objects.add(new Vocab("", ""));
        objects.add(new Vocab("", ""));
        objects.add(new Vocab("", ""));
        objects.add(new Vocab("", ""));



        mAdapter = new CustomAdapter(getApplicationContext(), 0, objects);
        listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Vocab vocab = (Vocab) mAdapter.getItem(position);
                Toast.makeText(getApplication(), vocab.meaning, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
