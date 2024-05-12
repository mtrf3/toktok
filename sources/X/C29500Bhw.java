package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bhw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29500Bhw {
    public static boolean LIZ(ImageModel imageModel, ImageModel imageModel2) {
        if (imageModel != null) {
            if (imageModel2 != null) {
                return o.LJ(imageModel.getUri(), imageModel2.getUri());
            }
        } else if (imageModel2 == null) {
            return true;
        }
        return false;
    }
}
