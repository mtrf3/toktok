package X;

import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.MusicClassDetailFragment;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.SecondLevelMusicFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class XXX implements InterfaceC80680VlU {
    public final /* synthetic */ SecondLevelMusicFragment LIZ;

    @Override // X.InterfaceC80680VlU
    public final void LIZIZ(C80674VlO c80674VlO) {
    }

    public XXX(SecondLevelMusicFragment secondLevelMusicFragment) {
        this.LIZ = secondLevelMusicFragment;
    }

    @Override // X.InterfaceC80680VlU
    public final void LIZ(C80674VlO c80674VlO) {
        ArrayList<MusicClassDetailFragment> arrayList;
        BaseMusicListFragment baseMusicListFragment;
        C2312695u c2312695u;
        Context context;
        Integer LJI;
        View view = c80674VlO.LJFF;
        if (view != null && (context = (c2312695u = (C2312695u) view).LJLILLLLZI) != null && (LJI = C79045V0n.LJI(R.attr.gs, context)) != null) {
            c2312695u.setTextColor(LJI.intValue());
        }
        SecondLevelMusicFragment secondLevelMusicFragment = this.LIZ;
        Integer valueOf = Integer.valueOf(c80674VlO.LJ);
        secondLevelMusicFragment.getClass();
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            C84990XXe c84990XXe = secondLevelMusicFragment.LJLJJI;
            if (c84990XXe != null && (arrayList = c84990XXe.LJLJJLL) != null && (baseMusicListFragment = (BaseMusicListFragment) ListProtector.get(arrayList, intValue)) != null) {
                AbstractC029409q<?> xl = baseMusicListFragment.xl();
                if (xl instanceof XX9) {
                    ((XX9) xl).LJLLLLLL();
                }
            }
        }
    }

    @Override // X.InterfaceC80680VlU
    public final void LIZJ(C80674VlO c80674VlO) {
        View view;
        C2312695u c2312695u;
        Context context;
        Integer LJI;
        if (c80674VlO != null && (view = c80674VlO.LJFF) != null && (context = (c2312695u = (C2312695u) view).LJLILLLLZI) != null && (LJI = C79045V0n.LJI(R.attr.go, context)) != null) {
            c2312695u.setTextColor(LJI.intValue());
        }
    }
}
