package X;

import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.repair.RepairKit;

/* loaded from: classes16.dex */
public class X7Y {
    public long LIZ;
    public final byte[] LIZIZ;

    public final void finalize() {
        long j = this.LIZ;
        if (j != 0) {
            RepairKit.nativeFreeMaster(j);
            this.LIZ = 0L;
        }
        super.finalize();
    }

    public static X7Y LIZ(String str) {
        if (str == null) {
            long nativeMakeMaster = RepairKit.nativeMakeMaster(null);
            if (nativeMakeMaster != 0) {
                return new X7Y(nativeMakeMaster, null);
            }
            throw new SQLiteException("Cannot create MasterInfo.");
        }
        byte[] bArr = new byte[16];
        long nativeLoadMaster = RepairKit.nativeLoadMaster(str, null, null, bArr);
        if (nativeLoadMaster != 0) {
            return new X7Y(nativeLoadMaster, bArr);
        }
        throw new SQLiteException("Cannot create MasterInfo.");
    }

    public X7Y(long j, byte[] bArr) {
        this.LIZ = j;
        this.LIZIZ = bArr;
    }
}
