package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;

/* renamed from: X.BNi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28678BNi implements BTW {
    @Override // X.BTW
    public final boolean canHandle(android.net.Uri uri) {
        return TextUtils.equals("live_square", uri.getHost());
    }

    @Override // X.BTW
    public final boolean handle(Context context, android.net.Uri uri) {
        final HashMap LIZJ = C03660Ck.LIZJ("intercept", "new_style");
        String queryParameter = UriProtector.getQueryParameter(uri, "enter_square_source");
        if (C38354F3m.LJ(queryParameter)) {
            LIZJ.put("live.intent.extra.FROM_NEW_STYLE_SOURCE", "referral_task");
        } else {
            LIZJ.put("live.intent.extra.FROM_NEW_STYLE_SOURCE", queryParameter);
        }
        LIZJ.put("enter_from_merge", UriProtector.getQueryParameter(uri, "enter_from_merge"));
        LIZJ.put("enter_method", UriProtector.getQueryParameter(uri, "enter_method"));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C78847Ux1.LJJJJIZL(uri, enterRoomConfig);
        C78847Ux1.LJJJJI(enterRoomConfig, LIZJ);
        EnterRoomLinkSession.LJI(enterRoomConfig).LIZIZ(new Event("live_square_handler", 4608, EnumC28203B5b.BussinessApiCall));
        IHostUser iHostUser = (IHostUser) CN1.LIZ(IHostUser.class);
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        iHostUser.jumpLiveSquareWithLogin(context, roomsData.enterFromMerge, roomsData.enterMethod, new InterfaceC78482Ur8() { // from class: X.BNk
            @Override // X.InterfaceC78482Ur8
            public final void LIZ() {
                java.util.Map<String, String> map = LIZJ;
                if (CN1.LIZ(ILiveFeedApiService.class) != null) {
                    ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).nu0().LIZ(map);
                }
            }
        });
        return true;
    }

    @Override // X.BTW
    public final boolean LIZJ(Context context, android.net.Uri uri, java.util.Map<String, String> map) {
        handle(context, uri);
        return true;
    }
}
