package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.64I, reason: invalid class name */
/* loaded from: classes3.dex */
public class C64I extends FrameLayout {
    public C64O LJLIL;
    public FrameLayout LJLILLLLZI;
    public FrameLayout LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;

    public final C6V2 getOnGestureListener() {
        C64O c64o = this.LJLIL;
        if (c64o != null) {
            return c64o;
        }
        o.LJIJI("mGestureDispatcher");
        throw null;
    }

    public final OSZ<Integer, Integer> getStickerContainerSize() {
        int i;
        if (this.LJLJLJ == 0 || (i = this.LJLJL) == 0) {
            return new OSZ<>(Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()));
        }
        return new OSZ<>(Integer.valueOf(i), Integer.valueOf(this.LJLJLJ));
    }

    public final int getContainerBottomMargin() {
        return this.LJLJJLL;
    }

    public final int getContainerHeight() {
        return this.LJLJLJ;
    }

    public final int getContainerStartMargin() {
        return this.LJLJJL;
    }

    public final int getContainerTopMargin() {
        return this.LJLJJI;
    }

    public final int getContainerWidth() {
        return this.LJLJL;
    }

    public final FrameLayout getMStickerLayer() {
        return this.LJLJI;
    }

    public final void setContainerBottomMargin(int i) {
        this.LJLJJLL = i;
    }

    public final void setContainerHeight(int i) {
        this.LJLJLJ = i;
    }

    public final void setContainerStartMargin(int i) {
        this.LJLJJL = i;
    }

    public final void setContainerTopMargin(int i) {
        this.LJLJJI = i;
    }

    public final void setContainerWidth(int i) {
        this.LJLJL = i;
    }

    public final void setMStickerLayer(FrameLayout frameLayout) {
        o.LJIIIZ(frameLayout, "<set-?>");
        this.LJLJI = frameLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C64I(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.64K] */
    public void LIZ(C64Y stickerManager, C64J c64j) {
        o.LJIIIZ(stickerManager, "stickerManager");
        stickerManager.LIZLLL(new InterfaceC1544764l() { // from class: X.64K
            @Override // X.InterfaceC1544764l
            public final void LIZ(C64N c64n) {
            }

            @Override // X.InterfaceC1544764l
            public final void LIZIZ(C64N c64n) {
                View LIZ = c64n.LIZ();
                if (LIZ.getParent() == null) {
                    C64I.this.getMStickerLayer().addView(LIZ);
                } else {
                    ViewParent parent = LIZ.getParent();
                    o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    C16880lQ.LJLLL(LIZ, (ViewGroup) parent);
                    C64I.this.getMStickerLayer().addView(LIZ);
                }
                C64I.this.getMStickerLayer().post(new ARunnableS38S0100000_2(c64n, 158));
            }
        });
        stickerManager.LIZLLL = new InterfaceC1545164p() { // from class: X.64V
            @Override // X.InterfaceC1545164p
            public final void LIZ(C64N sticker) {
                o.LJIIIZ(sticker, "sticker");
                C16880lQ.LJLLLL(sticker.LIZ(), C64I.this.getMStickerLayer());
            }
        };
        stickerManager.LJ = new C64M(this);
        C64O c64o = new C64O(stickerManager, c64j.LIZ);
        this.LJLIL = c64o;
        int i = c64j.LIZIZ;
        this.LJLJJI = i;
        c64o.LJFF = i;
        c64o.LJI = c64j.LIZJ;
        FrameLayout frameLayout = c64j.LIZLLL;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = c64j.LIZIZ;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            ViewStub viewStub = c64j.LJ;
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                frameLayout2 = (FrameLayout) inflate;
            }
            this.LJLILLLLZI = frameLayout2;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            FrameLayout frameLayout3 = this.LJLILLLLZI;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(8);
                frameLayout.addView(this.LJLJI, layoutParams3);
            } else {
                o.LJIJI("stickerEditLayer");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64I(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJI = new FrameLayout(context);
    }
}
