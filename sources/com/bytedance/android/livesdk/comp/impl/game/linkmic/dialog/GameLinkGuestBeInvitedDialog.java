package com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog;

import X.ActivityC45651qj;
import X.B83;
import X.BPP;
import X.BY6;
import X.C05170If;
import X.C0NB;
import X.C0NE;
import X.C10A;
import X.C15380j0;
import X.C16880lQ;
import X.C1EW;
import X.C221108m2;
import X.C265112h;
import X.C28507BGt;
import X.C28733BPl;
import X.C29044Baa;
import X.C29210BdG;
import X.C29212BdI;
import X.C29306Beo;
import X.C29374Bfu;
import X.C2A7;
import X.C30868C9o;
import X.C31665Cbl;
import X.C41051jJ;
import X.C44878HjO;
import X.C45804HyK;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73411SrX;
import X.C74740TUy;
import X.C74746TVe;
import X.C74768TWa;
import X.C74818TXy;
import X.C74838TYs;
import X.C75911Tql;
import X.C78983UzD;
import X.C87277YNd;
import X.EnumC38440F6u;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import X.InterfaceC29882Bo6;
import X.InterfaceC64592gB;
import X.InterfaceC75441TjB;
import X.InterfaceC92693kP;
import X.Q7L;
import X.TMC;
import X.TTR;
import X.TTV;
import X.TU2;
import X.TV2;
import X.TVA;
import X.TVD;
import X.TW6;
import X.TWA;
import X.TWL;
import X.TY4;
import X.X1D;
import Y.ACListenerS5S0100200_13;
import Y.ACListenerS5S0401000_13;
import Y.AfS65S0100000_13;
import Y.AfS8S0100100_13;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestBeInvitedDialogVisibilityChannel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.api.GameLinkApi;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.CheckPermissionSucc;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS100S0101000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS51S0400000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GameLinkGuestBeInvitedDialog extends LiveDialogFragment implements TY4 {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public C41051jJ LJLIL;
    public View LJLILLLLZI;
    public C2A7 LJLJI;
    public C2A7 LJLJJI;
    public TVA LJLJJL;
    public boolean LJLJJLL;
    public TU2 LJLJL;
    public boolean LJLJLJ;
    public TTR LJLJLLL;
    public C73411SrX LJLL;
    public C41051jJ LJLLI;
    public LiveDialog LJLLILLLL;
    public long LJLLJ;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 201));

    @Override // X.TY4
    public final void LJJLJ() {
        this.LJLJJLL = false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void Al() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            TVA tva = this.LJLJJL;
            if (tva != null) {
                tva.LIZIZ(10012, room.getOwnerUserId(), "leave_source_reply_pos_limit");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLeave: ");
            LIZ.append(room.getOwnerUserId());
            LIZ.append(", ");
            LIZ.append("leave_source_reply_pos_limit");
            C0NB.LJIIIIZZ(X1D.LIZIZ(LIZ));
        }
    }

    public final void Dl() {
        if (this.LJLL != null) {
            C0NB.LJIIIZ("GameLinkGuestBeInvitedDialog", "stopDismissCountdown");
            C73411SrX c73411SrX = this.LJLL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
        }
    }

    @Override // X.TY4
    public final void LLILLJJLI() {
        TV2.LJII((Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class), this.dataChannel, true);
        TTV.LIZ().LJIILLIIL = 2;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            TW6 tw6 = new TW6(1);
            tw6.LIZIZ = TWA.GO_LIVE;
            dataChannel.qv0(InteractStateChangeEvent.class, tw6);
        }
        dismiss();
        this.LJLJJLL = false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cx3);
        c28507BGt.LIZJ = R.style.ac_;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC29882Bo6 genLandscapeDialogProxy() {
        BY6 by6 = new BY6(R.layout.cxp);
        by6.LIZIZ = false;
        return by6;
    }

    public final void wl() {
        int i;
        GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog;
        C41051jJ c41051jJ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        int i2 = 0;
        if (mo49getActivity != null && C29306Beo.LJIIZILJ(mo49getActivity.getRequestedOrientation())) {
            TTV.LIZ().LIZIZ = 1;
            TTV.LIZ().LIZJ = this.LJLJL;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.pv0(OrientationChangeEvent.class);
                dataChannel.pv0(ResetSilentTimerEvent.class);
                return;
            }
            return;
        }
        if (this.LJLJJLL) {
            return;
        }
        TTR ttr = this.LJLJLLL;
        if (ttr != null) {
            i = ttr.LJII();
        } else {
            i = 0;
        }
        if (C74838TYs.LJ().LJJ >= i) {
            C30868C9o.LIZJ(R.string.mij);
            Al();
            return;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            this.LJLJJLL = true;
            TVA tva = this.LJLJJL;
            if (tva != null) {
                long id = room.getId();
                long ownerUserId = room.getOwnerUserId();
                TVD tvd = (TVD) tva.LIZLLL.getValue();
                tvd.LJIILLIIL = 2;
                C74740TUy.LIZLLL().LJIIJJI = tvd.LJIILLIIL;
                TY4 ty4 = tva.LIZ;
                if ((ty4 instanceof GameLinkGuestBeInvitedDialog) && (gameLinkGuestBeInvitedDialog = (GameLinkGuestBeInvitedDialog) ty4) != null && (c41051jJ = gameLinkGuestBeInvitedDialog.LJLLI) != null && c41051jJ.isChecked()) {
                    i2 = 1;
                }
                C75911Tql c75911Tql = new C75911Tql(id, ownerUserId, 1, new BizReplyParams(2, i2), 16);
                InterfaceC75441TjB R6 = tva.LIZIZ.R6();
                if (R6 != null) {
                    R6.LJJLIIIJL(c75911Tql, new C74818TXy(tva, ownerUserId, id));
                }
            }
        }
    }

    public final boolean xl() {
        return ((Boolean) this.LJLLL.getValue()).booleanValue();
    }

    @Override // X.TY4
    public final boolean LLLLLLLLL() {
        if (isShowing() || this.LJLJLJ) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
        C41051jJ c41051jJ = this.LJLLI;
        if (c41051jJ != null && c41051jJ.isChecked()) {
            try {
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room != null) {
                    long id = room.getId();
                    if (id != 0) {
                        if (this.LJLJJL != null) {
                            C1EW.LIZ(((GameLinkApi) Q7L.LIZIZ(GameLinkApi.class)).turnOffInvitation(id)).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Dg
                                @Override // X.InterfaceC64592gB
                                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                }
                            }, new InterfaceC64592gB() { // from class: X.9Dh
                                @Override // X.InterfaceC64592gB
                                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                }
                            });
                        }
                    }
                }
                "Check failed.".toString();
                throw new IllegalStateException("Check failed.");
            } catch (Exception unused) {
            }
        }
        C74746TVe.LJ("timeout", CardStruct.IStatusCode.DEFAULT);
        LiveDialog liveDialog = this.LJLLILLLL;
        if (liveDialog != null) {
            liveDialog.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Dl();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(LinkInRoomGuestBeInvitedDialogVisibilityChannel.class, Boolean.FALSE);
        }
        TVA tva = this.LJLJJL;
        if (tva != null) {
            ((C73318Sq2) tva.LJ.getValue()).LIZLLL();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        if (this.LJLJLJ) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                dialog.dismiss();
            }
        } else {
            C74746TVe.LJFF("show", Long.valueOf(this.LJLLJ), Boolean.valueOf(xl()), CardStruct.IStatusCode.DEFAULT);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // X.TY4
    public final void LJJLIIIJL(Throwable th) {
        String str;
        BPP.LIZLLL(getContext(), th, R.string.stz);
        dismiss();
        this.LJLJJLL = false;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doRequestReplyAnchor:");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("invite_issue_check", LIZIZ);
    }

    @Override // X.TY4
    public final void LLLLIILL(boolean z) {
        DataChannel dataChannel;
        dismiss();
        this.LJLJJLL = false;
        if (z && (dataChannel = this.dataChannel) != null) {
            TV2.LJII((Room) dataChannel.kv0(RoomChannel.class), dataChannel, false);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        TTR ttr;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (ttr = this.LJLJLLL) != null) {
            this.LJLJJL = new TVA(this, ttr, dataChannel);
        }
    }

    public final void vl(int i) {
        Activity LJIJJ;
        try {
            if (getContext() != null) {
                Context context = getContext();
                if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                    EnumC38440F6u enumC38440F6u = EnumC38440F6u.LINK_MIC;
                    int i2 = 0;
                    if (!LiveAppBundleUtils.isPluginAvailable(enumC38440F6u)) {
                        LiveAppBundleUtils.ensurePluginAvailable$default(enumC38440F6u, null, false, 6, null);
                        "Check failed.".toString();
                        throw new IllegalStateException("Check failed.");
                    }
                    TTR ttr = this.LJLJLLL;
                    if (ttr != null) {
                        i2 = ttr.LJII();
                    }
                    if (C74838TYs.LJ().LJJ >= i2 && i2 != 0) {
                        C30868C9o.LIZJ(R.string.mij);
                        Al();
                        dismiss();
                        return;
                    } else {
                        C78983UzD.LJLLILLLL = "anchor_invite_guest";
                        TWL.LJI = "anchor_invite_guest";
                        C74768TWa.LIZ(false, 1, LJIJJ, Long.valueOf(TTV.LIZ().LJIIZILJ), new AqS51S0400000_5(LJIJJ, this.dataChannel, new AqS100S0101000_13(i2, this, i, 3), 0), null, null);
                        TWL.LIZ.LJIILLIIL("anchor_invite_guest");
                        return;
                    }
                }
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException unused) {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                TVA tva = this.LJLJJL;
                if (tva != null) {
                    tva.LIZ(room.getId(), room.getOwnerUserId());
                }
                C0NB.LJIIIZ("GameLinkGuestBeInvitedDialog", "refuse onPluginNotAvailable");
            }
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        User user;
        InterfaceC05190Ih interfaceC05190Ih;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room == null) {
            dismiss();
            return;
        }
        long id = room.getId();
        long ownerUserId = room.getOwnerUserId();
        String LIZ = C05170If.LIZ(room.getOwner());
        this.LJLIL = (C41051jJ) view.findViewById(R.id.b7t);
        this.LJLILLLLZI = view.findViewById(R.id.e6s);
        C41051jJ c41051jJ = this.LJLIL;
        if (c41051jJ != null) {
            c41051jJ.setVisibility(8);
        }
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        ((TextView) view.findViewById(R.id.esm)).setText(C15380j0.LJIILL(R.string.mhr, LIZ));
        ImageView imageView = (ImageView) view.findViewById(R.id.a1p);
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            user = room2.getOwner();
        } else {
            user = null;
        }
        if (user != null) {
            C31665Cbl.LJIIJ(imageView, user.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), R.drawable.cuk);
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.dzi);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            C31665Cbl.LJIIJ(imageView2, interfaceC05190Ih.getAvatarThumb(), imageView2.getWidth(), imageView2.getHeight(), R.drawable.cuk);
        }
        C2A7 c2a7 = (C2A7) view.findViewById(R.id.mgu);
        o.LJIIIIZZ(c2a7, "this");
        C87277YNd.LJJIJ(c2a7);
        C16880lQ.LJJIII(c2a7, new ACListenerS5S0100200_13(this, id, ownerUserId, 0));
        this.LJLJJI = c2a7;
        C2A7 c2a72 = (C2A7) view.findViewById(R.id.lz_);
        o.LJIIIIZZ(c2a72, "this");
        C87277YNd.LJJIJ(c2a72);
        C16880lQ.LJIIJ(new ACListenerS5S0401000_13(new C29210BdG(), new C29212BdI(getContext(), this.dataChannel, new AqS100S0101000_13(this, 10), new AqS163S0100000_13(this, 469), 32), this, new AqS163S0100000_13(this, 468), 1), c2a72);
        this.LJLJI = c2a72;
        c2a72.setEnabled(this.LJLJLJ);
        long value = LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue();
        C44878HjO.LIZJ("startDismissCountDown maxCountDownValue:", value, "GameLinkGuestBeInvitedDialog");
        InterfaceC92693kP LJJJLIIL = C265112h.LIZ(TMC.LJIL(0L, 1L, TimeUnit.SECONDS)).LJJJLIIL(new AfS8S0100100_13(value, this, 24), new AfS65S0100000_13(this, 187));
        Dl();
        this.LJLL = (C73411SrX) LJJJLIIL;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, CheckPermissionSucc.class, new AqS179S0100000_13(this, 278));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(LinkInRoomGuestBeInvitedDialogVisibilityChannel.class, Boolean.TRUE);
        }
        if (this.LJLJLJ) {
            wl();
        }
    }
}
