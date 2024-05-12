package com.bytedance.ies.ugc.statisticlogger.config;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F9J;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import java.io.RandomAccessFile;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class SetAppTrackTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "SetAppTrackTask";
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
        return 16777215;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    public static String LIZLLL(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            long length = randomAccessFile.length() - 2;
            randomAccessFile.seek(length);
            int read = (randomAccessFile.read() & 255) | ((randomAccessFile.read() & 255) << 8);
            if (read == 0) {
                randomAccessFile.close();
                return null;
            }
            randomAccessFile.seek(length - read);
            byte[] bArr = new byte[read];
            randomAccessFile.read(bArr);
            return bArr.toString();
        } finally {
            randomAccessFile.close();
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        try {
            String LIZLLL = LIZLLL(context.getPackageCodePath());
            if (!TextUtils.isEmpty(LIZLLL)) {
                AppLog.setAppTrack(new JSONObject(LIZLLL));
                SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, "applog_stats").edit();
                edit.putString("app_track", LIZLLL);
                edit.apply();
            }
        } catch (Throwable unused) {
        }
    }
}
