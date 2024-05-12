package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import Y.AfS57S0100000_5;
import Y.IDuS76S0200000_5;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SubAdminPermission;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public class CDE extends CDI {
    public final ViewGroup LJLIL;
    public final LinearLayout LJLILLLLZI;
    public final C47121t6 LJLJI;
    public final LiveIconView LJLJJI;
    public final /* synthetic */ CDG LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDE(CDG cdg, ViewGroup parent) {
        super(C1FL.LIZIZ(parent, R.layout.dh6, parent, false, "from(parent.context).inf… parent, false,\n        )"));
        o.LJIIIZ(parent, "parent");
        this.LJLJJL = cdg;
        this.LJLIL = parent;
        this.LJLILLLLZI = (LinearLayout) this.itemView.findViewById(R.id.hlm);
        this.LJLJI = (C47121t6) this.itemView.findViewById(R.id.m3x);
        this.LJLJJI = (LiveIconView) this.itemView.findViewById(R.id.ay8);
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        Boolean bool;
        SubAdminPermission subAdminPermission;
        o.LJIIIZ(holder, "holder");
        LiveIconView liveIconView = this.LJLJJI;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this.LJLJJL, 352));
        }
        GetSubPrivilegeDetailResponse.Data data = this.LJLJJL.LJLJI;
        if (data != null && (subAdminPermission = data.adminPermission) != null) {
            bool = Boolean.valueOf(subAdminPermission.allowPinPerk);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            C47121t6 c47121t6 = this.LJLJI;
            if (c47121t6 != null) {
                c47121t6.setVisibility(0);
            }
            C47121t6 c47121t62 = this.LJLJI;
            if (c47121t62 != null) {
                C16880lQ.LJJIIZ(c47121t62, new ACListenerS40S0200000_5(this, this.LJLJJL, 59));
            }
        }
        AbstractC73672Svk.LJIIJ(new IDuS76S0200000_5(this.LJLJJL, this, 6)).LJII(new C62705OjF()).LJJJLIIL(new AfS57S0100000_5(this, BuildConfig.VERSION_CODE), CDF.LJLIL);
    }
}
