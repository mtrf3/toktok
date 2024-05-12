package X;

import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;

/* loaded from: classes16.dex */
public final class XY7 implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ BaseNewMusicTabFragment LJLILLLLZI;

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        BaseNewMusicTabFragment baseNewMusicTabFragment = this.LJLILLLLZI;
        baseNewMusicTabFragment.LJLJLJ = WidgetManager.Gl(this.LJLIL, baseNewMusicTabFragment);
        return null;
    }

    public XY7(BaseNewMusicTabFragment baseNewMusicTabFragment, View view) {
        this.LJLILLLLZI = baseNewMusicTabFragment;
        this.LJLIL = view;
    }
}
