package X;

import android.os.Bundle;
import android.os.Parcel;
import java.io.PrintStream;

/* renamed from: X.FvC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40514FvC {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Parcel parcel = null;
        try {
            parcel = Parcel.obtain();
            parcel.writeBundle(bundle);
            int dataSize = parcel.dataSize();
            parcel.recycle();
            PrintStream printStream = System.out;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("FeedTransactionTooLargeMonitor fragments size=");
            LIZ2.append(dataSize);
            printStream.println(X1D.LIZIZ(LIZ2));
            PrintStream printStream2 = System.out;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("FeedTransactionTooLargeMonitor fragments outState=");
            LIZ3.append(bundle);
            printStream2.println(X1D.LIZIZ(LIZ3));
        } catch (Exception unused) {
            if (parcel == null) {
                return;
            }
        } catch (Throwable th) {
            if (parcel != null) {
                parcel.recycle();
            }
            throw th;
        }
        parcel.recycle();
    }
}
