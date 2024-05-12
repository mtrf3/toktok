package X;

import com.lynx.tasm.ui.image.UIImage;

/* loaded from: classes15.dex */
public final class VQK implements VQG {
    public final /* synthetic */ UIImage LIZ;

    public VQK(UIImage uIImage) {
        this.LIZ = uIImage;
    }

    @Override // X.VQG
    public final void LIZ(int i) {
        UIImage uIImage = this.LIZ;
        uIImage.mScrollState = i;
        if (uIImage.mPendingLoad && i == 0) {
            uIImage.mPendingLoad = false;
            uIImage.reloadImage();
        }
    }
}
