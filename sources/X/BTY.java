package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes6.dex */
public final class BTY implements BTW {
    @Override // X.BTW
    public final boolean canHandle(android.net.Uri uri) {
        return TextUtils.equals("webcast_profile", uri.getHost());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // X.BTW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handle(android.content.Context r7, android.net.Uri r8) {
        /*
            r6 = this;
            java.lang.String r0 = "user_id"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L11
            long r1 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r1)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = 0
        L13:
            java.lang.String r5 = "sec_user_id"
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r8, r5)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L27
            r3.put(r5, r4)
        L27:
            java.lang.String r0 = "type"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r8, r0)
            LIZ(r1, r0, r3)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BTY.handle(android.content.Context, android.net.Uri):boolean");
    }

    public static void LIZ(long j, String str, java.util.Map map) {
        boolean z;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (j == 0) {
            j = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        }
        if (map.containsKey("show_follow") && Boolean.parseBoolean((String) map.get("show_follow"))) {
            z = true;
        } else {
            z = false;
        }
        if (room != null && TextUtils.equals(str, "half")) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(j);
            if (z) {
                userProfileEvent.mSource = "mic_room";
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("click_user_position"))) {
                userProfileEvent.mClickUserPosition = (String) map.get("click_user_position");
            }
            if (j != room.getOwnerUserId()) {
                userProfileEvent.mReportType = "report_user";
            }
            if (map.containsKey("disable_navigate_badge")) {
                userProfileEvent.disableNavigateBadgeType = C1E4.LJJIFFI((String) map.get("disable_navigate_badge"));
            }
            userProfileEvent.clickModule = (String) map.get("click_module");
            userProfileEvent.mShowEntrance = (String) map.get("show_entrance");
            userProfileEvent.setEnterFromRankList(Boolean.valueOf(Boolean.parseBoolean((String) map.get("overshadow"))));
            String str2 = (String) map.get("track_info");
            if (!TextUtils.isEmpty(str2)) {
                try {
                    java.util.Map<String, String> map2 = (java.util.Map) C09650Zl.LIZJ.LJII(str2, new TypeToken<java.util.Map<String, String>>() { // from class: X.2Yz
                    }.getType());
                    userProfileEvent.trackExtra = map2;
                    String str3 = map2.get("click_user_position");
                    int hashCode = str3.hashCode();
                    if (hashCode != -371824842) {
                        if (hashCode == 2064089041 && str3.equals("top_active_user_rank")) {
                            userProfileEvent.mSource = "top_active_user_rank";
                        }
                        userProfileEvent.mSource = str3;
                    } else {
                        if (str3.equals("hall_of_fame_rank")) {
                            userProfileEvent.mEnterFromRankList = Boolean.TRUE;
                            userProfileEvent.mSource = str3;
                        }
                        userProfileEvent.mSource = str3;
                    }
                } catch (Exception unused) {
                    C0NB.LJ("UserProfileActionHandler error", "track json  error");
                }
            }
            userProfileEvent.isFromProgrammedLiveMenu = TextUtils.equals((CharSequence) map.get("source"), "program_live");
            C73943T0h.LIZ().LIZIZ(userProfileEvent);
            return;
        }
        ((IHostAction) CN1.LIZ(IHostAction.class)).openUserProfilePage(j, map);
    }

    @Override // X.BTW
    public final boolean LIZJ(Context context, android.net.Uri uri, java.util.Map<String, String> map) {
        handle(context, uri);
        return true;
    }
}
