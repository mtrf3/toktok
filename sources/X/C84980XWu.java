package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XWu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84980XWu implements XT6 {
    public final /* synthetic */ BaseMusicListFragment<Object> LIZ;

    @Override // X.XT6
    public final void LIZ() {
        BaseMusicListFragment<Object> baseMusicListFragment = this.LIZ;
        if (baseMusicListFragment.LJLILLLLZI != null) {
            DataCenter dataCenter = baseMusicListFragment.LJLJJL;
            o.LJI(dataCenter);
            MusicModel musicModel = this.LIZ.LJLILLLLZI;
            o.LJI(musicModel);
            dataCenter.jv0(musicModel.getMusicId(), "play_error");
        }
    }

    @Override // X.XT6
    public final void LIZIZ() {
        BaseMusicListFragment<Object> baseMusicListFragment = this.LIZ;
        if (baseMusicListFragment.LJLILLLLZI != null) {
            DataCenter dataCenter = baseMusicListFragment.LJLJJL;
            o.LJI(dataCenter);
            MusicModel musicModel = this.LIZ.LJLILLLLZI;
            o.LJI(musicModel);
            dataCenter.jv0(musicModel.getMusicId(), "play_compeleted");
        }
    }

    public C84980XWu(BaseMusicListFragment<Object> baseMusicListFragment) {
        this.LIZ = baseMusicListFragment;
    }
}
