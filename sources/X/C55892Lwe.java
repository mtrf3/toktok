package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Lwe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55892Lwe extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "live";
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "live_square");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.mRoomsData.fromNewStyle = true;
        C78847Ux1.LJJJJIZL(uri, enterRoomConfig);
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        LJJJLL.jumpLiveSquareWithLogin(activity, roomsData.enterFromMerge, roomsData.enterMethod, new C55893Lwf(uri, activity, enterRoomConfig));
        if (C61017Nx7.LIZ().LIZIZ()) {
            return null;
        }
        return new Intent(activity, (Class<?>) MainActivity.class);
    }
}
