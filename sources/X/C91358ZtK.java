package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.dsp.v2.TTDspViewModelV2;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtK, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91358ZtK implements ViewModelProvider.Factory {
    public final /* synthetic */ ActivityC45651qj LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public C91358ZtK(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new TTDspViewModelV2(this.LIZ);
    }
}
