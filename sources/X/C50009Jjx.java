package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jjx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50009Jjx extends O6R {
    public final /* synthetic */ AbstractC50008Jjw LJLJJI;

    @Override // X.O6R
    public final void LJJIII() {
        this.LJLJJI.getClass();
    }

    public C50009Jjx(AbstractC50008Jjw abstractC50008Jjw) {
        this.LJLJJI = abstractC50008Jjw;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        o.LJIIIZ(bridgeName, "bridgeName");
        this.LJLJJI.LIZIZ(new JSONObject(str), new C50007Jjv(c37945Eur));
    }
}
