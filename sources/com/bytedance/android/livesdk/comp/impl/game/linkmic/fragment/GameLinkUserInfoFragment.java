package com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment;

import X.ActivityC45651qj;
import X.B83;
import X.BJM;
import X.BPP;
import X.C018905p;
import X.C03880Dg;
import X.C05200Ii;
import X.C10A;
import X.C132805Jc;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C221108m2;
import X.C28467BFf;
import X.C29044Baa;
import X.C29210BdG;
import X.C29212BdI;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29S;
import X.C2A7;
import X.C30868C9o;
import X.C31413CUn;
import X.C3C5;
import X.C47071t1;
import X.C47121t6;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C74740TUy;
import X.C74811TXr;
import X.C74832TYm;
import X.C74837TYr;
import X.C74879Ta7;
import X.C74902TaU;
import X.C74903TaV;
import X.C76800UCe;
import X.C78866UxK;
import X.C78983UzD;
import X.C87277YNd;
import X.C90903hW;
import X.CCJ;
import X.CJ2;
import X.InterfaceC28471BFj;
import X.InterfaceC29205BdB;
import X.InterfaceC74810TXq;
import X.InterfaceC74833TYn;
import X.OSZ;
import X.TSV;
import X.TT0;
import X.TTR;
import X.TU4;
import X.TV2;
import X.TVD;
import X.TWA;
import X.TWL;
import X.TWP;
import X.TWQ;
import X.TY3;
import X.TYI;
import X.U18;
import X.X1D;
import Y.ARunnableS11S1000000_5;
import Y.ARunnableS49S0100000_13;
import Y.AfS65S0100000_13;
import Y.IDcS172S0100000_13;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplyFailedEvent;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.GuestLinkPlayerListChange;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.LinkInGuestCountDownFinishChannel;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.ShowGuestDisconnectDialogEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class GameLinkUserInfoFragment extends BaseFragment implements InterfaceC74810TXq, TSV, InterfaceC28471BFj<Integer> {
    public static final /* synthetic */ int LLI = 0;
    public LiveDialogFragment LJLILLLLZI;
    public RecyclerView LJLJI;
    public C2A7 LJLJJL;
    public C47121t6 LJLJJLL;
    public C47121t6 LJLJL;
    public C29210BdG LJLJLJ;
    public C29212BdI LJLL;
    public DataChannel LJLLI;
    public TWA LJLLILLLL;
    public TY3 LJLLJ;
    public WeakReference<GameLinkGuestPresenter> LJLLL;
    public TT0 LJLLLL;
    public TTR LJLLLLLL;
    public TWQ LJLZ;
    public View LJZ;
    public boolean LL;
    public U18 LLD;
    public ConstraintLayout LLF;
    public LiveDialog LLFII;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public int LJLIL = -1;
    public final C31413CUn LJLJJI = new C31413CUn();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C74832TYm.LJLIL);
    public final CJ2 LJZI = new CJ2();
    public final CJ2 LJZL = new CJ2();
    public final String LLFF = "outside";
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(TYI.LJLIL);

    @Override // X.InterfaceC74810TXq
    public final /* synthetic */ void LLILIL() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Dl() {
        CJ2 cj2 = new CJ2();
        LinkPlayerInfo LJ = TV2.LJ();
        if (LJ != null) {
            cj2.add(LJ);
        }
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if (num != null && num.intValue() == 2) {
            LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
            linkPlayerInfo.LIZ = 2;
            linkPlayerInfo.mUser = C05200Ii.LIZIZ();
            cj2.add(linkPlayerInfo);
        }
        C31413CUn c31413CUn = this.LJLJJI;
        c31413CUn.LJLIL = cj2;
        c31413CUn.notifyDataSetChanged();
        TWL.LJIILL();
    }

    public final void Gl() {
        ConstraintLayout constraintLayout = this.LLF;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
            RecyclerView recyclerView = this.LJLJI;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
                C2A7 c2a7 = this.LJLJJL;
                if (c2a7 == null) {
                    return;
                }
                c2a7.setClickable(true);
                return;
            }
            o.LJIJI("listView");
            throw null;
        }
        o.LJIJI("applyInfoViewContainer");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Hl() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C2A7 c2a7 = this.LJLJJL;
        if (c2a7 != null) {
            c2a7.LJL();
        }
        C2A7 c2a72 = this.LJLJJL;
        if (c2a72 != null) {
            c2a72.setClickable(true);
        }
        C74740TUy.LIZLLL();
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            if (this.LJLLILLLL == TWA.GO_LIVE) {
                C2A7 c2a73 = this.LJLJJL;
                if (c2a73 != null) {
                    c2a73.setText(C15380j0.LJIILJJIL(R.string.soa));
                }
                C2A7 c2a74 = this.LJLJJL;
                if (c2a74 == null) {
                    return;
                }
                c2a74.LJJLL(R.style.a2z);
                return;
            }
            C2A7 c2a75 = this.LJLJJL;
            if (c2a75 != null) {
                c2a75.LJJLL(R.style.a2z);
            }
            C2A7 c2a76 = this.LJLJJL;
            if (c2a76 != null) {
                c2a76.setText(C15380j0.LJIILJJIL(R.string.nxv));
            }
            C47121t6 c47121t6 = this.LJLJJLL;
            if (c47121t6 != null) {
                c47121t6.setVisibility(0);
            }
            C2A7 c2a77 = this.LJLJJL;
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
            C2A7 c2a78 = this.LJLJJL;
            if (c2a78 != null) {
                C87277YNd.LJJIJ(c2a78);
            }
            C2A7 c2a79 = this.LJLJJL;
            if (c2a79 != null) {
                c2a79.LJJLL(R.style.a3a);
            }
            C2A7 c2a710 = this.LJLJJL;
            if (c2a710 != null) {
                c2a710.setText(C15380j0.LJIILJJIL(R.string.kuw));
            }
            C2A7 c2a711 = this.LJLJJL;
            ViewGroup.LayoutParams layoutParams = null;
            if (c2a711 != null) {
                layoutParams = c2a711.getLayoutParams();
            }
            if (!(layoutParams instanceof C018905p) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.bottomMargin = 28;
            C2A7 c2a712 = this.LJLJJL;
            if (c2a712 != null) {
                c2a712.setLayoutParams(marginLayoutParams);
            }
            C47121t6 c47121t62 = this.LJLJJLL;
            if (c47121t62 == null) {
                return;
            }
            c47121t62.setVisibility(8);
            return;
        }
        if (num.intValue() != 1) {
            return;
        }
        C2A7 c2a713 = this.LJLJJL;
        if (c2a713 != null) {
            c2a713.LJJLL(R.style.a3a);
        }
        C2A7 c2a714 = this.LJLJJL;
        if (c2a714 != null) {
            c2a714.setText(C15380j0.LJIILJJIL(R.string.jun));
        }
        C47121t6 c47121t63 = this.LJLJJLL;
        if (c47121t63 != null) {
            c47121t63.setVisibility(0);
        }
        C2A7 c2a715 = this.LJLJJL;
        if (c2a715 == null) {
            return;
        }
        C87277YNd.LJJIJ(c2a715);
    }

    @Override // X.TSV
    public final void LLJL() {
        LiveDialogFragment liveDialogFragment = this.LJLILLLLZI;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismiss();
        }
    }

    public final void i0() {
        LiveDialog liveDialog;
        LiveDialog liveDialog2 = this.LLFII;
        if (liveDialog2 != null && liveDialog2.isShowing() && (liveDialog = this.LLFII) != null) {
            liveDialog.dismiss();
        }
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LJIILLIIL(R.string.oxw);
        c47071t1.LJFF(R.string.oxx);
        c47071t1.LJIIL(R.string.oxv, new IDcS172S0100000_13(this, 7));
        c47071t1.LJIIIZ(R.string.noo, TWP.LJLIL);
        LiveDialog LIZ = c47071t1.LIZ();
        this.LLFII = LIZ;
        LIZ.setCanceledOnTouchOutside(false);
        LiveDialog liveDialog3 = this.LLFII;
        if (liveDialog3 != null) {
            C78866UxK.LJIJI(liveDialog3, 5, true, false, false, LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
        LiveDialog liveDialog4 = this.LLFII;
        if (liveDialog4 != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog4, new Object[0], "void", new C65300Pk0(false, "()V", "3635252740810704919")).LIZ) {
            liveDialog4.show();
        }
        xl("show");
    }

    @Override // X.TSV
    public final void onCancelSuccess() {
        LiveDialogFragment liveDialogFragment = this.LJLILLLLZI;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismiss();
        }
    }

    public final TVD wl() {
        return (TVD) this.LLFFF.getValue();
    }

    @Override // X.InterfaceC74810TXq
    public final void LLLLIL() {
        String string = C15380j0.LIZLLL().getString(R.string.lu6);
        o.LJIIIIZZ(string, "getContext().getString(resId)");
        long nanoTime = System.nanoTime() / 1000000;
        long j = C74811TXr.LIZ;
        long j2 = nanoTime - j;
        if (j == 0 || j2 >= 2000) {
            C30868C9o.LJI(string);
        } else {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS11S1000000_5(string, 0), j2);
        }
        C74811TXr.LIZ = 0L;
        LiveDialogFragment liveDialogFragment = this.LJLILLLLZI;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismiss();
        }
        wl().LIZLLL = System.currentTimeMillis();
        Hl();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        GameLinkGuestPresenter gameLinkGuestPresenter;
        LiveDialog liveDialog;
        super.onDestroy();
        LiveDialog liveDialog2 = this.LLFII;
        if (liveDialog2 != null && liveDialog2.isShowing() && (liveDialog = this.LLFII) != null) {
            liveDialog.dismiss();
        }
        WeakReference<GameLinkGuestPresenter> weakReference = this.LJLLL;
        if (weakReference != null && (gameLinkGuestPresenter = weakReference.get()) != null) {
            gameLinkGuestPresenter.setDialogView(null);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJZI.clear();
        this.LJZL.clear();
        this.LL = false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        GameLinkGuestPresenter gameLinkGuestPresenter;
        InterfaceC29205BdB<C28467BFf<MultiLiveGuestInfoList>> fetchUserListData;
        super.onResume();
        WeakReference<GameLinkGuestPresenter> weakReference = this.LJLLL;
        if (weakReference != null && (gameLinkGuestPresenter = weakReference.get()) != null && (fetchUserListData = gameLinkGuestPresenter.fetchUserListData()) != null) {
            fetchUserListData.LIZJ(new AfS65S0100000_13(this, 73), new AfS65S0100000_13(this, 74));
        }
    }

    public final void vl() {
        TU4 LIZ;
        Object obj;
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        TT0 tt0 = this.LJLLLL;
        if (tt0 != null && (LIZ = tt0.LIZ()) != null) {
            Iterator it = LIZ.LIZLLL().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    User user = ((LinkListUser) obj).user;
                    if (user != null && user.getId() == currentUserId) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LinkListUser linkListUser = (LinkListUser) obj;
            if (linkListUser != null) {
                TWL.LIZ.LJIIIIZZ(currentUserId, "go_live_panel", wl().LJJ, linkListUser.linkMicId);
            }
        }
        if (this.LJLLI != null) {
            OSZ osz = new OSZ("go_live_panel", 10002);
            DataChannel dataChannel = this.LJLLI;
            if (dataChannel != null) {
                dataChannel.qv0(ShowGuestDisconnectDialogEvent.class, osz);
            }
        }
    }

    @Override // X.InterfaceC74810TXq
    public final LiveDialogFragment getDialog() {
        return this.LJLILLLLZI;
    }

    @Override // X.TSV
    public final void LLJJIII(Throwable th) {
        BPP.LIZLLL(getContext(), th, R.string.sud);
    }

    @Override // X.InterfaceC74810TXq
    public final void LLLLLLLZIL(Throwable th) {
        BPP.LIZLLL(getContext(), th, R.string.stz);
        Hl();
        Gl();
    }

    @Override // X.InterfaceC74810TXq
    public final void LLLLZLLLI(Throwable th) {
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            dataChannel.qv0(LinkInRoomGuestReplyFailedEvent.class, "");
        }
        BPP.LIZJ(C15380j0.LIZLLL(), th);
        LiveDialogFragment liveDialogFragment = this.LJLILLLLZI;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismiss();
        }
    }

    @Override // X.InterfaceC28471BFj
    public final void onChanged(Integer num) {
        Integer num2 = num;
        if (num2 != null && num2.intValue() == 0) {
            Gl();
        }
        Hl();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public final void xl(String str) {
        long currentTimeMillis = System.currentTimeMillis() - wl().LIZLLL;
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            String str2 = "";
            if (idStr == null) {
                idStr = "";
            }
            hashMap.put("room_id", idStr);
            hashMap.put("enter_method", BJM.LJIIIIZZ());
            hashMap.put("enter_from_merge", BJM.LJFF());
            hashMap.put("action_type", BJM.LIZLLL());
            hashMap.put("anchor_relationship", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
            hashMap.put("layout_setting", TWL.LJFF().getFirst());
            hashMap.put("window_setting", TWL.LJFF().getSecond());
            hashMap.put("withdraw_action_type", str);
            StringBuilder LIZ = X1D.LIZ();
            hashMap.put("duration", C132805Jc.LIZLLL(LIZ, "", currentTimeMillis, LIZ));
            String str3 = C78983UzD.LJLLILLLL;
            if (str3 != null && str3.length() != 0) {
                String str4 = C78983UzD.LJLLILLLL;
                if (str4 != null) {
                    str2 = str4;
                }
                hashMap.put("request_page", str2);
            }
            TWL.LJIL("livesdk_guest_connection_apply_withdraw", hashMap);
        }
        if (o.LJ(str, "click")) {
            wl().LIZLLL = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x02d3, code lost:
    
        if (r1 == (-1)) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0337, code lost:
    
        r4 = new X.OSJ(java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Il(java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r19, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r20) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkUserInfoFragment.Il(java.util.List, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Al(GameLinkUserInfoFragment gameLinkUserInfoFragment, int i, int i2) {
        TWQ twq;
        FragmentManager fragmentManager;
        LiveDialogFragment liveDialogFragment;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        C29210BdG c29210BdG = gameLinkUserInfoFragment.LJLJLJ;
        if (c29210BdG != null) {
            C29212BdI c29212BdI = gameLinkUserInfoFragment.LJLL;
            if (c29212BdI != null) {
                if (c29210BdG.LIZ(c29212BdI)) {
                    return;
                }
            } else {
                o.LJIJI("checkParam");
                throw null;
            }
        }
        InterfaceC74833TYn interfaceC74833TYn = (InterfaceC74833TYn) gameLinkUserInfoFragment.LJLJLLL.getValue();
        C29212BdI c29212BdI2 = gameLinkUserInfoFragment.LJLL;
        if (c29212BdI2 != null) {
            if (interfaceC74833TYn.LIZ(c29212BdI2)) {
                return;
            }
            TWQ twq2 = gameLinkUserInfoFragment.LJLZ;
            if (twq2 != null && twq2.LIZJ == 1) {
                T t = C74740TUy.LIZLLL().LIZIZ;
                o.LJIIIIZZ(t, "inst().data");
                if (((Number) t).intValue() < 1 && (fragmentManager = gameLinkUserInfoFragment.getFragmentManager()) != null && (liveDialogFragment = gameLinkUserInfoFragment.LJLILLLLZI) != null) {
                    liveDialogFragment.show(fragmentManager, "GameLinkGuestUserInfoDialog");
                }
            }
            C29212BdI c29212BdI3 = gameLinkUserInfoFragment.LJLL;
            if (c29212BdI3 != null) {
                c29212BdI3.LJ = i;
                C74837TYr.LJIIIZ(false, "apply_click", new JSONObject());
                TY3 ty3 = gameLinkUserInfoFragment.LJLLJ;
                if (ty3 != null) {
                    ty3.LJFF(C74740TUy.LIZLLL().LJIIJJI);
                }
                if (gameLinkUserInfoFragment.LJLZ == null) {
                    gameLinkUserInfoFragment.LJLZ = new TWQ(0, 31, null);
                }
                C29212BdI c29212BdI4 = gameLinkUserInfoFragment.LJLL;
                if (c29212BdI4 != null) {
                    if (c29212BdI4.LJFF == 101 && (twq = gameLinkUserInfoFragment.LJLZ) != null) {
                        twq.LIZLLL = true;
                    }
                    TY3 ty32 = gameLinkUserInfoFragment.LJLLJ;
                    if (ty32 == null) {
                        return;
                    }
                    ty32.LIZ(gameLinkUserInfoFragment.LJLZ);
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
        C018905p c018905p;
        GameLinkGuestPresenter gameLinkGuestPresenter;
        o.LJIIIZ(inflater, "inflater");
        this.LJLJLJ = new C29210BdG();
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d46, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …         false,\n        )");
        this.LJZ = LLLLIILL;
        C2A7 c2a7 = (C2A7) LLLLIILL.findViewById(R.id.brg);
        this.LJLJJL = c2a7;
        if (c2a7 != null) {
            C29306Beo.LJJJLL(c2a7, 500L, new AqS179S0100000_13(this, 283));
        }
        View view = this.LJZ;
        C29S c29s = null;
        if (view != null) {
            this.LJLJJLL = (C47121t6) view.findViewById(R.id.c7z);
            View view2 = this.LJZ;
            if (view2 != null) {
                view2.findViewById(R.id.mo6);
                View view3 = this.LJZ;
                if (view3 != null) {
                    View findViewById = view3.findViewById(R.id.c_d);
                    o.LJIIIIZZ(findViewById, "rootView.findViewById(R.…dialog_list_recyclerview)");
                    this.LJLJI = (RecyclerView) findViewById;
                    View view4 = this.LJZ;
                    if (view4 != null) {
                        View findViewById2 = view4.findViewById(R.id.a5i);
                        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.animation_view_cl)");
                        this.LLF = (ConstraintLayout) findViewById2;
                        View view5 = this.LJZ;
                        if (view5 != null) {
                            View findViewById3 = view5.findViewById(R.id.a5h);
                            o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.animation_view)");
                            this.LLD = (U18) findViewById3;
                            if (CCJ.LIZ(getContext())) {
                                U18 u18 = this.LLD;
                                if (u18 != null) {
                                    u18.setScaleX(-1.0f);
                                } else {
                                    o.LJIJI("applyInfoView");
                                    throw null;
                                }
                            }
                            View view6 = this.LJZ;
                            if (view6 != null) {
                                view6.findViewById(R.id.a5b);
                                View view7 = this.LJZ;
                                if (view7 != null) {
                                    this.LJLJL = (C47121t6) view7.findViewById(R.id.a5_);
                                    TY3 ty3 = this.LJLLJ;
                                    if (ty3 != null) {
                                        ty3.LIZIZ(this);
                                    }
                                    WeakReference<GameLinkGuestPresenter> weakReference = this.LJLLL;
                                    if (weakReference != null && (gameLinkGuestPresenter = weakReference.get()) != null) {
                                        gameLinkGuestPresenter.setDialogView(this);
                                    }
                                    DataChannel dataChannel = this.LJLLI;
                                    if (dataChannel != null) {
                                        dataChannel.lv0(this, GuestLinkPlayerListChange.class, new AqS179S0100000_13(this, 284));
                                        dataChannel.lv0(this, LinkInGuestCountDownFinishChannel.class, new AqS179S0100000_13(this, 285));
                                    }
                                    this.LJLL = new C29212BdI(getContext(), this.LJLLI, new AqS179S0100000_13(this, 286), new AqS163S0100000_13(this, 204), 48);
                                    RecyclerView recyclerView = this.LJLJI;
                                    if (recyclerView != null) {
                                        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                                        if (layoutParams instanceof C018905p) {
                                            c018905p = (C018905p) layoutParams;
                                        } else {
                                            c018905p = null;
                                        }
                                        if (c018905p != null) {
                                            c018905p.bottomToTop = R.id.brg;
                                            recyclerView.setLayoutParams(c018905p);
                                        }
                                        RecyclerView recyclerView2 = this.LJLJI;
                                        if (recyclerView2 != null) {
                                            getContext();
                                            recyclerView2.setLayoutManager(new LinearLayoutManager());
                                            this.LJLJJI.LJLZ(LinkPlayerInfo.class, new C74902TaU(this.LJLLI, wl()));
                                            this.LJLJJI.LJLZ(C74879Ta7.class, new C74903TaV());
                                            RecyclerView recyclerView3 = this.LJLJI;
                                            if (recyclerView3 != null) {
                                                recyclerView3.setAdapter(this.LJLJJI);
                                                ConstraintLayout constraintLayout = this.LLF;
                                                if (constraintLayout != null) {
                                                    constraintLayout.setVisibility(8);
                                                    RecyclerView recyclerView4 = this.LJLJI;
                                                    if (recyclerView4 != null) {
                                                        recyclerView4.setVisibility(0);
                                                        View view8 = this.LJZ;
                                                        if (view8 != null) {
                                                            view8.postDelayed(new ARunnableS49S0100000_13(this, 67), 250L);
                                                            View view9 = this.LJZ;
                                                            if (view9 != null) {
                                                                try {
                                                                    ViewTreeLifecycleOwner.set(view9, getViewLifecycleOwner());
                                                                    ViewTreeViewModelStoreOwner.set(view9, this);
                                                                    C10A.LIZIZ(view9, this);
                                                                    ActivityC45651qj mo49getActivity = mo49getActivity();
                                                                    if (mo49getActivity instanceof C29S) {
                                                                        c29s = (C29S) mo49getActivity;
                                                                    }
                                                                    C90903hW.LIZ(c29s);
                                                                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                                                                } catch (Throwable th) {
                                                                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                                                }
                                                                return view9;
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
                                            o.LJIJI("listView");
                                            throw null;
                                        }
                                        o.LJIJI("listView");
                                        throw null;
                                    }
                                    o.LJIJI("listView");
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
}
