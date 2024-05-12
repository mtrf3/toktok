package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* loaded from: classes10.dex */
public final class LG2 extends FrameLayout implements InterfaceC54013LHt {
    public final ISocialTabProtocol LJLIL;
    public View LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public View LJLJJL;
    public int LJLJJLL;

    @Override // X.InterfaceC54013LHt
    public final void LLLIIIIL() {
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.dm);
        }
        TuxTextView tuxTextView2 = this.LJLJJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        View view = this.LJLJJL;
        if (view != null) {
            C17N.LJJIIJZLJL(view);
        }
    }

    @Override // X.InterfaceC54013LHt
    public final boolean LLLIIIL() {
        View view = this.LJLILLLLZI;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC54013LHt
    public final void LLLIILIL() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            C17N.LJJLIIIJJI(view);
        }
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            C17N.LJJIIJZLJL(tuxTextView);
        }
    }

    @Override // X.InterfaceC54013LHt
    public final boolean LLLIL() {
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView == null || tuxTextView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC54013LHt
    public final void LLLILZJ() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            C17N.LJJIIJZLJL(view);
        }
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            C17N.LJJIIJZLJL(tuxTextView);
        }
        this.LJLJJLL = 0;
    }

    @Override // X.InterfaceC54013LHt
    public final String tag() {
        return this.LJLIL.getTag();
    }

    @Override // X.InterfaceC54013LHt
    public final void LLLILZ() {
        LLLILZJ();
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.dj);
        }
        if (!C53219Kud.LIZ && o.LJ(this.LJLIL.getTag(), "FRIENDS_FEED")) {
            TuxTextView tuxTextView2 = this.LJLJJI;
            if (tuxTextView2 != null) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_info_circle;
                c2068389v.LIZIZ = C7MY.LIZIZ(14);
                c2068389v.LIZJ = C7MY.LIZIZ(14);
                c2068389v.LIZLLL = C72972SkS.LIZJ(tuxTextView2, "context", R.attr.dj);
                Context context = tuxTextView2.getContext();
                o.LJIIIIZZ(context, "context");
                tuxTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, c2068389v.LIZ(context), (Drawable) null);
                tuxTextView2.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
            }
            View view = this.LJLJJL;
            if (view != null) {
                C17N.LJJLIIIJJI(view);
                C16880lQ.LJIIJ(new IDaS484S0100000_4(view, 16), view);
            }
        }
    }

    @Override // X.InterfaceC54013LHt
    public final boolean LLLILZLLLI() {
        if (LLLIIIL() || LLLIL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54013LHt
    public int getDotCount() {
        return this.LJLJJLL;
    }

    public final ISocialTabProtocol getProtocol() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC54013LHt
    public final void LLLIIL(int i) {
        if (i > 99) {
            i = 99;
        } else if (i <= 0) {
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView != null) {
                C17N.LJJIIJZLJL(tuxTextView);
            }
            this.LJLJJLL = 0;
            return;
        }
        TuxTextView tuxTextView2 = this.LJLJI;
        if (tuxTextView2 != null) {
            C17N.LJJLIIIJJI(tuxTextView2);
        }
        TuxTextView tuxTextView3 = this.LJLJI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(String.valueOf(i));
        }
        this.LJLJJLL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LG2(Context context, ISocialTabProtocol protocol) {
        super(context);
        o.LJIIIZ(protocol, "protocol");
        new LinkedHashMap();
        this.LJLIL = protocol;
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null || !FriendsTabPerfOptPhase2.LIZ().viewInflateOpt || C16970lZ.LIZJ(R.layout.cmy, LJIJJ, this, true) == null) {
            C16880lQ.LLLZIIL(R.layout.cmy, C16880lQ.LLZIL(context), this);
        }
        this.LJLILLLLZI = findViewById(R.id.kyh);
        this.LJLJI = (TuxTextView) findViewById(R.id.mme);
        this.LJLJJI = (TuxTextView) findViewById(R.id.kza);
        this.LJLJJL = findViewById(R.id.doe);
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            Context context2 = tuxTextView.getContext();
            o.LJIIIIZZ(context2, "context");
            tuxTextView.setText(protocol.w0(context2));
            tuxTextView.setTextSize(1, 17.0f);
            tuxTextView.setTextColorRes(R.attr.dj);
        }
    }
}
