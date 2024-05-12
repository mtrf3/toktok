package com.ss.android.ugc.aweme.account.login.prevlogin;

import X.C221108m2;
import X.C58096Mr6;
import X.C62783OkV;
import X.C62822Ol8;
import X.C79061V1d;
import X.E7O;
import X.EKX;
import X.EKY;
import X.EnumC35839E4t;
import X.EnumC36236EKa;
import X.FKM;
import X.FMX;
import android.app.backup.BackupManager;
import android.content.SharedPreferences;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.s1;
import defpackage.t1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PrevLoginPlatformService implements IPrevLoginPlatformService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(EKY.LJLIL);
    public final C62822Ol8 LIZIZ;
    public final MutableLiveData<String> LIZJ;

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final int LJII() {
        Iterator LJFF = C79061V1d.LJFF(false);
        while (LJFF.hasNext()) {
            Object next = LJFF.next();
            if (((IPluginService.PluginData) next).id == EnumC35839E4t.PREVIOUS_LOGIN_DATA.getValue()) {
                return next != null ? 1 : 0;
            }
        }
        return 0;
    }

    public static IPrevLoginPlatformService LJIIL() {
        Object LIZ = C58096Mr6.LIZ(IPrevLoginPlatformService.class, false);
        if (LIZ != null) {
            return (IPrevLoginPlatformService) LIZ;
        }
        if (C58096Mr6.LJLILLLLZI == null) {
            synchronized (IPrevLoginPlatformService.class) {
                if (C58096Mr6.LJLILLLLZI == null) {
                    C58096Mr6.LJLILLLLZI = new PrevLoginPlatformService();
                }
            }
        }
        return C58096Mr6.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final boolean LIZ() {
        if (!s1.LIZLLL("isFirstInstallAndFirstLaunch()") || LJIILIIL().getBoolean("is_et_param_added", false)) {
            return false;
        }
        LJIILIIL().storeBoolean("is_et_param_added", true);
        return true;
    }

    public final Keva LJIILIIL() {
        return (Keva) this.LIZ.getValue();
    }

    public PrevLoginPlatformService() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(EKX.LJLIL);
        this.LIZIZ = LIZIZ;
        SharedPreferences sharedPreferences = (SharedPreferences) LIZIZ.getValue();
        String str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        String string = sharedPreferences.getString("previous_login_platform", LiveGiftNewGifterBadgeSetting.DEFAULT);
        this.LIZJ = new MutableLiveData<>(string != null ? string : str);
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final EnumC36236EKa LIZIZ() {
        String value;
        if (t1.LJI() || C62783OkV.LIZ() || (value = this.LIZJ.getValue()) == null || value.length() == 0 || o.LJ(this.LIZJ.getValue(), LiveGiftNewGifterBadgeSetting.DEFAULT)) {
            return EnumC36236EKa.NONE;
        }
        String string = LJIILIIL().getString("ab_group", CardStruct.IStatusCode.DEFAULT);
        if (o.LJ(string, "1")) {
            return EnumC36236EKa.LOGIN_ITEM_SUBTITLE;
        }
        if (o.LJ(string, "2")) {
            return EnumC36236EKa.LOGIN_ITEM_TOOLTIP;
        }
        return EnumC36236EKa.NONE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r7 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003c, code lost:
    
        if (r7 != null) goto L7;
     */
    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL() {
        /*
            r8 = this;
            X.QTX r7 = X.C36244EKi.LIZJ()
            r6 = 0
            if (r7 == 0) goto L3b
            org.json.JSONObject r1 = r7.LJIIL
            if (r1 == 0) goto L3b
            java.lang.String r0 = "name"
            java.lang.String r5 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)
        L11:
            org.json.JSONObject r1 = r7.LJIIL
            if (r1 == 0) goto L43
            java.lang.String r0 = "connects"
            org.json.JSONArray r4 = r1.optJSONArray(r0)
            if (r4 == 0) goto L41
            int r3 = r4.length()
            r2 = 0
        L22:
            if (r2 >= r3) goto L41
            org.json.JSONObject r1 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getJSONObject(r4, r2)
            java.lang.String r0 = "platform"
            java.lang.String r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L38
            return r1
        L38:
            int r2 = r2 + 1
            goto L22
        L3b:
            r5 = r6
            if (r7 == 0) goto L3f
            goto L11
        L3f:
            r0 = r6
            goto L45
        L41:
            if (r7 == 0) goto L3f
        L43:
            java.lang.String r0 = r7.LJI
        L45:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L4e
            java.lang.String r0 = "mobile"
        L4d:
            return r0
        L4e:
            if (r7 == 0) goto L52
            java.lang.String r6 = r7.LJII
        L52:
            boolean r0 = X.C78685UuP.LJJJZ(r6)
            if (r0 == 0) goto L5b
            java.lang.String r0 = "email"
            goto L4d
        L5b:
            boolean r0 = X.C78685UuP.LJJJZ(r5)
            if (r0 == 0) goto L64
            java.lang.String r0 = "username"
            goto L4d
        L64:
            java.lang.String r0 = ""
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService.LIZLLL():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final boolean LJI() {
        if (LIZIZ() != EnumC36236EKa.NONE) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final int LJIIIZ() {
        if (LIZIZ() == EnumC36236EKa.NONE) {
            return 0;
        }
        return 1;
    }

    public final Map<Long, String> LJIILJJIL() {
        Map<Long, String> map;
        try {
            map = (Map) GsonHolder.LIZLLL().LIZ().LJII(LJIILIIL().getString("uid_to_platform", ""), new E7O().getType());
        } catch (Exception unused) {
            map = null;
        }
        if (map == null) {
            return new LinkedHashMap();
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final MutableLiveData getPlatform() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final void LIZJ(long j) {
        Map<Long, String> LJIILJJIL = LJIILJJIL();
        LJIILJJIL.remove(Long.valueOf(j));
        LJIILIIL().storeString("uid_to_platform", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), LJIILJJIL));
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final String LJFF(long j) {
        String str = LJIILJJIL().get(Long.valueOf(j));
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final void LJIIIIZZ(String platform) {
        o.LJIIIZ(platform, "platform");
        ((SharedPreferences) this.LIZIZ.getValue()).edit().putString("previous_login_platform", platform).apply();
        this.LIZJ.postValue(platform);
        BackupManager.dataChanged(FKM.LIZ().getPackageName());
        FMX.onEventV3("update_backup");
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final String LJ(Integer num, String str) {
        if (num != null) {
            if (num.intValue() == 2 || num.intValue() == 3) {
                return "mobile";
            }
            if (num.intValue() == 4) {
                return "email";
            }
            if (num.intValue() == 5) {
                return "username";
            }
            if (num.intValue() == 6) {
                if (str != null) {
                    return str;
                }
                return "not_available";
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    public final void LJIIJJI(long j, String platform) {
        o.LJIIIZ(platform, "platform");
        Map<Long, String> LJIILJJIL = LJIILJJIL();
        LJIILJJIL.put(Long.valueOf(j), platform);
        LJIILIIL().storeString("uid_to_platform", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), LJIILJJIL));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        if (r7 == null) goto L14;
     */
    @Override // com.ss.android.ugc.aweme.IPrevLoginPlatformService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.Integer r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            r3 = 1
            if (r0 == 0) goto L61
            r0 = 1
        La:
            java.lang.String r1 = "ab_group"
            if (r0 == 0) goto L55
            com.bytedance.keva.Keva r0 = r4.LJIILIIL()
            r0.storeString(r1, r6)
        L15:
            if (r5 != 0) goto L45
        L17:
            r3 = 0
        L18:
            java.lang.String r2 = "none"
            if (r3 == 0) goto L23
            java.lang.String r7 = "mobile"
        L1e:
            r2 = r7
        L1f:
            r4.LJIIIIZZ(r2)
            return
        L23:
            if (r5 != 0) goto L27
        L25:
            r7 = r2
            goto L1e
        L27:
            int r1 = r5.intValue()
            r0 = 4
            if (r1 != r0) goto L31
            java.lang.String r7 = "email"
            goto L1e
        L31:
            int r1 = r5.intValue()
            r0 = 5
            if (r1 != r0) goto L3b
            java.lang.String r7 = "username"
            goto L1e
        L3b:
            int r1 = r5.intValue()
            r0 = 6
            if (r1 != r0) goto L25
            if (r7 != 0) goto L1e
            goto L1f
        L45:
            int r1 = r5.intValue()
            r0 = 2
            if (r1 != r0) goto L4d
            goto L18
        L4d:
            int r1 = r5.intValue()
            r0 = 3
            if (r1 != r0) goto L17
            goto L18
        L55:
            com.bytedance.keva.Keva r0 = r4.LJIILIIL()
            if (r6 != 0) goto L5d
            java.lang.String r6 = "0"
        L5d:
            r0.storeString(r1, r6)
            goto L15
        L61:
            java.lang.String r0 = "2"
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService.LJIIJ(java.lang.Integer, java.lang.String, java.lang.String):void");
    }
}
