package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rn7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70589Rn7 extends FrameLayout {
    public InterfaceC70598RnG LJLIL;
    public InterfaceC70599RnH LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZIZ() {
        int i;
        if (LIZ(R.id.ja7).getVisibility() == 0 || LIZ(R.id.kbs).getVisibility() == 0 || LIZ(R.id.dx8).getVisibility() == 0) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    public final void setGlobalShipping(LinkRichText linkRichText) {
        if (linkRichText == null) {
            LIZ(R.id.cdk).setVisibility(8);
            LIZ(R.id.dx8).setVisibility(8);
        } else {
            if (LIZ(R.id.ink).getVisibility() == 0 || LIZ(R.id.ja7).getVisibility() == 0) {
                LIZ(R.id.cdk).setVisibility(0);
            }
            LIZ(R.id.dx8).setVisibility(0);
            TextView textView = (TextView) LIZ(R.id.dx8);
            RichTextUtil richTextUtil = RichTextUtil.LIZ;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            textView.setText(RichTextUtil.LIZJ(richTextUtil, context, linkRichText, null, 0, false, null, null, 124));
            TextView textView2 = (TextView) LIZ(R.id.dx8);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            textView2.setTextColor(linkRichText.LIZ(context2));
        }
        LIZIZ();
    }

    public final void setRatingListener(InterfaceC70598RnG interfaceC70598RnG) {
        this.LJLIL = interfaceC70598RnG;
    }

    public final void setSales(CombinedSalesVolume combinedSalesVolume) {
        if (combinedSalesVolume != null) {
            if (combinedSalesVolume.salesText != null) {
                C45804HyK.LJJLL(LIZ(R.id.ja8));
                setVisibility(0);
                LIZ(R.id.ja7).setVisibility(0);
                TextView textView = (TextView) LIZ(R.id.ja7);
                RichTextUtil richTextUtil = RichTextUtil.LIZ;
                LogisticLinkRichText logisticLinkRichText = combinedSalesVolume.salesText;
                C70596RnE c70596RnE = C70596RnE.LJLIL;
                richTextUtil.getClass();
                textView.setText(RichTextUtil.LIZ(logisticLinkRichText, this, c70596RnE));
                String str = combinedSalesVolume.sales_specification_schema;
                if (str == null || str.length() == 0) {
                    C45804HyK.LJJIJIIJIL(LIZ(R.id.ja_));
                } else {
                    C45804HyK.LJJLL(LIZ(R.id.ja_));
                    InterfaceC70599RnH interfaceC70599RnH = this.LJLILLLLZI;
                    if (interfaceC70599RnH != null) {
                        interfaceC70599RnH.LIZIZ();
                    }
                    View sales_info_icon = LIZ(R.id.ja_);
                    o.LJIIIIZZ(sales_info_icon, "sales_info_icon");
                    C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 26, 42), sales_info_icon);
                }
            } else {
                C45804HyK.LJJIJIIJIL(LIZ(R.id.ja8));
                C45804HyK.LJJIJIIJIL(LIZ(R.id.ja7));
                C45804HyK.LJJIJIIJIL(LIZ(R.id.ja_));
            }
        }
        LIZIZ();
    }

    public final void setSalesInfoIconListener(InterfaceC70599RnH interfaceC70599RnH) {
        this.LJLILLLLZI = interfaceC70599RnH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70589Rn7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a3m, this, true);
    }
}
