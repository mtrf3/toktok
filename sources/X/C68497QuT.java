package X;

import com.bytedance.sync.v2.presistence.AppDatabase;

/* renamed from: X.QuT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68497QuT extends C1CG<QVB> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR REPLACE INTO `t_business`(`id`,`consume_type`,`bucket`) VALUES (?,?,?)";
    }

    public C68497QuT(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, QVB qvb) {
        QVB qvb2 = qvb;
        interfaceC37591dj.LJIIIZ(1, qvb2.LIZ);
        interfaceC37591dj.LJIIIZ(2, qvb2.LIZIZ.getValue());
        interfaceC37591dj.LJIIIZ(3, UC0.LJIIIZ(qvb2.LIZJ));
    }
}
