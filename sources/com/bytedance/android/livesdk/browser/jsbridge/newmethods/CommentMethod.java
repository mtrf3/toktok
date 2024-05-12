package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38123Exj;
import X.C110574Vp;
import X.C113554cx;
import X.C31085CHx;
import X.C31099CIl;
import X.C31100CIm;
import X.C38131Exr;
import X.C73318Sq2;
import X.C73505St3;
import X.C73943T0h;
import X.C79062V1e;
import X.CI0;
import X.InterfaceC65349Pkn;
import X.OJ4;
import X.OJ6;
import X.X1D;
import Y.AfS57S0100000_5;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CommentMethod extends AbstractC38123Exj<Params, Object> {
    public final C73318Sq2 LJLIL = new C73318Sq2();

    /* loaded from: classes6.dex */
    public static final class Params {

        @InterfaceC65349Pkn("args")
        public final JSONObject args;

        @InterfaceC65349Pkn("content")
        public final String content;

        @InterfaceC65349Pkn("sender")
        public final String sender;

        @InterfaceC65349Pkn("type")
        public final String type;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return o.LJ(this.type, params.type) && o.LJ(this.content, params.content) && o.LJ(this.sender, params.sender) && o.LJ(this.args, params.args);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Params(type=");
            LIZ.append(this.type);
            LIZ.append(", content=");
            LIZ.append(this.content);
            LIZ.append(", sender=");
            LIZ.append(this.sender);
            LIZ.append(", args=");
            LIZ.append(this.args);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final int hashCode() {
            int hashCode;
            int LJ = C79062V1e.LJ(this.content, this.type.hashCode() * 31, 31);
            String str = this.sender;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (LJ + hashCode) * 31;
            JSONObject jSONObject = this.args;
            if (jSONObject != null) {
                i = jSONObject.hashCode();
            }
            return i2 + i;
        }

        public Params(String type, String content, String str, JSONObject jSONObject) {
            o.LJIIIZ(type, "type");
            o.LJIIIZ(content, "content");
            this.type = type;
            this.content = content;
            this.sender = str;
            this.args = jSONObject;
        }
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        this.LJLIL.dispose();
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(Params params, C38131Exr context) {
        ISendCommentEvent.Sender sender;
        Map LJJJLIIL;
        ISendCommentEvent c31085CHx;
        Params params2 = params;
        o.LJIIIZ(params2, "params");
        o.LJIIIZ(context, "context");
        if (o.LJ(params2.sender, "lottery")) {
            sender = ISendCommentEvent.Sender.LOTTERY;
        } else {
            sender = ISendCommentEvent.Sender.UNKNOWN;
        }
        JSONObject jSONObject = params2.args;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "keys()");
            C110574Vp LJJJJLL = OJ4.LJJJJLL(OJ6.LJJIJLIJ(keys), new AqS167S0100000_1(jSONObject, 32));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C113554cx.LJJLIIJ(linkedHashMap, LJJJJLL);
            LJJJLIIL = C113554cx.LJJLIIIJ(linkedHashMap);
        } else {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        String str = params2.type;
        if (o.LJ(str, "text")) {
            c31085CHx = new CI0(params2.content, null, false, 0, sender, LJJJLIIL);
        } else if (o.LJ(str, "barrage")) {
            c31085CHx = new C31085CHx(params2.content, sender, LJJJLIIL);
        } else {
            throw new IllegalArgumentException("unsupported comment type");
        }
        C73943T0h LIZ = C73943T0h.LIZ();
        this.LJLIL.LIZ(new C73505St3(LIZ.LJ(C31099CIl.class).LJJIFFI(new C31100CIm(c31085CHx))).LJIILLIIL(new AfS57S0100000_5(this, 58)));
        LIZ.LIZIZ(c31085CHx);
    }
}
