package X;

import Y.IDRunnableS85S0100000;
import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.0nS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18140nS implements Application.ActivityLifecycleCallbacks {
    public static final C18140nS LJLIL = new C18140nS();
    public static final HashMap<String, Boolean> LJLILLLLZI = new HashMap<>();
    public static int LJLJI;
    public static WeakReference<Activity> LJLJJI;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C18080nM.LIZ.getClass();
        C18090nN c18090nN = C18080nM.LJFF.get(String.valueOf(activity.hashCode()));
        if (c18090nN != null) {
            C18080nM.LIZJ(c18090nN);
        }
        int hashCode = activity.hashCode();
        ((HashMap) C13930gf.LIZIZ).remove(Integer.valueOf(hashCode));
        ((HashMap) C13930gf.LIZJ).remove(Integer.valueOf(hashCode));
        C13930gf.LJIIIZ(String.valueOf(hashCode));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C13930gf.LIZJ(activity.hashCode(), false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        if (viewGroup != null && viewGroup.getChildCount() > 0 && !(viewGroup.getChildAt(0) instanceof GestureDetectorOnGestureListenerC13970gj)) {
            GestureDetectorOnGestureListenerC13970gj gestureDetectorOnGestureListenerC13970gj = new GestureDetectorOnGestureListenerC13970gj(activity);
            while (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                C16880lQ.LLIFFJFJJ(0, viewGroup);
                gestureDetectorOnGestureListenerC13970gj.addView(childAt, childAt.getLayoutParams());
            }
            viewGroup.addView(gestureDetectorOnGestureListenerC13970gj, new ViewGroup.LayoutParams(-1, -1));
        }
        LIZ(this, activity);
        LJLJJI = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        int i = LJLJI;
        LJLJI = i + 1;
        if (i == 0) {
            C18080nM.LIZ.getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C13930gf.LIZJ(activity.hashCode(), false);
        int i = LJLJI - 1;
        LJLJI = i;
        if (i == 0) {
            C18080nM.LIZ.getClass();
            C18090nN c18090nN = C18080nM.LIZJ;
            if (c18090nN != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C18080nM.LIZIZ);
                LIZ.append('.');
                LIZ.append(c18090nN.LIZIZ());
                LIZ.append(".c-1.d-1");
                c18090nN.LJII = X1D.LIZIZ(LIZ);
                C18080nM.LJIIJ(c18090nN);
                C18080nM.LIZJ = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C18140nS c18140nS, Activity activity) {
        c18140nS.getClass();
        InterfaceC19570pl interfaceC19570pl = C19490pd.LIZ;
        boolean z = true;
        if (interfaceC19570pl != null && interfaceC19570pl.LIZJ(activity)) {
            return;
        }
        String className = activity.getComponentName().getClassName();
        o.LJIIIIZZ(className, "activity.componentName.className");
        if (activity instanceof InterfaceC18010nF) {
            HashMap<String, Boolean> hashMap = LJLILLLLZI;
            if (!hashMap.containsKey(className)) {
                Method[] declaredMethods = activity.getClass().getDeclaredMethods();
                o.LJIIIIZZ(declaredMethods, "activity.javaClass.declaredMethods");
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (o.LJ(declaredMethods[i].getName(), "getBtmPageCode")) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                hashMap.put(className, Boolean.valueOf(z));
            }
            Boolean bool = LJLILLLLZI.get(className);
            if (bool != null && bool.booleanValue()) {
                C12460eI.LJIIIIZZ((InterfaceC18010nF) activity, null);
                return;
            }
        }
        InterfaceC18020nG<Activity> interfaceC18020nG = C18050nJ.LIZ;
        if (interfaceC18020nG == null) {
            return;
        }
        C12460eI.LJII(interfaceC18020nG.LJ(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String string;
        ConcurrentHashMap<String, C18090nN> concurrentHashMap;
        C18090nN c18090nN;
        o.LJIIIZ(activity, "activity");
        C18080nM.LIZ.getClass();
        if (bundle != null && (string = bundle.getString("btm:prID")) != null && (c18090nN = (concurrentHashMap = C18080nM.LJFF).get(string)) != null) {
            c18090nN.LJJIIZI = true;
            activity.getWindow().getDecorView().setTag(-1843987113, c18090nN);
            String valueOf = String.valueOf(activity.hashCode());
            o.LJIIIZ(valueOf, "<set-?>");
            c18090nN.LIZ = valueOf;
            concurrentHashMap.put(valueOf, c18090nN);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("restore  ");
            LIZ.append((String) ListProtector.get(s.LJLJJL(c18090nN.LIZ(), new String[]{"."}, 0, 6), 1));
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
        }
        new WeakReference(activity);
        LIZ(this, activity);
        C38995FSd.LIZLLL().submit(new IDRunnableS85S0100000(C03660Ck.LIZJ("btm_activity", C16880lQ.LJLLJ(activity.getClass())), 94));
        LJLJJI = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
        C18080nM.LIZ.getClass();
        String valueOf = String.valueOf(activity.hashCode());
        C18090nN c18090nN = C18080nM.LJFF.get(valueOf);
        if (c18090nN != null) {
            EnumC18130nR enumC18130nR = EnumC18130nR.SAVEINSTANCESTATE;
            o.LJIIIZ(enumC18130nR, "<set-?>");
            c18090nN.LJIILL = enumC18130nR;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("store  ");
            LIZ.append((String) ListProtector.get(s.LJLJJL(c18090nN.LIZ(), new String[]{"."}, 0, 6), 1));
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
        }
        outState.putString("btm:prID", valueOf);
    }
}
