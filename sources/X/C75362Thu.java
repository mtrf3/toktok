package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import kotlin.jvm.internal.o;

/* renamed from: X.Thu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75362Thu {
    public final InterfaceC75266TgM LIZ;
    public C73411SrX LIZIZ;
    public long LIZJ;

    public C75362Thu(InterfaceC75266TgM view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZJ = -1L;
    }

    public final void LIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateFollowStatus，followStatus=");
        C65232Piu.LIZLLL(LIZ, this.LIZJ, ", sourcr = ", str);
        C0NB.LIZIZ("MultiGuestV3GuestMaskControllerV2", X1D.LIZIZ(LIZ));
        Long LJJIIJZLJL = this.LIZ.LJJIIJZLJL();
        if (LJJIIJZLJL != null) {
            long longValue = LJJIIJZLJL.longValue();
            if (longValue != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                long j = this.LIZJ;
                if (j == -1) {
                    ((C29374Bfu) B83.LIZ().LIZIZ()).LJIILLIIL(longValue, "MultiGuestV3GuestMaskControllerV2_updateFollowStatus", "MultiGuestV3GuestMaskControllerV2_updateFollowStatus").LJJII(new AfS65S0100000_13(this, 2), C75365Thx.LJLIL);
                    return;
                }
                if (j == 1 || j == 2) {
                    this.LIZ.LJJIJIL(true);
                } else if (j == 3) {
                    C0NB.LIZIZ("MultiGuestV3GuestMaskControllerV2", "Guest has followed you");
                    this.LIZ.LJJIJIL(false);
                } else {
                    this.LIZ.LJJIJIL(false);
                }
            }
        }
    }

    public final void onEvent(CJ5 cj5) {
        FollowPair followPair;
        if (cj5 == null || (followPair = cj5.LIZ) == null) {
            return;
        }
        long j = followPair.LIZ;
        Long LJJIIJZLJL = this.LIZ.LJJIIJZLJL();
        if (LJJIIJZLJL == null || j != LJJIIJZLJL.longValue()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onEvent, last_followStatus=");
        LIZ.append(this.LIZJ);
        LIZ.append(", followStatus = ");
        C1DD.LJFF(LIZ, followPair.followStatus, LIZ, "MultiGuestV3GuestMaskControllerV2");
        int i = followPair.followStatus;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.LIZJ = 3L;
                    }
                } else {
                    this.LIZJ = 2L;
                }
            } else {
                this.LIZJ = 1L;
            }
        } else {
            this.LIZJ = 0L;
        }
        LIZ("onEvent");
    }
}
