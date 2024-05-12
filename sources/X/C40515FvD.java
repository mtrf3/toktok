package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URLDecoder;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FvD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40515FvD {
    public static final String[] LIZJ = {"uid", "user_id", "author_id", "target_user_ud", "to_user_id", "from_user_id", "push_user_id", "share_user_id", "star_uid"};
    public static final String[] LIZLLL = {"com.tellh.me.ele.", "com.ixigua.", "com.ss.", "com.bytedance."};
    public static volatile C40515FvD LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public final LinkedList<String> LIZIZ;

    public static C40515FvD LIZJ() {
        if (LJ == null) {
            synchronized (C40515FvD.class) {
                if (LJ == null) {
                    LJ = new C40515FvD();
                }
            }
        }
        return LJ;
    }

    public static boolean LJ() {
        if (LJFF || LJI) {
            return true;
        }
        return false;
    }

    public C40515FvD() {
        boolean equalsIgnoreCase;
        boolean equalsIgnoreCase2;
        LinkedList<String> linkedList;
        String str = EF7.LJIILIIL;
        if (TextUtils.isEmpty(str)) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = str.equalsIgnoreCase("local_test");
        }
        LJFF = equalsIgnoreCase;
        String str2 = EF7.LJIILIIL;
        if (TextUtils.isEmpty(str2)) {
            equalsIgnoreCase2 = false;
        } else {
            equalsIgnoreCase2 = str2.equalsIgnoreCase("lark_inhouse");
        }
        LJI = equalsIgnoreCase2;
        Keva repo = Keva.getRepo("aweme_network");
        repo.getBoolean("strict_mode", false);
        repo.getBoolean("request_with_compile_mode", false);
        repo.getString("lastInputEmailPrefix", "");
        if (LJ()) {
            linkedList = new LinkedList<>();
        } else {
            linkedList = null;
        }
        this.LIZIZ = linkedList;
    }

    public final void LIZ(android.net.Uri uri) {
        if (uri != null) {
            try {
                try {
                    LIZIZ(URLDecoder.decode(uri.toString(), "UTF-8"));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    LIZIZ("");
                }
            } catch (Throwable th) {
                LIZIZ("");
                throw th;
            }
        }
    }

    public final void LIZIZ(String str) {
        if (this.LIZIZ == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (this.LIZIZ.size() == 6) {
            this.LIZIZ.pollLast();
        }
        this.LIZIZ.offerFirst(str);
    }

    public final String LIZLLL(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(CardStruct.IStatusCode.DEFAULT, str) || TextUtils.equals("-1", str)) {
            return null;
        }
        return this.LIZ.get(str);
    }

    public static void LJI(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject.length() <= 0) {
            return;
        }
        try {
            for (String str2 : LIZJ) {
                String optString = jSONObject.optString(str2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sec_");
                LIZ.append(str2);
                String optString2 = jSONObject.optString(X1D.LIZIZ(LIZ));
                if (!TextUtils.isEmpty(optString) && !"null".equalsIgnoreCase(optString) && (TextUtils.isEmpty(optString2) || "null".equalsIgnoreCase(optString2))) {
                    LJII(str, LJ());
                    return;
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJII(String str, boolean z) {
        JSONObject LIZJ2 = C65232Piu.LIZJ("path", str);
        LIZJ2.put("pages", C119944nG.LIZ());
        if (z) {
            String[] packageAllowList = LIZLLL;
            o.LJIIIZ(packageAllowList, "packageAllowList");
            StringBuilder sb = new StringBuilder();
            StackTraceElement[] stack = C16880lQ.LLLLIIIILLL().getStackTrace();
            o.LJIIIIZZ(stack, "stack");
            for (StackTraceElement stackTraceElement : stack) {
                int length = packageAllowList.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        String str2 = packageAllowList[i];
                        String className = stackTraceElement.getClassName();
                        o.LJIIIIZZ(className, "element.className");
                        if (ujb.o.LJJJLIIL(className, str2, false)) {
                            if (!ujb.o.LJJJJJL(sb)) {
                                sb.append("\n");
                            }
                            sb.append(stackTraceElement.getClassName());
                            sb.append("(");
                            sb.append(stackTraceElement.getMethodName());
                            sb.append(":");
                            sb.append(stackTraceElement.getLineNumber());
                            sb.append(")");
                        } else {
                            i++;
                        }
                    }
                }
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "sb.toString()");
            LIZJ2.put("backtrace", sb2);
        }
        FUA.LIZJ("log_miss_sec_uid", LIZJ2);
    }

    public final void LJIIIIZZ(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(CardStruct.IStatusCode.DEFAULT, str) || TextUtils.equals("-1", str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.LIZ.put(str, str2);
    }

    public static void LJFF(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            LJII(str, LJ());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
