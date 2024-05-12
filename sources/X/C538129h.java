package X;

import android.view.View;

/* renamed from: X.29h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C538129h extends C46131rV {
    public static boolean LJLLI = true;

    @Override // X.C17J
    public void LJJJJIZL(View view, int i, int i2, int i3, int i4) {
        if (LJLLI) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                LJLLI = false;
            }
        }
    }
}
