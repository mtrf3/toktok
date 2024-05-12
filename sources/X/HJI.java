package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.model.MissionItemStatus;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS172S0100000_6;

/* loaded from: classes8.dex */
public final class HJI implements InterfaceC41034G8o {
    public final InterfaceC43691HCt LJLIL;

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    public HJI(C43688HCq c43688HCq) {
        this.LJLIL = c43688HCq;
    }

    public final boolean LIZ(Aweme aweme, C72652tB c72652tB) {
        int i;
        MissionItemStatus missionItemStatus;
        if (aweme == null) {
            return false;
        }
        if (C77413UZt.LJIJI(aweme)) {
            C26227ARb LIZ = C3AW.LIZ(C44384HbQ.LLIILZL(this));
            LIZ.LJ(R.string.i5k);
            LIZ.LIZ(R.string.i5i);
            UC0.LIZJ(LIZ, HJK.LJLIL);
            LIZ.LJI().LIZLLL();
            return true;
        }
        Long l = null;
        if (!C77413UZt.LJIJ(aweme)) {
            java.util.Set LJIIIIZZ = C77275UUl.LJIIIIZZ(MissionItemStatus.AWAITING_REWARD, MissionItemStatus.HIDDEN);
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                missionItemStatus = commerceVideoAuthInfo.getMissionItemStatusEnum();
            } else {
                missionItemStatus = null;
            }
            if (!ORZ.LJLJJI(missionItemStatus, LJIIIIZZ)) {
                return false;
            }
        }
        H9C h9c = new H9C();
        AwemeCommerceStruct commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo2 != null) {
            l = Long.valueOf(commerceVideoAuthInfo2.getMissionId());
        }
        h9c.LJIILIIL(10, l);
        C26227ARb LIZ2 = C3AW.LIZ(C44384HbQ.LLIILZL(this));
        LIZ2.LJ(R.string.i5l);
        Context LLIILZL = C44384HbQ.LLIILZL(this);
        if (C77413UZt.LJIJ(aweme)) {
            i = R.string.i5e;
        } else {
            i = R.string.i5g;
        }
        LIZ2.LIZIZ(LLIILZL.getString(i));
        UC0.LIZJ(LIZ2, new AqS172S0100000_6(c72652tB, 142));
        LIZ2.LJII = false;
        LIZ2.LJI().LIZLLL();
        return true;
    }
}
