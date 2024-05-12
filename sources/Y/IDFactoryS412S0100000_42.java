package Y;

import X.C09L;
import X.C0VK;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsFragment;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import com.bytedance.ugc.effectcreator.main.MainViewModel;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDFactoryS412S0100000_42 implements ViewModelProvider.Factory {
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

    public IDFactoryS412S0100000_42(IDqS423S0100000_42 iDqS423S0100000_42, int i) {
        this.$t = i;
        this.l0 = iDqS423S0100000_42;
    }

    public static final ViewModel create$0(IDFactoryS412S0100000_42 iDFactoryS412S0100000_42, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        Bundle arguments = ((GifsFragment) ((IDqS423S0100000_42) iDFactoryS412S0100000_42.l0).l0).getArguments();
        o.LJI(arguments);
        String string = arguments.getString("key_gif_source");
        o.LJI(string);
        return new GifsViewModel(string);
    }

    public static final ViewModel create$1(IDFactoryS412S0100000_42 iDFactoryS412S0100000_42, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new MainViewModel(((MainFragment) ((IDqS423S0100000_42) iDFactoryS412S0100000_42.l0).l0).getEnterFrom());
    }
}
