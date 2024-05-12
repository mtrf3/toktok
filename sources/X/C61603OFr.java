package X;

import Y.ACallableS7S1101000_1;
import com.ss.android.ugc.aweme.brdatagift.api.BaseBemobiResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.OFr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61603OFr<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C61608OFw LIZIZ;
    public final /* synthetic */ InterfaceC61605OFt LIZJ;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        int i = ((C61604OFs) c10k.LJIIJJI()).LIZ;
        BaseBemobiResponse baseBemobiResponse = ((C61604OFs) c10k.LJIIJJI()).LIZIZ;
        Exception exc = ((C61604OFs) c10k.LJIIJJI()).LIZJ;
        String url = this.LIZ;
        o.LJIIIZ(url, "url");
        C10K.LIZIZ(new ACallableS7S1101000_1(i, url, exc, 2), C10K.LJI, null);
        this.LIZIZ.LIZIZ = false;
        if (i != 200) {
            if (i != 203) {
                InterfaceC61605OFt interfaceC61605OFt = this.LIZJ;
                if (exc == null) {
                    exc = new Exception("unknown");
                }
                interfaceC61605OFt.onFailed(exc);
            } else {
                this.LIZJ.LIZIZ(baseBemobiResponse);
            }
        } else {
            this.LIZJ.LIZ(baseBemobiResponse);
        }
        return C76800UCe.LIZ;
    }

    public C61603OFr(String str, long j) {
        C61608OFw c61608OFw = C61608OFw.LIZLLL;
        C61600OFo c61600OFo = C61601OFp.LJ;
        this.LIZ = str;
        this.LIZIZ = c61608OFw;
        this.LIZJ = c61600OFo;
    }
}
