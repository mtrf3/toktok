package com.bytedance.android.livesdk.browser.fragment;

import X.BNX;
import X.C06F;
import X.C0NB;
import X.C134675Qh;
import X.C15380j0;
import X.C15580jK;
import X.C1E4;
import X.C29425Bgj;
import X.C30883CAd;
import X.C30885CAf;
import X.C30890CAk;
import X.C30937CCf;
import X.CN1;
import X.COE;
import X.COJ;
import X.DialogC30887CAh;
import X.DialogInterfaceOnKeyListenerC30886CAg;
import X.InterfaceC30889CAj;
import X.InterfaceC30900CAu;
import Y.AObjectS134S0100000_5;
import Y.ARunnableS9S0101000_5;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.container.behavior.ContainerBottomSheetBehavior;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class HybridDialogFragment extends BaseDialogFragment implements COE, InterfaceC30900CAu, COJ {
    public static final /* synthetic */ int LLJILLL = 0;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public ImageView LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public TextView LJLLLL;
    public View LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public String LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public String LLFF;
    public boolean LLFFF;
    public String LLFII;
    public int LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public AbsHybridFragment LLIIJI;
    public boolean LLIIJLIL;
    public long LLIIL;
    public long LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public int LLILL;
    public String LLILLIZIL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public float LLJILJIL;
    public boolean LLILZ = true;
    public String LLJI = "";
    public String LLJIJIL = "";
    public int LLJILJILJ = -1;

    @Override // X.COE
    public final void H3() {
        this.LLIIJLIL = true;
    }

    @Override // com.bytedance.android.live.BaseDialogFragmentV2, androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        C30883CAd.LIZIZ(this.LJLL, this.LLJIJIL, this.LLILZIL, new AObjectS134S0100000_5(this, 0));
    }

    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment
    public final String zk() {
        AbsHybridFragment absHybridFragment = this.LLIIJI;
        if (absHybridFragment == null) {
            return "";
        }
        return absHybridFragment.LJLJJI;
    }

    @Override // X.COE
    public final void ib() {
        long currentTimeMillis = System.currentTimeMillis();
        this.LLIILII = currentTimeMillis;
        C0NB.LIZIZ("onPageStarted", String.valueOf(currentTimeMillis - this.LLIIL));
        this.LLIIJLIL = false;
        if (!this.LJLIL) {
            return;
        }
        this.LJLJJL.setVisibility(8);
    }

    @Override // X.COE
    public final void mi() {
        View view;
        C0NB.LIZIZ("onPageStarted", String.valueOf(System.currentTimeMillis() - this.LLIILII));
        if (!this.LJLIL) {
            return;
        }
        if (this.LLD && (view = this.LJLLLLLL) != null) {
            view.setVisibility(8);
        }
        if (this.LLF) {
            this.LLILL = 0;
            AbsHybridFragment absHybridFragment = this.LLIIJI;
            WebView webView = null;
            if (absHybridFragment != null && (absHybridFragment.re() instanceof WebView) && this.LLIIJI.re() != null) {
                AbsHybridFragment absHybridFragment2 = this.LLIIJI;
                if (absHybridFragment2 != null && (absHybridFragment2.re() instanceof WebView)) {
                    webView = (WebView) this.LLIIJI.re();
                }
                webView.setBackgroundColor(this.LLILL);
            }
        }
        if (this.LLIIJLIL || ((this.LLIIJI.re() instanceof WebView) && TextUtils.equals(((WebView) this.LLIIJI.re()).getUrl(), "about:blank"))) {
            this.LJLJJL.setVisibility(0);
        } else {
            this.LJLJJL.setVisibility(8);
        }
        if (this.LLIILZL) {
            int i = this.LLII;
            if (i > 0) {
                Al(i);
            } else {
                Dl(this.LLIIII, this.LLIIIILZ, this.LLIIIJ, this.LLIIIL);
            }
        }
    }

    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService != null) {
            iBrowserService.Yd0().LIZJ(this);
        }
    }

    @Override // X.COE
    public final void LLLZIL() {
        dismissAllowingStateLoss();
    }

    @Override // com.bytedance.android.live.BaseDialogFragmentV2, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        dismissAllowingStateLoss();
    }

    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment, com.bytedance.android.live.BaseDialogFragmentV2, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    public final void Al(int i) {
        if (i <= 0) {
            return;
        }
        if (this.LJLJJI instanceof C134675Qh) {
            int LIZ = C15380j0.LIZ(i);
            ((C134675Qh) this.LJLJJI).LJJLJLI(LIZ, LIZ, LIZ, LIZ);
        } else {
            C15580jK.LIZIZ(C15380j0.LIZ(i), this.LJLL);
        }
    }

    @Override // X.InterfaceC30900CAu
    public final void Vb(InterfaceC30889CAj interfaceC30889CAj) {
        interfaceC30889CAj.LIZ(this.LLJI);
        interfaceC30889CAj.LIZIZ().LIZLLL("close", new C30937CCf(this));
        interfaceC30889CAj.LIZJ().LIZIZ("open_live", new C29425Bgj(new WeakReference(mo49getActivity()), this, this.LLJI));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        if (getDialog() == null || (window = getDialog().getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.getDecorView().setPadding(0, 0, 0, 0);
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        attributes.dimAmount = 0.0f;
        window.setAttributes(attributes);
        getDialog();
        int i = this.LLFZ;
        int i2 = this.LLI;
        ViewGroup.LayoutParams layoutParams = this.LJLL.getLayoutParams();
        layoutParams.width = C15380j0.LIZ(i);
        int i3 = this.LLILLJJLI;
        if (i3 == 0) {
            i3 = C15380j0.LIZ(i2);
        }
        if (this.LJLZ) {
            i3 = C15380j0.LIZ(i2);
        }
        layoutParams.height = i3;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = this.LLIFFJFJJ;
        }
        if (this.LLILLJJLI > 0) {
            getView().post(new ARunnableS9S0101000_5(i2, this, 20));
        }
        this.LJLL.setLayoutParams(layoutParams);
        this.LJLL.requestLayout();
        int i4 = this.LLII;
        if (i4 != 0) {
            Al(i4);
        } else {
            Dl(this.LLIIII, this.LLIIIILZ, this.LLIIIL, this.LLIIIJ);
        }
        window.setBackgroundDrawable(new ColorDrawable());
        if (this.LLFZ == 0 && this.LLI == 0) {
            window.addFlags(32);
        }
        window.setFlags(1024, 1024);
        if (this.LL) {
            getDialog().setOnKeyListener(new DialogInterfaceOnKeyListenerC30886CAg(this));
        }
    }

    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        Uri parse;
        int LJJIFFI;
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && !this.LLJ) {
            this.LLFII = arguments.getString("arg_url");
            this.LLFZ = arguments.getInt("arg_width");
            this.LLI = arguments.getInt("arg_height");
            this.LLIIIZ = arguments.getInt("arg_margin");
            this.LLII = arguments.getInt("arg_radius");
            this.LLIIII = arguments.getInt("arg_radius_top_left");
            this.LLIIIILZ = arguments.getInt("arg_radius_top_right");
            this.LLIIIL = arguments.getInt("arg_radius_bottom_right");
            this.LLIIIJ = arguments.getInt("arg_radius_bottom_left");
            this.LLIFFJFJJ = arguments.getInt("arg_gravity");
            this.LLILL = arguments.getInt("arg_background_res");
            this.LLILLIZIL = arguments.getString("arg_monitor_page_service");
            this.LLIILZL = arguments.getBoolean("arg_use_bottom_close");
            this.LLIIZ = arguments.getBoolean("arg_landscape_custom_height");
            this.LLIL = arguments.getBoolean("arg_landscape_custom_gravity");
            this.LLILIL = arguments.getBoolean("arg_show_dim");
            this.LLILLL = arguments.getBoolean("arg_enable_pull_down_close", false);
            this.LLILLJJLI = arguments.getInt("arg_variable_height", 0);
            this.LLILZ = arguments.getBoolean("arg_cancel_on_touch_outside");
            this.LJLZ = arguments.getBoolean("arg_enable_title_bar");
            this.LJZ = arguments.getBoolean("arg_enable_title_share");
            this.LJZI = arguments.getBoolean("arg_enable_title_share_add_report_action");
            this.LJZL = arguments.getString("arg_report_schema");
            this.LLFFF = arguments.getBoolean("arg_enable_title_close");
            this.LLFF = arguments.getString("arg_title");
            this.LL = arguments.getBoolean("arg_use_page_back");
            this.LLD = arguments.getBoolean("arg_use_native_loading");
            this.LLF = arguments.getBoolean("arg_should_change_bg_res_into_transparent");
            this.LLILZLL = arguments.getString("arg_original_scheme");
            this.LLIZ = arguments.getString("fallback_schema");
            this.LLJI = arguments.getString("arg_from_label", "");
            this.LLIZLLLIL = arguments.getInt("hybrid_type", BNX.H5.ordinal());
            this.LLJIJIL = arguments.getString("arg_enter_type", "");
            this.LLJILJIL = arguments.getFloat("arg_mask_alpha");
            this.LLJILJILJ = arguments.getInt("arg_web_bg_color", -1);
            this.LLJ = true;
        }
        if (mo49getActivity().getRequestedOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZIL = z;
        if (TextUtils.isEmpty(this.LLJIJIL)) {
            if (this.LLILZIL) {
                str = "right";
            } else {
                str = "bottom";
            }
            this.LLJIJIL = str;
        }
        if (this.LLILZIL) {
            i = R.style.aaz;
        } else {
            i = R.style.aay;
        }
        setStyle(1, i);
        if (mo49getActivity().getRequestedOrientation() == 0) {
            if (!this.LLIIZ) {
                this.LLIIIZ = 8;
                this.LLII = 8;
                this.LLI = (int) C15380j0.LJIJ(C15380j0.LJIIJJI() - (this.LLIIIZ * 2));
                this.LLFZ = 375;
            }
            boolean z2 = this.LLIL;
            if (!z2) {
                this.LLIFFJFJJ = 8388693;
            }
            if (this.LLILZIL && z2) {
                this.LLIFFJFJJ = 85;
            }
            if (this.LLILII) {
                this.LLIIIZ = 0;
                this.LLII = 0;
                this.LLIIII = 0;
                this.LLIIIILZ = 0;
                this.LLIIIJ = 0;
                this.LLIIIL = 0;
                this.LLI = (int) C15380j0.LJIJ(C15380j0.LJIIJJI());
                this.LLFZ = 375;
                this.LLILL = -16777216;
            }
        }
        if (this.LLFZ <= 0) {
            this.LLFZ = 300;
        }
        if (!TextUtils.isEmpty(this.LLFII) && (parse = UriProtector.parse(this.LLFII)) != null && (LJJIFFI = C1E4.LJJIFFI(UriProtector.getQueryParameter(parse, "height"))) > 0) {
            this.LLI = LJJIFFI;
        }
        if (mo49getActivity().getRequestedOrientation() == 0 && this.LLI > C15380j0.LJIJ(C15380j0.LJIIJJI())) {
            this.LLI = (int) C15380j0.LJIJ(C15380j0.LJIIJJI() - (this.LLIIIZ * 2));
        }
        if (this.LLI <= 0) {
            this.LLI = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        }
        if (this.LLIILZL) {
            this.LLI += 48;
        }
        if (this.LLII < 0) {
            this.LLII = 0;
        }
        if (this.LLIIII < 0) {
            this.LLIIII = 0;
        }
        if (this.LLIIIILZ < 0) {
            this.LLIIIILZ = 0;
        }
        if (this.LLIIIL < 0) {
            this.LLIIIL = 0;
        }
        if (this.LLIIIJ < 0) {
            this.LLIIIJ = 0;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        DialogC30887CAh dialogC30887CAh = new DialogC30887CAh(this, getContext(), getTheme());
        dialogC30887CAh.requestWindowFeature(1);
        return dialogC30887CAh;
    }

    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        C30883CAd.LIZ(this.LJLL, this.LLJIJIL, this.LLILZIL);
        if (this.LLILZIL) {
            ((C06F) this.LJLJJI.getLayoutParams()).LIZIZ(null);
            this.LJLJJI.requestLayout();
            return;
        }
        ContainerBottomSheetBehavior LJII = ContainerBottomSheetBehavior.LJII(this.LJLJJI);
        if (this.LLIZLLLIL == BNX.H5.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        LJII.LJJJJI = z;
        LJII.setPeekHeight(C15380j0.LIZ(this.LLI));
        if (this.LLIFFJFJJ == 80) {
            if (this.LLILLL) {
                LJII.setHideable(true);
                LJII.LIZ(new C30890CAk(this));
            } else {
                LJII.setHideable(false);
            }
            if (this.LLILLJJLI > 0) {
                ImageView imageView = this.LJLJLJ;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                LJII.LIZ(new C30885CAf(this));
                return;
            }
            ImageView imageView2 = this.LJLJLJ;
            if (imageView2 == null) {
                return;
            }
            imageView2.setVisibility(8);
            return;
        }
        LJII.LJIJ = false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(1:84)(1:5)|(1:83)(1:9)|10|(1:12)(1:82)|13|(1:15)|16|(10:18|(2:20|(8:22|23|(8:25|(3:29|(1:31)(1:33)|32)|34|(1:36)(1:61)|37|(10:39|(1:41)(1:55)|42|(1:44)(1:54)|45|(1:47)|48|(1:50)|51|(1:53))|56|(1:60))|62|63|(1:65)|66|67)(1:72))(3:74|75|(1:77)(1:78))|73|23|(0)|62|63|(0)|66|67)|81|23|(0)|62|63|(0)|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02cb, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02be A[Catch: all -> 0x02ca, TryCatch #0 {all -> 0x02ca, blocks: (B:63:0x02a9, B:65:0x02be, B:66:0x02c1), top: B:62:0x02a9 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void Dl(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            return;
        }
        View view = this.LJLJJI;
        if (view instanceof C134675Qh) {
            ((C134675Qh) view).LJJLJLI(C15380j0.LIZ(i), C15380j0.LIZ(i4), C15380j0.LIZ(i2), C15380j0.LIZ(i3));
        } else {
            C15580jK.LIZ(C15380j0.LIZ(i), 1, this.LJLL);
        }
    }
}
