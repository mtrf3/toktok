package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse;
import com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.T8w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74166T8w extends AbstractC51036K1g<Aweme, TTSVoiceDetailsResponse> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(T9A.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(T9F.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        List<TTSVoiceStruct> list;
        TTSVoiceStruct tTSVoiceStruct;
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) this.mData;
        if (tTSVoiceDetailsResponse != null && (list = tTSVoiceDetailsResponse.ttsVoiceStruct) != null && (tTSVoiceStruct = (TTSVoiceStruct) ORZ.LJLLLL(list)) != null) {
            return tTSVoiceStruct.videoList;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        List<Aweme> items;
        List<TTSVoiceStruct> list;
        TTSVoiceStruct tTSVoiceStruct;
        Integer num;
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) this.mData;
        if ((tTSVoiceDetailsResponse == null || (list = tTSVoiceDetailsResponse.ttsVoiceStruct) == null || (tTSVoiceStruct = (TTSVoiceStruct) ORZ.LJLLLL(list)) == null || (num = tTSVoiceStruct.hasMore) == null || num.intValue() != 1) && ((items = getItems()) == null || items.isEmpty())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        List<TTSVoiceStruct> list;
        TTSVoiceStruct tTSVoiceStruct;
        Integer num;
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) this.mData;
        if (tTSVoiceDetailsResponse == null || (list = tTSVoiceDetailsResponse.ttsVoiceStruct) == null || (tTSVoiceStruct = (TTSVoiceStruct) ORZ.LJLLLL(list)) == null || (num = tTSVoiceStruct.hasMore) == null || num.intValue() != 1) {
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
    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse] */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        TTSVoiceStruct tTSVoiceStruct;
        List<TTSVoiceStruct> list;
        TTSVoiceStruct tTSVoiceStruct2;
        int i;
        List<TTSVoiceStruct> list2;
        TTSVoiceStruct tTSVoiceStruct3;
        Integer num;
        List<TTSVoiceStruct> list3;
        TTSVoiceStruct tTSVoiceStruct4;
        List<Aweme> list4;
        List arrayList;
        TTSVoiceStruct tTSVoiceStruct5;
        List<TTSVoiceStruct> list5;
        TTSVoiceStruct tTSVoiceStruct6;
        List<Aweme> list6;
        TTSVoiceStruct tTSVoiceStruct7;
        Integer num2;
        List<TTSVoiceStruct> list7;
        TTSVoiceStruct tTSVoiceStruct8;
        List<TTSVoiceStruct> list8;
        int i2;
        int i3;
        List<TTSVoiceStruct> list9;
        TTSVoiceStruct tTSVoiceStruct9;
        Integer num3;
        ?? r9 = (TTSVoiceDetailsResponse) obj;
        T90 t90 = (T90) this.LJLILLLLZI.getValue();
        if (t90.LJLJJI && (i2 = t90.LJLILLLLZI) == 0) {
            String str = t90.LJLIL;
            int i4 = t90.LJLJI;
            if (r9 != 0 && (list9 = r9.ttsVoiceStruct) != null && (tTSVoiceStruct9 = (TTSVoiceStruct) ORZ.LJLLLL(list9)) != null && (num3 = tTSVoiceStruct9.videoCount) != null) {
                i3 = num3.intValue();
            } else {
                i3 = -1;
            }
            LruCache<String, C80403Do> lruCache = C80413Dp.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append('&');
            LIZ.append(i2);
            LIZ.append('&');
            LIZ.append(i4);
            LIZ.append('&');
            LIZ.append(i3);
            lruCache.put(X1D.LIZIZ(LIZ), new C80403Do(r9, System.currentTimeMillis()));
        }
        Integer num4 = null;
        if (r9 != 0 && (list8 = r9.ttsVoiceStruct) != null) {
            tTSVoiceStruct = (TTSVoiceStruct) ORZ.LJLLLL(list8);
        } else {
            tTSVoiceStruct = null;
        }
        if (tTSVoiceStruct != null) {
            List<Aweme> list10 = tTSVoiceStruct.videoList;
            if (list10 == null || !list10.isEmpty() || (num2 = tTSVoiceStruct.hasMore) == null || num2.intValue() != 0) {
                List<Aweme> list11 = tTSVoiceStruct.videoList;
                if (list11 != null) {
                    int i5 = 0;
                    for (Aweme aweme : list11) {
                        int i6 = i5 + 1;
                        if (i5 >= 0) {
                            Aweme R1 = AwemeService.LIZ().R1(aweme);
                            o.LJI(R1);
                            List<Aweme> list12 = tTSVoiceStruct.videoList;
                            if (list12 != null) {
                                ListProtector.set(list12, i5, R1);
                            }
                            i5 = i6;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
            } else {
                TTSVoiceDetailsResponse tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) this.mData;
                if (tTSVoiceDetailsResponse != null && (list7 = tTSVoiceDetailsResponse.ttsVoiceStruct) != null && (tTSVoiceStruct8 = (TTSVoiceStruct) ORZ.LJLLLL(list7)) != null) {
                    tTSVoiceStruct8.hasMore = 0;
                    return;
                }
                return;
            }
        }
        int i7 = this.mListQueryType;
        if (i7 != 1) {
            if (i7 != 4) {
                return;
            }
            if (tTSVoiceStruct != null && (list4 = tTSVoiceStruct.videoList) != null) {
                TTSVoiceDetailsResponse tTSVoiceDetailsResponse2 = (TTSVoiceDetailsResponse) this.mData;
                if (tTSVoiceDetailsResponse2 != null && (list5 = tTSVoiceDetailsResponse2.ttsVoiceStruct) != null && (tTSVoiceStruct6 = (TTSVoiceStruct) ORZ.LJLLLL(list5)) != null && (list6 = tTSVoiceStruct6.videoList) != null && list6.isEmpty()) {
                    List<TTSVoiceStruct> list13 = ((TTSVoiceDetailsResponse) this.mData).ttsVoiceStruct;
                    if (list13 != null && (tTSVoiceStruct7 = (TTSVoiceStruct) ORZ.LJLLLL(list13)) != null) {
                        tTSVoiceStruct7.videoList = list4;
                    }
                } else {
                    List<TTSVoiceStruct> list14 = ((TTSVoiceDetailsResponse) this.mData).ttsVoiceStruct;
                    if (list14 == null || (tTSVoiceStruct5 = (TTSVoiceStruct) ORZ.LJLLLL(list14)) == null || (arrayList = tTSVoiceStruct5.videoList) == null) {
                        arrayList = new ArrayList();
                    }
                    C56544MHc.LIZ(arrayList, list4, C68982nG.LJLIL);
                }
            }
            TTSVoiceDetailsResponse tTSVoiceDetailsResponse3 = (TTSVoiceDetailsResponse) this.mData;
            if (tTSVoiceDetailsResponse3 != null && (list3 = tTSVoiceDetailsResponse3.ttsVoiceStruct) != null && (tTSVoiceStruct4 = (TTSVoiceStruct) ORZ.LJLLLL(list3)) != null) {
                if (tTSVoiceStruct != null) {
                    num4 = tTSVoiceStruct.cursor;
                }
                new TTSVoiceStruct(tTSVoiceStruct4.voiceId, tTSVoiceStruct4.description, tTSVoiceStruct4.iconUrl, tTSVoiceStruct4.previewAudioUrl, tTSVoiceStruct4.videoCount, tTSVoiceStruct4.videoList, tTSVoiceStruct4.hasMore, num4, tTSVoiceStruct4.creatorUserId, tTSVoiceStruct4.creatorUserName, tTSVoiceStruct4.showCreatorProfile);
            }
            TTSVoiceDetailsResponse tTSVoiceDetailsResponse4 = (TTSVoiceDetailsResponse) this.mData;
            if (tTSVoiceDetailsResponse4 == null || (list = tTSVoiceDetailsResponse4.ttsVoiceStruct) == null || (tTSVoiceStruct2 = (TTSVoiceStruct) ORZ.LJLLLL(list)) == null) {
                return;
            }
            if (tTSVoiceStruct == null || (i = tTSVoiceStruct.hasMore) == null) {
                TTSVoiceDetailsResponse tTSVoiceDetailsResponse5 = (TTSVoiceDetailsResponse) this.mData;
                if (tTSVoiceDetailsResponse5 != null && (list2 = tTSVoiceDetailsResponse5.ttsVoiceStruct) != null && (tTSVoiceStruct3 = (TTSVoiceStruct) ORZ.LJLLLL(list2)) != null && (num = tTSVoiceStruct3.hasMore) != null) {
                    num.intValue();
                }
                i = 0;
            }
            tTSVoiceStruct2.hasMore = i;
            return;
        }
        this.mData = r9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse;
        List<TTSVoiceStruct> list;
        TTSVoiceStruct tTSVoiceStruct;
        Integer num;
        int intValue;
        o.LJIIIZ(params, "params");
        Object obj = params[1];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        if (isDataEmpty() || (tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) this.mData) == null || (list = tTSVoiceDetailsResponse.ttsVoiceStruct) == null || (tTSVoiceStruct = (TTSVoiceStruct) ORZ.LJLLLL(list)) == null || (num = tTSVoiceStruct.cursor) == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        LJIIIZ(intValue, str, false);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length >= 6) {
            Object obj = params[1];
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = params[5];
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            LJIIIZ(0, (String) obj, ((Boolean) obj2).booleanValue());
            return;
        }
        Object obj3 = params[1];
        o.LJII(obj3, "null cannot be cast to non-null type kotlin.String");
        LJIIIZ(0, (String) obj3, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse] */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<Aweme> list) {
        List<TTSVoiceStruct> list2;
        TTSVoiceStruct tTSVoiceStruct;
        T t = this.mData;
        int i = 1;
        if (t == 0) {
            this.mData = new TTSVoiceDetailsResponse(null, null, C47261Igj.LJJIJ(new TTSVoiceStruct(null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, list, i, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, false, 1951, null == true ? 1 : 0)), 3, null);
            return;
        }
        TTSVoiceDetailsResponse tTSVoiceDetailsResponse = (TTSVoiceDetailsResponse) t;
        if (tTSVoiceDetailsResponse == null || (list2 = tTSVoiceDetailsResponse.ttsVoiceStruct) == null || (tTSVoiceStruct = (TTSVoiceStruct) ORZ.LJLLLL(list2)) == null) {
            return;
        }
        tTSVoiceStruct.hasMore = 1;
        tTSVoiceStruct.videoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            X.Ol8 r0 = r6.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            X.T90 r0 = (X.T90) r0
            r0.getClass()
            r0.LJLIL = r8
            r0.LJLILLLLZI = r7
            r4 = 20
            r0.LJLJI = r4
            if (r7 != 0) goto Lb1
            if (r9 != 0) goto Lb1
        L18:
            T r0 = r6.mData
            com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse r0 = (com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse) r0
            if (r0 == 0) goto Laf
            java.util.List<com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceStruct> r0 = r0.ttsVoiceStruct
            if (r0 == 0) goto Laf
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceStruct r0 = (com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceStruct) r0
            if (r0 == 0) goto Laf
            java.lang.Integer r0 = r0.videoCount
            if (r0 == 0) goto Laf
            int r3 = r0.intValue()
        L32:
            android.util.LruCache<java.lang.String, X.3Do> r2 = X.C80413Dp.LIZ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r8)
            r0 = 38
            r1.append(r0)
            r1.append(r7)
            r1.append(r0)
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.Object r5 = r2.get(r0)
            X.3Do r5 = (X.C80403Do) r5
            if (r5 == 0) goto Lb1
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r5.LIZIZ
            long r3 = r3 - r0
            r0 = 15000(0x3a98, float:2.102E-41)
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb1
            com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse r1 = r5.LIZ
        L6b:
            r3 = 0
            if (r1 == 0) goto L93
            X.Ol8 r0 = r6.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            X.T90 r0 = (X.T90) r0
            r0.LJLJJI = r3
            android.os.Message r3 = new android.os.Message
            r3.<init>()
            r3.obj = r1
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            r2.<init>(r0)
            Y.ARunnableS22S0200000_3 r1 = new Y.ARunnableS22S0200000_3
            r0 = 68
            r1.<init>(r6, r3, r0)
            r2.post(r1)
        L92:
            return
        L93:
            if (r7 != 0) goto La0
            X.Ol8 r0 = r6.LJLILLLLZI
            java.lang.Object r1 = r0.getValue()
            X.T90 r1 = (X.T90) r1
            r0 = 1
            r1.LJLJJI = r0
        La0:
            X.FGR r2 = X.FGR.LIZIZ()
            com.bytedance.common.utility.collection.WeakHandler r1 = r6.mHandler
            X.T8x r0 = new X.T8x
            r0.<init>(r6, r8, r7)
            r2.LIZ(r1, r0, r3)
            goto L92
        Laf:
            r3 = -1
            goto L32
        Lb1:
            r1 = 0
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74166T8w.LJIIIZ(int, java.lang.String, boolean):void");
    }
}
