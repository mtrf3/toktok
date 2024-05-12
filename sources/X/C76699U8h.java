package X;

import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3SingleViewSetting;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U8h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76699U8h extends F9E implements InterfaceC75179Tex {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final C76711U8t LJLJI;
    public final String LJLJJI;
    public final C76727U9j LJLJJL;
    public final InterfaceC88472Yns<View, Rect> LJLJJLL;
    public final Rect LJLJL;
    public final Rect LJLJLJ;
    public int LJLJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ};
    }

    @Override // X.InterfaceC75179Tex
    public final String LJJ() {
        return this.LJLJI.LJLIL.LIZJ;
    }

    @Override // X.InterfaceC75179Tex
    public final long LJJIIJZLJL() {
        Long l = this.LJLJI.LJLIL.LIZIZ;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // X.InterfaceC75179Tex
    public final FrameLayout LJJIJIL() {
        return this.LJLJI.LJLILLLLZI;
    }

    @Override // X.InterfaceC75179Tex
    public final EnumC75419Tip LJJIL() {
        EnumC75419Tip enumC75419Tip = this.LJLJI.LJLIL.LIZ;
        if (enumC75419Tip == null) {
            return EnumC75419Tip.StateIdle;
        }
        return enumC75419Tip;
    }

    @Override // X.InterfaceC75179Tex
    public final Rect LJJLIIIJ() {
        return this.LJLJJLL.invoke(this.LJLJI.LJLILLLLZI);
    }

    @Override // X.InterfaceC75179Tex
    public final boolean LJLJI() {
        if (this.LJLIL == 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC75179Tex
    public final SurfaceView LJLJJLL() {
        return this.LJLJI.LJLIL.LIZLLL;
    }

    @Override // X.InterfaceC75179Tex
    public final Rect LLLILZLLLI() {
        Rect rect = new Rect();
        FrameLayout frameLayout = this.LJLJI.LJLILLLLZI;
        if (frameLayout != null) {
            frameLayout.getGlobalVisibleRect(rect);
        }
        return rect;
    }

    @Override // X.InterfaceC75179Tex
    public final boolean LLLZIIL() {
        if (this.LJLILLLLZI != -1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC75179Tex
    public final Rect w() {
        if (MultiGuestV3SingleViewSetting.INSTANCE.getValue()) {
            return this.LJLJLJ;
        }
        return this.LJLJL;
    }

    @Override // X.InterfaceC75179Tex
    public final int LJZ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC75179Tex
    public final int LLI() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC75179Tex
    public final int LLLFFI() {
        return this.LJLILLLLZI;
    }

    public C76699U8h(int i, int i2, C76711U8t micWindow, String layoutId, C76727U9j c76727U9j, AqS179S0100000_13 aqS179S0100000_13, Rect rect, Rect surfaceViewRectInScreen) {
        o.LJIIIZ(micWindow, "micWindow");
        o.LJIIIZ(layoutId, "layoutId");
        o.LJIIIZ(surfaceViewRectInScreen, "surfaceViewRectInScreen");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = micWindow;
        this.LJLJJI = layoutId;
        this.LJLJJL = c76727U9j;
        this.LJLJJLL = aqS179S0100000_13;
        this.LJLJL = rect;
        this.LJLJLJ = surfaceViewRectInScreen;
    }
}
