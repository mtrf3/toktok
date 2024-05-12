package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import X.ActivityC45651qj;
import X.B3M;
import X.B57;
import X.B83;
import X.B9W;
import X.BCW;
import X.BG0;
import X.BG1;
import X.BG4;
import X.BJL;
import X.BZI;
import X.C03880Dg;
import X.C05170If;
import X.C0JU;
import X.C0K2;
import X.C10A;
import X.C116484hg;
import X.C141335gf;
import X.C15380j0;
import X.C15510jD;
import X.C15650jR;
import X.C16880lQ;
import X.C23010vJ;
import X.C279117r;
import X.C28154B3e;
import X.C28207B5f;
import X.C28239B6l;
import X.C28329B9x;
import X.C28393BCj;
import X.C28407BCx;
import X.C28486BFy;
import X.C28487BFz;
import X.C28733BPl;
import X.C28787BRn;
import X.C29054Bak;
import X.C29374Bfu;
import X.C29701Eo;
import X.C29S;
import X.C2A4;
import X.C30326BvG;
import X.C30869C9p;
import X.C31665Cbl;
import X.C32537Cpp;
import X.C3C5;
import X.C47061t0;
import X.C47121t6;
import X.C48459J0d;
import X.C51029K0z;
import X.C65300Pk0;
import X.C74740TUy;
import X.C76800UCe;
import X.C78720Uuy;
import X.C90903hW;
import X.CFX;
import X.CN1;
import X.CXJ;
import X.InterfaceC27469AqH;
import X.InterfaceC28240B6m;
import X.InterfaceC30442Bx8;
import X.KL2;
import X.KNV;
import X.X1D;
import Y.ACListenerS24S0101000_5;
import Y.AObjectS42S0101000_5;
import Y.ARunnableS11S0101000_7;
import Y.ARunnableS15S0101000_11;
import Y.IDCListenerS10S0101000;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.room.DispatchRoomLoadEvent;
import com.bytedance.android.livesdk.SwipeNextEvent;
import com.bytedance.android.livesdk.chatroom.end.LiveEndFragment;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.liveend.LiveNewAudienceFinishPageSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.widget.LiveDebugInfoView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class LiveNewAudienceEndFragment extends LiveEndFragment implements BG4, InterfaceC28240B6m, InterfaceC27469AqH, View.OnClickListener {
    public static final /* synthetic */ int LLILZIL = 0;
    public LiveNewAudienceEndPresenter LJLJI;
    public DataChannel LJLJJI;
    public Room LJLJJLL;
    public B3M LJLJL;
    public ControlMessage LJLJLLL;
    public PunishEventInfo LJLL;
    public C47121t6 LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public ImageView LJLLLL;
    public C47061t0 LJLLLLLL;
    public B9W LJLZ;
    public C47121t6 LJZ;
    public C47121t6 LJZI;
    public LiveIconView LJZL;
    public View LL;
    public C47121t6 LLD;
    public C47121t6 LLF;
    public C29701Eo LLFF;
    public C2A4 LLFFF;
    public View LLFII;
    public View LLFZ;
    public LiveIconView LLI;
    public LiveIconView LLIFFJFJJ;
    public boolean LLII;
    public volatile boolean LLIIIILZ;
    public LiveDebugInfoView LLIIIJ;
    public RecyclableWidgetManager LLIIIL;
    public boolean LLIIIZ;
    public String LLIIJLIL;
    public long LLIIL;
    public boolean LLIILII;
    public int LLIILZL;
    public boolean LLIL;
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ());
    public long LJLJLJ = 0;
    public int LLIIII = 0;
    public int LLIIJI = 0;
    public int LLIIZ = 0;
    public String LLILII = "user_swipe";
    public boolean LLILIL = false;
    public boolean LLILL = false;
    public boolean LLILLIZIL = false;
    public final long LLILLJJLI = SystemClock.elapsedRealtime();
    public final ARunnableS11S0101000_7 LLILLL = new ARunnableS11S0101000_7(0, this, 10);
    public final ARunnableS11S0101000_7 LLILZ = new ARunnableS11S0101000_7(0, this, 11);

    public final int Al() {
        return C15380j0.LIZ(16.0f) + this.LL.getHeight() + C15380j0.LIZ(16.0f);
    }

    public final void Gl() {
        C47121t6 c47121t6 = this.LLD;
        if (c47121t6 != null) {
            c47121t6.setText(C15380j0.LJIILJJIL(R.string.l0r));
        }
        C47121t6 c47121t62 = this.LLF;
        if (c47121t62 != null) {
            c47121t62.setVisibility(4);
        }
    }

    public final void Hl() {
        this.LLILII = "auto_swipe";
        if (this.LLIL) {
            ((IHostWatch) CN1.LIZ(IHostWatch.class)).searchScrollToNextItem();
        } else {
            DataChannel dataChannel = this.LJLJJI;
            if (dataChannel != null) {
                dataChannel.rv0(SwipeNextEvent.class, Long.valueOf(this.LJLJLJ));
            }
        }
        this.LLIIII--;
        C47121t6 c47121t6 = this.LLF;
        if (c47121t6 != null) {
            c47121t6.setVisibility(4);
        }
    }

    @Override // X.BG4
    public final void k6() {
        C29701Eo c29701Eo;
        if (this.LJZL == null || (c29701Eo = this.LLFF) == null || this.LLFFF == null) {
            return;
        }
        c29701Eo.setVisibility(8);
        this.LLFFF.setVisibility(8);
        this.LJZL.setVisibility(0);
        Il(false);
    }

    @Override // X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        B3M b3m = this.LJLJL;
        if (b3m != null) {
            b3m.onBackPressed();
            return true;
        }
        return false;
    }

    public final int xl() {
        return C15380j0.LIZ(12.0f) + this.LJLLILLLL.getHeight() + C15380j0.LIZ(4.0f) + this.LLF.getHeight();
    }

    public final int Dl() {
        return xl() + C15380j0.LIZ(12.0f) + C15380j0.LIZ(200.0f) + C15380j0.LIZ(8.0f) + Al();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.LJLJJL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJLJI.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Handler handler = this.LJLJJL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Gl();
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.LiveEndFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLIIIILZ) {
            Handler handler = this.LJLJJL;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        Jl(false);
        this.LLILLIZIL = true;
    }

    @Override // X.BG4
    public final void Ab(Room room) {
        if (room != null && this.LJZL != null && this.LLFF != null && this.LLFFF != null) {
            if (room.getOwner() != null && room.getOwner().getFollowInfo().getFollowStatus() != 1 && room.getOwner().getFollowInfo().getFollowStatus() != 2) {
                this.LJZL.setVisibility(0);
            } else {
                this.LJZL.setVisibility(8);
            }
            this.LLFF.setVisibility(8);
            this.LLFFF.setVisibility(8);
        }
    }

    public final void Il(boolean z) {
        String str;
        this.LLFZ.setVisibility(8);
        if (z) {
            this.LLFZ.setVisibility(0);
            if (!((IHostAction) CN1.LIZ(IHostAction.class)).isNotificationEnabled(getContext()) || !((IHostAction) CN1.LIZ(IHostAction.class)).getPushLiveState()) {
                this.LLI.setIconAttr(R.attr.as6);
            }
        }
        if (this.LLII) {
            return;
        }
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.LLLFFI;
        if (System.currentTimeMillis() - c48459J0d.LIZJ().longValue() < 1296000000) {
            return;
        }
        C48459J0d<Integer> c48459J0d2 = InterfaceC30442Bx8.LLLFZ;
        int intValue = c48459J0d2.LIZJ().intValue();
        if (intValue > 3) {
            return;
        }
        if (!((IHostAction) CN1.LIZ(IHostAction.class)).isNotificationEnabled(getContext()) || !((IHostAction) CN1.LIZ(IHostAction.class)).getPushLiveState()) {
            c48459J0d.LIZ(Long.valueOf(System.currentTimeMillis()));
            c48459J0d2.LIZ(Integer.valueOf(intValue + 1));
            Room room = this.LJLJJLL;
            String str2 = "-1";
            if (room == null || room.getOwner() == null) {
                str = "-1";
            } else {
                str = String.valueOf(this.LJLJJLL.getOwner().getId());
            }
            Room room2 = this.LJLJJLL;
            if (room2 != null) {
                str2 = String.valueOf(room2.getId());
            }
            BZI LIZIZ = C0JU.LIZIZ("livesdk_notification_setting_alert_show", "live_end", "enter_from_merge", str2, "room_id");
            LIZIZ.LJIJJ(str, "anchor_id");
            LIZIZ.LJJIIJZLJL();
        }
    }

    public final void Jl(boolean z) {
        LiveNewAudienceEndPresenter liveNewAudienceEndPresenter = this.LJLJI;
        if (liveNewAudienceEndPresenter != null) {
            if (z) {
                liveNewAudienceEndPresenter.syncRoomStatus(this.LJLJLJ);
            } else if (!this.LLILLIZIL || !getUserVisibleHint()) {
                return;
            }
            this.LJLJI.syncRecommendData(this.LJLJLJ, 0L);
            this.LLILIL = false;
        }
    }

    @Override // X.BG4
    public final void R6(Room room) {
        int i;
        View findViewById;
        View view;
        boolean z;
        User user;
        String str;
        ImageModel avatarLarge;
        OfficialChannelInfo officialChannelInfo;
        User user2;
        String str2;
        String string;
        OfficialChannelInfo officialChannelInfo2;
        OfficialChannelInfo officialChannelInfo3;
        User user3;
        if (!isAdded()) {
            return;
        }
        this.LJLJJLL = room;
        if (room == null || room.getStats() == null) {
            i = 0;
        } else {
            i = room.getStats().replayViewers;
        }
        if (i <= 0) {
            C47121t6 c47121t6 = this.LJZ;
            if (c47121t6 != null) {
                c47121t6.setVisibility(8);
            }
        } else {
            StringBuilder LIZJ = b1.LIZJ(C28329B9x.LIZ(i), " ");
            LIZJ.append(C15380j0.LJIILJJIL(R.string.sqn));
            String LIZIZ = X1D.LIZIZ(LIZJ);
            C47121t6 c47121t62 = this.LJZ;
            if (c47121t62 != null) {
                c47121t62.setText(LIZIZ);
            }
        }
        if (this.LJLLLL != null && this.LJLLLLLL != null && (view = this.LLFII) != null) {
            view.setVisibility(8);
            IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
            if (iMicRoomService != null && iMicRoomService.jT(this.LJLJJLL) && iMicRoomService.Qo(this.LJLJJLL)) {
                z = true;
            } else {
                z = false;
            }
            Room room2 = this.LJLJJLL;
            ImageModel imageModel = null;
            if (room2 != null) {
                user = room2.getOwner();
                if (user != null && this.LJLJJL != null && this.LLD != null) {
                    if (z) {
                        Room room3 = this.LJLJJLL;
                        if (room3 != null && (officialChannelInfo3 = room3.officialChannelInfo) != null && (user3 = officialChannelInfo3.channelUser) != null) {
                            imageModel = user3.getAvatarMedium();
                        }
                        C31665Cbl.LJIIIZ(this.LJLLLL, imageModel, R.drawable.d1c);
                    } else {
                        C31665Cbl.LJIIIZ(this.LJLLLL, user.getAvatarMedium(), R.drawable.d1c);
                    }
                    C16880lQ.LJIILLIIL(this.LJLLLL, new ACListenerS24S0101000_5(0, this, 9));
                    if (this.LJLLI != null) {
                        Room room4 = this.LJLJJLL;
                        if (room4 != null && (officialChannelInfo2 = room4.officialChannelInfo) != null) {
                            str2 = C05170If.LIZ(officialChannelInfo2.channelUser);
                        } else {
                            str2 = "";
                        }
                        if (z) {
                            this.LJLLI.setText(str2);
                            string = getString(R.string.l99, str2);
                        } else {
                            String LIZ = C05170If.LIZ(user);
                            this.LJLLI.setText(LIZ);
                            string = getString(R.string.l99, LIZ);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        int length = spannableStringBuilder.length();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(" ");
                        LIZ2.append(getString(R.string.l9_));
                        spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ2));
                        C23010vJ.LIZJ(getContext(), spannableStringBuilder, 0, length, 33, 3, LiveChatShowDelayForHotLiveSetting.DEFAULT);
                        C23010vJ.LIZJ(getContext(), spannableStringBuilder, length + 1, spannableStringBuilder.length(), 33, 3, 600);
                    }
                }
            } else {
                user = null;
            }
            float LJIIJJI = KL2.LJIIJJI(getContext()) / KL2.LJIIIZ(getContext());
            if (user != null) {
                if (z) {
                    Room room5 = this.LJLJJLL;
                    if (room5 != null && (officialChannelInfo = room5.officialChannelInfo) != null && (user2 = officialChannelInfo.channelUser) != null) {
                        avatarLarge = user2.getAvatarLarge();
                        if (avatarLarge != null && avatarLarge.getUrls() != null && avatarLarge.getUrls().size() > 0) {
                            C78720Uuy LIZ3 = C15650jR.LIZ().LIZ(avatarLarge.getUrls());
                            LIZ3.LJIILL = LJIIJJI;
                            LIZ3.LJIILLIIL = 8;
                            LIZ3.LJIIJJI(this.LJLLLLLL);
                        }
                    }
                } else if (user.getAvatarLarge() != null) {
                    avatarLarge = user.getAvatarLarge();
                    if (avatarLarge != null) {
                        C78720Uuy LIZ32 = C15650jR.LIZ().LIZ(avatarLarge.getUrls());
                        LIZ32.LJIILL = LJIIJJI;
                        LIZ32.LJIILLIIL = 8;
                        LIZ32.LJIIJJI(this.LJLLLLLL);
                    }
                }
            }
            Room room6 = this.LJLJJLL;
            if (room6 != null && this.LJZL != null && this.LLFF != null && this.LLFFF != null && room6.getOwner().getFollowInfo().getFollowStatus() != 1 && this.LJLJJLL.getOwner().getFollowInfo().getFollowStatus() != 2) {
                this.LJZL.setVisibility(0);
                this.LLFF.setVisibility(8);
                this.LLFFF.setVisibility(8);
            }
            if (user != null && user.getFollowInfo() != null) {
                if (user.getFollowInfo().getFollowStatus() != 1 && user.getFollowInfo().getFollowStatus() != 2) {
                    Il(false);
                } else {
                    Il(true);
                }
            }
            if (this.LJLJI != null && user != null) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("target_uid", String.valueOf(user.getId()));
                C116484hg.LIZIZ(hashMap, "sec_target_uid", ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(user.getId()), 2, "packed_level");
                hashMap.put("current_room_id", String.valueOf(this.LJLJJLL.getId()));
                hashMap.put("request_from", "live_push_settings");
                if (this.LJLJJLL.getOwner() != null) {
                    str = String.valueOf(this.LJLJJLL.getOwner().getId());
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("anchor_id", str);
                hashMap.put("sec_anchor_id", ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(this.LJLJJLL.getOwnerUserId()));
                this.LJLJI.syncUserPushStatus(hashMap, new BG1(this));
            }
        }
        if (this.LJLJJLL == null || getView() == null) {
            return;
        }
        if ((!((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() && !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) || (findViewById = getView().findViewById(R.id.c3x)) == null) {
            return;
        }
        findViewById.setVisibility(8);
        Boolean bool = C28154B3e.LIZ;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        findViewById.setVisibility(0);
        if (this.LLIIIJ == null) {
            this.LLIIIJ = new LiveDebugInfoView();
        }
        if (this.LLIIIZ) {
            return;
        }
        LiveDebugInfoView liveDebugInfoView = this.LLIIIJ;
        liveDebugInfoView.args = new Object[]{this.LJLJJLL};
        this.LLIIIZ = true;
        this.LLIIIL.load(R.id.c3x, liveDebugInfoView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (r7 != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018c  */
    @Override // X.BG4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T1(java.util.List<com.bytedance.android.livesdkapi.depend.model.live.Room> r11) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragment.T1(java.util.List):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Room room;
        User owner;
        String str;
        if (view.getId() != R.id.h5q || (room = this.LJLJJLL) == null || (owner = room.getOwner()) == null || owner.getFollowInfo() == null) {
            return;
        }
        if (view.getId() == R.id.h5q) {
            BZI LIZ = C28787BRn.LIZ("livesdk_finish_bell_click");
            LIZ.LJIJJ(Long.valueOf(((C29374Bfu) C279117r.LIZJ(LIZ, this.LJLJJI)).getCurrentUserId()), "user_id");
            LIZ.LJJIIJZLJL();
        }
        C47121t6 c47121t6 = this.LJLLI;
        if (c47121t6 != null && !TextUtils.isEmpty(c47121t6.getText())) {
            str = this.LJLLI.getText().toString();
        } else {
            str = "";
        }
        int pushStatus = (int) owner.getFollowInfo().getPushStatus();
        this.LLIIIILZ = true;
        C28486BFy c28486BFy = new C28486BFy();
        c28486BFy.LIZIZ = String.valueOf(owner.getId());
        c28486BFy.LIZ = String.valueOf(this.LJLJJLL.getId());
        c28486BFy.LIZJ = "live_end";
        c28486BFy.LIZLLL = "live_cover";
        ((IHostAction) CN1.LIZ(IHostAction.class)).showNotificationTipDialog(C05170If.LIZLLL(owner), String.valueOf(owner.getId()), str, owner.getSecUid(), pushStatus, view, getString(R.string.nla, str), c28486BFy, ((Boolean) this.LJLJJI.kv0(BCW.class)).booleanValue(), new C28487BFz(this, owner));
        Handler handler = this.LJLJJL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.LJLJJL.postDelayed(new ARunnableS15S0101000_11(0, this, 9), LiveNewAudienceFinishPageSetting.INSTANCE.getValue().timeCountDown * 1000);
        }
        Gl();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Integer, O] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.B6l, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJJI = C51029K0z.LJIILIIL(this);
        LiveNewAudienceEndPresenter liveNewAudienceEndPresenter = new LiveNewAudienceEndPresenter(this);
        this.LJLJI = liveNewAudienceEndPresenter;
        liveNewAudienceEndPresenter.setListener(this.LJLJL);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLIIJI = arguments.getInt("room_position", -1);
            this.LLIIJLIL = arguments.getString("show_reason", "");
            this.LLIIL = arguments.getLong("watch_live_duration", 0L);
            this.LLIILII = arguments.getBoolean("can_swipe_next", false);
            this.LLIILZL = arguments.getInt("live_end_reason", 0);
            this.LLIIZ = arguments.getInt("enter_live_alive", 0);
            this.LLIL = arguments.getBoolean("enter_live_is_from_search", false);
        }
        DataChannel dataChannel = this.LJLJJI;
        if (dataChannel != null) {
            dataChannel.ov0(this, DispatchRoomLoadEvent.class, new AObjectS42S0101000_5(2, this, 54));
            ((C32537Cpp) this.LJLJJI.gv0(C28393BCj.class)).LIZ = Integer.valueOf(this.LLIILZL);
        }
        DataChannel dataChannel2 = this.LJLJJI;
        if (dataChannel2 != null) {
            C28239B6l c28239B6l = (C28239B6l) dataChannel2.kv0(C28407BCx.class);
            C28239B6l c28239B6l2 = c28239B6l;
            if (c28239B6l == null) {
                ?? c28239B6l3 = new C28239B6l();
                ((C32537Cpp) this.LJLJJI.gv0(C28407BCx.class)).LIZ = c28239B6l3;
                c28239B6l2 = c28239B6l3;
            }
            BJL bjl = (BJL) DataChannelGlobal.LJLJJI.mv0(C29054Bak.class);
            if (bjl != null) {
                bjl.LJJ = 1;
                String str = bjl.LIZ;
                bjl.LJJIFFI = str;
                String str2 = bjl.LIZIZ;
                bjl.LJJI = str2;
                String str3 = bjl.LJ;
                bjl.LJJII = str3;
                c28239B6l2.LIZIZ = str;
                c28239B6l2.LIZ = str2;
                c28239B6l2.LIZJ = str3;
                if (TextUtils.equals("normal", this.LLIIJLIL) || this.LLIIZ == 1) {
                    c28239B6l2.LIZLLL = "live_end";
                    bjl.LJJIII = "live_end";
                } else {
                    c28239B6l2.LIZLLL = "recommend";
                    bjl.LJJIII = "recommend";
                }
            }
        }
        Jl(true);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "7192788845139698702");
        if (c03880Dg.LIZJ(10502, "com/bytedance/android/livesdk/chatroom/end/newaudienceend/LiveNewAudienceEndFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/bytedance/android/livesdk/chatroom/end/newaudienceend/LiveNewAudienceEndFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        this.LLILL = z;
        if (z) {
            if (this.LLIIIILZ) {
                c03880Dg.LIZIZ(10502, "com/bytedance/android/livesdk/chatroom/end/newaudienceend/LiveNewAudienceEndFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
                return;
            }
            Jl(false);
        } else {
            Handler handler = this.LJLJJL;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Gl();
            C28207B5f.LIZ(this.LJLJJI, this.LLILII);
            String str = this.LLILII;
            BJL bjl = (BJL) DataChannelGlobal.LJLJJI.mv0(C29054Bak.class);
            if (bjl != null) {
                bjl.LJJ = 1;
                bjl.LJJIIJ = str;
            }
        }
        c03880Dg.LIZIZ(10502, "com/bytedance/android/livesdk/chatroom/end/newaudienceend/LiveNewAudienceEndFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final void wl(int i) {
        int i2;
        if (getContext() == null) {
            return;
        }
        if (i != 1) {
            if (i == 2 || i != 3) {
                i2 = R.attr.as4;
            } else {
                i2 = R.attr.as6;
            }
        } else {
            i2 = R.attr.as5;
        }
        LiveIconView liveIconView = this.LLI;
        if (liveIconView != null) {
            liveIconView.setIconAttr(i2);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        HashMap hashMap;
        Text text;
        super.onViewCreated(view, bundle);
        this.LLIIIL = RecyclableWidgetManager.of(this, view, LiveWidgetProviderProxy.getInstance(), C30326BvG.LIZ);
        this.LJLLJ = vl(R.id.hr2);
        this.LJLLL = vl(R.id.hr3);
        this.LJLLILLLL = vl(R.id.h0z);
        View vl = vl(R.id.g94);
        this.LLFII = vl;
        vl.setVisibility(0);
        this.LJLLI = (C47121t6) vl(R.id.a2v);
        this.LJLLLL = (ImageView) vl(R.id.a26);
        this.LJLLLLLL = (C47061t0) vl(R.id.afd);
        B9W b9w = (B9W) vl(R.id.iqs);
        this.LJLZ = b9w;
        if (b9w != null) {
            b9w.setDataChannel(this.LJLJJI);
            this.LJLZ.setIView(this);
        }
        this.LJZ = (C47121t6) vl(R.id.j1g);
        this.LJZI = (C47121t6) vl(R.id.nh3);
        this.LLF = (C47121t6) vl(R.id.aqq);
        this.LL = vl(R.id.h3v);
        this.LLD = (C47121t6) vl(R.id.h4a);
        this.LLF.setVisibility(4);
        if (!this.LLIILII) {
            this.LJLLILLLL.setVisibility(4);
        }
        LiveIconView liveIconView = (LiveIconView) vl(R.id.c00);
        this.LLIFFJFJJ = liveIconView;
        C16880lQ.LJJII(liveIconView, new IDCListenerS10S0101000(1, this, 5));
        this.LJZL = (LiveIconView) vl(R.id.dke);
        this.LLFF = (C29701Eo) vl(R.id.djs);
        C2A4 c2a4 = (C2A4) vl(R.id.djt);
        this.LLFFF = c2a4;
        c2a4.LJIIIIZZ(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_anim_follow_success.webp"));
        LiveIconView liveIconView2 = this.LJZL;
        if (liveIconView2 != null && this.LLFF != null) {
            C16880lQ.LJJII(liveIconView2, new IDCListenerS10S0101000(1, this, 6));
        }
        this.LLFZ = vl(R.id.h5q);
        this.LLI = (LiveIconView) vl(R.id.h5r);
        C16880lQ.LJIIJ(this, this.LLFZ);
        ControlMessage controlMessage = this.LJLJLLL;
        CharSequence charSequence = "";
        if (controlMessage != null && (text = controlMessage.perceptionAudienceText) != null) {
            charSequence = CXJ.LJFF(text, "");
            if (!TextUtils.isEmpty(charSequence)) {
                this.LJLL = this.LJLJLLL.punishInfo;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.LJZI.setText(charSequence);
            this.LJZI.setVisibility(0);
            this.LJZ.setVisibility(8);
        } else {
            this.LJZI.setVisibility(8);
            this.LJZ.setVisibility(0);
        }
        C74740TUy.LIZLLL().LJI(0);
        int i = this.LLIIJI;
        String str = this.LLIIJLIL;
        long j = this.LLIIL;
        PunishEventInfo punishEventInfo = this.LJLL;
        if (punishEventInfo != null) {
            hashMap = new HashMap();
            hashMap.put("record_id", punishEventInfo.punishId);
            hashMap.put("violation_type", punishEventInfo.punishType);
            hashMap.put("violation_reason", punishEventInfo.punishReason);
            hashMap.put("violation_anchor_id", String.valueOf(punishEventInfo.violationUid));
        } else {
            hashMap = null;
        }
        EnterRoomConfig enterRoomConfig = B57.LIZ.LIZ().mEnterRoomConfig;
        BZI LIZ = C28787BRn.LIZ("livesdk_finish_show");
        KNV.LJ(i, LIZ, "room_position", str, "show_reason");
        LIZ.LJIJJ(Long.valueOf(j), "watch_live_duration");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJIIZILJ();
        C30869C9p.LIZ(enterRoomConfig.mRoomsData.roomId, LIZ, "room_id");
        BG0.LIZIZ = this.LLILLJJLI;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(BG0.LIZ);
        long j2 = BG0.LIZIZ;
        long j3 = -1;
        if (j2 != -1) {
            j3 = elapsedRealtime - j2;
        }
        linkedHashMap.put("duration", Long.valueOf(j3));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("livesdk_live_audience_end_");
        LIZ2.append("view_created");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        C0K2.LJII(0, LIZIZ, linkedHashMap);
        linkedHashMap.put("event_name", LIZIZ);
        C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_live_end", linkedHashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.d3l, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
