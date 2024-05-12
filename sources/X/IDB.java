package X;

import android.os.Bundle;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IDB extends C81663W3f {
    @Override // X.C81663W3f, X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        Bundle bundle = session.LJ;
        if (bundle == null) {
            return true;
        }
        o.LJI(bundle);
        if (!bundle.getBoolean("is_video_used_sticker")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDB(C29S activity, TEZ stickerDataManager, IAV iav, THX thx, InterfaceC78118UlG interfaceC78118UlG, AqS157S0100000_7 aqS157S0100000_7) {
        super(activity, thx, stickerDataManager, iav, interfaceC78118UlG, null, null, aqS157S0100000_7, 96);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
    }
}
