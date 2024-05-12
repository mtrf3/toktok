package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class KMV extends C29S implements JBS {
    public static final KMW Companion = new KMW();
    public java.util.Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public Fragment mRootFragment;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.JBS
    public /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    public final Fragment getRootFragment() {
        Fragment fragment = this.mRootFragment;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager != null) {
            return supportFragmentManager.LJJJI(R.id.i02);
        }
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        InterfaceC36571c5 interfaceC36571c5 = this.mRootFragment;
        if (interfaceC36571c5 instanceof JBS) {
            o.LJII(interfaceC36571c5, "null cannot be cast to non-null type com.bytedance.ies.powerpage.PowerActivityDelegate");
            ((JBS) interfaceC36571c5).onBackPressed_Activity();
        } else {
            super.onBackPressed();
        }
    }

    public final String getRootFragmentClsName() {
        return C16880lQ.LLJJIJIIJIL(getIntent(), "POWER_FRAGMENT_CLASS_NAME");
    }

    @Override // X.JBS
    public void onBackPressed_Activity() {
        super.onBackPressed();
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        Fragment fragment;
        JBS jbs;
        super.onCreate(bundle);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "POWER_FRAGMENT_CLASS_NAME");
        if (LLJJIJIIJIL != null) {
            Fragment LJJJI = getSupportFragmentManager().LJJJI(R.id.i02);
            if (LJJJI != null) {
                this.mRootFragment = LJJJI;
                injectFields(LJJJI, getIntent());
            } else {
                Object newInstance = Class.forName(LLJJIJIIJIL).newInstance();
                if ((newInstance instanceof Fragment) && (fragment = (Fragment) newInstance) != null) {
                    this.mRootFragment = fragment;
                    injectFields(fragment, getIntent());
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                    LIZ.LJIIIIZZ(R.id.i02, 1, fragment, null);
                    LIZ.LJI();
                }
            }
            InterfaceC36571c5 interfaceC36571c5 = this.mRootFragment;
            if ((interfaceC36571c5 instanceof JBS) && (jbs = (JBS) interfaceC36571c5) != null) {
                jbs.onBeforeActivityCreated(this);
            }
            setContentView(R.layout.ey);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        JBS jbs;
        super.onNewIntent(intent);
        Fragment fragment = this.mRootFragment;
        if (fragment != 0) {
            injectFields(fragment, intent);
            if ((fragment instanceof JBS) && (jbs = (JBS) fragment) != null) {
                jbs.onNewIntent(intent);
            }
        }
    }

    private final void injectFields(Fragment fragment, Intent intent) {
        Constructor<?> constructor;
        if (intent == null) {
            return;
        }
        Class<?> cls = fragment.getClass();
        String name = cls.getName();
        try {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(name);
                LIZ.append("__BindExtra");
                Class<?> loadClass = classLoader.loadClass(X1D.LIZIZ(LIZ));
                if (loadClass != null && (constructor = loadClass.getConstructor(cls, Intent.class)) != null) {
                    constructor.newInstance(fragment, intent);
                }
            }
        } catch (Exception unused) {
        }
        if (fragment.getArguments() == null) {
            fragment.setArguments(new Bundle());
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            arguments.putAll(C16880lQ.LLJJIJI(intent));
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        JBS jbs;
        InterfaceC36571c5 interfaceC36571c5 = this.mRootFragment;
        if ((interfaceC36571c5 instanceof JBS) && (jbs = (JBS) interfaceC36571c5) != null) {
            jbs.onActivityResult_Activity(i, i2, intent);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.JBS
    public void onActivityResult_Activity(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
