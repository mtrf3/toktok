package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.core.view.PdpUserRightSheetItemView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ak7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnLayoutChangeListenerC27087Ak7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ PdpUserRightSheetItemView LJLIL;
    public final /* synthetic */ UserRightDetail LJLILLLLZI;

    public ViewOnLayoutChangeListenerC27087Ak7(PdpUserRightSheetItemView pdpUserRightSheetItemView, UserRightDetail userRightDetail) {
        this.LJLIL = pdpUserRightSheetItemView;
        this.LJLILLLLZI = userRightDetail;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(this);
        PdpUserRightSheetItemView pdpUserRightSheetItemView = this.LJLIL;
        UserRightDetail userRightDetail = this.LJLILLLLZI;
        pdpUserRightSheetItemView.setTitle(userRightDetail.name, userRightDetail.headerFontColor, userRightDetail.headerFontDarkColor);
        if (pdpUserRightSheetItemView.getStyle().getIconVisibility() != 8) {
            pdpUserRightSheetItemView.setIcon(this.LJLILLLLZI.icon);
        }
        Image image = null;
        if (pdpUserRightSheetItemView.getStyle().getBackgroundVisibility() != 8) {
            Context context = pdpUserRightSheetItemView.getContext();
            o.LJIIIIZZ(context, "context");
            if (AnonymousClass636.LJIILJJIL(context)) {
                Icon icon = this.LJLILLLLZI.background;
                if (icon != null) {
                    image = icon.iconDark;
                }
            } else {
                Icon icon2 = this.LJLILLLLZI.background;
                if (icon2 != null) {
                    image = icon2.icon;
                }
            }
            pdpUserRightSheetItemView.setBackground(image);
            pdpUserRightSheetItemView.setColor(this.LJLILLLLZI.themeColor);
        }
        UserRightDetail userRightDetail2 = this.LJLILLLLZI;
        pdpUserRightSheetItemView.setHeaderBackground(userRightDetail2.headerBackgroundImage, userRightDetail2.themeColor);
        List<UserRightDesc> list = this.LJLILLLLZI.userRightDesc;
        boolean z = false;
        if (list == null || list.isEmpty()) {
            UserRightDetail userRightDetail3 = this.LJLILLLLZI;
            String str = userRightDetail3.description;
            Icon icon3 = userRightDetail3.icon;
            if (icon3 != null && icon3.icon != null) {
                z = true;
            }
            pdpUserRightSheetItemView.setDesc(str, z);
            return;
        }
        UserRightDetail userRightDetail4 = this.LJLILLLLZI;
        Icon icon4 = userRightDetail4.icon;
        if (icon4 != null && icon4.icon != null) {
            z = true;
        }
        pdpUserRightSheetItemView.setDesc(userRightDetail4, z);
    }
}
