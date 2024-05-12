package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NZA implements InterfaceC59561NZd {
    public final Activity LJLIL;
    public final C59314NPq LJLILLLLZI;
    public final View LJLJI;
    public NZB LJLJJI;
    public NZC LJLJJL;
    public NZ3 LJLJJLL;
    public ConstraintLayout LJLJL;
    public boolean LJLJLJ;
    public TuxTextView LJLJLLL;
    public AqS157S0100000_7 LJLL;
    public AbstractC65781Prl LJLLI;
    public final C59484NWe LJLLILLLL;

    @Override // X.InterfaceC59561NZd
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC59561NZd
    public final String getTitle() {
        return null;
    }

    public final void LJ() {
        this.LJLJJI = new NZB(this);
        this.LJLJJL = (NZC) LIZ(R.id.c02);
        this.LJLJL = (ConstraintLayout) LIZ(R.id.bdn);
        this.LJLJLLL = (TuxTextView) LIZ(R.id.mcs);
        NZC nzc = this.LJLJJL;
        if (nzc != null) {
            nzc.setCrossPlatformActivityContainer(this);
            NZ3 nz3 = (NZ3) LIZ(R.id.c06);
            this.LJLJJLL = nz3;
            nz3.setCrossPlatformParams(this.LJLILLLLZI);
            NZ3 nz32 = this.LJLJJLL;
            if (nz32 != null) {
                C116474hf c116474hf = (C116474hf) nz32.findViewById(R.id.az6);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_x_mark;
                c116474hf.setImageDrawable(c2068389v.LIZ(this.LJLIL));
                double d = 44;
                c116474hf.setLayoutParams(new LinearLayout.LayoutParams(C17N.LJIILL(d), C17N.LJIILL(d)));
                NZ3 nz33 = this.LJLJJLL;
                if (nz33 != null) {
                    nz33.setTitleWrap(new NZE(this));
                    if (TextUtils.equals(this.LJLILLLLZI.LIZ.LJFF, "donation_sticker_consume")) {
                        ConstraintLayout constraintLayout = this.LJLJL;
                        if (constraintLayout != null) {
                            constraintLayout.setBackgroundResource(R.drawable.a2m);
                            NZ3 nz34 = this.LJLJJLL;
                            if (nz34 != null) {
                                nz34.setBackgroundResource(R.drawable.a2m);
                            } else {
                                o.LJIJI("mCrossPlatformTitleBar");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mClRoot");
                            throw null;
                        }
                    }
                    NZC nzc2 = this.LJLJJL;
                    if (nzc2 != null) {
                        nzc2.onCreate(this.LJLIL);
                        C59308NPk c59308NPk = this.LJLILLLLZI.LIZ;
                        if (c59308NPk.LJIIJ) {
                            return;
                        }
                        String LIZ = AbstractC57425MgH.LIZ(ImmersionBar.getStatusBarHeight(this.LJLIL), c59308NPk.LIZJ);
                        NZC nzc3 = this.LJLJJL;
                        if (nzc3 != null) {
                            ((NXI) nzc3.LJI(NXI.class)).LIZIZ(LIZ);
                            return;
                        } else {
                            o.LJIJI("mCrossPlatformWebView");
                            throw null;
                        }
                    }
                    o.LJIJI("mCrossPlatformWebView");
                    throw null;
                }
                o.LJIJI("mCrossPlatformTitleBar");
                throw null;
            }
            o.LJIJI("mCrossPlatformTitleBar");
            throw null;
        }
        o.LJIJI("mCrossPlatformWebView");
        throw null;
    }

    @Override // X.InterfaceC59561NZd
    public final NZX LJII() {
        NZB nzb = this.LJLJJI;
        if (nzb != null) {
            return nzb;
        }
        o.LJIJI("mISingleWebViewStatus");
        throw null;
    }

    @Override // X.InterfaceC59561NZd
    public final void LJIIIZ() {
        NZ3 nz3 = this.LJLJJLL;
        if (nz3 != null) {
            nz3.setVisibility(8);
        } else {
            o.LJIJI("mCrossPlatformTitleBar");
            throw null;
        }
    }

    @Override // X.InterfaceC59488NWi
    public final boolean LJIIJ() {
        NZC nzc = this.LJLJJL;
        if (nzc != null) {
            return nzc.LJIIJ();
        }
        o.LJIJI("mCrossPlatformWebView");
        throw null;
    }

    @Override // X.InterfaceC59561NZd
    public final NZC LJIIJJI() {
        NZC nzc = this.LJLJJL;
        if (nzc != null) {
            return nzc;
        }
        o.LJIJI("mCrossPlatformWebView");
        throw null;
    }

    @Override // X.InterfaceC59488NWi
    public final void refresh() {
        NZC nzc = this.LJLJJL;
        if (nzc != null) {
            nzc.refresh();
        } else {
            o.LJIJI("mCrossPlatformWebView");
            throw null;
        }
    }

    @Override // X.InterfaceC59488NWi
    public final Context getContext() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC59488NWi
    public final NTL getCrossPlatformBusiness() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC59488NWi
    public final C59314NPq getCrossPlatformParams() {
        return this.LJLILLLLZI;
    }

    public final <T extends View> T LIZ(int i) {
        T t = (T) this.LJLIL.findViewById(i);
        if (t == null) {
            View view = this.LJLJI;
            if (view != null) {
                t = (T) view.findViewById(i);
            } else {
                t = null;
            }
        }
        T view2 = t;
        o.LJIIIIZZ(view2, "view");
        return t;
    }

    @Override // X.F10
    public final void LJIIZILJ(String str) {
        LJIILL(str, true);
    }

    public NZA(Activity activity, C59314NPq c59314NPq) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = c59314NPq;
        this.LJLJI = null;
        this.LJLLILLLL = new C59484NWe(this);
    }

    @Override // X.InterfaceC59561NZd
    public final void LJIILL(CharSequence charSequence, boolean z) {
        Integer num;
        if (charSequence != null) {
            if ((TextUtils.isEmpty(charSequence) || !AbstractC57425MgH.LJII(charSequence)) && (num = this.LJLILLLLZI.LIZ.LIZ) != null && num.intValue() == 1) {
                if (this.LJLILLLLZI.LIZJ.LJIL || z) {
                    NZ3 nz3 = this.LJLJJLL;
                    if (nz3 != null) {
                        nz3.setTitle(charSequence);
                    } else {
                        o.LJIJI("mCrossPlatformTitleBar");
                        throw null;
                    }
                }
            }
        }
    }
}
