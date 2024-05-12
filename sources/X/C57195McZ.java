package X;

import Y.ARunnableS45S0100000_9;
import com.ss.android.ugc.aweme.feed.assem.music.RecordMuteVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.McZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57195McZ extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C57195McZ LJLIL = new C57195McZ();

    public C57195McZ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, C43I<? extends Integer> c43i) {
        Music music;
        MusicReleaseInfo musicReleaseInfo;
        VideoMusicCoverAssem selectSubscribe = videoMusicCoverAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            if (IFM.LIZ) {
                selectSubscribe.A4();
                JYH jyh = JYH.LIZIZ;
                if (jyh.LJIILIIL() && selectSubscribe.LLJILJILJ && !selectSubscribe.LLJILLL) {
                    ARunnableS45S0100000_9 aRunnableS45S0100000_9 = new ARunnableS45S0100000_9(selectSubscribe, 142);
                    selectSubscribe.LLJJI = aRunnableS45S0100000_9;
                    C1DH.LJJIJIIJIL(5000L, aRunnableS45S0100000_9);
                }
                selectSubscribe.LLJJ = jyh.LIZIZ(C212428Vi.LIZ(selectSubscribe));
                selectSubscribe.LLJJIJI = true;
                selectSubscribe.P4();
                RecordMuteVM G4 = selectSubscribe.G4();
                Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                o.LJIIIIZZ(aweme, "item.aweme");
                G4.getClass();
                if (G4.LJLL) {
                    G4.LJLJLLL.add(aweme.getAid());
                    if (G4.LJLJLLL.size() > 3) {
                        G4.LJLL = false;
                        G4.getClass();
                    }
                }
            }
            if (C30581Hy.LJIL(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType) && (music = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getMusic()) != null && (musicReleaseInfo = music.getMusicReleaseInfo()) != null && musicReleaseInfo.isNewReleaseSong()) {
                Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                HashMap hashMap = new HashMap();
                String str = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType;
                if (str == null) {
                    str = "'";
                }
                hashMap.put("enter_from", str);
                hashMap.put("music_id", aweme2.getMusic().getMid());
                hashMap.put("group_id", aweme2.getAid());
                hashMap.put("music_new_show", CardStruct.IStatusCode.DEFAULT);
                hashMap.put("location", "cover");
                FMX.LJIIL("new_release_show", hashMap);
            }
            FMX.LIZIZ().submit(new ARunnableS45S0100000_9(selectSubscribe, 141));
        }
        return C76800UCe.LIZ;
    }
}
