package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.bean.EcUgApiAllowlistModel;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.PdJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64885PdJ implements InterfaceC65108Pgu {
    public static final C64885PdJ LIZ = new C64885PdJ();

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC65108Pgu
    public final void LJIIIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        PY0 mutableUrl = c64907Pdf.LIZIZ;
        o.LJIIIZ(mutableUrl, "mutableUrl");
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcUgApiAllowlistModel ecUgApiAllowlistModel = C3BR.LIZ;
        EcUgApiAllowlistModel ecUgApiAllowlistModel2 = (EcUgApiAllowlistModel) LIZLLL.LJIIIIZZ("ec_mall_ug_allowlist_api", EcUgApiAllowlistModel.class, ecUgApiAllowlistModel);
        if (ecUgApiAllowlistModel2 != null) {
            ecUgApiAllowlistModel = ecUgApiAllowlistModel2;
        }
        for (String str : ecUgApiAllowlistModel.getApi()) {
            String str2 = mutableUrl.LJIIIIZZ;
            o.LJIIIIZZ(str2, "it.originUrl");
            if (s.LJJJLZIJ(str2, str, false)) {
                if (str != null && mutableUrl != null) {
                    OSZ LIZIZ = C61275O3b.LIZIZ();
                    mutableUrl.LJI.LIZLLL((String) LIZIZ.getFirst(), (String) LIZIZ.getSecond());
                    return;
                }
                return;
            }
        }
    }
}
