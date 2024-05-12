package X;

import android.database.Cursor;
import com.bytedance.keva.Keva;

/* renamed from: X.Usi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C78580Usi implements InterfaceC78587Usp, InterfaceC67373QcL {
    @Override // X.InterfaceC78587Usp
    public void LIZ() {
        C0NB.LJ("LivePlayerLog", "Task count exceeded, rejection triggered. ");
    }

    @Override // X.InterfaceC67373QcL
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static long LIZIZ(String str, String str2, Keva keva, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        return keva.getLong(X1D.LIZIZ(LIZ), j);
    }
}
