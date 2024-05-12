package X;

import com.bytedance.sync.v2.presistence.AppDatabase;

/* renamed from: X.QuN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68491QuN extends C1CG<QV5> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR ABORT INTO `t_report_synclog`(`id`,`sync_id`,`business`,`did`,`uid`,`bucket`,`cursor`,`data`,`md5`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
    }

    public C68491QuN(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, QV5 qv5) {
        QV5 qv52 = qv5;
        interfaceC37591dj.LJIIIZ(1, qv52.LIZ);
        String str = qv52.LIZIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(2);
        } else {
            interfaceC37591dj.LJJII(2, str);
        }
        interfaceC37591dj.LJIIIZ(3, qv52.LIZJ);
        String str2 = qv52.LIZLLL;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(4);
        } else {
            interfaceC37591dj.LJJII(4, str2);
        }
        String str3 = qv52.LJ;
        if (str3 == null) {
            interfaceC37591dj.LLLLLLJ(5);
        } else {
            interfaceC37591dj.LJJII(5, str3);
        }
        interfaceC37591dj.LJIIIZ(6, UC0.LJIIIZ(qv52.LJFF));
        interfaceC37591dj.LJIIIZ(7, qv52.LJI);
        byte[] bArr = qv52.LJII;
        if (bArr == null) {
            interfaceC37591dj.LLLLLLJ(8);
        } else {
            interfaceC37591dj.LJJIIZ(8, bArr);
        }
        String str4 = qv52.LJIIIIZZ;
        if (str4 == null) {
            interfaceC37591dj.LLLLLLJ(9);
        } else {
            interfaceC37591dj.LJJII(9, str4);
        }
    }
}
