package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.jvm.internal.AqS63S0400000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8qE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223708qE extends AbstractC224038ql {
    public final InterfaceC223648q8 LJLLI;
    public View LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
    }

    @Override // X.AbstractC224038ql
    public final void LJIJJ() {
    }

    @Override // X.Y1I
    public final void LJJII() {
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
    }

    @Override // X.Y1E
    public final int getStickerType() {
        return 22;
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        return new View(this.LJLILLLLZI);
    }

    @Override // X.Y1I
    public final View LIZ(int i) {
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = new FrameLayout(this.LJLILLLLZI);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            View view = this.LJLLILLLL;
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
        }
        return this.LJLLILLLL;
    }

    @Override // X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        return ((AbstractC221838nD) this.LJLLJ.getValue()).LJIIJJI(j, f, f2, i);
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        return ((AbstractC221838nD) this.LJLLJ.getValue()).LJIILIIL(j, i, f, f2, popListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C223708qE(int i, Context context, C224048qm c224048qm, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, InterfaceC223648q8 interfaceC223648q8) {
        super(i, context, c224048qm, interactStickerStruct, c245649kW);
        o.LJIIIZ(context, "context");
        this.LJLLI = interfaceC223648q8;
        this.LJLLJ = C221108m2.LIZIZ(new AqS63S0400000_3(context, this, interactStickerStruct, c245649kW, 10));
    }
}
