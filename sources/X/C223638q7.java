package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8q7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223638q7 extends AbstractC221838nD {
    public final InterfaceC223648q8 LJLJJL;
    public final float[] LJLJJLL;

    @Override // X.AbstractC221838nD
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct) {
        o.LJIIIZ(stickerStruct, "stickerStruct");
        return C223998qh.LIZJ(j, stickerStruct);
    }

    @Override // X.AbstractC221838nD
    public final void LIZJ(float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        popListener.LIZ(this.LJLILLLLZI.LJIL(f, f2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C223638q7(Context context, C223628q6 view, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, InterfaceC223648q8 interfaceC223648q8) {
        super(context, view, interactStickerStruct, c245649kW);
        long j;
        float[] fArr;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(view, "view");
        this.LJLJJL = interfaceC223648q8;
        if (interfaceC223648q8 != null) {
            j = interfaceC223648q8.LJZL();
        } else {
            j = 0;
        }
        List<NormalTrackTimeStamp> LIZIZ = LIZIZ(j, this.LJLJI);
        if (LIZIZ == null || LIZIZ.isEmpty() || ListProtector.get(LIZIZ, 0) == null) {
            fArr = null;
        } else {
            Object obj = ListProtector.get(LIZIZ, 0);
            o.LJI(obj);
            RectF LIZ = LIZ((NormalTrackTimeStamp) obj);
            float f = LIZ.left;
            float f2 = LIZ.top;
            float f3 = LIZ.right;
            float f4 = LIZ.bottom;
            fArr = new float[]{f, f2, f3, f2, f, f4, f3, f4};
            Matrix matrix = new Matrix();
            Object obj2 = ListProtector.get(LIZIZ, 0);
            o.LJI(obj2);
            float rotation = ((NormalTrackTimeStamp) obj2).getRotation();
            float f5 = fArr[2];
            float f6 = fArr[0];
            float LIZ2 = C1I0.LIZ(f5, f6, 2.0f, f6);
            float f7 = fArr[5];
            float f8 = fArr[3];
            matrix.postRotate(rotation, LIZ2, ((f7 - f8) / 2.0f) + f8);
            matrix.mapPoints(fArr);
        }
        this.LJLJJLL = fArr;
    }
}
