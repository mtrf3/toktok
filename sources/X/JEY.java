package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import defpackage.a1;

/* loaded from: classes9.dex */
public class JEY extends FrameLayout implements InterfaceC36571c5, ViewModelStoreOwner, HasDefaultViewModelProviderFactory {
    public final LifecycleRegistry LJLIL;
    public final ViewModelStore LJLILLLLZI;
    public final AnonymousClass109 LJLJI;
    public ViewModelProvider.Factory LJLJJI;

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ C0VK getDefaultViewModelCreationExtras() {
        return C09I.LIZ(this);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory factory = this.LJLJJI;
        if (factory == null) {
            factory = new SavedStateViewModelFactory(FKM.LIZ(), this, null);
        }
        this.LJLJJI = factory;
        return factory;
    }

    @Override // X.InterfaceC36571c5
    public AnonymousClass107 getSavedStateRegistry() {
        return this.LJLJI.LIZIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_START);
        LIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        LIZIZ();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent_saved_state", onSaveInstanceState);
        this.LJLJI.LIZJ(bundle);
        return bundle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LJLIL;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JEY(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLIL = new LifecycleRegistry(this);
        this.LJLILLLLZI = new ViewModelStore();
        this.LJLJI = AnonymousClass108.LIZ(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parent_saved_state"));
            this.LJLJI.LIZIZ(bundle);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        } else {
            this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }
}
