package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C110944Xa;
import X.C1HQ;
import X.C4XW;
import X.C70922qO;
import X.C71052qb;
import X.C76800UCe;
import X.C772831o;
import X.C77800Ug8;
import X.C85323Wm;
import X.InterfaceC65784Pro;
import X.InterfaceC70982qU;
import X.InterfaceC92953kp;
import X.X1D;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedKeyboardDialogFragment;

/* loaded from: classes2.dex */
public class AqS18S1101000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS18S1101000_1 aqS18S1101000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSinkDeviceInfoListener onFail ");
        LIZ.append(aqS18S1101000_1.i2);
        LIZ.append(", ");
        LIZ.append(aqS18S1101000_1.s0);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        InterfaceC70982qU interfaceC70982qU = ((C71052qb) aqS18S1101000_1.l1).LJI;
        if (interfaceC70982qU != null) {
            interfaceC70982qU.LIZIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS18S1101000_1 aqS18S1101000_1) {
        String str;
        ((DetailFeedKeyboardDialogFragment) aqS18S1101000_1.l1).dismiss();
        InterfaceC92953kp interfaceC92953kp = ((DetailFeedKeyboardDialogFragment) aqS18S1101000_1.l1).LJLLLL;
        if (interfaceC92953kp != null) {
            interfaceC92953kp.n2(aqS18S1101000_1.s0, true);
        }
        String str2 = aqS18S1101000_1.s0;
        Integer valueOf = Integer.valueOf(aqS18S1101000_1.i2);
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
        if (valueOf == null || (str = valueOf.toString()) == null) {
            str = "-1";
        }
        LIZ2.put("index", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.put("emoji_name", str2);
        LIZ2.put("like_method", "quick_emoji");
        LIZ.LIZIZ("chat_emoji_feedback_send", LIZ2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS18S1101000_1 aqS18S1101000_1) {
        C4XW c4xw = ((C110944Xa) aqS18S1101000_1.l1).LJLILLLLZI;
        if (c4xw != null) {
            c4xw.LIZIZ(aqS18S1101000_1.i2, aqS18S1101000_1.s0);
        }
        ((C110944Xa) aqS18S1101000_1.l1).performClick();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS18S1101000_1(int i, String str, C71052qb c71052qb, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = c71052qb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS18S1101000_1(C110944Xa c110944Xa, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c110944Xa;
        this.s0 = str;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS18S1101000_1(DetailFeedKeyboardDialogFragment detailFeedKeyboardDialogFragment, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = detailFeedKeyboardDialogFragment;
        this.s0 = str;
        this.i2 = i;
    }
}
