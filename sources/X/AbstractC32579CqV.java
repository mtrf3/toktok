package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CqV */
/* loaded from: classes6.dex */
public abstract class AbstractC32579CqV {
    public final Context LJLIL;
    public final int LJLILLLLZI;
    public final C32543Cpv LJLJI;
    public View LJLJJI;
    public C32580CqW LJLJJL;
    public final List<AbstractC32517CpV> LJLJJLL;

    public void LJIILIIL() {
    }

    public void LJIILJJIL() {
    }

    public void LJIILL() {
    }

    public void LJIJI(User user, String str, boolean z) {
    }

    public OSZ<View, C018905p> LJIJJLI(Context context, ViewGroup parent, LayoutInflater layoutInflater) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        return null;
    }

    public void onStart() {
    }

    public final void LJIIJ() {
        this.LJLJI.LIZJ(EnumC32545Cpx.END);
        LJIILIIL();
    }

    public void LJIJJ() {
        if (this.LJLJI.LIZ != EnumC32545Cpx.END) {
            LJIIJ();
        }
        KL2.LIZIZ(this.LJLJJI);
        Iterator<AbstractC32517CpV> it = this.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJIJJ();
        }
    }

    public int LJIIL() {
        return this.LJLILLLLZI;
    }

    public static /* synthetic */ void LJJ(AbstractC32579CqV abstractC32579CqV) {
        abstractC32579CqV.LJIL(null, null, false);
    }

    public AbstractC32579CqV(Context context, int i) {
        C32543Cpv c32543Cpv = new C32543Cpv();
        this.LJLIL = context;
        this.LJLILLLLZI = i;
        this.LJLJI = c32543Cpv;
        this.LJLJJLL = new ArrayList();
    }

    public final void LIZ(int i, AbstractC32517CpV abstractC32517CpV) {
        ViewGroup viewGroup;
        C32580CqW c32580CqW;
        View view;
        Context context;
        LifecycleCoroutineScope lifecycleScope;
        View view2 = this.LJLJJI;
        if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(i)) != null && (c32580CqW = this.LJLJJL) != null && (view = this.LJLJJI) != null && (context = view.getContext()) != null && (lifecycleScope = c32580CqW.getLifecycleScope()) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new C32578CqU(abstractC32517CpV, context, viewGroup, this, null), 3);
        }
    }

    public final void LJIL(User user, String str, boolean z) {
        this.LJLJI.LIZJ(EnumC32545Cpx.START);
        LJIJI(user, str, z);
        onStart();
    }
}
