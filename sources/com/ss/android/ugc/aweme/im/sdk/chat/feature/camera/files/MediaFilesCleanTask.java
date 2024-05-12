package com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.files;

import X.C0RN;
import X.C109544Rq;
import X.C111214Yb;
import X.C16880lQ;
import X.C31F;
import X.C31G;
import X.C38891fp;
import X.C4XH;
import X.C4XK;
import X.C62822Ol8;
import X.C63150OqQ;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.X1D;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.service.camera.config.DMCameraFilesManagementSettingsConfig;
import com.ss.android.ugc.aweme.services.dm.DMPath;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MediaFilesCleanTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "MediaFilesCleanTask";
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

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    public static void LIZLLL(File file) {
        String name = file.getName();
        o.LJIIIIZZ(name, "file.name");
        if (C4XK.LIZ(name)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("delete cretive files success: ");
            LIZ.append(file.getName());
            C111214Yb.LIZJ("MediaFilesCleanTask", X1D.LIZIZ(LIZ));
            C38891fp.LJIILL(file.getPath());
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("delete cretive files faild: ");
        LIZ2.append(file.getName());
        C111214Yb.LIZJ("MediaFilesCleanTask", X1D.LIZIZ(LIZ2));
    }

    @Override // X.EEY
    public final void run(Context context) {
        C62822Ol8 c62822Ol8 = C4XH.LIZIZ;
        if (((DMCameraFilesManagementSettingsConfig) c62822Ol8.getValue()).getEnableClean()) {
            if (((DMCameraFilesManagementSettingsConfig) c62822Ol8.getValue()).getCleanInterval() != 0) {
                if (System.currentTimeMillis() - ((Keva) C4XH.LIZJ.getValue()).getLong("key_last_clean_time", 0L) < ((DMCameraFilesManagementSettingsConfig) c62822Ol8.getValue()).getCleanInterval()) {
                    return;
                }
            }
            ((Keva) C4XH.LIZJ.getValue()).storeLong("key_last_clean_time", System.currentTimeMillis());
            try {
                File file = new File(DMPath.Companion.getCACHE_ROOT());
                if (!file.exists()) {
                    return;
                }
                if (file.isFile()) {
                    C16880lQ.LLLZZIL(file);
                    return;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("start delete dm cache: ");
                        LIZ.append(file2.getName());
                        C111214Yb.LIZJ("MediaFilesCleanTask", X1D.LIZIZ(LIZ));
                        C31F.LIZ.getClass();
                        C31G.LIZ();
                        String name = file2.getName();
                        o.LJIIIIZZ(name, "it.name");
                        C109544Rq LJIILJJIL = C63150OqQ.LJIILJJIL(name);
                        if (LJIILJJIL == null || LJIILJJIL.getMsgStatus() == 2 || LJIILJJIL.getMsgStatus() == 5) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("deleted: ");
                            LIZ2.append(file2.getPath());
                            C111214Yb.LIZJ("MediaFilesCleanTask", X1D.LIZIZ(LIZ2));
                            C38891fp.LJIILL(file2.getPath());
                        }
                    }
                }
                File[] listFiles2 = new File(DMPath.Companion.getCREATIVE_ROOT()).listFiles();
                if (listFiles2 != null) {
                    for (File file3 : listFiles2) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("start delete creative files: ");
                        LIZ3.append(file3.getName());
                        C111214Yb.LIZJ("MediaFilesCleanTask", X1D.LIZIZ(LIZ3));
                        if (file3.isDirectory()) {
                            File[] listFiles3 = file3.listFiles();
                            if (listFiles3 == null || listFiles3.length == 0) {
                                LIZLLL(file3);
                            } else {
                                o.LJIIIIZZ(listFiles3, "listFiles");
                                for (File file4 : listFiles3) {
                                    C31F.LIZ.getClass();
                                    C31G.LIZ();
                                    String name2 = file4.getName();
                                    o.LJIIIIZZ(name2, "file.name");
                                    C109544Rq LJIILJJIL2 = C63150OqQ.LJIILJJIL(name2);
                                    if (LJIILJJIL2 == null || LJIILJJIL2.getMsgStatus() == 2 || LJIILJJIL2.getMsgStatus() == 5) {
                                        LIZLLL(file4);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C111214Yb.LIZIZ("MediaFilesCleanTask", e);
            }
        }
    }
}
