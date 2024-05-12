package X;

import com.lynx.tasm.LynxError;
import com.lynx.tasm.TemplateData;
import java.util.LinkedHashMap;
import ujb.o;

/* renamed from: X.Nws, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61002Nws extends AbstractC60815Ntr {
    public final String LJLILLLLZI;
    public final TemplateData LJLJI;
    public final InterfaceC88472Yns<String, C76800UCe> LJLJJI;
    public final InterfaceC88473Ynt<String, java.util.Map<String, ? extends Object>, Boolean, C76800UCe> LJLJJL;
    public final InterfaceC88472Yns<String, C76800UCe> LJLJJLL;
    public final InterfaceC88471Ynr<LynxError, String, C76800UCe> LJLJL;
    public final InterfaceC88472Yns<String, C76800UCe> LJLJLJ;
    public final InterfaceC88472Yns<java.util.Map<String, Object>, C76800UCe> LJLJLLL;
    public final InterfaceC88473Ynt<java.util.Map<String, Object>, java.util.Map<String, Long>, String, C76800UCe> LJLL;
    public final java.util.Map<String, C39947Fm3> LJLLI;
    public final java.util.Map<Object, Object> LJLLILLLL;

    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        if (C61001Nwr.LIZ[interfaceC60710NsA.getType().ordinal()] == 1) {
            C60606NqU c60606NqU = (C60606NqU) interfaceC60710NsA;
            String str = this.LJLILLLLZI;
            if (str != null && !o.LJJJJJL(str)) {
                c60606NqU.LIZJ = str;
            }
            TemplateData templateData = this.LJLJI;
            if (templateData != null) {
                c60606NqU.LJIIIIZZ = templateData;
            }
            java.util.Map<Object, Object> map = this.LJLLILLLL;
            if (map == null) {
                map = new LinkedHashMap<>();
            }
            c60606NqU.LJIIIZ = map;
            c60606NqU.LJJI = this.LJLLI;
            c60606NqU.LJI(new C61003Nwt(this, String.valueOf(c60606NqU.LJJIIJZLJL), c60606NqU.LJIL));
        }
    }

    public C61002Nws(TemplateData templateData, String bizLynxGroupName, java.util.Map map, java.util.Map map2, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, InterfaceC88472Yns interfaceC88472Yns3, InterfaceC88472Yns interfaceC88472Yns4, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88473Ynt interfaceC88473Ynt2) {
        kotlin.jvm.internal.o.LJIIIZ(bizLynxGroupName, "bizLynxGroupName");
        this.LJLILLLLZI = bizLynxGroupName;
        this.LJLJI = templateData;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = interfaceC88473Ynt;
        this.LJLJJLL = interfaceC88472Yns2;
        this.LJLJL = interfaceC88471Ynr;
        this.LJLJLJ = interfaceC88472Yns3;
        this.LJLJLLL = interfaceC88472Yns4;
        this.LJLL = interfaceC88473Ynt2;
        this.LJLLI = map;
        this.LJLLILLLL = map2;
    }
}
