package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.nows.feed.ui.NowGestureAssem;
import com.ss.android.ugc.aweme.nows.feed.ui.NowPostImageAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7nX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196557nX extends AbstractC65781Prl implements InterfaceC88471Ynr<NowPostImageAssem, Boolean, C76800UCe> {
    public static final C196557nX LJLIL = new C196557nX();

    public C196557nX() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowPostImageAssem nowPostImageAssem, Boolean bool) {
        NowPostImageAssem selectSubscribe = nowPostImageAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C7O3 c7o3 = NowGestureAssem.LLFZ;
        SmartImageView smartImageView = selectSubscribe.LLIIIILZ;
        if (smartImageView != null) {
            c7o3.getClass();
            C7O3.LIZ(smartImageView, booleanValue);
            return C76800UCe.LIZ;
        }
        o.LJIJI("smallWindow");
        throw null;
    }
}
