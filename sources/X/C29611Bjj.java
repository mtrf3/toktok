package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Bjj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29611Bjj extends AbstractC31183CLr {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        View view;
        InterfaceC31167CLb interfaceC31167CLb = (InterfaceC31167CLb) xBaseParamModel;
        o.LJIIIZ(type, "type");
        Object fromJson = GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, interfaceC31167CLb.getUser(), (Class<Object>) User.class);
        o.LJIIIIZZ(fromJson, "get().fromJson(params.user, User::class.java)");
        User user = (User) fromJson;
        int pushStatus = (int) user.getFollowInfo().getPushStatus();
        C28486BFy c28486BFy = new C28486BFy();
        c28486BFy.LIZIZ = String.valueOf(user.getId());
        c28486BFy.LIZJ = "jsb";
        c28486BFy.LIZLLL = "live_cell";
        for (Map.Entry<String, Object> entry : interfaceC31167CLb.getLogInfo().entrySet()) {
            java.util.Map<String, String> map = c28486BFy.LJ;
            o.LJIIIIZZ(map, "config.extras");
            ((HashMap) map).put(entry.getKey(), entry.getValue().toString());
        }
        if (((int) user.getFollowInfo().getFollowStatus()) == 3) {
            user.getFollowInfo().setFollowStatus(0L);
        }
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        int followStatus = (int) user.getFollowInfo().getFollowStatus();
        String LIZLLL = C05170If.LIZLLL(user);
        String valueOf = String.valueOf(user.getId());
        String LIZ = C05170If.LIZ(user);
        String secUid = user.getSecUid();
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            view = interfaceC38263Ezz.getView();
        } else {
            view = null;
        }
        iHostAction.showNotificationTipDialog(followStatus, LIZLLL, valueOf, LIZ, secUid, pushStatus, view, "", c28486BFy, true, new C31184CLs(this, c37356ElM));
    }
}
