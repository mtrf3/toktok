package com.ss.android.ugc.aweme.music.vm;

import X.A2F;
import X.A2G;
import X.AV1;
import X.C00F;
import X.C16880lQ;
import X.C188727au;
import X.C1DJ;
import X.C239829b8;
import X.C239979bN;
import X.C239989bO;
import X.C240269bq;
import X.C240359bz;
import X.C240369c0;
import X.C240639cR;
import X.C240719cZ;
import X.C26045AKb;
import X.C2NU;
import X.C2U4;
import X.C32I;
import X.C33Q;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65777Prh;
import X.C73969T1h;
import X.C7Y8;
import X.C8HZ;
import X.C8VC;
import X.EF7;
import X.EnumC240399c3;
import X.FMX;
import X.HG3;
import X.InterfaceC214228aw;
import X.InterfaceC240439c7;
import X.InterfaceC241869eQ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.OSZ;
import X.QD3;
import X.QX2;
import X.RBX;
import X.T16;
import X.TBT;
import Y.AfS43S0300000_4;
import Y.AfS53S0200000_4;
import Y.AfS56S0100000_4;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
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
public final class OriginMusicListViewModel extends AssemListViewModel<C239829b8, InterfaceC57784Mm4, C240359bz> {
    public final InterfaceC214228aw<InterfaceC240439c7> LJLIL;
    public boolean LJLILLLLZI;
    public PinnedMusicList LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final List<Music> LJLJJLL;
    public final List<MusicGroup> LJLJL;
    public String LJLJLJ;
    public volatile int LJLJLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        AssemViewModel.asyncSubscribe$default(this, new TBT() { // from class: X.9c2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C239829b8 c239829b8 = (C239829b8) obj;
                c239829b8.getClass();
                return C208708Ha.LIZLLL(c239829b8);
            }
        }, null, new AqS170S0100000_4(this, 455), new AqS154S0100000_4(this, 487), new AqS170S0100000_4(this, 456), 2, null);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C239829b8();
    }

    public final EnumC240399c3 kv0() {
        PinnedMusicList pinnedMusicList = this.LJLJI;
        if (pinnedMusicList != null && pinnedMusicList.getAvalibleCapicity() > 0) {
            return EnumC240399c3.ENABLE_PINNED;
        }
        return EnumC240399c3.DISABLE_PINNED;
    }

    public final String lv0() {
        C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class));
        if (c240369c0 != null) {
            return c240369c0.LIZIZ;
        }
        return null;
    }

    public final String mv0() {
        C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class));
        if (c240369c0 != null) {
            return c240369c0.LIZ;
        }
        return null;
    }

    public final void refresh() {
        if (!this.LJLILLLLZI && !TextUtils.isEmpty(mv0())) {
            EF7.LIZIZ();
            try {
                if (C2NU.LIZ.LIZIZ()) {
                    if (this.LJLJJI) {
                        return;
                    }
                    this.LJLJJI = true;
                    manualListRefresh();
                    setState(C239989bO.LJLIL);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        if (!NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            Activity topActivity = ActivityStack.getTopActivity();
            o.LJIIIIZZ(topActivity, "getTopActivity()");
            C26045AKb c26045AKb = new C26045AKb(topActivity);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
        }
        setState(C239979bN.LJLIL);
        listClear();
    }

    public static boolean jv0() {
        if (C7Y8.LIZ() || C00F.LIZ(31744, 0, "user_show_highlight_new_release", true) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZJ().LJIJ(this);
    }

    public final boolean pv0() {
        boolean z;
        C240369c0 c240369c0;
        C240369c0 c240369c02;
        List<Long> list;
        boolean LJIILLIIL = AV1.LJIILLIIL();
        if (((RBX) HG3.LJIILL()).getCurUser().getAccountType() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (!C7Y8.LIZ() || (c240369c0 = (C240369c0) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class))) == null || !c240369c0.LIZJ || LJIILLIIL || z || (c240369c02 = (C240369c0) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class))) == null || (list = c240369c02.LJII) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public OriginMusicListViewModel(InterfaceC214228aw<InterfaceC240439c7> repo) {
        o.LJIIIZ(repo, "repo");
        this.LJLIL = repo;
        this.LJLJJLL = new ArrayList();
        this.LJLJL = new ArrayList();
    }

    public final Music iv0(MusicModel musicModel) {
        Music convertToMusic = musicModel.convertToMusic();
        convertToMusic.setDuration(convertToMusic.getDuration() / 1000);
        convertToMusic.setShootDuration(Integer.valueOf(convertToMusic.getShootDuration() / 1000));
        convertToMusic.setAuditionDuration(Integer.valueOf(convertToMusic.getAuditionDuration() / 1000));
        return convertToMusic;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 454));
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
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C240359bz>> interfaceC67352kd) {
        this.LJLJLLL++;
        return ov0(new C240359bz(mv0(), this.LJLJLLL, true, 0, lv0()));
    }

    public final A2G<C240359bz> ov0(C240359bz c240359bz) {
        List<InterfaceC57784Mm4> gv0;
        PinnedMusicList pinnedMusicList;
        if (this.LJLILLLLZI) {
            return A2F.LIZIZ(A2G.LIZ);
        }
        try {
            OriginalMusicList LJL = this.LJLIL.getOperator().LJL(c240359bz.LIZLLL, c240359bz.LJ, c240359bz.LIZIZ, c240359bz.LIZJ);
            if (LJL == null) {
                return A2F.LIZIZ(A2G.LIZ);
            }
            if (c240359bz.LIZ == this.LJLJLLL && c240359bz.LJFF) {
                try {
                    pinnedMusicList = this.LJLIL.getOperator().getPinnedMusicList(c240359bz.LIZJ);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    pinnedMusicList = new PinnedMusicList();
                }
                this.LJLJI = pinnedMusicList;
                ((ArrayList) this.LJLJJLL).clear();
                ((ArrayList) this.LJLJL).clear();
                this.LJLJLJ = null;
            }
            List<MusicGroup> list = this.LJLJL;
            List<MusicGroup> musicGroups = LJL.getMusicGroups();
            if (musicGroups == null) {
                musicGroups = C61878OQg.INSTANCE;
            }
            ((ArrayList) list).addAll(musicGroups);
            List<Music> list2 = this.LJLJJLL;
            List<Music> musicList = LJL.getMusicList();
            if (musicList == null) {
                musicList = C61878OQg.INSTANCE;
            }
            ((ArrayList) list2).addAll(musicList);
            if (c240359bz.LIZ == this.LJLJLLL && c240359bz.LJFF) {
                gv0 = hv0(this, null, null, null, null, null, null, 63);
                if (((ArrayList) gv0).isEmpty()) {
                    throw new Exception();
                }
            } else {
                gv0 = gv0(LJL.getMusicList(), LJL.getMusicGroups());
            }
            if (LJL.getHasMore()) {
                A2F a2f = A2G.LIZ;
                int i = c240359bz.LIZ;
                return A2F.LJ(a2f, null, new C240359bz(c240359bz.LIZIZ, i, false, LJL.getCursor(), c240359bz.LIZJ), gv0, 1);
            }
            A2G.LIZ.getClass();
            return A2F.LIZ(gv0);
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
            A2G.LIZ.getClass();
            return A2F.LIZJ(e2);
        }
    }

    public final void qv0(C240719cZ item) {
        MusicGroup musicGroup;
        String id;
        List<MusicGroup> musicGroups;
        o.LJIIIZ(item, "item");
        if (this.LJLJJI || this.LJLJJL) {
            return;
        }
        this.LJLJJL = true;
        Music iv0 = iv0(item.LJLIL);
        PinnedMusicList pinnedMusicList = this.LJLJI;
        if (pinnedMusicList != null && (musicGroups = pinnedMusicList.getMusicGroups()) != null) {
            String idStr = iv0.getIdStr();
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
            id = iv0.getIdStr();
        }
        InterfaceC240439c7 operator = this.LJLIL.getOperator();
        String lv0 = lv0();
        if (lv0 == null) {
            lv0 = "";
        }
        o.LJIIIIZZ(id, "id");
        disposeOnClear(operator.LJJJIL(lv0, id).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS43S0300000_4(this, musicGroup, iv0, 1), new AfS56S0100000_4(this, 32)));
    }

    public final List<InterfaceC57784Mm4> gv0(List<? extends Music> list, List<MusicGroup> list2) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        PinnedMusicList pinnedMusicList;
        Music highlightedMusic;
        List<Music> musicList;
        boolean z3;
        boolean z4;
        List<MusicGroup> musicGroups;
        if (C240269bq.LIZ()) {
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (MusicGroup musicGroup : list2) {
                PinnedMusicList pinnedMusicList2 = this.LJLJI;
                MusicGroup musicGroup2 = null;
                if (pinnedMusicList2 != null && (musicGroups = pinnedMusicList2.getMusicGroups()) != null) {
                    Iterator<MusicGroup> it = musicGroups.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        MusicGroup next = it.next();
                        if (o.LJ(next, musicGroup)) {
                            if (next != null) {
                                z3 = true;
                            }
                        }
                    }
                }
                z3 = false;
                if (jv0()) {
                    PinnedMusicList pinnedMusicList3 = this.LJLJI;
                    if (pinnedMusicList3 != null) {
                        musicGroup2 = pinnedMusicList3.getHighlightedGroup();
                    }
                    if (o.LJ(musicGroup2, musicGroup)) {
                        z4 = true;
                        if (!z3 && !z4) {
                            arrayList2.add(musicGroup);
                        }
                    }
                }
                z4 = false;
                if (!z3) {
                    arrayList2.add(musicGroup);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C240719cZ LJJIJLIJ = C1DJ.LJJIJLIJ((MusicGroup) it2.next(), kv0(), null, null, null, 14);
                if (LJJIJLIJ != null) {
                    arrayList.add(LJJIJLIJ);
                }
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Music music : list) {
                Music music2 = music;
                PinnedMusicList pinnedMusicList4 = this.LJLJI;
                if (pinnedMusicList4 != null && (musicList = pinnedMusicList4.getMusicList()) != null) {
                    Iterator<Music> it3 = musicList.iterator();
                    while (it3.hasNext()) {
                        if (music2.getId() == it3.next().getId()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (jv0() && (pinnedMusicList = this.LJLJI) != null && (highlightedMusic = pinnedMusicList.getHighlightedMusic()) != null && highlightedMusic.getId() == music2.getId()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && !z2) {
                    arrayList3.add(music);
                }
            }
            arrayList = new ArrayList(C32I.LJJL(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                MusicModel convertToMusicModel = ((Music) it4.next()).convertToMusicModel();
                o.LJIIIIZZ(convertToMusicModel, "music.convertToMusicModel()");
                arrayList.add(new C240719cZ(convertToMusicModel, new C240639cR(kv0(), false, false, 0, false, false, false, false, false, 510)));
            }
        }
        return arrayList;
    }

    public final void nv0(C240719cZ item, int i) {
        String str;
        PinnedMusicList pinnedMusicList;
        int i2;
        PinnedMusicList pinnedMusicList2;
        o.LJIIIZ(item, "item");
        if (this.LJLJJI || this.LJLJJL) {
            return;
        }
        PinnedMusicList pinnedMusicList3 = this.LJLJI;
        if (pinnedMusicList3 != null && pinnedMusicList3.getAvalibleCapicity() == 0) {
            setState(new AqS170S0100000_4(this, 457));
            return;
        }
        C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC241869eQ.class));
        if (c240369c0 != null && c240369c0.LIZJ) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        if (!C240269bq.LIZ() ? !((pinnedMusicList = this.LJLJI) == null || pinnedMusicList.getHighlightedMusic() == null) : !((pinnedMusicList2 = this.LJLJI) == null || pinnedMusicList2.getHighlightedGroup() == null)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("music_id", item.LJLIL.getMusicId());
        c188727au.LJIIIZ("enter_method", "personal_list");
        c188727au.LJIIIZ("user_id", mv0());
        c188727au.LIZLLL(i, "pos");
        c188727au.LIZLLL(0, "is_pin_to_top");
        c188727au.LIZLLL(i2, "highlight");
        FMX.LJIIL("pin_to_top_music", c188727au.LIZ);
        this.LJLJJL = true;
        InterfaceC240439c7 operator = this.LJLIL.getOperator();
        String lv0 = lv0();
        if (lv0 == null) {
            lv0 = "";
        }
        String musicId = item.LJLIL.getMusicId();
        o.LJIIIIZZ(musicId, "item.musicModel.musicId");
        disposeOnClear(operator.pinMusic(lv0, musicId).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0200000_4(this, item, 6), new AfS56S0100000_4(this, 31)));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C240359bz c240359bz, InterfaceC67352kd<? super A2G<C240359bz>> interfaceC67352kd) {
        return ov0(c240359bz);
    }

    public static List hv0(OriginMusicListViewModel originMusicListViewModel, OSZ osz, Music music, Music music2, Music music3, String str, String str2, int i) {
        Music music4;
        Music music5;
        boolean z;
        boolean z2;
        PinnedMusicList pinnedMusicList;
        Music highlightedMusic;
        List<Music> musicList;
        List<Music> musicList2;
        PinnedMusicList pinnedMusicList2;
        Music highlightedMusic2;
        PinnedMusicList pinnedMusicList3;
        Music highlightedMusic3;
        PinnedMusicList pinnedMusicList4;
        boolean z3;
        boolean z4;
        Object obj;
        List<MusicGroup> musicGroups;
        List<MusicGroup> musicGroups2;
        MusicGroup musicGroup;
        PinnedMusicList pinnedMusicList5;
        MusicGroup highlightedGroup;
        PinnedMusicList pinnedMusicList6;
        Music music6;
        MusicGroup musicGroup2;
        String str3;
        Music music7 = music2;
        String str4 = str2;
        Boolean bool = null;
        if ((i & 1) != 0) {
            osz = null;
        }
        if ((i & 2) != 0) {
            music = null;
        }
        if ((i & 4) != 0) {
            music7 = null;
        }
        if ((i & 8) != 0) {
            music3 = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        originMusicListViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        PinnedMusicList pinnedMusicList7 = originMusicListViewModel.LJLJI;
        boolean z5 = false;
        if (osz != null) {
            PinnedMusicList pinnedMusicList8 = originMusicListViewModel.LJLJI;
            if (pinnedMusicList8 != null) {
                Music music8 = (Music) osz.getFirst();
                MusicGroup musicGroup3 = (MusicGroup) osz.getSecond();
                pinnedMusicList8.setHighlightedMusic(music8);
                pinnedMusicList8.setHighlightedGroup(musicGroup3);
                Iterator<Music> it = pinnedMusicList8.getMusicList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        music6 = it.next();
                        String idStr = music6.getIdStr();
                        if (music8 != null) {
                            str3 = music8.getIdStr();
                        } else {
                            str3 = null;
                        }
                        if (o.LJ(idStr, str3)) {
                            break;
                        }
                    } else {
                        music6 = null;
                        break;
                    }
                }
                Iterator<MusicGroup> it2 = pinnedMusicList8.getMusicGroups().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        musicGroup2 = it2.next();
                        if (o.LJ(musicGroup2, musicGroup3)) {
                            break;
                        }
                    } else {
                        musicGroup2 = null;
                        break;
                    }
                }
                if (music6 != null || musicGroup2 != null) {
                    C65777Prh.LIZ(pinnedMusicList8.getMusicList()).remove(music6);
                    C65777Prh.LIZ(pinnedMusicList8.getMusicGroups()).remove(musicGroup2);
                    pinnedMusicList8.setAvalibleCapicity(pinnedMusicList8.getAvalibleCapicity() + 1);
                }
            }
            MusicGroup musicGroup4 = (MusicGroup) osz.getSecond();
            if (musicGroup4 != null && C1DJ.LJII(musicGroup4, originMusicListViewModel.LJLJLJ)) {
                originMusicListViewModel.LJLJLJ = null;
            }
        } else if (music != null) {
            PinnedMusicList pinnedMusicList9 = originMusicListViewModel.LJLJI;
            if (pinnedMusicList9 != null) {
                pinnedMusicList9.setHighlightedMusic(null);
            }
            PinnedMusicList pinnedMusicList10 = originMusicListViewModel.LJLJI;
            if (pinnedMusicList10 != null) {
                pinnedMusicList10.setHighlightedGroup(null);
            }
            PinnedMusicList pinnedMusicList11 = originMusicListViewModel.LJLJI;
            if (pinnedMusicList11 != null) {
                Iterator<Music> it3 = pinnedMusicList11.getMusicList().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        music5 = it3.next();
                        if (o.LJ(music5.getIdStr(), music.getIdStr())) {
                            break;
                        }
                    } else {
                        music5 = null;
                        break;
                    }
                }
                List<MusicGroup> musicGroups3 = pinnedMusicList11.getMusicGroups();
                String idStr2 = music.getIdStr();
                o.LJIIIIZZ(idStr2, "unHighlightMusic.idStr");
                MusicGroup LJIIJJI = C1DJ.LJIIJJI(idStr2, musicGroups3);
                if (music5 != null || LJIIJJI != null) {
                    C65777Prh.LIZ(pinnedMusicList11.getMusicList()).remove(music5);
                    C65777Prh.LIZ(pinnedMusicList11.getMusicGroups()).remove(LJIIJJI);
                    pinnedMusicList11.setAvalibleCapicity(pinnedMusicList11.getAvalibleCapicity() + 1);
                }
            }
            if (o.LJ(music.getIdStr(), originMusicListViewModel.LJLJLJ)) {
                originMusicListViewModel.LJLJLJ = null;
            }
        } else if (music7 != null) {
            PinnedMusicList pinnedMusicList12 = originMusicListViewModel.LJLJI;
            if (pinnedMusicList12 != null) {
                ListProtector.add(pinnedMusicList12.getMusicList(), 0, music7);
                List<MusicGroup> list = originMusicListViewModel.LJLJL;
                String idStr3 = music7.getIdStr();
                o.LJIIIIZZ(idStr3, "pinMusic.idStr");
                MusicGroup LJIIJJI2 = C1DJ.LJIIJJI(idStr3, list);
                if (LJIIJJI2 != null) {
                    ListProtector.add(pinnedMusicList12.getMusicGroups(), 0, LJIIJJI2);
                }
                pinnedMusicList12.setAvalibleCapicity(pinnedMusicList12.getAvalibleCapicity() - 1);
            }
            if (o.LJ(music7.getIdStr(), originMusicListViewModel.LJLJLJ)) {
                originMusicListViewModel.LJLJLJ = null;
            }
        } else if (music3 != null) {
            PinnedMusicList pinnedMusicList13 = originMusicListViewModel.LJLJI;
            if (pinnedMusicList13 != null) {
                Iterator<Music> it4 = pinnedMusicList13.getMusicList().iterator();
                while (true) {
                    if (it4.hasNext()) {
                        music4 = it4.next();
                        if (o.LJ(music4.getIdStr(), music3.getIdStr())) {
                            break;
                        }
                    } else {
                        music4 = null;
                        break;
                    }
                }
                List<MusicGroup> musicGroups4 = pinnedMusicList13.getMusicGroups();
                String idStr4 = music3.getIdStr();
                o.LJIIIIZZ(idStr4, "unPinMusic.idStr");
                MusicGroup LJIIJJI3 = C1DJ.LJIIJJI(idStr4, musicGroups4);
                if (music4 != null || LJIIJJI3 != null) {
                    C65777Prh.LIZ(pinnedMusicList13.getMusicList()).remove(music4);
                    C65777Prh.LIZ(pinnedMusicList13.getMusicGroups()).remove(LJIIJJI3);
                    pinnedMusicList13.setAvalibleCapicity(pinnedMusicList13.getAvalibleCapicity() + 1);
                }
            }
            if (o.LJ(music3.getIdStr(), originMusicListViewModel.LJLJLJ)) {
                originMusicListViewModel.LJLJLJ = null;
            }
        } else if (str != null) {
            originMusicListViewModel.LJLJLJ = null;
        } else if (str4 != null) {
            originMusicListViewModel.LJLJLJ = str4;
        }
        if (C240269bq.LIZ()) {
            if (originMusicListViewModel.pv0() && (((pinnedMusicList6 = originMusicListViewModel.LJLJI) == null || pinnedMusicList6.getHighlightedGroup() == null) && (!((ArrayList) originMusicListViewModel.LJLJL).isEmpty()))) {
                arrayList.add(new C2U4(0));
            }
            if (jv0() && (pinnedMusicList5 = originMusicListViewModel.LJLJI) != null && (highlightedGroup = pinnedMusicList5.getHighlightedGroup()) != null) {
                EnumC240399c3 enumC240399c3 = EnumC240399c3.PINNED;
                Boolean bool2 = Boolean.TRUE;
                C240719cZ LJJIJLIJ = C1DJ.LJJIJLIJ(highlightedGroup, enumC240399c3, bool2, Boolean.valueOf(C1DJ.LJII(highlightedGroup, originMusicListViewModel.LJLJLJ)), null, 8);
                if (LJJIJLIJ != null) {
                    arrayList.add(LJJIJLIJ);
                }
                if (C1DJ.LJII(highlightedGroup, originMusicListViewModel.LJLJLJ)) {
                    arrayList.addAll(C1DJ.LJJIJL(highlightedGroup, bool2));
                }
            }
            PinnedMusicList pinnedMusicList14 = originMusicListViewModel.LJLJI;
            if (pinnedMusicList14 != null && (musicGroups2 = pinnedMusicList14.getMusicGroups()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (MusicGroup musicGroup5 : musicGroups2) {
                    if (jv0()) {
                        PinnedMusicList pinnedMusicList15 = originMusicListViewModel.LJLJI;
                        if (pinnedMusicList15 != null) {
                            musicGroup = pinnedMusicList15.getHighlightedGroup();
                        } else {
                            musicGroup = null;
                        }
                        if (o.LJ(musicGroup5, musicGroup)) {
                        }
                    }
                    arrayList2.add(musicGroup5);
                }
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    MusicGroup musicGroup6 = (MusicGroup) it5.next();
                    Boolean bool3 = bool;
                    bool = bool;
                    C240719cZ LJJIJLIJ2 = C1DJ.LJJIJLIJ(musicGroup6, EnumC240399c3.PINNED, bool3, Boolean.valueOf(C1DJ.LJII(musicGroup6, originMusicListViewModel.LJLJLJ)), bool, 10);
                    if (LJJIJLIJ2 != null) {
                        arrayList.add(LJJIJLIJ2);
                    }
                    if (C1DJ.LJII(musicGroup6, originMusicListViewModel.LJLJLJ)) {
                        arrayList.addAll(C1DJ.LJJIJL(musicGroup6, bool));
                    }
                }
            }
            List<MusicGroup> list2 = originMusicListViewModel.LJLJL;
            ArrayList arrayList3 = new ArrayList();
            Iterator it6 = ((ArrayList) list2).iterator();
            while (it6.hasNext()) {
                Object next = it6.next();
                PinnedMusicList pinnedMusicList16 = originMusicListViewModel.LJLJI;
                if (pinnedMusicList16 != null && (musicGroups = pinnedMusicList16.getMusicGroups()) != null) {
                    Iterator<MusicGroup> it7 = musicGroups.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        MusicGroup next2 = it7.next();
                        if (o.LJ(next2, next)) {
                            if (next2 != null) {
                                z3 = true;
                            }
                        }
                    }
                }
                z3 = false;
                if (jv0()) {
                    PinnedMusicList pinnedMusicList17 = originMusicListViewModel.LJLJI;
                    if (pinnedMusicList17 != null) {
                        obj = pinnedMusicList17.getHighlightedGroup();
                    } else {
                        obj = bool;
                    }
                    if (o.LJ(obj, next)) {
                        z4 = true;
                        if (!z3 && !z4) {
                            arrayList3.add(next);
                        }
                    }
                }
                z4 = false;
                if (!z3) {
                    arrayList3.add(next);
                }
            }
            Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                MusicGroup musicGroup7 = (MusicGroup) it8.next();
                Boolean bool4 = bool;
                bool = bool;
                C240719cZ LJJIJLIJ3 = C1DJ.LJJIJLIJ(musicGroup7, originMusicListViewModel.kv0(), bool4, Boolean.valueOf(C1DJ.LJII(musicGroup7, originMusicListViewModel.LJLJLJ)), bool, 10);
                if (LJJIJLIJ3 != null) {
                    arrayList.add(LJJIJLIJ3);
                }
                if (C1DJ.LJII(musicGroup7, originMusicListViewModel.LJLJLJ)) {
                    arrayList.addAll(C1DJ.LJJIJL(musicGroup7, bool));
                }
            }
        } else {
            if (originMusicListViewModel.pv0() && (((pinnedMusicList4 = originMusicListViewModel.LJLJI) == null || pinnedMusicList4.getHighlightedMusic() == null) && (!((ArrayList) originMusicListViewModel.LJLJJLL).isEmpty()))) {
                arrayList.add(new C2U4(0));
            }
            if (jv0() && (pinnedMusicList3 = originMusicListViewModel.LJLJI) != null && (highlightedMusic3 = pinnedMusicList3.getHighlightedMusic()) != null) {
                MusicModel convertToMusicModel = highlightedMusic3.convertToMusicModel();
                o.LJIIIIZZ(convertToMusicModel, "it.convertToMusicModel()");
                arrayList.add(new C240719cZ(convertToMusicModel, new C240639cR(EnumC240399c3.PINNED, true, false, 0, false, false, false, false, false, 508)));
            }
            PinnedMusicList pinnedMusicList18 = originMusicListViewModel.LJLJI;
            if (pinnedMusicList18 != null && (musicList2 = pinnedMusicList18.getMusicList()) != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Music music9 : musicList2) {
                    Music music10 = music9;
                    if (!jv0() || (pinnedMusicList2 = originMusicListViewModel.LJLJI) == null || (highlightedMusic2 = pinnedMusicList2.getHighlightedMusic()) == null || highlightedMusic2.getId() != music10.getId()) {
                        arrayList4.add(music9);
                    }
                }
                Iterator it9 = arrayList4.iterator();
                while (it9.hasNext()) {
                    MusicModel convertToMusicModel2 = ((Music) it9.next()).convertToMusicModel();
                    o.LJIIIIZZ(convertToMusicModel2, "music.convertToMusicModel()");
                    boolean z6 = z5;
                    boolean z7 = z5;
                    z5 = z5;
                    arrayList.add(new C240719cZ(convertToMusicModel2, new C240639cR(EnumC240399c3.PINNED, z6, z7, z5 ? 1 : 0, z5, z5, z5, z5, z5, 510)));
                }
            }
            List<Music> list3 = originMusicListViewModel.LJLJJLL;
            ArrayList arrayList5 = new ArrayList();
            Iterator it10 = ((ArrayList) list3).iterator();
            while (it10.hasNext()) {
                Object next3 = it10.next();
                Music music11 = (Music) next3;
                PinnedMusicList pinnedMusicList19 = originMusicListViewModel.LJLJI;
                if (pinnedMusicList19 != null && (musicList = pinnedMusicList19.getMusicList()) != null) {
                    Iterator<Music> it11 = musicList.iterator();
                    while (it11.hasNext()) {
                        if (music11.getId() == it11.next().getId()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (jv0() && (pinnedMusicList = originMusicListViewModel.LJLJI) != null && (highlightedMusic = pinnedMusicList.getHighlightedMusic()) != null && highlightedMusic.getId() == music11.getId()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && !z2) {
                    arrayList5.add(next3);
                }
            }
            Iterator it12 = arrayList5.iterator();
            while (it12.hasNext()) {
                MusicModel convertToMusicModel3 = ((Music) it12.next()).convertToMusicModel();
                o.LJIIIIZZ(convertToMusicModel3, "music.convertToMusicModel()");
                arrayList.add(new C240719cZ(convertToMusicModel3, new C240639cR(originMusicListViewModel.kv0(), false, false, 0, false, false, false, false, false, 510)));
            }
        }
        return arrayList;
    }
}
