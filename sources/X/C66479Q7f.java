package X;

import android.graphics.Bitmap;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideoContent;
import kotlin.jvm.internal.o;

/* renamed from: X.Q7f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66479Q7f extends C66475Q7b {
    @Override // X.C66475Q7b
    public final void LIZJ(ShareMediaContent shareMediaContent) {
        throw new Q4W("Cannot share ShareMediaContent via web sharing dialogs");
    }

    @Override // X.C66475Q7b
    public final void LJ(SharePhoto photo) {
        o.LJIIIZ(photo, "photo");
        Bitmap bitmap = photo.bitmap;
        android.net.Uri uri = photo.imageUrl;
        if (bitmap != null || uri != null) {
        } else {
            throw new Q4W("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    @Override // X.C66475Q7b
    public final void LJII(ShareVideoContent shareVideoContent) {
        throw new Q4W("Cannot share ShareVideoContent via web sharing dialogs");
    }
}
