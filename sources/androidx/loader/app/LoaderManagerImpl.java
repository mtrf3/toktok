package androidx.loader.app;

import X.C09M;
import X.C09N;
import X.C0MB;
import X.C0ZO;
import X.C0ZP;
import X.C16880lQ;
import X.C17N;
import X.C1BF;
import X.X1D;
import Y.IDFactoryS59S0000000;
import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import defpackage.i0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class LoaderManagerImpl extends C09N {
    public final LifecycleOwner LIZ;
    public final LoaderViewModel LIZIZ;

    /* loaded from: classes.dex */
    public static class LoaderInfo<D> extends MutableLiveData<D> implements C0ZO<D> {
        public final Bundle mArgs;
        public final int mId;
        public LifecycleOwner mLifecycleOwner;
        public final C0ZP<D> mLoader;
        public C1BF<D> mObserver;
        public C0ZP<D> mPriorLoader;

        public void markForRedelivery() {
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            C1BF<D> c1bf = this.mObserver;
            if (lifecycleOwner != null && c1bf != null) {
                super.removeObserver(c1bf);
                observe(lifecycleOwner, c1bf);
            }
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            C0ZP<D> c0zp = this.mLoader;
            c0zp.LIZLLL = true;
            c0zp.LJFF = false;
            c0zp.LJ = false;
            c0zp.LJI();
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            C0ZP<D> c0zp = this.mLoader;
            c0zp.LIZLLL = false;
            c0zp.LJII();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.mId);
            sb.append(" : ");
            C17N.LJII(this.mLoader, sb);
            sb.append("}}");
            return sb.toString();
        }

        public boolean isCallbackWaitingForData() {
            C1BF<D> c1bf;
            if (!hasActiveObservers() || (c1bf = this.mObserver) == null || c1bf.LJLILLLLZI) {
                return false;
            }
            return true;
        }

        public C0ZP<D> getLoader() {
            return this.mLoader;
        }

        public C0ZP<D> destroy(boolean z) {
            this.mLoader.LIZ();
            this.mLoader.LJ = true;
            C1BF<D> c1bf = this.mObserver;
            if (c1bf != null) {
                removeObserver(c1bf);
                if (z && c1bf.LJLILLLLZI) {
                    c1bf.LJLIL.LIZIZ();
                }
            }
            C0ZP<D> c0zp = this.mLoader;
            C0ZO<D> c0zo = c0zp.LIZIZ;
            if (c0zo != null) {
                if (c0zo == this) {
                    c0zp.LIZIZ = null;
                    if ((c1bf != null && !c1bf.LJLILLLLZI) || z) {
                        c0zp.LJFF();
                        c0zp.LJFF = true;
                        c0zp.LIZLLL = false;
                        c0zp.LJ = false;
                        c0zp.LJI = false;
                        c0zp.LJII = false;
                        return this.mPriorLoader;
                    }
                    return c0zp;
                }
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            throw new IllegalStateException("No listener register");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(Observer<? super D> observer) {
            super.removeObserver(observer);
            this.mLifecycleOwner = null;
            this.mObserver = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D d) {
            super.setValue(d);
            C0ZP<D> c0zp = this.mPriorLoader;
            if (c0zp != null) {
                c0zp.LJFF();
                c0zp.LJFF = true;
                c0zp.LIZLLL = false;
                c0zp.LJ = false;
                c0zp.LJI = false;
                c0zp.LJII = false;
                this.mPriorLoader = null;
            }
        }

        @Override // X.C0ZO
        public void onLoadComplete(C0ZP<D> c0zp, D d) {
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                setValue(d);
            } else {
                postValue(d);
            }
        }

        public C0ZP<D> setCallback(LifecycleOwner lifecycleOwner, C09M<D> c09m) {
            C1BF<D> c1bf = new C1BF<>(this.mLoader, c09m);
            observe(lifecycleOwner, c1bf);
            C1BF<D> c1bf2 = this.mObserver;
            if (c1bf2 != null) {
                removeObserver(c1bf2);
            }
            this.mLifecycleOwner = lifecycleOwner;
            this.mObserver = c1bf;
            return this.mLoader;
        }

        public LoaderInfo(int i, Bundle bundle, C0ZP<D> c0zp, C0ZP<D> c0zp2) {
            this.mId = i;
            this.mArgs = bundle;
            this.mLoader = c0zp;
            this.mPriorLoader = c0zp2;
            if (c0zp.LIZIZ == null) {
                c0zp.LIZIZ = this;
                c0zp.LIZ = i;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.mId);
            printWriter.print(" mArgs=");
            printWriter.println(this.mArgs);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.mLoader);
            this.mLoader.LIZJ(i0.LJFF(str, "  "), fileDescriptor, printWriter, strArr);
            if (this.mObserver != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.mObserver);
                C1BF<D> c1bf = this.mObserver;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append("  ");
                String LIZIZ = X1D.LIZIZ(LIZ);
                c1bf.getClass();
                printWriter.print(LIZIZ);
                printWriter.print("mDeliveredData=");
                printWriter.println(c1bf.LJLILLLLZI);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            C0ZP<D> loader = getLoader();
            D value = getValue();
            loader.getClass();
            StringBuilder sb = new StringBuilder(64);
            C17N.LJII(value, sb);
            sb.append("}");
            printWriter.println(sb.toString());
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }
    }

    /* loaded from: classes.dex */
    public static class LoaderViewModel extends ViewModel {
        public static final IDFactoryS59S0000000 LJLJI = new IDFactoryS59S0000000(1);
        public final C0MB<LoaderInfo> LJLIL = new C0MB<>();
        public boolean LJLILLLLZI = false;

        @Override // androidx.lifecycle.ViewModel
        public final void onCleared() {
            super.onCleared();
            int LJIIIIZZ = this.LJLIL.LJIIIIZZ();
            for (int i = 0; i < LJIIIIZZ; i++) {
                this.LJLIL.LJIIIZ(i).destroy(true);
            }
            this.LJLIL.LIZIZ();
        }
    }

    public final void LJ() {
        LoaderViewModel loaderViewModel = this.LIZIZ;
        int LJIIIIZZ = loaderViewModel.LJLIL.LJIIIIZZ();
        for (int i = 0; i < LJIIIIZZ; i++) {
            loaderViewModel.LJLIL.LJIIIZ(i).markForRedelivery();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C17N.LJII(this.LIZ, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // X.C09N
    public final void LIZ(int i) {
        if (!this.LIZIZ.LJLILLLLZI) {
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                LoaderInfo LJ = this.LIZIZ.LJLIL.LJ(i, null);
                if (LJ != null) {
                    LJ.destroy(true);
                    this.LIZIZ.LJLIL.LJII(i);
                    return;
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = (LoaderViewModel) new ViewModelProvider(viewModelStore, LoaderViewModel.LJLJI).get(LoaderViewModel.class);
    }

    @Override // X.C09N
    public final <D> C0ZP<D> LIZJ(int i, Bundle bundle, C09M<D> c09m) {
        if (!this.LIZIZ.LJLILLLLZI) {
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                LoaderInfo LJ = this.LIZIZ.LJLIL.LJ(i, null);
                if (LJ == null) {
                    try {
                        this.LIZIZ.LJLILLLLZI = true;
                        C0ZP LIZ = c09m.LIZ(bundle);
                        if (LIZ != null) {
                            if (!LIZ.getClass().isMemberClass() || Modifier.isStatic(LIZ.getClass().getModifiers())) {
                                LoaderInfo loaderInfo = new LoaderInfo(i, bundle, LIZ, null);
                                this.LIZIZ.LJLIL.LJI(i, loaderInfo);
                                this.LIZIZ.LJLILLLLZI = false;
                                return loaderInfo.setCallback(this.LIZ, c09m);
                            }
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                            LIZ2.append(LIZ);
                            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                        }
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                    } catch (Throwable th) {
                        this.LIZIZ.LJLILLLLZI = false;
                        throw th;
                    }
                }
                return LJ.setCallback(this.LIZ, c09m);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final void LIZLLL(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        LoaderViewModel loaderViewModel = this.LIZIZ;
        if (loaderViewModel.LJLIL.LJIIIIZZ() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("    ");
            String LIZIZ = X1D.LIZIZ(LIZ);
            for (int i = 0; i < loaderViewModel.LJLIL.LJIIIIZZ(); i++) {
                LoaderInfo LJIIIZ = loaderViewModel.LJLIL.LJIIIZ(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(loaderViewModel.LJLIL.LJFF(i));
                printWriter.print(": ");
                printWriter.println(LJIIIZ.toString());
                LJIIIZ.dump(LIZIZ, fileDescriptor, printWriter, strArr);
            }
        }
    }
}
