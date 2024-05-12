package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.UUID;

/* loaded from: classes12.dex */
public final class PB5 extends AbstractRunnableC64070PCo {
    public final /* synthetic */ PBE LJLJJI;

    public final void LIZ() {
        File[] listFiles;
        InterfaceC64004PAa interfaceC64004PAa;
        boolean renameTo;
        this.LJLJJI.getClass();
        File file = new File(O5Y.LJJIIZ(), "child_process_persistent");
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2 != null && file2.exists() && file2.length() > 0) {
                try {
                    if (CastLongProtector.parseLong(file2.getName().split("_")[0]) >= PC5.LJIL()) {
                        continue;
                    } else {
                        FileChannel fileChannel = null;
                        try {
                            try {
                                fileChannel = new RandomAccessFile(file2, "rw").getChannel();
                                FileLock tryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, false);
                                if (tryLock != null && tryLock.isValid()) {
                                    File LJIL = O5Y.LJIL();
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append(System.currentTimeMillis());
                                    LIZ.append("_");
                                    LIZ.append(UUID.randomUUID().toString());
                                    LIZ.append(".log");
                                    File file3 = new File(LJIL, X1D.LIZIZ(LIZ));
                                    String absolutePath = file2.getAbsolutePath();
                                    String absolutePath2 = file3.getAbsolutePath();
                                    File file4 = new File(absolutePath);
                                    File file5 = new File(absolutePath2);
                                    if (!file4.exists()) {
                                        renameTo = false;
                                    } else {
                                        renameTo = file4.renameTo(file5);
                                    }
                                    if (C78248UnM.LJIIJ()) {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append("moveInactiveSubProcessData: src:");
                                        LIZ2.append(file2.getAbsolutePath());
                                        LIZ2.append(" dst:");
                                        LIZ2.append(file3.getAbsolutePath());
                                        LIZ2.append(" isSuccess:");
                                        LIZ2.append(renameTo);
                                        C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ2));
                                    }
                                    tryLock.release();
                                } else if (C78248UnM.LJIIJ()) {
                                    C64028PAy.LIZ("APM-Slardar", "moveInactiveSubProcessData isValid is not true ");
                                }
                            } catch (Throwable unused) {
                                if (C78248UnM.LJIIJ() && (interfaceC64004PAa = C64028PAy.LIZ) != null) {
                                    interfaceC64004PAa.LIZIZ();
                                }
                            }
                        } finally {
                            C78685UuP.LJIIIIZZ(fileChannel);
                        }
                    }
                } catch (Throwable unused2) {
                    continue;
                }
            }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PB5(PBE pbe) {
        super(10000L);
        this.LJLJJI = pbe;
    }
}
