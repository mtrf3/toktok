package X;

import X.C0I6;
import com.bytedance.als.ui.state.LiveState;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1jl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41331jl<API_COMPONENT extends C0I6, STATE, ACTION> extends AbstractC29891Fh<API_COMPONENT> implements C0I6 {
    public final API_COMPONENT LJLIL = this;
    public final C5H3 LJLILLLLZI = C221108m2.LIZIZ(new IDqS420S0100000(this, 71));

    public abstract InterfaceC65784Pro<STATE> LJJLIIIJJI();

    public abstract InterfaceC65784Pro<ACTION> LJJLIIIJJIZ();

    public final C1NS<STATE> LJJLIIIJLLLLLLLZ() {
        return (C1NS) this.LJLILLLLZI.getValue();
    }

    public final STATE LJJLJ() {
        return LJJLIIIJLLLLLLLZ().LJ;
    }

    public final <SCENE extends AbstractC56012Ht<STATE, ACTION>> InterfaceC115514g7<Object, SCENE> LJJLJLI() {
        o.LJIJ();
        throw null;
    }

    @Override // X.AbstractC29891Fh
    public API_COMPONENT getApiComponent() {
        return this.LJLIL;
    }

    public final AbstractC56012Ht<STATE, ACTION> LJJLI(AbstractC56012Ht<STATE, ACTION> instance) {
        o.LJIIIZ(instance, "instance");
        instance.setUiStates(LJJLIIIJLLLLLLLZ());
        instance.setUiActions(LJJLIIIJJIZ().invoke());
        return instance;
    }

    public final AbstractC56012Ht<STATE, ACTION> LJJLIIIIJ(Class<?> clazz) {
        o.LJIIIZ(clazz, "clazz");
        Object newInstance = clazz.newInstance();
        if (newInstance != null) {
            return (AbstractC56012Ht) newInstance;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.als.ui.UIScene<STATE, ACTION>");
    }

    public final <V> LiveState<V> LJJLIIIJILLIZJL(TBW<STATE, ? extends V> property) {
        o.LJIIIZ(property, "property");
        C1NS<STATE> LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        LJJLIIIJLLLLLLLZ.getClass();
        return LJJLIIIJLLLLLLLZ.LIZIZ(property);
    }

    public final <V> LiveState<V> LJJLIIJ(TBW<STATE, ? extends V> property) {
        o.LJIIIZ(property, "property");
        C1NS<STATE> LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        LJJLIIIJLLLLLLLZ.getClass();
        return LJJLIIIJLLLLLLLZ.LIZIZ(property);
    }

    public final void LJJLL(InterfaceC88472Yns<? super STATE, ? extends STATE> block) {
        o.LJIIIZ(block, "block");
        C1NS<STATE> LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        LJJLIIIJLLLLLLLZ.getClass();
        LJJLIIIJLLLLLLLZ.LIZLLL(block, true);
    }

    public final void LJJZZI(InterfaceC88472Yns<? super STATE, ? extends STATE> block) {
        o.LJIIIZ(block, "block");
        LJJLIIIJLLLLLLLZ().LJ(block);
    }

    public final void LJJZZIII(InterfaceC88472Yns<? super STATE, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        block.invoke(LJJLJ());
    }
}
