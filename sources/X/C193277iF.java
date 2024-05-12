package X;

import Y.AfS18S1100000_3;
import Y.AfS19S1000000_3;
import Y.AfS55S0100000_3;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.VideoCollectionApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7iF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193277iF implements InterfaceC192457gv {
    public final /* synthetic */ C192487gy LJLIL;

    public C193277iF(C192487gy c192487gy) {
        this.LJLIL = c192487gy;
    }

    @Override // X.InterfaceC192457gv
    public final C73422Sri LJJIJIIJIL(int i) {
        return this.LJLIL.LIZ.allFavoritesDetail(i).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iW
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                ((AbstractC36908Ee8) obj).checkValid();
            }
        });
    }

    public final C73422Sri LJJJIL(CollectionManageRequest request) {
        String str;
        String str2;
        o.LJIIIZ(request, "request");
        VideoCollectionApi videoCollectionApi = this.LJLIL.LIZ;
        int i = request.operation;
        String str3 = request.collectionId;
        String str4 = request.collectionName;
        String str5 = request.moveFromCollectionId;
        String str6 = request.moveToCollectionId;
        List<String> list = request.addIds;
        String str7 = null;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        List<String> list2 = request.removeIds;
        if (list2 != null) {
            str2 = list2.toString();
        } else {
            str2 = null;
        }
        List<String> list3 = request.moveIds;
        if (list3 != null) {
            str7 = list3.toString();
        }
        return videoCollectionApi.collectionManage(i, str3, str4, str5, str6, str, str2, str7, request.status).LJIJJLI(new AfS55S0100000_3(this, 23)).LJJJJL(new C74218TAw()).LJIJJLI(new AfS55S0100000_3(request, 24)).LJIJJ(new AfS55S0100000_3(request, 26));
    }

    @Override // X.InterfaceC192457gv
    public final C73422Sri LJJLIIIIJ(String str) {
        return this.LJLIL.LIZ.collectionDetail(str).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iT
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                ((AbstractC36908Ee8) obj).checkValid();
            }
        }).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iI
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                M8L.LIZJ("/tiktok/collection/item_archive/detail/v1", "net", (BaseResponse) obj);
            }
        }).LJIJJ(new InterfaceC64592gB() { // from class: X.7iO
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                M8L.LIZIZ("/tiktok/collection/item_archive/detail/v1", (Throwable) obj);
            }
        });
    }

    @Override // X.InterfaceC192457gv
    public final C73422Sri LJLJLLL(long j) {
        int i;
        VideoCollectionApi videoCollectionApi = this.LJLIL.LIZ;
        if (j == 0) {
            i = 1;
        } else {
            i = 2;
        }
        return videoCollectionApi.candidateContent(j, 30, i).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iR
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                ((AbstractC36908Ee8) obj).checkValid();
            }
        }).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iG
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                M8L.LIZJ("/tiktok/collection/item_archive/item/candidate/list/v1", "net", (BaseResponse) obj);
            }
        }).LJIJJ(new InterfaceC64592gB() { // from class: X.7iM
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                M8L.LIZIZ("/tiktok/collection/item_archive/item/candidate/list/v1", (Throwable) obj);
            }
        });
    }

    @Override // X.InterfaceC192457gv
    public final C73422Sri LLD(long j) {
        return this.LJLIL.LIZ.allFavoritesContent(j, 30).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iV
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                ((AbstractC36908Ee8) obj).checkValid();
            }
        }).LJJIJL(new InterfaceC48038ItG() { // from class: X.2WQ
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
            
                if (r0.intValue() == 1) goto L5;
             */
            @Override // X.InterfaceC48038ItG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteContentResponse r6 = (com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteContentResponse) r6
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.o.LJIIIZ(r6, r0)
                    com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse r4 = new com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse
                    java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r6.items
                    java.lang.Long r2 = r6.maxCursor
                    java.lang.Integer r0 = r6.hasMore
                    if (r0 != 0) goto L1a
                L11:
                    r1 = 0
                L12:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    r4.<init>(r3, r2, r0)
                    return r4
                L1a:
                    int r0 = r0.intValue()
                    r1 = 1
                    if (r0 != r1) goto L11
                    goto L12
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2WQ.apply(java.lang.Object):java.lang.Object");
            }
        }).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iL
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                M8L.LIZJ("/aweme/v1/aweme/listcollection/", "net", (BaseResponse) obj);
            }
        }).LJIJJ(new InterfaceC64592gB() { // from class: X.7iQ
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                M8L.LIZIZ("/aweme/v1/aweme/listcollection/", (Throwable) obj);
            }
        });
    }

    @Override // X.InterfaceC192457gv
    public final C73422Sri LJIILJJIL(long j, String str) {
        int i;
        VideoCollectionApi videoCollectionApi = this.LJLIL.LIZ;
        if (j == 0) {
            i = 1;
        } else {
            i = 2;
        }
        return videoCollectionApi.collectionContent(str, j, 30, i).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iS
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                ((AbstractC36908Ee8) obj).checkValid();
            }
        }).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iH
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                M8L.LIZJ("/tiktok/collection/item_archive/item/list/v1", "net", (BaseResponse) obj);
            }
        }).LJIJJ(new InterfaceC64592gB() { // from class: X.7iN
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                M8L.LIZIZ("/tiktok/collection/item_archive/item/list/v1", (Throwable) obj);
            }
        });
    }

    @Override // X.InterfaceC192457gv
    public final C73422Sri LJIILIIL(long j, String str, String str2, boolean z) {
        String str3;
        AbstractC73672Svk LJIJJLI;
        Keva keva = this.LJLIL.LIZIZ;
        if (keva != null) {
            str3 = keva.getString("CollectionCache", "");
        } else {
            str3 = null;
        }
        if (j == 0) {
            LJIJJLI = C193457iX.LIZ(this.LJLIL.LIZ, j, str2, str).LJIJJLI(new AfS18S1100000_3(str2, this.LJLIL, 0)).LJIJJ(new InterfaceC64592gB() { // from class: X.7ia
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }).LJJJJL(new C74218TAw());
        } else {
            LJIJJLI = C193457iX.LIZ(this.LJLIL.LIZ, j, str2, str).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iU
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    ((AbstractC36908Ee8) obj).checkValid();
                }
            });
        }
        C73422Sri LJIJJLI2 = LJIJJLI.LJIJJLI(new AfS19S1000000_3(str2, 0));
        if (str3 == null || str3.length() == 0 || !z || j != 0) {
            return LJIJJLI2.LJIJJLI(new InterfaceC64592gB() { // from class: X.7iJ
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    M8L.LIZJ("/tiktok/collection/item_archive/list/v1", "net", (BaseResponse) obj);
                }
            }).LJIJJ(new InterfaceC64592gB() { // from class: X.7iP
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    M8L.LIZIZ("/tiktok/collection/item_archive/list/v1", (Throwable) obj);
                }
            });
        }
        Object fromJson = GsonProtectorUtils.fromJson(C69432nz.LIZ(), str3, (Class<Object>) CollectionListResponse.class);
        LJIJJLI2.LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.7iY
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.7iZ
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        return AbstractC73672Svk.LJJIJIL(fromJson).LJIJJLI(new InterfaceC64592gB() { // from class: X.7iK
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                M8L.LIZJ("/tiktok/collection/item_archive/list/v1", "cache", (BaseResponse) obj);
            }
        });
    }
}
