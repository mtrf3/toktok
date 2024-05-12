package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H7F {
    public static String LIZ(VideoPublishEditModel args, List list) {
        o.LJIIIZ(args, "args");
        StringBuilder sb = new StringBuilder();
        if (C78685UuP.LJJJZ(args.getStickers())) {
            sb.append(args.getStickers());
            sb.append(",");
        }
        return C0EH.LIZJ(sb, ORZ.LLD(list, ",", null, null, H7E.LJLIL, 30), "StringBuilder().apply(builderAction).toString()");
    }
}
