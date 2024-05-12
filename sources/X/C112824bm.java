package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS56S1200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112824bm {
    public static final C2068389v LIZ;

    static {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_refresh;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        LIZ = c2068389v;
    }

    public static C112864bq LIZ(InterfaceC112854bp type, C109544Rq c109544Rq, Context context, String str, InterfaceC65784Pro interfaceC65784Pro) {
        String str2;
        String str3;
        o.LJIIIZ(type, "type");
        if (o.LJ(type, C4XA.LIZ)) {
            str2 = "photo";
        } else if (o.LJ(type, C4XB.LIZ)) {
            str2 = "video";
        } else {
            throw new C162476Zf();
        }
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("message_type", str2);
        String str4 = null;
        if (c109544Rq != null) {
            str4 = Integer.valueOf(c109544Rq.getConversationType()).toString();
        }
        oszArr[1] = new OSZ("chat_type", str4);
        if (c109544Rq == null || (str3 = c109544Rq.getConversationId()) == null) {
            str3 = "";
        }
        oszArr[2] = new OSZ("conversation_id", str3);
        oszArr[3] = new OSZ("failure_reason", str);
        onEventV3.LIZIZ("load_retry_show", C113554cx.LJJL(oszArr));
        C112834bn c112834bn = new C112834bn(LIZ.LIZ(context));
        String string = context.getString(R.string.emb);
        o.LJIIIIZZ(string, "context.getString(R.string.dm_cam_fail_retry)");
        return new C112864bq(string, c112834bn, new AqS56S1200000_1(str2, (String) c109544Rq, (C109544Rq) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 5));
    }
}
