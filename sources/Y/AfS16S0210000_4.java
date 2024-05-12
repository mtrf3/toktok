package Y;

import X.A15;
import X.C188727au;
import X.C25524A0a;
import X.C28043AzX;
import X.FMX;
import X.InterfaceC64592gB;
import android.view.View;
import com.ss.android.ugc.aweme.model.CreatorCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionInfo;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionStatus;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import java.util.Locale;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AfS16S0210000_4 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS16S0210000_4 afS16S0210000_4, Object obj) {
        CreatorCollectionDetailResponse creatorCollectionDetailResponse = (CreatorCollectionDetailResponse) obj;
        if (creatorCollectionDetailResponse.status_code == 0) {
            ((ManageSeriesViewModel) afS16S0210000_4.l0).setState(new AqS135S0200000_4(creatorCollectionDetailResponse, (A15) afS16S0210000_4.l1, 81));
            if (afS16S0210000_4.z2) {
                String str = ((C25524A0a) ((ManageSeriesViewModel) afS16S0210000_4.l0).LJLJI.getValue()).LJLILLLLZI;
                String str2 = ((C25524A0a) ((ManageSeriesViewModel) afS16S0210000_4.l0).LJLJI.getValue()).LJLIL;
                ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo = creatorCollectionDetailResponse.collectionDetail;
                int i = managementPagePaidCollectionInfo.numVideos;
                ManagementPagePaidCollectionStatus status = managementPagePaidCollectionInfo.status;
                String str3 = ((C25524A0a) ((ManageSeriesViewModel) afS16S0210000_4.l0).LJLJI.getValue()).LJLJI;
                Boolean bool = ((C25524A0a) ((ManageSeriesViewModel) afS16S0210000_4.l0).LJLJI.getValue()).LJLJJI;
                o.LJIIIZ(status, "status");
                C188727au c188727au = new C188727au();
                if (str == null) {
                    str = "";
                }
                c188727au.LJIIIZ("enter_from", str);
                if (str2 == null) {
                    str2 = "";
                }
                c188727au.LJIIIZ("collection_id", str2);
                c188727au.LIZLLL(i, "video_cnt");
                String lowerCase = status.name().toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                c188727au.LJIIIZ("collection_status", lowerCase);
                if (str3 == null) {
                    str3 = "";
                }
                c188727au.LJIIIZ("entry_point", str3);
                c188727au.LIZLLL(o.LJ(bool, Boolean.TRUE) ? 1 : 0, "is_new_collection");
                FMX.LJIIL("show_series_manage_video", c188727au.LIZ);
            }
        }
    }

    public static final void accept$1(AfS16S0210000_4 afS16S0210000_4, Object obj) {
        View view;
        if (afS16S0210000_4.z2 && (view = (View) afS16S0210000_4.l0) != null) {
            ((C28043AzX) afS16S0210000_4.l1).LLLLZLLIL(new AqS154S0100000_4(view, 1071));
        }
    }

    public AfS16S0210000_4(View view, C28043AzX c28043AzX, int i) {
        this.$t = i;
        this.z2 = true;
        this.l0 = view;
        this.l1 = c28043AzX;
    }

    public AfS16S0210000_4(ManageSeriesViewModel manageSeriesViewModel, boolean z, A15 a15, int i) {
        this.$t = i;
        this.l0 = manageSeriesViewModel;
        this.z2 = z;
        this.l1 = a15;
    }
}
