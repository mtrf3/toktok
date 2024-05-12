package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5Hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132465Hu {
    public static final C132465Hu LIZ = new C132465Hu();

    public static boolean LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (model.getEditorProModel().isAdvancedEdit()) {
            return true;
        }
        if (C00F.LIZ(31744, 0, "studio_editor_pro_enable_new_photo_canvas", true) == 1 && C145805ns.LIZ()) {
            return true;
        }
        return false;
    }
}
