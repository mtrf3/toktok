package X;

import Y.IDRunnableS86S0100000_24;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes29.dex */
public final class ZYD {
    public final Context LIZ;
    public final ZYC LIZIZ;
    public final PackageManager LIZLLL;
    public boolean LJFF;
    public final ArrayList<ServiceConnectionC90609ZhF> LJ = new ArrayList<>();
    public final BroadcastReceiver LJI = new ZYB(this);
    public final Runnable LJII = new IDRunnableS86S0100000_24(this, 5);
    public final Handler LIZJ = new Handler();

    public final void LIZ() {
        int i;
        if (!this.LJFF) {
            return;
        }
        List<ServiceInfo> arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList = (List) this.LIZLLL.queryIntentServices(new Intent("android.media.MediaRoute2ProviderService"), 0).stream().map(new Function() { // from class: X.Zfj
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((ResolveInfo) obj).serviceInfo;
                }
            }).collect(Collectors.toList());
        }
        Iterator<ResolveInfo> it = this.LIZLLL.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null) {
                C90605ZhB c90605ZhB = ZY5.LIZJ;
                if (c90605ZhB != null && c90605ZhB.LIZIZ && arrayList != null && !arrayList.isEmpty()) {
                    for (ServiceInfo serviceInfo2 : arrayList) {
                        if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                        }
                    }
                }
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                int size = this.LJ.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    ServiceConnectionC90609ZhF serviceConnectionC90609ZhF = (ServiceConnectionC90609ZhF) ListProtector.get(this.LJ, i3);
                    if (serviceConnectionC90609ZhF.LJLJLLL.getPackageName().equals(str) && serviceConnectionC90609ZhF.LJLJLLL.getClassName().equals(str2)) {
                        if (i3 >= 0) {
                            if (i3 >= i2) {
                                ServiceConnectionC90609ZhF serviceConnectionC90609ZhF2 = (ServiceConnectionC90609ZhF) ListProtector.get(this.LJ, i3);
                                if (!serviceConnectionC90609ZhF2.LJLLILLLL) {
                                    serviceConnectionC90609ZhF2.LJLLILLLL = true;
                                    serviceConnectionC90609ZhF2.LJIJJ();
                                }
                                if (serviceConnectionC90609ZhF2.LJLLL == null && serviceConnectionC90609ZhF2.LJLLILLLL && (serviceConnectionC90609ZhF2.LJLJJL != null || !serviceConnectionC90609ZhF2.LJLLI.isEmpty())) {
                                    if (serviceConnectionC90609ZhF2.LJLLJ) {
                                        serviceConnectionC90609ZhF2.LJLLJ = false;
                                        serviceConnectionC90609ZhF2.LJIJI();
                                        try {
                                            serviceConnectionC90609ZhF2.LJLIL.unbindService(serviceConnectionC90609ZhF2);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }
                                    serviceConnectionC90609ZhF2.LJIIZILJ();
                                }
                                i = i2 + 1;
                                Collections.swap(this.LJ, i3, i2);
                            }
                        }
                    } else {
                        i3++;
                    }
                }
                ServiceConnectionC90609ZhF serviceConnectionC90609ZhF3 = new ServiceConnectionC90609ZhF(this.LIZ, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                serviceConnectionC90609ZhF3.LJLLLLLL = new C90513Zfh(this, serviceConnectionC90609ZhF3);
                if (!serviceConnectionC90609ZhF3.LJLLILLLL) {
                    serviceConnectionC90609ZhF3.LJLLILLLL = true;
                    serviceConnectionC90609ZhF3.LJIJJ();
                }
                i = i2 + 1;
                ListProtector.add(this.LJ, i2, serviceConnectionC90609ZhF3);
                ((C90605ZhB) this.LIZIZ).LIZ(serviceConnectionC90609ZhF3);
                i2 = i;
            }
        }
        if (i2 < this.LJ.size()) {
            for (int size2 = this.LJ.size() - 1; size2 >= i2; size2--) {
                ServiceConnectionC90609ZhF serviceConnectionC90609ZhF4 = (ServiceConnectionC90609ZhF) ListProtector.get(this.LJ, size2);
                C90605ZhB c90605ZhB2 = (C90605ZhB) this.LIZIZ;
                ZY2 LIZLLL = c90605ZhB2.LIZLLL(serviceConnectionC90609ZhF4);
                if (LIZLLL != null) {
                    serviceConnectionC90609ZhF4.getClass();
                    ZY5.LIZIZ();
                    serviceConnectionC90609ZhF4.LJLJJI = null;
                    serviceConnectionC90609ZhF4.LJIILLIIL(null);
                    c90605ZhB2.LJIIL(LIZLLL, null);
                    c90605ZhB2.LJIIJ.LIZIZ(514, LIZLLL);
                    c90605ZhB2.LJI.remove(LIZLLL);
                }
                this.LJ.remove(serviceConnectionC90609ZhF4);
                serviceConnectionC90609ZhF4.LJLLLLLL = null;
                if (serviceConnectionC90609ZhF4.LJLLILLLL) {
                    serviceConnectionC90609ZhF4.LJLLILLLL = false;
                    serviceConnectionC90609ZhF4.LJIJJ();
                }
            }
        }
    }

    public ZYD(Context context, C90605ZhB c90605ZhB) {
        this.LIZ = context;
        this.LIZIZ = c90605ZhB;
        this.LIZLLL = context.getPackageManager();
    }
}
