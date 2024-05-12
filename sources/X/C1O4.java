package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.android.livesdk.livesetting.comment.LiveStarCommentLayerSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1O4, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1O4 extends LayeredElementContext {
    public final BaseLayeredElementManager LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final float LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final float LJIIL;
    public final boolean LJIILIIL;
    public final int LJIILJJIL;

    public abstract boolean LIZ();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1O4(Context context, ViewGroup container, DataChannel dataChannel, BaseLayeredElementManager layeredElementManager) {
        super(context, container, dataChannel, layeredElementManager);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(layeredElementManager, "layeredElementManager");
        this.LIZ = layeredElementManager;
        this.LIZIZ = context.getResources().getDimensionPixelSize(R.dimen.adj);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.adn);
        this.LIZJ = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ado);
        this.LIZLLL = dimensionPixelSize2;
        this.LJ = context.getResources().getDimensionPixelSize(R.dimen.ads);
        this.LJFF = context.getResources().getDimensionPixelSize(R.dimen.adt);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.adh);
        this.LJI = dimensionPixelSize3;
        this.LJII = 0.6f;
        this.LJIIIIZZ = (C15380j0.LIZ(42.0f) * 2) + dimensionPixelSize2;
        this.LJIIIZ = context.getResources().getDimensionPixelSize(R.dimen.aek);
        this.LJIIJ = context.getResources().getDimensionPixelSize(R.dimen.adp);
        this.LJIIJJI = dimensionPixelSize3 + dimensionPixelSize2 + dimensionPixelSize;
        this.LJIIL = context.getResources().getDimension(R.dimen.aed);
        this.LJIILIIL = CCJ.LIZ(context);
        this.LJIILJJIL = LiveStarCommentLayerSetting.INSTANCE.getValue();
    }
}
