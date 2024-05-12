package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchArmiesMessageUpdateInterval;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UCf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76801UCf implements BMY {
    public final Object LJLIL;

    public C76801UCf(int i) {
        if (i != 2) {
            if (i != 3) {
                this.LJLIL = new C76802UCg();
                return;
            } else {
                this.LJLIL = new LinkedHashMap();
                return;
            }
        }
        this.LJLIL = new ArrayList();
    }

    public final void LIZ(C5MI c5mi) {
        if (!((List) this.LJLIL).contains(c5mi)) {
            ((List) this.LJLIL).add(c5mi);
        }
    }

    public final UniversalPopupUI LIZIZ(UniversalPopup universalPopup, UniversalPopupViewModel universalPopupUICallback) {
        UniversalPopupUI universalPopupUI;
        o.LJIIIZ(universalPopupUICallback, "universalPopupUICallback");
        Class cls = (Class) ((java.util.Map) this.LJLIL).get(universalPopup.getStyle());
        if (cls == null || (universalPopupUI = (UniversalPopupUI) cls.newInstance()) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("universal_popup", universalPopup);
        universalPopupUI.setArguments(bundle);
        universalPopupUI.LJLILLLLZI = universalPopupUICallback;
        return universalPopupUI;
    }

    public final void LIZJ(long j, InterfaceC76804UCi interfaceC76804UCi) {
        ((C76802UCg) this.LJLIL).LIZ();
        C76802UCg c76802UCg = (C76802UCg) this.LJLIL;
        c76802UCg.getClass();
        c76802UCg.LIZ = interfaceC76804UCi;
        ((C76802UCg) this.LJLIL).LIZIZ(j, LiveMatchArmiesMessageUpdateInterval.INSTANCE.getValue());
    }
}
