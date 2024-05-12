package X;

import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.NTm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59414NTm extends B4P {
    public final /* synthetic */ String LIZIZ;

    @Override // X.B4P
    public final void LIZ(java.util.Map<String, Object> map) {
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        AdLiveEnterRoomConfig adLiveEnterRoomConfig;
        Object obj = null;
        if (map != null) {
            obj = map.get("audience_live_play_enter_room_config");
        }
        if (!(obj instanceof EnterRoomConfig) || (enterRoomConfig = (EnterRoomConfig) obj) == null || (roomsData = enterRoomConfig.mRoomsData) == null || (adLiveEnterRoomConfig = roomsData.adLiveEnterRoomConfig) == null) {
            return;
        }
        if (!roomsData.enterFromAd && !o.LJ(adLiveEnterRoomConfig.isPseudoAd, "1")) {
            return;
        }
        String str = this.LIZIZ;
        String str2 = adLiveEnterRoomConfig.creativeId;
        if (str2 == null) {
            str2 = "";
        }
        C58655N0h LJ = C58704N2e.LJ("live_ad", str, str2, adLiveEnterRoomConfig.logExtra, adLiveEnterRoomConfig.groupId);
        LJ.LIZIZ(map.get("audience_live_play_room_id"), "room_id");
        LJ.LIZ(adLiveEnterRoomConfig.LIZ());
        LJ.LJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59414NTm(long j, String str) {
        super(j);
        this.LIZIZ = str;
    }
}
