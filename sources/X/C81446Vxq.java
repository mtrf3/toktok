package X;

import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Vxq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81446Vxq {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C81447Vxr.LJLIL);
    public static final float LIZIZ;
    public static final float LIZJ;
    public static final float LIZLLL;
    public static final float LJ;
    public static final float LJFF;
    public static final float LJI;
    public static final float LJII;
    public static final int LJIIIIZZ;
    public static final List<String> LJIIIZ;

    static {
        float LJIIZILJ = C32151Nz.LJIIZILJ(56);
        float LJIIZILJ2 = C32151Nz.LJIIZILJ(16);
        LIZIZ = LJIIZILJ2;
        float f = 100;
        LIZJ = (LJIIZILJ - LJIIZILJ2) / f;
        float LJIIZILJ3 = C32151Nz.LJIIZILJ(130);
        float LJIIZILJ4 = C32151Nz.LJIIZILJ(16);
        LIZLLL = LJIIZILJ4;
        LJ = (LJIIZILJ3 - LJIIZILJ4) / f;
        LJFF = C32151Nz.LJIIZILJ(156);
        LJI = C32151Nz.LJIIZILJ(176);
        LJII = C32151Nz.LJIIZILJ(44);
        LJIIIIZZ = C7MY.LIZIZ(52);
        String string = C60903NvH.LJ.getString(R.string.pwh);
        o.LJIIIIZZ(string, "getApplication().getStri…ing.record_mode_shot_tag)");
        String string2 = C60903NvH.LJ.getString(R.string.pw7);
        o.LJIIIIZZ(string2, "getApplication().getStri…cord_mode_lightening_tag)");
        LJIIIZ = C47261Igj.LJJIJIIJI(C44269HYz.LIZ, C44269HYz.LIZJ, C44269HYz.LIZIZ, C44269HYz.LIZLLL, "RecordCombinePhoto", "RecordLighteningVideo", string, string2, "RecordBottomStory", "RecordAlbum");
    }

    public static final List<String> LIZ() {
        return (List) LIZ.getValue();
    }
}
