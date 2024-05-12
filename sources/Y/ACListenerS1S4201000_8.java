package Y;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C26045AKb;
import X.C75792yF;
import X.HG3;
import X.K7W;
import X.RBX;
import android.net.Uri;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import yq4.a;

/* loaded from: classes9.dex */
public class ACListenerS1S4201000_8 implements View.OnClickListener {
    public final int $t;
    public int i6;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS1S4201000_8 aCListenerS1S4201000_8, View view) {
        String str;
        SearchSugEntity searchSugEntity = (SearchSugEntity) aCListenerS1S4201000_8.l4;
        int i = aCListenerS1S4201000_8.i6;
        String str2 = aCListenerS1S4201000_8.s0;
        String str3 = aCListenerS1S4201000_8.s1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aCListenerS1S4201000_8.l5;
        String str4 = aCListenerS1S4201000_8.s2;
        String str5 = aCListenerS1S4201000_8.s3;
        Word word = searchSugEntity.mWord;
        if (word != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "suggestion").appendQueryParameter("object_id", word.getWord()).appendQueryParameter("owner_id", ((RBX) HG3.LJIILL()).getCurUserId());
            m mVar = new m();
            try {
                mVar.LJJIIZ("raw_query", str4);
                mVar.LJJIIZ("words_content", word.getWord());
                mVar.LJJIIJ("words_position", Integer.valueOf(i));
                mVar.LJJIIZ("impr_id", str5);
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
            a.LJIILLIIL().LIZIZ(activityC45651qj, appendQueryParameter);
        }
        K7W.LIZ((SearchSugEntity) aCListenerS1S4201000_8.l4, aCListenerS1S4201000_8.i6, "confirm", aCListenerS1S4201000_8.s0, aCListenerS1S4201000_8.s1, aCListenerS1S4201000_8.s2, aCListenerS1S4201000_8.s3);
    }

    public static final void onClick$1(ACListenerS1S4201000_8 aCListenerS1S4201000_8, View view) {
        K7W.LIZ((SearchSugEntity) aCListenerS1S4201000_8.l4, aCListenerS1S4201000_8.i6, "not_relevant", aCListenerS1S4201000_8.s0, aCListenerS1S4201000_8.s1, aCListenerS1S4201000_8.s2, aCListenerS1S4201000_8.s3);
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) aCListenerS1S4201000_8.l5);
        c26045AKb.LJIIIIZZ(R.string.rx2);
        c26045AKb.LJIIJ();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS1S4201000_8(int r2, X.ActivityC45651qj r3, com.ss.android.ugc.aweme.search.model.SearchSugEntity r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            switch(r9) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l4 = r4
            r0.i6 = r2
            r0.s0 = r5
            r0.s1 = r6
            r0.s2 = r7
            r0.s3 = r8
            r0.l5 = r3
        L14:
            r0.<init>()
            return
        L18:
            r0 = r1
            r0.l4 = r4
            r0.i6 = r2
            r0.s0 = r5
            r0.s1 = r6
            r0.l5 = r3
            r0.s2 = r7
            r0.s3 = r8
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS1S4201000_8.<init>(int, X.1qj, com.ss.android.ugc.aweme.search.model.SearchSugEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
