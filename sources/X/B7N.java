package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.deeplink.UserIdResponse;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;

/* loaded from: classes6.dex */
public final class B7N extends AbstractC65781Prl implements InterfaceC88472Yns<UserIdResponse, C76800UCe> {
    public final /* synthetic */ EnterRoomConfig LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ LiveHostWatch LJLJI;
    public final /* synthetic */ Context LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7N(Context context, EnterRoomConfig enterRoomConfig, LiveHostWatch liveHostWatch, String str) {
        super(1);
        this.LJLIL = enterRoomConfig;
        this.LJLILLLLZI = str;
        this.LJLJI = liveHostWatch;
        this.LJLJJI = context;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(UserIdResponse userIdResponse) {
        UserIdResponse userIdResponse2 = userIdResponse;
        if (userIdResponse2 != null) {
            EnterRoomConfig enterRoomConfig = this.LJLIL;
            String str = this.LJLILLLLZI;
            LiveHostWatch liveHostWatch = this.LJLJI;
            Context context = this.LJLJJI;
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            String str2 = userIdResponse2.room_id;
            if (str2 == null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            roomsData.roomId = CastLongProtector.parseLong(str2);
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.secUid = userIdResponse2.sec_uid;
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            String str3 = userIdResponse2.user_id;
            logData.anchorId = str3;
            roomsData2.userId = str3;
            EnterRoomConfig.GuestUser guestUser = roomsData2.guestUser;
            long j = 0;
            if (guestUser != null && guestUser.uid == 0) {
                if (str3 != null) {
                    try {
                        j = CastLongProtector.parseLong(str3);
                    } catch (NumberFormatException unused) {
                        EnterRoomConfig.GuestUser guestUser2 = enterRoomConfig.mRoomsData.guestUser;
                        if (guestUser2 != null) {
                            guestUser2.uid = -1L;
                        }
                    }
                }
                guestUser.uid = j;
                EnterRoomConfig.GuestUser guestUser3 = enterRoomConfig.mRoomsData.guestUser;
                if (guestUser3 != null) {
                    guestUser3.nickName = str;
                }
            }
            liveHostWatch.watchLiveFromSchema(context, enterRoomConfig);
        }
        return C76800UCe.LIZ;
    }
}
