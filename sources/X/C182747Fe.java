package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeens;
import com.ss.android.ugc.aweme.compliance.api.phl.vm.PhlViewModel;
import com.ss.android.ugc.aweme.compliance.business.phl.PhlApi;
import com.ss.android.ugc.aweme.compliance.business.phl.PhlVideosResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.7Fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182747Fe implements ViewModelProvider.Factory {
    public static final C182747Fe LIZ = new C182747Fe();

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new PhlViewModel(new C7FX() { // from class: X.7Fh
            @Override // X.C7FX
            public final AbstractC73672Svk<PrivacyHighlightsForTeens> LIZ() {
                return PhlApi.LIZ.getPrivacyHighlightsVideos().LJJIJL(new InterfaceC48038ItG() { // from class: X.7Fi
                    @Override // X.InterfaceC48038ItG
                    public final Object apply(Object obj) {
                        PhlVideosResponse it = (PhlVideosResponse) obj;
                        o.LJIIIZ(it, "it");
                        return it.phlTeens;
                    }
                });
            }
        });
    }
}
