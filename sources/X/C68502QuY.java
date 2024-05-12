package X;

import android.content.Context;
import com.ss.android.ugc.localnotify.database.WorkManagerTaskDatabase;

/* renamed from: X.QuY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68502QuY extends AbstractC65781Prl implements InterfaceC65784Pro<WorkManagerTaskDatabase> {
    public static final C68502QuY LJLIL = new C68502QuY();

    public C68502QuY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final WorkManagerTaskDatabase invoke() {
        Context LIZIZ = EF7.LIZIZ();
        WorkManagerTaskDatabase workManagerTaskDatabase = WorkManagerTaskDatabase.LJIIL;
        if (workManagerTaskDatabase == null) {
            synchronized (WorkManagerTaskDatabase.LJIILIIL) {
                workManagerTaskDatabase = WorkManagerTaskDatabase.LJIIL;
                if (workManagerTaskDatabase == null) {
                    workManagerTaskDatabase = (WorkManagerTaskDatabase) C0BV.LIZ(C16880lQ.LLLLL(LIZIZ), WorkManagerTaskDatabase.class, "workmanager_task.db").LIZIZ();
                    WorkManagerTaskDatabase.LJIIL = workManagerTaskDatabase;
                }
            }
        }
        return workManagerTaskDatabase;
    }
}
