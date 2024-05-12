package X;

import android.content.Intent;
import java.util.LinkedHashMap;

/* renamed from: X.Mud, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58315Mud implements InterfaceC60176NjY {
    public final java.util.Map<Integer, InterfaceC58316Mue> LJLIL = new LinkedHashMap();

    @Override // X.InterfaceC60176NjY
    public final void LIZJ() {
        this.LJLIL.remove(666);
    }

    @Override // X.InterfaceC60176NjY
    public final void LIZIZ(O15 o15) {
        this.LJLIL.put(666, o15);
    }

    @Override // X.InterfaceC60176NjY
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC58316Mue interfaceC58316Mue = (InterfaceC58316Mue) ((LinkedHashMap) this.LJLIL).get(Integer.valueOf(i));
        if (interfaceC58316Mue != null) {
            interfaceC58316Mue.onActivityResult(i, i2, intent);
        }
    }
}
