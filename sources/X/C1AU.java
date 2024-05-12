package X;

import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import java.lang.reflect.Field;

/* renamed from: X.1AU, reason: invalid class name */
/* loaded from: classes.dex */
public class C1AU extends Activity implements LifecycleOwner, InterfaceC16250kP {
    public C0MA<Class<? extends C021506p>, C021506p> mExtraDataMap = new C0MA<>();
    public LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);

    public void androidx_core_app_ComponentActivity__setRequestedOrientation$___twin___(int i) {
        super.setRequestedOrientation(i);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onCreate(this, bundle);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_setRequestedOrientation(this, i);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public static boolean shouldSkipDump(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.getClass();
        switch (str.hashCode()) {
            case -645125871:
                if (!str.equals("--translation") || Build.VERSION.SDK_INT < 31) {
                    return false;
                }
                return true;
            case 1159329357:
                if (!str.equals("--contentcapture") || Build.VERSION.SDK_INT < 29) {
                    return false;
                }
                return true;
            case 1455016274:
                if (!str.equals("--autofill") || Build.VERSION.SDK_INT < 26) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public void androidx_core_app_ComponentActivity__onCreate$___twin___(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.injectIfNeededIn(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && C16260kQ.LIZ(decorView, keyEvent)) {
            return true;
        }
        return C16260kQ.LIZIZ(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && C16260kQ.LIZ(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends C021506p> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.getOrDefault(cls, null);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.markState(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void putExtraData(C021506p c021506p) {
        this.mExtraDataMap.put(c021506p.getClass(), c021506p);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // X.InterfaceC16250kP
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static void androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onCreate(C1AU c1au, Bundle bundle) {
        if (bundle != null && Q7K.LIZIZ("fix_androidx_fragment", 0) == 1) {
            C026908r.LIZ(bundle, "android:fragments", Fragment.class);
            C026908r.LIZ(bundle, "android:support:fragments", androidx.fragment.app.Fragment.class);
        }
        if (Build.VERSION.SDK_INT == 26) {
            TypedArray obtainStyledAttributes = c1au.obtainStyledAttributes(new int[]{R.attr.windowIsTranslucent});
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            int requestedOrientation = c1au.getRequestedOrientation();
            obtainStyledAttributes.recycle();
            if (z && requestedOrientation != -1) {
                try {
                    Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                    declaredField.setAccessible(true);
                    ((ActivityInfo) declaredField.get(c1au)).screenOrientation = -1;
                    declaredField.setAccessible(false);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        C58604MzI.LIZIZ.LIZ.startNewPage(c1au.getClass().getName());
        c1au.androidx_core_app_ComponentActivity__onCreate$___twin___(bundle);
    }

    public static void androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_setRequestedOrientation(C1AU c1au, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            c1au.androidx_core_app_ComponentActivity__setRequestedOrientation$___twin___(i);
            return;
        }
        TypedArray obtainStyledAttributes = c1au.obtainStyledAttributes(new int[]{R.attr.windowIsTranslucent});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!z) {
            c1au.androidx_core_app_ComponentActivity__setRequestedOrientation$___twin___(i);
        }
    }
}
