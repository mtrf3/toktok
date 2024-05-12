package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C188727au;
import X.C227738wj;
import X.C50420Jqa;
import X.C54838Lfe;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC65784Pro;
import X.InterfaceC72642tA;
import X.InterfaceC88472Yns;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public class AqS0S3400000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S3400000_1 aqS0S3400000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.q8v, new AqS0S3400000_1((InterfaceC72642tA) aqS0S3400000_1.l3, (Aweme) aqS0S3400000_1.l4, (Context) aqS0S3400000_1.l5, aqS0S3400000_1.s0, aqS0S3400000_1.s1, aqS0S3400000_1.s2, (InterfaceC65784Pro) aqS0S3400000_1.l6, 1));
        actionGroup.LJ(R.string.q8x, new AqS1S3300000_1((InterfaceC72642tA) aqS0S3400000_1.l3, (Aweme) aqS0S3400000_1.l4, aqS0S3400000_1.s0, aqS0S3400000_1.s1, aqS0S3400000_1.s2, (InterfaceC65784Pro) aqS0S3400000_1.l6, 6));
        actionGroup.LJIIIIZZ(R.string.cg_, new AqS3S3100000_1(aqS0S3400000_1.s0, aqS0S3400000_1.s1, aqS0S3400000_1.s2, (Aweme) aqS0S3400000_1.l4, 0));
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S3400000_1 aqS0S3400000_1, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        InterfaceC72642tA interfaceC72642tA = (InterfaceC72642tA) aqS0S3400000_1.l3;
        if (interfaceC72642tA != null) {
            interfaceC72642tA.onInternalEvent(new C50420Jqa(2, (Aweme) aqS0S3400000_1.l4));
        }
        IAVDraftService draftService = AVExternalServiceImpl.LIZ().draftService();
        Context context = (Context) aqS0S3400000_1.l5;
        String aid = ((Aweme) aqS0S3400000_1.l4).getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        draftService.editPostedDraft(context, aid);
        C227738wj.LJ(true, (Aweme) aqS0S3400000_1.l4, aqS0S3400000_1.s0, aqS0S3400000_1.s1, aqS0S3400000_1.s2, true, 32);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS0S3400000_1.l6;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        Aweme aweme = (Aweme) aqS0S3400000_1.l4;
        String enterFrom = aqS0S3400000_1.s0;
        String tabName = aqS0S3400000_1.s1;
        String imprId = aqS0S3400000_1.s2;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(tabName, "tabName");
        o.LJIIIZ(imprId, "imprId");
        if (C54838Lfe.LJIIZILJ(aweme)) {
            str = "story";
        } else {
            str = "post";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("impr_id", imprId);
        c188727au.LJIIIZ("story_type", str);
        c188727au.LJ(C227738wj.LJI(aweme), "item_vv");
        c188727au.LIZLLL(1, "is_posted_draft");
        c188727au.LJIIIZ("tab_name", tabName);
        FMX.LJIIL("click_delete_and_edit_draft", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS0S3400000_1(InterfaceC72642tA interfaceC72642tA, InterfaceC72642tA<C50420Jqa> interfaceC72642tA2, Aweme aweme, Context context, String str, String str2, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l3 = interfaceC72642tA;
        this.l4 = interfaceC72642tA2;
        this.l5 = aweme;
        this.s0 = context;
        this.s1 = str;
        this.s2 = str2;
        this.l6 = str3;
    }
}
