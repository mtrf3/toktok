package X;

import Y.ARunnableS1S0001000_6;
import android.content.SharedPreferences;
import com.bytedance.zoin.model.LibModuleInfo;
import com.bytedance.zoin.model.ZoinBuildFileInfo;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FiX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39729FiX {
    public SharedPreferences LIZ;
    public String LIZIZ;
    public volatile boolean LIZJ;
    public File LIZLLL;
    public File LJ;

    public final File LIZIZ() {
        if (this.LJ == null) {
            File LIZJ = LIZJ(this.LIZIZ);
            this.LJ = LIZJ;
            C78685UuP.LJJII(LIZJ);
            List<String> list = C39639Fh5.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("current work dir path permission:");
            LIZ.append(this.LJ);
            LIZ.append("; write:");
            LIZ.append(this.LJ.canWrite());
            LIZ.append("; read:");
            LIZ.append(this.LJ.canRead());
            LIZ.append(";exist:");
            LIZ.append(this.LJ.exists());
            ((CopyOnWriteArrayList) list).add(X1D.LIZIZ(LIZ));
        }
        return this.LJ;
    }

    public final void LIZ(List<LibModuleInfo> list) {
        String string = this.LIZ.getString("key.meta.md5", "defaultmd5");
        C39734Fic LIZJ = C39734Fic.LIZJ();
        StringBuilder LIZIZ = C25620zW.LIZIZ("md5 check last?: ", string, " now?:");
        LIZIZ.append(this.LIZIZ);
        X1D.LIZIZ(LIZIZ);
        LIZJ.getClass();
        if (!this.LIZIZ.equals(string)) {
            File LIZJ2 = LIZJ(string);
            File LIZIZ2 = LIZIZ();
            C39734Fic LIZJ3 = C39734Fic.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("last workdir exists?: ");
            LIZ.append(LIZJ2);
            LIZ.append(" ");
            LIZ.append(LIZJ2.exists());
            X1D.LIZIZ(LIZ);
            LIZJ3.getClass();
            for (LibModuleInfo libModuleInfo : list) {
                List<ZoinBuildFileInfo> list2 = libModuleInfo.curAbiInfo.libFileInfoList;
                String str = libModuleInfo.moduleName;
                this.LIZJ = true;
                if (LIZJ2.exists()) {
                    HashSet hashSet = new HashSet();
                    File[] listFiles = LIZJ2.listFiles(new FilenameFilter() { // from class: X.Fie
                        public final /* synthetic */ String LIZ = ".so";

                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file, String str2) {
                            return str2.endsWith(this.LIZ);
                        }
                    });
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            ZoinBuildFileInfo zoinBuildFileInfo = new ZoinBuildFileInfo();
                            zoinBuildFileInfo.checkNumber = C39731FiZ.LIZIZ(file);
                            zoinBuildFileInfo.name = file.getName();
                            hashSet.add(zoinBuildFileInfo);
                        }
                    }
                    Iterator<ZoinBuildFileInfo> it = list2.iterator();
                    while (it.hasNext()) {
                        ZoinBuildFileInfo next = it.next();
                        if (hashSet.contains(next)) {
                            String str2 = next.name;
                            new File(LIZJ2, str2).renameTo(new File(LIZIZ2, str2));
                            it.remove();
                        }
                    }
                    C39734Fic LIZJ4 = C39734Fic.LIZJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("files which need to be decompressed:");
                    LIZ2.append(list2);
                    X1D.LIZIZ(LIZ2);
                    LIZJ4.getClass();
                }
                if (list2 != null && list2.size() > 0) {
                    SharedPreferences.Editor edit = this.LIZ.edit();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str);
                    LIZ3.append("_");
                    LIZ3.append("key.lib.decode.finished");
                    edit.putBoolean(X1D.LIZIZ(LIZ3), false).apply();
                }
                SharedPreferences.Editor edit2 = this.LIZ.edit();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(str);
                LIZ4.append("_");
                LIZ4.append("is_first_load");
                edit2.putBoolean(X1D.LIZIZ(LIZ4), true).apply();
            }
        }
        this.LIZ.edit().putString("key.meta.md5", this.LIZIZ).apply();
        C39734Fic.LIZJ().getClass();
        PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("orkDirManager")).schedule(new ARunnableS1S0001000_6(0, 11), 15L, TimeUnit.SECONDS);
    }

    public final File LIZJ(String str) {
        if (this.LIZLLL == null) {
            File filesDir = C78929UyL.LJLIL.getFilesDir();
            C78685UuP.LJJII(filesDir);
            File file = new File(filesDir, "zoin");
            this.LIZLLL = file;
            C78685UuP.LJJII(file);
        }
        return new File(this.LIZLLL, str);
    }
}
