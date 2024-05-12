package X;

import com.google.android.material.timepicker.TimeModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vip, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80515Vip implements InterfaceC80410Vh8 {
    public final /* synthetic */ C80509Vij LIZ;

    public C80515Vip(C80509Vij c80509Vij) {
        this.LIZ = c80509Vij;
    }

    @Override // X.InterfaceC80410Vh8
    public final void LIZ(int i, boolean z) {
        int i2;
        if (i == R.id.gfv) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        InterfaceC80527Vj1 interfaceC80527Vj1 = this.LIZ.LJLJJLL;
        if (interfaceC80527Vj1 != null && z) {
            TimeModel timeModel = ((C80507Vih) interfaceC80527Vj1).LJLILLLLZI;
            if (i2 != timeModel.LJLJJL) {
                timeModel.LJLJJL = i2;
                int i3 = timeModel.LJLILLLLZI;
                if (i3 < 12) {
                    if (i2 == 1) {
                        timeModel.LJLILLLLZI = i3 + 12;
                    }
                } else {
                    if (i2 != 0) {
                        return;
                    }
                    timeModel.LJLILLLLZI = i3 - 12;
                }
            }
        }
    }
}
