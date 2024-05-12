package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions.GroupDetailViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.3oG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95083oG implements ViewModelProvider.Factory {
    public final C95573p3 LIZ;
    public final C95683pE LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new GroupDetailViewModel(this.LIZ, this.LIZIZ);
    }

    public C95083oG(C95573p3 detailData, C95683pE dataSource) {
        o.LJIIIZ(detailData, "detailData");
        o.LJIIIZ(dataSource, "dataSource");
        this.LIZ = detailData;
        this.LIZIZ = dataSource;
    }
}
