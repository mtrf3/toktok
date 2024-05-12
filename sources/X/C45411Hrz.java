package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AqS5S0211000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hrz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45411Hrz extends AbstractC45409Hrx {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        View view;
        float f;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        InterfaceC45412Hs0 interfaceC45412Hs0 = (InterfaceC45412Hs0) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (view = interfaceC38263Ezz.getView()) == null) {
            C31626Cb8.LIZ(c37356ElM, -1, "view is null.", 4);
            return;
        }
        if (view instanceof WebView) {
            f = ((WebView) view).getScale();
        } else {
            f = 1.0f;
        }
        int floatValue = (int) (interfaceC45412Hs0.getWidth().floatValue() * f);
        int floatValue2 = (int) (interfaceC45412Hs0.getHeight().floatValue() * f);
        Number left = interfaceC45412Hs0.getLeft();
        if (left != null) {
            i = left.intValue();
        } else {
            i = 0;
        }
        Number top = interfaceC45412Hs0.getTop();
        if (top != null) {
            i2 = top.intValue();
        } else {
            i2 = 0;
        }
        Number format = interfaceC45412Hs0.getFormat();
        if (format != null) {
            i3 = format.intValue();
        } else {
            i3 = 0;
        }
        Boolean useOpenGl = interfaceC45412Hs0.getUseOpenGl();
        if (useOpenGl != null) {
            z = useOpenGl.booleanValue();
        } else {
            z = false;
        }
        Boolean saveToAlbum = interfaceC45412Hs0.getSaveToAlbum();
        if (saveToAlbum != null) {
            z2 = saveToAlbum.booleanValue();
        } else {
            z2 = false;
        }
        if (z) {
            new VGK(floatValue, floatValue2).LIZ(view, new AqS5S0211000_7(this, i3, z2, c37356ElM, 2), i, i2);
        } else {
            C10K.LIZIZ(new CallableC45407Hrv(floatValue, floatValue2, i, i2, view, this, i3, z2, c37356ElM), C10K.LJIIIIZZ, null);
        }
    }
}
