package X;

import android.content.Context;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8nD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC221838nD implements Y1P {
    public final Context LJLIL;
    public final AbstractC224038ql LJLILLLLZI;
    public final InteractStickerStruct LJLJI;
    public C245649kW LJLJJI;

    public abstract List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct);

    public abstract void LIZJ(float f, float f2, InterfaceC221818nB interfaceC221818nB);

    public final RectF LIZ(NormalTrackTimeStamp normalTrackTimeStamp) {
        float f;
        C245649kW c245649kW = this.LJLJJI;
        float f2 = 0.0f;
        if (c245649kW == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float f3 = c245649kW.LIZ;
        float f4 = c245649kW.LIZIZ;
        if (f3 == f4) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float width = normalTrackTimeStamp.getWidth() * f3;
        float height = normalTrackTimeStamp.getHeight() * f4;
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null) {
            f = c245649kW2.LIZ;
        } else {
            f = 0.0f;
        }
        float f5 = 2;
        float x = (normalTrackTimeStamp.getX() * f) - (width / f5);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null) {
            f2 = c245649kW3.LIZIZ;
        }
        float y = (normalTrackTimeStamp.getY() * f2) - (height / f5);
        return new RectF(x, y, width + x, height + y);
    }

    public AbstractC221838nD(Context context, AbstractC224038ql view, InteractStickerStruct stickerStruct, C245649kW c245649kW) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(stickerStruct, "stickerStruct");
        this.LJLIL = context;
        this.LJLILLLLZI = view;
        this.LJLJI = stickerStruct;
        this.LJLJJI = c245649kW;
    }

    @Override // X.Y1P
    public boolean LJIIJJI(long j, float f, float f2, int i) {
        List<NormalTrackTimeStamp> LIZIZ = LIZIZ(j, this.LJLJI);
        if (LIZIZ == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NormalTrackTimeStamp normalTrackTimeStamp : LIZIZ) {
            o.LJI(normalTrackTimeStamp);
            arrayList.add(LIZ(normalTrackTimeStamp));
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            RectF rectF = (RectF) it.next();
            if (ListProtector.get(LIZIZ, i2) != null) {
                Object obj = ListProtector.get(LIZIZ, i2);
                o.LJI(obj);
                if (C79045V0n.LJIIL(f, f2, rectF, ((NormalTrackTimeStamp) obj).getRotation())) {
                    return true;
                }
            }
            i2 = i3;
        }
        return false;
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        if (LJIIJJI(j, f, f2, i)) {
            LIZJ(f, f2, popListener);
            return true;
        }
        return false;
    }
}
