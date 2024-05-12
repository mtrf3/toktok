package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import java.util.HashMap;

/* renamed from: X.KxN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C53389KxN extends TBS implements InterfaceC88472Yns<Integer, Long> {
    public C53389KxN(Object obj) {
        super(1, obj, MultiGuestUserInfoFragment.class, "getScoreByRank", "getScoreByRank(I)Ljava/lang/Long;", 0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Long, java.lang.Object] */
    @Override // X.InterfaceC88472Yns
    public final Long invoke(Integer num) {
        return ((HashMap) ((MultiGuestUserInfoFragment) this.receiver).LLIZ.getValue()).get(Integer.valueOf(num.intValue()));
    }
}
