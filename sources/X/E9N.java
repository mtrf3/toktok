package X;

import Y.IDuS77S0200000_6;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.services.apm.api.IEnsure;
import com.google.gson.s;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.recent.apis.RecentMusicNetworkAPI;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E9N implements InterfaceC82349WTp {
    public static final E9N LJLIL = new E9N();
    public static final E9K LJLILLLLZI = new E9K();
    public static final java.util.Map<String, MusicModel> LJLJI = new LinkedHashMap();
    public static E9O LJLJJI;
    public static final RecentMusicNetworkAPI LJLJJL;
    public static String LJLJJLL;
    public static final java.util.Set<String> LJLJL;

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append("api-va.tiktokv.com");
        LJLJJL = (RecentMusicNetworkAPI) C46104I7o.LJIIZILJ(X1D.LIZIZ(LIZ), RecentMusicNetworkAPI.class);
        LJLJJLL = "";
        LJLJL = C77275UUl.LJIIIIZZ("profile_photo", "slideshow_rec", "sync_page_recommend", "auto_cut_music_recommend", "mv_default");
    }

    @Override // X.XZQ
    public boolean Kt() {
        List<E9M> LIZ = LJLILLLLZI.LIZ();
        if ((LIZ instanceof Collection) && LIZ.isEmpty()) {
            return false;
        }
        Iterator<E9M> it = LIZ.iterator();
        while (it.hasNext()) {
            if (!LJLJI.containsKey(it.next().LJLIL)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.XZQ
    public AbstractC73672Svk<List<MusicModel>> dm() {
        List LLIILII = ORZ.LLIILII(LJLILLLLZI.LIZ());
        ArrayList arrayList = new ArrayList();
        for (Object obj : LLIILII) {
            if (!LJLJI.containsKey(((E9M) obj).LJLIL)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((E9M) it.next()).LJLIL);
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = LLIILII.iterator();
            while (it2.hasNext()) {
                MusicModel musicModel = LJLJI.get(((E9M) it2.next()).LJLIL);
                if (musicModel != null) {
                    arrayList3.add(musicModel);
                }
            }
            return AbstractC73672Svk.LJJIJIL(arrayList3);
        }
        return AbstractC73672Svk.LJIIJ(new IDuS77S0200000_6(LLIILII, arrayList2, 2));
    }

    private final boolean LIZIZ(String str) {
        return LJLJL.contains(str);
    }

    public final void LIZJ(String userId) {
        List<E9M> musicList;
        boolean z;
        o.LJIIIZ(userId, "userId");
        if (!o.LJ(userId, LJLJJLL)) {
            LJLJJLL = userId;
            E9O e9o = new E9O(LJLJJLL);
            LJLJJI = e9o;
            E9K e9k = LJLILLLLZI;
            try {
                Object fromJson = GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), ((Keva) e9o.LIZIZ.getValue()).getString("recent_music_objects", "[]"), new E9J().getType());
                o.LJIIIIZZ(fromJson, "{\n            GsonProvid…E, \"[]\"), type)\n        }");
                musicList = (List) fromJson;
            } catch (s unused) {
                musicList = C61878OQg.INSTANCE;
            }
            e9k.getClass();
            o.LJIIIZ(musicList, "musicList");
            e9k.LIZ.clear();
            e9k.LIZIZ.clear();
            int i = 0;
            for (E9M e9m : musicList) {
                e9k.LIZ.put(e9m.LJLIL, e9m);
                if (e9m.LJLILLLLZI) {
                    if (i < 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    IEnsure iEnsure = C78983UzD.LJLLLL;
                    if (iEnsure != null) {
                        iEnsure.ensureTrue(z, "[RecentMusicLruCache] There are more than 2 auto selected music in list");
                    }
                    e9k.LIZIZ.add(e9m.LJLIL);
                    i++;
                }
            }
        }
    }

    @Override // X.XZQ
    public void U20(String musicId) {
        String str;
        RBY LJFF;
        o.LJIIIZ(musicId, "musicId");
        if (LJLJJI == null) {
            IAccountService LJIJ = AccountService.LJIJ();
            if (LJIJ == null || (LJFF = LJIJ.LJFF()) == null || (str = LJFF.getCurUserId()) == null) {
                str = "";
            }
            LIZJ(str);
        }
        E9K e9k = LJLILLLLZI;
        e9k.getClass();
        e9k.LIZIZ.remove(musicId);
        e9k.LIZ.remove(musicId);
        E9O e9o = LJLJJI;
        if (e9o != null) {
            List<E9M> lruCacheMusicModelList = e9k.LIZ();
            o.LJIIIZ(lruCacheMusicModelList, "lruCacheMusicModelList");
            ((Keva) e9o.LIZIZ.getValue()).storeString("recent_music_objects", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), lruCacheMusicModelList));
            return;
        }
        o.LJIJI("recentMusicKevaDAO");
        throw null;
    }

    @Override // X.XZQ
    public String pp(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        E9K e9k = LJLILLLLZI;
        e9k.getClass();
        E9M e9m = e9k.LIZ.get(musicId);
        if (e9m != null) {
            return e9m.LJLJI;
        }
        return null;
    }

    @Override // X.C5L0
    public void Lp(MusicModel music, String selectedFrom) {
        boolean z;
        String str;
        String str2;
        RBY LJFF;
        o.LJIIIZ(music, "music");
        o.LJIIIZ(selectedFrom, "selectedFrom");
        String str3 = "";
        if (LJLJJI == null) {
            IAccountService LJIJ = AccountService.LJIJ();
            if (LJIJ == null || (LJFF = LJIJ.LJFF()) == null || (str2 = LJFF.getCurUserId()) == null) {
                str2 = "";
            }
            LIZJ(str2);
        }
        if (music.isLocalMusic()) {
            return;
        }
        if (o.LJ(selectedFrom, "edit_page_recent")) {
            E9K e9k = LJLILLLLZI;
            String musicId = music.getMusicId();
            o.LJIIIIZZ(musicId, "music.musicId");
            e9k.getClass();
            E9M e9m = e9k.LIZ.get(musicId);
            if (e9m != null && (str = e9m.LJLJI) != null) {
                str3 = str;
            }
        } else {
            str3 = selectedFrom;
        }
        E9K e9k2 = LJLILLLLZI;
        String musicId2 = music.getMusicId();
        o.LJIIIIZZ(musicId2, "music.musicId");
        E9M e9m2 = new E9M(musicId2, LIZIZ(selectedFrom), str3);
        e9k2.getClass();
        boolean z2 = e9m2.LJLILLLLZI;
        String musicId3 = e9m2.LJLIL;
        o.LJIIIZ(musicId3, "musicId");
        e9k2.LIZIZ.remove(musicId3);
        e9k2.LIZ.remove(musicId3);
        if (z2) {
            if (e9k2.LIZIZ.size() >= 2) {
                Object LJLLILLLL = ORZ.LJLLILLLL(e9k2.LIZIZ);
                e9k2.LIZIZ.remove(LJLLILLLL);
                if (e9k2.LIZ.remove(LJLLILLLL) != null) {
                    z = true;
                } else {
                    z = false;
                }
                IEnsure iEnsure = C78983UzD.LJLLLL;
                if (iEnsure != null) {
                    iEnsure.ensureTrue(z, "[RecentMusicLruCache]  Evicted auto-selected musicId not exit in main cache");
                }
            }
            e9k2.LIZIZ.add(e9m2.LJLIL);
        }
        if (e9k2.LIZ.size() >= 50) {
            LinkedHashMap<String, E9M> linkedHashMap = e9k2.LIZ;
            java.util.Set<String> keySet = linkedHashMap.keySet();
            o.LJIIIIZZ(keySet, "mainCache.keys");
            linkedHashMap.remove(ORZ.LJLLILLLL(keySet));
        }
        E9M put = e9k2.LIZ.put(e9m2.LJLIL, e9m2);
        if (put != null) {
            e9k2.LIZIZ.remove(put.LJLIL);
        }
        java.util.Map<String, MusicModel> map = LJLJI;
        String musicId4 = music.getMusicId();
        o.LJIIIIZZ(musicId4, "music.musicId");
        MusicModel m159clone = music.m159clone();
        m159clone.setMusicItemType(MusicModel.MusicItemType.ORIGIN);
        m159clone.setRecommendSourceFrom("other_music");
        map.put(musicId4, m159clone);
        E9O e9o = LJLJJI;
        if (e9o != null) {
            List<E9M> lruCacheMusicModelList = e9k2.LIZ();
            o.LJIIIZ(lruCacheMusicModelList, "lruCacheMusicModelList");
            ((Keva) e9o.LIZIZ.getValue()).storeString("recent_music_objects", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), lruCacheMusicModelList));
            return;
        }
        o.LJIJI("recentMusicKevaDAO");
        throw null;
    }

    @Override // X.XZQ
    public void bY(String musicId, boolean z) {
        MusicModel.CollectionType collectionType;
        o.LJIIIZ(musicId, "musicId");
        MusicModel musicModel = LJLJI.get(musicId);
        if (musicModel != null) {
            if (z) {
                collectionType = MusicModel.CollectionType.COLLECTED;
            } else {
                collectionType = MusicModel.CollectionType.NOT_COLLECTED;
            }
            musicModel.setCollectionType(collectionType);
        }
    }
}
