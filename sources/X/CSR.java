package X;

import X.CSF;
import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.api.binder.PublicScreenMetricsLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import uw.s;

/* loaded from: classes6.dex */
public abstract class CSR<MODEL extends s, VH extends CSF<MODEL>> extends AbstractC31414CUo<MODEL, VH> {
    public CQQ LIZIZ;

    public abstract int LJI();

    public LayoutInflater LJII(LayoutInflater layoutInflater) {
        return layoutInflater;
    }

    public String LJIIIIZZ() {
        return "unknown";
    }

    public abstract VH LJIIJJI(View view);

    public final CQQ LJIIIZ() {
        CQQ cqq = this.LIZIZ;
        if (cqq != null) {
            return cqq;
        }
        o.LJIJI("publicScreenContext");
        throw null;
    }

    @Override // X.AbstractC31414CUo
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        CSF holder = (CSF) viewHolder;
        o.LJIIIZ(holder, "holder");
        holder.LJJJJIZL();
    }

    @Override // X.AbstractC31414CUo
    /* renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    public void LIZLLL(VH holder) {
        o.LJIIIZ(holder, "holder");
        holder.onViewAttachedToWindow();
    }

    @Override // X.AbstractC31414CUo
    /* renamed from: LJIILIIL, reason: merged with bridge method [inline-methods] */
    public void LJ(VH holder) {
        o.LJIIIZ(holder, "holder");
        holder.onViewDetachedFromWindow();
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        CSF holder = (CSF) viewHolder;
        CRD item = (CRD) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        LJIIIZ().LJIIJ.LJIL(item);
        item.LJJIFFI().LIZ++;
        item.LJJJJLI();
        holder.L(LJIIIZ(), item);
        item.LJJLL();
        LJIIIZ().LJIIJ.LJJIIJZLJL(item);
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        View LIZIZ;
        PublicScreenMetricsLayout publicScreenMetricsLayout;
        o.LJIIIZ(parent, "parent");
        LJIIIZ().LJIIJ.LJJIL(this);
        LiveUltimateInflateSwitchSetting liveUltimateInflateSwitchSetting = LiveUltimateInflateSwitchSetting.INSTANCE;
        if (liveUltimateInflateSwitchSetting.getValue()) {
            Context context = layoutInflater.getContext();
            o.LJIIIIZZ(context, "inflater.context");
            LIZIZ = C20780ri.LIZIZ(R.layout.bll, context, parent, false);
        } else {
            LIZIZ = CZB.LIZ.LIZIZ(R.layout.bll, parent, false);
        }
        if ((LIZIZ instanceof PublicScreenMetricsLayout) && (publicScreenMetricsLayout = (PublicScreenMetricsLayout) LIZIZ) != null) {
            publicScreenMetricsLayout.setViewBinder(this);
        }
        View findViewById = LIZIZ.findViewById(R.id.bs8);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.container)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        int LJI = LJI();
        LayoutInflater LJII = LJII(layoutInflater);
        if (!o.LJ(LJII, layoutInflater)) {
            viewGroup.addView(C16880lQ.LLLLIILL(LJII, LJI, viewGroup, false));
        } else if (C20780ri.LIZ(LJI) && liveUltimateInflateSwitchSetting.getValue()) {
            C20780ri.LIZJ(LJI, viewGroup, true);
        } else {
            View LJII2 = C20910rv.LIZ.LJII(LJI);
            if (LJII2 == null) {
                LJII2 = C29306Beo.LJIIIIZZ(LJI, parent, false);
            }
            viewGroup.addView(LJII2);
        }
        LJIIIZ().LJIIJ.LJJIJIL(this);
        return LJIIJJI(LIZIZ);
    }

    @Override // X.AbstractC31414CUo
    /* renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public final void LIZIZ(VH holder, MODEL item, List<Object> payloads) {
        C31298CQc LJJIFFI;
        MODEL model;
        C31298CQc LJJIFFI2;
        MODEL model2;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        LJIIIZ().LJIIJ.LJIL(item);
        item.LJJIFFI().LIZIZ = SystemClock.uptimeMillis();
        item.LJJIFFI().LIZ++;
        item.LJJJJLI();
        if (!o.LJ(holder.LJLJI, item) && (model = holder.LJLJI) != null && (LJJIFFI2 = model.LJJIFFI()) != null && LJJIFFI2.LIZLLL > 0 && (model2 = holder.LJLJI) != null) {
            model2.LJII(true);
        }
        if (holder.itemView.isAttachedToWindow() && (LJJIFFI = item.LJJIFFI()) != null && LJJIFFI.LIZLLL == 0) {
            item.onAttach();
        }
        holder.M(LJIIIZ(), item, payloads);
        item.LJJLL();
        item.LJJIFFI().LIZJ = SystemClock.uptimeMillis();
        LJIIIZ().LJIIJ.LJJIIJZLJL(item);
    }
}
