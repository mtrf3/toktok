package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import java.util.TreeSet;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Emg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37438Emg {
    public static C37437Emf LIZ(String str) {
        Object LIZ;
        TreeSet treeSet;
        List LJLJJI;
        try {
            LIZ = UriProtector.parse(str);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            return null;
        }
        android.net.Uri uri = (android.net.Uri) LIZ;
        StringBuffer stringBuffer = new StringBuffer();
        o.LJFF(uri, "uri");
        stringBuffer.append(uri.getScheme());
        stringBuffer.append("://");
        stringBuffer.append(uri.getAuthority());
        stringBuffer.append(uri.getPath());
        String stringBuffer2 = stringBuffer.toString();
        o.LJFF(stringBuffer2, "StringBuffer()\n         …              .toString()");
        String query = uri.getQuery();
        if (query == null || (LJLJJI = s.LJLJJI(query, new char[]{'&'}, false, 6)) == null) {
            treeSet = new TreeSet();
        } else {
            treeSet = new TreeSet(LJLJJI);
        }
        return new C37437Emf(stringBuffer2, treeSet);
    }
}
