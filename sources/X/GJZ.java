package X;

import Y.ACListenerS33S0300000_7;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.login.twostep.Device;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GJZ extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<Device> LJLIL;
    public final InterfaceC41308GJc LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size() + 1;
    }

    public GJZ(List list, GHU ghu) {
        this.LJLIL = list;
        this.LJLILLLLZI = ghu;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder p0, int i) {
        String str;
        o.LJIIIZ(p0, "p0");
        if (p0 instanceof C41306GJa) {
            C41306GJa c41306GJa = (C41306GJa) p0;
            Device device = (Device) ListProtector.get(c41306GJa.LJLJJI.LJLIL, c41306GJa.getAdapterPosition() - 1);
            TextView textView = c41306GJa.LJLILLLLZI;
            String device_name = device.getDevice_name();
            if (device_name == null) {
                device_name = "";
            }
            textView.setText(device_name);
            String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            Long device_id = device.getDevice_id();
            if (device_id != null) {
                str = device_id.toString();
            } else {
                str = null;
            }
            if (TextUtils.equals(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, str) && !TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                c41306GJa.LJLJI.setVisibility(0);
            } else {
                c41306GJa.LJLJI.setVisibility(8);
            }
            C16880lQ.LJIIJ(new ACListenerS33S0300000_7(c41306GJa.LJLJJI, c41306GJa, device, 3), c41306GJa.LJLIL);
        }
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup p0, int i) {
        RecyclerView.ViewHolder c41306GJa;
        o.LJIIIZ(p0, "p0");
        if (i == 0) {
            c41306GJa = new C41307GJb(C1FL.LIZIZ(p0, R.layout.m4, p0, false, "from(p0.context).inflate…device_header, p0, false)"));
        } else {
            c41306GJa = new C41306GJa(this, C1FL.LIZIZ(p0, R.layout.m5, p0, false, "from(p0.context).inflate…d_device_item, p0, false)"));
        }
        C0AX.LIZ(p0, c41306GJa.itemView, R.id.lj7);
        View view = c41306GJa.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(p0));
        }
        try {
            if (c41306GJa.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c41306GJa.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(p0.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c41306GJa.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c41306GJa.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c41306GJa.getClass().getName();
        return c41306GJa;
    }
}
