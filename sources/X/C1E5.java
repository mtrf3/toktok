package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.1E5, reason: invalid class name */
/* loaded from: classes.dex */
public class C1E5 implements InterfaceC48038ItG, VWQ, InterfaceC53832LAu, InterfaceC006400u {
    public static final C1E5 LJLIL = new C1E5();
    public static final Object[] LJLILLLLZI = new Object[0];
    public static final Class[] LJLJI = new Class[0];
    public static C1E5 LJLJJI;

    public /* synthetic */ C1E5(long j) {
    }

    @Override // X.InterfaceC53832LAu
    public void onFailed(Exception exc) {
    }

    public static C198517qh LJ() {
        boolean z;
        PackageInfo packageInfo;
        boolean z2;
        int i;
        C198517qh c198517qh = new C198517qh();
        if (TextUtils.equals("twitter", "google")) {
            Context LIZIZ = EF7.LIZIZ();
            synchronized (C78915Uy7.class) {
                z = true;
                try {
                    packageInfo = C16880lQ.LLLLLLZ(LIZIZ.getPackageManager(), "com.google.android.gms", 1);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    packageInfo = null;
                }
            }
            if (packageInfo != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            c198517qh.LIZLLL("google_isInstalled", String.valueOf(z2));
            if (packageInfo != null) {
                c198517qh.LIZLLL("google_versionName", packageInfo.versionName);
                c198517qh.LIZLLL("google_versionCode", String.valueOf(packageInfo.versionCode));
            }
            try {
                i = C16880lQ.LLLLLZIL(GoogleApiAvailability.getInstance(), EF7.LIZIZ());
            } catch (Exception unused) {
                i = 1;
            }
            if (i != 0) {
                z = false;
            }
            c198517qh.LIZLLL("eligible", String.valueOf(z));
        }
        return c198517qh;
    }

    public static C1E5 LJFF() {
        if (LJLJJI == null) {
            LJLJJI = new C1E5();
        }
        return LJLJJI;
    }

    @Override // X.InterfaceC53832LAu
    public void onSuccess() {
        a.LJIILL().LJIIJJI();
    }

    public /* synthetic */ C1E5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final boolean LIZIZ(List list) {
        ?? r5;
        long j;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            r5 = C61878OQg.INSTANCE;
        } else {
            r5 = new ArrayList();
            Object obj = ListProtector.get(list, 0);
            int LJJI = C47261Igj.LJJI(list);
            int i = 0;
            while (i < LJJI) {
                i++;
                Object obj2 = ListProtector.get(list, i);
                C07210Qb c07210Qb = (C07210Qb) obj2;
                C07210Qb c07210Qb2 = (C07210Qb) obj;
                r5.add(new C10370av(C78923UyF.LIZ(Math.abs(C10370av.LIZLLL(c07210Qb2.LIZLLL().LIZ()) - C10370av.LIZLLL(c07210Qb.LIZLLL().LIZ())), Math.abs(C10370av.LJ(c07210Qb2.LIZLLL().LIZ()) - C10370av.LJ(c07210Qb.LIZLLL().LIZ())))));
                obj = obj2;
            }
        }
        if (r5.size() == 1) {
            j = ((C10370av) ORZ.LJLLJ(r5)).LIZ;
        } else if (!r5.isEmpty()) {
            Object LJLLJ = ORZ.LJLLJ(r5);
            int LJJI2 = C47261Igj.LJJI(r5);
            if (1 <= LJJI2) {
                int i2 = 1;
                while (true) {
                    LJLLJ = new C10370av(C10370av.LJI(((C10370av) LJLLJ).LIZ, ((C10370av) ListProtector.get(r5, i2)).LIZ));
                    if (i2 == LJJI2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((C10370av) LJLLJ).LIZ;
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (C10370av.LJ(j) < C10370av.LIZLLL(j)) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(C07210Qb c07210Qb) {
        if (C0QZ.LIZ(c07210Qb.LJFF(), C07230Qd.LJFF) != null || C0QZ.LIZ(c07210Qb.LJFF(), C07230Qd.LJ) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(C82068WIu c82068WIu) {
        o.LJIIIZ(c82068WIu, "<this>");
        if (c82068WIu.LIZIZ ? !L2F.LIZ() || c82068WIu.LJIIJ || c82068WIu.LJIIJJI : !c82068WIu.LJIIIZ) {
            return false;
        }
        return true;
    }

    @Override // X.VWQ
    public void LIZ(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // X.InterfaceC006400u
    public boolean LIZJ(InterfaceC31355CSh interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        return interceptor.LJIIIZ();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        String response = (String) obj;
        o.LJIIIZ(response, "response");
        return new T1Q(response);
    }

    public static Object LIZLLL(Class cls, Object obj) {
        if (obj instanceof C4G5) {
            return cls.cast(obj);
        }
        if (obj instanceof YU5) {
            return cls.cast(((YU5) obj).generatedComponent());
        }
        throw new IllegalStateException(C16880lQ.LLLZ("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), C4G5.class, YU5.class}));
    }

    public static final C84767XOp LJIIIIZZ(C84767XOp c84767XOp, C84767XOp c84767XOp2) {
        String str = c84767XOp.LIZ;
        if (str == null) {
            str = c84767XOp2.LIZ;
        }
        MusicWaveBean musicWaveBean = c84767XOp.LIZIZ;
        if (musicWaveBean == null) {
            musicWaveBean = c84767XOp2.LIZIZ;
        }
        Integer num = c84767XOp.LIZJ;
        if (num == null) {
            num = c84767XOp2.LIZJ;
        }
        XSX xsx = c84767XOp.LIZLLL;
        if (xsx == null) {
            xsx = c84767XOp2.LIZLLL;
        }
        Effect effect = c84767XOp.LJ;
        if (effect == null) {
            effect = c84767XOp2.LJ;
        }
        Integer num2 = c84767XOp.LJFF;
        if (num2 == null) {
            num2 = c84767XOp2.LJFF;
        }
        ExceptionResult exceptionResult = c84767XOp.LJI;
        if (exceptionResult == null) {
            exceptionResult = c84767XOp2.LJI;
        }
        return new C84767XOp(str, musicWaveBean, num, xsx, effect, num2, exceptionResult);
    }

    public static final void LJIIJJI(C17760mq c17760mq, C07210Qb c07210Qb) {
        int size;
        C0QL c0ql = (C0QL) C0QZ.LIZ(c07210Qb.LJFF(), C07230Qd.LJFF);
        if (c0ql != null) {
            c17760mq.LJIILLIIL(C17730mn.LIZ(c0ql.LIZ, c0ql.LIZIZ, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (C0QZ.LIZ(c07210Qb.LJFF(), C07230Qd.LJ) != null) {
            List LJ = c07210Qb.LJ(false);
            int size2 = LJ.size();
            for (int i = 0; i < size2; i++) {
                C07210Qb c07210Qb2 = (C07210Qb) ListProtector.get(LJ, i);
                if (c07210Qb2.LJFF().LJII(C07230Qd.LJIL)) {
                    arrayList.add(c07210Qb2);
                }
            }
        }
        int i2 = 1;
        if (!arrayList.isEmpty()) {
            if (LIZIZ(arrayList)) {
                size = 1;
                i2 = arrayList.size();
            } else {
                size = arrayList.size();
            }
            c17760mq.LJIILLIIL(C17730mn.LIZ(size, i2, 0));
        }
    }

    public static final void LJIIL(C17760mq c17760mq, C07210Qb c07210Qb) {
        int i;
        int i2 = 0;
        if (C0QZ.LIZ(c07210Qb.LJFF(), C07230Qd.LJI) != null) {
            C1JY LJFF = c07210Qb.LJFF();
            C07270Qh<Boolean> key = C07230Qd.LJIL;
            C46501s6 defaultValue = C46501s6.LJLIL;
            LJFF.getClass();
            o.LJIIIZ(key, "key");
            o.LJIIIZ(defaultValue, "defaultValue");
            Object obj = ((LinkedHashMap) LJFF.LJLIL).get(key);
            if (obj == null) {
                obj = defaultValue.invoke();
            }
            c17760mq.LJIIZILJ(C17740mo.LIZ(0, 0, 0, 0, ((Boolean) obj).booleanValue()));
        }
        C07210Qb LJI = c07210Qb.LJI();
        if (LJI != null && C0QZ.LIZ(LJI.LJFF(), C07230Qd.LJ) != null) {
            C0QL c0ql = (C0QL) C0QZ.LIZ(LJI.LJFF(), C07230Qd.LJFF);
            if ((c0ql != null && (c0ql.LIZ < 0 || c0ql.LIZIZ < 0)) || !c07210Qb.LJFF().LJII(C07230Qd.LJIL)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List LJ = LJI.LJ(false);
            int size = LJ.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C07210Qb c07210Qb2 = (C07210Qb) ListProtector.get(LJ, i4);
                if (c07210Qb2.LJFF().LJII(C07230Qd.LJIL)) {
                    arrayList.add(c07210Qb2);
                    if (c07210Qb2.LIZJ.LJZL < c07210Qb.LIZJ.LJZL) {
                        i3++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                if (LIZIZ(arrayList)) {
                    i = 0;
                    i2 = i3;
                } else {
                    i = i3;
                }
                C1JY LJFF2 = c07210Qb.LJFF();
                C07270Qh<Boolean> key2 = C07230Qd.LJIL;
                C46491s5 defaultValue2 = C46491s5.LJLIL;
                LJFF2.getClass();
                o.LJIIIZ(key2, "key");
                o.LJIIIZ(defaultValue2, "defaultValue");
                Object obj2 = ((LinkedHashMap) LJFF2.LJLIL).get(key2);
                if (obj2 == null) {
                    obj2 = defaultValue2.invoke();
                }
                c17760mq.LJIIZILJ(C17740mo.LIZ(i, 1, i2, 1, ((Boolean) obj2).booleanValue()));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C32541Pm LJIIIZ(int r6, X.InterfaceC24520xk r7, int r8) {
        /*
            r0 = 1470655220(0x57a86af4, float:3.7035463E14)
            r7.LJJIIJ(r0)
            r0 = r8 & 1
            r5 = 0
            if (r0 == 0) goto Lc
            r6 = 0
        Lc:
            java.lang.Object[] r4 = new java.lang.Object[r5]
            X.1HY r3 = X.C32541Pm.LJIJ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.LJJIIJ(r0)
            boolean r2 = r7.LJIJJ(r2)
            boolean r0 = r7.LJIJJ(r1)
            r2 = r2 | r0
            java.lang.Object r1 = r7.LJIILL()
            if (r2 != 0) goto L36
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L3e
        L36:
            X.207 r1 = new X.207
            r1.<init>(r6, r5)
            r7.LJJIII(r1)
        L3e:
            r7.LJJIJIIJIL()
            X.Pro r1 = (X.InterfaceC65784Pro) r1
            r0 = 4
            java.lang.Object r0 = X.C73975T1n.LJIIIIZZ(r4, r3, r1, r7, r0)
            X.1Pm r0 = (X.C32541Pm) r0
            r7.LJJIJIIJIL()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1E5.LJIIIZ(int, X.0xk, int):X.1Pm");
    }

    public static final void LJIIJ(XKU xku, InterfaceC67352kd interfaceC67352kd, boolean z) {
        Object LJ;
        C84653XKf<?> c84653XKf;
        boolean LJJZZIII;
        Object LJII = xku.LJII();
        Throwable LIZJ = xku.LIZJ(LJII);
        if (LIZJ != null) {
            LJ = C141335gf.LIZ(LIZJ);
        } else {
            LJ = xku.LJ(LJII);
        }
        C3C5.m7constructorimpl(LJ);
        if (z) {
            XKT xkt = (XKT) interfaceC67352kd;
            InterfaceC67352kd<T> interfaceC67352kd2 = xkt.LJLJJL;
            Object obj = xkt.LJLJL;
            MBA context = interfaceC67352kd2.getContext();
            Object LIZJ2 = XLG.LIZJ(obj, context);
            if (LIZJ2 != XLG.LIZ) {
                c84653XKf = C84648XKa.LIZIZ(interfaceC67352kd2, context, LIZJ2);
            } else {
                c84653XKf = null;
            }
            try {
                xkt.LJLJJL.resumeWith(LJ);
                if (c84653XKf != null) {
                    if (!LJJZZIII) {
                        return;
                    }
                }
                return;
            } finally {
                if (c84653XKf == null || c84653XKf.LJJZZIII()) {
                    XLG.LIZ(LIZJ2, context);
                }
            }
        }
        interfaceC67352kd.resumeWith(LJ);
    }
}
