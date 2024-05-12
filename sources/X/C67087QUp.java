package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.QUp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67087QUp implements Handler.Callback {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJJL;
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C67040QSu LJLJI;
    public final QUA LJLJJI;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C67087QUp.class), "mFileDataCache", "getMFileDataCache()Lcom/bytedance/sync/interfaze/IFileDataCacheService;");
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(C67087QUp.class), "mHandler", "getMHandler()Landroid/os/Handler;")};
    }

    public final Handler LIZIZ() {
        return (Handler) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x022c  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r26) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67087QUp.handleMessage(android.os.Message):boolean");
    }

    public C67087QUp(C67040QSu configuration, QUA qua) {
        o.LJIIJ(configuration, "configuration");
        this.LJLJI = configuration;
        this.LJLJJI = qua;
        this.LJLIL = C221108m2.LIZIZ(C67084QUm.LJLIL);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS161S0100000_11(this, 0));
    }

    public final int LIZ(long j, List<? extends QV2> list) {
        Object[] objArr = null;
        try {
            boolean z = false;
            ExecutorService CALLBACK_EXECUTORS = (ExecutorService) C67092QUu.LIZIZ.getValue();
            o.LJFF(CALLBACK_EXECUTORS, "CALLBACK_EXECUTORS");
            QU8 qu8 = (QU8) ((ConcurrentHashMap) this.LJLJJI.LJLILLLLZI).get(Long.valueOf(j));
            if (qu8 == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("business not register,ignore it. business = ");
                LIZ.append(j);
                C66629QCz.LIZJ(X1D.LIZIZ(LIZ));
                return -1;
            }
            synchronized (qu8.LIZJ) {
                if (((ArrayList) qu8.LIZJ).size() > 0) {
                    objArr = ((ArrayList) qu8.LIZJ).toArray();
                }
            }
            if (objArr == null || objArr.length == 0) {
                C66629QCz.LIZ("listener is empty ,ignore it. business = " + j);
                return -1;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<? extends QV2> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    QV2 next = it.next();
                    C67074QUc c67074QUc = new C67074QUc();
                    QV1 qv1 = next.LJIIIIZZ;
                    QV1 qv12 = QV1.FILE_PATH;
                    if (qv1 == qv12) {
                        InterfaceC67086QUo interfaceC67086QUo = (InterfaceC67086QUo) this.LJLIL.getValue();
                        String str = next.LIZ;
                        o.LJFF(str, "it.syncId");
                        CastLongProtector.parseLong(str);
                        byte[] bArr = next.LJ;
                        o.LJFF(bArr, "it.data");
                        Charset charset = PVC.LIZ;
                        String LJJJLL = interfaceC67086QUo.LJJJLL(new String(bArr, charset));
                        if (LJJJLL == null) {
                            String str2 = next.LIZ;
                            o.LJFF(str2, "it.syncId");
                            long parseLong = CastLongProtector.parseLong(str2);
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("something is wrong when notify. syncId = ");
                            LIZ2.append(parseLong);
                            LIZ2.append(", errMsg = ");
                            LIZ2.append("deserialization failed when submit syncLog");
                            C66629QCz.LIZIZ(X1D.LIZIZ(LIZ2));
                            break;
                        }
                        byte[] bytes = LJJJLL.getBytes(charset);
                        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                        c67074QUc.LIZ = bytes;
                    } else {
                        c67074QUc.LIZ = next.LJ;
                    }
                    c67074QUc.LIZ = next.LJ;
                    c67074QUc.LIZIZ = next.LIZJ;
                    c67074QUc.LIZLLL = next.LJIIJ;
                    c67074QUc.LIZJ = next.LJIIIZ;
                    c67074QUc.LJ = next.LIZLLL;
                    String str3 = next.LJIIL;
                    if (str3 != null) {
                        char[] cArr = new char[1];
                        cArr[z ? 1 : 0] = ':';
                        ORZ.LLFF(s.LJLJJI(str3, cArr, z, 6));
                    }
                    InterfaceC67090QUs interfaceC67090QUs = (InterfaceC67090QUs) QPG.LIZ(InterfaceC67090QUs.class);
                    QV2[] qv2Arr = new QV2[1];
                    qv2Arr[z ? 1 : 0] = next;
                    if (interfaceC67090QUs.LJJIFFI(C47261Igj.LJII(qv2Arr))) {
                        if (next.LJIIIIZZ == qv12) {
                            InterfaceC67086QUo interfaceC67086QUo2 = (InterfaceC67086QUo) this.LJLIL.getValue();
                            byte[] bArr2 = next.LJ;
                            o.LJFF(bArr2, "obj.data");
                            interfaceC67086QUo2.LJJJJLI(new String(bArr2, PVC.LIZ));
                        }
                        CALLBACK_EXECUTORS.submit(new RunnableC67073QUb(this, next.LJI, c67074QUc, 1, objArr));
                        arrayList.add(next);
                        z = false;
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("delete syncLog failed, not notify, syncId = ");
                        LIZ3.append(next.LIZ);
                        LIZ3.append(", cursor = ");
                        LIZ3.append(next.LIZLLL);
                        C66629QCz.LIZIZ(X1D.LIZIZ(LIZ3));
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            ((InterfaceC67096QUy) QPG.LIZ(InterfaceC67096QUy.class)).LJJJJIZL(arrayList);
            if (!z) {
                return -1;
            }
            return arrayList.size();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            QUU.LIZJ().ensureNotReachHere(e, null);
            return -1;
        }
    }

    public final void LIZJ(int i, long j, long j2) {
        LIZIZ().removeMessages(103, Long.valueOf(j));
        Message obtainMessage = LIZIZ().obtainMessage(103, Long.valueOf(j));
        obtainMessage.arg1 = i;
        LIZIZ().sendMessageDelayed(obtainMessage, j2);
    }
}
