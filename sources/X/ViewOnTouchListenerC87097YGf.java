package X;

import Y.IDCListenerS261S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.YGf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnTouchListenerC87097YGf extends FrameLayout implements View.OnTouchListener, InterfaceC59688Nbg {
    public SmartImageView LJLIL;
    public TextView LJLILLLLZI;
    public View LJLJI;
    public final C62822Ol8 LJLJJI;
    public C87098YGg LJLJJL;
    public boolean LJLJJLL;
    public Aweme LJLJL;
    public AwemePlayFunModel LJLJLJ;
    public View LJLJLLL;
    public boolean LJLL;
    public final GestureDetector LJLLI;
    public final IDCListenerS261S0100000_15 LJLLILLLL;
    public final C87099YGh LJLLJ;

    @Override // X.InterfaceC59688Nbg
    public final void LIZ() {
        this.LJLJJLL = false;
        getStateContext().LIZLLL();
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            smartImageView.setImageDisplayListener(null);
        } else {
            o.LJIJI("eggImageView");
            throw null;
        }
    }

    @Override // X.InterfaceC59688Nbg
    public final void LIZJ() {
        this.LJLJJLL = true;
    }

    @Override // X.InterfaceC59688Nbg
    public final void LJFF() {
        this.LJLL = false;
    }

    @Override // X.InterfaceC59688Nbg
    public final void pause() {
        this.LJLL = true;
        C87098YGg stateContext = getStateContext();
        AbstractC87105YGn abstractC87105YGn = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC87105YGn != null) {
            abstractC87105YGn.LIZLLL();
        }
    }

    @Override // X.InterfaceC59688Nbg
    public final void resume() {
        this.LJLL = false;
        C87098YGg stateContext = getStateContext();
        AbstractC87105YGn abstractC87105YGn = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC87105YGn != null) {
            abstractC87105YGn.LJFF();
        }
    }

    private final NI3 getAdDepend() {
        return (NI3) this.LJLJJI.getValue();
    }

    public final C87113YGv LJII() {
        int LJJJJLI;
        int LIZ;
        View findViewById;
        C87113YGv c87113YGv = new C87113YGv();
        int LJIIJJI = KL2.LJIIJJI(getContext());
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null && (findViewById = LJIJJ.findViewById(R.id.j5x)) != null) {
            LJJJJLI = findViewById.getHeight() + C87115YGx.LIZ(findViewById);
        } else {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            LJJJJLI = C63081OpJ.LJJJJLI(context2);
        }
        View view = this.LJLJLLL;
        if (view != null) {
            LIZ = C87115YGx.LIZ(view);
        } else {
            LIZ = C87115YGx.LIZ(this) + getHeight();
        }
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            textView.measure(0, 0);
            TextView textView2 = this.LJLILLLLZI;
            if (textView2 != null) {
                int measuredHeight = textView2.getMeasuredHeight();
                float f = LJIIJJI;
                c87113YGv.LIZ = (int) (0.587f * f);
                float LIZJ = (LIZ - LJJJJLI) - ((KL2.LIZJ(getContext(), 16.0f) * 2) + (r0 + measuredHeight));
                if (LIZJ >= 0.0f) {
                    c87113YGv.LIZIZ = KL2.LIZJ(getContext(), 16.0f) + (LIZJ / 2.0f) + LJJJJLI;
                } else {
                    c87113YGv.LIZ += (int) LIZJ;
                    c87113YGv.LIZIZ = KL2.LIZJ(getContext(), 16.0f) + LJJJJLI;
                }
                c87113YGv.LIZJ = (f - c87113YGv.LIZ) / 2.0f;
                c87113YGv.LIZLLL = KL2.LIZJ(getContext(), 86.0f) / c87113YGv.LIZ;
                return c87113YGv;
            }
            o.LJIJI("eggTitleView");
            throw null;
        }
        o.LJIJI("eggTitleView");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLJL
            if (r0 == 0) goto La
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 != 0) goto Lb
        La:
            return
        Lb:
            X.YGg r0 = r7.getStateContext()
            java.lang.String r1 = r0.LJIIL
            java.lang.String r0 = "popupmask"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r6 = 0
            if (r0 == 0) goto L43
            X.YGg r0 = r7.getStateContext()
            java.util.HashMap<java.lang.String, X.YGn> r1 = r0.LJIILJJIL
            java.lang.String r0 = r0.LIZJ
            java.lang.Object r0 = r1.get(r0)
            X.YGn r0 = (X.AbstractC87105YGn) r0
            if (r0 == 0) goto L2d
            r0.LIZ()
        L2d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLJL
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
        L35:
            X.YGg r0 = r7.getStateContext()
            java.lang.String r1 = r0.LJIIL
            java.lang.String r0 = "otherclick"
            X.C174716tP.LIZ(r2, r0, r1, r6)
            goto La
        L41:
            r2 = r6
            goto L35
        L43:
            X.YGg r0 = r7.getStateContext()
            java.lang.String r1 = r0.LIZJ
            java.lang.String r0 = "EggShowState"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            java.lang.String r5 = "click"
            if (r0 == 0) goto Lca
            long r3 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLJL
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r0.getAwemeRawAd()
        L5f:
            X.YGg r0 = r7.getStateContext()
            java.lang.String r2 = r0.LJIIL
            X.YGg r0 = r7.getStateContext()
            long r0 = r0.LJIIJ
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            X.C174716tP.LIZ(r6, r5, r2, r0)
        L73:
            X.YGg r0 = r7.getStateContext()
            java.lang.String r2 = r0.LJIIL
            int r1 = r2.hashCode()
            r0 = -1908689289(0xffffffff8e3bb677, float:-2.3137383E-30)
            if (r1 == r0) goto Lbf
            r0 = 70510628(0x433e824, float:2.1147943E-36)
            if (r1 == r0) goto Lb3
            r0 = 93494179(0x5929ba3, float:1.3786946E-35)
            if (r1 == r0) goto La7
        L8c:
            r4 = 0
        L8d:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.LJLJL
            if (r3 == 0) goto La
            X.NI3 r2 = r7.getAdDepend()
            if (r2 == 0) goto La
            android.content.Context r1 = r7.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.YGz r0 = X.C87117YGz.LIZ
            r2.LIZ(r1, r3, r4, r0)
            goto La
        La7:
            java.lang.String r0 = "badge"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lb0
            goto L8c
        Lb0:
            r4 = 66
            goto L8d
        Lb3:
            java.lang.String r0 = "popupbadgetext"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbc
            goto L8c
        Lbc:
            r4 = 67
            goto L8d
        Lbf:
            java.lang.String r0 = "popupbadge"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L8c
            r4 = 65
            goto L8d
        Lca:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLJL
            if (r0 == 0) goto Ldc
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r0.getAwemeRawAd()
        Ld2:
            X.YGg r0 = r7.getStateContext()
            java.lang.String r0 = r0.LJIIL
            X.C174716tP.LIZ(r1, r5, r0, r6)
            goto L73
        Ldc:
            r1 = r6
            goto Ld2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC87097YGf.LJIIIIZZ():void");
    }

    public final C87098YGg getStateContext() {
        C87098YGg c87098YGg = this.LJLJJL;
        if (c87098YGg != null) {
            return c87098YGg;
        }
        o.LJIJI("stateContext");
        throw null;
    }

    @Override // X.InterfaceC59688Nbg
    public final void start() {
        AwemePlayFunModel awemePlayFunModel = this.LJLJLJ;
        if (awemePlayFunModel != null) {
            String tips = awemePlayFunModel.getTips();
            if (tips != null) {
                TextView textView = this.LJLILLLLZI;
                if (textView != null) {
                    textView.setText(tips);
                } else {
                    o.LJIJI("eggTitleView");
                    throw null;
                }
            }
            UrlModel imageInfo = awemePlayFunModel.getImageInfo();
            if (imageInfo != null) {
                W5F LIZLLL = C40084FoG.LIZLLL(imageInfo, "AdPlayFunView");
                SmartImageView smartImageView = this.LJLIL;
                if (smartImageView != null) {
                    LIZLLL.LJJIIJ = smartImageView;
                    LIZLLL.LIZLLL(this.LJLLJ);
                } else {
                    o.LJIJI("eggImageView");
                    throw null;
                }
            }
        }
        setVisibility(0);
    }

    @Override // X.InterfaceC59688Nbg
    public final void LIZIZ() {
        C87098YGg stateContext = getStateContext();
        if (o.LJ(stateContext.LIZJ, "IdleState") || o.LJ(stateContext.LIZJ, "WidgetShowState") || o.LJ(stateContext.LIZJ, "FinishState")) {
            return;
        }
        AbstractC87105YGn abstractC87105YGn = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC87105YGn != null) {
            abstractC87105YGn.LJ();
        }
        stateContext.LIZJ = "WidgetShowState";
        PointF LIZ = stateContext.LIZ();
        stateContext.LJFF.setPivotX(stateContext.LIZIZ.LIZ / 2.0f);
        stateContext.LJFF.setPivotY(stateContext.LIZIZ.LIZ / 2.0f);
        stateContext.LJFF.setTranslationX(LIZ.x);
        stateContext.LJFF.setTranslationY(LIZ.y);
        stateContext.LJFF.setScaleX(stateContext.LIZIZ.LIZLLL);
        stateContext.LJFF.setScaleY(stateContext.LIZIZ.LIZLLL);
        stateContext.LJFF.setRotation(0.0f);
        stateContext.LJI.setAlpha(0.0f);
        stateContext.LJ.setAlpha(0.0f);
        AbstractC87105YGn abstractC87105YGn2 = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC87105YGn2 == null) {
            return;
        }
        abstractC87105YGn2.LIZIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = ((View) parent).findViewById(R.id.adq);
        this.LJLJLLL = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(this.LJLLILLLL);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getStateContext().LIZLLL();
        View view = this.LJLJLLL;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LJLLILLLL);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.tg);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.ad_play_fun_egg_image)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.th);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.ad_play_fun_egg_title)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.tf);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.ad_play_fun_background)");
        this.LJLJI = findViewById3;
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            smartImageView.setOnTouchListener(this);
            TextView textView = this.LJLILLLLZI;
            if (textView != null) {
                textView.setOnTouchListener(this);
                View view = this.LJLJI;
                if (view != null) {
                    view.setOnTouchListener(this);
                    setStateContext(new C87098YGg(this));
                    return;
                } else {
                    o.LJIJI("eggBackgroundView");
                    throw null;
                }
            }
            o.LJIJI("eggTitleView");
            throw null;
        }
        o.LJIJI("eggImageView");
        throw null;
    }

    @Override // X.InterfaceC59688Nbg
    public final void LIZLLL(NL9 nl9) {
        C87098YGg stateContext = getStateContext();
        stateContext.getClass();
        stateContext.LJIIJJI = nl9;
    }

    @Override // X.InterfaceC59688Nbg
    public final void LJ(Aweme aweme) {
        AwemePlayFunModel awemePlayFunModel;
        AwemeRawAd awemeRawAd;
        this.LJLJL = aweme;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            awemePlayFunModel = awemeRawAd.getPlayFunModel();
        } else {
            awemePlayFunModel = null;
        }
        this.LJLJLJ = awemePlayFunModel;
        getStateContext().LIZLLL = this.LJLJLJ;
    }

    @Override // X.InterfaceC59688Nbg
    public final void LJI(DataCenter dataCenter) {
        getStateContext().LJIIIIZZ = dataCenter;
    }

    public final void setPaused(boolean z) {
        this.LJLL = z;
    }

    public final void setStateContext(C87098YGg c87098YGg) {
        o.LJIIIZ(c87098YGg, "<set-?>");
        this.LJLJJL = c87098YGg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC87097YGf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJI = C221108m2.LIZIZ(N9B.LJLIL);
        this.LJLLI = new GestureDetector(context, new C87106YGo(this));
        this.LJLLILLLL = new IDCListenerS261S0100000_15(this, 0);
        this.LJLLJ = new C87099YGh(this);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        View view2 = this.LJLJI;
        if (view2 != null) {
            if (o.LJ(view, view2)) {
                C87098YGg stateContext = getStateContext();
                stateContext.getClass();
                stateContext.LJIIL = "popupmask";
            } else {
                SmartImageView smartImageView = this.LJLIL;
                if (smartImageView != null) {
                    if (o.LJ(view, smartImageView)) {
                        C87098YGg stateContext2 = getStateContext();
                        if (o.LJ(getStateContext().LIZJ, "EggShowState")) {
                            str = "popupbadge";
                        } else {
                            str = "badge";
                        }
                        stateContext2.getClass();
                        stateContext2.LJIIL = str;
                    } else {
                        TextView textView = this.LJLILLLLZI;
                        if (textView != null) {
                            if (o.LJ(view, textView)) {
                                C87098YGg stateContext3 = getStateContext();
                                stateContext3.getClass();
                                stateContext3.LJIIL = "popupbadgetext";
                            }
                        } else {
                            o.LJIJI("eggTitleView");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("eggImageView");
                    throw null;
                }
            }
            if (motionEvent == null) {
                return false;
            }
            return this.LJLLI.onTouchEvent(motionEvent);
        }
        o.LJIJI("eggBackgroundView");
        throw null;
    }
}
