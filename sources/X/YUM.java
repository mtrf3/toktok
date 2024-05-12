package X;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes16.dex */
public abstract class YUM extends ActivityC86117Xqz implements YU5<Object> {
    public volatile YU7 componentManager;
    public final Object componentManagerLock = new Object();

    public final YU7 componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    public YU7 createComponentManager() {
        return new YU7(this);
    }

    @Override // X.YU5
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory LIZ = C87440YTk.LIZ(this);
        if (LIZ != null) {
            return LIZ;
        }
        return new ViewModelProvider.NewInstanceFactory();
    }

    public void inject() {
        ((YUY) generatedComponent()).LJIILJJIL();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        inject();
        super.onCreate(bundle);
    }
}
