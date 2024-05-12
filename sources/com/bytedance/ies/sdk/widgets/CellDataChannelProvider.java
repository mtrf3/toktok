package com.bytedance.ies.sdk.widgets;

import X.C08Z;
import X.C39557Ffl;
import X.C65352Pkq;
import X.F9E;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class CellDataChannelProvider extends F9E {
    public final InterfaceC65784Pro<ViewModelProvider.Factory> factoryProducer;
    public final Fragment fragment;
    public final InterfaceC65784Pro<String> keyFactory;
    public final int rootHashCode;
    public final InterfaceC65350Pko<DataChannel> viewModelClass;

    private final int component1() {
        return this.rootHashCode;
    }

    private final Fragment component2() {
        return this.fragment;
    }

    public static /* synthetic */ CellDataChannelProvider copy$default(CellDataChannelProvider cellDataChannelProvider, int i, Fragment fragment, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cellDataChannelProvider.rootHashCode;
        }
        if ((i2 & 2) != 0) {
            fragment = cellDataChannelProvider.fragment;
        }
        return cellDataChannelProvider.copy(i, fragment);
    }

    public final CellDataChannelProvider copy(int i, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new CellDataChannelProvider(i, fragment);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.rootHashCode), this.fragment};
    }

    private final DataChannel newViewModel() {
        final ViewModelStore viewModelStore;
        ViewModelProvider.Factory invoke = this.factoryProducer.invoke();
        try {
            viewModelStore = this.fragment.getViewModelStore();
        } catch (IllegalStateException unused) {
            viewModelStore = new ViewModelStore();
            FragmentManager fragmentManager = this.fragment.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.LJJLIL(new C08Z() { // from class: com.bytedance.ies.sdk.widgets.CellDataChannelProvider$newViewModel$store$1
                    @Override // X.C08Z
                    public void onFragmentDestroyed(FragmentManager fm, Fragment f) {
                        o.LJIIIZ(fm, "fm");
                        o.LJIIIZ(f, "f");
                        super.onFragmentDestroyed(fm, f);
                        ViewModelStore.this.clear();
                    }
                }, false);
            }
        }
        o.LJIIIIZZ(viewModelStore, "try {\n            // may… viewModelStore\n        }");
        return (DataChannel) new ViewModelProvider(viewModelStore, invoke, null, 4, null).get(this.keyFactory.invoke(), C39557Ffl.LIZ(this.viewModelClass));
    }

    public final DataChannel getValue() {
        return newViewModel();
    }

    public final InterfaceC65784Pro<ViewModelProvider.Factory> getFactoryProducer() {
        return this.factoryProducer;
    }

    public final InterfaceC65784Pro<String> getKeyFactory() {
        return this.keyFactory;
    }

    public CellDataChannelProvider(int i, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.rootHashCode = i;
        this.fragment = fragment;
        this.viewModelClass = C65352Pkq.LIZ(DataChannel.class);
        this.keyFactory = new AqS165S0100000_15(this, 40);
        this.factoryProducer = CellDataChannelProvider$factoryProducer$1.INSTANCE;
    }
}
