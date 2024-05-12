package X;

import android.content.Context;
import com.ss.android.ugc.aweme.friendstab.db.AwemeRecordDatabase;
import kotlin.jvm.internal.o;

/* renamed from: X.R2c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68894R2c extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC54862Lg2> {
    public static final C68894R2c LJLIL = new C68894R2c();

    public C68894R2c() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC54862Lg2 invoke() {
        Context LIZIZ = EF7.LIZIZ();
        if (AwemeRecordDatabase.LJIIL == null) {
            synchronized (C65352Pkq.LIZ(AwemeRecordDatabase.class)) {
                if (AwemeRecordDatabase.LJIIL == null) {
                    C0BW LIZ = C0BV.LIZ(C16880lQ.LLLLL(LIZIZ), AwemeRecordDatabase.class, "aweme_record");
                    LIZ.LIZJ();
                    LIZ.LIZ(AwemeRecordDatabase.LJIILIIL);
                    AwemeRecordDatabase.LJIIL = (AwemeRecordDatabase) LIZ.LIZIZ();
                }
            }
        }
        AwemeRecordDatabase awemeRecordDatabase = AwemeRecordDatabase.LJIIL;
        o.LJI(awemeRecordDatabase);
        return awemeRecordDatabase.LJIJ();
    }
}
