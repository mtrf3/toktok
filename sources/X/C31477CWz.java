package X;

import Y.ARunnableS24S0200000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import kotlin.jvm.internal.AqS168S0200000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CWz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31477CWz extends CXA<CX0> implements InterfaceC29517BiD {
    public final int LJII;
    public final BadgeStruct LJIIIIZZ;
    public final Context LJIIIZ;
    public final Runnable LJIIJ;

    @Override // X.AbstractC31462CWk
    public final AbstractC31467CWp LIZLLL() {
        Context context = this.LJIIIZ;
        Bitmap bitmap = this.LJI;
        if (bitmap != null) {
            CX0 cx0 = new CX0(context, bitmap);
            Runnable runnable = this.LJIIJ;
            if (runnable != null) {
                cx0.LJ = runnable;
            }
            return cx0;
        }
        o.LJIJI("bitmap");
        throw null;
    }

    @Override // X.InterfaceC29517BiD
    public final BadgeStruct LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC31462CWk
    public final int LIZJ() {
        return this.LJII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31477CWz(int i, Handler handler, ImageModel imageModel, AqS168S0200000_5 aqS168S0200000_5, BadgeStruct badgeStruct, Context context, ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        super(handler, imageModel, aqS168S0200000_5);
        o.LJIIIZ(context, "context");
        this.LJII = i;
        this.LJIIIIZZ = badgeStruct;
        this.LJIIIZ = context;
        this.LJIIJ = aRunnableS24S0200000_5;
    }
}
