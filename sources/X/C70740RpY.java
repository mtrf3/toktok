package X;

import Y.AfS64S0100000_12;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RpY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70740RpY implements InterfaceC70779RqB {
    public final /* synthetic */ GalleryViewerFragment LIZ;

    public C70740RpY(GalleryViewerFragment galleryViewerFragment) {
        this.LIZ = galleryViewerFragment;
    }

    @Override // X.InterfaceC70779RqB
    public final void onPageSelected(int i) {
        NextLiveData<Boolean> nextLiveData;
        int i2;
        GalleryViewerFragment galleryViewerFragment;
        GalleryViewerViewModel galleryViewerViewModel;
        String str;
        int i3;
        int i4;
        int[] iArr;
        NextLiveData<CopyOnWriteArrayList<C70717RpB>> nextLiveData2;
        CopyOnWriteArrayList<C70717RpB> value;
        if (i < 0) {
            return;
        }
        GalleryViewerFragment galleryViewerFragment2 = this.LIZ;
        galleryViewerFragment2.LJZL = galleryViewerFragment2.LJZI;
        this.LIZ.LJZI = i;
        GalleryViewerViewModel galleryViewerViewModel2 = this.LIZ.LJLIL;
        if (galleryViewerViewModel2 != null && (nextLiveData = galleryViewerViewModel2.LJLJLLL) != null && o.LJ(nextLiveData.getValue(), Boolean.TRUE)) {
            GalleryViewerViewModel galleryViewerViewModel3 = this.LIZ.LJLIL;
            Integer num = null;
            if (galleryViewerViewModel3 != null && (nextLiveData2 = galleryViewerViewModel3.LJLLLLLL) != null && (value = nextLiveData2.getValue()) != null) {
                i2 = value.size() - 4;
            } else {
                i2 = i;
            }
            if (i2 < i && (galleryViewerViewModel = (galleryViewerFragment = this.LIZ).LJLIL) != null) {
                String str2 = (String) galleryViewerFragment.LJLILLLLZI.getValue();
                int vl = this.LIZ.vl();
                String str3 = "";
                if (str2 == null) {
                    str = "";
                } else {
                    str = str2;
                }
                C70699Rot LIZ = C70689Roj.LIZ(str);
                LIZ.LJLJLLL = new AqS178S0100000_12(galleryViewerViewModel, 651);
                if (galleryViewerViewModel.LJLILLLLZI == null) {
                    galleryViewerViewModel.LJLILLLLZI = LIZ;
                }
                if (vl == 2) {
                    if (str2 != null) {
                        str3 = str2;
                    }
                    String str4 = galleryViewerViewModel.LJLLI;
                    Integer num2 = galleryViewerViewModel.LJLL;
                    if (num2 != null) {
                        i4 = num2.intValue();
                    } else {
                        i4 = 1;
                    }
                    String str5 = galleryViewerViewModel.LJLJJI;
                    String str6 = galleryViewerViewModel.LJLLILLLL;
                    ArrayList<Integer> arrayList = galleryViewerViewModel.LJLLJ;
                    if (arrayList != null) {
                        iArr = ORZ.LLJ(arrayList);
                    } else {
                        iArr = null;
                    }
                    Boolean bool = Boolean.FALSE;
                    String str7 = galleryViewerViewModel.LJLLL;
                    if (str7 != null) {
                        num = C38350F3i.LJJIL(str7);
                    }
                    C70699Rot.LLLZ(LIZ, new ReviewApi.ListShopReviewRequest(str3, str4, false, 10, i4, str5, str6, iArr, bool, num, galleryViewerViewModel.LJLJJL, null, 2048, null), null, null, null, 0, false, galleryViewerViewModel.LJZ, 62).LJJJJZI(new AfS64S0100000_12(galleryViewerViewModel, 121));
                } else {
                    if (str2 != null) {
                        str3 = str2;
                    }
                    String str8 = galleryViewerViewModel.LJLJJI;
                    Integer num3 = galleryViewerViewModel.LJLL;
                    if (num3 != null) {
                        i3 = num3.intValue();
                    } else {
                        i3 = 1;
                    }
                    LIZ.LLLLZIL(new ReviewApi.ReviewRequest(str3, str8, 10, i3, false, galleryViewerViewModel.LJLJJL, null, null, null, 448, null), null, null, null, 0, false).LJJJJZI(new AfS64S0100000_12(galleryViewerViewModel, 122));
                }
            }
        }
        GalleryViewerFragment galleryViewerFragment3 = this.LIZ;
        int i5 = galleryViewerFragment3.LJZI;
        int i6 = this.LIZ.LJZL;
        synchronized (galleryViewerFragment3) {
            GalleryViewerViewModel galleryViewerViewModel4 = galleryViewerFragment3.LJLIL;
            if (galleryViewerViewModel4 != null) {
                galleryViewerViewModel4.hv0(galleryViewerFragment3, i5, i6, (String) galleryViewerFragment3.LJLILLLLZI.getValue());
            }
        }
    }
}
