package com.ss.android.ugc.aweme.shortvideo.ui.savelocal;

import X.AnonymousClass073;
import X.C145995oB;
import X.C162766a8;
import X.C173376rF;
import X.C1I0;
import X.C221108m2;
import X.C38485F8n;
import X.C39579Fg7;
import X.C41677GXh;
import X.C41725GZd;
import X.C41808Gay;
import X.C41859Gbn;
import X.C43045Guv;
import X.C43074GvO;
import X.C44694HgQ;
import X.C48339Iy7;
import X.C5L7;
import X.C60903NvH;
import X.C62822Ol8;
import X.C62850Ola;
import X.C85990Xow;
import X.EnumC43651HBf;
import X.FMX;
import X.I9A;
import X.InterfaceC170656mr;
import X.InterfaceC43072GvM;
import X.InterfaceC65349Pkn;
import X.OSZ;
import X.PVC;
import X.X1D;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.File;
import kotlin.jvm.internal.AqS23S0010000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class SaveLocalHelper {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C41725GZd.LJLIL);

    /* loaded from: classes2.dex */
    public static final class ModerationMessage {

        @InterfaceC65349Pkn("pass")
        public final boolean pass;

        @InterfaceC65349Pkn("frame_id")
        public final String vframeId;

        /* JADX WARN: Multi-variable type inference failed */
        public ModerationMessage() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModerationMessage)) {
                return false;
            }
            ModerationMessage moderationMessage = (ModerationMessage) obj;
            return o.LJ(this.vframeId, moderationMessage.vframeId) && this.pass == moderationMessage.pass;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = this.vframeId.hashCode() * 31;
            boolean z = this.pass;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ModerationMessage(vframeId=");
            LIZ.append(this.vframeId);
            LIZ.append(", pass=");
            return C48339Iy7.LIZJ(LIZ, this.pass, ')', LIZ);
        }

        public ModerationMessage(String vframeId, boolean z) {
            o.LJIIIZ(vframeId, "vframeId");
            this.vframeId = vframeId;
            this.pass = z;
        }

        public /* synthetic */ ModerationMessage(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
        }
    }

    public static final boolean LIZ(boolean z) {
        C60903NvH.LJIIJJI().getRegionService().getClass();
        if (C85990Xow.LJIIJ()) {
            return AVExternalServiceImpl.LIZ().publishService().enableSaveLocalInLegacyScenario();
        }
        if (LIZIZ(z) > 0) {
            return true;
        }
        return false;
    }

    public static final int LIZIZ(boolean z) {
        AqS23S0010000_7 aqS23S0010000_7 = new AqS23S0010000_7(z, 0);
        C62822Ol8 c62822Ol8 = LIZ;
        boolean z2 = ((Keva) c62822Ol8.getValue()).getBoolean("key_reset_action_performed", false);
        if (e1.LIZ(31744, "studio_save_local_turn_off", true, false) && !z2) {
            ((Keva) c62822Ol8.getValue()).storeBoolean("key_reset_action_performed", true);
            if (z) {
                Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("photo_mode_save_to_local_config", 0);
                return 0;
            }
            Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("save_to_local_config", 0);
            return 0;
        }
        return ((Number) aqS23S0010000_7.invoke()).intValue();
    }

    public static final String LIZJ(int i) {
        Context LIZ2 = C5L7.LIZ();
        if (i != 1) {
            if (i != 2) {
                String string = LIZ2.getString(R.string.j8d);
                o.LJIIIIZZ(string, "context.getString(R.string.off)");
                return string;
            }
            String string2 = LIZ2.getString(R.string.chr);
            o.LJIIIIZZ(string2, "context.getString(R.stri…tions_save_with_captions)");
            return string2;
        }
        String string3 = LIZ2.getString(R.string.chs);
        o.LJIIIIZZ(string3, "context.getString(R.stri…ns_save_without_captions)");
        return string3;
    }

    public static final void LIZLLL(String vframeUri) {
        o.LJIIIZ(vframeUri, "vframeUri");
        String message = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), new ModerationMessage(vframeUri, false, 2, null));
        o.LJIIIIZZ(message, "message");
        LJI(message, true);
    }

    public static StringBuilder LJ(String str) {
        String md5 = C173376rF.LJI(str);
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        EnumC43651HBf enumC43651HBf = EnumC43651HBf.MODERATION_WATERMARK_VIDEO;
        o.LJIIIIZZ(md5, "md5");
        return new StringBuilder(LJ.LJIILJJIL(enumC43651HBf, md5));
    }

    public static void LJFF(Long l, String creationId) {
        o.LJIIIZ(creationId, "creationId");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        if (l != null) {
            c145995oB.LIZIZ(l.longValue(), "package_size");
        }
        FMX.LJIIL("download_end", c145995oB.LIZ);
    }

    public static final void LJI(String message, boolean z) {
        OSZ osz;
        String LLLFFI;
        o.LJIIIZ(message, "message");
        try {
            JSONObject jSONObject = new JSONObject(message);
            String optString = jSONObject.optString("frame_id");
            if (!jSONObject.optBoolean("pass", false) || optString == null || optString.length() == 0) {
                C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("video moderation not passed, vframeId: ");
                LIZ2.append(optString);
                LJJ.LIZJ("post_save_local", X1D.LIZIZ(LIZ2));
                osz = new OSZ(optString, Boolean.FALSE);
            } else {
                osz = new OSZ(optString, Boolean.TRUE);
            }
        } catch (Exception e) {
            C41859Gbn LIZIZ = C1I0.LIZIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("parse moderation message failed, stacktrace: ");
            LIZ3.append(Log.getStackTraceString(e));
            LIZIZ.LIZJ("post_save_local", X1D.LIZIZ(LIZ3));
            osz = new OSZ(null, Boolean.FALSE);
        }
        String uri = (String) osz.getFirst();
        boolean booleanValue = ((Boolean) osz.getSecond()).booleanValue();
        if (uri == null || uri.length() == 0) {
            I9A.LIZJ("post_save_local", "skip save local, vframe id is null or empty");
            return;
        }
        o.LJIIIZ(uri, "uri");
        File file = new File(AnonymousClass073.LIZIZ(LJ(uri), File.separator, "metadata.json"));
        if (file.exists() && file.isFile()) {
            try {
                LLLFFI = C38485F8n.LLLFFI(file, PVC.LIZ);
                WatermarkMetadata watermarkMetadata = (WatermarkMetadata) C60903NvH.LJIIJJI().LIZ().LJI(LLLFFI, WatermarkMetadata.class);
                if (watermarkMetadata != null) {
                    String str = watermarkMetadata.creationId;
                    ConcurrentHashSet<String> concurrentHashSet = C41808Gay.LIZ;
                    if (concurrentHashSet.contains(uri)) {
                        C41859Gbn LIZIZ2 = C1I0.LIZIZ();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("skip save local, vframeUri(");
                        LIZ4.append(uri);
                        LIZ4.append(") has been handled before");
                        LIZIZ2.LIZJ("post_save_local", X1D.LIZIZ(LIZ4));
                        return;
                    }
                    concurrentHashSet.add(uri);
                    if (z) {
                        C145995oB c145995oB = new C145995oB();
                        c145995oB.LJI("creation_id", str);
                        c145995oB.LIZ(2, "machine_moderate_status");
                        FMX.LJIIL("download_machine_moderate_status", c145995oB.LIZ);
                        LJFF(null, str);
                        C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("post_save_local", "skip save local, timeout event");
                        return;
                    }
                    if (!booleanValue) {
                        C43045Guv.LIZLLL(new C41677GXh(), 0L);
                    }
                    File file2 = new File(LJ(uri).toString());
                    C41859Gbn LIZIZ3 = C1I0.LIZIZ();
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("try save local, videoRoot=");
                    LIZ5.append(file2);
                    LIZ5.append(", vframeId=");
                    LIZ5.append(uri);
                    LIZIZ3.LIZJ("post_save_local", X1D.LIZIZ(LIZ5));
                    if (!file2.exists() || !file2.isDirectory()) {
                        I9A.LIZJ("post_save_local", "skip save local because watermark file didn't exist");
                        return;
                    }
                    boolean z2 = watermarkMetadata.isImageMode;
                    int i = !booleanValue ? 1 : 0;
                    C145995oB c145995oB2 = new C145995oB();
                    c145995oB2.LJI("creation_id", str);
                    c145995oB2.LIZ(i, "machine_moderate_status");
                    FMX.LJIIL("download_machine_moderate_status", c145995oB2.LIZ);
                    if (!booleanValue) {
                        LJFF(null, str);
                        return;
                    }
                    File[] files = file2.listFiles();
                    if (files == null || files.length == 0) {
                        C39579Fg7.LJIJJ(file2);
                        C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("post_save_local", "skip save local because watermark file directory empty");
                        LJFF(null, str);
                        return;
                    }
                    o.LJIIIIZZ(files, "files");
                    long j = 0;
                    for (File file3 : files) {
                        o.LJIIIIZZ(file3, "file");
                        if (!o.LJ(file3.getName(), "metadata.json")) {
                            String name = file3.getName();
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append(C43074GvO.LIZ());
                            LIZ6.append(name);
                            String LIZIZ4 = X1D.LIZIZ(LIZ6);
                            if (C162766a8.LIZ() && Build.VERSION.SDK_INT >= 29) {
                                try {
                                    Application application = C60903NvH.LJ;
                                    o.LJIIIIZZ(application, "getApplication()");
                                    try {
                                        C44694HgQ.LJJI(application, file3.getAbsolutePath(), name, !z2, null, 48);
                                    } catch (Exception e2) {
                                        e = e2;
                                        C39579Fg7.LIZLLL(file3.getAbsolutePath(), LIZIZ4);
                                        InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
                                        StringBuilder LIZ7 = X1D.LIZ();
                                        LIZ7.append("saveVideoToMediaStore exception ");
                                        LIZ7.append(e.getMessage());
                                        LJJIIZI.LJIIZILJ(X1D.LIZIZ(LIZ7));
                                        j = file3.length() + j;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } else {
                                C39579Fg7.LIZLLL(file3.getAbsolutePath(), LIZIZ4);
                            }
                            j = file3.length() + j;
                        }
                    }
                    C39579Fg7.LJIJJ(file2);
                    C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("post_save_local", "save local succeeded");
                    LJFF(Long.valueOf(j), str);
                    return;
                }
            } catch (Exception unused) {
                C41859Gbn LIZIZ5 = C1I0.LIZIZ();
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("parse metadata failed, path=");
                LIZ8.append(file.getPath());
                LIZIZ5.LIZJ("post_save_local", X1D.LIZIZ(LIZ8));
            }
        } else {
            C41859Gbn LIZIZ6 = C1I0.LIZIZ();
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append("metadata file not exist, path=");
            LIZ9.append(file.getPath());
            LIZIZ6.LIZJ("post_save_local", X1D.LIZIZ(LIZ9));
        }
        I9A.LIZJ("post_save_local", "skip save local, metadata file not exist");
    }
}
