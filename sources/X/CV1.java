package X;

import Y.ACListenerS40S0200000_5;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CV1 extends CUF<C31358CSk, CTR> {
    public final V2J LLIIIILZ;
    public final ViewGroup LLIIIJ;
    public final ViewGroup LLIIIL;
    public final View LLIIIZ;
    public final C31538CZi LLIIJI;

    @Override // X.CUF
    public final Drawable f0() {
        return null;
    }

    @Override // X.CUH
    public final String a0() {
        PINNED_MODEL pinned_model = this.LJLILLLLZI;
        if (pinned_model != 0 && pinned_model.LIZ != 0) {
            return "live_star_comment";
        }
        return "";
    }

    @Override // X.CUH
    public final String U() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(' ');
        LIZ.append(C15380j0.LJIILJJIL(R.string.o5d));
        return X1D.LIZIZ(LIZ);
    }

    public CV1(View view, CQQ cqq) {
        super(view, cqq, false);
        C04D c04d = (C04D) view.findViewById(R.id.ant);
        if (c04d != null) {
            c04d.setViewCompositionStrategy(C283619k.LIZIZ);
        }
        AbstractC72775ShH abstractC72775ShH = (AbstractC72775ShH) view.findViewById(R.id.k1z);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(2);
        valueAnimator.setIntValues(abstractC72775ShH.getPlaceholderColor(), abstractC72775ShH.getPulsingColor());
        valueAnimator.setEvaluator(new ArgbEvaluator());
        abstractC72775ShH.setAnimator(valueAnimator);
        View findViewById = view.findViewById(R.id.ant);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.border_view)");
        this.LLIIIILZ = (V2J) findViewById;
        this.LLIIIJ = (ViewGroup) view.findViewById(R.id.btg);
        this.LLIIIL = (ViewGroup) view.findViewById(R.id.k1z);
        View findViewById2 = view.findViewById(R.id.c6i);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.delete_pin)");
        this.LLIIIZ = findViewById2;
        View findViewById3 = view.findViewById(R.id.l3u);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.text_countdown)");
        this.LLIIJI = (C31538CZi) findViewById3;
    }

    @Override // X.CUF, X.CUH, X.CUL
    public final void M(CSH csh, List payloads) {
        DataChannel dataChannel;
        CZZ czz;
        CTR pinnedModel = (CTR) csh;
        o.LJIIIZ(pinnedModel, "pinnedModel");
        o.LJIIIZ(payloads, "payloads");
        if ((!payloads.isEmpty()) && o.LJ(ListProtector.get(payloads, 0), 2) && ((CVC) pinnedModel.LIZ.LJIJJLI).LJLLI == CZV.DISPLAYING) {
            if (g0().getVisibility() == 0) {
                T().LIZIZ().LJIILLIIL();
                g0().setVisibility(8);
            }
            this.LLIIJI.setVisibility(0);
            C31538CZi c31538CZi = this.LLIIJI;
            CVC cvc = (CVC) pinnedModel.LIZ.LJIJJLI;
            c31538CZi.LIZ(cvc.LJLJJLL, cvc.LJLJLLL);
            return;
        }
        show();
        if (((CVC) pinnedModel.LIZ.LJIJJLI).LJLJJLL == 20) {
            this.LLIIIILZ.setGear(EnumC31545CZp.HIGH);
        } else {
            this.LLIIIILZ.setGear(EnumC31545CZp.LOW);
        }
        this.LLIIIILZ.m44setBackgroundColor8_81llA(C78897Uxp.LIZLLL(1291845632));
        if (((CVC) pinnedModel.LIZ.LJIJJLI).LJLLI == CZV.BLANK) {
            this.LLII = false;
            this.LLIIIL.setVisibility(0);
            this.LLIIIJ.setVisibility(8);
            return;
        }
        this.LLII = true;
        this.LLIIIL.setVisibility(8);
        this.LLIIIJ.setVisibility(0);
        super.M(pinnedModel, payloads);
        if (((CVC) pinnedModel.LIZ.LJIJJLI).LJLLI == CZV.SELF_WAITING) {
            this.LLIIJI.setVisibility(8);
            g0().setVisibility(0);
            g0().setBadges(C47261Igj.LJJIJIL(T()));
            T().LJIIIIZZ();
        } else {
            this.LLIIJI.setVisibility(0);
            C31538CZi c31538CZi2 = this.LLIIJI;
            CVC cvc2 = (CVC) pinnedModel.LIZ.LJIJJLI;
            c31538CZi2.LIZ(cvc2.LJLJJLL, cvc2.LJLJLLL);
        }
        CQQ cqq = this.LJLIL;
        if (cqq == null || (dataChannel = cqq.LJIIIIZZ) == null || (czz = (CZZ) dataChannel.kv0(CV2.class)) == null) {
            return;
        }
        if (czz.LIZ() == 1 || czz.LIZ() == 2) {
            this.LLIIIZ.setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS40S0200000_5(pinnedModel, this, 87), this.LLIIIZ);
        } else {
            this.LLIIIZ.setVisibility(8);
        }
    }
}
