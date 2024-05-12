package com.ss.android.ugc.aweme.influencer;

import X.C113554cx;
import X.C38049EwX;
import X.C38150EyA;
import X.C47261Igj;
import X.C58096Mr6;
import X.F3T;
import X.InterfaceC38012Evw;
import X.InterfaceC38186Eyk;
import X.OSZ;
import android.content.Context;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.CopyTextToPasteBoardMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.CopyTextToPasteBoardMethodCrossPlatform;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenSchemaSingleTaskMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenSchemaSingleTaskMethodCrossPlatform;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenWhatsAppChatMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenWhatsAppChatMethodCrossPlatform;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.SendEmailMethod;
import com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.SendEmailMethodCrossPlatform;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ECommerceLiveBridgeMethodServiceImpl implements IECommerceLiveBridgeService {
    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService
    public final Map<String, Class<?>> LIZLLL() {
        return C113554cx.LJJL(new OSZ("openSingletonSchema", OpenSchemaSingleTaskMethod.class), new OSZ("routeToWhatsapp", OpenWhatsAppChatMethod.class), new OSZ("copyTextToPasteBoard", CopyTextToPasteBoardMethod.class), new OSZ("sendEMailTo", SendEmailMethod.class));
    }

    public static IECommerceLiveBridgeService LJ() {
        Object LIZ = C58096Mr6.LIZ(IECommerceLiveBridgeService.class, false);
        if (LIZ != null) {
            return (IECommerceLiveBridgeService) LIZ;
        }
        if (C58096Mr6.v1 == null) {
            synchronized (IECommerceLiveBridgeService.class) {
                if (C58096Mr6.v1 == null) {
                    C58096Mr6.v1 = new ECommerceLiveBridgeMethodServiceImpl();
                }
            }
        }
        return C58096Mr6.v1;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService
    public final List<InterfaceC38186Eyk> LIZ(F3T contextProvider) {
        o.LJIIIZ(contextProvider, "contextProvider");
        return C47261Igj.LJJIJIIJI(new OpenSchemaSingleTaskMethod(contextProvider), new OpenWhatsAppChatMethod(contextProvider), new CopyTextToPasteBoardMethod(contextProvider), new SendEmailMethod(contextProvider));
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService
    public final Map<String, InterfaceC38012Evw> LIZIZ(C38150EyA dmtJsBridge, WeakReference<Context> weakReference) {
        o.LJIIIZ(dmtJsBridge, "dmtJsBridge");
        C38049EwX c38049EwX = dmtJsBridge.LJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        OpenSchemaSingleTaskMethodCrossPlatform openSchemaSingleTaskMethodCrossPlatform = new OpenSchemaSingleTaskMethodCrossPlatform(c38049EwX);
        openSchemaSingleTaskMethodCrossPlatform.attach(weakReference);
        o.LJIIIIZZ(openSchemaSingleTaskMethodCrossPlatform, "OpenSchemaSingleTaskMeth…JsBridge).attach(weakRef)");
        linkedHashMap.put("openSingletonSchema", openSchemaSingleTaskMethodCrossPlatform);
        OpenWhatsAppChatMethodCrossPlatform openWhatsAppChatMethodCrossPlatform = new OpenWhatsAppChatMethodCrossPlatform(c38049EwX);
        openWhatsAppChatMethodCrossPlatform.attach(weakReference);
        o.LJIIIIZZ(openWhatsAppChatMethodCrossPlatform, "OpenWhatsAppChatMethodCr…JsBridge).attach(weakRef)");
        linkedHashMap.put("routeToWhatsapp", openWhatsAppChatMethodCrossPlatform);
        CopyTextToPasteBoardMethodCrossPlatform copyTextToPasteBoardMethodCrossPlatform = new CopyTextToPasteBoardMethodCrossPlatform(c38049EwX);
        copyTextToPasteBoardMethodCrossPlatform.attach(weakReference);
        o.LJIIIIZZ(copyTextToPasteBoardMethodCrossPlatform, "CopyTextToPasteBoardMeth…JsBridge).attach(weakRef)");
        linkedHashMap.put("copyTextToPasteBoard", copyTextToPasteBoardMethodCrossPlatform);
        SendEmailMethodCrossPlatform sendEmailMethodCrossPlatform = new SendEmailMethodCrossPlatform(c38049EwX);
        sendEmailMethodCrossPlatform.attach(weakReference);
        o.LJIIIIZZ(sendEmailMethodCrossPlatform, "SendEmailMethodCrossPlat…JsBridge).attach(weakRef)");
        linkedHashMap.put("sendEMailTo", sendEmailMethodCrossPlatform);
        return linkedHashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService
    public final BaseCommonJavaMethod LIZJ(C38150EyA c38150EyA, WeakReference weakReference, String name) {
        o.LJIIIZ(name, "name");
        C38049EwX c38049EwX = c38150EyA.LJ;
        switch (name.hashCode()) {
            case 9705954:
                if (name.equals("openSingletonSchema")) {
                    OpenSchemaSingleTaskMethodCrossPlatform openSchemaSingleTaskMethodCrossPlatform = new OpenSchemaSingleTaskMethodCrossPlatform(c38049EwX);
                    openSchemaSingleTaskMethodCrossPlatform.attach((WeakReference<Context>) weakReference);
                    return openSchemaSingleTaskMethodCrossPlatform;
                }
                return null;
            case 409811030:
                if (name.equals("routeToWhatsapp")) {
                    OpenWhatsAppChatMethodCrossPlatform openWhatsAppChatMethodCrossPlatform = new OpenWhatsAppChatMethodCrossPlatform(c38049EwX);
                    openWhatsAppChatMethodCrossPlatform.attach((WeakReference<Context>) weakReference);
                    return openWhatsAppChatMethodCrossPlatform;
                }
                return null;
            case 945092688:
                if (name.equals("copyTextToPasteBoard")) {
                    CopyTextToPasteBoardMethodCrossPlatform copyTextToPasteBoardMethodCrossPlatform = new CopyTextToPasteBoardMethodCrossPlatform(c38049EwX);
                    copyTextToPasteBoardMethodCrossPlatform.attach((WeakReference<Context>) weakReference);
                    return copyTextToPasteBoardMethodCrossPlatform;
                }
                return null;
            case 1477348015:
                if (name.equals("sendEMailTo")) {
                    SendEmailMethodCrossPlatform sendEmailMethodCrossPlatform = new SendEmailMethodCrossPlatform(c38049EwX);
                    sendEmailMethodCrossPlatform.attach((WeakReference<Context>) weakReference);
                    return sendEmailMethodCrossPlatform;
                }
                return null;
            default:
                return null;
        }
    }
}
