package com.bytedance.pia.core.bridge.protocol;

import X.C141335gf;
import X.C37428EmW;
import X.C37595EpD;
import X.C37692Eqm;
import X.C3C5;
import X.InterfaceC65349Pkn;
import X.V0N;
import android.text.TextUtils;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.j;
import com.google.gson.m;

/* loaded from: classes7.dex */
public final class ProtocolMessage {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("data")
    public final m data;

    @InterfaceC65349Pkn("id")
    public final Integer id;

    @InterfaceC65349Pkn("err_msg")
    public final String message;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("type")
    public final Type type;

    /* loaded from: classes7.dex */
    public enum Type {
        Invocation,
        Callback;

        public static Type valueOf(String str) {
            return (Type) V0N.LJJJ(Type.class, str);
        }
    }

    public static final m LIZ(C37428EmW c37428EmW) {
        Object LIZ2;
        j LJIJJLI;
        int i = c37428EmW.LIZ;
        Object obj = null;
        if (i == 0) {
            return null;
        }
        try {
            LJIJJLI = GsonUtils.LIZIZ().LJIJJLI(new ProtocolMessage(Type.Callback, Integer.valueOf(i), c37428EmW.LIZJ, null, Integer.valueOf(c37428EmW.LIZIZ), c37428EmW.LIZLLL));
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (LJIJJLI != null) {
            LIZ2 = (m) LJIJJLI;
            C3C5.m7constructorimpl(LIZ2);
            if (!C3C5.m12isFailureimpl(LIZ2)) {
                obj = LIZ2;
            }
            return (m) obj;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.google.gson.JsonObject");
    }

    public static final m LIZIZ(C37595EpD c37595EpD) {
        Object LIZ2;
        j LJIJJLI;
        Object obj = null;
        if (TextUtils.isEmpty(c37595EpD.LIZIZ)) {
            return null;
        }
        try {
            LJIJJLI = GsonUtils.LIZIZ().LJIJJLI(new ProtocolMessage(Type.Invocation, Integer.valueOf(c37595EpD.LIZ), c37595EpD.LIZJ, c37595EpD.LIZIZ, null, null));
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (LJIJJLI != null) {
            LIZ2 = (m) LJIJJLI;
            C3C5.m7constructorimpl(LIZ2);
            if (!C3C5.m12isFailureimpl(LIZ2)) {
                obj = LIZ2;
            }
            return (m) obj;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.google.gson.JsonObject");
    }

    public ProtocolMessage(Type type, Integer num, m mVar, String str, Integer num2, String str2) {
        this.type = type;
        this.id = num;
        this.data = mVar;
        this.name = str;
        this.status = num2;
        this.message = str2;
    }
}
