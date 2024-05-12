package com.bytedance.immersionbar;

import X.ActivityC45651qj;
import X.C025107z;
import X.C61714OJy;
import X.JF4;
import X.JF6;
import X.OK0;
import android.R;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class ImmersionBar {
    public static final Map<String, ImmersionBar> LJIIJJI = new HashMap();
    public final ActivityC45651qj LIZ;
    public Window LIZIZ;
    public ViewGroup LIZJ;
    public ViewGroup LIZLLL;
    public ImmersionBar LJ;
    public C61714OJy LJFF;
    public JF6 LJI;
    public String LJII;
    public final boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public final void LIZJ() {
        if (this.LJ == null) {
            this.LJ = LJIILIIL(this.LIZ);
        }
        ImmersionBar immersionBar = this.LJ;
        if (!immersionBar.LJIIJ) {
            immersionBar.LJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0149, code lost:
    
        if (r7 >= 23) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.immersionbar.ImmersionBar.LJ():void");
    }

    public final void LJIIJJI() {
        C61714OJy c61714OJy = this.LJFF;
        c61714OJy.LJLILLLLZI = 0;
        c61714OJy.LJLJJL = true;
    }

    public final void LJIIL() {
        this.LJFF.LJLIL = 0;
    }

    public static boolean LIZIZ(View view) {
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (((childAt instanceof C025107z) && LIZIZ(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ImmersionBar LJIILIIL(ActivityC45651qj activityC45651qj) {
        String obj = activityC45651qj.toString();
        Map<String, ImmersionBar> map = LJIIJJI;
        ImmersionBar immersionBar = (ImmersionBar) ((HashMap) map).get(obj);
        if (immersionBar == null) {
            ImmersionBar immersionBar2 = new ImmersionBar(activityC45651qj, obj);
            ((HashMap) map).put(obj, immersionBar2);
            return immersionBar2;
        }
        return immersionBar;
    }

    public final void LIZ(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.immersionbar.ImmersionBar.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handleDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void handleDestroy() {
                ImmersionBar immersionBar = ImmersionBar.this;
                immersionBar.getClass();
                Iterator it = ((HashMap) ImmersionBar.LJIIJJI).entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((String) entry.getKey()).contains(immersionBar.LJII) || ((String) entry.getKey()).equals(immersionBar.LJII)) {
                        it.remove();
                    }
                }
                immersionBar.LJIIJ = false;
            }
        });
    }

    public final void LIZLLL(OK0 ok0) {
        this.LJFF.LJLJJLL = ok0;
        if (JF4.LIZ == 19 || JF4.LIZIZ()) {
            OK0 ok02 = this.LJFF.LJLJJLL;
            OK0 ok03 = OK0.FLAG_HIDE_NAVIGATION_BAR;
        }
    }

    public final void LJII(boolean z) {
        LJI(0.2f, z);
    }

    public final void LJIIJ(boolean z) {
        LJIIIZ(0.2f, z);
    }

    public ImmersionBar(DialogFragment dialogFragment, String str) {
        new HashMap();
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LIZ = dialogFragment.mo49getActivity();
        Dialog dialog = dialogFragment.getDialog();
        if (dialog != null) {
            LIZJ();
            LJFF(dialog.getWindow(), str);
            LIZ(dialogFragment);
            return;
        }
        throw new NullPointerException("dialog in DialogFragment cannot be null");
    }

    public final void LJFF(Window window, String str) {
        boolean z;
        this.LIZIZ = window;
        this.LJII = str;
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        this.LIZJ = viewGroup;
        this.LIZLLL = (ViewGroup) viewGroup.findViewById(R.id.content);
        this.LJFF = new C61714OJy();
        int i = JF4.LIZ;
        if (i >= 21) {
            this.LJFF.LJLILLLLZI = window.getNavigationBarColor();
            this.LJFF.LJLIL = window.getStatusBarColor();
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        boolean z2 = false;
        if (i >= 23) {
            if ((systemUiVisibility & FileUtils.BUFFER_SIZE) != 0) {
                z = true;
            } else {
                z = false;
            }
            LJIIJ(z);
            if (i >= 26) {
                if ((systemUiVisibility & 16) != 0) {
                    z2 = true;
                }
                LJII(z2);
            }
        }
    }

    public final void LJI(float f, boolean z) {
        this.LJFF.LJLJLJ = z;
        if (!z || JF4.LIZLLL() || JF4.LIZ >= 26) {
            this.LJFF.LJLJJI = 0.0f;
        } else {
            this.LJFF.LJLJJI = f;
        }
    }

    public final void LJIIIZ(float f, boolean z) {
        this.LJFF.LJLJL = z;
        if (!z || JF4.LIZLLL() || JF4.LIZJ() || JF4.LIZ >= 23) {
            C61714OJy c61714OJy = this.LJFF;
            c61714OJy.getClass();
            c61714OJy.LJLJI = 0.0f;
            return;
        }
        this.LJFF.LJLJI = f;
    }

    public ImmersionBar(Fragment fragment, String str) {
        new HashMap();
        this.LJIIIZ = false;
        this.LJIIJ = false;
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        this.LIZ = mo49getActivity;
        this.LJIIIIZZ = true;
        LIZJ();
        LJFF(mo49getActivity.getWindow(), str);
        LIZ(fragment);
    }

    public ImmersionBar(ActivityC45651qj activityC45651qj, String str) {
        new HashMap();
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LIZ = activityC45651qj;
        LJFF(activityC45651qj.getWindow(), str);
        LIZ(activityC45651qj);
    }

    public ImmersionBar(ActivityC45651qj activityC45651qj, Dialog dialog, String str) {
        new HashMap();
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LIZ = activityC45651qj;
        LIZJ();
        LJFF(dialog.getWindow(), str);
        LIZ(activityC45651qj);
    }

    public static void LJIIIIZZ(Window window, String str, boolean z) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField(str).getInt(cls2);
                Class<?> cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (z) {
                    method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i));
                }
            } catch (Exception unused) {
            }
        }
    }

    public ImmersionBar(ActivityC45651qj activityC45651qj, Window window, String str) {
        new HashMap();
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LIZ = activityC45651qj;
        LIZJ();
        LJFF(window, str);
        LIZ(activityC45651qj);
    }
}
