package X;

import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WU2 implements InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe> {
    public final /* synthetic */ C82634Wbu LJLIL;

    public WU2(C82634Wbu c82634Wbu) {
        this.LJLIL = c82634Wbu;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Integer num, Integer num2, String str, VERecorder p4) {
        boolean z;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        o.LJIIIZ(p4, "p4");
        if (intValue == VEInfo.TE_RECORD_INFO_MIC_AUDIO_DELAY_RET) {
            C82634Wbu c82634Wbu = this.LJLIL;
            if (intValue2 == 0) {
                z = true;
            } else {
                z = false;
            }
            c82634Wbu.LJLLILLLL = z;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RecordBGMComponent zyc audio set delay ret=");
            LIZ.append(intValue2);
            H7B.LIZ(X1D.LIZIZ(LIZ));
        }
        C82634Wbu c82634Wbu2 = this.LJLIL;
        if (c82634Wbu2.LJLLILLLL && intValue == VEInfo.TE_RECORD_INFO_MIC_AUDIO_DELAY) {
            c82634Wbu2.rn0(intValue2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("RecordBGMComponent zyc audio set delay=");
            LIZ2.append(intValue2);
            LIZ2.append(" ms");
            H7B.LIZ(X1D.LIZIZ(LIZ2));
            this.LJLIL.LJLLILLLL = false;
        }
        return C76800UCe.LIZ;
    }
}
