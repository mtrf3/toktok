package com.ss.android.ugc.aweme.storage;

import X.C0RN;
import X.C22680um;
import X.C23950wp;
import X.C39687Fhr;
import X.C39689Fht;
import X.C56463MDz;
import X.C62822Ol8;
import X.C78983UzD;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.P8H;
import X.SU4;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.common.lib.AppLogNewUtils;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class StorageInfoReportTask implements EE1 {
    public final Keva LJLIL = Keva.getRepo("storage_info");

    @Override // X.EEY
    public final String key() {
        return "StorageInfoReportTask";
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
        C62822Ol8 c62822Ol8 = C23950wp.LIZ;
        if ((((Number) c62822Ol8.getValue()).intValue() & 1) == 1) {
            return EFK.BOOT_FINISH;
        }
        if ((((Number) c62822Ol8.getValue()).intValue() & 2) == 2) {
            return EFK.APP_BACKGROUND;
        }
        return EFK.APP_BACKGROUND;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        try {
            long j = 0;
            if (SU4.LIZLLL(this.LJLIL.getLong("STORAGE_INFO_REPORT_TASK_LAST_TIME", 0L))) {
                return;
            }
            this.LJLIL.storeLong("STORAGE_INFO_REPORT_TASK_LAST_TIME", System.currentTimeMillis());
            JSONObject jSONObject = new JSONObject();
            C39689Fht LJIILIIL = C39687Fhr.LJIILIIL(context);
            File LJIIIIZZ = P8H.LJIIIIZZ(context);
            if (LJIIIIZZ != null) {
                j = C56463MDz.LJ(LJIIIIZZ.getParent());
            }
            jSONObject.put("app_storage_size", LJIILIIL.LJ);
            jSONObject.put("app_storage_external_size", LJIILIIL.LJFF);
            jSONObject.put("app_storage_internal_size", LJIILIIL.LJI);
            jSONObject.put("storage_total_external_size", LJIILIIL.LIZIZ);
            jSONObject.put("storage_total_internal_size", LJIILIIL.LIZLLL);
            jSONObject.put("storage_total_sdcard_size", j);
            jSONObject.put("storage_available_external_size", LJIILIIL.LIZ);
            jSONObject.put("storage_available_internal_size", LJIILIIL.LIZJ);
            jSONObject.put("storage_app_size", LJIILIIL.LJIIIIZZ);
            jSONObject.put("storage_data_size", LJIILIIL.LJIIIZ);
            jSONObject.put("storage_cache_size", LJIILIIL.LJIIJ);
            jSONObject.put("total_storage_size", LJIILIIL.LJIIIIZZ + LJIILIIL.LJIIIZ + LJIILIIL.LJIIJ);
            JSONObject jSONObject2 = new JSONObject();
            C22680um.LIZ(context, jSONObject2);
            if (jSONObject2.toString().length() <= 819200) {
                jSONObject.put("is_disk_usage_off_limit", false);
                jSONObject.put("disk_usage", jSONObject2);
            } else {
                jSONObject.put("is_disk_usage_off_limit", true);
            }
            AppLogNewUtils.onEventV3("storage_info", jSONObject);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }
}
