package com.bytedance.android.livesdk.interaction.poll.selectpoll.widget;

import X.C0NB;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29924Bom;
import X.CC4;
import X.CCC;
import X.CCG;
import X.CCN;
import X.ViewOnClickListenerC13880ga;
import Y.AObserverS73S0100000_5;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.dataChannel.SelectPollShowChannel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.UserVoteInfo;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class NormalSelectPollWidget extends AbsSelectPollWidget {
    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (C29232Bdc.LJFF(this.dataChannel)) {
            return;
        }
        super.show();
        SelectPollViewModel selectPollViewModel = this.LJLLILLLL;
        if (selectPollViewModel == null) {
            return;
        }
        selectPollViewModel.LJLILLLLZI = CCC.NORMAL;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget
    public final void LLFII(long j) {
        CCG.LIZ(j, this.dataChannel, CCC.NORMAL);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel;
        Room room;
        PollInfo pollInfo;
        PollData pollData;
        Room room2;
        PollInfo pollInfo2;
        PollData pollData2;
        List<PollOptionInfo> list;
        Room room3;
        PollInfo pollInfo3;
        PollData pollData3;
        PollInfo pollInfo4;
        UserVoteInfo userVoteInfo;
        LiveData liveData;
        super.onLoad(objArr);
        SelectPollViewModel selectPollViewModel = this.LJLLILLLL;
        if (selectPollViewModel != null && (liveData = (LiveData) selectPollViewModel.LJLJJI.getValue()) != null) {
            liveData.observe(this, new AObserverS73S0100000_5(this, 29));
        }
        Room room4 = this.LJLLL;
        Boolean bool = null;
        if (room4 != null && (pollInfo4 = room4.advancedPollInfo) != null && (userVoteInfo = pollInfo4.userVoteInfo) != null) {
            bool = Boolean.valueOf(userVoteInfo.hasVoted);
        }
        if (C29306Beo.LJIILLIIL(bool) && (room = this.LJLLL) != null && (pollInfo = room.advancedPollInfo) != null && (pollData = pollInfo.pollData) != null && pollData.pollKind == CCC.NORMAL.ordinal() && (room2 = this.LJLLL) != null && (pollInfo2 = room2.advancedPollInfo) != null && (pollData2 = pollInfo2.pollData) != null && (list = pollData2.pollOptionList) != null && list.size() > 0 && (room3 = this.LJLLL) != null && (pollInfo3 = room3.advancedPollInfo) != null && (pollData3 = pollInfo3.pollData) != null && pollData3.pollStatus == 1) {
            o.LJI(room3);
            PollInfo pollInfo5 = room3.advancedPollInfo;
            o.LJI(pollInfo5);
            PollData pollData4 = pollInfo5.pollData;
            o.LJI(pollData4);
            LLF(pollData4);
        }
        Room room5 = this.LJLLL;
        if (room5 != null && room5.advancedPollInfo != null && (dataChannel = this.dataChannel) != null) {
            dataChannel.rv0(SelectPollShowChannel.class, 1);
        }
        if (this.LJLJL) {
            this.LJLILLLLZI = new PollStartContent();
            show();
            C0NB.LJIIIZ("ttlive_quick_poll", LivePollSetting.INSTANCE.getOptionListString());
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget
    public final void LLFF(long j, List list) {
        super.LLFF(j, list);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PollOptionInfo pollOptionInfo = (PollOptionInfo) it.next();
                if (pollOptionInfo != null) {
                    Context context = this.context;
                    o.LJIIIIZZ(context, "context");
                    C29924Bom c29924Bom = new C29924Bom(context);
                    c29924Bom.setCircular(true);
                    if (!CC4.LIZIZ(pollOptionInfo.displayContent)) {
                        c29924Bom.setBgVisible(false);
                        c29924Bom.setTextSize(14.0f);
                    } else {
                        c29924Bom.setBgVisible(true);
                        c29924Bom.setTextSize(12.0f);
                    }
                    c29924Bom.setPollText(pollOptionInfo.displayContent);
                    if (!this.LJLJL) {
                        c29924Bom.setOnClickListener(new ViewOnClickListenerC13880ga(new CCN(this, pollOptionInfo, j)));
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ((Number) this.LJLJLLL.getValue()).intValue());
                    layoutParams.setMarginStart(LJZL());
                    layoutParams.setMarginEnd(LJZL());
                    LL().addView(c29924Bom, layoutParams);
                }
            }
        }
    }
}
