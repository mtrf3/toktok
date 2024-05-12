package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokGroupSceneFragment;
import java.util.UUID;

/* loaded from: classes8.dex */
public abstract class G93 extends WMH {
    public final String LJLIL;
    public TikTokGroupSceneFragment LJLILLLLZI;

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public G93() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokGroupScene#");
        LIZ.append(getClass().getName());
        LIZ.append('#');
        LIZ.append(UUID.randomUUID());
        this.LJLIL = X1D.LIZIZ(LIZ);
    }

    @Override // X.WM7
    public void onDestroyView() {
        super.onDestroyView();
        TikTokGroupSceneFragment tikTokGroupSceneFragment = this.LJLILLLLZI;
        if (tikTokGroupSceneFragment != null) {
            FragmentManager supportFragmentManager = SceneExtensionsKt.LIZLLL(this).getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJI(tikTokGroupSceneFragment);
            c1b3.LJI();
        }
    }

    @Override // X.WM7
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // X.WMH, X.WM7
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
