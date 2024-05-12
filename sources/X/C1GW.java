package X;

import Y.IDRunnableS6S0101000;
import android.view.View;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1GW, reason: invalid class name */
/* loaded from: classes.dex */
public class C1GW extends C0KA {
    public final /* synthetic */ LiveBottomSheetDialog LIZ;

    public C1GW(LiveBottomSheetDialog liveBottomSheetDialog) {
        this.LIZ = liveBottomSheetDialog;
    }

    @Override // X.C0KA
    public final void LIZ(View view, float f) {
        this.LIZ.LJIJJ();
    }

    @Override // X.C0KA
    public final void LIZIZ(int i, View view) {
        if (i == 5) {
            if (this.LIZ.getWindow() != null) {
                this.LIZ.getWindow().setWindowAnimations(R.style.aj);
                this.LIZ.getWindow().getDecorView().post(new IDRunnableS6S0101000(0, this, 25));
            } else {
                this.LIZ.cancel();
            }
        }
    }
}
