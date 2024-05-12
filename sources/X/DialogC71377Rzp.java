package X;

import Y.ACListenerS30S1200000_12;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS48S0100000_12;
import Y.IDCListenerS258S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.anchor.service.AnchorDialogPanelService;
import com.ss.android.ugc.aweme.anchor.service.AnchorStateServiceImpl;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rzp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogC71377Rzp extends OOS implements InterfaceC71392S0e {
    public final Context LJLJLLL;
    public C7F9 LJLL;
    public boolean LJLLI;
    public final boolean LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public S0S LJLZ;
    public String LJZ;
    public ConstraintLayout LJZI;
    public TuxIconView LJZL;
    public AVS LL;
    public TuxIconView LLD;
    public TuxTextView LLF;
    public ConstraintLayout LLFF;
    public InterfaceC70514Rlu LLFFF;

    @Override // X.InterfaceC71392S0e
    public final void LJIILLIIL() {
    }

    public final void LJJIFFI() {
        String str;
        String str2;
        for (S1E s1e : this.LJLL.LIZJ()) {
            if (s1e instanceof S0Q) {
                S0Q s0q = (S0Q) s1e;
                if (s0q.LJLJLJ.LJIILIIL() == L7W.REGION_UNAVAILABLE) {
                    String string = C16880lQ.LLLLL(getContext()).getString(R.string.pc9);
                    o.LJIIIIZZ(string, "context.applicationConte…g.products_not_available)");
                    LJJIIJ(string);
                    ShopWindowExtraModel LJIIIIZZ = s0q.LJLJLJ.LJIIIIZZ();
                    if (LJIIIIZZ != null && (str = LJIIIIZZ.unavailableText) != null && (LJIIIIZZ == null || (str2 = LJIIIIZZ.unavailableText) == null || str2.length() != 0)) {
                        string = str;
                    }
                    LJJIIJ(string);
                    LJJ("tiktokec_module_show");
                    View tv_unavailable_shop = findViewById(R.id.mpp);
                    o.LJIIIIZZ(tv_unavailable_shop, "tv_unavailable_shop");
                    C16880lQ.LJIIJ(new Au2S19S0200000_12(LJIIIIZZ, this, 32, 42), tv_unavailable_shop);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC71377Rzp.LJJII():void");
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.LJLLILLLL) {
            if (!this.LJLLLLLL) {
                hide();
            } else {
                this.LJLLL = false;
                this.LJLLLLLL = false;
                super.dismiss();
                S1B.LJLILLLLZI = null;
                S1C.LJLIL = null;
            }
        } else {
            super.dismiss();
        }
        AnchorDialogPanelService LJIIIZ = AnchorStateServiceImpl.LJIIIZ();
        if (LJIIIZ != null) {
            LJIIIZ.LIZJ(false);
        }
        for (S1E s1e : this.LJLL.LIZJ()) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                s1e.LJIJ(LJIJJ, this);
            }
        }
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIIJJI(false);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "5131529104809105879")).LIZ) {
            super.show();
        }
        AnchorDialogPanelService LJIIIZ = AnchorStateServiceImpl.LJIIIZ();
        if (LJIIIZ != null) {
            LJIIIZ.LIZJ(true);
        }
    }

    public final void LJJIII() {
        C45631qh c45631qh = (C45631qh) findViewById(R.id.a3w);
        if (c45631qh != null) {
            c45631qh.LJIILLIIL(-c45631qh.getScrollX(), -c45631qh.getScrollY(), false);
        }
        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/multi/ui/AnchorSelectDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "5131529104809105879")).LIZ) {
            show();
        }
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIIJJI(true);
        }
    }

    @Override // X.InterfaceC71392S0e
    public final ViewGroup getContainerView() {
        return (ViewGroup) findViewById(R.id.a40);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (S1E s1e : this.LJLL.LIZJ()) {
            if (s1e instanceof HSS) {
                ((HSS) s1e).LJLJL = SystemClock.elapsedRealtime();
            }
        }
        S0S s0s = new S0S(this.LJLL, this);
        this.LJLZ = s0s;
        ActivityC86117Xqz.Companion.getClass();
        C71426S1m.LIZ(s0s);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        S0S s0s = this.LJLZ;
        if (s0s != null) {
            ActivityC86117Xqz.Companion.getClass();
            C71426S1m.LIZIZ(s0s);
            this.LJLZ = null;
        }
    }

    @Override // X.InterfaceC71392S0e
    public final TuxIconView LIZLLL() {
        return this.LJZL;
    }

    @Override // X.InterfaceC71392S0e
    public final void LJIIIIZZ(int i) {
        try {
            AVS avs = this.LL;
            if (avs != null) {
                int i2 = 0;
                if (i <= 0) {
                    i2 = 8;
                }
                avs.setVisibility(i2);
            }
            AVS avs2 = this.LL;
            if (avs2 != null) {
                avs2.setCount(i);
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC71392S0e
    public final void LJIIJ(int i) {
        C45631qh c45631qh = (C45631qh) findViewById(R.id.a3w);
        if (c45631qh != null) {
            c45631qh.LJIILIIL(0, i);
        }
    }

    @Override // X.InterfaceC71392S0e
    public final void LJIILL(AqS178S0100000_12 aqS178S0100000_12) {
        ((C45631qh) findViewById(R.id.a3w)).setOnScrollChangeListener(new S0Z(aqS178S0100000_12));
    }

    public final void LJJ(String str) {
        int i;
        String str2;
        int i2 = 0;
        String LJI = ECommerceAnchorService.LJJJJI().LJI(this.LJLL.LIZ, this.LJLLI);
        if (LJI == null) {
            LJI = "video_multi_anchor";
        }
        ICommerceService LIZ = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        c71367Rzf.LJIJJ = "TEMAI";
        c71367Rzf.LIZJ = this.LJLL.LIZ.getAid();
        c71367Rzf.LJJIIZ = "video_shopping_list";
        c71367Rzf.LJJIIZI = "video_multi_anchor";
        c71367Rzf.LIZLLL = this.LJLL.LIZ.getAuthorUid();
        C7F9 c7f9 = this.LJLL;
        c71367Rzf.LIZIZ = c7f9.LIZJ;
        if (C025908h.LJFF(false, c7f9.LIZ.getAuthorUid())) {
            i = 1;
        } else {
            i = 0;
        }
        c71367Rzf.LJIJ = i;
        if (this.LJLL.LIZ.isAd()) {
            i2 = 1;
        }
        c71367Rzf.LJIL = i2;
        if (this.LJLL.LIZ.isAd()) {
            str2 = this.LJLL.LIZ.getAwemeRawAdIdStr();
        } else {
            str2 = null;
        }
        c71367Rzf.LJJ = str2;
        c71367Rzf.LJJIFFI = LJI;
        c71367Rzf.LJJIII = S0V.LIZ(this.LJLL.LIZ);
        c71367Rzf.LJJII = "video";
        c71367Rzf.LJJJIL = "product_not_available";
        LIZ.logCommerceEvents(str, c71367Rzf);
    }

    public final void LJJI(int i) {
        this.LJZ = getContext().getString(i);
    }

    public final void LJJIIJ(String str) {
        findViewById(R.id.mpp).setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_info_circle;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(11));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(11));
        Bitmap LJIIIZ = SFS.LJIIIZ(c2068389v.LIZ(this.LJLJLLL));
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C8FX(LJIIIZ, C17N.LJIILL(6.0d)), 0, 0, 18);
        spannableStringBuilder.append((CharSequence) spannableString);
        ((TextView) findViewById(R.id.mpp)).setText(spannableStringBuilder);
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        TuxTextView tuxTextView;
        this.LJLLL = true;
        super.onCreate(bundle);
        int LJIIIZ = KL2.LJIIIZ(this.LJLJLLL) - C63081OpJ.LJJJJLI(this.LJLJLLL);
        Window window = getWindow();
        if (window != null) {
            if (LJIIIZ == 0) {
                LJIIIZ = -1;
            }
            window.setLayout(-1, LJIIIZ);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.color.cz);
            View findViewById = window.findViewById(R.id.c8m);
            if (findViewById != null) {
                findViewById.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        setContentView(R.layout.am4);
        this.LLFF = (ConstraintLayout) findViewById(R.id.c_0);
        if (this.LJLL.LIZJ().size() == 1 && (ORZ.LJLLLL(this.LJLL.LIZJ()) instanceof S0Q) && ECommerceAnchorService.LJJJJI().LJJIJIIJI()) {
            ConstraintLayout constraintLayout = this.LLFF;
            if (constraintLayout != null) {
                constraintLayout.removeAllViews();
            }
            ConstraintLayout constraintLayout2 = this.LLFF;
            if (constraintLayout2 != null) {
                constraintLayout2.addView(View.inflate(getContext(), R.layout.am5, null), new ViewGroup.LayoutParams(-1, -2));
            }
        }
        ConstraintLayout constraintLayout3 = this.LLFF;
        if (constraintLayout3 != null) {
            this.LJZI = (ConstraintLayout) constraintLayout3.findViewById(R.id.jyn);
            this.LJZL = (TuxIconView) constraintLayout3.findViewById(R.id.jyu);
            this.LL = (AVS) constraintLayout3.findViewById(R.id.jyz);
            this.LLD = (TuxIconView) constraintLayout3.findViewById(R.id.a3z);
            this.LLF = (TuxTextView) constraintLayout3.findViewById(R.id.a41);
        }
        ((C119234m7) findViewById(R.id.a40)).setMaxHeight((int) (KL2.LJIIIZ(getContext()) * 0.73d));
        String str = this.LJZ;
        if (str != null && (tuxTextView = this.LLF) != null) {
            tuxTextView.setText(str);
        }
        LJJIFFI();
        LJJII();
        TuxIconView tuxIconView = this.LLD;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS32S0100000_12(this, 137));
        }
        View anchor_select_root = findViewById(R.id.a40);
        o.LJIIIIZZ(anchor_select_root, "anchor_select_root");
        anchor_select_root.addOnLayoutChangeListener(new IDCListenerS258S0100000_12(this, 4));
        C45631qh anchor_scroll_view = (C45631qh) findViewById(R.id.a3w);
        o.LJIIIIZZ(anchor_scroll_view, "anchor_scroll_view");
        C7A8 c7a8 = new C7A8(anchor_scroll_view);
        anchor_scroll_view.getViewTreeObserver().addOnScrollChangedListener(c7a8);
        anchor_scroll_view.getViewTreeObserver().addOnGlobalLayoutListener(c7a8);
        if (this.LJLLLL) {
            findViewById(R.id.a40).post(new ARunnableS48S0100000_12(this, 75));
        }
    }

    @Override // X.InterfaceC71392S0e
    public final void LJIILJJIL(String str, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        int i;
        TuxIconView tuxIconView;
        try {
            ConstraintLayout constraintLayout = this.LJZI;
            if (constraintLayout != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                constraintLayout.setVisibility(i);
            }
            if (str != null && (tuxIconView = this.LJZL) != null) {
                C16880lQ.LJJJ(tuxIconView, new ACListenerS30S1200000_12(interfaceC65784Pro, this, str, 1));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC71377Rzp(Context context, C7F9 chain, boolean z, boolean z2) {
        super(context, R.style.a71);
        o.LJIIIZ(chain, "chain");
        this.LJLJLLL = context;
        this.LJLL = chain;
        this.LJLLI = z;
        this.LJLLILLLL = z2;
        this.LJLLJ = "";
    }
}
