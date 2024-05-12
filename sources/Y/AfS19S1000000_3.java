package Y;

import X.C189837ch;
import X.InterfaceC64592gB;
import X.RBY;
import X.X1D;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AfS19S1000000_3 implements InterfaceC64592gB {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS19S1000000_3(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 2:
            case 3:
                this.s0 = str;
                return;
            case 1:
            default:
                this.s0 = str;
                return;
        }
    }

    public static final void accept$0(AfS19S1000000_3 afS19S1000000_3, Object obj) {
        String str;
        List<CollectionDetail> list = ((CollectionListResponse) obj).items;
        if (list != null) {
            String str2 = afS19S1000000_3.s0;
            for (CollectionDetail collectionDetail : list) {
                if (str2 == null) {
                    str = collectionDetail.uid;
                    if (str == null) {
                        RBY LJFF = AccountService.LJIJ().LJFF();
                        if (LJFF != null) {
                            str = LJFF.getCurUserId();
                        } else {
                            str = null;
                        }
                    }
                } else {
                    str = str2;
                }
                collectionDetail.uid = str;
                VideoCollectionListViewModel.LJLJJL.put(String.valueOf(collectionDetail.id), collectionDetail);
            }
        }
    }

    public static final void accept$1(AfS19S1000000_3 afS19S1000000_3, Object obj) {
        String str = afS19S1000000_3.s0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetch user(");
        LIZ.append(str);
        LIZ.append(") story success.");
        C189837ch.LIZ("AwemeModel", X1D.LIZIZ(LIZ));
    }

    public static final void accept$2(AfS19S1000000_3 afS19S1000000_3, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("succeeded for ");
        LIZ.append(afS19S1000000_3.s0);
        C189837ch.LJ("reportViewed", X1D.LIZIZ(LIZ));
    }

    public static final void accept$3(AfS19S1000000_3 afS19S1000000_3, Object obj) {
        Throwable t = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("failed for ");
        LIZ.append(afS19S1000000_3.s0);
        String LIZIZ = X1D.LIZIZ(LIZ);
        o.LJIIIIZZ(t, "t");
        C189837ch.LIZIZ("reportViewed", LIZIZ, t);
    }
}
