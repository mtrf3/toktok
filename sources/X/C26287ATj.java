package X;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.ATj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26287ATj extends C60094NiE {
    public final void LJJJJZI() {
        C188727au c188727au;
        String subType;
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct == null || (c188727au = this.LJLJLJ) == null) {
            return;
        }
        EventBus.LIZJ().LJIILJJIL(this);
        SmartRoute buildRoute = SmartRouter.buildRoute(LJJI(), anchorCommonStruct.getSchema());
        buildRoute.withParam("anchor_event_map", (HashMap) LJJIII(c188727au));
        String authorUid = LJIIIZ().LJJLL().getAuthorUid();
        String str = "";
        if (authorUid == null) {
            authorUid = "";
        }
        buildRoute.withParam("author_id", authorUid);
        String aid = LJIIIZ().LJJLL().getAid();
        if (aid == null) {
            aid = "";
        }
        buildRoute.withParam("group_id", aid);
        buildRoute.withParam("anchor_id", anchorCommonStruct.getId());
        buildRoute.withParam("enter_from", LJJIIZI());
        String aid2 = LJIIIZ().LJJLL().getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        buildRoute.withParam("from_group_id", aid2);
        buildRoute.withParam("previous_page", LJJIIZI());
        buildRoute.withParam("detail_aweme_from", LJJIIZI());
        AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
        if (anchorCommonStruct2 != null && (subType = anchorCommonStruct2.subType()) != null) {
            str = subType;
        }
        buildRoute.withParam("anchor_subtype", str);
        buildRoute.withParam("anchor_click_time", SystemClock.elapsedRealtime());
        buildRoute.open();
    }

    @Override // X.C60094NiE, X.S1E
    public final S1E clone() {
        return new C26287ATj();
    }

    @Override // X.C60094NiE, X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.THIRD_PART_GENERAL.getTYPE();
    }

    @Override // X.C60094NiE, X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) next;
            if (anchorCommonStruct.getType() == type() && o.LJ(anchorCommonStruct.subType(), "ticketmaster_tp")) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC26289ATl.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        arrayList2.remove(anchorCommonStruct2);
        LJJIJL(anchorCommonStruct2);
        LJJ(anchorCommonStruct2);
        this.LJLJJL = anchorCommonStruct2;
        if (arrayList.size() == 1) {
            return EnumC26289ATl.DONE;
        }
        return EnumC26289ATl.PROCEED;
    }

    @Override // X.C60094NiE, X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (!this.LJLJLLL) {
            LJJJJZ();
        }
        this.LJLJLJ = eventMapBuilder;
        HSS.LJJIZ(this, eventMapBuilder, 6);
        if (C25740A8i.LIZ()) {
            LJJJJZI();
        } else {
            LJJJJIZL(new AqS170S0100000_4(this, 951));
        }
    }

    @Override // X.HSS
    public final void LJJJ(C188727au c188727au) {
        Aweme LJJII = LJJII();
        String LJJIIZI = LJJIIZI();
        String LJJIIZ = LJJIIZ();
        if (LJJIIZ.length() == 0) {
            LJJIIZ = "video_anchor";
        }
        c188727au.LJI("enter_method", LJJIIZ);
        C211648Si.LIZ(c188727au, LJJII, LJJIIZI, false);
        FMX.LJIIL("multi_anchor_entrance_click", LJJIII(c188727au));
        if (LJJIJ()) {
            C188727au LJJIJIIJI = LJJIJIIJI();
            LJJIJIIJI.LJIIIZ("enter_method", LJJIIZ);
            LJJIJIIJI.LJIIIZ("enter_from", LJJIIZI);
            LJJIJIIJI.LJIIIZ("author_id", LJJII.getAuthorUid());
            String aid = LJJII.getAid();
            if (aid == null) {
                aid = "";
            }
            LJJIJIIJI.LJIIIZ("group_id", aid);
            LJJIJIIJI.LJIIIZ("music_id", C227768wm.LJIIJJI(LJJII));
            FMX.LJIIL("anchor_entrance_click", LJJIJIIJI.LIZ);
        }
    }

    @Override // X.HSS
    public final void LJJIL(C188727au eventMapBuilder, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        C188727au c188727au = new C188727au();
        Aweme LJJLL = LJIIIZ().LJJLL();
        String LJJLJLI = LJIIIZ().LJJLJLI();
        c188727au.LJIIIZ("enter_method", LJJIIZ());
        c188727au.LJII(new HashMap(eventMapBuilder.LIZ));
        c188727au.LJIIIZ("enter_from", LJJLJLI);
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getKeyword();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("anchor_entry", str);
        String authorUid = LJJLL.getAuthorUid();
        String str4 = "";
        if (authorUid == null) {
            authorUid = "";
        }
        c188727au.LJIIIZ("author_id", authorUid);
        String aid = LJJLL.getAid();
        if (aid != null) {
            str4 = aid;
        }
        c188727au.LJIIIZ("group_id", str4);
        c188727au.LJIIIZ("click_type", "webview");
        c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(LJJLL));
        try {
            C16880lQ.LLLLLLZ(LJJI().getPackageManager(), "com.ticketmaster.mobile.android.na", 0);
            str2 = "1";
        } catch (PackageManager.NameNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("status", str2);
        if (C25740A8i.LIZ()) {
            str3 = "TT_detail_page";
        } else {
            str3 = "weblink";
        }
        c188727au.LJIIIZ("page_type", str3);
        FMX.LJIIL("enter_multi_anchor_detail", c188727au.LIZ);
    }
}
