package X;

import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Lpl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55465Lpl implements C7U3 {
    @Override // X.C7U3
    public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
        o.LJIIIZ(param, "param");
        String uid = param.getUid();
        o.LJI(uid);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(uid);
        LIZ.append("_FriendNewVideoSharedVM");
        return new OSZ<>(X1D.LIZIZ(LIZ), FriendNewVideoSharedVM.class);
    }
}
