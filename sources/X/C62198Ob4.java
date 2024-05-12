package X;

import Y.ARunnableS7S0101000_3;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.specact.model.NowShareModel$NowPostIncentiveSharePanelData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import o53.IDdS476S0100000_10;

/* renamed from: X.Ob4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62198Ob4 extends FrameLayout implements InterfaceC62266OcA {
    public final C62822Ol8 LJLIL;
    public boolean LJLILLLLZI;

    public final C62846OlW getRoundImageView() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-roundImageView>(...)");
        return (C62846OlW) value;
    }

    private final Bitmap getBitmap() {
        getRoundImageView().setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(getRoundImageView().getWidth(), getRoundImageView().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        C39214FaE c39214FaE = C37203Eit.LIZJ;
        C62846OlW roundImageView = getRoundImageView();
        c39214FaE.getClass();
        C39214FaE.LIZ(roundImageView, canvas);
        return createBitmap;
    }

    @Override // X.InterfaceC62266OcA
    public Bitmap getDrawingCacheBitmap() {
        return getBitmap();
    }

    @Override // X.InterfaceC62266OcA
    public final boolean LIZ() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62198Ob4(Context context, NowShareModel$NowPostIncentiveSharePanelData sharePanelData) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePanelData, "sharePanelData");
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 401));
        C16880lQ.LLLZIIL(R.layout.cnj, C16880lQ.LLZIL(context), this);
        C62846OlW roundImageView = getRoundImageView();
        C81705W4v LIZJ = W5I.LIZJ();
        String str = sharePanelData.topImage;
        LIZJ.LJI(UriProtector.parse(str == null ? "" : str));
        LIZJ.LJIIL = getRoundImageView().getController();
        LIZJ.LJII = new IDdS476S0100000_10(this, 8);
        roundImageView.setController(LIZJ.LIZ());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i4 == i2) {
            return;
        }
        getRoundImageView().post(new ARunnableS7S0101000_3(i2, this, 8));
    }
}
