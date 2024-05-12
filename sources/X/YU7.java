package X;

import android.app.Activity;
import android.app.Application;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;

/* loaded from: classes16.dex */
public final class YU7 implements YU5<Object> {
    public volatile C253069wU LJLIL;
    public final Object LJLILLLLZI = new Object();
    public final Activity LJLJI;
    public final ActivityRetainedComponentManager LJLJJI;

    public final Object LIZ() {
        if (!(this.LJLJI.getApplication() instanceof YU5)) {
            if (Application.class.equals(this.LJLJI.getApplication().getClass())) {
                throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: ");
            LIZ.append(this.LJLJI.getApplication().getClass());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        C244619ir LIZ2 = ((YUA) this.LJLJJI.generatedComponent()).LIZ();
        Activity activity = this.LJLJI;
        LIZ2.getClass();
        activity.getClass();
        LIZ2.getClass();
        return new C253069wU(LIZ2.LIZ, LIZ2.LIZIZ, new C81719W5j(), activity);
    }

    @Override // X.YU5
    public final Object generatedComponent() {
        if (this.LJLIL == null) {
            synchronized (this.LJLILLLLZI) {
                if (this.LJLIL == null) {
                    this.LJLIL = (C253069wU) LIZ();
                }
            }
        }
        return this.LJLIL;
    }

    public YU7(Activity activity) {
        this.LJLJI = activity;
        this.LJLJJI = new ActivityRetainedComponentManager((C1AU) activity);
    }
}
