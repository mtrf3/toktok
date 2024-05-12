package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.Tez, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75181Tez implements InterfaceC73131Sn1<Object> {
    public final int LJLIL;
    public final ListByTypeResponse.GiftScoreAppliedUser LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final Integer LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75181Tez)) {
            return false;
        }
        C75181Tez c75181Tez = (C75181Tez) obj;
        return this.LJLIL == c75181Tez.LJLIL && o.LJ(this.LJLILLLLZI, c75181Tez.LJLILLLLZI) && this.LJLJI == c75181Tez.LJLJI && this.LJLJJI == c75181Tez.LJLJJI && o.LJ(this.LJLJJL, c75181Tez.LJLJJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LJLILLLLZI.hashCode() + (this.LJLIL * 31)) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + (this.LJLJJI ? 1 : 0)) * 31;
        Integer num = this.LJLJJL;
        return i2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplierGifterUserInfo(rank=");
        LIZ.append(this.LJLIL);
        LIZ.append(", applier=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isSelfTop=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isBottom=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", selfRank=");
        return s0.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC73131Sn1
    public final boolean LLILLIZIL(Object obj) {
        Long l;
        User user;
        User user2;
        if (obj instanceof C75181Tez) {
            C75181Tez c75181Tez = (C75181Tez) obj;
            if (c75181Tez.LJLIL != this.LJLIL) {
                return false;
            }
            ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser = c75181Tez.LJLILLLLZI;
            if (giftScoreAppliedUser.giftScore == this.LJLILLLLZI.giftScore) {
                LinkPlayerInfo linkPlayerInfo = giftScoreAppliedUser.listUser;
                Long l2 = null;
                if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
                    l = Long.valueOf(user2.getId());
                } else {
                    l = null;
                }
                LinkPlayerInfo linkPlayerInfo2 = this.LJLILLLLZI.listUser;
                if (linkPlayerInfo2 != null && (user = linkPlayerInfo2.mUser) != null) {
                    l2 = Long.valueOf(user.getId());
                }
                if (!o.LJ(l, l2) || c75181Tez.LJLJI != this.LJLJI || c75181Tez.LJLJJI != this.LJLJJI) {
                    return false;
                }
                Integer num = c75181Tez.LJLJJL;
                if (!o.LJ(num, num)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC73131Sn1
    public final boolean LLLLLLZ(Object obj) {
        return obj instanceof C75181Tez;
    }

    public C75181Tez(int i, ListByTypeResponse.GiftScoreAppliedUser applier, boolean z, boolean z2, Integer num, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        z2 = (i2 & 8) != 0 ? false : z2;
        o.LJIIIZ(applier, "applier");
        this.LJLIL = i;
        this.LJLILLLLZI = applier;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = num;
    }
}
