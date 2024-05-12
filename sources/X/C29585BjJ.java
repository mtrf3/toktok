package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.BjJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29585BjJ<T, R> implements InterfaceC48038ItG {
    public static final C29585BjJ<T, R> LJLIL = new C29585BjJ<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        Drawable LIZ = C15490jB.LIZ("tiktok_live_game_demand_1", it);
        if (LIZ != null) {
            LIZ.setBounds(0, 0, C7MY.LIZIZ(16), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            return LIZ;
        }
        return null;
    }
}
