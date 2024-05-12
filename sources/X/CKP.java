package X;

import android.content.Context;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CKP implements LiveCore.Builder.ILogMonitor {
    public final WeakReference<Context> LIZ;
    public final InterfaceC15330iv LIZIZ;
    public final java.util.Map<String, String> LIZJ;
    public InterfaceC21030s7 LIZLLL;

    public CKP(C14090gv config) {
        String str;
        o.LJIIIZ(config, "config");
        this.LIZ = new WeakReference<>(config.LIZ);
        this.LIZIZ = config.LJIJI;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZJ = concurrentHashMap;
        InterfaceC31143CKd S40 = C7N.LJIJ().S40();
        if (S40 != null && (str = S40.get()) != null) {
            concurrentHashMap.put("cpu_soc", str);
        } else {
            InterfaceC31143CKd S402 = C7N.LJIJ().S40();
            if (S402 != null) {
                S402.LIZ(new CKU(this));
            }
        }
        concurrentHashMap.put("rtmp_type", String.valueOf(config.LIZJ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore.Builder.ILogMonitor
    public final void onLogMonitor(String str, JSONObject jSONObject) {
        Boolean valueOf;
        Object LIZ;
        long j;
        String LIZ2;
        for (String str2 : ((ConcurrentHashMap) this.LIZJ).keySet()) {
            if (jSONObject != null) {
                try {
                    jSONObject.put(str2, ((ConcurrentHashMap) this.LIZJ).get(str2));
                } catch (JSONException unused) {
                }
            }
        }
        InterfaceC30552Byu s40 = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).s40();
        Context context = this.LIZ.get();
        if (s40 != null && context != null && (LIZ2 = s40.LIZ(context)) != null && jSONObject != null) {
            jSONObject.put("gpu_name", LIZ2);
        }
        this.LIZIZ.LIZ(str, jSONObject);
        long j2 = 0;
        Boolean bool = null;
        if (jSONObject == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Boolean.valueOf(jSONObject.has("real_bitrate"));
            } catch (Exception e) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("get BitRate error ");
                LIZ3.append(e.getMessage());
                C0NB.LJ("LogMonitor", X1D.LIZIZ(LIZ3));
            }
        }
        if (C29306Beo.LJJIFFI(valueOf)) {
            if (jSONObject == null) {
                j = 0;
            } else {
                j = JSONObjectProtectorUtils.getLong(jSONObject, "real_bitrate");
            }
            C29689Bkz.LIZ.getClass();
            C29689Bkz.LJFF.put("video_bitrate", String.valueOf(j));
            InterfaceC21030s7 interfaceC21030s7 = this.LIZLLL;
            if (interfaceC21030s7 != null) {
                interfaceC21030s7.u4(j);
            }
        }
        if (jSONObject != null) {
            try {
                bool = Boolean.valueOf(jSONObject.has("real_video_framerate"));
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
        }
        if (C29306Beo.LJJIFFI(bool)) {
            if (jSONObject != null) {
                j2 = JSONObjectProtectorUtils.getLong(jSONObject, "real_video_framerate");
            }
            C29689Bkz.LIZ.getClass();
            C29689Bkz.LJFF.put("video_framerate", String.valueOf(j2));
        }
        LIZ = C76800UCe.LIZ;
        C3C5.m7constructorimpl(LIZ);
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("get FrameRate error ");
            LIZ4.append(m10exceptionOrNullimpl.getMessage());
            C0NB.LJ("LogMonitor", X1D.LIZIZ(LIZ4));
        }
    }
}
