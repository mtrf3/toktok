package X;

import com.ss.android.ugc.aweme.tag.api.VideoTagApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7DJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7DJ {
    public static final /* synthetic */ C7DJ LIZ = new C7DJ();

    public static VideoTagApi LIZ() {
        Object obj;
        String str = EFJ.LIZJ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(VideoTagApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        return (VideoTagApi) obj;
    }
}
