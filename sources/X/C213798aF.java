package X;

import Y.ACListenerS23S0100000_3;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notification.SystemNotificationUnsubscribeSettingFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8aF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213798aF extends AbstractC029409q<C213808aG> {
    public final Fragment LJLIL;
    public List<GroupUnsubscribeSetting> LJLILLLLZI;
    public final ACListenerS23S0100000_3 LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<GroupUnsubscribeSetting> list = this.LJLILLLLZI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C213798aF(SystemNotificationUnsubscribeSettingFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        this.LJLJI = new ACListenerS23S0100000_3(this, 335);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C213808aG c213808aG, int i) {
        GroupUnsubscribeSetting groupUnsubscribeSetting;
        C213808aG holder = c213808aG;
        o.LJIIIZ(holder, "holder");
        List<GroupUnsubscribeSetting> list = this.LJLILLLLZI;
        if (list != null && (groupUnsubscribeSetting = (GroupUnsubscribeSetting) ListProtector.get(list, i)) != null) {
            Activity topActivity = ActivityStack.getTopActivity();
            o.LJIIIIZZ(topActivity, "getTopActivity()");
            if (AnonymousClass636.LJIILJJIL(topActivity)) {
                Object value = holder.LJLIL.getValue();
                o.LJIIIIZZ(value, "<get-ivIcon>(...)");
                C78765Uvh.LJFF((C62846OlW) value, groupUnsubscribeSetting.imageUrlDark);
            } else {
                Object value2 = holder.LJLIL.getValue();
                o.LJIIIIZZ(value2, "<get-ivIcon>(...)");
                C78765Uvh.LJFF((C62846OlW) value2, groupUnsubscribeSetting.imageUrl);
            }
            Object value3 = holder.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value3, "<get-tvName>(...)");
            ((TextView) value3).setText(groupUnsubscribeSetting.name);
            holder.itemView.setTag(Integer.valueOf(i));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C213808aG com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.u2, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C213808aG c213808aG = new C213808aG(itemView);
        ACListenerS23S0100000_3 listener = this.LJLJI;
        o.LJIIIZ(listener, "listener");
        C16880lQ.LJIIJ(listener, c213808aG.itemView);
        C0AX.LIZ(viewGroup, c213808aG.itemView, R.id.lj7);
        View view = c213808aG.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c213808aG.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C213808aG.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c213808aG.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c213808aG.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C213808aG.class.getName();
        return c213808aG;
    }
}
