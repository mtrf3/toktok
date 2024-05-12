package Y;

import X.B43;
import X.BPP;
import X.BZI;
import X.C03880Dg;
import X.C08680Vs;
import X.C0E7;
import X.C0NB;
import X.C0PX;
import X.C0TM;
import X.C0TX;
import X.C0WO;
import X.C12700eg;
import X.C12750el;
import X.C12B;
import X.C12U;
import X.C12X;
import X.C14020go;
import X.C141335gf;
import X.C14270hD;
import X.C15380j0;
import X.C16880lQ;
import X.C18210nZ;
import X.C18230nb;
import X.C18300ni;
import X.C18420nu;
import X.C1FP;
import X.C1G2;
import X.C1JI;
import X.C1KJ;
import X.C1VS;
import X.C1XB;
import X.C20000qS;
import X.C22950vD;
import X.C276716t;
import X.C277116x;
import X.C28268B7o;
import X.C28787BRn;
import X.C29044Baa;
import X.C29162BcU;
import X.C29306Beo;
import X.C29431Dn;
import X.C29501Du;
import X.C29702BlC;
import X.C2NU;
import X.C30680C2i;
import X.C30681C2j;
import X.C30868C9o;
import X.C30922CBq;
import X.C31977Cgn;
import X.C32151Nz;
import X.C32537Cpp;
import X.C33731Ub;
import X.C37661dq;
import X.C37701du;
import X.C37791e3;
import X.C37931eH;
import X.C39187FZn;
import X.C39188FZo;
import X.C39519Ff9;
import X.C3C4;
import X.C3C5;
import X.C41581kA;
import X.C41591kB;
import X.C43191ml;
import X.C43371n3;
import X.C43381n4;
import X.C47261Igj;
import X.C48459J0d;
import X.C51029K0z;
import X.C61447O9r;
import X.C61878OQg;
import X.C65300Pk0;
import X.C78857UxB;
import X.C78862UxG;
import X.C78946Uyc;
import X.CN1;
import X.CWR;
import X.CYQ;
import X.DialogC30679C2h;
import X.DialogInterfaceOnClickListenerC265612m;
import X.EnumC12710eh;
import X.EnumC264412a;
import X.EnumC276816u;
import X.InterfaceC14010gn;
import X.InterfaceC21020s6;
import X.InterfaceC29911Fj;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.RunnableC31065CHd;
import X.X1D;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetExtra;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetResponse;
import com.bytedance.android.live.broadcast.dialog.GameMessageAlertDialog;
import com.bytedance.android.live.broadcast.extendedscreen.ExtendedScreenWidget;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceConnectedFragment;
import com.bytedance.android.live.broadcast.fragment.GameDualDevicePositionFragment;
import com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.live.effect.OnFilterSelectedByClickEvent;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget;
import com.bytedance.android.live.effect.music.LiveBGMFragment;
import com.bytedance.android.live.effect.music.LiveMusicDialog;
import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.live.effect.music.entity.AlbumPack;
import com.bytedance.android.live.effect.music.entity.AlbumsResponse;
import com.bytedance.android.live.effect.navi.NaviAvatarListViewModel;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.livesdk.comp.api.game.GameDualDevicePageChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMDefaultVolumeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.NotificationConfirmResponse;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.zhiliaoapp.musically.R;
import defpackage.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IDfS292S0100000 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;

    public static Sensor LIZ$0(SensorManager sensorManager, int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "3500584760372219570");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            case 24:
                accept$24(this, obj);
                return;
            case 25:
                accept$25(this, obj);
                return;
            case 26:
                accept$26(this, obj);
                return;
            case 27:
                accept$27(this, obj);
                return;
            case 28:
                accept$28(this, obj);
                return;
            case 29:
                accept$29(this, obj);
                return;
            case 30:
                accept$30(this, obj);
                return;
            case 31:
                accept$31(this, obj);
                return;
            case 32:
                accept$32(this, obj);
                return;
            case 33:
                accept$33(this, obj);
                return;
            case 34:
                accept$34(this, obj);
                return;
            case 35:
                accept$35(this, obj);
                return;
            case 36:
                accept$36(this, obj);
                return;
            case 37:
                accept$37(this, obj);
                return;
            case 38:
                accept$38(this, obj);
                return;
            case 39:
                accept$39(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                accept$40(this, obj);
                return;
            case 41:
                accept$41(this, obj);
                return;
            case 42:
                accept$42(this, obj);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                accept$43(this, obj);
                return;
            case 44:
                accept$44(this, obj);
                return;
            case 45:
                accept$45(this, obj);
                return;
            case 46:
                accept$46(this, obj);
                return;
            case 47:
                accept$47(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                accept$48(this, obj);
                return;
            case C61447O9r.LJIIJ:
                accept$49(this, obj);
                return;
            case 50:
                accept$50(this, obj);
                return;
            case 51:
                accept$51(this, obj);
                return;
            case 52:
                accept$52(this, obj);
                return;
            case 53:
                accept$53(this, obj);
                return;
            case 54:
                accept$54(this, obj);
                return;
            default:
                return;
        }
    }

    public IDfS292S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(IDfS292S0100000 iDfS292S0100000, Object obj) {
        C29431Dn c29431Dn = (C29431Dn) iDfS292S0100000.l0;
        c29431Dn.getClass();
        String boldStr = C15380j0.LJIILL(R.string.mv6, 30);
        String totalStr = C15380j0.LJIILL(R.string.mv_, boldStr);
        DataChannel dataChannel = c29431Dn.LIZIZ;
        if (dataChannel != null) {
            o.LJIIIIZZ(totalStr, "totalStr");
            o.LJIIIIZZ(boldStr, "boldStr");
            dataChannel.rv0(TipMessageChannel.class, new CWR(C0E7.LIZ(totalStr, boldStr), true, EnumC264412a.LIVE_TIP_GAMING_GOODY_BAG.ordinal(), null, new C31977Cgn("goody_bag_open_soon", null, null, 6), 8));
        }
    }

    public static final void accept$1(IDfS292S0100000 iDfS292S0100000, Object obj) {
        boolean z;
        int i;
        String totalStr;
        String str;
        Integer it = (Integer) obj;
        C29431Dn c29431Dn = (C29431Dn) iDfS292S0100000.l0;
        o.LJIIIIZZ(it, "it");
        if (it.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        c29431Dn.getClass();
        if (z) {
            i = R.string.mv7;
        } else {
            i = R.string.mv8;
        }
        String boldStr = C15380j0.LJIILJJIL(i);
        if (z) {
            totalStr = C15380j0.LJIILL(R.string.mva, boldStr);
            str = "goody_bag_opened";
        } else {
            totalStr = C15380j0.LJIILL(R.string.mv9, boldStr);
            str = "goody_bag_not_grab_totally";
        }
        DataChannel dataChannel = c29431Dn.LIZIZ;
        if (dataChannel != null) {
            o.LJIIIIZZ(totalStr, "totalStr");
            o.LJIIIIZZ(boldStr, "boldStr");
            dataChannel.rv0(TipMessageChannel.class, new CWR(C0E7.LIZ(totalStr, boldStr), true, EnumC264412a.LIVE_TIP_GAMING_GOODY_BAG.ordinal(), null, new C31977Cgn(str, null, null, 6), 8));
        }
    }

    public static final void accept$10(IDfS292S0100000 iDfS292S0100000, Object obj) {
        Object obj2;
        BaseResponse baseResponse = (BaseResponse) obj;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDfS292S0100000.l0;
        if (baseResponse != null) {
            obj2 = baseResponse.data;
        } else {
            obj2 = null;
        }
        interfaceC88472Yns.invoke(obj2);
    }

    public static final void accept$11(IDfS292S0100000 iDfS292S0100000, Object obj) {
        BPP.LIZJ((Context) iDfS292S0100000.l0, (Throwable) obj);
    }

    public static final void accept$12(IDfS292S0100000 iDfS292S0100000, Object obj) {
        List base64Datas = (List) obj;
        KYCCameraActivity kYCCameraActivity = (KYCCameraActivity) iDfS292S0100000.l0;
        o.LJIIIIZZ(base64Datas, "base64Datas");
        kYCCameraActivity.LLII(base64Datas, true);
    }

    public static final void accept$13(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((KYCCameraActivity) iDfS292S0100000.l0).LLII(new ArrayList(), false);
    }

    public static final void accept$14(IDfS292S0100000 iDfS292S0100000, Object obj) {
        C0PX c0px = (C0PX) iDfS292S0100000.l0;
        c0px.LJIILLIIL.post(new IDRunnableS85S0100000(c0px, 77));
    }

    public static final void accept$15(IDfS292S0100000 iDfS292S0100000, Object obj) {
        Long it = (Long) obj;
        GamePreparationNetworkSpeedDetectionDialog gamePreparationNetworkSpeedDetectionDialog = (GamePreparationNetworkSpeedDetectionDialog) iDfS292S0100000.l0;
        o.LJIIIIZZ(it, "it");
        gamePreparationNetworkSpeedDetectionDialog.Ol(it.longValue(), false);
    }

    public static final void accept$16(IDfS292S0100000 iDfS292S0100000, Object obj) {
        List it = (List) obj;
        final C41581kA c41581kA = (C41581kA) iDfS292S0100000.l0;
        o.LJIIIIZZ(it, "it");
        c41581kA.getClass();
        C0TX c0tx = C0TX.LIZ;
        c0tx.LIZJ("LiveEffectDataProvider");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("panel:");
        LIZ.append(c41581kA.LIZ);
        LIZ.append(", fetch from cache and process success, size: ");
        LIZ.append(it.size());
        C0TX.LIZIZ(X1D.LIZIZ(LIZ));
        if (it.isEmpty()) {
            c41581kA.onFail(new ExceptionResult(-1));
            return;
        }
        C0WO<T> c0wo = c41581kA.LIZLLL;
        if (c0wo != 0) {
            c0wo.onSuccess(it);
        }
        C15380j0.LIZLLL();
        try {
            if (!C2NU.LIZ.LIZIZ()) {
                return;
            }
            c0tx.LIZJ("LiveEffectDataProvider");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(c41581kA.LIZ);
            LIZ2.append(" try to check need update effect");
            C0TX.LIZIZ(X1D.LIZIZ(LIZ2));
            C1KJ.LIZIZ.checkedEffectListUpdate(c41581kA.LIZ, new ICheckChannelListener() { // from class: X.1KK
                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    C0TX.LIZ.LIZJ("LiveEffectDataProvider");
                    C0TX.LIZIZ("check need update effect fail");
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z) {
                    C0TX.LIZ.LIZJ("LiveEffectDataProvider");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("check need update effect: ");
                    LIZ3.append(z);
                    C0TX.LIZIZ(X1D.LIZIZ(LIZ3));
                    if (z) {
                        EffectManager effectManager = C1KJ.LIZIZ;
                        C41581kA<Object> c41581kA2 = c41581kA;
                        String str = c41581kA2.LIZ;
                        effectManager.fetchEffectList(str, false, (IFetchEffectChannelListener) new C41591kB(str, c41581kA2.LIZIZ, c41581kA2.LIZJ, c41581kA2.LIZLLL));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public static final void accept$17(IDfS292S0100000 iDfS292S0100000, Object obj) {
        List it = (List) obj;
        C41591kB c41591kB = (C41591kB) iDfS292S0100000.l0;
        o.LJIIIIZZ(it, "it");
        c41591kB.getClass();
        if (it.isEmpty()) {
            C0TX.LIZ.LIZJ("LiveEffectDataProvider");
            C0TX.LIZIZ("fetch and process from remote empty");
            c41591kB.onFail(new ExceptionResult(-1));
        } else {
            C0TX.LIZ.LIZJ("LiveEffectDataProvider");
            C0TX.LIZIZ("fetch and process from remote success");
            C0WO<T> c0wo = c41591kB.LIZLLL;
            if (c0wo != 0) {
                c0wo.onSuccess(it);
            }
            c41591kB.LIZ(c41591kB.LIZ, true);
        }
    }

    public static final void accept$18(IDfS292S0100000 iDfS292S0100000, Object obj) {
        C0TM c0tm = (C0TM) iDfS292S0100000.l0;
        if (!((Boolean) c0tm.LJII.getValue()).booleanValue() || c0tm.LJ) {
            return;
        }
        DialogC30679C2h dialogC30679C2h = c0tm.LIZLLL;
        if (dialogC30679C2h != null && dialogC30679C2h.isShowing()) {
            return;
        }
        c0tm.LJ = true;
        if (c0tm.LIZLLL == null) {
            Context context = c0tm.LIZJ;
            o.LJIIIZ(context, "context");
            C30681C2j c30681C2j = new C30681C2j(context);
            C30680C2i c30680C2i = c30681C2j.LIZ;
            c30680C2i.LIZJ = R.layout.d0g;
            CharSequence text = c30680C2i.LIZ.getText(R.string.o0d);
            C30680C2i c30680C2i2 = c30681C2j.LIZ;
            c30680C2i2.LIZLLL = text;
            c30681C2j.LIZ.LJ = c30680C2i2.LIZ.getText(R.string.o0e);
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.sol);
            DialogInterfaceOnClickListenerC265612m dialogInterfaceOnClickListenerC265612m = new DialogInterface.OnClickListener() { // from class: X.12m
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            };
            C30680C2i c30680C2i3 = c30681C2j.LIZ;
            c30680C2i3.LJFF = LJIILJJIL;
            c30680C2i3.LJII = dialogInterfaceOnClickListenerC265612m;
            StateListDrawable LJIIJ = C78946Uyc.LJIIJ(C32151Nz.LJIIZILJ(8), C32151Nz.LJIIZILJ(8), C15380j0.LIZIZ(R.color.ar), C15380j0.LIZIZ(R.color.al));
            C30680C2i c30680C2i4 = c30681C2j.LIZ;
            c30680C2i4.LJI = LJIIJ;
            c30680C2i4.LJIIIZ = false;
            c30680C2i4.LJIIIIZZ = false;
            C30680C2i c30680C2i5 = c30681C2j.LIZ;
            DialogC30679C2h dialogC30679C2h2 = new DialogC30679C2h(c30680C2i5.LIZ, c30680C2i5);
            C16880lQ.LJIJI(dialogC30679C2h2.LJLJJLL, new IDCListenerS83S0200000(dialogC30679C2h2, c0tm, 7));
            dialogC30679C2h2.setOnDismissListener(new IDDListenerS140S0100000(c0tm, 8));
            c0tm.LIZLLL = dialogC30679C2h2;
        }
        c0tm.LIZ().addToShow(7, c0tm.LIZ, new IDObserverS225S0100000(c0tm, 8));
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.o0e);
        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_sc…re_live_panel_nomicphone)");
        C12B.LIZ(c0tm.LIZIZ, true, EnumC264412a.LIVE_TIP_MESSAGE_VOLUME.ordinal(), LJIILJJIL2, 8);
    }

    public static final void accept$19(IDfS292S0100000 iDfS292S0100000, Object obj) {
        C0TM c0tm = (C0TM) iDfS292S0100000.l0;
        if (c0tm.LIZ().CC()) {
            c0tm.LIZ().ee0(7);
            c0tm.LJ = false;
        }
    }

    public static final void accept$2(IDfS292S0100000 iDfS292S0100000, Object obj) {
        C29501Du c29501Du = (C29501Du) iDfS292S0100000.l0;
        c29501Du.getClass();
        String boldStr = C15380j0.LJIILJJIL(R.string.mv5);
        String contentStr = C15380j0.LJIILL(R.string.mx1, boldStr);
        DataChannel dataChannel = c29501Du.LIZIZ;
        if (dataChannel != null) {
            o.LJIIIIZZ(contentStr, "contentStr");
            o.LJIIIIZZ(boldStr, "boldStr");
            dataChannel.rv0(TipMessageChannel.class, new CWR(C0E7.LIZ(contentStr, boldStr), true, EnumC264412a.LIVE_TIP_GAMING_TREASURE.ordinal(), null, new C31977Cgn("treasure_box_open", null, null, 6), 8));
        }
    }

    public static final void accept$20(IDfS292S0100000 iDfS292S0100000, Object it) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDfS292S0100000.l0;
        o.LJIIIIZZ(it, "it");
        interfaceC88472Yns.invoke(it);
    }

    public static final void accept$21(IDfS292S0100000 iDfS292S0100000, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Collecting unread room result, extra:");
        LIZ.append(((C08680Vs) iDfS292S0100000.l0).LIZIZ);
        LIZ.append(", statusCode: ");
        LIZ.append(((BaseResponse) obj).statusCode);
        LIZ.append('.');
        C0NB.LIZIZ("FeedDataManager", X1D.LIZIZ(LIZ));
    }

    public static final void accept$22(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((GameMessageAlertDialog) iDfS292S0100000.l0).getClass();
    }

    public static final void accept$23(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((C12750el) iDfS292S0100000.l0).LIZLLL = (EnumC12710eh) obj;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0eg, O] */
    public static final void accept$24(IDfS292S0100000 iDfS292S0100000, Object obj) {
        EnumC276816u enumC276816u = (EnumC276816u) obj;
        if (C276716t.LIZJ()) {
            C12750el c12750el = (C12750el) iDfS292S0100000.l0;
            if (c12750el.LJ == EnumC276816u.StateDisconnected) {
                C30868C9o.LIZLLL(R.string.mwo, c12750el.LIZIZ.getContext());
            }
            C12700eg LIZJ = ((C12750el) iDfS292S0100000.l0).LIZJ();
            LIZJ.getClass();
            LIZJ.LIZLLL = System.currentTimeMillis();
        } else {
            C12750el c12750el2 = (C12750el) iDfS292S0100000.l0;
            EnumC276816u enumC276816u2 = c12750el2.LJ;
            if (enumC276816u2 != null && enumC276816u2 == EnumC276816u.StateConnected) {
                C30868C9o.LIZLLL(R.string.mwu, c12750el2.LIZIZ.getContext());
                ((C12750el) iDfS292S0100000.l0).LJI(0, false);
                ((C12750el) iDfS292S0100000.l0).LIZJ().LIZ();
            }
        }
        C12750el c12750el3 = (C12750el) iDfS292S0100000.l0;
        c12750el3.LJ = enumC276816u;
        DataChannel dataChannel = c12750el3.LIZJ;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(e0.class)).LIZ = c12750el3.LIZJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$25(IDfS292S0100000 iDfS292S0100000, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        List<BlockWord> list = ((BlockWordGetResponse) baseResponse.data).words;
        if (list == null) {
            return;
        }
        InterfaceC14010gn interfaceC14010gn = ((C14020go) iDfS292S0100000.l0).LIZ;
        BlockWordGetExtra blockWordGetExtra = (BlockWordGetExtra) baseResponse.extra;
        interfaceC14010gn.LIZLLL(list, blockWordGetExtra.maxCount, blockWordGetExtra.maxLength);
        C29702BlC LIZLLL = C18230nb.LIZLLL("ttlive_fetch_sensitive_word");
        LIZLLL.LIZ(Integer.valueOf(list.size()), "list_size");
        LIZLLL.LJIIIZ();
    }

    public static final void accept$26(IDfS292S0100000 iDfS292S0100000, Object obj) {
        Throwable throwable = (Throwable) obj;
        InterfaceC14010gn interfaceC14010gn = ((C14020go) iDfS292S0100000.l0).LIZ;
        o.LJIIIIZZ(throwable, "throwable");
        interfaceC14010gn.LJ(throwable);
        C18210nZ.LIZ("ttlive_fetch_sensitive_word", throwable).LJIIIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$27(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((ArrayList) C14270hD.LJLLJ).clear();
        for (AlbumPack albumPack : ((AlbumsResponse) ((BaseResponse) obj).data).albumPacks) {
            ((ArrayList) C14270hD.LJLLJ).add(albumPack.album);
            if (C14270hD.LJI().get(Long.valueOf(albumPack.album.id)) == null) {
                C14270hD.LJI().put(Long.valueOf(albumPack.album.id), Long.valueOf(albumPack.accompaniments.size()));
            }
            ConcurrentHashMap<Long, List<Accompaniment>> concurrentHashMap = C14270hD.LJLLLL;
            Long valueOf = Long.valueOf(albumPack.album.id);
            List<Accompaniment> list = albumPack.accompaniments;
            ArrayList arrayList = new ArrayList();
            for (Accompaniment accompaniment : list) {
                if (accompaniment.url.length() > 0) {
                    arrayList.add(accompaniment);
                }
            }
            C1JI.LIZIZ(concurrentHashMap, valueOf, arrayList);
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDfS292S0100000.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(C14270hD.LJLLJ);
        }
    }

    public static final void accept$28(IDfS292S0100000 iDfS292S0100000, Object obj) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDfS292S0100000.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(C61878OQg.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$29(Y.IDfS292S0100000 r5, java.lang.Object r6) {
        /*
            X.B4Q r6 = (X.B4Q) r6
            java.lang.Object r5 = r5.l0
            X.0hg r5 = (X.C14560hg) r5
            r5.LIZIZ = r6
            if (r6 == 0) goto L35
            boolean r0 = r6.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L10:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            if (r0 == 0) goto L1d
            r0 = 0
            if (r6 == 0) goto L30
            int r0 = r6.LIZ
            if (r0 != 0) goto L2e
        L1d:
            long r3 = r5.LJII
        L1f:
            android.view.View r2 = r5.LJ
            if (r2 == 0) goto L2d
            Y.IDRunnableS85S0100000 r1 = new Y.IDRunnableS85S0100000
            r0 = 87
            r1.<init>(r5, r0)
            r2.postDelayed(r1, r3)
        L2d:
            return
        L2e:
            int r0 = r6.LIZ
        L30:
            r5.LIZ = r0
            r3 = 0
            goto L1f
        L35:
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS292S0100000.accept$29(Y.IDfS292S0100000, java.lang.Object):void");
    }

    public static final void accept$3(IDfS292S0100000 iDfS292S0100000, Object e) {
        o.LJIIIZ(e, "e");
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDfS292S0100000.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void accept$30(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((ExtendedScreenWidget) iDfS292S0100000.l0).LLFFF = ((B43) obj).LIZ;
    }

    public static final void accept$31(IDfS292S0100000 iDfS292S0100000, Object obj) {
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIJI;
        Integer currentIndex = c48459J0d.LIZJ();
        o.LJIIIIZZ(currentIndex, "currentIndex");
        if (currentIndex.intValue() < ((ArrayList) ((C33731Ub) iDfS292S0100000.l0).LJFF).size()) {
            C43191ml c43191ml = ((C33731Ub) iDfS292S0100000.l0).LJI;
            c43191ml.getClass();
            c43191ml.LJLJJI = c48459J0d.LIZJ().intValue();
            ((C33731Ub) iDfS292S0100000.l0).LJI.notifyDataSetChanged();
            ((C33731Ub) iDfS292S0100000.l0).LIZIZ.LJLIL(currentIndex.intValue());
            C33731Ub c33731Ub = (C33731Ub) iDfS292S0100000.l0;
            DataChannel dataChannel = c33731Ub.LIZLLL;
            if (dataChannel != null) {
                dataChannel.qv0(OnFilterSelectedEvent.class, ListProtector.get(c33731Ub.LJFF, currentIndex.intValue()));
            }
            DataChannel dataChannel2 = ((C33731Ub) iDfS292S0100000.l0).LIZLLL;
            if (dataChannel2 != null) {
                dataChannel2.qv0(OnFilterSelectedByClickEvent.class, Boolean.FALSE);
            }
        }
    }

    public static final void accept$32(IDfS292S0100000 iDfS292S0100000, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        C0NB.LJIIJ(6, ((C43381n4) iDfS292S0100000.l0).LIZ, throwable.getStackTrace());
    }

    public static final void accept$33(IDfS292S0100000 iDfS292S0100000, Object obj) {
        C1VS c1vs;
        DataChannel dataChannel;
        C1VS c1vs2 = (C1VS) iDfS292S0100000.l0;
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIJI;
        c1vs2.LJIIIZ = c48459J0d.LIZJ();
        Integer currentIndex = ((C1VS) iDfS292S0100000.l0).LJIIIZ;
        o.LJIIIIZZ(currentIndex, "currentIndex");
        if (currentIndex.intValue() < ((ArrayList) ((C1VS) iDfS292S0100000.l0).LJII).size()) {
            C43371n3 c43371n3 = ((C1VS) iDfS292S0100000.l0).LJI;
            c43371n3.getClass();
            Integer LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
            c43371n3.LJLJJL = LIZJ.intValue();
            ((C1VS) iDfS292S0100000.l0).LJI.notifyDataSetChanged();
            C1VS c1vs3 = (C1VS) iDfS292S0100000.l0;
            RunnableC31065CHd runnableC31065CHd = c1vs3.LIZIZ;
            Integer currentIndex2 = c1vs3.LJIIIZ;
            o.LJIIIIZZ(currentIndex2, "currentIndex");
            runnableC31065CHd.LJLIL(currentIndex2.intValue());
            if (C29306Beo.LJIILJJIL() && (dataChannel = (c1vs = (C1VS) iDfS292S0100000.l0).LIZLLL) != null) {
                List<LiveEffect> list = c1vs.LJII;
                Integer currentIndex3 = c1vs.LJIIIZ;
                o.LJIIIIZZ(currentIndex3, "currentIndex");
                dataChannel.qv0(OnFilterSelectedEvent.class, ListProtector.get(list, currentIndex3.intValue()));
            }
        }
    }

    public static final void accept$34(IDfS292S0100000 iDfS292S0100000, Object obj) {
        Sensor LIZ$0;
        C1XB c1xb;
        SensorManager sensorManager;
        Sensor LIZ$02;
        C1XB c1xb2;
        SensorManager sensorManager2;
        Sensor LIZ$03;
        C1XB c1xb3;
        SensorManager sensorManager3;
        SensorManager sensorManager4 = ((C1XB) iDfS292S0100000.l0).LIZLLL;
        if (sensorManager4 != null && (LIZ$03 = LIZ$0(sensorManager4, 10)) != null && (sensorManager3 = (c1xb3 = (C1XB) iDfS292S0100000.l0).LIZLLL) != null) {
            C39187FZn c39187FZn = C39188FZo.LIZ;
            C18300ni c18300ni = c1xb3.LJIIIZ;
            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415489, "bpea-mobile_game_sensor_collector");
            c39187FZn.getClass();
            C39187FZn.LIZJ(sensorManager3, c18300ni, LIZ$03, 3, LJJIIJ);
        }
        SensorManager sensorManager5 = ((C1XB) iDfS292S0100000.l0).LIZLLL;
        if (sensorManager5 != null && (LIZ$02 = LIZ$0(sensorManager5, 1)) != null && (sensorManager2 = (c1xb2 = (C1XB) iDfS292S0100000.l0).LIZLLL) != null) {
            C39187FZn c39187FZn2 = C39188FZo.LIZ;
            C18300ni c18300ni2 = c1xb2.LJIIIZ;
            C78862UxG LJJIIJ2 = C78857UxB.LJJIIJ(1476415489, "bpea-mobile_game_sensor_collector");
            c39187FZn2.getClass();
            C39187FZn.LIZJ(sensorManager2, c18300ni2, LIZ$02, 3, LJJIIJ2);
        }
        SensorManager sensorManager6 = ((C1XB) iDfS292S0100000.l0).LIZLLL;
        if (sensorManager6 != null && (LIZ$0 = LIZ$0(sensorManager6, 2)) != null && (sensorManager = (c1xb = (C1XB) iDfS292S0100000.l0).LIZLLL) != null) {
            C39187FZn c39187FZn3 = C39188FZo.LIZ;
            C18300ni c18300ni3 = c1xb.LJIIIZ;
            C78862UxG LJJIIJ3 = C78857UxB.LJJIIJ(1476415489, "bpea-mobile_game_sensor_collector");
            c39187FZn3.getClass();
            C39187FZn.LIZJ(sensorManager, c18300ni3, LIZ$0, 3, LJJIIJ3);
        }
    }

    public static final void accept$35(IDfS292S0100000 iDfS292S0100000, Object obj) {
        C1XB c1xb = (C1XB) iDfS292S0100000.l0;
        SensorManager sensorManager = c1xb.LIZLLL;
        if (sensorManager != null) {
            C39187FZn c39187FZn = C39188FZo.LIZ;
            C18300ni c18300ni = c1xb.LJIIIZ;
            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415489, "bpea-mobile_game_sensor_collector");
            c39187FZn.getClass();
            C39187FZn.LIZLLL(sensorManager, c18300ni, LJJIIJ);
        }
    }

    public static final void accept$36(IDfS292S0100000 iDfS292S0100000, Object obj) {
        int i;
        int i2;
        List<C20000qS> list = (List) obj;
        List<C20000qS> value = ((NaviAvatarListViewModel) iDfS292S0100000.l0).LJLILLLLZI.getValue();
        int i3 = 0;
        if (value != null && value.size() == list.size()) {
            return;
        }
        if (list.size() - (C18420nu.LIZLLL + C18420nu.LJ) == 1) {
            C18420nu.LIZJ = 0;
        }
        if (list.isEmpty()) {
            i = 0;
        } else {
            Iterator<C20000qS> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().LIZ != null && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        C18420nu.LIZLLL = i;
        if (list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<C20000qS> it2 = list.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (it2.next().LIZIZ != null && (i2 = i2 + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        C18420nu.LJ = i2;
        ((NaviAvatarListViewModel) iDfS292S0100000.l0).LJLILLLLZI.setValue(list);
        StringBuilder sb = new StringBuilder("avatarList size diff: ");
        int size = list.size();
        List<C20000qS> value2 = ((NaviAvatarListViewModel) iDfS292S0100000.l0).LJLILLLLZI.getValue();
        if (value2 != null) {
            i3 = value2.size();
        }
        sb.append(size - i3);
        C0NB.LJ("LiveNaviAvatar", sb.toString());
    }

    public static final void accept$37(IDfS292S0100000 iDfS292S0100000, Object obj) {
        Throwable th = (Throwable) obj;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDfS292S0100000.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
        C0NB.LJFF("LiveNaviAvatar", "fetch effects error", th);
    }

    public static final void accept$38(IDfS292S0100000 iDfS292S0100000, Object obj) {
        int i = ((C28268B7o) obj).LIZ;
        if (i == 30) {
            ((KaraokeHoverWidget) iDfS292S0100000.l0).LJZL(true);
        } else {
            if (i != 31) {
                return;
            }
            ((KaraokeHoverWidget) iDfS292S0100000.l0).LJZL(false);
        }
    }

    public static final void accept$39(IDfS292S0100000 iDfS292S0100000, Object obj) {
        KaraokeHoverWidget karaokeHoverWidget = (KaraokeHoverWidget) iDfS292S0100000.l0;
        if (karaokeHoverWidget.LJLJJL == 1) {
            JSONObject LJZI = karaokeHoverWidget.LJZI();
            KaraokeHoverWidget karaokeHoverWidget2 = (KaraokeHoverWidget) iDfS292S0100000.l0;
            LJZI.put("play_progress", Math.max(0L, karaokeHoverWidget2.LL - karaokeHoverWidget2.LLF));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sending: ");
            LIZ.append(((KaraokeHoverWidget) iDfS292S0100000.l0).LL);
            C0NB.LIZIZ("SEIFlow", X1D.LIZIZ(LIZ));
            InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) ((KaraokeHoverWidget) iDfS292S0100000.l0).LJLL.getValue();
            if (interfaceC21020s6 != null) {
                interfaceC21020s6.LIZ("ktv_sei", ((KaraokeHoverWidget) iDfS292S0100000.l0).LJZI().putOpt("rtc", CardStruct.IStatusCode.DEFAULT), true);
            }
        }
    }

    public static final void accept$4(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((InterfaceC29911Fj) iDfS292S0100000.l0).onChanged(obj);
    }

    public static final void accept$40(IDfS292S0100000 iDfS292S0100000, Object obj) {
        DataChannel LJIILIIL;
        if (!C276716t.LIZJ() && (LJIILIIL = C51029K0z.LJIILIIL((GameDualDeviceConnectedFragment) iDfS292S0100000.l0)) != null) {
            LJIILIIL.qv0(GameDualDevicePageChannel.class, 0);
        }
    }

    public static final void accept$41(IDfS292S0100000 iDfS292S0100000, Object obj) {
        DataChannel LJIILIIL;
        if (!C276716t.LIZJ() && (LJIILIIL = C51029K0z.LJIILIIL((GameDualDevicePositionFragment) iDfS292S0100000.l0)) != null) {
            LJIILIIL.qv0(GameDualDevicePageChannel.class, 0);
        }
    }

    public static final void accept$42(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((TextView) iDfS292S0100000.l0).setText((SpannableStringBuilder) obj);
    }

    public static final void accept$43(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((ILiveStream) iDfS292S0100000.l0).addUserMetaData("signResult", (String) obj, 1);
    }

    public static final void accept$44(IDfS292S0100000 iDfS292S0100000, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        C22950vD.LIZ(jSONObject);
        ((ILiveStream) iDfS292S0100000.l0).addSeiField("signResult", jSONObject, 1, true, false, 1);
    }

    public static final void accept$45(IDfS292S0100000 iDfS292S0100000, Object obj) {
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GameUiStrategy", "receive LiveBoostCardAnimEvent");
        }
        C37661dq c37661dq = (C37661dq) iDfS292S0100000.l0;
        int ordinal = EnumC264412a.LIVE_TIP_MESSAGE_RECEIVE_FLASH_CARD_MESSAGE.ordinal();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.n1q);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_mobilegame_live_message)");
        C12B.LIZ(c37661dq, true, ordinal, LJIILJJIL, 8);
    }

    public static final void accept$46(IDfS292S0100000 iDfS292S0100000, Object obj) {
        C37701du.LIZ((C37701du) iDfS292S0100000.l0, C12X.TIME_OUT);
    }

    public static final void accept$47(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((TextView) ((C37791e3) iDfS292S0100000.l0).LIZ(R.id.m34)).setText(C15380j0.LJIILL(R.string.sr4, C1FP.LJIIL(((Integer) obj).intValue())));
        C12U c12u = ((C37791e3) iDfS292S0100000.l0).LJLJI;
        if (c12u != null) {
            C12U.LJIIIZ(c12u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$48(Y.IDfS292S0100000 r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS292S0100000.accept$48(Y.IDfS292S0100000, java.lang.Object):void");
    }

    public static final void accept$49(IDfS292S0100000 iDfS292S0100000, Object obj) {
        Throwable it = (Throwable) obj;
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDfS292S0100000.l0;
        o.LJIIIIZZ(it, "it");
        C3C4 LIZ = C141335gf.LIZ(it);
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }

    public static final void accept$5(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((InterfaceC29911Fj) iDfS292S0100000.l0).onChanged(obj);
    }

    public static final void accept$50(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((C37931eH) iDfS292S0100000.l0).LIZLLL();
    }

    public static final void accept$51(IDfS292S0100000 iDfS292S0100000, Object obj) {
        C277116x c277116x = (C277116x) iDfS292S0100000.l0;
        c277116x.getClass();
        C30868C9o.LIZJ(R.string.mg7);
        ((Handler) c277116x.LJFF.getValue()).postDelayed((Runnable) c277116x.LJII.getValue(), c277116x.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$52(IDfS292S0100000 iDfS292S0100000, Object obj) {
        T t;
        CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) iDfS292S0100000.l0;
        BaseResponse baseResponse = (BaseResponse) obj;
        copyrightViolationHelper.LJLJJLL = false;
        if (baseResponse != null && (t = baseResponse.data) != 0 && ((NotificationConfirmResponse) t).statusCode != 0) {
            copyrightViolationHelper.LJ(2);
        }
    }

    public static final void accept$53(IDfS292S0100000 iDfS292S0100000, Object obj) {
        int i;
        CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) iDfS292S0100000.l0;
        copyrightViolationHelper.LJLJI.dismiss();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            if (CopyrightViolationHelper.LIZIZ(room)) {
                i = 1;
            } else {
                i = 2;
            }
            copyrightViolationHelper.LIZLLL(room, i, 103);
            if (CopyrightViolationHelper.LIZIZ(room)) {
                C29162BcU.LIZIZ(0, null);
                return;
            }
            Runnable runnable = copyrightViolationHelper.LJLJL;
            if (runnable == null) {
                return;
            }
            runnable.run();
        }
    }

    public static final void accept$54(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((CopyrightViolationHelper) iDfS292S0100000.l0).LJLJJL = false;
    }

    public static final void accept$6(IDfS292S0100000 iDfS292S0100000, Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            ((ImageView) iDfS292S0100000.l0).setImageDrawable(drawable);
        }
    }

    public static final void accept$7(IDfS292S0100000 iDfS292S0100000, Object obj) {
        if (((CYQ) obj).LIZIZ == 1) {
            C1G2.LIZIZ((C1G2) iDfS292S0100000.l0, 3);
        }
    }

    public static final void accept$8(IDfS292S0100000 iDfS292S0100000, Object obj) {
        boolean z;
        ((LiveBGMFragment) iDfS292S0100000.l0).Dl();
        LiveBGMFragment liveBGMFragment = (LiveBGMFragment) iDfS292S0100000.l0;
        if (liveBGMFragment.LJZL) {
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(liveBGMFragment);
            if (((LiveBGMFragment) iDfS292S0100000.l0).LJLJLLL == ((int) LiveBGMDefaultVolumeSetting.INSTANCE.getValue())) {
                z = true;
            } else {
                z = false;
            }
            int i = ((LiveBGMFragment) iDfS292S0100000.l0).LJLJLLL;
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_ksong_volume_adjust");
            LIZ.LJIILLIIL(LJIILIIL);
            LIZ.LJIJJ(Boolean.valueOf(z), "is_default");
            LIZ.LJIL("adjusted_volume", Float.valueOf(i / 200));
            LIZ.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
            LIZ.LJJIIJZLJL();
            ((LiveBGMFragment) iDfS292S0100000.l0).LJZL = false;
        }
    }

    public static final void accept$9(IDfS292S0100000 iDfS292S0100000, Object obj) {
        ((TextView) ((LiveMusicDialog) iDfS292S0100000.l0)._$_findCachedViewById(R.id.gtg)).setText((CharSequence) obj);
        ((TextView) ((LiveMusicDialog) iDfS292S0100000.l0)._$_findCachedViewById(R.id.gtg)).setSelected(true);
        if (C14270hD.LJZI == null && !C14270hD.LL) {
            ((TextView) ((LiveMusicDialog) iDfS292S0100000.l0)._$_findCachedViewById(R.id.gtg)).setText(C15380j0.LJIILJJIL(R.string.mex));
        }
    }
}
