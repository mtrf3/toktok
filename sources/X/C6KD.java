package X;

import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.6KD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KD {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C6KE.LJLIL);
    public static final java.util.Set<String> LIZIZ = new LinkedHashSet();

    public static final boolean LIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static final String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!LIZ() || !(!LIZIZ.isEmpty()) || videoPublishEditModel == null) {
            return null;
        }
        Iterator<ImportVideoInfo> it = videoPublishEditModel.importInfoList.iterator();
        while (it.hasNext()) {
            ImportVideoInfo next = it.next();
            if (ORZ.LJLJJI(next.getOriginImportPath(), LIZIZ)) {
                return next.getOriginImportPath();
            }
        }
        return null;
    }
}
