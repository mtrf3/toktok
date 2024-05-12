package X;

import android.graphics.Bitmap;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;

/* renamed from: X.AIj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26001AIj implements IAVInfoService.IGetInfoCallback<Bitmap> {
    public final /* synthetic */ SmartImageView LIZ;

    public C26001AIj(SmartImageView smartImageView) {
        this.LIZ = smartImageView;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            this.LIZ.setImageBitmap(bitmap2);
        }
    }
}
