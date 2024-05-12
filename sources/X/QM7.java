package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.common.lib.AppLogNewUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.channels.spi.AbstractInterruptibleChannel;

/* loaded from: classes12.dex */
public final class QM7 implements QMF {
    public Object LJLIL;
    public Object LJLILLLLZI;

    public final void LIZLLL() {
        try {
            AppLogNewUtils.LIZJ((String) this.LJLIL, (Bundle) this.LJLILLLLZI);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJ() {
        try {
            ((FileLock) this.LJLILLLLZI).release();
            ((AbstractInterruptibleChannel) this.LJLIL).close();
        } catch (IOException unused) {
        }
    }

    @Override // X.QME
    public final /* bridge */ /* synthetic */ Object a() {
        return new C67555QfH((Context) ((QME) this.LJLIL).a(), (C67554QfG) ((QME) this.LJLILLLLZI).a());
    }

    public /* synthetic */ QM7() {
    }

    public static QM7 LIZ(Context context) {
        try {
            FileChannel channel = new RandomAccessFile(new File(C16880lQ.LLIIJLIL(context), "generatefid.lock"), "rw").getChannel();
            try {
                FileLock lock = channel.lock();
                try {
                    return new QM7(channel, lock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (lock != null) {
                        lock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused2) {
            }
        } catch (IOException | Error | OverlappingFileLockException unused3) {
        }
    }

    public final void LIZJ(String str) {
        this.LJLIL = str;
        LIZIZ("uc_login", "params_for_special");
    }

    public /* synthetic */ QM7(Object obj, Object obj2) {
        this.LJLIL = obj;
        this.LJLILLLLZI = obj2;
    }

    public final void LIZIZ(Object obj, String str) {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new Bundle();
        }
        try {
            ((Bundle) this.LJLILLLLZI).putString(str, obj.toString());
        } catch (Exception unused) {
        }
    }
}
