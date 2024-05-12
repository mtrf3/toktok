package com.bytedance.android.livesdk.interaction.poll.selectpoll.widget;

import X.BZI;
import X.C07250Qf;
import X.C0NB;
import X.C15380j0;
import X.C28787BRn;
import X.C29306Beo;
import X.C30079BrH;
import X.C30725C4b;
import X.C32I;
import X.C42398GkU;
import X.C47135Ieh;
import X.C47261Igj;
import X.C5H3;
import X.C61878OQg;
import X.C72972SkS;
import X.C78996UzQ;
import X.CC4;
import X.CCJ;
import X.CCO;
import X.CCQ;
import X.EnumC31509CYf;
import X.InterfaceC31781Cdd;
import X.JBR;
import X.X1D;
import Y.AObserverS73S0100000_5;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SelectPollShowChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdk.model.message.PollUpdateVotesContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AbsSelectPollWidget extends AnimatableRecyclableWidget {
    public PollStartContent LJLILLLLZI;
    public int LJLJJI;
    public long LJLJJL;
    public PollUpdateVotesContent LJLJJLL;
    public boolean LJLJL;
    public SelectPollViewModel LJLLILLLL;
    public long LJLLJ;
    public Room LJLLL;
    public final String LJLIL = "poll_logger";
    public String LJLJI = "";
    public final C5H3 LJLJLJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 232));
    public final C5H3 LJLJLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 233));
    public final C5H3 LJLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 234));
    public final C5H3 LJLLI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 235));

    public void LLFII(long j) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dln;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        String str;
        PollUpdateVotesContent pollUpdateVotesContent = this.LJLJJLL;
        if (pollUpdateVotesContent != null) {
            String str2 = "";
            long j = 0;
            int i = 0;
            for (PollOptionInfo pollOptionInfo : pollUpdateVotesContent.optionList) {
                int i2 = i + 1;
                if (i >= 0) {
                    PollOptionInfo pollOptionInfo2 = pollOptionInfo;
                    if (pollOptionInfo2 != null) {
                        if (i == 0) {
                            str2 = C42398GkU.LIZIZ(str2, '{');
                        }
                        long j2 = pollOptionInfo2.votes;
                        if (j < j2) {
                            j = j2;
                        }
                        StringBuilder LJFF = C72972SkS.LJFF(str2, '\'');
                        LJFF.append(pollOptionInfo2.displayContent);
                        LJFF.append(':');
                        String LIZIZ = C47135Ieh.LIZIZ(LJFF, pollOptionInfo2.votes, '\'', LJFF);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(LIZIZ);
                        if (i < pollUpdateVotesContent.optionList.size() - 1) {
                            str = ",";
                        } else {
                            str = "}";
                        }
                        LIZ.append(str);
                        str2 = X1D.LIZIZ(LIZ);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final void LJZ() {
        Fragment fragment;
        SelectPollViewModel selectPollViewModel = this.LJLLILLLL;
        if (selectPollViewModel != null) {
            InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
            if (interfaceC31781Cdd != null && (fragment = interfaceC31781Cdd.getFragment()) != null) {
                ((LiveData) selectPollViewModel.LJLJJI.getValue()).removeObservers(fragment);
                ((LiveData) selectPollViewModel.LJLJJL.getValue()).removeObservers(fragment);
                selectPollViewModel.gv0().removeObservers(fragment);
                ((LiveData) selectPollViewModel.LJLJLJ.getValue()).removeObservers(fragment);
            }
            CC4.LIZLLL = false;
            CCQ ccq = selectPollViewModel.LJLJLLL;
            if (ccq != null) {
                ccq.cancel();
            }
        }
        this.LJLILLLLZI = null;
        this.LJLJI = "";
        this.LJLJJL = 0L;
    }

    public final int LJZL() {
        return ((Number) this.LJLL.getValue()).intValue();
    }

    public final LinearLayout LL() {
        return (LinearLayout) this.LJLLI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(SelectPollShowChannel.class, 0);
        }
        cancelHideAnimation();
        animateHide();
        LJZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        super.onHideAnimationEnd();
        LJZI(true);
        super.hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        IMessageManager iMessageManager;
        LJZ();
        SelectPollViewModel selectPollViewModel = this.LJLLILLLL;
        if (selectPollViewModel != null && (iMessageManager = selectPollViewModel.LJLL) != null) {
            iMessageManager.removeMessageListener(selectPollViewModel);
        }
        if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
            this.LJLLILLLL = null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        long millisecond;
        TextPaint paint;
        LinearLayout LL;
        cancelShowAnimation();
        animateShow();
        PollStartContent pollStartContent = this.LJLILLLLZI;
        if (pollStartContent != null) {
            if (!this.LJLJL) {
                millisecond = pollStartContent.endTime - C30725C4b.LIZ();
                this.LJLLJ = millisecond;
                StringBuilder LIZ = X1D.LIZ();
                C0NB.LJIIIZ(JBR.LJFF(LIZ, this.LJLIL, "total_time", LIZ), String.valueOf(millisecond));
                SelectPollViewModel selectPollViewModel = this.LJLLILLLL;
                if (selectPollViewModel != null) {
                    CCQ ccq = selectPollViewModel.LJLJLLL;
                    if (ccq != null) {
                        ccq.cancel();
                    }
                    if (millisecond <= 0) {
                        ((LiveData) selectPollViewModel.LJLJLJ.getValue()).setValue(0L);
                    } else {
                        CCQ ccq2 = new CCQ(millisecond, selectPollViewModel);
                        selectPollViewModel.LJLJLLL = ccq2;
                        ccq2.start();
                    }
                }
                LLFII(millisecond);
            } else {
                millisecond = LivePollDurationSetting.INSTANCE.getMillisecond();
                try {
                    TextView textView = (TextView) this.LJLJLJ.getValue();
                    if (textView != null) {
                        long j = 1000;
                        textView.setText(C15380j0.LJIIIIZZ(R.plurals.o2, (int) (millisecond / j), String.valueOf(millisecond / j)));
                    }
                    List<String> optionList = LivePollSetting.INSTANCE.getOptionList();
                    ArrayList arrayList = new ArrayList(C32I.LJJL(optionList, 10));
                    for (String str : optionList) {
                        List<PollOptionInfo> list = pollStartContent.optionList;
                        PollOptionInfo pollOptionInfo = new PollOptionInfo();
                        pollOptionInfo.displayContent = str;
                        arrayList.add(Boolean.valueOf(list.add(pollOptionInfo)));
                    }
                } catch (Exception e) {
                    C0NB.LJ(this.LJLIL, e.getMessage());
                    return;
                }
            }
            LLFF(this.LJLJJL, pollStartContent.optionList);
            TextView textView2 = (TextView) this.LJLJLJ.getValue();
            if (textView2 != null && (paint = textView2.getPaint()) != null) {
                long j2 = 1000;
                try {
                    int measureText = (int) paint.measureText(C15380j0.LJIIIIZZ(R.plurals.o2, (int) (millisecond / j2), String.valueOf(millisecond / j2)));
                    if (measureText > 0 && (LL = LL()) != null) {
                        ViewGroup.LayoutParams layoutParams = LL.getLayoutParams();
                        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (CCJ.LIZ(this.context)) {
                            marginLayoutParams.rightMargin = measureText + LJZL();
                        } else {
                            marginLayoutParams.leftMargin = measureText + LJZL();
                        }
                        LL.setLayoutParams(marginLayoutParams);
                    }
                } catch (Exception unused) {
                }
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(SelectPollShowChannel.class, Integer.valueOf(C15380j0.LJFF(R.dimen.agh)));
        }
        super.show();
    }

    public final void LJZI(boolean z) {
        int childCount = LL().getChildCount();
        for (int i = 0; i < childCount; i++) {
            LL().getChildAt(i).setEnabled(z);
        }
    }

    public final void LLF(PollData pollData) {
        this.LJLJJL = pollData.pollId;
        if (pollData.pollStatus != 1) {
            return;
        }
        PollStartContent pollStartContent = new PollStartContent();
        pollStartContent.endTime = pollData.endTime;
        pollStartContent.optionList = pollData.pollOptionList;
        this.LJLILLLLZI = pollStartContent;
        show();
    }

    public final void LLFFF(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_poll_click_failed");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIJJ(Long.valueOf(this.LJLJJL), "poll_id");
        C07250Qf.LIZJ(this.LJLLJ, LIZ, "time_remain", str, "fail_reason");
        LIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "is_custom");
        LIZ.LIZJ("click");
        LIZ.LJJIIJZLJL();
    }

    public final void LLFZ(PollMessage pollMessage) {
        if (pollMessage != null) {
            if (pollMessage.messageType == 2) {
                this.LJLJJLL = pollMessage.updateContent;
                return;
            }
            if (pollMessage.messageType == 0) {
                if (pollMessage.startContent != null) {
                    o.LJI(pollMessage.startContent);
                    if (!r0.optionList.isEmpty()) {
                        PollStartContent pollStartContent = pollMessage.startContent;
                        o.LJI(pollStartContent);
                        if (pollStartContent.endTime < C30725C4b.LIZ()) {
                            return;
                        }
                        this.LJLILLLLZI = pollMessage.startContent;
                        this.LJLJJL = pollMessage.pollId;
                        if (C29306Beo.LJJIFFI((Boolean) this.dataChannel.kv0(WarningInfoVisibilityEvent.class)) && !this.LJLJL) {
                            LJZ();
                            return;
                        } else {
                            show();
                            return;
                        }
                    }
                } else if (pollMessage == null) {
                    return;
                }
            }
            if (pollMessage.messageType != 1 || this.LJLJJL != pollMessage.pollId) {
                return;
            }
            hide();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        boolean z;
        SelectPollViewModel selectPollViewModel;
        Object obj;
        IMessage iMessage;
        SelectPollViewModel selectPollViewModel2;
        LiveData liveData;
        NextLiveData<Throwable> gv0;
        LiveData liveData2;
        IMessageManager iMessageManager;
        DataChannel dataChannel;
        Boolean bool;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJL = z;
        this.LJLLL = (Room) this.dataChannel.kv0(RoomChannel.class);
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            selectPollViewModel = (SelectPollViewModel) ViewModelProviders.of(interfaceC31781Cdd.getFragment(), new CCO(this)).get(SelectPollViewModel.class);
        } else {
            selectPollViewModel = null;
        }
        this.LJLLILLLL = selectPollViewModel;
        if (!this.LJLJL && (dataChannel = this.dataChannel) != null) {
            dataChannel.ov0(this, WarningInfoVisibilityEvent.class, new AqS171S0100000_5(this, 450));
        }
        SelectPollViewModel selectPollViewModel3 = this.LJLLILLLL;
        if (selectPollViewModel3 != null && (iMessageManager = selectPollViewModel3.LJLL) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), selectPollViewModel3);
        }
        SelectPollViewModel selectPollViewModel4 = this.LJLLILLLL;
        if (selectPollViewModel4 != null && (liveData2 = (LiveData) selectPollViewModel4.LJLJJL.getValue()) != null) {
            liveData2.observe(this, new AObserverS73S0100000_5(this, 25));
        }
        SelectPollViewModel selectPollViewModel5 = this.LJLLILLLL;
        if (selectPollViewModel5 != null && (gv0 = selectPollViewModel5.gv0()) != null) {
            gv0.observe(this, new AObserverS73S0100000_5(this, 26));
        }
        SelectPollViewModel selectPollViewModel6 = this.LJLLILLLL;
        if (selectPollViewModel6 != null && (liveData = (LiveData) selectPollViewModel6.LJLJLJ.getValue()) != null) {
            liveData.observe(this, new AObserverS73S0100000_5(this, 27));
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C30079BrH) && (((obj = ((C30079BrH) obj2).LIZ) == null || (obj instanceof IMessage)) && (iMessage = (IMessage) obj) != null && (selectPollViewModel2 = this.LJLLILLLL) != null)) {
                    selectPollViewModel2.onMessage(iMessage);
                }
            }
        }
        this.dataChannel.lv0(this, SubOnlyLiveAudienceStatusChannel.class, new AqS171S0100000_5(this, 451));
    }

    public void LLFF(long j, List list) {
        LL().removeAllViews();
        if (this.LJLJJLL == null) {
            PollUpdateVotesContent pollUpdateVotesContent = new PollUpdateVotesContent();
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            pollUpdateVotesContent.optionList = list;
            this.LJLJJLL = pollUpdateVotesContent;
        }
    }
}
