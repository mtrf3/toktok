package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final /* synthetic */ class U26 implements InterfaceC162186Yc {
    public static Long LIZ() {
        return Long.valueOf(C8E.LIZLLL().LJJLI());
    }

    @Override // X.InterfaceC162186Yc
    public void onError(String str) {
        C0JU.LIZLLL(str);
    }

    public static Object LIZIZ(ArrayList arrayList, int i, List list) {
        return ListProtector.get(list, arrayList.size() - i);
    }

    public static String LIZJ(StringBuilder sb, Object obj, char c, StringBuilder sb2) {
        sb.append(obj);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static void LIZLLL(StringBuilder sb, boolean z, StringBuilder sb2, String str) {
        sb.append(z);
        C221018lt.LIZ(str, X1D.LIZIZ(sb2));
    }
}
