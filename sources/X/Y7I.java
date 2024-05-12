package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y7I extends Y7J {
    public long LJLJJL;

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        C37951Eux c37951Eux;
        Y7M y7m;
        String str;
        Y7K y7k = (Y7K) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (c37951Eux = (C37951Eux) interfaceC38263Ezz.LJ(C37951Eux.class)) == null || (y7m = c37951Eux.LIZ) == null) {
            return;
        }
        long longValue = y7k.getTimeStamp().longValue();
        if (longValue < this.LJLJJL) {
            return;
        }
        this.LJLJJL = longValue;
        String command = y7k.getCommand();
        Object obj = null;
        switch (command.hashCode()) {
            case -1073342556:
                if (!command.equals("isPlaying")) {
                    return;
                }
                boolean isPlaying = y7m.isPlaying();
                XBaseModel LIZJ = ED5.LIZJ(Y7L.class, null);
                ((Y7L) LIZJ).setPlaying(Boolean.valueOf(isPlaying));
                c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
                return;
            case 3443508:
                if (!command.equals("play")) {
                    return;
                }
                y7m.play();
                return;
            case 3526264:
                if (!command.equals("seek")) {
                    return;
                }
                java.util.Map<String, Object> params = y7k.getParams();
                if (params != null) {
                    obj = params.get("time");
                }
                if (!(obj instanceof String) || (str = (String) obj) == null) {
                    return;
                }
                y7m.LIZ(CastIntegerProtector.parseInt(str));
                return;
            case 106440182:
                if (!command.equals("pause")) {
                    return;
                }
                y7m.pause();
                return;
            default:
                return;
        }
    }
}
