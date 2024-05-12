package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes29.dex */
public final class ZYA extends Handler {
    public final WeakReference<ZY7> LIZ;

    public ZYA(ZY7 zy7) {
        this.LIZ = new WeakReference<>(zy7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C90089ZXh c90089ZXh;
        C90089ZXh c90089ZXh2;
        C90092ZXk c90092ZXk;
        ZY7 zy7 = this.LIZ.get();
        if (zy7 != null) {
            int i = message.what;
            int i2 = message.arg1;
            int i3 = message.arg2;
            Object obj = message.obj;
            Bundle peekData = message.peekData();
            ZY8 zy8 = null;
            String string = null;
            AbstractC90599Zh5 abstractC90599Zh5 = null;
            switch (i) {
                case 0:
                    if (i2 == zy7.LJLJL) {
                        zy7.LJLJL = 0;
                        ServiceConnectionC90609ZhF serviceConnectionC90609ZhF = zy7.LJLJLLL;
                        if (serviceConnectionC90609ZhF.LJLLL == zy7 && serviceConnectionC90609ZhF.LJLLJ) {
                            serviceConnectionC90609ZhF.LJLLJ = false;
                            serviceConnectionC90609ZhF.LJIJI();
                            try {
                                serviceConnectionC90609ZhF.LJLIL.unbindService(serviceConnectionC90609ZhF);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                    AbstractC90104ZXw abstractC90104ZXw = zy7.LJLJLJ.get(i2);
                    if (abstractC90104ZXw == null) {
                        return;
                    }
                    zy7.LJLJLJ.remove(i2);
                    abstractC90104ZXw.LIZ(null, null);
                    return;
                case 1:
                default:
                    return;
                case 2:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle = (Bundle) obj;
                    if (zy7.LJLJJLL != 0 || i2 != zy7.LJLJL || i3 < 1) {
                        return;
                    }
                    zy7.LJLJL = 0;
                    zy7.LJLJJLL = i3;
                    ServiceConnectionC90609ZhF serviceConnectionC90609ZhF2 = zy7.LJLJLLL;
                    C90099ZXr LIZ = C90099ZXr.LIZ(bundle);
                    if (serviceConnectionC90609ZhF2.LJLLL == zy7) {
                        serviceConnectionC90609ZhF2.LJIILL(LIZ);
                    }
                    ServiceConnectionC90609ZhF serviceConnectionC90609ZhF3 = zy7.LJLJLLL;
                    if (serviceConnectionC90609ZhF3.LJLLL != zy7) {
                        return;
                    }
                    serviceConnectionC90609ZhF3.LJLLLL = true;
                    int size = serviceConnectionC90609ZhF3.LJLLI.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((ZY8) ListProtector.get(serviceConnectionC90609ZhF3.LJLLI, i4)).LIZJ(serviceConnectionC90609ZhF3.LJLLL);
                    }
                    C90524Zfs c90524Zfs = serviceConnectionC90609ZhF3.LJLJJL;
                    if (c90524Zfs == null) {
                        return;
                    }
                    ZY7 zy72 = serviceConnectionC90609ZhF3.LJLLL;
                    int i5 = zy72.LJLJJI;
                    zy72.LJLJJI = i5 + 1;
                    zy72.LIZJ(10, i5, 0, c90524Zfs.LIZ, null);
                    return;
                case 3:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle2 = (Bundle) obj;
                    AbstractC90104ZXw abstractC90104ZXw2 = zy7.LJLJLJ.get(i2);
                    if (abstractC90104ZXw2 == null) {
                        return;
                    }
                    zy7.LJLJLJ.remove(i2);
                    abstractC90104ZXw2.LIZIZ(bundle2);
                    return;
                case 4:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    if (peekData != null) {
                        string = peekData.getString("error");
                    }
                    Bundle bundle3 = (Bundle) obj;
                    AbstractC90104ZXw abstractC90104ZXw3 = zy7.LJLJLJ.get(i2);
                    if (abstractC90104ZXw3 == null) {
                        return;
                    }
                    zy7.LJLJLJ.remove(i2);
                    abstractC90104ZXw3.LIZ(bundle3, string);
                    return;
                case 5:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle4 = (Bundle) obj;
                    if (zy7.LJLJJLL == 0) {
                        return;
                    }
                    ServiceConnectionC90609ZhF serviceConnectionC90609ZhF4 = zy7.LJLJLLL;
                    C90099ZXr LIZ2 = C90099ZXr.LIZ(bundle4);
                    if (serviceConnectionC90609ZhF4.LJLLL != zy7) {
                        return;
                    }
                    serviceConnectionC90609ZhF4.LJIILL(LIZ2);
                    return;
                case 6:
                    if (!(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle5 = (Bundle) obj;
                    AbstractC90104ZXw abstractC90104ZXw4 = zy7.LJLJLJ.get(i2);
                    if (bundle5 != null && bundle5.containsKey("routeId")) {
                        zy7.LJLJLJ.remove(i2);
                        abstractC90104ZXw4.LIZIZ(bundle5);
                        return;
                    } else {
                        abstractC90104ZXw4.LIZ(bundle5, "DynamicGroupRouteController is created without valid route id.");
                        return;
                    }
                case 7:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle6 = (Bundle) obj;
                    if (zy7.LJLJJLL == 0) {
                        return;
                    }
                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                    if (bundle7 != null) {
                        c90089ZXh = new C90089ZXh(bundle7);
                    } else {
                        c90089ZXh = null;
                    }
                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                    ArrayList arrayList = new ArrayList();
                    Iterator it = parcelableArrayList.iterator();
                    while (it.hasNext()) {
                        Bundle bundle8 = (Bundle) it.next();
                        if (bundle8 == null) {
                            c90092ZXk = null;
                        } else {
                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                            if (bundle9 != null) {
                                c90089ZXh2 = new C90089ZXh(bundle9);
                            } else {
                                c90089ZXh2 = null;
                            }
                            c90092ZXk = new C90092ZXk(c90089ZXh2, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                        }
                        arrayList.add(c90092ZXk);
                    }
                    ServiceConnectionC90609ZhF serviceConnectionC90609ZhF5 = zy7.LJLJLLL;
                    if (serviceConnectionC90609ZhF5.LJLLL != zy7) {
                        return;
                    }
                    Iterator<ZY8> it2 = serviceConnectionC90609ZhF5.LJLLI.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ZY8 next = it2.next();
                            if (next.LIZIZ() == i3) {
                                abstractC90599Zh5 = next;
                            }
                        }
                    }
                    if (!(abstractC90599Zh5 instanceof C90867ZlP)) {
                        return;
                    }
                    abstractC90599Zh5.LJIIL(c90089ZXh, arrayList);
                    return;
                case 8:
                    ServiceConnectionC90609ZhF serviceConnectionC90609ZhF6 = zy7.LJLJLLL;
                    if (serviceConnectionC90609ZhF6.LJLLL != zy7) {
                        return;
                    }
                    Iterator<ZY8> it3 = serviceConnectionC90609ZhF6.LJLLI.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            ZY8 next2 = it3.next();
                            if (next2.LIZIZ() == i3) {
                                zy8 = next2;
                            }
                        }
                    }
                    C90513Zfh c90513Zfh = serviceConnectionC90609ZhF6.LJLLLLLL;
                    if (c90513Zfh != null && (zy8 instanceof AbstractC90096ZXo)) {
                        C90605ZhB c90605ZhB = (C90605ZhB) c90513Zfh.LIZ.LIZIZ;
                        if (c90605ZhB.LJIIZILJ == zy8) {
                            c90605ZhB.LJIIIIZZ(c90605ZhB.LIZJ(), 2);
                        }
                    }
                    serviceConnectionC90609ZhF6.LJLLI.remove(zy8);
                    zy8.LIZ();
                    serviceConnectionC90609ZhF6.LJIJJ();
                    return;
            }
        }
    }
}
