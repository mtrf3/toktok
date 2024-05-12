package X;

import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;

/* renamed from: X.Nwt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61003Nwt extends LynxViewClient {
    public final /* synthetic */ C61002Nws LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ java.util.Map<String, Object> LIZJ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        boolean z;
        C61002Nws c61002Nws = this.LIZ;
        InterfaceC88473Ynt<String, java.util.Map<String, ? extends Object>, Boolean, C76800UCe> interfaceC88473Ynt = c61002Nws.LJLJJL;
        if (interfaceC88473Ynt != null) {
            String str = this.LIZIZ;
            java.util.Map<String, ? extends Object> map = this.LIZJ;
            if (c61002Nws.LJLJI != null) {
                z = true;
            } else {
                z = false;
            }
            interfaceC88473Ynt.invoke(str, map, Boolean.valueOf(z));
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZ.LJLJJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this.LIZIZ);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIFFI() {
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZ.LJLJLJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this.LIZIZ);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(String str) {
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZ.LJLJJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this.LIZIZ);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        InterfaceC88471Ynr<LynxError, String, C76800UCe> interfaceC88471Ynr = this.LIZ.LJLJL;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(lynxError, this.LIZIZ);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(java.util.Map<String, Object> map) {
        super.onTimingSetup(map);
        InterfaceC88472Yns<java.util.Map<String, Object>, C76800UCe> interfaceC88472Yns = this.LIZ.LJLJLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(map);
        }
    }

    public C61003Nwt(C61002Nws c61002Nws, String str, java.util.Map<String, Object> map) {
        this.LIZ = c61002Nws;
        this.LIZIZ = str;
        this.LIZJ = map;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJ(String str, java.util.Map map, java.util.Map map2) {
        InterfaceC88473Ynt<java.util.Map<String, Object>, java.util.Map<String, Long>, String, C76800UCe> interfaceC88473Ynt = this.LIZ.LJLL;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(map, map2, str);
        }
    }
}
