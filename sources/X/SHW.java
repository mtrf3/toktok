package X;

import Y.ACListenerS37S0300000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SHW extends AbstractC28801Bc<C71830SHa, SHX> {
    public final T84 LJLIL;
    public final String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHW(T84 qnaViewHolderClickDelegate, String str) {
        super(SHZ.LIZ);
        o.LJIIIZ(qnaViewHolderClickDelegate, "qnaViewHolderClickDelegate");
        this.LJLIL = qnaViewHolderClickDelegate;
        this.LJLILLLLZI = str;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SHX holder = (SHX) viewHolder;
        o.LJIIIZ(holder, "holder");
        C71830SHa item = getItem(i);
        o.LJIIIIZZ(item, "getItem(position)");
        C71830SHa c71830SHa = item;
        T84 qnaViewHolderClickDelegate = this.LJLIL;
        o.LJIIIZ(qnaViewHolderClickDelegate, "qnaViewHolderClickDelegate");
        holder.LJLJI.setImageURI(UriProtector.parse(c71830SHa.LIZJ));
        C16880lQ.LJJIJLIJ(holder.LJLJI, new ACListenerS37S0300000_12(holder, qnaViewHolderClickDelegate, c71830SHa, 7));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View v = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c9l, viewGroup, false);
        o.LJIIIIZZ(v, "v");
        SHX shx = new SHX(v, this.LJLILLLLZI);
        C0AX.LIZ(viewGroup, shx.itemView, R.id.lj7);
        View view = shx.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (shx.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(SHX.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) shx.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(shx.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = SHX.class.getName();
        return shx;
    }
}
