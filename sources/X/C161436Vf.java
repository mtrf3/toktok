package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6Vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C161436Vf extends View {
    public int LJLIL;
    public int LJLILLLLZI;
    public InterfaceC153045zY LJLJI;
    public SafeHandler LJLJJI;
    public C161486Vk LJLJJL;
    public boolean LJLJJLL;
    public C66J LJLJL;
    public int LJLJLJ;
    public final C6W6 LJLJLLL;
    public boolean LJLL;
    public long LJLLI;
    public boolean LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public C6W4 LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public C161446Vg LL;
    public final C89463Z9f LLD;
    public final PointF LLF;
    public FTCEditInfoStickerViewModel LLFF;
    public final ARunnableS38S0100000_2 LLFFF;

    public final void LIZ() {
        this.LJZL = false;
        C161486Vk c161486Vk = this.LJLJJL;
        if (c161486Vk != null) {
            Iterator it = ((ArrayList) c161486Vk.LIZ).iterator();
            while (it.hasNext()) {
                ((C153155zj) it.next()).LJLIL = false;
            }
        }
        invalidate();
    }

    public void setOnInfoStickerPinEditClick(C66G<C153155zj> c66g) {
    }

    public void setOnInfoStickerTimeEdit(C66G<C153155zj> c66g) {
    }

    public void setPinHelper(C161516Vn c161516Vn) {
    }

    public final void LIZIZ() {
        if (C32151Nz.LJJIIJZLJL(this.LJLJJL.LIZ)) {
            return;
        }
        this.LJLJI.LJZL();
        Iterator it = ((ArrayList) this.LJLJJL.LIZ).iterator();
        if (!it.hasNext()) {
            C161486Vk c161486Vk = this.LJLJJL;
            getClass();
            c161486Vk.getClass();
        } else {
            Object next = it.next();
            this.LJLJJL.getClass();
            next.getClass();
            throw null;
        }
    }

    public int getStickNumber() {
        if (!C78886Uxe.LJJIJ(this.LJLJJL.LIZ)) {
            return ((ArrayList) this.LJLJJL.LIZ).size();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLD.LJIIIZ();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLD.LJIIJ();
    }

    public C161446Vg getGestureListener() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C161486Vk c161486Vk = this.LJLJJL;
        if (c161486Vk == null) {
            return;
        }
        Iterator it = ((ArrayList) c161486Vk.LIZ).iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public void setHavePinEdit(boolean z) {
        this.LJZI = z;
    }

    public void setHaveTimeEdit(boolean z) {
        this.LJZ = z;
    }

    public void setITimeEditListener(C66J c66j) {
        this.LJLJL = c66j;
    }

    public void setShowHelpBox(boolean z) {
        ARunnableS38S0100000_2 aRunnableS38S0100000_2;
        SafeHandler safeHandler;
        this.LJZL = z;
        ARunnableS38S0100000_2 aRunnableS38S0100000_22 = this.LLFFF;
        if (aRunnableS38S0100000_22 != null && (safeHandler = this.LJLJJI) != null) {
            safeHandler.removeCallbacks(aRunnableS38S0100000_22);
        }
        if (z) {
            SafeHandler safeHandler2 = this.LJLJJI;
            if (safeHandler2 != null && (aRunnableS38S0100000_2 = this.LLFFF) != null) {
                safeHandler2.postDelayed(aRunnableS38S0100000_2, 3000);
            }
            C66J c66j = this.LJLJL;
            if (c66j != null && !c66j.LJIIIIZZ() && !this.LJLJL.LIZ()) {
                AnonymousClass668.LIZIZ().LIZ();
                new RectF();
                getClass();
                throw null;
            }
        } else {
            this.LLD.LJII();
        }
        invalidate();
    }

    public void setStickerDataChangeListener(InterfaceC153125zg interfaceC153125zg) {
        C161486Vk c161486Vk = this.LJLJJL;
        if (c161486Vk != null) {
            c161486Vk.getClass();
        }
    }

    public void setStickerOnMoveListener(C6W4 c6w4) {
        this.LJLZ = c6w4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6W6] */
    public C161436Vf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJLL = true;
        this.LJLJLLL = new Object() { // from class: X.6W6
        };
        this.LJZ = true;
        this.LJZI = true;
        this.LLD = new C89463Z9f(this, new AbstractC38911fr() { // from class: X.6Vl
            @Override // X.C6GI
            public final void LIZLLL() {
            }

            @Override // X.C6GI
            public final void LJFF() {
            }

            @Override // X.C6GI
            public final void LJIIIIZZ() {
            }

            @Override // X.C6GI
            public final void LJIIJ() {
            }

            @Override // X.C6GI
            public final void LIZJ() {
                C161436Vf c161436Vf = C161436Vf.this;
                c161436Vf.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" onClickContent");
                c161436Vf.LJLJLLL.getClass();
                LIZ.append(true);
                LIZ.append(" ");
                c161436Vf.LJLJLLL.getClass();
                LIZ.append(true);
                X1D.LIZIZ(LIZ);
                c161436Vf.setShowHelpBox(true);
                c161436Vf.getClass();
                if (c161436Vf.LJLJJL == null) {
                    if (c161436Vf.LLFF == null) {
                        c161436Vf.LLFF = (FTCEditInfoStickerViewModel) C163726bg.LIZJ(c161436Vf).LIZ(FTCEditInfoStickerViewModel.class);
                    }
                    c161436Vf.LJLJLLL.getClass();
                    throw null;
                }
                c161436Vf.LJLJLLL.getClass();
                throw null;
            }

            @Override // X.C6GI
            public final void LJ() {
                C161436Vf c161436Vf = C161436Vf.this;
                c161436Vf.LJLJLLL.getClass();
                c161436Vf.setShowHelpBox(false);
            }

            @Override // X.C6GI
            public final void LJIIIZ() {
                C161436Vf c161436Vf = C161436Vf.this;
                c161436Vf.LJLJLLL.getClass();
                c161436Vf.setShowHelpBox(false);
            }
        });
        this.LLF = new PointF();
        this.LLFFF = new ARunnableS38S0100000_2(this, 30);
    }
}
