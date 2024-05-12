package X;

import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TGt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74371TGt {
    public final Keva LIZ;
    public final View LIZIZ;
    public final ImageView LIZJ;
    public final FrameLayout LIZLLL;
    public TextView LJ;
    public final View LJFF;
    public boolean LJI;
    public final ViewGroup LJII;
    public final C74372TGu LJIIIIZZ;
    public final boolean LJIIIZ = false;

    public final void LIZ(boolean z) {
        float f;
        this.LJI = z;
        this.LJFF.setEnabled(z);
        ImageView imageView = this.LIZJ;
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        imageView.setAlpha(f);
        TextView textView = this.LJ;
        if (textView != null) {
            if (!z) {
                f2 = 0.5f;
            }
            textView.setAlpha(f2);
        }
    }

    public C74371TGt(ViewGroup viewGroup, C74372TGu c74372TGu, boolean z) {
        int i;
        this.LJII = viewGroup;
        this.LJIIIIZZ = c74372TGu;
        Keva repo = Keva.getRepo("compliance_dialog_confirmed");
        o.LJIIIIZZ(repo, "Keva.getRepo(COMPLIANCE_DIALOG_CONFIRMED)");
        this.LIZ = repo;
        this.LJI = true;
        TextView textView = null;
        C74373TGv c74373TGv = new C74373TGv(null);
        InterfaceC88472Yns<? super C74373TGv, C76800UCe> interfaceC88472Yns = c74372TGu.LJLLILLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c74373TGv);
        }
        Context context = viewGroup.getContext();
        View LIZLLL = AnonymousClass030.LIZLLL(context, R.layout.bdx, viewGroup, true, "LayoutInflater.from(cont… cameraReverseRoot, true)");
        this.LJFF = LIZLLL;
        View findViewById = LIZLLL.findViewById(R.id.ezp);
        o.LJIIIIZZ(findViewById, "cameraLayout.findViewById(R.id.iv_camera_reverse)");
        this.LIZIZ = findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.f51);
        o.LJIIIIZZ(findViewById2, "cameraReverseRoot.findViewById(R.id.iv_icon)");
        ImageView imageView = (ImageView) findViewById2;
        this.LIZJ = imageView;
        View findViewById3 = viewGroup.findViewById(R.id.de_);
        o.LJIIIIZZ(findViewById3, "cameraReverseRoot.findVi…d(R.id.fl_icon_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById3;
        this.LIZLLL = frameLayout;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.m8o);
        if (textView2 != null) {
            InterfaceC88472Yns<? super TextView, C76800UCe> interfaceC88472Yns2 = c74373TGv.LIZ;
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(textView2);
            }
            textView = textView2;
        }
        this.LJ = textView;
        boolean z2 = c74372TGu.LJLJJLL;
        if (textView != null) {
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
        findViewById.setFocusable(true);
        findViewById.setContentDescription(context.getString(R.string.q6s));
        findViewById.setVisibility(0);
        findViewById.getLayoutParams().width = c74372TGu.LJLJI;
        frameLayout.setBackgroundResource(c74372TGu.LJLLI);
        OSZ<Integer, Integer> osz = c74372TGu.LJLJJI;
        if (osz != null) {
            imageView.getLayoutParams().width = osz.getFirst().intValue();
            imageView.getLayoutParams().height = osz.getSecond().intValue();
        }
        OSZ<Integer, Integer> osz2 = c74372TGu.LJLJJL;
        if (osz2 != null) {
            frameLayout.getLayoutParams().width = osz2.getFirst().intValue();
            frameLayout.getLayoutParams().height = osz2.getSecond().intValue();
        }
        C16880lQ.LJIILJJIL(frameLayout, new ACListenerS46S0200000_12(this, context, 46));
        Drawable drawable = c74372TGu.LJLLL;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            int LIZJ = C74275TDb.LIZJ(2.0d, context);
            int LIZJ2 = C74275TDb.LIZJ(1.0d, context);
            imageView.setPadding(LIZJ2, LIZJ, LIZJ2, LIZJ);
        } else {
            imageView.setImageResource(c74372TGu.LJLL);
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i2 = c74372TGu.LJLIL;
            if (i2 > 0) {
                marginLayoutParams.topMargin = i2;
            }
            int i3 = c74372TGu.LJLILLLLZI;
            if (i3 > 0) {
                marginLayoutParams.rightMargin = i3;
            }
            marginLayoutParams.topMargin = C81184Vtc.LJFF(context) + marginLayoutParams.topMargin;
            LIZ(z);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
