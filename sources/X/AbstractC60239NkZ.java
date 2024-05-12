package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NkZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC60239NkZ<T extends View> extends AbstractC60240Nka implements InterfaceC60212Nk8<T> {
    public final List<C60213Nk9<T>> LLFF;
    public final AtomicBoolean LLFFF;
    public final AtomicBoolean LLFII;
    public final InterfaceC60276NlA LLFZ;

    @Override // X.AbstractC60240Nka
    public void LJII() {
    }

    public abstract void LJIILL(AqS141S0200000_10 aqS141S0200000_10);

    public abstract void LJIILLIIL();

    public abstract void LJIIZILJ();

    @Override // X.AbstractC60240Nka, X.InterfaceC40516FvE
    public abstract /* synthetic */ void onEvent(F22 f22);

    public final InterfaceC60187Njj LJIJ() {
        return (InterfaceC60187Njj) this.LLF.LIZJ(InterfaceC60187Njj.class);
    }

    public final void LJIJI() {
        this.LLFII.getAndSet(true);
        if (this.LLFFF.compareAndSet(true, true)) {
            g();
        }
    }

    @Override // X.AbstractC60240Nka, X.InterfaceC40516FvE
    public final void LLJILJIL() {
        InterfaceC60285NlJ interfaceC60285NlJ = (InterfaceC60285NlJ) this.LLF.LIZJ(InterfaceC60285NlJ.class);
        if (interfaceC60285NlJ != null) {
            interfaceC60285NlJ.LJZ();
        }
        C39973FmT.LIZIZ(this, "onHide success", null, null, 6);
        LJIILLIIL();
    }

    @Override // X.AbstractC60240Nka, X.InterfaceC40516FvE
    public final void g() {
        InterfaceC60285NlJ interfaceC60285NlJ = (InterfaceC60285NlJ) this.LLF.LIZJ(InterfaceC60285NlJ.class);
        if (interfaceC60285NlJ != null) {
            interfaceC60285NlJ.LJJIIJZLJL();
        }
        C39973FmT.LIZIZ(this, "onShow success", null, null, 6);
        LJIIZILJ();
    }

    @Override // X.AbstractC60240Nka
    public void LJIIIZ() {
        InterfaceC60187Njj LJIJ = LJIJ();
        if (LJIJ != null) {
            LJIJ.LIZ(new C60243Nkd(this));
        }
    }

    @Override // X.AbstractC60240Nka, X.InterfaceC40516FvE
    public final void be(Throwable th) {
        super.be(th);
        ((ArrayList) this.LLFF).clear();
    }

    public void LJIJJ(C60213Nk9<T> viewComponent, android.net.Uri uri) {
        o.LJIIJ(viewComponent, "viewComponent");
        o.LJIIJ(uri, "uri");
        T view = viewComponent.LIZIZ;
        o.LJIIJ(view, "view");
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC60277NlB());
    }

    @Override // X.InterfaceC40516FvE
    public final void Ka(String actionType, List<String> name, List<? extends JSONObject> params) {
        o.LJIIJ(actionType, "actionType");
        o.LJIIJ(name, "name");
        o.LJIIJ(params, "params");
        ((ArrayList) this.LJLZ).clear();
        Iterator<String> it = name.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i >= 0) {
                ((ArrayList) this.LJLZ).add(new C39435Fdn(actionType, (String) ListProtector.get(name, i), (JSONObject) ListProtector.get(params, i), getLoggerWrapper()));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC60239NkZ(InterfaceC60250Nkk kitApi, F21 sessionInfo, List packageNames, C60251Nkl c60251Nkl, F3T providerFactory) {
        super(kitApi, sessionInfo, packageNames, c60251Nkl, providerFactory);
        o.LJIIJ(kitApi, "kitApi");
        o.LJIIJ(sessionInfo, "sessionInfo");
        o.LJIIJ(packageNames, "packageNames");
        o.LJIIJ(providerFactory, "providerFactory");
        this.LLFF = new ArrayList();
        this.LLFFF = new AtomicBoolean(false);
        this.LLFII = new AtomicBoolean(false);
        this.LLFZ = (InterfaceC60276NlA) C60299NlX.LIZ(this, InterfaceC60276NlA.class);
    }
}
