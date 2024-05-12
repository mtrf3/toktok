package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceService;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS32S1300000_10;
import kotlin.jvm.internal.AqS52S1200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NtR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60789NtR implements J0G<C61259O2l> {
    public final boolean LIZ;
    public final EnumC61028NxI LIZIZ;
    public final C60737Nsb LIZJ;

    public C60789NtR(VNU lynxContext, boolean z, EnumC61028NxI enumC61028NxI) {
        C60726NsQ c60726NsQ;
        o.LJIIIZ(lynxContext, "lynxContext");
        this.LIZ = z;
        this.LIZIZ = enumC61028NxI;
        VNS LJI = lynxContext.LJI();
        C60737Nsb c60737Nsb = null;
        if ((LJI instanceof C60726NsQ) && (c60726NsQ = (C60726NsQ) LJI) != null) {
            c60737Nsb = c60726NsQ.getHybridContext();
        }
        this.LIZJ = c60737Nsb;
    }

    @Override // X.J0G
    public final void LIZ(String resUrl, InterfaceC88472Yns<? super C61259O2l, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super Throwable, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(resUrl, "resUrl");
        InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(this.LIZJ, null);
        if (LIZIZ instanceof IResourceService) {
            O1M o1m = new O1M(0);
            o1m.LJIIJJI = this.LIZJ;
            if (!this.LIZ) {
                C61091NyJ c61091NyJ = new C61091NyJ(true);
                c61091NyJ.LIZ = C47261Igj.LJJIJIL(EnumC61089NyH.GECKO, EnumC61089NyH.BUILTIN);
                o1m.LIZ = c61091NyJ;
            }
            ((IResourceService) LIZIZ).loadAsync(resUrl, o1m, new AqS52S1200000_10((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super C61259O2l, C76800UCe>) resUrl, (String) this, (C60789NtR) 7), new AqS175S0100000_9(interfaceC88471Ynr, (InterfaceC88471Ynr<? super Throwable, ? super Boolean, C76800UCe>) 497));
            return;
        }
        if (LIZIZ instanceof C39902FlK) {
            RequestParams requestParams = new RequestParams(null, 1, null);
            EnumC61028NxI enumC61028NxI = this.LIZIZ;
            if (enumC61028NxI != null) {
                requestParams.setResourceScene(enumC61028NxI);
            }
            if (!this.LIZ) {
                requestParams.setDisableCdn(true);
            }
            ((C39902FlK) LIZIZ).LIZLLL(resUrl, requestParams, new AqS32S1300000_10((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super C61259O2l, C76800UCe>) resUrl, (String) interfaceC88471Ynr, (InterfaceC88471Ynr<? super Throwable, ? super Boolean, C76800UCe>) this, (C60789NtR) 5));
            return;
        }
        interfaceC88471Ynr.invoke(new Throwable("resource loader is null"), Boolean.FALSE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C60789NtR(X.VNU r3, X.EnumC61028NxI r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto Le
            r1 = 1
        L5:
            r0 = r5 & 4
            if (r0 == 0) goto La
            r4 = 0
        La:
            r2.<init>(r3, r1, r4)
            return
        Le:
            r1 = 0
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60789NtR.<init>(X.VNU, X.NxI, int):void");
    }
}
