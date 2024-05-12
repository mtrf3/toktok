package com.bytedance.android.livesdk.programmedlive.ui;

import X.B83;
import X.BCW;
import X.BJB;
import X.BJM;
import X.BU8;
import X.BZI;
import X.C05170If;
import X.C15380j0;
import X.C15490jB;
import X.C15640jQ;
import X.C16880lQ;
import X.C18950ol;
import X.C1EW;
import X.C28402BCs;
import X.C28594BKc;
import X.C28787BRn;
import X.C28835BTj;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29588BjM;
import X.C29590BjO;
import X.C29591BjP;
import X.C29592BjQ;
import X.C29593BjR;
import X.C29927Bop;
import X.C2A7;
import X.C2A8;
import X.C30079BrH;
import X.C30869C9p;
import X.C31665Cbl;
import X.C32537Cpp;
import X.C38354F3m;
import X.C47061t0;
import X.C47121t6;
import X.C5H3;
import X.C73411SrX;
import X.C73943T0h;
import X.C73969T1h;
import X.C74838TYs;
import X.C78996UzQ;
import X.CFX;
import X.CN1;
import X.EnumC29589BjN;
import X.EnumC31509CYf;
import X.OSZ;
import X.Q7L;
import X.T16;
import X.V0Q;
import Y.ACListenerS25S0100000_5;
import Y.ALAdapterS4S0100000_5;
import Y.AUListenerS94S0100000_5;
import Y.AfS57S0100000_5;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.programmedlive.model.FollowCard;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveFollowCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.FsFollowGuideDisplayStyleSetting;
import com.bytedance.android.livesdk.model.message.FollowCardMessage;
import com.bytedance.android.livesdk.programmedlive.api.ProgrammedLiveApi;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ProgrammedLiveFollowCardWidget extends LiveRecyclableWidget implements OnMessageListener {
    public C47061t0 LJLIL;
    public C47061t0 LJLILLLLZI;
    public LinearLayout LJLJI;
    public C2A8 LJLJJI;
    public C47061t0 LJLJJL;
    public C2A7 LJLJJLL;
    public LiveIconView LJLJL;
    public C47121t6 LJLJLJ;
    public C47121t6 LJLJLLL;
    public Room LJLL;
    public OSZ<FollowCardMessage, Boolean> LJLLI;
    public FollowCard LJLLILLLL;
    public IMessageManager LJLLJ;
    public ValueAnimator LJLZ;
    public ValueAnimator LJZ;
    public C73411SrX LJZI;
    public final boolean LL;
    public boolean LJLLL = true;
    public long LJLLLL = -1;
    public long LJLLLLLL = -1;
    public final C5H3 LJZL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 259));

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLLI = null;
        this.LJLLILLLL = null;
        this.LJLLL = true;
        this.LJLLLL = -1L;
        this.LJLLLLLL = -1L;
        LJLZ();
        IMessageManager iMessageManager = this.LJLLJ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.FOLLOW_CARD_MESSAGE.getIntType(), this);
        }
        C73411SrX c73411SrX = this.LJZI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            C73411SrX c73411SrX2 = this.LJZI;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            this.LJZI = null;
        }
        LJZL().removeCallbacksAndMessages(null);
    }

    public final void LJLZ() {
        ValueAnimator valueAnimator = this.LJLZ;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.LJLZ;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                } else {
                    o.LJIJI("showAnimator");
                    throw null;
                }
            }
            ValueAnimator valueAnimator3 = this.LJZ;
            if (valueAnimator3 != null) {
                if (valueAnimator3.isRunning()) {
                    ValueAnimator valueAnimator4 = this.LJZ;
                    if (valueAnimator4 != null) {
                        valueAnimator4.cancel();
                        return;
                    } else {
                        o.LJIJI("closeAnimator");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("closeAnimator");
            throw null;
        }
        o.LJIJI("showAnimator");
        throw null;
    }

    public final Handler LJZL() {
        return (Handler) this.LJZL.getValue();
    }

    public final void LLFZ() {
        User user;
        FollowCard followCard = this.LJLLILLLL;
        if (followCard != null && (user = followCard.user) != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId());
            userProfileEvent.mReportType = "report_anchor";
            userProfileEvent.mSource = "video_head";
            userProfileEvent.mClickUserPosition = "following_card";
            userProfileEvent.isFromProgrammedLiveFollowCard = true;
            C73943T0h.LIZ().LIZIZ(userProfileEvent);
            LJZI(EnumC29589BjN.OTHERS, true);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (this.LL) {
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).P70();
            return R.layout.do8;
        }
        return R.layout.dhb;
    }

    public ProgrammedLiveFollowCardWidget() {
        this.LL = FsFollowGuideDisplayStyleSetting.INSTANCE.getValue() == 2;
    }

    public final void LLFFF() {
        LJZL().removeMessages(2);
        C2A7 c2a7 = this.LJLJJLL;
        if (c2a7 != null) {
            c2a7.LJJLL(R.style.a2v);
            c2a7.setText(C15380j0.LJIILJJIL(R.string.l9r));
        }
        C2A7 c2a72 = this.LJLJJLL;
        if (c2a72 != null) {
            c2a72.setClickable(false);
        }
        Handler LJZL = LJZL();
        Message message = new Message();
        message.what = 3;
        LJZL.sendMessageDelayed(message, 1000L);
    }

    public final void LJZ(boolean z) {
        C47061t0 c47061t0 = this.LJLILLLLZI;
        if (c47061t0 != null) {
            c47061t0.setClickable(z);
        }
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            linearLayout.setClickable(z);
        }
        C2A7 c2a7 = this.LJLJJLL;
        if (c2a7 != null) {
            c2a7.setClickable(z);
        }
        LiveIconView liveIconView = this.LJLJL;
        if (liveIconView == null) {
            return;
        }
        liveIconView.setClickable(z);
    }

    public final void LL(User user) {
        C31665Cbl.LJIIIZ(this.LJLILLLLZI, user.getAvatarThumb(), R.drawable.cuj);
        C2A8 c2a8 = this.LJLJJI;
        if (c2a8 != null) {
            c2a8.setText(C05170If.LIZ(user));
            c2a8.requestLayout();
        }
        if (user.getAuthenticationInfo() != null) {
            C15640jQ.LJFF(this.LJLJJL, user.getAuthenticationInfo().authenticationBadge, 0, new IDdS56S0100000_5(this, 3));
        } else {
            C47061t0 c47061t0 = this.LJLJJL;
            if (c47061t0 != null) {
                c47061t0.setImageDrawable(null);
            }
            C47061t0 c47061t02 = this.LJLJJL;
            if (c47061t02 != null) {
                C29306Beo.LJI(c47061t02);
            }
        }
        if (user.isFollowing()) {
            LLFFF();
        } else {
            C2A7 c2a7 = this.LJLJJLL;
            if (c2a7 != null) {
                c2a7.LJJLL(R.style.a37);
                c2a7.setText(C15380j0.LJIILJJIL(R.string.l9h));
            }
        }
        this.LJZI = (C73411SrX) ((C29374Bfu) B83.LIZ().LIZIZ()).LIZ(user.getId()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 154), C29591BjP.LJLIL);
    }

    public final void LLF(boolean z) {
        User user;
        String str;
        int i;
        String str2;
        Map<String, String> params;
        String str3;
        Room room;
        FollowCard followCard = this.LJLLILLLL;
        if (followCard != null && (user = followCard.user) != null) {
            try {
                HashMap hashMap = new HashMap();
                if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
                    String LIZLLL = C28594BKc.LIZJ().LIZLLL();
                    o.LJIIIIZZ(LIZLLL, "getInstance().liveDrawerRequestPage");
                    hashMap.put("enter_live_method", LIZLLL);
                }
                String LJIIIZ = BJM.LJIIIZ();
                boolean isEmpty = TextUtils.isEmpty(LJIIIZ);
                String str4 = CardStruct.IStatusCode.DEFAULT;
                if (!isEmpty && o.LJ(LJIIIZ, "click_push_live_cd_user")) {
                    hashMap.put("is_subscribe", "1");
                } else {
                    hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
                }
                hashMap.put("request_page", "program_live_audience_c_anchor");
                if (z) {
                    hashMap.put("growth_deepevent", "1");
                }
                String connectionType = ((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType();
                o.LJIIIIZZ(connectionType, "getService(IInteractServ…lass.java).connectionType");
                hashMap.put("connection_type", connectionType);
                hashMap.put("to_user_id", String.valueOf(user.getId()));
                ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
                hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
                hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
                hashMap.put("click_user_position", "program_live_following_card");
                if (o.LJ(this.dataChannel.kv0(BCW.class), Boolean.TRUE)) {
                    str = "portrait";
                } else {
                    str = "landscape";
                }
                hashMap.put("room_orientation", str);
                FollowInfo followInfo = user.getFollowInfo();
                if (followInfo != null) {
                    i = (int) followInfo.getFollowStatus();
                } else {
                    i = 0;
                }
                hashMap.put("follow_status", String.valueOf(i));
                if (i != 1 && i != 3) {
                    str2 = "single";
                } else {
                    str2 = "mutual";
                }
                hashMap.put("follow_type", str2);
                IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                if (iInteractService.Qe0()) {
                    params = iInteractService.L00();
                } else {
                    params = new LinkedHashMap<>();
                }
                if (!TextUtils.isEmpty(iInteractService.FZ())) {
                    if (TextUtils.equals("in_pk", iInteractService.FZ())) {
                        o.LJIIIIZZ(params, "params");
                        params.put("match_status", "pk_phase");
                    } else {
                        o.LJIIIIZZ(params, "params");
                        params.put("match_status", "punish");
                    }
                }
                hashMap.putAll(params);
                hashMap.putAll(BJB.LIZ());
                if (C74838TYs.LJ().LJJ > 0) {
                    str4 = "1";
                }
                hashMap.put("is_guest_connection", str4);
                if (z) {
                    str3 = "livesdk_follow";
                } else {
                    str3 = "livesdk_unfollow";
                }
                BZI LIZ = C28787BRn.LIZ(str3);
                LIZ.LJJIFFI(hashMap);
                LIZ.LJIILIIL(new BU8("live", user.getId()));
                LIZ.LJIILLIIL(this.dataChannel);
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                    LIZ.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).u4(room.getId())), "server_heat_level");
                    LIZ.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).F(room.getId())), "client_heat_level");
                }
                LIZ.LIZLLL(C28835BTj.LIZJ("user_live_follow"));
                LIZ.LJIIIZ("live_interact");
                LIZ.LJIIJJI("live_detail");
                LIZ.LJJIIJZLJL();
            } catch (Exception unused) {
            }
        }
    }

    public final void LLFII(boolean z) {
        User user;
        View view = getView();
        if (view != null && view.getVisibility() == 0) {
            return;
        }
        LJLZ();
        ValueAnimator valueAnimator = this.LJLZ;
        Long l = null;
        if (valueAnimator != null) {
            valueAnimator.start();
            if (z) {
                this.LJLLLL = SystemClock.elapsedRealtime();
                BZI LIZ = C28787BRn.LIZ("livesdk_program_live_following_card_show");
                FollowCard followCard = this.LJLLILLLL;
                if (followCard != null && (user = followCard.user) != null) {
                    l = Long.valueOf(user.getId());
                }
                LIZ.LJIJJ(l, "to_user_id");
                LIZ.LJJIIJZLJL();
                return;
            }
            return;
        }
        o.LJIJI("showAnimator");
        throw null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLIL = (C47061t0) findViewById(R.id.af5);
        this.LJLILLLLZI = (C47061t0) findViewById(R.id.abh);
        this.LJLJI = (LinearLayout) findViewById(R.id.mzv);
        this.LJLJJI = (C2A8) findViewById(R.id.gvs);
        this.LJLJJL = (C47061t0) findViewById(R.id.a_t);
        this.LJLJJLL = (C2A7) findViewById(R.id.djm);
        this.LJLJL = (LiveIconView) findViewById(R.id.bf7);
        this.LJLJLJ = (C47121t6) findViewById(R.id.bug);
        this.LJLJLLL = (C47121t6) findViewById(R.id.btj);
        C15490jB.LJ(this.LJLIL, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_programmed_live_follow_card_background.png");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(0F, 1F)");
        this.LJLZ = ofFloat;
        ofFloat.addListener(new ALAdapterS4S0100000_5(this, 53));
        ValueAnimator valueAnimator = this.LJLZ;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new AUListenerS94S0100000_5(this, 43));
            ValueAnimator valueAnimator2 = this.LJLZ;
            if (valueAnimator2 != null) {
                valueAnimator2.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                ValueAnimator valueAnimator3 = this.LJLZ;
                if (valueAnimator3 != null) {
                    valueAnimator3.setDuration(300L);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    o.LJIIIIZZ(ofFloat2, "ofFloat(1F, 0F)");
                    this.LJZ = ofFloat2;
                    ofFloat2.addListener(new ALAdapterS4S0100000_5(this, 54));
                    ValueAnimator valueAnimator4 = this.LJZ;
                    if (valueAnimator4 != null) {
                        valueAnimator4.addUpdateListener(new AUListenerS94S0100000_5(this, 44));
                        ValueAnimator valueAnimator5 = this.LJZ;
                        if (valueAnimator5 != null) {
                            valueAnimator5.setInterpolator(C18950ol.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                            ValueAnimator valueAnimator6 = this.LJZ;
                            if (valueAnimator6 != null) {
                                valueAnimator6.setDuration(300L);
                                return;
                            } else {
                                o.LJIJI("closeAnimator");
                                throw null;
                            }
                        }
                        o.LJIJI("closeAnimator");
                        throw null;
                    }
                    o.LJIJI("closeAnimator");
                    throw null;
                }
                o.LJIJI("showAnimator");
                throw null;
            }
            o.LJIJI("showAnimator");
            throw null;
        }
        o.LJIJI("showAnimator");
        throw null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        User user;
        Object obj;
        User user2;
        this.LJLL = (Room) this.dataChannel.kv0(RoomChannel.class);
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.LJLLJ = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.FOLLOW_CARD_MESSAGE.getIntType(), this);
        }
        C47061t0 c47061t0 = this.LJLILLLLZI;
        if (c47061t0 != null) {
            C16880lQ.LJJI(c47061t0, new ACListenerS25S0100000_5(this, 232));
        }
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS25S0100000_5(this, 233));
        }
        C2A7 c2a7 = this.LJLJJLL;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 234));
        }
        C47121t6 c47121t6 = this.LJLJLJ;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILL(R.string.l9l, C05170If.LIZ(((C29374Bfu) B83.LIZ().LIZIZ()).LJ())));
        }
        C47121t6 c47121t62 = this.LJLJLLL;
        if (c47121t62 != null) {
            Object[] objArr2 = new Object[1];
            FollowCard followCard = this.LJLLILLLL;
            if (followCard != null) {
                user = followCard.user;
            } else {
                user = null;
            }
            objArr2[0] = C05170If.LIZ(user);
            c47121t62.setText(C15380j0.LJIILL(R.string.l9m, objArr2));
        }
        LiveIconView liveIconView = this.LJLJL;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this, 235));
        }
        this.dataChannel.lv0(this, ProgrammedLiveFollowCardVisibilityChannel.class, new AqS171S0100000_5(this, 465));
        C29588BjM c29588BjM = (C29588BjM) this.dataChannel.kv0(C28402BCs.class);
        if (c29588BjM != null) {
            FollowCard followCard2 = c29588BjM.LJLIL;
            this.LJLLILLLL = followCard2;
            if (followCard2 != null && (user2 = followCard2.user) != null && this.LJLLL && !c29588BjM.LJLILLLLZI) {
                LL(user2);
                LLFII(false);
                this.LJLLLL = c29588BjM.LJLJI;
            }
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C30079BrH) && ((obj = ((C30079BrH) obj2).LIZ) == null || (obj instanceof IMessage))) {
                    onMessage((IMessage) obj);
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        if (iMessage instanceof FollowCardMessage) {
            FollowCardMessage followCardMessage = (FollowCardMessage) iMessage;
            OSZ<FollowCardMessage, Boolean> osz = this.LJLLI;
            if (osz == null || (true ^ o.LJ(followCardMessage.followCardId, osz.getFirst().followCardId))) {
                this.LJLLI = new OSZ<>(iMessage, Boolean.FALSE);
                if (this.LJLLL) {
                    Handler LJZL = LJZL();
                    Message message = new Message();
                    message.what = 0;
                    message.obj = iMessage;
                    Long l = followCardMessage.maxRandom;
                    if (l != null) {
                        j = V0Q.Default.nextLong(l.longValue());
                    } else {
                        j = 0;
                    }
                    LJZL.sendMessageDelayed(message, j);
                }
            }
        }
    }

    public final void LJZI(EnumC29589BjN enumC29589BjN, boolean z) {
        if (enumC29589BjN == EnumC29589BjN.NETWORK) {
            View view = getView();
            if (view != null && view.getVisibility() == 0) {
                hide();
            }
            LLFF(enumC29589BjN, z);
            return;
        }
        View view2 = getView();
        if (view2 != null && view2.getVisibility() == 8) {
            return;
        }
        if (enumC29589BjN == EnumC29589BjN.PASSIVE) {
            hide();
        } else {
            LJLZ();
            ValueAnimator valueAnimator = this.LJZ;
            if (valueAnimator != null) {
                valueAnimator.start();
            } else {
                o.LJIJI("closeAnimator");
                throw null;
            }
        }
        LLFF(enumC29589BjN, z);
    }

    public final void LLFF(EnumC29589BjN enumC29589BjN, boolean z) {
        Long l;
        String str;
        User user;
        long j;
        long j2;
        boolean z2;
        if (z) {
            Room room = this.LJLL;
            long j3 = 0;
            if (room != null) {
                long id = room.getId();
                FollowCard followCard = this.LJLLILLLL;
                if (followCard != null) {
                    ProgrammedLiveApi programmedLiveApi = (ProgrammedLiveApi) Q7L.LIZIZ(ProgrammedLiveApi.class);
                    Long l2 = followCard.id;
                    if (l2 != null) {
                        j = l2.longValue();
                    } else {
                        j = 0;
                    }
                    User user2 = followCard.user;
                    if (user2 != null) {
                        j2 = user2.getId();
                    } else {
                        j2 = 0;
                    }
                    if (enumC29589BjN == EnumC29589BjN.ACTIVE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C1EW.LIZ(programmedLiveApi.closeFollowCard(id, j, j2, z2)).LJJJLIIL(C29592BjQ.LJLIL, C29593BjR.LJLIL);
                }
            }
            this.LJLLLLLL = SystemClock.elapsedRealtime();
            BZI LIZ = C28787BRn.LIZ("livesdk_program_live_following_card_close");
            FollowCard followCard2 = this.LJLLILLLL;
            if (followCard2 != null && (user = followCard2.user) != null) {
                l = Long.valueOf(user.getId());
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "to_user_id");
            int i = C29590BjO.LIZ[enumC29589BjN.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    str = "others";
                } else {
                    str = "auto_close";
                }
            } else {
                str = "click_close";
            }
            LIZ.LJIJJ(str, "close_scene");
            long j4 = this.LJLLLL;
            if (j4 != -1) {
                long j5 = this.LJLLLLLL;
                if (j5 != -1) {
                    j3 = j5 - j4;
                }
            }
            C30869C9p.LIZ(j3, LIZ, "duration");
        }
        ((C32537Cpp) this.dataChannel.gv0(C28402BCs.class)).LIZ = null;
        C73411SrX c73411SrX = this.LJZI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            C73411SrX c73411SrX2 = this.LJZI;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            this.LJZI = null;
        }
        this.LJLLILLLL = null;
        this.LJLLLL = -1L;
        this.LJLLLLLL = -1L;
    }
}
