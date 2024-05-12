package X;

import kotlin.jvm.internal.o;

/* renamed from: X.HLo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43920HLo implements InterfaceC65753PrJ<Object> {
    public final /* synthetic */ InterfaceC43919HLn<Object> LIZ;

    public C43920HLo(C84657XKj c84657XKj) {
        this.LIZ = c84657XKj;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LIZ.LJJ(t);
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(Object obj) {
        this.LIZ.LJ(obj);
    }
}
