package com.bytedance.android.livesdk.broadcast.obs;

import X.AbstractC30130Bs6;
import X.ActivityC45651qj;
import X.BCX;
import X.BZI;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C28787BRn;
import X.C29306Beo;
import X.C29726Bla;
import X.C29867Bnr;
import X.C29935Box;
import X.C29S;
import X.C30087BrP;
import X.C30188Bt2;
import X.C30317Bv7;
import X.C30326BvG;
import X.C30561Bz3;
import X.C30627C0h;
import X.C30791C6p;
import X.C30876C9w;
import X.C32537Cpp;
import X.C32811Qn;
import X.C3C5;
import X.C50;
import X.C61898ORa;
import X.C76800UCe;
import X.C78897Uxp;
import X.C78949Uyf;
import X.C7N;
import X.C90903hW;
import X.CN1;
import X.EnumC30204BtI;
import X.InterfaceC27469AqH;
import X.InterfaceC30105Brh;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
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
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.broadcast.obs.layer.ObsLayeredElementManager;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCheckContentViewAttachedSetting;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class OBSBroadcastInteractionFragment extends BaseFragment implements InterfaceC30105Brh, InterfaceC27469AqH {
    public Room LJLILLLLZI;
    public DataChannel LJLJI;
    public LayeredWidgetManager LJLJJI;
    public C29935Box LJLJJL;
    public C30087BrP LJLJJLL;
    public AbstractC30130Bs6 LJLJL;
    public Runnable LJLJLJ;
    public C30561Bz3 LJLJLLL;
    public C30188Bt2 LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final WidgetCreateTimeUtil LJLIL = new WidgetCreateTimeUtil(null, 1, 0 == true ? 1 : 0);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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
    public final void c8(int i) {
    }

    @Override // X.InterfaceC30105Brh
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC30105Brh
    public final void continueAfterWidgetLoaded() {
        postOnViewModulePrepared(this.LJLJLJ);
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
        C30087BrP c30087BrP = this.LJLJJLL;
        if (c30087BrP != null) {
            c30087BrP.onBackPressed();
            return true;
        }
        o.LJIJI("commonInteractionFunctionHelper");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C30087BrP c30087BrP = this.LJLJJLL;
        if (c30087BrP != null) {
            c30087BrP.LJI();
            ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).removeNetworkChangeObserver(this.LJLL);
            this.LJLL = null;
            super.onDestroy();
            LayeredWidgetManager layeredWidgetManager = this.LJLJJI;
            if (layeredWidgetManager != null) {
                C30317Bv7.LIZIZ(layeredWidgetManager);
                C30317Bv7.LJFF(3);
                return;
            } else {
                o.LJIJI("mWidgetManager");
                throw null;
            }
        }
        o.LJIJI("commonInteractionFunctionHelper");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final void loadIndependentBehaviors() {
        Boolean bool;
        long j;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            Room room = this.LJLILLLLZI;
            if (room != null) {
                if (((IShareService) CN1.LIZ(IShareService.class)).Qn0(room)) {
                    EnumC30204BtI enumC30204BtI = EnumC30204BtI.SHARE;
                    DataChannel dataChannel = this.LJLJI;
                    if (dataChannel != null) {
                        C29867Bnr bW = C7N.LJIJJ().bW(mo49getActivity, getContext(), LiveMode.THIRD_PARTY, this);
                        o.LJIIIIZZ(bW, "shareService.getShareBeh…veMode.THIRD_PARTY, this)");
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
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
        if (iRoomFunctionService != null) {
            iRoomFunctionService.Lk();
            C30627C0h c30627C0h = C30627C0h.LJLIL;
            DataChannel dataChannel2 = this.LJLJI;
            if (dataChannel2 != null) {
                Room room2 = (Room) dataChannel2.kv0(RoomChannel.class);
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
            DataChannel dataChannel3 = this.LJLJI;
            if (dataChannel3 != null) {
                iRoomFunctionService2.nj0(dataChannel3);
            } else {
                o.LJIJI("mDataChannel");
                throw null;
            }
        }
        Room room3 = this.LJLILLLLZI;
        if (room3 != null) {
            if (C78897Uxp.LJJIJLIJ(room3)) {
                IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class);
                DataChannel dataChannel4 = this.LJLJI;
                if (dataChannel4 != null) {
                    Room room4 = this.LJLILLLLZI;
                    if (room4 != null) {
                        iGamePartnershipService.qn(room4.getId(), dataChannel4);
                        return;
                    } else {
                        o.LJIJI("mRoom");
                        throw null;
                    }
                }
                o.LJIJI("mDataChannel");
                throw null;
            }
            return;
        }
        o.LJIJI("mRoom");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLJLJ = null;
        C29935Box c29935Box = this.LJLJJL;
        if (c29935Box != null) {
            DialogInterface dialogInterface = c29935Box.LJFF;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            this.LJLIL.send();
            C30087BrP c30087BrP = this.LJLJJLL;
            if (c30087BrP != null) {
                c30087BrP.LJII();
                ((LinkedHashMap) this.LJLLI).clear();
                return;
            } else {
                o.LJIJI("commonInteractionFunctionHelper");
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
        C30561Bz3 c30561Bz3 = this.LJLJLLL;
        if (c30561Bz3 != null) {
            return c30561Bz3.LIZ(event, new C32811Qn(_$_findCachedViewById(R.id.hif).getWidth(), _$_findCachedViewById(R.id.hif).getHeight(), _$_findCachedViewById(R.id.hif).getTop(), _$_findCachedViewById(R.id.hif).getLeft()));
        }
        o.LJIJI("liveBroadcastGestureDetector");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final void R2(Layer2PriorityManager layer2PriorityManager) {
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
        if (ToolBarRefactor.enable()) {
            LayeredWidgetManager layeredWidgetManager = this.LJLJJI;
            if (layeredWidgetManager != null) {
                IToolbarService LJJ = C7N.LJJ();
                DataChannel dataChannel = this.LJLJI;
                if (dataChannel != null) {
                    layeredWidgetManager.load(R.id.lcv, LJJ.EA(null, dataChannel), false);
                } else {
                    o.LJIJI("mDataChannel");
                    throw null;
                }
            } else {
                o.LJIJI("mWidgetManager");
                throw null;
            }
        } else {
            LayeredWidgetManager layeredWidgetManager2 = this.LJLJJI;
            if (layeredWidgetManager2 != null) {
                Class<? extends LiveRecyclableWidget> Uu0 = C7N.LJJ().Uu0();
                ArrayList arrayList = new ArrayList();
                arrayList.add(EnumC30204BtI.ANCHOR_PARTNERSHIP_DROPS);
                arrayList.add(EnumC30204BtI.ANCHOR_PARTNERSHIP);
                arrayList.add(EnumC30204BtI.SLOT);
                arrayList.add(EnumC30204BtI.ANCHOR_SUBSCRIPTION);
                arrayList.add(EnumC30204BtI.CUSTOM_POLL);
                arrayList.add(EnumC30204BtI.MORE);
                layeredWidgetManager2.load(R.id.lcv, Uu0, false, C61898ORa.LJJII(new C29726Bla(SystemClock.elapsedRealtime()), new Object[]{arrayList}));
            } else {
                o.LJIJI("mWidgetManager");
                throw null;
            }
        }
        LayeredWidgetManager layeredWidgetManager3 = this.LJLJJI;
        if (layeredWidgetManager3 != null) {
            layeredWidgetManager3.load(R.id.dno, C7N.LJIJJLI().getFreeFrameSlotWidget());
            LayeredWidgetManager layeredWidgetManager4 = this.LJLJJI;
            if (layeredWidgetManager4 != null) {
                layeredWidgetManager4.load(R.id.fvk, ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLiveCenterEntranceWidget());
                DataChannel dataChannel2 = this.LJLJI;
                if (dataChannel2 != null) {
                    if (C30791C6p.LIZ((Room) dataChannel2.kv0(RoomChannel.class))) {
                        LayeredWidgetManager layeredWidgetManager5 = this.LJLJJI;
                        if (layeredWidgetManager5 != null) {
                            layeredWidgetManager5.load(R.id.gyq, new NetSpeedMonitorWidget());
                        } else {
                            o.LJIJI("mWidgetManager");
                            throw null;
                        }
                    }
                    if (C29306Beo.LJJIFFI(null)) {
                        BZI LIZ = C28787BRn.LIZ("livesdk_live_center_icon");
                        LIZ.LJIIZILJ();
                        LIZ.LIZJ("click");
                        LIZ.LJJIIJZLJL();
                        return;
                    }
                    return;
                }
                o.LJIJI("mDataChannel");
                throw null;
            }
            o.LJIJI("mWidgetManager");
            throw null;
        }
        o.LJIJI("mWidgetManager");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final void handleCopyrightViolation(RemindMessage remindMessage) {
        o.LJIIIZ(remindMessage, "remindMessage");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C30087BrP c30087BrP = this.LJLJJLL;
        if (c30087BrP != null) {
            c30087BrP.LIZLLL(bundle);
            this.LJLL = new C30188Bt2(this);
            ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).observerNetworkChange(this.LJLL);
            return;
        }
        o.LJIJI("commonInteractionFunctionHelper");
        throw null;
    }

    public final void postOnViewModulePrepared(Runnable runnable) {
        if (getView() != null && runnable != null) {
            this.LJLJLJ = null;
            View view = getView();
            if (view != null) {
                view.post(new ARunnableS41S0100000_5(runnable, 53));
                return;
            }
            return;
        }
        this.LJLJLJ = runnable;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        LayeredConstraintLayout layeredConstraintLayout = (LayeredConstraintLayout) view;
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            LayeredWidgetManager of = LayeredWidgetManager.Companion.of(false, this, view, LiveWidgetNonOpProvider.Companion.getInstance(), C30326BvG.LIZ, new ObsLayeredElementManager(context, this, layeredConstraintLayout, dataChannel));
            of.mWidgetCreateTimeListener = this.LJLIL;
            of.setCheckContentViewAttached(LiveCheckContentViewAttachedSetting.INSTANCE.getValue());
            this.LJLJJI = of;
            C30317Bv7.LJI(3, of);
            LayeredWidgetManager layeredWidgetManager = this.LJLJJI;
            if (layeredWidgetManager != null) {
                C30317Bv7.LIZ(3, layeredWidgetManager);
                IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
                Context context2 = getContext();
                LayeredWidgetManager layeredWidgetManager2 = this.LJLJJI;
                if (layeredWidgetManager2 != null) {
                    iBroadcastService.createCommonInteractionFunctionHelper(context2, this, this, view, layeredWidgetManager2);
                    Context context3 = getContext();
                    LayeredWidgetManager layeredWidgetManager3 = this.LJLJJI;
                    if (layeredWidgetManager3 != null) {
                        C30087BrP c30087BrP = new C30087BrP(context3, this, this, view, layeredWidgetManager3);
                        DataChannel dataChannel2 = this.LJLJI;
                        if (dataChannel2 != null) {
                            AbstractC30130Bs6 abstractC30130Bs6 = this.LJLJL;
                            if (abstractC30130Bs6 != null) {
                                c30087BrP.LJIIIZ(dataChannel2, abstractC30130Bs6);
                                c30087BrP.LJIIIIZZ(view, bundle);
                                this.LJLJJLL = c30087BrP;
                                Room room = this.LJLILLLLZI;
                                if (room != null) {
                                    Context context4 = getContext();
                                    DataChannel dataChannel3 = this.LJLJI;
                                    if (dataChannel3 != null) {
                                        C29935Box c29935Box = new C29935Box(room, this, view, context4, dataChannel3);
                                        c29935Box.LIZ();
                                        this.LJLJJL = c29935Box;
                                        C50 c50 = (C50) _$_findCachedViewById(R.id.h9c);
                                        DataChannel dataChannel4 = this.LJLJI;
                                        if (dataChannel4 != null) {
                                            c50.setDataChannel(dataChannel4);
                                            ((C50) _$_findCachedViewById(R.id.h9c)).setGestureDetectLayout((C30876C9w) _$_findCachedViewById(R.id.hif));
                                            DataChannel dataChannel5 = this.LJLJI;
                                            if (dataChannel5 != null) {
                                                this.LJLJLLL = new C30561Bz3(dataChannel5);
                                                return;
                                            } else {
                                                o.LJIJI("mDataChannel");
                                                throw null;
                                            }
                                        }
                                        o.LJIJI("mDataChannel");
                                        throw null;
                                    }
                                    o.LJIJI("mDataChannel");
                                    throw null;
                                }
                                o.LJIJI("mRoom");
                                throw null;
                            }
                            o.LJIJI("mLiveStatusListener");
                            throw null;
                        }
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                    o.LJIJI("mWidgetManager");
                    throw null;
                }
                o.LJIJI("mWidgetManager");
                throw null;
            }
            o.LJIJI("mWidgetManager");
            throw null;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.android.livesdkapi.depend.model.live.LiveMode, O] */
    public final void vl(DataChannel dataChannel, AbstractC30130Bs6 abstractC30130Bs6) {
        this.LJLJI = dataChannel;
        this.LJLJL = abstractC30130Bs6;
        Object kv0 = dataChannel.kv0(RoomChannel.class);
        o.LJI(kv0);
        this.LJLILLLLZI = (Room) kv0;
        DataChannel dataChannel2 = this.LJLJI;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(BCX.class)).LIZ = LiveMode.THIRD_PARTY;
        } else {
            o.LJIJI("mDataChannel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C30087BrP c30087BrP = this.LJLJJLL;
        if (c30087BrP != null) {
            c30087BrP.LJFF(i, i2, intent);
        } else {
            o.LJIJI("commonInteractionFunctionHelper");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d54, viewGroup, false);
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
