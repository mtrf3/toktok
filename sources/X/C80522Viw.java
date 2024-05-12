package X;

import com.google.android.material.timepicker.TimeModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Viw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80522Viw implements InterfaceC80410Vh8 {
    public final /* synthetic */ C80506Vig LIZ;

    public C80522Viw(C80506Vig c80506Vig) {
        this.LIZ = c80506Vig;
    }

    @Override // X.InterfaceC80410Vh8
    public final void LIZ(int i, boolean z) {
        int i2;
        if (i == R.id.gfv) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        TimeModel timeModel = this.LIZ.LJLILLLLZI;
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
