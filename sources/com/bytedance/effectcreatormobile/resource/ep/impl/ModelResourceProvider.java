package com.bytedance.effectcreatormobile.resource.ep.impl;

import X.AbstractC94464ahQ;
import X.C78555UsJ;
import X.C93726aVW;
import X.C93842aXO;
import X.C93843aXP;
import X.C94108abg;
import X.C94109abh;
import X.C94355aff;
import X.C94645akL;
import X.InterfaceC67352kd;
import X.InterfaceC93663aUV;
import X.XKS;
import com.bytedance.effectcreatormobile.modelselect.api.IModelResProvider;
import com.bytedance.effectcreatormobile.resource.ep.api.IEffectPlatformResourceProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class ModelResourceProvider implements IModelResProvider {
    public final C93842aXO config = C93843aXP.LIZ().getEffectPlatformConfig();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // com.bytedance.effectcreatormobile.modelselect.api.IModelResProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getFaceModel(X.InterfaceC67352kd<? super X.C94255ae3> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C94546aik
            if (r0 == 0) goto L86
            r5 = r8
            X.aik r5 = (X.C94546aik) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r6 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L4e
            if (r0 == r1) goto L46
            if (r0 != r3) goto L8c
            java.lang.Object r3 = r5.LJLJJL
            X.ae3 r3 = (X.C94255ae3) r3
            java.lang.Object r2 = r5.LJLJJI
            X.C141335gf.LIZJ(r6)
        L29:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r3.LJLJI
            r1.append(r0)
            java.lang.String r0 = "/faceStretchPointInfo.json"
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r3.LJLJL = r1
        L42:
            kotlin.jvm.internal.o.LJI(r2)
            return r2
        L46:
            java.lang.Object r1 = r5.LJLJJI
            com.bytedance.effectcreatormobile.resource.ep.impl.ModelResourceProvider r1 = (com.bytedance.effectcreatormobile.resource.ep.impl.ModelResourceProvider) r1
            X.C141335gf.LIZJ(r6)
            goto L70
        L4e:
            X.C141335gf.LIZJ(r6)
            X.aXO r0 = r7.config
            r0.getClass()
            X.aXO r0 = r7.config
            r0.getClass()
            X.akJ r2 = new X.akJ
            r2.<init>()
            r5.LJLJJI = r7
            r5.LJLILLLLZI = r1
            java.lang.String r1 = "effecttooldefault"
            java.lang.String r0 = "face_drag_model"
            java.lang.Object r6 = r7.categoryFetch(r1, r0, r2, r5)
            if (r6 != r4) goto L6f
            return r4
        L6f:
            r1 = r7
        L70:
            r2 = r6
            X.ae3 r2 = (X.C94255ae3) r2
            if (r2 == 0) goto L42
            java.lang.String r0 = r2.LJLJJI
            r5.LJLJJI = r2
            r5.LJLJJL = r2
            r5.LJLILLLLZI = r3
            java.lang.Object r0 = r1.downloadRes(r0, r5)
            if (r0 != r4) goto L84
            return r4
        L84:
            r3 = r2
            goto L29
        L86:
            X.aik r5 = new X.aik
            r5.<init>(r7, r8)
            goto L12
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.resource.ep.impl.ModelResourceProvider.getFaceModel(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.effectcreatormobile.modelselect.api.IModelResProvider
    public void getResourceList(InterfaceC93663aUV<? super C94355aff> listener) {
        o.LJIIIZ(listener, "listener");
        IEffectPlatformResourceProvider LIZ = C93726aVW.LIZ();
        this.config.getClass();
        LIZ.panelFetch("effecttoolmodel", new C94645akL(), listener);
    }

    public final Object downloadRes(String str, InterfaceC67352kd<? super String> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C93726aVW.LIZ().downloadRes(str, new C94109abh(xks));
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.modelselect.api.IModelResProvider
    public void downloadRes(String extra, InterfaceC93663aUV<? super String> resultListener) {
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(resultListener, "resultListener");
        C93726aVW.LIZ().downloadRes(extra, resultListener);
    }

    public final <T> Object categoryFetch(String str, String str2, AbstractC94464ahQ<T> abstractC94464ahQ, InterfaceC67352kd<? super T> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C93726aVW.LIZ().categoryFetch(str, str2, false, abstractC94464ahQ, new C94108abg(xks));
        return xks.LJIIJJI();
    }
}
