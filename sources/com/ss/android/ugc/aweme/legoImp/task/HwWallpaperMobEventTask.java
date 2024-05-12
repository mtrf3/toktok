package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C188727au;
import X.C221108m2;
import X.C30581Hy;
import X.C38489F8r;
import X.C52732Kmm;
import X.C62011OVj;
import X.C62016OVo;
import X.C62017OVp;
import X.C62822Ol8;
import X.C88045Ygz;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class HwWallpaperMobEventTask implements EE1 {
    public final long LJLIL = TimeUnit.DAYS.toMillis(1);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C62017OVp.LJLIL);

    @Override // X.EEY
    public final String key() {
        return "HwWallpaperMobEventTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
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
        if (((Boolean) C88045Ygz.LIZLLL.getValue()).booleanValue()) {
            return EFK.APP_BACKGROUND;
        }
        return EFK.BOOT_FINISH;
    }

    public final SimpleDateFormat LIZLLL() {
        return (SimpleDateFormat) this.LJLILLLLZI.getValue();
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        if (C62011OVj.LJI()) {
            return;
        }
        C52732Kmm.LIZ.getClass();
        C62016OVo.LIZ().storeInt("keva_key_active_check_interval_hour", ((Number) C52732Kmm.LIZIZ.getValue()).intValue());
        String[] stringArray = C62016OVo.LIZ().getStringArray("keva_key_wallpaper_active_date", null);
        boolean z = true;
        if (stringArray != null && stringArray.length != 0) {
            z = false;
        }
        if (!z) {
            C62016OVo.LIZ().erase("keva_key_wallpaper_active_date");
            int abs = (int) (Math.abs(LIZLLL().parse(LIZLLL().format(new Date(System.currentTimeMillis()))).getTime() - LIZLLL().parse(LIZLLL().format(new Date(CastLongProtector.parseLong(stringArray[0])))).getTime()) / this.LJLIL);
            C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(stringArray);
            while (LJJIIJZLJL.hasNext()) {
                long parseLong = CastLongProtector.parseLong((String) LJJIIJZLJL.next());
                String format = LIZLLL().format(new Date(parseLong));
                boolean LJ = o.LJ(LIZLLL().format(new Date(parseLong)), LIZLLL().format(new Date(System.currentTimeMillis())));
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("date", format);
                c188727au.LIZLLL(LJ ? 1 : 0, "is_today");
                c188727au.LIZLLL(abs, "no_active_days");
                FMX.LJIIL("hw_wall_paper_active", c188727au.LIZ);
            }
            C62016OVo.LIZ().storeLong("keva_key_already_upload_date", System.currentTimeMillis());
        }
        Set<String> stringSet = C62016OVo.LIZ().getStringSet("keva_key_wallpaper_player_error_events", null);
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    JSONObject jSONObject = new JSONObject(it.next());
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LIZLLL(jSONObject.optInt("player_type"), "player_type");
                    c188727au2.LIZLLL(jSONObject.optInt("error_code"), "error_code");
                    c188727au2.LJIIIZ("error_extra", jSONObject.optString("error_extra"));
                    c188727au2.LJIIIZ("date", jSONObject.optString("date"));
                    FMX.LJIIL("wallpaper_player_error", c188727au2.LIZ);
                } catch (Throwable unused) {
                }
            }
        }
        C62016OVo.LIZIZ(null);
    }
}
