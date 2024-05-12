package com.ss.android.ugc.aweme.adaptation.saa;

import X.AbstractC42651GoZ;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C41030G8k;
import X.C42662Gok;
import X.C58096Mr6;
import X.C60903NvH;
import X.C68322mC;
import X.C76800UCe;
import X.InterfaceC45540Hu4;
import X.InterfaceC65784Pro;
import X.WM7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SAAService implements ICreativeSAAService {
    public static ICreativeSAAService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ICreativeSAAService.class, false);
        if (LIZ != null) {
            return (ICreativeSAAService) LIZ;
        }
        if (C58096Mr6.LLFII == null) {
            synchronized (ICreativeSAAService.class) {
                if (C58096Mr6.LLFII == null) {
                    C58096Mr6.LLFII = new SAAService();
                }
            }
        }
        return C58096Mr6.LLFII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final Lifecycle activityGetLifecycleSafely(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof SAAActivity) {
            SAAActivity sAAActivity = (SAAActivity) activity;
            C68322mC c68322mC = new C68322mC();
            sAAActivity.LLIIJI("getLifecycle", new AqS149S0200000_2(c68322mC, (C68322mC<Lifecycle>) sAAActivity, (SAAActivity) 107));
            T t = c68322mC.element;
            if (t != 0) {
                return (Lifecycle) t;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Lifecycle lifecycle = activity.getLifecycle();
        o.LJIIIIZZ(lifecycle, "{\n            activity.lifecycle\n        }");
        return lifecycle;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void finishActivitySafely(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof SAAActivity) {
            finishSAAActivitySafely(activity);
        } else {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void finishCurrentPage(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof SAAActivity) {
            AbstractC42651GoZ LLIIIILZ = ((SAAActivity) activity).LLIIIILZ();
            if (LLIIIILZ != null) {
                LLIIIILZ.LLJJI();
                return;
            }
            return;
        }
        activity.finish();
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void finishSAAActivitySafely(Activity activity) {
        SAAActivity sAAActivity;
        o.LJIIIZ(activity, "activity");
        if ((activity instanceof SAAActivity) && (sAAActivity = (SAAActivity) activity) != null) {
            sAAActivity.LLIIJLIL(new AqS152S0100000_2(sAAActivity, 1044));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final InterfaceC45540Hu4 getAVListenableActivityRegistry(Activity activity) {
        o.LJIIIZ(activity, "activity");
        WM7 currentScene = getCurrentScene(activity);
        Object obj = activity;
        if (currentScene != null) {
            obj = currentScene;
        }
        if (obj instanceof InterfaceC45540Hu4) {
            return (InterfaceC45540Hu4) obj;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final WM7 getCurrentScene(Activity activity) {
        if (activity instanceof SAAActivity) {
            return ((SAAActivity) activity).LLIIIILZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final LifecycleOwner getTargetLifecycleOwner(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return C60903NvH.LJIIJJI().LJIL().getTargetLifecycleOwner(activity);
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final boolean isSAAActivity(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return activity instanceof SAAActivity;
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void invokeMethodsSafely(Activity activity, InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(action, "action");
        if (activity instanceof SAAActivity) {
            ((SAAActivity) activity).LLIIJLIL(new AqS157S0100000_7(action, 55));
        } else {
            action.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void openPublishPage(Context context, Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (context == null) {
            return;
        }
        if (C41030G8k.LIZ()) {
            C42662Gok.LIZJ(context, C16880lQ.LLJJIJI(intent), null);
        } else {
            intent.setClass(context, VideoPublishActivity.class);
            C16880lQ.LIZJ(context, intent);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ICreativeSAAService
    public final void setResult(Activity activity, int i, Intent intent) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof SAAActivity) {
            AbstractC42651GoZ LLIIIILZ = ((SAAActivity) activity).LLIIIILZ();
            if (LLIIIILZ != null) {
                LLIIIILZ.LLJLLL(i, intent);
                return;
            }
            return;
        }
        activity.setResult(i, intent);
    }
}
