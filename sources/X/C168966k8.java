package X;

import Y.AfS51S0200000_2;
import Y.IDhS95S0100000_2;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;

/* renamed from: X.6k8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168966k8 extends AbstractC168856jx {
    public final C169096kL LIZ;
    public final String LIZIZ = "DraftFilterRestoreHandler";
    public final ArrayList<String> LIZJ = new ArrayList<>();
    public final int LIZLLL = 5;
    public final int LJ = 150;

    @Override // X.InterfaceC168706ji
    public final int LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC168706ji
    public final C169096kL getParams() {
        return this.LIZ;
    }

    @Override // X.InterfaceC168706ji
    public final int getPriority() {
        return this.LJ;
    }

    public C168966k8(C169096kL c169096kL) {
        this.LIZ = c169096kL;
    }

    @Override // X.InterfaceC168706ji
    public final Object LIZLLL(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        String LJJLIIIIJ;
        List<SingleImageData> imageList;
        String LJJLIIIIJ2;
        if (((AwemeDraft) this.LIZ.LIZLLL).LJIIIZ()) {
            ImageAlbumData imageAlbumData = ((AwemeDraft) this.LIZ.LIZLLL).LJJJJI.imageAlbumData;
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                Iterator<SingleImageData> it = imageList.iterator();
                while (it.hasNext()) {
                    String filterId = it.next().getFilterInfo().getFilterId();
                    if (filterId.length() > 0) {
                        StringBuilder LIZ = X1D.LIZ();
                        LJJLIIIIJ2 = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJLIIIIJ("");
                        LIZ.append(LJJLIIIIJ2);
                        LIZ.append(filterId);
                        if (!C39579Fg7.LIZIZ(X1D.LIZIZ(LIZ))) {
                            this.LIZJ.add(filterId);
                        }
                    }
                }
            }
            return Boolean.valueOf(this.LIZJ.isEmpty());
        }
        String str = ((AwemeDraft) this.LIZ.LIZLLL).LJJJJI.selectedFilterId;
        if (str == null || str.length() == 0) {
            return Boolean.TRUE;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LJJLIIIIJ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJLIIIIJ("");
        LIZ2.append(LJJLIIIIJ);
        LIZ2.append(str);
        if (C39579Fg7.LIZIZ(X1D.LIZIZ(LIZ2))) {
            return Boolean.TRUE;
        }
        this.LIZJ.add(str);
        return Boolean.FALSE;
    }

    @Override // X.AbstractC168856jx
    public final Object LJFF(InterfaceC67352kd<? super List<DraftFileRestoreResult>> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append(" ; restore start ...");
        C5Z2.LIZ(X1D.LIZIZ(LIZ));
        xks.LJIILIIL(new AqS133S0200000_2(this, (C73411SrX) C60903NvH.LJIIJJI().LJIILL().LJI().LIZJ(false).LJJIII(new IDhS95S0100000_2(this, 8), false).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS51S0200000_2(xks, this, 2), new AfS51S0200000_2(xks, this, 3)), 108));
        return xks.LJIIJJI();
    }
}
