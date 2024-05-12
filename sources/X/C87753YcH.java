package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YcH, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87753YcH implements InterfaceC44926HkA {
    public final /* synthetic */ C87764YcS LIZ;

    @Override // X.InterfaceC44926HkA
    public final void onCancel() {
        P8N.LIZIZ(this.LIZ.LJII);
        C87764YcS c87764YcS = this.LIZ;
        c87764YcS.LIZ(c87764YcS.LJII);
    }

    @Override // X.InterfaceC44926HkA
    public final void onSuccess() {
        this.LIZ.LJ().LJLJJL = false;
        C87764YcS c87764YcS = this.LIZ;
        c87764YcS.LIZJ(c87764YcS.LJII, "");
    }

    public C87753YcH(C87764YcS c87764YcS) {
        this.LIZ = c87764YcS;
    }

    @Override // X.InterfaceC44926HkA
    public final void onError(int i) {
        this.LIZ.LJ().LJLJJL = false;
        this.LIZ.LJ().LJLJLJ = i;
        P8N.LIZIZ(this.LIZ.LJII);
        C87764YcS c87764YcS = this.LIZ;
        String str = c87764YcS.LJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error code: ");
        LIZ.append(i);
        c87764YcS.LIZIZ(i, str, X1D.LIZIZ(LIZ), "");
    }

    @Override // X.InterfaceC44926HkA
    public final void onProgress(int i) {
        YXQ yxq = this.LIZ.LIZLLL;
        if (yxq != null) {
            int LIZ = yxq.LIZ(YXO.WATER_TYPE, i);
            InterfaceC87766YcU interfaceC87766YcU = this.LIZ.LJI.LJ;
            if (interfaceC87766YcU != null) {
                interfaceC87766YcU.LIZIZ();
            }
            this.LIZ.LJI().updateProgress(LIZ);
            this.LIZ.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("progress: ");
            LIZ2.append(LIZ);
            C62737Ojl.LIZJ("WaterMarkAbility", X1D.LIZIZ(LIZ2));
            return;
        }
        o.LJIJI("loadingProgressWrapper");
        throw null;
    }
}
