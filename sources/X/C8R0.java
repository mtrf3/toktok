package X;

import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.AuthorSurveyBottomBarAssemTrigger;
import kotlin.jvm.internal.o;

/* renamed from: X.8R0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8R0 extends AbstractC65781Prl implements InterfaceC88471Ynr<AuthorSurveyBottomBarAssemTrigger, C43I<? extends Integer>, C76800UCe> {
    public static final C8R0 LJLIL = new C8R0();

    public C8R0() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AuthorSurveyBottomBarAssemTrigger authorSurveyBottomBarAssemTrigger, C43I<? extends Integer> c43i) {
        String str;
        VideoItemParams videoItemParams;
        Aweme aweme;
        Aweme aweme2;
        AuthorSurveyBottomBarAssemTrigger selectSubscribe = authorSurveyBottomBarAssemTrigger;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            InterfaceC115514g7 interfaceC115514g7 = selectSubscribe.LLIFFJFJJ;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = AuthorSurveyBottomBarAssemTrigger.LLIIIILZ;
            VideoItemParams videoItemParams2 = (VideoItemParams) ((AssemViewModelWithItem) interfaceC115514g7.LIZ(selectSubscribe, interfaceC74236TBoArr[1])).gv0();
            if (videoItemParams2 != null && ((Number) c43i2.LIZ).intValue() == videoItemParams2.currentPosition) {
                VideoItemParams videoItemParams3 = (VideoItemParams) ((AssemViewModelWithItem) selectSubscribe.LLIFFJFJJ.LIZ(selectSubscribe, interfaceC74236TBoArr[1])).gv0();
                String str2 = null;
                if (videoItemParams3 != null && (aweme2 = videoItemParams3.getAweme()) != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                VideoItemParams videoItemParams4 = selectSubscribe.LLFFF;
                if (videoItemParams4 != null && (aweme = videoItemParams4.getAweme()) != null) {
                    str2 = aweme.getAid();
                }
                if (o.LJ(str, str2) && (videoItemParams = selectSubscribe.LLFII) != null && videoItemParams.getAweme() != null) {
                    selectSubscribe.LLF = true;
                    selectSubscribe.l4();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
