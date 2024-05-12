package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.S2e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71444S2e implements InterfaceC71443S2d {
    @Override // X.InterfaceC71443S2d
    public final boolean LIZJ(Context context, TuxTextView tuxTextView, String str, String price, S32 s32, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(price, "price");
        return true;
    }

    @Override // X.InterfaceC71443S2d
    public final boolean LIZLLL(Context context, TuxTextView tuxTextView, String str, String price, S32 s32, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(price, "price");
        return true;
    }

    @Override // X.InterfaceC71443S2d
    public final void LJIIIIZZ(Context context, TuxTextView tuxTextView, String str, String price, S32 s32, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(price, "price");
    }

    @Override // X.InterfaceC71443S2d
    public final void LJIIIZ(Context context, TuxTextView tuxTextView, boolean z) {
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC71443S2d
    public final boolean LJIIL(TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        return false;
    }

    @Override // X.InterfaceC71443S2d
    public final boolean LJIILJJIL(TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        return false;
    }

    @Override // X.InterfaceC71443S2d
    public final void LJIIJ(TuxTextView tuxTextView, String str) {
        tuxTextView.setText(str);
    }

    @Override // X.InterfaceC71443S2d
    public final void LIZ(TuxTextView tuxTextView, String str, String price, S32 s32, Context context) {
        o.LJIIIZ(price, "price");
        tuxTextView.setText(price);
    }
}
