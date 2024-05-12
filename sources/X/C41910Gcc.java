package X;

import android.graphics.Bitmap;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gcc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41910Gcc implements P5A {
    public final /* synthetic */ C41911Gcd LIZ;
    public final /* synthetic */ C76732zl LIZIZ;
    public final /* synthetic */ List<String> LIZJ;
    public final /* synthetic */ int[] LIZLLL;
    public final /* synthetic */ InterfaceC67352kd<List<String>> LJ;

    public C41910Gcc(C41911Gcd c41911Gcd, C76732zl c76732zl, List list, int[] iArr, C84654XKg c84654XKg) {
        this.LIZ = c41911Gcd;
        this.LIZIZ = c76732zl;
        this.LIZJ = list;
        this.LIZLLL = iArr;
        this.LJ = c84654XKg;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        C44422Hc2.LIZJ();
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        boolean z = false;
        createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        File LJIIIZ = this.LIZ.LJIIIZ(this.LIZIZ.element, createBitmap);
        List<String> list = this.LIZJ;
        String absolutePath = LJIIIZ.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "file.absolutePath");
        list.add(absolutePath);
        this.LIZIZ.element++;
        if (ORY.LJJJJZ(this.LIZLLL) - i3 < 10) {
            z = true;
            InterfaceC67352kd<List<String>> interfaceC67352kd = this.LJ;
            List<String> list2 = this.LIZJ;
            C3C5.m7constructorimpl(list2);
            interfaceC67352kd.resumeWith(list2);
        }
        return !z;
    }
}
