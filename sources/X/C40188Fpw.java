package X;

import java.util.Map;

/* renamed from: X.Fpw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40188Fpw {
    public final C40184Fps LIZ;
    public long LIZIZ;
    public boolean LIZJ;

    public final void LIZIZ() {
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStayStart info:");
        LIZ.append(this.LIZ);
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, null, 6);
        this.LIZIZ = System.currentTimeMillis();
    }

    public final void LIZ() {
        int i;
        String str;
        long currentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStayEnd info:");
        LIZ.append(this.LIZ);
        LIZ.append(", duration:");
        LIZ.append(currentTimeMillis);
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, null, 6);
        EnumC39924Flg enumC39924Flg = this.LIZ.LIZLLL;
        if (enumC39924Flg == null) {
            i = -1;
        } else {
            i = C40189Fpx.LIZ[enumC39924Flg.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "lynx";
            }
        } else {
            str = "h5";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", str);
        c188727au.LJIIIZ("project_name", this.LIZ.LIZ);
        c188727au.LJIIIZ("enter_from", this.LIZ.LIZIZ);
        c188727au.LJ(currentTimeMillis, "duration");
        c188727au.LIZLLL(1, "fe_flag");
        if (!this.LIZ.LIZJ.isEmpty()) {
            for (Map.Entry<String, Object> entry : this.LIZ.LIZJ.entrySet()) {
                c188727au.LJFF(entry.getValue(), entry.getKey());
            }
        }
        FMX.LJIIL("stay_time", c188727au.LIZ);
    }

    public C40188Fpw(C40184Fps c40184Fps) {
        this.LIZ = c40184Fps;
    }
}
