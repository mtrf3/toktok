package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.SecondLevelMusicFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class XXT implements InterfaceC80680VlU {
    public final /* synthetic */ SecondLevelMusicFragment LIZ;

    @Override // X.InterfaceC80680VlU
    public final void LIZIZ(C80674VlO c80674VlO) {
    }

    public XXT(SecondLevelMusicFragment secondLevelMusicFragment) {
        this.LIZ = secondLevelMusicFragment;
    }

    @Override // X.InterfaceC80680VlU
    public final void LIZ(C80674VlO c80674VlO) {
        ArrayList<MusicClassDetailFragment> arrayList;
        BaseMusicListFragment baseMusicListFragment;
        C2312595t c2312595t;
        Context context;
        Resources resources;
        View view = c80674VlO.LJFF;
        if (view != null && (context = (c2312595t = (C2312595t) view).LJLILLLLZI) != null && (resources = context.getResources()) != null) {
            c2312595t.setTextColor(resources.getColor(R.color.cq));
        }
        SecondLevelMusicFragment secondLevelMusicFragment = this.LIZ;
        Integer valueOf = Integer.valueOf(c80674VlO.LJ);
        secondLevelMusicFragment.getClass();
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            C84989XXd c84989XXd = secondLevelMusicFragment.LJLJJI;
            if (c84989XXd != null && (arrayList = c84989XXd.LJLJJLL) != null && (baseMusicListFragment = (BaseMusicListFragment) ListProtector.get(arrayList, intValue)) != null) {
                AbstractC029409q xl = baseMusicListFragment.xl();
                if (xl instanceof XX7) {
                    ((XX7) xl).LJZ();
                }
            }
        }
    }

    @Override // X.InterfaceC80680VlU
    public final void LIZJ(C80674VlO c80674VlO) {
        C2312595t c2312595t;
        Context context;
        Resources resources;
        if (c80674VlO != null) {
            SecondLevelMusicFragment secondLevelMusicFragment = this.LIZ;
            View view = c80674VlO.LJFF;
            if (view != null && (context = (c2312595t = (C2312595t) view).LJLILLLLZI) != null && (resources = context.getResources()) != null) {
                c2312595t.setTextColor(resources.getColor(R.color.ck));
            }
            Object obj = c80674VlO.LIZ;
            if (obj != null && (obj instanceof String)) {
                String str = secondLevelMusicFragment.LJLJJLL;
                String str2 = (String) obj;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", secondLevelMusicFragment.LJLJL);
                if (str == null) {
                    str = "";
                }
                c188727au.LJIIIZ("category_name", str);
                c188727au.LJIIIZ("tab_name", str2);
                FMX.LJIIL("change_song_language_tab", c188727au.LIZ);
            }
        }
    }
}
