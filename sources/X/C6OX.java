package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh;
import java.util.Iterator;
import kotlin.jvm.internal.AqS0S0000002_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6OX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6OX implements C6QO {
    public final Context LIZ;
    public final BaseStickerModel LIZIZ;
    public final C159636Oh LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public InterfaceC159596Od LJIIIIZZ;
    public float LJIIIZ;

    @Override // X.C6QO
    public float LIZLLL() {
        return 1.0f;
    }

    @Override // X.C6QO
    public Integer LJIILL() {
        return null;
    }

    public void LJJIIJZLJL() {
    }

    public abstract void LJJIJIIJIL(BaseStickerModel baseStickerModel);

    public abstract View LJJIJIL();

    @Override // X.C6QO
    public final InterfaceC159596Od LJIILIIL() {
        InterfaceC159596Od interfaceC159596Od = this.LJIIIIZZ;
        if (interfaceC159596Od != null) {
            return interfaceC159596Od;
        }
        o.LJIJI("stickerRender");
        throw null;
    }

    public final C1NS<BaseStickerModel> LJJ() {
        return (C1NS) this.LJ.getValue();
    }

    public final StickerDurationAutoRefresh LJJI() {
        return (StickerDurationAutoRefresh) this.LJII.getValue();
    }

    public final C6SD LJJIFFI() {
        return (C6SD) this.LJFF.getValue();
    }

    public final C1NS<C159636Oh> LJJIII() {
        return (C1NS) this.LJI.getValue();
    }

    public C6SD LJJIIZI() {
        return new C6SD(LJJ());
    }

    public void LJJIJ() {
        Iterator it = C47261Igj.LJII(new TBT() { // from class: X.5h7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getZIndex());
            }
        }, new TBT() { // from class: X.6Ob
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((BaseStickerModel) obj).getType();
            }
        }, new TBT() { // from class: X.6OY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getLeft());
            }
        }, new TBT() { // from class: X.6OZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getTop());
            }
        }, new TBT() { // from class: X.5hG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getCenterX());
            }
        }, new TBT() { // from class: X.5hH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getCenterY());
            }
        }, new TBT() { // from class: X.5hJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getWidth());
            }
        }, new TBT() { // from class: X.5hK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getHeight());
            }
        }, new TBT() { // from class: X.6A4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getCenterXInVideo());
            }
        }, new TBT() { // from class: X.6A5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getCenterYInVideo());
            }
        }, new TBT() { // from class: X.6A6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getWidthInVideo());
            }
        }, new TBT() { // from class: X.6A7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getHeightInVideo());
            }
        }, new TBT() { // from class: X.5hA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getTranslateX());
            }
        }, new TBT() { // from class: X.5hB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getTranslateY());
            }
        }, new TBT() { // from class: X.5hE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getScale());
            }
        }, new TBT() { // from class: X.5hF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getRotation());
            }
        }, new TBV() { // from class: X.6I7
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getStartTime());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setStartTime(((Number) obj2).floatValue());
            }
        }, new TBV() { // from class: X.6I9
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getEndTime());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setEndTime(((Number) obj2).floatValue());
            }
        }, new TBV() { // from class: X.5h8
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getUiStartTime());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setUiStartTime(((Number) obj2).floatValue());
            }
        }, new TBV() { // from class: X.5h9
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getUiEndTime());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setUiEndTime(((Number) obj2).floatValue());
            }
        }, new TBT() { // from class: X.5hI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((BaseStickerModel) obj).getVisible());
            }
        }, new TBT() { // from class: X.5hC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getAlpha());
            }
        }).iterator();
        while (it.hasNext()) {
            LJJ().LIZ((TBW) it.next()).LJIIIIZZ(LJJII(), Lifecycle.State.STARTED, new AqS168S0100000_2(this, 536));
        }
        LJJ().LIZ(new TBT() { // from class: X.5hD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getScale());
            }
        }).LJIIIIZZ(LJJII(), Lifecycle.State.STARTED, new AqS168S0100000_2(this, 537));
    }

    @Override // X.C6QO
    public final boolean LIZJ() {
        return LJJIII().LJ.LJLLLL;
    }

    @Override // X.C6QO
    public final boolean LJ() {
        return LJJIII().LJ.LJLJL;
    }

    @Override // X.C6QO
    public boolean LJFF() {
        return LJJIII().LJ.LJLJJL;
    }

    @Override // X.C6QO
    public final boolean LJIIIIZZ() {
        return LJJIII().LJ.LJLJJI;
    }

    @Override // X.C6QO
    public boolean LJIIJ() {
        return LJJIII().LJ.LJLLILLLL;
    }

    @Override // X.C6QO
    public C159636Oh LJIIL() {
        return LJJIII().LJ;
    }

    @Override // X.C6QO
    public final boolean LJIILLIIL() {
        return LJJIII().LJ.LJLJI;
    }

    @Override // X.C6QO
    public final void LJIJI() {
        LJJ().LJ(C159566Oa.LJLIL);
    }

    @Override // X.C6QO
    public final BaseStickerModel LJIJJ() {
        return LJJ().LJ;
    }

    @Override // X.C6QO
    public final int LJJLIIIJLJLI() {
        return LJJ().LJ.getId();
    }

    @Override // X.C6QO
    public final EnumC157656Gr getStickerType() {
        return LJJ().LJ.getType();
    }

    public LifecycleOwner LJJII() {
        return this.LIZLLL;
    }

    public C159636Oh LJJIIJ() {
        return this.LIZJ;
    }

    public static final void LJJIIZ(C6OX c6ox) {
        StickerDurationAutoRefresh LJJI = c6ox.LJJI();
        if (LJJI != null) {
            LJJI.LIZIZ(c6ox.LJJ().LJ, new AqS168S0100000_2(c6ox, 535));
        }
    }

    @Override // X.C6QO
    public final void LIZIZ(boolean z) {
        LJJIII().LJ(new AqS7S0010000_2(z, 46));
    }

    @Override // X.C6QO
    public void LJI(StickerModel stickerModel) {
        o.LJIIIZ(stickerModel, "stickerModel");
        InterfaceC159596Od interfaceC159596Od = this.LJIIIIZZ;
        if (interfaceC159596Od != null) {
            interfaceC159596Od.LIZ();
        } else {
            o.LJIJI("stickerRender");
            throw null;
        }
    }

    @Override // X.C6QO
    public final void LJII(boolean z) {
        LJJIII().LJ(new AqS7S0010000_2(z, 45));
    }

    @Override // X.C6QO
    public final void LJIIJJI(boolean z) {
        LJJIII().LJ(new AqS7S0010000_2(z, 47));
    }

    @Override // X.C6QO
    public final void LJIILJJIL(boolean z) {
        LJJIII().LJ(new AqS7S0010000_2(z, 44));
    }

    @Override // X.C6QO
    public final void LJIJ(boolean z) {
        LJJIII().LJ(new AqS7S0010000_2(z, 48));
    }

    public final void LJIL(C6SE listener) {
        o.LJIIIZ(listener, "listener");
        LJJIFFI().LIZIZ.add(listener);
    }

    public void LJJIJIIJI(FrameLayout container) {
        o.LJIIIZ(container, "container");
        this.LJIIIIZZ = new C140525fM(this.LIZ, LJJ(), LJJIJIL(), container, LJJII());
        LJJIJ();
        if (!LJJIII().LJ.LJLLL) {
            return;
        }
        LJIL(new C6SE() { // from class: X.6Py
            @Override // X.C6SE
            public final void LIZ(int i, boolean z) {
            }

            @Override // X.C6SE
            public final void LIZIZ(int i) {
            }

            @Override // X.C6SE
            public final void LJIIJ(int i) {
            }

            @Override // X.C6SE
            public final void LIZLLL() {
                C6OX c6ox = C6OX.this;
                StickerDurationAutoRefresh LJJI = c6ox.LJJI();
                if (LJJI != null) {
                    LJJI.LIZJ = false;
                }
                c6ox.setVisible(true);
            }

            @Override // X.C6SE
            public final void LJIIL() {
                C6OX c6ox = C6OX.this;
                StickerDurationAutoRefresh LJJI = c6ox.LJJI();
                if (LJJI != null) {
                    LJJI.LIZJ = false;
                }
                c6ox.setVisible(true);
            }

            @Override // X.C6SE
            public final void LJIIJJI(int i) {
                C6OX.LJJIIZ(C6OX.this);
            }

            @Override // X.C6SE
            public final void LJJI(int i) {
                C6OX.LJJIIZ(C6OX.this);
            }

            @Override // X.C6SE
            public final void LJIILIIL(int i, RectF visibleRect) {
                o.LJIIIZ(visibleRect, "visibleRect");
            }

            @Override // X.C6SE
            public final void LJIILL(float f, int i, RectF visibleRect) {
                o.LJIIIZ(visibleRect, "visibleRect");
            }

            @Override // X.C6SE
            public final void LJ(int i, float f, float f2, RectF visibleRect) {
                o.LJIIIZ(visibleRect, "visibleRect");
            }

            @Override // X.C6SE
            public final void LJFF(int i, EnumC157656Gr stickerType, float f, float f2, RectF visibleRect, float f3) {
                o.LJIIIZ(stickerType, "stickerType");
                o.LJIIIZ(visibleRect, "visibleRect");
                C6OX.LJJIIZ(C6OX.this);
            }

            @Override // X.C6SE
            public final void LJIILLIIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
                C160076Pz.LIZJ(enumC157656Gr, rectF);
            }

            @Override // X.C6SE
            public final void LJIL(int i, EnumC157656Gr enumC157656Gr, float f, float f2, RectF rectF, float f3) {
                C160076Pz.LIZLLL(enumC157656Gr, rectF);
            }

            @Override // X.C6SE
            public final void LJJ(int i, EnumC157656Gr stickerType, float f, float f2, RectF visibleRect, float f3) {
                o.LJIIIZ(stickerType, "stickerType");
                o.LJIIIZ(visibleRect, "visibleRect");
                C6OX c6ox = C6OX.this;
                StickerDurationAutoRefresh LJJI = c6ox.LJJI();
                if (LJJI != null) {
                    LJJI.LIZJ = false;
                }
                c6ox.setVisible(true);
            }

            @Override // X.C6SE
            public final void LJIIIZ(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
                C160076Pz.LIZIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
            }

            @Override // X.C6SE
            public final void LJIJI(int i, EnumC157656Gr enumC157656Gr, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, RectF rectF, float f3) {
                C160076Pz.LIZ(enumC157656Gr, motionEvent, motionEvent2, rectF);
            }
        });
        LJJIIZ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        if (r1 <= r6) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(int r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh r4 = r5.LJJI()
            r3 = 0
            r2 = 1
            if (r4 == 0) goto L39
            X.1NS r0 = r5.LJJ()
            STATE r0 = r0.LJ
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel) r0
            float r1 = r0.getStartTime()
            X.1NS r0 = r5.LJJ()
            STATE r0 = r0.LJ
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel) r0
            float r0 = r0.getEndTime()
            boolean r0 = r4.LIZJ(r1, r0)
            if (r0 != r2) goto L39
        L26:
            r3 = 1
        L27:
            X.1NS r2 = r5.LJJ()
            kotlin.jvm.internal.AqS7S0010000_2 r1 = new kotlin.jvm.internal.AqS7S0010000_2
            r0 = 49
            r1.<init>(r3, r0)
            r2.LJ(r1)
            r5.setVisible(r3)
            return
        L39:
            X.1NS r0 = r5.LJJ()
            STATE r0 = r0.LJ
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel) r0
            float r0 = r0.getStartTime()
            int r1 = (int) r0
            X.1NS r0 = r5.LJJ()
            STATE r0 = r0.LJ
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel) r0
            float r0 = r0.getEndTime()
            int r0 = (int) r0
            if (r6 > r0) goto L27
            if (r1 > r6) goto L27
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6OX.LJJIJL(int):void");
    }

    public final void LJJIJLIJ(C6SE listener) {
        o.LJIIIZ(listener, "listener");
        LJJIFFI().LIZIZ.remove(listener);
    }

    public final void LJJIL(BaseStickerModel model) {
        o.LJIIIZ(model, "model");
        LJJ().LJ(new AqS168S0100000_2(model, 538));
    }

    @Override // X.C6QO
    public void setVisible(boolean z) {
        Iterator<C6SE> it = LJJIFFI().LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(LJJLIIIJLJLI(), z);
        }
    }

    @Override // X.C6QO
    public final void LJIIIZ(boolean z, BaseStickerModel stickerModel) {
        o.LJIIIZ(stickerModel, "stickerModel");
        if (z) {
            StickerDurationAutoRefresh LJJI = LJJI();
            if (LJJI != null) {
                LJJI.LIZIZ(stickerModel, new AqS168S0100000_2(this, 534));
                return;
            }
            return;
        }
        StickerDurationAutoRefresh LJJI2 = LJJI();
        if (LJJI2 != null) {
            LJJI2.LIZJ = false;
        }
        setVisible(true);
    }

    @Override // X.C6QO
    public final void LJIIZILJ(float f, float f2) {
        LJJ().LJ(new AqS0S0000002_2(f, f2, 1));
    }

    @Override // X.C6QO
    public final Object LJIJJLI(boolean z, InterfaceC67352kd<? super StickerModel> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        View LJJIJIL = LJJIJIL();
        if (!z && LJJIJIL.getLeft() == LJJ().LJ.getLeft() && LJJIJIL.getTop() == LJJ().LJ.getTop() && LJJIJIL.getMeasuredWidth() == LJJ().LJ.getWidth() && LJJIJIL.getMeasuredWidth() > 0 && LJJIJIL.getMeasuredHeight() == LJJ().LJ.getHeight() && LJJIJIL.getMeasuredHeight() > 0) {
            StickerModel LIZ = LIZ();
            C3C5.m7constructorimpl(LIZ);
            c84654XKg.resumeWith(LIZ);
        } else {
            InterfaceC159596Od interfaceC159596Od = this.LJIIIIZZ;
            if (interfaceC159596Od != null) {
                interfaceC159596Od.LIZIZ(new AqS149S0200000_2(c84654XKg, this, 96));
            } else {
                o.LJIJI("stickerRender");
                throw null;
            }
        }
        return c84654XKg.LIZ();
    }

    public C6OX(Context context, BaseStickerModel baseStickerModel, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner, C160056Px stickerObjectContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LIZ = context;
        this.LIZIZ = baseStickerModel;
        this.LIZJ = c159636Oh;
        this.LIZLLL = lifecycleOwner;
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 894));
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 895));
        this.LJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 896));
        this.LJII = C221108m2.LIZIZ(new AqS149S0200000_2(this, stickerObjectContainer, 95));
    }
}
