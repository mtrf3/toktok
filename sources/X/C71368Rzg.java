package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Rzg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C71368Rzg extends S0L {
    public static final java.util.Set<String> LLFFF = C77275UUl.LJIIIIZZ("enter_from", "enter_from_info");
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public Integer LJIILJJIL;
    public String LJIILL;
    public Integer LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public Integer LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public java.util.Map<String, String> LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public Integer LJJIIJ;
    public Integer LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public Integer LJJIJ;
    public Integer LJJIJIIJI;
    public String LJJIJIIJIL;
    public String LJJIJIL;
    public Integer LJJIJL;
    public String LJJIJLIJ;
    public String LJJIL;
    public String LJJIZ;
    public String LJJJ;
    public String LJJJI;
    public String LJJJIL;
    public String LJJJJ;
    public String LJJJJI;
    public String LJJJJIZL;
    public String LJJJJJ;
    public String LJJJJJL;
    public String LJJJJL;
    public String LJJJJLI;
    public String LJJJJLL;
    public String LJJJJZ;
    public Integer LJJJJZI;
    public String LJJJLIIL;
    public Integer LJJJLL;
    public Integer LJJJLZIJ;
    public Integer LJJJZ;
    public String LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public Integer LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public Integer LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public Integer LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public String LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public String LJLI;
    public String LJLIIIL;
    public String LJLIIL;
    public Integer LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public Integer LJLZ;
    public Integer LJZ;
    public Integer LJZI;
    public String LJZL;
    public String LL;
    public java.util.Map<String, String> LLD;
    public String LLF;
    public String LLFF;

    @Override // X.S0L
    public void LIZIZ() {
        String str;
        String str2;
        String str3 = this.LIZLLL;
        InterfaceC71397S0j.LIZ.getClass();
        LIZ("EVENT_ORIGIN_FEATURE", str3);
        LIZ("group_id", this.LJ);
        LIZ("author_id", this.LJFF);
        LIZ("request_id", this.LJI);
        LIZ("enter_from", this.LJII);
        LIZ("enter_method", this.LJIIIIZZ);
        LIZ("anchor_show_type", this.LJIIIZ);
        String str4 = this.LJIIJ;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        LIZ("product_source", str4);
        String str6 = this.LJIIJJI;
        if (str6 != null) {
            LIZ("source_from", str6);
        }
        String str7 = this.LJIIL;
        if (str7 == null) {
            str7 = "";
        }
        LIZ("source", str7);
        String str8 = this.LJIILIIL;
        if (str8 != null) {
            str5 = str8;
        }
        LIZ("product_id", str5);
        LIZ("is_self", String.valueOf(this.LJIILJJIL));
        LIZ("is_single_anchor", this.LJIILL);
        LIZ("is_ad", String.valueOf(this.LJIILLIIL));
        LIZ("ad_id", this.LJIIZILJ);
        LIZ("creative_id", this.LJIJ);
        LIZ("page_name", this.LJIJJLI);
        Integer num = this.LJIJJ;
        if (num != null) {
            LIZ("follow_status", String.valueOf(num.intValue()));
        }
        LIZ("entrance_form", this.LJIJI);
        LIZ("anchor_tag", this.LJIL);
        LIZ("biz_type", this.LJJ);
        LIZ("is_mix_product", this.LJJIL);
        LIZ("shopping_status", this.LJJIZ);
        LIZ("click_opportunity", this.LJLLL);
        LIZ("source_page_type", this.LJLLJ);
        LIZ("track_id", this.LJJJI);
        LIZ("rec_session_id", this.LJJJIL);
        LIZ("campaign_id", this.LJJJJ);
        LIZ("campaign_type", this.LJJJJI);
        LIZ("campaign_user_tag", this.LJJJJIZL);
        LIZ("campaign_channel", this.LJJJJJ);
        LIZ("coupon_type", this.LJJJJJL);
        LIZ("coupon_type_info", this.LJJJJL);
        LIZ("coupon_id", this.LJJJJLI);
        LIZ("coupon_type_id", this.LJJJJLL);
        LIZ("coupon_cost_role", this.LJJJJZ);
        LIZ("use_cache", "null");
        String str9 = null;
        LIZ("image_url", null);
        LIZ("is_first_show", String.valueOf(this.LJJJJZI));
        LIZ("click_method", this.LJJLIIIJJIZ);
        LIZ("multi_anchor_display", String.valueOf(this.LJJLIIIJL));
        LIZ("landing_page", this.LJJLIIIJLJLI);
        LIZ("rights_cnt", this.LJLLLL);
        LIZ("rights_content", this.LJLLLLLL);
        String str10 = this.LJLJL;
        if (str10 != null) {
            LIZ("previous_page", str10);
        }
        String str11 = this.LJZL;
        if (str11 != null) {
            LIZ("search_entrance", str11);
        }
        Integer num2 = this.LJLZ;
        if (num2 != null) {
            num2.intValue();
            Integer num3 = this.LJLZ;
            if (num3 != null) {
                str2 = num3.toString();
            } else {
                str2 = null;
            }
            LIZ("aweme_type", str2);
        }
        Integer num4 = this.LJZ;
        if (num4 != null) {
            num4.intValue();
            Integer num5 = this.LJZ;
            if (num5 != null) {
                str = num5.toString();
            } else {
                str = null;
            }
            LIZ("pic_cnt", str);
        }
        Integer num6 = this.LJZI;
        if (num6 != null) {
            num6.intValue();
            Integer num7 = this.LJZI;
            if (num7 != null) {
                str9 = num7.toString();
            }
            LIZ("rank", str9);
        }
        String str12 = this.LJJIFFI;
        if (str12 != null) {
            LIZ("source_page_type", str12);
        }
        String str13 = this.LJLLI;
        if (str13 != null) {
            LIZ("product_type", str13);
        }
        String str14 = this.LJLL;
        if (str14 != null) {
            LIZ("enter_from_info", str14);
        }
        String str15 = this.LJLJLLL;
        if (str15 != null) {
            LIZ("source_content_id", str15);
        }
        String str16 = this.LJLJLJ;
        if (str16 != null) {
            LIZ("cart_form", str16);
        }
        String str17 = this.LJJZ;
        if (str17 != null) {
            LIZ("sku_id", str17);
        }
        String str18 = this.LJJZZI;
        if (str18 != null) {
            LIZ("is_single_sku", str18);
        }
        String str19 = this.LJJZZIII;
        if (str19 != null) {
            LIZ("original_price", str19);
        }
        String str20 = this.LJJLL;
        if (str20 != null) {
            LIZ("source_button", str20);
        }
        String str21 = this.LJL;
        if (str21 != null) {
            LIZ("sale_price", str21);
        }
        String str22 = this.LJLILLLLZI;
        if (str22 != null) {
            LIZ("cart_item_id", str22);
        }
        String str23 = this.LJLJI;
        if (str23 != null) {
            LIZ("fail_reason", str23);
        }
        String str24 = this.LJLJJI;
        if (str24 != null) {
            LIZ("add_sku_num", str24);
        }
        String str25 = this.LJLJJL;
        if (str25 != null) {
            LIZ("sku_num_before", str25);
        }
        String str26 = this.LJLJJLL;
        if (str26 != null) {
            LIZ("sku_num_after", str26);
        }
        String str27 = this.LJJLIIIJILLIZJL;
        if (str27 != null) {
            LIZ("click_area", str27);
        }
        Integer num8 = this.LJJLIIIJJI;
        if (num8 != null) {
            num8.intValue();
            LIZ("anchor_animation", String.valueOf(this.LJJLIIIJJI));
        }
        Integer num9 = this.LJJLIIIJ;
        if (num9 != null) {
            LIZ("anchor_type_cnt", String.valueOf(num9.intValue()));
        }
        String str28 = this.LJJLIIJ;
        if (str28 != null) {
            LIZ("flashsale_status", str28);
        }
        String str29 = this.LJJLIIIJLLLLLLLZ;
        if (str29 != null) {
            LIZ("countdown_type", str29);
        }
        String str30 = this.LJJLIL;
        if (str30 != null) {
            LIZ("is_free_shipping", str30);
        }
        String str31 = this.LJJLJ;
        if (str31 != null) {
            LIZ("promotion_label_level", str31);
        }
        LIZ("entrance_info", this.LJLLILLLL);
        LIZ("module_name", this.LJJJ);
        LIZ("rd_extra", this.LL);
        LIZ("info_list", this.LJJJLIIL);
        LIZ("video_shopping_list_style", String.valueOf(this.LJJJLL));
        LIZ("pure_ecommerce", String.valueOf(this.LJJJLZIJ));
        LIZ("is_all_closed_loop_product", String.valueOf(this.LJJJZ));
        LIZ("volume", this.LJJL);
        LIZ("volume_type", this.LJJLIIIIJ);
        LIZ("inherited_volume", this.LJJLI);
        String str32 = this.LJJII;
        if (str32 != null) {
            LIZ("list_name", str32);
        }
        String str33 = this.LJJIII;
        if (str33 != null) {
            LIZ("enter_list_form", str33);
        }
        Integer num10 = this.LJJIIJ;
        if (num10 != null) {
            num10.intValue();
            LIZ("stay_time", String.valueOf(this.LJJIIJ));
        }
        Integer num11 = this.LJJIIJZLJL;
        if (num11 != null) {
            num11.intValue();
            LIZ("is_load_data", String.valueOf(this.LJJIIJZLJL));
        }
        String str34 = this.LJJIIZ;
        if (str34 != null) {
            LIZ("quit_type", str34);
        }
        String str35 = this.LJJIIZI;
        if (str35 != null) {
            LIZ("anchor_type", str35);
        }
        Integer num12 = this.LJJIJ;
        if (num12 != null) {
            num12.intValue();
            LIZ("product_cnt", String.valueOf(this.LJJIJ));
        }
        Integer num13 = this.LJJIJIIJI;
        if (num13 != null) {
            num13.intValue();
            LIZ("product_show_cnt", String.valueOf(this.LJJIJIIJI));
        }
        String str36 = this.LJJIJIIJIL;
        if (str36 != null) {
            LIZ("product_ids", str36);
        }
        LIZ("duration", this.LJJIJIL);
        Integer num14 = this.LJJIJL;
        if (num14 != null) {
            num14.intValue();
            LIZ("is_success", String.valueOf(this.LJJIJL));
        }
        String str37 = this.LJJIJLIJ;
        if (str37 != null) {
            LIZ("item_order", str37);
        }
        String str38 = this.LJJLJLI;
        if (str38 != null) {
            LIZ("item_order", str38);
        }
        String str39 = this.LJLI;
        if (str39 != null) {
            LIZ("original_price_value", str39);
        }
        String str40 = this.LJLIIIL;
        if (str40 != null) {
            LIZ("sale_price_value", str40);
        }
        String str41 = this.LJLIIL;
        if (str41 != null) {
            LIZ("currency", str41);
        }
        Integer num15 = this.LJLIL;
        if (num15 != null) {
            LIZ("is_add_maybe_you_like", String.valueOf(num15.intValue()));
        }
        String str42 = this.LLF;
        if (str42 != null) {
            LIZ("is_content_truncate", str42);
        }
        String str43 = this.LLFF;
        if (str43 != null) {
            LIZ("anchor_content_size", str43);
        }
        LIZ("traceparent", PII.LIZIZ());
        java.util.Map<String, String> map = this.LJJI;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!LLFFF.contains(key)) {
                    o.LJIIIZ(key, "key");
                    if (!this.LIZIZ.containsKey(key)) {
                    }
                }
                String value = entry.getValue();
                InterfaceC71397S0j.LIZ.getClass();
                LIZ(key, value);
            }
        }
        java.util.Map<String, String> map2 = this.LLD;
        if (map2 != null) {
            for (Map.Entry entry2 : ((HashMap) map2).entrySet()) {
                String str44 = (String) entry2.getKey();
                String str45 = (String) entry2.getValue();
                InterfaceC71397S0j.LIZ.getClass();
                LIZ(str44, str45);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71368Rzg(String event) {
        super(event);
        o.LJIIIZ(event, "event");
    }
}
