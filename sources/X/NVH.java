package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class NVH implements View.OnScrollChangeListener {
    public final /* synthetic */ NVB LIZ;

    public NVH(NVB nvb) {
        this.LIZ = nvb;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        boolean z;
        C60469NoH mBottomSheet = this.LIZ.getMBottomSheet();
        if (i2 <= 0) {
            z = true;
        } else {
            z = false;
        }
        mBottomSheet.setHideable(z);
    }
}
