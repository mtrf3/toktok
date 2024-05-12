package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.SWp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72235SWp extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, Boolean, C76800UCe> {
    public static final C72235SWp LJLIL = new C72235SWp();

    public C72235SWp() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, Boolean bool) {
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C35570Dxe.LIZJ(selectSubscribe.LLIIIZ);
            C81155Vt9 c81155Vt9 = selectSubscribe.LLIIIZ;
            if (c81155Vt9 != null) {
                c81155Vt9.LIZ();
            }
        }
        return C76800UCe.LIZ;
    }
}
