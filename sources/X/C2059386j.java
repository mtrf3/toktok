package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.86j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2059386j extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoAuthorInfoRelationAssem, Integer, C76800UCe> {
    public static final C2059386j LJLIL = new C2059386j();

    public C2059386j() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, Integer num) {
        VideoAuthorInfoRelationAssem selectSubscribe = videoAuthorInfoRelationAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        TuxTextView tuxTextView = selectSubscribe.LLFII;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(intValue);
            return C76800UCe.LIZ;
        }
        o.LJIJI("titleView");
        throw null;
    }
}
