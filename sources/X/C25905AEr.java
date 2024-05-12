package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;
import kotlin.jvm.internal.o;

/* renamed from: X.AEr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25905AEr implements ViewModelProvider.Factory {
    public final String LIZ;
    public final String LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new RecUserAfterAuthPopupVM(this.LIZ, this.LIZIZ);
    }

    public C25905AEr(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
