package X;

import android.text.TextUtils;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

/* renamed from: X.IuW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48116IuW implements InterfaceC48118IuY {
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC48118IuY
    public final List<InetAddress> LIZ(String str) {
        if (TextUtils.equals(this.LIZIZ, str)) {
            return Collections.singletonList(InetAddress.getByName(this.LIZJ));
        }
        return InterfaceC48118IuY.LIZ.LIZ(str);
    }

    public C48116IuW(String str, String str2) {
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
