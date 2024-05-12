package X;

import Y.IDCListenerS241S0100000;
import Y.IDRunnableS6S0101000;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1A5 */
/* loaded from: classes.dex */
public final class C1A5 extends C16120kC {
    public static final int[] LJIL = {R.id.lz, R.id.m0, R.id.ma, R.id.ml, R.id.mo, R.id.mp, R.id.mq, R.id.mr, R.id.f170ms, R.id.mt, R.id.m1, R.id.m2, R.id.m3, R.id.m4, R.id.m5, R.id.m6, R.id.m7, R.id.m8, R.id.m9, R.id.m_, R.id.mb, R.id.mc, R.id.md, R.id.me, R.id.mf, R.id.mg, R.id.mh, R.id.mi, R.id.mj, R.id.mk, R.id.mm, R.id.mn};
    public final C45211q1 LIZ;
    public int LIZIZ;
    public final AccessibilityManager LIZJ;
    public final Handler LIZLLL;
    public final C17780ms LJ;
    public int LJFF;
    public final C0MB<C0MB<CharSequence>> LJI;
    public final C0MB<java.util.Map<CharSequence, Integer>> LJII;
    public int LJIIIIZZ;
    public Integer LJIIIZ;
    public final C0M4<C29321Dc> LJIIJ;
    public final XK4 LJIIJJI;
    public boolean LJIIL;
    public C05F LJIILIIL;
    public java.util.Map<Integer, C05I> LJIILJJIL;
    public final C0M4<Integer> LJIILL;
    public final java.util.Map<Integer, C05G> LJIILLIIL;
    public C05G LJIIZILJ;
    public boolean LJIJ;
    public final IDRunnableS6S0101000 LJIJI;
    public final List<C1A4> LJIJJ;
    public final IDqS416S0100000 LJIJJLI;

    public final java.util.Map<Integer, C05I> LJI() {
        if (this.LJIIL) {
            C07220Qc semanticsOwner = this.LIZ.getSemanticsOwner();
            o.LJIIIZ(semanticsOwner, "<this>");
            C07210Qb LIZ = semanticsOwner.LIZ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C29321Dc c29321Dc = LIZ.LIZJ;
            if (c29321Dc.LJZI && c29321Dc.LJJIIZ()) {
                Region region = new Region();
                region.set(C78939UyV.LJJJJZ(LIZ.LIZLLL()));
                C1A8.LJIILLIIL(region, LIZ, linkedHashMap, LIZ);
            }
            this.LJIILJJIL = linkedHashMap;
            this.LJIIL = false;
        }
        return this.LJIILJJIL;
    }

    public final boolean LJIIIZ() {
        if (this.LIZJ.isEnabled() && this.LIZJ.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public C1A5(C45211q1 view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LLILL = C16880lQ.LLILL(view.getContext(), "accessibility");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.LIZJ = (AccessibilityManager) LLILL;
        this.LIZLLL = new Handler(C16880lQ.LLJJJJ());
        this.LJ = new C17780ms(new AccessibilityNodeProvider() { // from class: X.05E
            /* JADX WARN: Code restructure failed: missing block: B:165:0x036c, code lost:
            
                if (r0.LLIFFJFJJ() != false) goto L344;
             */
            /* JADX WARN: Removed duplicated region for block: B:169:0x0388  */
            /* JADX WARN: Removed duplicated region for block: B:172:0x039e  */
            /* JADX WARN: Removed duplicated region for block: B:178:0x03d6  */
            /* JADX WARN: Removed duplicated region for block: B:183:0x03f7  */
            /* JADX WARN: Removed duplicated region for block: B:186:0x0409  */
            /* JADX WARN: Removed duplicated region for block: B:206:0x049f  */
            /* JADX WARN: Removed duplicated region for block: B:210:0x0828  */
            /* JADX WARN: Removed duplicated region for block: B:220:0x0876  */
            /* JADX WARN: Removed duplicated region for block: B:223:0x04ab  */
            /* JADX WARN: Removed duplicated region for block: B:238:0x04e8  */
            /* JADX WARN: Removed duplicated region for block: B:281:0x05c9  */
            /* JADX WARN: Removed duplicated region for block: B:284:0x05e6 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:287:0x05ee  */
            /* JADX WARN: Removed duplicated region for block: B:290:0x0603  */
            /* JADX WARN: Removed duplicated region for block: B:293:0x060c  */
            /* JADX WARN: Removed duplicated region for block: B:309:0x0648 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:312:0x0650  */
            /* JADX WARN: Removed duplicated region for block: B:315:0x0665  */
            /* JADX WARN: Removed duplicated region for block: B:318:0x066e  */
            /* JADX WARN: Removed duplicated region for block: B:326:0x069c  */
            /* JADX WARN: Removed duplicated region for block: B:329:0x06a7  */
            /* JADX WARN: Removed duplicated region for block: B:374:0x0997  */
            /* JADX WARN: Removed duplicated region for block: B:378:0x09a3  */
            /* JADX WARN: Removed duplicated region for block: B:387:0x09c0 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:392:0x09cb  */
            /* JADX WARN: Removed duplicated region for block: B:395:0x09d4  */
            /* JADX WARN: Removed duplicated region for block: B:397:0x09dd  */
            /* JADX WARN: Removed duplicated region for block: B:399:0x0783  */
            /* JADX WARN: Removed duplicated region for block: B:402:0x0378  */
            @Override // android.view.accessibility.AccessibilityNodeProvider
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r26) {
                /*
                    Method dump skipped, instructions count: 2569
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C05E.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004d. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:107:0x00b0 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:110:0x00c8 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:113:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:116:0x0103  */
            /* JADX WARN: Removed duplicated region for block: B:119:0x0109  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:128:0x0129  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x013e  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x0137  */
            /* JADX WARN: Removed duplicated region for block: B:157:0x0237  */
            /* JADX WARN: Removed duplicated region for block: B:188:0x02e3  */
            /* JADX WARN: Removed duplicated region for block: B:193:0x001b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x009e A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00a7 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x02e9 -> B:135:0x0235). Please report as a decompilation issue!!! */
            @Override // android.view.accessibility.AccessibilityNodeProvider
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean performAction(int r23, int r24, android.os.Bundle r25) {
                /*
                    Method dump skipped, instructions count: 1676
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C05E.performAction(int, int, android.os.Bundle):boolean");
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo info, String extraDataKey, Bundle bundle) {
                C07210Qb c07210Qb;
                String str;
                int i2;
                Object obj;
                long LJJJZ;
                RectF rectF;
                o.LJIIIZ(info, "info");
                o.LJIIIZ(extraDataKey, "extraDataKey");
                C1A5 c1a5 = C1A5.this;
                C05I c05i = c1a5.LJI().get(Integer.valueOf(i));
                if (c05i == null || (c07210Qb = c05i.LIZ) == null) {
                    return;
                }
                String LJII = C1A5.LJII(c07210Qb);
                C1JY c1jy = c07210Qb.LJFF;
                C07270Qh<C0QK<InterfaceC88472Yns<List<C0VG>, Boolean>>> c07270Qh = C0QY.LIZ;
                if (c1jy.LJII(c07270Qh) && bundle != null && o.LJ(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i4 <= 0 || i3 < 0) {
                        return;
                    }
                    if (LJII != null) {
                        i2 = LJII.length();
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i3 >= i2) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) ((C0QK) c07210Qb.LJFF.LJIIIIZZ(c07270Qh)).LIZIZ;
                    boolean z = false;
                    if (interfaceC88472Yns != null) {
                        obj = interfaceC88472Yns.invoke(arrayList);
                    } else {
                        obj = null;
                    }
                    if (!o.LJ(obj, Boolean.TRUE)) {
                        return;
                    }
                    C0VG c0vg = (C0VG) ListProtector.get(arrayList, 0);
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    do {
                        int i6 = i3 + i5;
                        if (i6 >= c0vg.LIZ.LIZ.length()) {
                            arrayList2.add(z);
                        } else {
                            C10390ax LIZIZ = c0vg.LIZIZ(i6);
                            if (!c07210Qb.LIZJ.LJJIIZ()) {
                                LJJJZ = C10370av.LIZIZ;
                            } else {
                                LJJJZ = C78977Uz7.LJJJZ(c07210Qb.LIZIZ());
                            }
                            C10390ax LIZLLL = LIZIZ.LIZLLL(LJJJZ);
                            C10390ax LIZLLL2 = c07210Qb.LIZLLL();
                            if (LIZLLL.LIZIZ(LIZLLL2)) {
                                C10390ax c10390ax = new C10390ax(Math.max(LIZLLL.LIZ, LIZLLL2.LIZ), Math.max(LIZLLL.LIZIZ, LIZLLL2.LIZIZ), Math.min(LIZLLL.LIZJ, LIZLLL2.LIZJ), Math.min(LIZLLL.LIZLLL, LIZLLL2.LIZLLL));
                                long LJIIIZ = c1a5.LIZ.LJIIIZ(C78923UyF.LIZ(c10390ax.LIZ, c10390ax.LIZIZ));
                                long LJIIIZ2 = c1a5.LIZ.LJIIIZ(C78923UyF.LIZ(c10390ax.LIZJ, c10390ax.LIZLLL));
                                rectF = new RectF(C10370av.LIZLLL(LJIIIZ), C10370av.LJ(LJIIIZ), C10370av.LIZLLL(LJIIIZ2), C10370av.LJ(LJIIIZ2));
                            } else {
                                rectF = null;
                            }
                            arrayList2.add(rectF);
                        }
                        i5++;
                        z = false;
                    } while (i5 < i4);
                    Bundle extras = info.getExtras();
                    Object[] array = arrayList2.toArray(new RectF[0]);
                    o.LJII(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    extras.putParcelableArray(extraDataKey, (Parcelable[]) array);
                    return;
                }
                C1JY c1jy2 = c07210Qb.LJFF;
                C07270Qh<String> c07270Qh2 = C07230Qd.LJIIZILJ;
                if (!c1jy2.LJII(c07270Qh2) || bundle == null || !o.LJ(extraDataKey, "androidx.compose.ui.semantics.testTag") || (str = (String) C0QZ.LIZ(c07210Qb.LJFF, c07270Qh2)) == null) {
                    return;
                }
                info.getExtras().putCharSequence(extraDataKey, str);
            }
        });
        this.LJFF = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJI = new C0MB<>();
        this.LJII = new C0MB<>();
        this.LJIIIIZZ = -1;
        this.LJIIJ = new C0M4<>();
        this.LJIIJJI = C78934UyQ.LIZJ(-1, null, 6);
        this.LJIIL = true;
        this.LJIILJJIL = C113554cx.LJJJLIIL();
        this.LJIILL = new C0M4<>();
        this.LJIILLIIL = new LinkedHashMap();
        this.LJIIZILJ = new C05G(view.getSemanticsOwner().LIZ(), C113554cx.LJJJLIIL());
        view.addOnAttachStateChangeListener(new IDCListenerS241S0100000(this, 4));
        this.LJIJI = new IDRunnableS6S0101000(0, this, 6);
        this.LJIJJ = new ArrayList();
        this.LJIJJLI = new IDqS416S0100000(this, 6);
    }

    public static String LJII(C07210Qb c07210Qb) {
        C08440Uu c08440Uu;
        if (c07210Qb == null) {
            return null;
        }
        C1JY c1jy = c07210Qb.LJFF;
        C07270Qh<List<String>> c07270Qh = C07230Qd.LIZ;
        if (c1jy.LJII(c07270Qh)) {
            return C1XY.LJIIJ((List) c07210Qb.LJFF.LJIIIIZZ(c07270Qh));
        }
        if (C1A8.LJIJJ(c07210Qb)) {
            C08440Uu LJIIIIZZ = LJIIIIZZ(c07210Qb.LJFF);
            if (LJIIIIZZ == null) {
                return null;
            }
            return LJIIIIZZ.LJLIL;
        }
        List list = (List) C0QZ.LIZ(c07210Qb.LJFF, C07230Qd.LJIJ);
        if (list == null || (c08440Uu = (C08440Uu) ORZ.LJLLLL(list)) == null) {
            return null;
        }
        return c08440Uu.LJLIL;
    }

    public static C08440Uu LJIIIIZZ(C1JY c1jy) {
        return (C08440Uu) C0QZ.LIZ(c1jy, C07230Qd.LJIJI);
    }

    public static final boolean LJIILIIL(C0QX c0qx) {
        if ((c0qx.LIZ.invoke().floatValue() > 0.0f && !c0qx.LIZJ) || (c0qx.LIZ.invoke().floatValue() < c0qx.LIZIZ.invoke().floatValue() && c0qx.LIZJ)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILJJIL(C0QX c0qx) {
        if ((c0qx.LIZ.invoke().floatValue() < c0qx.LIZIZ.invoke().floatValue() && !c0qx.LIZJ) || (c0qx.LIZ.invoke().floatValue() > 0.0f && c0qx.LIZJ)) {
            return true;
        }
        return false;
    }

    public static CharSequence LJJI(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int length = charSequence.length();
        int i = ImagePreloadExperiment.PRIORITY_DEFAULT;
        if (length <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(ImagePreloadExperiment.PRIORITY_DEFAULT))) {
            i = 99999;
        }
        CharSequence subSequence = charSequence.subSequence(0, i);
        o.LJII(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return subSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:12:0x0050, B:13:0x0053, B:18:0x0065, B:20:0x006d, B:22:0x0076, B:24:0x007d, B:26:0x008e, B:28:0x0095, B:29:0x009e, B:38:0x0062), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b1 -> B:13:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C45551qZ
            if (r0 == 0) goto L27
            r7 = r11
            X.1qZ r7 = (X.C45551qZ) r7
            int r2 = r7.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r7.LJLJJLL = r2
        L12:
            java.lang.Object r0 = r7.LJLJJI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r7.LJLJJLL
            r6 = 2
            r5 = 1
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L35
            if (r1 != r6) goto L2d
            X.6lL r2 = r7.LJLJI
            X.0M4 r3 = r7.LJLILLLLZI
            X.1A5 r4 = r7.LJLIL
            goto L50
        L27:
            X.1qZ r7 = new X.1qZ
            r7.<init>(r10, r11)
            goto L12
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.6lL r2 = r7.LJLJI
            X.0M4 r3 = r7.LJLILLLLZI
            X.1A5 r4 = r7.LJLIL
            goto L62
        L3c:
            X.C141335gf.LIZJ(r0)
            X.0M4 r3 = new X.0M4     // Catch: java.lang.Throwable -> Lbf
            r3.<init>()     // Catch: java.lang.Throwable -> Lbf
            X.XK4 r0 = r10.LJIIJJI     // Catch: java.lang.Throwable -> Lbf
            r0.getClass()     // Catch: java.lang.Throwable -> Lbf
            X.XK6 r2 = new X.XK6     // Catch: java.lang.Throwable -> Lbf
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lbf
            r4 = r10
            goto L53
        L50:
            X.C141335gf.LIZJ(r0)     // Catch: java.lang.Throwable -> Lbd
        L53:
            r7.LJLIL = r4     // Catch: java.lang.Throwable -> Lbd
            r7.LJLILLLLZI = r3     // Catch: java.lang.Throwable -> Lbd
            r7.LJLJI = r2     // Catch: java.lang.Throwable -> Lbd
            r7.LJLJJLL = r5     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = r2.LIZ(r7)     // Catch: java.lang.Throwable -> Lbd
            if (r0 != r8) goto L65
            goto Lbc
        L62:
            X.C141335gf.LIZJ(r0)     // Catch: java.lang.Throwable -> Lbd
        L65:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lb4
            r2.next()     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r4.LJIIIZ()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L9e
            X.0M4<X.1Dc> r0 = r4.LJIIJ     // Catch: java.lang.Throwable -> Lbd
            int r9 = r0.LJLJI     // Catch: java.lang.Throwable -> Lbd
            r1 = 0
        L7b:
            if (r1 >= r9) goto L8e
            X.0M4<X.1Dc> r0 = r4.LJIIJ     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object[] r0 = r0.LJLILLLLZI     // Catch: java.lang.Throwable -> Lbd
            r0 = r0[r1]     // Catch: java.lang.Throwable -> Lbd
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> Lbd
            X.1Dc r0 = (X.C29321Dc) r0     // Catch: java.lang.Throwable -> Lbd
            r4.LJIL(r0, r3)     // Catch: java.lang.Throwable -> Lbd
            int r1 = r1 + 1
            goto L7b
        L8e:
            r3.clear()     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r4.LJIJ     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto L9e
            r4.LJIJ = r5     // Catch: java.lang.Throwable -> Lbd
            android.os.Handler r1 = r4.LIZLLL     // Catch: java.lang.Throwable -> Lbd
            Y.IDRunnableS6S0101000 r0 = r4.LJIJI     // Catch: java.lang.Throwable -> Lbd
            r1.post(r0)     // Catch: java.lang.Throwable -> Lbd
        L9e:
            X.0M4<X.1Dc> r0 = r4.LJIIJ     // Catch: java.lang.Throwable -> Lbd
            r0.clear()     // Catch: java.lang.Throwable -> Lbd
            r7.LJLIL = r4     // Catch: java.lang.Throwable -> Lbd
            r7.LJLILLLLZI = r3     // Catch: java.lang.Throwable -> Lbd
            r7.LJLJI = r2     // Catch: java.lang.Throwable -> Lbd
            r7.LJLJJLL = r6     // Catch: java.lang.Throwable -> Lbd
            r0 = 100
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r7)     // Catch: java.lang.Throwable -> Lbd
            if (r0 != r8) goto L53
            return r8
        Lb4:
            X.0M4<X.1Dc> r0 = r4.LJIIJ
            r0.clear()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lbc:
            return r8
        Lbd:
            r1 = move-exception
            goto Lc1
        Lbf:
            r1 = move-exception
            r4 = r10
        Lc1:
            X.0M4<X.1Dc> r0 = r4.LJIIJ
            r0.clear()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A5.LIZ(X.2kd):java.lang.Object");
    }

    public final int LJ(C07210Qb c07210Qb) {
        if (!c07210Qb.LJFF.LJII(C07230Qd.LIZ)) {
            C1JY c1jy = c07210Qb.LJFF;
            C07270Qh<C08350Ul> c07270Qh = C07230Qd.LJIJJ;
            if (c1jy.LJII(c07270Qh)) {
                return C08350Ul.LIZJ(((C08350Ul) c07210Qb.LJFF.LJIIIIZZ(c07270Qh)).LIZ);
            }
        }
        return this.LJIIIIZZ;
    }

    public final int LJFF(C07210Qb c07210Qb) {
        if (!c07210Qb.LJFF.LJII(C07230Qd.LIZ)) {
            C1JY c1jy = c07210Qb.LJFF;
            C07270Qh<C08350Ul> c07270Qh = C07230Qd.LJIJJ;
            if (c1jy.LJII(c07270Qh)) {
                return (int) (((C08350Ul) c07210Qb.LJFF.LJIIIIZZ(c07270Qh)).LIZ >> 32);
            }
        }
        return this.LJIIIIZZ;
    }

    public final void LJIIJ(C29321Dc c29321Dc) {
        if (this.LJIIJ.add(c29321Dc)) {
            this.LJIIJJI.LJIILLIIL(C76800UCe.LIZ);
        }
    }

    public final int LJIILL(int i) {
        if (i == this.LIZ.getSemanticsOwner().LIZ().LJI) {
            return -1;
        }
        return i;
    }

    public final boolean LJIILLIIL(AccessibilityEvent accessibilityEvent) {
        if (!LJIIIZ()) {
            return false;
        }
        return this.LIZ.getParent().requestSendAccessibilityEvent(this.LIZ, accessibilityEvent);
    }

    public final void LJIJJ(int i) {
        C05F c05f = this.LJIILIIL;
        if (c05f != null) {
            if (i != c05f.LIZ.LJI) {
                return;
            }
            if (SystemClock.uptimeMillis() - c05f.LJFF <= 1000) {
                AccessibilityEvent LIZJ = LIZJ(LJIILL(c05f.LIZ.LJI), 131072);
                LIZJ.setFromIndex(c05f.LIZLLL);
                LIZJ.setToIndex(c05f.LJ);
                LIZJ.setAction(c05f.LIZIZ);
                LIZJ.setMovementGranularity(c05f.LIZJ);
                LIZJ.getText().add(LJII(c05f.LIZ));
                LJIILLIIL(LIZJ);
            }
        }
        this.LJIILIIL = null;
    }

    public final void LJJIFFI(int i) {
        int i2 = this.LIZIZ;
        if (i2 == i) {
            return;
        }
        this.LIZIZ = i;
        LJIJ(this, i, 128, null, 12);
        LJIJ(this, i2, 256, null, 12);
    }

    @Override // X.C16120kC
    public final C17780ms getAccessibilityNodeProvider(View host) {
        o.LJIIIZ(host, "host");
        return this.LJ;
    }

    public static final boolean LJIIJJI(C0QX c0qx, float f) {
        if ((f < 0.0f && c0qx.LIZ.invoke().floatValue() > 0.0f) || (f > 0.0f && c0qx.LIZ.invoke().floatValue() < c0qx.LIZIZ.invoke().floatValue())) {
            return true;
        }
        return false;
    }

    public static final float LJIIL(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            if (Math.abs(f) < Math.abs(f2)) {
                return f;
            }
            return f2;
        }
        return 0.0f;
    }

    public final AccessibilityEvent LIZJ(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        o.LJIIIIZZ(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.LIZ.getContext().getPackageName());
        obtain.setSource(this.LIZ, i);
        C05I c05i = LJI().get(Integer.valueOf(i));
        if (c05i != null) {
            obtain.setPassword(c05i.LIZ.LJFF().LJII(C07230Qd.LJJI));
        }
        return obtain;
    }

    public final void LJIJJLI(C07210Qb c07210Qb, C05G c05g) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List LJ = c07210Qb.LJ(false);
        int size = LJ.size();
        for (int i = 0; i < size; i++) {
            C07210Qb c07210Qb2 = (C07210Qb) ListProtector.get(LJ, i);
            if (LJI().containsKey(Integer.valueOf(c07210Qb2.LJI))) {
                if (!c05g.LIZIZ.contains(Integer.valueOf(c07210Qb2.LJI))) {
                    LJIIJ(c07210Qb.LIZJ);
                    return;
                }
                linkedHashSet.add(Integer.valueOf(c07210Qb2.LJI));
            }
        }
        Iterator<Integer> it = c05g.LIZIZ.iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                LJIIJ(c07210Qb.LIZJ);
                return;
            }
        }
        List LJ2 = c07210Qb.LJ(false);
        int size2 = LJ2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C07210Qb c07210Qb3 = (C07210Qb) ListProtector.get(LJ2, i2);
            if (LJI().containsKey(Integer.valueOf(c07210Qb3.LJI))) {
                Object obj = ((LinkedHashMap) this.LJIILLIIL).get(Integer.valueOf(c07210Qb3.LJI));
                o.LJI(obj);
                LJIJJLI(c07210Qb3, (C05G) obj);
            }
        }
    }

    public final void LJIL(C29321Dc c29321Dc, C0M4<Integer> c0m4) {
        C29321Dc LJIILL;
        C1DT LJIILLIIL;
        C29321Dc LJIILL2;
        if (!c29321Dc.LJJIIZ() || this.LIZ.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c29321Dc)) {
            return;
        }
        C1DT LJIILLIIL2 = C1E4.LJIILLIIL(c29321Dc);
        if (LJIILLIIL2 == null && ((LJIILL2 = C1A8.LJIILL(c29321Dc, C45571qb.LJLIL)) == null || (LJIILLIIL2 = C1E4.LJIILLIIL(LJIILL2)) == null)) {
            return;
        }
        if (!C78598Ut0.LIZLLL(LJIILLIIL2).LJLILLLLZI && (LJIILL = C1A8.LJIILL(c29321Dc, C45561qa.LJLIL)) != null && (LJIILLIIL = C1E4.LJIILLIIL(LJIILL)) != null) {
            LJIILLIIL2 = LJIILLIIL;
        }
        int i = C78840Uwu.LJJIJ(LJIILLIIL2).LJLILLLLZI;
        if (!c0m4.add(Integer.valueOf(i))) {
            return;
        }
        LJIJ(this, LJIILL(i), 2048, 1, 8);
    }

    public final boolean LIZIZ(int i, long j, boolean z) {
        C07270Qh<C0QX> c07270Qh;
        C0QX c0qx;
        int i2;
        Collection<C05I> currentSemanticsNodes = LJI().values();
        o.LJIIIZ(currentSemanticsNodes, "currentSemanticsNodes");
        if (C10370av.LIZIZ(j, C10370av.LIZLLL)) {
            return false;
        }
        if (!Float.isNaN(C10370av.LIZLLL(j)) && !Float.isNaN(C10370av.LJ(j))) {
            if (z) {
                c07270Qh = C07230Qd.LJIILIIL;
            } else if (!z) {
                c07270Qh = C07230Qd.LJIIL;
            } else {
                throw new C162476Zf();
            }
            if (currentSemanticsNodes.isEmpty()) {
                return false;
            }
            for (C05I c05i : currentSemanticsNodes) {
                Rect rect = c05i.LIZIZ;
                o.LJIIIZ(rect, "<this>");
                float f = rect.left;
                float f2 = rect.top;
                float f3 = rect.right;
                float f4 = rect.bottom;
                if (C10370av.LIZLLL(j) >= f && C10370av.LIZLLL(j) < f3 && C10370av.LJ(j) >= f2 && C10370av.LJ(j) < f4 && (c0qx = (C0QX) C0QZ.LIZ(c05i.LIZ.LJFF(), c07270Qh)) != null) {
                    boolean z2 = c0qx.LIZJ;
                    if (z2) {
                        i2 = -i;
                    } else {
                        i2 = i;
                    }
                    if ((i == 0 && z2) || i2 < 0) {
                        if (c0qx.LIZ.invoke().floatValue() > 0.0f) {
                            return true;
                        }
                    } else if (c0qx.LIZ.invoke().floatValue() < c0qx.LIZIZ.invoke().floatValue()) {
                        return true;
                    }
                }
            }
            return false;
        }
        "Offset argument contained a NaN value.".toString();
        throw new IllegalStateException("Offset argument contained a NaN value.");
    }

    public final void LJIJI(int i, int i2, String str) {
        AccessibilityEvent LIZJ = LIZJ(LJIILL(i), 32);
        LIZJ.setContentChangeTypes(i2);
        if (str != null) {
            LIZJ.getText().add(str);
        }
        LJIILLIIL(LIZJ);
    }

    public final boolean LJIIZILJ(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !LJIIIZ()) {
            return false;
        }
        AccessibilityEvent LIZJ = LIZJ(i, i2);
        if (num != null) {
            LIZJ.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            LIZJ.setContentDescription(C1XY.LJIIJ(list));
        }
        return LJIILLIIL(LIZJ);
    }

    public final boolean LJJ(C07210Qb c07210Qb, int i, int i2, boolean z) {
        String LJII;
        Integer num;
        Integer num2;
        C1JY c1jy = c07210Qb.LJFF;
        C07270Qh<C0QK<InterfaceC88473Ynt<Integer, Integer, Boolean, Boolean>>> c07270Qh = C0QY.LJI;
        boolean z2 = false;
        if (c1jy.LJII(c07270Qh) && C1A8.LJIIL(c07210Qb)) {
            InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) ((C0QK) c07210Qb.LJFF.LJIIIIZZ(c07270Qh)).LIZIZ;
            if (interfaceC88473Ynt == null) {
                return false;
            }
            return ((Boolean) interfaceC88473Ynt.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        }
        if ((i == i2 && i2 == this.LJIIIIZZ) || (LJII = LJII(c07210Qb)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > LJII.length()) {
            i = -1;
        }
        this.LJIIIIZZ = i;
        if (LJII.length() > 0) {
            z2 = true;
        }
        int LJIILL = LJIILL(c07210Qb.LJI);
        Integer num3 = null;
        if (z2) {
            num = Integer.valueOf(this.LJIIIIZZ);
            num2 = Integer.valueOf(this.LJIIIIZZ);
            num3 = Integer.valueOf(LJII.length());
        } else {
            num = null;
            num2 = null;
        }
        LJIILLIIL(LIZLLL(LJIILL, num, num2, num3, LJII));
        LJIJJ(c07210Qb.LJI);
        return true;
    }

    public static /* synthetic */ void LJIJ(C1A5 c1a5, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        c1a5.LJIIZILJ(i, i2, num, null);
    }

    public final AccessibilityEvent LIZLLL(int i, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent LIZJ = LIZJ(i, FileUtils.BUFFER_SIZE);
        if (num != null) {
            LIZJ.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            LIZJ.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            LIZJ.setItemCount(num3.intValue());
        }
        if (str != null) {
            LIZJ.getText().add(str);
        }
        return LIZJ;
    }
}
