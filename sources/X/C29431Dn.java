package X;

import Y.IDfS292S0100000;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.1Dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29431Dn implements C0EA<GoodyBagMessage> {
    public final C73318Sq2 LIZ = new C73318Sq2();
    public DataChannel LIZIZ;

    @Override // X.C0EA
    public final int LIZ() {
        return EnumC31509CYf.GOODY_BAG_MESSAGE.getIntType();
    }

    @Override // X.C0EA
    public final void onRelease() {
        this.LIZ.dispose();
    }

    public C29431Dn() {
        C221108m2.LIZIZ(C46161rY.LJLIL);
    }

    @Override // X.C0EA
    public final void LIZIZ(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZIZ = dataChannel;
    }

    @Override // X.C0EA
    public final void onMessage(IMessage message) {
        GoodyBagBaseInfo goodyBagBaseInfo;
        GoodyBagCommonDetail goodyBagCommonDetail;
        Integer valueOf;
        GoodyBagCommonDetail goodyBagCommonDetail2;
        Long valueOf2;
        o.LJIIIZ(message, "message");
        if (message instanceof GoodyBagMessage) {
            GoodyBagMessage goodyBagMessage = (GoodyBagMessage) message;
            int i = goodyBagMessage.type;
            if (i == 1) {
                GoodyBagBaseInfo goodyBagBaseInfo2 = goodyBagMessage.baseInfo;
                if (goodyBagBaseInfo2 != null && (goodyBagCommonDetail2 = goodyBagBaseInfo2.commonDetail) != null && (valueOf2 = Long.valueOf(goodyBagCommonDetail2.openAt)) != null) {
                    valueOf2.longValue();
                    this.LIZ.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(Long.valueOf(Long.valueOf(valueOf2.longValue() - (System.currentTimeMillis() / 1000)).longValue() - 30).longValue(), TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS292S0100000(this, 0), new InterfaceC64592gB() { // from class: X.1Dl
                        @Override // X.InterfaceC64592gB
                        public final void accept(Object obj) {
                            C0NB.LJ("GameGoodBagNotice", android.util.Log.getStackTraceString((Throwable) obj));
                        }
                    }));
                    return;
                }
                return;
            }
            if (i != 3 || (goodyBagBaseInfo = goodyBagMessage.baseInfo) == null || (goodyBagCommonDetail = goodyBagBaseInfo.commonDetail) == null || (valueOf = Integer.valueOf(goodyBagCommonDetail.joinedHeadcount)) == null) {
                return;
            }
            valueOf.intValue();
            this.LIZ.LIZ(AbstractC73672Svk.LJJIJIL(valueOf).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS292S0100000(this, 1), new InterfaceC64592gB() { // from class: X.1Dm
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    C0NB.LJ("GameGoodBagNotice", android.util.Log.getStackTraceString((Throwable) obj));
                }
            }));
        }
    }
}
