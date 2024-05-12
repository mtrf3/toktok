package X;

import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell$bindEndArea$2", f = "SearchFriendCell.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8UA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8UA extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ SearchFriendCell LJLIL;
    public final /* synthetic */ C227128vk LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8UA(SearchFriendCell searchFriendCell, C227128vk c227128vk, InterfaceC67352kd<? super C8UA> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = searchFriendCell;
        this.LJLILLLLZI = c227128vk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C8UA(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        r4 = "click_cancel_follow";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (ujb.o.LJJJJIZL(r4, r1, true) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r1 != 4) goto L10;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.C141335gf.LIZJ(r7)
            X.7au r3 = new X.7au
            r3.<init>()
            com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell r1 = r6.LJLIL
            X.8vk r0 = r6.LJLILLLLZI
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.LJLIL
            android.view.View r1 = r1.itemView
            r0 = 2131374525(0x7f0a31bd, float:1.8369172E38)
            android.view.View r5 = r1.findViewById(r0)
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            java.lang.String r0 = "itemView.relationButton"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            int r1 = r2.getFollowStatus()
            if (r1 == 0) goto L6f
            java.lang.String r4 = ""
            r2 = 1
            if (r1 == r2) goto L45
            r0 = 2
            if (r1 == r0) goto L6c
            r0 = 4
            if (r1 == r0) goto L67
        L2f:
            java.lang.String r0 = "button_type"
            r3.LJIIIZ(r0, r4)
            X.8vk r0 = r6.LJLILLLLZI
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.LJLILLLLZI
            r3.LJIIIIZZ(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "search_result_click"
            X.FMX.LJIIL(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L45:
            android.content.Context r1 = r5.getContext()
            r0 = 2131830541(0x7f11270d, float:1.9294082E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "relationButton.context.g…String(R.string.followed)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.CharSequence r0 = r5.getText()
            if (r0 == 0) goto L61
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L6a
        L61:
            boolean r0 = ujb.o.LJJJJIZL(r4, r1, r2)
            if (r0 == 0) goto L6c
        L67:
            java.lang.String r4 = "click_cancel_follow"
            goto L2f
        L6a:
            r4 = r0
            goto L61
        L6c:
            java.lang.String r4 = "click_message"
            goto L2f
        L6f:
            boolean r0 = r2.isAccuratePrivateAccount()
            if (r0 == 0) goto L78
            java.lang.String r4 = "click_request"
            goto L2f
        L78:
            java.lang.String r4 = "click_follow_button"
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8UA.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
