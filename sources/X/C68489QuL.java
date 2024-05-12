package X;

import com.bytedance.sync.v2.presistence.AppDatabase;

/* renamed from: X.QuL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68489QuL extends C1CG<QV2> {
    @Override // X.C0BI
    public final String LIZIZ() {
        return "INSERT OR REPLACE INTO `t_synclog`(`sync_id`,`did`,`uid`,`sync_cursor`,`data`,`md5`,`business`,`consume_type`,`data_type`,`publish_ts`,`receive_ts`,`bucket`,`req_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public C68489QuL(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // X.C1CG
    public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, QV2 qv2) {
        int value;
        QV2 qv22 = qv2;
        String str = qv22.LIZ;
        if (str == null) {
            interfaceC37591dj.LLLLLLJ(1);
        } else {
            interfaceC37591dj.LJJII(1, str);
        }
        String str2 = qv22.LIZIZ;
        if (str2 == null) {
            interfaceC37591dj.LLLLLLJ(2);
        } else {
            interfaceC37591dj.LJJII(2, str2);
        }
        String str3 = qv22.LIZJ;
        if (str3 == null) {
            interfaceC37591dj.LLLLLLJ(3);
        } else {
            interfaceC37591dj.LJJII(3, str3);
        }
        interfaceC37591dj.LJIIIZ(4, qv22.LIZLLL);
        byte[] bArr = qv22.LJ;
        if (bArr == null) {
            interfaceC37591dj.LLLLLLJ(5);
        } else {
            interfaceC37591dj.LJJIIZ(5, bArr);
        }
        String str4 = qv22.LJFF;
        if (str4 == null) {
            interfaceC37591dj.LLLLLLJ(6);
        } else {
            interfaceC37591dj.LJJII(6, str4);
        }
        interfaceC37591dj.LJIIIZ(7, qv22.LJI);
        interfaceC37591dj.LJIIIZ(8, qv22.LJII.getValue());
        QV1 qv1 = qv22.LJIIIIZZ;
        if (qv1 == null) {
            value = QV1.ORIGIN.getValue();
        } else {
            value = qv1.getValue();
        }
        interfaceC37591dj.LJIIIZ(9, value);
        interfaceC37591dj.LJIIIZ(10, qv22.LJIIIZ);
        interfaceC37591dj.LJIIIZ(11, qv22.LJIIJ);
        interfaceC37591dj.LJIIIZ(12, UC0.LJIIIZ(qv22.LJIIJJI));
        String str5 = qv22.LJIIL;
        if (str5 == null) {
            interfaceC37591dj.LLLLLLJ(13);
        } else {
            interfaceC37591dj.LJJII(13, str5);
        }
    }
}
