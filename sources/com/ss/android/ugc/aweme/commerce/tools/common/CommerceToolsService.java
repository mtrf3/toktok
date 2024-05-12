package com.ss.android.ugc.aweme.commerce.tools.common;

import X.C41660GWq;
import X.C58096Mr6;
import X.C59895Nf1;
import X.C78934UyQ;
import X.GTF;
import X.H92;
import X.InterfaceC51059K2d;
import android.content.Context;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.services.external.ICommerceToolsService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class CommerceToolsService implements ICommerceToolsService {
    public static ICommerceToolsService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceToolsService.class, false);
        if (LIZ != null) {
            return (ICommerceToolsService) LIZ;
        }
        if (C58096Mr6.LLLFF == null) {
            synchronized (ICommerceToolsService.class) {
                if (C58096Mr6.LLLFF == null) {
                    C58096Mr6.LLLFF = new CommerceToolsService();
                }
            }
        }
        return C58096Mr6.LLLFF;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final boolean isTcm() {
        return CommerceToolsTcmServiceImpl.LJIJJ().isTcm();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final InterfaceC51059K2d getMusicContext() {
        return H92.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final boolean isCommerceChallenge() {
        return C41660GWq.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final boolean usedCommerceSticker() {
        return C41660GWq.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final void openBrandedContentPage(Context context) {
        String str;
        o.LJIIIZ(context, "context");
        C78934UyQ.LJLIL.getCommerceService().getClass();
        BrandedContentToolSchema LIZ = GTF.LIZ();
        if (LIZ == null || (str = LIZ.brandedContentInfo) == null) {
            str = "https://support.tiktok.com/en/business-and-creator/creator-and-business-accounts/branded-content-on-tiktok";
        }
        C59895Nf1.LIZLLL(context, "aweme://webview/", "url", str);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final void setCommerceChallenge(boolean z) {
        C41660GWq.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final void handleReceptionByEvent(JSONObject obj, Context context) {
        o.LJIIIZ(obj, "obj");
        o.LJIIIZ(context, "context");
        CommerceToolsTcmServiceImpl.LJIJJ().LIZIZ(obj);
    }
}
