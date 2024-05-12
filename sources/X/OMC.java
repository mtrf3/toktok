package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.BottomSurveyAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OMC extends AbstractC65781Prl implements InterfaceC88471Ynr<BottomSurveyAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final OMC LJLIL = new OMC();

    public OMC() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(BottomSurveyAssem bottomSurveyAssem, C43I<? extends C195357lb> c43i) {
        BottomSurveyAssem selectSubscribe = bottomSurveyAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIIILZ.LJI(EnumC61773OMf.SWIPE, ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
        }
        return C76800UCe.LIZ;
    }
}
