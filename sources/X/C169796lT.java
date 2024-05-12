package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.6lT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C169796lT extends RelativeLayout {
    public C169826lW LJLIL;
    public TextView LJLILLLLZI;
    public TextView LJLJI;
    public FrameLayout LJLJJI;
    public final int LJLJJL;
    public ArrayList<EffectPointModel> LJLJJLL;
    public final int LJLJL;
    public int LJLJLJ;
    public InterfaceC170186m6 LJLJLLL;
    public final int LJLL;

    public int getCursorPosition() {
        return LJ(1, this.LJLJJI);
    }

    public int getCursorOffsetTime() {
        return (int) ((((int) KL2.LIZJ(getContext(), 21.0f)) / C170236mB.LIZ) * this.LJLJLJ);
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        return this.LJLJJLL;
    }

    public static String LJFF(int i) {
        StringBuilder LIZ = X1D.LIZ();
        String LIZ2 = C08380Uo.LIZ(LIZ, (int) Math.floor(i / 1000.0d), "", LIZ);
        if (LIZ2.length() < 2) {
            LIZ2 = i0.LJFF(CardStruct.IStatusCode.DEFAULT, LIZ2);
        }
        return i0.LJFF("00:", LIZ2);
    }

    public final EffectPointModel LIZJ(String str) {
        try {
            Iterator<EffectPointModel> it = this.LJLJJLL.iterator();
            it.getClass();
            while (it.hasNext()) {
                EffectPointModel next = it.next();
                EffectPointModel effectPointModel = next;
                if (effectPointModel != null && effectPointModel.getUuid().equals(str)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        } catch (Exception unused) {
            return null;
        }
    }

    public final int LIZLLL(int i) {
        float LIZJ;
        if (i == 1) {
            LIZJ = KL2.LIZJ(getContext(), 4.0f);
        } else {
            LIZJ = KL2.LIZJ(getContext(), 30.0f);
        }
        return (int) LIZJ;
    }

    public final void LJII(int i) {
        int LIZLLL = C170236mB.LIZ - LIZLLL(1);
        int i2 = (int) ((i / this.LJLJLJ) * LIZLLL);
        if (i2 >= LIZLLL) {
            i2 = this.LJLJJL + LIZLLL;
        }
        if (i2 <= 0) {
            i2 = -this.LJLJJL;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLJJI.getLayoutParams();
        marginLayoutParams.setMarginStart(i2);
        this.LJLJJI.setLayoutParams(marginLayoutParams);
        setStartTime(i);
    }

    public final void LJIIIIZZ(boolean z) {
        C169826lW c169826lW = this.LJLIL;
        if (c169826lW.LJLLJ != z) {
            c169826lW.LJLLJ = z;
            c169826lW.invalidate();
        }
    }

    public void setNormalColor(int i) {
        this.LJLIL.setNormalColor(i);
    }

    public void setOnCursorSeekListener(InterfaceC170186m6 interfaceC170186m6) {
        this.LJLJLLL = interfaceC170186m6;
    }

    public void setOverlayColor(int i) {
        this.LJLIL.setOverlayColor(i);
    }

    public void setStartTime(int i) {
        if (i > this.LJLJLJ - getCursorOffsetTime()) {
            i = this.LJLJLJ;
        }
        this.LJLJI.setText(LJFF(i));
    }

    public void setVideoDuration(int i) {
        C169826lW c169826lW = this.LJLIL;
        if (c169826lW != null) {
            this.LJLJLJ = i;
            c169826lW.setDuration(i);
            this.LJLILLLLZI.setText(LJFF(i));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (C6W9.LIZ()) {
            this.LJLIL.setVisibility(i);
        } else {
            super.setVisibility(i);
        }
    }

    public C169796lT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJL = KL2.LJIILL(context, KL2.LJIIJJI(context));
        int LIZJ = (int) KL2.LIZJ(context, 0.0f);
        this.LJLJJL = LIZJ;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a87, R.attr.a8q, R.attr.a8r, R.attr.aet, R.attr.aev, R.attr.anz, R.attr.b0v, R.attr.b0w, R.attr.b24, R.attr.b4z, R.attr.bah, R.attr.bbm, R.attr.bee});
            float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
            int i = C82848WfM.LIZJ;
            this.LJLL = Math.round(obtainStyledAttributes.getDimension(11, round - i)) + i;
            obtainStyledAttributes.recycle();
        }
        C16880lQ.LLLZIIL(R.layout.ks, C16880lQ.LLZIL(getContext()), this);
        this.LJLJJLL = new ArrayList<>();
        this.LJLIL = (C169826lW) findViewById(R.id.csr);
        this.LJLILLLLZI = (TextView) findViewById(R.id.m6a);
        this.LJLJI = (TextView) findViewById(R.id.ml5);
        this.LJLJJI = (FrameLayout) findViewById(R.id.j4m);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b28});
        int color = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        this.LJLIL.setNormalColor(color);
        final FrameLayout frameLayout = this.LJLJJI;
        frameLayout.setOnTouchListener(new View.OnTouchListener(frameLayout) { // from class: X.6lc
            public final FrameLayout LJLIL;
            public final RelativeLayout.LayoutParams LJLILLLLZI;
            public final int LJLJI = 1;

            {
                this.LJLIL = frameLayout;
                this.LJLILLLLZI = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
            }

            public final float LIZ(float f, int i2) {
                float LIZJ2;
                int LIZLLL = C169796lT.this.LIZLLL(i2);
                C169796lT c169796lT = C169796lT.this;
                if (f < c169796lT.LJLL) {
                    LIZJ2 = -c169796lT.LJLJJL;
                } else if (f > ((int) KL2.LIZJ(c169796lT.getContext(), C169796lT.this.LJLJL - 24)) - LIZLLL) {
                    float LIZJ3 = KL2.LIZJ(C169796lT.this.getContext(), C169796lT.this.LJLJL);
                    C169796lT c169796lT2 = C169796lT.this;
                    LIZJ2 = ((LIZJ3 - (c169796lT2.LJLL * 2)) - LIZLLL) + c169796lT2.LJLJJL;
                } else {
                    C169796lT c169796lT3 = C169796lT.this;
                    LIZJ2 = (f - c169796lT3.LJLL) + ((((2.0f * r6) / ((KL2.LIZJ(c169796lT3.getContext(), C169796lT.this.LJLJL) - (C169796lT.this.LJLL * 2)) - LIZLLL)) - 1.0f) * c169796lT3.LJLJJL);
                }
                if (C173636rf.LIZIZ(C169796lT.this.getContext())) {
                    return ((KL2.LIZJ(C169796lT.this.getContext(), C169796lT.this.LJLJL) - (C169796lT.this.LJLL * 2)) - LIZLLL) - LIZJ2;
                }
                return LIZJ2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
            
                if (r0 != 3) goto L9;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
                /*
                    r7 = this;
                    int r0 = r9.getAction()
                    r4 = 1
                    if (r0 == 0) goto L5f
                    r6 = 2
                    if (r0 == r4) goto L4b
                    r5 = 3
                    if (r0 == r6) goto L10
                    if (r0 == r5) goto L4b
                Lf:
                    return r4
                L10:
                    float r1 = r9.getRawX()
                    int r0 = r7.LJLJI
                    float r0 = r7.LIZ(r1, r0)
                    android.widget.RelativeLayout$LayoutParams r1 = r7.LJLILLLLZI
                    int r0 = java.lang.Math.round(r0)
                    r1.setMarginStart(r0)
                    android.widget.FrameLayout r1 = r7.LJLIL
                    android.widget.RelativeLayout$LayoutParams r0 = r7.LJLILLLLZI
                    r1.setLayoutParams(r0)
                    int r0 = r7.LJLJI
                    if (r0 != r4) goto L37
                    X.6lT r1 = X.C169796lT.this
                    int r0 = r1.getCursorPosition()
                    r1.setStartTime(r0)
                L37:
                    X.6lT r3 = X.C169796lT.this
                    X.6m6 r2 = r3.LJLJLLL
                    if (r2 == 0) goto Lf
                    android.widget.FrameLayout r1 = r7.LJLIL
                    int r0 = r7.LJLJI
                    int r1 = r3.LJ(r0, r1)
                    int r0 = r7.LJLJI
                    r2.LIZ(r1, r0, r5)
                    goto Lf
                L4b:
                    X.6lT r3 = X.C169796lT.this
                    X.6m6 r2 = r3.LJLJLLL
                    if (r2 == 0) goto Lf
                    android.widget.FrameLayout r1 = r7.LJLIL
                    int r0 = r7.LJLJI
                    int r1 = r3.LJ(r0, r1)
                    int r0 = r7.LJLJI
                    r2.LIZ(r1, r0, r6)
                    goto Lf
                L5f:
                    float r1 = r9.getRawX()
                    int r0 = r7.LJLJI
                    float r0 = r7.LIZ(r1, r0)
                    android.widget.RelativeLayout$LayoutParams r1 = r7.LJLILLLLZI
                    int r0 = java.lang.Math.round(r0)
                    r1.setMarginStart(r0)
                    android.widget.FrameLayout r1 = r7.LJLIL
                    android.widget.RelativeLayout$LayoutParams r0 = r7.LJLILLLLZI
                    r1.setLayoutParams(r0)
                    X.6lT r3 = X.C169796lT.this
                    X.6m6 r2 = r3.LJLJLLL
                    if (r2 == 0) goto Lf
                    android.widget.FrameLayout r1 = r7.LJLIL
                    int r0 = r7.LJLJI
                    int r1 = r3.LJ(r0, r1)
                    int r0 = r7.LJLJI
                    r2.LIZ(r1, r0, r4)
                    goto Lf
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC169886lc.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLJJI.getLayoutParams();
        marginLayoutParams.setMarginStart(-LIZJ);
        this.LJLJJI.setLayoutParams(marginLayoutParams);
        ((ImageView) findViewById(R.id.m32)).setImageDrawable(C78127UlP.LIZJ(0, -1, 1, (int) KL2.LIZJ(getContext(), 2.0f)));
        View findViewById = findViewById(R.id.anu);
        if (C6W9.LIZ()) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setBackground(C78127UlP.LIZJ((C78885Uxd.LIZIZ & 16777215) | LiveLayoutPreloadThreadPriority.DEFAULT, 0, (int) KL2.LIZJ(getContext(), 1.0f), 0));
        }
        View findViewById2 = findViewById(R.id.css);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById2.getLayoutParams();
        int i2 = this.LJLL;
        layoutParams.rightMargin = i2;
        layoutParams.leftMargin = i2;
        findViewById2.setLayoutParams(layoutParams);
    }

    public final void LIZIZ(int i, boolean z) {
        boolean z2;
        C169826lW c169826lW = this.LJLIL;
        if (c169826lW.LJLLJ != z) {
            c169826lW.LJLLJ = z;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && c169826lW.LJLLILLLL != i) {
            c169826lW.LJLLILLLL = i;
        } else if (!z2) {
            return;
        }
        c169826lW.invalidate();
    }

    public final int LJ(int i, FrameLayout frameLayout) {
        int left;
        if (frameLayout == null) {
            return 0;
        }
        if (C173636rf.LIZIZ(getContext())) {
            left = (int) ((1.0f - ((frameLayout.getRight() - this.LJLL) / C170236mB.LIZ)) * this.LJLJLJ);
        } else {
            left = (int) (((frameLayout.getLeft() - this.LJLL) / C170236mB.LIZ) * this.LJLJLJ);
        }
        int i2 = this.LJLJLJ;
        int LIZLLL = (int) ((LIZLLL(i) / C170236mB.LIZ) * i2);
        if (left < 0) {
            return 0;
        }
        if (left > i2 - LIZLLL) {
            return i2;
        }
        return left;
    }

    public final void LJI(List<EffectPointModel> list, boolean z) {
        this.LJLJJLL.clear();
        this.LJLJJLL.addAll(list);
        C169826lW c169826lW = this.LJLIL;
        c169826lW.LJLJJLL = this.LJLJJLL;
        c169826lW.LJLJL = z;
        c169826lW.postInvalidate();
    }

    public final void LIZ(int i, String str, long j, String str2, String str3, boolean z) {
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setUuid(str);
        int i2 = (int) j;
        effectPointModel.setUiStartPoint(i2);
        effectPointModel.setUiEndPoint(i2);
        effectPointModel.setSelectedColor(i);
        effectPointModel.setFromEnd(z);
        effectPointModel.setCategory(str2);
        effectPointModel.setResourceId(str3);
        this.LJLJJLL.add(effectPointModel);
        C169826lW c169826lW = this.LJLIL;
        c169826lW.LJLJJLL = this.LJLJJLL;
        c169826lW.LJLJL = z;
        c169826lW.postInvalidate();
    }
}
