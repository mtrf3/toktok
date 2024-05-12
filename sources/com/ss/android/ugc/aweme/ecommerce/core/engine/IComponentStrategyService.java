package com.ss.android.ugc.aweme.ecommerce.core.engine;

import X.AbstractC26779Af9;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes5.dex */
public interface IComponentStrategyService<VM extends ViewModel> extends ViewModelProvider.Factory {
    void LIZ(AbstractC26779Af9 abstractC26779Af9, C73242Soo c73242Soo);

    VM LIZIZ();

    InterfaceC26883Agp<VM> LIZJ(LifecycleOwner lifecycleOwner);

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    <T extends ViewModel> T create(Class<T> cls);

    EnumC26549AbR getType();
}
