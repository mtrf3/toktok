package Y;

import X.AV1;
import X.AbstractC65815PsJ;
import X.C021606q;
import X.C0M7;
import X.C1545664u;
import X.C1554968j;
import X.C16880lQ;
import X.C221018lt;
import X.C2MA;
import X.C2NH;
import X.C32420Cnw;
import X.C35820E4a;
import X.C38819FLj;
import X.C57022Lq;
import X.C59436NUi;
import X.C63939P7n;
import X.C64707PaR;
import X.C65265PjR;
import X.C65268PjU;
import X.C65929Pu9;
import X.C67003QRj;
import X.C67229Qa1;
import X.C67230Qa2;
import X.C67649Qgn;
import X.C73701SwD;
import X.C78939UyV;
import X.C7WD;
import X.C86550Xxy;
import X.FMW;
import X.FX4;
import X.FYV;
import X.HG3;
import X.HandlerThreadC64418PPy;
import X.InterfaceC66032Pvo;
import X.NQP;
import X.PU0;
import X.PU2;
import X.QM6;
import X.QM8;
import X.QMB;
import X.QRC;
import X.QRM;
import X.QSN;
import X.R39;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.monitor.adapter.MonitorServiceImpl;
import com.bytedance.push.PushBody;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.account.share.data.read.ReadTempActivity;
import com.ss.android.agilelogger.ALog;
import com.ss.android.newmedia.message.MessageReceiverService;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS14S0201000_11 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a6, code lost:
    
        if (r2 > com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerShowIntervalTimeSetting.DEFAULT) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS14S0201000_11.LIZ$0():void");
    }

    public final void LIZ$1() {
        C73701SwD c73701SwD = (C73701SwD) this.l0;
        BigThumb bigThumb = (BigThumb) this.l1;
        int i = this.i2;
        c73701SwD.getClass();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c73701SwD.LJ);
            LIZ.append("/thumbs");
            File file = new File(X1D.LIZIZ(LIZ));
            if (file.exists() || file.mkdirs()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(file.getPath());
                LIZ2.append('/');
                LIZ2.append(((String) ListProtector.get(bigThumb.getImgUris(), i)).hashCode());
                LIZ2.append('.');
                LIZ2.append(c73701SwD.LIZLLL);
                LIZ2.append(".temp");
                File file2 = new File(X1D.LIZIZ(LIZ2));
                C16880lQ.LLZ(file2);
                file2.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                Bitmap bitmap = c73701SwD.LIZJ;
                if (bitmap != null) {
                    bitmap.compress(c73701SwD.LIZJ(), 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(file.getPath());
                    LIZ3.append('/');
                    LIZ3.append(((String) ListProtector.get(bigThumb.getImgUris(), i)).hashCode());
                    LIZ3.append('.');
                    LIZ3.append(c73701SwD.LIZLLL);
                    file2.renameTo(new File(X1D.LIZIZ(LIZ3)));
                    return;
                }
                o.LJIJI("bitmap");
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZ$2() {
        String str;
        if (((PushBody) this.l0) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rule_id", ((PushBody) this.l0).id);
                jSONObject.put("rule_id64", ((PushBody) this.l0).rid64);
                jSONObject.put("sender", this.i2);
                jSONObject.put("push_sdk_version", String.valueOf(30204));
                jSONObject.put("push_sdk_version_name", "3.2.4-alpha.29");
                jSONObject.put("ttpush_sec_target_uid", ((PushBody) this.l0).targetSecUid);
                ((QRC) this.l1).getClass();
                jSONObject.put("local_sec_uid", QRC.LIZLLL());
                QRC qrc = (QRC) this.l1;
                String str2 = ((PushBody) this.l0).targetSecUid;
                qrc.getClass();
                if (QRC.LJFF(str2)) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("is_self", str);
                jSONObject.put("client_time", System.currentTimeMillis());
                if (!TextUtils.isEmpty(((PushBody) this.l0).groupId)) {
                    jSONObject.put("ttpush_group_id", ((PushBody) this.l0).groupId);
                }
                ((QRC) this.l1).LIZIZ.getClass();
                R39.LIZJ("push_expire_time", jSONObject);
                HG3 hg3 = QRM.LJIIIIZZ.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("push_expire_time:");
                LIZ.append(jSONObject);
                X1D.LIZIZ(LIZ);
                hg3.getClass();
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static final void run$0(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        Context context = (Context) aRunnableS14S0201000_11.l0;
        C67230Qa2 c67230Qa2 = (C67230Qa2) aRunnableS14S0201000_11.l1;
        int i = aRunnableS14S0201000_11.i2;
        if (AwemeRedBadgerManager.LJLJI.LIZJ(context, c67230Qa2)) {
            return;
        }
        C67229Qa1 c67229Qa1 = c67230Qa2.extra;
        if (c67229Qa1 != null && C86550Xxy.LIZIZ.LJIIJ(c67229Qa1.rawExtra)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleMessage intercepted by in-app:");
            LIZ.append(c67230Qa2.id);
            C221018lt.LJFF("MessageShowHandler", X1D.LIZIZ(LIZ));
        } else {
            QSN.LJFF(c67230Qa2, i);
        }
        QSN.LIZLLL(c67230Qa2.openUrl, true);
        C67229Qa1 c67229Qa12 = c67230Qa2.extra;
        if (c67229Qa12 != null) {
            c67229Qa12.turn_screen_on = false;
        }
        MessageShowHandler.LJI(i, context, c67230Qa2);
        C67003QRj LJFF = C67003QRj.LJFF();
        long currentTimeMillis = System.currentTimeMillis();
        if (LJFF.LIZLLL() == null) {
            return;
        }
        LJFF.LIZLLL().edit().putLong("last_notify_time", currentTimeMillis).apply();
    }

    public static final void run$1(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        boolean LIZ;
        try {
            aRunnableS14S0201000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        PU0 pu0 = (PU0) aRunnableS14S0201000_11.l0;
        C32420Cnw c32420Cnw = (C32420Cnw) aRunnableS14S0201000_11.l1;
        int i = aRunnableS14S0201000_11.i2;
        C7WD c7wd = (C7WD) ((HashMap) pu0.LIZ).get(c32420Cnw.LIZ);
        if (c7wd == null) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) c7wd.LIZIZ).iterator();
        while (it.hasNext()) {
            ((PU2) it.next()).onProgress(i);
        }
    }

    public static final void run$11(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        switch (aRunnableS14S0201000_11.i2) {
            case 0:
                NQP nqp = (NQP) aRunnableS14S0201000_11.l0;
                Runnable runnable = (Runnable) aRunnableS14S0201000_11.l1;
                C59436NUi.LIZIZ = nqp.LIZ();
                C2NH.LIZ(runnable);
                return;
            case 1:
                C1545664u c1545664u = (C1545664u) aRunnableS14S0201000_11.l0;
                List<TextFontStyleData> list = (List) aRunnableS14S0201000_11.l1;
                C1554968j c1554968j = c1545664u.LLF;
                if (c1554968j != null && c1554968j.getParent() != null) {
                    c1545664u.LLF.LIZIZ(list);
                    return;
                }
                return;
            case 2:
                JSONObject jSONObject = (JSONObject) aRunnableS14S0201000_11.l0;
                String str = (String) aRunnableS14S0201000_11.l1;
                String uid = AV1.LIZIZ().getUid();
                String str2 = C64707PaR.LIZIZ;
                String str3 = C64707PaR.LIZLLL;
                String str4 = C64707PaR.LIZJ;
                if (!TextUtils.isEmpty(str4)) {
                    str4 = str4.toLowerCase();
                }
                String optString = jSONObject.optString("source");
                String optString2 = jSONObject.optString("store_region");
                if (!TextUtils.isEmpty(str4)) {
                    str4 = str4.toLowerCase();
                }
                if (!TextUtils.isEmpty(optString2)) {
                    optString2 = optString2.toLowerCase();
                }
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("operation", "Monitor Event");
                arrayMap.put("uid", uid);
                arrayMap.put("event_time_stamp", Long.valueOf(System.currentTimeMillis()));
                arrayMap.put("region_source", str3);
                arrayMap.put("region_code", str4);
                if (!TextUtils.isEmpty(str2)) {
                    arrayMap.put("region_idc", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (ALog.sConfig != null) {
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("RegionEvent", str);
                    }
                    Matcher matcher = FX4.LIZJ.matcher(str);
                    if (matcher.find() && matcher.groupCount() >= 4) {
                        arrayMap.put("url", matcher.group(1).replaceAll("\\\\", ""));
                        arrayMap.put("logId", matcher.group(2));
                        arrayMap.put("new_region_code", matcher.group(3));
                        arrayMap.put("new_region_source", matcher.group(4));
                        if (!Objects.equals(matcher.group(3), optString2) || !Objects.equals(matcher.group(4), optString)) {
                            arrayMap.put("log_source", optString);
                            arrayMap.put("log_code", optString2);
                            arrayMap.put("diff", Boolean.TRUE);
                            Matcher matcher2 = FX4.LIZLLL.matcher(str);
                            if (matcher2.find() && matcher2.groupCount() >= 1 && !TextUtils.isEmpty(matcher2.group(1))) {
                                arrayMap.put("x-tt-tnc-attr", matcher2.group(1));
                            }
                            Matcher matcher3 = FX4.LJ.matcher(str);
                            if (matcher3.find() && matcher3.groupCount() >= 1 && !TextUtils.isEmpty(matcher3.group(1))) {
                                arrayMap.put("x-tt-with-tnc", matcher3.group(1));
                            }
                        }
                    }
                }
                MonitorServiceImpl.LJIILIIL().LJ(arrayMap);
                return;
            default:
                C65268PjU c65268PjU = (C65268PjU) aRunnableS14S0201000_11.l0;
                Object obj = aRunnableS14S0201000_11.l1;
                C021606q LIZIZ = c65268PjU.LIZIZ();
                if (!obj.equals(LIZIZ)) {
                    C65265PjR.LIZIZ().getClass();
                    c65268PjU.LIZJ(LIZIZ);
                    return;
                }
                return;
        }
    }

    public static final void run$12(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        boolean LIZ;
        try {
            aRunnableS14S0201000_11.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        switch (aRunnableS14S0201000_11.i2) {
            case 0:
                HeliosEnvImpl heliosEnvImpl = (HeliosEnvImpl) aRunnableS14S0201000_11.l0;
                ((LinkedList) heliosEnvImpl.LJIIJJI).add(aRunnableS14S0201000_11.l1);
                return;
            default:
                C63939P7n c63939P7n = (C63939P7n) aRunnableS14S0201000_11.l0;
                C67649Qgn c67649Qgn = (C67649Qgn) aRunnableS14S0201000_11.l1;
                c63939P7n.getClass();
                try {
                    c67649Qgn.LIZIZ(c63939P7n.LIZ());
                    return;
                } catch (Exception e) {
                    c67649Qgn.LIZ(e);
                    return;
                }
        }
    }

    public static final void run$3(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        switch (aRunnableS14S0201000_11.i2) {
            case 0:
                HeliosEnvImpl heliosEnvImpl = (HeliosEnvImpl) aRunnableS14S0201000_11.l0;
                AbstractC65815PsJ abstractC65815PsJ = (AbstractC65815PsJ) aRunnableS14S0201000_11.l1;
                heliosEnvImpl.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    heliosEnvImpl.LJIIIZ = abstractC65815PsJ;
                    SettingsModel LIZ = abstractC65815PsJ.LIZ();
                    heliosEnvImpl.LJIIJ = LIZ;
                    heliosEnvImpl.LJI = true;
                    heliosEnvImpl.onNewSettings(LIZ);
                    heliosEnvImpl.LJIIIIZZ();
                    return;
                } finally {
                    C65929Pu9.LIZ(currentTimeMillis, "HeliosEnvImpl.initSettingsAsync", true);
                }
            case 1:
                ((FYV) aRunnableS14S0201000_11.l0).LIZ((File) aRunnableS14S0201000_11.l1);
                return;
            default:
                ((BaseListFragmentPanel) aRunnableS14S0201000_11.l0).lambda$partitionFrameExecPageSelected$3((C2MA) aRunnableS14S0201000_11.l1);
                return;
        }
    }

    public static final void run$4(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        switch (aRunnableS14S0201000_11.i2) {
            case 0:
                HeliosEnvImpl heliosEnvImpl = (HeliosEnvImpl) aRunnableS14S0201000_11.l0;
                SettingsModel settingsModel = (SettingsModel) aRunnableS14S0201000_11.l1;
                heliosEnvImpl.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = heliosEnvImpl.LJIILL.iterator();
                while (true) {
                    C0M7 c0m7 = (C0M7) it;
                    if (c0m7.hasNext()) {
                        ((InterfaceC66032Pvo) c0m7.next()).onNewSettings(settingsModel);
                    } else {
                        C65929Pu9.LIZ(currentTimeMillis, "HeliosEnvImpl.onSettingsChanged", true);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("version:");
                        LIZ.append(settingsModel.version);
                        HeliosEnvImpl.CheckPoint checkPoint = new HeliosEnvImpl.CheckPoint("settings change", X1D.LIZIZ(LIZ));
                        HandlerThreadC64418PPy.LIZ();
                        HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS14S0201000_11(0, heliosEnvImpl, checkPoint, 2));
                        return;
                    }
                }
            default:
                Context context = (Context) aRunnableS14S0201000_11.l0;
                Context context2 = (Context) aRunnableS14S0201000_11.l1;
                try {
                    C35820E4a.LIZLLL(context);
                    context2.getSharedPreferences("cold_boot_launch_protector", 0);
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }

    public static final void run$5(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        try {
            ((MessageReceiverService) aRunnableS14S0201000_11.l1).onHandleIntent((Intent) aRunnableS14S0201000_11.l0);
            ((MessageReceiverService) aRunnableS14S0201000_11.l1).stopSelf(aRunnableS14S0201000_11.i2);
        } catch (Throwable unused) {
        }
    }

    public static final void run$6(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        boolean LIZ;
        try {
            try {
                ((CronetWebsocketConnection) aRunnableS14S0201000_11.l1).LIZIZ.LIZLLL((ByteBuffer) aRunnableS14S0201000_11.l0, aRunnableS14S0201000_11.i2);
            } catch (Exception e) {
                C78939UyV.LJII("Exception in callback: ", e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        switch (aRunnableS14S0201000_11.i2) {
            case 0:
                String key = (String) aRunnableS14S0201000_11.l0;
                QMB readConfig = (QMB) aRunnableS14S0201000_11.l1;
                o.LJIIIZ(key, "$key");
                o.LJIIIZ(readConfig, "$readConfig");
                try {
                    Intent intent = new Intent(QM6.LIZ, (Class<?>) ReadTempActivity.class);
                    intent.putExtra("EXTRA_KEY", key);
                    intent.putExtra("READ_PKG", readConfig.LIZ);
                    intent.addFlags(268435456);
                    Context context = QM6.LIZ;
                    o.LJI(context);
                    C16880lQ.LIZJ(context, intent);
                    return;
                } catch (Exception unused) {
                    QM6.LJ(new QM8(2, readConfig.LIZ, "start activity error", false));
                    return;
                }
            default:
                C38819FLj c38819FLj = (C38819FLj) aRunnableS14S0201000_11.l0;
                IESSettingsProxy iESSettingsProxy = (IESSettingsProxy) aRunnableS14S0201000_11.l1;
                c38819FLj.getClass();
                try {
                    c38819FLj.LJLIL.change(iESSettingsProxy);
                    return;
                } catch (Throwable th) {
                    FMW.LIZLLL("SettingsManagerNotifyCallbackExperiment", "ISettingsWatcherWrapper", "change", "", th);
                    C57022Lq.LIZ.LJLIL.post(new ARunnableS16S0201000_13(1, c38819FLj, iESSettingsProxy, 3));
                    return;
                }
        }
    }

    public static final void run$8(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        AuthorizeActivity authorizeActivity = (AuthorizeActivity) aRunnableS14S0201000_11.l0;
        authorizeActivity.setResult(aRunnableS14S0201000_11.i2, (Intent) aRunnableS14S0201000_11.l1);
        authorizeActivity.finish();
    }

    public static final void run$9(ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        boolean LIZ;
        try {
            aRunnableS14S0201000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS14S0201000_11(int i, Context context, C67230Qa2 c67230Qa2, int i2) {
        this.$t = i2;
        switch (i2) {
            case 0:
                this.l0 = context;
                this.l1 = c67230Qa2;
                this.i2 = i;
                return;
            default:
                this.l0 = context;
                this.i2 = i;
                this.l1 = c67230Qa2;
                return;
        }
    }

    public ARunnableS14S0201000_11(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
