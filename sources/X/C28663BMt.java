package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.i0;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BMt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28663BMt {
    public static final /* synthetic */ C28663BMt LIZ = new C28663BMt();
    public static boolean LIZIZ = true;
    public static final java.util.Map<String, String> LIZJ = C113554cx.LJJL(new OSZ("SelfLikeWidget", "like_widget_load"), new OSZ("LiveRoomUserInfoWidget", "userinfo_widget_load"), new OSZ("LiveAudienceToolbarWidget", "toolbar_widget_load"), new OSZ("AudienceRightToolbarWidget", "toolbar_widget_load"), new OSZ("OnlineAudienceRankWidget", "audience_count_widget_load"), new OSZ("CloseWidget", "close_widget_load"), new OSZ("RankEntranceWidget", "rank_list_widget_load"), new OSZ("AudienceHashTagWidget", "topic_widget_load"), new OSZ("LiveDrawerEntranceWidget", "feed_drawer_widget_load"), new OSZ("CommentWidget", "comment_bar_widget_load"), new OSZ("PortraitPublicScreenWidget", "comment_widget_load"), new OSZ("FrameL2SlotWidget", "ec_explanation_card"), new OSZ("BottomLeftSlotWidget", "bottom_left_slot"));
    public static final java.util.Set<String> LIZLLL = C77275UUl.LJIIIIZZ("like_widget_load", "userinfo_widget_load", "toolbar_widget_load", "comment_bar_widget_load");
    public static final java.util.Set<String> LJ = C77275UUl.LJIIIIZZ("userinfo_widget_load", "audience_count_widget_load", "close_widget_load", "rank_list_widget_load", "topic_widget_load", "feed_drawer_widget_load");
    public static final java.util.Set<String> LJFF = C77275UUl.LJIIIIZZ("toolbar_widget_load", "comment_bar_widget_load", "bottom_left_slot");

    public static void LIZ(DataChannel dataChannel, String str) {
        C28662BMs c28662BMs;
        C28662BMs c28662BMs2;
        C28662BMs c28662BMs3;
        o.LJIIIZ(dataChannel, "dataChannel");
        if (!C38354F3m.LJ(str)) {
            HashMap LIZ2 = C72545SdZ.LIZ(dataChannel);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append("_duration");
            if (!LIZ2.containsKey(X1D.LIZIZ(LIZ3))) {
                long currentTimeMillis = System.currentTimeMillis();
                HashMap LIZ4 = C72545SdZ.LIZ(dataChannel);
                Long l = (Long) dataChannel.kv0(C28394BCk.class);
                if (l != null) {
                    l.longValue();
                    long longValue = currentTimeMillis - l.longValue();
                    LIZ4.put(i0.LJFF(str, "_duration"), String.valueOf(longValue));
                    if (LIZLLL.contains(str) && (c28662BMs3 = (C28662BMs) dataChannel.kv0(C28659BMp.class)) != null) {
                        c28662BMs3.LIZ = longValue;
                        c28662BMs3.LIZLLL.remove(str);
                    }
                    if (LJ.contains(str) && (c28662BMs2 = (C28662BMs) dataChannel.kv0(C28659BMp.class)) != null) {
                        c28662BMs2.LIZIZ = longValue;
                    }
                    if (LJFF.contains(str) && (c28662BMs = (C28662BMs) dataChannel.kv0(C28659BMp.class)) != null) {
                        c28662BMs.LIZJ = longValue;
                    }
                }
            }
        }
    }
}
