package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Mck, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57206Mck extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, Boolean, C76800UCe> {
    public static final C57206Mck LJLIL = new C57206Mck();

    public C57206Mck() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, Boolean bool) {
        VideoMusicCoverAssem selectSubscribe = videoMusicCoverAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            selectSubscribe.S4();
            selectSubscribe.R4();
        }
        return C76800UCe.LIZ;
    }
}
