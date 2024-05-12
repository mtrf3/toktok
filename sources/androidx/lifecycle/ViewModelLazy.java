package androidx.lifecycle;

import X.AbstractC65781Prl;
import X.C0VK;
import X.C1NF;
import X.C39557Ffl;
import X.C5H3;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements C5H3<VM> {
    public VM cached;
    public final InterfaceC65784Pro<C0VK> extrasProducer;
    public final InterfaceC65784Pro<ViewModelProvider.Factory> factoryProducer;
    public final InterfaceC65784Pro<ViewModelStore> storeProducer;
    public final InterfaceC65350Pko<VM> viewModelClass;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(InterfaceC65350Pko<VM> viewModelClass, InterfaceC65784Pro<? extends ViewModelStore> storeProducer, InterfaceC65784Pro<? extends ViewModelProvider.Factory> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, 0 == true ? 1 : 0);
        o.LJIIIZ(viewModelClass, "viewModelClass");
        o.LJIIIZ(storeProducer, "storeProducer");
        o.LJIIIZ(factoryProducer, "factoryProducer");
    }

    @Override // X.C5H3
    public VM getValue() {
        VM vm = this.cached;
        if (vm == null) {
            VM vm2 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(C39557Ffl.LIZ(this.viewModelClass));
            this.cached = vm2;
            return vm2;
        }
        return vm;
    }

    @Override // X.C5H3
    public boolean isInitialized() {
        if (this.cached != null) {
            return true;
        }
        return false;
    }

    /* renamed from: androidx.lifecycle.ViewModelLazy$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC65781Prl implements InterfaceC65784Pro<C1NF> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // X.InterfaceC65784Pro
        public final C1NF invoke() {
            return C1NF.LIZIZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(InterfaceC65350Pko<VM> viewModelClass, InterfaceC65784Pro<? extends ViewModelStore> storeProducer, InterfaceC65784Pro<? extends ViewModelProvider.Factory> factoryProducer, InterfaceC65784Pro<? extends C0VK> extrasProducer) {
        o.LJIIIZ(viewModelClass, "viewModelClass");
        o.LJIIIZ(storeProducer, "storeProducer");
        o.LJIIIZ(factoryProducer, "factoryProducer");
        o.LJIIIZ(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    public /* synthetic */ ViewModelLazy(InterfaceC65350Pko interfaceC65350Pko, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC65350Pko, interfaceC65784Pro, interfaceC65784Pro2, (i & 8) != 0 ? AnonymousClass1.INSTANCE : interfaceC65784Pro3);
    }
}
