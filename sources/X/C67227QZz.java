package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: X.QZz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67227QZz {
    public static String LIZIZ(int i) {
        String valueOf = String.valueOf(i);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 14) {
                                if (i != 15) {
                                    if (i != 21) {
                                        if (i != 10000) {
                                            if (i != 10001) {
                                                switch (i) {
                                                    case 7:
                                                        return "HW";
                                                    case 8:
                                                        return "MZ";
                                                    case 9:
                                                        return "ALIYUN";
                                                    case 10:
                                                        return "OPPO";
                                                    default:
                                                        return valueOf;
                                                }
                                            }
                                            return "CLIENT_NON_LOGIN";
                                        }
                                        return "CLIENT";
                                    }
                                    return "BYTESYNC";
                                }
                                return "FRONTIER";
                            }
                            return "ADM";
                        }
                        return "GCM";
                    }
                    return "GETUI";
                }
                return "IXINTUI";
            }
            return "MYSELF";
        }
        return "MI";
    }

    public static boolean LIZJ(C67230Qa2 c67230Qa2) {
        if (TextUtils.isEmpty(c67230Qa2.openUrl) || !c67230Qa2.openUrl.contains("://aweme/detail/")) {
            return false;
        }
        android.net.Uri parse = UriProtector.parse(c67230Qa2.openUrl);
        if (TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "gd_label")) || !"click_push_recommend".equals(UriProtector.getQueryParameter(parse, "gd_label")) || c67230Qa2.imageType != 2) {
            return false;
        }
        return true;
    }

    public static void LIZ(Context context, C67230Qa2 c67230Qa2, C022406y c022406y) {
        boolean z;
        PendingIntent activity;
        int size = c67230Qa2.extra.actionList.size();
        for (int i = 0; i < size; i++) {
            android.net.Uri parse = UriProtector.parse(((String[]) ListProtector.get(c67230Qa2.extra.actionList, i))[2]);
            Intent intent = new Intent();
            intent.putExtra("action_id", ((String[]) ListProtector.get(c67230Qa2.extra.actionList, i))[0]);
            intent.putExtra("action_title", ((String[]) ListProtector.get(c67230Qa2.extra.actionList, i))[1]);
            intent.putExtra("from_notification", true);
            intent.putExtra("msg_from", 1);
            intent.putExtra("is_from_button", true);
            intent.putExtra("need_clear_notification_push_id", C67230Qa2.getShortMsgID(c67230Qa2.id));
            intent.putExtra("cancel_TAG", "app_notify_ame");
            if ("snssdk1180://push/dislike".equals(parse.toString()) || "snssdk1233://push/dislike".equals(parse.toString())) {
                z = true;
            } else {
                z = false;
            }
            boolean equals = "1".equals(((String[]) ListProtector.get(c67230Qa2.extra.actionList, i))[3]);
            if (z) {
                if (!TextUtils.isEmpty(c67230Qa2.openUrl)) {
                    intent.putExtra("url_string", c67230Qa2.openUrl);
                }
                if (!TextUtils.isEmpty(c67230Qa2.extra.authorId)) {
                    intent.putExtra("author_id", c67230Qa2.extra.authorId);
                }
                if (!TextUtils.isEmpty(c67230Qa2.extra.userId)) {
                    intent.putExtra("user_id", c67230Qa2.extra.userId);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(context.getPackageName());
                LIZ.append(".action.PUSH_DISLIKE");
                intent.setAction(X1D.LIZIZ(LIZ));
                intent.setPackage(context.getPackageName());
                if (Build.VERSION.SDK_INT >= 23) {
                    activity = PendingIntent.getBroadcast(context, C67230Qa2.getShortMsgID(c67230Qa2.id), intent, 201326592);
                } else {
                    activity = PendingIntent.getBroadcast(context, C67230Qa2.getShortMsgID(c67230Qa2.id), intent, 134217728);
                }
            } else if (equals) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(context.getPackageName());
                LIZ2.append(".action.PUSH_DIRECT_REPLY");
                intent.setAction(X1D.LIZIZ(LIZ2));
                intent.setPackage(context.getPackageName());
                String str = ((String[]) ListProtector.get(c67230Qa2.extra.actionList, i))[2];
                if (TextUtils.isEmpty(str)) {
                    str = c67230Qa2.openUrl;
                }
                intent.putExtra("content_str", str);
                if (Build.VERSION.SDK_INT >= 31) {
                    activity = PendingIntent.getBroadcast(context, C67230Qa2.getShortMsgID(c67230Qa2.id), intent, 167772160);
                } else {
                    activity = PendingIntent.getBroadcast(context, C67230Qa2.getShortMsgID(c67230Qa2.id), intent, 134217728);
                }
            } else {
                intent.setAction("android.intent.action.VIEW");
                intent.setData(parse);
                if (Build.VERSION.SDK_INT >= 23) {
                    activity = PendingIntent.getActivity(context, C67230Qa2.getShortMsgID(c67230Qa2.id), intent, 201326592);
                } else {
                    activity = PendingIntent.getActivity(context, C67230Qa2.getShortMsgID(c67230Qa2.id), intent, 134217728);
                }
            }
            C021906t c021906t = new C021906t(R.drawable.b8a, ((String[]) ListProtector.get(c67230Qa2.extra.actionList, i))[1], activity);
            if (equals) {
                C020306d c020306d = new C020306d();
                C020406e c020406e = new C020406e(c020306d.LIZ, c020306d.LIZLLL, c020306d.LJ, c020306d.LIZJ, c020306d.LIZIZ);
                if (c021906t.LJFF == null) {
                    c021906t.LJFF = new ArrayList<>();
                }
                c021906t.LJFF.add(c020406e);
            }
            c022406y.LIZIZ.add(c021906t.LIZ());
        }
    }

    public static boolean LIZLLL(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject.isNull(str)) {
            return z;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt >= 1) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }
}
