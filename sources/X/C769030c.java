package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.shortcut.datasource.setting.IShortcutApi;

/* renamed from: X.30c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C769030c {
    public static final IShortcutApi LIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (IShortcutApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IShortcutApi.class);
    }
}
