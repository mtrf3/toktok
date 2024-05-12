package X;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAG extends HA5 {
    public final String LIZLLL;

    @Override // X.InterfaceC43634HAo
    public final void LIZ(Object obj) {
        InterfaceC84498XEg interfaceC84498XEg;
        Application application;
        Activity activity;
        Activity activity2;
        if (TextUtils.isEmpty(this.LIZ.LJIIJ)) {
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
        WeakReference<Activity> weakReference = hae.LIZIZ;
        if (weakReference != null && (activity2 = weakReference.get()) != null && activity2.isFinishing()) {
            LIZIZ(obj);
            return;
        }
        HAE hae2 = this.LIZ;
        if (hae2.LJI == null) {
            WeakReference<Activity> weakReference2 = hae2.LIZIZ;
            if (weakReference2 == null || weakReference2.get() == null) {
                LIZIZ(obj);
            } else {
                HAE hae3 = this.LIZ;
                EffectService companion = EffectService.Companion.getInstance();
                if (companion != null) {
                    WeakReference<Activity> weakReference3 = this.LIZ.LIZIZ;
                    if (weakReference3 != null && (activity = weakReference3.get()) != null) {
                        application = activity.getApplication();
                    } else {
                        application = null;
                    }
                    o.LJI(application);
                    interfaceC84498XEg = companion.createMvEffectPlatform(application);
                } else {
                    interfaceC84498XEg = null;
                }
                hae3.LJI = interfaceC84498XEg;
            }
        }
        HAE hae4 = this.LIZ;
        InterfaceC84498XEg interfaceC84498XEg2 = hae4.LJI;
        if (interfaceC84498XEg2 != null) {
            String str = hae4.LJIIJ;
            o.LJI(str);
            interfaceC84498XEg2.LIZLLL(str, null, new HAO(this, obj));
        }
    }

    public final void LIZIZ(Object obj) {
        if (obj instanceof HAE) {
            ((HAE) obj).LJIIL = !TextUtils.isEmpty(this.LIZLLL);
        }
        HA5 ha5 = this.LIZIZ;
        if (ha5 != null) {
            ha5.LIZ(obj);
        }
    }

    public HAG(String str, HAE hae) {
        super(hae);
        this.LIZLLL = str;
    }
}
