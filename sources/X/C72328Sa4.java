package X;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.pipo.ocr.ocr.OcrViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Sa4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72328Sa4 implements ViewModelProvider.Factory {
    public final Application LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public C72328Sa4(Application application) {
        this.LIZ = application;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(OcrViewModel.class)) {
            return new OcrViewModel(this.LIZ);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
