package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.QIo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66774QIo implements QJM {
    public final CopyOnWriteArraySet<QJM> LIZ = new CopyOnWriteArraySet<>();

    @Override // X.QJM
    public final void LIZIZ(String str, String str2, String str3) {
        Iterator<QJM> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(str, str2, str3);
        }
    }

    @Override // X.QJM
    public final void LIZ(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        Iterator<QJM> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(str, str2, str3, str4, z, str5, str6);
        }
    }
}
