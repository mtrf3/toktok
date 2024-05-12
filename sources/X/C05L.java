package X;

import android.content.Context;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.LinkedList;

/* renamed from: X.05L, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C05L {
    public static YEL LIZ(LinkedList linkedList, YEK yek) {
        linkedList.add(yek);
        return new YEL();
    }

    public static void LIZJ(int i, InterfaceC82086WJm interfaceC82086WJm) {
        interfaceC82086WJm.jP(new C45314HqQ(i));
    }

    public static void LIZLLL(Context context, int i) {
        C5S1 c5s1 = new C5S1(context);
        c5s1.LIZJ(i);
        c5s1.LJ();
    }

    public static Object LIZIZ(Object obj, XH8 xh8, Class cls) {
        C141335gf.LIZJ(obj);
        return C78977Uz7.LJJJJJL(xh8).create(cls);
    }

    public static void LJFF(String str, int i, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        TTVideoEngineLog.i(str2, X1D.LIZIZ(LIZ));
    }

    public static void LJ(C79985VaH c79985VaH, StringBuilder sb, String str, StringBuilder sb2) {
        c79985VaH.getClass();
        sb.append(str);
        X1D.LIZIZ(sb2);
    }
}
