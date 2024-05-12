package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.google.android.play.core.appupdate.u;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wj0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83074Wj0 extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PROTECT;
    public final String LIZJ = "x.login";

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83076Wj2> LIZ() {
        return C83076Wj2.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83077Wj3> LIZLLL() {
        return C83077Wj3.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        C86291Xtn c86291Xtn;
        IHostUserDepend iHostUserDepend;
        IHostRouterDepend iHostRouterDepend;
        Object valueOf;
        C86291Xtn c86291Xtn2;
        IHostRouterDepend iHostRouterDepend2;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        int i = 1;
        if ((params.hasKey("context") && params.getType("context") != EnumC78522Urm.Map) || (params.hasKey("keepOpen") && params.getType("keepOpen") != EnumC78522Urm.Boolean)) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
            return;
        }
        InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(params, "context");
        boolean LJJIIZI = u.LJJIIZI(params, "keepOpen", true);
        C83076Wj2 c83076Wj2 = new C83076Wj2();
        if (LJJIJIIJIL != null) {
            c83076Wj2.LIZ = LJJIJIIJIL;
            c83076Wj2.LIZIZ = LJJIIZI;
        }
        C83075Wj1 c83075Wj1 = new C83075Wj1(this, interfaceC31943CgF);
        Context context = (Context) LJII(Context.class);
        if (context != null) {
            Activity LIZ = HT4.LIZ(context);
            if (LIZ != null) {
                C86291Xtn c86291Xtn3 = (C86291Xtn) LJII(C86291Xtn.class);
                if ((c86291Xtn3 != null && (iHostUserDepend = c86291Xtn3.LJII) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostUserDepend = c86291Xtn.LJII) != null)) {
                    if (iHostUserDepend.hasLogin()) {
                        C83077Wj3 c83077Wj3 = new C83077Wj3();
                        c83077Wj3.LIZ = "loggedIn";
                        c83077Wj3.LIZIZ = Boolean.TRUE;
                        c83075Wj1.LIZ(c83077Wj3, "");
                        if (!c83076Wj2.LIZIZ && (c86291Xtn2 = C86291Xtn.LJIIL) != null && (iHostRouterDepend2 = c86291Xtn2.LJI) != null) {
                            iHostRouterDepend2.closeView(this.LIZ, type, "", false);
                            return;
                        }
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    InterfaceC78280Uns interfaceC78280Uns = c83076Wj2.LIZ;
                    if (interfaceC78280Uns != null) {
                        UFL LIZ2 = interfaceC78280Uns.LIZ();
                        while (LIZ2.hasNextKey()) {
                            String nextKey = LIZ2.nextKey();
                            InterfaceC78505UrV interfaceC78505UrV = interfaceC78280Uns.get(nextKey);
                            int i2 = C77895Uhf.LIZ[interfaceC78505UrV.getType().ordinal()];
                            if (i2 != i) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 == 4) {
                                            linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asBoolean()));
                                        }
                                    } else {
                                        linkedHashMap.put(nextKey, interfaceC78505UrV.asString());
                                    }
                                } else {
                                    linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asDouble()));
                                }
                            } else {
                                linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asInt()));
                            }
                            i = 1;
                        }
                    }
                    C83078Wj4 c83078Wj4 = new C83078Wj4(iHostUserDepend, c83075Wj1);
                    if (c83076Wj2.LIZIZ) {
                        iHostUserDepend.login(LIZ, c83078Wj4, linkedHashMap);
                        valueOf = C76800UCe.LIZ;
                    } else {
                        IHostUserDepend.LoginParamsExt loginParamsExt = new IHostUserDepend.LoginParamsExt();
                        loginParamsExt.setKeepOpen(c83076Wj2.LIZIZ);
                        iHostUserDepend.login(LIZ, c83078Wj4, linkedHashMap, loginParamsExt);
                        C86291Xtn c86291Xtn4 = C86291Xtn.LJIIL;
                        if (c86291Xtn4 != null && (iHostRouterDepend = c86291Xtn4.LJI) != null) {
                            valueOf = Boolean.valueOf(iHostRouterDepend.closeView(this.LIZ, type, "", false));
                        }
                    }
                    if (valueOf != null) {
                        return;
                    }
                }
                c83075Wj1.LIZIZ("hostUserDepend is null");
                return;
            }
            c83075Wj1.LIZIZ("context can not convert to activity");
            return;
        }
        c83075Wj1.LIZIZ("context is null");
    }
}
