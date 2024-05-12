package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.library.LibraryMaterialInfo;
import com.ss.android.ugc.aweme.model.library.LibraryVideosResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MHm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56554MHm extends AbstractC51036K1g<Aweme, LibraryVideosResponse> {
    public final C56556MHo LJLIL = new C56556MHo();

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Aweme> LJIIJ() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((LibraryVideosResponse) t).getVideos();
    }

    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        ArrayList arrayList = new ArrayList();
        if (!C79004UzY.LJJIFFI(null)) {
            arrayList.addAll(null);
        }
        List<Aweme> LJIIJ = LJIIJ();
        if (!C79004UzY.LJJIFFI(LJIIJ)) {
            arrayList.addAll(LJIIJ);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        T t = this.mData;
        if ((t == 0 || !((LibraryVideosResponse) t).isHasMore()) && C79004UzY.LJJIFFI(getItems())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((LibraryVideosResponse) t).isHasMore()) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 3) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final boolean deleteItem(Aweme aweme) {
        return C78996UzQ.LJIIIIZZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.ss.android.ugc.aweme.model.library.LibraryVideosResponse] */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        boolean z;
        long j;
        Long usedCount;
        ?? r8 = (LibraryVideosResponse) obj;
        C56556MHo c56556MHo = this.LJLIL;
        if (!c56556MHo.LJ && r8 != 0) {
            String str = c56556MHo.LIZJ;
            o.LJIIIIZZ(str, "params.libraryId");
            int i = c56556MHo.LIZIZ;
            int i2 = c56556MHo.LIZ;
            LibraryMaterialInfo libraryMaterialInfo = c56556MHo.LIZLLL;
            if (i == 0) {
                C0M6<String, C56555MHn> c0m6 = C56557MHp.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append('&');
                LIZ.append(i);
                LIZ.append('&');
                LIZ.append(i2);
                LIZ.append('&');
                if (libraryMaterialInfo != null && (usedCount = libraryMaterialInfo.getUsedCount()) != null) {
                    j = usedCount.longValue();
                } else {
                    j = -1;
                }
                LIZ.append(j);
                c0m6.LIZJ(X1D.LIZIZ(LIZ), new C56555MHn(r8, System.currentTimeMillis()));
            }
        }
        if (r8 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            List<Aweme> videos = r8.getVideos();
            if (videos != null) {
                int size = videos.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Aweme R1 = AwemeService.LIZ().R1((Aweme) ListProtector.get(videos, i3));
                    R1.setIsTop(((Aweme) ListProtector.get(videos, i3)).getIsTop());
                    ListProtector.set(videos, i3, R1);
                }
            }
            int i4 = this.mListQueryType;
            if (i4 != 1) {
                if (i4 != 4) {
                    return;
                }
                if (videos != null) {
                    if (C79004UzY.LJJIFFI(((LibraryVideosResponse) this.mData).getVideos())) {
                        ((LibraryVideosResponse) this.mData).setVideos(videos);
                    } else {
                        List<Aweme> originList = ((LibraryVideosResponse) this.mData).getVideos();
                        o.LJIIIZ(originList, "originList");
                        if (!C79004UzY.LJJIFFI(videos)) {
                            for (Aweme aweme : videos) {
                                if (aweme != null) {
                                    Iterator<Aweme> it = originList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Aweme next = it.next();
                                        if (Boolean.valueOf(TextUtils.equals(next.getAid(), aweme.getAid())).booleanValue()) {
                                            if (next == null) {
                                            }
                                        }
                                    }
                                    originList.add(aweme);
                                }
                            }
                        }
                    }
                }
                ((LibraryVideosResponse) this.mData).setCursor(r8.getCursor());
                ((LibraryVideosResponse) this.mData).setHasMore(Integer.valueOf(r8.getHasMore().intValue() & ((LibraryVideosResponse) this.mData).getHasMore().intValue()));
                return;
            }
            this.mData = r8;
            return;
        }
        T t = this.mData;
        if (t != 0) {
            ((LibraryVideosResponse) t).setHasMore((Integer) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... objArr) {
        int intValue;
        try {
            String str = (String) objArr[1];
            if (isDataEmpty()) {
                intValue = 0;
            } else {
                intValue = ((LibraryVideosResponse) this.mData).getCursor().intValue();
            }
            LJIIIZ(intValue, str, false);
        } catch (NumberFormatException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... objArr) {
        try {
            if (objArr.length >= 6) {
                LJIIIZ(0, (String) objArr[1], ((Boolean) objArr[5]).booleanValue());
            } else {
                LJIIIZ(0, (String) objArr[1], false);
            }
        } catch (NumberFormatException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.ss.android.ugc.aweme.model.library.LibraryVideosResponse] */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new LibraryVideosResponse();
        }
        ((LibraryVideosResponse) this.mData).setHasMore((Integer) 1);
        ((LibraryVideosResponse) this.mData).setVideos(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r10, java.lang.String r11, boolean r12) {
        /*
            r9 = this;
            r4 = 20
            r3 = 0
            r2 = 1
            if (r12 != 0) goto L8d
            X.MHo r0 = r9.LJLIL
            com.ss.android.ugc.aweme.library.LibraryMaterialInfo r1 = r0.LIZLLL
            java.lang.String r0 = "libraryId"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            if (r10 != 0) goto L8d
            X.0M6<java.lang.String, X.MHn> r6 = X.C56557MHp.LIZIZ
            java.lang.StringBuilder r5 = X.X1D.LIZ()
            r5.append(r11)
            r0 = 38
            r5.append(r0)
            r5.append(r10)
            r5.append(r0)
            r5.append(r4)
            r5.append(r0)
            if (r1 == 0) goto L8a
            java.lang.Long r0 = r1.getUsedCount()
            if (r0 == 0) goto L8a
            long r0 = r0.longValue()
        L37:
            r5.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r5)
            java.lang.Object r8 = r6.LIZIZ(r0)
            X.MHn r8 = (X.C56555MHn) r8
            if (r8 == 0) goto L8d
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r8.LIZIZ
            long r6 = r6 - r0
            r0 = 15000(0x3a98, float:2.102E-41)
            long r0 = (long) r0
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 >= 0) goto L8d
            com.ss.android.ugc.aweme.model.library.LibraryVideosResponse r0 = r8.LIZ
            if (r0 == 0) goto L8d
            android.os.Message r6 = new android.os.Message
            r6.<init>()
            r6.obj = r0
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            Y.ARunnableS8S0201000_5 r1 = new Y.ARunnableS8S0201000_5
            r0 = 10
            r1.<init>(r2, r9, r6, r0)
            r5.post(r1)
            r1 = 0
        L6f:
            X.MHo r0 = r9.LJLIL
            r0.LIZ = r4
            r0.LIZIZ = r10
            r0.LIZJ = r11
            r0.LJ = r2
            if (r1 == 0) goto L89
            X.FGR r2 = X.FGR.LIZIZ()
            com.bytedance.common.utility.collection.WeakHandler r1 = r9.mHandler
            X.MHq r0 = new X.MHq
            r0.<init>(r9, r11, r10)
            r2.LIZ(r1, r0, r3)
        L89:
            return
        L8a:
            r0 = -1
            goto L37
        L8d:
            r1 = 1
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56554MHm.LJIIIZ(int, java.lang.String, boolean):void");
    }
}
