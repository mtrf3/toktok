package X;

import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Abp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26573Abp extends AbstractC65781Prl implements InterfaceC88473Ynt<View, Icon, Integer, C76800UCe> {
    public static final C26573Abp INSTANCE = new C26573Abp();

    public C26573Abp() {
        super(3);
    }

    public final void invoke(View bindItems, Icon item, int i) {
        C62562cu c62562cu;
        o.LJIIIZ(bindItems, "$this$bindItems");
        o.LJIIIZ(item, "item");
        Image image = item.icon;
        if (image != null) {
            c62562cu = image.toThumbFirstImageUrlModel();
        } else {
            c62562cu = null;
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(c62562cu);
        LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LIZLLL.LJJIIJ = (SmartImageView) bindItems.findViewById(R.id.lmq);
        C16880lQ.LLJJJ(LIZLLL);
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ C76800UCe invoke(View view, Icon icon, Integer num) {
        invoke(view, icon, num.intValue());
        return C76800UCe.LIZ;
    }
}
