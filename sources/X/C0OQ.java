package X;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: X.0OQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OQ {
    public final Shader LIZ;
    public final ColorStateList LIZIZ;
    public int LIZJ;

    public final boolean LIZIZ() {
        ColorStateList colorStateList;
        if (this.LIZ == null && (colorStateList = this.LIZIZ) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public C0OQ(Shader shader, ColorStateList colorStateList, int i) {
        this.LIZ = shader;
        this.LIZIZ = colorStateList;
        this.LIZJ = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0175, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0OQ LIZ(android.content.res.Resources r24, int r25, android.content.res.Resources.Theme r26) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OQ.LIZ(android.content.res.Resources, int, android.content.res.Resources$Theme):X.0OQ");
    }
}
