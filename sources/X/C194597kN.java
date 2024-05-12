package X;

import Y.AObserverS56S0000000_3;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.models.UserPublishInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.7kN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194597kN implements InterfaceC197607pE {
    public static final C194467kA LIZ;

    @Override // X.InterfaceC197607pE
    public final void LIZ() {
    }

    static {
        C194597kN c194597kN = new C194597kN();
        LIZ = new C194467kA(null);
        C3KA<C194227jm> c3ka = C78596Usy.LJJIFFI().LIZLLL.LJLIL.LIZIZ;
        AObserverS56S0000000_3 aObserverS56S0000000_3 = new AObserverS56S0000000_3(0);
        aObserverS56S0000000_3.onChanged(c3ka.LIZJ);
        XKX.LIZLLL(c3ka.LIZIZ, null, null, new C66352j1(c3ka, aObserverS56S0000000_3, null), 3);
        C197377or.LIZ(c194597kN);
    }

    public static void LJI(AbstractC194637kR nowPostState) {
        o.LJIIIZ(nowPostState, "nowPostState");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateNowPostState nowPostState = ");
        LIZ2.append(nowPostState);
        C7XD.LIZ("GlobalStateHolder", X1D.LIZIZ(LIZ2));
        LIZ.LIZJ.postValue(nowPostState);
    }

    @Override // X.InterfaceC197607pE
    public final void LIZIZ(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        LJI(new C194617kP(creationId, EnumC197497p3.FAILED, -1));
    }

    @Override // X.InterfaceC197607pE
    public final void LJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
    }

    @Override // X.InterfaceC197607pE
    public final void LJFF(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        LJI(new C194617kP(aid, EnumC197497p3.START, 0));
    }

    @Override // X.InterfaceC197607pE
    public final void LIZJ(Aweme aweme, String str) {
        C1DH.LJJIJIIJI(new Runnable() { // from class: X.7kM
            public final /* synthetic */ boolean LJLIL = true;

            public final void LIZ() {
                UserPublishInfo copy$default;
                UserPublishInfo value = C194597kN.LIZ.LIZ.getValue();
                if (value != null) {
                    boolean z = this.LJLIL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("updateNowPostState: userPublishInfo == ");
                    LIZ2.append(value);
                    C7XD.LIZ("GlobalStateHolder", X1D.LIZIZ(LIZ2));
                    if (z) {
                        copy$default = UserPublishInfo.copy$default(value, true, 0L, true, null, 0L, null, null, 122, null);
                    } else {
                        copy$default = UserPublishInfo.copy$default(value, false, 0L, false, null, 0L, null, null, 126, null);
                    }
                    C78596Usy.LJJIFFI().LIZLLL.LJLIL.LIZ(copy$default);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                C7XD.LIZ("GlobalStateHolder", "updateNowPostState: skipped: empty publishInfo");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    LIZ();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC197607pE
    public final void LIZLLL(int i, String creationId) {
        EnumC197497p3 enumC197497p3;
        o.LJIIIZ(creationId, "creationId");
        if (i == -1) {
            enumC197497p3 = EnumC197497p3.FAILED;
        } else {
            enumC197497p3 = EnumC197497p3.UPLOADING;
        }
        LJI(new C194617kP(creationId, enumC197497p3, i));
    }
}
