package com.bytedance.helios.network.fresco.impl;

import X.C65374PlC;
import X.C65896Ptc;
import X.C65922Pu2;
import X.W5P;
import android.net.Uri;
import com.bytedance.helios.network.api.service.IFrescoService;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class FrescoServiceImpl implements IFrescoService {
    public static final C65374PlC Companion = new C65374PlC();

    @Override // com.bytedance.helios.network.api.service.IFrescoService
    public void initNetworkStackEvent(C65896Ptc networkStackEvent) {
        String scheme;
        o.LJIIIZ(networkStackEvent, "networkStackEvent");
        ArrayList arrayList = new ArrayList();
        C65922Pu2 c65922Pu2 = networkStackEvent.LJLIL.LJLIL;
        if (c65922Pu2.LIZ == 400600) {
            Object obj = c65922Pu2.LJ;
            if (obj instanceof W5P) {
                if (obj != null) {
                    Uri uri = ((W5P) obj).LIZ;
                    if (uri != null && (scheme = uri.getScheme()) != null && ujb.o.LJJJLIIL(scheme, "http", false)) {
                        arrayList.add(uri);
                    }
                    if (c65922Pu2.LJ == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.imagepipeline.request.ImageRequestBuilder");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.imagepipeline.request.ImageRequestBuilder");
                }
            }
        }
        networkStackEvent.LJLILLLLZI = arrayList;
    }
}
