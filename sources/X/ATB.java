package X;

import Y.ACListenerS24S0100000_4;
import Y.IDDListenerS144S0100000_4;
import Y.IDObjectS0S0101000;
import Y.IDTListenerS114S0100000_4;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.utils.Edge2EdgeConfig;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class ATB extends OOS implements AS3 {
    public static final /* synthetic */ int LLFII = 0;
    public final ATE LJLJLLL;
    public final InterfaceC26269ASr LJLL;
    public final float LJLLI;
    public View LJLLILLLL;
    public LinearLayout LJLLJ;
    public LinearLayout LJLLL;
    public ViewGroup LJLLLL;
    public C45631qh LJLLLLLL;
    public LinearLayout LJLZ;
    public ViewGroup LJZ;
    public final String LJZI;
    public BottomSheetBehavior<View> LJZL;
    public final ATF LL;
    public boolean LLD;
    public final boolean LLF;
    public ATN LLFF;
    public DialogInterface.OnDismissListener LLFFF;

    @Override // X.AS3
    public final Dialog getDialog() {
        return this;
    }

    public final boolean LJJ() {
        Activity LJIILLIIL;
        if (!(this.LJLL instanceof C26270ASs) || (LJIILLIIL = C78555UsJ.LJIILLIIL(getContext())) == null) {
            return false;
        }
        int requestedOrientation = LJIILLIIL.getRequestedOrientation();
        if (requestedOrientation != 0 && requestedOrientation != 8 && requestedOrientation != 6 && requestedOrientation != 11) {
            return false;
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        C26245ARt LIZ;
        ViewGroup viewGroup = this.LJLLLL;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            View view = this.LJLLILLLL;
            if (view != null && (LIZ = this.LJLL.LIZ(this)) != null) {
                LIZ.LIZ(view);
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void show() {
        Object obj;
        if (((Number) C52627Kl5.LIZ.getValue()).intValue() != 1 && this.LJLJLLL.LJFF) {
            Activity LIZ = C27740Aue.LIZ(getContext());
            if (LIZ != null) {
                obj = C16880lQ.LLILIL(LIZ, "vibrator");
            } else {
                obj = null;
            }
            o.LJII(obj, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) obj).vibrate(15L);
        }
        if (new C03880Dg(2).LIZJ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "8482180031577814613")).LIZ) {
            return;
        }
        super.show();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIILLIIL(false);
        }
    }

    @Override // X.OOS, android.app.Dialog
    public final void onStart() {
        Window window;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int i;
        super.onStart();
        int LJJIIZ = O6R.LJJIIZ(KL2.LJIIIZ(getContext()) * this.LJLLI);
        C34K c34k = new C34K();
        View findViewById = findViewById(R.id.c8m);
        if (findViewById != null) {
            findViewById.setBackground(null);
        }
        if (!LJJ()) {
            if (this.LJLJLLL.LIZ && !this.LLF) {
                if (findViewById != null && (layoutParams2 = findViewById.getLayoutParams()) != null) {
                    synchronized (ATO.class) {
                        i = ATO.LIZ;
                    }
                    layoutParams2.height = i + LJJIIZ;
                }
            } else if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
                layoutParams.height = -2;
            }
        }
        if (!(this.LJLL instanceof C26270ASs) && (window = getWindow()) != null) {
            window.setDimAmount(0.0f);
        }
        super.setOnDismissListener(new IDDListenerS144S0100000_4(this, 7));
        setOnShowListener(new ATK(this, findViewById, c34k, LJJIIZ));
    }

    @Override // X.AS3
    public final ViewGroup LJII() {
        return this.LJLLLL;
    }

    @Override // X.AS3
    public final ViewGroup LJIIIZ() {
        return this.LJLZ;
    }

    @Override // X.AS3
    public final String LJIIJJI() {
        return this.LJZI;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    @Override // X.AS3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(boolean r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATB.LJI(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [X.4R9] */
    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Aweme aweme;
        String str;
        boolean z;
        boolean z2;
        int i;
        C45631qh c45631qh;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        String colorForBrightPage;
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        } catch (Exception e) {
            C36922EeM.LJ(e.getMessage());
        }
        super.onCreate(bundle);
        setContentView(R.layout.aco);
        if (ATO.LIZIZ()) {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setDecorFitsSystemWindows(false);
            }
            Window window3 = getWindow();
            if (window3 != null) {
                Edge2EdgeConfig edge2EdgeConfig = (Edge2EdgeConfig) ATR.LIZIZ.getValue();
                if (edge2EdgeConfig == null || (colorForBrightPage = edge2EdgeConfig.getColorForBrightPage()) == null || colorForBrightPage.length() <= 0) {
                    colorForBrightPage = ATR.LIZ.getColorForBrightPage();
                }
                window3.setNavigationBarColor(ColorProtector.parseColor(colorForBrightPage));
            }
            View findViewById = findViewById(R.id.bs8);
            if (findViewById != null) {
                findViewById.setFitsSystemWindows(false);
            }
            View findViewById2 = findViewById(R.id.bv5);
            if (findViewById2 != null) {
                findViewById2.setFitsSystemWindows(false);
            }
        } else {
            Window window4 = getWindow();
            if (window4 != null) {
                LTT.LJFF(window4, -1, true);
            }
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setStatusBarColor(0);
        }
        this.LJLLILLLL = findViewById(R.id.hht);
        this.LJLLJ = (LinearLayout) findViewById(R.id.cbr);
        this.LJLLL = (LinearLayout) findViewById(R.id.jt9);
        this.LJLLLL = (ViewGroup) findViewById(R.id.cbr);
        this.LJLLLLLL = (C45631qh) findViewById(R.id.jcd);
        this.LJLZ = (LinearLayout) findViewById(R.id.jtp);
        this.LJZ = (ViewGroup) findViewById(R.id.joi);
        InterfaceC26269ASr interfaceC26269ASr = this.LJLL;
        if (interfaceC26269ASr instanceof C26270ASs) {
            LJI(false);
        } else {
            List<AbstractC26277ASz> LIZJ = interfaceC26269ASr.LIZJ(this);
            LinearLayout linearLayout = this.LJLLL;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            if (LIZJ.isEmpty()) {
                findViewById(R.id.as3).setVisibility(8);
            }
            int size = LIZJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC26277ASz abstractC26277ASz = (AbstractC26277ASz) ListProtector.get(LIZJ, i2);
                if (i2 == LIZJ.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (abstractC26277ASz instanceof AT5) {
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    AT3 at3 = new AT3(context);
                    at3.LIZIZ((C26276ASy) abstractC26277ASz, z);
                    ImageView imageView = at3.LJLIL.LJLJI;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    LinearLayout linearLayout2 = this.LJLLL;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(at3);
                    }
                } else if (abstractC26277ASz instanceof C26276ASy) {
                    Context context2 = getContext();
                    o.LJIIIIZZ(context2, "context");
                    AT3 at32 = new AT3(context2);
                    at32.LIZIZ((C26276ASy) abstractC26277ASz, z);
                    LinearLayout linearLayout3 = this.LJLLL;
                    if (linearLayout3 != null) {
                        linearLayout3.addView(at32);
                    }
                } else if (abstractC26277ASz instanceof ATJ) {
                    Context context3 = getContext();
                    o.LJIIIIZZ(context3, "context");
                    AT6 at6 = new AT6(context3);
                    ATJ item = (ATJ) abstractC26277ASz;
                    o.LJIIIZ(item, "item");
                    at6.setEnabled(item.LIZJ);
                    at6.setClickable(item.LIZJ);
                    at6.LJLILLLLZI = item.LIZIZ;
                    C2312995x c2312995x = at6.LJLIL;
                    ATI vo = item.LIZ;
                    c2312995x.getClass();
                    o.LJIIIZ(vo, "vo");
                    TuxIconView tuxIconView = c2312995x.LJLILLLLZI;
                    if (tuxIconView != null) {
                        tuxIconView.setTuxIcon(vo.LJLIL);
                    }
                    TuxTextView tuxTextView = c2312995x.LJLIL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(c2312995x.getContext().getResources().getText(vo.LJLILLLLZI));
                    }
                    if (vo.LJLJI) {
                        TuxIconView tuxIconView2 = c2312995x.LJLILLLLZI;
                        if (tuxIconView2 != null) {
                            tuxIconView2.setTintColorRes(R.attr.go);
                        }
                        TuxTextView tuxTextView2 = c2312995x.LJLIL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setTextColorRes(R.attr.go);
                        }
                    } else {
                        TuxIconView tuxIconView3 = c2312995x.LJLILLLLZI;
                        if (tuxIconView3 != null) {
                            tuxIconView3.setTintColorRes(R.attr.gp);
                        }
                        TuxTextView tuxTextView3 = c2312995x.LJLIL;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setTextColorRes(R.attr.gp);
                        }
                    }
                    if (z) {
                        at6.LIZ().setVisibility(4);
                    } else {
                        at6.LIZ().setVisibility(0);
                    }
                    LinearLayout linearLayout4 = this.LJLLL;
                    if (linearLayout4 != null) {
                        linearLayout4.addView(at6);
                    }
                } else if (abstractC26277ASz instanceof C26275ASx) {
                    AT2 at2 = new AT2(getContext());
                    at2.LIZIZ((C26275ASx) abstractC26277ASz, z);
                    LinearLayout linearLayout5 = this.LJLLL;
                    if (linearLayout5 != null) {
                        linearLayout5.addView(at2);
                    }
                } else if (abstractC26277ASz instanceof ATM) {
                    ATD atd = new ATD(getContext());
                    ATM item2 = (ATM) abstractC26277ASz;
                    o.LJIIIZ(item2, "item");
                    atd.LJLJI = item2.LIZIZ;
                    atd.LJLJJLL.setIconRes(item2.LIZ.LJLIL);
                    atd.LJLJJLL.setTintColorRes(R.attr.go);
                    atd.LJLJJL.setText(atd.getContext().getResources().getText(item2.LIZ.LJLILLLLZI));
                    ASB asb = atd.LJLJI;
                    if (asb != null) {
                        float LIZIZ = IFH.LIZIZ(asb.LJLILLLLZI);
                        if (((Number) IFJ.LIZ.getValue()).intValue() == 2) {
                            Iterator<View> it = C78924UyG.LIZLLL(atd.LJLIL).iterator();
                            while (true) {
                                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                                if (!iDObjectS0S0101000.hasNext()) {
                                    break;
                                }
                                TuxTextView tuxTextView4 = (TuxTextView) ((View) iDObjectS0S0101000.next());
                                CharSequence text = tuxTextView4.getText();
                                o.LJIIIIZZ(text, "child.text");
                                if (CastFloatProtector.parseFloat(text.subSequence(0, tuxTextView4.getText().length() - 1).toString()) == LIZIZ) {
                                    tuxTextView4.setTextColor(atd.getContext().getResources().getColor(R.color.ck));
                                    atd.LJLILLLLZI = tuxTextView4;
                                }
                            }
                            atd.LJLIL.setOnTouchListener(new IDTListenerS114S0100000_4(atd, 13));
                            atd.LJLJJI.setVisibility(8);
                        } else {
                            atd.LJLIL.setVisibility(8);
                            ASB asb2 = atd.LJLJI;
                            if (asb2 != null) {
                                float LIZIZ2 = IFH.LIZIZ(asb2.LJLILLLLZI);
                                if (LIZIZ2 != 1.0f) {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append(LIZIZ2);
                                    LIZ.append('x');
                                    atd.LJLJJI.setText(X1D.LIZIZ(LIZ));
                                    atd.LJLJJI.setVisibility(0);
                                }
                                atd.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(atd, 248)));
                            } else {
                                o.LJIJI("optionAction");
                                throw null;
                            }
                        }
                        if (z) {
                            atd.LIZ().setVisibility(4);
                        } else {
                            atd.LIZ().setVisibility(0);
                        }
                        LinearLayout linearLayout6 = this.LJLLL;
                        if (linearLayout6 != null) {
                            linearLayout6.addView(atd);
                        }
                    } else {
                        o.LJIJI("optionAction");
                        throw null;
                    }
                } else {
                    continue;
                }
            }
            String str2 = null;
            SharePackage LJ = this.LJLL.LJ();
            String string = LJ.extras.getString("enter_from");
            String string2 = LJ.extras.getString("enter_method");
            if (string2 == null) {
                string2 = "long_press";
            }
            String string3 = LJ.extras.getString("aid");
            ArrayList arrayList = new ArrayList();
            for (AbstractC26277ASz abstractC26277ASz2 : LIZJ) {
                if (abstractC26277ASz2 instanceof AT5) {
                    str = ((C26276ASy) abstractC26277ASz2).LIZ.LJLJI;
                } else if (abstractC26277ASz2 instanceof C26276ASy) {
                    str = ((C26276ASy) abstractC26277ASz2).LIZ.LJLJI;
                } else if (abstractC26277ASz2 instanceof ATJ) {
                    str = ((ATJ) abstractC26277ASz2).LIZ.LJLJJI;
                } else if (abstractC26277ASz2 instanceof C26275ASx) {
                    str = ((C26275ASx) abstractC26277ASz2).LIZ.LJLJI;
                } else if (abstractC26277ASz2 instanceof ATM) {
                    str = ((ATM) abstractC26277ASz2).LIZ.LJLJI;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            String LLD = ORZ.LLD(arrayList, null, null, null, null, 63);
            FMX.LJIIL("show_panel_function", C113554cx.LJJL(new OSZ("enter_from", string), new OSZ("panel_source", string2), new OSZ("group_id", string3), new OSZ("function_show", C78920UyC.LIZ('[', LLD, ']'))));
            boolean LJJJLZIJ = s.LJJJLZIJ(LLD, "favorite", false);
            InterfaceC26269ASr interfaceC26269ASr2 = this.LJLL;
            if (interfaceC26269ASr2 instanceof C62435Oet) {
                aweme = ((C62435Oet) interfaceC26269ASr2).LJLIL;
            } else {
                aweme = null;
            }
            if (aweme != null) {
                str2 = aweme.getAid();
            }
            C2U8.LIZ(new C203877zL(str2, LJJJLZIJ));
            LinearLayout linearLayout7 = this.LJLLL;
            if (linearLayout7 != null) {
                linearLayout7.requestLayout();
            }
        }
        C45631qh c45631qh2 = this.LJLLLLLL;
        if (c45631qh2 != null) {
            c45631qh2.setOnScrollChangeListener(this.LL);
        }
        if (this.LJLJLLL.LIZ && !this.LLF) {
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "context");
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context4);
            if (LJJLIIIJ != null) {
                FrameLayout frameLayout = (FrameLayout) findViewById(R.id.l8r);
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.isd);
                LinearLayout linearLayout8 = (LinearLayout) findViewById(R.id.jts);
                SharePackage LJ2 = this.LJLL.LJ();
                TextView textView = (TextView) findViewById(R.id.jtn);
                ATE ate = this.LJLJLLL;
                i = 0;
                final C108654Of c108654Of = new C108654Of(LJJLIIIJ, this, LJ2, frameLayout, recyclerView, linearLayout8, textView, ate.LIZIZ, ate.LJ, this.LL);
                this.LLFF = IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIL(c108654Of, new C4OT(c108654Of) { // from class: X.4R9
                    public final C108654Of LIZ;

                    @Override // X.C4OT
                    public final void LIZ(SharePackage sharePackage) {
                        o.LJIIIZ(sharePackage, "sharePackage");
                    }

                    @Override // X.C4OT
                    public final void LJIIIZ() {
                    }

                    {
                        this.LIZ = c108654Of;
                    }

                    @Override // X.C4OT
                    public final void LIZIZ(SharePackage sharePackage) {
                        o.LJIIIZ(sharePackage, "sharePackage");
                        C4RB c4rb = this.LIZ.LJIIIIZZ;
                        if (c4rb != null) {
                            c4rb.LIZJ(sharePackage);
                        }
                    }

                    @Override // X.C4OT
                    public final void LIZJ(SharePackage sharePackage) {
                        o.LJIIIZ(sharePackage, "sharePackage");
                    }

                    @Override // X.C4OT
                    public final void LJII(SharePackage sharePackage) {
                        o.LJIIIZ(sharePackage, "sharePackage");
                    }

                    @Override // X.C4OT
                    public final void LJIIIIZZ(SharePackage sharePackage) {
                        o.LJIIIZ(sharePackage, "sharePackage");
                        Bundle bundle2 = sharePackage.extras;
                        if (o.LJ(bundle2.getString("is_star"), "1")) {
                            C81533Hx.LIZ(3, bundle2.getString("author_id", ""), bundle2.getString("sec_author_id", ""), null);
                        }
                        C4RB c4rb = this.LIZ.LJIIIIZZ;
                        if (c4rb != null) {
                            c4rb.LJ(sharePackage);
                        }
                    }

                    @Override // X.C4OT
                    public final boolean LJIIJ(SharePackage sharePackage) {
                        o.LJIIIZ(sharePackage, "sharePackage");
                        String str3 = "";
                        String string4 = sharePackage.extras.getString("aid", "");
                        if (string4 != null) {
                            str3 = string4;
                        }
                        Aweme o6 = AwemeService.LIZ().o6(str3);
                        if (o6 == null || !C63081OpJ.LJJLIIIJLJLI(o6)) {
                            return true;
                        }
                        C5S1 c5s1 = new C5S1(this.LIZ.LIZ);
                        c5s1.LIZJ(R.string.b96);
                        c5s1.LJ();
                        return false;
                    }

                    @Override // X.C4OT
                    public final void LIZLLL(Dialog dialog, SharePackage sharePackage) {
                        o.LJIIIZ(dialog, "dialog");
                        o.LJIIIZ(sharePackage, "sharePackage");
                        C4RB c4rb = this.LIZ.LJIIIIZZ;
                        if (c4rb != null) {
                            c4rb.LJFF(dialog, sharePackage);
                        }
                    }

                    @Override // X.C4OT
                    public final void LJ(Dialog dialog, SharePackage sharePackage) {
                        o.LJIIIZ(dialog, "dialog");
                        o.LJIIIZ(sharePackage, "sharePackage");
                        C4RB c4rb = this.LIZ.LJIIIIZZ;
                        if (c4rb != null) {
                            c4rb.LJI(dialog, sharePackage);
                        }
                    }

                    @Override // X.C4OT
                    public final void LJI(SharePackage sharePackage, String str3) {
                        o.LJIIIZ(sharePackage, "sharePackage");
                    }
                });
            } else {
                i = 0;
            }
            z2 = true;
        } else {
            findViewById(R.id.jtn).setVisibility(8);
            findViewById(R.id.isd).setVisibility(8);
            findViewById(R.id.as3).setVisibility(8);
            LinearLayout linearLayout9 = this.LJLZ;
            if (linearLayout9 != null) {
                ViewGroup.LayoutParams layoutParams3 = linearLayout9.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = -2;
                } else {
                    layoutParams3 = null;
                }
                linearLayout9.setLayoutParams(layoutParams3);
            }
            LinearLayout linearLayout10 = this.LJLLJ;
            if (linearLayout10 != null) {
                ViewGroup.LayoutParams layoutParams4 = linearLayout10.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = -2;
                } else {
                    layoutParams4 = null;
                }
                linearLayout10.setLayoutParams(layoutParams4);
            }
            C45631qh c45631qh3 = this.LJLLLLLL;
            if (c45631qh3 != null) {
                ViewGroup.LayoutParams layoutParams5 = c45631qh3.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = -2;
                } else {
                    layoutParams5 = null;
                }
                c45631qh3.setLayoutParams(layoutParams5);
            }
            View view = this.LJLLILLLL;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                if (layoutParams6 != null) {
                    layoutParams6.height = -2;
                } else {
                    layoutParams6 = null;
                }
                view.setLayoutParams(layoutParams6);
            }
            if (ATO.LIZIZ() && (c45631qh = this.LJLLLLLL) != null) {
                c45631qh.setClipToPadding(false);
                c45631qh.setOnApplyWindowInsetsListener(ViewOnApplyWindowInsetsListenerC51182K6w.LIZ);
            }
            View view2 = this.LJLLILLLL;
            if (view2 != null) {
                view2.setPadding(0, C7MY.LIZIZ(8), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            }
            z2 = true;
            i = 0;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, "long_press_menu");
        FMX.LJIIL("verify_precise_exp", c188727au.LIZ);
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIILLIIL(z2);
        }
        if (LJJ()) {
            FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.bs8);
            View findViewById3 = findViewById(R.id.c8m);
            View view3 = this.LJLLILLLL;
            if (view3 != null) {
                C26338AVi.LJIIIZ(view3, Integer.valueOf(i), Integer.valueOf((int) KL2.LIZJ(getContext(), 12.0f)), Integer.valueOf(i), Integer.valueOf((int) KL2.LIZJ(getContext(), 12.0f)), 16);
            }
            Context context5 = getContext();
            o.LJIIIIZZ(context5, "context");
            int LJJJJLI = C63081OpJ.LJJJJLI(context5);
            if (findViewById3 != null) {
                ViewGroup.LayoutParams layoutParams7 = findViewById3.getLayoutParams();
                if (layoutParams7 != null) {
                    layoutParams7.width = -2;
                }
                if (findViewById3 != null) {
                    ViewGroup.LayoutParams layoutParams8 = findViewById3.getLayoutParams();
                    if (layoutParams8 != null) {
                        layoutParams8.height = -1;
                    }
                    if (findViewById3 != null) {
                        C26338AVi.LJIIIZ(findViewById3, Integer.valueOf(i), Integer.valueOf(((int) KL2.LIZJ(getContext(), 8.0f)) + LJJJJLI), Integer.valueOf(i), Integer.valueOf((int) KL2.LIZJ(getContext(), 8.0f)), 16);
                    }
                }
            }
            View view4 = this.LJLLILLLL;
            if (view4 != null) {
                layoutParams = view4.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                View view5 = this.LJLLILLLL;
                if (view5 != null) {
                    layoutParams2 = view5.getLayoutParams();
                } else {
                    layoutParams2 = null;
                }
                o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams9.gravity = 17;
                Context context6 = getContext();
                o.LJIIIIZZ(context6, "context");
                int LJJJJL = C63081OpJ.LJJJJL(context6);
                Context context7 = getContext();
                o.LJIIIIZZ(context7, "context");
                int LJJJJJL = C63081OpJ.LJJJJJL(context7);
                if (LJJJJL > LJJJJJL) {
                    LJJJJL = LJJJJJL;
                }
                layoutParams9.width = LJJJJL;
                Drawable drawable = getContext().getDrawable(R.drawable.bpi);
                View view6 = this.LJLLILLLL;
                if (view6 != null) {
                    view6.setBackground(drawable);
                }
            }
            C117524jM.LIZIZ(this, frameLayout2);
        }
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.LLFFF = onDismissListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ATB(Context context, ATE ate, InterfaceC26269ASr interfaceC26269ASr, float f) {
        super(context, R.style.a6_);
        o.LJIIIZ(context, "context");
        this.LJLJLLL = ate;
        this.LJLL = interfaceC26269ASr;
        this.LJLLI = f;
        this.LJZI = "";
        this.LL = new ATF(this, context);
        this.LLF = C78966Uyw.LJJIJ().LIZIZ();
    }
}
