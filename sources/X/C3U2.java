package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSayhiAnalyticsImpl;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.3U2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3U2 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C3U4.LJLIL);

    public static boolean LIZ() {
        if (!C3U6.LIZ || !((Boolean) C96913rD.LIZ.getValue()).booleanValue() || C78966Uyw.LJJIJ().LIZIZ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.im.service.model.IMUser r7, X.C3L4 r8) {
        /*
            boolean r0 = LIZ()
            r6 = 0
            if (r0 != 0) goto L9
            if (r8 != 0) goto La
        L9:
            return r6
        La:
            int r1 = r8.LJLJLLL
            r0 = 15
            if (r1 != r0) goto L9
            if (r7 == 0) goto L1f
            int r0 = r7.getFollowStatus()
            if (r0 != 0) goto L19
            goto L9
        L19:
            java.lang.String r4 = r7.getUid()
            if (r4 != 0) goto L39
        L1f:
            java.lang.String r0 = r8.LJFF()
            long r0 = X.C81273Gx.LIZLLL(r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r3 = r5.longValue()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L9
            java.lang.String r4 = r5.toString()
        L39:
            X.3er r3 = X.C89253er.LIZ
            java.lang.String r0 = "uid"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            com.bytedance.keva.Keva r2 = X.C89263es.LIZ()
            long r0 = java.lang.System.currentTimeMillis()
            X.C89263es.LJII(r0, r2, r4)
            r0 = 4
            boolean r0 = X.C57107Mb9.LIZIZ(r3, r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3U2.LIZIZ(com.ss.android.ugc.aweme.im.service.model.IMUser, X.3L4):boolean");
    }

    public static void LIZLLL(IMUser iMUser, String uid) {
        String str;
        o.LJIIIZ(uid, "uid");
        IMSayhiAnalyticsImpl iMSayhiAnalyticsImpl = IMSayhiAnalyticsImpl.LIZ;
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("enter_from", "notification_page");
        oszArr[1] = new OSZ("enter_method", "cell");
        if (iMUser == null || (str = Integer.valueOf(iMUser.getFollowStatus()).toString()) == null) {
            str = "";
        }
        oszArr[2] = new OSZ("relation_tag", str);
        iMSayhiAnalyticsImpl.LIZIZ(uid, C113554cx.LJJLIIIIJ(oszArr));
    }

    public static void LIZJ(String uid, IMUser iMUser, Context context, boolean z) {
        String str;
        String nickName;
        String str2;
        String str3;
        String str4;
        o.LJIIIZ(uid, "uid");
        if (iMUser != null) {
            str = iMUser.getRemarkName();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            if (iMUser != null) {
                nickName = iMUser.getNickName();
            }
            nickName = null;
        } else {
            if (iMUser != null) {
                nickName = iMUser.getRemarkName();
            }
            nickName = null;
        }
        C98593tv c98593tv = new C98593tv(context, iMUser);
        c98593tv.setEnterFromForMob("notification_page");
        c98593tv.setEnterMethodForMob("button");
        C89253er.LIZ.LJIIIZ(context, uid, nickName, ((Boolean) INB.LJ.getValue()).booleanValue(), C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", "button"), new OSZ("message_type", "emoji"), new OSZ("message_from", "greeting_button")), new AqS153S0100000_3(context, 1457), new AqS151S0100000_1(c98593tv, 766));
        if (iMUser != null) {
            str2 = iMUser.getUid();
        } else {
            str2 = null;
        }
        C2U8.LIZ(new C3U3(str2));
        IMSayhiAnalyticsImpl iMSayhiAnalyticsImpl = IMSayhiAnalyticsImpl.LIZ;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("enter_from", "notification_page");
        oszArr[1] = new OSZ("enter_method", "button");
        if (iMUser == null || (str3 = Integer.valueOf(iMUser.getFollowStatus()).toString()) == null) {
            str3 = "";
        }
        oszArr[2] = new OSZ("relation_tag", str3);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[3] = new OSZ("is_recommended_chat", str4);
        iMSayhiAnalyticsImpl.LIZIZ(uid, C113554cx.LJJLIIIIJ(oszArr));
    }
}
