package ms.bd.o;

import android.content.Context;
import java.io.File;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class j {
    public static boolean LIZIZ(Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list.length <= 0) {
                throw null;
            }
            new File(str2).mkdirs();
            for (String str3 : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((String) k.a(16777217, 0, 0L, "dcd2ca", new byte[]{58}));
                sb.append(str3);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append((String) k.a(16777217, 0, 0L, "28af37", new byte[]{108}));
                sb3.append(str3);
                LIZIZ(context, sb2, sb3.toString());
            }
            return true;
        } catch (Exception unused) {
            k.a(16777217, 0, 0L, "02c003", new byte[]{34, 49, 22});
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ() {
        b.a pVar;
        boolean z;
        m nVar;
        b.LIZ(65537, new c());
        b.LIZ(65538, new d());
        b.LIZ(65539, new e());
        b.LIZ(65540, new f());
        b.LIZ(65541, new g());
        b.LIZ(65542, new h());
        b.LIZ(65543, new i());
        if (y.LIZJ()) {
            pVar = new q();
        } else {
            pVar = new p();
        }
        b.LIZ(196609, pVar);
        b.LIZ(196610, pVar);
        b.LIZ(196611, pVar);
        try {
            Class.forName(new String[]{k.a(16777217, 0, 0L, "c8665c", new byte[]{113, 53, 72, 12, 8, 109, 116, 28, 99, 103, 124, 57, 64, 12, 12, 102, 97, 20, 112, 105, 96, 49, 11, 65, 5, 102, 101, 87, 116, 98, 121, 55, 74, 76, 3, 96, 111, 11, 41, 85, 86, 17, 104, 77, 4, 125, 116, 22, 117, 83, 102, 51, 73, 81})}[0]);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        if (!(true & z)) {
            nVar = new l();
        } else {
            nVar = new n();
        }
        synchronized (m.class) {
            m.LIZ = nVar;
        }
        b.LIZ(131073, nVar);
        b.LIZ(131074, nVar);
    }
}
