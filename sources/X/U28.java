package X;

import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U28 extends AbstractC76218Tvi<C74860TZo> {
    public final InterfaceC88471Ynr<String, String, C76800UCe> LJLIL;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object obj) {
        C74860TZo item = (C74860TZo) obj;
        o.LJIIIZ(item, "item");
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-bannerContainer>(...)");
        C29306Beo.LJJLIIIJJI((View) value, true);
        int LJIIL = C15380j0.LJIIL() - (C15380j0.LIZ(16.0f) * 2);
        int i2 = (int) ((LJIIL * 80.0f) / 343.0f);
        Object value2 = this.LJLJJI.getValue();
        o.LJIIIIZZ(value2, "<get-bannerImageView>(...)");
        C29306Beo.LJJLIIIJJIZ(LJIIL, i2, (View) value2);
        C78720Uuy url = C15650jR.LIZ().setUrl(item.LIZIZ);
        url.LIZLLL(ImageView.ScaleType.CENTER_CROP);
        url.LJ = LJIIL;
        url.LJFF = i2;
        url.LJIIJJI = new U29(this);
        Object value3 = this.LJLJJI.getValue();
        o.LJIIIIZZ(value3, "<get-bannerImageView>(...)");
        url.LJIIJJI((View) value3);
        Object value4 = this.LJLJJI.getValue();
        o.LJIIIIZZ(value4, "<get-bannerImageView>(...)");
        ((View) value4).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS47S0200000_13(this, item, 18)));
        Object value5 = this.LJLJJL.getValue();
        o.LJIIIIZZ(value5, "<get-bannerCloseIcon>(...)");
        C16880lQ.LJIILLIIL((ImageView) value5, new ACListenerS33S0100000_13(this, 129));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U28(View view, InterfaceC88471Ynr<? super String, ? super String, C76800UCe> onBannerClick, InterfaceC88472Yns<? super Integer, C76800UCe> onBannerClosed) {
        super(view);
        o.LJIIIZ(onBannerClick, "onBannerClick");
        o.LJIIIZ(onBannerClosed, "onBannerClosed");
        this.LJLIL = onBannerClick;
        this.LJLILLLLZI = onBannerClosed;
        this.LJLJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 332));
        this.LJLJJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 333));
        this.LJLJJL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 331));
    }
}
