package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.shipping.UsShippingVH;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Al4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27146Al4 extends TAT {
    public final /* synthetic */ LinkRichText LJLJJI;
    public final /* synthetic */ UsShippingVH LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.TAT
    public final void LIZ(View view) {
        String str;
        HashMap<String, Object> hashMap;
        String str2;
        ShippingService shippingService;
        String str3;
        String str4;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        HashMap<String, Object> trackParams;
        if (view != null) {
            LinkRichText linkRichText = this.LJLJJI;
            if (linkRichText != null && (str2 = linkRichText.link) != null) {
                Context context = this.LJLJJL.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                UsShippingVH usShippingVH = this.LJLJJL;
                usShippingVH.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                PdpViewModel vm = usShippingVH.getVm();
                if (vm != null && (pdpEnterParam = vm.LJLJJLL) != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                    Object orDefault = trackParams.getOrDefault("entrance_info", null);
                    if ((orDefault instanceof String) && orDefault != null) {
                        linkedHashMap2.put("entrance_info", orDefault);
                    }
                    Object orDefault2 = trackParams.getOrDefault("author_id", null);
                    if ((orDefault2 instanceof String) && orDefault2 != null) {
                        linkedHashMap2.put("author_id", orDefault2);
                    }
                }
                linkedHashMap2.put("previous_page", "product_detail");
                ProductPackStruct productPackStruct = usShippingVH.getVm().LJLJLLL;
                if (productPackStruct != null && (str4 = productPackStruct.productId) != null) {
                    linkedHashMap2.put("product_id", str4);
                }
                PdpShipping pdpShipping = ((C27129Akn) usShippingVH.getItem()).LJLILLLLZI;
                if (pdpShipping != null && (shippingService = pdpShipping.shippingService) != null && (str3 = shippingService.shippingRightsContent) != null) {
                    linkedHashMap2.put("shipping_rights_content", str3);
                }
                linkedHashMap.put("trackParams", C27739Aud.LJI(linkedHashMap2));
                C26867AgZ.LIZIZ(context, str2, linkedHashMap, false).open();
            }
            RichTextExtraInfo richTextExtraInfo = this.LJLJJI.extraInfo;
            if (richTextExtraInfo != null && (str = richTextExtraInfo.daInfo) != null) {
                try {
                    UsShippingVH usShippingVH2 = this.LJLJJL;
                    String decode = URLDecoder.decode(str);
                    if (decode != null) {
                        hashMap = C27739Aud.LJII(decode);
                    } else {
                        hashMap = null;
                    }
                    usShippingVH2.M(null, hashMap, (C27129Akn) this.LJLJJL.getItem());
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27146Al4(LinkRichText linkRichText, UsShippingVH usShippingVH) {
        super(700L);
        this.LJLJJI = linkRichText;
        this.LJLJJL = usShippingVH;
    }
}
