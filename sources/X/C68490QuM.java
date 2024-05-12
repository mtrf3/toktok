package X;

import com.bytedance.sync.v2.presistence.AppDatabase;

/* renamed from: X.QuM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68490QuM extends C1CG<C67094QUw> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR REPLACE INTO `t_snapshot`(`sync_id`,`business`,`uid`,`did`,`cursor`,`data`,`notified`,`bucket`,`data_type`,`publish_ts`,`receive_ts`,`consume_type`,`patch_cnt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public C68490QuM(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C67094QUw c67094QUw) {
        int value;
        C67094QUw c67094QUw2 = c67094QUw;
        String str = c67094QUw2.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        interfaceC37591dj.LJIIIZ(2, c67094QUw2.LIZIZ);
        String str2 = c67094QUw2.LIZJ;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(3);
        } else {
            interfaceC37591dj.LJJII(3, str2);
        }
        String str3 = c67094QUw2.LIZLLL;
        if (str3 == null) {
            interfaceC37591dj.LLLLLLJ(4);
        } else {
            interfaceC37591dj.LJJII(4, str3);
        }
        interfaceC37591dj.LJIIIZ(5, c67094QUw2.LJ);
        byte[] bArr = c67094QUw2.LJFF;
        if (bArr == null) {
            interfaceC37591dj.LLLLLLJ(6);
        } else {
            interfaceC37591dj.LJJIIZ(6, bArr);
        }
        interfaceC37591dj.LJIIIZ(7, c67094QUw2.LJI);
        interfaceC37591dj.LJIIIZ(8, UC0.LJIIIZ(c67094QUw2.LJII));
        QV1 qv1 = c67094QUw2.LJIIIIZZ;
        if (qv1 == null) {
            value = QV1.ORIGIN.getValue();
        } else {
            value = qv1.getValue();
        }
        interfaceC37591dj.LJIIIZ(9, value);
        interfaceC37591dj.LJIIIZ(10, c67094QUw2.LJIIIZ);
        interfaceC37591dj.LJIIIZ(11, c67094QUw2.LJIIJ);
        interfaceC37591dj.LJIIIZ(12, c67094QUw2.LJIIJJI.getValue());
        interfaceC37591dj.LJIIIZ(13, c67094QUw2.LJIIL);
    }
}
