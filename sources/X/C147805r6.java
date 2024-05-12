package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.5r6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147805r6 {
    public static final boolean LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (model.getImageAlbumData() != null) {
            return false;
        }
        if (!C44384HbQ.LJJJLZIJ(model) && !C42000Ge4.LJIILIIL(model) && !e1.LIZ(31744, "studio_video_sticker_new_engine", true, false)) {
            return false;
        }
        return true;
    }
}
