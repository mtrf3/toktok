package X;

import com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo;

/* renamed from: X.Wjj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83119Wjj implements InterfaceC83327Wn5 {
    public final /* synthetic */ C83113Wjd LIZ;

    public C83119Wjj(C83113Wjd c83113Wjd) {
        this.LIZ = c83113Wjd;
    }

    @Override // X.InterfaceC83327Wn5
    public final void LIZ(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
        if (aSSimpleFaceInfoArr == null) {
            return;
        }
        this.LIZ.LJJLIIIJJIZ(aSSimpleFaceInfoArr);
        Float invoke = this.LIZ.LJLLI.LJIIJJI.invoke();
        for (ASSimpleFaceInfo aSSimpleFaceInfo : aSSimpleFaceInfoArr) {
            if (aSSimpleFaceInfo != null && invoke != null && aSSimpleFaceInfo.boyProb > invoke.floatValue()) {
                this.LIZ.LJJLIIIIJ(true);
                return;
            }
        }
        this.LIZ.LJJLIIIIJ(false);
    }
}
