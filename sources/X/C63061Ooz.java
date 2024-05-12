package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ooz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63061Ooz {
    public static ArrayList LIZ(MusicDetail musicDetail) {
        List<ExternalMusicInfo> list;
        ArrayList arrayList = new ArrayList();
        Music music = musicDetail.music;
        if (music != null && music.getExternalMusicInfos() != null) {
            Music music2 = musicDetail.music;
            if (music2 != null) {
                list = music2.getExternalMusicInfos();
            } else {
                list = null;
            }
            o.LJI(list);
            if (C79004UzY.LJJIFFI(list)) {
                return arrayList;
            }
            for (ExternalMusicInfo externalMusicInfo : list) {
                if (!TextUtils.isEmpty(externalMusicInfo.getJumpUrl()) && !TextUtils.isEmpty(externalMusicInfo.getPartnerName())) {
                    Music music3 = musicDetail.music;
                    if (music3 != null) {
                        music3.isPgc();
                    }
                    if (o.LJ("ttm", externalMusicInfo.getPartnerName())) {
                        if (externalMusicInfo.getSubscribed() || externalMusicInfo.getProductStatus() == 1) {
                            arrayList.add(externalMusicInfo);
                        }
                    } else if (!C79004UzY.LJJIFFI(MusicService.LJJLIIIJJI().LJJL(externalMusicInfo.getPartnerName()))) {
                        arrayList.add(externalMusicInfo);
                    }
                }
            }
        }
        return arrayList;
    }
}
