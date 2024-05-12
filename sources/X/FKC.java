package X;

import android.app.Application;
import android.content.Intent;

/* loaded from: classes7.dex */
public abstract class FKC extends Application implements YU5<Object> {
    public final FKF LJLIL = new FKF(new FKG(this));

    @Override // X.YU5
    public final Object generatedComponent() {
        return this.LJLIL.generatedComponent();
    }

    @Override // android.app.Application
    public void onCreate() {
        if (FCD.LJI(this)) {
            ((C4G4) generatedComponent()).LIZIZ();
        }
        super.onCreate();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        C1FP.LJIJI(C35527Dwx.LJLIL);
        super.startActivity(intent);
    }
}
