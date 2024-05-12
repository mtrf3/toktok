package X;

import com.ss.android.ugc.aweme.experiment.EditorProTranslationData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.60b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1533360b {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZIZ() {
        int LIZ2 = C00F.LIZ(31744, 0, "studio_editor_pro_change_adjust_clip_name", true);
        if (LIZ2 != 1) {
            if (LIZ2 != 2) {
                if (LIZ2 != 3) {
                    if (LIZ2 != 4) {
                        if (LIZ2 != 5) {
                            return R.string.fjf;
                        }
                        return R.string.fpt;
                    }
                    return R.string.fps;
                }
                return R.string.fpr;
            }
            return R.string.fpq;
        }
        return R.string.fpu;
    }

    public static int LIZJ() {
        int LIZ2 = C00F.LIZ(31744, 0, "studio_editor_pro_change_adjust_clip_name", true);
        if (LIZ2 != 1) {
            if (LIZ2 != 2) {
                if (LIZ2 != 3) {
                    if (LIZ2 != 4) {
                        if (LIZ2 != 5) {
                            return R.string.bgz;
                        }
                        return R.string.fq3;
                    }
                    return R.string.fq4;
                }
                return R.string.fq0;
            }
            return R.string.fq2;
        }
        return R.string.fq1;
    }

    public static String LIZ() {
        String str;
        FFL LJIIIZ = FFL.LJIIIZ();
        EditorProTranslationData editorProTranslationData = C1534560n.LIZ;
        LJIIIZ.getClass();
        EditorProTranslationData editorProTranslationData2 = (EditorProTranslationData) FFL.LJIJ(true, "creationEPAnchor_FYP_anchorEP_body", 31744, EditorProTranslationData.class, editorProTranslationData);
        if (editorProTranslationData2 == null || (str = editorProTranslationData2.translation) == null) {
            str = "";
        }
        if (C1534360l.LIZ() && C78685UuP.LJJJZ(str)) {
            return str;
        }
        String LJFF = C86V.LJFF(LIZIZ());
        o.LJIIIIZZ(LJFF, "{\n            ResUtils.g…rProIconName())\n        }");
        return LJFF;
    }
}
