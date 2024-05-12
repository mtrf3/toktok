package X;

import Y.ACListenerS28S0201000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rjc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70372Rjc extends C8HS<Image> {
    public final /* synthetic */ MiniPdpHeaderWidget LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70372Rjc(MiniPdpHeaderWidget miniPdpHeaderWidget) {
        super(false, 1, null);
        this.LJLIL = miniPdpHeaderWidget;
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C70373Rjd c70373Rjd;
        boolean z;
        List<Image> data = getData();
        Image image = null;
        if (data != null) {
            image = (Image) ORZ.LJLLLLLL(i, data);
        }
        if ((viewHolder instanceof C70373Rjd) && (c70373Rjd = (C70373Rjd) viewHolder) != null) {
            MiniPdpHeaderWidget miniPdpHeaderWidget = this.LJLIL;
            SmartImageView smartImageView = (SmartImageView) c70373Rjd.LJLIL.getValue();
            if (smartImageView != null) {
                Context context = smartImageView.getContext();
                o.LJIIIIZZ(context, "headerImageView.context");
                smartImageView.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context));
                if (image == null) {
                    W5F LIZLLL = C70759Rpr.LIZLLL(new C62562cu(C61878OQg.INSTANCE));
                    LIZLLL.LIZIZ("MiniPdp_ImageViewHolder");
                    LIZLLL.LJJIIJ = smartImageView;
                } else {
                    ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                    if (image.getRadio() == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        layoutParams.height = C7MY.LIZIZ(174);
                        layoutParams.width = C7MY.LIZIZ(174);
                    } else {
                        layoutParams.width = C7MY.LIZIZ(174);
                        layoutParams.height = C7MY.LIZIZ(232);
                    }
                    smartImageView.setLayoutParams(layoutParams);
                    C70053ReT.LIZ(image);
                    C27583As7 c27583As7 = new C27583As7();
                    c27583As7.LIZJ = "sku_head";
                    c27583As7.LIZ(-1);
                    c27583As7.LIZIZ(image.toThumbFirstImageUrlModel());
                    W5F LIZLLL2 = C70759Rpr.LIZLLL(image.toThumbFirstImageUrlModel());
                    LIZLLL2.LIZIZ("MiniPdp_ImageViewHolder");
                    LIZLLL2.LJJIIJ = smartImageView;
                    LIZLLL2.LIZLLL(new C70391Rjv(c27583As7));
                }
            }
            C16880lQ.LJIIJ(new ACListenerS28S0201000_12(i, image, miniPdpHeaderWidget, 1), c70373Rjd.itemView);
            View view = c70373Rjd.itemView;
            C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "it.itemView"), C70371Rjb.LJLIL, new AqS36S0001000_12(i, 5));
            View view2 = c70373Rjd.itemView;
            o.LJIIIIZZ(view2, "it.itemView");
            C78946Uyc.LJJIIJZLJL(view2, new C70943Rsp(), new AqS162S0100000_12(image, 475), new AqS178S0100000_12(image, 168));
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C70373Rjd c70373Rjd = new C70373Rjd(new SmartImageView(parent.getContext()));
        c70373Rjd.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return c70373Rjd;
    }
}
