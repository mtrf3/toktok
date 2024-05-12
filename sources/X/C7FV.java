package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeens;
import com.ss.android.ugc.aweme.compliance.api.phl.vm.PhlViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.7FV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7FV implements ViewModelProvider.Factory {
    public final /* synthetic */ int LIZ = 0;
    public final Object LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        switch (this.LIZ) {
            case 0:
                return C09L.LIZIZ(this, cls, c0vk);
            default:
                return C09L.LIZIZ(this, cls, c0vk);
        }
    }

    public C7FV(ActivityC45651qj activityC45651qj) {
        this.LIZIZ = activityC45651qj;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class modelClass) {
        switch (this.LIZ) {
            case 0:
                o.LJIIIZ(modelClass, "modelClass");
                return new CommentListViewModel((LifecycleOwner) this.LIZIZ);
            default:
                o.LJIIIZ(modelClass, "modelClass");
                final PrivacyHighlightsForTeens privacyHighlightsForTeens = (PrivacyHighlightsForTeens) this.LIZIZ;
                return new PhlViewModel(new C7FX(privacyHighlightsForTeens) { // from class: X.7FW
                    public final PrivacyHighlightsForTeens LIZ;

                    @Override // X.C7FX
                    public final AbstractC73672Svk<PrivacyHighlightsForTeens> LIZ() {
                        return AbstractC73672Svk.LJJIJIL(this.LIZ);
                    }

                    {
                        o.LJIIIZ(privacyHighlightsForTeens, "privacyHighlightsForTeens");
                        this.LIZ = privacyHighlightsForTeens;
                    }
                });
        }
    }

    public C7FV(PrivacyHighlightsForTeens privacyHighlightsForTeens) {
        this.LIZIZ = privacyHighlightsForTeens;
    }
}
