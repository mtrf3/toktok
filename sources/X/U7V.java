package X;

import Y.ARunnableS46S0100000_10;
import android.os.Looper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcLiveVideoParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcResolution;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkCommonBean;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.RtcParams;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkPosition;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class U7V {
    public static final /* synthetic */ int LIZ = 0;

    public static MicPositionData LIZIZ(OnLineMicInfo onLineMicInfo) {
        int i;
        int i2;
        if (onLineMicInfo != null) {
            MicPositionInfo micPositionData = onLineMicInfo.getMicPositionData();
            if (micPositionData != null) {
                i = micPositionData.getPosition();
            } else {
                i = -1;
            }
            MicPositionInfo micPositionData2 = onLineMicInfo.getMicPositionData();
            if (micPositionData2 != null) {
                i2 = micPositionData2.getStrategy();
            } else {
                i2 = 0;
            }
            return new MicPositionData(onLineMicInfo.getOnLinePattern(), new LinkPosition(i, i2));
        }
        return null;
    }

    public static /* synthetic */ OnLineMicInfo LIZLLL(MicPositionData micPositionData) {
        return LIZJ(micPositionData, 0L);
    }

    public static String LJ(U66 u66) {
        String str;
        RtcUserInfo LLZL;
        if (u66 == null || (LLZL = u66.LLZL()) == null || (str = LLZL.getLinkMicId()) == null) {
            str = C74838TYs.LJ().LJIILIIL;
            if (str == null) {
                str = "";
            }
            C279017q.LJ("rtc mix task_id is: ", str, "DataConverterUtil");
        }
        return str;
    }

    public static DSLConfig LJFF(LayoutDSLConfig layoutDSLConfig) {
        String str;
        int i;
        if (layoutDSLConfig == null || (str = layoutDSLConfig.getLayoutId()) == null) {
            str = "";
            if (layoutDSLConfig == null) {
                i = -1;
                return new DSLConfig(i, str);
            }
        }
        i = layoutDSLConfig.getSceneVersion();
        return new DSLConfig(i, str);
    }

    public static LayoutDSLConfig LJI(DSLConfig dSLConfig) {
        String str;
        int i;
        LayoutDSLConfig.Builder builder = new LayoutDSLConfig.Builder();
        if (dSLConfig == null || (str = dSLConfig.layoutId) == null) {
            str = "";
        }
        builder.setLayoutId(str);
        if (dSLConfig != null) {
            i = dSLConfig.sceneVersion;
        } else {
            i = -1;
        }
        builder.setSceneVersion(i);
        return builder.build();
    }

    public static LinkCommonBean LJII(int i) {
        LinkCommonBean linkCommonBean = new LinkCommonBean(0, 0L, 0L, null, 15, null);
        linkCommonBean.scene = i;
        linkCommonBean.appId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId();
        linkCommonBean.live_id = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
        return linkCommonBean;
    }

    public static void LJIILJJIL(InterfaceC65784Pro interfaceC65784Pro) {
        C76766UAw c76766UAw = C76766UAw.LIZJ;
        if (!o.LJ(c76766UAw.LIZIZ(), Looper.myLooper())) {
            c76766UAw.LIZJ(new ARunnableS46S0100000_10(interfaceC65784Pro, 10));
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    public static boolean LIZ(List array1, List array2) {
        o.LJIIIZ(array1, "array1");
        o.LJIIIZ(array2, "array2");
        if (array1.size() != array2.size()) {
            return false;
        }
        int size = array1.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(array1, i);
            Object obj2 = ListProtector.get(array2, i);
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public static OnLineMicInfo LIZJ(MicPositionData micPositionData, Long l) {
        int i;
        int i2;
        int i3;
        long j;
        if (micPositionData != null) {
            LinkPosition linkPosition = micPositionData.linkPosition;
            if (linkPosition != null) {
                i = linkPosition.positionType;
                i2 = linkPosition.position;
                i3 = linkPosition.position;
            } else {
                i = 0;
                i2 = -1;
                i3 = -1;
            }
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            return new OnLineMicInfo(micPositionData.type, new MicPositionInfo(i, i2, i3, j));
        }
        return null;
    }

    public static LinkCommonBean LJIIIIZZ(int i, java.util.Map map) {
        LinkCommonBean linkCommonBean = new LinkCommonBean(0, 0L, 0L, null, 15, null);
        linkCommonBean.scene = i;
        linkCommonBean.appId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId();
        linkCommonBean.live_id = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
        linkCommonBean.extraMap = map;
        return linkCommonBean;
    }

    public static String LJIIIZ(RTCExtraInfo rTCExtraInfo, long j) {
        if (rTCExtraInfo != null) {
            JSONObject jSONObject = new JSONObject(C38393F4z.LJFF(rTCExtraInfo));
            JSONObject optJSONObject = jSONObject.optJSONObject("live_rtc_engine_config");
            if (optJSONObject != null) {
                optJSONObject.put("rtc_channel_id", String.valueOf(j));
                jSONObject.put("live_rtc_engine_config", optJSONObject);
            }
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "curJsonObject.toString()");
            return jSONObject2;
        }
        return "";
    }

    public static void LJIIJJI(Throwable throwable, InterfaceC76768UAy interfaceC76768UAy) {
        o.LJIIIZ(throwable, "throwable");
        if (throwable instanceof C276516r) {
            if (interfaceC76768UAy != null) {
                int errorCode = ((C276516r) throwable).getErrorCode();
                String message = throwable.getMessage();
                if (message == null) {
                    message = "ApiException with null message";
                }
                interfaceC76768UAy.LIZJ(new LinkCoreError(errorCode, message), throwable);
                return;
            }
            return;
        }
        if (interfaceC76768UAy != null) {
            LinkCoreError.Companion companion = LinkCoreError.Companion;
            int errorCode2 = companion.getCOMMON_UNKNOWN().getErrorCode();
            String message2 = throwable.getMessage();
            if (message2 == null) {
                message2 = companion.getCOMMON_UNKNOWN().getErrorMsg();
            }
            interfaceC76768UAy.LIZJ(new LinkCoreError(errorCode2, message2), throwable);
        }
    }

    public static void LJIIL(Throwable throwable, InterfaceC76767UAx interfaceC76767UAx) {
        o.LJIIIZ(throwable, "throwable");
        if (throwable instanceof CH1) {
            if (interfaceC76767UAx != null) {
                CH1 ch1 = (CH1) throwable;
                int errorCode = ch1.getErrorCode();
                String message = throwable.getMessage();
                if (message == null) {
                    message = "ApiException with null message";
                }
                interfaceC76767UAx.LIZ(new LinkCoreError(errorCode, message), throwable, ch1.getxTtLogId());
                return;
            }
            return;
        }
        if (interfaceC76767UAx != null) {
            LinkCoreError.Companion companion = LinkCoreError.Companion;
            int errorCode2 = companion.getCOMMON_UNKNOWN().getErrorCode();
            String message2 = throwable.getMessage();
            if (message2 == null) {
                message2 = companion.getCOMMON_UNKNOWN().getErrorMsg();
            }
            interfaceC76767UAx.LIZ(new LinkCoreError(errorCode2, message2), throwable, null);
        }
    }

    public static void LJIILIIL(Object obj, InterfaceC76768UAy interfaceC76768UAy) {
        if (obj == null) {
            if (interfaceC76768UAy != null) {
                interfaceC76768UAy.LIZJ(LinkCoreError.Companion.getCOMMON_RESPONSE_INVALID(), new Throwable("The response is null or invalid."));
            }
        } else if (interfaceC76768UAy != null) {
            interfaceC76768UAy.LIZIZ(obj);
        }
    }

    public static CustomLinkMessage LJIILL(LinkLayerMessage message, ExtraDataWrapper extraDataWrapper) {
        o.LJIIIZ(message, "message");
        return new CustomLinkMessage(message.scene, new BizContentWrapper(message.bizContent), extraDataWrapper);
    }

    public static Object LJIILLIIL(Class cls, String message) {
        o.LJIIIZ(message, "message");
        try {
            return C09650Zl.LIZIZ.LJI(message, cls);
        } catch (Exception e) {
            U4R.LIZJ("DataConverterUtil", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.gson.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.gson.j] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.gson.j] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.gson.m, java.lang.Object] */
    public static m LJIIJ(RtcLiveVideoParam rtcLiveVideoParam, U66 u66, boolean z) {
        ?? mVar;
        java.util.Map<String, Integer> map;
        String LIZ2;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getVideoParamRtcInfo, enableIndependentMixStreamParam=");
        LIZ3.append(z);
        U4R.LIZLLL("DataConverterUtil", X1D.LIZIZ(LIZ3));
        ?? mVar2 = new m();
        mVar2.LJJIIJ("rtc_video_param_mode", Integer.valueOf(rtcLiveVideoParam.getRtcVideoParamMode()));
        mVar2.LJJIIJ("rtc_mix_type", Integer.valueOf(rtcLiveVideoParam.getRtcMixType()));
        if (!z) {
            m mVar3 = new m();
            mVar3.LJJIIJ("video_bitrate_kbps", Integer.valueOf(rtcLiveVideoParam.getRtcMixParam().getVideoBitrateKbps()));
            if (C1XY.LJIJJ(u66) && u66 != null && u66.getScene() == 4) {
                mVar3.LJJIIZ("task_id", LJ(u66));
            }
            mVar2.LJJII("rtc_mix_param", mVar3);
        }
        Iterator<RtcResolution> it = rtcLiveVideoParam.getVideoResolutions().iterator();
        while (it.hasNext()) {
            RtcResolution next = it.next();
            RtcParams rtcParams = next.getResolution().getRtcParams();
            if (rtcParams != null && (map = rtcParams.codecParam) != null) {
                try {
                    mVar = C09650Zl.LIZIZ.LJIJJLI(map);
                } catch (Throwable th) {
                    if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
                        StackTraceElement LJ = C32014ChO.LJ();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ2 = C77800Ug8.LIZLLL(U44.LINKER, LIZ4, "_DataConverterUtil_", LJ, LIZ4);
                    } else {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ2 = C17M.LIZ(U44.LINKER, LIZ5, "_DataConverterUtil_", 131, LIZ5);
                    }
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("codecParam parse to json error: ");
                    LIZ6.append(th.getMessage());
                    C32014ChO.LIZJ(LIZ2, X1D.LIZIZ(LIZ6), null);
                    C0K2.LIZ("codecParam parse to json error", th);
                }
                if (mVar != 0) {
                    mVar2.LJJII(next.getModeName(), mVar);
                }
            }
            mVar = new m();
            mVar.LJJIIJ("width", Integer.valueOf(next.getResolution().getWidth()));
            mVar.LJJIIJ("height", Integer.valueOf(next.getResolution().getHeight()));
            mVar.LJJIIJ("fps", Integer.valueOf(next.getResolution().getFps()));
            mVar.LJJIIJ("bitrate_kbps", Integer.valueOf(next.getResolution().getBitrateKbps()));
            mVar2.LJJII(next.getModeName(), mVar);
        }
        ?? LIZ7 = X1D.LIZ();
        LIZ7.append("getVideoParamRtcInfo, videoParam: ");
        LIZ7.append(rtcLiveVideoParam);
        LIZ7.append(", liveVideoMode: ");
        LIZ7.append(mVar2);
        U4R.LIZLLL("DataConverterUtil", X1D.LIZIZ(LIZ7));
        return mVar2;
    }
}
