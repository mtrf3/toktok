package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.Qkz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67909Qkz implements InterfaceC67745QiL {
    public final /* synthetic */ BasePendingResult LIZ;
    public final /* synthetic */ C67834Qjm LIZIZ;

    public C67909Qkz(C67834Qjm c67834Qjm, AbstractC67748QiO abstractC67748QiO) {
        this.LIZIZ = c67834Qjm;
        this.LIZ = abstractC67748QiO;
    }

    @Override // X.InterfaceC67745QiL
    public final void LIZ(Status status) {
        this.LIZIZ.LIZ.remove(this.LIZ);
    }
}
