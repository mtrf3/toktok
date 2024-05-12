package X;

import android.database.Cursor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.Hit, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C44847Hit implements InterfaceC67373QcL, InterfaceC44848Hiu {
    public static Long LIZ(long j) {
        return Long.valueOf(System.currentTimeMillis() - j);
    }

    @Override // X.InterfaceC67373QcL
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) ListProtector.get(arrayList, i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    public static void LIZJ(StringBuilder sb, String str, StringBuilder sb2) {
        sb.append(str);
        C5Z6.LIZ(X1D.LIZIZ(sb2));
    }

    public static C188727au LIZIZ(String str, java.util.Map map, String str2, String str3) {
        FMX.LJIIL(str, map);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(str2, str3);
        return c188727au;
    }

    public static boolean LIZLLL(StringBuilder sb, String str, InterfaceC74236TBo interfaceC74236TBo, String str2, Class cls) {
        sb.append(str);
        sb.append(interfaceC74236TBo.getName());
        sb.append(str2);
        return C30581Hy.LJJIFFI(cls);
    }
}
