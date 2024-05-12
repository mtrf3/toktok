package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.image.IImageService;
import kotlin.jvm.internal.o;

/* renamed from: X.0jR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15650jR {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C518721v.LJLIL);

    public static final BQO LIZ() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-service>(...)");
        return ((IImageService) value).DB();
    }

    public static final boolean LIZIZ(ImageModel imageModel) {
        if (imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() > 0) {
            return true;
        }
        return false;
    }
}
