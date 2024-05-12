package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlatformPromotionItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rh2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70212Rh2 extends ConstraintLayout {
    public static final int LJLJJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(56));
    public static final int LJLJJLL = C7MY.LIZIZ(76);
    public static final int LJLJL = C7MY.LIZIZ(4);
    public final int LJLIL;
    public long LJLILLLLZI;
    public C69643RUx LJLJI;
    public final java.util.Map<Integer, View> LJLJJI;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLJJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setData(C69643RUx data) {
        boolean z;
        String voucherTypeID;
        Voucher voucher;
        String voucherID;
        o.LJIIIZ(data, "data");
        this.LJLJI = data;
        PlatformPromotionItem platformPromotionItem = data.LIZIZ;
        int i = 0;
        if (platformPromotionItem != null && (voucher = platformPromotionItem.voucherInfo) != null && (voucherID = voucher.getVoucherID()) != null && C78857UxB.LJJJIL(voucherID)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.at9));
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.a7n));
        } else {
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.at9));
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.a7n));
        }
        PlatformPromotionItem platformPromotionItem2 = data.LIZIZ;
        if (platformPromotionItem2 == null || platformPromotionItem2.voucherInfo == null) {
            _$_findCachedViewById(R.id.at9).setVisibility(4);
            ((ImageView) _$_findCachedViewById(R.id.a7n)).setVisibility(4);
        }
        View tvTermsApply = _$_findCachedViewById(R.id.ly6);
        o.LJIIIIZZ(tvTermsApply, "tvTermsApply");
        Voucher voucher2 = data.LJ;
        if (voucher2 == null || (voucherTypeID = voucher2.getVoucherTypeID()) == null || voucherTypeID.length() == 0) {
            i = 8;
        }
        tvTermsApply.setVisibility(i);
        Image image = data.LIZ;
        if (image != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.e_q);
            C16880lQ.LLJJJ(LIZLLL);
        }
        if (data.LIZIZ == null) {
            return;
        }
        ((TextView) _$_findCachedViewById(R.id.mo6)).setText(data.LIZIZ.title);
        ((TextView) _$_findCachedViewById(R.id.mlr)).setText(data.LIZIZ.subTitle);
        TextView tv_intro_cta = (TextView) _$_findCachedViewById(R.id.m94);
        o.LJIIIIZZ(tv_intro_cta, "tv_intro_cta");
        OUP.LJJLIIIJILLIZJL(tv_intro_cta, data.LIZIZ.vapIntroText);
        TextView tv_cta = (TextView) _$_findCachedViewById(R.id.m3x);
        o.LJIIIIZZ(tv_cta, "tv_cta");
        OUP.LJJLIIIJILLIZJL(tv_cta, data.LIZIZ.vapText);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70212Rh2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJJI = C62850Ola.LJFF(context, "context");
        this.LJLIL = Q7K.LIZIZ("click_pdp_voucher_claim_time_gap", 0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a5h, this, true);
        setBackground(context.getDrawable(R.drawable.aca));
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(C27162AlK.LJIILLIIL);
        c110614Vt.LIZLLL = Integer.valueOf(C27162AlK.LJIJI);
        c110614Vt.LJFF = Integer.valueOf(R.attr.eb);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        _$_findCachedViewById(R.id.at9).setBackground(c110614Vt.LIZ(context));
    }
}
