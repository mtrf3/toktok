package X;

import Y.IDRunnableS86S0100000_24;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.VolumeProvider;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZhB, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90605ZhB implements ZYH, ZYC {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final C90597Zh3 LIZJ;
    public final C90982ZnG LJIIJJI;
    public final boolean LJIIL;
    public C90509Zfd LJIILIIL;
    public ZY4 LJIILJJIL;
    public ZY4 LJIILL;
    public ZY4 LJIILLIIL;
    public AbstractC90096ZXo LJIIZILJ;
    public ZY4 LJIJ;
    public AbstractC90599Zh5 LJIJI;
    public C90524Zfs LJIJJLI;
    public C90524Zfs LJIL;
    public int LJJ;
    public ZY0 LJJI;
    public ZY1 LJJIFFI;
    public C90106ZXy LJJII;
    public MediaSessionCompat LJJIII;
    public final ArrayList<WeakReference<ZY5>> LIZLLL = new ArrayList<>();
    public final ArrayList<ZY4> LJ = new ArrayList<>();
    public final java.util.Map<C15070iV<String, String>, String> LJFF = new HashMap();
    public final ArrayList<ZY2> LJI = new ArrayList<>();
    public final ArrayList<C90107ZXz> LJII = new ArrayList<>();
    public final ZYE LJIIIIZZ = new ZYE();
    public final C90604ZhA LJIIIZ = new C90604ZhA(this);
    public final HandlerC90105ZXx LJIIJ = new HandlerC90105ZXx(this);
    public final java.util.Map<String, AbstractC90096ZXo> LJIJJ = new HashMap();
    public final InterfaceC007201c LJJIIJ = new C90601Zh7(this);
    public final C90602Zh8 LJJIIJZLJL = new C90602Zh8(this);

    public final ZY4 LIZJ() {
        Iterator<ZY4> it = this.LJ.iterator();
        while (it.hasNext()) {
            ZY4 next = it.next();
            if (next != this.LJIILJJIL && next.LIZJ() == this.LJIIJJI && next.LJIIL("android.media.intent.category.LIVE_AUDIO") && !next.LJIIL("android.media.intent.category.LIVE_VIDEO") && next.LJFF()) {
                return next;
            }
        }
        return this.LJIILJJIL;
    }

    public final ZY4 LJFF() {
        ZY4 zy4 = this.LJIILLIIL;
        if (zy4 != null) {
            return zy4;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final void LJI() {
        if (!this.LJIILLIIL.LJ()) {
            return;
        }
        List<ZY4> LIZIZ = this.LJIILLIIL.LIZIZ();
        HashSet hashSet = new HashSet();
        Iterator<ZY4> it = LIZIZ.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().LIZJ);
        }
        Iterator it2 = ((HashMap) this.LJIJJ).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!hashSet.contains(entry.getKey())) {
                AbstractC90096ZXo abstractC90096ZXo = (AbstractC90096ZXo) entry.getValue();
                abstractC90096ZXo.LJIIIIZZ(0);
                abstractC90096ZXo.LJ();
                it2.remove();
            }
        }
        for (ZY4 zy4 : LIZIZ) {
            if (!((HashMap) this.LJIJJ).containsKey(zy4.LIZJ)) {
                AbstractC90096ZXo LJIILIIL = zy4.LIZJ().LJIILIIL(zy4.LIZIZ, this.LJIILLIIL.LIZIZ);
                LJIILIIL.LJFF();
                ((HashMap) this.LJIJJ).put(zy4.LIZJ, LJIILIIL);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0097, code lost:
    
        if (r11.LJIL.LIZIZ() == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90605ZhB.LJIIJ():void");
    }

    public final void LJIIJJI() {
        int i;
        MediaRouter2.RoutingController routingController;
        String id;
        ZY4 zy4 = this.LJIILLIIL;
        if (zy4 != null) {
            ZYE zye = this.LJIIIIZZ;
            zye.LIZ = zy4.LJIILJJIL;
            zye.LIZIZ = zy4.LJIILL;
            zye.LIZJ = zy4.LJIILIIL;
            zye.LIZLLL = zy4.LJIIJJI;
            zye.getClass();
            if (this.LIZIZ && zy4.LIZJ() == this.LIZJ) {
                ZYE zye2 = this.LJIIIIZZ;
                AbstractC90096ZXo abstractC90096ZXo = this.LJIIZILJ;
                if (!(abstractC90096ZXo instanceof C90865ZlN) || (routingController = ((C90865ZlN) abstractC90096ZXo).LJI) == null) {
                    id = null;
                } else {
                    id = routingController.getId();
                }
                zye2.LJ = id;
            } else {
                this.LJIIIIZZ.LJ = null;
            }
            if (this.LJII.size() <= 0) {
                C90106ZXy c90106ZXy = this.LJJII;
                if (c90106ZXy != null) {
                    ZY4 zy42 = this.LJIILLIIL;
                    ZY4 zy43 = this.LJIILJJIL;
                    if (zy43 != null) {
                        if (zy42 == zy43 || zy42 == this.LJIILL) {
                            c90106ZXy.LIZ();
                            return;
                        }
                        ZYE zye3 = this.LJIIIIZZ;
                        if (zye3.LIZJ == 1) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        int i2 = zye3.LIZIZ;
                        int i3 = zye3.LIZ;
                        String str = zye3.LJ;
                        MediaSessionCompat mediaSessionCompat = c90106ZXy.LIZ;
                        if (mediaSessionCompat == null) {
                            return;
                        }
                        AbstractC12270dz abstractC12270dz = c90106ZXy.LIZIZ;
                        if (abstractC12270dz != null && i == 0 && i2 == 0) {
                            abstractC12270dz.LIZLLL = i3;
                            C12250dx.LIZ((VolumeProvider) abstractC12270dz.LIZ(), i3);
                            abstractC12270dz.getClass();
                            return;
                        } else {
                            C90606ZhC c90606ZhC = new C90606ZhC(c90106ZXy, i, i2, i3, str);
                            c90106ZXy.LIZIZ = c90606ZhC;
                            mediaSessionCompat.LIZ.LJII(c90606ZhC);
                            return;
                        }
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ListProtector.get(this.LJII, 0).getClass();
            throw null;
        }
        C90106ZXy c90106ZXy2 = this.LJJII;
        if (c90106ZXy2 == null) {
            return;
        }
        c90106ZXy2.LIZ();
    }

    public C90605ZhB(Context context) {
        C90982ZnG c90982ZnG;
        this.LIZ = context;
        WeakHashMap<Context, C0VI> weakHashMap = C0VI.LIZ;
        synchronized (weakHashMap) {
            if (weakHashMap.get(context) == null) {
                weakHashMap.put(context, new C0VI());
            }
        }
        this.LJIIL = ((ActivityManager) C16880lQ.LLILL(context, "activity")).isLowRamDevice();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Intent intent = new Intent(context, (Class<?>) C90511Zff.class);
            intent.setPackage(context.getPackageName());
            this.LIZIZ = context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0;
        } else {
            this.LIZIZ = false;
        }
        if (this.LIZIZ) {
            this.LIZJ = new C90597Zh3(context, new C90603Zh9(this));
        } else {
            this.LIZJ = null;
        }
        if (i >= 24) {
            c90982ZnG = new C91030Zo2(context, this);
        } else {
            c90982ZnG = new C90982ZnG(context, this);
        }
        this.LJIIJJI = c90982ZnG;
    }

    public final void LIZ(AbstractC90097ZXp abstractC90097ZXp) {
        if (LIZLLL(abstractC90097ZXp) == null) {
            ZY2 zy2 = new ZY2(abstractC90097ZXp);
            this.LJI.add(zy2);
            this.LJIIJ.LIZIZ(513, zy2);
            LJIIL(zy2, abstractC90097ZXp.LJLJL);
            C90604ZhA c90604ZhA = this.LJIIIZ;
            ZY5.LIZIZ();
            abstractC90097ZXp.LJLJJI = c90604ZhA;
            abstractC90097ZXp.LJIILLIIL(this.LJIJJLI);
        }
    }

    public final ZY2 LIZLLL(AbstractC90097ZXp abstractC90097ZXp) {
        int size = this.LJI.size();
        for (int i = 0; i < size; i++) {
            if (((ZY2) ListProtector.get(this.LJI, i)).LIZ == abstractC90097ZXp) {
                return (ZY2) ListProtector.get(this.LJI, i);
            }
        }
        return null;
    }

    public final int LJ(String str) {
        int size = this.LJ.size();
        for (int i = 0; i < size; i++) {
            if (((ZY4) ListProtector.get(this.LJ, i)).LIZJ.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final void LJIILJJIL(boolean z) {
        ZY4 zy4 = this.LJIILJJIL;
        if (zy4 != null && !zy4.LJFF()) {
            this.LJIILJJIL = null;
        }
        if (this.LJIILJJIL == null && !this.LJ.isEmpty()) {
            Iterator<ZY4> it = this.LJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ZY4 next = it.next();
                if (next.LIZJ() == this.LJIIJJI && next.LIZIZ.equals("DEFAULT_ROUTE") && next.LJFF()) {
                    this.LJIILJJIL = next;
                    break;
                }
            }
        }
        ZY4 zy42 = this.LJIILL;
        if (zy42 != null && !zy42.LJFF()) {
            this.LJIILL = null;
        }
        if (this.LJIILL == null && !this.LJ.isEmpty()) {
            Iterator<ZY4> it2 = this.LJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ZY4 next2 = it2.next();
                if (next2.LIZJ() == this.LJIIJJI && next2.LJIIL("android.media.intent.category.LIVE_AUDIO") && !next2.LJIIL("android.media.intent.category.LIVE_VIDEO") && next2.LJFF()) {
                    this.LJIILL = next2;
                    break;
                }
            }
        }
        ZY4 zy43 = this.LJIILLIIL;
        if (zy43 == null || !zy43.LJI) {
            LJIIIZ(LIZJ(), 0);
        } else {
            if (!z) {
                return;
            }
            LJI();
            LJIIJJI();
        }
    }

    public final String LIZIZ(ZY2 zy2, String str) {
        String flattenToShortString = zy2.LIZJ.LIZ.flattenToShortString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(flattenToShortString);
        LIZ.append(":");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (LJ(LIZIZ) < 0) {
            ((HashMap) this.LJFF).put(new C15070iV(flattenToShortString, str), LIZIZ);
            return LIZIZ;
        }
        int i = 2;
        while (true) {
            String LLLZI = C16880lQ.LLLZI(Locale.US, "%s_%d", new Object[]{LIZIZ, Integer.valueOf(i)});
            if (LJ(LLLZI) < 0) {
                ((HashMap) this.LJFF).put(new C15070iV(flattenToShortString, str), LLLZI);
                return LLLZI;
            }
            i++;
        }
    }

    public final void LJIIIIZZ(ZY4 zy4, int i) {
        if (!this.LJ.contains(zy4) || !zy4.LJI) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC90097ZXp LIZJ = zy4.LIZJ();
            C90597Zh3 c90597Zh3 = this.LIZJ;
            if (LIZJ == c90597Zh3 && this.LJIILLIIL != zy4) {
                MediaRoute2Info LJIIZILJ = c90597Zh3.LJIIZILJ(zy4.LIZIZ);
                if (LJIIZILJ == null) {
                    return;
                }
                c90597Zh3.LJLJLLL.transferTo(LJIIZILJ);
                return;
            }
        }
        LJIIIZ(zy4, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r0 == r12) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.ZY4 r12, int r13) {
        /*
            r11 = this;
            X.ZhB r0 = X.ZY5.LIZJ
            r3 = 3
            r6 = r12
            r4 = r11
            if (r0 == 0) goto L19
            X.ZY4 r0 = r4.LJIILL
            if (r0 == 0) goto L3b
            r6.getClass()
            X.ZY5.LIZIZ()
            X.ZhB r0 = X.ZY5.LIZJ
            X.ZY4 r0 = r0.LJIILJJIL
            if (r0 == 0) goto L33
            if (r0 != r6) goto L3b
        L19:
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            java.lang.StackTraceElement[] r2 = r0.getStackTrace()
            r1 = 3
        L22:
            int r0 = r2.length
            if (r1 >= r0) goto L3b
            r0 = r2[r1]
            r0.getClassName()
            r0.getMethodName()
            r0.getLineNumber()
            int r1 = r1 + 1
            goto L22
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "There is no default route.  The media router has not yet been fully initialized."
            r1.<init>(r0)
            throw r1
        L3b:
            X.ZY4 r0 = r4.LJIILLIIL
            if (r0 != r6) goto L40
            return
        L40:
            X.ZY4 r0 = r4.LJIJ
            r9 = 0
            if (r0 == 0) goto L55
            r4.LJIJ = r9
            X.Zh5 r0 = r4.LJIJI
            if (r0 == 0) goto L55
            r0.LJIIIIZZ(r3)
            X.Zh5 r0 = r4.LJIJI
            r0.LJ()
            r4.LJIJI = r9
        L55:
            boolean r0 = r4.LIZIZ
            if (r0 == 0) goto L82
            X.ZY2 r0 = r6.LIZ
            X.ZXr r0 = r0.LIZLLL
            if (r0 == 0) goto L82
            boolean r0 = r0.LIZJ
            if (r0 == 0) goto L82
            X.ZXp r1 = r6.LIZJ()
            java.lang.String r0 = r6.LIZIZ
            X.Zh5 r2 = r1.LJIIJJI(r0)
            if (r2 == 0) goto L82
            android.content.Context r0 = r4.LIZ
            java.util.concurrent.Executor r1 = X.C04330Ez.LIZLLL(r0)
            X.Zh8 r0 = r4.LJJIIJZLJL
            r2.LJIILLIIL(r1, r0)
            r4.LJIJ = r6
            r4.LJIJI = r2
            r2.LJFF()
            return
        L82:
            X.ZXp r1 = r6.LIZJ()
            java.lang.String r0 = r6.LIZIZ
            X.ZXo r7 = r1.LJIIL(r0)
            if (r7 == 0) goto L91
            r7.LJFF()
        L91:
            X.ZY4 r0 = r4.LJIILLIIL
            r8 = r13
            if (r0 != 0) goto Lad
            r4.LJIILLIIL = r6
            r4.LJIIZILJ = r7
            X.ZXx r2 = r4.LJIIJ
            X.0iV r1 = new X.0iV
            r1.<init>(r9, r6)
            r0 = 262(0x106, float:3.67E-43)
            android.os.Message r0 = r2.obtainMessage(r0, r1)
            r0.arg1 = r8
            r0.sendToTarget()
            return
        Lad:
            r5 = r4
            r10 = r9
            r4.LJII(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90605ZhB.LJIIIZ(X.ZY4, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(ZY2 zy2, C90099ZXr c90099ZXr) {
        boolean z;
        int i;
        int i2 = 0;
        if (zy2.LIZLLL != c90099ZXr) {
            zy2.LIZLLL = c90099ZXr;
            if (c90099ZXr != null && (c90099ZXr.LIZIZ() || c90099ZXr == this.LJIIJJI.LJLJL)) {
                List<C90089ZXh> list = c90099ZXr.LIZIZ;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                z = false;
                i2 = 0;
                for (C90089ZXh c90089ZXh : list) {
                    if (c90089ZXh != null && c90089ZXh.LJIIIIZZ()) {
                        String LIZLLL = c90089ZXh.LIZLLL();
                        int size = ((ArrayList) zy2.LIZIZ).size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                break;
                            }
                            if (((ZY4) ListProtector.get(zy2.LIZIZ, i3)).LIZIZ.equals(LIZLLL)) {
                                if (i3 >= 0) {
                                    if (i3 >= i2) {
                                        ZY4 zy4 = (ZY4) ListProtector.get(zy2.LIZIZ, i3);
                                        i = i2 + 1;
                                        Collections.swap(zy2.LIZIZ, i3, i2);
                                        if (c90089ZXh.LIZIZ().size() > 0) {
                                            arrayList2.add(new C15070iV(zy4, c90089ZXh));
                                        } else if (LJIILIIL(zy4, c90089ZXh) != 0 && zy4 == this.LJIILLIIL) {
                                            i2 = i;
                                            z = true;
                                        }
                                    }
                                }
                            } else {
                                i3++;
                            }
                        }
                        ZY4 zy42 = new ZY4(zy2, LIZLLL, LIZIZ(zy2, LIZLLL));
                        i = i2 + 1;
                        ListProtector.add(zy2.LIZIZ, i2, zy42);
                        this.LJ.add(zy42);
                        if (c90089ZXh.LIZIZ().size() > 0) {
                            arrayList.add(new C15070iV(zy42, c90089ZXh));
                        } else {
                            zy42.LJIIIIZZ(c90089ZXh);
                            this.LJIIJ.LIZIZ(257, zy42);
                        }
                        i2 = i;
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C15070iV c15070iV = (C15070iV) it.next();
                    ZY4 zy43 = (ZY4) c15070iV.LIZ;
                    zy43.LJIIIIZZ((C90089ZXh) c15070iV.LIZIZ);
                    this.LJIIJ.LIZIZ(257, zy43);
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C15070iV c15070iV2 = (C15070iV) it2.next();
                    ZY4 zy44 = (ZY4) c15070iV2.LIZ;
                    if (LJIILIIL(zy44, (C90089ZXh) c15070iV2.LIZIZ) != 0 && zy44 == this.LJIILLIIL) {
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            for (int size2 = ((ArrayList) zy2.LIZIZ).size() - 1; size2 >= i2; size2--) {
                ZY4 zy45 = (ZY4) ListProtector.get(zy2.LIZIZ, size2);
                zy45.LJIIIIZZ(null);
                this.LJ.remove(zy45);
            }
            LJIILJJIL(z);
            for (int size3 = ((ArrayList) zy2.LIZIZ).size() - 1; size3 >= i2; size3--) {
                this.LJIIJ.LIZIZ(258, ListProtector.remove(zy2.LIZIZ, size3));
            }
            this.LJIIJ.LIZIZ(515, zy2);
        }
    }

    public final int LJIILIIL(ZY4 zy4, C90089ZXh c90089ZXh) {
        int LJIIIIZZ = zy4.LJIIIIZZ(c90089ZXh);
        if (LJIIIIZZ != 0) {
            if ((LJIIIIZZ & 1) != 0) {
                this.LJIIJ.LIZIZ(259, zy4);
            }
            if ((LJIIIIZZ & 2) != 0) {
                this.LJIIJ.LIZIZ(260, zy4);
            }
            if ((LJIIIIZZ & 4) != 0) {
                this.LJIIJ.LIZIZ(261, zy4);
            }
        }
        return LJIIIIZZ;
    }

    public final void LJII(C90605ZhB c90605ZhB, ZY4 zy4, AbstractC90096ZXo abstractC90096ZXo, int i, ZY4 zy42, Collection<C90092ZXk> collection) {
        ZY0 zy0;
        ZY1 zy1 = this.LJJIFFI;
        if (zy1 != null) {
            zy1.LIZ();
            this.LJJIFFI = null;
        }
        ZY1 zy12 = new ZY1(c90605ZhB, zy4, abstractC90096ZXo, i, zy42, collection);
        this.LJJIFFI = zy12;
        if (zy12.LIZIZ != 3 || (zy0 = this.LJJI) == null) {
            zy12.LIZIZ();
            return;
        }
        final ZY4 zy43 = this.LJIILLIIL;
        final ZY4 zy44 = zy12.LIZLLL;
        final C90674ZiI c90674ZiI = (C90674ZiI) zy0;
        c90674ZiI.getClass();
        C90674ZiI.LIZJ.getClass();
        final C90945Zmf c90945Zmf = new C90945Zmf();
        c90674ZiI.LIZIZ.post(new Runnable() { // from class: X.ZbP
            public final void LIZ() {
                C90613ZhJ LIZJ;
                C90613ZhJ LIZJ2;
                C67646Qgk LIZLLL;
                C90674ZiI c90674ZiI2 = C90674ZiI.this;
                ZY4 zy45 = zy43;
                ZY4 zy46 = zy44;
                C90945Zmf<Void> c90945Zmf2 = c90945Zmf;
                final C90319ZcZ c90319ZcZ = c90674ZiI2.LIZ;
                c90319ZcZ.getClass();
                if (new HashSet(c90319ZcZ.LIZ).isEmpty()) {
                    C90319ZcZ.LJFF.getClass();
                    c90945Zmf2.LJI();
                    return;
                }
                if (zy45.LJIIJ != 1 || zy46.LJIIJ != 0) {
                    C90319ZcZ.LJFF.getClass();
                    c90945Zmf2.LJI();
                    return;
                }
                ZYS zys = c90319ZcZ.LIZJ;
                SessionState sessionState = null;
                if (zys == null || (LIZJ = zys.LIZJ()) == null) {
                    C90319ZcZ.LJFF.getClass();
                    c90945Zmf2.LJI();
                    return;
                }
                LIZJ.LJIIJJI = c90319ZcZ;
                C90639Zhj LJIIIIZZ = LIZJ.LJIIIIZZ();
                if (LJIIIIZZ == null || !LJIIIIZZ.LJIIIZ()) {
                    C90319ZcZ.LJFF.getClass();
                    ZYS zys2 = c90319ZcZ.LIZJ;
                    if (zys2 != null && (LIZJ2 = zys2.LIZJ()) != null) {
                        LIZJ2.LJIIJJI = null;
                    }
                    c90945Zmf2.LJI();
                    return;
                }
                C90319ZcZ.LJFF.getClass();
                c90319ZcZ.LJ = null;
                c90319ZcZ.LIZIZ = 1;
                c90319ZcZ.LIZLLL = c90945Zmf2;
                QH7.LJ("Must be called from the main thread.");
                if (LJIIIIZZ.LJJIII()) {
                    MediaStatus LJI = LJIIIIZZ.LJI();
                    QH7.LJIIIIZZ(LJI);
                    if (LJI.LJJJJZI(262144L)) {
                        C90827Zkl c90827Zkl = LJIIIIZZ.LIZJ;
                        c90827Zkl.getClass();
                        JSONObject jSONObject = new JSONObject();
                        long LIZIZ = c90827Zkl.LIZIZ();
                        try {
                            jSONObject.put("requestId", LIZIZ);
                            jSONObject.put("type", "STORE_SESSION");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("assistant_supported", true);
                            jSONObject2.put("display_supported", true);
                            jSONObject2.put("is_group", false);
                            jSONObject.put("targetDeviceCapabilities", jSONObject2);
                        } catch (JSONException unused) {
                            c90827Zkl.LIZ.getClass();
                        }
                        try {
                            c90827Zkl.LIZJ(LIZIZ, jSONObject.toString());
                            c90827Zkl.LJJIFFI.LIZ(LIZIZ, new C90825Zkj(c90827Zkl));
                            C67649Qgn<SessionState> c67649Qgn = new C67649Qgn<>();
                            c90827Zkl.LJJII = c67649Qgn;
                            LIZLLL = c67649Qgn.LIZ;
                        } catch (IllegalStateException e) {
                            LIZLLL = C67637Qgb.LIZLLL(e);
                        }
                    } else {
                        C67649Qgn c67649Qgn2 = new C67649Qgn();
                        MediaInfo LJ = LJIIIIZZ.LJ();
                        MediaStatus LJI2 = LJIIIIZZ.LJI();
                        if (LJ != null && LJI2 != null) {
                            C90208Zam c90208Zam = new C90208Zam();
                            c90208Zam.LIZ = LJ;
                            c90208Zam.LIZLLL = LJIIIIZZ.LIZJ();
                            c90208Zam.LIZIZ = LJI2.zzv;
                            double d = LJI2.zzd;
                            if (Double.compare(d, 2.0d) <= 0 && Double.compare(d, 0.5d) >= 0) {
                                c90208Zam.LJ = d;
                                c90208Zam.LJFF = LJI2.zzk;
                                c90208Zam.LJI = LJI2.zzo;
                                MediaLoadRequestData LIZ = c90208Zam.LIZ();
                                C90216Zau c90216Zau = new C90216Zau();
                                c90216Zau.LIZ = LIZ;
                                sessionState = new SessionState(c90216Zau.LIZ, null);
                            } else {
                                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                            }
                        }
                        c67649Qgn2.LIZIZ(sessionState);
                        LIZLLL = c67649Qgn2.LIZ;
                    }
                } else {
                    LIZLLL = C67637Qgb.LIZLLL(new C90478Zf8());
                }
                InterfaceC67677QhF interfaceC67677QhF = new InterfaceC67677QhF() { // from class: X.Zio
                    @Override // X.InterfaceC67677QhF
                    public final void onSuccess(Object obj) {
                        C90319ZcZ c90319ZcZ2 = C90319ZcZ.this;
                        SessionState sessionState2 = (SessionState) obj;
                        if (sessionState2 == null) {
                            return;
                        }
                        c90319ZcZ2.LJ = sessionState2;
                        C90945Zmf<Void> c90945Zmf3 = c90319ZcZ2.LIZLLL;
                        if (c90945Zmf3 == null) {
                            return;
                        }
                        c90945Zmf3.LJI();
                    }
                };
                LIZLLL.getClass();
                LIZLLL.LJFF(C67641Qgf.LIZ, interfaceC67677QhF);
                LIZLLL.LJIILLIIL(new InterfaceC67679QhH() { // from class: X.Zik
                    @Override // X.InterfaceC67679QhH
                    public final void onFailure(Exception exc) {
                        C90319ZcZ c90319ZcZ2 = C90319ZcZ.this;
                        C90319ZcZ.LJFF.getClass();
                        C90945Zmf<Void> c90945Zmf3 = c90319ZcZ2.LIZLLL;
                        if (c90945Zmf3 != null) {
                            c90945Zmf3.cancel(false);
                        }
                    }
                });
                C90272Zbo.LIZ(EnumC90770Zjq.CAST_TRANSFER_TO_LOCAL_USED);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        ZY1 zy13 = this.LJJIFFI;
        C90605ZhB c90605ZhB2 = zy13.LJI.get();
        if (c90605ZhB2 == null || c90605ZhB2.LJJIFFI != zy13) {
            zy13.LIZ();
            return;
        }
        if (zy13.LJII == null) {
            zy13.LJII = c90945Zmf;
            IDRunnableS86S0100000_24 iDRunnableS86S0100000_24 = new IDRunnableS86S0100000_24(zy13, 38);
            final HandlerC90105ZXx handlerC90105ZXx = c90605ZhB2.LJIIJ;
            Objects.requireNonNull(handlerC90105ZXx);
            c90945Zmf.LJFF(iDRunnableS86S0100000_24, new Executor() { // from class: X.Zft
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    HandlerC90105ZXx.this.post(runnable);
                }
            });
            return;
        }
        throw new IllegalStateException("future is already set");
    }
}
