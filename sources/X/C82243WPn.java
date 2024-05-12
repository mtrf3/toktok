package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.WPn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82243WPn implements InterfaceC80707Vlv {
    public final /* synthetic */ C82241WPl LIZ;

    @Override // X.InterfaceC80707Vlv
    public final void LIZ(C164456cr c164456cr) {
    }

    @Override // X.InterfaceC80707Vlv
    public final void LIZIZ(C164456cr c164456cr) {
    }

    public C82243WPn(C82241WPl c82241WPl) {
        this.LIZ = c82241WPl;
    }

    @Override // X.InterfaceC80707Vlv
    public final void LIZJ(C164456cr tab, boolean z) {
        EffectCategoryResponse effectCategoryResponse;
        o.LJIIIZ(tab, "tab");
        View view = tab.LIZLLL;
        if (view == null) {
            return;
        }
        if (!(view instanceof THN)) {
            view = null;
        }
        THN thn = (THN) view;
        if (thn != null) {
            thn.LIZ(false);
        }
        C82241WPl c82241WPl = this.LIZ;
        InterfaceC82245WPp interfaceC82245WPp = c82241WPl.LJII;
        if (interfaceC82245WPp != null && (effectCategoryResponse = (EffectCategoryResponse) ORZ.LJLJLLL(((LinkedHashMap) c82241WPl.LIZ).keySet(), tab.LIZJ)) != null) {
            interfaceC82245WPp.LIZ(effectCategoryResponse, null);
        }
    }
}
