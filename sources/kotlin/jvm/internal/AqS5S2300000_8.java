package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass114;
import X.C16880lQ;
import X.C49604JdQ;
import X.C75792yF;
import X.C76800UCe;
import X.C78949Uyf;
import X.HG3;
import X.InterfaceC88472Yns;
import X.JQA;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.zhiliaoapp.musically.R;
import yq4.a;

/* loaded from: classes9.dex */
public class AqS5S2300000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS5S2300000_8 aqS5S2300000_8, Object it) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        String str6;
        o.LJIIIZ(it, "it");
        C49604JdQ.LJFF((Word) aqS5S2300000_8.l2, (JQA) aqS5S2300000_8.l3, "confirm", aqS5S2300000_8.s0, aqS5S2300000_8.s1);
        Context context = (Context) aqS5S2300000_8.l4;
        Word word = (Word) aqS5S2300000_8.l2;
        JQA jqa = (JQA) aqS5S2300000_8.l3;
        String wordSource = aqS5S2300000_8.s0;
        String currentTime = aqS5S2300000_8.s1;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wordSource, "wordSource");
        o.LJIIIZ(currentTime, "currentTime");
        if (C78949Uyf.LJIILL(context) != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "sug_recommend");
            String str7 = null;
            if (word != null) {
                str = word.getId();
            } else {
                str = null;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("object_id", str).appendQueryParameter("owner_id", HG3.LJIILL().getCurUserId());
            if (word != null) {
                str2 = word.getWord();
            } else {
                str2 = null;
            }
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("sug_content", str2);
            m mVar = new m();
            if (jqa != null) {
                try {
                    str3 = jqa.LJ;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    str4 = "";
                }
            } else {
                str3 = null;
            }
            mVar.LJJIIZ("raw_query", str3);
            if (word != null) {
                str5 = word.getWord();
            } else {
                str5 = null;
            }
            mVar.LJJIIZ("words_content", str5);
            if (word != null) {
                num = Integer.valueOf(word.getWordPosition());
            } else {
                num = null;
            }
            mVar.LJJIIJ("words_position", num);
            if (jqa != null) {
                str6 = jqa.LJIIIIZZ;
            } else {
                str6 = null;
            }
            mVar.LJJIIZ("impr_id", str6);
            if (word != null) {
                str7 = word.getId();
            }
            mVar.LJJIIZ("group_id", str7);
            mVar.LJJIIZ("words_source", wordSource);
            mVar.LJJIIZ("feedback_id", currentTime);
            str4 = C75792yF.LIZJ(mVar);
            appendQueryParameter3.appendQueryParameter("extra", str4);
            a.LJIILLIIL().LIZIZ(C78949Uyf.LJIILL(context), appendQueryParameter3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS5S2300000_8 aqS5S2300000_8, Object it) {
        o.LJIIIZ(it, "it");
        C49604JdQ.LJFF((Word) aqS5S2300000_8.l2, (JQA) aqS5S2300000_8.l3, "not_relevant", aqS5S2300000_8.s0, aqS5S2300000_8.s1);
        Activity LJIILL = C78949Uyf.LJIILL((Context) aqS5S2300000_8.l4);
        if (LJIILL != null) {
            AnonymousClass114.LIZ(LJIILL, R.string.qeh);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S2300000_8(Context context, Word word, JQA jqa, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = word;
        this.l3 = jqa;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = context;
    }
}
