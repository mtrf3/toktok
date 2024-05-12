package X;

import Y.IDuS81S0200000_12;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.TJd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74433TJd extends AbstractC73941T0f<C58232MtI, FetchFavoriteListResponse> {
    public final String LIZJ;
    public final InterfaceC84497XEf LIZLLL;

    @Override // X.R30
    public final AbstractC73672Svk LJII(Object obj) {
        C58232MtI req = (C58232MtI) obj;
        o.LJIIIZ(req, "req");
        return AbstractC73672Svk.LJIIJ(new IDuS81S0200000_12(this, req, 6));
    }

    public C74433TJd(String panel, InterfaceC84497XEf effectPlatform) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZJ = panel;
        this.LIZLLL = effectPlatform;
    }
}
