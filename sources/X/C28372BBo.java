package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.BBo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28372BBo implements InterfaceC16710l9 {
    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View v, C16800lI c16800lI) {
        int LIZ;
        o.LJIIIZ(v, "v");
        if (c16800lI.LIZ.LJIIIZ().LIZLLL > 0) {
            LIZ = C15380j0.LIZ(12.0f);
        } else {
            LIZ = C15380j0.LIZ(28.0f);
        }
        v.setPadding(v.getPaddingLeft(), v.getPaddingTop(), v.getPaddingRight(), LIZ);
        return c16800lI;
    }
}
