package com.ss.android.ugc.aweme.pns.universalpopup.core;

import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C221108m2;
import X.C36822Eck;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C76800UCe;
import X.C76801UCf;
import X.C82933Wgj;
import X.C82935Wgl;
import X.InterfaceC36824Ecm;
import X.InterfaceC82923WgZ;
import X.InterfaceC82928Wge;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.universalpopup.api.network.UniversalPopupApi;
import com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity2;
import com.ss.android.ugc.aweme.pns.universalpopup.core.utils.SingleLiveEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class UniversalPopupManager2 implements UniversalPopupService2 {
    public static UniversalPopupApi LIZIZ;
    public static final C76801UCf LIZJ = new C76801UCf(3);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C82933Wgj.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C82935Wgl.LJLIL);
    public static final SingleLiveEvent<Boolean> LJFF = new SingleLiveEvent<>();
    public static final Map<String, InterfaceC82923WgZ> LJI = new LinkedHashMap();
    public static final Map<String, InterfaceC36824Ecm> LJII = new LinkedHashMap();
    public final AtomicInteger LIZ = new AtomicInteger(0);

    static {
        new Gson();
    }

    public static UniversalPopupService2 LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(UniversalPopupService2.class, false);
        if (LIZ != null) {
            return (UniversalPopupService2) LIZ;
        }
        if (C58096Mr6.W3 == null) {
            synchronized (UniversalPopupService2.class) {
                if (C58096Mr6.W3 == null) {
                    C58096Mr6.W3 = new UniversalPopupManager2();
                }
            }
        }
        return C58096Mr6.W3;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2
    public final void LIZ(Class<? extends UniversalPopupUI> cls, String style) {
        o.LJIIIZ(style, "style");
        C76801UCf c76801UCf = LIZJ;
        c76801UCf.getClass();
        ((Map) c76801UCf.LJLIL).put(style, cls);
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2
    public final void LIZJ(UniversalPopupApi popupApi, boolean z) {
        o.LJIIIZ(popupApi, "popupApi");
        LIZIZ = popupApi;
        C62822Ol8 c62822Ol8 = LIZLLL;
        C36822Eck c36822Eck = (C36822Eck) c62822Ol8.getValue();
        c36822Eck.getClass();
        c36822Eck.LIZIZ = popupApi;
        ((C36822Eck) c62822Ol8.getValue()).LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2
    public final void LIZIZ(final int i, final Context context, final InterfaceC82923WgZ interfaceC82923WgZ, final InterfaceC82928Wge interfaceC82928Wge, final InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        final C36822Eck c36822Eck = (C36822Eck) LIZLLL.getValue();
        c36822Eck.LIZ(i).LJ(new C10I() { // from class: X.Wga
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
            
                if (X.C76800UCe.LIZ == null) goto L27;
             */
            @Override // X.C10I
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object then(X.C10K r13) {
                /*
                    Method dump skipped, instructions count: 265
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C82924Wga.then(X.10K):java.lang.Object");
            }
        }, C10K.LJIIIIZZ, null);
    }

    public final void LJ(int i, UniversalPopupResponse universalPopupResponse, Context context, InterfaceC82923WgZ interfaceC82923WgZ, InterfaceC36824Ecm interfaceC36824Ecm) {
        List<UniversalPopup> popups = universalPopupResponse.getPopups();
        if (popups == null || popups.isEmpty()) {
            return;
        }
        int incrementAndGet = this.LIZ.incrementAndGet();
        if (interfaceC82923WgZ != null) {
            LJI.put(String.valueOf(incrementAndGet), interfaceC82923WgZ);
        }
        if (interfaceC36824Ecm != null) {
            LJII.put(String.valueOf(incrementAndGet), interfaceC36824Ecm);
        }
        Intent intent = new Intent(context, (Class<?>) UniversalPopupActivity2.class);
        intent.addFlags(268435456);
        intent.addFlags(65536);
        Bundle bundle = new Bundle();
        bundle.putSerializable("universal_popup_response", universalPopupResponse);
        bundle.putInt("universal_popup_scene", i);
        bundle.putInt("universal_popup_activity_id", incrementAndGet);
        intent.putExtras(bundle);
        C16880lQ.LIZJ(context, intent);
    }
}
