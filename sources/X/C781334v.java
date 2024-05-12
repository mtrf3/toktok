package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import Y.AObserverS69S0100000_1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.34v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C781334v extends FrameLayout implements C34M {
    public View LJLIL;
    public TuxIconView LJLILLLLZI;
    public TuxIconView LJLJI;
    public TuxIconView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public final boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public Aweme LJLL;
    public final AObserverS69S0100000_1 LJLLI;

    @Override // X.C34M
    public final void LJIL(String aid) {
        o.LJIIIZ(aid, "aid");
    }

    @Override // X.C34M
    public final void o5() {
        this.LJLJLLL = false;
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_play;
            tuxIconView.setTuxIcon(c2068389v);
        }
    }

    @Override // X.C34M
    public final void s5() {
        this.LJLJLLL = true;
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_pause;
            tuxIconView.setTuxIcon(c2068389v);
        }
    }

    public final void LIZ() {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        TuxIconView tuxIconView3;
        TuxTextView tuxTextView;
        String str;
        float f;
        int i;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        View inflate = FrameLayout.inflate(getContext(), R.layout.vh, this);
        this.LJLIL = inflate;
        TuxTextView tuxTextView2 = null;
        if (inflate != null) {
            tuxIconView = (TuxIconView) inflate.findViewById(R.id.m8n);
        } else {
            tuxIconView = null;
        }
        this.LJLILLLLZI = tuxIconView;
        View view = this.LJLIL;
        if (view != null) {
            tuxIconView2 = (TuxIconView) view.findViewById(R.id.me8);
        } else {
            tuxIconView2 = null;
        }
        this.LJLJI = tuxIconView2;
        View view2 = this.LJLIL;
        if (view2 != null) {
            tuxIconView3 = (TuxIconView) view2.findViewById(R.id.eap);
        } else {
            tuxIconView3 = null;
        }
        this.LJLJJI = tuxIconView3;
        View view3 = this.LJLIL;
        if (view3 != null) {
            tuxTextView = (TuxTextView) view3.findViewById(R.id.m57);
        } else {
            tuxTextView = null;
        }
        this.LJLJJL = tuxTextView;
        View view4 = this.LJLIL;
        if (view4 != null) {
            tuxTextView2 = (TuxTextView) view4.findViewById(R.id.m4z);
        }
        this.LJLJJLL = tuxTextView2;
        TuxTextView tuxTextView3 = this.LJLJJL;
        if (tuxTextView3 != null) {
            ServiceInfo value = c71082qe.LIZIZ.LJIIIIZZ.getValue();
            if (value == null || (str = value.name) == null) {
                str = "";
            }
            tuxTextView3.setText(str);
        }
        TuxIconView tuxIconView4 = this.LJLILLLLZI;
        if (tuxIconView4 != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZIZ = C7MY.LIZIZ(20);
            c2068389v.LIZJ = C7MY.LIZIZ(20);
            c2068389v.LIZ = R.raw.icon_tv_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.gy);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            SY9 LIZ = c2068389v.LIZ(context);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(16);
            c110614Vt.LJII = C7MY.LIZIZ(32);
            c110614Vt.LJI = C7MY.LIZIZ(32);
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            tuxIconView4.setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context2)));
        }
        TuxTextView tuxTextView4 = this.LJLJJLL;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(getContext().getString(R.string.t4t));
        }
        TuxIconView tuxIconView5 = this.LJLJJI;
        if (tuxIconView5 != null) {
            C2068389v c2068389v2 = new C2068389v();
            if (this.LJLJLJ) {
                i = R.raw.icon_auto_scroll;
            } else {
                i = R.raw.icon_auto_scroll_off;
            }
            c2068389v2.LIZ = i;
            c2068389v2.LJ = Integer.valueOf(R.attr.dk);
            tuxIconView5.setTuxIcon(c2068389v2);
        }
        TuxIconView tuxIconView6 = this.LJLJJI;
        if (tuxIconView6 != null) {
            if (this.LJLJL) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            tuxIconView6.setAlpha(f);
        }
        TuxIconView tuxIconView7 = this.LJLJJI;
        if (tuxIconView7 != null) {
            C16880lQ.LJJJ(tuxIconView7, new ACListenerS36S0200000_1(c71082qe, this, 60));
        }
        View view5 = this.LJLIL;
        if (view5 != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 224), view5);
        }
        TuxIconView tuxIconView8 = this.LJLJI;
        if (tuxIconView8 != null) {
            C16880lQ.LJJJ(tuxIconView8, new ACListenerS36S0200000_1(c71082qe, this, 61));
        }
        c71082qe.LIZJ.LIZ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C779434c c779434c;
        MutableLiveData<ServiceInfo> mutableLiveData;
        super.onAttachedToWindow();
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null && (mutableLiveData = c779434c.LJIIIIZZ) != null) {
            mutableLiveData.observeForever(this.LJLLI);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C779434c c779434c;
        MutableLiveData<ServiceInfo> mutableLiveData;
        super.onDetachedFromWindow();
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && (c779434c = c71082qe.LIZIZ) != null && (mutableLiveData = c779434c.LJIIIIZZ) != null) {
            mutableLiveData.removeObserver(this.LJLLI);
        }
    }

    @Override // X.C34M
    public final void q5(boolean z) {
        TuxIconView tuxIconView;
        int i;
        int i2;
        this.LJLJLJ = z;
        if (this.LJLJL && (tuxIconView = this.LJLJJI) != null) {
            C2068389v c2068389v = new C2068389v();
            if (z) {
                i = R.raw.icon_auto_scroll;
            } else {
                i = R.raw.icon_auto_scroll_off;
            }
            c2068389v.LIZ = i;
            if (this.LJLJL) {
                i2 = R.attr.dk;
            } else {
                i2 = R.attr.dn;
            }
            c2068389v.LJ = Integer.valueOf(i2);
            tuxIconView.setTuxIcon(c2068389v);
        }
    }

    public final void setConnectedDeviceName(String str) {
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(str);
    }

    @Override // X.C34M
    public final void v5(Aweme aweme) {
        this.LJLL = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C781334v(Context context, boolean z) {
        super(context, null, 0);
        boolean z2;
        C34L c34l;
        C34L c34l2;
        new LinkedHashMap();
        boolean z3 = false;
        this.LJLJL = true;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null && (c34l2 = c71082qe.LIZJ) != null) {
            z2 = c34l2.LJ;
        } else {
            z2 = false;
        }
        this.LJLJLJ = z2;
        if (c71082qe != null && (c34l = c71082qe.LIZJ) != null) {
            z3 = c34l.LJFF();
        }
        this.LJLJLLL = z3;
        this.LJLLI = new AObserverS69S0100000_1(this, 139);
        this.LJLJL = z;
        LIZ();
    }
}
