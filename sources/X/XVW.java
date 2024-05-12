package X;

import Y.ACallableS78S0101000_6;
import Y.AfS36S0101000_5;
import Y.AgS115S0200000_15;
import Y.AgS131S0100000_15;
import Y.AgS22S0100100_15;
import Y.AgS24S1000000_15;
import Y.AgS2S1220000_15;
import Y.AgS86S0101000_3;
import android.content.Context;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.model.MusicPickResponse;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.FavoriteRecommendedMusicResponse;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XVW {
    public final DataCenter LIZIZ;
    public final Context LIZJ;
    public C84917XUj LJ;
    public boolean LJFF;
    public CollectedMusicList LJI;
    public List<MusicModel> LJII;
    public FavoriteRecommendedMusicResponse LJIIIIZZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIIIZ = true;
    public int LJIIL = 1;
    public final ChooseMusicApi.API LIZ = ChooseMusicApi.LIZ;
    public final IAVMobService LIZLLL = AVExternalServiceImpl.LIZ().getAVMobService();

    public final void LJIIL() {
        FavoriteRecommendedMusicResponse favoriteRecommendedMusicResponse = (FavoriteRecommendedMusicResponse) this.LIZIZ.get("cached_recommended_music_response", null);
        this.LJIIIIZZ = favoriteRecommendedMusicResponse;
        if (this.LJIIJ || favoriteRecommendedMusicResponse != null || !C56464MEa.LIZ()) {
            return;
        }
        this.LJIIJ = true;
        this.LJIIIZ = ((Boolean) this.LIZIZ.get("show_recommended_music_section", Boolean.TRUE)).booleanValue();
        ChooseMusicApi.LIZ.getFavoriteRecommendedMusic(0, 10, 0).LJ(new C10I() { // from class: X.XVY
            @Override // X.C10I
            public final Object then(C10K c10k) {
                List<? extends Music> list;
                XVW xvw = XVW.this;
                xvw.LJIIJ = false;
                if (c10k.LJIILIIL()) {
                    FavoriteRecommendedMusicResponse favoriteRecommendedMusicResponse2 = (FavoriteRecommendedMusicResponse) c10k.LJIIJJI();
                    List<? extends Music> list2 = favoriteRecommendedMusicResponse2.items;
                    if (list2 != null && !list2.isEmpty()) {
                        xvw.LIZIZ.jv0(favoriteRecommendedMusicResponse2, "cached_recommended_music_response");
                        xvw.LJIIIIZZ = favoriteRecommendedMusicResponse2;
                    }
                    if (xvw.LJI == null) {
                        xvw.LJI = (CollectedMusicList) xvw.LIZIZ.get("cached_collected_music_response", null);
                    }
                    CollectedMusicList collectedMusicList = xvw.LJI;
                    if (collectedMusicList != null && !xvw.LJIIJJI) {
                        xvw.LJIIJJI = true;
                        List<MusicModel> LIZIZ = C44426Hc6.LIZIZ(collectedMusicList.items, collectedMusicList.extra);
                        int LIZ = C52284KfY.LIZ();
                        if (LIZIZ != null && ((ArrayList) LIZIZ).size() > LIZ && xvw.LJIIIZ && (list = favoriteRecommendedMusicResponse2.items) != null && !list.isEmpty()) {
                            LIZIZ = ((ArrayList) LIZIZ).subList(0, LIZ);
                            MusicModel musicModel = new MusicModel();
                            musicModel.setMusicItemType(MusicModel.MusicItemType.SEE_MORE_BUTTON);
                            LIZIZ.add(musicModel);
                        }
                        xvw.LJFF(LIZIZ, favoriteRecommendedMusicResponse2, xvw.LJI);
                    }
                } else if (c10k.LJIILJJIL() && xvw.LJI != null && !xvw.LJIIJJI) {
                    xvw.LJIIJJI = true;
                    XRT xrt = new XRT();
                    if (xvw.LJI == null) {
                        xvw.LJI = (CollectedMusicList) xvw.LIZIZ.get("cached_collected_music_response", null);
                    }
                    CollectedMusicList collectedMusicList2 = xvw.LJI;
                    List<MusicModel> LIZIZ2 = C44426Hc6.LIZIZ(collectedMusicList2.items, collectedMusicList2.extra);
                    xrt.LIZ.put("refresh_status_user_collected_music", 0);
                    xrt.LIZ.put("list_cursor", Integer.valueOf(xvw.LJI.cursor));
                    xrt.LIZ.put("list_hasmore", Integer.valueOf(xvw.LJI.hasMore));
                    xrt.LIZIZ("action_type", 1);
                    V16.LJJJLZIJ(xrt, LIZIZ2);
                    xvw.LIZIZ.jv0(xrt, "user_collected_music_list");
                }
                return null;
            }
        }, C10K.LJIIIIZZ, null);
    }

    public final void LJIILJJIL() {
        this.LIZIZ.jv0(Boolean.FALSE, "HAS_EXPAND_COLLECTED_MUSIC");
        this.LIZIZ.jv0(Boolean.TRUE, "HAS_LEFT_FAV_TAB");
        this.LJIIL = 1;
        this.LIZIZ.jv0(1, "load_count");
    }

    public static List LJI(List list) {
        ArrayList arrayList = new ArrayList();
        if (CommerceMediaServiceImpl.LIZJ().LJIIIZ() && list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Music music = (Music) it.next();
                if (music.isCommercialMusic()) {
                    arrayList.add(music);
                }
            }
            return arrayList;
        }
        return list;
    }

    public final void LJIIIIZZ(List<MusicModel> list) {
        int LIZ;
        C84917XUj c84917XUj = this.LJ;
        if (c84917XUj != null) {
            ((C84868XSm) c84917XUj.LJ.getValue()).release();
        }
        int LIZ2 = C00F.LIZ(31744, 0, "studio_choose_music_page_preload_collect_music_count", true);
        if (LIZ2 <= 0) {
            return;
        }
        this.LJIIIZ = ((Boolean) this.LIZIZ.get("show_recommended_music_section", Boolean.TRUE)).booleanValue();
        if (C56464MEa.LIZ() && this.LJIIIZ && (LIZ = C52284KfY.LIZ()) < LIZ2) {
            LIZ2 = LIZ;
        }
        C84917XUj c84917XUj2 = new C84917XUj(LIZ2, this.LIZJ, list);
        this.LJ = c84917XUj2;
        if (c84917XUj2.LIZ.isEmpty()) {
            return;
        }
        c84917XUj2.LIZ();
    }

    public final void LJIIJ(int i) {
        if (this.LJIILL) {
            return;
        }
        this.LJIILL = true;
        ChooseMusicApi.LIZ(0, "", false, XVF.LJ, 20, 0L, i).LJ(new AgS131S0100000_15(this, 16), C10K.LJIIIIZZ, null);
    }

    public final void LJIIJJI(int i) {
        boolean booleanValue = ((Boolean) this.LIZIZ.get("more_tab_has_fetched", Boolean.FALSE)).booleanValue();
        int intValue = ((Integer) this.LIZIZ.get("more_tab_refresh_status", -1)).intValue();
        if (!booleanValue && intValue != 2) {
            this.LIZIZ.jv0(2, "more_tab_refresh_status");
            this.LIZIZ.jv0(2, "more_tab_music_sheet_refresh_status");
            C10K<MusicCollection> LIZIZ = ChooseMusicApi.LIZIZ(0, 12, i, 100);
            AgS86S0101000_3 agS86S0101000_3 = new AgS86S0101000_3(0, this, 1);
            C10C c10c = C10K.LJIIIIZZ;
            LIZIZ.LJ(agS86S0101000_3, c10c, null);
            this.LIZIZ.jv0(2, "more_tab_collection_feed_refresh_status");
            ChooseMusicApi.LIZLLL(0, 10, i).LJ(new AgS115S0200000_15(this, C44428Hc8.LIZ(), 4), c10c, null);
        }
    }

    public XVW(Context context, DataCenter dataCenter) {
        this.LIZIZ = dataCenter;
        this.LIZJ = context;
    }

    public static C10K LJIIIZ(C10K c10k, Music music) {
        if (music == null) {
            return c10k;
        }
        return c10k.LJ(new AgS131S0100000_15(music, 15), C10K.LJI, null);
    }

    public static void LIZLLL(Challenge challenge, List list, MusicPickResponse musicPickResponse) {
        List<Music> connectMusics = challenge.getConnectMusics();
        if (!connectMusics.isEmpty()) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(new C84934XVa(904, null, null, new C69590RSw(null, null, challenge)));
            ArrayList arrayList2 = (ArrayList) C44426Hc6.LIZIZ(connectMusics, musicPickResponse.extra);
            Iterator it = arrayList2.iterator();
            int i = 0;
            while (it.hasNext()) {
                MusicModel musicModel = (MusicModel) it.next();
                musicModel.setEventPosition(i);
                musicModel.setIsPropOrChallenge(true);
                i++;
            }
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new C84934XVa(905, (MusicModel) it2.next(), 12));
            }
            arrayList.addAll(arrayList3);
        }
    }

    public final void LJFF(List<MusicModel> list, FavoriteRecommendedMusicResponse favoriteRecommendedMusicResponse, CollectedMusicList collectedMusicList) {
        XRT xrt = new XRT();
        List<MusicModel> LIZIZ = C44426Hc6.LIZIZ(favoriteRecommendedMusicResponse.items, favoriteRecommendedMusicResponse.extra);
        if (this.LJIIIZ && list != null && list.size() > 0 && LIZIZ != null) {
            ArrayList arrayList = (ArrayList) LIZIZ;
            if (arrayList.size() > 0) {
                MusicModel musicModel = new MusicModel();
                musicModel.setMusicItemType(MusicModel.MusicItemType.MUSIC_SECTION_TITLE);
                list.add(musicModel);
                for (int i = 0; i < arrayList.size(); i++) {
                    MusicModel musicModel2 = (MusicModel) ListProtector.get(LIZIZ, i);
                    musicModel2.setMusicItemType(MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC);
                    musicModel2.setEventPosition(i);
                }
                list.addAll(LIZIZ);
                xrt.LIZ.put("refresh_status_user_collected_music", 0);
                xrt.LIZ.put("list_cursor", Integer.valueOf(favoriteRecommendedMusicResponse.cursor));
                xrt.LIZ.put("list_hasmore", 0);
                xrt.LIZIZ("action_type", 1);
                V16.LJJJLZIJ(xrt, list);
                this.LIZIZ.jv0(xrt, "user_collected_music_list");
            }
        }
        xrt.LIZ.put("refresh_status_user_collected_music", 0);
        xrt.LIZ.put("list_cursor", Integer.valueOf(collectedMusicList.cursor));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(collectedMusicList.hasMore));
        xrt.LIZIZ("action_type", 1);
        V16.LJJJLZIJ(xrt, list);
        this.LIZIZ.jv0(xrt, "user_collected_music_list");
    }

    public final void LJII(int i, int i2, int i3) {
        String str;
        if (this.LJIILJJIL) {
            return;
        }
        this.LJIILJJIL = true;
        if (C56464MEa.LIZ()) {
            str = "pa_sound_page";
        } else {
            str = "";
        }
        ChooseMusicApi.LJI(i, i2, str, i3).LJ(new AgS131S0100000_15(this, 12), C10K.LJIIIIZZ, null);
    }

    public final void LJIILIIL(int i, int i2, final boolean z) {
        String str;
        if (this.LJIILJJIL) {
            return;
        }
        this.LJIILJJIL = true;
        final C44428Hc8 LIZ = C44428Hc8.LIZ();
        this.LIZIZ.jv0(Boolean.FALSE, "HAS_EXPAND_COLLECTED_MUSIC");
        this.LJIIIZ = ((Boolean) this.LIZIZ.get("show_recommended_music_section", Boolean.TRUE)).booleanValue();
        if (C56464MEa.LIZ()) {
            str = "pa_sound_page";
        } else {
            str = "";
        }
        ChooseMusicApi.LJI(0, i, str, i2).LJ(new C10I() { // from class: X.XVX
            @Override // X.C10I
            public final Object then(C10K c10k) {
                int i3;
                List<? extends Music> list;
                XVW xvw = XVW.this;
                C44428Hc8 c44428Hc8 = LIZ;
                boolean z2 = z;
                xvw.LJIILJJIL = false;
                long LIZIZ = c44428Hc8.LIZIZ(TimeUnit.MILLISECONDS);
                if (c10k.LJIILJJIL()) {
                    xvw.LIZIZ.jv0(1, "refresh_status_user_collected_music");
                    IAVMobService iAVMobService = xvw.LIZLLL;
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("api_type", "music_list");
                    c188727au.LJ(LIZIZ, "duration");
                    c188727au.LJIIIZ(WM7.SCENE_SERVICE, "favorite");
                    c188727au.LIZLLL(1, "status");
                    c188727au.LJIIIZ("error_domain", InterfaceC51052K1w.LIZ);
                    c188727au.LIZLLL(-1, "error_code");
                    c188727au.LIZLLL(0, "count");
                    iAVMobService.onEventV3("tool_performance_api", c188727au.LIZ);
                    return null;
                }
                if (!c10k.LJIILIIL()) {
                    return null;
                }
                CollectedMusicList collectedMusicList = (CollectedMusicList) c10k.LJIIJJI();
                IAVMobService iAVMobService2 = xvw.LIZLLL;
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("api_type", "music_list");
                c188727au2.LJ(LIZIZ, "duration");
                c188727au2.LJIIIZ(WM7.SCENE_SERVICE, "favorite");
                c188727au2.LIZLLL(0, "status");
                List<Music> list2 = collectedMusicList.items;
                if (list2 != null) {
                    i3 = list2.size();
                } else {
                    i3 = 0;
                }
                c188727au2.LIZLLL(i3, "count");
                iAVMobService2.onEventV3("tool_performance_api", c188727au2.LIZ);
                XRT xrt = new XRT();
                List<MusicModel> LIZIZ2 = C44426Hc6.LIZIZ(collectedMusicList.items, collectedMusicList.extra);
                if (C56464MEa.LIZ()) {
                    xvw.LIZIZ.jv0(collectedMusicList, "cached_collected_music_response");
                    xvw.LJI = collectedMusicList;
                    FavoriteRecommendedMusicResponse favoriteRecommendedMusicResponse = (FavoriteRecommendedMusicResponse) xvw.LIZIZ.get("cached_recommended_music_response", null);
                    xvw.LJIIIIZZ = favoriteRecommendedMusicResponse;
                    if (favoriteRecommendedMusicResponse != null) {
                        int LIZ2 = C52284KfY.LIZ();
                        if (LIZIZ2 != null && ((ArrayList) LIZIZ2).size() > LIZ2 && xvw.LJIIIZ && (list = xvw.LJIIIIZZ.items) != null && !list.isEmpty()) {
                            LIZIZ2 = ((ArrayList) LIZIZ2).subList(0, LIZ2);
                            MusicModel musicModel = new MusicModel();
                            musicModel.setMusicItemType(MusicModel.MusicItemType.SEE_MORE_BUTTON);
                            LIZIZ2.add(musicModel);
                        }
                        if (z2) {
                            xvw.LJIIIIZZ(LIZIZ2);
                        }
                        xvw.LJFF(LIZIZ2, xvw.LJIIIIZZ, collectedMusicList);
                        return null;
                    }
                    if (!xvw.LJIIJJI) {
                        if (z2) {
                            xvw.LJIIIIZZ(LIZIZ2);
                        }
                        xvw.LJIIL();
                        return null;
                    }
                }
                xrt.LIZ.put("refresh_status_user_collected_music", 0);
                xrt.LIZ.put("list_cursor", Integer.valueOf(collectedMusicList.cursor));
                xrt.LIZ.put("list_hasmore", Integer.valueOf(collectedMusicList.hasMore));
                xrt.LIZIZ("action_type", 1);
                V16.LJJJLZIJ(xrt, LIZIZ2);
                if (z2) {
                    xvw.LJIIIIZZ(LIZIZ2);
                }
                xvw.LIZIZ.jv0(xrt, "user_collected_music_list");
                return null;
            }
        }, C10K.LJIIIIZZ, null);
    }

    public final void LIZ(final MusicModel musicModel, final String str, final int i, final int i2, final int i3) {
        this.LIZ.collectMusic(str, i).LJ(new C10I() { // from class: X.XWh
            @Override // X.C10I
            public final Object then(C10K c10k) {
                boolean z;
                MusicModel.CollectionType collectionType;
                MusicModel.CollectionType collectionType2;
                XVW xvw = XVW.this;
                MusicModel musicModel2 = musicModel;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                String str2 = str;
                xvw.getClass();
                if (c10k.LJIIL()) {
                    return null;
                }
                boolean z2 = true;
                if (c10k.LJIILJJIL()) {
                    if (i4 == 1) {
                        collectionType2 = MusicModel.CollectionType.NOT_COLLECTED;
                    } else {
                        collectionType2 = MusicModel.CollectionType.COLLECTED;
                    }
                    musicModel2.setCollectionType(collectionType2);
                    xvw.LIZIZ.jv0(new XYC(1, i4, i5, i6, musicModel2), "music_collect_status");
                    return null;
                }
                if (!c10k.LJIILIIL()) {
                    return null;
                }
                if (i4 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                C2U8.LIZ(new XYB(musicModel2, z));
                if (i4 == 1) {
                    collectionType = MusicModel.CollectionType.COLLECTED;
                } else {
                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                }
                musicModel2.setCollectionType(collectionType);
                InterfaceC84903XTv LJJJIL = MusicService.LJJLIIIJJI().LJJJIL();
                if (LJJJIL != null) {
                    if (i4 != 1) {
                        z2 = false;
                    }
                    LJJJIL.LIZ(str2, z2);
                }
                xvw.LIZIZ.jv0(new XYC(0, i4, i5, i6, musicModel2), "music_collect_status");
                return null;
            }
        }, C10K.LJIIIIZZ, null);
    }

    public final void LIZIZ(C10K c10k, Music music, String str, boolean z, boolean z2) {
        C10I c10i;
        AgS22S0100100_15 agS22S0100100_15;
        if (C59859NeR.LIZ()) {
            AgS2S1220000_15 agS2S1220000_15 = new AgS2S1220000_15(this, music, str, z, z2, 1);
            C74216TAu c74216TAu = C74216TAu.LIZIZ;
            if (c74216TAu.LIZIZ() && c74216TAu.LIZLLL() > 0) {
                agS22S0100100_15 = new AgS22S0100100_15(this, System.currentTimeMillis(), 0);
            } else {
                agS22S0100100_15 = null;
            }
            if (music == null && Looper.myLooper() == C16880lQ.LLJJJJ()) {
                if (agS22S0100100_15 != null) {
                    c10k.LJI(agS22S0100100_15, C10K.LJI, null).LJ(agS2S1220000_15, C10K.LJIIIIZZ, null);
                    return;
                } else {
                    c10k.LIZLLL(agS2S1220000_15);
                    return;
                }
            }
            if (agS22S0100100_15 != null) {
                LJIIIZ(c10k, music).LJI(agS22S0100100_15, C10K.LJI, null).LJ(agS2S1220000_15, C10K.LJIIIIZZ, null);
                return;
            } else {
                LJIIIZ(c10k, music).LJ(agS2S1220000_15, C10K.LJIIIIZZ, null);
                return;
            }
        }
        AgS2S1220000_15 agS2S1220000_152 = new AgS2S1220000_15(this, music, str, z, z2, 2);
        C74216TAu c74216TAu2 = C74216TAu.LIZIZ;
        if (c74216TAu2.LIZIZ() && c74216TAu2.LIZLLL() > 0) {
            final long currentTimeMillis = System.currentTimeMillis();
            c10i = new C10I() { // from class: X.FW0
                @Override // X.C10I
                public final Object then(C10K c10k2) {
                    long j = currentTimeMillis;
                    if (c10k2.LJIILJJIL()) {
                        long LIZLLL = C74216TAu.LIZIZ.LIZLLL() - (System.currentTimeMillis() - j);
                        if (LIZLLL > 0) {
                            C10K.LJII(LIZLLL).LJIJI();
                        }
                    }
                    return c10k2;
                }
            };
        } else {
            c10i = null;
        }
        if (music == null && Looper.myLooper() == C16880lQ.LLJJJJ()) {
            if (c10i != null) {
                c10k.LJI(c10i, C10K.LJI, null).LJ(agS2S1220000_152, C10K.LJIIIIZZ, null);
                return;
            } else {
                c10k.LIZLLL(agS2S1220000_152);
                return;
            }
        }
        if (c10i != null) {
            LJIIIZ(c10k, music).LJI(c10i, C10K.LJI, null).LJ(agS2S1220000_152, C10K.LJIIIIZZ, null);
        } else {
            LJIIIZ(c10k, music).LJ(agS2S1220000_152, C10K.LJIIIIZZ, null);
        }
    }

    public final void LIZJ(final boolean z, final String str, final Music music, boolean z2, int i) {
        Integer num;
        int i2;
        OSZ osz;
        Integer num2 = (Integer) this.LIZIZ.get("radio_cursor", 0);
        String LIZ = C84892XTk.LIZ();
        String str2 = null;
        if (C59859NeR.LIZ()) {
            num = 24;
        } else {
            num = null;
        }
        if (num2.intValue() != 0 || !C43985HOb.LIZ() || CommerceMediaServiceImpl.LIZJ().LJIILIIL() || (!CommerceMediaServiceImpl.LIZJ().LJIIZILJ() && CommerceMediaServiceImpl.LIZJ().LIZIZ())) {
            if (C84887XTf.LIZ()) {
                str2 = C72834SiE.LIZ().getString("music_pick_discover", "");
                o.LJIIIIZZ(str2, "keva.getString(key, default)");
            }
            if (e1.LIZ(31744, "studio_enable_cache_music_select_page_data", true, false) && !ChooseMusicApi.LIZJ()) {
                int intValue = num2.intValue();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("music/pick ");
                LIZ2.append(intValue);
                LIZ2.append(' ');
                LIZ2.append(num);
                LIZ2.append(' ');
                if (str != null) {
                    i2 = str.hashCode();
                } else {
                    i2 = 0;
                }
                LIZ2.append(i2);
                LIZ2.append(' ');
                LIZ2.append(i);
                LIZ2.append(' ');
                LIZ2.append(LIZ.hashCode());
                String LIZIZ = X1D.LIZIZ(LIZ2);
                if (!z2) {
                    Object LIZ3 = C84889XTh.LIZ(C52206KeI.LIZ(), LIZIZ);
                    if (LIZ3 instanceof MusicPickResponse) {
                        C73812v3.LIZ(1, "music_pick");
                        osz = new OSZ(C10K.LJIIIZ(LIZ3), Boolean.TRUE);
                        LIZIZ((C10K) osz.getFirst(), music, str, z, !((Boolean) osz.getSecond()).booleanValue());
                        return;
                    }
                    C73812v3.LIZ(0, "music_pick");
                }
                osz = new OSZ(ChooseMusicApi.LJFF(Integer.valueOf(intValue), num, str, z2, i, LIZ, str2).LJFF(new AgS24S1000000_15(LIZIZ, 1)), Boolean.FALSE);
                LIZIZ((C10K) osz.getFirst(), music, str, z, !((Boolean) osz.getSecond()).booleanValue());
                return;
            }
            LIZIZ(ChooseMusicApi.LJFF(num2, num, str, z2, i, LIZ, str2), music, str, z, false);
            return;
        }
        ((TPS) TPS.LJLJJI.getValue()).LLLLZ(new C37619Epb(num2.intValue(), i, num, str, z2), TPV.LIZ).LJJJLIIL(new InterfaceC64592gB() { // from class: X.FWG
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                XVW xvw = XVW.this;
                String str3 = str;
                boolean z3 = z;
                Music music2 = music;
                xvw.getClass();
                Objects.requireNonNull(obj);
                xvw.LIZIZ(C10K.LIZ(new ACallableS78S0101000_6(1, obj, 0)), music2, str3, z3, false);
            }
        }, new AfS36S0101000_5(1, this, 1));
    }

    public final void LJ(List<Music> list, List<C84934XVa> list2, MusicPickResponse musicPickResponse, boolean z, boolean z2) {
        int i;
        if (!list.isEmpty()) {
            if (((Boolean) this.LIZIZ.get("is_photo_mv_type")).booleanValue()) {
                i = R.string.pux;
            } else if (((Boolean) this.LIZIZ.get("mvtheme_music_type")).booleanValue()) {
                i = R.string.pun;
            } else if (z) {
                i = R.string.jdl;
            } else {
                i = R.string.rg6;
            }
            ArrayList arrayList = (ArrayList) list2;
            arrayList.add(new C84934XVa(902, null, null, new C69590RSw(Integer.valueOf(i), (UrlModel) this.LIZIZ.get("effect_icon_url"), null)));
            ArrayList arrayList2 = (ArrayList) C44426Hc6.LIZIZ(list, musicPickResponse.extra);
            Iterator it = arrayList2.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                MusicModel musicModel = (MusicModel) it.next();
                musicModel.setEventPosition(i2);
                musicModel.setIsPropOrChallenge(true);
                i2++;
            }
            if (z2) {
                int LIZ = C00F.LIZ(31744, 2, "left_effect_music_count_in_music_pick", true);
                if (list.size() <= LIZ) {
                    arrayList.addAll(V16.LJJLIIIJLLLLLLLZ(arrayList2));
                    return;
                } else {
                    arrayList.addAll(V16.LJJLIIIJLLLLLLLZ(arrayList2.subList(0, LIZ)));
                    return;
                }
            }
            arrayList.addAll(V16.LJJLIIIJLLLLLLLZ(arrayList2));
            return;
        }
        this.LIZIZ.jv0(Boolean.FALSE, "is_busi_sticker");
    }
}
