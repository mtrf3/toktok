package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.contentlanguage.ContentLanguageComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0U extends G0N<ContentLanguageComponent, InterfaceC40781FzV> {
    public ContentLanguageComponent LIZ;

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        InterfaceC88472Yns<Fragment, C76800UCe> LJIIZILJ = dependencies.LJIIZILJ();
        ContentLanguageComponent contentLanguageComponent = this.LIZ;
        o.LJI(contentLanguageComponent);
        LJIIZILJ.invoke(contentLanguageComponent);
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        ContentLanguageComponent contentLanguageComponent = new ContentLanguageComponent();
        this.LIZ = contentLanguageComponent;
        return contentLanguageComponent;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        if (componentDependencies.o0() == null || G2G.LIZIZ.LJI() || E5H.LIZIZ(EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID)) {
            return false;
        }
        return true;
    }
}
