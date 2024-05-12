package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C0K2;
import X.C1DG;
import X.C207798Dn;
import X.C31214CMw;
import X.C38423F6d;
import X.C47497IkX;
import X.C65198PiM;
import X.PCF;
import X.PGH;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveSlardarTagSetting;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.LivePlayActivity;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes12.dex */
public class LiveHostConfig implements IHostConfig {
    public final C31214CMw LJLIL = new C31214CMw();
    public volatile boolean LJLILLLLZI;

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final synchronized void EB() {
        if (this.LJLILLLLZI) {
            return;
        }
        if (((Boolean) LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL().LIZJ(Boolean.TRUE, "live_enable_launch_parasitic_modules")).booleanValue()) {
            try {
                Iterator it = ServiceManager.get().getServices(ILiveParasiticModuleLaunchService.class).iterator();
                while (it.hasNext()) {
                    ((ILiveParasiticModuleLaunchService) it.next()).LIZ();
                }
            } catch (Throwable th) {
                HashMap hashMap = new HashMap();
                hashMap.put("error_msg", th.getMessage());
                C0K2.LJII(1, "ttlive_live_launch_parasitic_modules", hashMap);
            }
        }
        this.LJLILLLLZI = true;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final boolean DO() {
        return C38423F6d.LIZ.initPitaya(null);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final Set<String> IY() {
        Set<String> set;
        PCF pcf = (PCF) PGH.LIZ(PCF.class);
        if (pcf != null && pcf.getConfig() != null && (set = (Set) pcf.getConfig().LJLILLLLZI) != null && !set.isEmpty()) {
            return set;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final void Wt() {
        Npth.addAttachUserData(new AttachUserData() { // from class: X.Bbu
            @Override // com.bytedance.crash.AttachUserData
            public final java.util.Map getUserData(CrashType crashType) {
                String str;
                if (C84763XOl.LJIIIIZZ() instanceof LivePlayActivity) {
                    InterfaceC30442Bx8.k3.LIZ(Boolean.TRUE);
                }
                if (LiveSlardarTagSetting.INSTANCE.getCurrentValue().enable) {
                    java.util.Map<String, String> jM = ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).jM();
                    java.util.Map<String, String> broadcastTag = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastTag();
                    HashMap hashMap = new HashMap(32);
                    if (C29121Bbp.LIZIZ().size() != 0) {
                        if (Boolean.parseBoolean((String) C29121Bbp.LIZIZ().get("is_anchor"))) {
                            if (broadcastTag != null) {
                                hashMap.putAll(broadcastTag);
                            }
                        } else if (jM != null) {
                            hashMap.putAll(jM);
                        }
                        hashMap.put("room_type", B4U.LIZ().getBroadcastScene());
                        hashMap.put("live_sdk_version", "3060");
                        int i = C29121Bbp.LIZLLL;
                        if (i < 0) {
                            str = "invalid count";
                        } else if (i < 25) {
                            str = "[0, 25)";
                        } else if (i < 50) {
                            str = "[25, 50)";
                        } else if (i < 100) {
                            str = "[50, 100)";
                        } else if (i < 500) {
                            str = "[100, 500)";
                        } else if (i < 1000) {
                            str = "[500, 1K)";
                        } else if (i < 5000) {
                            str = "[1K, 5K)";
                        } else if (i < 10000) {
                            str = "[5K, 10K)";
                        } else if (i < 50000) {
                            str = "[10K, 50K)";
                        } else if (i < 100000) {
                            str = "[50K, 100K)";
                        } else if (i < 500000) {
                            str = "[100K, 500K)";
                        } else if (i < 1000000) {
                            str = "[500K, 1M)";
                        } else {
                            str = "[1M, +∞)";
                        }
                        hashMap.put("room_user_count", str);
                        List<E> list = ((C65816PsK) C29121Bbp.LIZIZ.getValue()).LIZIZ;
                        int i2 = 0;
                        if (list != 0) {
                            int i3 = 0;
                            for (Object obj : list) {
                                int i4 = i3 + 1;
                                if (i3 >= 0) {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("live_message_");
                                    LIZ.append(i4);
                                    hashMap.put(X1D.LIZIZ(LIZ), obj);
                                    i3 = i4;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                        }
                        List<E> list2 = ((C65816PsK) C29121Bbp.LIZJ.getValue()).LIZIZ;
                        if (list2 != 0) {
                            for (Object obj2 : list2) {
                                int i5 = i2 + 1;
                                if (i2 >= 0) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("live_log_");
                                    LIZ2.append(i5);
                                    hashMap.put(X1D.LIZIZ(LIZ2), obj2);
                                    i2 = i5;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                        }
                        hashMap.putAll(C29121Bbp.LIZIZ());
                    }
                    Npth.addTags(hashMap);
                }
                return null;
            }
        }, CrashType.ALL);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final C65198PiM es() {
        C65198PiM c65198PiM = new C65198PiM();
        RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.LJFF.LIZ;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (rateSettingsResponse != null) {
            double speed = C47497IkX.LJ().getSpeed();
            AutoBitrateSet autoBitrateSetLive = rateSettingsResponse.getAutoBitrateSetLive();
            if (speed > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && autoBitrateSetLive != null) {
                d = Math.max((autoBitrateSetLive.thirdParam * speed) + C207798Dn.LIZ(autoBitrateSetLive.secondParam, speed, speed, autoBitrateSetLive.firstParam * speed * speed * speed) + autoBitrateSetLive.fourthParam, autoBitrateSetLive.minBitrate);
            }
        }
        int LIZJ = C1DG.LIZ().LIZJ();
        c65198PiM.LIZ = d;
        c65198PiM.LIZIZ = LIZJ;
        return c65198PiM;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final C31214CMw qS() {
        return this.LJLIL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final void TR(String str, String str2) {
        if (str2 == null) {
            Npth.removeImportTag(str);
        } else {
            Npth.addImportTag(str, str2);
        }
    }
}
