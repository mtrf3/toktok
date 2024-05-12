package X;

import com.ss.android.vesdk.VEInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.WwN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83903WwN implements InterfaceC133905Ni {
    public final /* synthetic */ C83902WwM LJLIL;

    public C83903WwN(C83902WwM c83902WwM) {
        this.LJLIL = c83902WwM;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        boolean z;
        int i3 = VEInfo.TE_RECORD_INFO_VIDEO_HW_ENCODER_INIT;
        if (i == i3) {
            C83902WwM c83902WwM = this.LJLIL;
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            c83902WwM.LJ(z);
        } else if (i == VEInfo.TE_RECORD_INFO_ENGINE_START) {
            this.LJLIL.LJI(i2);
        } else if (i == i3 && i2 != 0) {
            C83902WwM c83902WwM2 = this.LJLIL;
            if (!c83902WwM2.LJIIIZ.invoke().booleanValue()) {
                InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = c83902WwM2.LIZ;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Integer.valueOf(i2));
                } else {
                    o.LJIJI("runningErrorCallback");
                    throw null;
                }
            }
        }
        this.LJLIL.LJFF(i, i2, str);
    }
}
