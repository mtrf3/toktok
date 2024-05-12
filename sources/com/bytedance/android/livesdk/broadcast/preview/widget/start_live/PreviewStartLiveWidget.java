package com.bytedance.android.livesdk.broadcast.preview.widget.start_live;

import X.ActivityC45651qj;
import X.AnonymousClass030;
import X.B83;
import X.BGE;
import X.BH7;
import X.BZI;
import X.C0N7;
import X.C0NB;
import X.C10960bs;
import X.C12800eq;
import X.C16880lQ;
import X.C18200nY;
import X.C25620zW;
import X.C28559BIt;
import X.C28787BRn;
import X.C28915BWl;
import X.C29042BaY;
import X.C29044Baa;
import X.C29128Bbw;
import X.C29130Bby;
import X.C29131Bbz;
import X.C29137Bc5;
import X.C29138Bc6;
import X.C29139Bc7;
import X.C29140Bc8;
import X.C29141Bc9;
import X.C29142BcA;
import X.C29143BcB;
import X.C29144BcC;
import X.C29145BcD;
import X.C29146BcE;
import X.C29158BcQ;
import X.C29159BcR;
import X.C29160BcS;
import X.C29161BcT;
import X.C29165BcX;
import X.C29306Beo;
import X.C29374Bfu;
import X.C2A7;
import X.C32019ChT;
import X.C32535Cpn;
import X.C32536Cpo;
import X.C32537Cpp;
import X.C5H3;
import X.C5S0;
import X.C73318Sq2;
import X.C73893SzJ;
import X.C73943T0h;
import X.C73969T1h;
import X.C78540Us4;
import X.C78996UzQ;
import X.C7N;
import X.C87277YNd;
import X.C88207Yjb;
import X.DialogC31813Ce9;
import X.EnumC12790ep;
import X.F9J;
import X.InterfaceC05190Ih;
import X.InterfaceC28344BAm;
import X.InterfaceC28916BWm;
import X.InterfaceC29151BcJ;
import X.InterfaceC29405BgP;
import X.InterfaceC30359Bvn;
import X.InterfaceC30442Bx8;
import X.OSZ;
import X.X1D;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.AgeBlockEvent;
import com.bytedance.android.livesdk.broadcast.PermissionApplyInfoChannel;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.broadcast.ShouldDoubleCheckAgeVerifyStatus;
import com.bytedance.android.livesdk.broadcast.ShouldShowSafetyEducationDialogCppV2;
import com.bytedance.android.livesdk.broadcast.ShowAgeVerifyDialogCppV2Enum;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCastStateChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSPreInitSettings;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusinessHelper;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS62S0110000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewStartLiveWidget extends PreviewWidget implements InterfaceC28344BAm {
    public static final /* synthetic */ int LLFF = 0;
    public InterfaceC28916BWm LJLJI;
    public DialogC31813Ce9 LJLL;
    public C2A7 LJLLI;
    public boolean LJLLILLLL;
    public Integer LJLLLLLL;
    public Boolean LJLZ;
    public Boolean LJZ;
    public final C5H3 LJLJJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 149));
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(C29144BcC.LJLIL);
    public final C5H3 LJLJJLL = C78996UzQ.LJJIJIIJI(C29142BcA.LJLIL);
    public final C5H3 LJLJL = C78996UzQ.LJJIJIIJI(C29143BcB.LJLIL);
    public final C5H3 LJLJLJ = C78996UzQ.LJJIJIIJI(C29141Bc9.LJLIL);
    public final C5H3 LJLJLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 150));
    public final C5H3 LJLLJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 152));
    public final C73318Sq2 LJLLL = new C73318Sq2();
    public final C73893SzJ LJLLLL = new C73893SzJ();
    public boolean LJZI = true;
    public final C73318Sq2 LJZL = new C73318Sq2();
    public boolean LL = true;
    public final C29140Bc8 LLD = C29140Bc8.LJLIL;
    public final C29138Bc6 LLF = C29138Bc6.LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dqg;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LiveMode LLF() {
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        o.LJI(liveMode);
        return liveMode;
    }

    public final boolean LLFF() {
        return ((Boolean) this.LJLLJ.getValue()).booleanValue();
    }

    public final boolean LLFII() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(LiveAccessTipsShowChannel.class)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean LLII() {
        Map map;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (map = (Map) dataChannel.kv0(PermissionApplyInfoChannel.class)) == null) {
            return false;
        }
        String modeFromServer = LLF().getModeFromServer();
        o.LJIIIIZZ(modeFromServer, "mLiveMode.modeFromServer");
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(modeFromServer);
        if (permissionApplyInfo == null || permissionApplyInfo.mApplyStatus != 2) {
            return false;
        }
        return true;
    }

    public static InterfaceC05190Ih LLFFF() {
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            return ((C29374Bfu) LIZIZ).LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        InterfaceC28916BWm interfaceC28916BWm;
        super.LJZ();
        int i = C29130Bby.LIZ[LLF().ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        interfaceC28916BWm = null;
                    } else {
                        interfaceC28916BWm = (C29161BcT) this.LJLJLJ.getValue();
                    }
                } else {
                    interfaceC28916BWm = (C29159BcR) this.LJLJJLL.getValue();
                }
            } else {
                interfaceC28916BWm = (C29158BcQ) this.LJLJL.getValue();
            }
        } else {
            interfaceC28916BWm = (C29160BcS) this.LJLJJL.getValue();
        }
        this.LJLJI = interfaceC28916BWm;
        if (!this.LJLLILLLL) {
            if (LLII() || LLFII()) {
                z = false;
            }
            this.LJZI = z;
            LLIIIILZ("observe LiveMode");
        }
        if (C78540Us4.LJJIIJ()) {
            if (C29137Bc5.LJ(LLF())) {
                View view = getView();
                int LIZ = C5S0.LIZ(205.0f);
                if (view != null) {
                    view.getLayoutParams().width = LIZ;
                    view.requestLayout();
                    return;
                }
                return;
            }
            View view2 = getView();
            int LIZ2 = C5S0.LIZ(269.0f);
            if (view2 == null) {
                return;
            }
            view2.getLayoutParams().width = LIZ2;
            view2.requestLayout();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        C2A7 c2a7;
        C2A7 c2a72;
        super.LJZL();
        View view = getView();
        if (!(view instanceof C2A7) || (c2a7 = (C2A7) view) == null) {
            return;
        }
        this.LJLLI = c2a7;
        if (C78540Us4.LJJIIJZLJL() && C29137Bc5.LJ(LLF()) && (c2a72 = this.LJLLI) != null) {
            c2a72.LJJLL(R.style.a2k);
        }
        this.LJZL.LIZ(C73943T0h.LIZ().LJ(C10960bs.class).LJJJJZI(new AfS57S0100000_5(this, 49)));
        View view2 = getView();
        if (view2 != null) {
            C29306Beo.LJJJLL(view2, 500L, new AqS171S0100000_5(this, 239));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, PreviewBlockInfoChannel.class, new AqS171S0100000_5(this, 240));
            dataChannel.ov0(this, PermissionApplyInfoChannel.class, new AqS171S0100000_5(this, 241));
            dataChannel.ov0(this, LiveAccessTipsShowChannel.class, new AqS171S0100000_5(this, 242));
            dataChannel.ov0(this, AgeBlockEvent.class, new AqS171S0100000_5(this, 243));
            dataChannel.ov0(this, ShouldShowSafetyEducationDialogCppV2.class, new AqS171S0100000_5(this, 244));
            dataChannel.ov0(this, ShouldDoubleCheckAgeVerifyStatus.class, new AqS171S0100000_5(this, 245));
            dataChannel.ov0(this, ShowAgeVerifyDialogCppV2Enum.class, new AqS171S0100000_5(this, 246));
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.pv0(LiveCastStateChannel.class, this, new AqS171S0100000_5(this, 237));
        this.LJLLL.LIZ(this.LJLLLL.LJJJJLI(5000L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 50)));
        dataChannelGlobal.nv0(this, this, PreviewSubOnlyLiveSwitchChannel.class, new AqS171S0100000_5(this, 238));
        if (TTLSPreInitSettings.INSTANCE.enablePreLoadThreads()) {
            C16880lQ.LJLI(Looper.myQueue(), this.LLD);
        }
        if (C32019ChT.LIZ()) {
            C16880lQ.LJLI(Looper.myQueue(), this.LLF);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Long, O] */
    public final void LLFZ() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LL) {
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29145BcD.class)).LIZ = Long.valueOf(currentTimeMillis);
            this.LL = false;
        }
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29146BcE.class)).LIZ = Long.valueOf(currentTimeMillis);
        C28915BWl c28915BWl = (C28915BWl) this.LJLJJI.getValue();
        if (c28915BWl != null) {
            c28915BWl.LIZ(this.LJLZ, this.LJLLLLLL, this.LJZ, this.LJLJI, this.LJLLI, LLF(), false, new AqS155S0100000_5(this, 151));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (C28559BIt.LIZ != null) {
            C28559BIt.LIZ = null;
        }
        if (C28559BIt.LIZIZ != null) {
            C28559BIt.LIZIZ = null;
        }
        this.LJZL.LIZLLL();
        this.LJLLL.dispose();
        if (TTLSPreInitSettings.INSTANCE.enablePreLoadThreads()) {
            Looper.myQueue().removeIdleHandler(this.LLD);
            TTLSPreInitBusinessHelper.onLeavePreViewPage();
        }
        if (C32019ChT.LIZ()) {
            Looper.myQueue().removeIdleHandler(this.LLF);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
    }

    public final void LL(boolean z) {
        C28915BWl c28915BWl = (C28915BWl) this.LJLJJI.getValue();
        if (c28915BWl != null) {
            c28915BWl.LIZIZ(this.LJLJI, new AqS62S0110000_5(this, z, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Integer, O] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Long, O] */
    public final void LLIIII(Room room) {
        long j;
        Long l;
        InterfaceC30359Bvn LJIILIIL;
        InterfaceC30359Bvn LJIILIIL2;
        SharedPreferences LIZIZ;
        SharedPreferences.Editor edit;
        Boolean bool;
        String str;
        AnonymousClass030.LJFF(InterfaceC30442Bx8.LJIILIIL);
        try {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(C29139Bc7.class)) != null && bool.booleanValue()) {
                BZI LIZ = C28787BRn.LIZ("livesdk_live_phone_verify_success_live");
                LIZ.LJIILLIIL(this.dataChannel);
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 == null || (str = (String) dataChannel2.kv0(PreviewTitleChannel.class)) == null) {
                    str = "";
                }
                LIZ.LJIJJ(str, "room_title");
                LIZ.LJIJJ(Long.valueOf(room.getId()), "room_id");
                LIZ.LJJIIJZLJL();
            }
            InterfaceC30442Bx8.LLLLLLZ.LIZ(-1);
            C88207Yjb.LJFF();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            ((C32535Cpn) dataChannelGlobal.gv0(C29044Baa.class)).LIZ = room;
            ((C32536Cpo) this.dataChannel.gv0(BGE.class)).LIZ = 1;
            DataChannel dataChannel3 = this.dataChannel;
            Boolean bool2 = Boolean.TRUE;
            dataChannel3.rv0(StartLiveSuccessChannel.class, new OSZ(bool2, Long.valueOf(room.getId())));
            C0N7.LJIIIIZZ(this.dataChannel, "golive_success");
            C12800eq.LJFF(EnumC12790ep.CreateLive);
            DataChannel dataChannel4 = this.dataChannel;
            o.LJIIIIZZ(dataChannel4, "dataChannel");
            if (BH7.LIZIZ(dataChannel4)) {
                j = SystemClock.elapsedRealtime();
            } else {
                j = -1;
            }
            ((C32535Cpn) dataChannelGlobal.gv0(C29042BaY.class)).LIZ = Long.valueOf(j);
            Context context = this.context;
            String mode = LLF().name();
            InterfaceC05190Ih LLFFF = LLFFF();
            if (LLFFF != null) {
                l = Long.valueOf(LLFFF.getId());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            o.LJIIIZ(mode, "mode");
            if (context != null && (LIZIZ = F9J.LIZIZ(context, 0, "live_mode")) != null && (edit = LIZIZ.edit()) != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(valueOf);
                LIZ2.append("live_start_live_mode");
                edit.putString(X1D.LIZIZ(LIZ2), mode);
                edit.apply();
            }
            C18200nY.LIZ("start_broadcast_page", String.valueOf(System.currentTimeMillis()));
            if (LLFF() && C29137Bc5.LJFF(room)) {
                DataChannel dataChannel5 = this.dataChannel;
                if (dataChannel5 != null && (LJIILIIL2 = C87277YNd.LJIILIIL(dataChannel5)) != null) {
                    LJIILIIL2.LJJIII(null);
                }
            } else {
                if (LLFF() && !C29137Bc5.LJFF(room) && (LJIILIIL = C87277YNd.LJIILIIL(this.dataChannel)) != null) {
                    LJIILIIL.LJIL();
                }
                InterfaceC28916BWm interfaceC28916BWm = this.LJLJI;
                if (interfaceC28916BWm != null) {
                    interfaceC28916BWm.LIZJ(this.widgetCallback.getFragment());
                }
                ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ(this.context);
                if (LIZIZ2 != null) {
                    LIZIZ2.finish();
                }
                ActivityC45651qj LIZIZ3 = C29306Beo.LIZIZ(this.context);
                if (LIZIZ3 != null) {
                    LIZIZ3.overridePendingTransition(0, 0);
                }
            }
            Object value = C7N.LIZLLL.getValue();
            o.LJIIIIZZ(value, "<get-hostConfig>(...)");
            ((IHostConfig) value).qS().getClass();
            InterfaceC29151BcJ.LIZ.LIZ(bool2);
            ((C29165BcX) C7N.LJ().startLiveManager()).onStartLive();
        } catch (Exception e) {
            C0NB.LIZ(e.getMessage());
        }
    }

    public final void LLIIIILZ(String str) {
        boolean z;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        o.LJIIIZ(dataChannelGlobal, "<this>");
        Boolean bool = (Boolean) dataChannelGlobal.mv0(LiveCastStateChannel.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("updateStartLiveButtonEnable(). scene=", str, ", startLiveAccess=");
        LIZIZ.append(this.LJZI);
        LIZIZ.append(", isCasting=");
        LIZIZ.append(z);
        C0NB.LJIIIZ("PreviewStartLiveWidget", X1D.LIZIZ(LIZIZ));
        if (this.LJZI && !z) {
            if (C29137Bc5.LJ(LLF()) && C78540Us4.LJJIIJZLJL()) {
                C2A7 c2a7 = this.LJLLI;
                if (c2a7 != null) {
                    c2a7.LJJLL(R.style.a2k);
                }
            } else {
                C2A7 c2a72 = this.LJLLI;
                if (c2a72 != null) {
                    c2a72.LJJLL(R.style.a2i);
                }
            }
            C2A7 c2a73 = this.LJLLI;
            if (c2a73 == null) {
                return;
            }
            c2a73.setEnabled(true);
            return;
        }
        C2A7 c2a74 = this.LJLLI;
        if (c2a74 != null) {
            c2a74.LJJLL(R.style.a2j);
        }
        C2A7 c2a75 = this.LJLLI;
        if (c2a75 == null) {
            return;
        }
        c2a75.setEnabled(z);
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        C28915BWl c28915BWl;
        if (this.isViewValid && (c28915BWl = (C28915BWl) this.LJLJJI.getValue()) != null) {
            c28915BWl.LIZJ(message, LLF(), new C29128Bbw(this), new C29131Bbz(this), this.LJLLLL, false);
        }
    }
}
