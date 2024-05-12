package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.ss.android.ugc.aweme.utils.LanguageService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G2A extends G46 {
    public static final G2A LIZJ = new G2A();

    @Override // X.G48, X.InterfaceC86124Xr6
    public final Context attachPreBaseContext(Context context) {
        LanguageService.LIZJ().LIZ(context);
        return context;
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityStarted(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        LanguageService.LIZJ().LIZIZ(activity);
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void attachBaseContext(Context context, Activity activity) {
        o.LJIIIZ(activity, "activity");
        LanguageService.LIZJ().LIZIZ(activity);
    }

    @Override // X.G46, X.G48, X.InterfaceC86124Xr6
    public final void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        super.onActivityCreated(activity, bundle);
        LanguageService.LIZJ().LIZIZ(activity);
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onConfigurationChanged(ActivityC86117Xqz activity, Configuration newConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(newConfig, "newConfig");
        G12.LIZLLL(activity, newConfig);
        LanguageService.LIZJ().LIZIZ(activity);
    }
}
