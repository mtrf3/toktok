package com.ss.android.ugc.aweme.music.search;

import X.A2G;
import X.C188727au;
import X.C1DJ;
import X.C239759b1;
import X.C239769b2;
import X.C239829b8;
import X.C240269bq;
import X.C240349by;
import X.C240369c0;
import X.C240719cZ;
import X.C2NU;
import X.C33Q;
import X.C42625Go9;
import X.C5S1;
import X.C65352Pkq;
import X.C73969T1h;
import X.C8HZ;
import X.C8VC;
import X.EF7;
import X.EnumC240399c3;
import X.FMX;
import X.InterfaceC214228aw;
import X.InterfaceC240449c8;
import X.InterfaceC241869eQ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.QD3;
import X.QX2;
import X.T16;
import X.TBT;
import Y.AfS53S0200000_4;
import Y.AfS56S0100000_4;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import ujb.s;

/* loaded from: classes5.dex */
public final class SearchMusicListViewModel extends AssemListViewModel<C239829b8, InterfaceC57784Mm4, C240349by> {
    public final InterfaceC214228aw<InterfaceC240449c8> LJLIL;
    public volatile int LJLILLLLZI;
    public final List<Music> LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        AssemViewModel.asyncSubscribe$default(this, new TBT() { // from class: X.9c1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C239829b8 c239829b8 = (C239829b8) obj;
                c239829b8.getClass();
                return C208708Ha.LIZLLL(c239829b8);
            }
        }, null, new AqS170S0100000_4(this, 446), new AqS154S0100000_4(this, 470), new AqS170S0100000_4(this, 447), 2, null);
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C239829b8();
    }

    public final PinnedMusicList iv0() {
        C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class));
        if (c240369c0 != null) {
            return c240369c0.LJI;
        }
        return null;
    }

    public final String jv0() {
        C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class));
        if (c240369c0 != null) {
            return c240369c0.LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C42625Go9.LIZJ(this);
    }

    public final void refresh() {
        String str;
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class));
            if (c240369c0 != null) {
                str = c240369c0.LIZ;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                this.LJLJJL = true;
                manualListRefresh();
                setState(C239769b2.LJLIL);
                return;
            }
            return;
        }
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
        setState(C239759b1.LJLIL);
        listClear();
    }

    public SearchMusicListViewModel(InterfaceC214228aw<InterfaceC240449c8> repo) {
        o.LJIIIZ(repo, "repo");
        this.LJLIL = repo;
        this.LJLJI = new ArrayList();
        this.LJLJJI = "";
    }

    public final Music gv0(MusicModel musicModel) {
        Music convertToMusic = musicModel.convertToMusic();
        convertToMusic.setDuration(convertToMusic.getDuration() / 1000);
        convertToMusic.setShootDuration(Integer.valueOf(convertToMusic.getShootDuration() / 1000));
        convertToMusic.setAuditionDuration(Integer.valueOf(convertToMusic.getAuditionDuration() / 1000));
        return convertToMusic;
    }

    public final EnumC240399c3 hv0(Music music) {
        List<Music> musicList;
        PinnedMusicList iv0 = iv0();
        if (iv0 != null && (musicList = iv0.getMusicList()) != null) {
            Iterator<Music> it = musicList.iterator();
            while (it.hasNext()) {
                if (it.next().getId() == music.getId()) {
                    return EnumC240399c3.PINNED;
                }
            }
        }
        PinnedMusicList iv02 = iv0();
        if (iv02 != null && iv02.getAvalibleCapicity() > 0) {
            return EnumC240399c3.ENABLE_PINNED;
        }
        return EnumC240399c3.DISABLE_PINNED;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.A2G<X.C240349by> lv0(X.C240349by r27) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel.lv0(X.9by):X.A2G");
    }

    public final void mv0(C240719cZ item) {
        MusicGroup musicGroup;
        String id;
        List<MusicGroup> musicGroups;
        o.LJIIIZ(item, "item");
        if (this.LJLJJL || this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = true;
        Music gv0 = gv0(item.LJLIL);
        PinnedMusicList iv0 = iv0();
        if (iv0 != null && (musicGroups = iv0.getMusicGroups()) != null) {
            String idStr = gv0.getIdStr();
            o.LJIIIIZZ(idStr, "music.idStr");
            musicGroup = C1DJ.LJIIJJI(idStr, musicGroups);
        } else {
            musicGroup = null;
        }
        if (C240269bq.LIZ()) {
            if (musicGroup == null || (id = musicGroup.getSourceMusicId()) == null) {
                return;
            }
        } else {
            id = gv0.getIdStr();
        }
        InterfaceC240449c8 operator = this.LJLIL.getOperator();
        String jv0 = jv0();
        if (jv0 == null) {
            jv0 = "";
        }
        o.LJIIIIZZ(id, "id");
        disposeOnClear(operator.LJJJIL(jv0, id).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0200000_4(this, item, 5), new AfS56S0100000_4(this, 30)));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 445));
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str != null && s.LJJJLZIJ(str, "/aweme/v1/original/music/list/?", false)) {
            EventBus.LIZJ().LIZIZ(event);
            refresh();
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C240349by>> interfaceC67352kd) {
        this.LJLILLLLZI++;
        return lv0(new C240349by(jv0(), this.LJLILLLLZI, true, 0, this.LJLJJI));
    }

    public final void kv0(C240719cZ item, int i) {
        o.LJIIIZ(item, "item");
        if (this.LJLJJL || this.LJLJJLL) {
            return;
        }
        PinnedMusicList iv0 = iv0();
        if (iv0 != null && iv0.getAvalibleCapicity() == 0) {
            setState(new AqS170S0100000_4(this, 448));
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("button_type", "pin_to_top");
        c188727au.LJIIIZ("search_result_id", item.LJLIL.getMusicId());
        c188727au.LIZLLL(i, "rank");
        FMX.LJIIL("search_result_click", c188727au.LIZ);
        this.LJLJJLL = true;
        InterfaceC240449c8 operator = this.LJLIL.getOperator();
        String jv0 = jv0();
        if (jv0 == null) {
            jv0 = "";
        }
        String musicId = item.LJLIL.getMusicId();
        o.LJIIIIZZ(musicId, "item.musicModel.musicId");
        disposeOnClear(operator.pinMusic(jv0, musicId).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0200000_4(this, item, 4), new AfS56S0100000_4(this, 29)));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C240349by c240349by, InterfaceC67352kd<? super A2G<C240349by>> interfaceC67352kd) {
        return lv0(c240349by);
    }
}
