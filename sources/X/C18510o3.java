package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0o3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18510o3 {
    public final C18810oX LIZ;
    public final C20140qg LIZIZ;
    public final C15010iP LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C20210qn LJFF;
    public final InterfaceC14950iJ LJI;
    public final C18900og LJII;
    public final InterfaceC18710oN LJIIIIZZ;
    public final InterfaceC88472Yns<C15010iP, C76800UCe> LJIIIZ;

    public C18510o3() {
        throw null;
    }

    public final void LIZ(List<? extends InterfaceC14750hz> list) {
        C14780i2 c14780i2 = this.LIZ.LIZJ;
        List<? extends InterfaceC14750hz> LLJILJILJ = ORZ.LLJILJILJ(list);
        ListProtector.add(LLJILJILJ, 0, new C1U4());
        this.LJIIIZ.invoke(c14780i2.LIZ(LLJILJILJ));
    }

    public C18510o3(C18810oX state, C20140qg selectionManager, C15010iP value, boolean z, boolean z2, C20210qn preparedSelectionState, InterfaceC14950iJ offsetMapping, C18900og c18900og, InterfaceC88472Yns onValueChange) {
        C1XS keyMapping = C18770oT.LIZ;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(selectionManager, "selectionManager");
        o.LJIIIZ(value, "value");
        o.LJIIIZ(preparedSelectionState, "preparedSelectionState");
        o.LJIIIZ(offsetMapping, "offsetMapping");
        o.LJIIIZ(keyMapping, "keyMapping");
        o.LJIIIZ(onValueChange, "onValueChange");
        this.LIZ = state;
        this.LIZIZ = selectionManager;
        this.LIZJ = value;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = preparedSelectionState;
        this.LJI = offsetMapping;
        this.LJII = c18900og;
        this.LJIIIIZZ = keyMapping;
        this.LJIIIZ = onValueChange;
    }
}
