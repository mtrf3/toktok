package X;

import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescEventTrackAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.83i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2051483i extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDescEventTrackAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C2051483i LJLIL = new C2051483i();

    public C2051483i() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDescEventTrackAssem videoDescEventTrackAssem, C43I<? extends Integer> c43i) {
        Aweme aweme;
        VideoDescEventTrackAssem selectSubscribe = videoDescEventTrackAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            InterfaceC115514g7 interfaceC115514g7 = selectSubscribe.LJLLJ;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = VideoDescEventTrackAssem.LJLZ;
            VideoItemParams videoItemParams = (VideoItemParams) ((AssemViewModelWithItem) interfaceC115514g7.LIZ(selectSubscribe, interfaceC74236TBoArr[0])).gv0();
            if (videoItemParams != null) {
                aweme = videoItemParams.getAweme();
            } else {
                aweme = null;
            }
            if (AnonymousClass843.LIZJ(aweme) && AnonymousClass843.LIZ() && ((VideoDescVM) selectSubscribe.LJLLJ.LIZ(selectSubscribe, interfaceC74236TBoArr[0])).LJZL) {
                int intValue = ((Number) c43i2.LIZ).intValue();
                if (intValue != 1) {
                    if (intValue == 2) {
                        C50420Jqa c50420Jqa = new C50420Jqa(73, Boolean.FALSE);
                        c50420Jqa.LJLZ = System.identityHashCode(C212428Vi.LIZ(selectSubscribe));
                        C2U8.LIZ(c50420Jqa);
                    }
                } else {
                    C50420Jqa c50420Jqa2 = new C50420Jqa(73, Boolean.TRUE);
                    c50420Jqa2.LJLZ = System.identityHashCode(C212428Vi.LIZ(selectSubscribe));
                    C2U8.LIZ(c50420Jqa2);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
