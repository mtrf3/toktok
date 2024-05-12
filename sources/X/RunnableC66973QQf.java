package X;

import android.util.Pair;
import com.bytedance.push.PushBody;
import java.util.ArrayList;

/* renamed from: X.QQf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66973QQf implements Runnable {
    public final PushBody LJLIL;
    public final int LJLILLLLZI;

    public final void LIZ() {
        String str;
        String secUid;
        QRM qrm = QRM.LJIIIIZZ;
        InterfaceC66999QRf interfaceC66999QRf = qrm.LIZIZ.LJIJJ;
        String str2 = this.LJLIL.targetSecUid;
        C66977QQj LIZIZ = C66975QQh.LIZIZ(this.LJLILLLLZI, QM0.LIZ);
        String str3 = "";
        if (LIZIZ == null) {
            str = "";
        } else {
            str = LIZIZ.LIZLLL;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("token info = ");
        LIZ.append(LIZIZ);
        X1D.LIZIZ(LIZ);
        if (interfaceC66999QRf != null && (secUid = interfaceC66999QRf.getSecUid()) != null) {
            str3 = secUid;
        }
        String LJFF = C73312Spw.LJFF("/cloudpush/user_push_replace/");
        C36929EeT.LIZIZ(LJFF, qrm.LIZ());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("ttpush_sec_target_uid", str2));
        arrayList.add(new Pair("local_sec_uid", str3));
        arrayList.add(new Pair("send_sdk", String.valueOf(this.LJLILLLLZI)));
        arrayList.add(new Pair("token", str));
        arrayList.add(new Pair("rid64", String.valueOf(this.LJLIL.rid64)));
        try {
            String LIZJ = AbstractC66805QJt.LIZ.LIZJ(LJFF, arrayList);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("upload filter event. result = ");
            LIZ2.append(LIZJ);
            X1D.LIZIZ(LIZ2);
        } catch (Throwable th) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("upload filter event. result = ");
            LIZ3.append(th);
            X1D.LIZIZ(LIZ3);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC66973QQf(int i, PushBody pushBody) {
        this.LJLILLLLZI = i;
        this.LJLIL = pushBody;
    }
}
