package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.LRf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54259LRf extends ViewModelProvider.NewInstanceFactory {
    public FeedPanelStateViewModel LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (o.LJ(FeedPanelStateViewModel.class, modelClass)) {
            if (this.LIZ == null) {
                this.LIZ = (FeedPanelStateViewModel) super.create(modelClass);
            }
            FeedPanelStateViewModel feedPanelStateViewModel = this.LIZ;
            o.LJII(feedPanelStateViewModel, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.share.viewmodel.SingletonPanelStateViewModelFactory.create");
            return feedPanelStateViewModel;
        }
        return (T) super.create(modelClass);
    }
}
