package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.Qa0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67228Qa0 {
    public static final Keva LIZ = KevaImpl.getRepo("uid_recorder", 0);

    public static String LJ(String str) {
        if (C38354F3m.LJ(str)) {
            return str;
        }
        try {
            String scheme = UriProtector.parse(str).getScheme();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("snssdk");
            LIZ2.append(EF7.LJIIIZ);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            if ("sslocal".equals(scheme) || "localsdk".equals(scheme)) {
                return str.replace(scheme, LIZIZ);
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
    
        if (r1.equals(r2) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent LIZ(android.content.Context r11, X.C67230Qa2 r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67228Qa0.LIZ(android.content.Context, X.Qa2):android.content.Intent");
    }

    public static void LIZJ(String str, java.util.Map<String, String> map) {
        Object obj;
        HashMap hashMap = (HashMap) map;
        hashMap.put("o_url", str);
        android.net.Uri parse = UriProtector.parse(str);
        if (parse != null) {
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "push_id"))) {
                hashMap.put("rule_id", UriProtector.getQueryParameter(parse, "push_id"));
            }
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "gd_label"))) {
                String queryParameter = UriProtector.getQueryParameter(parse, "gd_label");
                hashMap.put("push_label", queryParameter);
                if ("click_push_recommend".equals(queryParameter) && !TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "item_region"))) {
                    String LJIILL = AccountService.LJIJ().LJIILL();
                    hashMap.put("item_region", UriProtector.getQueryParameter(parse, "item_region"));
                    hashMap.put("user_store_region", LJIILL);
                }
            }
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "muf_uv_cnt"))) {
                hashMap.put("muf_uv_cnt", UriProtector.getQueryParameter(parse, "muf_uv_cnt"));
            }
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "room_id"))) {
                hashMap.put("room_id", UriProtector.getQueryParameter(parse, "room_id"));
                if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "user_id"))) {
                    hashMap.put("anchor_id", UriProtector.getQueryParameter(parse, "user_id"));
                }
            }
            String host = parse.getHost();
            if ("detail".equals(host) && !TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "id"))) {
                hashMap.put("group_id", UriProtector.getQueryParameter(parse, "id"));
            } else if (!TextUtils.isEmpty(host) && "aweme".equals(host) && !TextUtils.isEmpty(parse.getLastPathSegment())) {
                hashMap.put("group_id", parse.getLastPathSegment());
            }
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "im_type"))) {
                hashMap.put("im_type", UriProtector.getQueryParameter(parse, "im_type"));
            }
            String path = parse.getPath();
            if ("challenge".equals(host) && !TextUtils.isEmpty(path) && path.contains("detail")) {
                hashMap.put("tag_id", parse.getLastPathSegment());
            }
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "sub_type"))) {
                hashMap.put("sub_type", UriProtector.getQueryParameter(parse, "sub_type"));
            }
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "follow_status"))) {
                hashMap.put("follow_status", UriProtector.getQueryParameter(parse, "follow_status"));
            }
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "follow_status_to_user"))) {
                hashMap.put("follow_status_to_user", UriProtector.getQueryParameter(parse, "follow_status_to_user"));
            }
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "itemid"))) {
                hashMap.put("itemid", UriProtector.getQueryParameter(parse, "itemid"));
            }
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "aggregate_num"))) {
                hashMap.put("aggregate_num", UriProtector.getQueryParameter(parse, "aggregate_num"));
            }
            LIZLLL(parse, "relation_tag", map);
            LIZLLL(parse, "is_left_big_avatar", map);
            LIZLLL(parse, "is_right_plot", map);
            LIZLLL(parse, "content_author_id", map);
            LIZLLL(parse, "from_user_id", map);
            try {
                RBY LJFF = AccountService.LJIJ().LJFF();
                boolean isLogin = LJFF.isLogin();
                if (isLogin) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("is_login", obj);
                String queryParameter2 = UriProtector.getQueryParameter(parse, "sec_target_uid");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    Keva keva = LIZ;
                    String[] stringArray = keva.getStringArray("logged_in_uids", new String[20]);
                    int i = keva.getInt("num_of_logged_in_uids", 0);
                    if (!isLogin) {
                        int min = Math.min(i, 20);
                        int i2 = 0;
                        while (true) {
                            if (i2 < min) {
                                if (TextUtils.equals(stringArray[i2], queryParameter2)) {
                                    hashMap.put("is_self", "3");
                                    break;
                                }
                                i2++;
                            } else {
                                hashMap.put("is_self", CardStruct.IStatusCode.DEFAULT);
                                break;
                            }
                        }
                    } else if (TextUtils.equals(LJFF.getCurUser().getSecUid(), queryParameter2)) {
                        hashMap.put("is_self", "1");
                    } else {
                        int min2 = Math.min(i, 20);
                        int i3 = 0;
                        while (true) {
                            if (i3 < min2) {
                                if (TextUtils.equals(stringArray[i3], queryParameter2)) {
                                    hashMap.put("is_self", "3");
                                    break;
                                }
                                i3++;
                            } else {
                                hashMap.put("is_self", CardStruct.IStatusCode.DEFAULT);
                                break;
                            }
                        }
                    }
                    hashMap.put("accounts_number", String.valueOf(Math.min(20, i)));
                    return;
                }
                hashMap.put("is_self", "-1");
            } catch (NullPointerException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void LIZLLL(android.net.Uri uri, String str, java.util.Map map) {
        String queryParameter = UriProtector.getQueryParameter(uri, str);
        if (!TextUtils.isEmpty(queryParameter)) {
            ((HashMap) map).put(str, queryParameter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:3:0x0005, B:5:0x0023, B:6:0x0028, B:10:0x0040, B:13:0x0050, B:17:0x0063, B:20:0x0075, B:23:0x0083, B:26:0x008d, B:28:0x0095, B:30:0x009b, B:37:0x00ae, B:39:0x00b4, B:49:0x00ca, B:52:0x00d3, B:54:0x00da, B:56:0x00e2, B:57:0x00eb, B:59:0x00f5, B:60:0x00fe, B:62:0x0108, B:63:0x0111, B:65:0x011b, B:66:0x0124, B:69:0x0134, B:70:0x013b, B:72:0x0145, B:73:0x014c, B:75:0x0158, B:77:0x0165, B:78:0x016c, B:80:0x0172, B:83:0x017d, B:85:0x0189, B:86:0x018d, B:88:0x0199), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> LIZIZ(X.C67230Qa2 r9, int r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67228Qa0.LIZIZ(X.Qa2, int, boolean, boolean):java.util.Map");
    }
}
