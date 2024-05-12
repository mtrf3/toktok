package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C07260Qg;
import X.C279917z;
import X.C29688Bky;
import X.C76800UCe;
import X.InterfaceC07280Qi;
import X.InterfaceC88472Yns;

/* loaded from: classes.dex */
public class IDqS0S0010000 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0010000(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(IDqS0S0010000 iDqS0S0010000, Object obj) {
        C279917z it = (C279917z) obj;
        o.LJIIIZ(it, "it");
        return it.LIZJ(iDqS0S0010000.z0);
    }

    public static final Object invoke$1(IDqS0S0010000 iDqS0S0010000, Object obj) {
        C279917z it = (C279917z) obj;
        o.LJIIIZ(it, "it");
        return it.LJ(iDqS0S0010000.z0);
    }

    public static final Object invoke$2(IDqS0S0010000 iDqS0S0010000, Object obj) {
        InterfaceC07280Qi semantics = (InterfaceC07280Qi) obj;
        o.LJIIIZ(semantics, "$this$semantics");
        C07260Qg.LJIIIZ.LIZ(semantics, C07260Qg.LIZ[12], Boolean.valueOf(iDqS0S0010000.z0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS0S0010000 iDqS0S0010000, Object obj) {
        String str;
        C29688Bky it = (C29688Bky) obj;
        o.LJIIIZ(it, "it");
        if (iDqS0S0010000.z0) {
            str = "user_event_pause_click";
        } else {
            str = "user_event_resume_click";
        }
        it.LJIIIZ(str, "");
        return C76800UCe.LIZ;
    }
}
