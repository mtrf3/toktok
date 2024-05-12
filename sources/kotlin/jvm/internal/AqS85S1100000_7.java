package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C134225Oo;
import X.C26045AKb;
import X.C44048HQm;
import X.C73433Srt;
import X.C76800UCe;
import X.InterfaceC73573Su9;
import X.InterfaceC88471Ynr;
import X.X1D;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* loaded from: classes8.dex */
public class AqS85S1100000_7 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS85S1100000_7(C73433Srt c73433Srt, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c73433Srt;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS85S1100000_7 aqS85S1100000_7, Object obj, Object logId) {
        String msg = (String) obj;
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(logId, "logId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request AutoCut template detail failure: ");
        LIZ.append(msg);
        C134225Oo.LIZ(LogLevel.LEVEL_ERROR, X1D.LIZIZ(LIZ));
        ((InterfaceC73573Su9) aqS85S1100000_7.l1).onNext(new C44048HQm(aqS85S1100000_7.s0, 3, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (AVMusic) null, (String) null, 109, msg, 8188));
        ((InterfaceC73573Su9) aqS85S1100000_7.l1).onComplete();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS85S1100000_7 aqS85S1100000_7, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C26045AKb c26045AKb = new C26045AKb((SocialConsentFragment) aqS85S1100000_7.l1);
            c26045AKb.LJIIIZ(aqS85S1100000_7.s0);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS85S1100000_7(SocialConsentFragment socialConsentFragment, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = socialConsentFragment;
        this.s0 = str;
    }
}
