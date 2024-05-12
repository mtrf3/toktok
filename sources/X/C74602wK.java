package X;

import com.ss.android.ugc.aweme.contact.data.api.IMContactApi;
import kotlin.jvm.internal.o;

/* renamed from: X.2wK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74602wK {
    public static final /* synthetic */ C74602wK LIZ = new C74602wK();

    public static IMContactApi LIZ() {
        Object obj;
        String str = EFJ.LIZJ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(IMContactApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        return (IMContactApi) obj;
    }
}
