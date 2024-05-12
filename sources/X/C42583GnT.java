package X;

/* renamed from: X.GnT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42583GnT extends AbstractC65781Prl implements InterfaceC88471Ynr<Long, String, C76800UCe> {
    public static final C42583GnT LJLIL = new C42583GnT();

    public C42583GnT() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Long l, String str) {
        long longValue = l.longValue();
        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("duration", Long.valueOf(longValue));
        c6bk.LIZ.put("stickid", str);
        LJJIIZI.LJIIL(0, "upload_pic_sticker_loading_time", c6bk.LJ());
        return C76800UCe.LIZ;
    }
}
