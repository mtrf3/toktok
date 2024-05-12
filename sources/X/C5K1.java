package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.5K1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5K1 {
    public final java.util.Map<String, CaptionCachesModel> LIZ;

    public final ArrayList<OSZ<String, String>> LIZ() {
        ArrayList<OSZ<String, String>> arrayList = new ArrayList<>();
        for (Map.Entry<String, CaptionCachesModel> entry : this.LIZ.entrySet()) {
            arrayList.add(new OSZ<>(entry.getKey(), GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), entry.getValue())));
        }
        return arrayList;
    }

    public C5K1() {
        this.LIZ = new HashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5K1(ArrayList<OSZ<String, String>> list) {
        this();
        o.LJIIIZ(list, "list");
        HashMap hashMap = new HashMap();
        Iterator<OSZ<String, String>> it = list.iterator();
        while (it.hasNext()) {
            OSZ<String, String> next = it.next();
            String first = next.getFirst();
            Object fromJson = GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), next.getSecond(), (Class<Object>) CaptionCachesModel.class);
            o.LJIIIIZZ(fromJson, "getAPI().getGson().fromJ…nCachesModel::class.java)");
            hashMap.put(first, fromJson);
        }
        this.LIZ = hashMap;
    }

    public final CaptionQueryInfo LIZIZ(String language) {
        o.LJIIIZ(language, "language");
        CaptionCachesModel captionCachesModel = this.LIZ.get(language);
        if (captionCachesModel != null) {
            return captionCachesModel.captionQueryInfo;
        }
        return null;
    }

    public final ArrayList<CaptionUtterance> LIZJ(String language) {
        o.LJIIIZ(language, "language");
        CaptionCachesModel captionCachesModel = this.LIZ.get(language);
        if (captionCachesModel != null) {
            return captionCachesModel.captionsList;
        }
        return null;
    }

    public final void LIZLLL(String language, ArrayList<CaptionUtterance> arrayList, CaptionQueryInfo captionQueryInfo) {
        o.LJIIIZ(language, "language");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InlineCaptionCaches -> language = ");
        LIZ.append(language);
        LIZ.append(", list.size = ");
        LIZ.append(arrayList.size());
        LIZ.append('}');
        H78.LIZ(X1D.LIZIZ(LIZ));
        if (arrayList.isEmpty()) {
            ((HashMap) this.LIZ).remove(language);
            return;
        }
        if (captionQueryInfo != null) {
            ((HashMap) this.LIZ).put(language, new CaptionCachesModel(captionQueryInfo, arrayList));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        CaptionCachesModel captionCachesModel = (CaptionCachesModel) ((HashMap) this.LIZ).get(language);
        if (captionCachesModel == null) {
            return;
        }
        captionCachesModel.captionsList = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r2.isEmpty() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r5, java.util.ArrayList<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData> r6, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo r7) {
        /*
            r4 = this;
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            int r0 = r5.length()
            if (r0 != 0) goto Lc
            return
        Lc:
            r3 = 0
            if (r6 == 0) goto L28
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r6)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L2a
        L1a:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel> r0 = r4.LIZ
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L2a
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel> r0 = r4.LIZ
            r0.remove(r5)
            return
        L28:
            r2 = r3
            goto L1a
        L2a:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel> r0 = r4.LIZ
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L4b
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel> r0 = r4.LIZ
            java.lang.Object r0 = r0.get(r5)
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel r0 = (com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel) r0
            if (r0 == 0) goto L4a
            if (r7 != 0) goto L40
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo r7 = r0.captionQueryInfo
        L40:
            r0.captionQueryInfo = r7
            if (r2 == 0) goto L48
            java.util.ArrayList r3 = X.C78841Uwv.LJJJI(r2)
        L48:
            r0.captionsList = r3
        L4a:
            return
        L4b:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel> r1 = r4.LIZ
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel r0 = new com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel
            if (r2 == 0) goto L55
            java.util.ArrayList r3 = X.C78841Uwv.LJJJI(r2)
        L55:
            r0.<init>(r7, r3)
            r1.put(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5K1.LJ(java.lang.String, java.util.ArrayList, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo):void");
    }
}
