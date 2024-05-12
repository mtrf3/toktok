package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.1wF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49071wF extends AbstractC65781Prl implements InterfaceC88472Yns<C24870yJ, Boolean> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ java.util.Map<C24860yI, C1OJ> LJLILLLLZI;
    public final /* synthetic */ InterfaceC24760y8<C10370av> LJLJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ C1OH LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49071wF(boolean z, java.util.Map map, InterfaceC35811ar interfaceC35811ar, InterfaceC70422pa interfaceC70422pa, InterfaceC65784Pro interfaceC65784Pro, C1OH c1oh) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = map;
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = interfaceC70422pa;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = c1oh;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C24870yJ c24870yJ) {
        int LIZLLL;
        int LIZLLL2;
        KeyEvent keyEvent = c24870yJ.LIZ;
        o.LJIIIZ(keyEvent, "keyEvent");
        boolean z = false;
        if (!this.LJLIL || C36071bH.LJIIIZ(keyEvent) != 2 || ((LIZLLL2 = (int) (C38891fp.LIZLLL(keyEvent.getKeyCode()) >> 32)) != 23 && LIZLLL2 != 66 && LIZLLL2 != 160)) {
            if (this.LJLIL && C36071bH.LJIIIZ(keyEvent) == 1 && ((LIZLLL = (int) (C38891fp.LIZLLL(keyEvent.getKeyCode()) >> 32)) == 23 || LIZLLL == 66 || LIZLLL == 160)) {
                C1OJ remove = this.LJLILLLLZI.remove(new C24860yI(C38891fp.LIZLLL(keyEvent.getKeyCode())));
                if (remove != null) {
                    XKX.LIZLLL(this.LJLJJI, null, null, new C2CF(this.LJLJJLL, remove, null), 3);
                }
                this.LJLJJL.invoke();
                z = true;
            }
        } else if (!this.LJLILLLLZI.containsKey(new C24860yI(C38891fp.LIZLLL(keyEvent.getKeyCode())))) {
            C1OJ c1oj = new C1OJ(this.LJLJI.getValue().LIZ);
            this.LJLILLLLZI.put(new C24860yI(C38891fp.LIZLLL(keyEvent.getKeyCode())), c1oj);
            XKX.LIZLLL(this.LJLJJI, null, null, new C2CE(this.LJLJJLL, c1oj, null), 3);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
