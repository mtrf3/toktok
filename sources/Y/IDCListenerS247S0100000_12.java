package Y;

import X.AbstractC73265SpB;
import android.view.View;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDCListenerS247S0100000_12 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                return;
            case 1:
                onViewAttachedToWindow$1(this, view);
                return;
            case 2:
                onViewAttachedToWindow$2(this, view);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                return;
            case 1:
                o.LJIIIZ(view, "v");
                return;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS247S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(IDCListenerS247S0100000_12 iDCListenerS247S0100000_12, View view) {
        ((AbstractC73265SpB) iDCListenerS247S0100000_12.l0).attachToWindow();
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS247S0100000_12 iDCListenerS247S0100000_12, View v) {
        o.LJIIIZ(v, "v");
        if (((StickerCategoryFragment) iDCListenerS247S0100000_12.l0).getUserVisibleHint()) {
            ((StickerCategoryFragment) iDCListenerS247S0100000_12.l0).Ql();
        }
    }

    public static final void onViewAttachedToWindow$2(IDCListenerS247S0100000_12 iDCListenerS247S0100000_12, View v) {
        o.LJIIIZ(v, "v");
        if (((EffectTemplateCategoryFragment) iDCListenerS247S0100000_12.l0).getUserVisibleHint()) {
            ((EffectTemplateCategoryFragment) iDCListenerS247S0100000_12.l0).Kl();
        }
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS247S0100000_12 iDCListenerS247S0100000_12, View view) {
        ((AbstractC73265SpB) iDCListenerS247S0100000_12.l0).detachFromWindow();
    }

    public static final void onViewDetachedFromWindow$2(IDCListenerS247S0100000_12 iDCListenerS247S0100000_12, View v) {
        o.LJIIIZ(v, "v");
        ((EffectTemplateCategoryFragment) iDCListenerS247S0100000_12.l0).vl();
    }
}
