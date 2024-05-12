package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressRightsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AmI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27222AmI extends AbstractC65781Prl implements InterfaceC88471Ynr<AML, AddressRightsInfo, C76800UCe> {
    public final /* synthetic */ AddressEditFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27222AmI(AddressEditFragment addressEditFragment) {
        super(2);
        this.LJLIL = addressEditFragment;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AML selectSubscribe, AddressRightsInfo addressRightsInfo) {
        Context context;
        Image image;
        Integer LJI;
        TextView textView;
        int parseColor;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (addressRightsInfo != null && C27100AkK.LIZ() && (context = this.LJLIL.getContext()) != null) {
            AddressEditFragment addressEditFragment = this.LJLIL;
            HashMap<String, Object> hashMap = addressEditFragment.Dl().LJLLLL;
            if ((hashMap != null && o.LJ(hashMap.getOrDefault("free_shipping", Boolean.FALSE), Boolean.TRUE)) || o.LJ(addressEditFragment.LJLLJ.freeShipping, Boolean.TRUE)) {
                View address_right_bar = addressEditFragment._$_findCachedViewById(R.id.x6);
                o.LJIIIIZZ(address_right_bar, "address_right_bar");
                address_right_bar.setVisibility(0);
                if (AnonymousClass636.LJIILJJIL(context)) {
                    Icon icon = addressRightsInfo.rightIcon;
                    if (icon != null) {
                        image = icon.iconDark;
                    }
                    image = null;
                } else {
                    Icon icon2 = addressRightsInfo.rightIcon;
                    if (icon2 != null) {
                        image = icon2.icon;
                    }
                    image = null;
                }
                try {
                    if (AnonymousClass636.LJIILJJIL(context)) {
                        parseColor = Color.parseColor(addressRightsInfo.textDarkColor);
                    } else {
                        parseColor = Color.parseColor(addressRightsInfo.textColor);
                    }
                    LJI = Integer.valueOf(parseColor);
                } catch (Exception unused) {
                    LJI = C79045V0n.LJI(R.attr.go, context);
                }
                if (image != null) {
                    W5F LJIIIZ = W5U.LJIIIZ(image.toImageUrlModel());
                    LJIIIZ.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context);
                    LJIIIZ.LJJIIJZLJL = (ImageView) addressEditFragment._$_findCachedViewById(R.id.j23);
                    C16880lQ.LLJJJ(LJIIIZ);
                }
                if (C26338AVi.LIZJ(context)) {
                    addressEditFragment._$_findCachedViewById(R.id.j23).setScaleX(-1.0f);
                }
                LinkRichText linkRichText = addressRightsInfo.rightLinkRichText;
                if (linkRichText != null && (textView = (TextView) addressEditFragment._$_findCachedViewById(R.id.j24)) != null) {
                    OUP.LJJLIIIJILLIZJL(textView, RichTextUtil.LIZJ(RichTextUtil.LIZ, context, linkRichText, LJI, 0, false, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT));
                }
                try {
                    C78946Uyc.LJJII(addressEditFragment, new C70947Rst(), C27223AmJ.LJLIL);
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
        }
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(AML aml, AddressRightsInfo addressRightsInfo) {
        invoke2(aml, addressRightsInfo);
        return C76800UCe.LIZ;
    }
}
