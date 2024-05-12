package X;

import android.content.Context;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.O6j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61361O6j<T> implements InterfaceC64592gB {
    public static final C61361O6j<T> LJLIL = new C61361O6j<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Boolean it = (Boolean) obj;
        Context LIZIZ = EF7.LIZIZ();
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            C61358O6g.LIZIZ(LIZIZ);
            C61363O6l.LIZIZ(LIZIZ, null);
            O6X.LIZIZ.getClass();
            C61359O6h.LJII = System.currentTimeMillis();
            C61359O6h.LJIIIZ = false;
            ArrayList arrayList = new ArrayList();
            List<WeakReference<InterfaceC61374O6w>> list = II1.LIZ;
            if (list != null) {
                arrayList.addAll(list);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterfaceC61374O6w interfaceC61374O6w = (InterfaceC61374O6w) ((Reference) it2.next()).get();
                if (interfaceC61374O6w != null) {
                    interfaceC61374O6w.onAppBackground();
                }
            }
            O7A.LIZ().LIZLLL(-1);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UDPClient. setIsFirstTimeRequestAd: ");
            LIZ.append(false);
            X1D.LIZIZ(LIZ);
            C61359O6h.LJJIIZ = false;
            C61359O6h.LJJIJIIJI = -1;
            O6Z.LIZIZ = true;
            return;
        }
        if (C61358O6g.LJFF()) {
            if (C61359O6h.LIZJ == null) {
                C61358O6g.LIZIZ(LIZIZ);
            }
            C61358O6g.LIZIZ(LIZIZ);
            C61363O6l.LIZIZ(LIZIZ, null);
            O6X.LIZIZ.getClass();
            C61359O6h.LJIIJ = System.currentTimeMillis();
            C61359O6h.LJIIIZ = true;
            ArrayList arrayList2 = new ArrayList();
            List<WeakReference<InterfaceC61374O6w>> list2 = II1.LIZ;
            if (list2 != null) {
                arrayList2.addAll(list2);
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                InterfaceC61374O6w interfaceC61374O6w2 = (InterfaceC61374O6w) ((Reference) it3.next()).get();
                if (interfaceC61374O6w2 != null) {
                    interfaceC61374O6w2.onAppForeground();
                }
            }
            if (C61359O6h.LJIIJJI != null) {
                str = C61359O6h.LIZIZ().LJ();
            } else {
                str = "";
            }
            if (!C78886Uxe.LJJIIZI(str)) {
                O76 LJI = O76.LJI();
                LJI.LIZJ.LJI("splash_ad_did", str);
                LJI.LIZJ();
            }
        }
    }
}
