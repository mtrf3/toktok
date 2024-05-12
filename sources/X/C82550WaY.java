package X;

import X.InterfaceC82548WaW;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WaY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82550WaY<T extends InterfaceC82548WaW> extends AbstractC45748HxQ {
    public static int LJLJLLL = -1;
    public final List<C82547WaV> LJLJJL;
    public final List<T> LJLJJLL;
    public C82622Wbi LJLJL;
    public final InterfaceC46304IFg LJLJLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJJLL).size();
    }

    public final T LJJIIZ(int i) {
        if (C77413UZt.LJIILL(this.LJLJJLL) || i < 0 || i >= ((ArrayList) this.LJLJJLL).size()) {
            return null;
        }
        return (T) ListProtector.get(this.LJLJJLL, i);
    }

    public final UserVisibleHintGroupScene LJJIIZI(int i) {
        LJLJLLL = i;
        if (i < ((ArrayList) this.LJLJJL).size()) {
            return (UserVisibleHintGroupScene) ListProtector.get(this.LJLJJL, i);
        }
        InterfaceC82548WaW interfaceC82548WaW = (InterfaceC82548WaW) ListProtector.get(this.LJLJJLL, i);
        C82622Wbi c82622Wbi = this.LJLJL;
        C82547WaV c82547WaV = new C82547WaV();
        c82547WaV.LJLJLJ = interfaceC82548WaW;
        c82547WaV.LJLLJ = c82622Wbi;
        c82547WaV.mArguments = C141415gn.LIZ("position", i);
        c82547WaV.LJLZ = this.LJLJLJ;
        ((ArrayList) this.LJLJJL).add(c82547WaV);
        return c82547WaV;
    }

    public C82550WaY(WMH wmh, C82553Wab c82553Wab) {
        super(wmh);
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new ArrayList();
        this.LJLJLJ = c82553Wab;
    }

    @Override // X.AbstractC45750HxS
    public final /* bridge */ /* synthetic */ Object LJJIIJ(int i, ViewGroup viewGroup) {
        return LJJIIZI(i);
    }
}
