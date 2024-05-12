package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.SWt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72239SWt extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, Boolean, C76800UCe> {
    public static final C72239SWt LJLIL = new C72239SWt();

    public C72239SWt() {
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
                c81155Vt9.LIZJ();
            }
        }
        return C76800UCe.LIZ;
    }
}
