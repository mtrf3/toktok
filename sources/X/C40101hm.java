package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.PrintWriter;

/* renamed from: X.1hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40101hm extends C1BB<ActivityC45651qj> implements ViewModelStoreOwner, C18I {
    public final /* synthetic */ ActivityC45651qj LJLJJL;

    @Override // X.AnonymousClass095
    public final boolean LIZIZ() {
        Window window = this.LJLJJL.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // X.C1BB
    public final LayoutInflater LJI() {
        return this.LJLJJL.getLayoutInflater().cloneInContext(this.LJLJJL);
    }

    @Override // X.C1BB
    public final boolean LJIIIIZZ() {
        return !this.LJLJJL.isFinishing();
    }

    @Override // X.C1BB
    public final void LJIIL() {
        this.LJLJJL.supportInvalidateOptionsMenu();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLJJL.mFragmentLifecycleRegistry;
    }

    @Override // X.C18I
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.LJLJJL.getOnBackPressedDispatcher();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LJLJJL.getViewModelStore();
    }

    @Override // X.C1BB
    public final /* bridge */ /* synthetic */ ActivityC45651qj LJFF() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40101hm(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        this.LJLJJL = activityC45651qj;
    }

    @Override // X.AnonymousClass095
    public final View LIZ(int i) {
        return this.LJLJJL.findViewById(i);
    }

    @Override // X.C1BB
    public final void LIZJ(Fragment fragment) {
        this.LJLJJL.onAttachFragment(fragment);
    }

    @Override // X.C1BB
    public final boolean LJIIIZ(String str) {
        return C1AR.LJI(this.LJLJJL, str);
    }

    @Override // X.C1BB
    public final void LIZLLL(PrintWriter printWriter, String[] strArr) {
        this.LJLJJL.dump("  ", null, printWriter, strArr);
    }

    @Override // X.C1BB
    public final void LJII(Fragment fragment, String[] strArr, int i) {
        this.LJLJJL.requestPermissionsFromFragment(fragment, strArr, i);
    }

    @Override // X.C1BB
    public final void LJIIJ(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.LJLJJL.startActivityFromFragment(fragment, intent, i, bundle);
    }

    @Override // X.C1BB
    public final void LJIIJJI(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.LJLJJL.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }
}
