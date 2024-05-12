package X;

import android.content.Context;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BNc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28672BNc extends BTV<C28826BTa> {
    public final List<String> LIZIZ = C47261Igj.LJJIJ("webcast_fans_club_guide");

    @Override // X.BTV
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, java.util.Map<String, String> map) {
        String str;
        o.LJIIIZ(context, "context");
        android.net.Uri uri = c28826BTa.LIZ;
        if (uri == null || (str = UriProtector.getQueryParameter(uri, "enter_from")) == null) {
            str = "";
        }
        return ((IFansClubService) CN1.LIZ(IFansClubService.class)).Mg0(str);
    }
}
