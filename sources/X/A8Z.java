package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class A8Z implements View.OnClickListener {
    public final /* synthetic */ AnchorCommonStruct LJLIL;
    public final /* synthetic */ C188727au LJLILLLLZI;
    public final /* synthetic */ InterfaceC44105HSr LJLJI;
    public final /* synthetic */ C25732A8a LJLJJI;
    public final /* synthetic */ Activity LJLJJL;
    public final /* synthetic */ HashMap<String, String> LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public A8Z(AnchorCommonStruct anchorCommonStruct, C188727au c188727au, InterfaceC44105HSr interfaceC44105HSr, C25732A8a c25732A8a, Activity activity, HashMap<String, String> hashMap, String str) {
        this.LJLIL = anchorCommonStruct;
        this.LJLILLLLZI = c188727au;
        this.LJLJI = interfaceC44105HSr;
        this.LJLJJI = c25732A8a;
        this.LJLJJL = activity;
        this.LJLJJLL = hashMap;
        this.LJLJL = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        AnchorCommonStruct anchorCommonStruct = this.LJLIL;
        Activity activity = this.LJLJJL;
        HashMap<String, String> hashMap = this.LJLJJLL;
        InterfaceC44105HSr interfaceC44105HSr = this.LJLJI;
        String str4 = this.LJLJL;
        C25732A8a c25732A8a = this.LJLJJI;
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, anchorCommonStruct.getSchema());
        buildRoute.withParam("anchor_event_map", hashMap);
        buildRoute.withParam("author_id", interfaceC44105HSr.LJJLL().getAuthorUid());
        String aid = interfaceC44105HSr.LJJLL().getAid();
        String str5 = "";
        if (aid == null) {
            aid = "";
        }
        buildRoute.withParam("group_id", aid);
        buildRoute.withParam("anchor_id", anchorCommonStruct.getId());
        buildRoute.withParam("enter_from", str4);
        String aid2 = interfaceC44105HSr.LJJLL().getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        buildRoute.withParam("from_group_id", aid2);
        buildRoute.withParam("previous_page", str4);
        buildRoute.withParam("collection_id", c25732A8a.LIZ);
        buildRoute.withParam("detail_aweme_from", str4);
        buildRoute.open();
        C188727au c188727au = this.LJLILLLLZI;
        String LJJLIIIJLLLLLLLZ = this.LJLJI.LJJLIIIJLLLLLLLZ();
        c188727au.getClass();
        c188727au.LJIIIZ("enter_method", LJJLIIIJLLLLLLLZ);
        c188727au.LJIIIZ("enter_from", this.LJLJI.LJJLJLI());
        AnchorCommonStruct anchorCommonStruct2 = this.LJLIL;
        String str6 = null;
        if (anchorCommonStruct2 != null) {
            str = anchorCommonStruct2.getKeyword();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("anchor_entry", str);
        String authorUid = this.LJLJI.LJJLL().getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        c188727au.LJIIIZ("author_id", authorUid);
        String aid3 = this.LJLJI.LJJLL().getAid();
        if (aid3 != null) {
            str5 = aid3;
        }
        c188727au.LJIIIZ("group_id", str5);
        c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(this.LJLJI.LJJLL()));
        C254739zB c254739zB = this.LJLJJI.LIZIZ;
        if (c254739zB != null) {
            c188727au.LJI("collection_price", c254739zB.LIZJ);
            C254739zB c254739zB2 = this.LJLJJI.LIZIZ;
            if (c254739zB2 == null || (str3 = c254739zB2.LIZLLL) == null || str3.length() == 0) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str2 = "1";
            }
            c188727au.LJI("is_discounted_flag", str2);
            C254739zB c254739zB3 = this.LJLJJI.LIZIZ;
            if (c254739zB3 != null) {
                str6 = c254739zB3.LIZLLL;
            }
            c188727au.LJI("discount_price", str6);
        }
        FMX.LJIIL("enter_multi_anchor_detail", c188727au.LIZ);
    }
}
