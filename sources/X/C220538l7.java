package X;

import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;

/* renamed from: X.8l7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C220538l7 extends AbstractC208678Gx {
    public final Context LJLJLJ;
    public final String LJLJLLL;
    public final ViewGroup LJLL;
    public final C62846OlW LJLLI;
    public final TextView LJLLILLLL;
    public final TextView LJLLJ;
    public final TuxTextView LJLLL;
    public final TuxTextView LJLLLL;
    public final SmartImageView LJLLLLLL;
    public final TuxTextView LJLZ;
    public final TextView LJZ;
    public final TuxTextView LJZI;
    public final TuxTextView LJZL;
    public final TuxIconView LL;
    public final View LLD;
    public InterfaceC207258Bl LLF;
    public final MH9 LLFF;
    public final View LLFFF;

    public boolean c0() {
        return this instanceof C220628lG;
    }

    public void i0() {
    }

    @Override // X.MFR
    public final void LLZLLLL() {
        Video video;
        Aweme aweme = this.LJLIL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            if (U(video, "DetailAwemeViewHolder")) {
                this.LJLJI = true;
            } else {
                T(video.getCover(), "DetailAwemeViewHolder", null, null);
            }
        }
    }

    @Override // X.AbstractC208468Gc
    public final int[] P() {
        return J7H.LIZ(200);
    }

    @Override // X.AbstractC208678Gx
    public final void Y() {
        Video video;
        Aweme aweme = this.LJLIL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            if (C248339or.LIZ() && c0()) {
                if (V(video, "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888, N())) {
                    this.LJLJI = true;
                    return;
                } else {
                    T(video.getCover(), "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888, null);
                    return;
                }
            }
            if (U(video, "DetailAwemeViewHolder")) {
                this.LJLJI = true;
            } else {
                T(video.getCover(), "DetailAwemeViewHolder", null, null);
            }
        }
    }

    public final void f0() {
        InterfaceC207258Bl LJI = C8SG.LIZIZ.LJI(this.LJLL);
        this.LLF = LJI;
        LJI.LIZ(this.LJLLILLLL);
        this.LLF.LIZ(this.LJLLJ);
        this.LLF.LIZ(this.LJLLL);
        this.LLF.LIZ(this.LJZ);
        this.LLF.LIZ(this.LJLLI);
        this.LLF.LIZ(this.LJLLLL);
    }

    public static final void h0(TextView textView, AwemeTextLabelModel awemeTextLabelModel) {
        if (TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(awemeTextLabelModel.getLabelName());
        textView.setTextSize(0, C17N.LJIILL(12.0d));
        textView.setTextColor(ColorProtector.parseColor(awemeTextLabelModel.getTextColor()));
        textView.setBackground(C27740Aue.LIZJ(C17N.LJIILL(2.0d), ColorProtector.parseColor(awemeTextLabelModel.getBgColor())));
        textView.setSingleLine();
    }

    public void g0(View view, MH9 mh9) {
        mh9.LLLILZ(view, this.LJLIL, this.LJLJLLL);
    }

    public C220538l7(View view, String str, MH9 mh9) {
        super(view);
        this.LJLJLJ = view.getContext();
        this.LJLJLLL = str;
        this.LLFF = mh9;
        this.LJLL = (ViewGroup) view.findViewById(R.id.bs8);
        this.LJLILLLLZI = (SmartImageView) view.findViewById(R.id.cover);
        this.LJLLI = (C62846OlW) view.findViewById(R.id.f1m);
        this.LJZ = (TextView) view.findViewById(R.id.l03);
        this.LJLLJ = (TextView) view.findViewById(R.id.fab);
        this.LJLLL = (TuxTextView) view.findViewById(R.id.fad);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.f26);
        this.LJLLLL = tuxTextView;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.d65);
        this.LJLLLLLL = smartImageView;
        smartImageView.setVisibility(8);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.d69);
        this.LJLZ = tuxTextView2;
        tuxTextView2.setVisibility(8);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS38S0200000_3(mh9, this, 19));
        this.LJLLILLLL = (TextView) view.findViewById(R.id.fb0);
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.fr4);
        this.LJZI = tuxTextView3;
        tuxTextView3.setVisibility(8);
        TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.n_q);
        this.LJZL = tuxTextView4;
        tuxTextView4.setVisibility(8);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.n_r);
        this.LL = tuxIconView;
        tuxIconView.setVisibility(8);
        View findViewById = view.findViewById(R.id.n54);
        this.LLD = findViewById;
        findViewById.setVisibility(8);
        View findViewById2 = view.findViewById(R.id.aqh);
        this.LLFFF = findViewById2;
        findViewById2.setVisibility(8);
        C16880lQ.LJJIJLIJ(this.LJLILLLLZI, new ACListenerS38S0200000_3(mh9, this, 20));
        this.LJLILLLLZI.setAnimationListener(this.LJLJL);
    }

    @Override // X.AbstractC208678Gx
    public final void X(Aweme aweme, int i, boolean z, Bundle bundle) {
        a0(aweme, i, z, bundle);
    }

    public void a0(Aweme aweme, int i, boolean z, Bundle bundle) {
        bind(aweme, i);
        this.LJLILLLLZI.setContentDescription("");
        this.LJLIL = aweme;
        if (aweme == null) {
            return;
        }
        if (aweme.isForMusicDetailLoading()) {
            i0();
        }
        if (z) {
            Y();
        }
        InterfaceC207258Bl interfaceC207258Bl = this.LLF;
        if (interfaceC207258Bl != null) {
            interfaceC207258Bl.LIZIZ(aweme);
        }
        this.LJLLI.setVisibility(4);
        this.LJLLILLLL.setVisibility(8);
        this.LJLLJ.setVisibility(8);
        this.LJLLL.setVisibility(8);
        this.LJLLLL.setVisibility(8);
        this.LLFFF.setVisibility(8);
        C45804HyK.LJJLIIIJILLIZJL(this.LLD, this.LJLIL);
        this.LJZ.setVisibility(8);
        C45804HyK.LJJLIIIJILLIZJL(this.LJZ, aweme);
    }
}
