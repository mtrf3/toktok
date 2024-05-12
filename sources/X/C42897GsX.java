package X;

import Y.ACListenerS27S0100000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorOperationService;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService;
import com.ss.android.ugc.aweme.anchor.service.AnchorOperationServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.AnchorStateServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS23S0310000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GsX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42897GsX extends AbstractC42900Gsa {
    public final View LJLIL;
    public final C62846OlW LJLILLLLZI;
    public final TextView LJLJI;
    public final TuxIconView LJLJJI;
    public final TuxIconView LJLJJL;
    public final LinearLayout LJLJJLL;
    public final TuxIconView LJLJL;
    public LinearLayout LJLJLJ;
    public final TextView LJLJLLL;
    public final AnchorLock$IAnchorStateService LJLL;
    public final AnchorLock$IAnchorOperationService LJLLI;

    @Override // X.AbstractC42900Gsa
    public ViewGroup getAnchorListContent() {
        return null;
    }

    @Override // X.AbstractC42900Gsa
    public final void LIZ() {
        LinearLayout linearLayout;
        TextView textView = this.LJLJI;
        if (textView != null) {
            textView.setText(getResources().getText(R.string.e1a));
        }
        C62846OlW c62846OlW = this.LJLILLLLZI;
        if (c62846OlW != null) {
            c62846OlW.setImageResource(R.drawable.b6h);
        }
        TuxIconView tuxIconView = this.LJLJJI;
        if (tuxIconView != null && (linearLayout = this.LJLJLJ) != null && linearLayout.getVisibility() == 0) {
            tuxIconView.setVisibility(0);
            tuxIconView.setTintColorRes(R.attr.eb);
        }
        TuxIconView tuxIconView2 = this.LJLJJL;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(8);
        }
        TuxIconView tuxIconView3 = this.LJLJL;
        if (tuxIconView3 == null) {
            return;
        }
        tuxIconView3.setVisibility(8);
    }

    @Override // X.AbstractC42900Gsa
    public final void LIZIZ() {
        KL2.LJIILLIIL(8, this.LJLJL);
    }

    @Override // X.AbstractC42900Gsa
    public final void LIZJ() {
        KL2.LJIILLIIL(8, this.LJLJLLL);
    }

    @Override // X.AbstractC42900Gsa
    public final void LJFF() {
        KL2.LJIILLIIL(0, this.LJLJL);
    }

    @Override // X.AbstractC42900Gsa
    public final void LIZLLL() {
        View rootView = getRootView();
        if (rootView != null) {
            rootView.setEnabled(false);
        }
        View rootView2 = getRootView();
        if (rootView2 == null) {
            return;
        }
        rootView2.setAlpha(0.4f);
    }

    @Override // X.AbstractC42900Gsa
    public final void LJII() {
        View rootView = getRootView();
        if (rootView != null) {
            rootView.setEnabled(true);
        }
        View rootView2 = getRootView();
        if (rootView2 != null) {
            rootView2.setAlpha(1.0f);
        }
        LinearLayout linearLayout = this.LJLJJLL;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.LJLJLJ;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(0);
    }

    @Override // X.AbstractC42900Gsa
    public C62846OlW getLeftIcon() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC42900Gsa
    public TuxIconView getRightIcon() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42897GsX(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLL = AnchorStateServiceImpl.LJIIJ();
        this.LJLLI = AnchorOperationServiceImpl.LIZJ();
        this.LJLIL = C16880lQ.LLLZIIL(R.layout.bdh, C16880lQ.LLZIL(context), this);
        C62846OlW c62846OlW = (C62846OlW) findViewById(R.id.i4x);
        this.LJLILLLLZI = c62846OlW;
        if (c62846OlW != null) {
            c62846OlW.setImageResource(R.drawable.b6h);
        }
        this.LJLJI = (TextView) findViewById(R.id.i56);
        this.LJLJJI = (TuxIconView) findViewById(R.id.i4y);
        this.LJLJJL = (TuxIconView) findViewById(R.id.i4z);
        this.LJLJJLL = (LinearLayout) findViewById(R.id.i57);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.i4w);
        this.LJLJL = tuxIconView;
        if (tuxIconView != null) {
            tuxIconView.setImageResource(R.drawable.avc);
        }
        this.LJLJLJ = (LinearLayout) findViewById(R.id.vg);
        this.LJLJLLL = (TextView) findViewById(R.id.i4u);
    }

    @Override // X.AbstractC42900Gsa
    public final void LJI(boolean z) {
        KL2.LJIILLIIL(0, this.LJLJLLL);
        TextView textView = this.LJLJLLL;
        if (textView == null) {
            return;
        }
        textView.setText(getContext().getText(R.string.f5p));
    }

    @Override // X.AbstractC42900Gsa
    public void setOnAddClickListener(InterfaceC88472Yns<? super View, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.vg);
        this.LJLJLJ = linearLayout;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS27S0100000_7((InterfaceC88472Yns) listener, 83));
        }
    }

    @Override // X.AbstractC42900Gsa
    public final void LJ(UrlModel urlModel, String str, boolean z, AqS111S0300000_7 aqS111S0300000_7, AqS154S0200000_7 aqS154S0200000_7) {
        String str2;
        TextView textView = this.LJLJLLL;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (urlModel != null && str.length() > 0) {
            List<String> urlList = urlModel.getUrlList();
            if (urlList == null || (str2 = (String) ORZ.LJLLJ(urlList)) == null) {
                str2 = "";
            }
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
            LJIIIIZZ.LJJIIJZLJL = this.LJLILLLLZI;
            C16880lQ.LLJJJ(LJIIIIZZ);
            TextView textView2 = this.LJLJI;
            if (textView2 != null) {
                textView2.setText(str);
            }
            if (C53258KvG.LIZIZ()) {
                if (aqS111S0300000_7 != null) {
                    this.LJLL.LIZIZ(1);
                    this.LJLLI.LIZ(C47261Igj.LJJIJ(1));
                    this.LJLL.LJIIIIZZ(false);
                }
                TuxIconView tuxIconView = this.LJLJJL;
                if (tuxIconView != null) {
                    if (aqS111S0300000_7 != null) {
                        this.LJLLI.LIZIZ(4, new AqS96S0300000_7(aqS111S0300000_7, tuxIconView, this, 12));
                        this.LJLLI.LIZIZ(5, new AqS23S0310000_7(this, z, aqS111S0300000_7, tuxIconView, 0));
                    } else {
                        this.LJLLI.LIZIZ(2, new AqS157S0100000_7(this, 431));
                        this.LJLL.LJIIIIZZ(true);
                    }
                }
            }
            TuxIconView tuxIconView2 = this.LJLJJI;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
            }
            TuxIconView tuxIconView3 = this.LJLJJL;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(0);
                if (aqS111S0300000_7 != null) {
                    tuxIconView3.setTintColorRes(R.attr.gx);
                    tuxIconView3.setIconRes(R.raw.icon_x_mark);
                    C16880lQ.LJJJ(tuxIconView3, new ACListenerS27S0100000_7((InterfaceC88472Yns) aqS111S0300000_7, 83));
                } else {
                    tuxIconView3.setTintColorRes(R.attr.gx);
                    tuxIconView3.setIconRes(R.raw.icon_chevron_right_offset_ltr);
                    C16880lQ.LJJJ(tuxIconView3, new ACListenerS27S0100000_7(this, 82));
                }
            }
        }
    }
}
