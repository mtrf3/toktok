package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WjQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83100WjQ extends AbstractC65781Prl implements InterfaceC88472Yns<View, TKG> {
    public static final C83100WjQ LJLIL = new C83100WjQ();

    public C83100WjQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final TKG invoke(View view) {
        View it = view;
        o.LJIIIZ(it, "it");
        return new C83101WjR(it, new OSZ("sticker_panel_show", "sticker_panel_hide"));
    }
}
