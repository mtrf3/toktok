package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.bytex.pthread.base.PThreadPoolExecutorInject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final /* synthetic */ class FT5 implements PThreadPoolExecutorInject, InterfaceC67373QcL, InterfaceC163256av {
    @Override // X.InterfaceC67373QcL
    public Object apply(Object obj) {
        throw new FT7("Timed out while trying to open db.", (Throwable) obj);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.PThreadPoolExecutorInject
    public void beforeExecute(Runnable runnable) {
        String str;
        String sb;
        if (runnable == null || !C36211EJb.LJIIIZ.get()) {
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = C36211EJb.LIZ;
        if (!concurrentHashMap.containsKey(C16880lQ.LLLLIIIILLL().getName()) || C36211EJb.LJFF.containsKey(Integer.valueOf(runnable.hashCode())) || (str = concurrentHashMap.get(C16880lQ.LLLLIIIILLL().getName())) == null) {
            return;
        }
        FT6 ft6 = new FT6(str, runnable.hashCode());
        String name = C16880lQ.LLLLIIIILLL().getName();
        o.LJIIIIZZ(name, "currentThread().name");
        ft6.LIZJ = name;
        C232649Bc c232649Bc = C36211EJb.LJIIIIZZ;
        if (c232649Bc != null) {
            if (c232649Bc.LIZ == EnumC2322699q.TRACK_MODE) {
                ft6.LJFF = runnable.getClass().getName();
                StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
                if (stackTrace == null) {
                    sb = "Invalid Stack\n";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(stackTrace);
                    int i = 0;
                    while (LJJIIJZLJL.hasNext()) {
                        StackTraceElement stackTraceElement = (StackTraceElement) LJJIIJZLJL.next();
                        i++;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("\tat ");
                        LIZ.append(stackTraceElement.getClassName());
                        sb2.append(X1D.LIZIZ(LIZ));
                        sb2.append(".");
                        sb2.append(stackTraceElement.getMethodName());
                        sb2.append("(");
                        sb2.append(stackTraceElement.getFileName());
                        sb2.append(":");
                        sb2.append(stackTraceElement.getLineNumber());
                        sb2.append(")\n");
                        if (i > 40) {
                            break;
                        }
                    }
                    sb = sb2.toString();
                    o.LJIIIIZZ(sb, "sb.toString()");
                }
                ft6.LJI = sb;
                FT6 ft62 = C36211EJb.LJI.get(C16880lQ.LLLLIIIILLL().getName());
                if (ft62 != null) {
                    ft6.LIZLLL = ft62;
                    HashMap<Integer, HashSet<Integer>> hashMap = C36211EJb.LJII;
                    if (hashMap.containsKey(Integer.valueOf(ft62.LIZIZ))) {
                        HashSet<Integer> hashSet = hashMap.get(Integer.valueOf(ft62.LIZIZ));
                        if (hashSet != null) {
                            hashSet.add(Integer.valueOf(ft6.LIZIZ));
                        }
                    } else {
                        hashMap.put(Integer.valueOf(ft62.LIZIZ), C77275UUl.LIZLLL(Integer.valueOf(ft6.LIZIZ)));
                    }
                }
            }
            C36211EJb.LJFF.put(Integer.valueOf(runnable.hashCode()), ft6);
            return;
        }
        o.LJIJI("builder");
        throw null;
    }

    public static Activity LIZ(View view, String str) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, str);
        return C45804HyK.LJIJJ(context);
    }

    public static JSONObject LIZLLL(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, str, str2);
        return jSONObject;
    }

    public static String LIZIZ(Object obj, StringBuilder sb, StringBuilder sb2) {
        sb.append(obj.getClass());
        return X1D.LIZIZ(sb2);
    }

    public static String LIZJ(StringBuilder sb, C8HZ c8hz, char c, StringBuilder sb2) {
        sb.append(c8hz);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static void LJ(StringBuilder sb, boolean z, StringBuilder sb2, String str) {
        sb.append(z);
        C0NB.LJIIIZ(str, X1D.LIZIZ(sb2));
    }
}
