package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FhU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39664FhU implements Runnable {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ InterfaceC39666FhW LJLILLLLZI;
    public final /* synthetic */ C39663FhT LJLJI;

    public RunnableC39664FhU(C39663FhT c39663FhT, List list, InterfaceC39666FhW interfaceC39666FhW) {
        this.LJLJI = c39663FhT;
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC39666FhW;
    }

    public final void LIZ() {
        Context context;
        Integer num;
        FileChannel channel;
        int i = -11;
        try {
            C39667FhX c39667FhX = this.LJLJI.LIZJ;
            List list = this.LJLIL;
            c39667FhX.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!c39667FhX.LIZ.LIZIZ(C16880lQ.LLJJIJIIJIL((Intent) it.next(), "split_id")).exists()) {
                    C39663FhT c39663FhT = this.LJLJI;
                    List<Intent> list2 = this.LJLIL;
                    InterfaceC39666FhW interfaceC39666FhW = this.LJLILLLLZI;
                    c39663FhT.getClass();
                    try {
                        C39649FhF c39649FhF = c39663FhT.LIZIZ;
                        c39649FhF.getClass();
                        channel = new RandomAccessFile(new File(c39649FhF.LJ(), "lock.tmp"), "rw").getChannel();
                        num = null;
                    } catch (Exception e) {
                        C16880lQ.LJL("Error locking files.", e);
                        num = -13;
                    }
                    try {
                        try {
                            FileLock tryLock = channel.tryLock();
                            if (tryLock != null) {
                                try {
                                    for (Intent intent : list2) {
                                        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "split_id");
                                        AssetFileDescriptor openAssetFileDescriptor = c39663FhT.LIZ.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                                        C39649FhF c39649FhF2 = c39663FhT.LIZIZ;
                                        c39649FhF2.getClass();
                                        File file = new File(c39649FhF2.LJ(), "unverified-splits");
                                        C39649FhF.LJII(file);
                                        File LJI = C39649FhF.LJI(file, String.valueOf(LLJJIJIIJIL).concat(".apk"));
                                        if ((!LJI.exists() || LJI.length() == openAssetFileDescriptor.getLength()) && LJI.exists()) {
                                        }
                                        if (c39663FhT.LIZIZ.LIZIZ(LLJJIJIIJIL).exists()) {
                                            continue;
                                        } else {
                                            BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFileDescriptor.createInputStream());
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(LJI);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    while (true) {
                                                        int read = bufferedInputStream.read(bArr);
                                                        if (read <= 0) {
                                                            break;
                                                        } else {
                                                            fileOutputStream.write(bArr, 0, read);
                                                        }
                                                    }
                                                    fileOutputStream.close();
                                                    bufferedInputStream.close();
                                                } catch (Throwable th) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (Throwable th2) {
                                                        C36662EaA.LIZ(th, th2);
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                try {
                                                    bufferedInputStream.close();
                                                } catch (Throwable th4) {
                                                    C36662EaA.LIZ(th3, th4);
                                                }
                                                throw th3;
                                            }
                                        }
                                    }
                                    try {
                                        if (c39663FhT.LIZJ.LIZ()) {
                                            i = 0;
                                        } else {
                                            C16880lQ.LJJZZIII("Split verification failed.");
                                        }
                                    } catch (Exception e2) {
                                        C16880lQ.LJL("Error verifying splits.", e2);
                                    }
                                } catch (Exception e3) {
                                    C16880lQ.LJL("Error copying splits.", e3);
                                    i = -13;
                                }
                                num = Integer.valueOf(i);
                                tryLock.release();
                            }
                        } catch (OverlappingFileLockException unused) {
                        }
                        if (channel != null) {
                            channel.close();
                        }
                        if (num == null) {
                            return;
                        }
                        if (num.intValue() == 0) {
                            interfaceC39666FhW.b();
                            return;
                        } else {
                            interfaceC39666FhW.LIZ(num.intValue());
                            return;
                        }
                    } finally {
                    }
                }
            }
            C39663FhT c39663FhT2 = this.LJLJI;
            InterfaceC39666FhW interfaceC39666FhW2 = this.LJLILLLLZI;
            try {
                context = c39663FhT2.LIZ;
                Context LLLLL = C16880lQ.LLLLL(context);
                if (LLLLL != null) {
                    context = LLLLL;
                }
            } catch (Exception e4) {
                C16880lQ.LJL("Error emulating splits.", e4);
            }
            if (C39647FhD.LIZIZ(context, true)) {
                interfaceC39666FhW2.a();
            } else {
                C16880lQ.LJJZZIII("Emulating splits failed.");
                interfaceC39666FhW2.LIZ(-12);
            }
        } catch (Exception unused2) {
            this.LJLILLLLZI.LIZ(-11);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
