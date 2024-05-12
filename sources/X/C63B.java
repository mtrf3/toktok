package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.o;

/* renamed from: X.63B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63B {
    public static AutoCutMediaModel LIZ(Context context, MediaModel model) {
        o.LJIIIZ(model, "model");
        String filePath = C44694HgQ.LJIIL(model);
        if (!C44687HgJ.LIZIZ(filePath) && context != null) {
            filePath = C00S.LIZIZ(context, UriProtector.parse(model.fileLocalUriPath));
        }
        o.LJIIIIZZ(filePath, "filePath");
        return new AutoCutMediaModel(filePath, model.fileLocalUriPath, model.width, model.height, model.LJI(), model.duration, 0L, 0L, 0.0f, null, 960, null);
    }
}
