package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.SWj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72229SWj extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C72229SWj LJLIL = new C72229SWj();

    public C72229SWj() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, C43I<? extends Boolean> c43i) {
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            if (((Boolean) c43i2.LIZ).booleanValue()) {
                selectSubscribe.C4().ov0();
            } else {
                selectSubscribe.C4().pv0();
            }
        }
        return C76800UCe.LIZ;
    }
}
