package com.bytedance.android.livesdk.chatroom.ui;

import X.AbstractC12520eO;
import X.AbstractC30130Bs6;
import X.ActivityC45651qj;
import X.BCX;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29306Beo;
import X.C29726Bla;
import X.C29867Bnr;
import X.C29935Box;
import X.C29S;
import X.C30087BrP;
import X.C30189Bt3;
import X.C30317Bv7;
import X.C30627C0h;
import X.C30791C6p;
import X.C30876C9w;
import X.C32537Cpp;
import X.C32811Qn;
import X.C34951Yt;
import X.C3C5;
import X.C61898ORa;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78897Uxp;
import X.C78949Uyf;
import X.C90903hW;
import X.CN1;
import X.EnumC30204BtI;
import X.InterfaceC27469AqH;
import X.InterfaceC30105Brh;
import Y.ARunnableS41S0100000_5;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameBroadcastInteractionFragment extends BaseFragment implements InterfaceC30105Brh, InterfaceC27469AqH {
    public ScreenRecordStatusWidget LJLIL;
    public DataChannel LJLILLLLZI;
    public C30087BrP LJLJI;
    public RecyclableWidgetManager LJLJJI;
    public C29935Box LJLJJL;
    public Room LJLJJLL;
    public AbstractC30130Bs6 LJLJL;
    public LiveRecyclableWidget LJLJLJ;
    public AbstractC12520eO LJLJLLL;
    public Runnable LJLL;
    public final C62822Ol8 LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // X.InterfaceC30105Brh
    public final Fragment getFragment() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GameBroadcastInteractionFragment() {
        new WidgetCreateTimeUtil(null, 1, 0 == true ? 1 : 0);
        this.LJLLI = C221108m2.LIZIZ(C30189Bt3.LJLIL);
    }

    @Override // X.InterfaceC30105Brh
    public final void continueAfterWidgetLoaded() {
        postOnViewModulePrepared(this.LJLL);
    }

    @Override // X.InterfaceC30105Brh
    public final void nj() {
        C29935Box c29935Box = this.LJLJJL;
        if (c29935Box != null) {
            c29935Box.LIZIZ();
        } else {
            o.LJIJI("mLongPressHelper");
            throw null;
        }
    }

    @Override // X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        C30087BrP c30087BrP = this.LJLJI;
        if (c30087BrP != null) {
            c30087BrP.onBackPressed();
            return true;
        }
        o.LJIJI("mCommonInteractionFunctionHelper");
        throw null;
    }

    public final RecyclableWidgetManager vl() {
        RecyclableWidgetManager recyclableWidgetManager = this.LJLJJI;
        if (recyclableWidgetManager != null) {
            return recyclableWidgetManager;
        }
        o.LJIJI("mWidgetManager");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final void loadIndependentBehaviors() {
        Boolean bool;
        long j;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            Room room = this.LJLJJLL;
            if (room != null) {
                User owner = room.getOwner();
                if (owner == null || owner.getSecret() != 1) {
                    EnumC30204BtI enumC30204BtI = EnumC30204BtI.SHARE;
                    DataChannel dataChannel = this.LJLILLLLZI;
                    if (dataChannel != null) {
                        C29867Bnr bW = ((IShareService) CN1.LIZ(IShareService.class)).bW(mo49getActivity, getContext(), LiveMode.SCREEN_RECORD, this);
                        o.LJIIIIZZ(bW, "getService(IShareService…Mode.SCREEN_RECORD, this)");
                        enumC30204BtI.load(dataChannel, bW);
                    } else {
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("mRoom");
                throw null;
            }
        }
        IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null) {
            iBroadcastService.loadPauseLiveButton(dataChannel2);
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
            if (iRoomFunctionService != null) {
                iRoomFunctionService.Lk();
                C30627C0h c30627C0h = C30627C0h.LJLIL;
                DataChannel dataChannel3 = this.LJLILLLLZI;
                if (dataChannel3 != null) {
                    Room room2 = (Room) dataChannel3.kv0(RoomChannel.class);
                    if (room2 != null) {
                        j = room2.getId();
                    } else {
                        j = 0;
                    }
                    bool = Boolean.valueOf(c30627C0h.LIZ(j));
                } else {
                    o.LJIJI("mDataChannel");
                    throw null;
                }
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                IRoomFunctionService iRoomFunctionService2 = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
                DataChannel dataChannel4 = this.LJLILLLLZI;
                if (dataChannel4 != null) {
                    iRoomFunctionService2.nj0(dataChannel4);
                } else {
                    o.LJIJI("mDataChannel");
                    throw null;
                }
            }
            Room room3 = this.LJLJJLL;
            if (room3 != null) {
                if (C78897Uxp.LJJIJLIJ(room3)) {
                    IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class);
                    DataChannel dataChannel5 = this.LJLILLLLZI;
                    if (dataChannel5 != null) {
                        Room room4 = this.LJLJJLL;
                        if (room4 != null) {
                            iGamePartnershipService.qn(room4.getId(), dataChannel5);
                        } else {
                            o.LJIJI("mRoom");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                }
                if (GameDualDeviceSetting.INSTANCE.isExperimentGroup()) {
                    EnumC30204BtI enumC30204BtI2 = EnumC30204BtI.DUAL_DEVICE;
                    DataChannel dataChannel6 = this.LJLILLLLZI;
                    if (dataChannel6 != null) {
                        enumC30204BtI2.load(dataChannel6, new C34951Yt());
                        return;
                    } else {
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("mRoom");
            throw null;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C30087BrP c30087BrP = this.LJLJI;
        if (c30087BrP != null) {
            c30087BrP.LJI();
        }
        if (this.LJLJJI != null) {
            C30317Bv7.LIZIZ(vl());
        }
        C30317Bv7.LJFF(4);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C29935Box c29935Box = this.LJLJJL;
        if (c29935Box != null) {
            DialogInterface dialogInterface = c29935Box.LJFF;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            C30087BrP c30087BrP = this.LJLJI;
            if (c30087BrP != null) {
                c30087BrP.LJII();
                this.LJLL = null;
                return;
            } else {
                o.LJIJI("mCommonInteractionFunctionHelper");
                throw null;
            }
        }
        o.LJIJI("mLongPressHelper");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final C30876C9w w() {
        return (C30876C9w) _$_findCachedViewById(R.id.hif);
    }

    @Override // X.InterfaceC30105Brh
    public final boolean LJIIIIZZ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        AbstractC12520eO abstractC12520eO = this.LJLJLLL;
        if (abstractC12520eO != null) {
            return abstractC12520eO.LIZ(event, new C32811Qn(_$_findCachedViewById(R.id.hif).getWidth(), _$_findCachedViewById(R.id.hif).getHeight(), _$_findCachedViewById(R.id.hif).getTop(), _$_findCachedViewById(R.id.hif).getLeft()));
        }
        o.LJIJI("liveBroadcastGestureDetector");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final void R2(Layer2PriorityManager layer2PriorityManager) {
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
        Room room = this.LJLJJLL;
        if (room != null) {
            this.LJLIL = new ScreenRecordStatusWidget(room, (String) this.LJLLI.getValue(), false, null);
            vl().load(R.id.fzi, this.LJLIL);
            vl().load(R.id.hj2, ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createPauseLiveWidget(_$_findCachedViewById(R.id.hiz)));
            if (ToolBarRefactor.enable()) {
                RecyclableWidgetManager vl = vl();
                IToolbarService iToolbarService = (IToolbarService) CN1.LIZ(IToolbarService.class);
                DataChannel dataChannel = this.LJLILLLLZI;
                if (dataChannel != null) {
                    vl.load(R.id.lcv, iToolbarService.EA(null, dataChannel), false);
                } else {
                    o.LJIJI("mDataChannel");
                    throw null;
                }
            } else {
                RecyclableWidgetManager vl2 = vl();
                Class<? extends LiveRecyclableWidget> Uu0 = ((IToolbarService) CN1.LIZ(IToolbarService.class)).Uu0();
                ArrayList arrayList = new ArrayList();
                arrayList.add(EnumC30204BtI.ANCHOR_PARTNERSHIP_DROPS);
                arrayList.add(EnumC30204BtI.ANCHOR_PARTNERSHIP);
                arrayList.add(EnumC30204BtI.SLOT);
                arrayList.add(EnumC30204BtI.ANCHOR_SUBSCRIPTION);
                arrayList.add(EnumC30204BtI.CUSTOM_POLL);
                arrayList.add(EnumC30204BtI.SHARE);
                arrayList.add(EnumC30204BtI.MORE);
                vl2.load(R.id.lcv, Uu0, false, C61898ORa.LJJII(new C29726Bla(SystemClock.elapsedRealtime()), new Object[]{arrayList}));
            }
            vl().load(R.id.fvk, ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLiveCenterEntranceWidget());
            DataChannel dataChannel2 = this.LJLILLLLZI;
            if (dataChannel2 != null) {
                if (C30791C6p.LIZ((Room) dataChannel2.kv0(RoomChannel.class))) {
                    this.LJLJLJ = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createNetSpeedMonitorWidget(true);
                    vl().load(R.id.gyq, this.LJLJLJ);
                    return;
                }
                return;
            }
            o.LJIJI("mDataChannel");
            throw null;
        }
        o.LJIJI("mRoom");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final void c8(int i) {
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.rv0(NetworkStatus.class, Integer.valueOf(i));
        } else {
            o.LJIJI("mDataChannel");
            throw null;
        }
    }

    @Override // X.InterfaceC30105Brh
    public final void handleCopyrightViolation(RemindMessage remindMessage) {
        o.LJIIIZ(remindMessage, "remindMessage");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C30087BrP c30087BrP = this.LJLJI;
        if (c30087BrP != null) {
            c30087BrP.LIZLLL(bundle);
        } else {
            o.LJIJI("mCommonInteractionFunctionHelper");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(X.C30191Bt5 r6) {
        /*
            r5 = this;
            int r0 = r6.LIZ
            r4 = 2131370946(0x7f0a23c2, float:1.8361913E38)
            r3 = 2131370606(0x7f0a226e, float:1.8361223E38)
            if (r0 == 0) goto L2e
            r2 = 1
            if (r0 == r2) goto Le
        Ld:
            return
        Le:
            android.view.View r1 = r5._$_findCachedViewById(r4)
            X.CVT r1 = (X.CVT) r1
            r0 = 8
            r1.setVisibility(r0)
            com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget r0 = r5.LJLIL
            if (r0 == 0) goto L26
            r0.LJLJLLL = r2
            r0.show()
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Ld
        L26:
            android.view.View r0 = r5._$_findCachedViewById(r3)
            X.C29306Beo.LJJLJLI(r0)
            goto Ld
        L2e:
            com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget r0 = r5.LJLIL
            r1 = 0
            if (r0 == 0) goto L3c
            r0.LJLJLLL = r1
            r0.hide()
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L43
        L3c:
            android.view.View r0 = r5._$_findCachedViewById(r3)
            X.C29306Beo.LJI(r0)
        L43:
            android.view.View r0 = r5._$_findCachedViewById(r4)
            X.CVT r0 = (X.CVT) r0
            r0.setVisibility(r1)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.GameBroadcastInteractionFragment.onEvent(X.Bt5):void");
    }

    public final void postOnViewModulePrepared(Runnable runnable) {
        if (getView() != null && runnable != null) {
            this.LJLL = null;
            View view = getView();
            if (view != null) {
                view.post(new ARunnableS41S0100000_5(runnable, 121));
                return;
            }
            return;
        }
        this.LJLL = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0143, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L10;
     */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.GameBroadcastInteractionFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.android.livesdkapi.depend.model.live.LiveMode, O] */
    public final void wl(DataChannel dataChannel, AbstractC30130Bs6 abstractC30130Bs6) {
        this.LJLILLLLZI = dataChannel;
        this.LJLJL = abstractC30130Bs6;
        Object kv0 = dataChannel.kv0(RoomChannel.class);
        o.LJI(kv0);
        this.LJLJJLL = (Room) kv0;
        ((C32537Cpp) dataChannel.gv0(BCX.class)).LIZ = LiveMode.SCREEN_RECORD;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C30087BrP c30087BrP = this.LJLJI;
        if (c30087BrP != null) {
            c30087BrP.LJFF(i, i2, intent);
        } else {
            o.LJIJI("mCommonInteractionFunctionHelper");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3g, viewGroup, false);
        C78949Uyf.LJJJJ(LLLLIILL, this);
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
