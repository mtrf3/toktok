package X;

import Y.IDrS42S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.57V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57V extends ConstraintLayout {
    public final RecyclerView LJLIL;
    public final C1294856i LJLILLLLZI;
    public final View LJLJI;
    public float LJLJJI;
    public AnonymousClass578 LJLJJL;
    public C53S LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLL;
    public C57Y LJLLI;
    public C29901Fi<Long> LJLLILLLL;
    public C29901Fi<Long> LJLLJ;
    public C29901Fi<Long> LJLLL;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLLLL;
    public final C57W LJLLLLLL;
    public C53W LJLZ;

    public final boolean LJJLJLI() {
        return ((Boolean) this.LJLL.getValue()).booleanValue();
    }

    public final C54R getCallBack() {
        return this.LJLLLLLL;
    }

    public final C29901Fi<Long> getCurStartTimeEvent() {
        return this.LJLLILLLL;
    }

    public final C57Y getCursorTouchListener() {
        return this.LJLLI;
    }

    public final C53W getFrameCacheCallBack() {
        return this.LJLZ;
    }

    public final RecyclerView getFrameRecycler() {
        return this.LJLIL;
    }

    public final C29901Fi<Long> getOnScrollTouchUp() {
        return this.LJLLL;
    }

    public final InterfaceC88472Yns<Integer, C76800UCe> getOnScrollerChange() {
        return this.LJLLLL;
    }

    public final C29901Fi<Long> getRangeSeekEvent() {
        return this.LJLLJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void LJJLL(float f) {
        if (!this.LJLJLLL) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        float width = this.LJLJI.getWidth() * f;
        C1294856i c1294856i = this.LJLILLLLZI;
        if (LJJLJLI()) {
            width = -width;
        }
        c1294856i.setTranslationX(width);
    }

    public final void setCurStartTimeEvent(C29901Fi<Long> c29901Fi) {
        o.LJIIIZ(c29901Fi, "<set-?>");
        this.LJLLILLLL = c29901Fi;
    }

    public final void setCursorTouchListener(C57Y c57y) {
        this.LJLLI = c57y;
    }

    public final void setFrameCacheCallBack(C53W c53w) {
        this.LJLZ = c53w;
    }

    public final void setOnScrollTouchUp(C29901Fi<Long> c29901Fi) {
        o.LJIIIZ(c29901Fi, "<set-?>");
        this.LJLLL = c29901Fi;
    }

    public final void setOnScrollerChange(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLLLL = interfaceC88472Yns;
    }

    public final void setRangeSeekEvent(C29901Fi<Long> c29901Fi) {
        o.LJIIIZ(c29901Fi, "<set-?>");
        this.LJLLJ = c29901Fi;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57V(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x006b, code lost:
    
        if (r22 == r2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZ(X.C53S r26, long r27) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57V.LJJZ(X.53S, long):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.57W] */
    public C57V(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJLLL = true;
        this.LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(context, 604));
        this.LJLLILLLL = new C29901Fi<>();
        this.LJLLJ = new C29901Fi<>();
        this.LJLLL = new C29901Fi<>();
        this.LJLLLLLL = new C54R() { // from class: X.57W
            @Override // X.C54R
            public final float LIZIZ() {
                return C57V.this.LJLJJI * 1000;
            }

            @Override // X.C54R
            public final int LIZJ() {
                return C57V.this.LJLJL;
            }

            @Override // X.C54R
            public final int LIZ() {
                return C57X.LIZIZ;
            }
        };
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.as6, this, true);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = LLLLIILL.findViewById(R.id.dn5);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.frame_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLIL = recyclerView;
        View findViewById2 = LLLLIILL.findViewById(R.id.nbo);
        o.LJIIIIZZ(findViewById2, "root.findViewById(R.id.view_rect)");
        this.LJLJI = findViewById2;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        int i2 = (C57X.LIZJ - C57X.LIZ) / 2;
        V2B.LJIILL(recyclerView, i2, getPaddingTop(), i2, getPaddingBottom());
        recyclerView.setClipToPadding(false);
        View findViewById3 = LLLLIILL.findViewById(R.id.cog);
        o.LJIIIIZZ(findViewById3, "root.findViewById(R.id.e…_video_range_view_cursor)");
        C1294856i c1294856i = (C1294856i) findViewById3;
        this.LJLILLLLZI = c1294856i;
        c1294856i.setOnMoveListener(new AqS184S0100000_2(this, 52));
        c1294856i.setOnMoveDownListener(new AqS168S0100000_2(this, 351));
        c1294856i.setOnMoveUpListener(new AqS168S0100000_2(this, 352));
        recyclerView.LJIIJJI(new IDrS42S0100000_2(this, 2));
    }
}
