package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* renamed from: X.K6z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51185K6z<TTaskResult, TContinuationResult> implements C10I {
    public static final C51185K6z<TTaskResult, TContinuationResult> LIZ = new C51185K6z<>();

    @Override // X.C10I
    public final Object then(C10K c10k) {
        SearchSugResponse searchSugResponse;
        List<SearchSugEntity> list;
        if (c10k.LJIILIIL()) {
            String rawData = (String) c10k.LJIIJJI();
            if (!TextUtils.isEmpty(rawData)) {
                System.currentTimeMillis();
                o.LJIIIIZZ(rawData, "rawData");
                Integer num = null;
                try {
                    searchSugResponse = (SearchSugResponse) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), rawData, SearchSugResponse.class);
                    if (searchSugResponse != null) {
                        o.LJIIIIZZ(searchSugResponse.sugList, "response.sugList");
                        if (!r1.isEmpty()) {
                            long nanoTime = System.nanoTime();
                            long j = K70.LIZ;
                            long j2 = nanoTime - j;
                            C62822Ol8 c62822Ol8 = K4Y.LIZLLL;
                            ((Keva) c62822Ol8.getValue()).storeLong("cache_time", System.currentTimeMillis());
                            ((Keva) c62822Ol8.getValue()).storeString("cache_response", rawData);
                            long nanoTime2 = System.nanoTime() - j;
                            if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
                                C30581Hy.LJJJIL(j2, K74.DAYS);
                            } else {
                                long j3 = nanoTime2 - j2;
                                if (((j3 ^ nanoTime2) & (~(j3 ^ j2))) < 0) {
                                    long j4 = 1000000;
                                    long LJJJIL = C30581Hy.LJJJIL((nanoTime2 / j4) - (j2 / j4), K74.MILLISECONDS);
                                    long LJJJIL2 = C30581Hy.LJJJIL((nanoTime2 % j4) - (j2 % j4), K74.NANOSECONDS);
                                    if (K72.LJFF(LJJJIL)) {
                                        if (!(!K72.LJFF(LJJJIL2)) && (LJJJIL2 ^ LJJJIL) < 0) {
                                            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
                                        }
                                    } else if (!K72.LJFF(LJJJIL2)) {
                                        int i = ((int) LJJJIL) & 1;
                                        if (i == (((int) LJJJIL2) & 1)) {
                                            long j5 = (LJJJIL >> 1) + (LJJJIL2 >> 1);
                                            if (i == 0) {
                                                if (!new UIW(-4611686018426999999L, 4611686018426999999L).LJIIIZ(j5)) {
                                                    C30581Hy.LJIIL(j5 / j4);
                                                }
                                            } else if (!new UIW(-4611686018426L, 4611686018426L).LJIIIZ(j5)) {
                                                C30581Hy.LJIIL(C78842Uww.LJIILIIL(j5, -4611686018427387903L, 4611686018427387903L));
                                            }
                                        } else if (i == 1) {
                                            K72.LIZJ(LJJJIL >> 1, LJJJIL2 >> 1);
                                        } else {
                                            K72.LIZJ(LJJJIL2 >> 1, LJJJIL >> 1);
                                        }
                                    }
                                } else {
                                    C30581Hy.LJJJIL(j3, K74.NANOSECONDS);
                                }
                            }
                        }
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                    searchSugResponse = null;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("get cache from server:");
                if (searchSugResponse != null && (list = searchSugResponse.sugList) != null) {
                    num = Integer.valueOf(list.size());
                }
                LIZ2.append(num);
                X1D.LIZIZ(LIZ2);
                K4Y.LIZ(searchSugResponse);
            }
        }
        return C76800UCe.LIZ;
    }
}
