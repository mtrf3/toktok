package X;

import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PoiWriteReviewBottomBarAssemTrigger;
import kotlin.jvm.internal.o;

/* renamed from: X.8R7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8R7 extends AbstractC65781Prl implements InterfaceC88471Ynr<PoiWriteReviewBottomBarAssemTrigger, C43I<? extends Integer>, C76800UCe> {
    public static final C8R7 LJLIL = new C8R7();

    public C8R7() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(PoiWriteReviewBottomBarAssemTrigger poiWriteReviewBottomBarAssemTrigger, C43I<? extends Integer> c43i) {
        String str;
        String str2;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        PoiWriteReviewBottomBarAssemTrigger selectSubscribe = poiWriteReviewBottomBarAssemTrigger;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            InterfaceC115514g7 interfaceC115514g7 = selectSubscribe.LLIIIILZ;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = PoiWriteReviewBottomBarAssemTrigger.LLIIIL;
            VideoItemParams videoItemParams = (VideoItemParams) ((AssemViewModelWithItem) interfaceC115514g7.LIZ(selectSubscribe, interfaceC74236TBoArr[1])).gv0();
            if (videoItemParams != null && ((Number) c43i2.LIZ).intValue() == videoItemParams.currentPosition) {
                VideoItemParams videoItemParams2 = (VideoItemParams) ((AssemViewModelWithItem) selectSubscribe.LLIIIILZ.LIZ(selectSubscribe, interfaceC74236TBoArr[1])).gv0();
                String str3 = null;
                if (videoItemParams2 != null && (aweme3 = videoItemParams2.getAweme()) != null) {
                    str = aweme3.getAid();
                } else {
                    str = null;
                }
                VideoItemParams videoItemParams3 = selectSubscribe.LLFFF;
                if (videoItemParams3 != null && (aweme2 = videoItemParams3.getAweme()) != null) {
                    str2 = aweme2.getAid();
                } else {
                    str2 = null;
                }
                if (o.LJ(str, str2)) {
                    VideoItemParams videoItemParams4 = selectSubscribe.LLIFFJFJJ;
                    if (videoItemParams4 != null && (aweme = videoItemParams4.getAweme()) != null) {
                        VideoItemParams videoItemParams5 = selectSubscribe.LLIFFJFJJ;
                        if (videoItemParams5 != null) {
                            str3 = videoItemParams5.mEventType;
                        }
                        if (!C8RC.LIZJ(aweme, str3)) {
                            selectSubscribe.d1();
                        }
                    }
                    selectSubscribe.LLFZ = true;
                    selectSubscribe.LLIIIJ.invoke();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
