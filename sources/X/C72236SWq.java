package X;

import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.SWq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72236SWq extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleRefactorAssem, Boolean, C76800UCe> {
    public static final C72236SWq LJLIL = new C72236SWq();

    public C72236SWq() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleRefactorAssem videoMusicTitleRefactorAssem, Boolean bool) {
        VideoMusicTitleRefactorAssem selectSubscribe = videoMusicTitleRefactorAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C35570Dxe.LIZJ(selectSubscribe.LLIIIL);
            C81155Vt9 c81155Vt9 = selectSubscribe.LLIIIL;
            if (c81155Vt9 != null) {
                c81155Vt9.LIZ();
            }
        }
        return C76800UCe.LIZ;
    }
}
