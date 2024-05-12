package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.o;

/* renamed from: X.McR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57187McR extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, C43I<? extends String>, C76800UCe> {
    public static final C57187McR LJLIL = new C57187McR();

    public C57187McR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, C43I<? extends String> c43i) {
        String str;
        String str2;
        Music music;
        VideoMusicCoverAssem selectSubscribe = videoMusicCoverAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && ((C57188McS.LIZ.rightStrategy == 1 || C57188McS.LIZLLL(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme())) && !selectSubscribe.LLJILJILJ)) {
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            ActivityC45651qj LIZ = C212428Vi.LIZ(selectSubscribe);
            String str3 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType;
            o.LJIIIIZZ(str3, "item.eventType");
            if (C57186McQ.LIZLLL(LIZ, str3, aweme)) {
                selectSubscribe.X4(false);
                String str4 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType;
                Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                String str5 = null;
                if (aweme2 != null) {
                    str = aweme2.getAuthorUid();
                } else {
                    str = null;
                }
                Aweme aweme3 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                if (aweme3 != null) {
                    str2 = aweme3.getAid();
                } else {
                    str2 = null;
                }
                Aweme aweme4 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                if (aweme4 != null && (music = aweme4.getMusic()) != null) {
                    str5 = music.getMid();
                }
                C57186McQ.LIZJ(str4, "show", str, str2, str5);
            }
        }
        return C76800UCe.LIZ;
    }
}
