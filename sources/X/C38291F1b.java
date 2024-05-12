package X;

import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import org.json.JSONObject;

/* renamed from: X.F1b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38291F1b implements InterfaceC60553Npd {
    @Override // X.InterfaceC60553Npd
    public final void LIZIZ(JSONObject jSONObject) {
        C86393XvR LJJIJIL;
        InterfaceC31203CMl interfaceC31203CMl;
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL == null || (LJJIJIL = LJJJLL.LJJIJIL()) == null || LJJIJIL.LJJZ() == null || (interfaceC31203CMl = C0K2.LIZ) == null) {
            return;
        }
        interfaceC31203CMl.LJIJ(jSONObject);
    }
}
