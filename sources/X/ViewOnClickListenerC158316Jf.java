package X;

import Y.ALAdapterS1S0100000_2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import ujb.o;

/* renamed from: X.6Jf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC158316Jf extends FrameLayout implements View.OnClickListener, InterfaceC158446Js, C5HC {
    public static final /* synthetic */ int LLFFF = 0;
    public RelativeLayout LJLIL;
    public FrameLayout LJLILLLLZI;
    public C8H9 LJLJI;
    public C8H9 LJLJJI;
    public C8H9 LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final AqS152S0100000_2 LJLJLJ;
    public InterfaceC88471Ynr<? super C158326Jg, ? super Boolean, C76800UCe> LJLJLLL;
    public InterfaceC88472Yns<? super C158326Jg, C76800UCe> LJLL;
    public final C6JY LJLLI;
    public C6JY LJLLILLLL;
    public volatile int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final PointF LJLLLLLL;
    public C158326Jg LJLZ;
    public int LJZ;
    public Animator LJZI;
    public final C158416Jp LJZL;
    public C6JV LL;
    public int LLD;
    public C158296Jd LLF;
    public boolean LLFF;

    public final void LJFF() {
        float f;
        this.LJLJJLL = true;
        C158326Jg c158326Jg = this.LJLZ;
        if (c158326Jg != null) {
            ALAdapterS1S0100000_2 aLAdapterS1S0100000_2 = new ALAdapterS1S0100000_2(this, 7);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c158326Jg, "scaleX", this.LJLLI.LJLIL, this.LJLLILLLL.LJLIL);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c158326Jg, "scaleY", this.LJLLI.LJLILLLLZI, this.LJLLILLLL.LJLILLLLZI);
            float[] fArr = new float[2];
            float f2 = this.LJLLILLLL.LJLJI;
            if (f2 > 180.0f) {
                f = 360.0f;
            } else {
                f = this.LJLLI.LJLJI;
            }
            fArr[0] = f;
            fArr[1] = f2;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c158326Jg, "rotation", fArr);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c158326Jg, "x", this.LJLLI.LJLJJI, this.LJLLILLLL.LJLJJI);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c158326Jg, "y", this.LJLLI.LJLJJL, this.LJLLILLLL.LJLJJL);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.addListener(aLAdapterS1S0100000_2);
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
            animatorSet.start();
            this.LJZI = animatorSet;
            LJI();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public final void setMaxLine(int i) {
    }

    public final boolean LIZLLL() {
        String str;
        String titleText;
        long currentTimeMillis;
        int i;
        C6JV liveCDStickerController;
        C158326Jg mChild;
        C158326Jg c158326Jg;
        C158326Jg c158326Jg2 = this.LJLZ;
        String str2 = null;
        if (c158326Jg2 != null) {
            str = c158326Jg2.getTitleText();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) && (c158326Jg = this.LJLZ) != null && !c158326Jg.LJIIJ()) {
            LIZ(2);
            return false;
        }
        C158326Jg c158326Jg3 = this.LJLZ;
        if (c158326Jg3 == null || (titleText = c158326Jg3.getTitleText()) == null || o.LJJJJJL(titleText)) {
            LIZ(4);
            return false;
        }
        C158326Jg c158326Jg4 = this.LJLZ;
        if (c158326Jg4 != null && !c158326Jg4.LJIIJ()) {
            LIZ(3);
            return false;
        }
        if (this.LJLJL) {
            return false;
        }
        this.LJZL.LIZ.storeBoolean("has_live_cd_edit_hint_show", true);
        this.LJZ = 0;
        C158296Jd c158296Jd = this.LLF;
        if (c158296Jd != null) {
            ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = c158296Jd.LIZIZ;
            if (viewOnClickListenerC158316Jf != null && (mChild = viewOnClickListenerC158316Jf.getMChild()) != null) {
                currentTimeMillis = mChild.getSelectTimeMiles();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long currentTimeMillis2 = (currentTimeMillis - System.currentTimeMillis()) / 1000;
            if (currentTimeMillis2 < 0) {
                currentTimeMillis2 = -1;
            }
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("enter_method", "click_main_panel");
            c145995oB.LJI("shoot_way", c158296Jd.LIZ.mShootWay);
            c145995oB.LJI("creation_id", c158296Jd.LIZ.getCreationId());
            c145995oB.LJI("content_source", H8F.LJI(c158296Jd.LIZ));
            c145995oB.LJI("content_type", H8F.LJII(c158296Jd.LIZ));
            c145995oB.LJI("edit_type", "title");
            ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf2 = c158296Jd.LIZIZ;
            if (viewOnClickListenerC158316Jf2 != null && (liveCDStickerController = viewOnClickListenerC158316Jf2.getLiveCDStickerController()) != null) {
                str2 = liveCDStickerController.LLII;
            }
            c145995oB.LJI("prop_id", str2);
            ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf3 = c158296Jd.LIZIZ;
            if (viewOnClickListenerC158316Jf3 != null && viewOnClickListenerC158316Jf3.LLFF) {
                i = 1;
            } else {
                i = 0;
            }
            c145995oB.LIZ(i, "is_first_edit");
            c145995oB.LIZIZ(currentTimeMillis2, "countdown_time");
            FMX.LJIIL("livesdk_cd_sticker_edit_complete", c145995oB.LIZ);
        }
        LJ(false);
        return true;
    }

    public final void LJI() {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(getContext(), "input_method");
        Context context = getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
        Activity LIZ = C105574Cj.LIZ(context);
        if (LIZ != null && inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(LIZ.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC45540Hu4 LIZ = C163756bj.LIZ(this);
        if (LIZ != null) {
            LIZ.registerActivityOnKeyDownListener(this);
        }
    }

    public final InterfaceC88472Yns<C158326Jg, C76800UCe> getBeforeChangeListener() {
        return this.LJLL;
    }

    @Override // X.InterfaceC158446Js
    public int getHintState() {
        return this.LLD;
    }

    public final int getHintTextState() {
        return this.LLD;
    }

    public final C6JV getLiveCDStickerController() {
        return this.LL;
    }

    public final C158326Jg getMChild() {
        return this.LJLZ;
    }

    public final InterfaceC88471Ynr<C158326Jg, Boolean, C76800UCe> getOnCompleteListener() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC158446Js
    public final void LIZ(int i) {
        this.LLD = i;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return;
                            }
                            C8H9 c8h9 = this.LJLJI;
                            if (c8h9 != null) {
                                c8h9.setText(R.string.dx0);
                                return;
                            } else {
                                kotlin.jvm.internal.o.LJIJI("liveCDHint");
                                throw null;
                            }
                        }
                        C8H9 c8h92 = this.LJLJI;
                        if (c8h92 != null) {
                            c8h92.setText(R.string.dwz);
                            return;
                        } else {
                            kotlin.jvm.internal.o.LJIJI("liveCDHint");
                            throw null;
                        }
                    }
                    C8H9 c8h93 = this.LJLJI;
                    if (c8h93 != null) {
                        c8h93.setText(R.string.dx1);
                        return;
                    } else {
                        kotlin.jvm.internal.o.LJIJI("liveCDHint");
                        throw null;
                    }
                }
                if (this.LJZL.LIZ.getBoolean("has_live_cd_edit_hint_show", false)) {
                    C8H9 c8h94 = this.LJLJI;
                    if (c8h94 != null) {
                        c8h94.setText("");
                        return;
                    } else {
                        kotlin.jvm.internal.o.LJIJI("liveCDHint");
                        throw null;
                    }
                }
                C8H9 c8h95 = this.LJLJI;
                if (c8h95 != null) {
                    c8h95.setText(R.string.dxu);
                    return;
                } else {
                    kotlin.jvm.internal.o.LJIJI("liveCDHint");
                    throw null;
                }
            }
            if (this.LJZL.LIZ.getBoolean("has_live_cd_edit_hint_show", false)) {
                C8H9 c8h96 = this.LJLJI;
                if (c8h96 != null) {
                    c8h96.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.o.LJIJI("liveCDHint");
                    throw null;
                }
            }
            C8H9 c8h97 = this.LJLJI;
            if (c8h97 != null) {
                c8h97.setText(R.string.gi6);
                return;
            } else {
                kotlin.jvm.internal.o.LJIJI("liveCDHint");
                throw null;
            }
        }
        C8H9 c8h98 = this.LJLJI;
        if (c8h98 != null) {
            c8h98.setText("");
        } else {
            kotlin.jvm.internal.o.LJIJI("liveCDHint");
            throw null;
        }
    }

    @Override // X.InterfaceC158446Js
    public final boolean LIZIZ(MotionEvent ev) {
        C8H9 c8h9;
        kotlin.jvm.internal.o.LJIIIZ(ev, "ev");
        C158326Jg c158326Jg = this.LJLZ;
        if ((c158326Jg != null && c158326Jg.LJLLILLLL) || (c8h9 = this.LJLJJL) == null || !C78840Uwu.LJIIIZ((int) ev.getRawX(), (int) ev.getRawY(), c8h9)) {
            C8H9 c8h92 = this.LJLJJI;
            if (c8h92 != null && C78840Uwu.LJIIIZ((int) ev.getRawX(), (int) ev.getRawY(), c8h92)) {
                C8H9 c8h93 = this.LJLJJI;
                if (c8h93 == null) {
                    return true;
                }
                c8h93.performClick();
                return true;
            }
            RelativeLayout relativeLayout = this.LJLIL;
            if (relativeLayout != null) {
                if (C78840Uwu.LJIIIZ((int) ev.getRawX(), (int) ev.getRawY(), relativeLayout)) {
                    C8H9 c8h94 = this.LJLJJI;
                    if (c8h94 == null) {
                        return true;
                    }
                    c8h94.performClick();
                    return true;
                }
                return false;
            }
            kotlin.jvm.internal.o.LJIJI("container");
            throw null;
        }
        C8H9 c8h95 = this.LJLJJL;
        if (c8h95 == null) {
            return true;
        }
        c8h95.performClick();
        return true;
    }

    public final void LIZJ(C158326Jg c158326Jg) {
        C8H9 c8h9 = this.LJLJI;
        if (c8h9 != null) {
            ViewGroup.LayoutParams layoutParams = c8h9.getLayoutParams();
            kotlin.jvm.internal.o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int[] iArr = new int[2];
            c158326Jg.getLocationInWindow(iArr);
            float height = c158326Jg.getHeight() + iArr[1];
            RelativeLayout relativeLayout = this.LJLIL;
            if (relativeLayout != null) {
                marginLayoutParams.topMargin = (int) (C170576mj.LIZ(relativeLayout.getContext(), 8.0f) + height);
                marginLayoutParams.width = C60996Nwm.LJIIIIZZ(getContext());
                C8H9 c8h92 = this.LJLJI;
                if (c8h92 != null) {
                    c8h92.setLayoutParams(marginLayoutParams);
                    return;
                } else {
                    kotlin.jvm.internal.o.LJIJI("liveCDHint");
                    throw null;
                }
            }
            kotlin.jvm.internal.o.LJIJI("container");
            throw null;
        }
        kotlin.jvm.internal.o.LJIJI("liveCDHint");
        throw null;
    }

    public final void LJ(boolean z) {
        this.LJLLL = false;
        C158326Jg c158326Jg = this.LJLZ;
        if (c158326Jg != null) {
            c158326Jg.setTouchEnable(true);
        }
        C158326Jg c158326Jg2 = this.LJLZ;
        if (c158326Jg2 != null) {
            c158326Jg2.setState(0);
        }
        C8H9 c8h9 = this.LJLJI;
        if (c8h9 != null) {
            c8h9.setVisibility(8);
            this.LLFF = false;
            if (!this.LJLLLL) {
                C158326Jg c158326Jg3 = this.LJLZ;
                if (c158326Jg3 != null && c158326Jg3.LJLLILLLL) {
                    if (z && c158326Jg3 != null) {
                        C158396Jn c158396Jn = c158326Jg3.LJLJI;
                        if (c158396Jn != null) {
                            c158396Jn.setText(c158326Jg3.LJLLI.LIZ);
                            long j = c158326Jg3.LJLLI.LIZIZ;
                            c158326Jg3.LJLLL = j;
                            C158366Jk LJIL = C77123UOp.LJIL(j, System.currentTimeMillis());
                            c158326Jg3.LJII(LJIL.LIZ, LJIL.LIZIZ, LJIL.LIZJ, LJIL.LIZLLL, false);
                            InterfaceC158496Jx interfaceC158496Jx = c158326Jg3.LJZ;
                            if (interfaceC158496Jx != null) {
                                C158396Jn c158396Jn2 = c158326Jg3.LJLJI;
                                if (c158396Jn2 != null) {
                                    interfaceC158496Jx.LIZ(String.valueOf(c158396Jn2.getText()));
                                } else {
                                    kotlin.jvm.internal.o.LJIJI("edLiveTitle");
                                    throw null;
                                }
                            }
                        } else {
                            kotlin.jvm.internal.o.LJIJI("edLiveTitle");
                            throw null;
                        }
                    }
                    LJFF();
                } else if (z) {
                    C158296Jd c158296Jd = this.LLF;
                    if (c158296Jd != null) {
                        c158296Jd.LIZIZ(true);
                    }
                    LJII(z);
                    LJI();
                    setVisibility(4);
                } else {
                    LJFF();
                }
                this.LJLLLL = true;
            }
            InterfaceC45540Hu4 LIZ = C163756bj.LIZ(this);
            if (LIZ != null) {
                LIZ.unRegisterActivityOnKeyDownListener(this);
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.LJIJI("liveCDHint");
        throw null;
    }

    public final void LJII(boolean z) {
        C158326Jg c158326Jg = this.LJLZ;
        if (c158326Jg != null) {
            RelativeLayout relativeLayout = this.LJLIL;
            if (relativeLayout != null) {
                C16880lQ.LJLLLLLL(c158326Jg, relativeLayout);
                C8H9 c8h9 = this.LJLJI;
                if (c8h9 != null) {
                    c8h9.setVisibility(8);
                    c158326Jg.setEditEnable(false);
                    C158326Jg c158326Jg2 = this.LJLZ;
                    if (c158326Jg2 != null) {
                        c158326Jg2.setScaleX(1.0f);
                        c158326Jg2.setScaleY(1.0f);
                        c158326Jg2.setRotation(0.0f);
                        c158326Jg2.setTranslationX(0.0f);
                        c158326Jg2.setTranslationY(0.0f);
                        this.LJLLILLLL = new C6JY();
                    }
                    InterfaceC88471Ynr<? super C158326Jg, ? super Boolean, C76800UCe> interfaceC88471Ynr = this.LJLJLLL;
                    if (interfaceC88471Ynr != null) {
                        interfaceC88471Ynr.invoke(this.LJLZ, Boolean.valueOf(z));
                    }
                    this.LJLZ = null;
                    return;
                }
                kotlin.jvm.internal.o.LJIJI("liveCDHint");
                throw null;
            }
            kotlin.jvm.internal.o.LJIJI("container");
            throw null;
        }
    }

    public final void setBeforeChangeListener(InterfaceC88472Yns<? super C158326Jg, C76800UCe> interfaceC88472Yns) {
        this.LJLL = interfaceC88472Yns;
    }

    public final void setFirstEdit(boolean z) {
        this.LLFF = z;
    }

    public final void setHintTextState(int i) {
        this.LLD = i;
    }

    public final void setLiveCDStickerController(C6JV c6jv) {
        this.LL = c6jv;
    }

    public final void setMChild(C158326Jg c158326Jg) {
        this.LJLZ = c158326Jg;
    }

    public final void setOnCompleteListener(InterfaceC88471Ynr<? super C158326Jg, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        this.LJLJLLL = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC158316Jf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJLJ = new AqS152S0100000_2(this, 985);
        this.LJLLI = new C6JY();
        this.LJLLILLLL = new C6JY();
        this.LJLLLLLL = new PointF(0.0f, 0.0f);
        this.LJZ = 0;
        this.LJZL = new C158416Jp();
        this.LLFF = true;
        Context context2 = getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(context2, "this.context");
        setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ee, context2));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bkn, this, false);
        kotlin.jvm.internal.o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) LLLLIILL;
        this.LJLIL = relativeLayout;
        addView(relativeLayout);
        RelativeLayout relativeLayout2 = this.LJLIL;
        if (relativeLayout2 != null) {
            View findViewById = relativeLayout2.findViewById(R.id.fvh);
            kotlin.jvm.internal.o.LJIIIIZZ(findViewById, "container.findViewById(R.id.live_cd_sticker_hint)");
            this.LJLJI = (C8H9) findViewById;
            RelativeLayout relativeLayout3 = this.LJLIL;
            if (relativeLayout3 != null) {
                this.LJLJJI = (C8H9) relativeLayout3.findViewById(R.id.m_j);
                RelativeLayout relativeLayout4 = this.LJLIL;
                if (relativeLayout4 != null) {
                    this.LJLJJL = (C8H9) relativeLayout4.findViewById(R.id.m_i);
                    setOnClickListener(new ViewOnClickListenerC13880ga(this));
                    RelativeLayout relativeLayout5 = this.LJLIL;
                    if (relativeLayout5 != null) {
                        C16880lQ.LJIJ(relativeLayout5, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 53));
                        C8H9 c8h9 = this.LJLJJI;
                        if (c8h9 != null) {
                            c8h9.setOnClickListener(new ViewOnClickListenerC13880ga(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 54)));
                        }
                        C8H9 c8h92 = this.LJLJJL;
                        if (c8h92 != null) {
                            c8h92.setOnClickListener(new ViewOnClickListenerC13880ga(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 55)));
                        }
                        setVisibility(4);
                        return;
                    }
                    kotlin.jvm.internal.o.LJIJI("container");
                    throw null;
                }
                kotlin.jvm.internal.o.LJIJI("container");
                throw null;
            }
            kotlin.jvm.internal.o.LJIJI("container");
            throw null;
        }
        kotlin.jvm.internal.o.LJIJI("container");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C158326Jg r10, X.C6JY r11) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC158316Jf.LJIIIIZZ(X.6Jg, X.6JY):void");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback, X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C158326Jg c158326Jg;
        if (i == 4 && (c158326Jg = this.LJLZ) != null && c158326Jg.getVisibility() == 0) {
            C158326Jg c158326Jg2 = this.LJLZ;
            if (c158326Jg2 != null) {
                c158326Jg2.LJI();
            }
            C158326Jg c158326Jg3 = this.LJLZ;
            if (c158326Jg3 != null && c158326Jg3.LJLLILLLL) {
                C8H9 c8h9 = this.LJLJJI;
                if (c8h9 != null) {
                    c8h9.performClick();
                }
            } else {
                C8H9 c8h92 = this.LJLJJL;
                if (c8h92 != null) {
                    c8h92.performClick();
                }
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
