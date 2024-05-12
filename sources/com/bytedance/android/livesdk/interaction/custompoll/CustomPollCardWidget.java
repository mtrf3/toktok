package com.bytedance.android.livesdk.interaction.custompoll;

import X.ActivityC45651qj;
import X.C04120Ee;
import X.C04130Ef;
import X.C05170If;
import X.C05200Ii;
import X.C06040Lo;
import X.C15380j0;
import X.C16880lQ;
import X.C199097rd;
import X.C1A;
import X.C221108m2;
import X.C29306Beo;
import X.C30627C0h;
import X.C30635C0p;
import X.C31012CFc;
import X.C47261Igj;
import X.C61878OQg;
import X.C62822Ol8;
import X.C72818Shy;
import X.C76732zl;
import X.CN1;
import X.CV7;
import X.EnumC31509CYf;
import X.InterfaceC06390Mx;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.InterfaceC78502UrS;
import Y.ARunnableS41S0100000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS51S0400000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CustomPollCardWidget extends LiveRecyclableWidget implements InterfaceC72822Si2 {
    public boolean LJLLI;
    public C04120Ee LJLLILLLL;
    public long LJLLJ;
    public boolean LJLLL;
    public final ValueAnimator LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 224));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 229));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 228));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 231));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 230));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 227));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 225));
    public final List<View> LJLJLJ = new ArrayList();
    public final Handler LJLJLLL = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS41S0100000_5 LJLL = new ARunnableS41S0100000_5(this, 156);
    public String LJLLLL = "timeout";
    public final C30635C0p LJLLLLLL = new C30635C0p(this);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnv;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJZ() {
        String str;
        if (C29306Beo.LJIIJ(this.dataChannel)) {
            str = "anchor_click";
        } else if (LLFF(this.dataChannel)) {
            str = "moderator_close";
        } else {
            str = "audience_click";
        }
        this.LJLLLL = str;
        hide();
    }

    public final ValueAnimator LJZI() {
        Object value = this.LJZ.getValue();
        o.LJIIIIZZ(value, "<get-bgViewAlphaAnimator>(...)");
        return (ValueAnimator) value;
    }

    public final TextView LJZL() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-countDown>(...)");
        return (TextView) value;
    }

    public final TextView LL() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-description>(...)");
        return (TextView) value;
    }

    public final View LLF() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-goPoll>(...)");
        return (View) value;
    }

    public final void LLFFF() {
        Context context;
        ActivityC45651qj LIZIZ;
        Context context2 = this.context;
        if (context2 != null && C29306Beo.LIZIZ(context2) != null && (context = this.context) != null && (LIZIZ = C29306Beo.LIZIZ(context)) != null) {
            InterfaceC06390Mx LIZ = CN1.LIZ(IRoomFunctionService.class);
            o.LJIIIIZZ(LIZ, "getService(IRoomFunctionService::class.java)");
            C06040Lo.LIZ((IRoomFunctionService) LIZ, "poll_card", LIZIZ, this.dataChannel, 24);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        if (this.LJLLI) {
            C04120Ee c04120Ee = this.LJLLILLLL;
            if (c04120Ee != null) {
                C04130Ef.LIZJ(this.dataChannel, c04120Ee, SystemClock.uptimeMillis() - this.LJLLJ, this.LJLLLL, "poll_card");
            }
            this.LJLLLL = "others";
            Boolean bool = null;
            this.LJLLILLLL = null;
            this.LJLLI = false;
            this.LJLLJ = 0L;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(CustomPollCardVisibility.class, Boolean.FALSE);
            }
            this.LJLJLLL.removeCallbacks(this.LJLL);
            if (!isViewValid()) {
                return;
            }
            LJZI().setFloatValues(1.0f, 0.0f);
            LJZI().start();
            this.LJLZ.setStartDelay(0L);
            this.LJLZ.setFloatValues(1.0f, 0.0f);
            this.LJLZ.setDuration(40L);
            this.LJLZ.start();
            Object value = this.LJLIL.getValue();
            o.LJIIIIZZ(value, "<get-animatorContainer>(...)");
            ((CV7) value).LIZLLL();
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                bool = Boolean.valueOf(C29306Beo.LJIIJ(dataChannel2));
            }
            if (C29306Beo.LJIILLIIL(bool)) {
                Object value2 = this.LJLJL.getValue();
                o.LJIIIIZZ(value2, "<get-bgView>(...)");
                ((View) value2).postDelayed(new ARunnableS41S0100000_5(this, 157), 100L);
            }
            Object value3 = this.LJLJL.getValue();
            o.LJIIIIZZ(value3, "<get-bgView>(...)");
            ((View) value3).postDelayed(new ARunnableS41S0100000_5(this, 158), 180L);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            C30627C0h.LJIJ(room.getId(), this.LJLLLLLL);
        }
        this.LJLLLL = "leave_room";
        hide();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(CustomPollCardVisibility.class, Boolean.FALSE);
        }
        this.LJLJLLL.removeCallbacksAndMessages(null);
        C72818Shy.LJII("try_mode_custom_poll_message_event", this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (this.LJLLI) {
            return;
        }
        super.show();
        this.LJLLI = true;
        if (C29306Beo.LJIIJ(this.dataChannel) || LLFF(this.dataChannel)) {
            C29306Beo.LJI(LLF());
        } else {
            C29306Beo.LJJLJLI(LLF());
        }
        this.LJLLJ = SystemClock.uptimeMillis();
        C04120Ee c04120Ee = this.LJLLILLLL;
        if (c04120Ee != null) {
            C04130Ef.LIZIZ(this.dataChannel, c04120Ee, "poll_card");
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(CustomPollCardVisibility.class, Boolean.TRUE);
        }
        LJZI().setFloatValues(0.0f, 1.0f);
        LJZI().start();
        this.LJLZ.setFloatValues(0.0f, 1.0f);
        this.LJLZ.setStartDelay(100L);
        this.LJLZ.setDuration(80L);
        this.LJLZ.start();
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-animatorContainer>(...)");
        CV7 cv7 = (CV7) value;
        if (!cv7.LJLJJLL) {
            cv7.LJLJJLL = true;
            cv7.requestLayout();
        }
    }

    public CustomPollCardWidget() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS94S0100000_5(this, 12));
        this.LJLZ = ofFloat;
        this.LJZ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 226));
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean isShowing() {
        return this.LJLLI;
    }

    public static boolean LLFF(DataChannel dataChannel) {
        Boolean bool;
        UserAttr userAttr;
        User user;
        UserAttr userAttr2;
        if (dataChannel != null && (user = (User) dataChannel.kv0(RoomUserChannel.class)) != null && (userAttr2 = user.getUserAttr()) != null) {
            return userAttr2.isAdmin;
        }
        User LIZIZ = C05200Ii.LIZIZ();
        if (LIZIZ != null && (userAttr = LIZIZ.getUserAttr()) != null) {
            bool = Boolean.valueOf(userAttr.isAdmin);
        } else {
            bool = null;
        }
        return C29306Beo.LJJIFFI(bool);
    }

    public final void LLFII(C04120Ee customPollInfo) {
        boolean z;
        Long l;
        Long l2;
        PollStartContent pollStartContent;
        PollStartContent pollStartContent2;
        Room room;
        PollStartContent pollStartContent3;
        User user;
        o.LJIIIZ(customPollInfo, "customPollInfo");
        if (C29306Beo.LJIIJ(this.dataChannel) || LLFF(this.dataChannel)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLL = z;
        this.LJLLILLLL = customPollInfo;
        if (customPollInfo.LIZIZ >= 0) {
            C29306Beo.LJJLJLI(LJZL());
            long j = 1000;
            if (customPollInfo.LIZIZ / j >= 3600) {
                LJZL().setText(C31012CFc.LJI((int) (customPollInfo.LIZIZ / j)));
            } else {
                LJZL().setText(C31012CFc.LJII(customPollInfo.LIZIZ / j));
            }
        } else {
            C29306Beo.LJI(LJZL());
        }
        if (!this.LJLLL) {
            C29306Beo.LJJLJLI(LLF());
        } else {
            C29306Beo.LJI(LLF());
        }
        PollMessage pollMessage = customPollInfo.LJI;
        User user2 = null;
        if (pollMessage != null && (pollStartContent3 = pollMessage.startContent) != null && (user = pollStartContent3.operator) != null) {
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        } else {
            l2 = null;
        }
        if (!o.LJ(l, l2)) {
            if (C29306Beo.LJIIJ(this.dataChannel) || LLFF(this.dataChannel)) {
                TextView LL = LL();
                Object[] objArr = new Object[1];
                PollMessage pollMessage2 = customPollInfo.LJI;
                if (pollMessage2 != null && (pollStartContent2 = pollMessage2.startContent) != null) {
                    user2 = pollStartContent2.operator;
                }
                objArr[0] = C05170If.LIZ(user2);
                LL.setText(C15380j0.LJIILL(R.string.kq0, objArr));
            } else {
                LL().setText(C15380j0.LJIILJJIL(R.string.kpz));
            }
        } else {
            LL().setText(C15380j0.LJIILJJIL(R.string.kpu));
        }
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-pollTitle>(...)");
        ((TextView) value).setText("");
        PollMessage pollMessage3 = customPollInfo.LJI;
        if (pollMessage3 != null && (pollStartContent = pollMessage3.startContent) != null) {
            Object value2 = this.LJLJJI.getValue();
            o.LJIIIIZZ(value2, "<get-pollTitle>(...)");
            ((TextView) value2).setText(pollStartContent.title);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        List<View> list = this.LJLJLJ;
        TextView LL = LL();
        LL.setAlpha(0.0f);
        ((ArrayList) list).add(LL);
        List<View> list2 = this.LJLJLJ;
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-pollTitle>(...)");
        View view = (View) value;
        view.setAlpha(0.0f);
        ((ArrayList) list2).add(view);
        List<View> list3 = this.LJLJLJ;
        View findViewById = findViewById(R.id.c26);
        findViewById.setAlpha(0.0f);
        ((ArrayList) list3).add(findViewById);
        List<View> list4 = this.LJLJLJ;
        TextView LJZL = LJZL();
        LJZL.setAlpha(0.0f);
        ((ArrayList) list4).add(LJZL);
        List<View> list5 = this.LJLJLJ;
        View LLF = LLF();
        LLF.setAlpha(0.0f);
        ((ArrayList) list5).add(LLF);
        List<View> list6 = this.LJLJLJ;
        Object value2 = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value2, "<get-close>(...)");
        View view2 = (View) value2;
        view2.setAlpha(0.0f);
        ((ArrayList) list6).add(view2);
        C29306Beo.LJJJLL(LLF(), 500L, new AqS171S0100000_5(this, 409));
        View view3 = getView();
        if (view3 != null) {
            C29306Beo.LJJJLL(view3, 500L, new AqS171S0100000_5(this, 410));
        }
        Object value3 = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value3, "<get-close>(...)");
        C29306Beo.LJJJLL((View) value3, 500L, new AqS171S0100000_5(this, 411));
        C72818Shy.LIZLLL("try_mode_custom_poll_message_event", this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            long id = room.getId();
            LongSparseArray<C04120Ee> longSparseArray = C30627C0h.LJLLLLLL;
            C04120Ee c04120Ee = longSparseArray.get(id);
            longSparseArray.remove(id);
            if (c04120Ee != null) {
                C76732zl c76732zl = new C76732zl();
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.ov0(this, RoomUserChannel.class, new AqS51S0400000_5(c76732zl, this, c04120Ee, room, 1));
                }
            }
            C30627C0h.LJIILLIIL(room.getId(), this.LJLLLLLL);
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        List<Object> list;
        try {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns == null) {
                return;
            }
            String LJJIJIL = u.LJJIJIL(interfaceC78280Uns, "message_type", "");
            long parseLong = CastLongProtector.parseLong(u.LJJIJIL(interfaceC78280Uns, "poll_id", ""));
            if (o.LJ(LJJIJIL, CardStruct.IStatusCode.DEFAULT)) {
                String LJJIJIL2 = u.LJJIJIL(interfaceC78280Uns, "title", "");
                InterfaceC78502UrS LJJIIZ = u.LJJIIZ(interfaceC78280Uns, "option_list", null);
                if (LJJIIZ == null || (list = LJJIIZ.LIZ()) == null) {
                    list = C61878OQg.INSTANCE;
                }
                long parseLong2 = CastLongProtector.parseLong(u.LJJIJIL(interfaceC78280Uns, "start_time", String.valueOf(System.currentTimeMillis())));
                long parseLong3 = CastLongProtector.parseLong(u.LJJIJIL(interfaceC78280Uns, "end_time", String.valueOf(System.currentTimeMillis())));
                PollMessage pollMessage = new PollMessage();
                pollMessage.messageType = 0L;
                pollMessage.pollKind = 2;
                pollMessage.pollId = parseLong;
                PollStartContent pollStartContent = new PollStartContent();
                pollStartContent.title = LJJIJIL2;
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        List<PollOptionInfo> list2 = pollStartContent.optionList;
                        PollOptionInfo pollOptionInfo = new PollOptionInfo();
                        pollOptionInfo.displayContent = String.valueOf(obj);
                        pollOptionInfo.optionIndex = i;
                        list2.add(pollOptionInfo);
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                pollStartContent.startTime = parseLong2;
                pollStartContent.endTime = parseLong3;
                pollMessage.startContent = pollStartContent;
                CommonMessageData commonMessageData = new CommonMessageData();
                pollMessage.baseMessage = commonMessageData;
                commonMessageData.createTime = System.currentTimeMillis();
                C1A.LIZIZ(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), pollMessage);
                return;
            }
            ((PollApi) C1A.LIZJ(PollApi.class)).LIZ(parseLong);
        } catch (Exception unused) {
        }
    }
}
