package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import defpackage.a1;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159366Ng extends C19K implements C6UF<TextStickerModel> {
    public C1NS<TextStickerModel> LJLJJLL;
    public LifecycleOwner LJLJL;
    public InterfaceC88472Yns<? super String, ? extends Typeface> LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public Paint LJLLILLLL;
    public Path LJLLJ;
    public final TextPaint LJLLL;
    public InterfaceC159496Nt LJLLLL;
    public boolean LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public OSZ<Float, Float> LJZI;
    public AnonymousClass635 LJZL;
    public final int LL;
    public final C68U LLD;
    public int LLF;

    @Override // X.C6UF
    public final void LIZJ() {
    }

    @Override // X.C6UF
    public final void LJFF() {
    }

    @Override // X.C6UF
    public View getView() {
        return this;
    }

    public final int getBgColor$tools_sticker_core_release() {
        return this.LJLLILLLL.getColor();
    }

    public final OSZ<Float, Float> getOriginSize$tools_sticker_core_release() {
        OSZ<Float, Float> osz = this.LJZI;
        if (osz == null) {
            return new OSZ<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        return osz;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean hasOverlappingRendering() {
        AnonymousClass635 anonymousClass635 = this.LJZL;
        if ((anonymousClass635 == null || !anonymousClass635.LJIJ) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    public final float LJI() {
        if (getLineSpacingExtra() > 0.0f) {
            return 0.0f;
        }
        return this.LL + (-getLineSpacingExtra());
    }

    public final void LJIIJ() {
        getPaint().setAntiAlias(true);
        int i = this.LJLL;
        int i2 = this.LJLLI;
        setPadding(i, i2, i, i2);
        setMaxLines(20);
        Paint paint = new Paint();
        this.LJLLILLLL = paint;
        paint.setColor(-1);
        this.LJLLILLLL.setStyle(Paint.Style.FILL);
        this.LJLLILLLL.setAntiAlias(true);
        this.LJLLILLLL.setPathEffect(new CornerPathEffect(this.LJLJLLL));
        this.LJLLJ = new Path();
    }

    public final int getTextSizeSp() {
        return (int) (getTextSize() / getResources().getDisplayMetrics().scaledDensity);
    }

    public final int getDefaultTextSize() {
        return this.LJZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159366Ng(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLJLLL = ((Number) C88517Yob.LIZIZ.getValue()).intValue();
        this.LJLL = ((Number) C88517Yob.LJ.getValue()).intValue() * 2;
        this.LJLLI = ((Number) C88517Yob.LIZLLL.getValue()).intValue();
        this.LJLLILLLL = new Paint();
        this.LJLLJ = new Path();
        this.LJLLL = new TextPaint();
        this.LJLLLLLL = true;
        this.LJZ = 28;
        this.LL = ((Number) C88517Yob.LIZ.getValue()).intValue();
        this.LLD = new C68U(this);
    }

    public final void LJII(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                setGravity(8388613);
                return;
            }
            setGravity(17);
            return;
        }
        setGravity(8388611);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r2 != (-1)) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159366Ng.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1NS<TextStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            if (!c1ns.LJ.getClickable()) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    public final void setDefaultTextSize(int i) {
        this.LJZ = i;
    }

    public final void setFontService(InterfaceC88472Yns<? super String, ? extends Typeface> interfaceC88472Yns) {
        this.LJLJLJ = interfaceC88472Yns;
    }

    public final void setFontType(Typeface fontType) {
        o.LJIIIZ(fontType, "fontType");
        setTypeface(fontType);
    }

    public final void setFontTypeChangedListener(InterfaceC159496Nt interfaceC159496Nt) {
        this.LJLLLL = interfaceC159496Nt;
    }

    public final void setMinTextSize(int i) {
        this.LJLZ = i;
    }

    public final void setUseAutoTextSize(boolean z) {
        this.LJLLLLLL = z;
    }

    @Override // X.C6UF
    public final void LIZIZ(InteractStickerStruct struct, StickerModel stickerModel) {
        o.LJIIIZ(struct, "struct");
        if (!(stickerModel instanceof TextStickerModel)) {
            return;
        }
        LJIIJ();
        this.LJLJJLL = new C1NS<>(stickerModel);
        setMaxLines(Integer.MAX_VALUE);
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        setText(textStickerModel.getTextStr());
        LJIIIIZZ(textStickerModel.getMode(), textStickerModel.getColor());
        LJII(textStickerModel.getAlign());
        setTextSize(textStickerModel.getFontModel().fontSize);
        setLineSpacing(textStickerModel.getLineSpacingExtra(), getLineSpacingMultiplier());
        InterfaceC88472Yns<? super String, ? extends Typeface> interfaceC88472Yns = this.LJLJLJ;
        if (interfaceC88472Yns != null) {
            setFontType(interfaceC88472Yns.invoke(textStickerModel.getFontModel().fileName));
        }
        setAlpha(textStickerModel.getBaseStickerModel().getAlpha());
    }

    public final void LJIIIIZZ(int i, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        setTextColor(-1);
                        setShadowLayer(12.0f, 0.0f, 0.0f, i2);
                        return;
                    }
                    setShadowLayer(0.0f, 0.0f, 0.0f, i2);
                    setTextColor(i2);
                    return;
                }
                LJIIJJI(i2, true);
                return;
            }
            LJIIJJI(i2, false);
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        setTextColor(i2);
    }

    public final void LJIIJJI(int i, boolean z) {
        setShadowLayer(0.0f, 0.0f, 0.0f, i);
        if (z) {
            this.LJLLILLLL.setColor(Color.argb(153, (16711680 & i) >> 16, (65280 & i) >> 8, i & 255));
        } else {
            this.LJLLILLLL.setColor(i);
        }
        if (this.LJLLILLLL.getColor() == -1) {
            setTextColor(-16777216);
        } else {
            setTextColor(-1);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        C1NS<TextStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            if (c1ns.LJ.getEditable()) {
                super.onMeasure(i, i2);
            } else {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, LiveLayoutPreloadThreadPriority.DEFAULT));
            }
            setMeasuredDimension(C88517Yob.LIZ() + getMeasuredWidth(), getMeasuredHeight());
            this.LLF = i2;
            return;
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    public final void LJIIIZ(C1NS<TextStickerModel> container, LifecycleOwner owner, AnonymousClass635 anonymousClass635, InterfaceC88472Yns<? super String, ? extends Typeface> interfaceC88472Yns) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(owner, "owner");
        setFontService(interfaceC88472Yns);
        this.LJZL = anonymousClass635;
        this.LJLJJLL = container;
        this.LJLJL = owner;
        LJIIJ();
        C1NS<TextStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            LiveState<V> LIZ = c1ns.LIZ(new TBT() { // from class: X.5dw
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((TextStickerModel) obj).getVisible());
                }
            });
            LifecycleOwner lifecycleOwner = this.LJLJL;
            if (lifecycleOwner != null) {
                LIZ.LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 461));
                C1NS<TextStickerModel> c1ns2 = this.LJLJJLL;
                if (c1ns2 != null) {
                    LiveState<V> LIZ2 = c1ns2.LIZ(new TBT() { // from class: X.5dp
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((TextStickerModel) obj).getTextStr();
                        }
                    });
                    LifecycleOwner lifecycleOwner2 = this.LJLJL;
                    if (lifecycleOwner2 != null) {
                        LIZ2.LJIIIIZZ(lifecycleOwner2, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 465));
                        C1NS<TextStickerModel> c1ns3 = this.LJLJJLL;
                        if (c1ns3 != null) {
                            LiveState<V> LIZ3 = c1ns3.LIZ(new TBT() { // from class: X.6Ni
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return Integer.valueOf(((TextStickerModel) obj).getMode());
                                }
                            });
                            LifecycleOwner lifecycleOwner3 = this.LJLJL;
                            if (lifecycleOwner3 != null) {
                                LIZ3.LJIIIIZZ(lifecycleOwner3, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 467));
                                C1NS<TextStickerModel> c1ns4 = this.LJLJJLL;
                                if (c1ns4 != null) {
                                    LiveState<V> LIZ4 = c1ns4.LIZ(new TBT() { // from class: X.5a1
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return Integer.valueOf(((TextStickerModel) obj).getColor());
                                        }
                                    });
                                    LifecycleOwner lifecycleOwner4 = this.LJLJL;
                                    if (lifecycleOwner4 != null) {
                                        LIZ4.LJIIIIZZ(lifecycleOwner4, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 468));
                                        C1NS<TextStickerModel> c1ns5 = this.LJLJJLL;
                                        if (c1ns5 != null) {
                                            LiveState<V> LIZ5 = c1ns5.LIZ(new TBT() { // from class: X.6Nj
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return Integer.valueOf(((TextStickerModel) obj).getAlign());
                                                }
                                            });
                                            LifecycleOwner lifecycleOwner5 = this.LJLJL;
                                            if (lifecycleOwner5 != null) {
                                                LIZ5.LJIIIIZZ(lifecycleOwner5, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 473));
                                                C1NS<TextStickerModel> c1ns6 = this.LJLJJLL;
                                                if (c1ns6 != null) {
                                                    LiveState LJII = c1ns6.LIZ(new TBT() { // from class: X.6Nn
                                                        @Override // X.TBT, X.TBZ, X.TBW
                                                        public final Object get(Object obj) {
                                                            return ((TextStickerModel) obj).getFontModel();
                                                        }
                                                    }).LJII(new TBT() { // from class: X.6Np
                                                        @Override // X.TBT, X.TBZ, X.TBW
                                                        public final Object get(Object obj) {
                                                            return Integer.valueOf(((TextFontModel) obj).fontSize);
                                                        }
                                                    });
                                                    LifecycleOwner lifecycleOwner6 = this.LJLJL;
                                                    if (lifecycleOwner6 != null) {
                                                        LJII.LJIIIIZZ(lifecycleOwner6, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 475));
                                                        C1NS<TextStickerModel> c1ns7 = this.LJLJJLL;
                                                        if (c1ns7 != null) {
                                                            LiveState<V> LIZ6 = c1ns7.LIZ(new TBT() { // from class: X.5Zm
                                                                @Override // X.TBT, X.TBZ, X.TBW
                                                                public final Object get(Object obj) {
                                                                    return Float.valueOf(((TextStickerModel) obj).getLineSpacingExtra());
                                                                }
                                                            });
                                                            LifecycleOwner lifecycleOwner7 = this.LJLJL;
                                                            if (lifecycleOwner7 != null) {
                                                                LIZ6.LJIIIIZZ(lifecycleOwner7, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 477));
                                                                C1NS<TextStickerModel> c1ns8 = this.LJLJJLL;
                                                                if (c1ns8 != null) {
                                                                    LiveState LJII2 = c1ns8.LIZ(new TBT() { // from class: X.6No
                                                                        @Override // X.TBT, X.TBZ, X.TBW
                                                                        public final Object get(Object obj) {
                                                                            return ((TextStickerModel) obj).getFontModel();
                                                                        }
                                                                    }).LJII(new TBT() { // from class: X.6Nr
                                                                        @Override // X.TBT, X.TBZ, X.TBW
                                                                        public final Object get(Object obj) {
                                                                            return ((TextFontModel) obj).fileName;
                                                                        }
                                                                    });
                                                                    LifecycleOwner lifecycleOwner8 = this.LJLJL;
                                                                    if (lifecycleOwner8 != null) {
                                                                        LJII2.LJIIIIZZ(lifecycleOwner8, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 478));
                                                                        C1NS<TextStickerModel> c1ns9 = this.LJLJJLL;
                                                                        if (c1ns9 != null) {
                                                                            LiveState<V> LIZ7 = c1ns9.LIZ(new TBT() { // from class: X.6Nl
                                                                                @Override // X.TBT, X.TBZ, X.TBW
                                                                                public final Object get(Object obj) {
                                                                                    return Boolean.valueOf(((TextStickerModel) obj).getEditable());
                                                                                }
                                                                            });
                                                                            LifecycleOwner lifecycleOwner9 = this.LJLJL;
                                                                            if (lifecycleOwner9 != null) {
                                                                                LIZ7.LJIIIIZZ(lifecycleOwner9, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 479));
                                                                                return;
                                                                            } else {
                                                                                o.LJIJI("lifecycleOwner");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        o.LJIJI("stateContainer");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("lifecycleOwner");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("stateContainer");
                                                                throw null;
                                                            }
                                                            o.LJIJI("lifecycleOwner");
                                                            throw null;
                                                        }
                                                        o.LJIJI("stateContainer");
                                                        throw null;
                                                    }
                                                    o.LJIJI("lifecycleOwner");
                                                    throw null;
                                                }
                                                o.LJIJI("stateContainer");
                                                throw null;
                                            }
                                            o.LJIJI("lifecycleOwner");
                                            throw null;
                                        }
                                        o.LJIJI("stateContainer");
                                        throw null;
                                    }
                                    o.LJIJI("lifecycleOwner");
                                    throw null;
                                }
                                o.LJIJI("stateContainer");
                                throw null;
                            }
                            o.LJIJI("lifecycleOwner");
                            throw null;
                        }
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                    o.LJIJI("lifecycleOwner");
                    throw null;
                }
                o.LJIJI("stateContainer");
                throw null;
            }
            o.LJIJI("lifecycleOwner");
            throw null;
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LJLLLLLL) {
            C1NS<TextStickerModel> c1ns = this.LJLJJLL;
            if (c1ns != null) {
                if (c1ns.LJ.getEditable()) {
                    this.LLD.LIZ(this.LLF, getTextSizeSp(), getDefaultTextSize(), this.LJLZ, new AqS168S0100000_2(this, 472));
                    return;
                }
                return;
            }
            o.LJIJI("stateContainer");
            throw null;
        }
    }
}
