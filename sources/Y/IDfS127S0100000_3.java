package Y;

import X.AnonymousClass883;
import X.AnonymousClass886;
import X.C186307Sw;
import X.C186317Sx;
import X.C186897Vd;
import X.C186917Vf;
import X.C2063287w;
import X.C2063387x;
import X.C221018lt;
import X.C76800UCe;
import X.C7SN;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import X.X1D;
import X.XGT;
import X.XGW;
import X.XGX;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailResp;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailResp;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import com.ss.android.ugc.tiktok.addyours.ui.vm.SearchResultListViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDfS127S0100000_3 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64672gJ
    public final Object emit(AnonymousClass883<Boolean> anonymousClass883, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, anonymousClass883, interfaceC67352kd);
            case 1:
                return emit$1(this, anonymousClass883, interfaceC67352kd);
            case 2:
                return emit$2(this, anonymousClass883, interfaceC67352kd);
            case 3:
                return emit$3(this, anonymousClass883, interfaceC67352kd);
            case 4:
                return emit$4(this, anonymousClass883, interfaceC67352kd);
            case 5:
                return emit$5(this, anonymousClass883, interfaceC67352kd);
            case 6:
                return emit$6(this, anonymousClass883, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS127S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$0(IDfS127S0100000_3 iDfS127S0100000_3, Object obj, InterfaceC67352kd interfaceC67352kd) {
        AnonymousClass886 anonymousClass886;
        AnonymousClass883 anonymousClass883 = (AnonymousClass883) obj;
        if (((Boolean) anonymousClass883.LIZIZ).booleanValue()) {
            ((PlaylistCollectionVM) iDfS127S0100000_3.l0).manualListRefresh();
            ((PlaylistCollectionVM) iDfS127S0100000_3.l0).setState(C186917Vf.LJLIL);
        } else {
            List<AnonymousClass886> list = ((C186897Vd) ((PlaylistCollectionVM) iDfS127S0100000_3.l0).getState()).LJLIL.LJLJJI;
            if (list != null) {
                Iterator<AnonymousClass886> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        anonymousClass886 = it.next();
                        if (o.LJ(anonymousClass886.LJLIL.id, anonymousClass883.LIZ)) {
                            break;
                        }
                    } else {
                        anonymousClass886 = null;
                        break;
                    }
                }
                AnonymousClass886 anonymousClass8862 = anonymousClass886;
                if (anonymousClass8862 != null) {
                    ((PlaylistCollectionVM) iDfS127S0100000_3.l0).listRemoveItem((PlaylistCollectionVM) anonymousClass8862);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.IDfS127S0100000_3 r6, java.lang.Object r7, X.InterfaceC67352kd r8) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass882
            if (r0 == 0) goto L3c
            r5 = r8
            X.882 r5 = (X.AnonymousClass882) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L42
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r2 = r6.l0
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            r0 = r7
            X.883 r0 = (X.AnonymousClass883) r0
            X.87z r1 = r0.LIZJ
            X.87z r0 = X.EnumC2063587z.MUTATION
            if (r1 != r0) goto L20
            r5.LJLILLLLZI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L20
            return r4
        L3c:
            X.882 r5 = new X.882
            r5.<init>(r6, r8)
            goto L12
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS127S0100000_3.emit$1(Y.IDfS127S0100000_3, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$2(IDfS127S0100000_3 iDfS127S0100000_3, Object obj, InterfaceC67352kd interfaceC67352kd) {
        String str;
        Aweme aweme;
        AnonymousClass883 anonymousClass883 = (AnonymousClass883) obj;
        String str2 = anonymousClass883.LIZ;
        VideoItemParams gv0 = ((VideoFavoriteVM) iDfS127S0100000_3.l0).gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str2, str)) {
            int i = C2063287w.LIZ[anonymousClass883.LIZJ.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                VideoFavoriteVM videoFavoriteVM = (VideoFavoriteVM) iDfS127S0100000_3.l0;
                videoFavoriteVM.setState(new AqS134S0200000_3(videoFavoriteVM, (VideoFavoriteVM) anonymousClass883, (AnonymousClass883<Boolean>) 88));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$3(IDfS127S0100000_3 iDfS127S0100000_3, Object obj, InterfaceC67352kd interfaceC67352kd) {
        String str;
        Aweme aweme;
        AnonymousClass883 anonymousClass883 = (AnonymousClass883) obj;
        String str2 = anonymousClass883.LIZ;
        VideoItemParams gv0 = ((VideoFavoriteVM) iDfS127S0100000_3.l0).gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str2, str)) {
            int i = C2063387x.LIZ[anonymousClass883.LIZJ.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                VideoFavoriteVM videoFavoriteVM = (VideoFavoriteVM) iDfS127S0100000_3.l0;
                videoFavoriteVM.setState(new AqS134S0200000_3(videoFavoriteVM, (VideoFavoriteVM) anonymousClass883, (AnonymousClass883<Boolean>) 89));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$4(IDfS127S0100000_3 iDfS127S0100000_3, Object obj, InterfaceC67352kd interfaceC67352kd) {
        String str = (String) obj;
        SearchResultListViewModel searchResultListViewModel = (SearchResultListViewModel) ((AddYoursInviteFriendsAssem) iDfS127S0100000_3.l0).LJLILLLLZI.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new keyword: ");
        LIZ.append(str);
        C221018lt.LIZ("SearchResultVM", X1D.LIZIZ(LIZ));
        searchResultListViewModel.LJLILLLLZI = str;
        if (str == null || str.length() == 0) {
            searchResultListViewModel.listClear();
        } else {
            searchResultListViewModel.manualListRefresh();
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$5(IDfS127S0100000_3 iDfS127S0100000_3, Object obj, InterfaceC67352kd interfaceC67352kd) {
        XGX xgx = (XGX) obj;
        if (xgx instanceof XGW) {
            BookDetailResp bookDetailResp = ((C186307Sw) ((XGW) xgx).LJ).LIZ;
            if (bookDetailResp != null) {
                BookDetail bookDetail = bookDetailResp.detail;
                if (bookDetail != null) {
                    bookDetail.id = ((BookDetailVM) iDfS127S0100000_3.l0).gv0();
                }
                ((BookDetailVM) iDfS127S0100000_3.l0).setState(new AqS169S0100000_3(bookDetailResp, 695));
                ((BookDetailVM) iDfS127S0100000_3.l0).LJLILLLLZI = bookDetailResp.isCollected;
            }
            ((BookDetailVM) iDfS127S0100000_3.l0).LJLJI = false;
        } else if (xgx instanceof XGT) {
            ((BookDetailVM) iDfS127S0100000_3.l0).setState(new AqS169S0100000_3(xgx, (XGX<C186307Sw>) 696));
            ((BookDetailVM) iDfS127S0100000_3.l0).LJLJI = false;
        } else {
            ((BookDetailVM) iDfS127S0100000_3.l0).LJLJI = false;
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$6(IDfS127S0100000_3 iDfS127S0100000_3, Object obj, InterfaceC67352kd interfaceC67352kd) {
        XGX xgx = (XGX) obj;
        if (xgx instanceof XGW) {
            MovieDetailResp movieDetailResp = ((C186317Sx) ((XGW) xgx).LJ).LIZ;
            if (movieDetailResp != null) {
                if (movieDetailResp.detail != null) {
                    ((MovieDetailVM) iDfS127S0100000_3.l0).setState(new AqS169S0100000_3(movieDetailResp, 986));
                    ((MovieDetailVM) iDfS127S0100000_3.l0).LJLILLLLZI = movieDetailResp.isCollected;
                } else {
                    ((MovieDetailVM) iDfS127S0100000_3.l0).setState(C7SN.LJLIL);
                }
            }
            ((MovieDetailVM) iDfS127S0100000_3.l0).LJLJI = false;
        } else if (xgx instanceof XGT) {
            ((MovieDetailVM) iDfS127S0100000_3.l0).setState(new AqS169S0100000_3(xgx, (XGX<C186307Sw>) 987));
            ((MovieDetailVM) iDfS127S0100000_3.l0).LJLJI = false;
        } else {
            ((MovieDetailVM) iDfS127S0100000_3.l0).LJLJI = false;
        }
        return C76800UCe.LIZ;
    }
}
