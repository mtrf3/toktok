package X;

/* renamed from: X.GnS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42582GnS extends AbstractC65781Prl implements InterfaceC88471Ynr<Long, String, C76800UCe> {
    public static final C42582GnS LJLIL = new C42582GnS();

    public C42582GnS() {
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
