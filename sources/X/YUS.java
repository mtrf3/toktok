package X;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes16.dex */
public abstract class YUS extends FNL implements YU5<Object> {
    public volatile YU7 LJLJL;
    public final Object LJLJLJ = new Object();

    @Override // X.YU5
    public final Object generatedComponent() {
        if (this.LJLJL == null) {
            synchronized (this.LJLJLJ) {
                if (this.LJLJL == null) {
                    this.LJLJL = new YU7(this);
                }
            }
        }
        return this.LJLJL.generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory LIZ = C87440YTk.LIZ(this);
        if (LIZ != null) {
            return LIZ;
        }
        return new ViewModelProvider.NewInstanceFactory();
    }

    @Override // X.FNL, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        ((YUX) generatedComponent()).LJ();
        super.onCreate(bundle);
    }
}
