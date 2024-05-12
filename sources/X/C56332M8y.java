package X;

import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;
import kotlin.jvm.internal.o;

/* renamed from: X.M8y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56332M8y implements C7U3 {
    @Override // X.C7U3
    public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
        o.LJIIIZ(param, "param");
        String uid = param.getUid();
        o.LJI(uid);
        return new OSZ<>(M90.LIZ(uid), RecUserVideoListSharedVM.class);
    }
}
