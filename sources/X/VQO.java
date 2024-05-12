package X;

import com.lynx.tasm.ui.image.FlattenUIImage;

/* loaded from: classes15.dex */
public final class VQO implements VQG {
    public final /* synthetic */ FlattenUIImage LIZ;

    public VQO(FlattenUIImage flattenUIImage) {
        this.LIZ = flattenUIImage;
    }

    @Override // X.VQG
    public final void LIZ(int i) {
        FlattenUIImage flattenUIImage = this.LIZ;
        flattenUIImage.mScrollState = i;
        if (flattenUIImage.mPendingLoad && i == 0) {
            flattenUIImage.mPendingLoad = false;
            flattenUIImage.maybeUpdateView();
        }
    }
}
