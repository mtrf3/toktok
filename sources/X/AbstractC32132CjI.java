package X;

import android.os.Looper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.CjI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32132CjI {
    public final InterfaceC32124CjA LIZ;
    public final String LIZIZ;
    public volatile boolean LIZJ;

    public final DataChannel LJI() {
        if (this.LIZJ) {
            return ((C32111Cix) this.LIZ).LIZ.dataChannel;
        }
        return null;
    }

    public final Room LJIIIIZZ() {
        if (this.LIZJ) {
            return ((C32111Cix) this.LIZ).LIZ.LLD;
        }
        return null;
    }

    public final ActivityC45651qj LJFF() {
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            String str = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SendGift require context at not main thread! ");
            StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
            o.LJIIIIZZ(stackTrace, "currentThread().stackTrace");
            C1EW.LIZLLL(LIZ, ORY.LJJJJLL(stackTrace, "\n", null, null, null, 62), LIZ, str);
            return null;
        }
        if (!this.LIZJ) {
            return null;
        }
        return C29306Beo.LIZIZ(((C32111Cix) this.LIZ).LIZ.getContext());
    }

    public final CLB LJII() {
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            String str = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SendGift require giftNewPresenter at not main thread! ");
            StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
            o.LJIIIIZZ(stackTrace, "currentThread().stackTrace");
            C1EW.LIZLLL(LIZ, ORY.LJJJJLL(stackTrace, "\n", null, null, null, 62), LIZ, str);
            return null;
        }
        if (!this.LIZJ) {
            return null;
        }
        return ((C32111Cix) this.LIZ).LIZ.LJLLI;
    }

    public AbstractC32132CjI(InterfaceC32124CjA requireRef) {
        o.LJIIIZ(requireRef, "requireRef");
        this.LIZ = requireRef;
        this.LIZIZ = "BaseGiftSenderComponent";
    }
}
