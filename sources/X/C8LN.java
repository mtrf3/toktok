package X;

import com.ss.android.ugc.feed.platform.cell.fullscreen.above.FullScreenAboveInteractionComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8LN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LN extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C8LN LJLIL = new C8LN();

    public C8LN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(FullScreenAboveInteractionComponent.class);
        reusedUiContentAssem.LIZJ = new FullScreenAboveInteractionComponent();
        reusedUiContentAssem.LIZLLL = R.id.dp_;
        return C76800UCe.LIZ;
    }
}
