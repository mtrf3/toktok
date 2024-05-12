package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Spo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73304Spo implements InterfaceC73307Spr {
    public final View LIZ;

    @Override // X.InterfaceC73307Spr
    public final void hide() {
        this.LIZ.setVisibility(4);
    }

    @Override // X.InterfaceC73307Spr
    public final void show() {
        this.LIZ.setVisibility(0);
    }

    public C73304Spo(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
    }
}
