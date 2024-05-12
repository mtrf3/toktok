package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C2NW;
import X.C36922EeM;
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
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class SetAppTrackTask implements EE1 {
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
        if (C2NW.LIZ().LJJIIZ()) {
            return EFK.BACKGROUND;
        }
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
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
            return new String(bArr);
        } finally {
            randomAccessFile.close();
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        C36922EeM.LJ("SetAppTrackTask");
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
