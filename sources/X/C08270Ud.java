package X;

import android.view.ViewStructure;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08270Ud {
    public static final C08270Ud LIZ = new C08270Ud();

    public static final int LIZ(ViewStructure structure, int i) {
        o.LJIIIZ(structure, "structure");
        return structure.addChildCount(i);
    }

    public static final ViewStructure LIZIZ(ViewStructure structure, int i) {
        o.LJIIIZ(structure, "structure");
        return structure.newChild(i);
    }

    public static final void LIZLLL(ViewStructure structure, int i, String str, String str2, String str3) {
        o.LJIIIZ(structure, "structure");
        structure.setId(i, str, str2, str3);
    }

    public static final void LIZJ(ViewStructure structure, int i, int i2, int i3, int i4, int i5, int i6) {
        o.LJIIIZ(structure, "structure");
        structure.setDimens(i, i2, i3, i4, i5, i6);
    }
}
