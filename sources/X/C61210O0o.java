package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.powerpage.interceptor.PowerPageInterceptor;
import com.bytedance.router.FakeFragment;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRouter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.O0o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61210O0o {
    public static Class<? extends ActivityC45651qj> LIZJ;
    public static boolean LIZLLL;
    public static final C61210O0o LIZ = new C61210O0o();
    public static String LIZIZ = "";
    public static final CopyOnWriteArraySet<InterfaceC61211O0p> LJ = new CopyOnWriteArraySet<>();

    public final void LIZIZ() {
        LIZIZ = "com.ss.android.ugc.aweme.host.TikTokHostActivity";
        if (LIZLLL) {
            return;
        }
        synchronized (this) {
            if (!LIZLLL) {
                LIZJ = Class.forName(LIZIZ);
                SmartRouter.addLastInterceptor(new PowerPageInterceptor());
                LIZLLL = true;
            }
        }
    }

    public final Intent LIZ(Context context, Class<? extends Fragment> cls, Bundle bundle, Integer num) {
        o.LJIIIZ(context, "context");
        LIZIZ();
        InterfaceC61213O0r interfaceC61213O0r = (InterfaceC61213O0r) cls.getAnnotation(InterfaceC61213O0r.class);
        if (interfaceC61213O0r != null) {
            Intent intent = new Intent();
            if (o.LJ(C65352Pkq.LIZ(interfaceC61213O0r.attachActivity()), C65352Pkq.LIZ(ActivityC45651qj.class))) {
                Class<? extends ActivityC45651qj> cls2 = LIZJ;
                if (cls2 == null || intent.setClass(context, cls2) == null) {
                    throw new RuntimeException("No default FragmentActivity!!!");
                }
            } else {
                if (num != null) {
                    intent.setFlags(num.intValue());
                }
                intent.setClass(context, interfaceC61213O0r.attachActivity());
            }
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("POWER_FRAGMENT_CLASS_NAME", cls.getName());
            return intent;
        }
        return null;
    }

    public final Intent LIZJ(Context context, Class<? extends Fragment> cls, Bundle bundle, int i, OnActivityResultCallback onActivityResultCallback, android.net.Uri uri, Integer num) {
        Activity activity;
        o.LJIIIZ(context, "context");
        Intent LIZ2 = LIZ(context, cls, bundle, num);
        if (LIZ2 == null) {
            return null;
        }
        LIZ2.setData(uri);
        Iterator<InterfaceC61211O0p> it = LJ.iterator();
        while (it.hasNext()) {
            it.next().onOpen(LIZ2);
        }
        if (i == Integer.MIN_VALUE) {
            if (context instanceof Application) {
                LIZ2.addFlags(268435456);
            }
            C16880lQ.LIZJ(context, LIZ2);
        } else if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            if (onActivityResultCallback != null && (activity instanceof ActivityC45651qj)) {
                FakeFragment fakeFragment = new FakeFragment();
                fakeFragment.setCallback(onActivityResultCallback);
                FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
                C1B3 LIZ3 = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                LIZ3.LJIIIIZZ(0, 1, fakeFragment, String.valueOf(System.currentTimeMillis()));
                LIZ3.LJIILLIIL();
                C78598Ut0.LJIJJ(LIZ2, fakeFragment);
                fakeFragment.startActivityForResult(LIZ2, i);
            } else {
                C16880lQ.LJFF(activity, i, LIZ2);
            }
        }
        return LIZ2;
    }
}
