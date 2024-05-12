package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public final class BPQ {
    public static ExecutorService LIZ;
    public static BPR LIZIZ;
    public static Method LIZJ;

    public static ExecutorService LIZIZ() {
        if (LIZ == null) {
            if (C39144FXw.LIZ() != null && C39144FXw.LIZ().LIZLLL != null) {
                LIZ = C39144FXw.LIZ().LIZLLL;
            } else {
                throw new IllegalStateException("SceneManagerConfig#executorservice must init");
            }
        }
        return LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        if (r3.getHost() == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        if (LIZJ(r3) == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009c, code lost:
    
        if (r3.getChildFragmentManager().LJJJJLI().size() <= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009e, code lost:
    
        r0 = LIZ(r3.getChildFragmentManager().LJJJJLI());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00aa, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ac, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        return LJ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0061, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.fragment.app.Fragment LIZ(java.util.List<androidx.fragment.app.Fragment> r8) {
        /*
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            r5 = 0
            r4 = 0
        Ld:
            int r0 = r8.size()
            if (r7 >= r0) goto L44
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r7)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L3b
            boolean r0 = r3.isHidden()
            if (r0 != 0) goto L3b
            java.lang.String r0 = r3.getTag()
            if (r0 == 0) goto L3e
            java.lang.String r1 = r3.getTag()
            java.lang.String r0 = "android:switcher:"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L3e
            r4 = 1
        L38:
            r2.add(r3)
        L3b:
            int r7 = r7 + 1
            goto Ld
        L3e:
            r6.add(r3)
            int r5 = r5 + 1
            goto L38
        L44:
            if (r5 != 0) goto L4b
            androidx.fragment.app.Fragment r0 = LJ(r2)
            return r0
        L4b:
            r1 = 0
            if (r4 == 0) goto Ld7
            r7 = 0
        L4f:
            int r0 = r6.size()
            if (r7 >= r0) goto Ld2
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r7)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.view.View r5 = r3.getView()
            if (r5 != 0) goto L64
        L61:
            int r7 = r7 + 1
            goto L4f
        L64:
            X.BPR r0 = X.BPQ.LIZIZ
            if (r0 != 0) goto L6e
            X.BPR r0 = X.C39144FXw.LIZ()
            X.BPQ.LIZIZ = r0
        L6e:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L61
            r4 = 0
        L73:
            r1 = r5
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r0 = r1.getChildCount()
            if (r4 >= r0) goto L61
            android.view.View r0 = r1.getChildAt(r4)
            boolean r0 = r0 instanceof androidx.viewpager.widget.ViewPager
            if (r0 == 0) goto Lad
        L84:
            java.lang.Object r0 = r3.getHost()
            if (r0 == 0) goto Lcd
            androidx.fragment.app.FragmentManager r0 = LIZJ(r3)
            if (r0 == 0) goto Lcd
            androidx.fragment.app.FragmentManager r0 = r3.getChildFragmentManager()
            java.util.List r0 = r0.LJJJJLI()
            int r0 = r0.size()
            if (r0 <= 0) goto Lcd
            androidx.fragment.app.FragmentManager r0 = r3.getChildFragmentManager()
            java.util.List r0 = r0.LJJJJLI()
            androidx.fragment.app.Fragment r0 = LIZ(r0)
            if (r0 == 0) goto Lcd
            return r0
        Lad:
            X.BPR r0 = X.BPQ.LIZIZ
            if (r0 == 0) goto Lca
            boolean r0 = r0.LIZIZ
            if (r0 == 0) goto Lca
            android.view.View r0 = r1.getChildAt(r4)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = X.C16880lQ.LJLLJ(r0)
            java.lang.String r0 = "ViewPager"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lca
            goto L84
        Lca:
            int r4 = r4 + 1
            goto L73
        Lcd:
            androidx.fragment.app.Fragment r0 = LJ(r2)
            return r0
        Ld2:
            androidx.fragment.app.Fragment r0 = LIZLLL(r6)
            return r0
        Ld7:
            int r0 = r2.size()
            if (r0 <= 0) goto Le1
            androidx.fragment.app.Fragment r1 = LIZLLL(r2)
        Le1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BPQ.LIZ(java.util.List):androidx.fragment.app.Fragment");
    }

    public static FragmentManager LIZJ(Fragment fragment) {
        try {
            if (LIZJ == null) {
                LIZJ = Fragment.class.getDeclaredMethod("peekChildFragmentManager", new Class[0]);
            }
            Method method = LIZJ;
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            return (FragmentManager) LIZJ.invoke(fragment, new Object[0]);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r0 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.fragment.app.Fragment LIZLLL(java.util.List<androidx.fragment.app.Fragment> r6) {
        /*
            r5 = r6
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r0 = r5.isEmpty()
            r4 = 0
            if (r0 == 0) goto Lb
        La:
            return r4
        Lb:
            r3 = 0
            r2 = 0
        Ld:
            int r0 = r5.size()
            if (r2 >= r0) goto L63
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L60
            android.view.View r1 = r0.getView()
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L60
            android.view.View r1 = r0.getView()
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L60
        L39:
            java.lang.Object r1 = r0.getHost()
            if (r1 == 0) goto L6c
            androidx.fragment.app.FragmentManager r1 = LIZJ(r0)
            if (r1 == 0) goto L6c
            androidx.fragment.app.FragmentManager r1 = r0.getChildFragmentManager()
            java.util.List r1 = r1.LJJJJLI()
            int r1 = r1.size()
            if (r1 <= 0) goto L6c
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.util.List r0 = r0.LJJJJLI()
            androidx.fragment.app.Fragment r0 = LIZ(r0)
            return r0
        L60:
            int r2 = r2 + 1
            goto Ld
        L63:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r3)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto La
            goto L39
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BPQ.LIZLLL(java.util.List):androidx.fragment.app.Fragment");
    }

    public static Fragment LJ(List<Fragment> list) {
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            Fragment fragment = (Fragment) ListProtector.get(list, i);
            if (fragment.getTag() != null && fragment.getTag().startsWith("android:switcher:") && fragment.getUserVisibleHint() && fragment.getHost() != null) {
                if (LIZJ(fragment) == null) {
                    return fragment;
                }
                List<Fragment> LJJJJLI = fragment.getChildFragmentManager().LJJJJLI();
                if (LJJJJLI.size() > 0) {
                    return LIZ(LJJJJLI);
                }
                return fragment;
            }
        }
        return null;
    }
}
