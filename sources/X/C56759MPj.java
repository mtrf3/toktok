package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MPj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56759MPj extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final Fragment LJLIL;
    public MSP LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public volatile boolean LJLJJL;
    public final MUZ LJLJJLL;

    public final List<MusNotice> getData() {
        return (List) this.LJLJJI.getValue();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return getData().size();
    }

    public C56759MPj(Fragment fragment) {
        boolean z;
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        setHasStableIds(NoticePerfManager.LIZ().enableStableId);
        this.LJLJI = V1B.LJZI(new AqS159S0100000_9(this, 1076));
        this.LJLJJI = V1B.LJZI(MQL.LJLIL);
        C56758MPi c56758MPi = new C56758MPi(this);
        if (INB.LIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJLL = new MUZ(c56758MPi, z);
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return ((MusNotice) ListProtector.get(getData(), i)).getUniqueId();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return C78966Uyw.LJJIIZ((MusNotice) ListProtector.get(getData(), i));
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        MVV mvv;
        BaseNotice baseNotice;
        int LJZ;
        ViewOnClickListenerC56908MVc viewOnClickListenerC56908MVc;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        ML4.LIZIZ();
        if ((holder instanceof ViewOnClickListenerC56908MVc) && (viewOnClickListenerC56908MVc = (ViewOnClickListenerC56908MVc) holder) != null) {
            viewOnClickListenerC56908MVc.onAttached();
        }
        if (!(holder instanceof MVV) || (mvv = (MVV) holder) == null || (baseNotice = mvv.mMTBaseNotice) == null || !NoticePerfManager.LIZ().enableLoadMorePreload || ((NotificationVM) this.LJLJI.getValue()).hv0().LJIIIZ() || !o.LJ(((NotificationVM) this.LJLJI.getValue()).hv0().LJFF().getValue(), Boolean.TRUE) || (LJZ = ORZ.LJZ(baseNotice, getData())) <= 0 || getData().size() - LJZ > 10) {
            return;
        }
        MS5.LJII(C2LN.LJLIL, new AqS175S0100000_9(this, 648));
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        ViewOnClickListenerC56908MVc viewOnClickListenerC56908MVc;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if ((holder instanceof ViewOnClickListenerC56908MVc) && (viewOnClickListenerC56908MVc = (ViewOnClickListenerC56908MVc) holder) != null) {
            viewOnClickListenerC56908MVc.onDetached();
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof C56768MPs) {
            C56768MPs c56768MPs = (C56768MPs) holder;
            c56768MPs.vm = MPZ.LIZ(c56768MPs.LJLIL);
        } else {
            this.LJLJJLL.LJI(holder, i);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c56768MPs;
        o.LJIIIZ(parent, "parent");
        if (i != 9999) {
            if (i != 99999) {
                c56768MPs = this.LJLJJLL.LJII(parent, i);
            } else {
                c56768MPs = new MRF(MUZ.LJ(this.LJLJJLL, R.layout.sn, parent));
            }
        } else {
            c56768MPs = new C56768MPs(MUZ.LJ(this.LJLJJLL, R.layout.sf, parent), this.LJLIL);
        }
        C0AX.LIZ(parent, c56768MPs.itemView, R.id.lj7);
        View view = c56768MPs.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c56768MPs.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c56768MPs.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c56768MPs.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c56768MPs.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c56768MPs.getClass().getName();
        return c56768MPs;
    }
}
