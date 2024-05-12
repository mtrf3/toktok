package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.autocut.AutoCutProgressConfig;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import defpackage.e1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HoW */
/* loaded from: classes8.dex */
public abstract class AbstractC45196HoW implements InterfaceC45226Hp0 {
    public final Activity LIZ;
    public C45203Hod LIZIZ;
    public final AutoCutProgressConfig.AutoCutStepProgressConfig LIZLLL;
    public final AutoCutProgressConfig.AutoCutStepProgressConfig LJ;
    public final AutoCutProgressConfig.AutoCutStepProgressConfig LJFF;
    public C44716Hgm LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public int LJIILJJIL;
    public C45091Hmp LIZJ = new C45091Hmp(0);
    public int LJIILIIL = -1;

    public abstract void LJI();

    public abstract String LJIIIZ();

    public abstract boolean LJIIJJI();

    public final int LIZLLL() {
        return (int) C45087Hml.LIZIZ(new C45091Hmp(this.LJIIJ, this.LJIIL, this.LJIIJJI), this.LIZJ);
    }

    public final void LJ() {
        String str = this.LJIIIZ;
        if (str != null) {
            C45154Hnq.LIZJ.getClass();
            C45154Hnq.LIZ(str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJIIIZ());
            LIZ.append(" cancelCompressMeta");
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
            this.LJIIIZ = null;
        }
    }

    public final void LJFF() {
        String str = this.LJII;
        if (str != null) {
            C45087Hml.LIZLLL(str);
        }
        String str2 = this.LJIIIIZZ;
        if (str2 != null) {
            C45087Hml.LIZLLL(str2);
        }
        LJ();
    }

    @Override // X.InterfaceC45226Hp0
    public final void cancel() {
        LJFF();
        LJI();
    }

    @Override // X.InterfaceC45226Hp0
    public final int LIZ() {
        return this.LJIILIIL;
    }

    public AbstractC45196HoW(Activity activity) {
        this.LIZ = activity;
        if (e1.LIZ(31744, "autocut_progress_setting_config", true, false)) {
            AutoCutProgressConfig.AutoCutStepSetting mainProcess = AutoCutProgressConfig.LIZ().getMainProcess();
            this.LIZLLL = mainProcess.getReqMusicListConfig();
            this.LJ = mainProcess.getDownloadConfig();
            this.LJFF = mainProcess.getReqNLEConfig();
        }
    }

    public final C45091Hmp LIZJ(C45203Hod config) {
        int i;
        o.LJIIIZ(config, "config");
        int i2 = 0;
        if (config.LIZ) {
            if (config.LIZJ || config.LIZIZ) {
                AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig = this.LIZLLL;
                if (autoCutStepProgressConfig != null) {
                    i = autoCutStepProgressConfig.getProgress();
                } else {
                    i = 60;
                }
            } else {
                i = 100;
            }
        } else {
            i = 0;
        }
        if (config.LIZJ) {
            if (config.LIZIZ) {
                AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig2 = this.LJ;
                i2 = autoCutStepProgressConfig2 != null ? autoCutStepProgressConfig2.getProgress() : (100 - i) / 2;
            } else if (!config.LIZIZ) {
                i2 = 100 - i;
            }
        }
        return new C45091Hmp(i, (100 - i) - i2, i2);
    }

    public final void LJIIL(List<? extends InterfaceC45209Hoj> callbacks) {
        o.LJIIIZ(callbacks, "callbacks");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIIZ());
        LIZ.append(" processSuccessResult: ");
        LIZ.append(this.LJI);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C44716Hgm c44716Hgm = this.LJI;
        if (c44716Hgm != null && LJIIJJI()) {
            Iterator<? extends InterfaceC45209Hoj> it = callbacks.iterator();
            while (it.hasNext()) {
                it.next().LJIIZILJ(c44716Hgm.LIZ());
            }
            LJI();
        }
    }

    public final void LJII(AVMusic avMusic, List<? extends InterfaceC45209Hoj> callbacks) {
        long j;
        Integer num;
        o.LJIIIZ(avMusic, "avMusic");
        o.LJIIIZ(callbacks, "callbacks");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIIZ());
        LIZ.append(" start downloadMusic: musicId = ");
        LIZ.append(avMusic.getMusicId());
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C44716Hgm c44716Hgm = this.LJI;
        if (c44716Hgm != null) {
            c44716Hgm.LJ = avMusic;
        }
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig = this.LJ;
        if (autoCutStepProgressConfig != null) {
            j = autoCutStepProgressConfig.getUpdateInterval();
        } else {
            j = 20;
        }
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig2 = this.LJ;
        if (autoCutStepProgressConfig2 != null) {
            num = Integer.valueOf(autoCutStepProgressConfig2.getUpdateCount());
        } else {
            num = null;
        }
        LJIIIIZZ(j, num, new AqS138S0200000_7(this, (AbstractC45196HoW) callbacks, (List<? extends InterfaceC45209Hoj>) 67));
        C78934UyQ.LJLIL.getMusicService().LJIILL(this.LIZ, avMusic, 0, false, new C45197HoX(this, callbacks, avMusic));
    }

    public final void LJIIIIZZ(long j, Integer num, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns) {
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C68842n2(num, this, j, interfaceC88472Yns, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[LOOP:0: B:20:0x0091->B:22:0x0097, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(X.AbstractC45196HoW r4, int r5, java.lang.Integer r6, java.lang.String r7, com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr r8, int r9) {
        /*
            r0 = r9 & 2
            if (r0 == 0) goto La
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        La:
            r1 = r9 & 4
            r0 = 0
            if (r1 == 0) goto L10
            r7 = r0
        L10:
            r1 = r9 & 8
            if (r1 == 0) goto L15
            r8 = r0
        L15:
            r4.getClass()
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r1 = r4.LJIIIZ()
            r2.append(r1)
            java.lang.String r1 = " handleFailure: errorCode = "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            X.C45049Hm9.LIZIZ(r1)
            r4.LJIILIIL = r5
            r1 = 4
            java.lang.Integer[] r3 = new java.lang.Integer[r1]
            com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode r1 = com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode.UPLOAD_TOS_FAILURE
            int r1 = r1.swigValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 0
            r3[r1] = r2
            com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode r1 = com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode.MUSIC_REQUEST_FAILURE
            int r1 = r1.swigValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 1
            r3[r1] = r2
            com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode r1 = com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode.CONFIG_REQUEST_FAILURE
            int r1 = r1.swigValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 2
            r3[r1] = r2
            com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode r1 = com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE
            int r1 = r1.swigValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 3
            r3[r1] = r2
            java.util.List r2 = X.C47261Igj.LJJIJIIJI(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto Lb2
            android.content.Context r1 = X.C5L7.LIZ()
            boolean r1 = X.C48203Ivv.LJ(r1)
            if (r1 != 0) goto La1
            X.Hol r2 = X.EnumC45211Hol.ERROR_PROCESS_INTERNET
        L85:
            X.Hod r0 = r4.LIZIZ
            if (r0 == 0) goto Lb5
            java.util.List<X.Hoj> r0 = r0.LJIILJJIL
            if (r0 == 0) goto Lb5
            java.util.Iterator r1 = r0.iterator()
        L91:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = r1.next()
            X.Hoj r0 = (X.InterfaceC45209Hoj) r0
            r0.LJIILL(r5, r6, r7, r2)
            goto L91
        La1:
            java.lang.String r1 = "weak_net"
            if (r8 == 0) goto La9
            java.lang.Object r0 = r8.get(r1)
        La9:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lb2
            X.Hol r2 = X.EnumC45211Hol.ERROR_PROCESS_INTERNET_WEAK
            goto L85
        Lb2:
            X.Hol r2 = X.EnumC45211Hol.ERROR_PROCESS_GENERAL
            goto L85
        Lb5:
            r4.LJFF()
            r4.LJI()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC45196HoW.LJIIJ(X.HoW, int, java.lang.Integer, java.lang.String, com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr, int):void");
    }

    public static /* synthetic */ void LJIILJJIL(AbstractC45196HoW abstractC45196HoW, String str, String str2, int i, EnumC45070HmU enumC45070HmU, List list, CreativeInfo creativeInfo, boolean z, List list2) {
        abstractC45196HoW.LJIILIIL(str, str2, "", "", i, "", "", enumC45070HmU, list, null, creativeInfo, z, list2);
    }

    public final void LJIILL(List<AutoCutMediaModel> mediaModelList, int i, CreativeInfo creativeInfo, boolean z, boolean z2, boolean z3, boolean z4, List<? extends InterfaceC45209Hoj> callbacks, InterfaceC88471Ynr<? super List<CutsameDataItem>, ? super String, C76800UCe> interfaceC88471Ynr) {
        long j;
        Integer num;
        o.LJIIIZ(mediaModelList, "mediaModelList");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(callbacks, "callbacks");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIIZ());
        LIZ.append(" start requestRecommendedMusicList: mediaModelList = ");
        LIZ.append(mediaModelList);
        LIZ.append(", musicCount = ");
        LIZ.append(i);
        LIZ.append(", creativeInfo = ");
        LIZ.append(creativeInfo);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig = this.LIZLLL;
        if (autoCutStepProgressConfig != null) {
            j = autoCutStepProgressConfig.getUpdateInterval();
        } else {
            j = 40;
        }
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig2 = this.LIZLLL;
        if (autoCutStepProgressConfig2 != null) {
            num = Integer.valueOf(autoCutStepProgressConfig2.getUpdateCount());
        } else {
            num = null;
        }
        LJIIIIZZ(j, num, new AqS138S0200000_7(this, (AbstractC45196HoW) callbacks, (List<? extends InterfaceC45209Hoj>) 69));
        for (InterfaceC45209Hoj interfaceC45209Hoj : callbacks) {
            interfaceC45209Hoj.LJII();
            interfaceC45209Hoj.LJFF("before_extract");
        }
        OSZ<String, String> LJJIJ = C45087Hml.LJJIJ(mediaModelList, i, creativeInfo, z, z2, "source_auto_cut", z4, new C45198HoY(this, z3, callbacks, interfaceC88471Ynr));
        this.LJII = LJJIJ.getFirst();
        this.LJIIIZ = LJJIJ.getSecond();
    }

    public final void LJIILIIL(String str, String musicId, String str2, String str3, int i, String str4, String str5, EnumC45070HmU requestType, List<AutoCutMediaModel> mediaModelList, java.util.Set<String> set, CreativeInfo creativeInfo, boolean z, List<? extends InterfaceC45209Hoj> callbacks) {
        long j;
        Integer num;
        boolean z2;
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(requestType, "requestType");
        o.LJIIIZ(mediaModelList, "mediaModelList");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(callbacks, "callbacks");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIIZ());
        LIZ.append(" start requestNLEModel: mediaList: ");
        C45243HpH.LIZIZ(LIZ, ORZ.LLD(mediaModelList, null, null, null, C45193HoT.LJLIL, 31), LIZ);
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig = this.LJFF;
        if (autoCutStepProgressConfig != null) {
            j = autoCutStepProgressConfig.getUpdateInterval();
        } else {
            j = 20;
        }
        AutoCutProgressConfig.AutoCutStepProgressConfig autoCutStepProgressConfig2 = this.LJFF;
        if (autoCutStepProgressConfig2 != null) {
            num = Integer.valueOf(autoCutStepProgressConfig2.getUpdateCount());
        } else {
            num = null;
        }
        LJIIIIZZ(j, num, new AqS138S0200000_7(this, (AbstractC45196HoW) callbacks, (List<? extends InterfaceC45209Hoj>) 68));
        for (InterfaceC45209Hoj interfaceC45209Hoj : callbacks) {
            interfaceC45209Hoj.LJIILIIL(i, musicId, str, str2, str3, str5);
            if (requestType != EnumC45070HmU.TEMPLATE_CC) {
                interfaceC45209Hoj.LJFF("compress");
            }
            interfaceC45209Hoj.LJFF("nlemodel_request_success");
        }
        LJ();
        if (C133625Mg.LIZ() && i != EnumC43998HOo.CUT_SAME.getValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIIIZZ = C45087Hml.LJJIJIIJI(str, musicId, str2, str4, str5, requestType, mediaModelList, set, creativeInfo, z, z2, i, "source_auto_cut", new C45192HoS(callbacks, z2, this, requestType, i, str2, str3, musicId, str));
    }
}
