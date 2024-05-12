package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MIu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56588MIu implements InterfaceC58626Mze<String> {
    public final String LIZ;
    public final InterfaceC58602MzG<?, ?>[] LIZIZ;
    public final InterfaceC58549MyP LIZJ;
    public final String LIZLLL;

    @Override // X.InterfaceC58626Mze
    public final InterfaceC58549MyP LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC58626Mze
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC58626Mze
    public final /* bridge */ /* synthetic */ String getEventId() {
        return this.LIZ;
    }

    @Override // X.InterfaceC58626Mze
    public final InterfaceC58602MzG<?, ?>[] getKeys() {
        return this.LIZIZ;
    }

    public C56588MIu(String str, InterfaceC58602MzG<?, ?>[] keys, InterfaceC58549MyP interfaceC58549MyP) {
        o.LJIIIZ(keys, "keys");
        this.LIZ = str;
        this.LIZIZ = keys;
        this.LIZJ = interfaceC58549MyP;
        this.LIZLLL = str;
    }
}
