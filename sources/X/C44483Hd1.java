package X;

import com.ss.android.vesdk.VEWatermarkParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Hd1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44483Hd1 {
    public final String LIZ;
    public volatile boolean LIZIZ;
    public C44485Hd3 LIZJ;
    public InterfaceC153045zY LIZLLL;

    public C44483Hd1(String workSpace) {
        o.LJIIIZ(workSpace, "workSpace");
        this.LIZ = workSpace;
    }

    public static final void LIZIZ(C44485Hd3 c44485Hd3) {
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        VEWatermarkParam vEWatermarkParam = c44485Hd3.LIZJ;
        if (vEWatermarkParam != null && (strArr2 = vEWatermarkParam.images) != null && strArr2.length != 0) {
            for (String str3 : strArr2) {
                C39579Fg7.LJIL(str3);
            }
        }
        VEWatermarkParam vEWatermarkParam2 = c44485Hd3.LIZJ;
        if (vEWatermarkParam2 != null && (strArr = vEWatermarkParam2.secondHalfImages) != null && strArr.length != 0) {
            for (String str4 : strArr) {
                C39579Fg7.LJIL(str4);
            }
        }
        C44482Hd0 c44482Hd0 = c44485Hd3.LJFF;
        if (c44482Hd0 != null && (str2 = c44482Hd0.LIZ) != null) {
            C39579Fg7.LJIL(str2);
        }
        C44482Hd0 c44482Hd02 = c44485Hd3.LJFF;
        if (c44482Hd02 != null && (str = c44482Hd02.LIZIZ) != null) {
            C39579Fg7.LJIL(str);
        }
    }

    public final void LIZ(C44485Hd3 c44485Hd3) {
        this.LIZIZ = false;
        InterfaceC153045zY interfaceC153045zY = this.LIZLLL;
        if (interfaceC153045zY != null) {
            interfaceC153045zY.destroy();
        }
        this.LIZLLL = null;
        LIZIZ(c44485Hd3);
    }
}
