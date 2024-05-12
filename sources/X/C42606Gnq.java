package X;

import Y.AfS17S1200000_7;
import Y.AfS59S0100000_7;
import Y.IDuS78S0200000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Size;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Gnq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42606Gnq {
    public static final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.NONE, C42608Gns.LJLIL);
    public static final HashMap<String, Bitmap> LIZIZ;
    public static final C73950T0o LIZJ;

    static {
        HashMap<String, Bitmap> hashMap;
        if (((Number) C42614Gny.LIZ.getValue()).intValue() > 0 && ((Boolean) C42612Gnw.LIZ.getValue()).booleanValue()) {
            hashMap = new HashMap<>();
        } else {
            hashMap = null;
        }
        LIZIZ = hashMap;
        LIZJ = new C73950T0o(C16880lQ.LLLLZ(Math.abs(((Number) C42609Gnt.LIZ.getValue()).intValue())));
    }

    public static final InterfaceC92693kP LIZ(ImageView view, MediaModel mediaModel, Size itemSize, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        C73390SrC LJIIJ;
        AbstractC73946T0k abstractC73946T0k;
        Bitmap remove;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(mediaModel, "mediaModel");
        o.LJIIIZ(itemSize, "itemSize");
        Context context = view.getContext();
        String str = mediaModel.fileLocalUriPath;
        view.setTag(str);
        HashMap<String, Bitmap> hashMap = LIZIZ;
        CancellationSignal cancellationSignal = null;
        if (hashMap != null && (remove = hashMap.remove(str)) != null) {
            view.setImageBitmap(remove);
            interfaceC88472Yns.invoke(remove);
            EnumC73538Sta enumC73538Sta = EnumC73538Sta.INSTANCE;
            o.LJIIIIZZ(enumC73538Sta, "disposed()");
            return enumC73538Sta;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            cancellationSignal = new CancellationSignal();
            o.LJIIIIZZ(context, "context");
            LJIIJ = AbstractC73672Svk.LJIIJ(new C42602Gnm(context, cancellationSignal, itemSize, mediaModel));
        } else {
            o.LJIIIIZZ(context, "context");
            LJIIJ = AbstractC73672Svk.LJIIJ(new IDuS78S0200000_7(context, mediaModel, 1));
        }
        if (((Number) C42609Gnt.LIZ.getValue()).intValue() <= 0) {
            abstractC73946T0k = T16.LIZ();
        } else {
            abstractC73946T0k = LIZJ;
        }
        InterfaceC92693kP LJJJLIIL = LJIIJ.LJJL(abstractC73946T0k).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS17S1200000_7(view, str, interfaceC88472Yns, 1), new AfS59S0100000_7(interfaceC88472Yns, 18));
        if (i >= 29) {
            return new C42607Gnr((C73411SrX) LJJJLIIL, cancellationSignal);
        }
        return LJJJLIIL;
    }
}
