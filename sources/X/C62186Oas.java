package X;

import android.content.Context;
import android.util.AttributeSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import o53.IDdS476S0100000_10;

/* renamed from: X.Oas, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62186Oas extends C62846OlW {
    public final IDdS476S0100000_10 LJLIL;

    @Override // X.C62846OlW
    public final void LIZ() {
        setOutlineProvider(new C62187Oat(this));
        setClipToOutline(true);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public C62186Oas(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.W5G
    public final void setImageURI(android.net.Uri uri, Object obj) {
        o.LJIIIZ(uri, "uri");
        AbstractC81686W4c controllerBuilder = getControllerBuilder();
        o.LJII(controllerBuilder, "null cannot be cast to non-null type com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder");
        C81705W4v c81705W4v = (C81705W4v) controllerBuilder;
        c81705W4v.LJII = this.LJLIL;
        c81705W4v.LIZJ = obj;
        c81705W4v.LJI(uri);
        c81705W4v.LJIIL = getController();
        setController(c81705W4v.LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62186Oas(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        this.LJLIL = new IDdS476S0100000_10(this, 2);
    }
}
