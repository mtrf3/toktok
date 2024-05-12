package X;

import Y.ARunnableS29S0200000_10;
import android.app.Activity;
import android.os.Handler;

/* renamed from: X.Nyi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61116Nyi implements InterfaceC61117Nyj {
    public final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    @Override // X.InterfaceC61117Nyj
    public final void LIZ(Activity activity, String[] strArr, InterfaceC61118Nyk interfaceC61118Nyk) {
        this.LIZ.post(new ARunnableS29S0200000_10(interfaceC61118Nyk, strArr, 29));
    }
}
