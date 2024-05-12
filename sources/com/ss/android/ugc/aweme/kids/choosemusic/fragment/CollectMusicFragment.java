package com.ss.android.ugc.aweme.kids.choosemusic.fragment;

import X.AbstractC029409q;
import X.C03880Dg;
import X.C10K;
import X.C207668Da;
import X.C65300Pk0;
import X.C79004UzY;
import X.C84939XVf;
import X.C84960XWa;
import X.C84966XWg;
import X.C84981XWv;
import X.C8HS;
import X.InterfaceC157206Ey;
import X.InterfaceC191547fS;
import X.InterfaceC84984XWy;
import X.OGG;
import X.QD3;
import X.SFS;
import X.XRT;
import X.XTE;
import X.XWS;
import X.XWV;
import X.XX9;
import X.XYA;
import X.XYD;
import X.XYJ;
import X.XYL;
import Y.AgS131S0100000_15;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class CollectMusicFragment extends BaseMusicListFragment implements OGG, InterfaceC157206Ey<Music>, InterfaceC191547fS {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public XTE LJLL;
    public BaseNewMusicTabFragment LJLLI;

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final int Al() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final String Dl() {
        return null;
    }

    @Override // X.InterfaceC157206Ey
    public final void LJI() {
    }

    @Override // X.InterfaceC84974XWo
    public final String LLJJJ() {
        return "user_collected_music_list";
    }

    @Override // X.InterfaceC84974XWo
    public final String V() {
        return "refresh_status_user_collected_music";
    }

    @Override // X.InterfaceC84974XWo
    public final String b() {
        return "loadmore_status_user_collected_music";
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final int wl() {
        return R.layout.bg4;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        DataCenter dataCenter;
        if (this.LJLJJI != null && (dataCenter = this.LJLJJL) != null) {
            XRT xrt = (XRT) dataCenter.get("user_collected_music_list");
            InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJL;
            if ((interfaceC84984XWy instanceof XWS) && ((XWS) interfaceC84984XWy).LJIIJJI) {
                if (interfaceC84984XWy != 0) {
                    interfaceC84984XWy.showLoadMoreLoading();
                }
                C84939XVf c84939XVf = this.LJLJJI;
                int intValue = ((Integer) xrt.LIZ("list_cursor")).intValue();
                if (c84939XVf.LJFF) {
                    return;
                }
                c84939XVf.LJFF = true;
                ChooseMusicApi.LIZ.userCollectedMusicList(intValue, 20, "").LJ(new AgS131S0100000_15(c84939XVf, 32), C10K.LJIIIIZZ, null);
            }
        }
    }

    @Override // X.OGG
    public final View LJIJJ() {
        Object obj = this.LJLJL;
        if (obj == null) {
            return null;
        }
        return ((XWS) obj).LIZIZ;
    }

    @Override // X.InterfaceC157206Ey
    public final void refreshData() {
        C84939XVf c84939XVf = this.LJLJJI;
        if (c84939XVf != null) {
            c84939XVf.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final AbstractC029409q xl() {
        InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJL;
        if (interfaceC84984XWy != 0) {
            return interfaceC84984XWy.LJJLIIIJJIZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC84974XWo
    public final DataCenter cg() {
        DataCenter cg = super.cg();
        this.LJLJJL = cg;
        cg.iv0("music_collect_status", this, false);
        cg.iv0("music_index", this, false);
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC84974XWo
    public final void initData() {
        super.initData();
        this.LJLJJI.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    /* renamed from: Hl */
    public final void onChanged(C207668Da c207668Da) {
        RecyclerView recyclerView;
        super.onChanged(c207668Da);
        if (!isViewValid()) {
            return;
        }
        String str = c207668Da.LIZ;
        str.getClass();
        Object obj = null;
        XX9 xx9 = null;
        if (!str.equals("music_collect_status")) {
            if (!str.equals("music_index") || ((Integer) this.LJLJJL.get("music_position", -1)).intValue() != -2) {
                return;
            }
            InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJL;
            if (interfaceC84984XWy != 0) {
                xx9 = (XX9) interfaceC84984XWy.LJJLIIIJJIZ();
            }
            xx9.LJLLLLLL();
            return;
        }
        Object obj2 = c207668Da.LIZIZ;
        if (obj2 != null) {
            obj = obj2;
        }
        XYD xyd = (XYD) obj;
        if (xyd.LIZ != 0 || xyd.LIZLLL != 1) {
            return;
        }
        MusicModel musicModel = xyd.LJ;
        InterfaceC84984XWy<T> interfaceC84984XWy2 = this.LJLJL;
        if (interfaceC84984XWy2 == 0 || interfaceC84984XWy2.LJJLIIIJJIZ() == null) {
            return;
        }
        List data = this.LJLJL.LJJLIIIJJIZ().getData();
        if (data == null) {
            data = new ArrayList();
        }
        for (int i = 0; i < data.size(); i++) {
            if (musicModel.getMusicId().equals(((MusicModel) ListProtector.get(data, i)).getMusicId())) {
                return;
            }
        }
        if (data.size() == 0) {
            data.add(musicModel);
            this.LJLJL.J5(data, false);
            return;
        }
        ListProtector.add(data, 0, musicModel);
        this.LJLJL.LJJLIIIJJIZ().notifyItemInserted(0);
        InterfaceC84984XWy<T> interfaceC84984XWy3 = this.LJLJL;
        if (!(interfaceC84984XWy3 instanceof XWS) || (recyclerView = ((XWS) interfaceC84984XWy3).LIZIZ) == null) {
            return;
        }
        recyclerView.LJLI(0);
    }

    @QD3
    public void onEvent(XYA xya) {
        DataCenter dataCenter = this.LJLJJL;
        if (dataCenter != null && xya != null) {
            dataCenter.jv0(new XYD(0, xya.LJLIL, -1, -1, xya.LJLILLLLZI), "music_collect_status");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        RecyclerView recyclerView;
        MusicModel musicModel;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "5121344154200623470");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/kids/choosemusic/fragment/CollectMusicFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/kids/choosemusic/fragment/CollectMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z && (LJIJJ() instanceof RecyclerView) && (recyclerView = (RecyclerView) LJIJJ()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int LLILLJJLI = linearLayoutManager.LLILLJJLI();
            C8HS LJJLIIIJJIZ = this.LJLJL.LJJLIIIJJIZ();
            if (LJJLIIIJJIZ != null) {
                List data = LJJLIIIJJIZ.getData();
                if (!C79004UzY.LJJIFFI(data)) {
                    for (int LLILL = linearLayoutManager.LLILL(); LLILL < LLILLJJLI; LLILL++) {
                        if (LLILL >= 0 && LLILL < data.size() && (musicModel = (MusicModel) ListProtector.get(data, LLILL)) != null) {
                            XTE xte = this.LJLL;
                            String musicId = musicModel.getMusicId();
                            musicModel.getMatchedPGCSoundInfo();
                            SFS.LJJIII(xte, musicId, LLILL, true);
                        }
                    }
                }
            }
        }
        Object obj = this.LJLJL;
        if (obj instanceof C84960XWa) {
            C8HS c8hs = ((XWS) obj).LJFF;
            if (c8hs instanceof XX9) {
                ((XX9) c8hs).LJLJLJ = z;
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/kids/choosemusic/fragment/CollectMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC84984XWy vl(View view) {
        C84960XWa c84960XWa = new C84960XWa(getContext(), view, this, this, this, this.LJLJLJ);
        C84966XWg c84966XWg = new C84966XWg(this);
        C8HS c8hs = c84960XWa.LJFF;
        boolean z = c8hs instanceof XX9;
        if (z) {
            ((XX9) c8hs).LJLIL = c84966XWg;
        }
        XTE xte = new XTE("change_music_page", "favorite_song", "", SFS.LJLJJI);
        this.LJLL = xte;
        if (z) {
            ((XX9) c8hs).LJLJJLL = xte;
        }
        if (c8hs instanceof XX9) {
            ((XX9) c8hs).LJLJLJ = false;
        }
        C84981XWv c84981XWv = new C84981XWv(new XWV(this), 10);
        RecyclerView recyclerView = c84960XWa.LIZIZ;
        if (Build.VERSION.SDK_INT >= 23) {
            recyclerView.setOnScrollChangeListener(new XYL(c84981XWv));
        } else {
            recyclerView.setOnScrollListener(new XYJ(c84981XWv));
        }
        return c84960XWa;
    }

    @Override // X.InterfaceC157206Ey
    public final /* bridge */ /* synthetic */ void LLLF(Object obj) {
    }
}
