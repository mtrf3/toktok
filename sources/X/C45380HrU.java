package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import v5.n;

/* renamed from: X.HrU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45380HrU extends QZV {
    public C45380HrU(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
    }

    @Override // X.QZV
    public final C10K<Integer> LJIILL(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        n nVar = new n();
        AVExternalServiceImpl.LIZ().abilityService().processService().muteVideo(str, str2, new C45381HrV(nVar));
        return nVar.LIZ;
    }
}
