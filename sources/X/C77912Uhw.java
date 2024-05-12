package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uhw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77912Uhw extends AbstractC77913Uhx {
    public final RBW LJLJJL;

    public C77912Uhw() {
        RBW userManager = RBW.LJLLI;
        o.LJIIIZ(userManager, "userManager");
        this.LJLJJL = userManager;
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        boolean z;
        o.LJIIIZ(type, "type");
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC77914Uhy.class, null);
        InterfaceC77914Uhy interfaceC77914Uhy = (InterfaceC77914Uhy) LIZJ;
        this.LJLJJL.getClass();
        List<String> LIZIZ = UserStore.LIZIZ();
        ArrayList arrayList = new ArrayList();
        for (String str : LIZIZ) {
            this.LJLJJL.getClass();
            SignificantUserInfo LJIIJ = RBW.LJIIJ(str);
            this.LJLJJL.getClass();
            User LJIIIZ = UserStore.LJIIIZ(str);
            if (LJIIIZ == null || (!C78857UxB.LJJJIL(LJIIIZ.getCustomVerify()) && !C78857UxB.LJJJIL(LJIIIZ.getEnterpriseVerifyReason()))) {
                z = false;
            } else {
                z = true;
            }
            if (LJIIJ != null) {
                InterfaceC77915Uhz interfaceC77915Uhz = (InterfaceC77915Uhz) ED5.LIZJ(InterfaceC77915Uhz.class, null);
                interfaceC77915Uhz.setNickname(LJIIJ.nickname);
                interfaceC77915Uhz.setUsername(LJIIJ.uniqueId);
                interfaceC77915Uhz.setAvatarUrl(LJIIJ.avatarUrl);
                interfaceC77915Uhz.setSecUid(LJIIJ.secUid);
                interfaceC77915Uhz.setCreatorVerified(Boolean.valueOf(z));
                arrayList.add(interfaceC77915Uhz);
            }
        }
        interfaceC77914Uhy.setData(arrayList);
        c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
