package X;

import com.ss.android.ugc.aweme.property.bytebench.EditorProLowEndOptStrategy;
import defpackage.e1;

/* renamed from: X.Ejx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37269Ejx {
    public static final boolean LIZ;

    static {
        EditorProLowEndOptStrategy editorProLowEndOptStrategy;
        InterfaceC09240Xw LIZIZ;
        C09580Ze LIZJ = C09580Ze.LIZJ();
        if (LIZJ != null && (LIZIZ = LIZJ.LIZIZ(EF7.LJIIIZ)) != null) {
            editorProLowEndOptStrategy = (EditorProLowEndOptStrategy) LIZIZ.LJIILJJIL(EditorProLowEndOptStrategy.class);
        } else {
            editorProLowEndOptStrategy = null;
        }
        boolean z = false;
        if (editorProLowEndOptStrategy != null && editorProLowEndOptStrategy.enable() && e1.LIZ(31744, "studio_editor_pro_low_end_device_video_speed_opt", true, false)) {
            z = true;
        }
        LIZ = z;
    }
}
