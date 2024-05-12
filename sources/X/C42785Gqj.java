package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ViewSwitcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.view.productcard.detail.VSAProductDetailCarouselView$CarouselHandler;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gqj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42785Gqj extends ViewSwitcher implements OLP {
    public final VSAProductDetailCarouselView$CarouselHandler LJLIL;
    public final List<VSAProductCardsResponse.ProductDetail> LJLILLLLZI;
    public InterfaceC61746OLe LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public volatile boolean LJLJJLL;

    @Override // X.OLP
    public final void LIZ() {
        setVisibility(8);
        if (this.LJLJJL && this.LJLJJLL) {
            this.LJLJJLL = false;
            this.LJLIL.removeCallbacksAndMessages(null);
        }
        this.LJLJI = null;
        this.LJLJJI = 0;
        this.LJLJJL = false;
        this.LJLJJLL = false;
        ((ArrayList) this.LJLILLLLZI).clear();
    }

    @Override // X.OLP
    public final void hide() {
        if (this.LJLJJL && this.LJLJJLL) {
            this.LJLJJLL = false;
            this.LJLIL.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.OLP
    public final void show() {
        if (this.LJLJJL && !this.LJLJJLL) {
            this.LJLJJLL = true;
            this.LJLIL.removeCallbacksAndMessages(null);
            this.LJLIL.sendEmptyMessageDelayed(0, 2000L);
        }
    }

    public final void LIZIZ(View view) {
        C61745OLd c61745OLd;
        VSAProductCardsResponse.ProductDetail productDetail = (VSAProductCardsResponse.ProductDetail) ORZ.LJLLLLLL(this.LJLJJI, this.LJLILLLLZI);
        if (productDetail != null && (view instanceof C61745OLd) && (c61745OLd = (C61745OLd) view) != null) {
            c61745OLd.LIZJ(this.LJLJJI, productDetail, this.LJLJI);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42785Gqj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Lifecycle lifecycle;
        a1.LJFF(context, "context");
        VSAProductDetailCarouselView$CarouselHandler vSAProductDetailCarouselView$CarouselHandler = new VSAProductDetailCarouselView$CarouselHandler(new WeakReference(this));
        this.LJLIL = vSAProductDetailCarouselView$CarouselHandler;
        this.LJLILLLLZI = new ArrayList();
        addView(new C61745OLd(context, attributeSet, 0));
        addView(new C61745OLd(context, attributeSet, 0));
        LifecycleOwner LJJIIJZLJL = C78565UsT.LJJIIJZLJL(this);
        if (LJJIIJZLJL != null && (lifecycle = LJJIIJZLJL.getLifecycle()) != null) {
            lifecycle.addObserver(vSAProductDetailCarouselView$CarouselHandler);
        }
        if (C90193gN.LIZIZ(context)) {
            setInAnimation(AnimationUtils.loadAnimation(context, R.anim.c2));
            setOutAnimation(AnimationUtils.loadAnimation(context, R.anim.c4));
        } else {
            setInAnimation(AnimationUtils.loadAnimation(context, R.anim.c1));
            setOutAnimation(AnimationUtils.loadAnimation(context, R.anim.c3));
        }
    }
}
