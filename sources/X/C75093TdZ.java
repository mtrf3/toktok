package X;

import Y.ACListenerS24S0101000_5;
import Y.ACListenerS29S0201000_13;
import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorSelfVideoChangedEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveCancelFromConfirmInviteDialogEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveHostAcceptGuestResultDialogEvent;
import com.bytedance.android.live.liveinteract.api.MultiLivePreCheckInviteFailedEvent;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MicClickableEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3HostAcceptApplyOptimization;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveLinkPanelStyle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TdZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C75093TdZ extends AbstractC76218Tvi<LinkPlayerInfo> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIL;
    public final DataChannel LJLIL;
    public InterfaceC75119Tdz LJLILLLLZI;
    public MultiGuestDataHolder LJLJI;
    public LinkControlDataHolder LJLJJI;
    public final int LJLJJL;
    public final InterfaceC88472Yns<Long, Long> LJLJJLL;
    public final InterfaceC88472Yns<Long, Integer> LJLJL;
    public final String LJLJLJ;
    public final C75066Td8 LJLJLLL;
    public final C31597Caf LJLL;
    public final View LJLLI;
    public final View LJLLILLLL;
    public final View LJLLJ;
    public final C47121t6 LJLLL;
    public final C47121t6 LJLLLL;
    public final C47121t6 LJLLLLLL;
    public final LiveIconView LJLZ;
    public final View LJZ;
    public final ImageView LJZI;
    public final ImageView LJZL;
    public final LiveIconView LL;
    public final ImageView LLD;
    public final ImageView LLF;
    public final C2A7 LLFF;
    public final C2A7 LLFFF;
    public final LiveIconView LLFII;
    public final ImageView LLFZ;
    public final C2A7 LLI;
    public final ViewGroup LLIFFJFJJ;
    public final C47121t6 LLII;
    public final View LLIIII;
    public final View LLIIIILZ;
    public final String LLIIIJ;
    public final Context LLIIIL;
    public final C31657Cbd LLIIIZ;
    public final C31657Cbd LLIIJI;
    public final String LLIIJLIL;

    static {
        TBT tbt = new TBT(C75093TdZ.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/ZoomService;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C75093TdZ.class, "anchorUserManager", "getAnchorUserManager()Lcom/bytedance/android/live/liveinteract/multiguestv3/service/usermanage/common/IAnchorUserManager;", 0, c65351Pkp)};
    }

    @Override // X.AbstractC76218Tvi
    public final void LJJJJIZL() {
        this.LJLILLLLZI = null;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    public final ZoomService Q() {
        return (ZoomService) this.LLIIIZ.LIZ(this, LLIIL[0]);
    }

    public final void c0() {
        int i;
        Boolean bool;
        LiveMode liveMode;
        MultiGuestDataHolder multiGuestDataHolder = this.LJLJI;
        if (multiGuestDataHolder.LJIILIIL == 0 || multiGuestDataHolder.LJII == 0) {
            i = 0;
        } else if (multiGuestDataHolder.LJ) {
            i = 1;
        } else {
            i = 2;
        }
        ImageView imageView = this.LJZI;
        Context context = this.LLIIIL;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) != null) {
            bool = Boolean.valueOf(C29137Bc5.LIZ(liveMode));
        } else {
            bool = null;
        }
        C74947TbD.LJJIIJ(imageView, i, context, false, bool);
        this.LJZI.setVisibility(0);
    }

    public final void f0() {
        if (this.LJLJI.LJ) {
            this.LJZL.setImageResource(R.drawable.czx);
        } else {
            this.LJZL.setImageResource(R.drawable.czz);
        }
    }

    public final int P() {
        Boolean bool;
        ZoomService Q = Q();
        Boolean bool2 = null;
        if (Q != null) {
            bool = Boolean.valueOf(Q.LIZJ());
        } else {
            bool = null;
        }
        if (C29306Beo.LJIL(bool)) {
            return 0;
        }
        ZoomService Q2 = Q();
        if (Q2 != null) {
            bool2 = Boolean.valueOf(Q2.LJI());
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            return 2;
        }
        return 1;
    }

    public final boolean a0() {
        MultiGuestDataHolder multiGuestDataHolder;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        if ((!TUT.LIZ() && !TUT.LIZIZ()) || (multiGuestDataHolder = this.LJLJI) == null || (multiLiveAnchorPanelSettings = multiGuestDataHolder.LJIIJ) == null || multiLiveAnchorPanelSettings.applierSortSetting != 1 || TV3.LJIIJ() || 1 == this.LJLJJL) {
            return false;
        }
        return true;
    }

    public final void g0() {
        boolean z = false;
        if (!C74947TbD.LJIIJJI() || Q() == null) {
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            String str = this.LLIIJLIL;
            OSZ[] oszArr = new OSZ[4];
            oszArr[0] = new OSZ("action", "updateZoomBtn");
            oszArr[1] = new OSZ("step", "goneZoomBtnUI");
            oszArr[2] = new OSZ("linkMic1vnZoomGuestEnable", Boolean.valueOf(C74947TbD.LJIIJJI()));
            if (Q() == null) {
                z = true;
            }
            oszArr[3] = new OSZ("zoomServiceIsNull", Boolean.valueOf(z));
            LJIILIIL.LJIIIIZZ(str, C113554cx.LJJLIIIIJ(oszArr));
            ViewGroup.LayoutParams layoutParams = this.LJZL.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C018905p c018905p = (C018905p) layoutParams;
            c018905p.endToStart = -1;
            c018905p.endToEnd = R.id.fk0;
            c018905p.setMarginEnd(C15380j0.LIZ(0.0f));
            this.LJZL.setLayoutParams(c018905p);
            C29306Beo.LJI(this.LL);
            return;
        }
        ZoomService Q = Q();
        if (Q == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.LJZL.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        C018905p c018905p2 = (C018905p) layoutParams2;
        c018905p2.endToStart = R.id.atp;
        c018905p2.endToEnd = -1;
        c018905p2.setMarginEnd(C15380j0.LIZ(25.0f));
        this.LJZL.setLayoutParams(c018905p2);
        C29306Beo.LJJLJLI(this.LL);
        C74824TYe.LIZ.LJJII(P(), String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId()), "", "show", "anchor");
        EnumC74949TbF LIZLLL = Q.LJIIJJI().LIZLLL(Q.LJIIIZ());
        C28733BPl.LJIILIIL().LJIIIIZZ(this.LLIIJLIL, C113554cx.LJJLIIIIJ(new OSZ("action", "updateZoomBtn"), new OSZ("step", "calculateZoomStatus"), new OSZ("zoomStatus", LIZLLL)));
        C74947TbD.LJJIIJZLJL(this.LL, LIZLLL, this.LLIIIL, C87277YNd.LJIJI(R.color.cs), C87277YNd.LJIJI(R.color.cn));
        LiveIconView liveIconView = this.LL;
        if (LIZLLL != EnumC74949TbF.ZOOM_DISABLED) {
            z = true;
        }
        liveIconView.setEnabled(z);
        C16880lQ.LJJII(this.LL, new ACListenerS47S0200000_13(this, Q, 22));
    }

    public static final boolean Y(User user) {
        long j;
        long id = user.getId();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        if (id == j) {
            return true;
        }
        return false;
    }

    public final void M(LinkPlayerInfo data) {
        int i;
        String LIZ;
        C75066Td8 c75066Td8;
        DataChannel dataChannel;
        int i2;
        InterfaceC88472Yns<Long, Long> interfaceC88472Yns;
        Long invoke;
        o.LJIIIZ(data, "data");
        this.itemView.setTag(R.id.ln3, data.mUser.getIdStr());
        User user = data.mUser;
        C31597Caf c31597Caf = this.LJLL;
        C31665Cbl.LJIIJ(c31597Caf, user.getAvatarThumb(), c31597Caf.getWidth(), c31597Caf.getHeight(), R.drawable.cuk);
        this.LJLLL.setText(C05170If.LIZ(user));
        if (Y(user)) {
            this.LJLLLL.setText(C15380j0.LJIILJJIL(R.string.lvv));
            this.LJLLLL.setVisibility(0);
            this.LJLLI.setVisibility(0);
            this.LJLLILLLL.setVisibility(0);
        }
        LiveMode liveMode = null;
        if (!Y(user)) {
            this.LJLLLL.setVisibility(8);
            this.LJLLI.setVisibility(8);
            this.LJLLILLLL.setVisibility(8);
            if (a0() && (interfaceC88472Yns = this.LJLJJLL) != null && (invoke = interfaceC88472Yns.invoke(Long.valueOf(data.mUser.getId()))) != null && invoke.longValue() > 0) {
                i2 = 70;
            } else {
                i2 = 0;
            }
            String LJFF = C74896TaO.LJFF(i2, data);
            if ((!TextUtils.isEmpty(LJFF)) && LJFF != null) {
                this.LJLLLL.setVisibility(0);
                this.LJLLLL.setText(LJFF);
            }
            if (data.LIZIZ == 1) {
                if (C74931Tax.LIZ(user)) {
                    this.LJLLLL.setText(C15380j0.LJIILJJIL(R.string.oia));
                    this.LJLLLL.setVisibility(0);
                } else {
                    this.LJLLLL.setVisibility(8);
                }
            }
        }
        C75054Tcw c75054Tcw = new C75054Tcw(data.LIZ, data.mRoleType);
        this.LJZI.setVisibility(8);
        this.LJZL.setVisibility(8);
        this.LL.setVisibility(8);
        C87277YNd.LJJIIZ(this.LJLLJ);
        this.LLI.setVisibility(8);
        this.LLI.setEnabled(true);
        this.LLFF.setVisibility(8);
        this.LLFF.setEnabled(true);
        this.LLFZ.setVisibility(8);
        this.LLFFF.setVisibility(8);
        this.LLD.setVisibility(8);
        this.LLF.setVisibility(8);
        this.LLFFF.LJJLL(R.style.a35);
        this.LLFII.setVisibility(8);
        User user2 = data.mUser;
        o.LJIIIIZZ(user2, "item.user");
        if (Y(user2)) {
            i = 0;
        } else {
            i = data.LIZIZ;
        }
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ = C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_MultiLiveLinkPanelUserInfo_", LJ, LIZ2);
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ = C17M.LIZ(U44.BIZ, LIZ3, "_MultiLiveLinkPanelUserInfo_", 296, LIZ3);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("type = ");
        LIZ4.append(i);
        C32014ChO.LIZJ(LIZ, X1D.LIZIZ(LIZ4), null);
        C87277YNd.LJJIIZ(this.LLIFFJFJJ);
        C87277YNd.LJJIIZ(this.LLIIII);
        C87277YNd.LJJIIZ(this.LLIIIILZ);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (MultiGuestAnchorPanelTypeSetting.INSTANCE.isInLabGroup() && data.onlineStatus == 1 && !((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt()) {
                                C87277YNd.LJJIJ(this.LJLLJ);
                            } else {
                                C87277YNd.LJJIIZ(this.LJLLJ);
                            }
                            this.LLI.setVisibility(0);
                            C16880lQ.LJJIII(this.LLI, new ACListenerS47S0200000_13(this, data, 23));
                            LinkControlDataHolder linkControlDataHolder = this.LJLJJI;
                            if (linkControlDataHolder != null) {
                                if (linkControlDataHolder.LIZ.contains(Long.valueOf(data.mUser.getId()))) {
                                    this.LLI.setText(C15380j0.LJIILJJIL(R.string.jvd));
                                    this.LLI.setEnabled(false);
                                } else {
                                    this.LLI.setText(C15380j0.LJIILJJIL(R.string.lzb));
                                    this.LLI.setEnabled(true);
                                }
                            }
                            DataChannel dataChannel2 = this.LJLIL;
                            if (dataChannel2 != null) {
                                dataChannel2.mv0(MultiLiveCancelFromConfirmInviteDialogEvent.class, this, new AqS179S0100000_13(this, 394));
                            }
                        }
                    } else {
                        int i3 = this.LJLJJL;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                X(data);
                            } else {
                                C2A7 c2a7 = this.LLI;
                                C87277YNd.LJJIJ(c2a7);
                                c2a7.setText(C15380j0.LJIILJJIL(R.string.lzb));
                                c2a7.setEnabled(false);
                            }
                        } else {
                            X(data);
                        }
                    }
                } else {
                    if (data.LIZ == 4) {
                        this.LLFF.setVisibility(0);
                        this.LLFF.setText(C15380j0.LJIILJJIL(R.string.n8i));
                        C16880lQ.LJJIII(this.LLFF, ViewOnClickListenerC75128Te8.LJLIL);
                        this.LLFF.setEnabled(false);
                        this.LLFZ.setVisibility(0);
                        C16880lQ.LJIILLIIL(this.LLFZ, new ACListenerS47S0200000_13(this, data, 25));
                    } else {
                        this.LLFF.setEnabled(true);
                        this.LLFF.setVisibility(0);
                        this.LLFF.setText(C15380j0.LJIILJJIL(R.string.k1p));
                        C16880lQ.LJJIII(this.LLFF, new ACListenerS47S0200000_13(this, data, 26));
                        this.LLFZ.setVisibility(0);
                        C16880lQ.LJIILLIIL(this.LLFZ, new ACListenerS47S0200000_13(this, data, 27));
                    }
                    if (1 == MultiGuestV3HostAcceptApplyOptimization.getValue() && (dataChannel = this.LJLIL) != null) {
                        dataChannel.mv0(MultiLiveHostAcceptGuestResultDialogEvent.class, this, new AqS144S0200000_13(this, data, 32));
                    }
                    if (!TUZ.LIZ() || (c75066Td8 = this.LJLJLLL) == null || !c75066Td8.LIZIZ) {
                        C87277YNd.LJJIIZ(this.LLIFFJFJJ);
                        C87277YNd.LJJIIZ(this.LLIIII);
                        C87277YNd.LJJIIZ(this.LLIIIILZ);
                    } else {
                        User user3 = data.mUser;
                        if (user3 != null) {
                            Integer num = this.LJLJLLL.LIZ.get(Long.valueOf(user3.getId()));
                            if (num != null) {
                                if (num.intValue() == 0) {
                                    C87277YNd.LJJIIZ(this.LLIFFJFJJ);
                                    C87277YNd.LJJIIZ(this.LLIIII);
                                    C87277YNd.LJJIIZ(this.LLIIIILZ);
                                } else if (num.intValue() == 1) {
                                    C87277YNd.LJJIJ(this.LLIFFJFJJ);
                                    C87277YNd.LJJIJ(this.LLIIII);
                                    C87277YNd.LJJIIZ(this.LLIIIILZ);
                                } else if (num.intValue() == 2) {
                                    C87277YNd.LJJIIZ(this.LLIFFJFJJ);
                                    C87277YNd.LJJIJ(this.LLIIII);
                                    C87277YNd.LJJIIZ(this.LLIIIILZ);
                                } else if (num.intValue() == 3) {
                                    C87277YNd.LJJIIZ(this.LLIFFJFJJ);
                                    C87277YNd.LJJIIZ(this.LLIIII);
                                    C87277YNd.LJJIJ(this.LLIIIILZ);
                                } else if (num.intValue() == 4) {
                                    C87277YNd.LJJIJ(this.LLIFFJFJJ);
                                    C87277YNd.LJJIIZ(this.LLIIII);
                                    C87277YNd.LJJIJ(this.LLIIIILZ);
                                }
                            }
                            C47121t6 c47121t6 = this.LLII;
                            String LJII = C15380j0.LJII(R.plurals.nl, this.LJLJLLL.LIZJ);
                            o.LJIIIIZZ(LJII, "getQuantityString(R.plur…ldInfo.matchThresholdNum)");
                            String LLLZ = C16880lQ.LLLZ(LJII, Arrays.copyOf(new Object[]{Integer.valueOf(this.LJLJLLL.LIZJ)}, 1));
                            o.LJIIIIZZ(LLLZ, "format(format, *args)");
                            c47121t6.setText(LLLZ);
                        }
                    }
                }
            } else if (data.mUser != null) {
                U(data, c75054Tcw);
                this.LLFII.setVisibility(0);
                if (C74945TbB.LIZIZ(Boolean.TRUE)) {
                    this.LLFII.setIconAttr(R.attr.auc);
                }
                C16880lQ.LJJII(this.LLFII, new ACListenerS47S0200000_13(this, data, 24));
            }
        } else {
            T(data);
        }
        DataChannel dataChannel3 = this.LJLIL;
        if (dataChannel3 != null) {
            liveMode = (LiveMode) dataChannel3.kv0(BCX.class);
        }
        if (C29137Bc5.LIZ(liveMode)) {
            C87277YNd.LJJIIZ(this.LJZI);
            C87277YNd.LJJIIZ(this.LJZL);
            C87277YNd.LJJIIZ(this.LLD);
        }
        C16880lQ.LJJIJIIJI(this.LJLL, new ACListenerS24S0101000_5(i, data, 7));
        if (this.LJLJJLL == null || !a0()) {
            C87277YNd.LJJIIZ(this.LJLLLLLL);
            C87277YNd.LJJIIZ(this.LJLZ);
            C87277YNd.LJJIIZ(this.LJZ);
        } else {
            User user4 = data.mUser;
            o.LJIIIIZZ(user4, "item.user");
            if (Y(user4) || data.LIZIZ != 2) {
                C87277YNd.LJJIIZ(this.LJLLLLLL);
                C87277YNd.LJJIIZ(this.LJLZ);
                C87277YNd.LJJIIZ(this.LJZ);
            } else {
                C87277YNd.LJJIJ(this.LJLLLLLL);
                C87277YNd.LJJIJ(this.LJLZ);
                if (this.LJLLLL.getVisibility() == 0) {
                    C87277YNd.LJJIJ(this.LJZ);
                } else {
                    C87277YNd.LJJIIZ(this.LJZ);
                }
                Long invoke2 = this.LJLJJLL.invoke(Long.valueOf(data.mUser.getId()));
                if (invoke2 != null) {
                    C47121t6 c47121t62 = this.LJLLLLLL;
                    String LJIILJJIL = b.LJIILJJIL(invoke2.longValue());
                    o.LJIIIIZZ(LJIILJJIL, "getDisplayCountForCoin(coinsNum)");
                    Locale ROOT = Locale.ROOT;
                    o.LJIIIIZZ(ROOT, "ROOT");
                    String upperCase = LJIILJJIL.toUpperCase(ROOT);
                    o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    c47121t62.setText(upperCase);
                    if (invoke2.longValue() == 0) {
                        C87277YNd.LJJIIZ(this.LJLLLLLL);
                        C87277YNd.LJJIIZ(this.LJLZ);
                        C87277YNd.LJJIIZ(this.LJZ);
                    }
                } else {
                    this.LJLLLLLL.setText(CardStruct.IStatusCode.DEFAULT);
                    C87277YNd.LJJIIZ(this.LJLLLLLL);
                    C87277YNd.LJJIIZ(this.LJLZ);
                    C87277YNd.LJJIIZ(this.LJZ);
                }
            }
        }
        this.itemView.setTag(R.id.ln4, c75054Tcw);
    }

    public int N(LinkPlayerInfo linkPlayerInfo) {
        return C74947TbD.LIZ(linkPlayerInfo, this.LJLJI);
    }

    public void T(LinkPlayerInfo item) {
        o.LJIIIZ(item, "item");
        MultiGuestDataHolder multiGuestDataHolder = this.LJLJI;
        if (multiGuestDataHolder.LJIILIIL >= 1) {
            if (multiGuestDataHolder.LJ) {
                multiGuestDataHolder.LJII = 1;
            } else if (!multiGuestDataHolder.LJ) {
                multiGuestDataHolder.LJII = 2;
            }
        }
        if (MultiLiveLinkPanelStyle.INSTANCE.getValue() == 2) {
            this.LJZI.setVisibility(0);
        }
        this.LJZL.setVisibility(0);
        c0();
        f0();
        g0();
        C16880lQ.LJIILLIIL(this.LJZI, new ACListenerS33S0100000_13(this, 135));
        C16880lQ.LJIILLIIL(this.LJZL, new ACListenerS33S0100000_13(this, 136));
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.mv0(LinkReceiveEnlargeMessageEvent.class, this, new AqS179S0100000_13(this, 391));
            dataChannel.mv0(MultiGuestAnchorSelfVideoChangedEvent.class, this, new AqS179S0100000_13(this, 392));
        }
    }

    public final void X(LinkPlayerInfo linkPlayerInfo) {
        this.LLI.setVisibility(0);
        C16880lQ.LJJIII(this.LLI, new ACListenerS47S0200000_13(this, linkPlayerInfo, 21));
        if (linkPlayerInfo.mRoleType != 3) {
            this.LLI.setText(C15380j0.LJIILJJIL(R.string.lzb));
            this.LLI.setEnabled(true);
        } else {
            this.LLI.setText(C15380j0.LJIILJJIL(R.string.jvd));
            this.LLI.setEnabled(false);
        }
        if (linkPlayerInfo.permissionAsViewer == 2) {
            this.LLI.setEnabled(false);
        }
        C87277YNd.LJJIIZ(this.LJLLJ);
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.mv0(MultiLiveCancelFromConfirmInviteDialogEvent.class, this, new AqS179S0100000_13(this, 393));
            dataChannel.mv0(MultiLivePreCheckInviteFailedEvent.class, this, new AqS144S0200000_13(this, linkPlayerInfo, 31));
        }
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object obj) {
        LinkPlayerInfo data = (LinkPlayerInfo) obj;
        o.LJIIIZ(data, "data");
        M(data);
    }

    public void U(LinkPlayerInfo item, C75054Tcw c75054Tcw) {
        boolean z;
        Boolean bool;
        LiveMode liveMode;
        o.LJIIIZ(item, "item");
        this.LLFFF.setVisibility(8);
        boolean z2 = true;
        if (this.LJLJI.LJI(item.mInteractIdStr) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (1 != MultiGuestV3AudioBeOccupiedSettings.getValue() || (this.LJLJI.LIZIZ(item.mInteractIdStr) != 4 && this.LJLJI.LIZIZ(item.mInteractIdStr) != 3)) {
            z2 = false;
        }
        this.LLD.setVisibility(0);
        int LIZJ = C74947TbD.LIZJ(item, this.LJLJI);
        ImageView imageView = this.LLD;
        Context context = this.LLIIIL;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) != null) {
            bool = Boolean.valueOf(C29137Bc5.LIZ(liveMode));
        } else {
            bool = null;
        }
        C74947TbD.LJJIIJ(imageView, LIZJ, context, z, bool);
        if (!z) {
            C16880lQ.LJIILLIIL(this.LLD, new ACListenerS29S0201000_13(this, LIZJ, item, 4));
        } else {
            this.LLD.setClickable(false);
        }
        c75054Tcw.LIZJ = LIZJ;
        c75054Tcw.LIZIZ = V(item, z, z2);
    }

    public final void h0(String str, LinkPlayerInfo linkPlayerInfo) {
        C28733BPl.LJIILIIL().LJIIIIZZ(this.LLIIJLIL, C113554cx.LJJLIIIIJ(new OSZ("action", "zoom"), new OSZ("step", "entrance"), new OSZ("linkMicId", str)));
        ZoomService Q = Q();
        if (Q != null) {
            Q.LJ(str, new C75096Tdc(this, linkPlayerInfo), false, true, EnumC74929Tav.FROM_HOST_ZOOM_SELF);
        }
        InterfaceC75119Tdz interfaceC75119Tdz = this.LJLILLLLZI;
        if (interfaceC75119Tdz != null) {
            interfaceC75119Tdz.LJII();
        }
    }

    public final int V(LinkPlayerInfo item, boolean z, boolean z2) {
        o.LJIIIZ(item, "item");
        this.LLF.setVisibility(0);
        int N = N(item);
        C74947TbD.LJJIII(this.LLF, N, this.LLIIIL, z, z2);
        if (1 == MultiGuestV3AudioBeOccupiedSettings.getValue()) {
            C16880lQ.LJIILLIIL(this.LLF, new ViewOnClickListenerC75098Tde(z, z2, this, item, N));
        } else if (!z) {
            C16880lQ.LJIILLIIL(this.LLF, new ACListenerS29S0201000_13(this, N, item, 3));
        } else {
            this.LLF.setClickable(false);
        }
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.mv0(MicClickableEvent.class, this, new AqS144S0200000_13(this, item, 30));
        }
        return N;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C75093TdZ(View itemView, DataChannel dataChannel, InterfaceC75119Tdz interfaceC75119Tdz, MultiGuestDataHolder dataHolder, LinkControlDataHolder linkControlDataHolder, int i, InterfaceC88472Yns<? super Long, Long> interfaceC88472Yns, InterfaceC88472Yns<? super Long, Integer> interfaceC88472Yns2, String str, C75066Td8 c75066Td8) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(dataHolder, "dataHolder");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = interfaceC75119Tdz;
        this.LJLJI = dataHolder;
        this.LJLJJI = linkControlDataHolder;
        this.LJLJJL = i;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC88472Yns2;
        this.LJLJLJ = str;
        this.LJLJLLL = c75066Td8;
        View findViewById = itemView.findViewById(R.id.f67);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_list_user_avatar)");
        this.LJLL = (C31597Caf) findViewById;
        View findViewById2 = itemView.findViewById(R.id.a1u);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.anchor_block_up)");
        this.LJLLI = findViewById2;
        View findViewById3 = itemView.findViewById(R.id.a1t);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.anchor_block_down)");
        this.LJLLILLLL = findViewById3;
        View findViewById4 = itemView.findViewById(R.id.nb1);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.view_online_dot)");
        this.LJLLJ = findViewById4;
        View findViewById5 = itemView.findViewById(R.id.mpz);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.tv_user_name)");
        this.LJLLL = (C47121t6) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.mgz);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.tv_relationship)");
        this.LJLLLL = (C47121t6) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.m2k);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.tv_coins_num)");
        this.LJLLLLLL = (C47121t6) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.eb2);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.icon_coins)");
        this.LJLZ = (LiveIconView) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.am6);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.block_coins)");
        this.LJZ = findViewById9;
        o.LJIIIIZZ(itemView.findViewById(R.id.fnj), "itemView.findViewById(R.…yout_user_info_container)");
        View findViewById10 = itemView.findViewById(R.id.f4w);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.iv_ic_anchor_video)");
        this.LJZI = (ImageView) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.f4v);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.id.iv_ic_anchor_reverse)");
        this.LJZL = (ImageView) findViewById11;
        View findViewById12 = itemView.findViewById(R.id.atp);
        o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.id.bt_ic_anchor_zoom)");
        this.LL = (LiveIconView) findViewById12;
        View findViewById13 = itemView.findViewById(R.id.f4u);
        o.LJIIIIZZ(findViewById13, "itemView.findViewById(R.…_anchor_mute_guest_video)");
        this.LLD = (ImageView) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.f4t);
        o.LJIIIIZZ(findViewById14, "itemView.findViewById(R.…_anchor_mute_guest_audio)");
        this.LLF = (ImageView) findViewById14;
        View findViewById15 = itemView.findViewById(R.id.aui);
        o.LJIIIIZZ(findViewById15, "itemView.findViewById(R.id.btn_accept)");
        this.LLFF = (C2A7) findViewById15;
        View findViewById16 = itemView.findViewById(R.id.aw_);
        o.LJIIIIZZ(findViewById16, "itemView.findViewById(R.id.btn_follow)");
        this.LLFFF = (C2A7) findViewById16;
        View findViewById17 = itemView.findViewById(R.id.f4s);
        o.LJIIIIZZ(findViewById17, "itemView.findViewById(R.id.iv_ic_accept_kick_off)");
        this.LLFII = (LiveIconView) findViewById17;
        View findViewById18 = itemView.findViewById(R.id.e_5);
        o.LJIIIIZZ(findViewById18, "itemView.findViewById(R.id.ic_reject_apply)");
        this.LLFZ = (ImageView) findViewById18;
        View findViewById19 = itemView.findViewById(R.id.awu);
        o.LJIIIIZZ(findViewById19, "itemView.findViewById(R.id.btn_invite)");
        this.LLI = (C2A7) findViewById19;
        View findViewById20 = itemView.findViewById(R.id.dwo);
        o.LJIIIIZZ(findViewById20, "itemView.findViewById(R.id.gifter_threshold_title)");
        this.LLIFFJFJJ = (ViewGroup) findViewById20;
        View findViewById21 = itemView.findViewById(R.id.dwp);
        o.LJIIIIZZ(findViewById21, "itemView.findViewById(R.…ifter_threshold_title_tv)");
        this.LLII = (C47121t6) findViewById21;
        View findViewById22 = itemView.findViewById(R.id.dwh);
        o.LJIIIIZZ(findViewById22, "itemView.findViewById(R.…ter_threshold_content_bg)");
        this.LLIIII = findViewById22;
        View findViewById23 = itemView.findViewById(R.id.dwj);
        o.LJIIIIZZ(findViewById23, "itemView.findViewById(R.….gifter_threshold_end_bg)");
        this.LLIIIILZ = findViewById23;
        this.LLIIIJ = "MultiLiveAnchorOpenCamera";
        Context context = itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        this.LLIIIL = context;
        this.LLIIIZ = new C31657Cbd("ZOOM_SERVICE");
        this.LLIIJI = new C31657Cbd("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        this.LLIIJLIL = "Zoom/UserInfoViewHolder";
    }
}
