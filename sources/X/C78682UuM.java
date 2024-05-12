package X;

import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.UuM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78682UuM extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoUserCardAssem, Boolean, C76800UCe> {
    public static final C78682UuM LJLIL = new C78682UuM();

    public C78682UuM() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoUserCardAssem videoUserCardAssem, Boolean bool) {
        VideoUserCardAssem selectSubscribe = videoUserCardAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            selectSubscribe.Y3().clearAnimation();
            selectSubscribe.q4(false, false);
        }
        return C76800UCe.LIZ;
    }
}
