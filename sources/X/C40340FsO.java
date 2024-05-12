package X;

import Y.ARunnableS12S1000000_6;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;

/* renamed from: X.FsO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40340FsO {
    public static final C40340FsO LIZ = new C40340FsO();

    public static final void LIZ(int i) {
        String str;
        AwemeHostApplication LIZ2 = FKM.LIZ();
        C40340FsO c40340FsO = LIZ;
        if (LIZ2 != null) {
            str = LIZ2.getString(i);
        } else {
            str = null;
        }
        c40340FsO.onEvent(str);
    }

    public final void onEvent(String str) {
        if (str != null) {
            C82544WaS.LIZ(new ARunnableS12S1000000_6(str, 11));
        }
    }
}
