package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8UZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8UZ extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoTopCautionAssem, Boolean, C76800UCe> {
    public static final C8UZ LJLIL = new C8UZ();

    public C8UZ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoTopCautionAssem videoTopCautionAssem, Boolean bool) {
        int i;
        VideoTopCautionAssem selectSubscribe = videoTopCautionAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View Y3 = selectSubscribe.Y3();
        if (booleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        Y3.setVisibility(i);
        return C76800UCe.LIZ;
    }
}
