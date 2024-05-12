package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.nows.feed.ui.NowGestureAssem;
import com.ss.android.ugc.aweme.nows.feed.ui.NowPostVideoAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7nW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196547nW extends AbstractC65781Prl implements InterfaceC88471Ynr<NowPostVideoAssem, Boolean, C76800UCe> {
    public static final C196547nW LJLIL = new C196547nW();

    public C196547nW() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowPostVideoAssem nowPostVideoAssem, Boolean bool) {
        NowPostVideoAssem selectSubscribe = nowPostVideoAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C7O3 c7o3 = NowGestureAssem.LLFZ;
        TuxIconView z4 = selectSubscribe.z4();
        c7o3.getClass();
        C7O3.LIZ(z4, booleanValue);
        return C76800UCe.LIZ;
    }
}
