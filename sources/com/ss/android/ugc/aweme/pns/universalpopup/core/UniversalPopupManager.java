package com.ss.android.ugc.aweme.pns.universalpopup.core;

import X.C10K;
import X.C16880lQ;
import X.C221108m2;
import X.C36822Eck;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C76800UCe;
import X.C76801UCf;
import X.C82932Wgi;
import X.C82934Wgk;
import X.EnumC39255Fat;
import X.InterfaceC36824Ecm;
import X.InterfaceC82923WgZ;
import X.InterfaceC82928Wge;
import X.InterfaceC88472Yns;
import Y.AgS77S0300000_14;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.universalpopup.api.network.UniversalPopupApi;
import com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity;
import com.ss.android.ugc.aweme.pns.universalpopup.core.utils.SingleLiveEvent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class UniversalPopupManager implements UniversalPopupService {
    public static UniversalPopupApi LIZIZ;
    public static InterfaceC82923WgZ LIZJ;
    public static InterfaceC36824Ecm LJI;
    public static UniversalPopupResponse LJIIIIZZ;
    public InterfaceC82928Wge LIZ;
    public static final C76801UCf LIZLLL = new C76801UCf(3);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C82932Wgi.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C82934Wgk.LJLIL);
    public static int LJII = EnumC39255Fat.SCENE_COLD_LAUNCH.getValue();
    public static final SingleLiveEvent<Boolean> LJIIIZ = new SingleLiveEvent<>();

    public static UniversalPopupService LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(UniversalPopupService.class, false);
        if (LIZ != null) {
            return (UniversalPopupService) LIZ;
        }
        if (C58096Mr6.V3 == null) {
            synchronized (UniversalPopupService.class) {
                if (C58096Mr6.V3 == null) {
                    C58096Mr6.V3 = new UniversalPopupManager();
                }
            }
        }
        return C58096Mr6.V3;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService
    public final void LIZJ() {
        ((C36822Eck) LJ.getValue()).LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService
    public final void LJI() {
        LJIIIZ.setValue(Boolean.TRUE);
    }

    public static void LJIIIZ(Context context) {
        List<UniversalPopup> popups;
        UniversalPopupResponse universalPopupResponse = LJIIIIZZ;
        if (universalPopupResponse == null || (popups = universalPopupResponse.getPopups()) == null || popups.isEmpty()) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) UniversalPopupActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(65536);
        intent.putExtra("universal_popup_response", LJIIIIZZ);
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService
    public final void LIZIZ(InterfaceC82923WgZ callback) {
        o.LJIIIZ(callback, "callback");
        LIZJ = callback;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService
    public final void LJFF(InterfaceC82928Wge interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        this.LIZ = interceptor;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService
    public final void LJII(UniversalPopupApi popupApi) {
        o.LJIIIZ(popupApi, "popupApi");
        LIZIZ = popupApi;
        C36822Eck c36822Eck = (C36822Eck) LJ.getValue();
        c36822Eck.getClass();
        c36822Eck.LIZIZ = popupApi;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService
    public final void LIZ(Class<? extends UniversalPopupUI> cls, String style) {
        o.LJIIIZ(style, "style");
        C76801UCf c76801UCf = LIZLLL;
        c76801UCf.getClass();
        ((Map) c76801UCf.LJLIL).put(style, cls);
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService
    public final void LJ(InterfaceC36824Ecm loader, Context context) {
        o.LJIIIZ(loader, "loader");
        LJI = loader;
        loader.LIZ(EnumC39255Fat.SCENE_CUSTOMIZED_LOADER.getValue()).LJ(new AgS77S0300000_14(null, this, context, 0), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService
    public final void LIZLLL(int i, Context context, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        LJI = null;
        if (LIZIZ == null) {
            return;
        }
        LJII = i;
        ((C36822Eck) LJ.getValue()).LIZ(i).LJ(new AgS77S0300000_14(interfaceC88472Yns, this, context, 0), C10K.LJIIIIZZ, null);
    }
}
