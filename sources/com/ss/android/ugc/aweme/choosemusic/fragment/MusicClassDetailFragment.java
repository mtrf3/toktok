package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AnonymousClass036;
import X.C00F;
import X.C10K;
import X.C16880lQ;
import X.C188727au;
import X.C252709vu;
import X.C4II;
import X.C4LD;
import X.C51761KTd;
import X.C62456OfE;
import X.C62846OlW;
import X.C78765Uvh;
import X.C9KF;
import X.FMX;
import X.InterfaceC191547fS;
import X.InterfaceC84984XWy;
import X.InterfaceC85024XYm;
import X.V16;
import X.XRT;
import X.XVF;
import X.XVG;
import X.XVW;
import X.XWQ;
import X.XWR;
import X.XX7;
import X.XYV;
import Y.ACListenerS22S0101000_3;
import Y.AgS50S1100000_15;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.MusicListAdStruct;
import com.ss.android.ugc.aweme.di.CommerceServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes16.dex */
public class MusicClassDetailFragment extends BaseMusicListFragment implements XYV<Music>, InterfaceC191547fS {
    public static final /* synthetic */ int LLI = 0;
    public String LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public boolean LJLZ;
    public String LJZ;
    public MusicListAdStruct LJZI;
    public int LJZL;
    public List<MusicModel> LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public String LLFFF;
    public boolean LLFII;
    public int LLFZ;

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int Al() {
        return 3;
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
        return "music_list";
    }

    @Override // X.InterfaceC84974XWo
    public final String V() {
        return "refresh_status_music_list";
    }

    @Override // X.InterfaceC84974XWo
    public final String b() {
        return "loadmore_status_music_list";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int wl() {
        return R.layout.awv;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        DataCenter dataCenter;
        if (this.LJLJJL != null && (dataCenter = this.LJLJJLL) != null) {
            XRT xrt = (XRT) dataCenter.get("music_list");
            InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJLJ;
            if ((interfaceC84984XWy instanceof XWR) && ((XWR) interfaceC84984XWy).LJIIJJI) {
                if (interfaceC84984XWy != 0) {
                    interfaceC84984XWy.showLoadMoreLoading();
                }
                XVW xvw = this.LJLJJL;
                String str = this.LJLLL;
                int intValue = ((Integer) xrt.LIZ("list_cursor")).intValue();
                int i = this.LJZL;
                int i2 = this.LLFF;
                if (xvw.LJIILIIL) {
                    return;
                }
                xvw.LJIILIIL = true;
                ChooseMusicApi.LJ(intValue, 16, i, i2, str).LJ(new AgS50S1100000_15(xvw, str, 3), C10K.LJIIIIZZ, null);
            }
        }
    }

    @Override // X.XYV
    public final void pk() {
        ShareInfo shareInfo;
        DataCenter dataCenter = this.LJLJJLL;
        if (dataCenter == null || (shareInfo = (ShareInfo) dataCenter.get("data_share_info")) == null) {
            return;
        }
        C4LD.LIZ.LJJIJIL(mo49getActivity(), shareInfo, this.LJLLL, new C62456OfE(this));
        String str = this.LJLLLLLL;
        String str2 = this.LJLLL;
        String str3 = this.LJLLLL;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("playlist_id", str2);
        c188727au.LJI("playlist_name", str3);
        FMX.LJIIL("click_share_playlist_button", c188727au.LIZ);
    }

    @Override // X.XYV
    public final void refreshData() {
        XVW xvw = this.LJLJJL;
        if (xvw != null) {
            String str = this.LJLLL;
            int i = this.LJZL;
            int i2 = this.LLFF;
            if (xvw.LJIILIIL) {
                return;
            }
            xvw.LJIILIIL = true;
            ChooseMusicApi.LJ(0, 30, i, i2, str).LJ(new AgS50S1100000_15(xvw, str, 2), C10K.LJIIIIZZ, null);
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
        if (this.LL == null) {
            XVW xvw = this.LJLJJL;
            String str = this.LJLLL;
            int i = this.LJZL;
            int i2 = this.LLFF;
            if (xvw.LJIILIIL) {
                return;
            }
            xvw.LJIILIIL = true;
            ChooseMusicApi.LJ(0, 30, i, i2, str).LJ(new AgS50S1100000_15(xvw, str, 2), C10K.LJIIIIZZ, null);
            return;
        }
        this.LJLJJLL.jv0(0, "refresh_status_music_list");
        XRT xrt = new XRT();
        xrt.LIZ.put("list_cursor", Integer.valueOf(this.LLD));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(this.LLF));
        xrt.LIZIZ("action_type", 1);
        V16.LJJJLZIJ(xrt, this.LL);
        this.LJLJJLL.jv0(xrt, "music_list");
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLLL = arguments.getString("music_class_id");
            this.LJLLLL = arguments.getString("music_class_name");
            this.LJLLLLLL = arguments.getString("music_class_enter_from");
            this.LJLZ = arguments.getBoolean("music_class_is_hot", false);
            this.LJZ = arguments.getString("music_class_enter_method");
            this.LJZL = arguments.getInt("music_class_level");
            Serializable serializable = arguments.getSerializable("music_model_list");
            if (serializable instanceof List) {
                this.LL = (List) serializable;
            }
            this.LLD = arguments.getInt("music_list_cursor");
            this.LLF = arguments.getInt("music_list_has_more");
            this.LLFF = arguments.getInt("sound_page_scene", 0);
            this.LLFFF = arguments.getString("track_id");
            this.LLFII = arguments.getBoolean("is_external");
            arguments.getString("extra_music_from");
            this.LLFZ = arguments.getInt("music_discovery_type", 0);
        }
        CommerceServiceImpl.LIZJ().LIZIZ();
        this.LJZI = null;
        String str = this.LJZ;
        String str2 = XVF.LIZ;
        String str3 = this.LJLLL;
        String str4 = this.LJLLLL;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "change_music_page_detail");
        c188727au.LJIIIZ("enter_method", str);
        c188727au.LJIIIZ("previous_page", str2);
        c188727au.LJIIIZ("category_id", str3);
        c188727au.LJI("category_name", str4);
        FMX.LJIIL("playlist_page_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC84984XWy vl(View view) {
        XWQ xwq;
        if (CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            xwq = new XWQ(getContext(), view, this, R.string.dnd, this, this, this.LJLLJ, this.LLFZ);
        } else if (this.LL != null) {
            xwq = new XWQ(getContext(), view, this, R.string.iil, this, this, this.LJLLJ, 0, this.LLFZ);
        } else {
            xwq = new XWQ(getContext(), view, this, R.string.iil, this, this, this.LJLLJ, this.LLFZ);
        }
        if (this.LJZL == 2) {
            LinearLayout linearLayout = xwq.LIZLLL;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else {
            String str = this.LJLLLL;
            if (str != null) {
                C252709vu c252709vu = xwq.LIZ;
                C9KF c9kf = new C9KF();
                c9kf.LIZJ = str;
                c252709vu.LJIILLIIL(c9kf);
            }
            ((C252709vu) view.findViewById(R.id.l_2)).LJIILJJIL(false);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xwq.LIZJ.getLayoutParams();
        layoutParams.height = -1;
        xwq.LIZJ.setLayoutParams(layoutParams);
        boolean z = this.LJLZ;
        xwq.LJIILLIIL = z;
        C4II c4ii = xwq.LJFF;
        boolean z2 = c4ii instanceof XX7;
        if (z2) {
            ((XX7) c4ii).LJLJLLL = z;
        }
        boolean z3 = this.LLFII;
        xwq.LJIIZILJ = z3;
        if (z2) {
            ((XX7) c4ii).LJLLI = z3;
        }
        xwq.LJIIIIZZ(this);
        xwq.LJII(this);
        xwq.LJIIJ(new Pair<>(Long.valueOf(this.LJLL), Long.valueOf(this.LJLLI)));
        xwq.LJIJI = this.LLFFF;
        XVG xvg = new XVG(this.LJLLLLLL, this.LJLLLL, this.LJZ, XVF.LIZ);
        xvg.LIZIZ(this.LJLLL);
        xwq.LJIIIZ(xvg);
        xwq.LJ(new InterfaceC85024XYm() { // from class: X.XYW
            @Override // X.InterfaceC85024XYm
            public final void LIZ() {
                MusicClassDetailFragment.this.LJIIJJI();
            }
        }, 10);
        return xwq;
    }

    @Override // X.XYV
    public final /* bridge */ /* synthetic */ void LLLF(Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MusicListAdStruct musicListAdStruct = this.LJZI;
        if (musicListAdStruct == null || musicListAdStruct.ad == null || C00F.LIZ(31744, 0, "non_standard_ad_music_list_style", true) == 0) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.l9v);
        C62846OlW c62846OlW = (C62846OlW) view.findViewById(R.id.l9w);
        viewGroup.setVisibility(0);
        C78765Uvh.LJII(c62846OlW, this.LJZI.ad.image, new C51761KTd(this, c62846OlW));
        C16880lQ.LJIIL(viewGroup, new ACListenerS22S0101000_3(0, this, 6));
    }

    public static MusicClassDetailFragment Ll(String str, String str2, String str3, int i, boolean z, String str4, int i2, XRT<String, Object> xrt, int i3, String str5, boolean z2, long j, long j2, String str6, int i4) {
        MusicClassDetailFragment musicClassDetailFragment = new MusicClassDetailFragment();
        Bundle LIZJ = AnonymousClass036.LIZJ("music_class_id", str, "music_class_name", str2);
        LIZJ.putString("music_class_enter_from", str3);
        LIZJ.putBoolean("music_class_is_hot", z);
        LIZJ.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        LIZJ.putString("music_class_enter_method", str4);
        LIZJ.putInt("music_class_level", i2);
        LIZJ.putInt("sound_page_scene", i3);
        if (xrt != null) {
            LIZJ.putSerializable("music_model_list", (Serializable) V16.LJIL(xrt));
            LIZJ.putInt("music_list_cursor", ((Integer) xrt.LIZ("list_cursor")).intValue());
            LIZJ.putInt("music_list_has_more", ((Integer) xrt.LIZ("list_hasmore")).intValue());
        }
        LIZJ.putString("track_id", str5);
        LIZJ.putBoolean("is_external", z2);
        LIZJ.putLong("max_video_duration", j);
        LIZJ.putLong("shoot_video_length", j2);
        LIZJ.putString("extra_music_from", str6);
        LIZJ.putInt("music_discovery_type", i4);
        musicClassDetailFragment.setArguments(LIZJ);
        return musicClassDetailFragment;
    }
}
