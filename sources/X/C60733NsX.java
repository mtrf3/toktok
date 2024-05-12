package X;

import com.lynx.tasm.TemplateBundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.NsX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60733NsX extends AbstractC65781Prl implements InterfaceC88472Yns<O26, C76800UCe> {
    public final /* synthetic */ C60726NsQ LJLIL;
    public final /* synthetic */ C68322mC LJLILLLLZI;
    public final /* synthetic */ O1M LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60733NsX(C60726NsQ c60726NsQ, C68322mC c68322mC, O1M o1m, long j, String str) {
        super(1);
        this.LJLIL = c60726NsQ;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = o1m;
        this.LJLJJI = j;
        this.LJLJJL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.concurrent.atomic.AtomicBoolean] */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(O26 o26) {
        C36581c6 c36581c6;
        boolean z;
        boolean z2;
        String str;
        TemplateBundle templateBundle;
        C60735NsZ c60735NsZ;
        O26 it = o26;
        o.LJIIJ(it, "it");
        C60606NqU c60606NqU = this.LJLIL.LJLJI;
        if (c60606NqU != null && (c60735NsZ = c60606NqU.LJII) != null) {
            c60735NsZ.LJII(it);
        }
        C60728NsS c60728NsS = this.LJLIL.LJLJLJ;
        if (c60728NsS != null) {
            c60728NsS.LIZ = Boolean.valueOf(it.LJIIJ);
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = new AtomicBoolean(false);
        C34K c34k = new C34K();
        c34k.element = false;
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = System.currentTimeMillis();
        this.LJLIL.LJLJL = new C10H();
        CallableC60732NsW callableC60732NsW = new CallableC60732NsW(this, it, c68322mC, c68322mC2, countDownLatch, c34k, c72242sW);
        ExecutorService executorService = C10K.LJI;
        C10H c10h = this.LJLIL.LJLJL;
        if (c10h != null) {
            c36581c6 = c10h.LIZIZ();
        } else {
            c36581c6 = null;
        }
        C10K.LIZIZ(callableC60732NsW, executorService, c36581c6);
        try {
            boolean await = countDownLatch.await(4L, TimeUnit.SECONDS);
            if (!await) {
                z = true;
            } else {
                z = false;
            }
            c34k.element = z;
            AtomicBoolean atomicBoolean = (AtomicBoolean) c68322mC2.element;
            if (!await) {
                z2 = true;
            } else {
                z2 = false;
            }
            atomicBoolean.set(z2);
            if (c68322mC.element == 0) {
                C39048FUe.LIZIZ(C39048FUe.LIZIZ, "data cannot be null", null, null, 6);
                C60726NsQ c60726NsQ = this.LJLIL;
                AbstractC60673NrZ abstractC60673NrZ = c60726NsQ.LJLJJL;
                if (abstractC60673NrZ != null) {
                    String str2 = this.LJLJJL;
                    C60704Ns4 c60704Ns4 = new C60704Ns4();
                    c60704Ns4.LIZ = 204;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("ResoureLoader template load data null, syncBreak = ");
                    LIZ.append(((AtomicBoolean) c68322mC2.element).get());
                    c60704Ns4.LIZIZ = X1D.LIZIZ(LIZ);
                    abstractC60673NrZ.LJJJJIZL(c60726NsQ, str2, c60704Ns4);
                }
                C60726NsQ c60726NsQ2 = this.LJLIL;
                AbstractC60673NrZ abstractC60673NrZ2 = c60726NsQ2.LJLJJL;
                if (abstractC60673NrZ2 != null) {
                    abstractC60673NrZ2.LJJJJJ(c60726NsQ2);
                }
            } else {
                C60606NqU c60606NqU2 = this.LJLIL.LJLJI;
                if (c60606NqU2 != null && c60606NqU2.LJIJJLI) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C60726NsQ c60726NsQ3 = this.LJLIL;
                    byte[] bArr = (byte[]) c68322mC.element;
                    if (bArr != null) {
                        c60726NsQ3.LJIILL(bArr);
                        FD5.LJII("hybrid_log_report", C113554cx.LJJL(new OSZ(WM7.SCENE_SERVICE, "extra_info"), new OSZ("duration", C44847Hit.LIZ(currentTimeMillis))));
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                C60606NqU c60606NqU3 = this.LJLIL.LJLJI;
                if (c60606NqU3 != null && c60606NqU3.LJIJI && c60606NqU3.LJIILLIIL) {
                    if (c60606NqU3.LJJIIZ == null) {
                        c60606NqU3.LJJIIZ = TemplateBundle.LIZ((byte[]) c68322mC.element);
                        C60606NqU c60606NqU4 = this.LJLIL.LJLJI;
                    }
                    C60726NsQ c60726NsQ4 = this.LJLIL;
                    C60606NqU c60606NqU5 = c60726NsQ4.LJLJI;
                    if (c60606NqU5 != null && (templateBundle = c60606NqU5.LJJIIZ) != null) {
                        templateBundle.LIZJ(K1O.LIZ(c60726NsQ4.getHybridContext(), this.LJLJJL));
                    }
                    C39048FUe.LIZIZ(C39048FUe.LIZIZ, "enable pre code cache", null, "PreCodeCache", 2);
                    FD5.LJIIIZ(this.LJLIL.getHybridContext().containerId, "lynx_precodecache", "use", null, this.LJLJJL, this.LJLIL.getHybridContext().bid, null, null, 200);
                }
                C60728NsS c60728NsS2 = this.LJLIL.LJLJLJ;
                if (c60728NsS2 != null) {
                    c60728NsS2.LJIIJJI = Long.valueOf(System.currentTimeMillis() - this.LJLJJI);
                }
                if (C60726NsQ.LJZL) {
                    str = (String) this.LJLILLLLZI.element;
                    if (str.length() == 0) {
                        if (C96Q.LIZ(this.LJLJI.LJFF) && C96Q.LIZ(this.LJLJI.LJI)) {
                            str = "lynxview://" + this.LJLJI.LJFF + '/' + this.LJLJI.LJI;
                        } else {
                            str = this.LJLJJL;
                        }
                    }
                } else {
                    if (it.LJIIIZ == O29.CDN) {
                        C39836FkG.LJII.getClass();
                        if (C38262Ezy.LIZ().LIZ) {
                            str = (String) this.LJLILLLLZI.element;
                        }
                    }
                    str = it.LJII;
                }
                C60726NsQ c60726NsQ5 = this.LJLIL;
                byte[] bArr2 = (byte[]) c68322mC.element;
                if (bArr2 != null) {
                    c60726NsQ5.LJIILIIL(str, bArr2);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            FD5.LIZJ(System.currentTimeMillis(), this.LJLIL.getHybridContext().containerId, "prepare_template_end");
            this.LJLIL.getHybridContext().LIZIZ(C60728NsS.class);
        } catch (Throwable unused) {
            ((AtomicBoolean) c68322mC2.element).set(true);
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ResourceLoader load ");
            C39048FUe.LIZIZ(c39048FUe, JBR.LJFF(LIZ2, this.LJLJJL, " more than 4s, use async mode", LIZ2), null, null, 6);
        }
        return C76800UCe.LIZ;
    }
}
