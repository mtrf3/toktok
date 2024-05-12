package X;

import com.ss.android.ugc.asve.recorder.VERecorderImpl;
import com.ss.android.vesdk.VEInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Wwe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83920Wwe implements InterfaceC133905Ni {
    public final /* synthetic */ VERecorderImpl LJLIL;

    public C83920Wwe(VERecorderImpl vERecorderImpl) {
        this.LJLIL = vERecorderImpl;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        boolean z;
        int i3 = VEInfo.TE_RECORD_INFO_VIDEO_HW_ENCODER_INIT;
        if (i == i3) {
            VERecorderImpl vERecorderImpl = this.LJLIL;
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            vERecorderImpl.LJIIL(z);
        } else if (i == VEInfo.TE_RECORD_INFO_ENGINE_START) {
            this.LJLIL.LJIILJJIL(i2);
        } else if (i == i3 && i2 != 0) {
            VERecorderImpl vERecorderImpl2 = this.LJLIL;
            if (!vERecorderImpl2.LJLLLLLL.invoke().booleanValue()) {
                InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = vERecorderImpl2.LJLJLJ;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Integer.valueOf(i2));
                } else {
                    o.LJIJI("runningErrorCallback");
                    throw null;
                }
            }
        }
        this.LJLIL.LJIILIIL(i, i2, str);
    }
}
