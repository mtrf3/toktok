package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: X.HMh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43939HMh {
    public InterfaceC65784Pro<C76800UCe> LIZ;
    public InterfaceC65784Pro<C76800UCe> LIZIZ;
    public boolean LIZJ;

    public final void LIZ() {
        C43938HMg c43938HMg = new C43938HMg(this);
        if (this.LIZJ) {
            AVExternalServiceImpl.LIZ().asyncService("AbilityService", c43938HMg);
        } else {
            AVExternalServiceImpl.LIZ().asyncServiceWithOutPanel("AbilityService", c43938HMg);
        }
    }
}
