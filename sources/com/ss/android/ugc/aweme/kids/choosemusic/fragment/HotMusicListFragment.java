package com.ss.android.ugc.aweme.kids.choosemusic.fragment;

import X.C10K;
import X.C252709vu;
import X.C84939XVf;
import X.C84961XWb;
import X.C84981XWv;
import X.C8HS;
import X.C9KF;
import X.G72;
import X.InterfaceC157206Ey;
import X.InterfaceC191547fS;
import X.InterfaceC84984XWy;
import X.SFS;
import X.XRT;
import X.XTE;
import X.XX9;
import X.XYJ;
import X.XYL;
import Y.AgS85S0101000_2;
import Y.AgS87S0101000_15;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class HotMusicListFragment extends BaseMusicListFragment implements InterfaceC157206Ey<Music>, InterfaceC191547fS {
    public static final /* synthetic */ int LJLL = 0;

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final int Al() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final String Dl() {
        return "";
    }

    @Override // X.InterfaceC84974XWo
    public final String LLJJJ() {
        return "hot_music_list_data";
    }

    @Override // X.InterfaceC84974XWo
    public final String V() {
        return "refresh_status_hot_music_list";
    }

    @Override // X.InterfaceC84974XWo
    public final String b() {
        return "loadmore_status_hot_music_list";
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final int wl() {
        return R.layout.bg4;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        DataCenter dataCenter;
        InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJL;
        if (interfaceC84984XWy != 0) {
            interfaceC84984XWy.showLoadMoreLoading();
        }
        if (this.LJLJJI != null && (dataCenter = this.LJLJJL) != null) {
            XRT xrt = (XRT) dataCenter.get("hot_music_list_data");
            C84939XVf c84939XVf = this.LJLJJI;
            int intValue = ((Integer) xrt.LIZ("list_cursor")).intValue();
            if (c84939XVf.LJI) {
                return;
            }
            c84939XVf.LJI = true;
            c84939XVf.LIZ.getHotMusicList(intValue, 20, false).LJ(new AgS85S0101000_2(1, c84939XVf, 1), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC157206Ey
    public final void refreshData() {
        C84939XVf c84939XVf = this.LJLJJI;
        if (c84939XVf == null || c84939XVf.LJI) {
            return;
        }
        c84939XVf.LJI = true;
        c84939XVf.LIZ.getHotMusicList(0, 20, false).LJ(new AgS87S0101000_15(0, c84939XVf, 3), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC157206Ey
    public final void LJI() {
        if (mo49getActivity() != null) {
            mo49getActivity().onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC84974XWo
    public final void initData() {
        super.initData();
        C84939XVf c84939XVf = this.LJLJJI;
        if (c84939XVf.LJI) {
            return;
        }
        c84939XVf.LJI = true;
        c84939XVf.LIZ.getHotMusicList(0, 20, false).LJ(new AgS87S0101000_15(0, c84939XVf, 3), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC84984XWy vl(View view) {
        C84961XWb c84961XWb = new C84961XWb(getContext(), view, this, R.string.iqy, this, this, this.LJLJLJ);
        C252709vu c252709vu = c84961XWb.LIZ;
        C9KF c9kf = new C9KF();
        c9kf.LIZ(c84961XWb.LJ.getString(R.string.puv));
        c252709vu.LJIILLIIL(c9kf);
        C8HS c8hs = c84961XWb.LJFF;
        if (c8hs instanceof XX9) {
            ((XX9) c8hs).LJLIL = this;
        }
        if (getContext() != null) {
            XTE xte = new XTE("change_music_page_detail", getContext().getString(R.string.puv), "click_more", SFS.LJLJJI);
            xte.LJ = "recommend_mc_id";
            if (TextUtils.equals("recommend_mc_id", "recommend_mc_id")) {
                xte.LIZIZ = "recommend";
            }
            C8HS c8hs2 = c84961XWb.LJFF;
            if (c8hs2 instanceof XX9) {
                ((XX9) c8hs2).LJLJJLL = xte;
            }
        }
        C84981XWv c84981XWv = new C84981XWv(new G72(this), 10);
        RecyclerView recyclerView = c84961XWb.LIZIZ;
        if (Build.VERSION.SDK_INT >= 23) {
            recyclerView.setOnScrollChangeListener(new XYL(c84981XWv));
        } else {
            recyclerView.setOnScrollListener(new XYJ(c84981XWv));
        }
        return c84961XWb;
    }

    @Override // X.InterfaceC157206Ey
    public final /* bridge */ /* synthetic */ void LLLF(Object obj) {
    }
}
