package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.0DI, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0DI implements Comparator {
    public final /* synthetic */ int LJLIL;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.LJLIL) {
            case 0:
                C29321Dc c29321Dc = (C29321Dc) obj;
                C29321Dc c29321Dc2 = (C29321Dc) obj2;
                float f = c29321Dc.LLII;
                float f2 = c29321Dc2.LLII;
                if (f == f2) {
                    return o.LJIIJJI(c29321Dc.LJZL, c29321Dc2.LJZL);
                }
                return Float.compare(f, f2);
            default:
                return ((StickerItemModel) obj).startTime - ((StickerItemModel) obj2).startTime;
        }
    }
}
