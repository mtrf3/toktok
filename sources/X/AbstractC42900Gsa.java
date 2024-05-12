package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gsa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42900Gsa extends FrameLayout {
    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public void LJ(UrlModel urlModel, String str, boolean z, AqS111S0300000_7 aqS111S0300000_7, AqS154S0200000_7 aqS154S0200000_7) {
    }

    public void LJFF() {
    }

    public void LJI(boolean z) {
    }

    public void LJII() {
    }

    public void LJIIIIZZ(int i) {
    }

    public ViewGroup getAnchorListContent() {
        return null;
    }

    public C62846OlW getLeftIcon() {
        return null;
    }

    public TuxIconView getRightIcon() {
        return null;
    }

    public void setLeftIcon(int i) {
    }

    public void setLeftIcon(C2068389v icon) {
        o.LJIIIZ(icon, "icon");
    }

    public void setOnAddClickListener(InterfaceC88472Yns<? super View, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
    }

    public void setOnClearAnchorListener(InterfaceC88472Yns<? super View, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
    }

    public void setRightIcon(C2068389v icon) {
        o.LJIIIZ(icon, "icon");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42900Gsa(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
    }
}
