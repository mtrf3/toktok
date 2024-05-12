package X;

import Y.ARunnableS48S0100000_12;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.SWr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72237SWr extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, Boolean, C76800UCe> {
    public static final C72237SWr LJLIL = new C72237SWr();

    public C72237SWr() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, Boolean bool) {
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C35570Dxe.LIZ(new ARunnableS48S0100000_12(selectSubscribe, 90), selectSubscribe.LLIIIZ);
        }
        return C76800UCe.LIZ;
    }
}
