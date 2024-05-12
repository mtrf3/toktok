package Y;

import X.ActivityC45651qj;
import X.C09L;
import X.C0VK;
import X.C78826Uwg;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDFactoryS411S0100000_13 implements ViewModelProvider.Factory {
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

    public IDFactoryS411S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final ViewModel create$0(IDFactoryS411S0100000_13 iDFactoryS411S0100000_13, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        OptionCategoryPanelFragment optionCategoryPanelFragment = (OptionCategoryPanelFragment) iDFactoryS411S0100000_13.l0;
        Effect effect = optionCategoryPanelFragment.LJLJLJ;
        if (effect != null) {
            Effect effect2 = optionCategoryPanelFragment.LJLJLLL;
            String str = optionCategoryPanelFragment.LJLL;
            ActivityC45651qj requireActivity = optionCategoryPanelFragment.requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C78826Uwg c78826Uwg = ((OptionCategoryPanelFragment) iDFactoryS411S0100000_13.l0).LJLJJLL;
            if (c78826Uwg != null) {
                return new OptionCategoryPanelViewModel(effect, effect2, str, requireActivity, c78826Uwg);
            }
            o.LJIJI("manager");
            throw null;
        }
        o.LJIJI("panelEffect");
        throw null;
    }

    public static final ViewModel create$1(IDFactoryS411S0100000_13 iDFactoryS411S0100000_13, Class modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        ActivityC45651qj requireActivity = ((OptionCategoryFragment) iDFactoryS411S0100000_13.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        OptionCategoryFragment optionCategoryFragment = (OptionCategoryFragment) iDFactoryS411S0100000_13.l0;
        return new OptionCategoryViewModel(requireActivity, optionCategoryFragment.LJLILLLLZI, optionCategoryFragment.LJLJI, optionCategoryFragment.LJLJJI, optionCategoryFragment.LJLJJL);
    }
}
