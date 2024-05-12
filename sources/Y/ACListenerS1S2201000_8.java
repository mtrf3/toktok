package Y;

import X.C16880lQ;
import X.C26045AKb;
import X.C51323KCh;
import X.C75792yF;
import X.HG3;
import X.KBQ;
import android.net.Uri;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import yq4.a;

/* loaded from: classes9.dex */
public class ACListenerS1S2201000_8 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS1S2201000_8 aCListenerS1S2201000_8, View view) {
        Word word;
        String str;
        KBQ kbq = (KBQ) aCListenerS1S2201000_8.l2;
        SearchSugEntity searchSugEntity = (SearchSugEntity) aCListenerS1S2201000_8.l3;
        int i = aCListenerS1S2201000_8.i4;
        String str2 = aCListenerS1S2201000_8.s0;
        String str3 = aCListenerS1S2201000_8.s1;
        if (kbq.LJLJLJ != null && (word = searchSugEntity.mWord) != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "suggestion").appendQueryParameter("object_id", word.getWord()).appendQueryParameter("owner_id", HG3.LJIILL().getCurUserId());
            m mVar = new m();
            try {
                mVar.LJJIIZ("raw_query", kbq.LJLJLLL);
                mVar.LJJIIZ("words_content", word.getWord());
                mVar.LJJIIJ("words_position", Integer.valueOf(i));
                mVar.LJJIIZ("impr_id", kbq.LJLILLLLZI);
                mVar.LJJIIZ("group_id", word.getId());
                mVar.LJJIIZ("words_source", "sug");
                mVar.LJJIIZ("sug_type", str2);
                mVar.LJJIIZ("feedback_id", str3);
                str = C75792yF.LIZJ(mVar);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                str = "";
            }
            appendQueryParameter.appendQueryParameter("extra", str);
            a.LJIILLIIL().LIZIZ(kbq.LJLJLJ, appendQueryParameter);
        }
        kbq.LJLLLLLL(searchSugEntity, i, "confirm", str2, str3);
    }

    public static final void onClick$1(ACListenerS1S2201000_8 aCListenerS1S2201000_8, View view) {
        KBQ kbq = (KBQ) aCListenerS1S2201000_8.l2;
        kbq.LJLLLLLL((SearchSugEntity) aCListenerS1S2201000_8.l3, aCListenerS1S2201000_8.i4, "not_relevant", aCListenerS1S2201000_8.s0, aCListenerS1S2201000_8.s1);
        C26045AKb c26045AKb = new C26045AKb(kbq.LJLJLJ);
        c26045AKb.LJIIIIZZ(R.string.rx2);
        c26045AKb.LJIIJ();
    }

    public static final void onClick$2(ACListenerS1S2201000_8 aCListenerS1S2201000_8, View view) {
        Word word;
        String str;
        C51323KCh c51323KCh = (C51323KCh) aCListenerS1S2201000_8.l2;
        SearchSugEntity searchSugEntity = (SearchSugEntity) aCListenerS1S2201000_8.l3;
        int i = aCListenerS1S2201000_8.i4;
        String str2 = aCListenerS1S2201000_8.s0;
        String str3 = aCListenerS1S2201000_8.s1;
        if (c51323KCh.LJLJLLL != null && (word = searchSugEntity.mWord) != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "suggestion").appendQueryParameter("object_id", word.getWord()).appendQueryParameter("owner_id", HG3.LJIILL().getCurUserId());
            m mVar = new m();
            try {
                mVar.LJJIIZ("raw_query", c51323KCh.LJLL);
                mVar.LJJIIZ("words_content", word.getWord());
                mVar.LJJIIJ("words_position", Integer.valueOf(i));
                mVar.LJJIIZ("impr_id", c51323KCh.LJLILLLLZI);
                mVar.LJJIIZ("group_id", word.getId());
                mVar.LJJIIZ("words_source", "sug");
                mVar.LJJIIZ("sug_type", str2);
                mVar.LJJIIZ("feedback_id", str3);
                str = C75792yF.LIZJ(mVar);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                str = "";
            }
            appendQueryParameter.appendQueryParameter("extra", str);
            a.LJIILLIIL().LIZIZ(c51323KCh.LJLJLLL, appendQueryParameter);
        }
        c51323KCh.LJLLLLLL(searchSugEntity, i, "confirm", str2, str3);
    }

    public static final void onClick$3(ACListenerS1S2201000_8 aCListenerS1S2201000_8, View view) {
        C51323KCh c51323KCh = (C51323KCh) aCListenerS1S2201000_8.l2;
        c51323KCh.LJLLLLLL((SearchSugEntity) aCListenerS1S2201000_8.l3, aCListenerS1S2201000_8.i4, "not_relevant", aCListenerS1S2201000_8.s0, aCListenerS1S2201000_8.s1);
        C26045AKb c26045AKb = new C26045AKb(c51323KCh.LJLJLLL);
        c26045AKb.LJIIIIZZ(R.string.rx2);
        c26045AKb.LJIIJ();
    }

    public ACListenerS1S2201000_8(Object obj, Object obj2, int i, String str, String str2, int i2) {
        this.$t = i2;
        this.l2 = obj;
        this.l3 = obj2;
        this.i4 = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
