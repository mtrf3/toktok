package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftBottomContainerAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C248929po extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ SeriesDraftBottomContainerAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C248929po(SeriesDraftBottomContainerAssem seriesDraftBottomContainerAssem) {
        super(1);
        this.LJLIL = seriesDraftBottomContainerAssem;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        boolean z;
        String str2;
        ActivityC45651qj LIZ;
        String str3;
        Intent intent;
        Bundle LLJJIJI;
        String str4;
        Intent intent2;
        Bundle LLJJIJI2;
        Intent intent3;
        Bundle LLJJIJI3;
        String string;
        Intent intent4;
        Bundle LLJJIJI4;
        Intent intent5;
        Bundle LLJJIJI5;
        String it = str;
        o.LJIIIZ(it, "it");
        SY4 sy4 = this.LJLIL.LJLL;
        if (sy4 != null) {
            sy4.setLoading(false);
        }
        SeriesDraftBottomContainerAssem seriesDraftBottomContainerAssem = this.LJLIL;
        String str5 = seriesDraftBottomContainerAssem.H3().getState().LL;
        String str6 = this.LJLIL.H3().getState().LJZL;
        if (this.LJLIL.H3().getState().LJZI == EnumC248719pT.CREATE) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (C78685UuP.LJJJZ(str6)) {
            if (o.LJ(str5, "manage_page")) {
                ActivityC45651qj LIZ2 = C212428Vi.LIZ(seriesDraftBottomContainerAssem);
                if (LIZ2 != null) {
                    LIZ2.finish();
                }
            } else {
                C39061g6 c39061g6 = new C39061g6(str6);
                ActivityC45651qj LIZ3 = C212428Vi.LIZ(seriesDraftBottomContainerAssem);
                String str7 = "";
                if (LIZ3 == null || (intent5 = LIZ3.getIntent()) == null || (LLJJIJI5 = C16880lQ.LLJJIJI(intent5)) == null || (str2 = LLJJIJI5.getString("enter_from")) == null) {
                    str2 = "";
                }
                c39061g6.LIZIZ("enter_from", str2);
                ActivityC45651qj LIZ4 = C212428Vi.LIZ(seriesDraftBottomContainerAssem);
                if ((LIZ4 == null || (intent4 = LIZ4.getIntent()) == null || (LLJJIJI4 = C16880lQ.LLJJIJI(intent4)) == null || (str3 = LLJJIJI4.getString("entry_point")) == null) && ((LIZ = C212428Vi.LIZ(seriesDraftBottomContainerAssem)) == null || (intent = LIZ.getIntent()) == null || (LLJJIJI = C16880lQ.LLJJIJI(intent)) == null || (str3 = LLJJIJI.getString("enter_manage_from")) == null)) {
                    str3 = "series_dashboard";
                }
                c39061g6.LIZIZ("entry_point", str3);
                ActivityC45651qj LIZ5 = C212428Vi.LIZ(seriesDraftBottomContainerAssem);
                if (LIZ5 != null && (intent3 = LIZ5.getIntent()) != null && (LLJJIJI3 = C16880lQ.LLJJIJI(intent3)) != null && (string = LLJJIJI3.getString("enter_manage_from")) != null) {
                    str7 = string;
                }
                c39061g6.LIZIZ("enter_manage_from", str7);
                ActivityC45651qj LIZ6 = C212428Vi.LIZ(seriesDraftBottomContainerAssem);
                if ((LIZ6 != null && (intent2 = LIZ6.getIntent()) != null && (LLJJIJI2 = C16880lQ.LLJJIJI(intent2)) != null && LLJJIJI2.getBoolean("is_new_collection")) || o.LJ(valueOf, Boolean.TRUE)) {
                    str4 = "true";
                } else {
                    str4 = "false";
                }
                c39061g6.LIZIZ("is_new_collection", str4);
                SmartRouter.buildRoute(EF7.LIZIZ(), c39061g6.LIZJ()).open();
            }
        } else {
            SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://paidcontent/draftsuccess");
            buildRoute.withParam("collection_id", it);
            buildRoute.withParam("enter_from", str5);
            buildRoute.open();
        }
        ActivityC45651qj LIZ7 = C212428Vi.LIZ(seriesDraftBottomContainerAssem);
        if (LIZ7 != null) {
            LIZ7.finish();
        }
        return C76800UCe.LIZ;
    }
}
