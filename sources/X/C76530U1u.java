package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;

/* renamed from: X.U1u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76530U1u implements UCZ {
    public final /* synthetic */ InterfaceC65052gv<Bitmap> LIZ;
    public final /* synthetic */ ImageModel LIZIZ;

    @Override // X.UCZ
    public final void LIZ(Bitmap bitmap) {
        Bitmap LIZ;
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            ((C73578SuE) this.LIZ).onError(new RuntimeException("Invalid bitmap"));
            return;
        }
        ImageModel imageModel = this.LIZIZ;
        float f = imageModel.width;
        float f2 = imageModel.height;
        try {
            if (f > 0.0f && f2 > 0.0f) {
                LIZ = C31573CaH.LIZ(bitmap, f / f2);
            } else {
                LIZ = C31573CaH.LIZ(bitmap, 0.74698794f);
            }
            if (LIZ == null || LIZ.isRecycled()) {
                ((C73578SuE) this.LIZ).onError(new RuntimeException("gaussBlurBm error"));
                return;
            }
            ((C73578SuE) this.LIZ).onSuccess(LIZ);
        } catch (Exception e) {
            ((C73578SuE) this.LIZ).onError(e);
        }
    }

    public C76530U1u(C73578SuE c73578SuE, ImageModel imageModel) {
        this.LIZ = c73578SuE;
        this.LIZIZ = imageModel;
    }
}
