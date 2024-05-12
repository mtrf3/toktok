package X;

import android.content.Context;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.returnpolicy.PdpReturnPolicyHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.returnpolicy.PdpReturnPolicyHolder$onBind$2", f = "PdpReturnPolicyHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Ad5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26651Ad5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C26670AdO LJLIL;
    public final /* synthetic */ PdpReturnPolicyHolder LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26651Ad5(C26670AdO c26670AdO, PdpReturnPolicyHolder pdpReturnPolicyHolder, InterfaceC67352kd<? super C26651Ad5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c26670AdO;
        this.LJLILLLLZI = pdpReturnPolicyHolder;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26651Ad5(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<LinkRichText> list;
        LinkRichText linkRichText;
        C141335gf.LIZJ(obj);
        C26670AdO c26670AdO = this.LJLIL;
        String str = null;
        if (c26670AdO.LJLILLLLZI != null) {
            PdpReturnPolicyHolder pdpReturnPolicyHolder = this.LJLILLLLZI;
            TextView textView = (TextView) pdpReturnPolicyHolder.itemView.findViewById(R.id.j00);
            PDPReturnPolicyModule pDPReturnPolicyModule = c26670AdO.LJLILLLLZI;
            if (pDPReturnPolicyModule != null) {
                str = pDPReturnPolicyModule.title;
            }
            textView.setText(str);
            PDPReturnPolicyModule pDPReturnPolicyModule2 = c26670AdO.LJLILLLLZI;
            if (pDPReturnPolicyModule2 != null && (list = pDPReturnPolicyModule2.descriptionList) != null && (linkRichText = (LinkRichText) ORZ.LJLLLL(list)) != null) {
                TextView textView2 = (TextView) pdpReturnPolicyHolder.itemView.findViewById(R.id.j01);
                RichTextUtil richTextUtil = RichTextUtil.LIZ;
                Context context = pdpReturnPolicyHolder.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                textView2.setText(RichTextUtil.LIZJ(richTextUtil, context, linkRichText, null, 0, false, null, null, 124));
            }
        } else {
            PdpReturnPolicyHolder pdpReturnPolicyHolder2 = this.LJLILLLLZI;
            ((TextView) pdpReturnPolicyHolder2.itemView.findViewById(R.id.j00)).setText(c26670AdO.LJLIL.name);
            UserRight userRight = c26670AdO.LJLIL;
            if (userRight.userRightDetails != null) {
                ExposeUserRightPanel exposeUserRightPanel = userRight.exposeUserRightPanel;
                if (exposeUserRightPanel != null && exposeUserRightPanel.description != null) {
                    ((TextView) pdpReturnPolicyHolder2.itemView.findViewById(R.id.j01)).setText(c26670AdO.LJLIL.exposeUserRightPanel.description);
                } else {
                    TextView textView3 = (TextView) pdpReturnPolicyHolder2.itemView.findViewById(R.id.j01);
                    o.LJIIIIZZ(textView3, "itemView.return_policies_desc");
                    List<UserRightDetail> list2 = c26670AdO.LJLIL.userRightDetails;
                    ArrayList arrayList = new ArrayList();
                    for (UserRightDetail userRightDetail : list2) {
                        if (o.LJ(userRightDetail.expose, Boolean.TRUE)) {
                            arrayList.add(userRightDetail);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = ((UserRightDetail) it.next()).name;
                        if (str2 != null) {
                            arrayList2.add(str2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        boolean z = false;
                        String str3 = "";
                        while (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            if (z) {
                                str4 = i0.LJFF(" · ", str4);
                            }
                            OUP.LJJIJIIJI(textView3, str4);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(str3);
                            LIZ.append(str4);
                            str3 = X1D.LIZIZ(LIZ);
                            z = true;
                        }
                        textView3.setText(str3);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
