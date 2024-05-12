package X;

import com.bytedance.sync.v2.presistence.AppDatabase;

/* renamed from: X.QuW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68500QuW extends C1CF<QV2> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "DELETE FROM `t_synclog` WHERE `sync_id` = ? AND `sync_cursor` = ?";
    }

    public C68500QuW(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // X.C1CF
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, QV2 qv2) {
        QV2 qv22 = qv2;
        String str = qv22.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        interfaceC37591dj.LJIIIZ(2, qv22.LIZLLL);
    }
}
