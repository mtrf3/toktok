package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiDetails;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem;
import com.ss.android.ugc.aweme.services.publish.EditPostMobParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Xee, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnClickListenerC85352Xee implements View.OnClickListener {
    public final /* synthetic */ PoiPublishExtensionAssem LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C71895SJn LJLJI;

    public ViewOnClickListenerC85352Xee(PoiPublishExtensionAssem poiPublishExtensionAssem, boolean z, C71895SJn c71895SJn) {
        this.LJLIL = poiPublishExtensionAssem;
        this.LJLILLLLZI = z;
        this.LJLJI = c71895SJn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        int indexOfChild;
        Integer num;
        int indexOfChild2;
        if (!this.LJLIL.LJZI.LJII(2)) {
            o.LJIIIIZZ(view, "view");
            C26045AKb c26045AKb = new C26045AKb(view);
            c26045AKb.LJIIIZ(this.LJLIL.LJZI.LJ(view.getContext()));
            c26045AKb.LJIIJ();
            return;
        }
        Object tag = view.getTag();
        o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.PoiData");
        PoiData poiData = (PoiData) tag;
        this.LJLIL.P3().iv0(poiData);
        this.LJLIL.P3().LJLIL = "recommend_poi";
        this.LJLIL.P3().LJLILLLLZI = this.LJLIL.M3();
        this.LJLIL.P3().LJLJI = this.LJLIL.P3().LJLILLLLZI;
        PoiDetails poiDetails = poiData.getPoiDetails();
        if (poiDetails != null) {
            str = poiDetails.getCityCode();
        } else {
            str = null;
        }
        PoiDetails poiDetails2 = poiData.getPoiDetails();
        if (poiDetails2 != null) {
            str2 = poiDetails2.getCountryCode();
        } else {
            str2 = null;
        }
        String poiId = poiData.getPoiId();
        String str3 = "";
        if (poiId == null) {
            poiId = "";
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        String creationId = this.LJLIL.F3().LJLILLLLZI.getMobParam().getCreationId();
        String contentType = this.LJLIL.F3().LJLIL.getContentType();
        String shootWay = this.LJLIL.F3().LJLILLLLZI.getMobParam().getShootWay();
        if (shootWay != null) {
            str3 = shootWay;
        }
        View view2 = this.LJLIL.LJLJJI;
        if (view2 != null) {
            boolean LIZJ = C45243HpH.LIZJ(view2, "content.context");
            if (this.LJLILLLLZI) {
                indexOfChild = this.LJLIL.K3().indexOfChild(this.LJLJI) - 1;
            } else {
                indexOfChild = this.LJLIL.K3().indexOfChild(this.LJLJI);
            }
            String M3 = this.LJLIL.M3();
            String M32 = this.LJLIL.M3();
            EditPostMobParam editPostMobParam = this.LJLIL.F3().LJLILLLLZI.getEditPostMobParam();
            if (editPostMobParam != null) {
                num = editPostMobParam.getAwemeType();
            } else {
                num = null;
            }
            if (this.LJLILLLLZI) {
                indexOfChild2 = this.LJLIL.K3().indexOfChild(this.LJLJI) - 1;
            } else {
                indexOfChild2 = this.LJLIL.K3().indexOfChild(this.LJLJI);
            }
            C225248si.LJI(poiId, str, str2, creationId, contentType, str3, LIZJ ? 1 : 0, indexOfChild, M3, poiData, M32, num, indexOfChild2);
            C85278XdS c85278XdS = C85242Xcs.LIZ;
            if (c85278XdS != null) {
                EnumC85314Xe2 enumC85314Xe2 = EnumC85314Xe2.SELECT_POI_FROM_RECOMMEND;
                JSONObject jSONObject = new JSONObject();
                PoiPublishExtensionAssem poiPublishExtensionAssem = this.LJLIL;
                try {
                    jSONObject.put("poi_id", poiData.getPoiId());
                    C3C5.m7constructorimpl(jSONObject.put("log_id", poiPublishExtensionAssem.LLFFF));
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                ((List) c85278XdS.LIZJ).add(new C79536VJk(enumC85314Xe2, jSONObject.toString()));
            }
            PoiPublishExtensionAssem poiPublishExtensionAssem2 = this.LJLIL;
            Iterator it = ((ArrayList) poiPublishExtensionAssem2.LJLL).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    ((Boolean) next).booleanValue();
                    ListProtector.set(poiPublishExtensionAssem2.LJLL, i, Boolean.FALSE);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("content");
        throw null;
    }
}
