package X;

import Y.AfS59S0200000_10;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.IMPublicResourceRequestExt;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.PublicResourceRequest;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.SingleResourceRefreshReq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Olb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62851Olb extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public final /* synthetic */ C62853Old LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62851Olb(C62853Old c62853Old) {
        super(1);
        this.LJLIL = c62853Old;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        Object obj;
        int value;
        IMPublicResourceRequestExt iMPublicResourceRequestExt;
        String str;
        Long LJJIZ;
        String str2;
        C62853Old c62853Old = this.LJLIL;
        if (!c62853Old.LJIIJ.get()) {
            C61902ORe LIZLLL = c62853Old.LIZLLL();
            List LLILLL = ORZ.LLILLL(LIZLLL.LIZIZ, LIZLLL.LIZ);
            if (!LLILLL.isEmpty() && c62853Old.LJIIJ.compareAndSet(false, true)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = LLILLL.iterator();
                while (true) {
                    Long l = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    BaseTemplate LJIILL = C1DJ.LJIILL((C109544Rq) next);
                    if (LJIILL instanceof AwemeCardTemplate) {
                        l = C38350F3i.LJJIZ(((AwemeCardTemplate) LJIILL).baseVideoComponent.id);
                    } else if ((LJIILL instanceof StickerTemplate) && (str2 = ((StickerTemplate) LJIILL).LLLL().queryData.extras.get("a:sticker_id")) != null) {
                        l = C38350F3i.LJJIZ(str2);
                    }
                    Object obj2 = linkedHashMap.get(l);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(l, obj2);
                    }
                    ((List) obj2).add(next);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    Long l2 = (Long) entry2.getKey();
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        C109544Rq c109544Rq = (C109544Rq) ORZ.LJLLLLLL(0, (List) entry2.getValue());
                        if (c109544Rq != null) {
                            obj = C1DJ.LJIIL(c109544Rq);
                        } else {
                            obj = null;
                        }
                        if (obj instanceof AwemeCardTemplate) {
                            arrayList.add(new SingleResourceRefreshReq(EnumC46515INj.PUBLICRESOURCESCENE_SHAREVIDEO.getValue(), Long.valueOf(longValue), null, 4, null));
                        } else if (obj instanceof StickerTemplate) {
                            StickerTemplate stickerTemplate = (StickerTemplate) obj;
                            String str3 = stickerTemplate.LLLL().queryData.extras.get("a:sticker_type");
                            if (o.LJ(str3, String.valueOf(EnumC73222u6.VIDEO_STICKER_STATIC.getType())) || o.LJ(str3, String.valueOf(EnumC73222u6.VIDEO_STICKER_ANIMATED.getType()))) {
                                value = EnumC46515INj.PUBLICRESOURCESCENE_VIDEO2STICKER.getValue();
                            } else {
                                value = EnumC46515INj.PUBLICRESOURCESCENE_STICKERSET.getValue();
                            }
                            if (value == EnumC46515INj.PUBLICRESOURCESCENE_STICKERSET.getValue() && (str = stickerTemplate.LLLL().queryData.extras.get("a:sticker_set_id")) != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                                iMPublicResourceRequestExt = new IMPublicResourceRequestExt(LJJIZ);
                            } else {
                                iMPublicResourceRequestExt = null;
                            }
                            arrayList.add(new SingleResourceRefreshReq(value, Long.valueOf(longValue), iMPublicResourceRequestExt));
                        }
                    }
                }
                c62853Old.LJIIL = (C73411SrX) C30U.LIZ().refreshPublicResources(new PublicResourceRequest(arrayList)).LJJJLIIL(new AfS59S0200000_10(c62853Old, linkedHashMap2, 1), new AfS59S0200000_10(c62853Old, LLILLL, 2));
            }
        }
        C62853Old c62853Old2 = this.LJLIL;
        if (!c62853Old2.LJIIIZ.get()) {
            C61902ORe c61902ORe = c62853Old2.LJI;
            List LLILLL2 = ORZ.LLILLL(c61902ORe.LIZIZ, c61902ORe.LIZ);
            C61902ORe c61902ORe2 = c62853Old2.LJFF;
            List LLILLL3 = ORZ.LLILLL(c61902ORe2.LIZIZ, c61902ORe2.LIZ);
            C51652KOy LJJJLZIJ = OJ4.LJJJLZIJ(OJ4.LJJJJ(ORZ.LJLIIIL(LLILLL2), new AqS176S0100000_10(c62853Old2, 139)), LLILLL3);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            C51651KOx c51651KOx = new C51651KOx(LJJJLZIJ);
            while (c51651KOx.LIZ()) {
                Object next2 = c51651KOx.next();
                linkedHashMap3.put(Long.valueOf(((C109544Rq) next2).getMsgId()), next2);
            }
            List LLJI = ORZ.LLJI(linkedHashMap3.values());
            if (LLJI.isEmpty()) {
                c62853Old2.LJI.LIZ();
            } else {
                c62853Old2.LJIIIZ.set(true);
                c62853Old2.LIZJ.LIZLLL(new C62852Olc(c62853Old2, LLJI, LLILLL2, LLILLL3), c62853Old2.LIZ, LLJI);
            }
        }
        return C76800UCe.LIZ;
    }
}
