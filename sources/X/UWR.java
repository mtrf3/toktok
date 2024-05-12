package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.service.assets.giftlist.colddata.GiftColdData;
import com.bytedance.android.livesdk.service.assets.giftlist.colddata.GiftColdDataResult;
import com.bytedance.android.livesdk.service.assets.giftlist.colddata.GiftColdMetaData;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UWR {
    public final UWO LIZ;
    public volatile GiftColdData LIZIZ;

    public UWR(UWO uwo) {
        this.LIZ = uwo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.3C4, java.lang.Object] */
    public final GiftColdData LIZ(C32420Cnw request) {
        java.util.Map<Long, Gift> map;
        GiftColdData giftColdData;
        String str;
        String LIZIZ;
        File file;
        BufferedReader bufferedReader;
        LinkedHashMap linkedHashMap;
        o.LJIIIZ(request, "request");
        GiftColdData giftColdData2 = this.LIZIZ;
        GiftColdData giftColdData3 = null;
        if (giftColdData2 != null) {
            map = giftColdData2.LIZ;
        } else {
            map = null;
        }
        int i = 0;
        if (map == null || map.isEmpty()) {
            UWO uwo = this.LIZ;
            uwo.getClass();
            try {
                LIZIZ = uwo.LIZIZ(request);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getStaticDataFromFile ");
                LIZ.append(LIZIZ);
                C0NB.LJIIIZ("GiftListCacheFactory", X1D.LIZIZ(LIZ));
                file = new File(LIZIZ);
            } catch (Throwable th) {
                ?? LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
                giftColdData = LIZ2;
            }
            if (!file.exists()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("getStaticDataFromFile ");
                LIZ3.append(LIZIZ);
                LIZ3.append(" is not available");
                C0NB.LJIIIZ("GiftListCacheFactory", X1D.LIZIZ(LIZ3));
                this.LIZIZ = giftColdData3;
            } else {
                Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), PVC.LIZ);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
                }
                try {
                    String LJIILJJIL = C77321UWf.LJIILJJIL(bufferedReader);
                    AnonymousClass636.LJFF(bufferedReader, null);
                    Object value = uwo.LIZ.getValue();
                    o.LJIIIIZZ(value, "<get-gson>(...)");
                    GiftColdDataResult giftColdDataResult = (GiftColdDataResult) ((Gson) value).LJII(LJIILJJIL, new UWW().getType());
                    List<Gift> list = giftColdDataResult.giftList;
                    if (list != null) {
                        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
                        if (LJJIIZ < 16) {
                            LJJIIZ = 16;
                        }
                        linkedHashMap = new LinkedHashMap(LJJIIZ);
                        for (Gift gift : list) {
                            linkedHashMap.put(Long.valueOf(gift.id), gift);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    GiftColdData giftColdData4 = new GiftColdData(linkedHashMap, false, giftColdDataResult.metadata);
                    C3C5.m7constructorimpl(giftColdData4);
                    giftColdData = giftColdData4;
                    if (C3C5.m13isSuccessimpl(giftColdData)) {
                        GiftColdData giftColdData5 = giftColdData;
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("getStaticDataFromFile onSuccess ");
                        java.util.Map<Long, Gift> map2 = giftColdData5.LIZ;
                        if (map2 != null) {
                            i = map2.size();
                        }
                        LIZ4.append(i);
                        LIZ4.append(' ');
                        GiftColdMetaData giftColdMetaData = giftColdData5.metadata;
                        if (giftColdMetaData != null) {
                            str = giftColdMetaData.hash;
                        } else {
                            str = null;
                        }
                        JBR.LJIIJ(LIZ4, str, LIZ4, "GiftListCacheFactory");
                    }
                    Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(giftColdData);
                    if (m10exceptionOrNullimpl == null) {
                        if (!C3C5.m12isFailureimpl(giftColdData)) {
                            giftColdData3 = giftColdData;
                        }
                        giftColdData3 = giftColdData3;
                        this.LIZIZ = giftColdData3;
                    } else {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("getStaticDataFromFile onFailure ");
                        LIZ5.append(m10exceptionOrNullimpl);
                        C0NB.LJ("GiftListCacheFactory", X1D.LIZIZ(LIZ5));
                        throw new UWF("Read file failed", m10exceptionOrNullimpl.getMessage(), null, 4, null);
                    }
                } finally {
                }
            }
        }
        return this.LIZIZ;
    }
}
