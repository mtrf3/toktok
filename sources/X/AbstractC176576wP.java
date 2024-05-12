package X;

/* renamed from: X.6wP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176576wP<Item, Response> extends AbstractC51036K1g<Item, Response> {
    public final C176566wO LJLIL = new C176566wO();
    public final C176616wT LJLILLLLZI = new C176616wT();

    @Override // X.AbstractC51036K1g, X.C8BS
    public final boolean sendRequest(Object... objArr) {
        C176566wO c176566wO = this.LJLIL;
        c176566wO.LIZ.clear();
        long currentTimeMillis = System.currentTimeMillis();
        c176566wO.LIZIZ = currentTimeMillis;
        c176566wO.LIZ.put("TimeStamp", String.valueOf(currentTimeMillis));
        this.LJLILLLLZI.LJ();
        return super.sendRequest(objArr);
    }
}
