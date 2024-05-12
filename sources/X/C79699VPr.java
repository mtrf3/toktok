package X;

import com.lynx.react.bridge.ReadableArray;

/* renamed from: X.VPr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79699VPr {
    public EnumC79545VJt LIZJ;
    public EnumC79545VJt LIZLLL;
    public float LIZIZ = 1.0E21f;
    public float LIZ = 1.0E21f;

    public C79699VPr() {
        EnumC79545VJt enumC79545VJt = EnumC79545VJt.NUMBER;
        this.LIZLLL = enumC79545VJt;
        this.LIZJ = enumC79545VJt;
    }

    public static C79699VPr LIZ(int i, ReadableArray readableArray) {
        EnumC79545VJt enumC79545VJt;
        EnumC79545VJt enumC79545VJt2;
        C79699VPr c79699VPr = new C79699VPr();
        c79699VPr.LIZ = (float) readableArray.getDouble(i);
        if (readableArray.getInt(i + 1) == 1) {
            enumC79545VJt = EnumC79545VJt.PERCENTAGE;
        } else {
            enumC79545VJt = EnumC79545VJt.NUMBER;
        }
        c79699VPr.LIZJ = enumC79545VJt;
        c79699VPr.LIZIZ = (float) readableArray.getDouble(i + 2);
        if (readableArray.getInt(i + 3) == 1) {
            enumC79545VJt2 = EnumC79545VJt.PERCENTAGE;
        } else {
            enumC79545VJt2 = EnumC79545VJt.NUMBER;
        }
        c79699VPr.LIZLLL = enumC79545VJt2;
        return c79699VPr;
    }
}
