package X;

import com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionAssem;
import com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8UV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8UV extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoTopCautionAssem, C43I<? extends Float>, C76800UCe> {
    public static final C8UV LJLIL = new C8UV();

    public C8UV() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoTopCautionAssem videoTopCautionAssem, C43I<? extends Float> c43i) {
        Float f;
        VideoTopCautionAssem selectSubscribe = videoTopCautionAssem;
        C43I<? extends Float> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoTopCautionVM p4 = selectSubscribe.p4();
        Aweme aweme = null;
        if (c43i2 != null) {
            f = (Float) c43i2.LIZ;
        } else {
            f = null;
        }
        VideoItemParams gv0 = p4.gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        }
        if (C72083SQt.LJLIIL(aweme) && f != null && f.floatValue() > 2.0f && p4.LJLJLLL) {
            p4.LJLJLLL = false;
            p4.withState(new AqS169S0100000_3(p4, 885));
        }
        return C76800UCe.LIZ;
    }
}
