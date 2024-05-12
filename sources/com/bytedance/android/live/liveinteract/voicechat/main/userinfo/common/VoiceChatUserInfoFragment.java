package com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common;

import X.AbstractC73638SvC;
import X.AbstractC74727TUl;
import X.AbstractC74908Taa;
import X.ActivityC45651qj;
import X.B7S;
import X.B83;
import X.BPP;
import X.C018905p;
import X.C03880Dg;
import X.C05170If;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C19N;
import X.C221108m2;
import X.C29044Baa;
import X.C29213BdJ;
import X.C29215BdL;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29556Biq;
import X.C29S;
import X.C2A7;
import X.C31012CFc;
import X.C31413CUn;
import X.C3C5;
import X.C44432HcC;
import X.C47121t6;
import X.C47261Igj;
import X.C59994Ngc;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C74736TUu;
import X.C74738TUw;
import X.C74740TUy;
import X.C74752TVk;
import X.C74824TYe;
import X.C74923Tap;
import X.C74939Tb5;
import X.C74983Tbn;
import X.C75017TcL;
import X.C75023TcR;
import X.C75457TjR;
import X.C75516TkO;
import X.C75559Tl5;
import X.C76800UCe;
import X.C76917UGr;
import X.C77437UaH;
import X.C78866UxK;
import X.C78886Uxe;
import X.C79004UzY;
import X.C87277YNd;
import X.C8E;
import X.C90903hW;
import X.CCJ;
import X.CJ2;
import X.DialogC77438UaI;
import X.DialogInterfaceOnClickListenerC74615TQd;
import X.DialogInterfaceOnClickListenerC74822TYc;
import X.EnumC74778TWk;
import X.EnumC74950TbG;
import X.FT5;
import X.InterfaceC28471BFj;
import X.InterfaceC29205BdB;
import X.InterfaceC74869TZx;
import X.InterfaceC74941Tb7;
import X.InterfaceC75558Tl4;
import X.TQ8;
import X.TQT;
import X.TQV;
import X.TQY;
import X.TTL;
import X.TWR;
import X.TXF;
import X.TXI;
import X.TY2;
import X.U15;
import Y.ACListenerS33S0100000_13;
import Y.ALAdapterS10S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.AfS5S0000100_13;
import Y.AfS65S0100000_13;
import Y.AfS8S0100100_13;
import Y.IDCListenerS164S0100000_13;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestApplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplyFailedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestLinkPlayerListChange;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkInGuestCountDownFinishChannel;
import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLinkInjectorOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkApplyButtonFrequenceControlOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRevenueAreaBackUpSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestPreviewBugSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class VoiceChatUserInfoFragment extends LiveBaseFragment implements InterfaceC74941Tb7, TY2, InterfaceC28471BFj<Integer> {
    public static final /* synthetic */ int LLII = 0;
    public LiveDialogFragment LJLJI;
    public RecyclerView LJLJJI;
    public C2A7 LJLJJLL;
    public C47121t6 LJLJL;
    public C47121t6 LJLJLJ;
    public C47121t6 LJLJLLL;
    public C29213BdJ LJLL;
    public C29215BdL LJLLILLLL;
    public DataChannel LJLLJ;
    public TXF LJLLL;
    public AbstractC74908Taa LJLLLL;
    public WeakReference<TQV> LJLLLLLL;
    public TWR LJLZ;
    public View LJZ;
    public View LJZI;
    public int LLD;
    public U15 LLF;
    public ConstraintLayout LLFF;
    public final TQ8 LLFZ;
    public DialogC77438UaI LLI;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();
    public int LJLILLLLZI = -1;
    public final C31413CUn LJLJJL = new C31413CUn();
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(C74939Tb5.LJLIL);
    public final CJ2 LJZL = new CJ2();
    public final CJ2 LL = new CJ2();
    public String LLFFF = "outside";
    public final int LLFII = 354;

    public static void vl(DialogC77438UaI dialogC77438UaI) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "8882849133697215344")).LIZ) {
            return;
        }
        dialogC77438UaI.show();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIFFJFJJ).clear();
    }

    @Override // X.TY2
    public final /* synthetic */ void a() {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.TY2
    public final /* synthetic */ void sc(Throwable th) {
    }

    public VoiceChatUserInfoFragment() {
        TQ8 tq8;
        if (LinkMicLinkInjectorOptSetting.INSTANCE.isOptLinkInjector()) {
            try {
                DataChannel dataChannel = this.LJLLJ;
                if (dataChannel != null) {
                    tq8 = (TQ8) C79004UzY.LJIL(dataChannel, TQ8.class);
                } else {
                    tq8 = null;
                }
                this.LLFZ = tq8;
                C75559Tl5.LIZIZ.LIZLLL(this);
            } catch (Throwable th) {
                C29556Biq.LIZ().LJIILL();
                C75559Tl5.LIZIZ.LIZLLL(this);
                C75516TkO.LIZ.LIZIZ(70001, "LinkInjector.inject error", th, null);
            }
        } else {
            C75559Tl5.LIZIZ.LIZLLL(this);
        }
        C0NB.LIZIZ("VoiceChatUserInfoFragment", "init useFakeStateFirstTime from init");
    }

    public final void Jl() {
        C2A7 c2a7 = this.LJLJJLL;
        if (c2a7 != null) {
            c2a7.setClickable(true);
        }
        ConstraintLayout constraintLayout = this.LLFF;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
            RecyclerView recyclerView = this.LJLJJI;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                U15 u15 = this.LLF;
                if (u15 != null) {
                    u15.LIZIZ();
                    return;
                } else {
                    o.LJIJI("applyInfoView");
                    throw null;
                }
            }
            o.LJIJI("listView");
            throw null;
        }
        o.LJIJI("applyInfoViewContainer");
        throw null;
    }

    public final void Kl() {
        ConstraintLayout constraintLayout = this.LLFF;
        Boolean bool = null;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
            RecyclerView recyclerView = this.LJLJJI;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                C47121t6 c47121t6 = this.LJLJLJ;
                if (c47121t6 != null) {
                    c47121t6.setText(C15380j0.LJIILJJIL(R.string.lud));
                }
                U15 u15 = this.LLF;
                if (u15 != null) {
                    TWR twr = this.LJLZ;
                    if (twr != null) {
                        bool = Boolean.valueOf(twr.LJFF);
                    }
                    u15.LIZJ(C29306Beo.LJJIFFI(bool));
                    return;
                }
                o.LJIJI("applyInfoView");
                throw null;
            }
            o.LJIJI("listView");
            throw null;
        }
        o.LJIJI("applyInfoViewContainer");
        throw null;
    }

    @Override // X.TY2
    public final void LLILIL() {
        TQ8 tq8 = this.LLFZ;
        if (tq8 != null) {
            tq8.LJIIIZ(C44432HcC.LJI(), "anchor_invite_guest");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ll() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C2A7 c2a7 = this.LJLJJLL;
        if (c2a7 != null) {
            c2a7.LJL();
        }
        C2A7 c2a72 = this.LJLJJLL;
        if (c2a72 != null) {
            c2a72.setClickable(true);
        }
        C74740TUy.LIZLLL();
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            if (this.LJLLL == TXF.GO_LIVE) {
                C2A7 c2a73 = this.LJLJJLL;
                if (c2a73 != null) {
                    c2a73.setText(C15380j0.LJIILJJIL(R.string.soa));
                }
                C2A7 c2a74 = this.LJLJJLL;
                if (c2a74 == null) {
                    return;
                }
                c2a74.LJJLL(R.style.a2z);
                return;
            }
            C2A7 c2a75 = this.LJLJJLL;
            if (c2a75 != null) {
                c2a75.LJJLL(R.style.a2z);
            }
            C2A7 c2a76 = this.LJLJJLL;
            if (c2a76 != null) {
                c2a76.setText(C15380j0.LJIILJJIL(R.string.nxv));
            }
            C47121t6 c47121t6 = this.LJLJL;
            if (c47121t6 != null) {
                c47121t6.setVisibility(0);
            }
            Ml();
            C2A7 c2a77 = this.LJLJJLL;
            if (c2a77 == null) {
                return;
            }
            C87277YNd.LJJIJ(c2a77);
            return;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 2) {
            C2A7 c2a78 = this.LJLJJLL;
            if (c2a78 != null) {
                C87277YNd.LJJIJ(c2a78);
            }
            C2A7 c2a79 = this.LJLJJLL;
            if (c2a79 != null) {
                c2a79.LJJLL(R.style.a3a);
            }
            C2A7 c2a710 = this.LJLJJLL;
            if (c2a710 != null) {
                c2a710.setText(C15380j0.LJIILJJIL(R.string.kuw));
            }
            C2A7 c2a711 = this.LJLJJLL;
            ViewGroup.LayoutParams layoutParams = null;
            if (c2a711 != null) {
                layoutParams = c2a711.getLayoutParams();
            }
            if (!(layoutParams instanceof C018905p) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.bottomMargin = 28;
            C2A7 c2a712 = this.LJLJJLL;
            if (c2a712 != null) {
                c2a712.setLayoutParams(marginLayoutParams);
            }
            C47121t6 c47121t62 = this.LJLJL;
            if (c47121t62 == null) {
                return;
            }
            c47121t62.setVisibility(8);
            return;
        }
        if (num.intValue() != 1) {
            return;
        }
        C2A7 c2a713 = this.LJLJJLL;
        if (c2a713 != null) {
            c2a713.LJJLL(R.style.a3a);
        }
        C2A7 c2a714 = this.LJLJJLL;
        if (c2a714 != null) {
            c2a714.setText(C15380j0.LJIILJJIL(R.string.jun));
        }
        C47121t6 c47121t63 = this.LJLJL;
        if (c47121t63 != null) {
            c47121t63.setVisibility(0);
        }
        Ml();
        C2A7 c2a715 = this.LJLJJLL;
        if (c2a715 == null) {
            return;
        }
        C87277YNd.LJJIJ(c2a715);
    }

    public final void Ml() {
        C018905p c018905p;
        if (MultiGuestRevenueAreaBackUpSetting.INSTANCE.isShieldUs()) {
            C47121t6 c47121t6 = this.LJLJL;
            if (c47121t6 != null) {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.nxs));
            }
        } else {
            C47121t6 c47121t62 = this.LJLJL;
            if (c47121t62 != null) {
                c47121t62.setText(C15380j0.LJIILJJIL(R.string.nce));
            }
        }
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView != null) {
            C29306Beo.LJJJJJL(C15380j0.LIZ(8.0f), recyclerView);
            ConstraintLayout constraintLayout = this.LLFF;
            if (constraintLayout != null) {
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (!(layoutParams instanceof C018905p) || (c018905p = (C018905p) layoutParams) == null) {
                    return;
                }
                c018905p.bottomToTop = R.id.e04;
                C47121t6 c47121t63 = this.LJLJLLL;
                if (c47121t63 != null) {
                    C29306Beo.LJJJJJL(C15380j0.LIZ(16.0f), c47121t63);
                    return;
                }
                return;
            }
            o.LJIJI("applyInfoViewContainer");
            throw null;
        }
        o.LJIJI("listView");
        throw null;
    }

    public final void i0() {
        DialogC77438UaI dialogC77438UaI;
        DialogC77438UaI dialogC77438UaI2 = this.LLI;
        if (dialogC77438UaI2 != null && dialogC77438UaI2.isShowing() && (dialogC77438UaI = this.LLI) != null) {
            dialogC77438UaI.dismiss();
        }
        C77437UaH c77437UaH = new C77437UaH(getContext());
        c77437UaH.LJI(R.string.oxw);
        c77437UaH.LIZIZ(R.string.oxx);
        c77437UaH.LJ(R.string.oxv, new IDCListenerS164S0100000_13(this, 2), false);
        c77437UaH.LIZJ(R.string.noo, DialogInterfaceOnClickListenerC74615TQd.LJLIL, false);
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        this.LLI = LIZ;
        LIZ.setCanceledOnTouchOutside(false);
        DialogC77438UaI dialogC77438UaI3 = this.LLI;
        if (dialogC77438UaI3 != null) {
            C78866UxK.LJIJI(dialogC77438UaI3, 5, true, false, false, LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
        DialogC77438UaI dialogC77438UaI4 = this.LLI;
        if (dialogC77438UaI4 != null) {
            vl(dialogC77438UaI4);
        }
        Dl(this, "show");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final boolean onBackPressed() {
        LiveDialogFragment liveDialogFragment = this.LJLJI;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismissAllowingStateLoss();
            return true;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        TQV tqv;
        long j;
        long j2;
        boolean z;
        AbstractC73638SvC listByType;
        InterfaceC29205BdB interfaceC29205BdB;
        AbstractC73638SvC listByType2;
        super.onResume();
        WeakReference<TQV> weakReference = this.LJLLLLLL;
        if (weakReference == null || (tqv = weakReference.get()) == null || tqv.mView == 0) {
            return;
        }
        try {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                j = room.getId();
                j2 = room.getOwnerUserId();
            } else {
                j = 0;
                j2 = 0;
            }
            if (j != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (j2 != 0) {
                    if (LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
                        long LIZIZ = C31012CFc.LIZIZ();
                        listByType2 = ((MultiLiveApi) TTL.LIZ(MultiLiveApi.class, "get().getService(MultiLiveApi::class.java)")).getListByType(j, j2, C78886Uxe.LJJJLIIL(C8E.LJ()), C47261Igj.LJJIJIIJI(1, 2).toString(), 0, 0, 5, 0);
                        interfaceC29205BdB = (InterfaceC29205BdB) listByType2.LJIILIIL(new AfS8S0100100_13(LIZIZ, tqv, 6)).LJIIJ(new AfS5S0000100_13(LIZIZ, 2)).LIZLLL(tqv.autoDisposeWithTransformer());
                    } else {
                        listByType = ((MultiLiveApi) TTL.LIZ(MultiLiveApi.class, "get().getService(MultiLiveApi::class.java)")).getListByType(j, j2, C78886Uxe.LJJJLIIL(C8E.LJ()), C47261Igj.LJJIJIIJI(1, 2).toString(), 0, 0, 5, 0);
                        interfaceC29205BdB = (InterfaceC29205BdB) listByType.LJIIJJI(new TQT(tqv)).LIZLLL(tqv.autoDisposeWithTransformer());
                    }
                    if (interfaceC29205BdB == null) {
                        return;
                    }
                    interfaceC29205BdB.LIZJ(new AfS65S0100000_13(this, 61), new AfS65S0100000_13(this, 62));
                    return;
                }
                "Check failed.".toString();
                throw new IllegalStateException("Check failed.");
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }

    public final MultiGuestDataHolder xl() {
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("dataHolder");
        throw null;
    }

    @Override // X.TY2
    public final void LLLLIL() {
        LiveDialogFragment liveDialogFragment;
        B7S.LIZIZ(R.string.lu6);
        TWR twr = this.LJLZ;
        if ((twr == null || (twr.LIZJ != 0 && twr.LIZJ != 1)) && (liveDialogFragment = this.LJLJI) != null) {
            liveDialogFragment.dismiss();
        }
        xl().LIZ = System.currentTimeMillis();
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            dataChannel.qv0(LinkInRoomGuestApplySucceedEvent.class, "");
        }
        Ll();
        Kl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        TQV tqv;
        DialogC77438UaI dialogC77438UaI;
        Integer num;
        super.onDestroy();
        TWR twr = this.LJLZ;
        if (twr != null && twr.LIZJ == 2 && ((num = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num.intValue() != 1)) {
            C75017TcL.LJIILJJIL("in_liveroom");
        }
        DialogC77438UaI dialogC77438UaI2 = this.LLI;
        if (dialogC77438UaI2 != null && dialogC77438UaI2.isShowing() && (dialogC77438UaI = this.LLI) != null) {
            dialogC77438UaI.dismiss();
        }
        WeakReference<TQV> weakReference = this.LJLLLLLL;
        if (weakReference != null && (tqv = weakReference.get()) != null) {
            tqv.LJLJJLL = null;
        }
        AbstractC74908Taa abstractC74908Taa = this.LJLLLL;
        if (abstractC74908Taa != null) {
            abstractC74908Taa.LIZJ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJZL.clear();
        this.LL.clear();
    }

    public final void wl() {
        User user;
        Room room;
        DialogC77438UaI dialogC77438UaI;
        TQV tqv;
        AbstractC74727TUl LIZ;
        LinkListUser LJJIL;
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        TQ8 tq8 = this.LLFZ;
        if (tq8 != null && (LIZ = tq8.LIZ()) != null && (LJJIL = C76917UGr.LJJIL(LIZ, currentUserId)) != null) {
            C74824TYe.LIZ.LJIJI(currentUserId, "guest", "go_live_panel", xl().LJJJJI, LJJIL.linkMicId);
        }
        if (C19N.LIZLLL()) {
            this.LLFFF = "disconnect_icon";
            WeakReference<TQV> weakReference = this.LJLLLLLL;
            if (weakReference != null && (tqv = weakReference.get()) != null) {
                C74738TUw.LIZ(10002, tqv.dataChannel, "go_live_panel", new TQY(tqv));
                return;
            }
            return;
        }
        DialogC77438UaI dialogC77438UaI2 = this.LLI;
        if (dialogC77438UaI2 != null && dialogC77438UaI2.isShowing() && (dialogC77438UaI = this.LLI) != null) {
            dialogC77438UaI.dismiss();
        }
        String str = EnumC74950TbG.PANEL.value;
        o.LJIIIIZZ(str, "PANEL.value");
        JSONObject LIZLLL = FT5.LIZLLL("type", str);
        C74736TUu c74736TUu = C74736TUu.LIZ;
        c74736TUu.LJIL(0, "leave_click", LIZLLL, false);
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        String LIZ2 = C05170If.LIZ(user);
        if (LIZ2 == null) {
            LIZ2 = "";
        }
        String LJIILL = C15380j0.LJIILL(R.string.kv7, LIZ2);
        C77437UaH c77437UaH = new C77437UaH(getContext());
        c77437UaH.LIZJ = LJIILL;
        c77437UaH.LIZIZ(R.string.m7x);
        c77437UaH.LJ(R.string.now, new IDCListenerS164S0100000_13(this, 3), false);
        c77437UaH.LIZJ(R.string.np2, DialogInterfaceOnClickListenerC74822TYc.LJLIL, false);
        this.LLI = c77437UaH.LIZ();
        c74736TUu.LJIL(0, "leave_popup_show", new JSONObject(), false);
        DialogC77438UaI dialogC77438UaI3 = this.LLI;
        if (dialogC77438UaI3 != null) {
            C78866UxK.LJIJI(dialogC77438UaI3, 5, true, false, false, LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
        DialogC77438UaI dialogC77438UaI4 = this.LLI;
        if (dialogC77438UaI4 == null) {
            return;
        }
        vl(dialogC77438UaI4);
    }

    @Override // X.TY2
    public final LiveDialogFragment getDialog() {
        return this.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Al(Context context) {
        AbstractC74908Taa abstractC74908Taa;
        C0NB.LIZIZ("VoiceChatUserInfoFragment", "handleConnect");
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        C75023TcR.LIZLLL.LIZJ("key_handleConnect");
        TXF txf = this.LJLLL;
        if (txf == null || TXI.LIZ[txf.ordinal()] != 1 || num == null || num.intValue() != 0 || (abstractC74908Taa = this.LJLLLL) == null || abstractC74908Taa.LJIIIIZZ()) {
            return;
        }
        Hl(this, context, 0, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Il(int i) {
        String LJIILJJIL;
        Integer num;
        if (i == this.LJLILLLLZI) {
            return;
        }
        if (i <= 0 && (num = (Integer) C74740TUy.LIZLLL().LIZIZ) != null && num.intValue() == 1) {
            i = 1;
        }
        this.LJLILLLLZI = i;
        C47121t6 c47121t6 = this.LJLJLLL;
        if (c47121t6 != null) {
            if (i != 0) {
                if (i != 1) {
                    LJIILJJIL = C15380j0.LJIIIIZZ(R.plurals.m5, 2, Integer.valueOf(i));
                } else {
                    LJIILJJIL = C15380j0.LJIIIIZZ(R.plurals.m5, 1, 1);
                }
            } else {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.lub);
            }
            c47121t6.setText(LJIILJJIL);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJLLL, (Property<C47121t6, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.addListener(new ALAdapterS10S0200000_13(ofFloat, this, 15));
        ofFloat.start();
    }

    @Override // X.TY2
    public final void LLLLLLLZIL(Throwable th) {
        BPP.LIZLLL(getContext(), th, R.string.stz);
        Ll();
        Jl();
    }

    @Override // X.TY2
    public final void LLLLZLLLI(Throwable th) {
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            dataChannel.qv0(LinkInRoomGuestReplyFailedEvent.class, "");
        }
        BPP.LIZJ(C15380j0.LIZLLL(), th);
        LiveDialogFragment liveDialogFragment = this.LJLJI;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().LIZ(this, new C74923Tap(this));
    }

    @Override // X.InterfaceC28471BFj
    public final void onChanged(Integer num) {
        Integer num2 = num;
        if (num2 != null) {
            if (num2.intValue() == 1) {
                Kl();
            } else if (num2.intValue() == 0) {
                Jl();
            }
        }
        Ll();
    }

    public static void Dl(VoiceChatUserInfoFragment voiceChatUserInfoFragment, String str) {
        EnumC74778TWk enumC74778TWk;
        long j = voiceChatUserInfoFragment.xl().LIZ;
        if (C19N.LIZLLL()) {
            enumC74778TWk = C59994Ngc.LIZJ();
        } else {
            enumC74778TWk = voiceChatUserInfoFragment.xl().LJJIIZ;
        }
        C75457TjR.LJIJ(enumC74778TWk, str, System.currentTimeMillis() - j, 0L, "apply", null, 992);
        if (o.LJ(str, "click")) {
            voiceChatUserInfoFragment.xl().LIZ = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Gl(Context context, int i, boolean z) {
        boolean z2;
        TWR twr;
        FragmentManager fragmentManager;
        LiveDialogFragment liveDialogFragment;
        C74983Tbn LIZ = C29556Biq.LIZ();
        TWR twr2 = this.LJLZ;
        LIZ.getClass();
        if (C74983Tbn.LJIIL(twr2) && !z) {
            this.LJLL = new C29213BdJ();
            Activity LJIILJJIL = g0.LJIILJJIL(context);
            if (LJIILJJIL == null) {
                LJIILJJIL = C8E.LIZ().getTopActivity();
            }
            this.LJLLILLLL = new C29215BdL(LJIILJJIL, this.LJLLJ, new AqS144S0200000_13(this, context, 9), new AqS163S0100000_13(this, 167), i, 32);
        }
        C29213BdJ c29213BdJ = this.LJLL;
        if (c29213BdJ != null) {
            C29215BdL c29215BdL = this.LJLLILLLL;
            if (c29215BdL != null) {
                if (c29213BdJ.LIZ(c29215BdL)) {
                    return;
                }
            } else {
                o.LJIJI("checkParam");
                throw null;
            }
        }
        InterfaceC74869TZx interfaceC74869TZx = (InterfaceC74869TZx) this.LJLLI.getValue();
        C29215BdL c29215BdL2 = this.LJLLILLLL;
        if (c29215BdL2 != null) {
            if (interfaceC74869TZx.LIZ(c29215BdL2)) {
                return;
            }
            C75023TcR.LIZLLL.LIZJ("key_afterAgeAndFansCheck");
            TWR twr3 = this.LJLZ;
            if (twr3 != null && twr3.LIZJ == 1) {
                T t = C74740TUy.LIZLLL().LIZIZ;
                o.LJIIIIZZ(t, "inst().data");
                if (((Number) t).intValue() < 1 && (fragmentManager = getFragmentManager()) != null && (liveDialogFragment = this.LJLJI) != null) {
                    liveDialogFragment.show(fragmentManager, "VoiceChatGuestUserInfoDialog");
                }
            }
            C29215BdL c29215BdL3 = this.LJLLILLLL;
            if (c29215BdL3 != null) {
                c29215BdL3.LJ = i;
                C74736TUu.LIZ.LJIL(0, "apply_click", new JSONObject(), false);
                MultiGuestDataHolder xl = xl();
                AbstractC74908Taa abstractC74908Taa = this.LJLLLL;
                if (abstractC74908Taa != null && abstractC74908Taa.LJII() == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xl.LJ = !z2;
                AbstractC74908Taa abstractC74908Taa2 = this.LJLLLL;
                if (abstractC74908Taa2 != null) {
                    abstractC74908Taa2.LJIILLIIL(C74740TUy.LIZLLL().LJIIJJI);
                }
                TWR twr4 = this.LJLZ;
                if (twr4 == null) {
                    this.LJLZ = new TWR(null, 0, 0, i, 47);
                } else {
                    twr4.LJ = i;
                }
                C29215BdL c29215BdL4 = this.LJLLILLLL;
                if (c29215BdL4 != null) {
                    if (c29215BdL4.LJFF == 101 && (twr = this.LJLZ) != null) {
                        twr.LIZLLL = true;
                    }
                    AbstractC74908Taa abstractC74908Taa3 = this.LJLLLL;
                    if (abstractC74908Taa3 != null) {
                        abstractC74908Taa3.LIZLLL(this.LJLZ);
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

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        TQV tqv;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(inflater, "inflater");
        this.LJLL = new C29213BdJ();
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d4z, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …         false,\n        )");
        this.LJZI = LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.bst);
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = C87277YNd.LJIIJJI(this.LLFII);
        }
        View view = this.LJZI;
        C29S c29s = null;
        if (view != null) {
            View outerView = view.findViewById(R.id.hej);
            if (!MultiGuestV3GuestPreviewBugSetting.INSTANCE.isEnable() || this.LJLLL != TXF.GO_LIVE) {
                o.LJIIIIZZ(outerView, "outerView");
                C87277YNd.LJJIJ(outerView);
                C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 57), outerView);
            } else {
                o.LJIIIIZZ(outerView, "outerView");
                C87277YNd.LJJIIZ(outerView);
            }
            View view2 = this.LJZI;
            if (view2 != null) {
                View findViewById2 = view2.findViewById(R.id.faf);
                o.LJIIIIZZ(findViewById2, "this");
                C87277YNd.LJJIJ(findViewById2);
                C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 58), findViewById2);
                this.LJZ = findViewById2;
                View view3 = this.LJZI;
                if (view3 != null) {
                    this.LJLJJLL = (C2A7) view3.findViewById(R.id.brg);
                    AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 166);
                    if (LinkmicSdkApplyButtonFrequenceControlOptSetting.INSTANCE.isOpt()) {
                        C2A7 c2a7 = this.LJLJJLL;
                        if (c2a7 != null) {
                            C29306Beo.LJJL(c2a7, R.id.brg, 1000L, new AqS179S0100000_13(aqS163S0100000_13, 253));
                        }
                    } else {
                        C2A7 c2a72 = this.LJLJJLL;
                        if (c2a72 != null) {
                            C29306Beo.LJJJLL(c2a72, 1000L, new AqS179S0100000_13(aqS163S0100000_13, 254));
                        }
                    }
                    View view4 = this.LJZI;
                    if (view4 != null) {
                        this.LJLJL = (C47121t6) view4.findViewById(R.id.e04);
                        View view5 = this.LJZI;
                        if (view5 != null) {
                            TextView textView = (TextView) view5.findViewById(R.id.mo6);
                            if (textView != null) {
                                textView.setText(C15380j0.LJIILJJIL(R.string.mri));
                            }
                            View view6 = this.LJZI;
                            if (view6 != null) {
                                View findViewById3 = view6.findViewById(R.id.c_d);
                                o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.…dialog_list_recyclerview)");
                                this.LJLJJI = (RecyclerView) findViewById3;
                                View view7 = this.LJZI;
                                if (view7 != null) {
                                    View findViewById4 = view7.findViewById(R.id.a5i);
                                    o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.animation_view_cl)");
                                    this.LLFF = (ConstraintLayout) findViewById4;
                                    View view8 = this.LJZI;
                                    if (view8 != null) {
                                        View findViewById5 = view8.findViewById(R.id.a5h);
                                        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.id.animation_view)");
                                        this.LLF = (U15) findViewById5;
                                        if (CCJ.LIZ(getContext())) {
                                            U15 u15 = this.LLF;
                                            if (u15 != null) {
                                                u15.setScaleX(-1.0f);
                                            } else {
                                                o.LJIJI("applyInfoView");
                                                throw null;
                                            }
                                        }
                                        View view9 = this.LJZI;
                                        if (view9 != null) {
                                            this.LJLJLJ = (C47121t6) view9.findViewById(R.id.a5b);
                                            View view10 = this.LJZI;
                                            if (view10 != null) {
                                                this.LJLJLLL = (C47121t6) view10.findViewById(R.id.a5_);
                                                AbstractC74908Taa abstractC74908Taa = this.LJLLLL;
                                                if (abstractC74908Taa != null) {
                                                    abstractC74908Taa.LIZ(this);
                                                }
                                                WeakReference<TQV> weakReference = this.LJLLLLLL;
                                                if (weakReference != null && (tqv = weakReference.get()) != null) {
                                                    tqv.LJLJJLL = this;
                                                }
                                                DataChannel dataChannel = this.LJLLJ;
                                                if (dataChannel != null) {
                                                    dataChannel.lv0(this, GuestLinkPlayerListChange.class, new AqS179S0100000_13(this, 255));
                                                    dataChannel.lv0(this, LinkInGuestCountDownFinishChannel.class, new AqS179S0100000_13(this, 256));
                                                }
                                                this.LJLLILLLL = new C29215BdL(getContext(), this.LJLLJ, new AqS179S0100000_13(this, 257), new AqS163S0100000_13(this, 165), 0, 48);
                                                DeepLinkEnterMultiLiveRoomDataHandler LIZ = C74752TVk.LIZ();
                                                if (LIZ != null) {
                                                    LIZ.LJ(new AqS163S0100000_13(this, 317));
                                                }
                                                ConstraintLayout constraintLayout = this.LLFF;
                                                if (constraintLayout != null) {
                                                    constraintLayout.setVisibility(0);
                                                    RecyclerView recyclerView = this.LJLJJI;
                                                    if (recyclerView != null) {
                                                        recyclerView.setVisibility(8);
                                                        C47121t6 c47121t6 = this.LJLJLJ;
                                                        if (c47121t6 != null) {
                                                            c47121t6.setText(C15380j0.LJIILJJIL(R.string.lue));
                                                        }
                                                        View view11 = this.LJZI;
                                                        if (view11 != null) {
                                                            view11.postDelayed(new ARunnableS49S0100000_13(this, 57), 250L);
                                                            View view12 = this.LJZI;
                                                            if (view12 != null) {
                                                                try {
                                                                    ViewTreeLifecycleOwner.set(view12, getViewLifecycleOwner());
                                                                    ViewTreeViewModelStoreOwner.set(view12, this);
                                                                    C10A.LIZIZ(view12, this);
                                                                    ActivityC45651qj mo49getActivity = mo49getActivity();
                                                                    if (mo49getActivity instanceof C29S) {
                                                                        c29s = (C29S) mo49getActivity;
                                                                    }
                                                                    C90903hW.LIZ(c29s);
                                                                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                                                                } catch (Throwable th) {
                                                                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                                                }
                                                                return view12;
                                                            }
                                                            o.LJIJI("rootView");
                                                            throw null;
                                                        }
                                                        o.LJIJI("rootView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("listView");
                                                    throw null;
                                                }
                                                o.LJIJI("applyInfoViewContainer");
                                                throw null;
                                            }
                                            o.LJIJI("rootView");
                                            throw null;
                                        }
                                        o.LJIJI("rootView");
                                        throw null;
                                    }
                                    o.LJIJI("rootView");
                                    throw null;
                                }
                                o.LJIJI("rootView");
                                throw null;
                            }
                            o.LJIJI("rootView");
                            throw null;
                        }
                        o.LJIJI("rootView");
                        throw null;
                    }
                    o.LJIJI("rootView");
                    throw null;
                }
                o.LJIJI("rootView");
                throw null;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }

    public static /* synthetic */ void Hl(VoiceChatUserInfoFragment voiceChatUserInfoFragment, Context context, int i, int i2) {
        if ((i2 & 1) != 0) {
            context = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        voiceChatUserInfoFragment.Gl(context, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r3 != null) goto L74;
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
            r7 = 1
            if (r15 == 0) goto L2c
            java.util.Iterator r1 = r15.iterator()
        L1d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r0
            r0.LIZ = r7
            goto L1d
        L2c:
            r6 = 0
            if (r15 == 0) goto L89
            int r0 = r15.size()
        L33:
            r11.Il(r0)
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r9 = r0.getCurrentUserId()
            if (r14 == 0) goto L87
            int r0 = r14.size()
        L4a:
            int r8 = r0 + (-1)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r11.LJLLJ
            if (r1 == 0) goto L84
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r5 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r5
            if (r5 == 0) goto L84
            if (r15 == 0) goto L85
            java.util.Iterator r4 = r15.iterator()
        L60:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.mUser
            long r1 = r0.getId()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L60
            if (r3 == 0) goto L85
        L79:
            if (r15 == 0) goto L7f
            int r6 = r15.size()
        L7f:
            int r0 = r5.liveRoomMode
            X.C74824TYe.LJJZ(r6, r8, r7, r0)
        L84:
            return
        L85:
            r7 = 0
            goto L79
        L87:
            r0 = 1
            goto L4a
        L89:
            r0 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common.VoiceChatUserInfoFragment.e6(long, java.util.List, java.util.List, java.util.List):void");
    }
}
