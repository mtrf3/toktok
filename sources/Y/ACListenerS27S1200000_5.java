package Y;

import X.BZI;
import X.C15380j0;
import X.C28787BRn;
import X.C29306Beo;
import X.C30868C9o;
import X.C51029K0z;
import X.C61447O9r;
import X.C7N;
import X.CN1;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.DismissPreviewSettingDialogEvent;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.QuickChatContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ACListenerS27S1200000_5 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void onClick$0(ACListenerS27S1200000_5 aCListenerS27S1200000_5, View view) {
        ISendCommentEvent.Sender sender;
        ((ICommentService) CN1.LIZ(ICommentService.class)).Lt0((QuickCommentWidget) aCListenerS27S1200000_5.l1);
        Room room = ((QuickCommentWidget) aCListenerS27S1200000_5.l1).LJLJI;
        if (room != null) {
            QuickChatContent quickChatContent = (QuickChatContent) aCListenerS27S1200000_5.l2;
            String str = aCListenerS27S1200000_5.s0;
            ICommentService iCommentService = (ICommentService) CN1.LIZ(ICommentService.class);
            long id = room.getId();
            String str2 = quickChatContent.text;
            o.LJIIIIZZ(str2, "item.text");
            String str3 = quickChatContent.textStarlingKey;
            if (str != null) {
                switch (str.hashCode()) {
                    case C61447O9r.LJIIJ:
                        if (str.equals("1")) {
                            sender = ISendCommentEvent.Sender.QUICKEMOTECOMMENT;
                            break;
                        }
                        break;
                    case 50:
                        if (str.equals("2")) {
                            sender = ISendCommentEvent.Sender.QUICKSUBGIFTCOMMENT;
                            break;
                        }
                        break;
                    case 51:
                        if (str.equals("3")) {
                            sender = ISendCommentEvent.Sender.QUICKCOMMENTFIRSTGIFT;
                            break;
                        }
                        break;
                    case 53:
                        if (str.equals("5")) {
                            sender = ISendCommentEvent.Sender.QUICK_COMMENT_EC;
                            sender.getLogArgs().clear();
                            Map<String, String> logArgs = sender.getLogArgs();
                            String str4 = quickChatContent.textStarlingKey;
                            o.LJIIIIZZ(str4, "item.textStarlingKey");
                            logArgs.put("starling_key", str4);
                            break;
                        }
                        break;
                }
                iCommentService.Em0(id, str2, str3, 2, sender);
            }
            sender = ISendCommentEvent.Sender.QUICKCOMMENT;
            iCommentService.Em0(id, str2, str3, 2, sender);
        }
        QuickCommentWidget quickCommentWidget = (QuickCommentWidget) aCListenerS27S1200000_5.l1;
        if (!quickCommentWidget.isShowing()) {
            quickCommentWidget.LJLZ();
        } else {
            quickCommentWidget.animateHide();
        }
    }

    public static final void onClick$1(ACListenerS27S1200000_5 aCListenerS27S1200000_5, View view) {
        Long l;
        RoomAuthStatus roomAuthStatus;
        ((ScreenRecordStatusWidget) aCListenerS27S1200000_5.l1).LJLJJI.invoke();
        Room room = ((ScreenRecordStatusWidget) aCListenerS27S1200000_5.l1).LJLIL;
        if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || !roomAuthStatus.chatSubOnly) {
            Context context = ((TextView) aCListenerS27S1200000_5.l2).getContext();
            Object[] objArr = {aCListenerS27S1200000_5.s0};
            if (context != null || (context = C15380j0.LIZLLL()) != null) {
                C30868C9o.LJFF(context, context.getString(R.string.n11, objArr));
            }
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_switch_game_notice");
        LIZ.LJIJ("screen_share");
        LIZ.LJFF(((ScreenRecordStatusWidget) aCListenerS27S1200000_5.l1).LJLILLLLZI);
        Room room2 = ((ScreenRecordStatusWidget) aCListenerS27S1200000_5.l1).LJLIL;
        if (room2 != null) {
            l = Long.valueOf(room2.getId());
        } else {
            l = null;
        }
        LIZ.LJJIII(l);
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$2(ACListenerS27S1200000_5 aCListenerS27S1200000_5, View view) {
        if (((RoomCreateInfo) aCListenerS27S1200000_5.l1).LIZIZ()) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_donation_click");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL((BasePreviewSettingMainFragment) aCListenerS27S1200000_5.l2));
            LIZ.LJIIJJI("live_take_page");
            LIZ.LJIJJ(aCListenerS27S1200000_5.s0, "powered_by");
            LIZ.LJJIIJZLJL();
            BaseDialogFragment.wl(C29306Beo.LIZIZ(((BasePreviewSettingMainFragment) aCListenerS27S1200000_5.l2).getContext()), C7N.LJI().T40());
            DataChannel LJIILIIL = C51029K0z.LJIILIIL((BasePreviewSettingMainFragment) aCListenerS27S1200000_5.l2);
            if (LJIILIIL != null) {
                LJIILIIL.pv0(DismissPreviewSettingDialogEvent.class);
            }
        }
    }

    public ACListenerS27S1200000_5(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
