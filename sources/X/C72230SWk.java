package X;

import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.SWk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72230SWk extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleRefactorAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C72230SWk LJLIL = new C72230SWk();

    public C72230SWk() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleRefactorAssem videoMusicTitleRefactorAssem, C43I<? extends Boolean> c43i) {
        VideoMusicTitleRefactorAssem selectSubscribe = videoMusicTitleRefactorAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            if (((Boolean) c43i2.LIZ).booleanValue()) {
                selectSubscribe.B4().ov0();
            } else {
                selectSubscribe.B4().pv0();
            }
        }
        return C76800UCe.LIZ;
    }
}
