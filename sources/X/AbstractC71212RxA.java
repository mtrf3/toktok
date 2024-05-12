package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import defpackage.a1;
import java.util.List;

/* renamed from: X.RxA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71212RxA extends ConstraintLayout implements InterfaceC71133Rvt, InterfaceC71247Rxj {
    public boolean LJLIL;
    public InterfaceC71446S2g LJLILLLLZI;
    public final C71279RyF LJLJI;

    public abstract void LJJLJLI(PopupCardVO popupCardVO, C48502J1u c48502J1u, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z, boolean z2, int i);

    public abstract java.util.Map<String, String> getEventParamForContentShow();

    public abstract java.util.Map<String, String> getPromotionLogoDaInfo();

    public abstract /* synthetic */ void setAtmosphereTags(List<AtmosphereTag> list);

    public final C71279RyF getControllerLifecycleManager() {
        return this.LJLJI;
    }

    public final InterfaceC71446S2g getPopCardViewCallback() {
        return this.LJLILLLLZI;
    }

    public final boolean getShown() {
        return this.LJLIL;
    }

    public final void setPopCardViewCallback(InterfaceC71446S2g interfaceC71446S2g) {
        this.LJLILLLLZI = interfaceC71446S2g;
    }

    public final void setShown(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC71212RxA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJI = new C71279RyF();
    }
}
