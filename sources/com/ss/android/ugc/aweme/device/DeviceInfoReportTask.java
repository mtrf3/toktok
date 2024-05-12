package com.ss.android.ugc.aweme.device;

import X.AbstractC73638SvC;
import X.C0RN;
import X.C34272Dci;
import X.C39691Fhv;
import X.C88045Ygz;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FRC;
import X.T16;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.bytedance.keva.Keva;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public class DeviceInfoReportTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "DeviceInfoReportTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EE1
    public final EFK type() {
        if (((Boolean) C88045Ygz.LJFF.getValue()).booleanValue()) {
            return EFK.APP_BACKGROUND;
        }
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!FRC.LIZ) {
            final Context LIZIZ = EF7.LIZIZ();
            Keva keva = C34272Dci.LIZ;
            long j = keva.getLong("KEVA_KEY_TIME_DeviceInfoReporter", 0L);
            if (j != 0) {
                Date date = new Date(j);
                Date date2 = new Date();
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar.setTime(date);
                calendar2.setTime(date2);
                if (calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1)) {
                    return;
                }
            }
            keva.storeLong("KEVA_KEY_TIME_DeviceInfoReporter", new Date().getTime());
            AbstractC73638SvC.LJIILLIIL(new Callable() { // from class: X.Fhw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    Context context2 = LIZIZ;
                    C39693Fhx c39693Fhx = new C39693Fhx();
                    C39695Fhz c39695Fhz = new C39695Fhz();
                    c39695Fhz.LIZ = C39687Fhr.LJIIIIZZ();
                    int i6 = -1;
                    boolean z = false;
                    int i7 = -1;
                    for (int i8 = 0; i8 < C39687Fhr.LJIIJJI(); i8++) {
                        try {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("/sys/devices/system/cpu/cpu");
                            LIZ.append(i8);
                            LIZ.append("/cpufreq/cpuinfo_max_freq");
                            File file = new File(X1D.LIZIZ(LIZ));
                            if (file.exists()) {
                                byte[] bArr = new byte[128];
                                FileInputStream fileInputStream = new FileInputStream(file);
                                try {
                                    fileInputStream.read(bArr);
                                    int i9 = 0;
                                    while (Character.isDigit(bArr[i9]) && i9 < 128) {
                                        i9++;
                                    }
                                    Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i9)));
                                    if (valueOf.intValue() > i7) {
                                        i7 = valueOf.intValue();
                                    }
                                } catch (NumberFormatException unused) {
                                } catch (Throwable th) {
                                    fileInputStream.close();
                                    throw th;
                                }
                                fileInputStream.close();
                            }
                        } catch (IOException unused2) {
                        }
                    }
                    if (i7 == -1) {
                        FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
                        try {
                            int LJIJI = C39687Fhr.LJIJI("cpu MHz", fileInputStream2) * 1000;
                            if (LJIJI > i7) {
                                i7 = LJIJI;
                            }
                            fileInputStream2.close();
                        } catch (Throwable th2) {
                            fileInputStream2.close();
                            throw th2;
                        }
                    }
                    i6 = i7;
                    if (String.valueOf(i6).length() >= 6) {
                        i6 /= 1000;
                    }
                    c39695Fhz.LIZIZ = i6 * 1000;
                    c39695Fhz.LIZJ = C39687Fhr.LJIIJJI();
                    c39693Fhx.LIZ = c39695Fhz;
                    c39693Fhx.LIZIZ = C39687Fhr.LJIIL(context2);
                    c39693Fhx.LIZJ = C39687Fhr.LJIILIIL(context2);
                    C39697Fi1 c39697Fi1 = new C39697Fi1();
                    c39697Fi1.LIZ = C39687Fhr.LJIILL(context2);
                    c39697Fi1.LIZIZ = C39687Fhr.LJI(context2);
                    c39693Fhx.LIZLLL = c39697Fi1;
                    C39694Fhy c39694Fhy = new C39694Fhy();
                    if (C04330Ez.LIZ(context2, "android.permission.CAMERA") == 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c39694Fhy.LIZ = i;
                    if (C04330Ez.LIZ(context2, "android.permission.RECORD_AUDIO") == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    c39694Fhy.LIZIZ = i2;
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 33 && C04330Ez.LIZ(context2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    c39694Fhy.LIZJ = i3;
                    if (i10 >= 33 && C04330Ez.LIZ(context2, "android.permission.READ_MEDIA_IMAGES") == 0) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    c39694Fhy.LIZLLL = i4;
                    if (i10 >= 33 && C04330Ez.LIZ(context2, "android.permission.READ_MEDIA_VIDEO") == 0) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    c39694Fhy.LJ = i5;
                    if (i10 < 23 || Settings.canDrawOverlays(context2)) {
                        z = true;
                    }
                    c39694Fhy.LJFF = z;
                    c39693Fhx.LJ = c39694Fhy;
                    return c39693Fhx;
                }
            }).LJJIIJ(T16.LIZ()).LJIJJ(T16.LIZ()).LIZ(new C39691Fhv(LIZIZ));
            FRC.LIZ = true;
        }
    }
}
