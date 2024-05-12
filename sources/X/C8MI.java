package X;

import com.ss.android.ugc.aweme.story.feed.common.newarch.component.TapTouchInterceptComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8MI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MI extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C8MI LJLIL = new C8MI();

    public C8MI() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.player_view;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(TapTouchInterceptComponent.class);
        reusedUiContentAssem.LIZJ = new TapTouchInterceptComponent();
        return C76800UCe.LIZ;
    }
}
