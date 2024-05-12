package com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget;

import X.BZI;
import X.C15380j0;
import X.C1A;
import X.C28787BRn;
import X.C28979BYx;
import X.C29927Bop;
import X.C30079BrH;
import X.C30725C4b;
import X.C47121t6;
import X.C61878OQg;
import X.CC4;
import X.CCC;
import X.CCG;
import X.CCH;
import X.CCK;
import X.CKB;
import X.CN1;
import X.EnumC31509CYf;
import X.YBU;
import Y.ARunnableS2S0100200_5;
import Y.ARunnableS41S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SelectPollVoteEvent;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.UserVoteInfo;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdk.model.message.PollUpdateVotesContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class LiveAbsPollEffectWidget extends LiveRecyclableWidget implements OnMessageListener {
    public final int LJLIL;
    public YBU LJLILLLLZI;
    public C47121t6 LJLJI;
    public IMessageManager LJLJJI;
    public CCH LJLJJL;
    public PollStartContent LJLJJLL;
    public List<PollOptionInfo> LJLJL;
    public PollMessage LJLJLJ;
    public boolean LJLJLLL;
    public Room LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public long LJLLL;
    public long LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public final long LJZ;
    public final long LJZI;
    public boolean LJZL;
    public long LL;
    public boolean LLD;
    public int LLF;

    public LiveAbsPollEffectWidget() {
        this(0);
    }

    public void LLII(int i) {
    }

    public void LLIILII() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LJLZ() {
        switch (this.LJLIL) {
            case 257:
                LLIIIILZ(28.0f);
                LJZL().setDrawRadius(false);
                LLII(R.drawable.d9u);
                YBU LJZL = LJZL();
                LJZL.LLILZIL = 0;
                LJZL.LLILZLL = 0;
                LJZL.postInvalidate();
                int LIZIZ = C15380j0.LIZIZ(R.color.a9_);
                int LIZIZ2 = C15380j0.LIZIZ(R.color.a9g);
                int LIZIZ3 = C15380j0.LIZIZ(R.color.a9f);
                int LIZIZ4 = C15380j0.LIZIZ(R.color.a99);
                YBU LJZL2 = LJZL();
                LJZL2.LLFII = LIZIZ;
                LJZL2.LLFZ = LIZIZ2;
                LJZL2.LLI = LIZIZ3;
                LJZL2.LLIFFJFJJ = LIZIZ4;
                LJZL2.LLII = true;
                LJZL2.postInvalidate();
                int i = this.LJLLLLLL;
                if (i != 1) {
                    if (i != 2) {
                        LLFZ(0.6f, 0.6f);
                        break;
                    } else {
                        LLFZ(0.4f, 1.0f);
                        break;
                    }
                } else {
                    LLFZ(1.0f, 0.4f);
                    break;
                }
            case 258:
                LLIIIILZ(32.0f);
                LJZL().setDrawRadius(true);
                LLFZ(0.6f, 0.6f);
                LLII(R.drawable.d9u);
                YBU LJZL3 = LJZL();
                LJZL3.LLILZIL = 1;
                LJZL3.LLILZLL = 2;
                LJZL3.postInvalidate();
                int LIZIZ5 = C15380j0.LIZIZ(R.color.a9g);
                int LIZIZ6 = C15380j0.LIZIZ(R.color.a9f);
                YBU LJZL4 = LJZL();
                LJZL4.LLFII = LIZIZ5;
                LJZL4.LLFZ = LIZIZ5;
                LJZL4.LLI = LIZIZ6;
                LJZL4.LLIFFJFJJ = LIZIZ6;
                LJZL4.LLII = true;
                LJZL4.postInvalidate();
                break;
            case 259:
                LLIILZL();
                break;
        }
        LLIIJI();
    }

    public void LJZ() {
        long j;
        long j2;
        long j3;
        int i;
        PollOptionInfo pollOptionInfo;
        PollOptionInfo pollOptionInfo2;
        PollOptionInfo pollOptionInfo3;
        PollOptionInfo pollOptionInfo4;
        List<PollOptionInfo> list = this.LJLJL;
        if (list != null && list.size() > 1) {
            List<PollOptionInfo> list2 = this.LJLJL;
            long j4 = 0;
            if (list2 != null && (pollOptionInfo4 = (PollOptionInfo) ListProtector.get(list2, 0)) != null) {
                j = pollOptionInfo4.votes;
            } else {
                j = 0;
            }
            List<PollOptionInfo> list3 = this.LJLJL;
            if (list3 != null && (pollOptionInfo3 = (PollOptionInfo) ListProtector.get(list3, 1)) != null) {
                j2 = pollOptionInfo3.votes;
            } else {
                j2 = 0;
            }
            if (j > j2) {
                i = 1;
            } else {
                List<PollOptionInfo> list4 = this.LJLJL;
                if (list4 != null && (pollOptionInfo2 = (PollOptionInfo) ListProtector.get(list4, 0)) != null) {
                    j3 = pollOptionInfo2.votes;
                } else {
                    j3 = 0;
                }
                List<PollOptionInfo> list5 = this.LJLJL;
                if (list5 != null && (pollOptionInfo = (PollOptionInfo) ListProtector.get(list5, 1)) != null) {
                    j4 = pollOptionInfo.votes;
                }
                if (j3 < j4) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            this.LJLZ = i;
        }
        switch (this.LJLIL) {
            case 257:
                LLIIIILZ(28.0f);
                LJZL().setDrawRadius(false);
                LLII(R.drawable.d9u);
                YBU LJZL = LJZL();
                LJZL.LLILZIL = 0;
                LJZL.LLILZLL = 0;
                LJZL.postInvalidate();
                LJZL().setScaleSize(this.LJLZ);
                int i2 = this.LJLZ;
                if (i2 != 1) {
                    if (i2 != 2) {
                        int LIZIZ = C15380j0.LIZIZ(R.color.a9_);
                        int LIZIZ2 = C15380j0.LIZIZ(R.color.a9g);
                        int LIZIZ3 = C15380j0.LIZIZ(R.color.a9f);
                        int LIZIZ4 = C15380j0.LIZIZ(R.color.a99);
                        YBU LJZL2 = LJZL();
                        LJZL2.LLFII = LIZIZ;
                        LJZL2.LLFZ = LIZIZ2;
                        LJZL2.LLI = LIZIZ3;
                        LJZL2.LLIFFJFJJ = LIZIZ4;
                        LJZL2.LLII = true;
                        LJZL2.postInvalidate();
                        LLFZ(1.0f, 1.0f);
                        break;
                    } else {
                        int LIZIZ5 = C15380j0.LIZIZ(R.color.a98);
                        int LIZIZ6 = C15380j0.LIZIZ(R.color.a9e);
                        int LIZIZ7 = C15380j0.LIZIZ(R.color.a9f);
                        int LIZIZ8 = C15380j0.LIZIZ(R.color.a99);
                        YBU LJZL3 = LJZL();
                        LJZL3.LLFII = LIZIZ5;
                        LJZL3.LLFZ = LIZIZ6;
                        LJZL3.LLI = LIZIZ7;
                        LJZL3.LLIFFJFJJ = LIZIZ8;
                        LJZL3.LLII = true;
                        LJZL3.postInvalidate();
                        LLFZ(0.4f, 1.0f);
                        break;
                    }
                } else {
                    int LIZIZ9 = C15380j0.LIZIZ(R.color.a9_);
                    int LIZIZ10 = C15380j0.LIZIZ(R.color.a9g);
                    int LIZIZ11 = C15380j0.LIZIZ(R.color.a9e);
                    int LIZIZ12 = C15380j0.LIZIZ(R.color.a98);
                    YBU LJZL4 = LJZL();
                    LJZL4.LLFII = LIZIZ9;
                    LJZL4.LLFZ = LIZIZ10;
                    LJZL4.LLI = LIZIZ11;
                    LJZL4.LLIFFJFJJ = LIZIZ12;
                    LJZL4.LLII = true;
                    LJZL4.postInvalidate();
                    LLFZ(1.0f, 0.4f);
                    break;
                }
            case 258:
                LJZL().setScaleSize(this.LJLZ);
                LLIILZL();
                break;
            case 259:
                LLIILZL();
                break;
        }
        LLIIJI();
    }

    public final YBU LJZL() {
        YBU ybu = this.LJLILLLLZI;
        if (ybu != null) {
            return ybu;
        }
        o.LJIJI("liveAbsPollView");
        throw null;
    }

    public void LL() {
        Room room;
        boolean z;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLL = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJLLL = z;
        this.LLD = true;
    }

    public final void LLFF() {
        long j;
        long j2;
        int i;
        long j3;
        List<PollOptionInfo> list;
        boolean z;
        UserVoteInfo userVoteInfo;
        Integer valueOf;
        UserVoteInfo userVoteInfo2;
        PollData pollData;
        PollData pollData2;
        PollData pollData3;
        PollData pollData4;
        PollData pollData5;
        PollData pollData6;
        Room room = this.LJLL;
        if (room != null) {
            PollMessage pollMessage = new PollMessage();
            this.LJLJLJ = pollMessage;
            pollMessage.messageType = 2L;
            PollInfo pollInfo = room.advancedPollInfo;
            long j4 = 0;
            if (pollInfo != null && (pollData6 = pollInfo.pollData) != null) {
                j = pollData6.pollId;
            } else {
                j = 0;
            }
            CC4.LIZIZ = j;
            if (pollInfo != null && (pollData5 = pollInfo.pollData) != null) {
                j2 = pollData5.pollId;
            } else {
                j2 = 0;
            }
            pollMessage.pollId = j2;
            int i2 = 0;
            if (pollInfo != null && (pollData4 = pollInfo.pollData) != null) {
                i = Integer.valueOf(pollData4.pollKind);
            } else {
                i = 0;
            }
            pollMessage.pollKind = i;
            PollStartContent pollStartContent = new PollStartContent();
            PollInfo pollInfo2 = room.advancedPollInfo;
            if (pollInfo2 != null && (pollData3 = pollInfo2.pollData) != null) {
                j3 = pollData3.startTime;
            } else {
                j3 = 0;
            }
            pollStartContent.startTime = j3;
            if (pollInfo2 != null && (pollData2 = pollInfo2.pollData) != null) {
                j4 = pollData2.endTime;
            }
            pollStartContent.endTime = j4;
            PollMessage pollMessage2 = this.LJLJLJ;
            if (pollMessage2 != null) {
                pollMessage2.startContent = pollStartContent;
            }
            this.LJLJJLL = pollStartContent;
            PollUpdateVotesContent pollUpdateVotesContent = new PollUpdateVotesContent();
            PollInfo pollInfo3 = room.advancedPollInfo;
            if (pollInfo3 == null || (pollData = pollInfo3.pollData) == null || (list = pollData.pollOptionList) == null) {
                list = C61878OQg.INSTANCE;
            }
            pollUpdateVotesContent.optionList = list;
            PollMessage pollMessage3 = this.LJLJLJ;
            if (pollMessage3 != null) {
                pollMessage3.updateContent = pollUpdateVotesContent;
            }
            if (pollInfo3 != null && (userVoteInfo2 = pollInfo3.userVoteInfo) != null) {
                z = userVoteInfo2.hasVoted;
            } else {
                z = false;
            }
            this.LJLLLLLL = 0;
            if (z) {
                if (pollInfo3 != null && (userVoteInfo = pollInfo3.userVoteInfo) != null && (valueOf = Integer.valueOf(userVoteInfo.voteOptionIndex)) != null) {
                    if (valueOf.intValue() == 0) {
                        i2 = 1;
                    } else if (valueOf.intValue() == 1) {
                        i2 = 2;
                    }
                }
                this.LJLLLLLL = i2;
            }
        }
    }

    public final void LLFII() {
        CCH cch = this.LJLJJL;
        if (cch != null) {
            cch.cancel();
        }
        this.LJZL = false;
        this.LJLLL = -1L;
        this.LJLLLL = -1L;
        this.LL = -1L;
        this.LJLLI = false;
        this.LJLLILLLL = false;
        this.LJLLJ = false;
        this.LLF = 2;
        this.LJLZ = 0;
        this.LJLLLLLL = 0;
    }

    public final void LLIIIL() {
        PollStartContent pollStartContent;
        PollEndContent pollEndContent;
        PollMessage pollMessage = this.LJLJLJ;
        if (pollMessage != null) {
            if (pollMessage.messageType == 1) {
                LJZ();
                PollMessage pollMessage2 = this.LJLJLJ;
                if (pollMessage2 != null && (pollEndContent = pollMessage2.endContent) != null && pollEndContent.endType != 0) {
                    CCH cch = this.LJLJJL;
                    if (cch != null) {
                        cch.cancel();
                    }
                    this.LJZL = false;
                }
                C47121t6 c47121t6 = this.LJLJI;
                if (c47121t6 != null) {
                    c47121t6.setVisibility(4);
                    if (isShowing()) {
                        LJZI(this.LJZI, false);
                    }
                    LLIIL();
                    PollMessage pollMessage3 = this.LJLJLJ;
                    if (pollMessage3 != null && CCG.LIZ == pollMessage3.pollId) {
                        return;
                    }
                    LLIILII();
                    return;
                }
                o.LJIJI("tvPollDownTime");
                throw null;
            }
            long j = 0;
            if (pollMessage == null) {
                return;
            }
            if (pollMessage.messageType == 0) {
                LJLZ();
                PollMessage pollMessage4 = this.LJLJLJ;
                if (pollMessage4 != null && (pollStartContent = pollMessage4.startContent) != null) {
                    j = pollStartContent.endTime;
                }
                if (j <= C30725C4b.LIZ()) {
                    return;
                }
                LJZI((j - C30725C4b.LIZ()) + this.LJZI, true);
                return;
            }
            if (pollMessage.messageType != 2) {
                return;
            }
            PollStartContent pollStartContent2 = pollMessage.startContent;
            if (pollStartContent2 != null) {
                j = pollStartContent2.endTime;
            }
            if (j > C30725C4b.LIZ()) {
                LJZI((j - C30725C4b.LIZ()) + this.LJZI, true);
            }
            if (!this.LLD) {
                return;
            }
            LJLZ();
            this.LLD = false;
        }
    }

    public void LLIIJI() {
        String str;
        long j;
        PollOptionInfo pollOptionInfo;
        PollOptionInfo pollOptionInfo2;
        PollOptionInfo pollOptionInfo3;
        PollOptionInfo pollOptionInfo4;
        List<PollOptionInfo> list = this.LJLJL;
        if (list != null && list.size() > 1) {
            List<PollOptionInfo> list2 = this.LJLJL;
            String str2 = null;
            if (list2 != null && (pollOptionInfo4 = (PollOptionInfo) ListProtector.get(list2, 0)) != null) {
                str = pollOptionInfo4.displayContent;
            } else {
                str = null;
            }
            List<PollOptionInfo> list3 = this.LJLJL;
            if (list3 != null && (pollOptionInfo3 = (PollOptionInfo) ListProtector.get(list3, 1)) != null) {
                str2 = pollOptionInfo3.displayContent;
            }
            YBU LJZL = LJZL();
            if (str == null) {
                str = "1";
            }
            if (str2 == null) {
                str2 = "2";
            }
            LJZL.LJFF(str, str2);
            List<PollOptionInfo> list4 = this.LJLJL;
            long j2 = 0;
            if (list4 != null && (pollOptionInfo2 = (PollOptionInfo) ListProtector.get(list4, 0)) != null) {
                j = pollOptionInfo2.votes;
            } else {
                j = 0;
            }
            List<PollOptionInfo> list5 = this.LJLJL;
            if (list5 != null && (pollOptionInfo = (PollOptionInfo) ListProtector.get(list5, 1)) != null) {
                j2 = pollOptionInfo.votes;
            }
            LLIIII(j, j2);
        }
    }

    public final void LLIIJLIL() {
        boolean z;
        Long l;
        Long l2;
        Gift gift;
        Gift gift2;
        Integer num;
        if (this.LJLIL == 257 && !this.LJLLI && !this.LJLJLLL) {
            PollMessage pollMessage = this.LJLJLJ;
            DataChannel dataChannel = this.dataChannel;
            HashMap hashMap = new HashMap();
            CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
            if (pollMessage == null || (num = pollMessage.pollKind) == null || num.intValue() != 0) {
                z = false;
            } else {
                z = true;
            }
            Long l3 = null;
            if (z) {
                hashMap.put("poll_type", "normal_poll");
            } else {
                hashMap.put("poll_type", "gift_poll");
                if (pollGifts != null && (gift2 = pollGifts.LJLIL) != null) {
                    l = Long.valueOf(gift2.id);
                } else {
                    l = null;
                }
                hashMap.put("gift_1_id", String.valueOf(l));
                if (pollGifts != null && (gift = pollGifts.LJLILLLLZI) != null) {
                    l2 = Long.valueOf(gift.id);
                } else {
                    l2 = null;
                }
                hashMap.put("gift_2_id", String.valueOf(l2));
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_poll_effect_show");
            if (pollMessage != null) {
                l3 = Long.valueOf(pollMessage.pollId);
            }
            LIZ.LJIJJ(l3, "poll_id");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJJIFFI(hashMap);
            LIZ.LJJIIJZLJL();
            this.LJLLI = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d1, code lost:
    
        if (r7 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01de, code lost:
    
        if (r7 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x030e, code lost:
    
        if (r7 != null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x031b, code lost:
    
        if (r7 != null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0177, code lost:
    
        if (r7 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0182, code lost:
    
        if (r7 != null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIL() {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget.LLIIL():void");
    }

    public void LLIILZL() {
        LLIIIILZ(32.0f);
        LJZL().setDrawRadius(true);
        LLFZ(0.6f, 0.6f);
        YBU LJZL = LJZL();
        LJZL.LLILZIL = 1;
        LJZL.LLILZLL = 2;
        LJZL.postInvalidate();
        int i = this.LJLZ;
        if (i != 1) {
            if (i != 2) {
                int LIZIZ = C15380j0.LIZIZ(R.color.a9d);
                int LIZIZ2 = C15380j0.LIZIZ(R.color.a9d);
                YBU LJZL2 = LJZL();
                LJZL2.LLFII = LIZIZ;
                LJZL2.LLFZ = LIZIZ;
                LJZL2.LLI = LIZIZ2;
                LJZL2.LLIFFJFJJ = LIZIZ2;
                LJZL2.LLII = true;
                LJZL2.postInvalidate();
                return;
            }
            int LIZIZ3 = C15380j0.LIZIZ(R.color.a9d);
            int LIZIZ4 = C15380j0.LIZIZ(R.color.a9f);
            YBU LJZL3 = LJZL();
            LJZL3.LLFII = LIZIZ3;
            LJZL3.LLFZ = LIZIZ3;
            LJZL3.LLI = LIZIZ4;
            LJZL3.LLIFFJFJJ = LIZIZ4;
            LJZL3.LLII = true;
            LJZL3.postInvalidate();
            return;
        }
        int LIZIZ5 = C15380j0.LIZIZ(R.color.a9g);
        int LIZIZ6 = C15380j0.LIZIZ(R.color.a9d);
        YBU LJZL4 = LJZL();
        LJZL4.LLFII = LIZIZ5;
        LJZL4.LLFZ = LIZIZ5;
        LJZL4.LLI = LIZIZ6;
        LJZL4.LLIFFJFJJ = LIZIZ6;
        LJZL4.LLII = true;
        LJZL4.postInvalidate();
    }

    public void init() {
        View findViewById = findViewById(R.id.meg);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_poll_downtime)");
        this.LJLJI = (C47121t6) findViewById;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        C1A.LIZLLL(this);
        LJZL().clearAnimation();
        LLFII();
        this.LJLJL = null;
        this.LLD = true;
    }

    public LiveAbsPollEffectWidget(int i) {
        this.LJLIL = i;
        this.LJLLL = -1L;
        this.LJLLLL = -1L;
        this.LJZ = 3000L;
        this.LJZI = 5000L;
        this.LL = -1L;
        this.LLD = true;
        this.LLF = 2;
    }

    public final void LLF(CCC pollType) {
        HashMap hashMap;
        PollData pollData;
        PollInfo pollInfo;
        o.LJIIIZ(pollType, "pollType");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (hashMap = (HashMap) dataChannel.kv0(C28979BYx.class)) == null || (pollData = (PollData) hashMap.get(Integer.valueOf(pollType.ordinal()))) == null) {
            return;
        }
        Room room = this.LJLL;
        if (room != null) {
            room.advancedPollInfo = new PollInfo();
        }
        Room room2 = this.LJLL;
        if (room2 != null && (pollInfo = room2.advancedPollInfo) != null) {
            pollInfo.pollData = pollData;
        }
        long j = pollData.pollId;
        CC4.LIZIZ = j;
        PollMessage pollMessage = this.LJLJLJ;
        if (pollMessage != null) {
            pollMessage.pollId = j;
            pollMessage.pollKind = Integer.valueOf(pollData.pollKind);
        }
        PollStartContent pollStartContent = new PollStartContent();
        pollStartContent.startTime = pollData.startTime;
        pollStartContent.endTime = pollData.endTime;
        PollMessage pollMessage2 = this.LJLJLJ;
        if (pollMessage2 != null) {
            pollMessage2.startContent = pollStartContent;
        }
        this.LJLJJLL = pollStartContent;
        PollUpdateVotesContent pollUpdateVotesContent = new PollUpdateVotesContent();
        pollUpdateVotesContent.optionList = pollData.pollOptionList;
        PollMessage pollMessage3 = this.LJLJLJ;
        if (pollMessage3 != null) {
            pollMessage3.updateContent = pollUpdateVotesContent;
        }
        CKB.INSTANCE.pollMessage = pollMessage3;
    }

    public final void LLFFF(CCC pollType) {
        long j;
        int i;
        List<PollOptionInfo> list;
        HashMap hashMap;
        o.LJIIIZ(pollType, "pollType");
        PollMessage pollMessage = new PollMessage();
        this.LJLJLJ = pollMessage;
        pollMessage.messageType = 1L;
        DataChannel dataChannel = this.dataChannel;
        PollData pollData = null;
        if (dataChannel != null && (hashMap = (HashMap) dataChannel.kv0(C28979BYx.class)) != null) {
            pollData = (PollData) hashMap.get(Integer.valueOf(pollType.ordinal()));
        }
        PollMessage pollMessage2 = this.LJLJLJ;
        if (pollMessage2 != null) {
            if (pollData != null) {
                j = pollData.pollId;
            } else {
                j = 0;
            }
            pollMessage2.pollId = j;
            if (pollData != null) {
                i = Integer.valueOf(pollData.pollKind);
            } else {
                i = 0;
            }
            pollMessage2.pollKind = i;
        }
        PollEndContent pollEndContent = new PollEndContent();
        if (pollData == null || (list = pollData.pollOptionList) == null) {
            list = C61878OQg.INSTANCE;
        }
        pollEndContent.optionList = list;
        PollMessage pollMessage3 = this.LJLJLJ;
        if (pollMessage3 == null) {
            return;
        }
        pollMessage3.endContent = pollEndContent;
    }

    public void LLIIIILZ(float f) {
        ViewGroup.LayoutParams layoutParams = LJZL().getLayoutParams();
        layoutParams.height = C15380j0.LIZ(f);
        if (this.LJLIL == 257) {
            layoutParams.width = C15380j0.LIZ(214.0f);
        } else {
            layoutParams.width = -1;
        }
        LJZL().setLayoutParams(layoutParams);
    }

    public void LLIIIJ(PollMessage pollMessage) {
        int i;
        PollEndContent pollEndContent;
        PollEndContent pollEndContent2;
        PollUpdateVotesContent pollUpdateVotesContent;
        List<PollOptionInfo> list;
        PollStartContent pollStartContent;
        PollMessage pollMessage2 = this.LJLJLJ;
        List<PollOptionInfo> list2 = null;
        PollStartContent pollStartContent2 = null;
        r8 = null;
        List<PollOptionInfo> list3 = null;
        list2 = null;
        if (pollMessage2 != null) {
            Long valueOf = Long.valueOf(pollMessage2.messageType);
            long j = 0;
            if (valueOf != null) {
                if (valueOf.longValue() == 0) {
                    CC4.LIZJ = false;
                    PollMessage pollMessage3 = this.LJLJLJ;
                    if (pollMessage3 != null && (pollStartContent = pollMessage3.startContent) != null) {
                        list = pollStartContent.optionList;
                    } else {
                        list = null;
                    }
                    this.LJLJL = list;
                    if (pollMessage3 != null) {
                        pollStartContent2 = pollMessage3.startContent;
                    }
                    this.LJLJJLL = pollStartContent2;
                    LLFII();
                } else if (valueOf.longValue() == 2) {
                    CC4.LIZJ = true;
                    PollMessage pollMessage4 = this.LJLJLJ;
                    if (pollMessage4 != null && (pollUpdateVotesContent = pollMessage4.updateContent) != null) {
                        list3 = pollUpdateVotesContent.optionList;
                    }
                    this.LJLJL = list3;
                    if (pollMessage4 != null) {
                        pollMessage4.startContent = this.LJLJJLL;
                    }
                } else if (valueOf.longValue() == 1) {
                    CC4.LIZJ = false;
                    PollMessage pollMessage5 = this.LJLJLJ;
                    if (pollMessage5 != null && (pollEndContent2 = pollMessage5.endContent) != null) {
                        list2 = pollEndContent2.optionList;
                    }
                    this.LJLJL = list2;
                    if (pollMessage5 != null) {
                        pollMessage5.startContent = this.LJLJJLL;
                        CommonMessageData commonMessageData = pollMessage5.baseMessage;
                        if (commonMessageData != null) {
                            j = commonMessageData.createTime;
                        }
                    }
                    this.LL = j;
                    if (pollMessage5 != null && (pollEndContent = pollMessage5.endContent) != null) {
                        i = pollEndContent.endType;
                    } else {
                        i = 2;
                    }
                    this.LLF = i;
                }
            }
        }
        CKB ckb = CKB.INSTANCE;
        PollMessage pollMessage6 = ckb.pollMessage;
        if (pollMessage6 != null && pollMessage6.startContent == null) {
            pollMessage6.startContent = this.LJLJJLL;
            ckb.pollMessage = pollMessage6;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        init();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        Object obj;
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.LJLJJI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), this);
        }
        C1A.LIZ(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, SelectPollVoteEvent.class, new AqS171S0100000_5(this, 777));
        }
        LL();
        hide();
        if (this.LJLIL == 257) {
            LJZL().postDelayed(new ARunnableS41S0100000_5(this, 291), this.LJZ);
        } else {
            LLIIIJ(null);
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C30079BrH) && ((obj = ((C30079BrH) obj2).LIZ) == null || (obj instanceof IMessage))) {
                    onMessage((IMessage) obj);
                }
            }
        }
        this.dataChannel.lv0(this, SubOnlyLiveAudienceStatusChannel.class, new AqS171S0100000_5(this, 455));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        Integer num;
        if (iMessage instanceof PollMessage) {
            PollMessage pollMessage = (PollMessage) iMessage;
            Integer num2 = pollMessage.pollKind;
            if ((num2 == null || num2.intValue() != 1) && ((num = pollMessage.pollKind) == null || num.intValue() != 0)) {
                return;
            }
            long j2 = pollMessage.baseMessage.createTime / 1000;
            Room room = this.LJLL;
            if (room != null) {
                j = room.nowTime;
            } else {
                j = 0;
            }
            if (j2 < j) {
                return;
            }
            CC4.LIZIZ = pollMessage.pollId;
            this.LJLJLJ = pollMessage;
            LLIIIJ(pollMessage);
        }
    }

    public final void LJZI(long j, boolean z) {
        if (this.LJZL || j <= 0) {
            return;
        }
        CCH cch = new CCH(j, z, this);
        this.LJLJJL = cch;
        cch.start();
        this.LJZL = true;
        CCH cch2 = this.LJLJJL;
        if (cch2 == null) {
            return;
        }
        cch2.start();
    }

    public final void LLFZ(float f, float f2) {
        YBU LJZL = LJZL();
        LJZL.LLILLIZIL = f;
        LJZL.LLILLJJLI = f2;
        LJZL.LLII = true;
        LJZL.postInvalidate();
    }

    public void LLIIII(long j, long j2) {
        if (j > this.LJLLL || j2 > this.LJLLLL) {
            this.LJLLL = j;
            this.LJLLLL = j2;
            LJZL().LJI(j, j2);
            LJZL().post(new ARunnableS2S0100200_5(j, j2, this, 1));
        }
    }
}
