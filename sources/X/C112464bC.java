package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4bC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112464bC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(long j) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (!C772631m.LIZ()) {
            return;
        }
        C31Q c31q = C31Q.LJIILLIIL;
        onEventV3.LIZIZ("im_launch_push_related_timings", C113554cx.LJJL(new OSZ("launch_push_show_time_ms", String.valueOf(j)), new OSZ("first_mix_link_msg_time", String.valueOf(c31q.LJIIJ)), new OSZ("msg_compensation_start_time", String.valueOf(c31q.LJIIJJI)), new OSZ("unread_conv_compensation_start_time", String.valueOf(c31q.LJIIL)), new OSZ("msg_compensation_duration", String.valueOf(c31q.LJIILIIL)), new OSZ("unread_conv_compensation_duration", String.valueOf(c31q.LJIILJJIL))));
    }

    public static void LIZLLL(C112454bB content) {
        Integer num;
        String valueOf;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(content, "content");
        o.LJIIIZ(onEventV3, "onEventV3");
        if (!C772631m.LIZ()) {
            return;
        }
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("message_notification_type", C112474bD.LIZIZ(content.LIZ));
        oszArr[1] = new OSZ("time_consume_in_ms", String.valueOf(content.LJJI));
        List<C771931f> list = content.LJIJJ;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        oszArr[2] = new OSZ("unit_num", String.valueOf(num));
        C109544Rq c109544Rq = content.LJIJI;
        if (c109544Rq == null) {
            valueOf = "-1";
        } else {
            valueOf = String.valueOf(c109544Rq.getMsgType());
        }
        oszArr[3] = new OSZ("real_message_type", valueOf);
        onEventV3.LIZIZ("push_content_dequeue_time_consumption", C113554cx.LJJL(oszArr));
    }

    public static java.util.Map LJFF(C112484bE c112484bE) {
        return C113554cx.LJJL(new OSZ("enter_from", c112484bE.LIZ), new OSZ("author_id", c112484bE.LIZIZ), new OSZ("group_id", c112484bE.LIZJ), new OSZ("push_channel", c112484bE.LIZLLL), new OSZ("rule_id", c112484bE.LJ), new OSZ("push_label", c112484bE.LJFF), new OSZ("from_user_id", c112484bE.LJI), new OSZ("chat_type", c112484bE.LJII), new OSZ("chat_cnt", String.valueOf(c112484bE.LJIIIIZZ)), new OSZ("resource_type", c112484bE.LJIIIZ), new OSZ("message_notification_type", c112484bE.LJIIJ), new OSZ("message_type", c112484bE.LJIIJJI), new OSZ("real_message_type", c112484bE.LJIIL), new OSZ("business_tag", c112484bE.LJIILIIL), new OSZ("item_type", c112484bE.LJIILJJIL));
    }

    public static void LIZJ(String str, int i) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (!C772631m.LIZ()) {
            return;
        }
        onEventV3.LIZIZ("msg_handled_by_inner_push_flow", C113554cx.LJJL(new OSZ("step_label", str), new OSZ("message_num", String.valueOf(i))));
    }

    public static void LIZ(int i, int i2, String str) {
        C772831o.LIZ().LIZIZ("get_sender_users_fail", C113554cx.LJJL(new OSZ("fail_case", str), new OSZ("fail_num", String.valueOf(i)), new OSZ("unit_num", String.valueOf(i2))));
    }

    public static void LJ(int i, String str, String str2) {
        C772831o.LIZ().LIZIZ("try_enqueue_conversation", C113554cx.LJJL(new OSZ("trigger_source", str), new OSZ("call_type", str2), new OSZ("conversation_num", String.valueOf(i))));
    }
}
