package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.BTe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28830BTe implements BTW {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C28831BTf.LJLIL);

    @Override // X.BTW
    public final boolean canHandle(android.net.Uri uri) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (TextUtils.equals("live", str)) {
            return true;
        }
        if (uri != null) {
            str2 = uri.getHost();
        } else {
            str2 = null;
        }
        if (TextUtils.equals("webcast_room", str2)) {
            if (uri != null) {
                str3 = uri.getPath();
            } else {
                str3 = null;
            }
            if (TextUtils.equals("/", str3)) {
                return true;
            }
            if (uri != null) {
                str4 = uri.getPath();
            }
            if (TextUtils.equals("", str4)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.BTW
    public final boolean handle(Context context, android.net.Uri uri) {
        Long l;
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(uri, "uri");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C78847Ux1.LJJII(uri, enterRoomConfig);
        C28655BMl LIZ = B4T.LIZ();
        long j = enterRoomConfig.mRoomsData.roomId;
        String queryParameter = UriProtector.getQueryParameter(uri, "ec_template_id");
        String queryParameter2 = UriProtector.getQueryParameter(uri, "user_id");
        if (queryParameter2 != null) {
            l = C38350F3i.LJJIZ(queryParameter2);
        } else {
            l = null;
        }
        String queryParameter3 = UriProtector.getQueryParameter(uri, "commerce_inner_source");
        LIZ.LIZ = null;
        LIZ.LJII = 0;
        LIZ.LJ = queryParameter;
        LIZ.LJFF = l;
        LIZ.LIZJ = true;
        LIZ.LIZIZ = Long.valueOf(j);
        LIZ.LJI = queryParameter3;
        LIZ.LIZLLL = true;
        if (TextUtils.equals("webcast_room", uri.getHost()) && TextUtils.equals("webapp", UriProtector.getQueryParameter(uri, "enter_from"))) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_question_scan");
            LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
            String queryParameter4 = UriProtector.getQueryParameter(uri, "live_room_mode");
            if (queryParameter4 != null) {
                str = C29306Beo.LJJLIIIJLLLLLLLZ(queryParameter4);
            } else {
                str = "null";
            }
            LIZ2.LJIJJ(str, "live_type");
            LIZ2.LJJIIJZLJL();
        }
        return LIZ(context, uri, enterRoomConfig);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.content.Context r17, android.net.Uri r18, com.bytedance.android.livesdkapi.session.EnterRoomConfig r19) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28830BTe.LIZ(android.content.Context, android.net.Uri, com.bytedance.android.livesdkapi.session.EnterRoomConfig):boolean");
    }

    @Override // X.BTW
    public final boolean LIZJ(Context context, android.net.Uri uri, java.util.Map<String, String> extraParams) {
        Long l;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(extraParams, "extraParams");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C78847Ux1.LJJII(uri, enterRoomConfig);
        C28655BMl LIZ = B4T.LIZ();
        long j = enterRoomConfig.mRoomsData.roomId;
        String queryParameter = UriProtector.getQueryParameter(uri, "ec_template_id");
        String queryParameter2 = UriProtector.getQueryParameter(uri, "user_id");
        Boolean bool = null;
        if (queryParameter2 != null) {
            l = C38350F3i.LJJIZ(queryParameter2);
        } else {
            l = null;
        }
        String queryParameter3 = UriProtector.getQueryParameter(uri, "commerce_inner_source");
        LIZ.LIZ = null;
        LIZ.LJII = 0;
        LIZ.LJ = queryParameter;
        LIZ.LJFF = l;
        LIZ.LIZJ = true;
        LIZ.LIZIZ = Long.valueOf(j);
        LIZ.LJI = queryParameter3;
        LIZ.LIZLLL = true;
        String str = extraParams.get("from_notification");
        if (str != null) {
            bool = Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (UriProtector.getQueryParameter(uri, "enter_from_merge") == null && o.LJ(bool, Boolean.TRUE)) {
            enterRoomConfig.mRoomsData.enterFromMerge = "push";
        }
        if (UriProtector.getQueryParameter(uri, "enter_method") == null && o.LJ(bool, Boolean.TRUE)) {
            enterRoomConfig.mRoomsData.enterMethod = "push";
        }
        if (UriProtector.getQueryParameter(uri, "open_url_link") != null) {
            enterRoomConfig.mRoomsData.openUrlLink = UriProtector.getQueryParameter(uri, "open_url_link");
        }
        return LIZ(context, uri, enterRoomConfig);
    }
}
