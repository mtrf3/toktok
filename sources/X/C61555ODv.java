package X;

import com.bytedance.geckox.statistic.model.SyncEventModel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.ODv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61555ODv {
    public C61276O3c LIZ;
    public long LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public final boolean LIZ(int i, int i2, long j) {
        SyncEventModel syncEventModel = new SyncEventModel(this.LIZ);
        syncEventModel.setSyncTaskId(i);
        syncEventModel.setSyncTaskType(i2);
        if (j < this.LIZIZ) {
            syncEventModel.setSyncStatsType(2);
            OD6.LJIIJJI(syncEventModel);
            return true;
        }
        if (!EBC.LIZ.LJII()) {
            syncEventModel.setSyncStatsType(2);
            OD6.LJIIJJI(syncEventModel);
            return true;
        }
        if (!this.LIZJ.get() || this.LIZ == null) {
            syncEventModel.setSyncStatsType(2);
            OD6.LJIIJJI(syncEventModel);
            return true;
        }
        syncEventModel.setSyncStatsType(1);
        OD6.LJIIJJI(syncEventModel);
        return false;
    }
}
