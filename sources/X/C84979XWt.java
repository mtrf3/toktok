package X;

import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;

/* renamed from: X.XWt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C84979XWt implements InterfaceC65784Pro {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.LJLIL) {
            case 0:
                return ((ITreasureBoxService) this.LJLILLLLZI).sE();
            case 1:
                BaseNewMusicTabFragment baseNewMusicTabFragment = (BaseNewMusicTabFragment) this.LJLILLLLZI;
                C73305Spp c73305Spp = baseNewMusicTabFragment.LJLILLLLZI;
                if (c73305Spp != null) {
                    c73305Spp.LJFF();
                    baseNewMusicTabFragment.LJLILLLLZI.setVisibility(0);
                }
                baseNewMusicTabFragment.LLF.LIZIZ(false, baseNewMusicTabFragment.LJLLILLLL, baseNewMusicTabFragment.LLFF);
                return null;
            case 2:
                return ((VideoEditContainerScene) this.LJLILLLLZI).LLIILII.LLJJI();
            default:
                return this.LJLILLLLZI;
        }
    }

    public /* synthetic */ C84979XWt(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
