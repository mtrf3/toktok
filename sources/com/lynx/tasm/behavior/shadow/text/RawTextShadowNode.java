package com.lynx.tasm.behavior.shadow.text;

import X.C38391F4x;
import X.F5B;
import X.JBR;
import X.VPD;
import X.X1D;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import java.text.DecimalFormat;

/* loaded from: classes15.dex */
public class RawTextShadowNode extends ShadowNode {
    public String LJIJI;
    public boolean LJIJJ;

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean LJIIZILJ() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        String str = this.LJIIIZ;
        if (str != null) {
            LIZ.append(str);
            LIZ.append(" [text: ");
            return JBR.LJFF(LIZ, this.LJIJI, "]", LIZ);
        }
        throw new AssertionError();
    }

    public static String LJJIII(double d) {
        if (d < 9.223372036854776E18d && d > -9.223372036854776E18d) {
            long floor = (long) Math.floor(d);
            if (d == floor) {
                return String.valueOf(floor);
            }
        }
        return new DecimalFormat("###################.###########").format(d);
    }

    @VPD(name = "pseudo")
    public void setPsuedo(boolean z) {
        this.LJIJJ = z;
    }

    @VPD(name = "text")
    public void setText(F5B f5b) {
        if (f5b == null) {
            return;
        }
        switch (C38391F4x.LIZ[f5b.getType().ordinal()]) {
            case 1:
                this.LJIJI = f5b.asString();
                break;
            case 2:
                this.LJIJI = String.valueOf(f5b.asInt());
                break;
            case 3:
                this.LJIJI = String.valueOf(f5b.asLong());
                break;
            case 4:
                this.LJIJI = LJJIII(f5b.asDouble());
                break;
            case 5:
                this.LJIJI = String.valueOf(f5b.asBoolean());
                break;
            case 6:
                this.LJIJI = null;
                break;
        }
        LJIIIIZZ();
    }
}
