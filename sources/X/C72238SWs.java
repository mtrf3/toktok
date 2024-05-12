package X;

import Y.ARunnableS48S0100000_12;
import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.SWs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72238SWs extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleRefactorAssem, Boolean, C76800UCe> {
    public static final C72238SWs LJLIL = new C72238SWs();

    public C72238SWs() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleRefactorAssem videoMusicTitleRefactorAssem, Boolean bool) {
        VideoMusicTitleRefactorAssem selectSubscribe = videoMusicTitleRefactorAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C35570Dxe.LIZ(new ARunnableS48S0100000_12(selectSubscribe, 103), selectSubscribe.LLIIIL);
        }
        return C76800UCe.LIZ;
    }
}
