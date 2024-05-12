package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76820UCy;
import X.InterfaceC88472Yns;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;

/* loaded from: classes14.dex */
public class AqS20S0000100_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS20S0000100_13(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AqS20S0000100_13 aqS20S0000100_13, Object obj) {
        boolean z;
        LinkUser it = (LinkUser) obj;
        o.LJIIIZ(it, "it");
        Long userId = it.getUserId();
        long j = aqS20S0000100_13.j0;
        if (userId == null || userId.longValue() != j) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AqS20S0000100_13 aqS20S0000100_13, Object obj) {
        boolean z;
        LinkUser it = (LinkUser) obj;
        o.LJIIIZ(it, "it");
        Long userId = it.getUserId();
        long j = aqS20S0000100_13.j0;
        if (userId == null || userId.longValue() != j) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AqS20S0000100_13 aqS20S0000100_13, Object obj) {
        boolean z;
        LinkUser it = (LinkUser) obj;
        o.LJIIIZ(it, "it");
        Long userId = it.getUserId();
        long j = aqS20S0000100_13.j0;
        if (userId == null || userId.longValue() != j) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AqS20S0000100_13 aqS20S0000100_13, Object obj) {
        boolean z;
        LinkUser it = (LinkUser) obj;
        o.LJIIIZ(it, "it");
        Long userId = it.getUserId();
        long j = aqS20S0000100_13.j0;
        if (userId == null || userId.longValue() != j) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AqS20S0000100_13 aqS20S0000100_13, Object obj) {
        C76820UCy setState = (C76820UCy) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C76820UCy.LIZIZ(setState, setState.LJLIL, aqS20S0000100_13.j0, 0, null, 0, 0, null, null, null, null, null, 2044);
    }

    public static final Object invoke$5(AqS20S0000100_13 aqS20S0000100_13, Object obj) {
        boolean z;
        ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser = (ListByTypeResponse.GiftScoreAppliedUser) obj;
        o.LJIIIZ(giftScoreAppliedUser, "giftScoreAppliedUser");
        if (giftScoreAppliedUser.giftScore < aqS20S0000100_13.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
