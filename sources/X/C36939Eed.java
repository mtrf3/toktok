package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Eed, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36939Eed implements InterfaceC36778Ec2 {
    public final Collection<String> LIZ;

    @Override // X.InterfaceC36778Ec2
    public final List<String> LIZ() {
        boolean z;
        BufferedReader bufferedReader;
        ArrayList arrayList = new ArrayList();
        for (String str : this.LIZ) {
            long nanoTime = System.nanoTime();
            String str2 = null;
            try {
                String LIZJ = O3U.LIZJ(C38943FQd.LIZ(), str);
                if (!TextUtils.isEmpty(LIZJ)) {
                    File file = new File(LIZJ);
                    if (file.exists() && file.listFiles() != null) {
                        File[] listFiles = file.listFiles();
                        o.LJIIIIZZ(listFiles, "dir.listFiles()");
                        if (listFiles.length == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            File file2 = new File(file, "prefetch.json");
                            if (file2.exists()) {
                                try {
                                    Reader inputStreamReader = new InputStreamReader(new FileInputStream(file2.getAbsolutePath()), PVC.LIZ);
                                    if (inputStreamReader instanceof BufferedReader) {
                                        bufferedReader = (BufferedReader) inputStreamReader;
                                    } else {
                                        bufferedReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
                                    }
                                    try {
                                        String LJIILJJIL = C77321UWf.LJIILJJIL(bufferedReader);
                                        AnonymousClass636.LJFF(bufferedReader, null);
                                        str2 = LJIILJJIL;
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                            break;
                                        } catch (Throwable th2) {
                                            AnonymousClass636.LJFF(bufferedReader, th);
                                            throw th2;
                                            break;
                                        }
                                    }
                                } catch (Exception e) {
                                    C36922EeM.LJFF(e);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public C36939Eed(Collection<String> channels) {
        o.LJIIIZ(channels, "channels");
        this.LIZ = channels;
    }
}
