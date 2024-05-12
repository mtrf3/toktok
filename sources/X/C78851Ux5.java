package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.pipo.ocr.ocr.OcrResultViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ux5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78851Ux5 implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new OcrResultViewModel();
    }
}
