package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.C10K;
import X.C1DG;
import X.C252709vu;
import X.C4II;
import X.C84934XVa;
import X.C9KF;
import X.InterfaceC191547fS;
import X.InterfaceC84984XWy;
import X.InterfaceC85024XYm;
import X.XRT;
import X.XVF;
import X.XVG;
import X.XVW;
import X.XWQ;
import X.XX7;
import X.XYV;
import Y.AgS131S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.fragment.HotMusicListFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class HotMusicListFragment extends BaseMusicListFragment<C84934XVa> implements XYV<Music>, InterfaceC191547fS {
    public static final /* synthetic */ int LJLLL = 0;

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int Al() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String Dl() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean Gl() {
        return true;
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

    @Override // X.XYV
    public final void pk() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int wl() {
        return R.layout.awv;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        DataCenter dataCenter;
        InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJLJ;
        if (interfaceC84984XWy != 0) {
            interfaceC84984XWy.showLoadMoreLoading();
        }
        if (this.LJLJJL != null && (dataCenter = this.LJLJJLL) != null) {
            XRT xrt = (XRT) dataCenter.get("hot_music_list_data");
            XVW xvw = this.LJLJJL;
            int intValue = ((Integer) xrt.LIZ("list_cursor")).intValue();
            int i = this.LJLJLLL;
            if (xvw.LJIILL) {
                return;
            }
            xvw.LJIILL = true;
            ChooseMusicApi.LIZ(intValue, "", false, XVF.LJ, 20, 0L, i).LJ(new AgS131S0100000_15(xvw, 14), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.XYV
    public final void refreshData() {
        XVW xvw = this.LJLJJL;
        if (xvw != null) {
            xvw.LJIIJ(this.LJLJLLL);
        }
    }

    @Override // X.XYV
    public final void LJI() {
        if (mo49getActivity() != null) {
            mo49getActivity().onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC84974XWo
    public final void initData() {
        super.initData();
        this.LJLJJL.LJIIJ(this.LJLJLLL);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC84984XWy<C84934XVa> vl(View view) {
        XWQ xwq;
        if (CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            xwq = new XWQ(getContext(), view, this, R.string.dnd, this, this, this.LJLLJ, this.LJLLILLLL);
            String title = xwq.LJ.getString(R.string.ij2);
            C252709vu c252709vu = xwq.LIZ;
            C9KF c9kf = new C9KF();
            o.LJIIIZ(title, "title");
            c9kf.LIZJ = title;
            c252709vu.LJIILLIIL(c9kf);
        } else {
            Context context = getContext();
            int i = this.LJLLJ;
            xwq = new XWQ(context, view, this, R.string.iqy, this, this, i, i, this.LJLLILLLL);
            String title2 = xwq.LJ.getString(R.string.puv);
            C252709vu c252709vu2 = xwq.LIZ;
            C9KF c9kf2 = new C9KF();
            o.LJIIIZ(title2, "title");
            c9kf2.LIZJ = title2;
            c252709vu2.LJIILLIIL(c9kf2);
            C4II c4ii = xwq.LJFF;
            if (c4ii instanceof XX7) {
                ((XX7) c4ii).LJLL = true;
            }
        }
        xwq.LJIIIIZZ(this);
        xwq.LJII(this);
        xwq.LJIIJ(new Pair<>(Long.valueOf(this.LJLL), Long.valueOf(this.LJLLI)));
        if (getContext() != null) {
            XVG xvg = new XVG("change_music_page_detail", getContext().getString(R.string.puv), "click_more", XVF.LIZ);
            xvg.LIZIZ("recommend_mc_id");
            xwq.LJIIIZ(xvg);
        }
        xwq.LJ(new InterfaceC85024XYm() { // from class: X.XYa
            @Override // X.InterfaceC85024XYm
            public final void LIZ() {
                HotMusicListFragment.this.LJIIJJI();
            }
        }, 10);
        return xwq;
    }

    @Override // X.XYV
    public final /* bridge */ /* synthetic */ void LLLF(Object obj) {
    }

    public static HotMusicListFragment Ll(int i, int i2, int i3, long j, long j2) {
        HotMusicListFragment hotMusicListFragment = new HotMusicListFragment();
        Bundle LIZLLL = C1DG.LIZLLL("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i, "sound_page_scene", i2);
        LIZLLL.putLong("max_video_duration", j);
        LIZLLL.putLong("shoot_video_length", j2);
        LIZLLL.putInt("music_discovery_type", i3);
        hotMusicListFragment.setArguments(LIZLLL);
        return hotMusicListFragment;
    }
}
