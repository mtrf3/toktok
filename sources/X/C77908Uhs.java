package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.IMultiAccountService;
import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Uhs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77908Uhs extends AbstractC77909Uht {
    public final IMultiAccountService LJLJJL;
    public final RBW LJLJJLL;

    public C77908Uhs() {
        IMultiAccountService LJ = MultiAccountService.LJ();
        o.LJIIIIZZ(LJ, "get().getService(IMultiAccountService::class.java)");
        RBW userManager = RBW.LJLLI;
        o.LJIIIZ(userManager, "userManager");
        this.LJLJJL = LJ;
        this.LJLJJLL = userManager;
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String str;
        String str2;
        InterfaceC77910Uhu interfaceC77910Uhu = (InterfaceC77910Uhu) xBaseParamModel;
        o.LJIIIZ(type, "type");
        AqS144S0200000_13 aqS144S0200000_13 = new AqS144S0200000_13(c37356ElM, this, 41);
        Activity LJI = C79043V0l.LJI(this);
        if (LJI == null || !(LJI instanceof ActivityC45651qj)) {
            aqS144S0200000_13.invoke("Current Activity should be a non-null FragmentActivity.");
            return;
        }
        if (AV1.LJIILLIIL()) {
            aqS144S0200000_13.invoke("This JS Bridge cannot be triggered under the kids mode.");
            return;
        }
        this.LJLJJLL.getClass();
        List<String> LIZIZ = UserStore.LIZIZ();
        ArrayList arrayList = new ArrayList();
        for (String str3 : LIZIZ) {
            this.LJLJJLL.getClass();
            SignificantUserInfo LJIIJ = RBW.LJIIJ(str3);
            if (LJIIJ != null) {
                arrayList.add(LJIIJ);
            }
        }
        int size = arrayList.size();
        this.LJLJJL.LIZ();
        if (size > 8) {
            aqS144S0200000_13.invoke("Cannot login due to logged in account count reaches max limit.");
            return;
        }
        C40883G2t c40883G2t = new C40883G2t();
        c40883G2t.LIZJ("js_bridge_initiated", true);
        c40883G2t.LIZLLL("launch_webview_after_restart_url", interfaceC77910Uhu.getCallbackUrl());
        Bundle bundle = (Bundle) c40883G2t.LIZ;
        for (Map.Entry<String, Object> entry : interfaceC77910Uhu.getLoginContext().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                bundle.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof String) {
                bundle.putString(key, (String) value);
            }
        }
        C77906Uhq c77906Uhq = new C77906Uhq(c37356ElM, this);
        Object obj = interfaceC77910Uhu.getLoginContext().get("enter_from");
        if (obj == null || !(obj instanceof String)) {
            str = "jsbridge";
        } else {
            str = (String) obj;
        }
        Object obj2 = interfaceC77910Uhu.getLoginContext().get("enter_method");
        if (obj2 == null || !(obj2 instanceof String)) {
            str2 = "loginOrRegister";
        } else {
            str2 = (String) obj2;
        }
        ED5.LIZJ(InterfaceC77907Uhr.class, null);
        this.LJLJJL.LIZLLL((ActivityC45651qj) LJI, str, str2, bundle, c77906Uhq);
    }
}
