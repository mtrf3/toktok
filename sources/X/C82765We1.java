package X;

import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.We1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82765We1 implements InterfaceC61107NyZ {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ ActivityC45651qj LIZIZ;
    public final /* synthetic */ C82763Wdz LIZJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        C164906da c164906da = results[0];
        if (c164906da.LIZIZ == EnumC61598OFm.DENIED_PERMANENT && this.LIZ) {
            OHI ohi = OHI.LIZ;
            ActivityC45651qj activityC45651qj = this.LIZIZ;
            ohi.getClass();
            OHI.LJIIIIZZ(activityC45651qj, "android.permission.RECORD_AUDIO");
            return;
        }
        if (c164906da.LIZ()) {
            if (C78605Ut7.LJFF("android.permission.CAMERA")) {
                C82763Wdz c82763Wdz = this.LIZJ;
                c82763Wdz.LJJZZI(new AqS180S0100000_14(c82763Wdz, 173));
                this.LIZJ.hide();
                return;
            }
            this.LIZJ.LJJZZI(C82777WeD.LJLIL);
        }
    }

    public C82765We1(boolean z, ActivityC45651qj activityC45651qj, C82763Wdz c82763Wdz) {
        this.LIZ = z;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = c82763Wdz;
    }
}
