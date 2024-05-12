package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common;

import X.AbstractC74727TUl;
import X.AbstractC74908Taa;
import X.B7S;
import X.B83;
import X.BPP;
import X.C018905p;
import X.C03880Dg;
import X.C05170If;
import X.C09;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C19N;
import X.C19U;
import X.C1YG;
import X.C1YH;
import X.C221108m2;
import X.C28467BFf;
import X.C29044Baa;
import X.C29213BdJ;
import X.C29215BdL;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29556Biq;
import X.C2A7;
import X.C30770C5u;
import X.C30784C6i;
import X.C44432HcC;
import X.C47121t6;
import X.C47261Igj;
import X.C53545Kzt;
import X.C53607L2d;
import X.C59994Ngc;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C73129Smz;
import X.C73318Sq2;
import X.C73411SrX;
import X.C74347TFv;
import X.C74736TUu;
import X.C74740TUy;
import X.C74752TVk;
import X.C74824TYe;
import X.C74909Tab;
import X.C74922Tao;
import X.C74938Tb4;
import X.C74983Tbn;
import X.C75017TcL;
import X.C75023TcR;
import X.C75027TcV;
import X.C75078TdK;
import X.C75181Tez;
import X.C75457TjR;
import X.C75516TkO;
import X.C75559Tl5;
import X.C76917UGr;
import X.C77437UaH;
import X.C78866UxK;
import X.C78886Uxe;
import X.C87277YNd;
import X.C88207Yjb;
import X.C8E;
import X.CJ2;
import X.CVT;
import X.DialogC77438UaI;
import X.DialogInterfaceOnClickListenerC74823TYd;
import X.DialogInterfaceOnClickListenerC74936Tb2;
import X.EnumC74778TWk;
import X.EnumC74950TbG;
import X.FT5;
import X.InterfaceC28471BFj;
import X.InterfaceC29205BdB;
import X.InterfaceC30442Bx8;
import X.InterfaceC74869TZx;
import X.InterfaceC74941Tb7;
import X.InterfaceC75558Tl4;
import X.OSZ;
import X.Q8U;
import X.TQ7;
import X.TQ8;
import X.TQM;
import X.TRU;
import X.TUO;
import X.TUZ;
import X.TV3;
import X.TWR;
import X.TXF;
import X.TXG;
import X.TY2;
import X.TYJ;
import X.U15;
import X.U4C;
import X.X1D;
import Y.ALAdapterS10S0200000_13;
import Y.AfS65S0100000_13;
import Y.IDCListenerS164S0100000_13;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestApplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplyFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveSucceedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AutoOpenGuestApplyDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestGuestSelfSendGiftData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewFragment;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyLayoutOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLinkInjectorOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMultiTypeAdapterFix;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRevenueAreaBackUpSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS20S0000100_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class MultiGuestUserInfoFragment extends PreviewFragment implements InterfaceC74941Tb7, TY2, TQ7, InterfaceC28471BFj<Integer> {
    public static final /* synthetic */ int LLJIJIL = 0;
    public boolean LJLJI;
    public boolean LJLJJI;
    public LiveDialogFragment LJLJJLL;
    public RecyclerView LJLJL;
    public C2A7 LJLJLLL;
    public C47121t6 LJLL;
    public C47121t6 LJLLI;
    public C47121t6 LJLLILLLL;
    public C47121t6 LJLLJ;
    public ViewGroup LJLLL;
    public ViewGroup LJLLLL;
    public C2A7 LJLLLLLL;
    public C2A7 LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public C29213BdJ LL;
    public C29215BdL LLF;
    public C29215BdL LLFF;
    public DataChannel LLFFF;
    public TXF LLFII;
    public AbstractC74908Taa LLFZ;
    public WeakReference<TQM> LLI;
    public TWR LLIFFJFJJ;
    public ImageView LLII;
    public View LLIIII;
    public View LLIIIILZ;
    public ViewGroup LLIIIJ;
    public View LLIIIL;
    public int LLIIJLIL;
    public ViewGroup LLIIL;
    public ViewGroup LLIILII;
    public ImageView LLIILZL;
    public ImageView LLIIZ;
    public CVT LLIL;
    public int LLILII;
    public U15 LLILIL;
    public U15 LLILL;
    public ConstraintLayout LLILLIZIL;
    public List<? extends LinkPlayerInfo> LLILZLL;
    public DialogC77438UaI LLIZLLLIL;
    public final C62822Ol8 LLJ;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mDataHolder;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_V3_GUEST_USER_MANAGER")
    public TQ8 userManager;
    public final Map<Integer, View> LLJI = new LinkedHashMap();
    public int LJLJJL = -1;
    public final C73129Smz LJLJLJ = new C73129Smz();
    public final C62822Ol8 LLD = C221108m2.LIZIZ(C74938Tb4.LJLIL);
    public final CJ2 LLIIIZ = new CJ2();
    public final CJ2 LLIIJI = new CJ2();
    public final C62822Ol8 LLILLJJLI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 107));
    public final C62822Ol8 LLILLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 108));
    public String LLILZ = "outside";
    public final int LLILZIL = 354;
    public final C62822Ol8 LLIZ = C221108m2.LIZIZ(C53545Kzt.LJLIL);

    public static void wl(DialogC77438UaI dialogC77438UaI) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "4453908812873740469")).LIZ) {
            return;
        }
        dialogC77438UaI.show();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewFragment, com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJI).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.PreviewFragment, com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MultiGuestUserInfoFragment() {
        if (LinkMicLinkInjectorOptSetting.INSTANCE.isOptLinkInjector()) {
            try {
                C75559Tl5.LIZIZ.LIZLLL(this);
            } catch (Throwable th) {
                C29556Biq.LIZ().LJIILL();
                C75559Tl5.LIZIZ.LIZLLL(this);
                C75516TkO.LIZ.LIZIZ(70001, "LinkInjector.inject error", th, null);
            }
        } else {
            C75559Tl5.LIZIZ.LIZLLL(this);
        }
        C0NB.LIZIZ("MultiGuestUserInfoFragment", "init useFakeStateFirstTime from init");
        Zl();
        this.LLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 109));
    }

    public final void Al() {
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            LiveDialogFragment liveDialogFragment = this.LJLJJLL;
            if (liveDialogFragment != null && liveDialogFragment.isShowing()) {
                LiveDialogFragment liveDialogFragment2 = this.LJLJJLL;
                if (liveDialogFragment2 != null) {
                    liveDialogFragment2.dismiss();
                }
                this.LJLJJLL = null;
                return;
            }
            return;
        }
        LiveDialogFragment liveDialogFragment3 = this.LJLJJLL;
        if (liveDialogFragment3 == null) {
            return;
        }
        liveDialogFragment3.dismiss();
    }

    public final void Dl() {
        TQM tqm;
        InterfaceC29205BdB<C28467BFf<MultiLiveGuestInfoList>> fetchUserListData;
        WeakReference<TQM> weakReference = this.LLI;
        if (weakReference != null && (tqm = weakReference.get()) != null && (fetchUserListData = tqm.fetchUserListData(Ml())) != null) {
            fetchUserListData.LIZJ(new AfS65S0100000_13(this, 49), new AfS65S0100000_13(this, 50));
        }
    }

    public final MultiGuestDataHolder Hl() {
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("mDataHolder");
        throw null;
    }

    @Override // X.TY2
    public final void LLILIL() {
        TQ8 tq8 = this.userManager;
        if (tq8 != null) {
            tq8.LJIIIZ(C44432HcC.LJI(), "anchor_invite_guest");
        }
    }

    public final boolean Ll() {
        TQM tqm;
        WeakReference<TQM> weakReference = this.LLI;
        if (weakReference != null) {
            tqm = weakReference.get();
        } else {
            tqm = null;
        }
        return tqm instanceof TRU;
    }

    public final boolean Ml() {
        return ((Boolean) this.LLJ.getValue()).booleanValue();
    }

    public final void Vl() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLLJ, (Property<C47121t6, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.addListener(new ALAdapterS10S0200000_13(ofFloat, this, 2));
        ofFloat.start();
    }

    public final void Wl() {
        C2A7 c2a7 = this.LJLJLLL;
        if (c2a7 != null) {
            c2a7.setClickable(true);
        }
        if (Ll()) {
            ConstraintLayout constraintLayout = this.LLILLIZIL;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
                int i = C75027TcV.LIZ;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            C47121t6 c47121t6 = this.LJLLILLLL;
                            if (c47121t6 != null) {
                                c47121t6.setText(C15380j0.LJIILJJIL(R.string.klb));
                            }
                            C47121t6 c47121t62 = this.LJLLJ;
                            if (c47121t62 != null) {
                                c47121t62.setText(C15380j0.LJIILJJIL(R.string.kl7));
                            }
                        }
                    } else {
                        C47121t6 c47121t63 = this.LJLLILLLL;
                        if (c47121t63 != null) {
                            c47121t63.setText(C15380j0.LJIILJJIL(R.string.kll));
                        }
                        C47121t6 c47121t64 = this.LJLLJ;
                        if (c47121t64 != null) {
                            c47121t64.setText(C15380j0.LJIILJJIL(R.string.klk));
                        }
                    }
                } else {
                    C47121t6 c47121t65 = this.LJLLILLLL;
                    if (c47121t65 != null) {
                        c47121t65.setText(C15380j0.LJIILJJIL(R.string.kl6));
                    }
                    C47121t6 c47121t66 = this.LJLLJ;
                    if (c47121t66 != null) {
                        c47121t66.setText(C15380j0.LJIILJJIL(R.string.kl5));
                    }
                }
                Vl();
                Xl(this);
                return;
            }
            o.LJIJI("applyInfoViewContainer");
            throw null;
        }
        ConstraintLayout constraintLayout2 = this.LLILLIZIL;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(0);
            int i2 = C75027TcV.LIZ;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C47121t6 c47121t67 = this.LJLLILLLL;
                        if (c47121t67 != null) {
                            c47121t67.setText(C15380j0.LJIILJJIL(R.string.klb));
                        }
                        C47121t6 c47121t68 = this.LJLLJ;
                        if (c47121t68 != null) {
                            c47121t68.setText(C15380j0.LJIILJJIL(R.string.kl7));
                        }
                        Vl();
                    }
                } else {
                    C47121t6 c47121t69 = this.LJLLILLLL;
                    if (c47121t69 != null) {
                        c47121t69.setText(C15380j0.LJIILJJIL(R.string.lud));
                    }
                }
            } else {
                C47121t6 c47121t610 = this.LJLLILLLL;
                if (c47121t610 != null) {
                    c47121t610.setText(C15380j0.LJIILJJIL(R.string.lue));
                }
            }
            Xl(this);
            return;
        }
        o.LJIJI("applyInfoViewContainer");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Zl() {
        Integer num;
        TWR twr;
        TXF txf = this.LLFII;
        boolean z = false;
        if (txf != TXF.SEND_RESERVATION && txf != TXF.RESERVING && !C75027TcV.LIZ() && LinkMicApplyLayoutOptSetting.INSTANCE.getValue() == 2 && (((num = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num.intValue() != 1) && ((twr = this.LLIFFJFJJ) == null || twr.LIZJ != 2))) {
            z = true;
        }
        this.LJLJI = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void cm() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        C2A7 c2a7 = this.LJLJLLL;
        if (c2a7 != null) {
            c2a7.LJL();
        }
        C2A7 c2a72 = this.LJLJLLL;
        if (c2a72 != null) {
            c2a72.setClickable(true);
        }
        C74740TUy.LIZLLL();
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            Rl();
            TXF txf = this.LLFII;
            if (txf == null) {
                i = -1;
            } else {
                i = TXG.LIZ[txf.ordinal()];
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (C75027TcV.LIZ()) {
                            C2A7 c2a73 = this.LJLJLLL;
                            if (c2a73 == null) {
                                return;
                            }
                            c2a73.setText(C15380j0.LJIILJJIL(R.string.khp));
                            c2a73.LJJLL(R.style.a3a);
                            C87277YNd.LJJIJ(c2a73);
                            return;
                        }
                        C2A7 c2a74 = this.LJLJLLL;
                        if (c2a74 != null) {
                            c2a74.LJJLL(R.style.a2z);
                            c2a74.setText(C15380j0.LJIILJJIL(R.string.nxv));
                            C87277YNd.LJJIJ(c2a74);
                        }
                        C47121t6 c47121t6 = this.LJLL;
                        if (c47121t6 != null) {
                            c47121t6.setVisibility(0);
                        }
                        em();
                        return;
                    }
                    C2A7 c2a75 = this.LJLJLLL;
                    if (c2a75 == null) {
                        return;
                    }
                    c2a75.setText(C15380j0.LJIILJJIL(R.string.khp));
                    c2a75.LJJLL(R.style.a3a);
                    C87277YNd.LJJIJ(c2a75);
                    return;
                }
                C2A7 c2a76 = this.LJLJLLL;
                if (c2a76 == null) {
                    return;
                }
                c2a76.setText(C15380j0.LJIILJJIL(R.string.klh));
                c2a76.LJJLL(R.style.a2z);
                C87277YNd.LJJIJ(c2a76);
                return;
            }
            C2A7 c2a77 = this.LJLJLLL;
            if (c2a77 == null) {
                return;
            }
            c2a77.setText(C15380j0.LJIILJJIL(R.string.soa));
            c2a77.LJJLL(R.style.a2z);
            return;
        }
        if (num.intValue() == 2) {
            Rl();
            C2A7 c2a78 = this.LJLJLLL;
            if (c2a78 != null) {
                C87277YNd.LJJIJ(c2a78);
            }
            C2A7 c2a79 = this.LJLJLLL;
            if (c2a79 != null) {
                c2a79.LJJLL(R.style.a3a);
            }
            C2A7 c2a710 = this.LJLJLLL;
            if (c2a710 != null) {
                c2a710.setText(C15380j0.LJIILJJIL(R.string.kuw));
            }
            C2A7 c2a711 = this.LJLJLLL;
            ViewGroup.LayoutParams layoutParams = null;
            if (c2a711 != null) {
                layoutParams = c2a711.getLayoutParams();
            }
            if (!(layoutParams instanceof C018905p) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.bottomMargin = 28;
            C2A7 c2a712 = this.LJLJLLL;
            if (c2a712 != null) {
                c2a712.setLayoutParams(marginLayoutParams);
            }
            C47121t6 c47121t62 = this.LJLL;
            if (c47121t62 == null) {
                return;
            }
            c47121t62.setVisibility(8);
            return;
        }
        if (num.intValue() != 1) {
            return;
        }
        dm();
    }

    public final void i0() {
        DialogC77438UaI dialogC77438UaI;
        DialogC77438UaI dialogC77438UaI2 = this.LLIZLLLIL;
        if (dialogC77438UaI2 != null && dialogC77438UaI2.isShowing() && (dialogC77438UaI = this.LLIZLLLIL) != null) {
            dialogC77438UaI.dismiss();
        }
        C77437UaH c77437UaH = new C77437UaH(getContext());
        c77437UaH.LJI(R.string.oxw);
        c77437UaH.LIZIZ(R.string.oxx);
        c77437UaH.LJ(R.string.oxv, new IDCListenerS164S0100000_13(this, 0), false);
        c77437UaH.LIZJ(R.string.noo, DialogInterfaceOnClickListenerC74936Tb2.LJLIL, false);
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        this.LLIZLLLIL = LIZ;
        LIZ.setCanceledOnTouchOutside(false);
        DialogC77438UaI dialogC77438UaI3 = this.LLIZLLLIL;
        if (dialogC77438UaI3 != null) {
            C78866UxK.LJIJI(dialogC77438UaI3, 5, true, false, false, LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
        DialogC77438UaI dialogC77438UaI4 = this.LLIZLLLIL;
        if (dialogC77438UaI4 != null) {
            wl(dialogC77438UaI4);
        }
        Nl(0L, "show", false);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final boolean onBackPressed() {
        LiveDialogFragment liveDialogFragment = this.LJLJJLL;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismissAllowingStateLoss();
            return true;
        }
        return true;
    }

    @Override // X.TQ7
    public final void onCancelSuccess() {
        if (LinkMicApplyLayoutOptSetting.INSTANCE.getValue() != 2) {
            Al();
        }
    }

    public final void vl() {
        Room room;
        AbstractC74908Taa abstractC74908Taa = this.LLFZ;
        if (abstractC74908Taa != null) {
            Context context = getContext();
            DataChannel dataChannel = this.LLFFF;
            if (dataChannel != null) {
                room = (Room) dataChannel.kv0(RoomChannel.class);
            } else {
                room = null;
            }
            C73318Sq2 LJ = abstractC74908Taa.LJ();
            o.LJIIIIZZ(LJ, "it.compositeDisposable");
            C75078TdK.LIZIZ(context, room, LJ, new C74909Tab(this));
            Nl(C75027TcV.LIZLLL, "show", true);
        }
    }

    public final void xl() {
        TQ8 tq8;
        Room room;
        DialogC77438UaI dialogC77438UaI;
        TQM tqm;
        AbstractC74727TUl LIZ;
        LinkListUser LJJIL;
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        User user = null;
        if (obj instanceof TQ8) {
            tq8 = (TQ8) obj;
        } else {
            tq8 = null;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (tq8 != null && (LIZ = tq8.LIZ()) != null && (LJJIL = C76917UGr.LJJIL(LIZ, currentUserId)) != null) {
            C74824TYe.LIZ.LJIJI(currentUserId, "guest", "go_live_panel", Hl().LJJJJI, LJJIL.linkMicId);
        }
        if (C19N.LIZLLL()) {
            this.LLILZ = "disconnect_icon";
            WeakReference<TQM> weakReference = this.LLI;
            if (weakReference != null && (tqm = weakReference.get()) != null) {
                tqm.exitInteractWithConfirm("go_live_panel", "leave_normally", 10002);
                return;
            }
            return;
        }
        DialogC77438UaI dialogC77438UaI2 = this.LLIZLLLIL;
        if (dialogC77438UaI2 != null && dialogC77438UaI2.isShowing() && (dialogC77438UaI = this.LLIZLLLIL) != null) {
            dialogC77438UaI.dismiss();
        }
        String str = EnumC74950TbG.PANEL.value;
        o.LJIIIIZZ(str, "PANEL.value");
        JSONObject LIZLLL = FT5.LIZLLL("type", str);
        C74736TUu c74736TUu = C74736TUu.LIZ;
        c74736TUu.LJIL(0, "leave_click", LIZLLL, false);
        DataChannel dataChannel = this.LLFFF;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            user = room.getOwner();
        }
        String LIZ2 = C05170If.LIZ(user);
        if (LIZ2 == null) {
            LIZ2 = "";
        }
        String LJIILL = C15380j0.LJIILL(R.string.kv7, LIZ2);
        C77437UaH c77437UaH = new C77437UaH(getContext());
        c77437UaH.LIZJ = LJIILL;
        c77437UaH.LIZIZ(R.string.m7x);
        c77437UaH.LJ(R.string.now, new IDCListenerS164S0100000_13(this, 1), false);
        c77437UaH.LIZJ(R.string.np2, DialogInterfaceOnClickListenerC74823TYd.LJLIL, false);
        this.LLIZLLLIL = c77437UaH.LIZ();
        c74736TUu.LJIL(0, "leave_popup_show", new JSONObject(), false);
        DialogC77438UaI dialogC77438UaI3 = this.LLIZLLLIL;
        if (dialogC77438UaI3 != null) {
            C78866UxK.LJIJI(dialogC77438UaI3, 5, true, false, false, LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
        DialogC77438UaI dialogC77438UaI4 = this.LLIZLLLIL;
        if (dialogC77438UaI4 == null) {
            return;
        }
        wl(dialogC77438UaI4);
    }

    public final int Gl() {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = Hl().LJIIJ;
        if (multiLiveAnchorPanelSettings != null) {
            return multiLiveAnchorPanelSettings.applierSortSetting;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) != null) {
            return (int) multiLiveUserApplyPermission.applierSortSetting;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Jl() {
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initApplyState useFakeStateFirstTime:");
        C19U.LIZJ(LIZ, this.LJLJI, LIZ, "MultiGuestUserInfoFragment");
        if (this.LJLJI) {
            dm();
            Yl();
        } else {
            cm();
            if (num != null) {
                if (num.intValue() == 1) {
                    Yl();
                } else if (num.intValue() == 0 || num.intValue() == -1) {
                    Wl();
                }
            }
        }
        C74740TUy.LIZLLL().LIZ(this);
    }

    public final boolean Kl() {
        if (!Ll() && C75027TcV.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.TY2
    public final void LLLLIL() {
        DataChannel dataChannel;
        DeepLinkEnterMultiLiveRoomDataHandler LIZ;
        boolean z;
        B7S.LIZIZ(R.string.lu6);
        C74983Tbn LIZ2 = C29556Biq.LIZ();
        TWR twr = this.LLIFFJFJJ;
        LIZ2.getClass();
        if (!C74983Tbn.LJIIL(twr) && (LIZ = C74752TVk.LIZ()) != null) {
            if (LIZ.LIZLLL == 2) {
                z = true;
            } else {
                z = false;
            }
            LIZ.LIZLLL = -1;
            if (!z) {
                Al();
            }
        }
        Hl().LIZ = System.currentTimeMillis();
        DataChannel dataChannel2 = this.LLFFF;
        if (dataChannel2 != null) {
            dataChannel2.qv0(LinkInRoomGuestApplySucceedEvent.class, "");
        }
        cm();
        Yl();
        Integer LIZIZ = U4C.LIZIZ("multi_guest_gifter_priority");
        if (LIZIZ != null && LIZIZ.intValue() == 1 && !TV3.LJIIJ() && !Ll() && !Kl() && !TV3.LJIIJ() && Gl() == 1 && (dataChannel = this.LLFFF) != null) {
            dataChannel.pv0(AutoOpenGuestApplyDialogEvent.class);
        }
    }

    public final void Rl() {
        if (Ll()) {
            return;
        }
        ImageView imageView = this.LLII;
        if (imageView != null) {
            imageView.setBackgroundResource(R.drawable.d1m);
        }
        ImageView imageView2 = this.LLII;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Sl() {
        Integer num;
        int i;
        Long l;
        if (!TUZ.LIZIZ() || (num = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num.intValue() != 1) {
            return;
        }
        C47121t6 c47121t6 = this.LJLLJ;
        if (c47121t6 != null) {
            C87277YNd.LJJIIZ(c47121t6);
        }
        long LIZJ = TYJ.LIZJ(Hl());
        if (LIZJ <= 0) {
            return;
        }
        String LJII = C15380j0.LJII(R.plurals.nq, (int) LIZJ);
        o.LJIIIIZZ(LJII, "getQuantityString(\n     …(),\n                    )");
        String LIZIZ = Q8U.LIZIZ(new Object[]{Long.valueOf(LIZJ)}, 1, LJII, "format(format, *args)");
        DataChannel dataChannel = this.LLFFF;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(MultiGuestGuestSelfSendGiftData.class)) != null) {
            i = (int) l.longValue();
        } else {
            i = 0;
        }
        C47121t6 c47121t62 = this.LJLL;
        if (c47121t62 != null) {
            String LJII2 = C15380j0.LJII(R.plurals.no, i);
            o.LJIIIIZZ(LJII2, "getQuantityString(\n     …ft,\n                    )");
            String LLLZ = C16880lQ.LLLZ(LJII2, Arrays.copyOf(new Object[]{Integer.valueOf(i), LIZIZ}, 2));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c47121t62.setText(LLLZ);
        }
        C47121t6 c47121t63 = this.LJLL;
        if (c47121t63 == null) {
            return;
        }
        c47121t63.setTextSize(15.0f);
    }

    public final void Yl() {
        if (Ml()) {
            U15 u15 = this.LLILL;
            if (u15 != null) {
                u15.LIZJ(false);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout = this.LLILLIZIL;
        Boolean bool = null;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
            RecyclerView recyclerView = this.LJLJL;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            C47121t6 c47121t6 = this.LJLLILLLL;
            if (c47121t6 != null) {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.lud));
            }
            U15 u152 = this.LLILIL;
            if (u152 != null) {
                TWR twr = this.LLIFFJFJJ;
                if (twr != null) {
                    bool = Boolean.valueOf(twr.LJFF);
                }
                u152.LIZJ(C29306Beo.LJJIFFI(bool));
                return;
            }
            o.LJIJI("applyInfoView");
            throw null;
        }
        o.LJIJI("applyInfoViewContainer");
        throw null;
    }

    @Override // X.TY2
    public final void a() {
        B7S.LIZIZ(R.string.klm);
        C75027TcV.LIZIZ(2);
        Hl().LIZIZ = System.currentTimeMillis();
        this.LLFII = TXF.RESERVING;
        TWR twr = this.LLIFFJFJJ;
        if (twr != null && twr.LIZJ == 1) {
            DataChannel dataChannel = this.LLFFF;
            if (dataChannel != null) {
                dataChannel.pv0(LinkInRoomGuestReserveSucceedEvent.class);
                return;
            }
            return;
        }
        LiveDialogFragment liveDialogFragment = this.LJLJJLL;
        if (liveDialogFragment == null) {
            return;
        }
        liveDialogFragment.dismiss();
    }

    public final void dm() {
        if (Ml()) {
            C47121t6 c47121t6 = this.LJLL;
            if (c47121t6 != null) {
                c47121t6.setVisibility(8);
            }
        } else {
            C2A7 c2a7 = this.LJLJLLL;
            if (c2a7 != null) {
                c2a7.LJJLL(R.style.a3b);
            }
            C2A7 c2a72 = this.LJLJLLL;
            if (c2a72 != null) {
                c2a72.setText(C15380j0.LJIILJJIL(R.string.jun));
            }
            C47121t6 c47121t62 = this.LJLL;
            if (c47121t62 != null) {
                c47121t62.setVisibility(0);
            }
            em();
            C2A7 c2a73 = this.LJLJLLL;
            if (c2a73 != null) {
                C87277YNd.LJJIJ(c2a73);
            }
        }
        Rl();
    }

    public final void em() {
        C018905p c018905p;
        if (Ll()) {
            if (MultiGuestRevenueAreaBackUpSetting.INSTANCE.isShieldUs()) {
                C47121t6 c47121t6 = this.LJLL;
                if (c47121t6 != null) {
                    c47121t6.setText(C15380j0.LJIILJJIL(R.string.kli));
                }
            } else {
                C47121t6 c47121t62 = this.LJLL;
                if (c47121t62 != null) {
                    c47121t62.setText(C15380j0.LJIILJJIL(R.string.klj));
                }
            }
        } else {
            if (MultiGuestRevenueAreaBackUpSetting.INSTANCE.isShieldUs()) {
                C47121t6 c47121t63 = this.LJLL;
                if (c47121t63 != null) {
                    c47121t63.setText(C15380j0.LJIILJJIL(R.string.nxs));
                }
            } else {
                C47121t6 c47121t64 = this.LJLL;
                if (c47121t64 != null) {
                    c47121t64.setText(C15380j0.LJIILJJIL(R.string.nce));
                }
            }
            Sl();
        }
        ConstraintLayout constraintLayout = this.LLILLIZIL;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (!(layoutParams instanceof C018905p) || (c018905p = (C018905p) layoutParams) == null) {
                return;
            }
            c018905p.bottomToTop = R.id.e04;
            C47121t6 c47121t65 = this.LJLLJ;
            if (c47121t65 != null) {
                C29306Beo.LJJJJJL(C15380j0.LIZ(16.0f), c47121t65);
                return;
            }
            return;
        }
        o.LJIJI("applyInfoViewContainer");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        TQM tqm;
        DialogC77438UaI dialogC77438UaI;
        Integer num;
        super.onDestroy();
        if (MultiGuestMultiTypeAdapterFix.INSTANCE.isFix()) {
            C73129Smz c73129Smz = this.LJLJLJ;
            C73411SrX c73411SrX = c73129Smz.LJLJJI;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            c73129Smz.LJLJJI = null;
        }
        TWR twr = this.LLIFFJFJJ;
        if (twr != null && twr.LIZJ == 2 && ((num = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num.intValue() != 1)) {
            C75017TcL.LJIILJJIL("in_liveroom");
        }
        DialogC77438UaI dialogC77438UaI2 = this.LLIZLLLIL;
        if (dialogC77438UaI2 != null && dialogC77438UaI2.isShowing() && (dialogC77438UaI = this.LLIZLLLIL) != null) {
            dialogC77438UaI.dismiss();
        }
        WeakReference<TQM> weakReference = this.LLI;
        if (weakReference != null && (tqm = weakReference.get()) != null) {
            tqm.setDialogView(null);
        }
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C74740TUy.LIZLLL().LIZJ(this);
            AbstractC74908Taa abstractC74908Taa = this.LLFZ;
            if (abstractC74908Taa != null) {
                abstractC74908Taa.LIZJ();
            }
        }
        AbstractC74908Taa abstractC74908Taa2 = this.LLFZ;
        if (abstractC74908Taa2 != null) {
            abstractC74908Taa2.LIZJ();
        }
        C88207Yjb.LJIJI("multi_guest_apply_page");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLIIIZ.clear();
        this.LLIIJI.clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!InterfaceC30442Bx8.LLLZZIL.LIZJ().booleanValue() && !C30784C6i.LIZJ()) {
            C1YG c1yg = new C1YG(this.LLII);
            c1yg.LIZLLL = 80;
            c1yg.LJI = 5000L;
            c1yg.LJII = true;
            c1yg.LJIIL = C74347TFv.LJLIL;
            c1yg.LIZ(R.string.kyj);
            C30770C5u.LIZLLL(new C1YH(c1yg), C09.ANCHOR_PREVIEW);
        }
        TXF txf = this.LLFII;
        if (txf != TXF.SEND_RESERVATION && txf != TXF.RESERVING) {
            Dl();
        }
    }

    @Override // X.TQ7
    public final void LLJL() {
        Al();
    }

    @Override // X.TY2
    public final LiveDialogFragment getDialog() {
        return this.LJLJJLL;
    }

    public static final void Xl(MultiGuestUserInfoFragment multiGuestUserInfoFragment) {
        Boolean bool = null;
        if (C75027TcV.LIZ == 2) {
            U15 u15 = multiGuestUserInfoFragment.LLILIL;
            if (u15 != null) {
                TWR twr = multiGuestUserInfoFragment.LLIFFJFJJ;
                if (twr != null) {
                    bool = Boolean.valueOf(twr.LJFF);
                }
                u15.LIZJ(C29306Beo.LJJIFFI(bool));
                return;
            }
            o.LJIJI("applyInfoView");
            throw null;
        }
        U15 u152 = multiGuestUserInfoFragment.LLILIL;
        if (u152 != null) {
            u152.LIZIZ();
        } else {
            o.LJIJI("applyInfoView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Il(Context context) {
        AbstractC74908Taa abstractC74908Taa;
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        C75023TcR.LIZLLL.LIZJ("key_handleConnect");
        TXF txf = this.LLFII;
        if (txf == null) {
            return;
        }
        int i = TXG.LIZ[txf.ordinal()];
        if (i != 1) {
            if (i != 3) {
                return;
            }
            Ql(false);
        } else {
            if (num == null || num.intValue() != 0 || (abstractC74908Taa = this.LLFZ) == null || abstractC74908Taa.LJIIIIZZ()) {
                return;
            }
            Pl(this, context, 0, 4);
        }
    }

    @Override // X.TQ7
    public final void LLJJIII(Throwable th) {
        BPP.LIZLLL(getContext(), th, R.string.sud);
    }

    @Override // X.TY2
    public final void LLLLLLLZIL(Throwable th) {
        BPP.LIZLLL(getContext(), th, R.string.stz);
        cm();
        Wl();
    }

    @Override // X.TY2
    public final void LLLLZLLLI(Throwable th) {
        DataChannel dataChannel = this.LLFFF;
        if (dataChannel != null) {
            dataChannel.qv0(LinkInRoomGuestReplyFailedEvent.class, "");
        }
        BPP.LIZJ(C15380j0.LIZLLL(), th);
        Al();
    }

    public final void Ql(boolean z) {
        AbstractC74908Taa abstractC74908Taa;
        boolean z2;
        C74983Tbn LIZ = C29556Biq.LIZ();
        TWR twr = this.LLIFFJFJJ;
        LIZ.getClass();
        if (C74983Tbn.LJIIL(twr) && !z) {
            this.LL = new C29213BdJ();
            Activity LJIILJJIL = g0.LJIILJJIL(getContext());
            if (LJIILJJIL == null) {
                LJIILJJIL = C8E.LIZ().getTopActivity();
            }
            this.LLFF = new C29215BdL(LJIILJJIL, this.LLFFF, new AqS179S0100000_13(this, 193), new AqS163S0100000_13(this, 111), 0, 32);
        }
        C29215BdL c29215BdL = this.LLFF;
        if (c29215BdL == null) {
            return;
        }
        C29213BdJ c29213BdJ = this.LL;
        boolean z3 = false;
        if ((c29213BdJ != null && c29213BdJ.LIZ(c29215BdL)) || ((InterfaceC74869TZx) this.LLD.getValue()).LIZ(c29215BdL) || (abstractC74908Taa = this.LLFZ) == null) {
            return;
        }
        TWR twr2 = this.LLIFFJFJJ;
        if (twr2 != null && twr2.LIZJ == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c29215BdL.LJFF == 101) {
            z3 = true;
        }
        abstractC74908Taa.LJIIJJI(z2, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Tl(int i) {
        C47121t6 c47121t6;
        String LJIILJJIL;
        Integer num;
        if (i == this.LJLJJL) {
            return;
        }
        if (i > 0 || (num = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num.intValue() != 1) {
            if (Kl()) {
                i++;
            }
        } else {
            i = 1;
        }
        this.LJLJJL = i;
        if ((!Ll() || Kl()) && (c47121t6 = this.LJLLJ) != null) {
            int i2 = this.LJLJJL;
            if (i2 != 0) {
                if (i2 != 1) {
                    LJIILJJIL = C15380j0.LJIIIIZZ(R.plurals.m5, 2, Integer.valueOf(i2));
                } else {
                    LJIILJJIL = C15380j0.LJIIIIZZ(R.plurals.m5, 1, 1);
                }
            } else {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.lub);
            }
            c47121t6.setText(LJIILJJIL);
        }
        Vl();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().LIZ(this, new C74922Tao(this));
    }

    @Override // X.InterfaceC28471BFj
    public final void onChanged(Integer num) {
        Integer num2 = num;
        if (this.LJLJI) {
            this.LJLJI = false;
            return;
        }
        if (num2 != null) {
            if (num2.intValue() == 1) {
                Yl();
            } else if (num2.intValue() == 0) {
                if (this.LJZ) {
                    LiveDialogFragment liveDialogFragment = this.LJLJJLL;
                    if (liveDialogFragment != null) {
                        liveDialogFragment.dismiss();
                    }
                } else {
                    Wl();
                }
            }
        }
        cm();
    }

    @Override // X.TY2
    public final void sc(Throwable th) {
        cm();
        Wl();
        DataChannel dataChannel = this.LLFFF;
        if (dataChannel != null) {
            dataChannel.qv0(LinkInRoomGuestReserveFailedEvent.class, th);
        }
    }

    public final void Nl(long j, String str, boolean z) {
        String str2;
        EnumC74778TWk enumC74778TWk;
        long j2;
        Long l;
        long j3 = Hl().LIZ;
        if (z) {
            j3 = Hl().LIZIZ;
            str2 = "reservation";
        } else {
            str2 = "apply";
        }
        if (C19N.LIZLLL()) {
            enumC74778TWk = C59994Ngc.LIZJ();
        } else {
            enumC74778TWk = Hl().LJJIIZ;
        }
        long currentTimeMillis = System.currentTimeMillis() - j3;
        Integer valueOf = Integer.valueOf(this.LJLJJL);
        Integer valueOf2 = Integer.valueOf(C78886Uxe.LJJJJZI(C8E.LJ()));
        int Gl = Gl();
        int i = this.LLILII;
        MultiGuestDataHolder Hl = Hl();
        DataChannel dataChannel = this.LLFFF;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(MultiGuestGuestSelfSendGiftData.class)) != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        C75457TjR.LJIIZILJ(enumC74778TWk, str, currentTimeMillis, j, str2, valueOf, valueOf2, Gl, i, TYJ.LIZIZ(Hl, j2));
        if (o.LJ(str, "click")) {
            Hl().LIZ = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ol(Context context, int i, boolean z) {
        boolean z2;
        TWR twr;
        FragmentManager fragmentManager;
        LiveDialogFragment liveDialogFragment;
        C74983Tbn LIZ = C29556Biq.LIZ();
        TWR twr2 = this.LLIFFJFJJ;
        LIZ.getClass();
        if (C74983Tbn.LJIIL(twr2) && !z) {
            this.LL = new C29213BdJ();
            Activity LJIILJJIL = g0.LJIILJJIL(context);
            if (LJIILJJIL == null) {
                LJIILJJIL = C8E.LIZ().getTopActivity();
            }
            this.LLF = new C29215BdL(LJIILJJIL, this.LLFFF, new AqS140S0200000_9(this, context, 2), new AqS163S0100000_13(this, 110), i, 32);
        }
        C29213BdJ c29213BdJ = this.LL;
        if (c29213BdJ != null) {
            C29215BdL c29215BdL = this.LLF;
            if (c29215BdL != null) {
                if (c29213BdJ.LIZ(c29215BdL)) {
                    return;
                }
            } else {
                o.LJIJI("checkParam");
                throw null;
            }
        }
        InterfaceC74869TZx interfaceC74869TZx = (InterfaceC74869TZx) this.LLD.getValue();
        C29215BdL c29215BdL2 = this.LLF;
        if (c29215BdL2 != null) {
            if (interfaceC74869TZx.LIZ(c29215BdL2)) {
                return;
            }
            C75023TcR.LIZLLL.LIZJ("key_afterAgeAndFansCheck");
            TWR twr3 = this.LLIFFJFJJ;
            if (twr3 != null && twr3.LIZJ == 1) {
                T t = C74740TUy.LIZLLL().LIZIZ;
                o.LJIIIIZZ(t, "inst().data");
                if (((Number) t).intValue() < 1 && (fragmentManager = getFragmentManager()) != null && (liveDialogFragment = this.LJLJJLL) != null) {
                    liveDialogFragment.show(fragmentManager, "MultiLiveGuestUserInfoDialog");
                }
            }
            C29215BdL c29215BdL3 = this.LLF;
            if (c29215BdL3 != null) {
                c29215BdL3.LJ = i;
                C74736TUu.LIZ.LJIL(0, "apply_click", new JSONObject(), false);
                MultiGuestDataHolder Hl = Hl();
                AbstractC74908Taa abstractC74908Taa = this.LLFZ;
                if (abstractC74908Taa != null && abstractC74908Taa.LJII() == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Hl.LJ = !z2;
                AbstractC74908Taa abstractC74908Taa2 = this.LLFZ;
                if (abstractC74908Taa2 != null) {
                    abstractC74908Taa2.LJIILLIIL(C74740TUy.LIZLLL().LJIIJJI);
                }
                TWR twr4 = this.LLIFFJFJJ;
                if (twr4 == null) {
                    this.LLIFFJFJJ = new TWR(null, 0, 0, i, 47);
                } else {
                    twr4.LJ = i;
                }
                C29215BdL c29215BdL4 = this.LLF;
                if (c29215BdL4 != null) {
                    if (c29215BdL4.LJFF == 101 && (twr = this.LLIFFJFJJ) != null) {
                        twr.LIZLLL = true;
                    }
                    AbstractC74908Taa abstractC74908Taa3 = this.LLFZ;
                    if (abstractC74908Taa3 != null) {
                        abstractC74908Taa3.LIZLLL(this.LLIFFJFJJ);
                        return;
                    }
                    return;
                }
                o.LJIJI("checkParam");
                throw null;
            }
            o.LJIJI("checkParam");
            throw null;
        }
        o.LJIJI("checkParam");
        throw null;
    }

    public final void fm(long j, List list, List list2) {
        int i;
        boolean z;
        long intValue;
        if (list != null) {
            i = list.size();
        } else if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        Tl(i);
        if (this.LJLJI && this.LJLJJL == 0) {
            Tl(1);
        }
        this.LJLJI = false;
        if (Ml()) {
            CVT cvt = this.LLIL;
            if (cvt != null) {
                C87277YNd.LJJIIZ(cvt);
            }
            C73129Smz c73129Smz = this.LJLJLJ;
            CJ2 cj2 = new CJ2();
            cj2.add(new C53607L2d());
            ArrayList arrayList = new ArrayList();
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            OSZ LJ = C29306Beo.LJ(TUO.LJLIL, arrayList);
            if (LJ.getFirst() == null) {
                ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser = new ListByTypeResponse.GiftScoreAppliedUser();
                LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
                linkPlayerInfo.mUser = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
                giftScoreAppliedUser.listUser = linkPlayerInfo;
                giftScoreAppliedUser.giftScore = j;
                OSZ LJ2 = C29306Beo.LJ(new AqS20S0000100_13(j, 5), arrayList);
                if (LJ2.getFirst() == null) {
                    arrayList.add(giftScoreAppliedUser);
                    intValue = 0;
                } else {
                    intValue = ((Number) LJ2.getSecond()).intValue();
                    ListProtector.add(arrayList, ((Number) LJ2.getSecond()).intValue(), giftScoreAppliedUser);
                }
                LJ = new OSZ(giftScoreAppliedUser, Integer.valueOf((int) intValue));
            }
            ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser2 = (ListByTypeResponse.GiftScoreAppliedUser) LJ.getFirst();
            if (giftScoreAppliedUser2 == null) {
                return;
            }
            int intValue2 = ((Number) LJ.getSecond()).intValue() + 1;
            cj2.add(new C75181Tez(((Number) LJ.getSecond()).intValue() + 1, giftScoreAppliedUser2, true, false, Integer.valueOf(intValue2), 8));
            this.LLILII = intValue2;
            ((HashMap) this.LLIZ.getValue()).clear();
            if (arrayList.size() > 1) {
                int intValue3 = ((Number) LJ.getSecond()).intValue();
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser3 = (ListByTypeResponse.GiftScoreAppliedUser) next;
                        if (i3 == arrayList.size()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        i2 = i3;
                        cj2.add(new C75181Tez(i3, giftScoreAppliedUser3, false, z, Integer.valueOf(intValue3 + 1), 4));
                        ((HashMap) this.LLIZ.getValue()).put(Integer.valueOf(i3), Long.valueOf(giftScoreAppliedUser3.giftScore));
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            c73129Smz.LJZ(cj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x057a  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public static /* synthetic */ void Pl(MultiGuestUserInfoFragment multiGuestUserInfoFragment, Context context, int i, int i2) {
        if ((i2 & 1) != 0) {
            context = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        multiGuestUserInfoFragment.Ol(context, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r3 != null) goto L69;
     */
    @Override // X.InterfaceC74941Tb7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e6(long r12, java.util.List r14, java.util.List r15, java.util.List r16) {
        /*
            r11 = this;
            if (r14 == 0) goto L16
            java.util.Iterator r2 = r14.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r1 = r2.next()
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r1 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r1
            r0 = 2
            r1.LIZ = r0
            goto L6
        L16:
            r6 = 1
            if (r15 == 0) goto L2c
            java.util.Iterator r1 = r15.iterator()
        L1d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r0
            r0.LIZ = r6
            goto L1d
        L2c:
            r0 = r16
            r11.fm(r12, r15, r0)
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r9 = r0.getCurrentUserId()
            if (r14 == 0) goto L83
            int r0 = r14.size()
        L45:
            int r8 = r0 + (-1)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r11.LLFFF
            if (r1 == 0) goto L80
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r7 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r7
            if (r7 == 0) goto L80
            r5 = 0
            if (r15 == 0) goto L81
            java.util.Iterator r4 = r15.iterator()
        L5c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.mUser
            long r1 = r0.getId()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L5c
            if (r3 == 0) goto L81
        L75:
            if (r15 == 0) goto L7b
            int r5 = r15.size()
        L7b:
            int r0 = r7.liveRoomMode
            X.C74824TYe.LJJZ(r5, r8, r6, r0)
        L80:
            return
        L81:
            r6 = 0
            goto L75
        L83:
            r0 = 1
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment.e6(long, java.util.List, java.util.List, java.util.List):void");
    }
}
