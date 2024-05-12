package X;

import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.IDCListenerS159S0100000_5;
import Y.IDCListenerS78S0000000_5;
import Y.IDcS170S0100000_5;
import Y.IDcS93S0200000_5;
import android.content.Context;
import android.os.Message;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.model.CreateInfoPerceptionMessage;
import com.bytedance.android.live.broadcast.model.LiveEventInfo;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.model.PermissionLevelInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.broadcast.CommentFeatureChannel;
import com.bytedance.android.livesdk.broadcast.PermissionApplyInfoChannel;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.broadcast.ShakeBlockTipEvent;
import com.bytedance.android.livesdk.broadcast.preview.helper.CppAgeVerifyDialogHelper;
import com.bytedance.android.livesdk.dataChannel.GoLiveButtonClickEvent;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCastStateChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.IDqS0S0001000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.BWl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28915BWl implements InterfaceC72822Si2 {
    public final DataChannel LJLIL;
    public final Fragment LJLILLLLZI;
    public final Context LJLJI;
    public final C5H3 LJLJJI;
    public final C29180Bcm LJLJJL;
    public final BUT LJLJJLL;
    public final java.util.Map<String, Boolean> LJLJL;

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        LiveMode liveMode;
        InterfaceC40159FpT LJIILL;
        if (o.LJ(c199097rd.LJLIL, "ttlive_apply_success")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            String str2 = null;
            if (interfaceC78280Uns != null) {
                str = u.LJJIJIL(interfaceC78280Uns, "status", "");
            } else {
                str = null;
            }
            if (o.LJ(str, "success")) {
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null) {
                    this.LJLJL.put(interfaceC78280Uns2.getString("mode"), Boolean.TRUE);
                    BaseDialogFragment baseDialogFragment = C28559BIt.LIZ;
                    if (baseDialogFragment != null) {
                        baseDialogFragment.dismissAllowingStateLoss();
                    }
                    SparkContext sparkContext = C28559BIt.LIZIZ;
                    if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
                        LJIILL.close();
                    }
                    C30868C9o.LIZIZ(C29306Beo.LIZIZ(this.LJLJI), C15380j0.LJIILJJIL(R.string.mef));
                    BZI LIZ = C28787BRn.LIZ("livesdk_anchor_live_access_apply_success");
                    LIZ.LJIILLIIL(this.LJLIL);
                    DataChannel dataChannel = this.LJLIL;
                    if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
                        str2 = C28509BGv.LIZ(liveMode);
                    }
                    LIZ.LJIJJ(str2, "live_type");
                    LIZ.LJJIIJZLJL();
                    return;
                }
                return;
            }
            InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns3 != null) {
                str2 = u.LJJIJIL(interfaceC78280Uns3, "status", "");
            }
            if (!o.LJ(str2, "hit-risk")) {
                return;
            }
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.med));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, O] */
    public final void LIZIZ(InterfaceC28916BWm interfaceC28916BWm, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Boolean bool;
        long j;
        boolean z;
        Object obj;
        LiveEventInfo liveEventInfo;
        C7N.LJIIJJI().finishLivePlayActivity();
        if (interfaceC28916BWm != null) {
            bool = Boolean.valueOf(interfaceC28916BWm.LJII(this.LJLILLLLZI));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJ(bool)) {
            return;
        }
        if (C78977Uz7.LJJJLL((Hashtag) this.LJLIL.kv0(HashtagChangedChannel.class))) {
            InterfaceC30442Bx8.LLJLL.LIZ(Boolean.TRUE);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) this.LJLIL.kv0(RoomCreateInfoChannel.class);
        if (roomCreateInfo != null && (liveEventInfo = roomCreateInfo.mLiveEventInfo) != null) {
            j = liveEventInfo.id;
        } else {
            j = 0;
        }
        ((C32537Cpp) dataChannelGlobal.gv0(C29026BaI.class)).LIZ = Long.valueOf(j);
        RoomCreateInfo roomCreateInfo2 = (RoomCreateInfo) this.LJLIL.kv0(RoomCreateInfoChannel.class);
        if (roomCreateInfo2 != null) {
            z = roomCreateInfo2.isNewAnchor;
        } else {
            z = false;
        }
        ((C32537Cpp) dataChannelGlobal.gv0(C29030BaM.class)).LIZ = Boolean.valueOf(z);
        C48458J0c c48458J0c = InterfaceC30442Bx8.LLF;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel == null || (obj = dataChannel.kv0(CommentFeatureChannel.class)) == null) {
            obj = Boolean.TRUE;
        }
        c48458J0c.LIZ(obj);
        interfaceC65784Pro.invoke();
    }

    public C28915BWl(Context context, Fragment fragment, DataChannel dataChannel) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = fragment;
        this.LJLJI = context;
        this.LJLJJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 429));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        this.LJLJJL = (C29180Bcm) dataChannelGlobal.mv0(C29053Baj.class);
        this.LJLJJLL = (BUT) dataChannelGlobal.mv0(C29052Bai.class);
        this.LJLJL = new LinkedHashMap();
        if (C29306Beo.LJJI()) {
            C72818Shy.LIZLLL("ttlive_apply_success", this);
        }
    }

    public final void LIZJ(Message message, LiveMode liveMode, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, C73893SzJ c73893SzJ, boolean z) {
        Room room;
        DataChannel LJIILIIL;
        InterfaceC05190Ih interfaceC05190Ih;
        Object obj;
        o.LJIIIZ(liveMode, "liveMode");
        if (message == null) {
            return;
        }
        Object obj2 = null;
        if (message.what == 40) {
            Object obj3 = message.obj;
            if (obj3 instanceof Room) {
                interfaceC65784Pro.invoke();
                C29152BcK.LIZ.LJ(message, this.LJLIL, this.LJLILLLLZI);
                return;
            } else if (obj3 instanceof OSZ) {
                OSZ osz = (OSZ) obj3;
                if (osz != null) {
                    obj = osz.getFirst();
                } else {
                    obj = null;
                }
                if (obj instanceof Room) {
                    interfaceC65784Pro.invoke();
                    C29152BcK.LIZ.LJ(message, this.LJLIL, this.LJLILLLLZI);
                    return;
                }
            }
        }
        Object obj4 = message.obj;
        if (obj4 instanceof Exception) {
            if (z) {
                interfaceC65784Pro.invoke();
                C30868C9o.LIZJ(R.string.otj);
                return;
            }
            o.LJII(obj4, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            Exception exc = (Exception) obj4;
            int i = message.what;
            Fragment fragment = this.LJLILLLLZI;
            o.LJIIIZ(fragment, "fragment");
            Context context = fragment.getContext();
            if (context == null || (LJIILIIL = C51029K0z.LJIILIIL(fragment)) == null) {
                return;
            }
            C12800eq.LIZJ(EnumC12790ep.CreateLive);
            int i2 = 3000;
            if (i == 1) {
                interfaceC65784Pro.invoke();
                if (exc instanceof C29401Dk) {
                    C29401Dk c29401Dk = (C29401Dk) exc;
                    try {
                        switch (c29401Dk.getErrorCode()) {
                            case 2403:
                                C77437UaH c77437UaH = new C77437UaH(context);
                                c77437UaH.LIZIZ(R.string.mm2);
                                c77437UaH.LIZJ(R.string.t1i, new IDCListenerS78S0000000_5(4), false);
                                c77437UaH.LJ(R.string.sr5, new IDCListenerS159S0100000_5(context, 30), false);
                                DialogC77438UaI LIZ = c77437UaH.LIZ();
                                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-6120020395206866423")).LIZ) {
                                    LIZ.show();
                                    break;
                                }
                                break;
                            case 10018:
                                C0NQ.LIZIZ(context, fragment, new IDqS0S0001000(0), new C47771u9(context, LJIILIIL));
                                break;
                            case 30005:
                                C29156BcO.LIZJ(context, LJIILIIL);
                                break;
                            case 30010:
                                break;
                            case 30011:
                                C77437UaH c77437UaH2 = new C77437UaH(context);
                                c77437UaH2.LJJII = true;
                                c77437UaH2.LIZIZ(R.string.t1g);
                                c77437UaH2.LJ(R.string.so3, new IDCListenerS159S0100000_5(LJIILIIL, 31), false);
                                c77437UaH2.LIZJ(R.string.snx, DialogInterfaceOnClickListenerC28920BWq.LJLIL, false);
                                DialogC77438UaI LIZ2 = c77437UaH2.LIZ();
                                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-8544146860056119436")).LIZ) {
                                    LIZ2.show();
                                    break;
                                }
                                break;
                            case 4002044:
                                if (c73893SzJ != null) {
                                    c73893SzJ.onNext(c29401Dk.getPrompt());
                                }
                                BZI LIZ3 = C28787BRn.LIZ("livesdk_violation_toast");
                                InterfaceC29405BgP LIZJ = C279117r.LIZJ(LIZ3, LJIILIIL);
                                if (LIZJ != null && (interfaceC05190Ih = ((C29374Bfu) LIZJ).LIZIZ) != null) {
                                    obj2 = Long.valueOf(interfaceC05190Ih.getId());
                                }
                                LIZ3.LJIJJ(obj2, "violation_anchor_id");
                                LIZ3.LJIJJ(4002044, "violation_type");
                                C06490Nh.LIZLLL(LIZ3, "anchor", "user_type", "start_live", "scene_type");
                                break;
                            case 4003088:
                                ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
                                if (LIZIZ != null) {
                                    BXB.LIZ(LIZIZ, 1, LJIILIIL);
                                    break;
                                }
                                break;
                            case 4003089:
                                ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ(context);
                                if (LIZIZ2 != null) {
                                    BXB.LIZ(LIZIZ2, 3, LJIILIIL);
                                    break;
                                }
                                break;
                            case 4003100:
                                String optString = new JSONObject(((C29401Dk) exc).getExtra()).optString("decision_conf");
                                o.LJIIIIZZ(optString, "JSONObject(exception.ext…ptString(\"decision_conf\")");
                                C29156BcO.LIZLLL(4003100, context, LJIILIIL, optString);
                                break;
                            case 4003101:
                                C29156BcO.LIZLLL(4003101, context, LJIILIIL, "");
                                break;
                            default:
                                BPP.LIZLLL(context, exc, R.string.otj);
                                break;
                        }
                    } catch (Throwable unused) {
                    }
                    i2 = c29401Dk.getErrorCode();
                } else {
                    BPP.LIZLLL(context, exc, R.string.otj);
                }
                Object kv0 = LJIILIIL.kv0(LiveModeChannel.class);
                o.LJI(kv0);
                LiveMode liveMode2 = (LiveMode) kv0;
                C29689Bkz c29689Bkz = C29689Bkz.LIZ;
                c29689Bkz.getClass();
                C29689Bkz.LJ = liveMode2;
                c29689Bkz.LJIIL(new AqS171S0100000_5(exc, 865));
                c29689Bkz.LJIIJ(liveMode2);
                if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                    C38995FSd.LIZIZ().submit(new ARunnableS24S0200000_5(exc, liveMode2, 89));
                } else {
                    C29697Bl7.LIZLLL(exc, liveMode2);
                }
                C18210nZ.LIZ("ttlive_open_room", exc).LJIIIZ();
            }
            ((C29165BcX) C7N.LJ().startLiveManager()).i6(i2, LJIILIIL);
            return;
        }
        if (message.what == 1) {
            if (obj4 instanceof Room) {
                room = (Room) obj4;
            } else {
                room = null;
            }
            if (Room.isValid(room)) {
                if (room != null) {
                    obj2 = room.getStreamType();
                }
                if (liveMode == obj2) {
                    interfaceC88472Yns.invoke(room);
                    return;
                }
            }
            interfaceC65784Pro.invoke();
            IllegalStateException illegalStateException = new IllegalStateException("invalid room");
            BPP.LIZLLL(this.LJLJI, illegalStateException, R.string.otj);
            if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(liveMode, 340));
            } else {
                C29697Bl7.LJFF(102, liveMode);
            }
            C29689Bkz c29689Bkz2 = C29689Bkz.LIZ;
            c29689Bkz2.getClass();
            C29689Bkz.LJ = liveMode;
            c29689Bkz2.LJIIL(new AqS171S0100000_5(illegalStateException, 863));
            c29689Bkz2.LJIIJ(liveMode);
            C12800eq.LIZJ(EnumC12790ep.CreateLive);
            C18210nZ.LIZ("ttlive_open_room", illegalStateException).LJIIIZ();
            ((C29165BcX) C7N.LJ().startLiveManager()).i6(3001, this.LJLIL);
        }
    }

    public final void LIZ(Boolean bool, Integer num, Boolean bool2, InterfaceC28916BWm interfaceC28916BWm, C2A7 c2a7, LiveMode liveMode, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Boolean bool3;
        DataChannel dataChannel;
        java.util.Map map;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        Integer num2;
        PermissionLevelInfo permissionLevelInfo;
        Integer num3;
        RoomCreateInfo roomCreateInfo;
        PermissionLevelInfo permissionLevelInfo2;
        Integer num4;
        PermissionLevelInfo permissionLevelInfo3;
        CppAgeVerificationInfo cppAgeVerificationInfo;
        Integer num5;
        o.LJIIIZ(liveMode, "liveMode");
        String modeStr = liveMode.getModeFromServer();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.tv0(GoLiveButtonClickEvent.class, liveMode);
        if (interfaceC28916BWm != null) {
            interfaceC28916BWm.LIZIZ();
        }
        Boolean bool4 = (Boolean) dataChannelGlobal.mv0(LiveCastStateChannel.class);
        if (bool4 != null && bool4.booleanValue()) {
            C30868C9o.LIZJ(R.string.lec);
            if (interfaceC28916BWm != null) {
                interfaceC28916BWm.LJI("system_exit_pre_casting", "should stop casting.");
                return;
            }
            return;
        }
        DataChannel dataChannel2 = this.LJLIL;
        if (dataChannel2 != null && dataChannel2.kv0(PreviewBlockInfoChannel.class) != null) {
            if (interfaceC28916BWm != null) {
                interfaceC28916BWm.LJI("system_exit_live_blocked", "go live is blocked.");
            }
            if (c2a7 != null) {
                c2a7.LJJLL(R.style.a2j);
            }
            DataChannel dataChannel3 = this.LJLIL;
            if (dataChannel3 != null) {
                dataChannel3.qv0(ShakeBlockTipEvent.class, BUW.NORMAL_BLOCK);
                return;
            }
            return;
        }
        DataChannel dataChannel4 = this.LJLIL;
        Context context = this.LJLJI;
        o.LJIIIZ(dataChannel4, "dataChannel");
        o.LJIIIZ(context, "context");
        if ((num != null && num.intValue() == -1) || (roomCreateInfo = (RoomCreateInfo) dataChannel4.kv0(RoomCreateInfoChannel.class)) == null || (permissionLevelInfo2 = roomCreateInfo.permissionLevelInfo) == null || (num4 = permissionLevelInfo2.cppVersion) == null || num4.intValue() != 2 || (((permissionLevelInfo3 = roomCreateInfo.permissionLevelInfo) != null && (num5 = permissionLevelInfo3.permissionLevel) != null && num5.intValue() == 2) || (cppAgeVerificationInfo = roomCreateInfo.cppAgeVerificationInfo) == null || cppAgeVerificationInfo.cppAgeVerificationAb != 1 || cppAgeVerificationInfo.ageVerifyStatus != 1)) {
            DataChannel dataChannel5 = this.LJLIL;
            Context context2 = this.LJLJI;
            o.LJIIIZ(dataChannel5, "dataChannel");
            o.LJIIIZ(context2, "context");
            RoomCreateInfo roomCreateInfo2 = (RoomCreateInfo) dataChannel5.kv0(RoomCreateInfoChannel.class);
            if (roomCreateInfo2 != null) {
                List<CreateInfoPerceptionMessage> list = roomCreateInfo2.perceptionMessages;
                if (list != null) {
                    Iterator<CreateInfoPerceptionMessage> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().accessType == 2) {
                            break;
                        }
                    }
                }
                PermissionLevelInfo permissionLevelInfo4 = roomCreateInfo2.permissionLevelInfo;
                if (permissionLevelInfo4 != null && (num2 = permissionLevelInfo4.cppVersion) != null && num2.intValue() == 2 && (((permissionLevelInfo = roomCreateInfo2.permissionLevelInfo) == null || (num3 = permissionLevelInfo.permissionLevel) == null || num3.intValue() != 2) && C29306Beo.LJJIFFI(bool2))) {
                    C47071t1 c47071t1 = new C47071t1(context2);
                    c47071t1.LJIILLIIL(R.string.jzq);
                    c47071t1.LJFF(R.string.jzn);
                    c47071t1.LJIILJJIL = false;
                    c47071t1.LJIIL(R.string.jzp, new IDcS93S0200000_5(context2, dataChannel5, 1));
                    c47071t1.LJIIIZ(R.string.jzo, new IDcS170S0100000_5(dataChannel5, 6));
                    C28346BAo.LIZ(c47071t1.LIZ());
                    C0N7.LJIL(dataChannel5, "show");
                    return;
                }
            }
            if (interfaceC28916BWm != null) {
                bool3 = Boolean.valueOf(interfaceC28916BWm.LJ(this.LJLJJL, this.LJLJJLL));
            } else {
                bool3 = null;
            }
            if (!C29306Beo.LJJIFFI(bool3) || !C29306Beo.LJIL((Boolean) ((LinkedHashMap) this.LJLJL).get(modeStr)) || ((dataChannel = this.LJLIL) != null && (map = (java.util.Map) dataChannel.kv0(PermissionApplyInfoChannel.class)) != null && (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(modeStr)) != null && permissionApplyInfo.mApplyStatus == 1)) {
                C29306Beo.LJJIIJZLJL(this.LJLILLLLZI, null, new C28917BWn(interfaceC28916BWm, z, this, liveMode, interfaceC65784Pro, null), 3);
                return;
            }
            if (interfaceC28916BWm != null) {
                interfaceC28916BWm.LJI("system_exit_no_permission", "no broadcast permission.");
            }
            ActivityC45651qj LJIILL = g0.LJIILL(this.LJLJI);
            if (LJIILL != null) {
                DataChannel dataChannel6 = this.LJLIL;
                o.LJIIIIZZ(modeStr, "modeStr");
                C28559BIt.LIZLLL(dataChannel6, modeStr, LJIILL);
            }
            DataChannel dataChannel7 = this.LJLIL;
            if (dataChannel7 != null) {
                o.LJIIIIZZ(modeStr, "modeStr");
                C28559BIt.LIZ(dataChannel7, modeStr);
            }
            if (!z) {
                C0N7.LJ(this.LJLIL, true, false);
                return;
            }
            return;
        }
        if (!C29306Beo.LJJIFFI(bool)) {
            num = Integer.valueOf(roomCreateInfo.cppAgeVerificationInfo.ageVerifyProcessStatus);
        }
        if (num != null) {
            if (num.intValue() == 2) {
                FragmentManager fragmentManager = (FragmentManager) dataChannel4.kv0(C29494Bhq.class);
                if (fragmentManager == null) {
                    return;
                }
                CppAgeVerifyDialogHelper cppAgeVerifyDialogHelper = new CppAgeVerifyDialogHelper();
                cppAgeVerifyDialogHelper.LJLIL = false;
                cppAgeVerifyDialogHelper.show(fragmentManager, "");
                return;
            }
            if (num.intValue() == 3) {
                FragmentManager fragmentManager2 = (FragmentManager) dataChannel4.kv0(C29494Bhq.class);
                if (fragmentManager2 == null) {
                    return;
                }
                CppAgeVerifyDialogHelper cppAgeVerifyDialogHelper2 = new CppAgeVerifyDialogHelper();
                cppAgeVerifyDialogHelper2.LJLIL = true;
                cppAgeVerifyDialogHelper2.show(fragmentManager2, "");
                return;
            }
        }
        C47071t1 c47071t12 = new C47071t1(context);
        c47071t12.LJIILLIIL(R.string.jzg);
        c47071t12.LJFF(R.string.jzf);
        c47071t12.LJIILJJIL = false;
        c47071t12.LJIIL(R.string.jze, new BV0(context, dataChannel4));
        c47071t12.LJIIIZ(R.string.jzd, new IDcS170S0100000_5(dataChannel4, 5));
        C28346BAo.LIZ(c47071t12.LIZ());
        C0N7.LJIILIIL(dataChannel4, "show");
    }
}
