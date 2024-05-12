package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UwJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78803UwJ extends FragmentStateAdapter {
    public final List<List<C78801UwH>> LJLL;
    public final InterfaceC84497XEf LJLLI;
    public final InterfaceC78821Uwb LJLLILLLL;
    public final Effect LJLLJ;
    public final Effect LJLLL;
    public final C78804UwK LJLLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLL.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LJZ(int i) {
        return new OptionCategoryFragment((List) ListProtector.get(this.LJLL, i), this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78803UwJ(FragmentManager fragmentManager, Lifecycle lifecycle, List result, InterfaceC84498XEg interfaceC84498XEg, C78826Uwg c78826Uwg, Effect effect, Effect effect2, C78804UwK c78804UwK) {
        super(fragmentManager, lifecycle);
        o.LJIIIZ(result, "result");
        this.LJLL = result;
        this.LJLLI = interfaceC84498XEg;
        this.LJLLILLLL = c78826Uwg;
        this.LJLLJ = effect;
        this.LJLLL = effect2;
        this.LJLLLL = c78804UwK;
    }
}
