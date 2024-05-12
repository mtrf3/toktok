package X;

import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;

/* loaded from: classes11.dex */
public final class OX3 implements C10I<String, OX4> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C62114OZi LIZJ;

    @Override // X.C10I
    public final OX4 then(C10K<String> c10k) {
        if (this.LIZ.isEmpty()) {
            C62129OZx c62129OZx = this.LIZJ.LJII;
            String str = this.LIZIZ;
            c62129OZx.getClass();
            if (C77119UOl.LJIILLIIL(str)) {
                try {
                    str = DeepLinkServiceImpl.LIZ().LJIJJLI(str);
                } catch (Exception unused) {
                    str = "";
                }
            }
            return new OX4(str);
        }
        return new OX4(this.LIZ);
    }

    public OX3(C62114OZi c62114OZi, String str, String str2, int i) {
        this.LIZJ = c62114OZi;
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
