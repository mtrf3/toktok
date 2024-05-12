package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ug8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C77800Ug8 {
    public static C1HQ LIZ(C85323Wm c85323Wm, String str) {
        o.LJIIIZ(c85323Wm, str);
        return new C1HQ();
    }

    public static void LJ(String str, DataChannel dataChannel) {
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIIJZLJL();
    }

    public static void LJFF(String str, String str2, ArrayList arrayList) {
        arrayList.add(new EJ6(str, str2));
    }

    public static Object LIZIZ(String str, String str2, IRetrofitFactory iRetrofitFactory, String str3, Class cls) {
        o.LJIIIIZZ(str, str2);
        return iRetrofitFactory.create(str3).create(cls);
    }

    public static String LIZJ(StringBuilder sb, String str, char c, char c2, StringBuilder sb2) {
        sb.append(str);
        sb.append(c);
        sb.append(c2);
        return X1D.LIZIZ(sb2);
    }

    public static String LIZLLL(U44 u44, StringBuilder sb, String str, StackTraceElement stackTraceElement, StringBuilder sb2) {
        sb.append(u44.getValue());
        sb.append(str);
        sb.append(stackTraceElement.getLineNumber());
        return X1D.LIZIZ(sb2);
    }
}
