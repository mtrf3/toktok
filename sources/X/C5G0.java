package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5G0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5G0 {
    public static boolean LIZIZ;
    public static final ConcurrentHashMap<String, C5G1> LIZ = new ConcurrentHashMap<>();
    public static final Stack<String> LIZJ = new Stack<>();

    public static ViewModel LIZ(Class cls) {
        ViewModelProvider viewModelProvider;
        ViewModel viewModel;
        C5G1 c5g1 = LIZ.get(LIZJ.peek());
        if (c5g1 != null && (viewModelProvider = c5g1.get()) != null && (viewModel = viewModelProvider.get(cls)) != null) {
            return viewModel;
        }
        "viewModelProvider is null, please call CKViewModelProvider#init first".toString();
        throw new IllegalArgumentException("viewModelProvider is null, please call CKViewModelProvider#init first");
    }
}
