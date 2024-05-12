package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7oD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C196977oD implements InterfaceC197027oI {
    public InterfaceC196737np LJLIL;

    @Override // X.InterfaceC197027oI
    public void onDetach() {
        this.LJLIL = null;
    }

    @Override // X.InterfaceC197027oI
    public void LIZ(InterfaceC196737np player) {
        o.LJIIIZ(player, "player");
        this.LJLIL = player;
    }
}
