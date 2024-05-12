package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6Bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C156396Bv<T> extends C156426By {
    public AbstractC156406Bw<T> LLIIIZ;
    public float LLIIJI;
    public boolean LLIIJLIL;

    @Override // X.C156426By
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.C156426By
    public final C1558669u LJ() {
        AbstractC156406Bw<T> abstractC156406Bw = this.LLIIIZ;
        if (abstractC156406Bw != null) {
            return abstractC156406Bw.LJIJ();
        }
        return null;
    }

    @Override // X.C156426By
    public final boolean LJII() {
        AbstractC156406Bw<T> abstractC156406Bw = this.LLIIIZ;
        if (abstractC156406Bw == null || abstractC156406Bw.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        if (r2 == false) goto L27;
     */
    @Override // X.C156426By
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            r8 = this;
            X.6Bw<T> r6 = r8.LLIIIZ
            if (r6 == 0) goto L4c
            X.6C8 r0 = r6.LJLJLLL
            r5 = 1
            if (r0 == 0) goto L4c
            X.69u r7 = r6.LJLL
            if (r7 == 0) goto L4c
            boolean r0 = r0.LJIILL()
            if (r0 != 0) goto L4c
            boolean r0 = r6.LJLLILLLL
            if (r0 != 0) goto L4c
            boolean r0 = r6.LJLLJ
            if (r0 != 0) goto L4c
            boolean r0 = r6.LJII()
            if (r0 == 0) goto L31
            long r3 = r6.LJLLI
            int r0 = r7.LJLILLLLZI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L51
            int r0 = r7.LJLJI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L51
        L31:
            r2 = 1
        L32:
            r1 = 4
            if (r2 == 0) goto L4d
            int r0 = r6.getVisibility()
            if (r1 != r0) goto L4d
            r0 = 1
        L3c:
            r1 = 0
        L3d:
            X.C162696a1.LJ(r1, r6)
            if (r0 != r5) goto L4c
            Y.ARunnableS38S0100000_2 r1 = new Y.ARunnableS38S0100000_2
            r0 = 15
            r1.<init>(r8, r0)
            r8.post(r1)
        L4c:
            return
        L4d:
            r0 = 0
            if (r2 == 0) goto L3d
            goto L3c
        L51:
            r2 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156396Bv.LJIILIIL():void");
    }

    @Override // X.C156426By
    public final void LJIILL() {
        AbstractC156406Bw<T> abstractC156406Bw = this.LLIIIZ;
        if (abstractC156406Bw == null) {
            return;
        }
        abstractC156406Bw.setVisibility(0);
    }

    @Override // X.C156426By
    public final void LJIJJLI() {
        ViewGroup viewGroup;
        int i;
        int i2;
        ViewGroup viewGroup2;
        View childAt;
        View childAt2;
        Rect rect = new Rect();
        View view = this.LJLJL;
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null && (childAt2 = viewGroup.getChildAt(0)) != null) {
            i = childAt2.getMeasuredWidth();
        } else {
            i = 0;
        }
        View view2 = this.LJLJL;
        if ((view2 instanceof FrameLayout) && (viewGroup2 = (ViewGroup) view2) != null && (childAt = viewGroup2.getChildAt(0)) != null) {
            i2 = childAt.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        int x = (int) this.LJLJL.getX();
        int y = (int) this.LJLJL.getY();
        rect.set(x, y, i + x, i2 + y);
        this.LJLJJLL.LJLIL.set(rect);
        this.LJLJL.getLocationInWindow(r2);
        int[] iArr = {iArr[0] - x, iArr[1] - y};
        this.LJLJJLL.setmWindowPadding(iArr);
        C6C1 c6c1 = this.LJLJJLL;
        float f = this.LJLILLLLZI;
        float f2 = this.LJLJI;
        c6c1.LJLLILLLL = f;
        c6c1.LJLLI = f2;
        c6c1.invalidate();
        this.LJLJJLL.setStickerShowHelpboxCallback(new C6CB(this) { // from class: X.6Bx
            public final /* synthetic */ C156396Bv<T> LIZ;

            {
                this.LIZ = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
            
                if (r3 != false) goto L8;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
            @Override // X.C6CB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(boolean r3, boolean r4) {
                /*
                    r2 = this;
                    X.6Bv<T> r0 = r2.LIZ
                    X.6BR r1 = r0.LJLL
                    if (r1 == 0) goto L26
                    if (r3 == 0) goto L29
                    boolean r0 = r0.LJII()
                    if (r0 == 0) goto L18
                    X.6Bv<T> r0 = r2.LIZ
                    X.6BR r1 = r0.LJLL
                    r0 = 1
                    X.6BM r1 = (X.C6BM) r1
                    r1.LJ(r0)
                L18:
                    X.6Bv<T> r0 = r2.LIZ
                    boolean r0 = r0.LJII()
                    if (r0 == 0) goto L2f
                    X.6Bv<T> r0 = r2.LIZ
                    r0.LJIIZILJ()
                L25:
                    return
                L26:
                    if (r3 == 0) goto L2f
                    goto L18
                L29:
                    X.6BM r1 = (X.C6BM) r1
                    r0 = 0
                    r1.LJ(r0)
                L2f:
                    if (r4 == 0) goto L39
                    X.6Bv<T> r0 = r2.LIZ
                    X.6DA r0 = r0.LLIIIILZ
                    r0.LJII()
                    goto L25
                L39:
                    X.6Bv<T> r0 = r2.LIZ
                    X.6DA r0 = r0.LLIIIILZ
                    r0.LJII()
                    goto L25
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C156416Bx.LIZ(boolean, boolean):void");
            }
        });
    }

    @Override // X.C156426By
    public float getEndTime() {
        AbstractC156406Bw<T> abstractC156406Bw = this.LLIIIZ;
        int i = 0;
        if (abstractC156406Bw != null) {
            i = abstractC156406Bw.LJJJZ(0);
        }
        return i;
    }

    public final float getNewLayoutHeight() {
        AbstractC156406Bw<T> abstractC156406Bw = this.LLIIIZ;
        if (abstractC156406Bw == null) {
            return 0.0f;
        }
        float f = this.LLIIJI;
        o.LJI(abstractC156406Bw);
        return ((f - abstractC156406Bw.getHeight()) * this.LJLILLLLZI) / 2;
    }

    @Override // X.C156426By
    public float getStartTime() {
        AbstractC156406Bw<T> abstractC156406Bw = this.LLIIIZ;
        int i = 0;
        if (abstractC156406Bw != null) {
            i = abstractC156406Bw.LJJII(0);
        }
        return i;
    }

    public final AbstractC156406Bw<T> getBaseView() {
        return this.LLIIIZ;
    }

    @Override // X.C156426By
    public View getDrawView() {
        return this.LLIIIZ;
    }

    public final AbstractC156406Bw<T> getMBaseView() {
        return this.LLIIIZ;
    }

    public final boolean getMIsAutoAdd() {
        return this.LLIIJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156396Bv(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        Context context2 = getContext();
        this.LJLIL = context2;
        C16880lQ.LLLZIIL(R.layout.bne, C16880lQ.LLZIL(context2), this);
        this.LJLJJLL = (C6C1) findViewById(R.id.khw);
        this.LJLJL = findViewById(R.id.btt);
    }

    @Override // X.C156426By
    public final boolean LJIIJ(MotionEvent motionEvent) {
        AbstractC156406Bw<T> abstractC156406Bw;
        boolean LJIIJ = super.LJIIJ(motionEvent);
        if (LJIIJ && (abstractC156406Bw = this.LLIIIZ) != null) {
            abstractC156406Bw.setTouching(true);
        }
        return LJIIJ;
    }

    @Override // X.C156426By
    public final boolean LJIIJJI(MotionEvent motionEvent) {
        boolean LJIIJJI = super.LJIIJJI(motionEvent);
        AbstractC156406Bw<T> abstractC156406Bw = this.LLIIIZ;
        if (abstractC156406Bw != null) {
            abstractC156406Bw.setTouching(false);
        }
        return LJIIJJI;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        AbstractC156406Bw<T> abstractC156406Bw = this.LLIIIZ;
        if (abstractC156406Bw == null) {
            return;
        }
        abstractC156406Bw.setAlpha(f);
    }

    public final void setController(final AbstractC156286Bk<T> abstractC156286Bk) {
        AbstractC156406Bw<T> abstractC156406Bw;
        if (abstractC156286Bk != null && (abstractC156406Bw = this.LLIIIZ) != null) {
            abstractC156406Bw.setController(new C6C8() { // from class: X.6Bu
                @Override // X.C6C8
                public final boolean LJIILL() {
                    return abstractC156286Bk.LJIL();
                }

                @Override // X.C6C8
                public final InteractStickerStruct getInteractStickerStruct() {
                    return abstractC156286Bk.getInteractStickerStruct();
                }

                @Override // X.C6C8
                public final int getInteractStickerType() {
                    return abstractC156286Bk.LJIILIIL();
                }

                @Override // X.C6C8
                public final void LJIILLIIL(boolean z) {
                    abstractC156286Bk.LJJIIZ(z);
                }

                @Override // X.C6C8
                public final void LJIIZILJ(InteractStickerStruct interactStickerStruct) {
                    abstractC156286Bk.LJJIIJZLJL(interactStickerStruct, Boolean.FALSE);
                }
            });
        }
    }

    public final void setMBaseView(AbstractC156406Bw<T> abstractC156406Bw) {
        this.LLIIIZ = abstractC156406Bw;
    }

    public final void setMIsAutoAdd(boolean z) {
        this.LLIIJLIL = z;
    }

    @Override // X.C156426By
    public void setPlayPosition(long j) {
        AbstractC156406Bw<T> abstractC156406Bw = this.LLIIIZ;
        if (abstractC156406Bw != null) {
            abstractC156406Bw.setPlayPosition(j);
        }
    }

    public final void setSocialStickerTimeEditData(C1558669u data) {
        o.LJIIIZ(data, "data");
        AbstractC156406Bw<T> abstractC156406Bw = this.LLIIIZ;
        if (abstractC156406Bw != null) {
            abstractC156406Bw.setSocialStickerTimeEditData(data);
        }
    }

    public final void LJJ(AbstractC156406Bw<T> abstractC156406Bw, boolean z) {
        this.LLIIJLIL = z;
        if (abstractC156406Bw != null) {
            this.LLIIIZ = abstractC156406Bw;
            View view = this.LJLJL;
            o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) view).removeAllViews();
            View view2 = this.LJLJL;
            o.LJII(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) view2).addView(abstractC156406Bw);
        }
    }

    public final void LJJI(View view, AbstractC156406Bw<T> child) {
        o.LJIIIZ(child, "child");
        if (C173636rf.LIZIZ(getContext())) {
            this.LJLJL.setX(-(((view.getWidth() - child.getWidth()) / 2) - KL2.LIZJ(getContext(), 12.0f)));
        } else {
            this.LJLJL.setX(((view.getWidth() - child.getWidth()) / 2) - KL2.LIZJ(getContext(), 12.0f));
        }
        this.LJLJL.setY(((view.getHeight() - child.getHeight()) / 2) - KL2.LIZJ(getContext(), 12.0f));
    }

    @Override // X.C156426By
    public final void LJIL(float f, float f2, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C6BR c6br = this.LJLL;
        if (c6br != null && booleanValue) {
            int LIZLLL = ((C6BM) c6br).LIZLLL(false, false, false, this instanceof C1557269g);
            if (-1 != LIZLLL) {
                PointF LIZIZ = ((C6BM) this.LJLL).LIZIZ(f, f2, false);
                if (3 == LIZLLL) {
                    f = LIZIZ.x;
                    f2 = LIZIZ.y;
                }
            }
        }
        View view = this.LJLJL;
        view.setX(view.getX() + f);
        View view2 = this.LJLJL;
        view2.setY(view2.getY() + f2);
        this.LJLJJLL.LIZ(f, f2);
    }
}
