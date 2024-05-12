package X;

import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.SWi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72228SWi extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleRefactorAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C72228SWi LJLIL = new C72228SWi();

    public C72228SWi() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleRefactorAssem videoMusicTitleRefactorAssem, C43I<? extends Integer> c43i) {
        VideoMusicTitleRefactorAssem selectSubscribe = videoMusicTitleRefactorAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLILIL = true;
            Iterator it = VideoMusicTitleRefactorAssem.u4().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SXL sxl = (SXL) ((java.util.Map) selectSubscribe.LLILLIZIL.getValue()).get(it.next());
                if (sxl != null && sxl.LIZIZ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe))) {
                    sxl.LIZ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe));
                    break;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
