package X;

/* renamed from: X.HqU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45318HqU implements InterfaceC65784Pro<Boolean> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLILLLLZI;
    public final C82631Wbr LJLIL;

    static {
        TBT tbt = new TBT(C45318HqU.class, "gameApiComponent", "getGameApiComponent()Lcom/ss/android/ugc/aweme/sticker/GameStickerApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLILLLLZI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        InterfaceC46211IBr interfaceC46211IBr = (InterfaceC46211IBr) this.LJLIL.LIZ(this, LJLILLLLZI[0]);
        if (interfaceC46211IBr != null) {
            z = interfaceC46211IBr.Qa0();
        }
        return Boolean.valueOf(z);
    }

    public C45318HqU(C82622Wbi c82622Wbi) {
        this.LJLIL = UCI.LJII(c82622Wbi, InterfaceC46211IBr.class, null);
    }
}
