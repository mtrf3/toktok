package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareProductContent;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Iq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107204Iq extends AnonymousClass460<ShareProductContent> {
    public final View LLIIIL;
    public final C62846OlW LLIIIZ;
    public final C119624mk LLIIJI;
    public final TuxTextView LLIIJLIL;
    public final TuxTextView LLIIL;
    public final TuxTextView LLIILII;
    public final TuxTextView LLIILZL;
    public final C62822Ol8 LLIIZ;
    public final C62822Ol8 LLIL;
    public final C62822Ol8 LLILII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C107204Iq(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        C221108m2.LIZIZ(new AqS151S0100000_1(itemView, 819));
        this.LLIIZ = C221108m2.LIZIZ(C107214Ir.LJLIL);
        this.LLIL = C221108m2.LIZIZ(new AqS148S0200000_1(this, itemView, 31));
        this.LLILII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 818));
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        this.LLIIIL = findViewById;
        View findViewById2 = itemView.findViewById(R.id.i6d);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.product_picture)");
        this.LLIIIZ = (C62846OlW) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.jnj);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.seller_avatar)");
        this.LLIIJI = (C119624mk) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.jnu);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.seller_name)");
        this.LLIIJLIL = (TuxTextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.i6k);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.product_title)");
        this.LLIIL = (TuxTextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.i6e);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.product_price)");
        this.LLIILII = (TuxTextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.i6h);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.product_sales)");
        this.LLIILZL = (TuxTextView) findViewById7;
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        o.LJIIIZ(msg, "msg");
        View view = this.LLIIIL;
        GradientDrawable gradientDrawable = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable, c49v);
        view.setBackground(gradientDrawable);
        C4AH c4ah = c49v.LIZ;
        if (c4ah != null) {
            V92 hierarchy = this.LLIIIZ.getHierarchy();
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            hierarchy.LJIL(g0.LJIL(context, c4ah.LJLIL, c4ah.LJLILLLLZI, 0.0f, 0.0f));
        }
    }

    @Override // X.AnonymousClass460
    public final void p0(C109544Rq msg, C109544Rq c109544Rq, ShareProductContent shareProductContent, int i) {
        ShareProductContent shareProductContent2 = shareProductContent;
        o.LJIIIZ(msg, "msg");
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 53);
        }
        if (shareProductContent2 == null) {
            return;
        }
        UrlModel picture = shareProductContent2.getPicture();
        ViewGroup.LayoutParams layoutParams = this.LLIIIZ.getLayoutParams();
        if (layoutParams != null) {
            if (picture != null && picture.getWidth() > 0 && picture.getHeight() > 0) {
                layoutParams.height = O6R.LJJIIJZLJL((layoutParams.width / C17N.LJIILL(picture.getWidth())) * C17N.LJIILL(picture.getHeight()));
            } else {
                layoutParams.height = layoutParams.width;
            }
        }
        C4AS.LJI(this.LLIIIZ, shareProductContent2.getPicture(), "ImShareDialog:product", (Drawable) this.LLIL.getValue(), (Drawable) this.LLIL.getValue(), null, null, null, 992);
        C4AS.LJIIIIZZ(this.LLIIJI, shareProductContent2.getSellerAvatar(), "ImShareDialog:product", ((Number) this.LLILII.getValue()).intValue(), ((Number) this.LLILII.getValue()).intValue(), null, null, 0, 0, 992);
        this.LLIIJLIL.setText(shareProductContent2.getSellerName());
        this.LLIIL.setText(shareProductContent2.getTitle());
        this.LLIILII.setText(shareProductContent2.getPrice());
        if (TextUtils.isEmpty(shareProductContent2.getSales())) {
            this.LLIILZL.setVisibility(8);
        } else {
            this.LLIILZL.setText(shareProductContent2.getSales());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C107184Io.LJIIIIZZ(shareProductContent2.getQueryParams()));
        linkedHashMap.put("page_name", "chat_im");
        linkedHashMap.put("source_page_type", "");
        linkedHashMap.put("entrance_form", "product_share_card");
        linkedHashMap.put("enter_from_info", "product_share_im");
        linkedHashMap.put("chat_type", C107184Io.LIZIZ(msg));
        String conversationId = msg.getConversationId();
        o.LJIIIIZZ(conversationId, "message.conversationId");
        linkedHashMap.put("conversation_id", conversationId);
        linkedHashMap.put("from_user_id", Long.valueOf(msg.getSender()));
        linkedHashMap.put("to_user_id", C107184Io.LJ(msg));
        linkedHashMap.put("is_receptor", Integer.valueOf(!TextUtils.equals(String.valueOf(msg.getSender()), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) ? 1 : 0));
        if (linkedHashMap.containsKey("entrance_info")) {
            linkedHashMap.remove("entrance_info");
        }
        FMX.LJIILJJIL("tiktokec_product_show", C107184Io.LJII(linkedHashMap));
    }
}
