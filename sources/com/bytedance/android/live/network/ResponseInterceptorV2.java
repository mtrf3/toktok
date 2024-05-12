package com.bytedance.android.live.network;

import X.C31061CGz;
import X.C64797Pbt;
import X.C64908Pdg;
import X.C65132PhI;
import X.C65196PiK;
import X.CN1;
import X.EJ6;
import X.EVM;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUpgradeApiMapSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchThreadPriorityOptSetting;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.retrofit2.client.Request;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class ResponseInterceptorV2 implements InterfaceC37216Ej6 {
    public final C65196PiK LJLIL = new C65196PiK();

    public static ResponseInterceptorV2 LIZ() {
        return new ResponseInterceptorV2();
    }

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        Map<String, Double> value;
        Double d;
        String str;
        Map<String, Double> value2;
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        C65196PiK c65196PiK = this.LJLIL;
        c65196PiK.getClass();
        String path = request.getPath();
        o.LJIIIZ(path, "path");
        LiveWatchThreadPriorityOptSetting liveWatchThreadPriorityOptSetting = LiveWatchThreadPriorityOptSetting.INSTANCE;
        if (liveWatchThreadPriorityOptSetting.enableUpgradeApi() && (value = LiveUpgradeApiMapSetting.INSTANCE.getValue()) != null && value.containsKey(path) && (d = value.get(path)) != null) {
            double doubleValue = d.doubleValue();
            if (Process.getThreadPriority(Process.myTid()) > doubleValue) {
                EVM.LIZ(Process.myTid(), (int) doubleValue);
            }
        }
        String url = request.getUrl();
        if (!TextUtils.isEmpty(url)) {
            StringBuilder sb = new StringBuilder(url);
            c65196PiK.LIZ(sb);
            str = sb.toString();
        } else {
            str = "";
        }
        if (CN1.LIZ(IHostNetwork.class) != null) {
            ((IHostNetwork) CN1.LIZ(IHostNetwork.class)).minorModeInterceptMonitor(str);
        }
        C64908Pdg newBuilder = request.newBuilder();
        newBuilder.LIZJ(str);
        Request LIZ = newBuilder.LIZ();
        if (LIZ.getPath().equals("/webcast/room/enter/")) {
            if (LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable()) {
                LinkedList linkedList = new LinkedList(LIZ.getHeaders());
                linkedList.add(new EJ6("response-format", "protobuf"));
                C64908Pdg newBuilder2 = LIZ.newBuilder();
                newBuilder2.LIZJ = linkedList;
                LIZ = newBuilder2.LIZ();
            }
        } else if (C65132PhI.LIZJ(LIZ)) {
            LinkedList linkedList2 = new LinkedList(LIZ.getHeaders());
            linkedList2.add(new EJ6("response-format", "protobuf"));
            C64908Pdg newBuilder3 = LIZ.newBuilder();
            newBuilder3.LIZJ = linkedList2;
            LIZ = newBuilder3.LIZ();
        }
        C64797Pbt LIZ2 = f7s.LIZ(LIZ);
        C31061CGz.LIZIZ(LIZ, LIZ2, 2);
        String path2 = LIZ.getPath();
        o.LJIIIZ(path2, "path");
        if (liveWatchThreadPriorityOptSetting.enableUpgradeApi() && (value2 = LiveUpgradeApiMapSetting.INSTANCE.getValue()) != null && value2.containsKey(path2)) {
            JatoXL.resetPriority(Process.myTid());
        }
        return LIZ2;
    }
}
