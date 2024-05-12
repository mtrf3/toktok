package X;

import com.bytedance.scene.navigation.NavigationScene;

/* loaded from: classes8.dex */
public final class I7O implements GHB {
    public final /* synthetic */ C46068I6e LJLIL;
    public final /* synthetic */ NavigationScene LJLILLLLZI;

    @Override // X.GHB
    public final boolean onBackPressed() {
        this.LJLIL.LJJLIIIJJI();
        this.LJLILLLLZI.LLJJL(this);
        return false;
    }

    public I7O(C46068I6e c46068I6e, NavigationScene navigationScene) {
        this.LJLIL = c46068I6e;
        this.LJLILLLLZI = navigationScene;
    }
}
