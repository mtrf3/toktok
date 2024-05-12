package com.bytedance.android.livesdk.broadcast.video;

import X.AbstractC30130Bs6;
import X.ActivityC45651qj;
import X.AnonymousClass373;
import X.B4U;
import X.B73;
import X.BCX;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C14490hZ;
import X.C16880lQ;
import X.C18200nY;
import X.C1XG;
import X.C20780ri;
import X.C20910rv;
import X.C28720BOy;
import X.C29306Beo;
import X.C29867Bnr;
import X.C29925Bon;
import X.C29927Bop;
import X.C29935Box;
import X.C29S;
import X.C30025BqP;
import X.C30087BrP;
import X.C30159BsZ;
import X.C30183Bsx;
import X.C30219BtX;
import X.C30292Bui;
import X.C30293Buj;
import X.C30295Bul;
import X.C30301Bur;
import X.C30306Buw;
import X.C30317Bv7;
import X.C30326BvG;
import X.C30355Bvj;
import X.C30429Bwv;
import X.C30466BxW;
import X.C30471Bxb;
import X.C30501By5;
import X.C30503By7;
import X.C30561Bz3;
import X.C30735C4l;
import X.C30876C9w;
import X.C31691Mf;
import X.C31701Mg;
import X.C31870Cf4;
import X.C32101Nu;
import X.C32141Ny;
import X.C32537Cpp;
import X.C32811Qn;
import X.C39202Fa2;
import X.C3C5;
import X.C45;
import X.C51;
import X.C5H3;
import X.C73318Sq2;
import X.C74969TbZ;
import X.C76800UCe;
import X.C77068UMm;
import X.C78949Uyf;
import X.C78996UzQ;
import X.C7N;
import X.C90903hW;
import X.CG4;
import X.CGN;
import X.CMT;
import X.CN1;
import X.EnumC30204BtI;
import X.EnumC31509CYf;
import X.InterfaceC08090Tl;
import X.InterfaceC27469AqH;
import X.InterfaceC30283BuZ;
import X.InterfaceC30313Bv3;
import X.InterfaceC30314Bv4;
import X.InterfaceC30442Bx8;
import X.InterfaceC31961Ng;
import X.OSZ;
import X.ScaleGestureDetectorOnScaleGestureListenerC30428Bwu;
import X.UB9;
import X.X1D;
import X.YLE;
import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.ValueAnimator;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.api.IsHandleEffectChannel;
import com.bytedance.android.live.broadcast.api.ZoomCameraScaleEvent;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.live.effect.api.ActionEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGoalOverlayEvent;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.CoHostPermissionCheckEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.broadcast.StartLiveEvent;
import com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastCountDownWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastFilterStyleWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment;
import com.bytedance.android.livesdk.broadcast.video.layer.VideoLayeredElementManager;
import com.bytedance.android.livesdk.dataChannel.HideInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorDebugInfoSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLayoutStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCheckContentViewAttachedSetting;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class VideoBroadcastInteractionFragment extends BaseFragment implements InterfaceC30314Bv4, InterfaceC30313Bv3, InterfaceC27469AqH {
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public UB9 LJLJJL;
    public BaseLinkControlWidget LJLJJLL;
    public BroadcastFilterStyleWidget LJLJL;
    public NetSpeedMonitorWidget LJLJLJ;
    public LiveRecyclableWidget LJLJLLL;
    public LiveRecyclableWidget LJLL;
    public LiveRecyclableWidget LJLLI;
    public C30429Bwv LJLLILLLL;
    public C30087BrP LJLZ;
    public DataChannel LJZ;
    public LayeredWidgetManager LJZI;
    public Room LJZL;
    public C29935Box LLD;
    public AbstractC30130Bs6 LLF;
    public Runnable LLFF;
    public C51 LLFFF;
    public C30876C9w LLFII;
    public VideoLayeredElementManager LLI;
    public C30561Bz3 LLIFFJFJJ;
    public YLE LLII;
    public YLE LLIIII;
    public ScaleGestureDetectorOnScaleGestureListenerC30428Bwu LLIIIILZ;
    public C30025BqP LLIIIJ;
    public C30183Bsx LLIIIL;
    public C14490hZ LLIIIZ;
    public C30219BtX LLIIJI;
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);
    public final C73318Sq2 LJLLJ = new C73318Sq2();
    public final C5H3 LJLLL = C78996UzQ.LJJIJIIJI(C30301Bur.LJLIL);
    public final C5H3 LJLLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 170));
    public final C5H3 LJLLLLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 169));
    public final WidgetCreateTimeUtil LL = new WidgetCreateTimeUtil(null, 1, 0 == true ? 1 : 0);
    public final C5H3 LLFZ = C78996UzQ.LJJIJIIJI(C30295Bul.LJLIL);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJLIL;
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

    public final void Al() {
        if (((Boolean) this.LJLLLL.getValue()).booleanValue()) {
            Dl();
            return;
        }
        LayeredWidgetManager layeredWidgetManager = this.LJZI;
        if (layeredWidgetManager != null) {
            BroadcastCountDownWidget broadcastCountDownWidget = new BroadcastCountDownWidget();
            broadcastCountDownWidget.LJLIL = new InterfaceC30283BuZ() { // from class: X.Bup
                @Override // X.InterfaceC30283BuZ
                public final void LIZ() {
                    VideoBroadcastInteractionFragment.this.Dl();
                }
            };
            layeredWidgetManager.load(R.id.bvx, broadcastCountDownWidget);
            return;
        }
        o.LJIJI("mWidgetManager");
        throw null;
    }

    public final void Dl() {
        if (!this.LJLIL.get()) {
            DataChannel dataChannel = this.LJZ;
            if (dataChannel != null) {
                dataChannel.pv0(StartLiveEvent.class);
                return;
            } else {
                o.LJIJI("mDataChannel");
                throw null;
            }
        }
        this.LJLILLLLZI = true;
    }

    public final void Il() {
        CMT cmt;
        LayeredElementContext layeredElementContext;
        ConstraintProperty constraintPropertyById;
        LayeredElementContext layeredElementContext2;
        ConstraintProperty constraintPropertyById2;
        VideoLayeredElementManager videoLayeredElementManager = this.LLI;
        if (videoLayeredElementManager != null && (layeredElementContext2 = videoLayeredElementManager.getLayeredElementContext()) != null && (constraintPropertyById2 = layeredElementContext2.getConstraintPropertyById(C77068UMm.LIZJ)) != null && constraintPropertyById2.visibility() == 8) {
            return;
        }
        LiveRecyclableWidget liveRecyclableWidget = this.LJLJLLL;
        if (liveRecyclableWidget != null) {
            liveRecyclableWidget.show();
        }
        LiveRecyclableWidget liveRecyclableWidget2 = this.LJLL;
        if (liveRecyclableWidget2 != null) {
            liveRecyclableWidget2.show();
        }
        VideoLayeredElementManager videoLayeredElementManager2 = this.LLI;
        if (videoLayeredElementManager2 != null && (layeredElementContext = videoLayeredElementManager2.getLayeredElementContext()) != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(C77068UMm.LIZJ)) != null) {
            constraintPropertyById.visibility(8);
        }
        C51 c51 = this.LLFFF;
        if (c51 != null) {
            c51.setBlockTouchEvent(true);
        }
        VideoLayeredElementManager videoLayeredElementManager3 = this.LLI;
        if (videoLayeredElementManager3 != null && (cmt = (CMT) videoLayeredElementManager3.getElementById(C77068UMm.LIZIZ)) != null && !cmt.LJLJI) {
            ConstraintProperty constraintPropertyById3 = cmt.LJLIL.getConstraintPropertyById(cmt.getId());
            cmt.LJLJI = true;
            if (constraintPropertyById3 != null) {
                ValueAnimator value = cmt.LJLILLLLZI.getValue();
                value.cancel();
                value.removeAllUpdateListeners();
                value.setFloatValues(constraintPropertyById3.alpha(), 0.5f);
                value.addUpdateListener(new AUListenerS94S0100000_5(constraintPropertyById3, 45));
                value.start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        if (r3 < r9) goto L13;
     */
    @Override // X.InterfaceC30105Brh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void continueAfterWidgetLoaded() {
        /*
            r11 = this;
            java.lang.Runnable r0 = r11.LLFF
            r11.postOnViewModulePrepared(r0)
            long r9 = android.os.SystemClock.elapsedRealtime()
            X.J0d<java.lang.Long> r5 = X.InterfaceC30442Bx8.LJIIL
            java.lang.Object r6 = r5.LIZJ()
            java.lang.Long r6 = (java.lang.Long) r6
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r11.LJZL
            r8 = 0
            java.lang.String r7 = "mRoom"
            if (r0 == 0) goto L98
            long r3 = r0.getId()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L34
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r11.LJZL
            if (r0 == 0) goto L94
            long r3 = r0.getId()
            X.J0d<java.lang.Long> r0 = X.InterfaceC30442Bx8.LJIIJJI
            java.lang.Object r0 = r0.LIZJ()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L6e
        L34:
            X.J0d<java.lang.Long> r2 = X.InterfaceC30442Bx8.LJIIJJI
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r11.LJZL
            if (r0 == 0) goto L90
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.LIZ(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.LIZ(r0)
        L4c:
            java.lang.Class<com.bytedance.android.live.function.IRoomFunctionService> r0 = com.bytedance.android.live.function.IRoomFunctionService.class
            X.0Mx r1 = X.CN1.LIZ(r0)
            com.bytedance.android.live.function.IRoomFunctionService r1 = (com.bytedance.android.live.function.IRoomFunctionService) r1
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r11.LJZ
            if (r0 == 0) goto L8a
            X.CG4 r2 = r1.fb(r0)
            if (r2 == 0) goto L6d
            X.C1H r1 = X.C1H.LIZ
            X.CG5 r0 = new X.CG5
            r0.<init>(r2)
            X.C1H.LIZIZ = r0
            r2.LIZJ(r1)
            r2.start()
        L6d:
            return
        L6e:
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            java.lang.String r0 = "cacheStartTime"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            long r3 = r6.longValue()
            r1 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L34
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 >= 0) goto L34
            goto L4c
        L8a:
            java.lang.String r0 = "mDataChannel"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r8
        L90:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        L94:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        L98:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment.continueAfterWidgetLoaded():void");
    }

    public final void hideFloatFragment() {
        DialogFragment dialogFragment;
        FragmentManager supportFragmentManager;
        C28720BOy c28720BOy;
        C30087BrP c30087BrP = this.LJLZ;
        Fragment fragment = null;
        if (c30087BrP != null) {
            DataChannel dataChannel = c30087BrP.LJLLI;
            if (dataChannel != null) {
                dataChannel.pv0(HideInteractionEvent.class);
                C30159BsZ c30159BsZ = c30087BrP.LJZL;
                if (c30159BsZ != null && (c28720BOy = c30159BsZ.LJLILLLLZI) != null) {
                    c28720BOy.LJFF.dispose();
                    C31870Cf4 c31870Cf4 = c28720BOy.LIZLLL;
                    if (c31870Cf4 != null) {
                        c31870Cf4.LIZ();
                    }
                }
                String fQ = C7N.LJFF().fQ();
                ActivityC45651qj activityC45651qj = c30087BrP.LJLL;
                if (activityC45651qj != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                    fragment = supportFragmentManager.LJJJIL(fQ);
                }
                if ((fragment instanceof DialogFragment) && (dialogFragment = (DialogFragment) fragment) != null) {
                    dialogFragment.dismissAllowingStateLoss();
                    return;
                }
                return;
            }
            o.LJIJI("mDataChannel");
            throw null;
        }
        o.LJIJI("commonInteractionFunctionHelper");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final void nj() {
        C29935Box c29935Box = this.LLD;
        if (c29935Box != null) {
            c29935Box.LIZIZ();
        } else {
            o.LJIJI("mLongPressHelper");
            throw null;
        }
    }

    @Override // X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        C30087BrP c30087BrP = this.LJLZ;
        if (c30087BrP != null) {
            c30087BrP.onBackPressed();
            return true;
        }
        o.LJIJI("commonInteractionFunctionHelper");
        throw null;
    }

    public final ValueAnimator vl() {
        return (ValueAnimator) this.LLFZ.getValue();
    }

    public final void wl() {
        CMT cmt;
        LayeredElementContext layeredElementContext;
        ConstraintProperty constraintPropertyById;
        LiveRecyclableWidget liveRecyclableWidget = this.LJLJLLL;
        if (liveRecyclableWidget != null) {
            liveRecyclableWidget.hide();
        }
        LiveRecyclableWidget liveRecyclableWidget2 = this.LJLL;
        if (liveRecyclableWidget2 != null) {
            liveRecyclableWidget2.hide();
        }
        LiveRecyclableWidget liveRecyclableWidget3 = this.LJLLI;
        if (liveRecyclableWidget3 != null) {
            liveRecyclableWidget3.hide();
        }
        VideoLayeredElementManager videoLayeredElementManager = this.LLI;
        if (videoLayeredElementManager != null && (layeredElementContext = videoLayeredElementManager.getLayeredElementContext()) != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(C77068UMm.LIZJ)) != null) {
            constraintPropertyById.visibility(0);
        }
        C51 c51 = this.LLFFF;
        if (c51 != null) {
            c51.setBlockTouchEvent(false);
        }
        VideoLayeredElementManager videoLayeredElementManager2 = this.LLI;
        if (videoLayeredElementManager2 != null && (cmt = (CMT) videoLayeredElementManager2.getElementById(C77068UMm.LIZIZ)) != null && cmt.LJLJI) {
            ConstraintProperty constraintPropertyById2 = cmt.LJLIL.getConstraintPropertyById(cmt.getId());
            cmt.LJLJI = false;
            if (constraintPropertyById2 != null) {
                ValueAnimator value = cmt.LJLILLLLZI.getValue();
                value.cancel();
                value.removeAllUpdateListeners();
                value.setFloatValues(constraintPropertyById2.alpha(), 1.0f);
                value.addUpdateListener(new AUListenerS94S0100000_5(constraintPropertyById2, 46));
                value.start();
            }
        }
    }

    public final void Gl() {
        BroadcastFilterStyleWidget broadcastFilterStyleWidget;
        if (isViewValid() && (broadcastFilterStyleWidget = this.LJLJL) != null) {
            broadcastFilterStyleWidget.LJZ();
        }
    }

    @Override // X.InterfaceC30313Bv3
    public final AnonymousClass373 Lj() {
        return (AnonymousClass373) _$_findCachedViewById(R.id.kgs);
    }

    @Override // X.InterfaceC30105Brh
    public final void loadIndependentBehaviors() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.EFFECT;
        DataChannel dataChannel = this.LJZ;
        if (dataChannel != null) {
            enumC30204BtI.load(dataChannel, new C30466BxW(context, this));
            InterfaceC31961Ng insertStickerManager = C7N.LJII().getInsertStickerManager();
            if (insertStickerManager != null) {
                DataChannel dataChannel2 = this.LJZ;
                if (dataChannel2 != null) {
                    insertStickerManager.JL(this, dataChannel2);
                } else {
                    o.LJIJI("mDataChannel");
                    throw null;
                }
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                EnumC30204BtI enumC30204BtI2 = EnumC30204BtI.SHARE;
                DataChannel dataChannel3 = this.LJZ;
                if (dataChannel3 != null) {
                    C29867Bnr bW = C7N.LJIJJ().bW(mo49getActivity, context, LiveMode.VIDEO, this);
                    o.LJIIIIZZ(bW, "shareService.getShareBeh…xt, LiveMode.VIDEO, this)");
                    enumC30204BtI2.load(dataChannel3, bW);
                } else {
                    o.LJIJI("mDataChannel");
                    throw null;
                }
            }
            EnumC30204BtI enumC30204BtI3 = EnumC30204BtI.PAUSE_LIVE;
            DataChannel dataChannel4 = this.LJZ;
            if (dataChannel4 != null) {
                enumC30204BtI3.load(dataChannel4, new C45());
                return;
            } else {
                o.LJIJI("mDataChannel");
                throw null;
            }
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        IMessageManager iMessageManager;
        super.onDestroy();
        ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).removeNetworkChangeObserver(this.LLIIJI);
        this.LLIIJI = null;
        ARunnableS41S0100000_5 aRunnableS41S0100000_5 = new ARunnableS41S0100000_5(new C30293Buj(), 0);
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            C39202Fa2.LIZJ().submit(aRunnableS41S0100000_5);
        } else {
            aRunnableS41S0100000_5.run();
        }
        ((CopyOnWriteArrayList) B4U.LIZ().LLIIZ).clear();
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper();
        C1XG.LIZLLL();
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalLogHelper();
        DataChannel dataChannel = this.LJZ;
        if (dataChannel != null) {
            C31701Mg.LIZJ(dataChannel, true);
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
            C32101Nu.LJIILIIL(C31691Mf.LJIIIIZZ, true);
            C31691Mf.LJIIIIZZ = null;
            C30561Bz3 c30561Bz3 = this.LLIFFJFJJ;
            if (c30561Bz3 != null) {
                YLE yle = this.LLII;
                if (yle != null) {
                    c30561Bz3.LIZJ(yle);
                    C30561Bz3 c30561Bz32 = this.LLIFFJFJJ;
                    if (c30561Bz32 != null) {
                        YLE yle2 = this.LLIIII;
                        if (yle2 != null) {
                            c30561Bz32.LIZJ(yle2);
                            C30561Bz3 c30561Bz33 = this.LLIFFJFJJ;
                            if (c30561Bz33 != null) {
                                ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu = this.LLIIIILZ;
                                if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu != null) {
                                    c30561Bz33.LIZJ(scaleGestureDetectorOnScaleGestureListenerC30428Bwu);
                                    C30561Bz3 c30561Bz34 = this.LLIFFJFJJ;
                                    if (c30561Bz34 != null) {
                                        C30025BqP c30025BqP = this.LLIIIJ;
                                        if (c30025BqP != null) {
                                            c30561Bz34.LIZJ(c30025BqP);
                                            C30561Bz3 c30561Bz35 = this.LLIFFJFJJ;
                                            if (c30561Bz35 != null) {
                                                C30183Bsx c30183Bsx = this.LLIIIL;
                                                if (c30183Bsx != null) {
                                                    c30561Bz35.LIZJ(c30183Bsx);
                                                    InterfaceC31961Ng insertStickerManager = C7N.LJII().getInsertStickerManager();
                                                    if (insertStickerManager != null) {
                                                        insertStickerManager.release();
                                                    }
                                                    DataChannel dataChannel2 = this.LJZ;
                                                    if (dataChannel2 != null) {
                                                        dataChannel2.jv0(this);
                                                        C30087BrP c30087BrP = this.LJLZ;
                                                        if (c30087BrP != null) {
                                                            c30087BrP.LJI();
                                                            BluetoothAdapter.getDefaultAdapter().closeProfileProxy(2, C30306Buw.LIZ);
                                                            C30355Bvj.LJIIJJI();
                                                            C32141Ny.LIZLLL();
                                                            C30501By5.LIZ.LIZJ(false, false);
                                                            C30501By5.LIZJ = null;
                                                            LayeredWidgetManager layeredWidgetManager = this.LJZI;
                                                            if (layeredWidgetManager != null) {
                                                                C30317Bv7.LIZIZ(layeredWidgetManager);
                                                                C30317Bv7.LJFF(2);
                                                                if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
                                                                    ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
                                                                    C31691Mf.LIZJ = null;
                                                                }
                                                                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                                                                dataChannelGlobal.getClass();
                                                                dataChannelGlobal.jv0(this);
                                                                C29925Bon c29925Bon = C29925Bon.LJLIL;
                                                                C29925Bon.LJLILLLLZI = null;
                                                                WeakReference<IMessageManager> weakReference = C29925Bon.LJLJI;
                                                                if (weakReference != null && (iMessageManager = weakReference.get()) != null) {
                                                                    iMessageManager.removeMessageListener((OnIMMessageListener) c29925Bon);
                                                                }
                                                                IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                                                                Room room = this.LJZL;
                                                                if (room != null) {
                                                                    iInteractService.yW(room);
                                                                    return;
                                                                } else {
                                                                    o.LJIJI("mRoom");
                                                                    throw null;
                                                                }
                                                            }
                                                            o.LJIJI("mWidgetManager");
                                                            throw null;
                                                        }
                                                        o.LJIJI("commonInteractionFunctionHelper");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mDataChannel");
                                                    throw null;
                                                }
                                                o.LJIJI("liveCenterGestureDetector");
                                                throw null;
                                            }
                                            o.LJIJI("liveBroadcastGestureDetector");
                                            throw null;
                                        }
                                        o.LJIJI("otherGestureDetector");
                                        throw null;
                                    }
                                    o.LJIJI("liveBroadcastGestureDetector");
                                    throw null;
                                }
                                o.LJIJI("cameraGestureDetector");
                                throw null;
                            }
                            o.LJIJI("liveBroadcastGestureDetector");
                            throw null;
                        }
                        o.LJIJI("touchEffectGestureDetector");
                        throw null;
                    }
                    o.LJIJI("liveBroadcastGestureDetector");
                    throw null;
                }
                o.LJIJI("drawGuessGestureDetector");
                throw null;
            }
            o.LJIJI("liveBroadcastGestureDetector");
            throw null;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        CGN LIZ;
        OSZ<Float, Float> LIZLLL;
        super.onDestroyView();
        this.LLFF = null;
        C29935Box c29935Box = this.LLD;
        if (c29935Box != null) {
            DialogInterface dialogInterface = c29935Box.LJFF;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            this.LL.send();
            C30087BrP c30087BrP = this.LJLZ;
            if (c30087BrP != null) {
                c30087BrP.LJII();
                this.LJLLJ.LIZLLL();
                C7N.LJIJI().Hp0();
                C14490hZ c14490hZ = this.LLIIIZ;
                if (c14490hZ != null) {
                    getView();
                    c14490hZ.LIZIZ();
                }
                IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
                DataChannel dataChannel = this.LJZ;
                if (dataChannel != null) {
                    CG4 fb = iRoomFunctionService.fb(dataChannel);
                    if (fb != null && (LIZ = fb.LIZ()) != null && (LIZLLL = LIZ.LIZLLL()) != null) {
                        LivePerformanceManager LIZ2 = B4U.LIZ();
                        LIZ2.getClass();
                        if (LIZ2.LJLJI) {
                            LIZ2.LLJI = LIZLLL;
                        }
                    }
                    IRoomFunctionService iRoomFunctionService2 = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
                    DataChannel dataChannel2 = this.LJZ;
                    if (dataChannel2 != null) {
                        CG4 fb2 = iRoomFunctionService2.fb(dataChannel2);
                        if (fb2 != null) {
                            fb2.destroy();
                        }
                        ((LinkedHashMap) this.LLIIJLIL).clear();
                        return;
                    }
                    o.LJIJI("mDataChannel");
                    throw null;
                }
                o.LJIJI("mDataChannel");
                throw null;
            }
            o.LJIJI("commonInteractionFunctionHelper");
            throw null;
        }
        o.LJIJI("mLongPressHelper");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLIL.set(true);
        try {
            Context context = getContext();
            if (context != null) {
                C16880lQ.LJJLIIIJL(context, (C30503By7) this.LJLLL.getValue());
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unregisterHeadsetReceiver ");
            LIZ.append(e.getMessage());
            C0NB.LJ("VideoBroadcastInteractionFragment", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LiveEffect liveEffect = null;
        if (this.LJLILLLLZI) {
            DataChannel dataChannel = this.LJZ;
            if (dataChannel != null) {
                dataChannel.pv0(StartLiveEvent.class);
                this.LJLILLLLZI = false;
            } else {
                o.LJIJI("mDataChannel");
                throw null;
            }
        }
        DataChannel dataChannel2 = this.LJZ;
        if (dataChannel2 != null) {
            dataChannel2.pv0(CoHostPermissionCheckEvent.class);
            this.LJLIL.set(false);
            try {
                Context context = getContext();
                if (context != null) {
                    BroadcastReceiver broadcastReceiver = (BroadcastReceiver) this.LJLLL.getValue();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED");
                    intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
                    C16880lQ.LJJLIIIJILLIZJL(broadcastReceiver, context, intentFilter);
                    this.LJLLL.getValue().getClass();
                    C30503By7.LIZIZ(context);
                }
            } catch (IllegalArgumentException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("registerHeadsetReceiver ");
                LIZ.append(e.getMessage());
                C0NB.LJ("VideoBroadcastInteractionFragment", X1D.LIZIZ(LIZ));
            }
            C30501By5.LIZ.LIZLLL();
            if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
                InterfaceC08090Tl liveGoalEffectHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                DataChannel dataChannel3 = this.LJZ;
                if (dataChannel3 != null) {
                    liveGoalEffectHelper.getClass();
                    C31691Mf.LIZJ = dataChannel3;
                    if (C31691Mf.LIZLLL() && C31691Mf.LIZIZ()) {
                        if (!C31691Mf.LJIIIZ()) {
                            List<? extends LiveEffect> list = C31691Mf.LIZIZ;
                            if (list != null) {
                                Integer LIZJ = InterfaceC30442Bx8.i2.LIZJ();
                                o.LJIIIIZZ(LIZJ, "LIVE_GOAL_EFFECT_POSITION.value");
                                liveEffect = (LiveEffect) ListProtector.get(list, LIZJ.intValue());
                            }
                            C31691Mf.LIZ(liveEffect);
                        }
                        C31691Mf.LJIILLIIL(false);
                        return;
                    }
                    return;
                }
                o.LJIJI("mDataChannel");
                throw null;
            }
            return;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.LJZ;
        if (dataChannel != null) {
            dataChannel.qv0(ZoomCameraScaleEvent.class, Float.valueOf(0.0f));
        } else {
            o.LJIJI("mDataChannel");
            throw null;
        }
    }

    public final void xl() {
        _$_findCachedViewById(R.id.aix).post(new ARunnableS41S0100000_5(this, 92));
    }

    @Override // X.InterfaceC30105Brh
    public final /* bridge */ /* synthetic */ C30876C9w w() {
        return this.LLFII;
    }

    @Override // X.InterfaceC30105Brh
    public final boolean LJIIIIZZ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        C30471Bxb.LIZ();
        int action = event.getAction() & 255;
        if (action != 1) {
            if (action == 2 && C30471Bxb.LJFF) {
                ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                if (C31691Mf.LJIIIZ()) {
                    DataChannel dataChannel = this.LJZ;
                    if (dataChannel != null) {
                        dataChannel.qv0(LiveGoalOverlayEvent.class, new ActionEvent(true, event.getX(), event.getY()));
                    } else {
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                }
            }
        } else if (C30471Bxb.LJFF) {
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
            if (C31691Mf.LJIIIZ()) {
                DataChannel dataChannel2 = this.LJZ;
                if (dataChannel2 != null) {
                    dataChannel2.qv0(LiveGoalOverlayEvent.class, new ActionEvent(false, event.getX(), event.getY()));
                } else {
                    o.LJIJI("mDataChannel");
                    throw null;
                }
            }
        }
        C30561Bz3 c30561Bz3 = this.LLIFFJFJJ;
        if (c30561Bz3 != null) {
            return c30561Bz3.LIZ(event, new C32811Qn(C30471Bxb.LIZIZ, C30471Bxb.LIZJ, C30471Bxb.LJII, C30471Bxb.LJI));
        }
        o.LJIJI("liveBroadcastGestureDetector");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final void R2(Layer2PriorityManager layer2PriorityManager) {
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
        ARunnableS24S0200000_5 aRunnableS24S0200000_5 = new ARunnableS24S0200000_5(this, layer2PriorityManager, 17);
        DataChannel dataChannel = this.LJZ;
        if (dataChannel != null) {
            B73.LIZIZ(aRunnableS24S0200000_5, dataChannel);
        } else {
            o.LJIJI("mDataChannel");
            throw null;
        }
    }

    @Override // X.InterfaceC30105Brh
    public final void handleCopyrightViolation(RemindMessage remindMessage) {
        o.LJIIIZ(remindMessage, "remindMessage");
        int i = remindMessage.noticeType;
        if (i == 7 || i == 6) {
            CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) this.LJLLLLLL.getValue();
            Context context = getContext();
            Room room = this.LJZL;
            if (room != null) {
                copyrightViolationHelper.LIZ(context, remindMessage, room, this.LJLLJ);
            } else {
                o.LJIJI("mRoom");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C18200nY.LIZ("timer_start", String.valueOf(System.currentTimeMillis()));
        ARunnableS24S0200000_5 aRunnableS24S0200000_5 = new ARunnableS24S0200000_5(this, bundle, 16);
        DataChannel dataChannel = this.LJZ;
        if (dataChannel != null) {
            B73.LIZIZ(aRunnableS24S0200000_5, dataChannel);
            this.LLIIJI = new C30219BtX(this);
            ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).observerNetworkChange(this.LLIIJI);
            return;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    public final void postOnViewModulePrepared(Runnable runnable) {
        if (getView() != null && runnable != null) {
            this.LLFF = null;
            View view = getView();
            if (view != null) {
                view.post(new ARunnableS41S0100000_5(runnable, 93));
                return;
            }
            return;
        }
        this.LLFF = runnable;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.android.livesdkapi.depend.model.live.LiveMode, O] */
    public final void Hl(DataChannel dataChannel, AbstractC30130Bs6 abstractC30130Bs6) {
        this.LJZ = dataChannel;
        this.LLF = abstractC30130Bs6;
        Object kv0 = dataChannel.kv0(RoomChannel.class);
        o.LJI(kv0);
        this.LJZL = (Room) kv0;
        DataChannel dataChannel2 = this.LJZ;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(BCX.class)).LIZ = LiveMode.VIDEO;
            C29925Bon c29925Bon = C29925Bon.LJLIL;
            C29925Bon.LJLILLLLZI = new WeakReference<>(dataChannel);
            WeakReference<IMessageManager> weakReference = new WeakReference<>(dataChannel.kv0(C29927Bop.class));
            C29925Bon.LJLJI = weakReference;
            IMessageManager iMessageManager = weakReference.get();
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(EnumC31509CYf.ACCESS_RECALL_MESSAGE.getIntType(), (OnIMMessageListener) c29925Bon);
            }
            C30292Bui c30292Bui = C30292Bui.LJLIL;
            IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
            Room room = this.LJZL;
            if (room != null) {
                iInteractService.vs(room, c30292Bui);
                return;
            } else {
                o.LJIJI("mRoom");
                throw null;
            }
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // X.InterfaceC30314Bv4
    public final void j1(String str, boolean z) {
        BroadcastFilterStyleWidget broadcastFilterStyleWidget;
        if (!isViewValid() || str == null || str.length() == 0) {
            return;
        }
        if (this.LJLJI && (broadcastFilterStyleWidget = this.LJLJL) != null) {
            broadcastFilterStyleWidget.LJZI(str, z);
        }
        this.LJLJI = true;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [X.TYo, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C30429Bwv c30429Bwv;
        C30735C4l exposureBar;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        LayeredConstraintLayout layeredConstraintLayout = (LayeredConstraintLayout) view;
        DataChannel dataChannel = this.LJZ;
        if (dataChannel != null) {
            VideoLayeredElementManager videoLayeredElementManager = new VideoLayeredElementManager(context, this, layeredConstraintLayout, dataChannel);
            LayeredWidgetManager of = LayeredWidgetManager.Companion.of(false, this, view, LiveWidgetNonOpProvider.Companion.getInstance(), C30326BvG.LIZ, videoLayeredElementManager);
            of.setCheckContentViewAttached(LiveCheckContentViewAttachedSetting.INSTANCE.getValue());
            this.LJZI = of;
            this.LLI = videoLayeredElementManager;
            C30317Bv7.LJI(2, of);
            LayeredWidgetManager layeredWidgetManager = this.LJZI;
            if (layeredWidgetManager != null) {
                C30317Bv7.LIZ(2, layeredWidgetManager);
                Context context2 = getContext();
                LayeredWidgetManager layeredWidgetManager2 = this.LJZI;
                if (layeredWidgetManager2 != null) {
                    C30087BrP c30087BrP = new C30087BrP(context2, this, this, view, layeredWidgetManager2);
                    DataChannel dataChannel2 = this.LJZ;
                    if (dataChannel2 != null) {
                        AbstractC30130Bs6 abstractC30130Bs6 = this.LLF;
                        if (abstractC30130Bs6 != null) {
                            c30087BrP.LJIIIZ(dataChannel2, abstractC30130Bs6);
                            c30087BrP.LJIIIIZZ(view, bundle);
                            this.LJLZ = c30087BrP;
                            Room room = this.LJZL;
                            if (room != null) {
                                Context context3 = getContext();
                                DataChannel dataChannel3 = this.LJZ;
                                if (dataChannel3 != null) {
                                    C29935Box c29935Box = new C29935Box(room, this, view, context3, dataChannel3);
                                    c29935Box.LIZ();
                                    this.LLD = c29935Box;
                                    C51 c51 = this.LLFFF;
                                    if (c51 != null) {
                                        DataChannel dataChannel4 = this.LJZ;
                                        if (dataChannel4 != null) {
                                            c51.setDataChannel(dataChannel4);
                                        } else {
                                            o.LJIJI("mDataChannel");
                                            throw null;
                                        }
                                    }
                                    DataChannel dataChannel5 = this.LJZ;
                                    if (dataChannel5 != null) {
                                        C30501By5.LIZJ = dataChannel5;
                                        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
                                        ViewModelProvider of2 = ViewModelProviders.of(this);
                                        o.LJIIIIZZ(of2, "of(this)");
                                        ?? RG = iRoomFunctionService.RG(of2);
                                        DataChannel dataChannel6 = this.LJZ;
                                        if (dataChannel6 != null) {
                                            ((C32537Cpp) dataChannel6.gv0(C74969TbZ.class)).LIZ = RG;
                                            if (LiveAnchorDebugInfoSetting.INSTANCE.enable()) {
                                                LivePerformanceManager LIZ = B4U.LIZ();
                                                AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(this, 251);
                                                LIZ.getClass();
                                                ((CopyOnWriteArrayList) LIZ.LLIIZ).add(aqS171S0100000_5);
                                                C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.asy));
                                            } else {
                                                C29306Beo.LJI(_$_findCachedViewById(R.id.asy));
                                            }
                                            DataChannel dataChannel7 = this.LJZ;
                                            if (dataChannel7 != null) {
                                                this.LLIFFJFJJ = new C30561Bz3(dataChannel7);
                                                Context context4 = getContext();
                                                DataChannel dataChannel8 = this.LJZ;
                                                if (dataChannel8 != null) {
                                                    this.LLII = new YLE(context4, dataChannel8, 1);
                                                    Context context5 = getContext();
                                                    DataChannel dataChannel9 = this.LJZ;
                                                    if (dataChannel9 != null) {
                                                        this.LLIIII = new YLE(context5, dataChannel9, 2);
                                                        Context context6 = getContext();
                                                        DataChannel dataChannel10 = this.LJZ;
                                                        if (dataChannel10 != null) {
                                                            LayeredConstraintLayout parent_view = (LayeredConstraintLayout) _$_findCachedViewById(R.id.hif);
                                                            o.LJIIIIZZ(parent_view, "parent_view");
                                                            this.LLIIIJ = new C30025BqP(context6, dataChannel10, this, parent_view);
                                                            Context context7 = getContext();
                                                            DataChannel dataChannel11 = this.LJZ;
                                                            if (dataChannel11 != null) {
                                                                this.LLIIIILZ = new ScaleGestureDetectorOnScaleGestureListenerC30428Bwu(context7, dataChannel11, 4, this);
                                                                this.LLIIIL = new C30183Bsx(this.LLFII, 5, new AqS171S0100000_5(this, BuildConfig.VERSION_CODE));
                                                                C30561Bz3 c30561Bz3 = this.LLIFFJFJJ;
                                                                if (c30561Bz3 != null) {
                                                                    YLE yle = this.LLII;
                                                                    if (yle != null) {
                                                                        c30561Bz3.LIZIZ(yle);
                                                                        C30561Bz3 c30561Bz32 = this.LLIFFJFJJ;
                                                                        if (c30561Bz32 != null) {
                                                                            YLE yle2 = this.LLIIII;
                                                                            if (yle2 != null) {
                                                                                c30561Bz32.LIZIZ(yle2);
                                                                                C30561Bz3 c30561Bz33 = this.LLIFFJFJJ;
                                                                                if (c30561Bz33 != null) {
                                                                                    C30025BqP c30025BqP = this.LLIIIJ;
                                                                                    if (c30025BqP != null) {
                                                                                        c30561Bz33.LIZIZ(c30025BqP);
                                                                                        C30561Bz3 c30561Bz34 = this.LLIFFJFJJ;
                                                                                        if (c30561Bz34 != null) {
                                                                                            ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu = this.LLIIIILZ;
                                                                                            if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu != null) {
                                                                                                c30561Bz34.LIZIZ(scaleGestureDetectorOnScaleGestureListenerC30428Bwu);
                                                                                                if (!LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle()) {
                                                                                                    C30561Bz3 c30561Bz35 = this.LLIFFJFJJ;
                                                                                                    if (c30561Bz35 != null) {
                                                                                                        C30183Bsx c30183Bsx = this.LLIIIL;
                                                                                                        if (c30183Bsx != null) {
                                                                                                            c30561Bz35.LIZIZ(c30183Bsx);
                                                                                                            C51 c512 = this.LLFFF;
                                                                                                            if (c512 != null) {
                                                                                                                c512.setGestureDetectLayout(this.LLFII);
                                                                                                            }
                                                                                                        } else {
                                                                                                            o.LJIJI("liveCenterGestureDetector");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        o.LJIJI("liveBroadcastGestureDetector");
                                                                                                        throw null;
                                                                                                    }
                                                                                                }
                                                                                                if (this.LLIIII != null) {
                                                                                                    if (YLE.LJI()) {
                                                                                                        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                                                                                                        if (!C31691Mf.LJIIIZ()) {
                                                                                                            DataChannel dataChannel12 = this.LJZ;
                                                                                                            if (dataChannel12 != null) {
                                                                                                                dataChannel12.rv0(IsHandleEffectChannel.class, Boolean.TRUE);
                                                                                                            } else {
                                                                                                                o.LJIJI("mDataChannel");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    Context context8 = getContext();
                                                                                                    if (context8 != null) {
                                                                                                        c30429Bwv = new C30429Bwv(context8);
                                                                                                    } else {
                                                                                                        c30429Bwv = null;
                                                                                                    }
                                                                                                    this.LJLLILLLL = c30429Bwv;
                                                                                                    if (c30429Bwv != null) {
                                                                                                        DataChannel dataChannel13 = this.LJZ;
                                                                                                        if (dataChannel13 != null) {
                                                                                                            c30429Bwv.setDataChannel(dataChannel13);
                                                                                                        } else {
                                                                                                            o.LJIJI("mDataChannel");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
                                                                                                    C30429Bwv c30429Bwv2 = this.LJLLILLLL;
                                                                                                    if (c30429Bwv2 != null && (exposureBar = c30429Bwv2.getExposureBar()) != null) {
                                                                                                        DataChannel dataChannel14 = this.LJZ;
                                                                                                        if (dataChannel14 != null) {
                                                                                                            exposureBar.setDataChannel(dataChannel14);
                                                                                                        } else {
                                                                                                            o.LJIJI("mDataChannel");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
                                                                                                    layeredConstraintLayout.addView(this.LJLLILLLL, new ViewGroup.LayoutParams(-1, -1));
                                                                                                    ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu2 = this.LLIIIILZ;
                                                                                                    if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu2 != null) {
                                                                                                        scaleGestureDetectorOnScaleGestureListenerC30428Bwu2.LJLLL = new AqS171S0100000_5(this, 252);
                                                                                                        ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu3 = this.LLIIIILZ;
                                                                                                        if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu3 != null) {
                                                                                                            scaleGestureDetectorOnScaleGestureListenerC30428Bwu3.LJZL = new AqS152S0200000_5(this, view, 7);
                                                                                                            return;
                                                                                                        } else {
                                                                                                            o.LJIJI("cameraGestureDetector");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
                                                                                                    o.LJIJI("cameraGestureDetector");
                                                                                                    throw null;
                                                                                                }
                                                                                                o.LJIJI("touchEffectGestureDetector");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("cameraGestureDetector");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("liveBroadcastGestureDetector");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("otherGestureDetector");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("liveBroadcastGestureDetector");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("touchEffectGestureDetector");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("liveBroadcastGestureDetector");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("drawGuessGestureDetector");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("liveBroadcastGestureDetector");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mDataChannel");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mDataChannel");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mDataChannel");
                                                    throw null;
                                                }
                                                o.LJIJI("mDataChannel");
                                                throw null;
                                            }
                                            o.LJIJI("mDataChannel");
                                            throw null;
                                        }
                                        o.LJIJI("mDataChannel");
                                        throw null;
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
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C30087BrP c30087BrP = this.LJLZ;
        if (c30087BrP != null) {
            c30087BrP.LJFF(i, i2, intent);
        } else {
            o.LJIJI("commonInteractionFunctionHelper");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LJI;
        o.LJIIIZ(inflater, "inflater");
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            Context context = inflater.getContext();
            o.LJIIIIZZ(context, "inflater.context");
            LJI = C20780ri.LIZIZ(R.layout.d3h, context, viewGroup, false);
        } else {
            LJI = C20910rv.LJI(R.layout.d3h, viewGroup, false, 12);
        }
        DataChannel dataChannel = this.LJZ;
        C29S c29s = null;
        if (dataChannel != null) {
            C14490hZ c14490hZ = new C14490hZ(dataChannel);
            this.LLIIIZ = c14490hZ;
            c14490hZ.LIZ(LJI, getViewLifecycleOwner());
            C78949Uyf.LJJJJ(LJI, this);
            try {
                ViewTreeLifecycleOwner.set(LJI, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LJI, this);
                C10A.LIZIZ(LJI, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            return LJI;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }
}
