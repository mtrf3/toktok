package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse;
import com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.T8v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74165T8v extends AbstractC51036K1g<Aweme, VoiceConversionDetailsResponse> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(T91.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(T9G.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        VoiceConversionStruct voiceConversionStruct;
        VoiceConversionDetailsResponse voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) this.mData;
        if (voiceConversionDetailsResponse != null && (voiceConversionStruct = voiceConversionDetailsResponse.videoDetail) != null) {
            return voiceConversionStruct.videoList;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        List<Aweme> items;
        VoiceConversionStruct voiceConversionStruct;
        Integer num;
        VoiceConversionDetailsResponse voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) this.mData;
        if ((voiceConversionDetailsResponse == null || (voiceConversionStruct = voiceConversionDetailsResponse.videoDetail) == null || (num = voiceConversionStruct.hasMore) == null || num.intValue() != 1) && ((items = getItems()) == null || items.isEmpty())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        VoiceConversionStruct voiceConversionStruct;
        Integer num;
        VoiceConversionDetailsResponse voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) this.mData;
        if (voiceConversionDetailsResponse == null || (voiceConversionStruct = voiceConversionDetailsResponse.videoDetail) == null || (num = voiceConversionStruct.hasMore) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length >= 3) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final boolean deleteItem(Aweme aweme) {
        return C78996UzQ.LJIIIIZZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse] */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        VoiceConversionStruct voiceConversionStruct;
        VoiceConversionStruct voiceConversionStruct2;
        int i;
        VoiceConversionStruct voiceConversionStruct3;
        Integer num;
        VoiceConversionStruct voiceConversionStruct4;
        List<Aweme> list;
        List arrayList;
        VoiceConversionStruct voiceConversionStruct5;
        List<Aweme> list2;
        List<Aweme> list3;
        Integer num2;
        VoiceConversionStruct voiceConversionStruct6;
        long j;
        VoiceConversionStruct voiceConversionStruct7;
        Long l;
        ?? r9 = (VoiceConversionDetailsResponse) obj;
        INM inm = (INM) this.LJLILLLLZI.getValue();
        if (inm.LJLJJI) {
            long j2 = inm.LJLILLLLZI;
            if (j2 == 0) {
                String str = inm.LJLIL;
                int i2 = inm.LJLJI;
                if (r9 != 0 && (voiceConversionStruct7 = r9.videoDetail) != null && (l = voiceConversionStruct7.videoCount) != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                }
                LruCache<String, C74168T8y> lruCache = C44457Hcb.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append('&');
                LIZ.append(j2);
                LIZ.append('&');
                LIZ.append(i2);
                LIZ.append('&');
                LIZ.append(j);
                lruCache.put(X1D.LIZIZ(LIZ), new C74168T8y(r9, System.currentTimeMillis()));
            }
        }
        Long l2 = null;
        if (r9 != 0) {
            voiceConversionStruct = r9.videoDetail;
        } else {
            voiceConversionStruct = null;
        }
        if (voiceConversionStruct != null) {
            List<Aweme> list4 = voiceConversionStruct.videoList;
            if (list4 == null || !list4.isEmpty() || (num2 = voiceConversionStruct.hasMore) == null || num2.intValue() != 0) {
                List<Aweme> list5 = voiceConversionStruct.videoList;
                if (list5 != null) {
                    int i3 = 0;
                    for (Aweme aweme : list5) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            Aweme R1 = AwemeService.LIZ().R1(aweme);
                            if (R1 != null && (list3 = voiceConversionStruct.videoList) != null) {
                                ListProtector.set(list3, i3, R1);
                            }
                            i3 = i4;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
            } else {
                VoiceConversionDetailsResponse voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) this.mData;
                if (voiceConversionDetailsResponse != null && (voiceConversionStruct6 = voiceConversionDetailsResponse.videoDetail) != null) {
                    voiceConversionStruct6.hasMore = 0;
                    return;
                }
                return;
            }
        }
        int i5 = this.mListQueryType;
        if (i5 != 1) {
            if (i5 != 4) {
                return;
            }
            if (voiceConversionStruct != null && (list = voiceConversionStruct.videoList) != null) {
                VoiceConversionDetailsResponse voiceConversionDetailsResponse2 = (VoiceConversionDetailsResponse) this.mData;
                if (voiceConversionDetailsResponse2 != null && (voiceConversionStruct5 = voiceConversionDetailsResponse2.videoDetail) != null && (list2 = voiceConversionStruct5.videoList) != null && list2.isEmpty()) {
                    VoiceConversionStruct voiceConversionStruct8 = ((VoiceConversionDetailsResponse) this.mData).videoDetail;
                    if (voiceConversionStruct8 != null) {
                        voiceConversionStruct8.videoList = list;
                    }
                } else {
                    VoiceConversionStruct voiceConversionStruct9 = ((VoiceConversionDetailsResponse) this.mData).videoDetail;
                    if (voiceConversionStruct9 == null || (arrayList = voiceConversionStruct9.videoList) == null) {
                        arrayList = new ArrayList();
                    }
                    C56544MHc.LIZ(arrayList, list, C68972nF.LJLIL);
                }
            }
            VoiceConversionDetailsResponse voiceConversionDetailsResponse3 = (VoiceConversionDetailsResponse) this.mData;
            if (voiceConversionDetailsResponse3 != null && (voiceConversionStruct4 = voiceConversionDetailsResponse3.videoDetail) != null) {
                if (voiceConversionStruct != null) {
                    l2 = voiceConversionStruct.cursor;
                }
                new VoiceConversionStruct(voiceConversionStruct4.voiceId, voiceConversionStruct4.description, voiceConversionStruct4.iconUrl, voiceConversionStruct4.previewAudioUrl, voiceConversionStruct4.showCreatorProfile, voiceConversionStruct4.creatorUserId, voiceConversionStruct4.creatorUserName, voiceConversionStruct4.videoCount, voiceConversionStruct4.videoList, voiceConversionStruct4.hasMore, l2);
            }
            VoiceConversionDetailsResponse voiceConversionDetailsResponse4 = (VoiceConversionDetailsResponse) this.mData;
            if (voiceConversionDetailsResponse4 == null || (voiceConversionStruct2 = voiceConversionDetailsResponse4.videoDetail) == null) {
                return;
            }
            if (voiceConversionStruct == null || (i = voiceConversionStruct.hasMore) == null) {
                if (voiceConversionDetailsResponse4 != null && (voiceConversionStruct3 = voiceConversionDetailsResponse4.videoDetail) != null && (num = voiceConversionStruct3.hasMore) != null) {
                    num.intValue();
                }
                i = 0;
            }
            voiceConversionStruct2.hasMore = i;
            return;
        }
        this.mData = r9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        VoiceConversionDetailsResponse voiceConversionDetailsResponse;
        VoiceConversionStruct voiceConversionStruct;
        Long l;
        long longValue;
        o.LJIIIZ(params, "params");
        Object obj = params[1];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        if (isDataEmpty() || (voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) this.mData) == null || (voiceConversionStruct = voiceConversionDetailsResponse.videoDetail) == null || (l = voiceConversionStruct.cursor) == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        LJIIIZ(longValue, str, false);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length >= 6) {
            Object obj = params[1];
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = params[5];
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            LJIIIZ(0L, (String) obj, ((Boolean) obj2).booleanValue());
            return;
        }
        Object obj3 = params[1];
        o.LJII(obj3, "null cannot be cast to non-null type kotlin.String");
        LJIIIZ(0L, (String) obj3, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse] */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<Aweme> list) {
        VoiceConversionStruct voiceConversionStruct;
        T t = this.mData;
        int i = 1;
        if (t == 0) {
            this.mData = new VoiceConversionDetailsResponse(null, null, null, new VoiceConversionStruct(null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, false, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, list, i, null == true ? 1 : 0, 1279, null == true ? 1 : 0), 7, null);
            return;
        }
        VoiceConversionDetailsResponse voiceConversionDetailsResponse = (VoiceConversionDetailsResponse) t;
        if (voiceConversionDetailsResponse == null || (voiceConversionStruct = voiceConversionDetailsResponse.videoDetail) == null) {
            return;
        }
        voiceConversionStruct.hasMore = 1;
        voiceConversionStruct.videoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(long r8, java.lang.String r10, boolean r11) {
        /*
            r7 = this;
            X.Ol8 r0 = r7.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            X.INM r0 = (X.INM) r0
            r0.getClass()
            r0.LJLIL = r10
            r0.LJLILLLLZI = r8
            r5 = 20
            r0.LJLJI = r5
            r0 = 0
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto Lad
            if (r11 != 0) goto Lad
        L1c:
            T r0 = r7.mData
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse r0 = (com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse) r0
            if (r0 == 0) goto Laa
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionStruct r0 = r0.videoDetail
            if (r0 == 0) goto Laa
            java.lang.Long r0 = r0.videoCount
            if (r0 == 0) goto Laa
            long r1 = r0.longValue()
        L2e:
            android.util.LruCache<java.lang.String, X.T8y> r4 = X.C44457Hcb.LIZ
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            r3.append(r10)
            r0 = 38
            r3.append(r0)
            r3.append(r8)
            r3.append(r0)
            r3.append(r5)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = X.X1D.LIZIZ(r3)
            java.lang.Object r5 = r4.get(r0)
            X.T8y r5 = (X.C74168T8y) r5
            if (r5 == 0) goto Lad
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r5.LIZIZ
            long r3 = r3 - r0
            r0 = 15000(0x3a98, float:2.102E-41)
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lad
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse r1 = r5.LIZ
        L67:
            r3 = 0
            if (r1 == 0) goto L8e
            X.Ol8 r0 = r7.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            X.INM r0 = (X.INM) r0
            r0.LJLJJI = r3
            android.os.Message r3 = new android.os.Message
            r3.<init>()
            r3.obj = r1
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            r2.<init>(r0)
            Y.ARunnableS22S0200000_3 r1 = new Y.ARunnableS22S0200000_3
            r0 = 0
            r1.<init>(r7, r3, r0)
            r2.post(r1)
        L8d:
            return
        L8e:
            if (r6 != 0) goto L9b
            X.Ol8 r0 = r7.LJLILLLLZI
            java.lang.Object r1 = r0.getValue()
            X.INM r1 = (X.INM) r1
            r0 = 1
            r1.LJLJJI = r0
        L9b:
            X.FGR r2 = X.FGR.LIZIZ()
            com.bytedance.common.utility.collection.WeakHandler r1 = r7.mHandler
            X.T8z r0 = new X.T8z
            r0.<init>(r7, r10, r8)
            r2.LIZ(r1, r0, r3)
            goto L8d
        Laa:
            r1 = -1
            goto L2e
        Lad:
            r1 = 0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74165T8v.LJIIIZ(long, java.lang.String, boolean):void");
    }
}
