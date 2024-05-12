package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IN1 {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public float LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public float LJIIZILJ = 0.015625f;
    public float LJIJ = 4.0f;
    public float LJIJI = 0.2f;
    public float LJIJJ = -1.0f;

    public final void LIZIZ() {
        this.LIZ = -1;
        this.LJIIIZ = -1;
        this.LIZIZ = 0;
        this.LIZJ = 1;
        this.LIZLLL = 1;
        this.LJIIJ = -1;
        this.LJFF = 0;
        this.LJI = 3;
        this.LJII = 1;
        this.LJIIJJI = 1;
        this.LJIIL = 1;
        this.LJIILIIL = 1.0f;
        this.LJIIIIZZ = 0;
        this.LJIILJJIL = 1;
        this.LJIILL = 1;
        this.LJIIZILJ = 0.015625f;
        this.LJIILLIIL = 0;
        this.LJIJ = 4.0f;
        this.LJIJI = 0.2f;
        this.LJIJJ = -1.0f;
    }

    public IN1() {
        LIZIZ();
    }

    public final String toString() {
        EnumC46505IMz enumC46505IMz;
        IN2 in2;
        IN3 in3;
        EnumC46504IMy enumC46504IMy;
        IN0 in0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VRParameter {Dimensional = ");
        int i = this.LIZIZ;
        if (i != 0) {
            if (i != 1 && i != 2) {
                enumC46505IMz = EnumC46505IMz.UNKNOWN;
            } else {
                enumC46505IMz = EnumC46505IMz.THREE_DIMENSIONAL;
            }
        } else {
            enumC46505IMz = EnumC46505IMz.TWO_DIMENSIONAL;
        }
        LIZ.append(enumC46505IMz);
        LIZ.append(", ViewingAngle = ");
        int i2 = this.LIZJ;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    in2 = IN2.UNKNOWN;
                } else {
                    in2 = IN2.VIEWING_ANGLE_90;
                }
            } else {
                in2 = IN2.VIEWING_ANGLE_360;
            }
        } else {
            in2 = IN2.VIEWING_ANGLE_180;
        }
        LIZ.append(in2);
        LIZ.append(", Layout = ");
        int i3 = this.LIZIZ;
        if (i3 != 1) {
            if (i3 != 2) {
                in3 = IN3.UNKNOWN;
            } else {
                in3 = IN3.VERTICAL;
            }
        } else {
            in3 = IN3.HORIZONTAL;
        }
        LIZ.append(in3);
        LIZ.append(", DOF = ");
        int i4 = this.LJ;
        if (i4 != 0) {
            if (i4 != 1) {
                enumC46504IMy = EnumC46504IMy.UNKNOWN;
            } else {
                enumC46504IMy = EnumC46504IMy.SIX_DOF;
            }
        } else {
            enumC46504IMy = EnumC46504IMy.THREE_DOF;
        }
        LIZ.append(enumC46504IMy);
        LIZ.append(", ProjectionModel = ");
        int i5 = this.LJIIIIZZ;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        in0 = IN0.UNKNOWN;
                    } else {
                        in0 = IN0.MESH;
                    }
                } else {
                    in0 = IN0.CMP;
                }
            } else {
                in0 = IN0.EAC;
            }
        } else {
            in0 = IN0.ERP;
        }
        LIZ.append(in0);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(String str) {
        int i;
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("VR")) {
                if (this.LIZ == -1) {
                    this.LIZ = 1;
                }
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("VR"));
                this.LJFF = jSONObject2.optInt("ScopicType");
                this.LIZIZ = jSONObject2.optInt("ContentType");
                this.LIZJ = jSONObject2.optInt("FOV");
                if (jSONObject2.has("CMPFaceInnerPadding")) {
                    this.LJIIZILJ = (float) JSONObjectProtectorUtils.getDouble(jSONObject2, "CMPFaceInnerPadding");
                }
                if (this.LJIIIZ == -1) {
                    if (jSONObject2.has("BackgroundStickerEnable")) {
                        this.LJIIIZ = jSONObject2.optInt("BackgroundStickerEnable");
                    } else {
                        this.LJIIIZ = 0;
                    }
                }
                if (jSONObject2.has("DesireFov")) {
                    this.LIZLLL = jSONObject2.optInt("DesireFov");
                } else if (this.LJIIIZ == 1) {
                    this.LIZLLL = 1;
                } else {
                    this.LIZLLL = this.LIZJ;
                }
                if (this.LJIIJ == -1) {
                    if (jSONObject2.has("BackgroundTexSize")) {
                        this.LJIIJ = jSONObject2.optInt("BackgroundTexSize");
                    } else {
                        this.LJIIJ = 0;
                    }
                }
                if (jSONObject2.has("DOF")) {
                    this.LJ = jSONObject2.optInt("DOF");
                }
                if (jSONObject2.has("EnableTile")) {
                    jSONObject2.optInt("EnableTile");
                }
                if (jSONObject2.has("ProjectionModel")) {
                    this.LJIIIIZZ = jSONObject2.optInt("ProjectionModel");
                }
                if (jSONObject2.has("SensorEnableSmoother")) {
                    this.LJIIL = jSONObject2.optInt("SensorEnableSmoother");
                }
                if (jSONObject2.has("SensorSmoothFactor")) {
                    this.LJIILIIL = (float) jSONObject2.optDouble("SensorSmoothFactor");
                }
                if (jSONObject2.has("VsyncFps")) {
                    this.LJIJJ = (float) jSONObject2.optDouble("VsyncFps");
                    return;
                }
                return;
            }
            if (this.LIZ == -1) {
                i = 0;
                this.LIZ = 0;
            } else {
                i = 0;
            }
            if (this.LJIIIZ == -1) {
                this.LJIIIZ = i;
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
