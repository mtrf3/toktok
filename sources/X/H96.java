package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H96 extends C9U4 {
    public List<? extends MusicModel> LIZJ;
    public boolean LIZLLL;

    public H96() {
        super(0);
    }

    public final boolean LJIIJ() {
        if (this.LIZLLL || CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // X.C9U4
    public final Object LIZLLL(String key) {
        ArrayList arrayList;
        o.LJIIIZ(key, "key");
        Boolean bool = null;
        switch (key.hashCode()) {
            case -1695837426:
                if (key.equals("banner_id")) {
                    if (!LJIIJ()) {
                        return null;
                    }
                    H92.LJLIL.getClass();
                    return H92.LJLJJLL.LIZ(H92.LJLILLLLZI[3]);
                }
                throw new C9U1(key);
            case -1087240833:
                if (key.equals("is_commercial")) {
                    return Integer.valueOf(LJIIJ() ? 1 : 0);
                }
                throw new C9U1(key);
            case -995502843:
                if (key.equals("is_promote_pa")) {
                    H92.LJLIL.getClass();
                    return Integer.valueOf(((Boolean) H92.LJLLL.LIZ(H92.LJLILLLLZI[10])).booleanValue() ? 1 : 0);
                }
                throw new C9U1(key);
            case -626204936:
                if (key.equals("commercial_banner_type")) {
                    if (!LJIIJ()) {
                        return null;
                    }
                    return H92.LIZIZ();
                }
                throw new C9U1(key);
            case -138948533:
                if (key.equals("meta_song_id")) {
                    Object obj = LJ().get(MusicModel.class);
                    if (obj != null) {
                        return ((MusicModel) obj).getMatchedSongInfo().getId();
                    }
                    throw new C9U2(MusicModel.class);
                }
                throw new C9U1(key);
            case 3433103:
                if (key.equals("page")) {
                    H92 h92 = H92.LJLIL;
                    h92.getClass();
                    if (H92.LIZJ() instanceof H99) {
                        return "search";
                    }
                    if (H92.LIZLLL()) {
                        return "UID recommendation playlist";
                    }
                    if (H92.LIZJ() instanceof H98) {
                        return "music aggregation page";
                    }
                    H97 LIZJ = H92.LIZJ();
                    if (LIZJ instanceof H94) {
                        bool = Boolean.valueOf(((H94) LIZJ).LIZ);
                    }
                    if (bool != null && bool.booleanValue()) {
                        return "vertical playlist";
                    }
                    H97 LIZJ2 = H92.LIZJ();
                    if (LIZJ2 != null && (LIZJ2 instanceof H95) && h92.getInCommercialSoundPage()) {
                        return "CSP";
                    }
                    return "others";
                }
                throw new C9U1(key);
            case 280942408:
                if (key.equals("action_originated_from")) {
                    return H92.LIZ();
                }
                throw new C9U1(key);
            case 324669229:
                if (key.equals("commercial_music_category_id")) {
                    if (!LJIIJ()) {
                        return null;
                    }
                    H92.LJLIL.getClass();
                    return H92.LJLJLLL.LIZ(H92.LJLILLLLZI[6]);
                }
                throw new C9U1(key);
            case 718205887:
                if (key.equals("rec_candidate_clip_id")) {
                    List<? extends MusicModel> list = this.LIZJ;
                    if (list != null) {
                        arrayList = new ArrayList(C32I.LJJL(list, 10));
                        Iterator<? extends MusicModel> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Long.valueOf(it.next().getId()));
                        }
                    } else {
                        Object obj2 = LJ().get(MusicDetail.class);
                        if (obj2 != null) {
                            List<Music> list2 = ((MusicDetail) obj2).recommendMusicList;
                            if (list2 == null) {
                                return null;
                            }
                            arrayList = new ArrayList(C32I.LJJL(list2, 10));
                            Iterator<Music> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Long.valueOf(it2.next().getId()));
                            }
                        } else {
                            throw new C9U2(MusicDetail.class);
                        }
                    }
                    return ORZ.LLD(arrayList, ",", null, null, null, 62);
                }
                throw new C9U1(key);
            case 860900458:
                if (key.equals("clip_id")) {
                    Object obj3 = LJ().get(MusicModel.class);
                    if (obj3 != null) {
                        return Long.valueOf(((MusicModel) obj3).getId());
                    }
                    throw new C9U2(MusicModel.class);
                }
                throw new C9U1(key);
            case 1182307367:
                if (key.equals("commercial_music_suggestion_id")) {
                    if (!LJIIJ()) {
                        return null;
                    }
                    H92.LJLIL.getClass();
                    return H92.LJLJLJ.LIZ(H92.LJLILLLLZI[5]);
                }
                throw new C9U1(key);
            case 1886538192:
                if (key.equals("commercial_music_playlist_order")) {
                    if (!LJIIJ()) {
                        return null;
                    }
                    H92.LJLIL.getClass();
                    return H92.LJLLI.LIZ(H92.LJLILLLLZI[8]);
                }
                throw new C9U1(key);
            default:
                throw new C9U1(key);
        }
    }

    public final void LJIIJJI(long j) {
        H92 h92 = H92.LJLIL;
        h92.getClass();
        if ((H92.LIZJ() instanceof H98) || h92.getInCommercialSoundPage()) {
            LJI("commercial_music_play_load_time", new OSZ<>("page", H9A.LIZ), new OSZ<>("commercial_music_load_time", Long.valueOf(j)));
        }
    }
}
