package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Scw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72506Scw implements ViewModelProvider.Factory {
    public final SIS LIZ;
    public final SF5 LIZIZ;
    public final NextLiveData<EnumC71848SHs> LIZJ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new NotificationChunkVM(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public C72506Scw(SIS args, SF5 renderMode, NextLiveData<EnumC71848SHs> chunkDataState) {
        o.LJIIIZ(args, "args");
        o.LJIIIZ(renderMode, "renderMode");
        o.LJIIIZ(chunkDataState, "chunkDataState");
        this.LIZ = args;
        this.LIZIZ = renderMode;
        this.LIZJ = chunkDataState;
    }
}
