package X;

import Y.ARunnableS49S0100000_13;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.HasMultiGuestV3GuestModeratorWidget;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestApplicantNumChangedForModeratorChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAudienceNumChangedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.RefreshRedDotOfInteractionIconEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyLayoutOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestApplyingSlideAndBarIconSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TeU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75150TeU implements InterfaceViewOnClickListenerC30227Btf {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIILZ;
    public final InterfaceC75523TkV LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final C35598Dy6 LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public InterfaceC30237Btp LJLJLLL;
    public Context LJLL;
    public C47121t6 LJLLI;
    public C2A4 LJLLILLLL;
    public C2A4 LJLLJ;
    public C47061t0 LJLLL;
    public C47061t0 LJLLLL;
    public View LJLLLLLL;
    public C2A8 LJLZ;
    public DataChannel LJZ;
    public Long LJZI;
    public User LJZL;
    public C73411SrX LL;
    public int LLD;
    public int LLF;
    public final C212608Wa LLFF;
    public final long LLFFF;
    public final C75152TeW LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public C41081jM LLIIII;

    static {
        TBV tbv = new TBV(C75150TeU.class, "tooltipToken", "getTooltipToken()J", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIILZ = new InterfaceC74236TBo[]{tbv};
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void F() {
        this.LJLJJL = false;
        C2A4 c2a4 = this.LJLLILLLL;
        if (c2a4 != null) {
            c2a4.setVisibility(0);
        }
        LIZLLL(LIZIZ());
        C41081jM c41081jM = this.LLIIII;
        if (c41081jM == null) {
            return;
        }
        c41081jM.setVisibility(8);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void ei() {
        Room room;
        this.LJLJJL = true;
        C2A4 c2a4 = this.LJLLILLLL;
        if (c2a4 != null) {
            c2a4.setVisibility(0);
        }
        DataChannel dataChannel = this.LJZ;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && room.cppVersion == 2) {
            if (this.LLIIII != null) {
                C15490jB.LIZJ(this.LLIIII, C15510jD.LJIIIZ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v1.png"));
                C41081jM c41081jM = this.LLIIII;
                if (c41081jM == null) {
                    return;
                }
                c41081jM.setVisibility(0);
                return;
            }
            return;
        }
        Drawable LJI = C15380j0.LJI(LIZIZ());
        if (LJI != null) {
            LJI.setAlpha(102);
            this.LJLJJI = false;
            if (this.LLFZ) {
                C2A4 c2a42 = this.LJLLILLLL;
                if (c2a42 != null) {
                    c2a42.clearAnimation();
                }
                C2A4 c2a43 = this.LJLLILLLL;
                if (c2a43 != null) {
                    c2a43.setBackgroundResource(0);
                }
                C2A4 c2a44 = this.LJLLILLLL;
                if (c2a44 != null) {
                    c2a44.setImageDrawable(null);
                }
                if (this.LLFZ) {
                    C2A4 c2a45 = this.LJLLILLLL;
                    if (c2a45 != null) {
                        C29306Beo.LJJLIIIJJI(c2a45, true);
                    }
                    C2A8 c2a8 = this.LJLZ;
                    if (c2a8 != null) {
                        C29306Beo.LJJLIIIJJI(c2a8, true);
                    }
                }
                C2A4 c2a46 = this.LJLLILLLL;
                if (c2a46 != null) {
                    c2a46.setImageDrawable(new C1Q4(LJI));
                }
            } else {
                C2A4 c2a47 = this.LJLLILLLL;
                if (c2a47 != null) {
                    c2a47.clearAnimation();
                }
                C2A4 c2a48 = this.LJLLILLLL;
                if (c2a48 != null) {
                    c2a48.setBackgroundResource(0);
                }
                C2A4 c2a49 = this.LJLLILLLL;
                if (c2a49 != null) {
                    c2a49.setImageDrawable(new C1Q4(LJI));
                }
            }
        }
        C2A8 c2a82 = this.LJLZ;
        if (c2a82 == null) {
            return;
        }
        c2a82.setAlpha(0.4f);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public final int LIZIZ() {
        if (this.LJLJLJ && this.LJLJL) {
            return R.drawable.cx2;
        }
        return R.drawable.cx3;
    }

    public final void LIZJ() {
        View view = this.LJLLLLLL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public final void LJFF() {
        if (this.LJLJJI) {
            return;
        }
        C2A4 c2a4 = this.LJLLILLLL;
        if (c2a4 != null) {
            C15490jB.LJFF(c2a4, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "live_interact_guest_apply_requesting.webp", ImageView.ScaleType.FIT_CENTER, null);
        }
        this.LJLJJI = true;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final long LLJZ() {
        if (LinkMicApplyLayoutOptSetting.INSTANCE.getValue() == 2) {
            return this.LLFFF;
        }
        return 500L;
    }

    public final void LIZ(boolean z) {
        if (z) {
            C47121t6 c47121t6 = this.LJLLI;
            if (c47121t6 != null) {
                c47121t6.setVisibility(this.LLD);
            }
            View view = this.LJLLLLLL;
            if (view != null) {
                view.setVisibility(this.LLF);
            }
            C2A4 c2a4 = this.LJLLILLLL;
            if (c2a4 != null) {
                C87277YNd.LJJIJ(c2a4);
                return;
            }
            return;
        }
        C47121t6 c47121t62 = this.LJLLI;
        if (c47121t62 != null) {
            C87277YNd.LJJIIZ(c47121t62);
        }
        View view2 = this.LJLLLLLL;
        if (view2 != null) {
            C87277YNd.LJJIIZ(view2);
        }
        C2A4 c2a42 = this.LJLLILLLL;
        if (c2a42 == null) {
            return;
        }
        C87277YNd.LJJIIZ(c2a42);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(int i) {
        if (this.LLFZ) {
            Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
            if (num == null || num.intValue() != 1 || !MultiGuestApplyingSlideAndBarIconSetting.INSTANCE.enableApplyAnimation()) {
                this.LJLJJI = false;
                C2A4 c2a4 = this.LJLLILLLL;
                if (c2a4 != null) {
                    c2a4.clearAnimation();
                }
                C2A4 c2a42 = this.LJLLILLLL;
                if (c2a42 != null) {
                    c2a42.setBackgroundResource(0);
                }
                C2A4 c2a43 = this.LJLLILLLL;
                if (c2a43 != null) {
                    c2a43.setImageDrawable(null);
                }
                if (this.LLFZ) {
                    C2A4 c2a44 = this.LJLLILLLL;
                    if (c2a44 != null) {
                        C29306Beo.LJJLIIIJJI(c2a44, true);
                    }
                    C2A8 c2a8 = this.LJLZ;
                    if (c2a8 != null) {
                        C29306Beo.LJJLIIIJJI(c2a8, true);
                    }
                }
                C2A4 c2a45 = this.LJLLILLLL;
                if (c2a45 != null) {
                    c2a45.setImageResource(i);
                    return;
                }
                return;
            }
            LJFF();
            return;
        }
        if (LiveSdkMultiGuestIconOptSetting.INSTANCE.isEnable()) {
            Integer num2 = (Integer) C74740TUy.LIZLLL().LIZIZ;
            if (num2 == null || num2.intValue() != 1 || !MultiGuestApplyingSlideAndBarIconSetting.INSTANCE.enableApplyAnimation()) {
                this.LJLJJI = false;
                C2A4 c2a46 = this.LJLLILLLL;
                if (c2a46 != null) {
                    c2a46.clearAnimation();
                }
                C2A4 c2a47 = this.LJLLILLLL;
                if (c2a47 != null) {
                    c2a47.setBackgroundResource(0);
                }
                C2A4 c2a48 = this.LJLLILLLL;
                if (c2a48 == null) {
                    return;
                }
                c2a48.setImageResource(i);
                return;
            }
            LJFF();
            return;
        }
        this.LJLJJI = false;
        C2A4 c2a49 = this.LJLLILLLL;
        if (c2a49 != null) {
            c2a49.clearAnimation();
        }
        C2A4 c2a410 = this.LJLLILLLL;
        if (c2a410 != null) {
            c2a410.setBackgroundResource(0);
        }
        C2A4 c2a411 = this.LJLLILLLL;
        if (c2a411 == null) {
            return;
        }
        c2a411.setImageResource(i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Integer, O] */
    public final void LJI(int i) {
        DataChannel dataChannel;
        Integer num;
        C47121t6 c47121t6;
        C47121t6 c47121t62;
        if (this.LJLJL || C74789TWv.LIZIZ()) {
            if (i > 0 && ((dataChannel = this.LJZ) == null || (num = (Integer) dataChannel.kv0(C28413BDd.class)) == null || i != num.intValue())) {
                HashMap LIZLLL = C73098SmU.LIZLLL();
                LIZLLL.put("request_cnt", String.valueOf(i));
                C74824TYe.LJLL("livesdk_anchor_guest_request_red_dot_show", LIZLLL);
            }
            DataChannel dataChannel2 = this.LJZ;
            if (dataChannel2 != null) {
                ((C32537Cpp) dataChannel2.gv0(C28413BDd.class)).LIZ = Integer.valueOf(i);
            }
        }
        if ((!this.LJLJL && !C74789TWv.LIZIZ()) || i <= 0) {
            this.LLD = 8;
            C2A4 c2a4 = this.LJLLJ;
            if ((c2a4 != null && c2a4.getVisibility() == 0) || (c47121t62 = this.LJLLI) == null) {
                return;
            }
            c47121t62.setVisibility(8);
            return;
        }
        C47121t6 c47121t63 = this.LJLLI;
        if (c47121t63 != null) {
            c47121t63.setText(String.valueOf(i));
        }
        this.LLD = 0;
        LJII(false);
        C2A4 c2a42 = this.LJLLJ;
        if ((c2a42 != null && c2a42.getVisibility() == 0) || (c47121t6 = this.LJLLI) == null) {
            return;
        }
        c47121t6.setVisibility(0);
    }

    public final void LJII(boolean z) {
        View view;
        if (z) {
            C2A4 c2a4 = this.LJLLJ;
            if ((c2a4 == null || c2a4.getVisibility() != 0) && (view = this.LJLLLLLL) != null) {
                view.setVisibility(0);
            }
            this.LLF = 0;
            return;
        }
        View view2 = this.LJLLLLLL;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        this.LLF = 8;
    }

    public final void LJIIIIZZ(InterfaceC30237Btp interfaceC30237Btp) {
        int i;
        if (this.LLFZ) {
            C2A8 c2a8 = (C2A8) interfaceC30237Btp.LIZ(R.id.ldm);
            Boolean bool = null;
            if (c2a8 != null) {
                if (!this.LJLJL) {
                    DataChannel dataChannel = this.LJZ;
                    if (dataChannel != null) {
                        bool = (Boolean) dataChannel.kv0(HasMultiGuestV3GuestModeratorWidget.class);
                    }
                    if (!C29306Beo.LJJIFFI(bool) || !LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
                        i = R.string.mri;
                        c2a8.setText(C15380j0.LJIILJJIL(i));
                    }
                }
                i = R.string.n8k;
                c2a8.setText(C15380j0.LJIILJJIL(i));
            } else {
                c2a8 = null;
            }
            this.LJLZ = c2a8;
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final boolean LLLILZJ(View view) {
        if (C30922CBq.LIZIZ) {
            C30868C9o.LJI("【LocalTest】 Ready to upload ALog!");
            InterfaceC06390Mx LIZ = CN1.LIZ(IHostMonitorAndLog.class);
            o.LJIIIIZZ(LIZ, "getService(T::class.java)");
            ((IHostMonitorAndLog) LIZ).j20();
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View p0) {
        FollowInfo followInfo;
        o.LJIIIZ(p0, "p0");
        boolean z = false;
        if (C74789TWv.LIZIZ()) {
            ((LinkControlWidget) this.LJLIL).LLIIIJ(false);
            return;
        }
        if (C29232Bdc.LJFF(this.LJZ)) {
            C30868C9o.LIZJ(R.string.ofb);
            return;
        }
        C75023TcR c75023TcR = C75023TcR.LIZLLL;
        c75023TcR.getClass();
        if (C30922CBq.LIZIZ) {
            c75023TcR.LIZ = false;
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("thread count ");
            LIZ.append(Thread.activeCount());
            String LIZIZ = X1D.LIZIZ(LIZ);
            LJIILIIL.getClass();
            C0NE.LJII("ApplyDetailMonitor", LIZIZ);
            c75023TcR.LIZJ.clear();
            c75023TcR.LIZIZ.clear();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("key_monitor_start_");
            LIZ2.append("ApplyDetailMonitor");
            c75023TcR.LIZJ(X1D.LIZIZ(LIZ2));
        }
        ((LinkControlWidget) this.LJLIL).LLIIIJ(this.LJLJL);
        Long l = this.LJZI;
        if (l != null) {
            if (System.currentTimeMillis() - l.longValue() < 10000) {
                String str = null;
                this.LJZI = null;
                User user = this.LJZL;
                if (user != null) {
                    str = user.getIdStr();
                }
                User user2 = this.LJZL;
                if (user2 != null && (followInfo = user2.getFollowInfo()) != null && ((int) followInfo.getFollowStatus()) == 2) {
                    z = true;
                }
                C74824TYe.LJJLL(str, true, z);
            }
        }
    }

    public final void LJ(int i, boolean z) {
        Boolean bool;
        TX2 LIZ;
        InterfaceC30237Btp interfaceC30237Btp = this.LJLJLLL;
        if (interfaceC30237Btp != null) {
            InterfaceC30205BtJ interfaceC30205BtJ = null;
            Boolean bool2 = null;
            if (i == 0) {
                if (this.LJLJJLL || !this.LJLJL) {
                    boolean isPluginAvailable = LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.LINK_MIC);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("byteResult = ");
                    LIZ2.append(isPluginAvailable);
                    TYQ.LIZLLL("LinkMic_Plugin", X1D.LIZIZ(LIZ2));
                    IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                    if (iInteractService != null && iInteractService.OB() && !z) {
                        return;
                    }
                    if (isPluginAvailable || (((LIZ = TVY.LIZ()) != null && LIZ.LIZ()) || C74789TWv.LIZJ())) {
                        LIZJ();
                    } else {
                        if (LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
                            C75516TkO.LIZ.LIZ(603, "exception in ToolbarMultiGuestBehavior", null);
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("byteResult = ");
                        LIZ3.append(isPluginAvailable);
                        LIZ3.append(' ');
                        C0NB.LJIIIZ("FindCrashLog#ToolbarMultiGuestBehavior#setVisibility", X1D.LIZIZ(LIZ3));
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("not show guest entrance ");
                        TX2 LIZ5 = TVY.LIZ();
                        if (LIZ5 != null) {
                            bool2 = Boolean.valueOf(LIZ5.LIZ());
                        }
                        LIZ4.append(bool2);
                        LIZ4.append(' ');
                        TVY.LIZIZ(X1D.LIZIZ(LIZ4));
                        TVU.LJIJJLI(this.LJLJL);
                        if (!this.LJLJL) {
                            JSONObject jSONObject = new JSONObject();
                            C05630Jz.LJI(jSONObject, "event_id", "link_icon_show_error");
                            C05630Jz.LJI(jSONObject, "show_error_type", "bundle");
                            TVU.LJIL(jSONObject, false);
                            return;
                        }
                        TVU.LJIILLIIL(2L, this.LJLJI.LIZ());
                        return;
                    }
                } else {
                    return;
                }
            }
            StringBuilder LJ = C7MY.LJ("visible: ", i, " show guest entrance ");
            TX2 LIZ6 = TVY.LIZ();
            if (LIZ6 != null) {
                bool = Boolean.valueOf(LIZ6.LIZ());
            } else {
                bool = null;
            }
            LJ.append(bool);
            LJ.append(' ');
            LJ.append(o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper()));
            LJ.append(' ');
            TVY.LIZIZ(X1D.LIZIZ(LJ));
            if (!this.LJLJI.LIZLLL && i == 0) {
                if (this.LJLJL) {
                    TVU.LJIJ(2L, r1.LIZ());
                }
                this.LJLJI.LIZLLL = true;
            }
            interfaceC30237Btp.setVisibility(i);
            if (this.LJLJL) {
                if (i == 0 && !this.LLI) {
                    this.LLI = true;
                }
            } else {
                IToolbarService iToolbarService = (IToolbarService) CN1.LIZ(IToolbarService.class);
                if (iToolbarService != null) {
                    interfaceC30205BtJ = iToolbarService.pk(this.LJZ);
                }
                if (i != 0) {
                    if (i == 8 && interfaceC30205BtJ != null) {
                        interfaceC30205BtJ.LJIIJ(EnumC30208BtM.LINK_HOST, this.LJZ);
                    }
                } else if (interfaceC30205BtJ != null) {
                    interfaceC30205BtJ.LJIJI(EnumC30208BtM.LINK_HOST, this.LJZ);
                }
            }
            QZP.LIZJ("it.visibility = ", i, "FindCrashLog#ToolbarMultiGuestBehavior#setVisibility");
            if (!this.LJLJL && i == 0) {
                JSONObject jSONObject2 = new JSONObject();
                C05630Jz.LJI(jSONObject2, "event_id", "link_icon_show");
                TVU.LJIL(jSONObject2, false);
            }
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        dataChannel.jv0(this);
        C74740TUy.LIZLLL().LIZJ(this.LLFII);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        int i;
        boolean z;
        LifecycleOwner lifecycleOwner;
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJZ = dataChannel;
        this.LJLJLLL = interfaceC30237Btp;
        this.LJLL = interfaceC30237Btp.getContext();
        Object kv0 = dataChannel.kv0(UserIsAnchorChannel.class);
        o.LJI(kv0);
        this.LJLJL = ((Boolean) kv0).booleanValue();
        this.LJLLILLLL = (C2A4) interfaceC30237Btp.LIZ(R.id.ext);
        if (LiveCommentWidthOptSetting.INSTANCE.isStrategyEnable()) {
            C2A4 c2a4 = this.LJLLILLLL;
            if (c2a4 != null) {
                c2a4.post(new ARunnableS49S0100000_13(this, 144));
            }
            Object obj = this.LJLL;
            if (obj instanceof LifecycleOwner) {
                lifecycleOwner = (LifecycleOwner) obj;
            } else {
                lifecycleOwner = null;
            }
            dataChannel.ov0(lifecycleOwner, CommentCompressOnSmallEvent.class, new AqS179S0100000_13(this, 397));
        }
        this.LJLLJ = (C2A4) interfaceC30237Btp.LIZ(R.id.f9u);
        this.LJLLL = (C47061t0) interfaceC30237Btp.LIZ(R.id.eyn);
        this.LJLLLL = (C47061t0) interfaceC30237Btp.LIZ(R.id.eyl);
        this.LJLLLLLL = interfaceC30237Btp.LIZ(R.id.isy);
        C47121t6 c47121t6 = (C47121t6) interfaceC30237Btp.LIZ(R.id.nbp);
        this.LJLLI = c47121t6;
        int i2 = 8;
        if (c47121t6 != null) {
            i = c47121t6.getVisibility();
        } else {
            i = 8;
        }
        this.LLD = i;
        View view = this.LJLLLLLL;
        if (view != null) {
            i2 = view.getVisibility();
        }
        this.LLF = i2;
        LIZJ();
        Boolean bool = (Boolean) dataChannel.kv0(BNK.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LLFZ = z;
        C2A4 c2a42 = this.LJLLILLLL;
        if (c2a42 != null) {
            c2a42.setImageResource(LIZIZ());
        }
        LJIIIIZZ(interfaceC30237Btp);
        this.LLIIII = (C41081jM) interfaceC30237Btp.LIZ(R.id.f1b);
        C74740TUy.LIZLLL().LIZ(this.LLFII);
        dataChannel.mv0(RefreshRedDotOfInteractionIconEvent.class, this, new AqS179S0100000_13(this, 398));
        dataChannel.lv0(this.LJLILLLLZI, MultiGuestAudienceNumChangedEvent.class, new AqS179S0100000_13(this, 399));
        dataChannel.lv0(this.LJLILLLLZI, MultiGuestApplicantNumChangedForModeratorChannel.class, new AqS179S0100000_13(this, LiveChatShowDelayForHotLiveSetting.DEFAULT));
        dataChannel.lv0(this.LJLILLLLZI, HasMultiGuestV3GuestModeratorWidget.class, new AqS144S0200000_13(this, interfaceC30237Btp, 37));
    }

    public C75150TeU(InterfaceC75523TkV onInteractClickListener, LifecycleOwner lifecycleOwner, C35598Dy6 c35598Dy6) {
        o.LJIIIZ(onInteractClickListener, "onInteractClickListener");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = onInteractClickListener;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = c35598Dy6;
        this.LLD = 8;
        this.LLF = 8;
        this.LLFF = new C212608Wa();
        this.LLFFF = 1000L;
        this.LLFII = new C75152TeW(this);
    }
}
