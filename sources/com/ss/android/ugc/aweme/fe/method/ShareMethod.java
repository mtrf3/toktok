package com.ss.android.ugc.aweme.fe.method;

import X.AbstractC62226ObW;
import X.C38049EwX;
import X.C44498HdG;
import X.C62394OeE;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.ShareMethod;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShareMethod extends BaseCommonJavaMethod {
    public final ArrayList<String> LJLJI;

    public ShareMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public ShareMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = new ArrayList<>(Arrays.asList("qrcode", "browser", "refresh"));
    }

    public final void LIZIZ(final SharePackage sharePackage, C62394OeE c62394OeE) {
        if (!IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIILLIIL()) {
            return;
        }
        ShareDependService.LIZ.getClass();
        final ImChannel LJJIJIIJI = C44498HdG.LIZ().LJJIJIIJI(sharePackage, "");
        if (LJJIJIIJI != null) {
            c62394OeE.LIZIZ(new AbstractC62226ObW(LJJIJIIJI) { // from class: X.4RX
                @Override // X.AbstractC62223ObT, X.InterfaceC62225ObV
                public final boolean LJIIJ(AbstractC62625Ohx content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
                    o.LJIIIZ(content, "content");
                    o.LJIIIZ(context, "context");
                    ShareMethod shareMethod = this;
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    SharePackage sharePackage2 = sharePackage;
                    shareMethod.getClass();
                    o.LJIIIZ(sharePackage2, "sharePackage");
                    if (LJIIIIZZ == null) {
                        return false;
                    }
                    if (!((RBX) HG3.LJIILL()).isLogin()) {
                        J9P.LIZIZ(LJIIIIZZ, "", "click_shareim_button", null, null);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("share_package", sharePackage2);
                        IMService.createIIMServicebyMonsterPlugin(false).getRelationService().LIZIZ(LJIIIIZZ, bundle);
                        C44384HbQ.LLII("chat_merge");
                    }
                    return true;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x045f, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0472, code lost:
    
        r1 = r8.LJIIL(r5).LJIIJ(new Y.IDhS65S0200000_1(r5, r0, 1)).LIZLLL();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "channel: Channel, contex…}\n        }.blockingGet()");
        r1 = ((java.lang.Boolean) r1).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x046e, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v70, types: [T, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r54, final X.InterfaceC36488ETs r55) {
        /*
            Method dump skipped, instructions count: 1432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.ShareMethod.handle(org.json.JSONObject, X.ETs):void");
    }
}
