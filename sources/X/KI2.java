package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;

/* loaded from: classes9.dex */
public final /* synthetic */ class KI2 extends TBS implements InterfaceC65784Pro<Boolean> {
    public KI2(Object obj) {
        super(0, obj, ChooseSearchMusicFragment.class, "getKeyboardVisibility", "getKeyboardVisibility()Z", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        ChooseSearchMusicFragment chooseSearchMusicFragment = (ChooseSearchMusicFragment) this.receiver;
        if (Build.VERSION.SDK_INT >= 30) {
            ActivityC45651qj mo49getActivity = chooseSearchMusicFragment.mo49getActivity();
            if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null) {
                z = rootWindowInsets.isVisible(WindowInsets.Type.ime());
            } else {
                z = false;
            }
        } else {
            z = chooseSearchMusicFragment.wl().getState().LJLJJI;
        }
        return Boolean.valueOf(z);
    }
}
