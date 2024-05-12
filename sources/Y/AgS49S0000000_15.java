package Y;

import X.C10I;
import X.C10K;
import X.C44426Hc6;
import X.KJK;
import X.X1D;
import android.util.ArrayMap;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.music.model.MusicRecallInfo;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.List;

/* loaded from: classes16.dex */
public class AgS49S0000000_15 implements C10I {
    public final int $t;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            default:
                return null;
        }
    }

    public AgS49S0000000_15(int i) {
        this.$t = i;
    }

    public static final Object then$0(AgS49S0000000_15 agS49S0000000_15, C10K c10k) {
        if (c10k.LJIIL() || c10k.LJIILJJIL() || c10k.LJIIJJI() == null) {
            return null;
        }
        SuggestMusicList suggestMusicList = new SuggestMusicList();
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        suggestMusicList.musicList = C44426Hc6.LIZIZ(musicList.items, musicList.extra);
        suggestMusicList.cursor = ((MusicList) c10k.LJIIJJI()).getCursor();
        suggestMusicList.hasMore = ((MusicList) c10k.LJIIJJI()).isHasMore();
        return suggestMusicList;
    }

    public static final Object then$1(AgS49S0000000_15 agS49S0000000_15, C10K c10k) {
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        if (musicList != null) {
            ArrayMap arrayMap = new ArrayMap();
            List<MusicRecallInfo> list = musicList.recallInfo;
            if (list != null) {
                for (MusicRecallInfo musicRecallInfo : list) {
                    if (musicRecallInfo != null && musicRecallInfo.recallReason != null) {
                        arrayMap.put(Long.valueOf(musicRecallInfo.id), musicRecallInfo.recallReason);
                    }
                }
            }
            List<Music> list2 = musicList.items;
            String str = "AI";
            if (musicList.mMusicType != 2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AI");
                LIZ.append(musicList.mMusicType);
                str = X1D.LIZIZ(LIZ);
            }
            KJK.LIZIZ(str, list2, arrayMap);
            KJK.LIZ("ai_music", musicList.items);
        }
        return musicList;
    }

    public static final Object then$2(AgS49S0000000_15 agS49S0000000_15, C10K c10k) {
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        if (musicList != null) {
            KJK.LIZIZ("Hot", musicList.items, null);
            KJK.LIZ("hot_music", musicList.items);
        }
        return musicList;
    }

    public static final Object then$3(AgS49S0000000_15 agS49S0000000_15, C10K c10k) {
        if (c10k.LJIIL() || c10k.LJIILJJIL() || c10k.LJIIJJI() == null) {
            return null;
        }
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        return C44426Hc6.LIZIZ(musicList.items, musicList.extra);
    }

    public static final Object then$4(AgS49S0000000_15 agS49S0000000_15, C10K c10k) {
        if (c10k.LJIIL() || c10k.LJIILJJIL() || c10k.LJIIJJI() == null) {
            return null;
        }
        SuggestMusicList suggestMusicList = new SuggestMusicList();
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        suggestMusicList.musicList = C44426Hc6.LIZIZ(musicList.items, musicList.extra);
        suggestMusicList.cursor = ((MusicList) c10k.LJIIJJI()).getCursor();
        suggestMusicList.hasMore = ((MusicList) c10k.LJIIJJI()).isHasMore();
        return suggestMusicList;
    }
}
