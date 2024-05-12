package X;

import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.SWh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72227SWh extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleRefactorAssem, Double, C76800UCe> {
    public static final C72227SWh LJLIL = new C72227SWh();

    public C72227SWh() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleRefactorAssem videoMusicTitleRefactorAssem, Double d) {
        VideoMusicTitleRefactorAssem selectSubscribe = videoMusicTitleRefactorAssem;
        Double d2 = d;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (d2 != null) {
            d2.doubleValue();
            double doubleValue = d2.doubleValue();
            if (!selectSubscribe.LLIL) {
                Iterator it = VideoMusicTitleRefactorAssem.u4().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SXL sxl = (SXL) ((java.util.Map) selectSubscribe.LLILLIZIL.getValue()).get(it.next());
                    if (sxl != null && sxl.LIZIZ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe))) {
                        selectSubscribe.LLIL = sxl.LIZLLL((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe), doubleValue);
                        break;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
