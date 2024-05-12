package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: X.JXi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49322JXi extends JSR {
    @Override // X.JSR
    public final void LJFF() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.JSR
    public final void LJI() {
        EventBus.LIZJ().LJIJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49322JXi(JTS bulletContext) {
        super(bulletContext);
        o.LJIIIZ(bulletContext, "bulletContext");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onExitTabHorizontalVideo(C2WP event) {
        List<DynamicPatch.SearchHorizontalTab> list;
        boolean z;
        o.LJIIIZ(event, "event");
        ActivityC45651qj activityC45651qj = this.LJLIL.LIZIZ;
        if (activityC45651qj != null && o.LJ(C50989Jzl.LJ(), activityC45651qj)) {
            JTS jts = this.LJLIL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("index", event.LJLILLLLZI);
            jSONObject.put("tab_index", event.LJLIL);
            C50340JpI c50340JpI = jts.LJIILLIIL;
            if (c50340JpI != null) {
                c50340JpI.LIZ("onExitTabHorizontalVideo", jSONObject);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" onExitTabHorizontalVideo ");
            DynamicPatch dynamicPatch = this.LJLIL.LJII;
            if (dynamicPatch != null) {
                list = dynamicPatch.getTabMap();
            } else {
                list = null;
            }
            int i = 0;
            if (list != null) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            LIZ.append(' ');
            ActivityC45651qj activityC45651qj2 = this.LJLIL.LIZIZ;
            if (activityC45651qj2 != null) {
                i = activityC45651qj2.hashCode();
            }
            LIZ.append(i);
            X1D.LIZIZ(LIZ);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onTransferSearchHorizontalEvent(C49323JXj event) {
        String str;
        long j;
        long j2;
        Integer num;
        int i;
        boolean z;
        Long l;
        Boolean bool;
        Integer num2;
        o.LJIIIZ(event, "event");
        ActivityC45651qj activityC45651qj = this.LJLIL.LIZIZ;
        if (activityC45651qj != null && o.LJ(event.LJLJJI, String.valueOf(activityC45651qj.hashCode()))) {
            JTS jts = this.LJLIL;
            JSONObject jSONObject = new JSONObject();
            SearchHorizontalData searchHorizontalData = event.LJLIL;
            if (searchHorizontalData == null || (str = searchHorizontalData.rawDataDiff) == null) {
                str = "";
            }
            jSONObject.put("raw_data_diff", str);
            C50062Jko c50062Jko = event.LJLILLLLZI;
            long j3 = -1;
            if (c50062Jko != null) {
                j = c50062Jko.LJI;
            } else {
                j = -1;
            }
            jSONObject.put("cursor", j);
            C50062Jko c50062Jko2 = event.LJLILLLLZI;
            if (c50062Jko2 != null) {
                j2 = c50062Jko2.LJII;
            } else {
                j2 = 0;
            }
            jSONObject.put("count", j2);
            SearchHorizontalData searchHorizontalData2 = event.LJLIL;
            String str2 = null;
            if (searchHorizontalData2 != null) {
                num = Integer.valueOf(searchHorizontalData2.status_code);
            } else {
                num = null;
            }
            jSONObject.put("code", num);
            SearchHorizontalData searchHorizontalData3 = event.LJLIL;
            if (searchHorizontalData3 != null) {
                str2 = searchHorizontalData3.status_msg;
            }
            jSONObject.put("err_msg", str2);
            C50062Jko c50062Jko3 = event.LJLILLLLZI;
            int i2 = 0;
            if (c50062Jko3 != null && (num2 = c50062Jko3.LJIIIZ) != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            jSONObject.put("tab_index", i);
            SearchHorizontalData searchHorizontalData4 = event.LJLIL;
            boolean z2 = true;
            if (searchHorizontalData4 != null && (bool = searchHorizontalData4.hasMore) != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            jSONObject.put("has_more", z);
            SearchHorizontalData searchHorizontalData5 = event.LJLIL;
            if (searchHorizontalData5 != null && (l = searchHorizontalData5.newCursor) != null) {
                j3 = l.longValue();
            }
            jSONObject.put("new_cursor", j3);
            jSONObject.put("total_video_count", event.LJLJI);
            jts.LIZ("TransferSearchHorizontalData", jSONObject);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" onTransferSearchHorizontalEvent ");
            DynamicPatch dynamicPatch = this.LJLIL.LJII;
            if (dynamicPatch == null || dynamicPatch.getTabMap() == null) {
                z2 = false;
            }
            LIZ.append(z2);
            LIZ.append(' ');
            ActivityC45651qj activityC45651qj2 = this.LJLIL.LIZIZ;
            if (activityC45651qj2 != null) {
                i2 = activityC45651qj2.hashCode();
            }
            LIZ.append(i2);
            X1D.LIZIZ(LIZ);
        }
    }
}
