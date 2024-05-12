package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.NsW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC60732NsW<V> implements Callable<Object> {
    public final /* synthetic */ C60733NsX LJLIL;
    public final /* synthetic */ O26 LJLILLLLZI;
    public final /* synthetic */ C68322mC LJLJI;
    public final /* synthetic */ C68322mC LJLJJI;
    public final /* synthetic */ CountDownLatch LJLJJL;
    public final /* synthetic */ C34K LJLJJLL;
    public final /* synthetic */ C72242sW LJLJL;

    public CallableC60732NsW(C60733NsX c60733NsX, O26 o26, C68322mC c68322mC, C68322mC c68322mC2, CountDownLatch countDownLatch, C34K c34k, C72242sW c72242sW) {
        this.LJLIL = c60733NsX;
        this.LJLILLLLZI = o26;
        this.LJLJI = c68322mC;
        this.LJLJJI = c68322mC2;
        this.LJLJJL = countDownLatch;
        this.LJLJJLL = c34k;
        this.LJLJL = c72242sW;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, byte[]] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2 = "";
        try {
            InputStream LIZJ = this.LJLILLLLZI.LIZJ();
            if (LIZJ != null) {
                C60733NsX c60733NsX = this.LJLIL;
                String str3 = (String) c60733NsX.LJLILLLLZI.element;
                JSONObject jSONObject = c60733NsX.LJLIL.getHybridContext().templateResData;
                O26 o26 = this.LJLILLLLZI;
                C60733NsX c60733NsX2 = this.LJLIL;
                C60905NvJ.LJI(str3, jSONObject, o26, c60733NsX2.LJLJI, c60733NsX2.LJLJJI, false);
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        C62848OlY.LIZIZ(LIZJ, byteArrayOutputStream, FileUtils.BUFFER_SIZE);
                        this.LJLJI.element = byteArrayOutputStream.toByteArray();
                        if (!((AtomicBoolean) this.LJLJJI.element).get()) {
                            this.LJLJJL.countDown();
                        }
                        if (this.LJLJJLL.element) {
                            this.LJLJL.element = System.currentTimeMillis() - this.LJLJL.element;
                            String str4 = this.LJLIL.LJLIL.getHybridContext().containerId;
                            Object obj = this.LJLIL.LJLIL.getHybridContext().runtimeInfo.get((Object) "originUrl");
                            if (obj != null) {
                                str = obj.toString();
                            } else {
                                str = null;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("syncBreak", ((AtomicBoolean) this.LJLJJI.element).get());
                            FD5.LJI("lynx_load_timeout", str4, str, jSONObject2);
                        }
                        AnonymousClass636.LJFF(byteArrayOutputStream, null);
                        AnonymousClass636.LJFF(LIZJ, null);
                        C60728NsS c60728NsS = this.LJLIL.LJLIL.LJLJLJ;
                        if (c60728NsS == null) {
                            return null;
                        }
                        c60728NsS.LJI = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                        return c60728NsS;
                    } finally {
                    }
                } finally {
                }
            } else {
                C60726NsQ c60726NsQ = this.LJLIL.LJLIL;
                String str5 = c60726NsQ.getHybridContext().containerId;
                String str6 = this.LJLIL.LJLIL.getHybridContext().vaid;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = this.LJLIL.LJLIL.getHybridContext().bid;
                if (str7 == null) {
                    str7 = "";
                }
                FD5.LJIIIIZZ(c60726NsQ, str5, new C61659OHv(202, "ResourceLoader stream empty", str6, str7));
                C39048FUe.LIZIZ.LIZ("ResourceLoader stream empty", EnumC39866Fkk.E, "LynxKit");
                C60733NsX c60733NsX3 = this.LJLIL;
                C60726NsQ c60726NsQ2 = c60733NsX3.LJLIL;
                AbstractC60673NrZ abstractC60673NrZ = c60726NsQ2.LJLJJL;
                if (abstractC60673NrZ != null) {
                    String str8 = c60733NsX3.LJLJJL;
                    C60704Ns4 c60704Ns4 = new C60704Ns4();
                    c60704Ns4.LIZ = 202;
                    c60704Ns4.LIZIZ = "ResourceLoader stream empty";
                    abstractC60673NrZ.LJJJJIZL(c60726NsQ2, str8, c60704Ns4);
                }
                this.LJLJJL.countDown();
                return C76800UCe.LIZ;
            }
        } catch (Throwable th) {
            C60726NsQ c60726NsQ3 = this.LJLIL.LJLIL;
            String str9 = c60726NsQ3.getHybridContext().containerId;
            StringBuilder LIZ = X1D.LIZ();
            String LIZJ2 = C03090Af.LIZJ(LIZ, "ResourceLoader stream write error, ", th, LIZ);
            String str10 = this.LJLIL.LJLIL.getHybridContext().vaid;
            if (str10 == null) {
                str10 = "";
            }
            String str11 = this.LJLIL.LJLIL.getHybridContext().bid;
            if (str11 != null) {
                str2 = str11;
            }
            FD5.LJIIIIZZ(c60726NsQ3, str9, new C61659OHv(203, LIZJ2, str10, str2));
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            c39048FUe.LIZ(C03090Af.LIZJ(LIZ2, "ResourceLoader stream write error, ", th, LIZ2), EnumC39866Fkk.E, "LynxKit");
            C60733NsX c60733NsX4 = this.LJLIL;
            C60726NsQ c60726NsQ4 = c60733NsX4.LJLIL;
            AbstractC60673NrZ abstractC60673NrZ2 = c60726NsQ4.LJLJJL;
            if (abstractC60673NrZ2 != null) {
                String str12 = c60733NsX4.LJLJJL;
                C60704Ns4 c60704Ns42 = new C60704Ns4();
                c60704Ns42.LIZ = 203;
                StringBuilder LIZ3 = X1D.LIZ();
                c60704Ns42.LIZIZ = C03090Af.LIZJ(LIZ3, "ResourceLoader stream write error, ", th, LIZ3);
                c60704Ns42.LIZLLL = th.getMessage();
                abstractC60673NrZ2.LJJJJIZL(c60726NsQ4, str12, c60704Ns42);
            }
            this.LJLJJL.countDown();
            return C76800UCe.LIZ;
        }
    }
}
