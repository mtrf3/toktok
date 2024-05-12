package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.vision.IPhotoSearchService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes9.dex */
public final class KHI implements InterfaceC70844RrE {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ View LIZIZ;
    public final /* synthetic */ IPhotoSearchService LIZJ;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LIZLLL;
    public final /* synthetic */ PhotoSearchPdpEnterParams LJ;

    @Override // X.InterfaceC70844RrE
    public final void LJFF(int i) {
        JSONObject jSONObject = new JSONObject();
        PhotoSearchPdpEnterParams photoSearchPdpEnterParams = this.LJ;
        jSONObject.put("search_entrance", photoSearchPdpEnterParams.getSearchEntrance());
        jSONObject.put("page_name", photoSearchPdpEnterParams.getPageName());
        jSONObject.put("raw_photo_source", photoSearchPdpEnterParams.getRawPhotoSource());
        jSONObject.put("enter_product_id", photoSearchPdpEnterParams.getEnterProductId());
        jSONObject.put("track_id", photoSearchPdpEnterParams.getTrackId());
        jSONObject.put("rank", i + 1);
        C48658J7u.LIZIZ("find_similar_tab_show", jSONObject);
    }

    @Override // X.InterfaceC70844RrE
    public final void LIZ(View view, JJZ photoModel, int i) {
        String str;
        Object obj;
        String str2;
        List list;
        HashMap<String, Object> trackParams;
        HashMap<String, Object> trackParams2;
        View view2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(photoModel, "photoModel");
        if (!C48203Ivv.LJ(this.LIZ)) {
            C26045AKb c26045AKb = new C26045AKb(this.LIZIZ);
            c26045AKb.LJIIIIZZ(R.string.ha1);
            c26045AKb.LJIIJ();
            return;
        }
        if (photoModel.LIZ() != EnumC48951JJb.PHOTO || !(photoModel instanceof C51462KHq)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        PhotoSearchPdpEnterParams photoSearchPdpEnterParams = this.LJ;
        jSONObject.put("search_entrance", photoSearchPdpEnterParams.getSearchEntrance());
        jSONObject.put("page_name", photoSearchPdpEnterParams.getPageName());
        jSONObject.put("raw_photo_source", photoSearchPdpEnterParams.getRawPhotoSource());
        jSONObject.put("enter_product_id", photoSearchPdpEnterParams.getEnterProductId());
        jSONObject.put("track_id", photoSearchPdpEnterParams.getTrackId());
        jSONObject.put("rank", i + 1);
        C48658J7u.LIZIZ("find_similar_tab_click", jSONObject);
        Object parent = view.getParent();
        Integer num = null;
        if ((parent instanceof FrameLayout) && (view2 = (View) parent) != null) {
            this.LJ.setScreenHeight(Integer.valueOf(view2.getHeight()));
        }
        IPhotoSearchService iPhotoSearchService = this.LIZJ;
        Context context = this.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZLLL;
        if (pdpEnterParam != null && (trackParams2 = pdpEnterParam.getTrackParams()) != null) {
            str = String.valueOf(trackParams2.get("enter_from_info"));
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        IPdpStarter.PdpEnterParam pdpEnterParam2 = this.LIZLLL;
        if (pdpEnterParam2 != null && (trackParams = pdpEnterParam2.getTrackParams()) != null) {
            obj = trackParams.get("traffic_source_list");
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        List LJJIJ = C47261Igj.LJJIJ(6);
        try {
            if (C78685UuP.LJJJZ(valueOf)) {
                list = C61878OQg.INSTANCE;
                try {
                    String substring = s.LJZI(valueOf).toString().substring(1, s.LJJLIIIJ(valueOf));
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    list = s.LJLJJI(substring, new char[]{','}, false, 6);
                } catch (Throwable unused) {
                }
            } else {
                list = C61878OQg.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = LJJIJ.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (list.contains(String.valueOf(intValue))) {
                    arrayList.add(Integer.valueOf(intValue));
                }
            }
            if (!arrayList.isEmpty()) {
                str2 = new JSONArray((Collection) arrayList).toString();
                o.LJIIIIZZ(str2, "{\n                JSONAr….toString()\n            }");
            } else {
                str2 = "[]";
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            str2 = valueOf;
        }
        int value = EnumC51280KAq.PDP_FIND_SIMILAR.getValue();
        String LIZ = SearchServiceImpl.LLLZI().LIZ();
        Activity[] activityStack = ActivityStack.getActivityStack();
        int length = activityStack.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (LiveOuterService.LJJJLL().LJIIZILJ(activityStack[i2]) && !activityStack[i2].isFinishing()) {
                    num = Integer.valueOf(IUO.LIVE.getValue());
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = new PhotoSearchBusinessEnterParams(str, "pdp_main_pic_similar", str2, null, null, null, null, null, null, "product_detail", "", "mall", LIZ, null, null, "tiktok_mall_photo_search", null, null, null, null, value, num, 1008120, null);
        PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(this.LJ.getSearchEntrance(), "product_detail", "", "pdp_main_pic_similar");
        String str4 = ((C51462KHq) photoModel).LIZIZ;
        if (str4 != null) {
            str3 = str4;
        }
        iPhotoSearchService.LJ(context, new PhotoSearchEnterParams(photoSearchBusinessEnterParams, photoSearchLogEnterParams, new PhotoSearchToolsEnterParams(str3, Long.valueOf(System.currentTimeMillis()), "product_detail_photo"), this.LJ));
    }

    public KHI(Context context, View view, IPhotoSearchService iPhotoSearchService, IPdpStarter.PdpEnterParam pdpEnterParam, PhotoSearchPdpEnterParams photoSearchPdpEnterParams) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = iPhotoSearchService;
        this.LIZLLL = pdpEnterParam;
        this.LJ = photoSearchPdpEnterParams;
    }
}
