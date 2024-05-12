package ms.bd.o;

import X.C16880lQ;
import java.io.File;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class e extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        File file = new File(C16880lQ.LLIIJLIL(a.LIZIZ.LIZ), (String) k.a(16777217, 0, 0L, "09c323", new byte[]{111, 54, 3, 67, 12, 48, 50}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }
}
