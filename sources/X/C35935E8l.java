package X;

import com.ss.android.ugc.aweme.api.ISocial2TabApi;
import kotlin.jvm.internal.o;

/* renamed from: X.E8l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35935E8l {
    public static final ISocial2TabApi LIZ;

    static {
        Object obj;
        String str = EFJ.LIZJ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(ISocial2TabApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        LIZ = (ISocial2TabApi) obj;
    }
}
