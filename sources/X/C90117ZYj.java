package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.List;

/* renamed from: X.ZYj, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90117ZYj {
    public C90117ZYj() {
        new BinderC90877ZlZ(this);
    }

    public static WebImage LIZ(MediaMetadata mediaMetadata) {
        List<WebImage> list;
        if (mediaMetadata != null && (list = mediaMetadata.zzd) != null && !list.isEmpty()) {
            return (WebImage) ListProtector.get(mediaMetadata.zzd, 0);
        }
        return null;
    }
}
