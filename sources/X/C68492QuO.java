package X;

import com.bytedance.sync.v2.presistence.AppDatabase;

/* renamed from: X.QuO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68492QuO extends C1CG<QV9> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR REPLACE INTO `t_sync_cursor`(`sync_id`,`did`,`uid`,`topic_type`,`bucket`,`recv_cursor`,`report_cursor`) VALUES (?,?,?,?,?,?,?)";
    }

    public C68492QuO(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, QV9 qv9) {
        int value;
        QV9 qv92 = qv9;
        String str = qv92.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        String str2 = qv92.LIZIZ;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(2);
        } else {
            interfaceC37591dj.LJJII(2, str2);
        }
        String str3 = qv92.LIZJ;
        if (str3 == null) {
            interfaceC37591dj.LLLLLLJ(3);
        } else {
            interfaceC37591dj.LJJII(3, str3);
        }
        EnumC67115QVr enumC67115QVr = qv92.LIZLLL;
        if (enumC67115QVr == null) {
            value = EnumC67115QVr.SpecTopic.getValue();
        } else {
            value = enumC67115QVr.getValue();
        }
        interfaceC37591dj.LJIIIZ(4, value);
        interfaceC37591dj.LJIIIZ(5, UC0.LJIIIZ(qv92.LJ));
        interfaceC37591dj.LJIIIZ(6, qv92.LJFF);
        interfaceC37591dj.LJIIIZ(7, qv92.LJI);
    }
}
