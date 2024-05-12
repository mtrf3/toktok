package X;

import Y.ARunnableS38S0100000_2;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.64G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64G implements InterfaceC1541563f {
    public final C64Y LIZ = new C64Y();
    public final C64I LIZIZ;

    @Override // X.InterfaceC1541563f
    public final void LJFF() {
        C64O c64o = this.LIZIZ.LJLIL;
        if (c64o != null) {
            c64o.LJII = false;
        } else {
            o.LJIJI("mGestureDispatcher");
            throw null;
        }
    }

    @Override // X.InterfaceC1541563f
    public final void LJII() {
        C64O c64o = this.LIZIZ.LJLIL;
        if (c64o != null) {
            c64o.LJII = true;
        } else {
            o.LJIJI("mGestureDispatcher");
            throw null;
        }
    }

    @Override // X.InterfaceC1541563f
    public final OSZ Y0() {
        return getContainer().getStickerContainerSize();
    }

    @Override // X.InterfaceC1541563f
    public final C64I getContainer() {
        return this.LIZIZ;
    }

    public C64G(C64F c64f) {
        this.LIZIZ = c64f;
    }

    @Override // X.InterfaceC1541563f
    public final void LIZ(C64W c64w) {
        this.LIZ.LIZJ(c64w);
    }

    @Override // X.InterfaceC1541563f
    public final void LIZIZ(C64N c64n) {
        C64Y c64y = this.LIZ;
        if (c64n != null) {
            ((ArrayList) c64y.LIZ).remove(c64n);
            InterfaceC1545164p interfaceC1545164p = c64y.LIZLLL;
            if (interfaceC1545164p != null) {
                interfaceC1545164p.LIZ(c64n);
                return;
            }
            return;
        }
        c64y.getClass();
    }

    @Override // X.InterfaceC1541563f
    public final void LJI(C64J c64j) {
        this.LIZIZ.LIZ(this.LIZ, c64j);
    }

    @Override // X.InterfaceC1541563f
    public final void LIZJ(C64W c64w, C1559169z stickerEditLayout) {
        InterfaceC82683Wch interfaceC82683Wch;
        o.LJIIIZ(stickerEditLayout, "stickerEditLayout");
        C64I c64i = this.LIZIZ;
        o.LJII(c64i, "null cannot be cast to non-null type com.tiktok.sticker.stickercontainer.MTStickerContainer");
        C64F c64f = (C64F) c64i;
        C63G c63g = c64f.LJLL;
        if (c63g != null) {
            c63g.LJLILLLLZI = false;
            c63g.postInvalidate();
        }
        C64H c64h = c64f.LJLLJ;
        if (c64h != null && (interfaceC82683Wch = c64h.LJLJJI) != null) {
            interfaceC82683Wch.dismiss();
        }
        C64Y c64y = this.LIZ;
        c64y.getClass();
        InterfaceC1544864m interfaceC1544864m = c64y.LJ;
        if (interfaceC1544864m != null) {
            interfaceC1544864m.LIZ(c64w, stickerEditLayout, true);
        }
    }

    @Override // X.InterfaceC1541563f
    public final void LIZLLL(C64W c64w, C1559169z stickerEditLayout) {
        InterfaceC82683Wch interfaceC82683Wch;
        o.LJIIIZ(stickerEditLayout, "stickerEditLayout");
        C64I c64i = this.LIZIZ;
        o.LJII(c64i, "null cannot be cast to non-null type com.tiktok.sticker.stickercontainer.MTStickerContainer");
        C64F c64f = (C64F) c64i;
        C63G c63g = c64f.LJLL;
        if (c63g != null) {
            c63g.LJLILLLLZI = false;
            c63g.postInvalidate();
        }
        C64H c64h = c64f.LJLLJ;
        if (c64h != null && (interfaceC82683Wch = c64h.LJLJJI) != null) {
            interfaceC82683Wch.dismiss();
        }
        C64Y c64y = this.LIZ;
        c64y.getClass();
        InterfaceC1544864m interfaceC1544864m = c64y.LJ;
        if (interfaceC1544864m != null) {
            interfaceC1544864m.LIZ(c64w, stickerEditLayout, false);
        }
    }

    @Override // X.InterfaceC1541563f
    public final void LJ(float f, float f2, int i, String str) {
        C64I c64i = this.LIZIZ;
        o.LJII(c64i, "null cannot be cast to non-null type com.tiktok.sticker.stickercontainer.MTStickerContainer");
        C64E c64e = ((C64F) c64i).LJLLL;
        if (c64e != null) {
            if ((i == C63X.POLL.getType() && C1544564j.LIZ.getBoolean("poll_sticker_explain_show", false)) || C1544564j.LIZ.getBoolean("poll_sticker_explain_show", false)) {
                return;
            }
            c64e.LJLIL.setText(str);
            c64e.LJLIL.setVisibility(0);
            c64e.LJLIL.measure(View.MeasureSpec.makeMeasureSpec(C81184Vtc.LJ(c64e.getContext()), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(C81184Vtc.LIZLLL(c64e.getContext()), LiveLayoutPreloadThreadPriority.DEFAULT));
            float measuredWidth = f - (c64e.LJLIL.getMeasuredWidth() / 2);
            if (measuredWidth < 0.0f) {
                measuredWidth = 0.0f;
            }
            float measuredHeight = f2 - c64e.LJLIL.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c64e.LJLIL.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = (int) measuredWidth;
                marginLayoutParams.setMarginStart((int) measuredWidth);
                marginLayoutParams.topMargin = (int) measuredHeight;
            }
            c64e.LJLIL.setLayoutParams(marginLayoutParams);
            c64e.postDelayed(new ARunnableS38S0100000_2(c64e, 130), 3000L);
        }
    }
}
