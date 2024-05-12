package X;

import android.content.Context;
import android.graphics.Paint;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Gh8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42190Gh8 {
    public final Paint LIZ;
    public final Paint LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public final int LJFF;

    public C42190Gh8(Context context) {
        o.LJIIIZ(context, "context");
        Paint paint = new Paint();
        this.LIZ = paint;
        Paint paint2 = new Paint();
        this.LIZIZ = paint2;
        this.LIZJ = C06690Ob.LIZIZ(context.getResources(), R.color.ca, context.getTheme());
        this.LJFF = (int) KL2.LIZJ(context, 8.0f);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setShadowLayer(5.0f, 0.0f, 0.0f, C06690Ob.LIZIZ(context.getResources(), R.color.oa, context.getTheme()));
        if (C173636rf.LIZIZ(context)) {
            paint.setTextAlign(Paint.Align.RIGHT);
        } else {
            paint.setTextAlign(Paint.Align.LEFT);
        }
        paint2.setAntiAlias(true);
    }

    public static void LIZ(String str, InterfaceC88472Yns interfaceC88472Yns) {
        int[] LIZJ = C42299Git.LIZJ(str);
        if (LIZJ == null) {
            interfaceC88472Yns.invoke(null);
        } else {
            C78764Uvg.LJIILIIL(C163246au.LIZ(UriProtector.parse(android.net.Uri.fromFile(new File(str)).toString())), LIZJ[0], LIZJ[1], new C41978Gdi(interfaceC88472Yns));
        }
    }
}
