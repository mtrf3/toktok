package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jac, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49430Jac implements InterfaceC49419JaR {
    public final ViewGroup LIZ;
    public SearchUser LIZIZ;
    public final View LIZJ;
    public InterfaceC49431Jad LIZLLL;
    public final AqS158S0100000_8 LJ;
    public volatile boolean LJFF;

    @Override // com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceView
    public final void trackVisible() {
        ProductGroup productGroup;
        Integer num;
        String str;
        SearchUser searchUser = this.LIZIZ;
        if (searchUser == null || (productGroup = searchUser.productGroup) == null || (num = productGroup.shopType) == null) {
            return;
        }
        if (num.intValue() == 1) {
            str = "tiktokec_showcase_entrance_show";
        } else if (num.intValue() != 2) {
            return;
        } else {
            str = "tiktokec_shop_entrance_show";
        }
        SearchUser searchUser2 = this.LIZIZ;
        if (searchUser2 == null) {
            return;
        }
        C48658J7u.LIZIZ(str, LIZ(searchUser2));
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceView
    public final View getView() {
        return this.LIZJ;
    }

    public C49430Jac(ViewGroup parent) {
        View LIZ;
        o.LJIIIZ(parent, "parent");
        this.LIZ = parent;
        this.LJ = new AqS158S0100000_8(this, 560);
        Z9N z9n = Z9N.LIZIZ;
        if (z9n.LJJJJI()) {
            LIZ = z9n.LJJJJ(R.layout.chk, parent);
        } else {
            LIZ = C28289B8j.LIZ(parent, R.layout.chk, parent, false);
        }
        this.LIZJ = LIZ;
    }

    public final JSONObject LIZ(SearchUser searchUser) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String LIZ;
        C50433Jqn searchCommonModel;
        User user;
        ProductGroup productGroup;
        Integer num;
        ProductGroup productGroup2;
        JSONObject LJ = C47135Ieh.LJ("EVENT_ORIGIN_FEATURE", "TEMAI", "enter_from", "general_search");
        LJ.put("page_name", "general_search");
        LJ.put("entrance_type", "user_card");
        SearchUser searchUser2 = this.LIZIZ;
        String str8 = null;
        if (searchUser2 != null && (productGroup2 = searchUser2.productGroup) != null) {
            str = productGroup2.shopId;
        } else {
            str = null;
        }
        LJ.put("shop_id", str);
        SearchUser searchUser3 = this.LIZIZ;
        if (searchUser3 != null && (productGroup = searchUser3.productGroup) != null && (num = productGroup.authorType) != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    str2 = "normal";
                } else {
                    str2 = "channel";
                }
            } else {
                str2 = "official";
            }
        } else {
            str2 = null;
        }
        LJ.put("author_type", str2);
        SearchUser searchUser4 = this.LIZIZ;
        if (searchUser4 != null && (user = searchUser4.user) != null) {
            str3 = user.getUid();
        } else {
            str3 = null;
        }
        LJ.put("author_id", str3);
        User user2 = searchUser.user;
        if (user2 != null) {
            str8 = user2.getUid();
        }
        if (TextUtils.equals(str8, ((RBX) HG3.LJIILL()).getCurUserId())) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LJ.put("is_self", str4);
        InterfaceC49431Jad interfaceC49431Jad = this.LIZLLL;
        String str9 = "";
        if (interfaceC49431Jad == null || (str5 = interfaceC49431Jad.LIZLLL()) == null) {
            str5 = "";
        }
        LJ.put("search_result_id", str5);
        InterfaceC49431Jad interfaceC49431Jad2 = this.LIZLLL;
        if (interfaceC49431Jad2 == null || (str6 = interfaceC49431Jad2.LIZJ()) == null) {
            str6 = "";
        }
        LJ.put("search_id", str6);
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view = this.LIZJ;
        c50651JuJ.getClass();
        C50650JuI LJI = C50651JuJ.LJI(view);
        if (LJI == null || (searchCommonModel = LJI.getSearchCommonModel()) == null || (str7 = searchCommonModel.getEnterFrom()) == null) {
            str7 = "";
        }
        LJ.put("search_entrance", str7);
        InterfaceC49431Jad interfaceC49431Jad3 = this.LIZLLL;
        if (interfaceC49431Jad3 != null && (LIZ = interfaceC49431Jad3.LIZ()) != null) {
            str9 = LIZ;
        }
        LJ.put("last_from_group_id", str9);
        User user3 = searchUser.user;
        if (user3 != null) {
            i = user3.getFollowStatus();
        } else {
            i = -1;
        }
        LJ.put("follow_status", i);
        return LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindData(com.ss.android.ugc.aweme.discover.model.SearchUser r8) {
        /*
            r7 = this;
            r7.LIZIZ = r8
            android.view.View r1 = r7.LIZJ
            r4 = 0
            if (r1 == 0) goto L20
            r0 = 2131376111(0x7f0a37ef, float:1.8372389E38)
            android.view.View r2 = r1.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            if (r2 == 0) goto L20
            Y.ACListenerS28S0100000_8 r1 = new Y.ACListenerS28S0100000_8
            r0 = 63
            r1.<init>(r7, r0)
            X.C16880lQ.LJIL(r2, r1)
            r0 = 0
            X.C78897Uxp.LJJJJJL(r2, r0)
        L20:
            android.view.View r1 = r7.LIZJ
            if (r1 == 0) goto L31
            r0 = 2131379596(0x7f0a458c, float:1.8379457E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
        L2d:
            r6 = 1
            if (r8 == 0) goto L39
            goto L33
        L31:
            r2 = r4
            goto L2d
        L33:
            com.ss.android.ugc.aweme.search.ecom.data.ProductGroup r0 = r8.productGroup     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L39
            java.lang.Integer r4 = r0.shopType     // Catch: java.lang.Throwable -> L94
        L39:
            r3 = 2131821451(0x7f11038b, float:1.9275646E38)
            if (r4 != 0) goto L41
        L3e:
            if (r2 != 0) goto L50
            goto L8e
        L41:
            int r0 = r4.intValue()     // Catch: java.lang.Throwable -> L94
            if (r0 != r6) goto L48
            goto L62
        L48:
            int r1 = r4.intValue()     // Catch: java.lang.Throwable -> L94
            r0 = 2
            if (r1 != r0) goto L3e
            goto L65
        L50:
            android.view.ViewGroup r0 = r7.LIZ     // Catch: java.lang.Throwable -> L94
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> L94
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = r0.getString(r3)     // Catch: java.lang.Throwable -> L94
            r2.setText(r0)     // Catch: java.lang.Throwable -> L94
            goto L8e
        L62:
            if (r2 != 0) goto L7d
            goto L8e
        L65:
            if (r2 != 0) goto L68
            goto L8e
        L68:
            android.view.ViewGroup r0 = r7.LIZ     // Catch: java.lang.Throwable -> L94
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> L94
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Throwable -> L94
            r0 = 2131821450(0x7f11038a, float:1.9275644E38)
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L94
            r2.setText(r0)     // Catch: java.lang.Throwable -> L94
            goto L8e
        L7d:
            android.view.ViewGroup r0 = r7.LIZ     // Catch: java.lang.Throwable -> L94
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> L94
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = r0.getString(r3)     // Catch: java.lang.Throwable -> L94
            r2.setText(r0)     // Catch: java.lang.Throwable -> L94
        L8e:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L94
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L94
            goto L9c
        L94:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L9c:
            android.view.View r1 = r7.LIZJ
            if (r1 == 0) goto Ld4
            r0 = 2131379597(0x7f0a458d, float:1.837946E38)
            android.view.View r5 = r1.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto Ld4
            r4 = 0
            if (r8 == 0) goto Le8
            com.ss.android.ugc.aweme.search.ecom.data.ProductGroup r0 = r8.productGroup
            if (r0 == 0) goto Le8
            java.lang.Integer r0 = r0.total
            if (r0 == 0) goto Le8
            int r3 = r0.intValue()
        Lba:
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r2 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r4] = r0
            r0 = 2131689491(0x7f0f0013, float:1.9007999E38)
            java.lang.String r0 = r2.getQuantityString(r0, r3, r1)
            r5.setText(r0)
        Ld4:
            boolean r0 = r7.LJFF
            if (r0 != 0) goto Le7
            r7.LJFF = r6
            java.lang.String r1 = "entrance_form"
            java.lang.String r0 = "search_usercard_showcase_entrance"
            org.json.JSONObject r1 = X.C65232Piu.LIZJ(r1, r0)
            java.lang.String r0 = "rd_ec_product_entrance_did_show"
            X.C48658J7u.LIZIZ(r0, r1)
        Le7:
            return
        Le8:
            r3 = 0
            goto Lba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49430Jac.bindData(com.ss.android.ugc.aweme.discover.model.SearchUser):void");
    }
}
