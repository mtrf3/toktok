package Y;

import X.C09L;
import X.C0VK;
import X.InterfaceC65784Pro;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.TTEPVideoSaveViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDFactoryS409S0100000_7 implements ViewModelProvider.Factory {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        switch (this.$t) {
            case 0:
                return C09L.LIZIZ(this, cls, c0vk);
            case 1:
                return C09L.LIZIZ(this, cls, c0vk);
            default:
                return null;
        }
    }

    public IDFactoryS409S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final ViewModel create$0(IDFactoryS409S0100000_7 iDFactoryS409S0100000_7, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        Object invoke = ((InterfaceC65784Pro) iDFactoryS409S0100000_7.l0).invoke();
        o.LJII(invoke, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.commercialize.subpagemodule.ViewModelUtil.getViewModel$lambda$0.<no name provided>.create");
        return (ViewModel) invoke;
    }

    public static final ViewModel create$1(IDFactoryS409S0100000_7 iDFactoryS409S0100000_7, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new TTEPVideoSaveViewModel((PublishModel) ((TTEPVideoSaveActivity) iDFactoryS409S0100000_7.l0).LJLILLLLZI.getValue(), ((TTEPVideoSaveActivity) iDFactoryS409S0100000_7.l0).LIZLLL());
    }
}
