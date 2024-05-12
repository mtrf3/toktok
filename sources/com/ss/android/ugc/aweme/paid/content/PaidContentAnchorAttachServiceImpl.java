package com.ss.android.ugc.aweme.paid.content;

import X.C188727au;
import X.C25589A2n;
import X.C2U8;
import X.C47261Igj;
import X.C58096Mr6;
import X.C7TR;
import X.FMX;
import X.HG3;
import X.JBR;
import X.RBX;
import X.X1D;
import Y.IDLCallbackS106S0200000_7;
import android.content.Context;
import com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class PaidContentAnchorAttachServiceImpl implements IPaidContentAnchorAttachService {
    public static IPaidContentAnchorAttachService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IPaidContentAnchorAttachService.class, false);
        if (LIZ != null) {
            return (IPaidContentAnchorAttachService) LIZ;
        }
        if (C58096Mr6.L3 == null) {
            synchronized (IPaidContentAnchorAttachService.class) {
                if (C58096Mr6.L3 == null) {
                    C58096Mr6.L3 = new PaidContentAnchorAttachServiceImpl();
                }
            }
        }
        return C58096Mr6.L3;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService
    public final void LIZIZ(CollectionDetailModel collectionDetailModel, int i) {
        if (collectionDetailModel != null) {
            JSONObject jSONObject = new JSONObject();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("aweme://paidcontent/collections/detail?collection_id=");
            LIZ.append(collectionDetailModel.getCollectionId());
            String LIZIZ = X1D.LIZIZ(LIZ);
            o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        …              .toString()");
            jSONObject.put("third_id", String.valueOf(collectionDetailModel.getCollectionId()));
            String jSONObject2 = jSONObject.toString();
            String collectionName = collectionDetailModel.getCollectionName();
            o.LJIIIIZZ(jSONObject2, "toString()");
            C2U8.LIZ(new C7TR(new AnchorTransData(i, jSONObject2, collectionName, null, 1, null, null, false, LIZIZ, null, null, null, null, false, 16104, null)));
            C25589A2n.LJIIJJI("add_video_collections_add_link", "video_publish_page", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, collectionDetailModel, null, null, null, null, null, null, 66584572);
        }
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IPaidContentAnchorAttachService
    public final void LIZ(Context context, String enterFrom, List collections) {
        o.LJIIIZ(collections, "collections");
        o.LJIIIZ(enterFrom, "enterFrom");
        ArrayList arrayList = new ArrayList();
        Iterator it = collections.iterator();
        while (it.hasNext()) {
            CollectionDetailModel collectionDetailModel = (CollectionDetailModel) it.next();
            if (collectionDetailModel != null) {
                JSONObject jSONObject = new JSONObject();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("aweme://paidcontent/collections/detail?collection_id=");
                LIZ.append(collectionDetailModel.getCollectionId());
                String LIZIZ = X1D.LIZIZ(LIZ);
                o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        …              .toString()");
                try {
                    jSONObject.put("third_id", String.valueOf(collectionDetailModel.getCollectionId()));
                } catch (Exception unused) {
                }
                String jSONObject2 = jSONObject.toString();
                String collectionName = collectionDetailModel.getCollectionName();
                o.LJIIIIZZ(jSONObject2, "toString()");
                arrayList.add(new AnchorTransData(55, jSONObject2, collectionName, null, 1, null, null, false, LIZIZ, null, null, null, null, false, 16104, null));
            }
        }
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("guide_post_anchor");
        builder.setAutoSelectedAnchorList(arrayList);
        AVExternalServiceImpl.LIZ().asyncService(context, "guide_post_anchor", new IDLCallbackS106S0200000_7(context, builder, 21));
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : collections) {
            int i2 = i + 1;
            Long l = null;
            if (i >= 0) {
                CollectionDetailModel collectionDetailModel2 = (CollectionDetailModel) obj;
                if (i > 0) {
                    sb.append(",");
                }
                if (collectionDetailModel2 != null) {
                    l = Long.valueOf(collectionDetailModel2.getCollectionId());
                }
                sb.append(String.valueOf(l));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String sb2 = sb.toString();
        C188727au LJIIIIZZ = JBR.LJIIIIZZ("enter_from", enterFrom, "author_id", ((RBX) HG3.LJIILL()).getCurUserId());
        LJIIIIZZ.LJI("selected_collection_id_list", sb2);
        FMX.LJIIL("click_submit_series_to_post", LJIIIIZZ.LIZ);
    }
}
