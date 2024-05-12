package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CgD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31941CgD {
    public abstract EnumC37847EtH LIZ();

    public final void LIZIZ(String str, InterfaceC78280Uns interfaceC78280Uns, InterfaceC31943CgF interfaceC31943CgF, C31889CfN xBridgeRegister) {
        InterfaceC37774Es6 LIZ;
        o.LJIIJ(xBridgeRegister, "xBridgeRegister");
        C31901CfZ c31901CfZ = (C31901CfZ) xBridgeRegister.LIZ.getValue();
        c31901CfZ.getClass();
        InterfaceC31940CgC interfaceC31940CgC = (InterfaceC31940CgC) ((LinkedHashMap) c31901CfZ.LIZ).get(str);
        if (interfaceC31940CgC != null && (LIZ = interfaceC31940CgC.LIZ()) != null) {
            LIZ.LIZJ(interfaceC78280Uns, interfaceC31943CgF, LIZ());
        }
    }
}
