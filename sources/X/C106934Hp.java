package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS10S1110000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106934Hp {
    public final C3B7 LIZ;
    public final C3AF LIZIZ = new C3AF(0);
    public final String LIZJ = "";

    public C106934Hp(C3B7 c3b7) {
        this.LIZ = c3b7;
    }

    public final List<C3AD> LIZ(List<String> userIdList) {
        o.LJIIIZ(userIdList, "userIdList");
        C3AF c3af = this.LIZIZ;
        c3af.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = userIdList.iterator();
        while (it.hasNext()) {
            C3AD LIZIZ = c3af.LIZIZ.LIZIZ(it.next());
            if (LIZIZ != null) {
                arrayList.add(LIZIZ);
            }
        }
        C106844Hg.LIZIZ("local", arrayList, null);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.4Hr] */
    public final AbstractC73547Stj LIZIZ(final String scene, final boolean z) {
        o.LJIIIZ(scene, "scene");
        C106844Hg.LIZJ(scene, "pre", null, z);
        if (C4I2.LIZ) {
            final ?? r1 = new InterfaceC107034Hz() { // from class: X.4Hr
                @Override // X.InterfaceC107034Hz
                public final void LIZ(C73434Sru c73434Sru) {
                    final InterfaceC92693kP LJI = C73542Ste.LJI(C106934Hp.this.LIZ.LIZJ(scene, z), new AqS10S1110000_1(scene, z, c73434Sru, 0), new C106994Hv(scene, z, c73434Sru));
                    c73434Sru.setCancellable(new InterfaceC73436Srw() { // from class: X.4Hy
                        @Override // X.InterfaceC73436Srw
                        public final void cancel() {
                            if (!InterfaceC92693kP.this.isDisposed()) {
                                InterfaceC92693kP.this.dispose();
                            }
                        }
                    });
                }
            };
            return new AbstractC73547Stj(r1) { // from class: X.4I0
                public final InterfaceC107034Hz LJLIL;

                {
                    this.LJLIL = r1;
                }

                @Override // X.AbstractC73547Stj
                public final void LJIIL(InterfaceC73442Ss2 interfaceC73442Ss2) {
                    C73434Sru c73434Sru = new C73434Sru(interfaceC73442Ss2);
                    interfaceC73442Ss2.onSubscribe(c73434Sru);
                    try {
                        this.LJLIL.LIZ(c73434Sru);
                    } catch (Throwable th) {
                        V0N.LJJIL(th);
                        c73434Sru.onError(th);
                    }
                }
            };
        }
        C73671Svj LIZJ = this.LIZ.LIZJ(scene, z);
        InterfaceC29937Boz interfaceC29937Boz = new InterfaceC29937Boz() { // from class: X.4Hu
            @Override // X.InterfaceC29937Boz
            public final void run() {
                C106844Hg.LIZJ(scene, "success", null, z);
            }
        };
        C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
        IMU imu = C73674Svm.LIZJ;
        return LIZJ.LJ(c42222Ghe, interfaceC29937Boz, imu).LJ(new InterfaceC64592gB() { // from class: X.4Hs
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C106844Hg.LIZJ(scene, "fail", (Throwable) obj, z);
            }
        }, imu, imu);
    }
}
