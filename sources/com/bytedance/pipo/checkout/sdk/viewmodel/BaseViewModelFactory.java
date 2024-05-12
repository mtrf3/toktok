package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.C09L;
import X.C0VK;
import X.C92083a51;
import X.C92105a5N;
import X.C92106a5O;
import X.C92324a8u;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BaseViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    public final C92083a51 apiService;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public BaseViewModelFactory(C92083a51 apiService) {
        o.LJIIIZ(apiService, "apiService");
        this.apiService = apiService;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        C92324a8u c92324a8u = C92105a5N.LIZ;
        o.LJI(c92324a8u);
        C92106a5O c92106a5O = C92105a5N.LIZIZ;
        o.LJI(c92106a5O);
        T newInstance = modelClass.getConstructor(C92324a8u.class, C92106a5O.class, C92083a51.class).newInstance(c92324a8u, c92106a5O, this.apiService);
        o.LJIIIIZZ(newInstance, "modelClass.getConstructo…onfiguration, apiService)");
        return newInstance;
    }
}
