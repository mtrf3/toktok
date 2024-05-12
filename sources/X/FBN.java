package X;

/* loaded from: classes7.dex */
public final class FBN implements F9P {
    public final InterfaceC789838c LIZ;

    public FBN(InterfaceC789838c interfaceC789838c) {
        this.LIZ = interfaceC789838c;
    }

    @Override // X.F9P
    public final <T> T create(Class<T> cls) {
        return (T) this.LIZ.create(cls);
    }
}
