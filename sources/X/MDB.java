package X;

import Y.ACListenerS29S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notification.bean.UnSubscribeSettingsData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MDB extends AbstractC029409q<MDD> {
    public GroupUnsubscribeSetting LJLILLLLZI;
    public List<UnSubscribeSettingsData> LJLJI;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(MDA.LJLIL);
    public final ACListenerS29S0100000_9 LJLJJI = new ACListenerS29S0100000_9(this, 208);

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<UnSubscribeSettingsData> list = this.LJLJI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        ((C73318Sq2) this.LJLIL.getValue()).LIZLLL();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(MDD mdd, int i) {
        UnSubscribeSettingsData unSubscribeSettingsData;
        boolean z;
        MDD holder = mdd;
        o.LJIIIZ(holder, "holder");
        List<UnSubscribeSettingsData> list = this.LJLJI;
        if (list != null && (unSubscribeSettingsData = (UnSubscribeSettingsData) ListProtector.get(list, i)) != null) {
            holder.LJLIL = unSubscribeSettingsData;
            holder.LJLILLLLZI = i;
            Object value = holder.LJLJI.getValue();
            o.LJIIIIZZ(value, "<get-tvName>(...)");
            ((TextView) value).setText(unSubscribeSettingsData.labelTitle);
            C221018lt.LJFF("SNSettingCategoryViewHolder", "updateTuxSwitch");
            Object value2 = holder.LJLJJI.getValue();
            o.LJIIIIZZ(value2, "<get-tuxSwitch>(...)");
            ARV arv = (ARV) value2;
            UnSubscribeSettingsData unSubscribeSettingsData2 = holder.LJLIL;
            if (unSubscribeSettingsData2 != null && unSubscribeSettingsData2.isUnsubscribe) {
                z = true;
            } else {
                z = false;
            }
            arv.setChecked(!z);
        }
    }

    @Override // X.AbstractC029409q
    public final MDD onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.u0, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        MDD mdd = new MDD(itemView);
        ACListenerS29S0100000_9 listener = this.LJLJJI;
        o.LJIIIZ(listener, "listener");
        Object value = mdd.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-tuxSwitch>(...)");
        ((View) value).setOnClickListener(new ViewOnClickListenerC13880ga(listener));
        Object value2 = mdd.LJLJJI.getValue();
        o.LJIIIIZZ(value2, "<get-tuxSwitch>(...)");
        ((View) value2).setTag(mdd);
        C0AX.LIZ(viewGroup, mdd.itemView, R.id.lj7);
        View view = mdd.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (mdd.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(MDD.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) mdd.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(mdd.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = MDD.class.getName();
        return mdd;
    }
}
