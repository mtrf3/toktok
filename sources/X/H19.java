package X;

import android.graphics.Bitmap;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class H19 implements P5A {
    public final /* synthetic */ H16 LIZ;
    public final /* synthetic */ C76732zl LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ H1B LIZLLL;
    public final /* synthetic */ List<String> LJ;
    public final /* synthetic */ List<Integer> LJFF;
    public final /* synthetic */ InterfaceC67352kd<List<String>> LJI;
    public final /* synthetic */ H15 LJII;
    public final /* synthetic */ long LJIIIIZZ;

    public H19(H16 h16, C76732zl c76732zl, String str, H1B h1b, List list, List list2, C84654XKg c84654XKg, H15 h15, long j) {
        this.LIZ = h16;
        this.LIZIZ = c76732zl;
        this.LIZJ = str;
        this.LIZLLL = h1b;
        this.LJ = list;
        this.LJFF = list2;
        this.LJI = c84654XKg;
        this.LJII = h15;
        this.LJIIIIZZ = j;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        Bitmap stitchBmp = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        InterfaceC88472Yns<Bitmap, Bitmap> interfaceC88472Yns = this.LIZ.LIZLLL.LIZIZ;
        if (interfaceC88472Yns != null) {
            o.LJIIIIZZ(stitchBmp, "stitchBmp");
            stitchBmp = interfaceC88472Yns.invoke(stitchBmp);
        }
        boolean z = false;
        stitchBmp.copyPixelsFromBuffer(byteBuffer.position(0));
        String valueOf = String.valueOf(this.LIZIZ.element);
        if (this.LIZ.LIZJ.LJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZJ);
            LIZ.append(i3);
            valueOf = X1D.LIZIZ(LIZ);
        }
        H1B h1b = this.LIZLLL;
        o.LJIIIIZZ(stitchBmp, "stitchBmp");
        String LIZ2 = this.LIZLLL.LIZ(this.LIZ);
        H1D h1d = new H1D(this.LIZ, this.LJII, this.LIZJ, i3);
        h1b.getClass();
        File LIZIZ = H1B.LIZIZ(stitchBmp, valueOf, LIZ2, h1d);
        List<String> list = this.LJ;
        String absolutePath = LIZIZ.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "file.absolutePath");
        list.add(absolutePath);
        this.LIZIZ.element++;
        if (((Number) ORZ.LLFF(this.LJFF)).intValue() - i3 < 10) {
            z = true;
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZLLL("duration", String.valueOf(System.currentTimeMillis() - this.LJIIIIZZ));
            GXR.LIZ("upload_decode_frame_time_cost", c145995oB.LIZ);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", String.valueOf(System.currentTimeMillis() - this.LJIIIIZZ));
            C43882HKc.LIZ.LJIILIIL("upload_decode_frame_time_cost", jSONObject, null);
            InterfaceC67352kd<List<String>> interfaceC67352kd = this.LJI;
            List<String> list2 = this.LJ;
            C3C5.m7constructorimpl(list2);
            interfaceC67352kd.resumeWith(list2);
        }
        return !z;
    }
}
