package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.SY4;
import Y.ACListenerS24S0100000_4;
import com.bytedance.tux.container.TuxWebViewContainer;

/* loaded from: classes5.dex */
public class AqS3S1102000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public int i3;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(SY4 it) {
        o.LJIIIZ(it, "it");
        String str = this.s0;
        if (str == null) {
            str = "";
        }
        it.setText(str);
        it.setButtonVariant(this.i2);
        C16880lQ.LJJIZ(it, new ACListenerS24S0100000_4((TuxWebViewContainer) this.l1, 6));
        it.setButtonSize(this.i3);
    }

    public final void invoke$1(SY4 it) {
        o.LJIIIZ(it, "it");
        String str = this.s0;
        if (str == null) {
            str = "";
        }
        it.setText(str);
        it.setButtonVariant(this.i2);
        C16880lQ.LJJIZ(it, new ACListenerS24S0100000_4((TuxWebViewContainer) this.l1, 7));
        it.setButtonSize(this.i3);
    }

    public final void invoke$2(SY4 it) {
        o.LJIIIZ(it, "it");
        String str = this.s0;
        if (str == null) {
            str = "";
        }
        it.setText(str);
        it.setButtonVariant(this.i2);
        C16880lQ.LJJIZ(it, new ACListenerS24S0100000_4((TuxWebViewContainer) this.l1, 8));
        it.setButtonSize(this.i3);
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS3S1102000_4 aqS3S1102000_4, Object obj) {
        aqS3S1102000_4.invoke$0((SY4) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS3S1102000_4 aqS3S1102000_4, Object obj) {
        aqS3S1102000_4.invoke$1((SY4) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS3S1102000_4 aqS3S1102000_4, Object obj) {
        aqS3S1102000_4.invoke$2((SY4) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S1102000_4(String str, int i, int i2, TuxWebViewContainer tuxWebViewContainer, int i3) {
        super(1);
        this.$t = i3;
        this.s0 = str;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = tuxWebViewContainer;
    }
}
