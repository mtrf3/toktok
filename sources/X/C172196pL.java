package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.AqS91S0300000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6pL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172196pL extends AbstractC029409q<C172216pN> {
    public final C172206pM LJLIL;
    public final InterfaceC88471Ynr<MediaItem, Integer, C76800UCe> LJLILLLLZI;
    public final List<MediaItem> LJLJI;
    public final java.util.Set<Integer> LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C172216pN c172216pN, int i) {
        C172216pN holder = c172216pN;
        o.LJIIIZ(holder, "holder");
        MediaItem mediaItem = (MediaItem) ListProtector.get(this.LJLJI, i);
        android.net.Uri M = mediaItem.M();
        if (o.LJ(M, android.net.Uri.EMPTY)) {
            holder.itemView.findViewById(R.id.l6z).setTag(R.id.l6z, null);
            ((ImageView) holder.itemView.findViewById(R.id.l6z)).setImageResource(0);
        } else if (!o.LJ(holder.itemView.findViewById(R.id.l6z).getTag(R.id.l6z), M)) {
            holder.itemView.findViewById(R.id.l6z).setTag(R.id.l6z, M);
            C172206pM c172206pM = this.LJLIL;
            Context context = holder.itemView.getContext();
            o.LJIIIIZZ(context, "holder.itemView.context");
            C173656rh c173656rh = (C173656rh) holder.itemView.findViewById(R.id.l6z);
            o.LJIIIIZZ(c173656rh, "holder.itemView.thumb");
            c172206pM.LIZ(context, M, c173656rh, holder.itemView.getMeasuredWidth(), holder.itemView.getMeasuredHeight());
        }
        holder.itemView.findViewById(R.id.cje).setVisibility(8);
        if (this.LJLJJI.contains(Integer.valueOf(i))) {
            holder.itemView.findViewById(R.id.hvl).setVisibility(0);
        } else {
            holder.itemView.findViewById(R.id.hvl).setVisibility(4);
        }
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C16880lQ.LJIIJ(new C59798NdS(new AqS91S0300000_2(mediaItem, this, holder, 17)), view);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, X.6pN] */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C172216pN com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(final ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        ?? r2 = new RecyclerView.ViewHolder(parent) { // from class: X.6pN
            {
                super(C06490Nh.LIZIZ(parent, "parent", R.layout.awa, parent, false));
            }
        };
        C0AX.LIZ(parent, r2.itemView, R.id.lj7);
        View view = r2.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (r2.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C172216pN.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) r2.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(r2.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C172216pN.class.getName();
        return r2;
    }

    public C172196pL(C172206pM c172206pM, List list, AqS184S0100000_2 aqS184S0100000_2) {
        this.LJLIL = c172206pM;
        this.LJLILLLLZI = aqS184S0100000_2;
        ArrayList arrayList = new ArrayList();
        this.LJLJI = arrayList;
        this.LJLJJI = new LinkedHashSet();
        arrayList.addAll(list);
        c172206pM.LIZIZ(new AqS168S0100000_2(this, 650));
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C172216pN holder, int i, List payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (!payloads.isEmpty()) {
            for (Object obj : payloads) {
                if (o.LJ(obj, 0)) {
                    if (this.LJLJJI.contains(Integer.valueOf(i))) {
                        holder.itemView.findViewById(R.id.hvl).setVisibility(0);
                    } else {
                        holder.itemView.findViewById(R.id.hvl).setVisibility(4);
                    }
                } else if (o.LJ(obj, 1)) {
                    android.net.Uri M = ((MediaItem) ListProtector.get(this.LJLJI, i)).M();
                    if (o.LJ(M, android.net.Uri.EMPTY)) {
                        holder.itemView.findViewById(R.id.l6z).setTag(R.id.l6z, null);
                        ((ImageView) holder.itemView.findViewById(R.id.l6z)).setImageResource(0);
                    } else {
                        holder.itemView.findViewById(R.id.l6z).setTag(R.id.l6z, M);
                        C172206pM c172206pM = this.LJLIL;
                        Context context = holder.itemView.getContext();
                        o.LJIIIIZZ(context, "holder.itemView.context");
                        C173656rh c173656rh = (C173656rh) holder.itemView.findViewById(R.id.l6z);
                        o.LJIIIIZZ(c173656rh, "holder.itemView.thumb");
                        c172206pM.LIZ(context, M, c173656rh, holder.itemView.getMeasuredWidth(), holder.itemView.getMeasuredHeight());
                    }
                }
            }
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
