package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Grd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42841Grd extends AbstractC029409q {
    public boolean LJLIL = true;

    public abstract int getBasicItemCount();

    public abstract void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i);

    public abstract RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i);

    @Override // X.AbstractC029409q
    public int getItemCount() {
        if (this.LJLIL) {
            return getBasicItemCount() + 1;
        }
        return getBasicItemCount();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (this.LJLIL && i == getBasicItemCount()) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C42846Gri c42846Gri;
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            C42842Gre c42842Gre = (C42842Gre) viewHolder;
            C42880GsG c42880GsG = (C42880GsG) c42842Gre.itemView;
            c42880GsG.setStatus(c42842Gre.LJLJI.LJLILLLLZI);
            if (c42880GsG.LJLILLLLZI == -1 && (c42846Gri = c42842Gre.LJLJI.LJLJL) != null) {
                c42846Gri.LJIIJJI();
                return;
            }
            return;
        }
        onBindBasicViewHolder(viewHolder, i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        if (Integer.MIN_VALUE == i) {
            AbstractC42840Grc abstractC42840Grc = (AbstractC42840Grc) this;
            C42880GsG c42880GsG = new C42880GsG(viewGroup.getContext(), null);
            c42880GsG.setLayoutParams(new RecyclerView.LayoutParams(-1, viewGroup.getResources().getDimensionPixelSize(R.dimen.lj)));
            TextView textView = (TextView) C16880lQ.LLLZIIL(R.layout.dsp, C16880lQ.LLZIL(viewGroup.getContext()), null);
            abstractC42840Grc.LJLJI = textView;
            textView.setGravity(17);
            TextView textView2 = (TextView) C16880lQ.LLLZIIL(R.layout.cr9, C16880lQ.LLZIL(viewGroup.getContext()), null);
            textView2.setText(R.string.hve);
            textView2.setGravity(17);
            C42881GsH LIZ = C42881GsH.LIZ(viewGroup.getContext());
            TextView textView3 = abstractC42840Grc.LJLJI;
            LIZ.LIZJ = textView3;
            textView3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            LIZ.LIZLLL = textView2;
            textView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            c42880GsG.setBuilder(LIZ);
            C42842Gre c42842Gre = new C42842Gre(abstractC42840Grc, c42880GsG, textView2);
            abstractC42840Grc.LJLJJLL = c42842Gre;
            viewHolder = c42842Gre;
        } else {
            viewHolder = onCreateBasicViewHolder(viewGroup, i);
        }
        C0AX.LIZ(viewGroup, viewHolder.itemView, R.id.lj7);
        View view = viewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }
}
