package X;

import com.ss.android.vesdk.VEEditor;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class P5P implements X01 {
    public final /* synthetic */ VEEditor LIZ;

    @Override // X.X01
    public final void LIZ(int i) {
    }

    @Override // X.X01
    public final void LIZLLL(double d) {
    }

    public P5P(VEEditor vEEditor) {
        this.LIZ = vEEditor;
    }

    @Override // X.X01
    public final void LIZIZ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onOpenGLDestroy: ret = ");
        LIZ.append(i);
        P4Q.LIZ("VEEditor", X1D.LIZIZ(LIZ));
    }

    @Override // X.X01
    public final void LJ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onOpenGLCreate: ret = ");
        LIZ.append(i);
        P4Q.LIZ("VEEditor", X1D.LIZIZ(LIZ));
    }

    @Override // X.X01
    public final void LIZJ(double d, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onOpenGLDrawing: tex = ");
        LIZ.append(i);
        LIZ.append(" timeStamp = ");
        LIZ.append(d);
        P4Q.LJI("VEEditor", X1D.LIZIZ(LIZ));
        VEEditor vEEditor = this.LIZ;
        if (!vEEditor.LLILIL) {
            vEEditor.LLILIL = true;
            long currentTimeMillis = System.currentTimeMillis();
            VEEditor vEEditor2 = this.LIZ;
            long j = vEEditor2.LLILII;
            if (j <= 0) {
                j = currentTimeMillis;
            }
            long j2 = vEEditor2.LLIIZ;
            if (j2 <= 0) {
                j2 = vEEditor2.LLIILZL;
            }
            if (j2 == 0 || j2 < vEEditor2.LLIILII) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = ");
                LIZ2.append(this.LIZ.LLIIZ);
                LIZ2.append(", mlFirstSeekTimeMS = ");
                LIZ2.append(this.LIZ.LLIILZL);
                LIZ2.append(", mlInitTimeMS = ");
                LIZ2.append(this.LIZ.LLIILII);
                P4Q.LIZJ("VEEditor", X1D.LIZIZ(LIZ2));
                j2 = this.LIZ.LLIILII;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time_init", j2 - this.LIZ.LLIILII);
                jSONObject.put("time_seek", j - j2);
                jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                jSONObject.put("time_total", currentTimeMillis - this.LIZ.LLIILII);
                jSONObject.put("usage_type", this.LIZ.LJZL);
                c.LIZ("vesdk_event_editor_first_frame_draw", "performance", jSONObject);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("first frame draw cost:");
                LIZ3.append(jSONObject.toString());
                P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ3));
            } catch (JSONException e) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("report first frame json err ");
                LIZ4.append(e);
                P4Q.LIZJ("VEEditor", X1D.LIZIZ(LIZ4));
            }
            C63868P4u.LJ(1, currentTimeMillis - this.LIZ.LLIILII, "te_edit_first_frame_time");
            if (this.LIZ.LJLLILLLL != null) {
                this.LIZ.LJLLILLLL.LIZ();
            }
        }
        VEEditor vEEditor3 = this.LIZ;
        int i2 = vEEditor3.LLIIJI + 1;
        vEEditor3.LLIIJI = i2;
        if (i2 == 30) {
            vEEditor3.LLIIJLIL = System.currentTimeMillis();
            VEEditor vEEditor4 = this.LIZ;
            long j3 = vEEditor4.LLIIL;
            long j4 = vEEditor4.LLIIJLIL;
            if (j3 != j4) {
                vEEditor4.LLIIL = j4;
                vEEditor4.LLIIJI = 0;
            }
        }
    }
}
