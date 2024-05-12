package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* renamed from: X.a6E, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92158a6E implements InterfaceC91758Zzm {
    public final InterfaceC70422pa LIZ;
    public final long LIZIZ;
    public final InterfaceC35811ar<Boolean> LIZJ;
    public final InterfaceC35811ar<Boolean> LIZLLL;

    public C92158a6E() {
        this(null);
    }

    @Override // X.InterfaceC91758Zzm
    public final void LIZ() {
        XKX.LIZLLL(this.LIZ, null, null, new C93049aKb(this, null), 3);
    }

    public final void LJFF() {
        XKX.LIZLLL(this.LIZ, null, null, new C93048aKa(this, null), 3);
    }

    @Override // X.InterfaceC91758Zzm
    public final /* bridge */ /* synthetic */ InterfaceC35811ar LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC91758Zzm
    public final long LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC91758Zzm
    public final /* bridge */ /* synthetic */ InterfaceC35811ar LJ() {
        return this.LIZJ;
    }

    public C92158a6E(Object obj) {
        C64962gm LIZ = C48841JEv.LIZ(C36636EZk.LIZ);
        Boolean bool = Boolean.FALSE;
        ParcelableSnapshotMutableState LJJJIL = C78966Uyw.LJJJIL(bool);
        ParcelableSnapshotMutableState LJJJIL2 = C78966Uyw.LJJJIL(bool);
        this.LIZ = LIZ;
        this.LIZIZ = 300L;
        this.LIZJ = LJJJIL;
        this.LIZLLL = LJJJIL2;
    }

    @Override // X.InterfaceC91758Zzm
    public final void LIZLLL(InterfaceC65784Pro<C76800UCe> onDismiss) {
        o.LJIIIZ(onDismiss, "onDismiss");
        XKX.LIZLLL(this.LIZ, null, null, new C93047aKZ(this, onDismiss, null), 3);
    }
}
