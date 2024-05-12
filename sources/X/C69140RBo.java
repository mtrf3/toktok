package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RBo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69140RBo extends AbstractC65781Prl implements InterfaceC88473Ynt<BaseAccountFlowFragment, String, String, AbstractC73635Sv9<R40<R7Y>>> {
    public static final C69140RBo LJLIL = new C69140RBo();

    public C69140RBo() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final AbstractC73635Sv9<R40<R7Y>> invoke(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
        BaseAccountFlowFragment fragment = baseAccountFlowFragment;
        String data = str;
        String sendMethod = str2;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(sendMethod, "sendMethod");
        String LJI = RBV.LJI(fragment);
        java.util.Map LJI2 = C85631Xj9.LJI(fragment);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(LJI)) {
            hashMap.put("ticket", LJI);
        }
        hashMap.putAll(LJI2);
        return C69093R9t.LJIJI(fragment, fragment, data, 7, sendMethod, hashMap, null, 192);
    }
}
