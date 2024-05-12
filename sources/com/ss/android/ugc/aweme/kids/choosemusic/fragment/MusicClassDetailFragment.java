package com.ss.android.ugc.aweme.kids.choosemusic.fragment;

import X.AnonymousClass036;
import X.C10K;
import X.C252709vu;
import X.C84939XVf;
import X.C84961XWb;
import X.C84981XWv;
import X.C8HS;
import X.C9KF;
import X.GBI;
import X.InterfaceC157206Ey;
import X.InterfaceC191547fS;
import X.InterfaceC84984XWy;
import X.SFS;
import X.XRT;
import X.XTE;
import X.XWS;
import X.XX9;
import X.XYJ;
import X.XYL;
import Y.AgS120S0100000_2;
import Y.AgS85S0101000_2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.kids.music.model.MusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class MusicClassDetailFragment extends BaseMusicListFragment implements InterfaceC157206Ey<Music>, InterfaceC191547fS {
    public static final /* synthetic */ int LJZI = 0;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public String LJLLL;
    public int LJLLLL;
    public List<MusicModel> LJLLLLLL;
    public int LJLZ;
    public int LJZ;

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final int Al() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final String Dl() {
        return "";
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

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final int wl() {
        return R.layout.bg4;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        DataCenter dataCenter;
        C10K<MusicList> secondLevelMusicList;
        if (this.LJLJJI != null && (dataCenter = this.LJLJJL) != null) {
            XRT xrt = (XRT) dataCenter.get("music_list");
            InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJL;
            if ((interfaceC84984XWy instanceof XWS) && ((XWS) interfaceC84984XWy).LJIIJJI) {
                if (interfaceC84984XWy != 0) {
                    interfaceC84984XWy.showLoadMoreLoading();
                }
                C84939XVf c84939XVf = this.LJLJJI;
                String str = this.LJLL;
                int intValue = ((Integer) xrt.LIZ("list_cursor")).intValue();
                int i = this.LJLLLL;
                if (c84939XVf.LJ) {
                    return;
                }
                c84939XVf.LJ = true;
                if (i == 0) {
                    secondLevelMusicList = ChooseMusicApi.LIZ.musicList(str, intValue, 16);
                } else {
                    secondLevelMusicList = ChooseMusicApi.LIZ.secondLevelMusicList(str, intValue, 16, i);
                }
                secondLevelMusicList.LJ(new AgS120S0100000_2(c84939XVf, 37), C10K.LJIIIIZZ, null);
            }
        }
    }

    @Override // X.InterfaceC157206Ey
    public final void refreshData() {
        C10K<MusicList> secondLevelMusicList;
        C84939XVf c84939XVf = this.LJLJJI;
        if (c84939XVf != null) {
            String str = this.LJLL;
            int i = this.LJLLLL;
            if (c84939XVf.LJ) {
                return;
            }
            c84939XVf.LJ = true;
            if (i == 0) {
                secondLevelMusicList = ChooseMusicApi.LIZ.musicList(str, 0, 30);
            } else {
                secondLevelMusicList = ChooseMusicApi.LIZ.secondLevelMusicList(str, 0, 30, i);
            }
            secondLevelMusicList.LJ(new AgS85S0101000_2(0, c84939XVf, 2), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC157206Ey
    public final void LJI() {
        if (mo49getActivity() != null) {
            mo49getActivity().onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC84974XWo
    public final void initData() {
        C10K<MusicList> secondLevelMusicList;
        super.initData();
        if (this.LJLLLLLL == null) {
            C84939XVf c84939XVf = this.LJLJJI;
            String str = this.LJLL;
            int i = this.LJLLLL;
            if (c84939XVf.LJ) {
                return;
            }
            c84939XVf.LJ = true;
            if (i == 0) {
                secondLevelMusicList = ChooseMusicApi.LIZ.musicList(str, 0, 30);
            } else {
                secondLevelMusicList = ChooseMusicApi.LIZ.secondLevelMusicList(str, 0, 30, i);
            }
            secondLevelMusicList.LJ(new AgS85S0101000_2(0, c84939XVf, 2), C10K.LJIIIIZZ, null);
            return;
        }
        this.LJLJJL.jv0(0, "refresh_status_music_list");
        XRT xrt = new XRT();
        xrt.LIZ.put("list_cursor", Integer.valueOf(this.LJLZ));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(this.LJZ));
        xrt.LIZ.put("action_type", 1);
        xrt.LIZIZ("list_data", this.LJLLLLLL);
        this.LJLJJL.jv0(xrt, "music_list");
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLL = arguments.getString("music_class_id");
            this.LJLLI = arguments.getString("music_class_name");
            this.LJLLILLLL = arguments.getString("music_class_enter_from");
            this.LJLLJ = arguments.getBoolean("music_class_is_hot", false);
            this.LJLLL = arguments.getString("music_class_enter_method");
            this.LJLLLL = arguments.getInt("music_class_level");
            Serializable serializable = arguments.getSerializable("music_model_list");
            if (serializable instanceof List) {
                this.LJLLLLLL = (List) serializable;
            }
            this.LJLZ = arguments.getInt("music_list_cursor");
            this.LJZ = arguments.getInt("music_list_has_more");
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC84984XWy vl(View view) {
        C84961XWb c84961XWb;
        MusicClassDetailFragment musicClassDetailFragment = this;
        if (musicClassDetailFragment.LJLLLLLL != null) {
            Context context = musicClassDetailFragment.getContext();
            int i = musicClassDetailFragment.LJLJLJ;
            musicClassDetailFragment = musicClassDetailFragment;
            c84961XWb = new C84961XWb(context, view, musicClassDetailFragment, musicClassDetailFragment, musicClassDetailFragment, i);
        } else {
            c84961XWb = new C84961XWb(musicClassDetailFragment.getContext(), view, musicClassDetailFragment, R.string.hgk, musicClassDetailFragment, musicClassDetailFragment, musicClassDetailFragment.LJLJLJ);
        }
        if (musicClassDetailFragment.LJLLLL == 2) {
            LinearLayout linearLayout = c84961XWb.LIZLLL;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else {
            String title = musicClassDetailFragment.LJLLI;
            C252709vu c252709vu = c84961XWb.LIZ;
            C9KF c9kf = new C9KF();
            o.LJIIIZ(title, "title");
            c9kf.LIZJ = title;
            c252709vu.LJIILLIIL(c9kf);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c84961XWb.LIZJ.getLayoutParams();
        layoutParams.height = -1;
        c84961XWb.LIZJ.setLayoutParams(layoutParams);
        boolean z = musicClassDetailFragment.LJLLJ;
        c84961XWb.LJIILIIL = z;
        C8HS c8hs = c84961XWb.LJFF;
        if (c8hs instanceof XX9) {
            ((XX9) c8hs).LJLJL = z;
        }
        if (c8hs instanceof XX9) {
            ((XX9) c8hs).LJLIL = musicClassDetailFragment;
        }
        XTE xte = new XTE(musicClassDetailFragment.LJLLILLLL, musicClassDetailFragment.LJLLI, musicClassDetailFragment.LJLLL, SFS.LJLJJI);
        String str = musicClassDetailFragment.LJLL;
        xte.LJ = str;
        if (TextUtils.equals(str, "recommend_mc_id")) {
            xte.LIZIZ = "recommend";
        }
        C8HS c8hs2 = c84961XWb.LJFF;
        if (c8hs2 instanceof XX9) {
            ((XX9) c8hs2).LJLJJLL = xte;
        }
        C84981XWv c84981XWv = new C84981XWv(new GBI(musicClassDetailFragment), 10);
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

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public static MusicClassDetailFragment Il(String str, String str2, String str3, int i, boolean z, String str4, int i2, XRT<String, Object> xrt) {
        MusicClassDetailFragment musicClassDetailFragment = new MusicClassDetailFragment();
        Bundle LIZJ = AnonymousClass036.LIZJ("music_class_id", str, "music_class_name", str2);
        LIZJ.putString("music_class_enter_from", str3);
        LIZJ.putBoolean("music_class_is_hot", z);
        LIZJ.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        LIZJ.putString("music_class_enter_method", str4);
        LIZJ.putInt("music_class_level", i2);
        if (xrt != null) {
            LIZJ.putSerializable("music_model_list", (Serializable) ((List) xrt.LIZ("list_data")));
            LIZJ.putInt("music_list_cursor", ((Integer) xrt.LIZ("list_cursor")).intValue());
            LIZJ.putInt("music_list_has_more", ((Integer) xrt.LIZ("list_hasmore")).intValue());
        }
        musicClassDetailFragment.setArguments(LIZJ);
        return musicClassDetailFragment;
    }
}
