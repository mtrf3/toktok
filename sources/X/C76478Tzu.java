package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* renamed from: X.Tzu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76478Tzu implements InterfaceC15710jX {
    public final /* synthetic */ C76732zl LJLIL;

    public C76478Tzu(C76732zl c76732zl) {
        this.LJLIL = c76732zl;
    }

    @Override // X.InterfaceC15710jX
    public final void onFinish(boolean z) {
        String str;
        if (!z) {
            CL6.LIZIZ("match_in_progress");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("gecko_load_success", str);
        C75622Tm6.LJIJI(EnumC76429Tz7.START_ANIMATION, true, linkedHashMap);
        C76271TwZ.LIZ.LJJJ(this.LJLIL.element, false);
    }
}
