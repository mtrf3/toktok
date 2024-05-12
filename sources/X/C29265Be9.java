package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.m;
import com.lynx.tasm.LynxEnv;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Be9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29265Be9 {
    public final InterfaceC88472Yns<m, C76800UCe> LIZ;
    public String LIZIZ = "{}";
    public java.util.Map<String, ? extends Object> LIZJ = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public C29265Be9(InterfaceC88472Yns<? super m, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    public final void LIZ(String url, C31886CfK jsBridgeManager, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        String str;
        Object LIZ;
        Object LIZ2;
        User owner;
        String LIZIZ;
        java.util.Set<Map.Entry> entrySet;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(jsBridgeManager, "jsBridgeManager");
        m mVar = new m();
        m mVar2 = new m();
        C65124PhA.LIZLLL().getClass();
        java.util.Map LIZIZ2 = C65124PhA.LIZIZ();
        if (LIZIZ2 != null && (entrySet = LIZIZ2.entrySet()) != null) {
            for (Map.Entry entry : entrySet) {
                mVar2.LJJIIZ((String) entry.getKey(), (String) entry.getValue());
                String str2 = (String) entry.getKey();
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -102670958) {
                        if (hashCode != 96572) {
                            if (hashCode == 25209764 && str2.equals("device_id")) {
                                mVar2.LJJIIZ("deviceId", (String) entry.getValue());
                            }
                        } else if (str2.equals("aid")) {
                            mVar2.LJJIIZ("appId", (String) entry.getValue());
                        }
                    } else if (str2.equals("version_name")) {
                        mVar2.LJJIIZ("appVersion", (String) entry.getValue());
                    }
                }
            }
        }
        mVar2.LJJIIJ("screenWidth", Float.valueOf(C15380j0.LJIJ(C15380j0.LJIIL())));
        mVar2.LJJIIJ("screenHeight", Float.valueOf(C15380j0.LJIJ(C15380j0.LJIIJJI())));
        LynxEnv.LJIIIZ().getClass();
        mVar2.LJJIIZ("lynx_version", "2.10.16-rc.10");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (room == null || (str = C17280m4.LIZ(room)) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        mVar2.LJJIIZ("room_id", str);
        mVar2.LJJIIZ("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null && (owner = room2.getOwner()) != null && (LIZIZ = C278817o.LIZIZ(owner)) != null) {
            str3 = LIZIZ;
        }
        mVar2.LJJIIZ("anchor_id", str3);
        mVar2.LJJIIJ("status_bar_height", Float.valueOf(C15380j0.LJIJ(C15450j7.LIZ(C15380j0.LIZLLL()))));
        mVar2.LJJIIZ("location", url);
        this.LIZ.invoke(mVar2);
        interfaceC88472Yns.invoke(mVar2);
        mVar.LJJII("__globalProps", mVar2);
        try {
            LIZ = C05600Jw.LIZJ(mVar);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = "{}";
        }
        this.LIZIZ = (String) LIZ;
        try {
            LIZ2 = C05600Jw.LIZLLL(mVar);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        C93833mF LJJJLIIL = C113554cx.LJJJLIIL();
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = LJJJLIIL;
        }
        this.LIZJ = (java.util.Map) LIZ2;
    }
}
