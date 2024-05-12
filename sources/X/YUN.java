package X;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes16.dex */
public abstract class YUN extends ActivityC86117Xqz implements YU5<Object> {
    public volatile YU7 LJLIL;
    public final Object LJLILLLLZI = new Object();

    @Override // X.YU5
    public final Object generatedComponent() {
        if (this.LJLIL == null) {
            synchronized (this.LJLILLLLZI) {
                if (this.LJLIL == null) {
                    this.LJLIL = new YU7(this);
                }
            }
        }
        return this.LJLIL.generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory LIZ = C87440YTk.LIZ(this);
        if (LIZ != null) {
            return LIZ;
        }
        return new ViewModelProvider.NewInstanceFactory();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        ((YUZ) generatedComponent()).LIZ();
        super.onCreate(bundle);
    }
}
