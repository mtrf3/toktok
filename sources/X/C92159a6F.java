package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.pipo.checkout.api.network.model.response.District;
import com.bytedance.pipo.checkout.element.component.business.address.AddressViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a6F, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92159a6F implements ViewModelProvider.Factory {
    public final C92083a51 LIZ;
    public final AbstractC91767Zzv LIZIZ;
    public final List<EnumC91763Zzr> LIZJ;
    public final EnumC91763Zzr LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final java.util.Map<EnumC91763Zzr, InterfaceC88472Yns<List<District>, C76800UCe>> LJI;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new AddressViewModel(this.LIZ, this.LIZIZ, this.LJ, this.LJFF, this.LIZJ, this.LIZLLL, this.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C92159a6F(C92083a51 apiService, AbstractC91767Zzv launchMode, List<? extends EnumC91763Zzr> states, EnumC91763Zzr initialState, String str, String str2, java.util.Map<EnumC91763Zzr, ? extends InterfaceC88472Yns<? super List<District>, C76800UCe>> onValueChanges) {
        o.LJIIIZ(apiService, "apiService");
        o.LJIIIZ(launchMode, "launchMode");
        o.LJIIIZ(states, "states");
        o.LJIIIZ(initialState, "initialState");
        o.LJIIIZ(onValueChanges, "onValueChanges");
        this.LIZ = apiService;
        this.LIZIZ = launchMode;
        this.LIZJ = states;
        this.LIZLLL = initialState;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = onValueChanges;
    }
}
