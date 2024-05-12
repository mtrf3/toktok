package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.ui.SceneContainerActivity;

/* renamed from: X.HqV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45319HqV extends WM7 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        PIA<? extends Class<? extends WM7>, Bundle> LLFII = SceneContainerActivity.LLFII(requireActivity().getIntent());
        NavigationScene LJIILLIIL = C78923UyF.LJIILLIIL(this);
        Class<? extends WM7> cls = (Class) LLFII.LIZ;
        Bundle bundle2 = LLFII.LIZIZ;
        C42663Gol c42663Gol = new C42663Gol();
        c42663Gol.LIZJ = new WN9(0);
        c42663Gol.LIZIZ = new C45320HqW(this);
        LJIILLIIL.LLJJJIL(cls, bundle2, c42663Gol.LIZ());
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new View(requireActivity());
    }
}
