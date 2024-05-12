package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.relieveaweme.TiktokRelieveAweme;

/* renamed from: X.Maz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57097Maz<T> implements InterfaceC64592gB {
    public static final C57097Maz<T> LJLIL = new C57097Maz<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        TiktokRelieveAweme tiktokRelieveAweme = (TiktokRelieveAweme) obj;
        if (!TextUtils.isEmpty(tiktokRelieveAweme.getAwemeId())) {
            MXS.LIZIZ = true;
            MXS.LIZ = tiktokRelieveAweme.getAwemeId();
        }
    }
}
