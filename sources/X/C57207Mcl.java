package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Mcl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57207Mcl extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, Boolean, C76800UCe> {
    public static final C57207Mcl LJLIL = new C57207Mcl();

    public C57207Mcl() {
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
