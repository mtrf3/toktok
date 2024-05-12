package X;

import java.util.HashMap;

/* renamed from: X.CoT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32453CoT implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC32453CoT(long j, long j2, int i, int i2, String str) {
        this.LJLIL = j;
        this.LJLILLLLZI = i;
        this.LJLJI = j2;
        this.LJLJJI = i2;
        this.LJLJJL = str;
    }

    public final void LIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put("asset_id", Long.valueOf(this.LJLIL));
        hashMap.put("asset_type", Integer.valueOf(this.LJLILLLLZI));
        hashMap.put("download_assets_from", Long.valueOf(this.LJLJI));
        hashMap.put("error_code", Integer.valueOf(this.LJLJJI));
        hashMap.put("error_msg", this.LJLJJL);
        C0K2.LJII(1, C32454CoU.LIZ("ttlive_gift_asset_download_status"), hashMap);
        C0K2.LJII(1, C32454CoU.LIZIZ("ttlive_gift_asset_download_status"), hashMap);
        BKQ LIZIZ = BKQ.LIZIZ();
        String str = EnumC30551Byt.Gift.info;
        LIZIZ.getClass();
        BKQ.LJ(hashMap, str, "ttlive_gift_asset_download_status");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
