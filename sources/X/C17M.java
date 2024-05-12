package X;

import android.view.View;

/* renamed from: X.17M, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C17M implements InterfaceC46754IWo {
    public static String LIZ(U44 u44, StringBuilder sb, String str, int i, StringBuilder sb2) {
        sb.append(u44.getValue());
        sb.append(str);
        sb.append(i);
        return X1D.LIZIZ(sb2);
    }

    public static void LIZIZ(View view, int i, int i2, int i3, int i4) {
        view.layout(i2, i3, i4, view.getMeasuredHeight() + i);
    }
}
