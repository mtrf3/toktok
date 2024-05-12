package X;

import android.text.TextUtils;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.We0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82764We0 implements InterfaceC61107NyZ {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ ActivityC45651qj LIZIZ;
    public final /* synthetic */ C82763Wdz LIZJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        boolean z = false;
        C164906da c164906da = results[0];
        if (c164906da.LIZIZ == EnumC61598OFm.DENIED_PERMANENT && this.LIZ) {
            OHI ohi = OHI.LIZ;
            ActivityC45651qj activityC45651qj = this.LIZIZ;
            ohi.getClass();
            OHI.LJIIIIZZ(activityC45651qj, "android.permission.CAMERA");
            return;
        }
        if (c164906da.LIZ()) {
            if (C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
                this.LIZJ.hide();
                C82763Wdz c82763Wdz = this.LIZJ;
                c82763Wdz.LJJZZI(new AqS180S0100000_14(c82763Wdz, 172));
                return;
            }
            boolean equals = TextUtils.equals(this.LIZJ.LLIFFJFJJ().getCurrentBottomTag(), "record_mode_live");
            if (C53210KuU.LIZ() && !equals) {
                this.LIZJ.LLILZLL();
                return;
            }
            InterfaceC82325WSr nowsSwitcherApi = this.LIZJ.getNowsSwitcherApi();
            if (nowsSwitcherApi != null && nowsSwitcherApi.j40()) {
                z = true;
            }
            if (equals || z) {
                this.LIZJ.LJJZZI(C82775WeB.LJLIL);
            } else {
                this.LIZJ.LJJZZI(C82776WeC.LJLIL);
            }
        }
    }

    public C82764We0(boolean z, ActivityC45651qj activityC45651qj, C82763Wdz c82763Wdz) {
        this.LIZ = z;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = c82763Wdz;
    }
}
