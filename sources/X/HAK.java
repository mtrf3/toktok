package X;

import Y.IDObjectS386S0100000_7;
import android.app.Activity;
import android.app.Application;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAK extends HA5 {
    public final String LIZLLL;

    @Override // X.InterfaceC43634HAo
    public final void LIZ(Object obj) {
        Activity activity;
        WeakReference<Activity> weakReference;
        Activity activity2;
        Activity activity3;
        if (!this.LIZ.LJIIL) {
            HA5 ha5 = this.LIZIZ;
            if (ha5 != null) {
                ha5.LIZ(obj);
                return;
            }
            return;
        }
        this.LIZJ.LIZIZ();
        HAE hae = this.LIZ;
        C43619H9z c43619H9z = hae.LIZ;
        if (c43619H9z != null) {
            c43619H9z.LJIIJJI = 1;
        }
        WeakReference<Activity> weakReference2 = hae.LIZIZ;
        InterfaceC84498XEg interfaceC84498XEg = null;
        r5 = null;
        Application application = null;
        if (weakReference2 != null) {
            activity = weakReference2.get();
        } else {
            activity = null;
        }
        if (activity == null || ((weakReference = this.LIZ.LIZIZ) != null && (activity3 = weakReference.get()) != null && activity3.isFinishing())) {
            long LIZ = this.LIZJ.LIZ("fetch mv panel list", "failed.");
            HAE hae2 = this.LIZ;
            C43619H9z c43619H9z2 = hae2.LIZ;
            if (c43619H9z2 != null) {
                c43619H9z2.LIZ = (int) LIZ;
                c43619H9z2.LJIIJ = "activity is finish";
                c43619H9z2.LJIIIZ = 1;
            }
            HAZ haz = hae2.LIZJ;
            if (haz != null) {
                haz.onFailed();
                return;
            }
            return;
        }
        HAE hae3 = this.LIZ;
        if (hae3.LJI == null) {
            WeakReference<Activity> weakReference3 = hae3.LIZIZ;
            if (weakReference3 == null || weakReference3.get() == null) {
                long LIZ2 = this.LIZJ.LIZ("fetch mv panel list", "failed.");
                HAE hae4 = this.LIZ;
                C43619H9z c43619H9z3 = hae4.LIZ;
                if (c43619H9z3 != null) {
                    c43619H9z3.LIZ = (int) LIZ2;
                    c43619H9z3.LJIIJ = "activity is null";
                    c43619H9z3.LJIIIZ = 1;
                }
                HAZ haz2 = hae4.LIZJ;
                if (haz2 != null) {
                    haz2.onFailed();
                }
            } else {
                HAE hae5 = this.LIZ;
                EffectService companion = EffectService.Companion.getInstance();
                if (companion != null) {
                    WeakReference<Activity> weakReference4 = this.LIZ.LIZIZ;
                    if (weakReference4 != null && (activity2 = weakReference4.get()) != null) {
                        application = activity2.getApplication();
                    }
                    o.LJI(application);
                    interfaceC84498XEg = companion.createMvEffectPlatform(application);
                }
                hae5.LJI = interfaceC84498XEg;
            }
        }
        InterfaceC84498XEg interfaceC84498XEg2 = this.LIZ.LJI;
        if (interfaceC84498XEg2 != null) {
            interfaceC84498XEg2.LJI(this.LIZLLL, false, new IDObjectS386S0100000_7(this, 1));
        }
    }

    public final boolean LIZIZ(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse == null || C77413UZt.LJIILL(effectChannelResponse.getAllCategoryEffects())) {
            long LIZ = this.LIZJ.LIZ("fetch mv panel list", "failed.");
            C43619H9z c43619H9z = this.LIZ.LIZ;
            if (c43619H9z != null) {
                c43619H9z.LIZ = (int) LIZ;
                c43619H9z.LJIIJ = "mv list is null";
                c43619H9z.LJIIIZ = 1;
            }
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
            if (C78540Us4.LJJII(effect)) {
                MvThemeData mvThemeData = new MvThemeData();
                mvThemeData.LJIILJJIL(effect);
                mvThemeData.urlPrefixList = effectChannelResponse.getUrlPrefix();
                arrayList.add(mvThemeData);
            }
        }
        if (arrayList.size() <= 0) {
            long LIZ2 = this.LIZJ.LIZ("fetch mv panel list", "failed.");
            HAE hae = this.LIZ;
            C43619H9z c43619H9z2 = hae.LIZ;
            if (c43619H9z2 != null) {
                c43619H9z2.LIZ = (int) LIZ2;
                c43619H9z2.LJIIJ = "mv list is null";
                c43619H9z2.LJIIIZ = 1;
            }
            HAZ haz = hae.LIZJ;
            if (haz != null) {
                haz.onFailed();
            }
            return false;
        }
        long LIZ3 = this.LIZJ.LIZ("fetch mv panel list", "success");
        C43619H9z c43619H9z3 = this.LIZ.LIZ;
        if (c43619H9z3 != null) {
            c43619H9z3.LIZ = (int) LIZ3;
        }
        HA5 ha5 = this.LIZIZ;
        if (ha5 != null) {
            ha5.LIZ(arrayList);
        }
        return true;
    }

    public HAK(String str, HAE hae) {
        super(hae);
        this.LIZLLL = str;
    }
}
