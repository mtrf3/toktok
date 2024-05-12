package androidx.lifecycle;

import X.C52400KhQ;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class ViewModelStore {
    public final HashMap<String, ViewModel> mMap = new HashMap<>();

    public final void clear() {
        androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_clear(this);
    }

    public final ViewModel get(String str) {
        return androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_get(this, str);
    }

    public Set keys() {
        return androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_keys(this);
    }

    public final void put(String str, ViewModel viewModel) {
        androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_put(this, str, viewModel);
    }

    public final void androidx_lifecycle_ViewModelStore__clear$___twin___() {
        Iterator<ViewModel> it = this.mMap.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.mMap.clear();
    }

    public Set<String> androidx_lifecycle_ViewModelStore__keys$___twin___() {
        return new HashSet(this.mMap.keySet());
    }

    public static void androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_clear(ViewModelStore viewModelStore) {
        if (((Boolean) C52400KhQ.LJ.getValue()).booleanValue()) {
            System.err.println(Log.getStackTraceString(new Exception(viewModelStore.toString())));
        }
        if (C52400KhQ.LIZIZ()) {
            synchronized (viewModelStore.mMap) {
                if (((Boolean) C52400KhQ.LIZJ.getValue()).booleanValue()) {
                    try {
                        viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
                    } catch (Throwable unused) {
                        if (((Boolean) C52400KhQ.LIZLLL.getValue()).booleanValue()) {
                            try {
                                viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    return;
                }
                viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
                return;
            }
        }
        if (((Boolean) C52400KhQ.LIZJ.getValue()).booleanValue()) {
            try {
                viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
                return;
            } catch (Throwable unused3) {
                if (((Boolean) C52400KhQ.LIZLLL.getValue()).booleanValue()) {
                    try {
                        viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
                        return;
                    } catch (Throwable unused4) {
                        return;
                    }
                }
                return;
            }
        }
        viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
    }

    public static Set androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_keys(ViewModelStore viewModelStore) {
        Set<String> androidx_lifecycle_ViewModelStore__keys$___twin___;
        if (C52400KhQ.LIZIZ()) {
            synchronized (viewModelStore.mMap) {
                androidx_lifecycle_ViewModelStore__keys$___twin___ = viewModelStore.androidx_lifecycle_ViewModelStore__keys$___twin___();
            }
            return androidx_lifecycle_ViewModelStore__keys$___twin___;
        }
        return viewModelStore.androidx_lifecycle_ViewModelStore__keys$___twin___();
    }

    public final ViewModel androidx_lifecycle_ViewModelStore__get$___twin___(String str) {
        return this.mMap.get(str);
    }

    public static ViewModel androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_get(ViewModelStore viewModelStore, String str) {
        ViewModel androidx_lifecycle_ViewModelStore__get$___twin___;
        if (C52400KhQ.LIZIZ()) {
            synchronized (viewModelStore.mMap) {
                androidx_lifecycle_ViewModelStore__get$___twin___ = viewModelStore.androidx_lifecycle_ViewModelStore__get$___twin___(str);
            }
            return androidx_lifecycle_ViewModelStore__get$___twin___;
        }
        return viewModelStore.androidx_lifecycle_ViewModelStore__get$___twin___(str);
    }

    public final void androidx_lifecycle_ViewModelStore__put$___twin___(String str, ViewModel viewModel) {
        ViewModel put = this.mMap.put(str, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }

    public static void androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_ViewModelStoreLancet_put(ViewModelStore viewModelStore, String str, ViewModel viewModel) {
        if (((Boolean) C52400KhQ.LJ.getValue()).booleanValue()) {
            System.err.println(Log.getStackTraceString(new Exception(viewModelStore.toString())));
        }
        if (C52400KhQ.LIZIZ()) {
            synchronized (viewModelStore.mMap) {
                viewModelStore.androidx_lifecycle_ViewModelStore__put$___twin___(str, viewModel);
            }
            return;
        }
        viewModelStore.androidx_lifecycle_ViewModelStore__put$___twin___(str, viewModel);
    }
}
