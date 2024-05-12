package X;

import com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionAssem;
import com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.8UX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8UX extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoTopCautionAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C8UX LJLIL = new C8UX();

    public C8UX() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoTopCautionAssem videoTopCautionAssem, C43I<? extends Integer> c43i) {
        Aweme aweme;
        AVUploadMiscInfoStruct uploadMiscInfoStruct;
        KtfInfo ktfInfo;
        VideoTopCautionAssem selectSubscribe = videoTopCautionAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C53324KwK.LIZ() || c43i != null) {
            VideoTopCautionVM p4 = selectSubscribe.p4();
            p4.LJLJLLL = true;
            VideoItemParams gv0 = p4.gv0();
            if (gv0 != null && (aweme = gv0.getAweme()) != null && (uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct()) != null && (ktfInfo = uploadMiscInfoStruct.ktfInfo) != null) {
                ktfInfo.resetState();
            }
        }
        return C76800UCe.LIZ;
    }
}
