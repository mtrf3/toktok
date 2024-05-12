package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class GQR {
    public abstract List<AbstractC41508GQu> LIZ();

    public abstract GQV LIZJ();

    public abstract void LIZLLL(List<AbstractC41508GQu> list);

    public GQR(VideoPublishEditModel videoPublishEditModel) {
    }

    public static boolean LIZIZ(AbstractC41508GQu abstractC41508GQu) {
        o.LJIIIZ(abstractC41508GQu, "<this>");
        if (abstractC41508GQu.LJJ() || OAC.LJIIIZ(abstractC41508GQu)) {
            return true;
        }
        return false;
    }

    public static void LJ(AbstractC41508GQu abstractC41508GQu) {
        o.LJIIIZ(abstractC41508GQu, "<this>");
        if (OAC.LJIIIZ(abstractC41508GQu)) {
            C41503GQp c41503GQp = (C41503GQp) abstractC41508GQu;
            GQT textMapper = GQT.LJLIL;
            o.LJIIIZ(textMapper, "textMapper");
            c41503GQp.LJIIIZ = (String) textMapper.invoke(c41503GQp.LJIIIZ);
        }
    }
}
