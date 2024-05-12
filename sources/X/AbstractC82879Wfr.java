package X;

import X.AbstractC82879Wfr;
import X.ServiceConnectionC82880Wfs;
import android.content.ComponentName;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Wfr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82879Wfr<INTERFACE> {
    public final Context LJLIL;
    public final String LJLILLLLZI;
    public final ComponentName LJLJI;
    public final InterfaceC82882Wfu<INTERFACE> LJLJJI;
    public ServiceConnectionC82880Wfs<INTERFACE> LJLJJL;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x005a, code lost:
    
        if (X.C16880lQ.LLLJL(r7.LJLIL, r4, r2, 1) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.InterfaceC88472Yns<? super INTERFACE, X.C76800UCe> r8) {
        /*
            r7 = this;
            X.Wfs<INTERFACE> r0 = r7.LJLJJL
            r3 = 0
            if (r0 != 0) goto L5e
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r0 = r7.LJLILLLLZI
            r4.<init>(r0)
            android.content.ComponentName r0 = r7.LJLJI
            r4.setComponent(r0)
            android.content.Context r0 = r7.LJLIL
            java.lang.String r0 = r0.getPackageName()
            r4.setPackage(r0)
            android.content.Context r0 = r7.LJLIL
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r6 = 0
            java.util.List r5 = r0.queryIntentServices(r4, r6)
            int r0 = r5.size()
            if (r0 <= 0) goto L74
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r6)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ServiceInfo r0 = r0.serviceInfo
            java.lang.String r1 = r0.packageName
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r6)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ServiceInfo r0 = r0.serviceInfo
            java.lang.String r0 = r0.name
            r2.<init>(r1, r0)
            r4.setComponent(r2)
            X.Wfs r2 = new X.Wfs
            androidx.lifecycle.MutableLiveData r1 = new androidx.lifecycle.MutableLiveData
            r1.<init>()
            X.Wfu<INTERFACE> r0 = r7.LJLJJI
            r2.<init>(r1, r0)
            android.content.Context r1 = r7.LJLIL
            r0 = 1
            boolean r0 = X.C16880lQ.LLLJL(r1, r4, r2, r0)
            if (r0 == 0) goto L74
        L5c:
            r7.LJLJJL = r2
        L5e:
            X.Wfs<INTERFACE> r0 = r7.LJLJJL
            if (r0 != 0) goto L69
            if (r8 != 0) goto L65
        L64:
            return
        L65:
            r8.invoke(r3)
            goto L64
        L69:
            androidx.lifecycle.MutableLiveData<INTERFACE> r1 = r0.LJLIL
            X.Wft r0 = new X.Wft
            r0.<init>(r7, r8)
            r1.observeForever(r0)
            goto L64
        L74:
            r2 = r3
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC82879Wfr.LIZIZ(X.Yns):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC82879Wfr(Context context, ComponentName componentName) {
        C82883Wfv c82883Wfv = C82883Wfv.LIZ;
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = "com.ss.android.ugc.cut_ui.image.LOADER";
        this.LJLJI = componentName;
        this.LJLJJI = c82883Wfv;
        if (context instanceof LifecycleOwner) {
            ((LifecycleOwner) context).getLifecycle().addObserver(new GenericLifecycleObserver(this) { // from class: com.ss.android.ugc.cut_ui.AbsServiceClient$1
                public final /* synthetic */ AbstractC82879Wfr<Object> LJLIL;

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_CREATE) {
                        onCreate();
                    } else if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
                public final void onCreate() {
                    this.LJLIL.LIZIZ(null);
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    AbstractC82879Wfr<Object> abstractC82879Wfr = this.LJLIL;
                    ServiceConnectionC82880Wfs<Object> serviceConnectionC82880Wfs = abstractC82879Wfr.LJLJJL;
                    if (serviceConnectionC82880Wfs != null) {
                        abstractC82879Wfr.LJLIL.unbindService(serviceConnectionC82880Wfs);
                        serviceConnectionC82880Wfs.LJLIL.setValue(null);
                    }
                    abstractC82879Wfr.LJLJJL = null;
                }

                {
                    this.LJLIL = this;
                }
            });
        }
    }
}
