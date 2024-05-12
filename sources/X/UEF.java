package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab;

/* loaded from: classes14.dex */
public final class UEF extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final /* synthetic */ UEJ LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int i;
        List<RealtimeLiveCenterLayoutTab> list = this.LJLIL.LJLJLJ;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        return i + 4;
    }

    public UEF(UEJ uej) {
        this.LJLIL = uej;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        String str;
        RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab;
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            if (i != 3) {
                List<RealtimeLiveCenterLayoutTab> list = this.LJLIL.LJLJLJ;
                if (list != null && (realtimeLiveCenterLayoutTab = (RealtimeLiveCenterLayoutTab) ListProtector.get(list, i - 4)) != null) {
                    str = realtimeLiveCenterLayoutTab.layoutName;
                } else {
                    str = null;
                }
                if (o.LJ(str, "punish_records")) {
                    return 5;
                }
                return 0;
            }
            return 4;
        }
        return 2;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        UED ued;
        o.LJIIIZ(holder, "holder");
        if ((holder instanceof UED) && (ued = (UED) holder) != null) {
            ued.L(i);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder ueo;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            ueo = new UEH(this, C29306Beo.LJIIIIZZ(R.layout.db9, parent, false));
                        } else {
                            ueo = new UEI(this, C29306Beo.LJIIIIZZ(R.layout.db_, parent, false));
                        }
                    } else {
                        ueo = new UEG(this, C20910rv.LJI(R.layout.dbd, parent, false, 12));
                    }
                } else {
                    ueo = new UEC(this, C20910rv.LJI(R.layout.db8, parent, false, 12));
                }
            } else {
                ueo = new UEE(this, C29306Beo.LJIIIIZZ(R.layout.dbc, parent, false));
            }
        } else {
            ueo = new UEO(C29306Beo.LJIIIIZZ(R.layout.dbe, parent, false));
        }
        C0AX.LIZ(parent, ueo.itemView, R.id.lj7);
        View view = ueo.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (ueo.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ueo.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) ueo.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(ueo.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ueo.getClass().getName();
        return ueo;
    }
}
