package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.linked;

import X.B83;
import X.C0NB;
import X.C10A;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C2A7;
import X.C32536Cpo;
import X.C74631TQt;
import X.C74824TYe;
import X.C74951TbH;
import X.C74961TbR;
import X.C77123UOp;
import X.C78857UxB;
import X.C87277YNd;
import X.C8E;
import X.EnumC74949TbF;
import X.InterfaceC24140x8;
import X.InterfaceC31981Ni;
import X.InterfaceC75441TjB;
import X.OSZ;
import X.TQU;
import X.X1D;
import Y.AObserverS81S0100000_13;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestAudioVolumeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MicClickableEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowWithConfirmEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BeautyControlGroupAppLogSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestLinkedPreviewFragment extends AbsMultiGuestNewPreviewFragment {
    public C2A7 LLIILII;
    public C2A7 LLIILZL;
    public DialogInterface LLIIZ;
    public boolean LLIL;
    public MultiGuestLinkedPreviewViewModel LLILII;
    public boolean LLILLIZIL;
    public final Map<Integer, View> LLILLJJLI = new LinkedHashMap();
    public String LLILIL = "outside";
    public long LLILL = System.currentTimeMillis();

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final String Dl() {
        return "connection_status";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final LiveEffect Gl() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final String Il() {
        return "video_anchor_connect_detail";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Ml() {
        int i;
        Channel<Integer> hv0;
        Integer value;
        Channel<Integer> hv02;
        this.LLI = false;
        MultiGuestDataHolder Al = Al();
        if (Al != null) {
            C78857UxB.LJJJ(Al.LJJIJLIJ);
        }
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel = this.LLILII;
        if (multiGuestLinkedPreviewViewModel != null && (hv02 = multiGuestLinkedPreviewViewModel.hv0()) != null) {
            hv02.setValue(1);
        }
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel2 = this.LLILII;
        if (multiGuestLinkedPreviewViewModel2 != null && (hv0 = multiGuestLinkedPreviewViewModel2.hv0()) != null && (value = hv0.getValue()) != null) {
            i = value.intValue();
        } else {
            i = 2;
        }
        this.LLIFFJFJJ = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initPreviewModeAtFirst originPreviewMode=");
        LIZ.append(this.LLIFFJFJJ);
        LIZ.append(" openData=");
        LIZ.append((Object) null);
        C0NB.LIZIZ("MultiGuestLinkedPreviewFragment", X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final boolean Ol() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILLJJLI).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILLJJLI;
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

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Ql() {
        this.LLILIL = "outside";
        dismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Rl() {
        String str;
        String str2;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || room.getOwner() == null) {
            return;
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && R6.LLLLLJIL() != null) {
            C74824TYe c74824TYe = C74824TYe.LIZ;
            MultiGuestDataHolder Al = Al();
            if (Al == null || (str = Al.LJJJJI) == null) {
                str = "";
            }
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            RtcUserInfo LLLLLJIL = R6.LLLLLJIL();
            if (LLLLLJIL == null || (str2 = LLLLLJIL.getLinkMicId()) == null) {
                str2 = "";
            }
            c74824TYe.LJIJI(currentUserId, "guest", "go_live_panel", str, str2);
        }
        OSZ osz = new OSZ("setting_panel", 10002);
        this.LLILIL = "disconnect_icon";
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GuestDisconnectByWindowWithConfirmEvent.class, osz);
        }
        if (!LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) {
            return;
        }
        dismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Yl() {
        boolean z;
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel = this.LLILII;
        if (multiGuestLinkedPreviewViewModel != null) {
            MultiGuestDataHolder Al = Al();
            if (Al != null) {
                z = Al.LIZLLL;
            } else {
                z = true;
            }
            multiGuestLinkedPreviewViewModel.lv0(false, z, false, 2, null);
        }
    }

    public final void cm() {
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        boolean z;
        ZoomService zoomService;
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel = this.LLILII;
        if (multiGuestLinkedPreviewViewModel != null && (iv0 = multiGuestLinkedPreviewViewModel.iv0()) != null && (c74961TbR = iv0.LIZ) != null) {
            C74824TYe c74824TYe = C74824TYe.LIZ;
            String xl = xl();
            LiveEffect liveEffect = c74961TbR.LJ;
            long j = c74961TbR.LIZLLL;
            MultiGuestDataHolder Al = Al();
            if (Al != null) {
                z = Al.LIZLLL;
            } else {
                z = false;
            }
            boolean z2 = !z;
            Boolean value = c74961TbR.LIZ.getValue();
            if (value == null) {
                value = Boolean.FALSE;
            }
            boolean z3 = !value.booleanValue();
            boolean z4 = !c74961TbR.LIZJ;
            MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel2 = this.LLILII;
            String str = null;
            if (multiGuestLinkedPreviewViewModel2 != null) {
                zoomService = multiGuestLinkedPreviewViewModel2.nv0();
            } else {
                zoomService = null;
            }
            MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel3 = this.LLILII;
            if (multiGuestLinkedPreviewViewModel3 != null) {
                str = multiGuestLinkedPreviewViewModel3.mv0();
            }
            c74824TYe.LJJJLL("", "", xl, liveEffect, j, z2, z3, z4, true, C77123UOp.LJJI(zoomService, str));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        boolean z;
        ZoomService zoomService;
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel;
        super.onDestroy();
        if (this.LLILLIZIL && (multiGuestLinkedPreviewViewModel = this.LLILII) != null) {
            multiGuestLinkedPreviewViewModel.jv0("business_mute_close_manage_panel");
        }
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel2 = this.LLILII;
        if (multiGuestLinkedPreviewViewModel2 != null && (iv0 = multiGuestLinkedPreviewViewModel2.iv0()) != null && (c74961TbR = iv0.LIZ) != null) {
            C74824TYe c74824TYe = C74824TYe.LIZ;
            LiveEffect liveEffect = c74961TbR.LJ;
            long j = c74961TbR.LIZLLL;
            MultiGuestDataHolder Al = Al();
            if (Al != null) {
                z = Al.LIZLLL;
            } else {
                z = false;
            }
            boolean z2 = !z;
            Boolean value = c74961TbR.LIZ.getValue();
            if (value == null) {
                value = Boolean.FALSE;
            }
            boolean z3 = !value.booleanValue();
            boolean z4 = !c74961TbR.LIZJ;
            String str = this.LLILIL;
            long currentTimeMillis = System.currentTimeMillis() - this.LLILL;
            MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel3 = this.LLILII;
            String str2 = null;
            if (multiGuestLinkedPreviewViewModel3 != null) {
                zoomService = multiGuestLinkedPreviewViewModel3.nv0();
            } else {
                zoomService = null;
            }
            MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel4 = this.LLILII;
            if (multiGuestLinkedPreviewViewModel4 != null) {
                str2 = multiGuestLinkedPreviewViewModel4.mv0();
            }
            c74824TYe.LJJJJZI(liveEffect, j, z2, z3, z4, str, currentTimeMillis, true, C77123UOp.LJJI(zoomService, str2), "");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Ll() {
        LiveData liveData;
        LiveData liveData2;
        LiveData liveData3;
        LiveData liveData4;
        LiveData liveData5;
        super.Ll();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, MultiLiveGuestMuteAudioEvent.class, new AqS179S0100000_13(this, 163));
            dataChannel.ov0(this, MultiGuestAudioVolumeEvent.class, new AqS179S0100000_13(this, 164));
            dataChannel.lv0(this, LinkReceiveEnlargeMessageEvent.class, new AqS179S0100000_13(this, 165));
            dataChannel.ov0(this, MicClickableEvent.class, new AqS179S0100000_13(this, 166));
        }
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel = this.LLILII;
        if (multiGuestLinkedPreviewViewModel != null && (liveData5 = (LiveData) multiGuestLinkedPreviewViewModel.LJLJLLL.getValue()) != null) {
            liveData5.observe(this, new AObserverS81S0100000_13(this, 26));
        }
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel2 = this.LLILII;
        if (multiGuestLinkedPreviewViewModel2 != null && (liveData4 = (LiveData) multiGuestLinkedPreviewViewModel2.LJLLILLLL.getValue()) != null) {
            liveData4.observe(this, new AObserverS81S0100000_13(this, 27));
        }
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel3 = this.LLILII;
        if (multiGuestLinkedPreviewViewModel3 != null && (liveData3 = (LiveData) multiGuestLinkedPreviewViewModel3.LJLLJ.getValue()) != null) {
            liveData3.observe(this, new AObserverS81S0100000_13(this, 28));
        }
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel4 = this.LLILII;
        if (multiGuestLinkedPreviewViewModel4 != null && (liveData2 = (LiveData) multiGuestLinkedPreviewViewModel4.LJLLL.getValue()) != null) {
            liveData2.observe(this, new AObserverS81S0100000_13(this, 29));
        }
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel5 = this.LLILII;
        if (multiGuestLinkedPreviewViewModel5 != null && (liveData = (LiveData) multiGuestLinkedPreviewViewModel5.LJLLLL.getValue()) != null) {
            liveData.observe(this, new AObserverS81S0100000_13(this, 30));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Nl() {
        EnumC74949TbF enumC74949TbF;
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel = (MultiGuestLinkedPreviewViewModel) ViewModelProviders.of(this).get(MultiGuestLinkedPreviewViewModel.class);
        this.LLILII = multiGuestLinkedPreviewViewModel;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && multiGuestLinkedPreviewViewModel != null) {
            multiGuestLinkedPreviewViewModel.LJLJJI = dataChannel;
            LiveData liveData = (LiveData) multiGuestLinkedPreviewViewModel.LJLLILLLL.getValue();
            ZoomService nv0 = multiGuestLinkedPreviewViewModel.nv0();
            if (nv0 != null) {
                enumC74949TbF = nv0.LJIIJJI().LIZLLL(multiGuestLinkedPreviewViewModel.mv0());
            } else {
                enumC74949TbF = null;
            }
            liveData.setValue(enumC74949TbF);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final boolean Sl() {
        boolean z;
        boolean Sl = super.Sl();
        if (Sl) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                MultiGuestDataHolder Al = Al();
                if (Al != null) {
                    z = Al.LIZLLL;
                } else {
                    z = true;
                }
                dataChannel.qv0(MultiLiveGuestMuteAudioEvent.class, new C74631TQt(z, "business_mute_manage_panel"));
            }
            MultiGuestDataHolder Al2 = Al();
            if (Al2 != null) {
                C74824TYe.LIZ.LJJ(Al2.LJJIJ, Al2.LJJJJI, "guest_connection_panel", !Al2.LIZLLL);
            }
        }
        return Sl;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final boolean Tl() {
        return super.Tl();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Zl() {
        super.Zl();
        C2A7 c2a7 = this.LLIILII;
        if (c2a7 != null) {
            C87277YNd.LJJIJ(c2a7);
        }
        C2A7 c2a72 = this.LLD;
        if (c2a72 != null) {
            C87277YNd.LJJIJ(c2a72);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        Boolean bool;
        boolean z;
        Object obj;
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        MutableLiveData<Boolean> mutableLiveData;
        C74951TbH.LJI();
        if (this.LLILLIZIL) {
            MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel = this.LLILII;
            if (multiGuestLinkedPreviewViewModel == null || (iv0 = multiGuestLinkedPreviewViewModel.iv0()) == null || (c74961TbR = iv0.LIZ) == null || (mutableLiveData = c74961TbR.LIZ) == null || (bool = mutableLiveData.getValue()) == null) {
                bool = Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            boolean z2 = false;
            if (C29306Beo.LJIILLIIL(false) && C29306Beo.LJJIFFI(Boolean.valueOf(booleanValue))) {
                z = true;
            } else {
                z = false;
            }
            if (C29306Beo.LJJIFFI(false) && C29306Beo.LJIILLIIL(Boolean.valueOf(booleanValue))) {
                z2 = true;
            }
            DataChannel dataChannel = this.dataChannel;
            InterfaceC24140x8 Hl = Hl();
            if (Hl != null) {
                obj = Hl.getAttachedComposerManager();
            } else {
                obj = null;
            }
            C74951TbH.LJ(dataChannel, z, z2, booleanValue, obj);
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void initView() {
        Object obj;
        super.initView();
        C2A7 c2a7 = this.LLIILII;
        if (c2a7 != null) {
            C29306Beo.LJJJLZIJ(c2a7, this);
        }
        C2A7 c2a72 = this.LLIILZL;
        if (c2a72 != null) {
            C29306Beo.LJJJLZIJ(c2a72, this);
        }
        InterfaceC24140x8 Hl = Hl();
        InterfaceC31981Ni interfaceC31981Ni = null;
        if (Hl != null) {
            obj = Hl.getAttachedComposerManager();
        } else {
            obj = null;
        }
        if (obj instanceof InterfaceC31981Ni) {
            interfaceC31981Ni = (InterfaceC31981Ni) obj;
        }
        if (interfaceC31981Ni != null) {
            interfaceC31981Ni.LJIJ(false);
        }
        this.LLIIIILZ = false;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Channel<Integer> hv0;
        Integer value;
        TQU LIZLLL;
        super.onPause();
        MultiGuestLinkedPreviewViewModel multiGuestLinkedPreviewViewModel = this.LLILII;
        if (multiGuestLinkedPreviewViewModel == null || (hv0 = multiGuestLinkedPreviewViewModel.hv0()) == null || (value = hv0.getValue()) == null || value.intValue() != 2) {
            return;
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LIZLLL = R6.LIZLLL()) != null) {
            LIZLLL.LIZ(Boolean.TRUE, "business_mute_pause_manage_panel", "Switch camera back or front, just for fake capture");
        }
        vl(C78857UxB.LJJIIJ(1476788484, "bpea-multiguest_new_link_preview_pause_camera"), false);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        this.LLILL = System.currentTimeMillis();
        cm();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final AbsMultiGuestNewPreviewViewModel Kl() {
        return this.LLILII;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Wl(boolean z) {
        TQU LIZLLL;
        String str;
        super.Wl(z);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LIZLLL = R6.LIZLLL()) != null) {
            if (z) {
                str = "business_mute_click_manage_panel";
            } else {
                str = "business_mute_show_manage_panel";
            }
            LIZLLL.LIZ(Boolean.TRUE, str, "just for fake capture");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Xl(boolean z) {
        TQU LIZLLL;
        String str;
        super.Xl(z);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LIZLLL = R6.LIZLLL()) != null) {
            if (z) {
                str = "business_mute_click_manage_panel";
            } else {
                str = "business_mute_show_manage_panel";
            }
            LIZLLL.LIZ(Boolean.FALSE, str, "just for fake capture");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0152  */
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r11) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.linked.MultiGuestLinkedPreviewFragment.onClick(android.view.View):void");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void wl(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        super.wl(rootView);
        this.LLIILII = (C2A7) rootView.findViewById(R.id.jam);
        this.LLIILZL = (C2A7) rootView.findViewById(R.id.nkw);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
    }
}
