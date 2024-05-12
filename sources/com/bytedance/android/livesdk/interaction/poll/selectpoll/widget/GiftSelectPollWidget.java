package com.bytedance.android.livesdk.interaction.poll.selectpoll.widget;

import X.C29232Bdc;
import X.C29306Beo;
import X.C29923Bol;
import X.C68322mC;
import X.CC4;
import X.CCC;
import X.CCG;
import X.CCK;
import X.CN1;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS31S0300000_5;
import Y.AObserverS73S0100000_5;
import android.content.Context;
import android.content.res.Resources;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.MockGiftPollEvent;
import com.bytedance.android.livesdk.dataChannel.SelectPollShowChannel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.UserVoteInfo;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftSelectPollWidget extends AbsSelectPollWidget {
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

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
        CC4.LIZLLL = false;
        SelectPollViewModel selectPollViewModel = this.LJLLILLLL;
        if (selectPollViewModel == null) {
            return;
        }
        selectPollViewModel.LJLILLLLZI = CCC.GIFT;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        DataChannel dataChannel = this.dataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget
    public final void LLFII(long j) {
        CCG.LIZ(j, this.dataChannel, CCC.GIFT);
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
        this.dataChannel.mv0(MockGiftPollEvent.class, this, new AqS171S0100000_5(this, 452));
        SelectPollViewModel selectPollViewModel = this.LJLLILLLL;
        if (selectPollViewModel != null && (liveData = (LiveData) selectPollViewModel.LJLJJI.getValue()) != null) {
            liveData.observe(this, new AObserverS73S0100000_5(this, 28));
        }
        Room room4 = this.LJLLL;
        Boolean bool = null;
        if (room4 != null && (pollInfo4 = room4.advancedPollInfo) != null && (userVoteInfo = pollInfo4.userVoteInfo) != null) {
            bool = Boolean.valueOf(userVoteInfo.hasVoted);
        }
        if (C29306Beo.LJIILLIIL(bool) && (room = this.LJLLL) != null && (pollInfo = room.advancedPollInfo) != null && (pollData = pollInfo.pollData) != null && pollData.pollKind == CCC.GIFT.ordinal() && (room2 = this.LJLLL) != null && (pollInfo2 = room2.advancedPollInfo) != null && (pollData2 = pollInfo2.pollData) != null && (list = pollData2.pollOptionList) != null && list.size() > 0 && (room3 = this.LJLLL) != null && (pollInfo3 = room3.advancedPollInfo) != null && (pollData3 = pollInfo3.pollData) != null && pollData3.pollStatus == 1 && room3.giftPollVoteEnabled) {
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget
    public final void LLFF(long j, List list) {
        T t;
        String str;
        Gift gift;
        Resources resources;
        int i;
        T t2;
        String str2;
        Gift gift2;
        Resources resources2;
        int i2;
        super.LLFF(j, list);
        o.LJI(list);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int i4 = i3 + 1;
            PollOptionInfo pollOptionInfo = (PollOptionInfo) it.next();
            if (pollOptionInfo != null) {
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                C29923Bol c29923Bol = new C29923Bol(context);
                int i5 = 1;
                c29923Bol.setCircular(true);
                CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
                C68322mC c68322mC = new C68322mC();
                ImageModel imageModel = null;
                String str3 = "1";
                if (i3 == 0) {
                    if (pollGifts != null) {
                        t2 = pollGifts.LJLIL;
                    } else {
                        t2 = 0;
                    }
                    c68322mC.element = t2;
                    Context context2 = c29923Bol.getContext();
                    if (context2 != null && (resources2 = context2.getResources()) != null) {
                        Gift gift3 = (Gift) c68322mC.element;
                        if (gift3 != null) {
                            i2 = gift3.diamondCount;
                        } else {
                            i2 = 1;
                        }
                        Object[] objArr = new Object[1];
                        if (gift3 != null) {
                            i5 = gift3.diamondCount;
                        }
                        objArr[0] = Integer.valueOf(i5);
                        str2 = resources2.getQuantityString(R.plurals.lv, i2, objArr);
                    } else {
                        str2 = null;
                    }
                    if (pollGifts != null && (gift2 = pollGifts.LJLIL) != null) {
                        imageModel = gift2.icon;
                    }
                    c29923Bol.setGiftImage(imageModel);
                    if (str2 != null) {
                        str3 = str2;
                    }
                    c29923Bol.setGiftPrice(str3);
                } else {
                    if (pollGifts != null) {
                        t = pollGifts.LJLILLLLZI;
                    } else {
                        t = 0;
                    }
                    c68322mC.element = t;
                    Context context3 = c29923Bol.getContext();
                    if (context3 != null && (resources = context3.getResources()) != null) {
                        Gift gift4 = (Gift) c68322mC.element;
                        if (gift4 != null) {
                            i = gift4.diamondCount;
                        } else {
                            i = 1;
                        }
                        Object[] objArr2 = new Object[1];
                        if (gift4 != null) {
                            i5 = gift4.diamondCount;
                        }
                        objArr2[0] = Integer.valueOf(i5);
                        str = resources.getQuantityString(R.plurals.lv, i, objArr2);
                    } else {
                        str = null;
                    }
                    if (pollGifts != null && (gift = pollGifts.LJLILLLLZI) != null) {
                        imageModel = gift.icon;
                    }
                    c29923Bol.setGiftImage(imageModel);
                    if (str != null) {
                        str3 = str;
                    }
                    c29923Bol.setGiftPrice(str3);
                }
                if (!this.LJLJL) {
                    c29923Bol.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS31S0300000_5(c68322mC, this, pollOptionInfo, 22)));
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ((Number) this.LJLJLLL.getValue()).intValue());
                layoutParams.setMarginStart(LJZL());
                layoutParams.setMarginEnd(LJZL());
                LL().addView(c29923Bol, layoutParams);
            }
            i3 = i4;
        }
    }
}
