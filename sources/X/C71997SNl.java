package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.IGeofencingService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SNl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71997SNl implements InterfaceC71908SKa {
    public final /* synthetic */ C71998SNm LIZ;
    public final /* synthetic */ Fragment LIZIZ;

    public C71997SNl(C71998SNm c71998SNm, Fragment fragment) {
        this.LIZ = c71998SNm;
        this.LIZIZ = fragment;
    }

    @Override // X.InterfaceC71908SKa
    public final SKV LIZ(Context context, ViewGroup parent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ahn, parent, false);
        IGeofencingService geoFencingConfig = AVExternalServiceImpl.LIZ().configService().geoFencingConfig();
        Aweme aweme = this.LIZ.LJLL.LJLIL;
        if (aweme != null) {
            o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
            geoFencingConfig.injectGeoFencingSettingItem(aweme, (FrameLayout) LLLLIILL, this.LIZIZ);
            return new SKV(LLLLIILL);
        }
        o.LJIJI("aweme");
        throw null;
    }
}
