package X;

import Y.IDhS26S0300000_12;
import Y.IDhS4S0400000_12;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerSettingCacheExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSEIDelayTimeCorrectSetting;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.TelecomCarrierService;
import com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS11S0500000_2;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS57S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TMC implements TMJ, InterfaceC53475Kyl, InterfaceC39656FhM, C5LC, IHostContextDepend, InterfaceC48038ItG, InterfaceC64898PdW, IExternalUploaderService, PEV {
    public static final TMC LJLIL = new TMC();

    @Override // X.InterfaceC53475Kyl
    public float LIZIZ() {
        return 0.03125f;
    }

    @Override // X.InterfaceC64898PdW
    public void LIZJ(String str) {
    }

    @Override // X.InterfaceC64898PdW
    public void LJ(String str) {
    }

    @Override // X.PEV
    public String getSessionId() {
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getSkinName() {
        return "light";
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getSkinType() {
        return "light";
    }

    @Override // X.PEV
    public long getUid() {
        return 0L;
    }

    public static final java.util.Map LJIJI() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(L3F.DEFAULT, new L3A());
        linkedHashMap.put(L3F.FLASH_SALE, new L39());
        linkedHashMap.put(L3F.FIRST_ORDER, new L3H());
        return linkedHashMap;
    }

    public boolean LJJII() {
        if (C00F.LIZ(31744, 0, "bellagio_tiktok_search_performance", true) == 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public boolean isDebuggable() {
        if (!o.LJ(EF7.LJIILIIL, "local_test")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public boolean uploaderUpdateEnable() {
        return e1.LIZ(31744, "tt_tools_uploader_update_to_2", true, false);
    }

    public static final boolean LJJIIJ() {
        if (C1DG.LJIIIIZZ() || !I09.LIZ()) {
            return false;
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        if (!C43119Gw7.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public void cacheUploadAuthKeyConfig() {
        C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI();
        H0W.LIZ();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getAppName() {
        return EF7.LIZ();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public Application getApplication() {
        return (Application) EF7.LIZIZ();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public Context getApplicationContext() {
        Context LLLLJI = C16880lQ.LLLLJI(getApplication());
        o.LJFF(LLLLJI, "getApplication().applicationContext");
        return LLLLJI;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getBoeChannel() {
        String boeLane = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getBoeLane();
        o.LJI(boeLane);
        return boeLane;
    }

    @Override // X.PEV
    public java.util.Map getCommonParams() {
        return Collections.emptyMap();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getCurrentTelcomCarrier() {
        TelecomCarrierService LIZIZ;
        HG3.LJIIL();
        IAccountService iAccountService = HG3.LJLJL;
        if (iAccountService != null && (LIZIZ = iAccountService.LIZIZ()) != null) {
            return LIZIZ.getCurrentTelecomCarrier();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getDeviceId() {
        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
        return com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getFullLanguage() {
        String LIZIZ = C85999Xp5.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getAppLocale()");
        return LIZIZ;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getLanguage() {
        String locale = C39419FdX.LIZ().toString();
        o.LJIIIIZZ(locale, "getCurrentLocale().toString()");
        return locale;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getPPEChannel() {
        String pPELane = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getPPELane();
        o.LJI(pPELane);
        return pPELane;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getPackageName() {
        String packageName = EF7.LIZIZ().getPackageName();
        o.LJIIIIZZ(packageName, "AppContextManager.getApp…tionContext().packageName");
        return packageName;
    }

    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public String getSdkV4AuthKey() {
        return C43379H0t.LIZ();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getUpdateVersion() {
        return String.valueOf(EF7.LJFF());
    }

    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public int getUploadBackupNetworkType() {
        return C39044FUa.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public int getUploadMainNetworkType() {
        return ESI.LIZ();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public long getVersionCode() {
        return EF7.LIZJ();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getVersionName() {
        return EF7.LIZLLL();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public boolean isBoeEnable() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public boolean isPPEEnable() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enablePpe();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public boolean isTeenMode() {
        return AV1.LJIIJJI();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public int getAppId() {
        return EF7.LJIIIZ;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public String getChannel() {
        return EF7.LJIILIIL;
    }

    public static void LJIIIIZZ(int i) {
        if (i >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static final List LJIIZILJ(WPX getAvailableFilterDataOrEmpty) {
        o.LJIIIZ(getAvailableFilterDataOrEmpty, "$this$getAvailableFilterDataOrEmpty");
        List list = (List) getAvailableFilterDataOrEmpty.LIZJ().getValue();
        if (list != null) {
            return list;
        }
        return C61878OQg.INSTANCE;
    }

    public static boolean LJJIJIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(parse.getHost());
            LIZ.append(parse.getPath());
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (!LIZIZ.startsWith("videoRecord/live") && !LIZIZ.startsWith("video_record/live")) {
                if (!parse.getHost().equals("video_record")) {
                    return false;
                }
                if (!TextUtils.equals(UriProtector.getQueryParameter(parse, "record_type"), "live")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // X.C5LC
    public void LJFF(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        C45422HsA.LIZJ(iFetchResourcesListener);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        OSZ it = (OSZ) obj;
        o.LJIIJ(it, "it");
        return C1XY.LJJIIJ(it.getSecond());
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public List getSettings(List settingKeys) {
        o.LJIIIZ(settingKeys, "settingKeys");
        return FCS.LIZ(settingKeys);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r9 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r12 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r0 = r2.authorizationV2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        r13 = r0.sessionToken;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r13 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        r0 = r2.authorizationV2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        r14 = r0.spaceName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (r14 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        return new com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        if (r2 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005c, code lost:
    
        if (r2 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0051, code lost:
    
        if (r2 != null) goto L30;
     */
    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig getUploadVideoConfig(java.lang.String r16) {
        /*
            r15 = this;
            java.lang.String r0 = "sdkV4AuthKey"
            r2 = r16
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.EQd r0 = r0.getNetworkService()
            com.google.gson.Gson r1 = r0.getRetrofitFactoryGson()
            java.lang.Class<com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig> r0 = com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig.class
            java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)
            com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig r0 = (com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig) r0
            com.ss.android.ugc.aweme.publish.model.UploadVideoConfig r2 = r0.videoConfig
            com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig r3 = new com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig
            if (r2 == 0) goto L78
            int r4 = r2.maxFailTime
            int r5 = r2.sliceSize
        L25:
            r6 = 0
            if (r2 == 0) goto L2a
            java.lang.String r6 = r2.fileHostName
        L2a:
            java.lang.String r1 = ""
            if (r6 != 0) goto L2f
            r6 = r1
        L2f:
            if (r2 == 0) goto L35
            java.lang.String r7 = r2.videoHostName
            if (r7 != 0) goto L38
        L35:
            r7 = r1
            if (r2 == 0) goto L76
        L38:
            int r8 = r2.sliceTimeout
            java.lang.String r9 = r2.appKey
            if (r9 != 0) goto L3f
        L3e:
            r9 = r1
        L3f:
            if (r2 == 0) goto L45
            java.lang.String r10 = r2.authorization
            if (r10 != 0) goto L46
        L45:
            r10 = r1
        L46:
            if (r2 == 0) goto L50
            com.ss.android.ugc.aweme.publish.model.STSAuthConfig r0 = r2.authorizationV2
            if (r0 == 0) goto L50
            java.lang.String r11 = r0.accessKeyId
            if (r11 != 0) goto L53
        L50:
            r11 = r1
            if (r2 == 0) goto L5b
        L53:
            com.ss.android.ugc.aweme.publish.model.STSAuthConfig r0 = r2.authorizationV2
            if (r0 == 0) goto L5b
            java.lang.String r12 = r0.secretAccessKey
            if (r12 != 0) goto L5e
        L5b:
            r12 = r1
            if (r2 == 0) goto L66
        L5e:
            com.ss.android.ugc.aweme.publish.model.STSAuthConfig r0 = r2.authorizationV2
            if (r0 == 0) goto L66
            java.lang.String r13 = r0.sessionToken
            if (r13 != 0) goto L69
        L66:
            r13 = r1
            if (r2 == 0) goto L71
        L69:
            com.ss.android.ugc.aweme.publish.model.STSAuthConfig r0 = r2.authorizationV2
            if (r0 == 0) goto L71
            java.lang.String r14 = r0.spaceName
            if (r14 != 0) goto L72
        L71:
            r14 = r1
        L72:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r3
        L76:
            r8 = 0
            goto L3e
        L78:
            r4 = 0
            r5 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TMC.getUploadVideoConfig(java.lang.String):com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig");
    }

    public static void LJI(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LJIIIZ(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static final void LJIIJJI(InterfaceC73150SnK configWrapper, C73165SnZ target) {
        o.LJIIJ(configWrapper, "$this$configWrapper");
        o.LJIIJ(target, "target");
        if (!target.LIZLLL) {
            target.LJ = configWrapper.getUniqueOnlyGlobal();
        }
    }

    public static final EffectCategoryResponse LJIIL(FilterBean filterBean, WPX findCategoryOrFirst) {
        Object obj;
        Object obj2;
        o.LJIIIZ(findCategoryOrFirst, "$this$findCategoryOrFirst");
        o.LJIIIZ(filterBean, "filterBean");
        List list = (List) findCategoryOrFirst.LIZ().getValue();
        if (list == null) {
            return null;
        }
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(filterBean, 387);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Iterator it2 = ((Iterable) ((OSZ) obj).getSecond()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((Boolean) aqS178S0100000_12.invoke(next)).booleanValue()) {
                            if (next != null) {
                                break;
                            }
                        }
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        OSZ osz = (OSZ) obj;
        if (osz != null) {
            obj2 = osz.getFirst();
        } else {
            obj2 = null;
        }
        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) obj2;
        if (effectCategoryResponse == null) {
            OSZ osz2 = (OSZ) ORZ.LJLLLLLL(0, list);
            if (osz2 == null) {
                return null;
            }
            effectCategoryResponse = (EffectCategoryResponse) osz2.getFirst();
        }
        return effectCategoryResponse;
    }

    public static final FilterBean LJIILIIL(WPX getAvailableFilterById, int i) {
        o.LJIIIZ(getAvailableFilterById, "$this$getAvailableFilterById");
        List list = (List) getAvailableFilterById.LIZJ().getValue();
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((FilterBean) next).getId() == i) {
                obj = next;
                break;
            }
        }
        return (FilterBean) obj;
    }

    public static final FilterBean LJIILJJIL(WPX getAvailableFilterByIndex, int i) {
        int i2;
        FilterBean filterBean;
        o.LJIIIZ(getAvailableFilterByIndex, "$this$getAvailableFilterByIndex");
        List list = (List) getAvailableFilterByIndex.LIZJ().getValue();
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        int LJJIIZ = C78609UtB.LJJIIZ(i, 0, Math.max(i2 - 1, 0));
        if (list != null && (filterBean = (FilterBean) ORZ.LJLLLLLL(LJJIIZ, list)) != null) {
            return filterBean;
        }
        return (FilterBean) C82238WPi.LIZIZ.getValue();
    }

    public static final FilterBean LJIILLIIL(WPX getAvailableFilterByResId, String str) {
        o.LJIIIZ(getAvailableFilterByResId, "$this$getAvailableFilterByResId");
        List list = (List) getAvailableFilterByResId.LIZJ().getValue();
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (o.LJ(((FilterBean) next).getResId(), str)) {
                obj = next;
                break;
            }
        }
        return (FilterBean) obj;
    }

    public static final int LJIJ(FilterBean filterBean, WPX getAvailableIndexByFilter) {
        List list;
        o.LJIIIZ(getAvailableIndexByFilter, "$this$getAvailableIndexByFilter");
        if (filterBean == null || (list = (List) getAvailableIndexByFilter.LIZJ().getValue()) == null) {
            return 0;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next(), filterBean)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    public static final float LJIJJ(InterfaceC142225i6 getFilterStoreProgressSimply, FilterBean filterBean) {
        int LIZLLL;
        o.LJIIIZ(getFilterStoreProgressSimply, "$this$getFilterStoreProgressSimply");
        o.LJIIIZ(filterBean, "filterBean");
        if (getFilterStoreProgressSimply instanceof InterfaceC148845sm) {
            LIZLLL = ((InterfaceC148845sm) getFilterStoreProgressSimply).LIZ(filterBean, getFilterStoreProgressSimply.LIZJ());
        } else {
            LIZLLL = TML.LIZLLL(filterBean, getFilterStoreProgressSimply.LIZ(filterBean), getFilterStoreProgressSimply.LIZJ());
        }
        return LIZLLL / 100.0f;
    }

    public static C73453SsD LJJI(long j, TimeUnit timeUnit) {
        return LJJ(j, j, timeUnit, T16.LIZIZ);
    }

    public static final boolean LJJIII(FilterBean filterBean, InterfaceC82236WPg isFilterAvailable) {
        EnumC82260WQe enumC82260WQe;
        o.LJIIIZ(isFilterAvailable, "$this$isFilterAvailable");
        if (filterBean != null) {
            enumC82260WQe = isFilterAvailable.LJJIIZI(filterBean.getId());
        } else {
            enumC82260WQe = null;
        }
        if (enumC82260WQe == EnumC82260WQe.FILTER_STATE_DOWNLOAD_SUCCESS) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC39656FhM
    public void LIZLLL(ClassLoader classLoader, java.util.Set set) {
        C78857UxB.LJIILJJIL(classLoader, set, new TPP());
    }

    public Object LJIJJLI(Object defaultValue, String str) {
        if (TextUtils.equals(str, "network_type") && (defaultValue instanceof String)) {
            EnumC48190Ivi LLJJI = C16880lQ.LLJJI(C15380j0.LIZLLL());
            if (LLJJI != null) {
                switch (C48195Ivn.LIZ[LLJJI.ordinal()]) {
                    case 1:
                    case 2:
                        return LiveGiftNewGifterBadgeSetting.DEFAULT;
                    case 3:
                        return "mobile";
                    case 4:
                        return "2g";
                    case 5:
                    case 6:
                    case 7:
                        return "3g";
                    case 8:
                    case 9:
                    case 10:
                        return "wifi";
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return "4g";
                    case 12:
                        return "5g";
                }
            }
            return "";
        }
        if (LiveSEIDelayTimeCorrectSetting.INSTANCE.enableSEITimeCorrect() && TextUtils.equals(str, "time_diff_server_and_client") && (defaultValue instanceof Long)) {
            return Long.valueOf(C31012CFc.LIZIZ);
        }
        o.LJIIIZ(defaultValue, "defaultValue");
        if (!LivePlayerSettingCacheExp.INSTANCE.getValue() && !C30922CBq.LIZIZ) {
            Object LIZJ = C30922CBq.LIZJ(str, defaultValue);
            o.LJIIIIZZ(LIZJ, "getValue(key, defaultValue)");
            return LIZJ;
        }
        if (C30922CBq.LIZIZ && ((ConcurrentHashMap) CFR.LIZIZ.getValue()).size() > r1.getMapSize() * 0.9d && !CFR.LIZ) {
            CFR.LIZ = true;
            C0K2.LJII(1, "LivePlayerSettingsSizeOutOfSize", new HashMap());
        }
        C5H3 c5h3 = CFR.LIZIZ;
        Object obj = ((ConcurrentHashMap) c5h3.getValue()).get(str);
        if (obj != null) {
            return obj;
        }
        Object result = C30922CBq.LIZJ(str, defaultValue);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c5h3.getValue();
        o.LJIIIIZZ(result, "result");
        concurrentHashMap.put(str, result);
        return result;
    }

    public static final void LJIIJ(C50652JuK c50652JuK, InterfaceC63694OzC interfaceC63694OzC, String str) {
        o.LJIIIZ(interfaceC63694OzC, "<this>");
        if (c50652JuK == null) {
            return;
        }
        SearchServiceImpl.LLLZI().LJLLILLLL(c50652JuK, interfaceC63694OzC, str);
    }

    public static C73453SsD LJIL(long j, long j2, TimeUnit timeUnit) {
        return LJJ(j, j2, timeUnit, T16.LIZIZ);
    }

    public static void LJII(int i, int i2, int i3, String str) {
        if (i >= i2) {
            if (i <= i3) {
                return;
            } else {
                throw new IllegalArgumentException(C16880lQ.LLLZI(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
            }
        }
        throw new IllegalArgumentException(C16880lQ.LLLZI(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    public static C73453SsD LJJ(long j, long j2, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73453SsD(Math.max(0L, j), Math.max(0L, j2), timeUnit, abstractC73946T0k);
    }

    public static AbstractC73672Svk LJJIFFI(long j, long j2, long j3, TimeUnit timeUnit) {
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        if (j >= 0) {
            if (j == 0) {
                C73536StY c73536StY = C73536StY.LJLIL;
                c73536StY.getClass();
                C73320Sq4.LIZ(timeUnit, "unit is null");
                C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
                return new C73713SwP(c73536StY, j2, timeUnit, abstractC73946T0k);
            }
            C73320Sq4.LIZ(timeUnit, "unit is null");
            C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
            return new C73452SsC(0L, (j - 1) + 0, Math.max(0L, j2), Math.max(0L, j3), timeUnit, abstractC73946T0k);
        }
        throw new IllegalArgumentException(C61845OOz.LIZ("count >= 0 required but it was ", j));
    }

    public static final InterfaceC92693kP LJJIJIIJIL(JediViewModel subscribeInternal, LifecycleOwner lifecycleOwner, C73165SnZ config, InterfaceC88472Yns subscriber) {
        AbstractC73430Srq abstractC73430Srq;
        o.LJIIJ(subscribeInternal, "$this$subscribeInternal");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        AbstractC73430Srq LJIILJJIL = subscribeInternal.nv0().LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73430Srq = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73430Srq = LJIILJJIL;
        }
        return subscribeInternal.pv0(abstractC73430Srq, lifecycleOwner, config.LJ, config.LIZJ, config.LJFF, subscriber);
    }

    public static InterfaceC68379QsZ LJJIJLIJ(C68375QsV c68375QsV, C68377QsX c68377QsX, List list, boolean z) {
        InterfaceC68379QsZ interfaceC68379QsZ;
        int i;
        int i2;
        C68368QsO.LJIIIIZZ(1, "reduce", list);
        C68368QsO.LJIIIZ(2, "reduce", list);
        InterfaceC68379QsZ LIZIZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0));
        if (LIZIZ instanceof AbstractC68364QsK) {
            if (((ArrayList) list).size() == 2) {
                interfaceC68379QsZ = c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 1));
                if (interfaceC68379QsZ instanceof C68381Qsb) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c68375QsV.LJIILLIIL() != 0) {
                interfaceC68379QsZ = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC68364QsK abstractC68364QsK = (AbstractC68364QsK) LIZIZ;
            int LJIILLIIL = c68375QsV.LJIILLIIL();
            if (z) {
                i = 0;
            } else {
                i = LJIILLIIL - 1;
            }
            int i3 = -1;
            if (z) {
                i2 = LJIILLIIL - 1;
                if (true == z) {
                    i3 = 1;
                }
            } else {
                i2 = 0;
            }
            if (interfaceC68379QsZ == null) {
                interfaceC68379QsZ = c68375QsV.LJIIZILJ(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (!c68375QsV.LJJII(i)) {
                    i += i3;
                } else {
                    interfaceC68379QsZ = abstractC68364QsK.LIZ(c68377QsX, Arrays.asList(interfaceC68379QsZ, c68375QsV.LJIIZILJ(i), new C68366QsM(Double.valueOf(i)), c68375QsV));
                    if (!(interfaceC68379QsZ instanceof C68381Qsb)) {
                        i += i3;
                    } else {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                }
            }
            return interfaceC68379QsZ;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }

    @Override // X.InterfaceC39656FhM
    public boolean LJIILL(ClassLoader classLoader, File file, File file2, boolean z) {
        return C54840Lfg.LJIJJ(classLoader, file, file2, z, new C78866UxK(), "path", new C32810CuE());
    }

    public static final InterfaceC92693kP LJJIIJZLJL(C73165SnZ config, JediViewModel selectSubscribeInternal, LifecycleOwner lifecycleOwner, TBW prop1, InterfaceC88472Yns subscriber) {
        AbstractC73430Srq abstractC73430Srq;
        o.LJIIJ(selectSubscribeInternal, "$this$selectSubscribeInternal");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        AbstractC73430Srq LJIILJJIL = selectSubscribeInternal.nv0().LJJIJL(new IDhS26S0300000_12(lifecycleOwner, prop1, subscriber, 0)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73430Srq = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73430Srq = LJIILJJIL;
        }
        return selectSubscribeInternal.pv0(abstractC73430Srq, lifecycleOwner, config.LJ, config.LIZJ, config.LJFF, new AqS116S0300000_12(config, selectSubscribeInternal, lifecycleOwner, prop1, subscriber, 28));
    }

    public static C68375QsV LJJIJL(C68375QsV c68375QsV, C68377QsX c68377QsX, C68378QsY c68378QsY, Boolean bool, Boolean bool2) {
        C68375QsV c68375QsV2 = new C68375QsV();
        Iterator LJIJJLI = c68375QsV.LJIJJLI();
        while (LJIJJLI.hasNext()) {
            int intValue = ((Integer) LJIJJLI.next()).intValue();
            if (c68375QsV.LJJII(intValue)) {
                InterfaceC68379QsZ LIZ = c68378QsY.LIZ(c68377QsX, Arrays.asList(c68375QsV.LJIIZILJ(intValue), new C68366QsM(Double.valueOf(intValue)), c68375QsV));
                if (LIZ.LIZJ().equals(bool)) {
                    return c68375QsV2;
                }
                if (bool2 == null || LIZ.LIZJ().equals(bool2)) {
                    c68375QsV2.LJJIFFI(intValue, LIZ);
                }
            }
        }
        return c68375QsV2;
    }

    public static final InterfaceC92693kP LJJIIZ(C73165SnZ config, JediViewModel selectSubscribeInternal, LifecycleOwner lifecycleOwner, TBW prop1, TBW prop2, InterfaceC88471Ynr subscriber) {
        AbstractC73430Srq abstractC73430Srq;
        o.LJIIJ(selectSubscribeInternal, "$this$selectSubscribeInternal");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        AbstractC73430Srq LJIILJJIL = selectSubscribeInternal.nv0().LJJIJL(new IDhS4S0400000_12(lifecycleOwner, prop1, prop2, subscriber, 0)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73430Srq = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73430Srq = LJIILJJIL;
        }
        return selectSubscribeInternal.pv0(abstractC73430Srq, lifecycleOwner, config.LJ, config.LIZJ, config.LJFF, new AqS57S0400000_12(config, selectSubscribeInternal, lifecycleOwner, prop1, prop2, subscriber, 9));
    }

    public static final InterfaceC92693kP LJJIIZI(C73165SnZ config, JediViewModel selectSubscribeInternal, LifecycleOwner lifecycleOwner, TBW prop1, TBW prop2, TBW prop3, InterfaceC88473Ynt subscriber) {
        AbstractC73430Srq abstractC73430Srq;
        o.LJIIJ(selectSubscribeInternal, "$this$selectSubscribeInternal");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        AbstractC73430Srq LJIILJJIL = selectSubscribeInternal.nv0().LJJIJL(new TM7(lifecycleOwner, prop1, prop2, prop3, subscriber)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73430Srq = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73430Srq = LJIILJJIL;
        }
        return selectSubscribeInternal.pv0(abstractC73430Srq, lifecycleOwner, config.LJ, config.LIZJ, config.LJFF, new AqS11S0500000_2(config, selectSubscribeInternal, lifecycleOwner, prop1, prop2, prop3, subscriber, 1));
    }

    @Override // X.C5LC
    public void LIZ(int i, long j, Context context, InterfaceC149485to interfaceC149485to, AVMusic aVMusic, InterfaceC45790Hy6 interfaceC45790Hy6, String str) {
        C45422HsA.LIZJ(new C45788Hy4(interfaceC45790Hy6, aVMusic, context, i, str, j, interfaceC149485to));
    }

    public static final InterfaceC92693kP LJJIJ(C73165SnZ config, JediViewModel selectSubscribeInternal, LifecycleOwner lifecycleOwner, TBW prop1, TBW prop2, TBW prop3, TBW prop4, InterfaceC88474Ynu subscriber) {
        AbstractC73430Srq abstractC73430Srq;
        o.LJIIJ(selectSubscribeInternal, "$this$selectSubscribeInternal");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(prop4, "prop4");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        AbstractC73430Srq LJIILJJIL = selectSubscribeInternal.nv0().LJJIJL(new TM6(lifecycleOwner, prop1, prop2, prop3, prop4, subscriber)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73430Srq = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73430Srq = LJIILJJIL;
        }
        return selectSubscribeInternal.pv0(abstractC73430Srq, lifecycleOwner, config.LJ, config.LIZJ, config.LJFF, new W1S(config, selectSubscribeInternal, lifecycleOwner, prop1, prop2, prop3, prop4, subscriber));
    }

    public static final InterfaceC92693kP LJJIJIIJI(C73165SnZ config, JediViewModel selectSubscribeInternal, LifecycleOwner lifecycleOwner, TBW prop1, TBW prop2, TBW prop3, TBW prop4, TBW prop5, InterfaceC88475Ynv subscriber) {
        AbstractC73430Srq abstractC73430Srq;
        o.LJIIJ(selectSubscribeInternal, "$this$selectSubscribeInternal");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(prop4, "prop4");
        o.LJIIJ(prop5, "prop5");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        AbstractC73430Srq LJIILJJIL = selectSubscribeInternal.nv0().LJJIJL(new TMD(lifecycleOwner, prop1, prop2, prop3, prop4, prop5, subscriber)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73430Srq = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73430Srq = LJIILJJIL;
        }
        return selectSubscribeInternal.pv0(abstractC73430Srq, lifecycleOwner, config.LJ, config.LIZJ, config.LJFF, new TME(config, selectSubscribeInternal, lifecycleOwner, prop1, prop2, prop3, prop4, prop5, subscriber));
    }
}
