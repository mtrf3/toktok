package X;

import org.json.JSONObject;

/* renamed from: X.Ncj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59753Ncj {
    public final C60014Ngw LIZ;

    public C59753Ncj(C60014Ngw c60014Ngw) {
        this.LIZ = c60014Ngw;
    }

    public static C59753Ncj LIZIZ(NQR nqr) {
        C60014Ngw c60014Ngw = (C60014Ngw) nqr;
        C38891fp.LJFF(nqr, "AdSession is null");
        NRJ nrj = c60014Ngw.LIZIZ;
        nrj.getClass();
        if (NRK.NATIVE == nrj.LIZIZ) {
            if (!c60014Ngw.LJFF) {
                C38891fp.LJII(c60014Ngw);
                AbstractC60015Ngx abstractC60015Ngx = c60014Ngw.LJ;
                if (abstractC60015Ngx.LIZJ == null) {
                    C59753Ncj c59753Ncj = new C59753Ncj(c60014Ngw);
                    abstractC60015Ngx.LIZJ = c59753Ncj;
                    return c59753Ncj;
                }
                throw new IllegalStateException("MediaEvents already exists for AdSession");
            }
            throw new IllegalStateException("AdSession is started");
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    public final void LIZ(C99J c99j) {
        C38891fp.LJFF(c99j, "InteractionType is null");
        C38891fp.LJIIIIZZ(this.LIZ);
        JSONObject jSONObject = new JSONObject();
        C60031NhD.LIZJ(jSONObject, "interactionType", c99j);
        AbstractC60015Ngx abstractC60015Ngx = this.LIZ.LJ;
        abstractC60015Ngx.getClass();
        C37137Ehp.LIZIZ(abstractC60015Ngx.LJFF(), "publishMediaEvent", "adUserInteraction", jSONObject);
    }

    public final void LIZJ(float f, float f2) {
        if (f > 0.0f) {
            if (f2 >= 0.0f && f2 <= 1.0f) {
                C38891fp.LJIIIIZZ(this.LIZ);
                JSONObject jSONObject = new JSONObject();
                C60031NhD.LIZJ(jSONObject, "duration", Float.valueOf(f));
                C60031NhD.LIZJ(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
                C60031NhD.LIZJ(jSONObject, "deviceVolume", Float.valueOf(C59998Ngg.LIZ().LIZ));
                AbstractC60015Ngx abstractC60015Ngx = this.LIZ.LJ;
                abstractC60015Ngx.getClass();
                C37137Ehp.LIZIZ(abstractC60015Ngx.LJFF(), "publishMediaEvent", "start", jSONObject);
                return;
            }
            throw new IllegalArgumentException("Invalid Media volume");
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }
}
