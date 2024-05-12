package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.scene.navigation.NavigationScene;

/* loaded from: classes8.dex */
public final class HJO {
    public final String LIZ;
    public final Bundle LIZIZ;
    public boolean LIZJ = true;
    public boolean LIZLLL = true;
    public int LJ;

    public final Bundle LIZ() {
        if (!TextUtils.isEmpty(this.LIZ)) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_rootScene", this.LIZ);
            bundle.putBundle("extra_rootScene_arguments", this.LIZIZ);
            bundle.putBoolean("extra_drawWindowBackground", this.LIZJ);
            bundle.putBoolean("extra_fixSceneBackground_enabled", this.LIZLLL);
            bundle.putInt("extra_sceneBackground", this.LJ);
            return bundle;
        }
        throw new IllegalArgumentException("call setRootScene first");
    }

    public HJO(Bundle bundle, Class cls) {
        if (!cls.isAssignableFrom(NavigationScene.class)) {
            this.LIZ = cls.getName();
            this.LIZIZ = bundle;
            return;
        }
        throw new IllegalArgumentException("cant use NavigationScene as root scene");
    }

    public HJO(String str, Bundle bundle) {
        this.LIZ = str;
        this.LIZIZ = bundle;
    }
}
