package X;

import com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo;

/* renamed from: X.WrB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83581WrB implements InterfaceC83327Wn5 {
    public final /* synthetic */ InterfaceC83588WrI LIZ;

    public C83581WrB(C83582WrC c83582WrC) {
        this.LIZ = c83582WrC;
    }

    @Override // X.InterfaceC83327Wn5
    public final void LIZ(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
        boolean z;
        InterfaceC83588WrI interfaceC83588WrI = this.LIZ;
        if (aSSimpleFaceInfoArr != null && aSSimpleFaceInfoArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        interfaceC83588WrI.LIZ(z);
    }
}
