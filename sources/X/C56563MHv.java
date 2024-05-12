package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.question.model.QuestionVideosResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MHv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56563MHv extends AbstractC51036K1g<Aweme, QuestionVideosResponse> {
    public final MI1 LJLIL = new MI1();

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Aweme> LJIIJ() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        o.LJI(t);
        return ((QuestionVideosResponse) t).getVideos();
    }

    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        ArrayList arrayList = new ArrayList();
        if (C79004UzY.LJJIFFI(null)) {
            List<Aweme> LJIIJ = LJIIJ();
            if (!C79004UzY.LJJIFFI(LJIIJ)) {
                o.LJI(LJIIJ);
                arrayList.addAll(LJIIJ);
            }
            return arrayList;
        }
        o.LJI(null);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r0.intValue() != 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isDataEmpty() {
        /*
            r2 = this;
            T r0 = r2.mData
            r1 = 1
            if (r0 == 0) goto L1d
            kotlin.jvm.internal.o.LJI(r0)
            com.ss.android.ugc.aweme.question.model.QuestionVideosResponse r0 = (com.ss.android.ugc.aweme.question.model.QuestionVideosResponse) r0
            java.lang.Integer r0 = r0.getHasMore()
            if (r0 == 0) goto L2f
            T r0 = r2.mData
            kotlin.jvm.internal.o.LJI(r0)
            com.ss.android.ugc.aweme.question.model.QuestionVideosResponse r0 = (com.ss.android.ugc.aweme.question.model.QuestionVideosResponse) r0
            java.lang.Integer r0 = r0.getHasMore()
            if (r0 != 0) goto L28
        L1d:
            java.util.List r0 = r2.getItems()
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 == 0) goto L2f
        L27:
            return r1
        L28:
            int r0 = r0.intValue()
            if (r0 == r1) goto L2f
            goto L1d
        L2f:
            r1 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56563MHv.isDataEmpty():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0) {
            o.LJI(t);
            if (((QuestionVideosResponse) t).getHasMore() != null) {
                T t2 = this.mData;
                o.LJI(t2);
                Integer hasMore = ((QuestionVideosResponse) t2).getHasMore();
                if (hasMore != null && hasMore.intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
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
    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.ss.android.ugc.aweme.question.model.QuestionVideosResponse] */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        boolean z;
        List<Aweme> list;
        Integer num;
        ?? r9 = (QuestionVideosResponse) obj;
        MI1 mi1 = this.LJLIL;
        if (!mi1.LJ && r9 != 0) {
            C56564MHw.LIZ(mi1, r9);
        }
        if (r9 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            Integer num2 = null;
            if (r9 != 0) {
                list = r9.getVideos();
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Aweme R1 = AwemeService.LIZ().R1((Aweme) ListProtector.get(list, i));
                        o.LJI(R1);
                        Object obj2 = ListProtector.get(list, i);
                        o.LJI(obj2);
                        R1.setIsTop(((Aweme) obj2).getIsTop());
                        ListProtector.set(list, i, R1);
                    }
                }
            } else {
                list = null;
            }
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 != 4) {
                    return;
                }
                if (list != null) {
                    T t = this.mData;
                    o.LJI(t);
                    if (C79004UzY.LJJIFFI(((QuestionVideosResponse) t).getVideos())) {
                        T t2 = this.mData;
                        o.LJI(t2);
                        ((QuestionVideosResponse) t2).setVideos(list);
                    } else {
                        T t3 = this.mData;
                        o.LJI(t3);
                        List<Aweme> videos = ((QuestionVideosResponse) t3).getVideos();
                        o.LJI(videos);
                        C65092gz isEquals = C65092gz.LJLIL;
                        o.LJIIIZ(isEquals, "isEquals");
                        if (!C79004UzY.LJJIFFI(list)) {
                            for (Aweme aweme : list) {
                                if (aweme != null) {
                                    Iterator<Aweme> it = videos.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Aweme next = it.next();
                                        if (((Boolean) isEquals.invoke(next, aweme)).booleanValue()) {
                                            if (next == null) {
                                            }
                                        }
                                    }
                                    videos.add(aweme);
                                }
                            }
                        }
                    }
                }
                T t4 = this.mData;
                o.LJI(t4);
                QuestionVideosResponse questionVideosResponse = (QuestionVideosResponse) t4;
                if (r9 != 0) {
                    num = r9.getCursor();
                } else {
                    num = null;
                }
                questionVideosResponse.setCursor(num);
                T t5 = this.mData;
                o.LJI(t5);
                QuestionVideosResponse questionVideosResponse2 = (QuestionVideosResponse) t5;
                if (r9 != 0) {
                    num2 = r9.getHasMore();
                }
                o.LJI(num2);
                int intValue = num2.intValue();
                T t6 = this.mData;
                o.LJI(t6);
                Integer hasMore = ((QuestionVideosResponse) t6).getHasMore();
                o.LJI(hasMore);
                questionVideosResponse2.setHasMore(Integer.valueOf(intValue & hasMore.intValue()));
                return;
            }
            this.mData = r9;
            return;
        }
        T t7 = this.mData;
        if (t7 != 0) {
            ((QuestionVideosResponse) t7).setHasMore(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        Integer cursor;
        o.LJIIIZ(params, "params");
        try {
            Object obj = params[1];
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            long parseLong = CastLongProtector.parseLong((String) obj);
            if (isDataEmpty()) {
                cursor = 0;
            } else {
                T t = this.mData;
                o.LJI(t);
                cursor = ((QuestionVideosResponse) t).getCursor();
            }
            o.LJI(cursor);
            LJIIIZ(cursor.intValue(), 20, parseLong, null, false);
        } catch (NumberFormatException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        try {
            if (params.length >= 6) {
                Object obj = params[1];
                o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                long parseLong = CastLongProtector.parseLong((String) obj);
                String str = (String) params[4];
                Object obj2 = params[5];
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                LJIIIZ(0, 20, parseLong, str, ((Boolean) obj2).booleanValue());
                return;
            }
            String str2 = "";
            if (params.length >= 5) {
                Object obj3 = params[4];
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                }
            }
            Object obj4 = params[1];
            o.LJII(obj4, "null cannot be cast to non-null type kotlin.String");
            LJIIIZ(0, 20, CastLongProtector.parseLong((String) obj4), str2, false);
        } catch (NumberFormatException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.ss.android.ugc.aweme.question.model.QuestionVideosResponse] */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<Aweme> list) {
        List<Aweme> list2;
        if (this.mData == 0) {
            this.mData = new QuestionVideosResponse();
        }
        T t = this.mData;
        o.LJI(t);
        ((QuestionVideosResponse) t).setHasMore(1);
        T t2 = this.mData;
        o.LJI(t2);
        QuestionVideosResponse questionVideosResponse = (QuestionVideosResponse) t2;
        if (list != null) {
            list2 = ORZ.LLJILJILJ(ORZ.LJLL(list));
        } else {
            list2 = null;
        }
        questionVideosResponse.setVideos(list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r15, int r16, long r17, java.lang.String r19, boolean r20) {
        /*
            r14 = this;
            r4 = 20
            r2 = 0
            r3 = 1
            r12 = r15
            r9 = r14
            r10 = r17
            if (r20 != 0) goto L8d
            X.MI1 r0 = r9.LJLIL
            com.ss.android.ugc.aweme.question.ForumStruct r6 = r0.LIZLLL
            if (r12 != 0) goto L8d
            X.0M6<java.lang.String, X.MHy> r5 = X.C56564MHw.LIZIZ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r10)
            r0 = 38
            r1.append(r0)
            r1.append(r12)
            r1.append(r0)
            r1.append(r4)
            r1.append(r0)
            if (r6 == 0) goto L8b
            java.lang.Integer r0 = r6.getVideosCount()
            if (r0 == 0) goto L8b
            int r0 = r0.intValue()
        L36:
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.Object r8 = r5.LIZIZ(r0)
            X.MHy r8 = (X.C56566MHy) r8
            if (r8 == 0) goto L8d
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r8.LIZIZ
            long r6 = r6 - r0
            r0 = 15000(0x3a98, float:2.102E-41)
            long r0 = (long) r0
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 >= 0) goto L8d
            com.ss.android.ugc.aweme.question.model.QuestionVideosResponse r0 = r8.LIZ
            if (r0 == 0) goto L8d
            android.os.Message r6 = new android.os.Message
            r6.<init>()
            r6.obj = r0
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            Y.ARunnableS28S0200000_9 r1 = new Y.ARunnableS28S0200000_9
            r0 = 55
            r1.<init>(r6, r9, r0)
            r5.post(r1)
            r1 = 0
        L6e:
            X.MI1 r0 = r9.LJLIL
            r0.LIZ = r4
            r0.LIZIZ = r12
            r0.LIZJ = r10
            r0.LJ = r3
            if (r1 == 0) goto L8a
            X.FGR r1 = X.FGR.LIZIZ()
            com.bytedance.common.utility.collection.WeakHandler r0 = r9.mHandler
            X.MHx r8 = new X.MHx
            r13 = r19
            r8.<init>(r9, r10, r12, r13)
            r1.LIZ(r0, r8, r2)
        L8a:
            return
        L8b:
            r0 = -1
            goto L36
        L8d:
            r1 = 1
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56563MHv.LJIIIZ(int, int, long, java.lang.String, boolean):void");
    }
}
