package X;

import android.content.Context;
import com.bytedance.android.live.banner.IBannerService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BNf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28675BNf extends BTV<C28826BTa> {
    public static final C28675BNf LIZIZ = new C28675BNf();
    public static final List<String> LIZJ = C47261Igj.LJJIJ("webcast_banner_panel");

    @Override // X.BTV
    public final List<String> LIZLLL() {
        return LIZJ;
    }

    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, java.util.Map<String, String> map) {
        o.LJIIIZ(context, "context");
        android.net.Uri uri = c28826BTa.LIZ;
        if (uri == null) {
            return false;
        }
        IBannerService iBannerService = (IBannerService) CN1.LIZ(IBannerService.class);
        if (iBannerService != null) {
            iBannerService.jj(uri);
            return true;
        }
        return true;
    }
}
