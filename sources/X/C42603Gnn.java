package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gnn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42603Gnn extends AbstractC029409q<C42604Gno> {
    public final List<? extends MediaModel> LJLIL;
    public final InterfaceC88472Yns<MediaModel, C76800UCe> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C42603Gnn(InterfaceC88472Yns onItemClickListener, List dataList) {
        o.LJIIIZ(dataList, "dataList");
        o.LJIIIZ(onItemClickListener, "onItemClickListener");
        this.LJLIL = dataList;
        this.LJLILLLLZI = onItemClickListener;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C42604Gno c42604Gno, int i) {
        C42604Gno holder = c42604Gno;
        o.LJIIIZ(holder, "holder");
        MediaModel mediaModel = (MediaModel) ListProtector.get(this.LJLIL, i);
        holder.LJLJJI = mediaModel;
        if (mediaModel != null) {
            holder.LJLJJL = C42606Gnq.LIZ(holder.LJLJI, mediaModel, holder.LJLJJLL, new AqS173S0100000_7(holder, 129));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C42604Gno com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bc3, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C42604Gno c42604Gno = new C42604Gno(itemView, this, this.LJLILLLLZI);
        C0AX.LIZ(viewGroup, c42604Gno.itemView, R.id.lj7);
        View view = c42604Gno.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c42604Gno.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C42604Gno.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c42604Gno.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c42604Gno.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C42604Gno.class.getName();
        return c42604Gno;
    }
}
