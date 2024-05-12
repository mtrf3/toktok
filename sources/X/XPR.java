package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class XPR implements InterfaceC86629XzF, XPT, InterfaceC26237ARl {
    public static final XPR LJLIL = new XPR();

    @Override // X.XPT
    public String getPath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(AVExternalServiceImpl.LIZ().configService().cacheConfig().musicDir());
        LIZ.append("download/");
        return X1D.LIZIZ(LIZ);
    }

    public static C84657XKj LIZ(C76L c76l) {
        o.LJIIIZ(c76l, "<this>");
        if (c76l.isDone()) {
            try {
                Object LIZ = P8D.LIZ(c76l);
                C84657XKj c84657XKj = new C84657XKj(null);
                c84657XKj.LJJLI(LIZ);
                return c84657XKj;
            } catch (ExecutionException e) {
                e = e;
                C84657XKj LIZ2 = C77275UUl.LIZ();
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                LIZ2.LJJ(e);
                return LIZ2;
            }
        }
        C84657XKj LIZ3 = C77275UUl.LIZ();
        C43920HLo c43920HLo = new C43920HLo(LIZ3);
        c76l.LJFF(new RunnableC65751PrH(c76l, c43920HLo), EnumC169566l6.LJLIL);
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C43918HLm(3000L, LIZ3, c76l, null), 2);
        LIZ3.LJJIII(new AqS173S0100000_7(c76l, (C76L<UploadAuthKeyConfig>) 427));
        return LIZ3;
    }

    @Override // X.InterfaceC86629XzF
    public boolean LJFF(String channel) {
        o.LJIIIZ(channel, "channel");
        return C04550Fv.LIZ.containsKey(channel);
    }

    @Override // X.InterfaceC86629XzF
    public void LJJLIIIJJIZ(java.util.Map map) {
        map.put("response-format", "protobuf");
    }

    @Override // X.InterfaceC26237ARl
    public void onWindowFocusChanged(boolean z) {
        if (z) {
            C61780OMm.LJIIIZ();
        }
    }

    @Override // X.InterfaceC86629XzF
    public JSONObject LIZJ(String channel, byte[] bArr, String dataMessage) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(dataMessage, "dataMessage");
        return C04550Fv.LIZ(channel, dataMessage, null, bArr);
    }
}
