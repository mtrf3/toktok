package X;

import androidx.appcompat.widget.AppCompatTextView;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerConversationViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS162S0100000_12;

/* renamed from: X.SFa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71778SFa extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ;
    public final C71785SFh LJFF = C71785SFh.LJLIL;
    public final int LJI = 50;
    public final /* synthetic */ SellerConversationViewHolder LJII;

    @Override // X.AbstractC13940gg
    public final java.util.Map LJFF() {
        String str;
        String str2;
        String str3;
        Long l;
        String l2;
        Integer num;
        Integer num2;
        Long l3;
        OSZ[] oszArr = new OSZ[12];
        int i = 0;
        oszArr[0] = new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        C27474AqM c27474AqM = this.LJII.LJLILLLLZI;
        if (c27474AqM == null || (str = c27474AqM.LJLILLLLZI) == null) {
            str = "notification_page";
        }
        int i2 = 1;
        oszArr[1] = new OSZ("enter_from", str);
        int i3 = 2;
        oszArr[2] = new OSZ("page_name", "shop_message");
        C111434Yx item = this.LJII.getItem();
        if (item != null && item.LJLJLLL) {
            str2 = "collaborator_message";
        } else {
            str2 = "tiktok shops";
        }
        oszArr[3] = new OSZ("account_type", str2);
        oszArr[4] = new OSZ("notification_type", "official");
        oszArr[5] = new OSZ("action_type", "show");
        int bindingAdapterPosition = this.LJII.getBindingAdapterPosition();
        C27474AqM c27474AqM2 = this.LJII.LJLILLLLZI;
        if (c27474AqM2 == null || !c27474AqM2.LJLJJL) {
            i3 = 5;
        }
        oszArr[6] = new OSZ("client_order", String.valueOf(bindingAdapterPosition - i3));
        C111434Yx item2 = this.LJII.getItem();
        String str4 = "";
        if (item2 == null || (l3 = item2.LJLJLJ) == null || (str3 = l3.toString()) == null) {
            str3 = "";
        }
        oszArr[7] = new OSZ("message_time", str3);
        C111434Yx item3 = this.LJII.getItem();
        if (item3 != null && (num2 = item3.LJLJJLL) != null && num2.intValue() > 0) {
            i2 = 0;
        }
        oszArr[8] = new OSZ("is_read", String.valueOf(i2));
        oszArr[9] = new OSZ("timeline", ((AppCompatTextView) this.LJII._$_findCachedViewById(R.id.time)).getText().toString());
        C111434Yx item4 = this.LJII.getItem();
        if (item4 != null && (num = item4.LJLJJLL) != null) {
            i = num.intValue();
        }
        oszArr[10] = new OSZ("notice_number", String.valueOf(i));
        C111434Yx item5 = this.LJII.getItem();
        if (item5 != null && (l = item5.LJLIL) != null && (l2 = l.toString()) != null) {
            str4 = l2;
        }
        oszArr[11] = new OSZ("content_id", str4);
        HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(oszArr);
        C27474AqM c27474AqM3 = this.LJII.LJLILLLLZI;
        if (c27474AqM3 != null) {
            LJJJLZIJ.putAll(c27474AqM3.LIZ());
        }
        return LJJJLZIJ;
    }

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC13940gg
    public final int LIZIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJ;
    }

    public C71778SFa(SellerConversationViewHolder sellerConversationViewHolder) {
        this.LJII = sellerConversationViewHolder;
        this.LJ = new AqS162S0100000_12(sellerConversationViewHolder, 209);
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
