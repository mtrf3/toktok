package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8OH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OH extends AbstractC65781Prl implements InterfaceC88472Yns<C8NK, C76800UCe> {
    public static final C8OH LJLIL = new C8OH();

    public C8OH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NK c8nk) {
        C8NK reusedUiContentAssem = c8nk;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        reusedUiContentAssem.LIZLLL = R.id.view_rootview;
        reusedUiContentAssem.LIZ = C65352Pkq.LIZ(CommerceInteractionComponent.class);
        reusedUiContentAssem.LIZJ = new CommerceInteractionComponent();
        return C76800UCe.LIZ;
    }
}
