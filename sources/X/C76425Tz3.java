package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Tz3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76425Tz3<V extends View, T> implements InterfaceC76501U0r {
    public static final C76425Tz3<V, T> LIZ = new C76425Tz3<>();

    @Override // X.InterfaceC76501U0r
    public final void LIZ(View view, Object obj) {
        U2A view2 = (U2A) view;
        C76385TyP data = (C76385TyP) obj;
        o.LJIIIZ(view2, "view");
        o.LJIIIZ(data, "data");
        view2.setLeftData(data);
    }
}
