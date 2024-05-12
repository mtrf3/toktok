package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.MusicInfoAndEffectUseCount;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.SimpleMusic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HNQ {
    public static final HNQ LJIIIIZZ = new HNQ(null, null);
    public static final int LJIIIZ = 50;
    public final RecommendMusic LIZ;
    public final List<SimpleMusic> LIZIZ;
    public List<? extends MusicModel> LIZJ;
    public List<? extends MusicModel> LIZLLL;
    public OSZ<? extends MusicModel, Long> LJ;
    public OSZ<? extends MusicModel, Long> LJFF;
    public OSZ<? extends MusicModel, Long> LJI;
    public OSZ<? extends MusicModel, Long> LJII;

    public final void LIZIZ() {
        boolean z;
        List<MusicInfoAndEffectUseCount> musicList;
        OSZ<? extends MusicModel, Long> osz;
        Object LJLLLL;
        Object LJLLLL2;
        int duration;
        int duration2;
        MusicModel musicModel;
        int duration3;
        OSZ<? extends MusicModel, Long> osz2 = null;
        Object obj = null;
        osz2 = null;
        this.LJI = null;
        this.LJII = null;
        this.LJ = null;
        this.LJFF = null;
        List<SimpleMusic> list = this.LIZIZ;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            List<SimpleMusic> list2 = this.LIZIZ;
            Music musicModel2 = ((SimpleMusic) ORZ.LJLLJ(list2)).getMusicModel();
            if (musicModel2 != null) {
                musicModel = musicModel2.convertToMusicModel();
            } else {
                musicModel = null;
            }
            this.LJI = new OSZ<>(musicModel, 0L);
            Iterator<SimpleMusic> it = list2.iterator();
            while (it.hasNext()) {
                Music musicModel3 = it.next().getMusicModel();
                if (musicModel3 != null) {
                    if (musicModel3.getShootDuration() > 0) {
                        duration3 = musicModel3.getShootDuration();
                    } else {
                        duration3 = musicModel3.getDuration();
                    }
                    if (duration3 > 180) {
                        this.LJII = new OSZ<>(musicModel3.convertToMusicModel(), 0L);
                    }
                }
            }
        }
        RecommendMusic recommendMusic = this.LIZ;
        if (recommendMusic != null) {
            int LIZ = C00F.LIZ(31744, 0, "effect_recommend_music_algo_opt", true);
            if (LIZ == 1 || LIZ == 2) {
                List<MusicInfoAndEffectUseCount> musicList2 = recommendMusic.getMusicList();
                if (musicList2 != null && !musicList2.isEmpty() && (musicList = recommendMusic.getMusicList()) != null) {
                    ArrayList arrayList = new ArrayList(C32I.LJJL(musicList, 10));
                    Iterator<MusicInfoAndEffectUseCount> it2 = musicList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getMusicInfo().convertToMusicModel());
                    }
                    this.LIZJ = arrayList;
                    ArrayList arrayList2 = new ArrayList();
                    for (MusicInfoAndEffectUseCount musicInfoAndEffectUseCount : musicList) {
                        MusicInfoAndEffectUseCount musicInfoAndEffectUseCount2 = musicInfoAndEffectUseCount;
                        if (musicInfoAndEffectUseCount2.getMusicInfo().getShootDuration() > 0) {
                            duration = musicInfoAndEffectUseCount2.getMusicInfo().getShootDuration();
                        } else {
                            duration = musicInfoAndEffectUseCount2.getMusicInfo().getDuration();
                        }
                        if (duration >= 180) {
                            arrayList2.add(musicInfoAndEffectUseCount);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((MusicInfoAndEffectUseCount) it3.next()).getMusicInfo().convertToMusicModel());
                    }
                    this.LIZLLL = arrayList3;
                    List<? extends MusicModel> list3 = this.LIZJ;
                    if (list3 != null && (LJLLLL2 = ORZ.LJLLLL(list3)) != null) {
                        osz = new OSZ<>(LJLLLL2, 0L);
                    } else {
                        osz = null;
                    }
                    this.LJ = osz;
                    List<? extends MusicModel> list4 = this.LIZLLL;
                    if (list4 != null && (LJLLLL = ORZ.LJLLLL(list4)) != null) {
                        osz2 = new OSZ<>(LJLLLL, 0L);
                    }
                    this.LJFF = osz2;
                }
            } else {
                List<MusicInfoAndEffectUseCount> musicList3 = recommendMusic.getMusicList();
                if (musicList3 != null && !musicList3.isEmpty()) {
                    List<MusicInfoAndEffectUseCount> musicList4 = recommendMusic.getMusicList();
                    o.LJI(musicList4);
                    ArrayList arrayList4 = new ArrayList();
                    for (MusicInfoAndEffectUseCount musicInfoAndEffectUseCount3 : musicList4) {
                        if (musicInfoAndEffectUseCount3.getUseCount() >= LJIIIZ) {
                            arrayList4.add(musicInfoAndEffectUseCount3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ORZ.LLILZLL(arrayList4, arrayList5);
                    MusicInfoAndEffectUseCount musicInfoAndEffectUseCount4 = (MusicInfoAndEffectUseCount) ListProtector.get(arrayList5, V0Q.Default.nextInt(arrayList5.size()));
                    this.LJ = new OSZ<>(musicInfoAndEffectUseCount4.getMusicInfo().convertToMusicModel(), Long.valueOf(musicInfoAndEffectUseCount4.getUseCount()));
                    Iterator it4 = arrayList5.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next = it4.next();
                        MusicInfoAndEffectUseCount musicInfoAndEffectUseCount5 = (MusicInfoAndEffectUseCount) next;
                        if (musicInfoAndEffectUseCount5.getMusicInfo().getShootDuration() > 0) {
                            duration2 = musicInfoAndEffectUseCount5.getMusicInfo().getShootDuration();
                        } else {
                            duration2 = musicInfoAndEffectUseCount5.getMusicInfo().getDuration();
                        }
                        if (duration2 >= 180) {
                            obj = next;
                            break;
                        }
                    }
                    MusicInfoAndEffectUseCount musicInfoAndEffectUseCount6 = (MusicInfoAndEffectUseCount) obj;
                    if (musicInfoAndEffectUseCount6 != null) {
                        this.LJFF = new OSZ<>(musicInfoAndEffectUseCount6.getMusicInfo().convertToMusicModel(), Long.valueOf(musicInfoAndEffectUseCount6.getUseCount()));
                    }
                }
            }
        }
        if (this.LJI == null) {
            this.LJI = this.LJ;
        }
        if (this.LJII == null) {
            this.LJII = this.LJFF;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HNQ)) {
            return false;
        }
        HNQ hnq = (HNQ) obj;
        return o.LJ(this.LIZ, hnq.LIZ) && o.LJ(this.LIZIZ, hnq.LIZIZ);
    }

    public final int hashCode() {
        RecommendMusic recommendMusic = this.LIZ;
        int hashCode = (recommendMusic == null ? 0 : recommendMusic.hashCode()) * 31;
        List<SimpleMusic> list = this.LIZIZ;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendMusicData(recommendMusic=");
        LIZ.append(this.LIZ);
        LIZ.append(", softBindMusic=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public final MusicModel LIZ(boolean z) {
        if (z) {
            OSZ<? extends MusicModel, Long> osz = this.LJFF;
            if (osz == null) {
                return null;
            }
            return osz.getFirst();
        }
        OSZ<? extends MusicModel, Long> osz2 = this.LJ;
        if (osz2 == null) {
            return null;
        }
        return osz2.getFirst();
    }

    public HNQ(RecommendMusic recommendMusic, List<SimpleMusic> list) {
        this.LIZ = recommendMusic;
        this.LIZIZ = list;
        LIZIZ();
    }
}
