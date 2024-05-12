package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC029409q;
import X.C03880Dg;
import X.C10K;
import X.C207668Da;
import X.C44426Hc6;
import X.C4II;
import X.C56464MEa;
import X.C65300Pk0;
import X.C72197SVd;
import X.C79004UzY;
import X.C84934XVa;
import X.C84963XWd;
import X.C84965XWf;
import X.C8HS;
import X.InterfaceC191547fS;
import X.InterfaceC84984XWy;
import X.InterfaceC85024XYm;
import X.NAU;
import X.OGG;
import X.QD3;
import X.V16;
import X.XRT;
import X.XVF;
import X.XVG;
import X.XVW;
import X.XWR;
import X.XX7;
import X.XYC;
import X.XYM;
import X.XYV;
import Y.AgS87S0101000_15;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.fragment.CollectMusicFragment;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.FavoriteRecommendedMusicResponse;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class CollectMusicFragment extends BaseMusicListFragment<C84934XVa> implements OGG, XYV<Music>, InterfaceC191547fS {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public XVG LJLLL;
    public BaseNewMusicTabFragment LJLLLL;

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int Al() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String Dl() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean Gl() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final void Kl(XYC xyc) {
    }

    @Override // X.XYV
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
        int i;
        if (this.LJLJJL != null && (dataCenter = this.LJLJJLL) != null) {
            XRT xrt = (XRT) dataCenter.get("user_collected_music_list");
            InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJLJ;
            if ((interfaceC84984XWy instanceof XWR) && ((XWR) interfaceC84984XWy).LJIIJJI) {
                if (interfaceC84984XWy != 0) {
                    interfaceC84984XWy.showLoadMoreLoading();
                }
                if (xrt != null) {
                    if (C56464MEa.LIZ()) {
                        i = 50;
                    } else {
                        i = 20;
                    }
                    this.LJLJJL.LJII(((Integer) xrt.LIZ("list_cursor")).intValue(), i, this.LJLJLLL);
                }
            }
        }
    }

    @Override // X.OGG
    public final View LJIJJ() {
        Object obj = this.LJLJLJ;
        if (obj == null) {
            return null;
        }
        return ((XWR) obj).LIZIZ;
    }

    @Override // X.XYV
    public final void refreshData() {
        int i;
        if (this.LJLJJL != null) {
            if (C56464MEa.LIZ()) {
                i = 50;
            } else {
                i = 20;
            }
            this.LJLJJL.LJIILIIL(i, this.LJLJLLL, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final AbstractC029409q xl() {
        InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJLJ;
        if (interfaceC84984XWy != 0) {
            return interfaceC84984XWy.LJJLIIIJJIZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC84974XWo
    public final DataCenter cg() {
        DataCenter cg = super.cg();
        this.LJLJJLL = cg;
        cg.iv0("music_collect_status", this, false);
        cg.iv0("music_index", this, false);
        cg.iv0("show_loading_view_by_see_more", this, false);
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC84974XWo
    public final void initData() {
        int i;
        super.initData();
        if (C56464MEa.LIZ()) {
            i = 50;
        } else {
            i = 20;
        }
        this.LJLJJL.LJIILIIL(i, this.LJLJLLL, false);
        if (C56464MEa.LIZ()) {
            this.LJLJJL.LJIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    /* renamed from: Hl */
    public final void onChanged(C207668Da c207668Da) {
        char c;
        RecyclerView recyclerView;
        super.onChanged(c207668Da);
        if (!isViewValid()) {
            return;
        }
        String str = c207668Da.LIZ;
        str.getClass();
        int hashCode = str.hashCode();
        int i = 0;
        if (hashCode != -1635157503) {
            if (hashCode != 1338676148) {
                if (hashCode != 1579846200 || !str.equals("music_index")) {
                    return;
                } else {
                    c = 2;
                }
            } else if (!str.equals("show_loading_view_by_see_more")) {
                return;
            } else {
                c = 1;
            }
        } else if (!str.equals("music_collect_status")) {
            return;
        } else {
            c = 0;
        }
        Object obj = null;
        XX7 xx7 = null;
        if (c != 0) {
            if (c != 1) {
                if (c != 2 || ((Integer) this.LJLJJLL.get("music_position", -1)).intValue() != -2) {
                    return;
                }
                InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJLJ;
                if (interfaceC84984XWy != 0) {
                    xx7 = (XX7) interfaceC84984XWy.LJJLIIIJJIZ();
                }
                xx7.LJZ();
                return;
            }
            Object obj2 = c207668Da.LIZIZ;
            if (obj2 != null) {
                obj = obj2;
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            InterfaceC84984XWy<T> interfaceC84984XWy2 = this.LJLJLJ;
            if (interfaceC84984XWy2 == 0 || interfaceC84984XWy2.LJJLIIIJJIZ() == null || this.LJLJLJ.LJJLIIIJJIZ().getData() == null) {
                return;
            }
            List data = this.LJLJLJ.LJJLIIIJJIZ().getData();
            while (i < data.size()) {
                MusicModel musicModel = ((C84934XVa) ListProtector.get(data, i)).LIZIZ;
                if (musicModel != null) {
                    if (booleanValue) {
                        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.SEE_MORE_BUTTON) {
                            musicModel.setMusicItemType(MusicModel.MusicItemType.LOADING_VIEW);
                            this.LJLJLJ.LJJLIIIJJIZ().notifyItemChanged(i);
                            return;
                        }
                    } else if (musicModel.getMusicItemType() == MusicModel.MusicItemType.LOADING_VIEW) {
                        musicModel.setMusicItemType(MusicModel.MusicItemType.SEE_MORE_BUTTON);
                        this.LJLJLJ.LJJLIIIJJIZ().notifyItemChanged(i);
                        return;
                    }
                }
                i++;
            }
            return;
        }
        Object obj3 = c207668Da.LIZIZ;
        if (obj3 == null) {
            obj3 = null;
        }
        XYC xyc = (XYC) obj3;
        if (xyc.LIZ != 0) {
            return;
        }
        if (xyc.LIZLLL == 1) {
            MusicModel musicModel2 = xyc.LJ;
            InterfaceC84984XWy<T> interfaceC84984XWy3 = this.LJLJLJ;
            if (interfaceC84984XWy3 == 0 || interfaceC84984XWy3.LJJLIIIJJIZ() == null) {
                return;
            }
            List data2 = this.LJLJLJ.LJJLIIIJJIZ().getData();
            if (data2 == null) {
                data2 = new ArrayList();
            }
            boolean z = false;
            for (int i2 = 0; i2 < data2.size(); i2++) {
                MusicModel musicModel3 = ((C84934XVa) ListProtector.get(data2, i2)).LIZIZ;
                if (musicModel3 != null && musicModel2.getMusicId().equals(musicModel3.getMusicId())) {
                    if (!C56464MEa.LIZ()) {
                        return;
                    }
                    MusicModel.CollectionType collectionType = musicModel3.getCollectionType();
                    MusicModel.CollectionType collectionType2 = MusicModel.CollectionType.COLLECTED;
                    if (collectionType != collectionType2) {
                        musicModel3.setCollectionType(collectionType2);
                        this.LJLJLJ.LJJLIIIJJIZ().notifyItemChanged(i2, collectionType2);
                    }
                    z = true;
                }
            }
            if (z) {
                return;
            }
            if (data2.size() == 0) {
                data2.add(new C84934XVa(0, musicModel2, null, null));
                this.LJLJLJ.J5(data2, false);
                return;
            }
            ListProtector.add(data2, 0, new C84934XVa(0, musicModel2, null, null));
            this.LJLJLJ.LJJLIIIJJIZ().notifyItemInserted(0);
            if (C56464MEa.LIZ()) {
                return;
            }
            InterfaceC84984XWy<T> interfaceC84984XWy4 = this.LJLJLJ;
            if (!(interfaceC84984XWy4 instanceof XWR) || (recyclerView = ((XWR) interfaceC84984XWy4).LIZIZ) == null) {
                return;
            }
            recyclerView.LJLI(0);
            return;
        }
        MusicModel musicModel4 = xyc.LJ;
        InterfaceC84984XWy<T> interfaceC84984XWy5 = this.LJLJLJ;
        if (interfaceC84984XWy5 == 0 || interfaceC84984XWy5.LJJLIIIJJIZ() == null || this.LJLJLJ.LJJLIIIJJIZ().getData() == null) {
            return;
        }
        List data3 = this.LJLJLJ.LJJLIIIJJIZ().getData();
        while (i < data3.size()) {
            MusicModel musicModel5 = ((C84934XVa) ListProtector.get(data3, i)).LIZIZ;
            if (musicModel5 != null && musicModel4.getMusicId().equals(musicModel5.getMusicId())) {
                MusicModel.CollectionType collectionType3 = musicModel5.getCollectionType();
                MusicModel.CollectionType collectionType4 = MusicModel.CollectionType.NOT_COLLECTED;
                if (collectionType3 != collectionType4) {
                    musicModel5.setCollectionType(collectionType4);
                    this.LJLJLJ.LJJLIIIJJIZ().notifyItemChanged(i, collectionType4);
                }
                if (!C56464MEa.LIZ()) {
                    return;
                }
            }
            i++;
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    /* renamed from: Il */
    public final void onInternalEvent(XYM xym) {
        String str;
        super.onInternalEvent(xym);
        String str2 = xym.LIZIZ;
        XRT xrt = (XRT) this.LJLJJLL.get("user_collected_music_list");
        if ("see_more_type".equals(str2)) {
            XVW xvw = this.LJLJJL;
            ((Integer) xrt.LIZ("list_cursor")).intValue();
            int i = this.LJLJLLL;
            xvw.LJI = (CollectedMusicList) xvw.LIZIZ.get("cached_collected_music_response", null);
            if (xvw.LJIIIIZZ == null) {
                xvw.LJIIIIZZ = (FavoriteRecommendedMusicResponse) xvw.LIZIZ.get("cached_recommended_music_response", null);
            }
            if (!((Boolean) xvw.LIZIZ.get("HAS_EXPAND_COLLECTED_MUSIC", Boolean.FALSE)).booleanValue()) {
                xvw.LIZIZ.jv0(Boolean.TRUE, "HAS_EXPAND_COLLECTED_MUSIC");
                int intValue = ((Integer) xvw.LIZIZ.get("load_count", 1)).intValue();
                xvw.LJIIL = intValue;
                XVF.LJI(intValue);
                new XRT();
                CollectedMusicList collectedMusicList = xvw.LJI;
                List<MusicModel> LIZIZ = C44426Hc6.LIZIZ(collectedMusicList.items, collectedMusicList.extra);
                if (xvw.LJI.isHasMore()) {
                    MusicModel musicModel = new MusicModel();
                    musicModel.setMusicItemType(MusicModel.MusicItemType.SEE_MORE_BUTTON);
                    ((ArrayList) LIZIZ).add(musicModel);
                }
                xvw.LJFF(LIZIZ, xvw.LJIIIIZZ, xvw.LJI);
            } else if (!xvw.LJIILJJIL) {
                xvw.LJIILJJIL = true;
                xvw.LIZIZ.jv0(Boolean.TRUE, "show_loading_view_by_see_more");
                int intValue2 = ((Integer) xvw.LIZIZ.get("load_count", 1)).intValue() + 1;
                xvw.LJIIL = intValue2;
                XVF.LJI(intValue2);
                xvw.LIZIZ.jv0(Integer.valueOf(xvw.LJIIL), "load_count");
                if (C56464MEa.LIZ()) {
                    str = "pa_sound_page";
                } else {
                    str = "";
                }
                ChooseMusicApi.LJI(xvw.LJI.cursor, 50, str, i).LJ(new AgS87S0101000_15(0, xvw, 0), C10K.LJIIIIZZ, null);
            }
        }
        if ("hide_recommend_type".equals(str2)) {
            XVW xvw2 = this.LJLJJL;
            int i2 = this.LJLJLLL;
            xvw2.LJIIIZ = false;
            xvw2.LIZIZ.jv0(Boolean.FALSE, "show_recommended_music_section");
            if (xvw2.LJIILJJIL) {
                return;
            }
            if (xvw2.LJI == null) {
                xvw2.LJI = (CollectedMusicList) xvw2.LIZIZ.get("cached_collected_music_response", null);
            }
            XRT xrt2 = new XRT();
            CollectedMusicList collectedMusicList2 = xvw2.LJI;
            List<MusicModel> LIZIZ2 = C44426Hc6.LIZIZ(collectedMusicList2.items, collectedMusicList2.extra);
            xrt2.LIZ.put("refresh_status_user_collected_music", 0);
            xrt2.LIZ.put("list_cursor", Integer.valueOf(xvw2.LJI.cursor));
            xrt2.LIZ.put("list_hasmore", Integer.valueOf(xvw2.LJI.hasMore));
            xrt2.LIZIZ("action_type", 1);
            if (LIZIZ2 != null) {
                V16.LJJJLZIJ(xrt2, LIZIZ2);
            }
            xvw2.LIZIZ.jv0(xrt2, "user_collected_music_list");
            CollectedMusicList collectedMusicList3 = xvw2.LJI;
            if (collectedMusicList3.hasMore == 0) {
                return;
            }
            xvw2.LJII(collectedMusicList3.cursor, 50, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C207668Da c207668Da) {
        onChanged(c207668Da);
    }

    @QD3
    public void onEvent(C72197SVd c72197SVd) {
        DataCenter dataCenter = this.LJLJJLL;
        if (dataCenter != null && c72197SVd != null) {
            dataCenter.jv0(new XYC(0, c72197SVd.LJLIL, -1, -1, c72197SVd.LJLILLLLZI), "music_collect_status");
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.C72H
    public final /* bridge */ /* synthetic */ void onInternalEvent(XYM xym) {
        onInternalEvent(xym);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        RecyclerView recyclerView;
        int i;
        MusicModel musicModel;
        boolean z2;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "4157205624933924706");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/CollectMusicFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/CollectMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z && (LJIJJ() instanceof RecyclerView) && (recyclerView = (RecyclerView) LJIJJ()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int LLILL = linearLayoutManager.LLILL();
            int LLILLJJLI = linearLayoutManager.LLILLJJLI();
            C8HS LJJLIIIJJIZ = this.LJLJLJ.LJJLIIIJJIZ();
            if (LJJLIIIJJIZ != null) {
                List data = LJJLIIIJJIZ.getData();
                if (!C79004UzY.LJJIFFI(data)) {
                    while (LLILL < LLILLJJLI) {
                        if (LLILL >= 0 && LLILL < data.size() && (musicModel = ((C84934XVa) ListProtector.get(data, LLILL)).LIZIZ) != null && this.LJLLL != null && musicModel.isRealMusicItem().booleanValue()) {
                            this.LJLLL.LJIIIIZZ = musicModel.getLogPb();
                            NAU nau = new NAU(recyclerView, musicModel, LLILL);
                            XVG xvg = this.LJLLL;
                            if (musicModel.getMatchedPGCSoundInfo() != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = LLILL;
                            XVF.LJIIL(nau, this, xvg, musicModel, LLILL, true, z2);
                        } else {
                            i = LLILL;
                        }
                        LLILL = i + 1;
                    }
                }
            }
        }
        Object obj = this.LJLJLJ;
        if (obj instanceof C84963XWd) {
            C4II c4ii = ((XWR) obj).LJFF;
            if (c4ii instanceof XX7) {
                ((XX7) c4ii).LJLLILLLL = z;
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/CollectMusicFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC84984XWy<C84934XVa> vl(View view) {
        C84963XWd c84963XWd = new C84963XWd(getContext(), view, this, this, this, this.LJLLJ);
        C4II c4ii = c84963XWd.LJFF;
        if (c4ii instanceof XX7) {
            ((XX7) c4ii).LJLIL = this;
        }
        Pair<Long, Long> pair = new Pair<>(Long.valueOf(this.LJLL), Long.valueOf(this.LJLLI));
        C4II c4ii2 = c84963XWd.LJFF;
        boolean z = c4ii2 instanceof XX7;
        if (z) {
            ((XX7) c4ii2).LJLJJI = pair;
        }
        C84965XWf c84965XWf = new C84965XWf(this);
        if (z) {
            ((XX7) c4ii2).LJLILLLLZI = c84965XWf;
        }
        XVG xvg = new XVG("change_music_page", "favorite_song", "", XVF.LIZ);
        this.LJLLL = xvg;
        if (z) {
            ((XX7) c4ii2).LJLJLJ = xvg;
        }
        if (c4ii2 instanceof XX7) {
            ((XX7) c4ii2).LJLLILLLL = false;
        }
        c84963XWd.LJ(new InterfaceC85024XYm() { // from class: X.XYZ
            @Override // X.InterfaceC85024XYm
            public final void LIZ() {
                CollectMusicFragment.this.LJIIJJI();
            }
        }, 10);
        return c84963XWd;
    }

    @Override // X.XYV
    public final /* bridge */ /* synthetic */ void LLLF(Object obj) {
    }
}
