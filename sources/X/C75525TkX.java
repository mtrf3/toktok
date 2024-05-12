package X;

import Y.AfS24S0400000_13;
import Y.AfS52S0300000_13;
import Y.AfS62S0200000_13;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkerStateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostInviteCountDownUpdateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostFullChannel;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveFixNonstandardBubblesPhaseTwoSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TkX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75525TkX implements InterfaceViewOnClickListenerC30227Btf {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJLIL;
    public final InterfaceC75523TkV LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final C35598Dy6 LJLJI;
    public final String LJLJJI;
    public InterfaceC30237Btp LJLJJL;
    public Context LJLJJLL;
    public C2A4 LJLJL;
    public C47121t6 LJLJLJ;
    public ImageView LJLJLLL;
    public C31597Caf LJLL;
    public C47061t0 LJLLI;
    public C47061t0 LJLLILLLL;
    public C47061t0 LJLLJ;
    public C2A4 LJLLL;
    public C47121t6 LJLLLL;
    public C41081jM LJLLLLLL;
    public C73411SrX LJLZ;
    public boolean LJZ;
    public C2A8 LJZI;
    public C2A4 LJZL;
    public C15540jG LL;
    public DataChannel LLD;
    public C73411SrX LLF;
    public C73411SrX LLFF;
    public boolean LLFFF;
    public final C212608Wa LLFII;
    public DataChannel LLFZ;
    public boolean LLI;
    public final CoHostFriendNoticeService LLIFFJFJJ;
    public final C73318Sq2 LLII;
    public EnumC75674Tmw LLIIII;
    public boolean LLIIIILZ;
    public int LLIIIJ;
    public final C75528Tka LLIIIL;
    public final C75529Tkb LLIIIZ;
    public final C75527TkZ LLIIJI;

    static {
        TBV tbv = new TBV(C75525TkX.class, "tooltipToken", "getTooltipToken()J", 0);
        C65352Pkq.LIZ.getClass();
        LLIIJLIL = new InterfaceC74236TBo[]{tbv};
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
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

    public static final void LIZJ() {
        C30770C5u.LIZIZ(C09.ANCHOR_INTERACTIVE_MIC);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void F() {
        C41081jM c41081jM = this.LJLLLLLL;
        if (c41081jM != null) {
            c41081jM.setVisibility(8);
        }
        if (this.LLIIIJ != 2) {
            String str = this.LJLJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setLinkDrawable, enableToolbarbutton. linkCrossRoomState:");
            LIZ.append(this.LLIIIJ);
            TYQ.LIZLLL(str, X1D.LIZIZ(LIZ));
            LJIIL();
            return;
        }
        LJIILJJIL();
    }

    public final void LIZIZ() {
        C15540jG c15540jG = this.LL;
        if (c15540jG != null) {
            c15540jG.LIZ();
        }
    }

    public final long LJFF() {
        return ((Number) this.LLFII.LIZ(this, LLIIJLIL[0])).longValue();
    }

    public final void LJIIL() {
        String str = this.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLinkDrawable, linkCrossRoomState:");
        LIZ.append(this.LLIIIJ);
        TYQ.LIZLLL(str, X1D.LIZIZ(LIZ));
        LJIIIZ(R.drawable.cwv);
    }

    public final void LJIILJJIL() {
        Drawable drawable;
        Boolean bool;
        if (this.LLIIII.isMultiCoHost() && C8E.LIZLLL().LLIFFJFJJ()) {
            DataChannel dataChannel = this.LLFZ;
            if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(MultiCoHostFullChannel.class)) != null && bool.booleanValue()) {
                LJIIIZ(R.drawable.cxs);
                return;
            } else if (this.LJZ) {
                LJIIJJI(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "live_cohost_entrance_linked.webp");
                return;
            } else {
                LJIIJJI(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "live_cohost_entrance_linked_without_title.webp");
                return;
            }
        }
        Context context = this.LJLJJLL;
        if (context != null) {
            drawable = C20110qd.LIZ(context, R.drawable.cwt);
        } else {
            drawable = null;
        }
        LJIIJ(new C1Q4(drawable));
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void ei() {
        Room room;
        DataChannel dataChannel = this.LLFZ;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && room.cppVersion == 2) {
            if (this.LJLLLLLL != null) {
                C15490jB.LIZJ(this.LJLLLLLL, C15510jD.LJIIIZ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v1.png"));
                C41081jM c41081jM = this.LJLLLLLL;
                if (c41081jM != null) {
                    c41081jM.setVisibility(0);
                }
            }
            C41081jM c41081jM2 = this.LJLLLLLL;
            if (c41081jM2 != null) {
                C29306Beo.LJJLJLI(c41081jM2);
                return;
            }
            return;
        }
        Drawable drawable = null;
        if (this.LJZ) {
            Drawable LIZ = C15400j2.LIZ(R.drawable.cwv);
            if (LIZ != null) {
                LIZ.setAlpha(102);
                drawable = LIZ;
            }
            LJIIJ(new C1Q4(drawable));
            C2A8 c2a8 = this.LJZI;
            if (c2a8 == null) {
                return;
            }
            c2a8.setAlpha(0.4f);
            return;
        }
        Drawable LIZ2 = C15400j2.LIZ(R.drawable.cwu);
        if (LIZ2 != null) {
            LIZ2.setAlpha(102);
            drawable = LIZ2;
        }
        LJIIJ(new C1Q4(drawable));
    }

    public final void LJIIIIZZ() {
        C2A4 c2a4;
        C2A4 c2a42;
        Context context;
        String string;
        Context context2;
        String string2;
        Boolean bool;
        Context context3;
        String string3;
        LIZJ();
        int i = this.LLIIIJ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                if (!C74726TUk.LIZ()) {
                    LJIILJJIL();
                } else {
                    String str = this.LJLJJI;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("setLinkDrawable, linkCrossRoomConnected. linkCrossRoomState:");
                    LIZ.append(this.LLIIIJ);
                    TYQ.LIZLLL(str, X1D.LIZIZ(LIZ));
                    LJIIL();
                }
                C47121t6 c47121t6 = this.LJLJLJ;
                if (c47121t6 != null) {
                    c47121t6.setVisibility(8);
                }
                C47061t0 c47061t0 = this.LJLLI;
                if (c47061t0 != null) {
                    c47061t0.setVisibility(8);
                }
                ImageView imageView = this.LJLJLLL;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                LJIJI("onLinkCrossRoomStateChanged_2");
                InterfaceC30237Btp interfaceC30237Btp = this.LJLJJL;
                if (interfaceC30237Btp != null && interfaceC30237Btp.getVisibility() == 0) {
                    if (LiveFixNonstandardBubblesPhaseTwoSetting.INSTANCE.isInExperiment()) {
                        if (InterfaceC30442Bx8.LLILLIZIL.LIZJ().booleanValue() || (context3 = this.LJLJJLL) == null || (string3 = context3.getString(R.string.kmp)) == null) {
                            return;
                        }
                        LJIIZILJ(string3, C31755CdD.LJLIL, false);
                        return;
                    }
                    if (this.LLIIII.isMultiCoHost()) {
                        DataChannel dataChannel = this.LLFZ;
                        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(MultiCoHostFullChannel.class)) != null && bool.booleanValue()) {
                            return;
                        }
                        Boolean LIZJ = InterfaceC30442Bx8.LLILLIZIL.LIZJ();
                        o.LJIIIIZZ(LIZJ, "LINK_MULTI_CO_HOST_HAD_SHOW_TIPS.value");
                        if (LIZJ.booleanValue() || (context2 = this.LJLJJLL) == null || (string2 = context2.getString(R.string.kmo)) == null) {
                            return;
                        }
                        LJIIZILJ(string2, C75538Tkk.LJLIL, false);
                        return;
                    }
                    if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context() == null || !(!C29889BoD.LIZIZ(r0).LJ("anchor_linkmic_disconnect_tips_shown", false)) || (context = this.LJLJJLL) == null || (string = context.getString(R.string.ki4)) == null) {
                        return;
                    }
                    LJIIZILJ(string, C31754CdC.LJLIL, false);
                    return;
                }
                return;
            }
            if (this.LJZ && (c2a42 = this.LJZL) != null) {
                C29306Beo.LJJLIIIJJI(c2a42, false);
            }
            if (!this.LJZ && (c2a4 = this.LJLJL) != null) {
                c2a4.setBackgroundResource(R.drawable.cfq);
            }
            C2A4 c2a43 = this.LJLJL;
            if (c2a43 != null) {
                c2a43.LJIIIIZZ(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_lottie_icon_time_countdown.webp"));
            }
            C2A4 c2a44 = this.LJLJL;
            if (c2a44 == null) {
                return;
            }
            c2a44.LJII();
            return;
        }
        C47121t6 c47121t62 = this.LJLJLJ;
        if (c47121t62 != null) {
            c47121t62.setVisibility(8);
        }
        C47061t0 c47061t02 = this.LJLLI;
        if (c47061t02 != null) {
            c47061t02.setVisibility(8);
        }
        ImageView imageView2 = this.LJLJLLL;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        LJIJI("onLinkCrossRoomStateChanged_0");
        if (RandomLinkMicManager.LJIIJJI()) {
            return;
        }
        String str2 = this.LJLJJI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setLinkDrawable, linkcrossroom state idle. linkCrossRoomState:");
        LIZ2.append(this.LLIIIJ);
        TYQ.LIZLLL(str2, X1D.LIZIZ(LIZ2));
        LJIIL();
    }

    public static boolean LJIILLIIL(String str) {
        int i;
        Integer LIZJ;
        if (TextUtils.isEmpty(str) || (i = LiveRandomLinkmicSetting.INSTANCE.getValue().bubbleStrategy) == 0) {
            return false;
        }
        if (i == 1 && ((LIZJ = InterfaceC30442Bx8.LLIIL.LIZJ()) == null || LIZJ.intValue() != 1)) {
            return false;
        }
        return true;
    }

    public final void LJIIIZ(int i) {
        C2A4 c2a4;
        if (this.LJZ) {
            C2A4 c2a42 = this.LJLJL;
            if (c2a42 != null) {
                c2a42.clearAnimation();
            }
            C2A4 c2a43 = this.LJLJL;
            if (c2a43 != null) {
                c2a43.setBackgroundResource(0);
            }
            C2A4 c2a44 = this.LJLJL;
            if (c2a44 != null) {
                c2a44.setImageDrawable(null);
            }
            if (this.LJZ && (c2a4 = this.LJZL) != null) {
                C29306Beo.LJJLIIIJJI(c2a4, true);
            }
            C2A4 c2a45 = this.LJZL;
            if (c2a45 != null) {
                c2a45.setImageResource(i);
            }
        } else {
            C2A4 c2a46 = this.LJLJL;
            if (c2a46 != null) {
                c2a46.clearAnimation();
            }
            C2A4 c2a47 = this.LJLJL;
            if (c2a47 != null) {
                c2a47.setBackgroundResource(0);
            }
            C2A4 c2a48 = this.LJLJL;
            if (c2a48 != null) {
                c2a48.setImageResource(i);
            }
        }
        LIZIZ();
    }

    public final void LJIIJ(Drawable drawable) {
        C2A4 c2a4;
        if (this.LJZ) {
            C2A4 c2a42 = this.LJLJL;
            if (c2a42 != null) {
                c2a42.clearAnimation();
            }
            C2A4 c2a43 = this.LJLJL;
            if (c2a43 != null) {
                c2a43.setBackgroundResource(0);
            }
            C2A4 c2a44 = this.LJLJL;
            if (c2a44 != null) {
                c2a44.setImageDrawable(null);
            }
            if (this.LJZ && (c2a4 = this.LJZL) != null) {
                C29306Beo.LJJLIIIJJI(c2a4, true);
            }
            C2A4 c2a45 = this.LJZL;
            if (c2a45 != null) {
                c2a45.setImageDrawable(drawable);
                return;
            }
            return;
        }
        C2A4 c2a46 = this.LJLJL;
        if (c2a46 != null) {
            c2a46.clearAnimation();
        }
        C2A4 c2a47 = this.LJLJL;
        if (c2a47 != null) {
            c2a47.setBackgroundResource(0);
        }
        C2A4 c2a48 = this.LJLJL;
        if (c2a48 == null) {
            return;
        }
        c2a48.setImageDrawable(drawable);
    }

    public final void LJIILIIL(long j) {
        this.LLFII.LIZIZ(LLIIJLIL[0], this, Long.valueOf(j));
    }

    public final void LJIILL(int i) {
        Room room;
        TX2 LIZ;
        InterfaceC30237Btp interfaceC30237Btp = this.LJLJJL;
        if (interfaceC30237Btp != null) {
            if (i == 0) {
                if (this.LLIIIILZ) {
                    DataChannel dataChannel = this.LLFZ;
                    if (dataChannel != null) {
                        room = (Room) dataChannel.kv0(RoomChannel.class);
                    } else {
                        room = null;
                    }
                    if (C29232Bdc.LJIILIIL(room)) {
                        return;
                    }
                    boolean isPluginAvailable = LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.LINK_MIC);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("byteResult = ");
                    LIZ2.append(isPluginAvailable);
                    TYQ.LIZLLL("LinkMic_Plugin", X1D.LIZIZ(LIZ2));
                    if (!isPluginAvailable && ((LIZ = TVY.LIZ()) == null || !LIZ.LIZ())) {
                        TVU.LJIJJLI(true);
                        TVU.LJIILLIIL(1L, this.LJLJI.LIZ());
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!this.LJLJI.LIZJ && this.LLIIIILZ && i == 0) {
                TVU.LJIJ(1L, r1.LIZ());
                this.LJLJI.LIZJ = true;
                C58414MwE.LIZLLL.LIZIZ(1, FT5.LIZLLL("end_reason", "entrance_show"));
            }
            interfaceC30237Btp.setVisibility(i);
            if (i == 0 && !this.LLI) {
                this.LLI = true;
                C75017TcL.LJ("connecton_icon", false);
            }
        }
    }

    public final void LJIJ(EnumC75537Tkj enumC75537Tkj) {
        List<? extends ImageModel> list;
        List<? extends ImageModel> list2;
        EnumC75537Tkj enumC75537Tkj2 = EnumC75537Tkj.QUICK_LINKMIC;
        if (enumC75537Tkj == enumC75537Tkj2) {
            RandomLinkMicManager.LJLIL.getClass();
            List<? extends ImageModel> list3 = RandomLinkMicManager.LJLLJ;
            if (list3 == null || list3.size() < 5) {
                return;
            }
        }
        if (enumC75537Tkj == EnumC75537Tkj.TOPIC && ((list2 = C75650TmY.LJIIIZ) == null || list2.size() < 5)) {
            return;
        }
        C0NB.LJ(this.LJLJJI, "startRefreshPreviewAvatar");
        C76732zl c76732zl = new C76732zl();
        if (enumC75537Tkj == enumC75537Tkj2) {
            RandomLinkMicManager.LJLIL.getClass();
            list = RandomLinkMicManager.LJLLJ;
        } else {
            list = C75650TmY.LJIIIZ;
        }
        this.LJLZ = (C73411SrX) C265112h.LIZ(TMC.LJIL(0L, 2300L, TimeUnit.MILLISECONDS)).LJJJJZI(new AfS52S0300000_13(list, this, c76732zl, 8));
    }

    public final void LJIJI(String str) {
        String str2 = this.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopRefreshPreviewAvatar, source=");
        LIZ.append(str);
        C0NB.LJ(str2, X1D.LIZIZ(LIZ));
        C73411SrX c73411SrX = this.LJLZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C31597Caf c31597Caf = this.LJLL;
        if (c31597Caf != null) {
            c31597Caf.setVisibility(8);
        }
        ImageView imageView = this.LJLJLLL;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        C47121t6 c47121t6 = this.LJLJLJ;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L28;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService r2 = r7.LLIFFJFJJ
            r2.getClass()
            java.lang.String r1 = "CoHostFriendNoticeService"
            java.lang.String r0 = "onCoHostBtnNoticeClicked"
            X.C0NB.LIZIZ(r1, r0)
            r0 = 1
            r2.LJLJLLL = r0
            int r0 = r2.LJLL
            int r0 = r0 + 1
            r2.LJLL = r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LLFZ
            r4 = 0
            if (r1 == 0) goto L7f
            java.lang.Class<com.bytedance.android.live.liveinteract.multihost.event.CoHostOnboardPermitChannel> r0 = com.bytedance.android.live.liveinteract.multihost.event.CoHostOnboardPermitChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L27:
            boolean r0 = X.C29306Beo.LJIILLIIL(r0)
            if (r0 == 0) goto L81
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            X.0Mx r6 = X.CN1.LIZ(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r6 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r6
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LLFZ
            if (r1 == 0) goto L6c
            java.lang.Class<X.Bhq> r0 = X.C29494Bhq.class
            java.lang.Object r5 = r1.kv0(r0)
            androidx.fragment.app.FragmentManager r5 = (androidx.fragment.app.FragmentManager) r5
            if (r5 == 0) goto L6c
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LLFZ
            if (r1 == 0) goto L7d
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L7d
            int r0 = r0.cppVersion
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L57:
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "cohost"
            r0 = 2131839154(0x7f1148b2, float:1.9311552E38)
            if (r3 != r1) goto L73
            java.lang.String r1 = X.C15380j0.LJIILJJIL(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.showCppUnlockGuideDialogV2(r1, r2, r0, r5)
        L6c:
            java.lang.String r1 = "connection_invite"
            r0 = 6
            X.C75642TmQ.LJJJZ(r1, r4, r0)
            return
        L73:
            java.lang.String r1 = X.C15380j0.LJIILJJIL(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.showCppUnlockGuideDialog(r1, r2, r0, r5)
            goto L6c
        L7d:
            r3 = r4
            goto L57
        L7f:
            r0 = r4
            goto L27
        L81:
            X.TX2 r2 = X.TVY.LIZ()
            if (r2 == 0) goto L97
            kotlin.jvm.internal.AqS163S0100000_13 r1 = new kotlin.jvm.internal.AqS163S0100000_13
            r0 = 471(0x1d7, float:6.6E-43)
            r1.<init>(r7, r0)
            java.lang.String r0 = "co_host_icon"
            r2.LIZIZ(r0, r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L9c
        L97:
            X.TkV r0 = r7.LJLIL
            X.C75522TkU.LIZ(r0)
        L9c:
            r7.LIZIZ()
            X.1t6 r0 = r7.LJLLLL
            if (r0 == 0) goto La6
            X.C87277YNd.LJJIIZ(r0)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75525TkX.onClick(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(long r6, java.lang.Throwable r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C29401Dk
            if (r0 == 0) goto L49
            java.lang.String r2 = r5.LJLJJI
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onInviteFailed extra = "
            r1.append(r0)
            X.1Dk r8 = (X.C29401Dk) r8
            java.lang.String r0 = r8.getExtra()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.TYQ.LIZLLL(r2, r0)
            com.google.gson.Gson r2 = X.C09650Zl.LIZIZ
            java.lang.String r1 = r8.getExtra()
            java.lang.Class<com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra> r0 = com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra.class
            java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r1, r0)
            com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra) r0
            r4 = -1
            if (r0 == 0) goto L34
            int r3 = r0.inviteBlockReason
            if (r3 >= 0) goto L37
        L34:
            r3 = -1
            if (r0 == 0) goto L3b
        L37:
            int r0 = r0.detailBlockReason
            if (r0 >= 0) goto L4a
        L3b:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r5.LLFZ
            if (r2 == 0) goto L49
            java.lang.Class<com.bytedance.android.live.liveinteract.multihost.event.ReserveListStateChangeEvent> r1 = com.bytedance.android.live.liveinteract.multihost.event.ReserveListStateChangeEvent.class
            X.Ttx r0 = new X.Ttx
            r0.<init>(r6, r3, r4)
            r2.qv0(r1, r0)
        L49:
            return
        L4a:
            r4 = r0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75525TkX.LIZ(long, java.lang.Throwable):void");
    }

    public final void LJIIJJI(String str, String str2) {
        C2A4 c2a4;
        if (this.LJZ) {
            C2A4 c2a42 = this.LJLJL;
            if (c2a42 != null) {
                c2a42.clearAnimation();
            }
            C2A4 c2a43 = this.LJLJL;
            if (c2a43 != null) {
                c2a43.setBackgroundResource(0);
            }
            C2A4 c2a44 = this.LJLJL;
            if (c2a44 != null) {
                c2a44.setImageDrawable(null);
            }
            if (this.LJZ && (c2a4 = this.LJZL) != null) {
                C29306Beo.LJJLIIIJJI(c2a4, true);
            }
            C2A4 c2a45 = this.LJZL;
            if (c2a45 != null) {
                c2a45.LJIIIIZZ(C15510jD.LJIIIZ(str, str2));
            }
            C2A4 c2a46 = this.LJZL;
            if (c2a46 != null) {
                c2a46.LJII();
                return;
            }
            return;
        }
        C2A4 c2a47 = this.LJLJL;
        if (c2a47 != null) {
            c2a47.clearAnimation();
        }
        C2A4 c2a48 = this.LJLJL;
        if (c2a48 != null) {
            c2a48.setBackgroundResource(0);
        }
        C2A4 c2a49 = this.LJLJL;
        if (c2a49 != null) {
            c2a49.LJIIIIZZ(C15510jD.LJIIIZ(str, str2));
        }
        C2A4 c2a410 = this.LJLJL;
        if (c2a410 == null) {
            return;
        }
        c2a410.LJII();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        dataChannel.jv0(this);
        LJIJI("onUnload");
        C75529Tkb callback = this.LLIIIZ;
        o.LJIIIZ(callback, "callback");
        ((ArrayList) RandomLinkMicManager.LJLJLLL).remove(callback);
        C75528Tka callback2 = this.LLIIIL;
        o.LJIIIZ(callback2, "callback");
        ((ArrayList) C75650TmY.LJIIIIZZ).remove(callback2);
        C73411SrX c73411SrX = this.LLF;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73411SrX c73411SrX2 = this.LLFF;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        this.LLII.dispose();
        LIZIZ();
        C47121t6 c47121t6 = this.LJLLLL;
        if (c47121t6 != null) {
            C87277YNd.LJJIIZ(c47121t6);
        }
        this.LLFZ = null;
        CoHostFriendNoticeService coHostFriendNoticeService = this.LLIFFJFJJ;
        coHostFriendNoticeService.getClass();
        C0NB.LIZIZ("CoHostFriendNoticeService", "onUnload");
        C73411SrX c73411SrX3 = coHostFriendNoticeService.LJLJLJ;
        if (c73411SrX3 != null) {
            C29306Beo.LJJJJI(c73411SrX3);
        }
        coHostFriendNoticeService.LJLJLLL = 0;
        CoHostFriendNoticeService.LIZ(coHostFriendNoticeService, null, new AqS155S0100000_5(coHostFriendNoticeService, 296), 3);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLJJL = interfaceC30237Btp;
        this.LJLJJLL = interfaceC30237Btp.getContext();
        this.LLFZ = dataChannel;
        this.LJLJL = (C2A4) interfaceC30237Btp.LIZ(R.id.ext);
        this.LJLJLLL = (ImageView) interfaceC30237Btp.LIZ(R.id.f9g);
        this.LJLL = (C31597Caf) interfaceC30237Btp.LIZ(R.id.f9f);
        C47121t6 c47121t6 = (C47121t6) interfaceC30237Btp.LIZ(R.id.m3d);
        c47121t6.setVisibility(8);
        this.LJLJLJ = c47121t6;
        C47061t0 c47061t0 = (C47061t0) interfaceC30237Btp.LIZ(R.id.eye);
        c47061t0.setVisibility(8);
        this.LJLLI = c47061t0;
        this.LJLLILLLL = (C47061t0) interfaceC30237Btp.LIZ(R.id.eyn);
        this.LJLLJ = (C47061t0) interfaceC30237Btp.LIZ(R.id.eyl);
        this.LJLLL = (C2A4) interfaceC30237Btp.LIZ(R.id.f83);
        this.LJLLLL = (C47121t6) interfaceC30237Btp.LIZ(R.id.mgs);
        this.LJLLLLLL = (C41081jM) interfaceC30237Btp.LIZ(R.id.f1b);
        Boolean bool = (Boolean) dataChannel.kv0(BNK.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJZ = z;
        this.LL = new C15540jG();
        this.LLD = dataChannel;
        if (this.LJZ) {
            C2A8 c2a8 = (C2A8) interfaceC30237Btp.LIZ(R.id.ldm);
            this.LJZI = c2a8;
            if (c2a8 != null) {
                c2a8.setText(C15380j0.LJIILJJIL(R.string.n8l));
            }
            this.LJZL = (C2A4) interfaceC30237Btp.LIZ(R.id.ld4);
        }
        LJIIL();
        dataChannel.lv0(this.LJLILLLLZI, CoHostInviteCountDownUpdateChannel.class, new AqS179S0100000_13(this, 525));
        dataChannel.lv0(this.LJLILLLLZI, LinkerStateChannel.class, new AqS179S0100000_13(this, 526));
        dataChannel.lv0(this.LJLILLLLZI, MultiCoHostFullChannel.class, new AqS179S0100000_13(this, 527));
        C75529Tkb callback = this.LLIIIZ;
        o.LJIIIZ(callback, "callback");
        ((ArrayList) RandomLinkMicManager.LJLJLLL).add(callback);
        C75528Tka callback2 = this.LLIIIL;
        o.LJIIIZ(callback2, "callback");
        ((ArrayList) C75650TmY.LJIIIIZZ).add(callback2);
        C74838TYs.LJ().LJI.add(this.LLIIJI);
        if (C29232Bdc.LJIIL()) {
            LJIILL(8);
        }
        CoHostFriendNoticeService coHostFriendNoticeService = this.LLIFFJFJJ;
        coHostFriendNoticeService.getClass();
        C0NB.LIZIZ("CoHostFriendNoticeService", "onLoad");
        coHostFriendNoticeService.LJLJJL = dataChannel;
        ((InterfaceC22790ux) coHostFriendNoticeService.LJLJI.getValue()).LIZIZ(new AqS155S0100000_5(coHostFriendNoticeService, 294), new AqS155S0100000_5(coHostFriendNoticeService, 295));
    }

    public C75525TkX(InterfaceC75523TkV onInteractClickListener, LifecycleOwner lifecycleOwner, C35598Dy6 c35598Dy6) {
        o.LJIIIZ(onInteractClickListener, "onInteractClickListener");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = onInteractClickListener;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = c35598Dy6;
        this.LJLJJI = "ToolbarCoHostBehavior";
        this.LLFII = new C212608Wa();
        this.LLIFFJFJJ = new CoHostFriendNoticeService();
        this.LLII = new C73318Sq2();
        this.LLIIII = EnumC75674Tmw.NONE;
        this.LLIIIL = new C75528Tka(this);
        this.LLIIIZ = new C75529Tkb(this);
        this.LLIIJI = new C75527TkZ(this);
    }

    public final void LIZLLL(Room room, HashMap<String, Object> hashMap, ReserveInfo reserveInfo) {
        C75642TmQ.LJJJJLL(room, "apply", null, reserveInfo, null, null, 112);
        C8E.LIZLLL().LLILL(new C75759ToJ(1, room.getId(), room.getOwnerUserId(), C44432HcC.LJIIL(room), C44432HcC.LJIIJJI(room), MtCoHostInviteTimeOutSetting.INSTANCE.getValue(), null, hashMap, "apply_reserve_bubble", C05040Hs.LIZIZ("apply_reserve_bubble"), 64), new C75565TlB(this, room));
    }

    public final void LJII(User user, EnumC75445TjF remindingType, String logId) {
        C47061t0 c47061t0;
        C47061t0 c47061t02;
        o.LJIIIZ(remindingType, "remindingType");
        o.LJIIIZ(logId, "logId");
        C2A4 c2a4 = this.LJLLL;
        if (c2a4 == null || (c47061t0 = this.LJLLILLLL) == null || (c47061t02 = this.LJLLJ) == null) {
            return;
        }
        C75444TjE c75444TjE = new C75444TjE(c47061t0, this, c47061t02, c2a4, new C75526TkY(this, remindingType, logId, c47061t02, c2a4, new C68322mC(), c47061t0), remindingType);
        ImageModel avatarThumb = user.getAvatarThumb();
        o.LJIIIIZZ(avatarThumb, "user.avatarThumb");
        C31665Cbl.LIZJ(avatarThumb).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS24S0400000_13(this, c75444TjE, avatarThumb, c47061t0, 12), new AfS62S0200000_13(c75444TjE, avatarThumb, 60));
        CoHostFriendNoticeService coHostFriendNoticeService = this.LLIFFJFJJ;
        coHostFriendNoticeService.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show friend notice, logId == ");
        LIZ.append(logId);
        C0NB.LIZIZ("CoHostFriendNoticeService", X1D.LIZIZ(LIZ));
        DataChannel dataChannel = coHostFriendNoticeService.LJLJJL;
        if (dataChannel == null) {
            return;
        }
        CoHostFriendNoticeService.LIZ(coHostFriendNoticeService, new AqS152S0200000_5(coHostFriendNoticeService, dataChannel, 14), null, 5);
        coHostFriendNoticeService.LJLJLLL = 0;
        coHostFriendNoticeService.LJLLI++;
    }

    public final void LJIIZILJ(String str, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        View view = null;
        if (z) {
            InterfaceC30237Btp interfaceC30237Btp = this.LJLJJL;
            if (interfaceC30237Btp != null) {
                view = interfaceC30237Btp.LJFF();
            }
            C1YG c1yg = new C1YG(view);
            c1yg.LJIILLIIL = str;
            c1yg.LJIIL = new C75530Tkc(interfaceC65784Pro, this);
            c1yg.LJIILIIL = new C75532Tke(this);
            c1yg.LJI = -1L;
            c1yg.LJII = true;
            C30770C5u.LIZLLL(new C1YH(c1yg), C09.ANCHOR_INTERACTIVE_MIC);
            return;
        }
        InterfaceC30237Btp interfaceC30237Btp2 = this.LJLJJL;
        if (interfaceC30237Btp2 != null) {
            view = interfaceC30237Btp2.LJFF();
        }
        C1YG c1yg2 = new C1YG(view);
        c1yg2.LJIILLIIL = str;
        c1yg2.LJIIL = new C75531Tkd(interfaceC65784Pro, this);
        c1yg2.LJIILIIL = new C75533Tkf(this);
        C30770C5u.LIZLLL(new C1YH(c1yg2), C09.ANCHOR_INTERACTIVE_MIC);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.android.livesdkapi.depend.model.live.Room r22, java.util.HashMap<java.lang.String, java.lang.Object> r23, com.bytedance.android.livesdk.model.message.ReserveInfo r24, com.bytedance.android.livesdk.model.message.OptPairInfo r25) {
        /*
            r21 = this;
            r0 = r22
            r8 = r24
            if (r8 != 0) goto Lb
            r9 = r25
            if (r9 != 0) goto L1a
            return
        Lb:
            r4 = 0
            java.lang.String r6 = "invite"
            r7 = 0
            r16 = 0
            r11 = 116(0x74, float:1.63E-43)
            r5 = r0
            r9 = r7
            r10 = r7
            X.C75642TmQ.LJJJJLL(r5, r6, r7, r8, r9, r10, r11)
            goto L2c
        L1a:
            if (r8 != 0) goto Lb
            if (r9 == 0) goto Lb
            r4 = 1
            java.lang.String r6 = "invite"
            r7 = 0
            r16 = 0
            r11 = 108(0x6c, float:1.51E-43)
            r5 = r0
            r8 = r7
            r10 = r7
            X.C75642TmQ.LJJJJLL(r5, r6, r7, r8, r9, r10, r11)
        L2c:
            r5 = 0
            long r6 = r0.getId()
            long r8 = r0.getOwnerUserId()
            long r10 = X.C44432HcC.LJIIL(r0)
            long r12 = X.C44432HcC.LJIIJJI(r0)
            com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting r1 = com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting.INSTANCE
            int r1 = r1.getValue()
            long r14 = (long) r1
            java.lang.String r3 = "invite_pairing_bubble"
            java.lang.String r2 = "invite_reserve_bubble"
            if (r4 == 0) goto L74
            r18 = r3
        L4c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r4 == 0) goto L70
            r1.add(r3)
        L56:
            r20 = 64
            X.ToJ r4 = new X.ToJ
            r17 = r23
            r19 = r1
            r4.<init>(r5, r6, r8, r10, r12, r14, r16, r17, r18, r19, r20)
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r2 = X.C8E.LIZLLL()
            X.TlA r1 = new X.TlA
            r3 = r21
            r1.<init>(r3, r0)
            r2.LLJI(r4, r1)
            return
        L70:
            r1.add(r2)
            goto L56
        L74:
            r18 = r2
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75525TkX.LJ(com.bytedance.android.livesdkapi.depend.model.live.Room, java.util.HashMap, com.bytedance.android.livesdk.model.message.ReserveInfo, com.bytedance.android.livesdk.model.message.OptPairInfo):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.android.live.base.model.user.User r22, long r23, com.bytedance.android.livesdk.model.message.ReserveInfo r25, com.bytedance.android.livesdk.model.message.OptPairInfo r26) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75525TkX.LJI(com.bytedance.android.live.base.model.user.User, long, com.bytedance.android.livesdk.model.message.ReserveInfo, com.bytedance.android.livesdk.model.message.OptPairInfo):void");
    }
}
