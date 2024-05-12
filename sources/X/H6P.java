package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AqS23S0010000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H6P {
    public final Context LIZ;
    public final String LIZIZ;
    public final List<Integer> LIZJ;
    public final String LIZLLL;
    public final InterfaceC45930I0w LJ;
    public final InterfaceC65784Pro<Boolean> LJFF;
    public final boolean LJI;
    public final C84673XKz LJII;
    public boolean LJIIIIZZ;

    public final String LIZ() {
        String shortId;
        String uniqueId = this.LJ.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            shortId = this.LJ.getShortId();
        } else {
            shortId = this.LJ.getUniqueId();
        }
        if (shortId == null) {
            return "";
        }
        return shortId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0256 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super java.lang.String> r16) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H6P.LIZIZ(X.2kd):java.lang.Object");
    }

    public H6P(Context context, String resourceDir, List videoSize, String str, InterfaceC45930I0w interfaceC45930I0w, AqS23S0010000_7 aqS23S0010000_7, boolean z) {
        o.LJIIIZ(resourceDir, "resourceDir");
        o.LJIIIZ(videoSize, "videoSize");
        this.LIZ = context;
        this.LIZIZ = resourceDir;
        this.LIZJ = videoSize;
        this.LIZLLL = str;
        this.LJ = interfaceC45930I0w;
        this.LJFF = aqS23S0010000_7;
        this.LJI = z;
        if (videoSize.size() == 2) {
            this.LJII = C79146V4k.LJIILIIL();
            return;
        }
        throw new IllegalArgumentException("video width or video height not available.");
    }
}
