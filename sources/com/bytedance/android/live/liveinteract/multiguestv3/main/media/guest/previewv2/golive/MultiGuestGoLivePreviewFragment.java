package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive;

import X.C03880Dg;
import X.C0NB;
import X.C10A;
import X.C1DD;
import X.C28952BXw;
import X.C29044Baa;
import X.C29306Beo;
import X.C2A7;
import X.C32536Cpo;
import X.C47071t1;
import X.C65300Pk0;
import X.C68322mC;
import X.C74740TUy;
import X.C74749TVh;
import X.C74751TVj;
import X.C74796TXc;
import X.C74824TYe;
import X.C74951TbH;
import X.C74961TbR;
import X.C76633U5t;
import X.C78857UxB;
import X.C78866UxK;
import X.C87277YNd;
import X.C8E;
import X.InterfaceC24140x8;
import X.InterfaceC74795TXb;
import X.InterfaceC75138TeI;
import X.InterfaceC75441TjB;
import X.TQU;
import X.X1D;
import Y.AObserverS73S0100000_5;
import Y.AObserverS81S0100000_13;
import Y.IDTListenerS121S0100000_13;
import Y.IDcS170S0100000_5;
import Y.IDcS93S0200000_5;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestPreviewCameraSwitchToBackEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BeautyControlGroupAppLogSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.datachannel.Event;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestGoLivePreviewFragment extends AbsMultiGuestNewPreviewFragment {
    public MultiGuestGoLivePreviewViewModel LLIILII;
    public C2A7 LLIIZ;
    public FrameLayout LLIL;
    public C74749TVh LLILII;
    public LiveDialog LLILIL;
    public long LLILLL;

    @InterfaceC75138TeI(name = "MULTI_GUEST_DATA_HOLDER")
    public final MultiGuestDataHolder multiGuestDataHolder;
    public final Map<Integer, View> LLILZ = new LinkedHashMap();
    public int LLIILZL = 1;
    public final IDTListenerS121S0100000_13 LLILL = new IDTListenerS121S0100000_13(this, 0);
    public String LLILLIZIL = "outside";
    public String LLILLJJLI = "is_cancel";

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final LiveEffect Gl() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final String Il() {
        return "video_anchor_connect_page";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Ml() {
        int i;
        Channel<Integer> hv0;
        Channel<Integer> hv02;
        Integer value;
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel;
        Channel<Integer> hv03;
        this.LLI = false;
        if (Al() == null) {
            return;
        }
        MultiGuestDataHolder Al = Al();
        if (Al != null) {
            Al.LJIJI("apply");
        }
        MultiGuestDataHolder Al2 = Al();
        if (Al2 != null) {
            i = Al2.LJJIJL;
        } else {
            i = 0;
        }
        MultiGuestDataHolder Al3 = Al();
        int i2 = 2;
        if (Al3 != null && Al3.LJJIJLIJ == 2) {
            MultiGuestDataHolder Al4 = Al();
            if (Al4 != null) {
                Al4.LJJIJL = 2;
            }
            i = 2;
        }
        if (i != 1) {
            if (i == 2 && (multiGuestGoLivePreviewViewModel = this.LLIILII) != null && (hv03 = multiGuestGoLivePreviewViewModel.hv0()) != null) {
                hv03.setValue(1);
            }
        } else {
            MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel2 = this.LLIILII;
            if (multiGuestGoLivePreviewViewModel2 != null && (hv0 = multiGuestGoLivePreviewViewModel2.hv0()) != null) {
                hv0.setValue(2);
            }
        }
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel3 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel3 != null && (hv02 = multiGuestGoLivePreviewViewModel3.hv0()) != null && (value = hv02.getValue()) != null) {
            i2 = value.intValue();
        }
        this.LLIFFJFJJ = i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initPreviewModeAtFirst originPreviewMode=");
        LIZ.append(this.LLIFFJFJJ);
        LIZ.append(" goLiveSource=");
        C1DD.LJFF(LIZ, this.LLIILZL, LIZ, "MultiGuestGoLivePreviewFragment");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final boolean Ol() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILZ).clear();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILZ;
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
    public final String Dl() {
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel != null && multiGuestGoLivePreviewViewModel.ov0()) {
            return "guest_apply_anchor";
        }
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel2 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel2 != null && multiGuestGoLivePreviewViewModel2.pv0()) {
            return "anchor_invite_guest";
        }
        return "preview_page";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Ql() {
        Channel<Integer> mv0;
        Integer value;
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel != null && (mv0 = multiGuestGoLivePreviewViewModel.mv0()) != null && (value = mv0.getValue()) != null) {
            C74796TXc c74796TXc = InterfaceC74795TXb.LIZJ;
            int intValue = value.intValue();
            c74796TXc.getClass();
            if (C74796TXc.LIZ(intValue)) {
                return;
            }
        }
        this.LLILLIZIL = "outside";
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Rl() {
        Channel<Integer> hv0;
        Integer value;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwner() != null) {
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = "voice";
            MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel = this.LLIILII;
            if (multiGuestGoLivePreviewViewModel != null && (hv0 = multiGuestGoLivePreviewViewModel.hv0()) != null && (value = hv0.getValue()) != null && value.intValue() == 2) {
                c68322mC.element = "video";
            }
            C47071t1 c47071t1 = new C47071t1(getContext());
            c47071t1.LJIIL(R.string.n8u, new IDcS93S0200000_5(this, c68322mC, 11));
            c47071t1.LJIIIZ(R.string.n8s, new IDcS170S0100000_5(c68322mC, 25));
            c47071t1.LJIILLIIL(R.string.n8v);
            c47071t1.LJFF(R.string.n8t);
            this.LLILIL = c47071t1.LIZ();
            C74751TVj.LIZIZ((String) c68322mC.element, "show", CardStruct.IStatusCode.DEFAULT);
            LiveDialog liveDialog = this.LLILIL;
            if (liveDialog != null) {
                C78866UxK.LJIJI(liveDialog, 5, true, false, false, LiveTryModeCountDownThresholdSetting.DEFAULT);
            }
            LiveDialog liveDialog2 = this.LLILIL;
            if (liveDialog2 != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog2, new Object[0], "void", new C65300Pk0(false, "()V", "280129475479822198")).LIZ) {
                liveDialog2.show();
            }
        }
        dm("cancel_link");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final boolean Sl() {
        dm("switch_mute_setting");
        MultiGuestDataHolder Al = Al();
        if (Al != null) {
            C74824TYe.LIZ.LJJ(Al.LJJIJ, Al.LJJJJI, "preview_page", !Al.LIZLLL);
        }
        return super.Sl();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final boolean Tl() {
        dm("switch_camera");
        return super.Tl();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Yl() {
        C74961TbR c74961TbR;
        C32536Cpo<C74961TbR> iv0;
        boolean z;
        LiveEffect liveEffect;
        Integer value;
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel != null) {
            Channel<Integer> hv0 = multiGuestGoLivePreviewViewModel.hv0();
            boolean z2 = true;
            if (hv0 == null || (value = hv0.getValue()) == null || value.intValue() != 2) {
                z = false;
            } else {
                z = true;
            }
            MultiGuestDataHolder Al = Al();
            if (Al != null) {
                z2 = Al.LIZLLL;
            }
            int i = C74740TUy.LIZLLL().LJ;
            if (C28952BXw.LIZ()) {
                liveEffect = new LiveEffect();
            } else {
                liveEffect = C74740TUy.LIZLLL().LJFF;
            }
            multiGuestGoLivePreviewViewModel.lv0(z, z2, false, i, liveEffect);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updatePreviewStateDataIntoViewModel = ");
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel2 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel2 != null && (iv0 = multiGuestGoLivePreviewViewModel2.iv0()) != null) {
            c74961TbR = iv0.LIZ;
        } else {
            c74961TbR = null;
        }
        LIZ.append(c74961TbR);
        C0NB.LIZIZ("MultiGuestGoLivePreviewFragment", X1D.LIZIZ(LIZ));
    }

    public final void cm() {
        boolean z;
        Object obj;
        Event<Boolean> nv0;
        Boolean value;
        DataChannel dataChannel = this.dataChannel;
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel = this.LLIILII;
        boolean z2 = false;
        if (multiGuestGoLivePreviewViewModel != null && (nv0 = multiGuestGoLivePreviewViewModel.nv0()) != null && (value = nv0.getValue()) != null) {
            z = value.booleanValue();
        } else {
            z = false;
        }
        MultiGuestDataHolder Al = Al();
        if (Al != null) {
            z2 = Al.LJ;
        }
        InterfaceC24140x8 Hl = Hl();
        if (Hl != null) {
            obj = Hl.getAttachedComposerManager();
        } else {
            obj = null;
        }
        C74951TbH.LIZJ(dataChannel, z, z2, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (X.C74796TXc.LIZ(r0) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (X.C74796TXc.LIZ(r0) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fm() {
        /*
            r10 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewViewModel r0 = r10.LLIILII
            r8 = 1
            if (r0 == 0) goto Le0
            com.bytedance.ies.sdk.datachannel.Channel r0 = r0.mv0()
            if (r0 == 0) goto Le0
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Le0
            X.TXc r1 = X.InterfaceC74795TXb.LIZJ
            int r0 = r0.intValue()
            r1.getClass()
            boolean r0 = X.C74796TXc.LIZ(r0)
            if (r0 != r8) goto Le0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewViewModel r7 = r10.LLIILII
            r4 = 0
            r2 = 1
            if (r7 == 0) goto L45
            com.bytedance.ies.sdk.datachannel.Channel r0 = r7.mv0()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto La9
            X.TXc r1 = X.InterfaceC74795TXb.LIZJ
            int r0 = r0.intValue()
            r1.getClass()
            boolean r0 = X.C74796TXc.LIZ(r0)
            if (r0 != 0) goto La9
        L45:
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewViewModel r6 = r10.LLIILII
            if (r6 == 0) goto L51
            X.TVh r0 = r6.LJLLILLLL
            if (r0 == 0) goto L68
            boolean r0 = r0.LJI
            if (r0 != 0) goto L68
        L51:
            X.2A7 r0 = r10.LLIIZ
            if (r0 == 0) goto L58
            X.C87277YNd.LJJIJ(r0)
        L58:
            X.TVh r0 = r10.LLILII
            if (r0 == 0) goto L67
            boolean r0 = r0.LIZLLL
            if (r0 != r8) goto L67
            X.2A7 r0 = r10.LLD
            if (r0 == 0) goto L67
            X.C87277YNd.LJJIJ(r0)
        L67:
            return
        L68:
            com.bytedance.ies.sdk.datachannel.Channel r0 = r6.mv0()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L84
            X.TXc r1 = X.InterfaceC74795TXb.LIZJ
            int r0 = r0.intValue()
            r1.getClass()
            boolean r0 = X.C74796TXc.LIZ(r0)
            if (r0 != 0) goto L84
            goto L51
        L84:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            X.SsD r2 = X.TMC.LJIL(r4, r2, r0)
            r0 = 180(0xb4, double:8.9E-322)
            X.SsG r1 = r2.LJJLIIIJ(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r2 = r1.LJJJ(r0)
            Y.AfS65S0100000_13 r1 = new Y.AfS65S0100000_13
            r0 = 121(0x79, float:1.7E-43)
            r1.<init>(r6, r0)
            X.3kP r1 = r2.LJJJJZI(r1)
            X.TaY r0 = r6.LJLLI
            r0.LIZ(r1)
            goto L51
        La9:
            X.2zl r9 = new X.2zl
            r9.<init>()
            r0 = 5
            r9.element = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            X.SsD r6 = X.TMC.LJIL(r4, r2, r0)
            int r0 = r9.element
            int r0 = r0 + 1
            long r0 = (long) r0
            X.SsG r1 = r6.LJJLIIIJ(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r6 = r1.LJJJ(r0)
            Y.AfS62S0200000_13 r1 = new Y.AfS62S0200000_13
            r0 = 16
            r1.<init>(r9, r7, r0)
            X.TbT<T> r0 = X.C74963TbT.LJLIL
            X.3kP r1 = r6.LJJJLIIL(r1, r0)
            X.TaY r0 = r7.LJLLI
            r0.LIZ(r1)
            X.SrX r1 = (X.C73411SrX) r1
            r7.LJZI = r1
            goto L45
        Le0:
            X.2A7 r0 = r10.LLD
            if (r0 == 0) goto Le7
            X.C87277YNd.LJJIIZ(r0)
        Le7:
            X.2A7 r0 = r10.LLIIZ
            if (r0 == 0) goto L67
            X.C87277YNd.LJJIIZ(r0)
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.golive.MultiGuestGoLivePreviewFragment.fm():void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        Channel<Integer> mv0;
        Integer value;
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel != null && (mv0 = multiGuestGoLivePreviewViewModel.mv0()) != null && (value = mv0.getValue()) != null) {
            C74796TXc c74796TXc = InterfaceC74795TXb.LIZJ;
            int intValue = value.intValue();
            c74796TXc.getClass();
            if (C74796TXc.LIZ(intValue) && LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) {
                return true;
            }
        }
        this.LLILLIZIL = "return";
        if (LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) {
            cm();
        }
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Ll() {
        Channel<Integer> mv0;
        LiveData liveData;
        LiveData liveData2;
        LiveData liveData3;
        Event<Boolean> nv0;
        LiveData liveData4;
        LiveData liveData5;
        LiveData liveData6;
        super.Ll();
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel != null && (liveData6 = (LiveData) multiGuestGoLivePreviewViewModel.LJZ.getValue()) != null) {
            liveData6.observe(this, new AObserverS73S0100000_5(this, 7));
        }
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel2 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel2 != null && (liveData5 = (LiveData) multiGuestGoLivePreviewViewModel2.LJLLLLLL.getValue()) != null) {
            liveData5.observe(this, new AObserverS73S0100000_5(this, 8));
        }
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel3 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel3 != null && (liveData4 = (LiveData) multiGuestGoLivePreviewViewModel3.LJLLLL.getValue()) != null) {
            liveData4.observe(this, new AObserverS73S0100000_5(this, 9));
        }
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel4 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel4 != null && (nv0 = multiGuestGoLivePreviewViewModel4.nv0()) != null) {
            nv0.observe(this, new AObserverS81S0100000_13(this, 21));
        }
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel5 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel5 != null && (liveData3 = (LiveData) multiGuestGoLivePreviewViewModel5.LJLJLLL.getValue()) != null) {
            liveData3.observe(this, new AObserverS81S0100000_13(this, 22));
        }
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel6 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel6 != null && (liveData2 = (LiveData) multiGuestGoLivePreviewViewModel6.LJLJL.getValue()) != null) {
            liveData2.observe(this, new AObserverS81S0100000_13(this, 23));
        }
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel7 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel7 != null && (liveData = (LiveData) multiGuestGoLivePreviewViewModel7.LJLJJLL.getValue()) != null) {
            liveData.observe(this, new AObserverS81S0100000_13(this, 24));
        }
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel8 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel8 != null && (mv0 = multiGuestGoLivePreviewViewModel8.mv0()) != null) {
            mv0.observe(this, new AObserverS81S0100000_13(this, 25));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Nl() {
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel = (MultiGuestGoLivePreviewViewModel) ViewModelProviders.of(this).get(MultiGuestGoLivePreviewViewModel.class);
        this.LLIILII = multiGuestGoLivePreviewViewModel;
        if (multiGuestGoLivePreviewViewModel != null) {
            DataChannel dataChannel = this.dataChannel;
            C74749TVh c74749TVh = this.LLILII;
            int i = this.LLIILZL;
            multiGuestGoLivePreviewViewModel.LJLJJI = dataChannel;
            multiGuestGoLivePreviewViewModel.LJLLILLLL = c74749TVh;
            multiGuestGoLivePreviewViewModel.mv0().setValue(Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final boolean Pl() {
        Channel<Integer> mv0;
        Integer value;
        DataChannel dataChannel;
        C32536Cpo<C74961TbR> iv0;
        C74961TbR c74961TbR;
        boolean Pl = super.Pl();
        if (Pl) {
            MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel = this.LLIILII;
            boolean z = false;
            if (multiGuestGoLivePreviewViewModel != null && (mv0 = multiGuestGoLivePreviewViewModel.mv0()) != null && (value = mv0.getValue()) != null) {
                C74796TXc c74796TXc = InterfaceC74795TXb.LIZJ;
                int intValue = value.intValue();
                c74796TXc.getClass();
                if (C74796TXc.LIZ(intValue) && (dataChannel = this.dataChannel) != null) {
                    MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel2 = this.LLIILII;
                    if (multiGuestGoLivePreviewViewModel2 != null && (iv0 = multiGuestGoLivePreviewViewModel2.iv0()) != null && (c74961TbR = iv0.LIZ) != null) {
                        z = c74961TbR.LIZJ;
                    }
                    dataChannel.qv0(MultiGuestPreviewCameraSwitchToBackEvent.class, Boolean.valueOf(z));
                }
            }
        }
        return Pl;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Zl() {
        super.Zl();
        C2A7 c2a7 = this.LLIIZ;
        if (c2a7 != null) {
            C87277YNd.LJJIJ(c2a7);
        }
        C74796TXc c74796TXc = InterfaceC74795TXb.LIZJ;
        int i = this.LLIILZL;
        c74796TXc.getClass();
        if (!C74796TXc.LIZ(i)) {
            View view = this.LJZL;
            if (view != null) {
                view.setAlpha(0.0f);
            }
            C29306Beo.LJJJJJL(-50, this.LJLLL);
        }
        C74749TVh c74749TVh = this.LLILII;
        if (c74749TVh != null && c74749TVh.LIZ) {
            C76633U5t c76633U5t = this.LJLLI;
            if (c76633U5t != null) {
                C29306Beo.LJJLJLI(c76633U5t);
            }
        } else {
            C76633U5t c76633U5t2 = this.LJLLI;
            if (c76633U5t2 != null) {
                C87277YNd.LJJIIZ(c76633U5t2);
            }
        }
        C74749TVh c74749TVh2 = this.LLILII;
        if (c74749TVh2 != null && c74749TVh2.LIZLLL) {
            C2A7 c2a72 = this.LLD;
            if (c2a72 != null) {
                C29306Beo.LJJLJLI(c2a72);
                return;
            }
            return;
        }
        C2A7 c2a73 = this.LLD;
        if (c2a73 == null) {
            return;
        }
        C29306Beo.LJI(c2a73);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        cm();
        super.dismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void initView() {
        super.initView();
        C2A7 c2a7 = this.LLIIZ;
        if (c2a7 != null) {
            C29306Beo.LJJJLZIJ(c2a7, this);
        }
        C2A7 c2a72 = this.LLIIZ;
        if (c2a72 != null) {
            C87277YNd.LJJIIZ(c2a72);
        }
        C2A7 c2a73 = this.LLD;
        if (c2a73 != null) {
            C29306Beo.LJJJLZIJ(c2a73, this);
        }
        C2A7 c2a74 = this.LLD;
        if (c2a74 != null) {
            C87277YNd.LJJIIZ(c2a74);
        }
        ViewGroup viewGroup = this.LJLLL;
        if (viewGroup != null) {
            C29306Beo.LJJJLZIJ(viewGroup, this);
        }
        FrameLayout frameLayout = this.LLIL;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(this.LLILL);
        }
        this.LLIIIILZ = true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        Event<Boolean> nv0;
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel;
        super.onDestroy();
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel2 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel2 != null) {
            multiGuestGoLivePreviewViewModel2.kv0();
        }
        C74824TYe c74824TYe = C74824TYe.LIZ;
        MultiGuestDataHolder Al = Al();
        if (Al != null) {
            str = Al.LJJJJI;
        } else {
            str = null;
        }
        LiveEffect liveEffect = C74740TUy.LIZLLL().LJFF;
        long j = C74740TUy.LIZLLL().LJ;
        MultiGuestDataHolder Al2 = Al();
        if (Al2 != null) {
            z = Al2.LIZLLL;
        } else {
            z = false;
        }
        boolean z4 = !z;
        MultiGuestDataHolder Al3 = Al();
        if (Al3 != null) {
            z2 = Al3.LJ;
        } else {
            z2 = false;
        }
        boolean z5 = !z2;
        MultiGuestDataHolder Al4 = Al();
        if (Al4 != null) {
            z3 = Al4.LJIIIIZZ;
        } else {
            z3 = false;
        }
        c74824TYe.LJJJJZ(str, liveEffect, j, z4, z5, z3, this.LLILLIZIL, this.LLILLJJLI, System.currentTimeMillis() - this.LLILLL);
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel3 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel3 != null && (nv0 = multiGuestGoLivePreviewViewModel3.nv0()) != null && o.LJ(nv0.getValue(), Boolean.TRUE) && (multiGuestGoLivePreviewViewModel = this.LLIILII) != null) {
            multiGuestGoLivePreviewViewModel.jv0("business_mute_close_preview_panel");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder == null) {
            return;
        }
        multiGuestDataHolder.LJIIIZ = false;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Channel<Integer> hv0;
        Integer value;
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel;
        Event<Boolean> nv0;
        TQU LIZLLL;
        super.onPause();
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel2 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel2 == null || (hv0 = multiGuestGoLivePreviewViewModel2.hv0()) == null || (value = hv0.getValue()) == null || value.intValue() != 2 || (multiGuestGoLivePreviewViewModel = this.LLIILII) == null || (nv0 = multiGuestGoLivePreviewViewModel.nv0()) == null || !o.LJ(nv0.getValue(), Boolean.FALSE)) {
            return;
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LIZLLL = R6.LIZLLL()) != null) {
            LIZLLL.LIZ(Boolean.TRUE, "business_mute_pause_preview_panel", "Switch camera back or front, just for fake capture");
        }
        vl(C78857UxB.LJJIIJ(1476788484, "bpea-multiguest_new_preview_close_camera"), false);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        this.LLILLL = System.currentTimeMillis();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final AbsMultiGuestNewPreviewViewModel Kl() {
        return this.LLIILII;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Wl(boolean z) {
        TQU LIZLLL;
        String str;
        super.Wl(z);
        MultiGuestDataHolder Al = Al();
        if (Al != null) {
            Al.LJ = false;
        }
        MultiGuestDataHolder Al2 = Al();
        if (Al2 != null) {
            Al2.LJJIJL = 2;
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LIZLLL = R6.LIZLLL()) != null) {
            if (z) {
                str = "business_mute_click_preview_panel";
            } else {
                str = "business_mute_open_preview_panel";
            }
            LIZLLL.LIZ(Boolean.TRUE, str, "just for fake capture");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void Xl(boolean z) {
        TQU LIZLLL;
        String str;
        super.Xl(z);
        MultiGuestDataHolder Al = Al();
        if (Al != null) {
            Al.LJ = true;
        }
        MultiGuestDataHolder Al2 = Al();
        if (Al2 != null) {
            Al2.LJJIJL = 1;
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LIZLLL = R6.LIZLLL()) != null) {
            if (z) {
                str = "business_mute_click_preview_panel";
            } else {
                str = "business_mute_open_preview_panel";
            }
            LIZLLL.LIZ(Boolean.FALSE, str, "just for fake capture");
        }
    }

    public final void dm(String str) {
        C74751TVj.LJII(str, xl());
    }

    public final boolean em(View view) {
        MultiGuestDataHolder Al;
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel;
        Channel<Integer> mv0;
        Integer value;
        C74749TVh c74749TVh;
        if ((view != null && (view.getId() == R.id.cc0 || view.getId() == R.id.dxe)) || (Al = Al()) == null || !C78857UxB.LJJJI(Al.LJJIJLIJ) || (multiGuestGoLivePreviewViewModel = this.LLIILII) == null || (mv0 = multiGuestGoLivePreviewViewModel.mv0()) == null || (value = mv0.getValue()) == null) {
            return false;
        }
        C74796TXc c74796TXc = InterfaceC74795TXb.LIZJ;
        int intValue = value.intValue();
        c74796TXc.getClass();
        if (!C74796TXc.LIZ(intValue) || (c74749TVh = this.LLILII) == null || !c74749TVh.LJI) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder == null) {
            return;
        }
        multiGuestDataHolder.LJIIIZ = true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel;
        if (em(view) && (multiGuestGoLivePreviewViewModel = this.LLIILII) != null) {
            multiGuestGoLivePreviewViewModel.qv0();
        }
        super.onClick(view);
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null || valueOf.intValue() != R.id.dxe) {
            return;
        }
        this.LLILLIZIL = "confirm_icon";
        this.LLILLJJLI = "connection";
        MultiGuestGoLivePreviewViewModel multiGuestGoLivePreviewViewModel2 = this.LLIILII;
        if (multiGuestGoLivePreviewViewModel2 != null) {
            multiGuestGoLivePreviewViewModel2.sv0();
        }
        dm("go_live");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment
    public final void wl(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        super.wl(rootView);
        this.LLIIZ = (C2A7) rootView.findViewById(R.id.dxe);
        this.LLIL = (FrameLayout) rootView.findViewById(R.id.c9j);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        fm();
    }
}
