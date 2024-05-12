package X;

import Y.ACListenerS27S0100000_7;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GlS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42458GlS extends PopupWindow implements InterfaceC81305VvZ {
    public final ActivityC45651qj LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final ReplaceMusicRequest LJLJJI;
    public final View LJLJJL;
    public RelativeLayout LJLJJLL;
    public C81303VvX LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public SmartImageView LJLL;
    public TuxTextView LJLLI;
    public AKH LJLLILLLL;
    public boolean LJLLJ;

    @Override // X.InterfaceC81305VvZ
    public final void LIZ() {
    }

    public final void LIZJ() {
        if (this.LJLJJI == null) {
            return;
        }
        boolean LJ = H92.LJ();
        int i = R.string.q3c;
        if (LJ) {
            PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
            ReplaceMusicServiceImpl.LIZ().doRequest(this.LJLJI, this.LJLJJI, this.LJLIL, C42622Go6.LJIIJ);
            C78920UyC.LIZLLL(R.string.q3c, this.LJLIL, 3035);
            return;
        }
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        o.LJIIIIZZ(createIAVServiceProxybyMonsterPlugin, "get().getService(IAVServiceProxy::class.java)");
        createIAVServiceProxybyMonsterPlugin.getABService();
        if (MEX.LJFF()) {
            createIAVServiceProxybyMonsterPlugin.getApplicationService();
            C45039Hlz.LIZJ(this.LJLIL, null);
        } else {
            C5UD applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
            ActivityC45651qj activityC45651qj = this.LJLIL;
            applicationService.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("fromStart", "MainFragment");
            com.bytedance.hox.Hox.kv0(activityC45651qj).Cv0(bundle, "Following");
        }
        ActivityC45651qj activityC45651qj2 = this.LJLIL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        createIAVServiceProxybyMonsterPlugin.getABService();
        if (MEX.LJFF()) {
            i = R.string.bv3;
        }
        creativeToastBuilder.messageRes(i);
        C78915Uy7.LJJIIZI(activityC45651qj2, 3035, creativeToastBuilder);
        ReplaceMusicServiceImpl.LIZ().doRequest(this.LJLJI, this.LJLJJI, this.LJLIL);
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        AKH akh;
        if (isShowing() && !this.LJLIL.isFinishing()) {
            C81303VvX c81303VvX = this.LJLJL;
            o.LJI(c81303VvX);
            if (c81303VvX.hasWindowFocus()) {
                C81303VvX c81303VvX2 = this.LJLJL;
                o.LJI(c81303VvX2);
                c81303VvX2.LIZ(0.0f, true);
            }
        }
        if (this.LJLLJ && (akh = this.LJLLILLLL) != null) {
            akh.LIZ();
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC81305VvZ
    public final void LIZIZ() {
        dismiss();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42458GlS(ActivityC45651qj mFragmentActivity, boolean z, String cover, ReplaceMusicRequest replaceMusicRequest) {
        super(mFragmentActivity);
        String str;
        o.LJIIIZ(mFragmentActivity, "mFragmentActivity");
        o.LJIIIZ(cover, "cover");
        this.LJLIL = mFragmentActivity;
        this.LJLILLLLZI = z;
        this.LJLJI = cover;
        this.LJLJJI = replaceMusicRequest;
        Object LLILL = C16880lQ.LLILL(C5L7.LIZ(), "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bo6, (LayoutInflater) LLILL, null);
        o.LJIIIIZZ(LLLZIIL, "inflater.inflate(R.layou…lace_success_panel, null)");
        this.LJLJJL = LLLZIIL;
        View findViewById = LLLZIIL.findViewById(R.id.j5n);
        o.LJII(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.LJLJJLL = (RelativeLayout) findViewById;
        View findViewById2 = LLLZIIL.findViewById(R.id.ig1);
        o.LJII(findViewById2, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout");
        C81303VvX c81303VvX = (C81303VvX) findViewById2;
        this.LJLJL = c81303VvX;
        c81303VvX.LJLJI = this.LJLJJLL;
        c81303VvX.setPullUpListener(this);
        RelativeLayout relativeLayout = this.LJLJJLL;
        o.LJI(relativeLayout);
        this.LJLJLJ = relativeLayout.findViewById(R.id.f0h);
        RelativeLayout relativeLayout2 = this.LJLJJLL;
        o.LJI(relativeLayout2);
        this.LJLJLLL = relativeLayout2.findViewById(R.id.n7j);
        RelativeLayout relativeLayout3 = this.LJLJJLL;
        o.LJI(relativeLayout3);
        this.LJLL = (SmartImageView) relativeLayout3.findViewById(R.id.f12);
        RelativeLayout relativeLayout4 = this.LJLJJLL;
        o.LJI(relativeLayout4);
        this.LJLLI = (TuxTextView) relativeLayout4.findViewById(R.id.mo5);
        View view = this.LJLJLJ;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 88), view);
        }
        if (!TextUtils.isEmpty(cover)) {
            C78764Uvg.LJIIIZ(this.LJLL, cover, (int) KL2.LIZJ(mFragmentActivity, 48.0f), (int) KL2.LIZJ(mFragmentActivity, 62.0f));
        }
        if (z) {
            View view2 = this.LJLJLLL;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            TuxTextView tuxTextView = this.LJLLI;
            if (tuxTextView != null) {
                tuxTextView.setText(R.string.q2s);
            }
        } else {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
            if (MEX.LJFF()) {
                AKH akh = new AKH(mFragmentActivity);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_exclamation_mark_circle_fill;
                c2068389v.LJ = Integer.valueOf(R.attr.eb);
                akh.LIZLLL(new AqS167S0100000_1(c2068389v, 15), false);
                A21 a21 = akh.LIZ;
                Context context = akh.LIZIZ;
                if (context != null) {
                    str = context.getString(R.string.q33);
                } else {
                    str = null;
                }
                a21.LJ = str;
                int LIZLLL = C60996Nwm.LIZLLL(mFragmentActivity) + C173216qz.LIZJ(88.0d, mFragmentActivity);
                A21 a212 = akh.LIZ;
                a212.LJIIIIZZ = LIZLLL;
                Context context2 = akh.LIZIZ;
                a212.LJFF = context2 != null ? context2.getString(R.string.tgw) : null;
                A21 a213 = akh.LIZ;
                a213.LIZJ = false;
                a213.LJIIIZ = 0;
                a213.LJIILIIL = true;
                a213.LJIIJJI = new ACListenerS27S0100000_7(this, 89);
                akh.LIZ.LJIIL = new AqS173S0100000_7(this, 253);
                this.LJLLILLLL = akh;
            } else {
                TuxTextView tuxTextView2 = this.LJLLI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(R.string.q33);
                }
                View view3 = this.LJLJLLL;
                if (view3 != null) {
                    C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 90), view3);
                }
            }
        }
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(LLLZIIL);
        setWidth(KL2.LJIIJJI(C5L7.LIZ()));
        setHeight(-2);
        setAnimationStyle(R.style.a_l);
    }
}
