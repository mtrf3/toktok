package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tm4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75620Tm4 {
    None(0),
    QuickPairing(1),
    Invited(2),
    Received(3),
    Applied(4),
    Prepared(5),
    Linked(6),
    Finished(7);

    public final int LJLIL;

    public static EnumC75620Tm4 valueOf(String str) {
        return (EnumC75620Tm4) V0N.LJJJ(EnumC75620Tm4.class, str);
    }

    public final boolean isApplying() {
        if (Applied == this) {
            return true;
        }
        return false;
    }

    public final boolean isIdle() {
        if (None == this || Finished == this) {
            return true;
        }
        return false;
    }

    public final boolean isInProgress() {
        int i = this.LJLIL;
        if (i >= Invited.LJLIL && i <= Linked.LJLIL) {
            return true;
        }
        return false;
    }

    public final boolean isJoiningOrLinked() {
        int i = this.LJLIL;
        if (i >= Invited.LJLIL && i <= Linked.LJLIL) {
            return true;
        }
        return false;
    }

    public final boolean isLinked() {
        if (Linked == this) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    public final boolean atLeast(EnumC75620Tm4 targetState) {
        o.LJIIIZ(targetState, "targetState");
        if (this.LJLIL >= targetState.LJLIL) {
            return true;
        }
        return false;
    }

    EnumC75620Tm4(int i) {
        this.LJLIL = i;
    }
}
