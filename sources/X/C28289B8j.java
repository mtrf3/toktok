package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: X.B8j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C28289B8j {
    public static void LIZIZ(int i, Window window) {
        window.setBackgroundDrawable(new ColorDrawable(i));
    }

    public static View LIZ(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), i, viewGroup2, z);
    }

    public static void LIZJ(long j, long j2, BZI bzi, String str) {
        bzi.LJIJJ(Long.valueOf(j - j2), str);
        bzi.LJJIIJZLJL();
    }
}
