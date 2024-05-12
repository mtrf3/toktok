package X;

import com.bytedance.android.common.setting.ShowTipLowEndDeviceMax;
import com.bytedance.android.live.broadcast.setting.MobileGameFeedbackAnalyseInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.EnablePerformanceTipsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LowLevelDeviceShowTimesSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.0q7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19790q7 {
    public static final int LJFF = LowLevelDeviceShowTimesSetting.INSTANCE.getValue();
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public final AtomicBoolean LJ;

    public final void LIZJ() {
        boolean z;
        boolean isEnableLowDevices = EnablePerformanceTipsSetting.INSTANCE.isEnableLowDevices();
        Integer LIZJ = InterfaceC30442Bx8.O2.LIZJ();
        o.LJIIIIZZ(LIZJ, "GAME_LIVE_LOW_DEVICE_TIPS_COUNT.value");
        boolean z2 = true;
        if (LIZJ.intValue() >= LJFF) {
            z = true;
        } else {
            z = false;
        }
        if (!isEnableLowDevices || z || this.LJ.get()) {
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZLLL = C00F.LIZLLL("updateCanShowLowDeviceTips(). canShowLowDeviceTips=false. reason{enableLowDeviceTips=", isEnableLowDevices, ", hadBeyondLowDeviceTipsShowCount=", z, ", hadShowLowDeviceTips=");
                LIZLLL.append(this.LJ.get());
                LIZLLL.append('}');
                C0NB.LJIIIZ("LowDevicePerformanceTrigger", X1D.LIZIZ(LIZLLL));
            }
            this.LIZ = false;
            return;
        }
        if (this.LIZ) {
            return;
        }
        OSZ osz = (OSZ) DataChannelGlobal.LJLJJI.mv0(C29057Ban.class);
        if (osz == null || ((Number) osz.getFirst()).floatValue() >= ShowTipLowEndDeviceMax.INSTANCE.getValue()) {
            z2 = false;
        }
        this.LIZ = z2;
        if (!C30922CBq.LIZIZ) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateCanShowLowDeviceTips(). canShowLowDeviceTips=");
        LIZ.append(this.LIZ);
        LIZ.append(". reason{isLowDevice=");
        LIZ.append(z2);
        LIZ.append('}');
        C0NB.LJIIIZ("LowDevicePerformanceTrigger", X1D.LIZIZ(LIZ));
    }

    public C19790q7() {
        boolean z;
        double d;
        OSZ osz = (OSZ) DataChannelGlobal.LJLJJI.mv0(C29057Ban.class);
        if (osz != null && ((Number) osz.getFirst()).floatValue() < ShowTipLowEndDeviceMax.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = z;
        C31024CFo c31024CFo = C31032CFw.LIZ;
        c31024CFo.LIZIZ();
        if (c31024CFo.LJ > 0 && c31024CFo.LJFF > 0) {
            c31024CFo.LIZIZ();
            d = c31024CFo.LJ / c31024CFo.LJFF;
        } else {
            d = -999.0d;
        }
        this.LIZJ = d >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d * ((double) 100) < ((double) MobileGameFeedbackAnalyseInfo.INSTANCE.getValue().getPower_low());
        this.LIZLLL = C1O1.LJIIJJI();
        this.LJ = new AtomicBoolean(false);
    }

    public final void LIZ(List<OSZ<Float, Boolean>> list) {
        boolean z = false;
        if (!EnablePerformanceTipsSetting.INSTANCE.isEnableHighTemperatureTips()) {
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("LowDevicePerformanceTrigger", "updateCanShowHighTemperatureTips(). canShowHighTemperatureTips=false. reason{enableHighTemperature=false}");
            }
            this.LIZIZ = false;
            return;
        }
        if (this.LIZIZ) {
            return;
        }
        MobileGameFeedbackAnalyseInfo mobileGameFeedbackAnalyseInfo = MobileGameFeedbackAnalyseInfo.INSTANCE;
        int battery_temp_lasting = mobileGameFeedbackAnalyseInfo.getValue().getBattery_temp_lasting() / 5;
        int i = battery_temp_lasting + 1;
        List<OSZ> LLILZ = ORZ.LLILZ(i, list);
        if (LLILZ.size() < battery_temp_lasting) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("not show high temperature tips. reason: temperature_count(");
            LIZ.append(LLILZ.size());
            LIZ.append(") < ");
            LIZ.append(battery_temp_lasting);
            C0NB.LJIIL("HighTemperaturePerformanceTips", X1D.LIZIZ(LIZ));
        } else {
            float battery_temp_android = mobileGameFeedbackAnalyseInfo.getValue().getBattery_temp_android();
            if (LLILZ.size() == battery_temp_lasting) {
                for (OSZ osz : LLILZ) {
                    if (((Number) osz.getFirst()).floatValue() < battery_temp_android) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("not show high temperature tips. reason: not_first_temperature(");
                        LIZ2.append(((Number) osz.getFirst()).floatValue());
                        LIZ2.append(") < ");
                        LIZ2.append(battery_temp_android);
                        LIZ2.append(". temperature list=");
                        LIZ2.append(LLILZ);
                        C0NB.LJIIL("HighTemperaturePerformanceTips", X1D.LIZIZ(LIZ2));
                        break;
                    }
                }
                z = true;
            } else {
                if (LLILZ.size() == i) {
                    int i2 = 0;
                    for (OSZ osz2 : LLILZ) {
                        int i3 = i2 + 1;
                        if (i2 == 0) {
                            if (((Number) osz2.getFirst()).floatValue() >= battery_temp_android) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("not show high temperature tips. reason: first_temperature(");
                                LIZ3.append(((Number) osz2.getFirst()).floatValue());
                                LIZ3.append(") >= ");
                                LIZ3.append(battery_temp_android);
                                LIZ3.append(". temperature list=");
                                LIZ3.append(LLILZ);
                                C0NB.LJIIL("HighTemperaturePerformanceTips", X1D.LIZIZ(LIZ3));
                                break;
                            }
                            i2 = i3;
                        } else {
                            if (((Number) osz2.getFirst()).floatValue() < battery_temp_android) {
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("not show high temperature tips. reason: not_first_temperature(");
                                LIZ4.append(((Number) osz2.getFirst()).floatValue());
                                LIZ4.append(") < ");
                                LIZ4.append(battery_temp_android);
                                LIZ4.append(". temperature list=");
                                LIZ4.append(LLILZ);
                                C0NB.LJIIL("HighTemperaturePerformanceTips", X1D.LIZIZ(LIZ4));
                                break;
                            }
                            i2 = i3;
                        }
                    }
                }
                z = true;
            }
        }
        this.LIZIZ = z;
        if (!C30922CBq.LIZIZ) {
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("updateCanShowHighTemperatureTips(). canShowHighTemperatureTips=");
        LIZ5.append(this.LIZIZ);
        LIZ5.append(". reason{isContinueHighTemperature=");
        LIZ5.append(this.LIZIZ);
        LIZ5.append('}');
        C0NB.LJIIIZ("LowDevicePerformanceTrigger", X1D.LIZIZ(LIZ5));
    }

    public final void LIZIZ(List<Boolean> list) {
        boolean z = false;
        if (!EnablePerformanceTipsSetting.INSTANCE.isEnableLowBattery()) {
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("LowDevicePerformanceTrigger", "updateCanShowLowBatteryTips(). canShowLowBatteryTips=false. reason{enableLowBattery=false}");
            }
            this.LIZJ = false;
            return;
        }
        if (this.LIZJ) {
            return;
        }
        int size = list.size();
        if (size > 0 && ((size == 1 && ((Boolean) ListProtector.get(list, 0)).booleanValue()) || (((Boolean) ListProtector.get(list, size - 1)).booleanValue() && !((Boolean) ListProtector.get(list, size - 2)).booleanValue()))) {
            z = true;
        }
        this.LIZJ = z;
        if (!C30922CBq.LIZIZ) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateCanShowLowBatteryTips(). canShowLowBatteryTips=");
        LIZ.append(this.LIZJ);
        LIZ.append(". reason{isChangeToLowBatteryFromNormalBattery=");
        LIZ.append(this.LIZJ);
        LIZ.append('}');
        C0NB.LJIIIZ("LowDevicePerformanceTrigger", X1D.LIZIZ(LIZ));
    }

    public final void LIZLLL(List<Boolean> list) {
        boolean z = false;
        if (!EnablePerformanceTipsSetting.INSTANCE.isEnableSaveMode()) {
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("LowDevicePerformanceTrigger", "updateCanShowSaveModeTips(). canShowSaveModeTips=false. reason{enableSaveMode=false}");
            }
            this.LIZLLL = false;
            return;
        }
        if (this.LIZLLL) {
            return;
        }
        int size = list.size();
        if (size != 0 && ((size == 1 && ((Boolean) ListProtector.get(list, 0)).booleanValue()) || (((Boolean) ListProtector.get(list, size - 1)).booleanValue() && !((Boolean) ListProtector.get(list, size - 2)).booleanValue()))) {
            z = true;
        }
        this.LIZLLL = z;
        if (!C30922CBq.LIZIZ) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateCanShowSaveModeTips(). canShowSaveModeTips=");
        LIZ.append(this.LIZLLL);
        LIZ.append(". reason{isChangeToSaveModeFromNormalMode=");
        LIZ.append(this.LIZLLL);
        LIZ.append('}');
        C0NB.LJIIIZ("LowDevicePerformanceTrigger", X1D.LIZIZ(LIZ));
    }
}
