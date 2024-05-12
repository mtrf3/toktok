package Y;

import X.AbstractC36700Eam;
import X.AbstractC36908Ee8;
import X.AbstractC37134Ehm;
import X.AbstractC60548NpY;
import X.AnonymousClass636;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221018lt;
import X.C268513p;
import X.C31926Cfy;
import X.C32I;
import X.C33949DUb;
import X.C36244EKi;
import X.C36322ENi;
import X.C36583EXj;
import X.C37099EhD;
import X.C37100EhE;
import X.C38404F5k;
import X.C38724FHs;
import X.C38776FJs;
import X.C38919FPf;
import X.C39380Fcu;
import X.C3C5;
import X.C40467FuR;
import X.C40530FvS;
import X.C40532FvU;
import X.C40533FvV;
import X.C40534FvW;
import X.C51029K0z;
import X.C62848OlY;
import X.C68322mC;
import X.C76800UCe;
import X.C78966Uyw;
import X.C84763XOl;
import X.EF7;
import X.EIE;
import X.EIZ;
import X.EJV;
import X.EU2;
import X.EnumC62956OnI;
import X.F34;
import X.F37;
import X.F5U;
import X.F5V;
import X.FCS;
import X.FH9;
import X.FMX;
import X.HG3;
import X.InterfaceC40525FvN;
import X.InterfaceC88471Ynr;
import X.O1I;
import X.OSZ;
import X.PJZ;
import X.PVC;
import X.QTZ;
import X.QXB;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.legoImp.task.InitServiceSettingTask;
import com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask;
import com.ss.android.ugc.aweme.net.NetworkInitTask;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.api.SettingApi;
import com.ss.android.ugc.aweme.setting.services.IStorageService;
import com.ss.android.ugc.aweme.setting.services.StorageServiceImpl;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes7.dex */
public class ACallableS83S0200000_6 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            case 17:
                return call$17(this);
            case 18:
                return call$18(this);
            case 19:
                return call$19(this);
            case 20:
                return call$20(this);
            case 21:
                return call$21(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$0(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        try {
            ParcelFileDescriptor openFileDescriptor = EF7.LIZIZ().getContentResolver().openFileDescriptor((Uri) ((C68322mC) aCallableS83S0200000_6.l0).element, "w");
            if (openFileDescriptor != null) {
                C268513p.LIZ((File) aCallableS83S0200000_6.l1, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                return C76800UCe.LIZ;
            }
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return C76800UCe.LIZ;
        }
    }

    public static final Object call$1(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        C36322ENi c36322ENi;
        if (!EU2.LIZJ() && (c36322ENi = C36322ENi.LIZIZ) != null) {
            c36322ENi.LIZ((JSONObject) aCallableS83S0200000_6.l0);
        }
        InitServiceSettingTask initServiceSettingTask = (InitServiceSettingTask) aCallableS83S0200000_6.l1;
        JSONObject jSONObject = (JSONObject) aCallableS83S0200000_6.l0;
        initServiceSettingTask.getClass();
        InitServiceSettingTask.LIZLLL(jSONObject);
        return C76800UCe.LIZ;
    }

    public static final Object call$10(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        try {
            InputStream LIZIZ = ((O1I) aCallableS83S0200000_6.l1).LIZIZ();
            if (LIZIZ != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        C62848OlY.LIZIZ(LIZIZ, byteArrayOutputStream, FileUtils.BUFFER_SIZE);
                        C10K LIZIZ2 = C10K.LIZIZ(new ACallableS55S0300000_6(byteArrayOutputStream.toByteArray(), LIZIZ, aCallableS83S0200000_6, 1), C10K.LJIIIIZZ, null);
                        AnonymousClass636.LJFF(byteArrayOutputStream, null);
                        AnonymousClass636.LJFF(LIZIZ, null);
                        return LIZIZ2;
                    } finally {
                    }
                } finally {
                }
            } else {
                return C10K.LIZIZ(new ACallableS109S0100000_6(aCallableS83S0200000_6, 11), C10K.LJIIIIZZ, null);
            }
        } catch (Throwable th) {
            return C10K.LIZIZ(new ACallableS83S0200000_6(aCallableS83S0200000_6, th, 9), C10K.LJIIIIZZ, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$11(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        try {
            ParcelFileDescriptor openFileDescriptor = EF7.LIZIZ().getContentResolver().openFileDescriptor((Uri) ((C68322mC) aCallableS83S0200000_6.l0).element, "w");
            if (openFileDescriptor != null) {
                C268513p.LIZ((File) aCallableS83S0200000_6.l1, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                return C76800UCe.LIZ;
            }
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return C76800UCe.LIZ;
        }
    }

    public static final Object call$12(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        Object LIZ;
        String str;
        C31926Cfy c31926Cfy = (C31926Cfy) aCallableS83S0200000_6.l0;
        Map map = (Map) aCallableS83S0200000_6.l1;
        try {
            AbstractC60548NpY abstractC60548NpY = (AbstractC60548NpY) FCS.LIZIZ(c31926Cfy, AbstractC60548NpY.class);
            F37 f37 = new F37("bdx_monitor_xbridge_error");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", map.get("code"));
            jSONObject.put("error_message", map.get("error_message"));
            jSONObject.put("method_name", map.get("method_name"));
            f37.LIZLLL = jSONObject;
            f37.LJII = true;
            if (abstractC60548NpY == null) {
                str = null;
            } else {
                str = abstractC60548NpY.LIZIZ();
            }
            f37.LIZ = str;
            f37.LJIIIIZZ = new F34();
            HybridMonitor.getInstance().customReport(f37.LIZ());
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        return C3C5.m6boximpl(LIZ);
    }

    public static final Object call$13(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        C40467FuR.LJ("begin to update sp");
        C36244EKi.LIZIZ(((QTZ) aCallableS83S0200000_6.l0).LJIILIIL.toString());
        C40467FuR.LJ("asynchronous_check");
        ((QXB) aCallableS83S0200000_6.l1).LIZJ();
        return null;
    }

    public static final Object call$14(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        F5V f5v = (F5V) aCallableS83S0200000_6.l0;
        AbstractC37134Ehm abstractC37134Ehm = (AbstractC37134Ehm) aCallableS83S0200000_6.l1;
        f5v.getClass();
        if (abstractC37134Ehm == null) {
            return Boolean.FALSE;
        }
        C37099EhD.LIZ(abstractC37134Ehm, 0, null);
        if (abstractC37134Ehm.LJIIIIZZ == 2) {
            return Boolean.valueOf(f5v.LIZJ(abstractC37134Ehm));
        }
        F5V.LIZIZ(abstractC37134Ehm, f5v.LJLILLLLZI);
        f5v.LJIIL();
        return Boolean.FALSE;
    }

    public static final Object call$15(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        F5U f5u = (F5U) aCallableS83S0200000_6.l0;
        C37100EhE state = (C37100EhE) aCallableS83S0200000_6.l1;
        o.LJIIIIZZ(state, "state");
        f5u.LIZJ(state);
        return C76800UCe.LIZ;
    }

    public static final Object call$16(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        try {
            new com.google.gson.o();
            m LJJIJIL = com.google.gson.o.LIZ(new String((byte[]) aCallableS83S0200000_6.l0, PVC.LIZ)).LJIIZILJ().LJJIJIL("data");
            if (LJJIJIL != null) {
                FH9.LIZ(LJJIJIL, (C38724FHs) aCallableS83S0200000_6.l1);
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$17(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        IStorageService LIZLLL = StorageServiceImpl.LIZLLL();
        LIZLLL.LIZJ(new C38404F5k((AbstractC37134Ehm) aCallableS83S0200000_6.l1, (DFInstallBlankActivity) aCallableS83S0200000_6.l0, LIZLLL));
        SmartRouter.buildRoute((DFInstallBlankActivity) aCallableS83S0200000_6.l0, "//setting/diskmanager").open();
        return C76800UCe.LIZ;
    }

    public static final Object call$18(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        int i;
        AbstractC36700Eam abstractC36700Eam = (AbstractC36700Eam) aCallableS83S0200000_6.l0;
        Context context = (Context) aCallableS83S0200000_6.l1;
        abstractC36700Eam.getClass();
        try {
            String LJ = C38776FJs.LJIIL().LJ(EF7.LIZIZ(), "last_setting_version");
            if (context != null) {
                i = C39380Fcu.LIZ(context);
            } else {
                i = 0;
            }
            String LIZ = EJV.LIZ();
            if (C33949DUb.LIZJ()) {
                abstractC36700Eam.LJLIL = (SettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(SettingApi.class);
            }
            j jVar = abstractC36700Eam.LJLIL.queryRawSetting(LIZ, i, LJ).get();
            C10K.LIZJ(new EIZ(abstractC36700Eam, jVar, 1));
            return jVar;
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }

    public static final Object call$19(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        String str;
        try {
            ((C38919FPf) aCallableS83S0200000_6.l0).getClass();
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("abclone2_feedback", false)) {
                return "null";
            }
            ((C38919FPf) aCallableS83S0200000_6.l0).getClass();
            C38919FPf.LIZJ();
            ((C38919FPf) aCallableS83S0200000_6.l0).getClass();
            C10K LIZLLL = C38919FPf.LIZLLL();
            if (LIZLLL != null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                synchronized (LIZLLL.LIZ) {
                    if (!LIZLLL.LJIILIIL()) {
                        LIZLLL.LIZ.wait(timeUnit.toMillis(10L));
                    }
                    LIZLLL.LJIILIIL();
                }
            }
            if (LIZLLL != null) {
                str = (String) LIZLLL.LJIIJJI();
            } else {
                str = null;
            }
            if (str == null) {
                return "null";
            }
            return str;
        } catch (Exception e) {
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aCallableS83S0200000_6.l1;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("task has error: ");
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "unknown error";
            }
            LIZ.append(localizedMessage);
            interfaceC88471Ynr.invoke(1, X1D.LIZIZ(LIZ));
            return "null";
        }
    }

    public static final Object call$2(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        try {
            RheaTraceUploadTask rheaTraceUploadTask = (RheaTraceUploadTask) aCallableS83S0200000_6.l0;
            File file = (File) aCallableS83S0200000_6.l1;
            rheaTraceUploadTask.getClass();
            RheaTraceUploadTask.LJ(file, "_atrace");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$20(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        String str;
        int LIZ;
        User user = (User) aCallableS83S0200000_6.l0;
        User user2 = (User) aCallableS83S0200000_6.l1;
        synchronized (C40530FvS.class) {
            C40532FvU c40532FvU = new C40532FvU();
            int i = 1;
            if (user.getUserMode() == 0) {
                String uid = user.getUid();
                SharedPreferences sharedPreferences = c40532FvU.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ftc_user_mode_prefix_");
                LIZ2.append(uid);
                int i2 = sharedPreferences.getInt(X1D.LIZIZ(LIZ2), 0);
                if (i2 == 2 || i2 == 1) {
                    user.setUserMode(i2);
                }
            }
            int ageGatePostAction = user.getAgeGatePostAction();
            EnumC62956OnI enumC62956OnI = EnumC62956OnI.PASS;
            if (ageGatePostAction == enumC62956OnI.getValue() && (LIZ = C40533FvV.LIZ(user.getUid())) != -1) {
                C188727au c188727au = new C188727au();
                c188727au.LIZLLL(user.getAgeGateAction(), "age_gate_action_origin");
                FMX.LJIIL("age_gate_fallback_hit", c188727au.LIZ);
                user.setAgeGatePostAction(LIZ);
                user.setAgeGateAction(enumC62956OnI.getValue());
            }
            boolean isUserCancelled = user.isUserCancelled();
            if (C40534FvW.LIZ()) {
                if (user.getAgeGateAction() != enumC62956OnI.getValue()) {
                    a.LIZIZ().LJIIIZ(C84763XOl.LJIIIIZZ(), null);
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LIZLLL(user.getAgeGateAction(), "age_gate_action");
                    FMX.LJIIL("age_gate_need_pop", c188727au2.LIZ);
                }
                isUserCancelled = HG3.LJIIIIZZ().toRecoverDeletedAccount(null);
            }
            if (C36583EXj.LIZJ()) {
                str = "cold_launch_kidsmode";
            } else {
                str = "cold_launch_normal_mode";
            }
            if (!isUserCancelled && user2.getUid() != null) {
                a.LJI().LJ(str);
            }
            int ageGatePostAction2 = user.getAgeGatePostAction();
            EnumC62956OnI enumC62956OnI2 = EnumC62956OnI.US_FTC;
            if (ageGatePostAction2 == enumC62956OnI2.getValue()) {
                a.LIZIZ().LJIJJ(C84763XOl.LJIIIIZZ());
            }
            Bundle bundle = new Bundle();
            bundle.putInt("user_mode", user.getUserMode());
            bundle.putInt("user_period", user.getUserPeriod());
            if (user.getAgeGatePostAction() != enumC62956OnI2.getValue()) {
                i = 0;
            }
            bundle.putInt("is_kids_mode", i);
            AppLog.setCustomerHeader(bundle);
            IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIIZILJ(C78966Uyw.LJIIZILJ(user));
        }
        return null;
    }

    public static final Object call$21(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = ((List) aCallableS83S0200000_6.l0).size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            BaseNotice baseNotice = (BaseNotice) ListProtector.get((List) aCallableS83S0200000_6.l0, i);
            int hashCode = baseNotice.hashCode();
            if (linkedHashMap.get(Integer.valueOf(hashCode)) == null) {
                linkedHashMap.put(Integer.valueOf(hashCode), Integer.valueOf(i));
                i++;
            } else {
                int i2 = baseNotice.type;
                Object obj = linkedHashMap.get(Integer.valueOf(hashCode));
                o.LJI(obj);
                int intValue = ((Number) obj).intValue();
                if (ListProtector.get((List) aCallableS83S0200000_6.l0, intValue) == baseNotice) {
                    z = true;
                }
                if (intValue >= 0) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    List list = (List) aCallableS83S0200000_6.l0;
                    linkedHashMap2.put("notice_type", String.valueOf(i2));
                    linkedHashMap2.put("first_index", String.valueOf(intValue));
                    linkedHashMap2.put("second_index", String.valueOf(i));
                    if (z) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    linkedHashMap2.put("real_equal", str);
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((BaseNotice) it.next()).type));
                    }
                    linkedHashMap2.put("notice_list", arrayList.toString());
                    FMX.LJIIL("inbox_adapter_dup_ele", linkedHashMap2);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("asyncCheckData, duplicate params: ");
                    LIZ.append(linkedHashMap2);
                    C221018lt.LIZIZ("AdapterStableIdFixer", X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("asyncCheckData, stack: ");
                    LIZ2.append(Log.getStackTraceString((Throwable) aCallableS83S0200000_6.l1));
                    C221018lt.LIZIZ("AdapterStableIdFixer", X1D.LIZIZ(LIZ2));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        try {
            RheaTraceUploadTask rheaTraceUploadTask = (RheaTraceUploadTask) aCallableS83S0200000_6.l0;
            File file = (File) aCallableS83S0200000_6.l1;
            rheaTraceUploadTask.getClass();
            RheaTraceUploadTask.LJ(file, "_fake_trace");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        NetworkInitTask networkInitTask = (NetworkInitTask) aCallableS83S0200000_6.l0;
        Throwable th = (Throwable) aCallableS83S0200000_6.l1;
        networkInitTask.getClass();
        NetworkInitTask.LIZLLL("RxJavaPlugins.setErrorHandler failed!", th);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        r5.LIZIZ.add(r7);
        r5.LIZ();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$5(Y.ACallableS83S0200000_6 r7) {
        /*
            java.lang.Object r5 = r7.l0
            com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor r5 = (com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor) r5
            java.lang.Object r7 = r7.l1
            X.E1t r7 = (X.C35761E1t) r7
            monitor-enter(r5)
            java.util.ArrayList<X.E1v> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L58
        Lf:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L4c
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L58
            X.E1v r4 = (X.AbstractC35763E1v) r4     // Catch: java.lang.Throwable -> L58
            java.util.Map r1 = r4.LIZLLL()     // Catch: java.lang.Throwable -> L58
            r3 = 0
            if (r1 == 0) goto Lf
            java.lang.String r0 = "item_id"
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto Lf
            java.util.Map r1 = r7.LIZLLL()     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L36
            java.lang.String r0 = "item_id"
            java.lang.Object r3 = r1.get(r0)     // Catch: java.lang.Throwable -> L58
        L36:
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r3)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto Lf
            java.lang.String r1 = r4.LIZJ()     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r7.LIZJ()     // Catch: java.lang.Throwable -> L58
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto Lf
            monitor-exit(r5)
            goto L55
        L4c:
            java.util.ArrayList<X.E1v> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L58
            r0.add(r7)     // Catch: java.lang.Throwable -> L58
            r5.LIZ()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r5)
        L55:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L58:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS83S0200000_6.call$5(Y.ACallableS83S0200000_6):java.lang.Object");
    }

    public static final Object call$6(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        List<EIE> list = ((SettingRequestExtraInfoImpl) aCallableS83S0200000_6.l0).LIZ;
        Map<String, String> map = (Map) aCallableS83S0200000_6.l1;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ((EIE) it.next()).LIZ(map);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$7(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        PJZ.LIZJ((Throwable) aCallableS83S0200000_6.l1, "BPEA_carrier_cache_error", C51029K0z.LJJIIZI(new OSZ("key", String.valueOf(aCallableS83S0200000_6.l0))));
        return C76800UCe.LIZ;
    }

    public static final Object call$8(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        PJZ.LIZJ((Throwable) aCallableS83S0200000_6.l0, "BPEA_carrier_cache_default", C51029K0z.LJJIIZI(new OSZ("key", String.valueOf(aCallableS83S0200000_6.l1))));
        return C76800UCe.LIZ;
    }

    public static final Object call$9(ACallableS83S0200000_6 aCallableS83S0200000_6) {
        InterfaceC40525FvN interfaceC40525FvN = (InterfaceC40525FvN) ((AqS172S0100000_6) ((ACallableS83S0200000_6) aCallableS83S0200000_6.l0).l0).l0;
        if (interfaceC40525FvN != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stream write error, ");
            LIZ.append(((Throwable) aCallableS83S0200000_6.l1).getMessage());
            interfaceC40525FvN.onFailed(X1D.LIZIZ(LIZ));
            return C76800UCe.LIZ;
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACallableS83S0200000_6(java.lang.Object r2, java.lang.Throwable r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 7: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS83S0200000_6.<init>(java.lang.Object, java.lang.Throwable, int):void");
    }

    public ACallableS83S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
