package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.privacyhighlights.PrivacyHighlightsForTeensComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.G0z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40837G0z extends G0N<PrivacyHighlightsForTeensComponent, InterfaceC40780FzU> {
    public PrivacyHighlightsForTeensComponent LIZ;

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        InterfaceC88472Yns<Fragment, C76800UCe> LJIIZILJ = dependencies.LJIIZILJ();
        PrivacyHighlightsForTeensComponent privacyHighlightsForTeensComponent = this.LIZ;
        o.LJI(privacyHighlightsForTeensComponent);
        LJIIZILJ.invoke(privacyHighlightsForTeensComponent);
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        PrivacyHighlightsForTeensComponent privacyHighlightsForTeensComponent = new PrivacyHighlightsForTeensComponent();
        this.LIZ = privacyHighlightsForTeensComponent;
        return privacyHighlightsForTeensComponent;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        if (componentDependencies.wQ() != null) {
            return true;
        }
        return false;
    }
}
