package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMultiguestOptPauseWhenRTCExceptionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tif, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C75409Tif extends TBS implements InterfaceC88472Yns<List<? extends UserState>, C76800UCe> {
    public C75409Tif(C75410Tig c75410Tig) {
        super(1, c75410Tig, C75410Tig.class, "onUserStateChanged", "onUserStateChanged(Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends UserState> list) {
        Object LIZ;
        List<? extends UserState> p0 = list;
        o.LJIIIZ(p0, "p0");
        C75410Tig c75410Tig = (C75410Tig) this.receiver;
        c75410Tig.getClass();
        UC0.LJJIZ("on UserStateChanged....dispatch to list", "StateProxy");
        try {
            if (MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip()) {
                c75410Tig.LJFF(p0);
            }
            c75410Tig.LJI(p0);
            if (LiveMultiguestOptPauseWhenRTCExceptionSetting.INSTANCE.isOptOnRTCException()) {
                c75410Tig.LJII(p0);
            }
            c75410Tig.LIZLLL(p0);
            if (C74650TRm.LIZ()) {
                c75410Tig.LJIIIIZZ(p0);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("------------------- on Error: \n ");
            LIZ2.append(m10exceptionOrNullimpl);
            UC0.LJJIZ(X1D.LIZIZ(LIZ2), "ERROR");
        }
        return C76800UCe.LIZ;
    }
}
