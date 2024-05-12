package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NUt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59447NUt implements NLT, InterfaceC60172NjU {
    public final C60193Njp LJLIL;
    public final String LJLILLLLZI;
    public final NM6 LJLJI;

    @Override // X.InterfaceC60172NjU
    public final void LLLLL(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        NM6 nm6 = this.LJLJI;
        if (nm6 != null) {
            nm6.LLLLL(uri);
        }
    }

    @Override // X.NLT
    public final void LIZ(Bundle bundle, String str) {
        C60193Njp c60193Njp = this.LJLIL;
        if (c60193Njp != null) {
            c60193Njp.LIZLLL(C57415Mg7.LIZ().LJIILIIL());
            F3T f3t = new F3T();
            String str2 = this.LJLILLLLZI;
            if (str2 != null && str2.length() != 0) {
                String str3 = this.LJLILLLLZI;
                o.LJIIIZ(str3, "<set-?>");
                O1Q.LJLIL = str3;
                IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) C60373Nmj.LIZIZ().LIZ(IResourceLoaderService.class);
                if (iResourceLoaderService != null) {
                    GeckoConfig LIZIZ = O1F.LIZIZ(C61238O1q.LIZ.LIZ(iResourceLoaderService), this.LJLILLLLZI);
                    if (!o.LJ(LIZIZ.getAccessKey(), this.LJLILLLLZI)) {
                        String str4 = this.LJLILLLLZI;
                        iResourceLoaderService.registerConfig(str4, new GeckoConfig(str4, LIZIZ.getOfflineDir(), LIZIZ.getLoaderDepender(), false, false, 24, null));
                    }
                    iResourceLoaderService.registerCustomLoader(O1Q.class, EnumC60171NjT.HIGH);
                }
            }
            List LJJIJ = C47261Igj.LJJIJ("ad_commerce");
            Context context = c60193Njp.getContext();
            o.LJIIIIZZ(context, "context");
            c60193Njp.LJII(C38956FQq.LIZJ(str, LJJIJ, bundle, new C59306NPi(context)), bundle, f3t, this);
        }
    }

    @Override // X.InterfaceC60172NjU
    public final void LLL(android.net.Uri uri, Throwable e) {
        IResourceLoaderService iResourceLoaderService;
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(e, "e");
        NM6 nm6 = this.LJLJI;
        if (nm6 != null) {
            nm6.LLL(uri, e);
        }
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ad_unregister_loader_settings", false) && (iResourceLoaderService = (IResourceLoaderService) C60373Nmj.LIZIZ().LIZ(IResourceLoaderService.class)) != null) {
                iResourceLoaderService.unregisterCustomLoader(O1Q.class, EnumC60171NjT.HIGH);
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
    }

    public C59447NUt(C60193Njp c60193Njp, String str, NM6 nm6) {
        this.LJLIL = c60193Njp;
        this.LJLILLLLZI = str;
        this.LJLJI = nm6;
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        IResourceLoaderService iResourceLoaderService;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        NM6 nm6 = this.LJLJI;
        if (nm6 != null) {
            nm6.LLLII(view, uri, instance);
        }
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ad_unregister_loader_settings", false) && (iResourceLoaderService = (IResourceLoaderService) C60373Nmj.LIZIZ().LIZ(IResourceLoaderService.class)) != null) {
                iResourceLoaderService.unregisterCustomLoader(O1Q.class, EnumC60171NjT.HIGH);
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
    }

    @Override // X.InterfaceC60172NjU
    public final void gk(InterfaceC40516FvE instance, android.net.Uri uri, AbstractC59475NVv param) {
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(param, "param");
        NM6 nm6 = this.LJLJI;
        if (nm6 != null) {
            nm6.gk(instance, uri, param);
        }
    }

    @Override // X.InterfaceC60172NjU
    public final void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, android.net.Uri uri, InterfaceC40516FvE instance, boolean z) {
        o.LJIIIZ(viewComponents, "viewComponents");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        NM6 nm6 = this.LJLJI;
        if (nm6 != null) {
            nm6.LLIIL(viewComponents, uri, instance, z);
        }
    }
}
