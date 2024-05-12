package X;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Ht2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45476Ht2 implements InterfaceC43977HNt {
    public final /* synthetic */ C45473Hsz LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.InterfaceC43977HNt
    public final void LIZ(MyMediaModel myMediaModel) {
        C45800HyG c45800HyG;
        TM0 tm0;
        C45800HyG c45800HyG2;
        C45498HtO c45498HtO;
        C45498HtO c45498HtO2;
        C45498HtO c45498HtO3;
        if (myMediaModel == null) {
            return;
        }
        Iterator<MyMediaModel> it = this.LIZ.LJ.iterator();
        int i = 1;
        while (it.hasNext()) {
            MyMediaModel next = it.next();
            if (this.LIZ.LJJIL) {
                if (o.LJ(myMediaModel.fileLocalUriPath, next.fileLocalUriPath) && TextUtils.equals(myMediaModel.LJII(), next.LJII())) {
                    next.selectIndex = -1;
                }
                next.selectIndex = i;
                i++;
            } else if (o.LJ(myMediaModel.fileLocalUriPath, next.fileLocalUriPath)) {
                next.selectIndex = -1;
            } else {
                next.selectIndex = i;
                i++;
            }
        }
        this.LIZ.LJJJIL(myMediaModel);
        AbstractC45488HtE abstractC45488HtE = this.LIZ.LJJIII;
        if (abstractC45488HtE != null && (c45498HtO3 = abstractC45488HtE.LJLJI) != null) {
            ((ArrayList) c45498HtO3.LJLJJLL).remove(myMediaModel);
            c45498HtO3.LLFZ();
        }
        AbstractC45488HtE abstractC45488HtE2 = this.LIZ.LJJIIJ;
        if (abstractC45488HtE2 != null && (c45498HtO2 = abstractC45488HtE2.LJLJI) != null) {
            ((ArrayList) c45498HtO2.LJLJJLL).remove(myMediaModel);
            c45498HtO2.LLFZ();
        }
        AbstractC45488HtE abstractC45488HtE3 = this.LIZ.LJJIIJZLJL;
        if (abstractC45488HtE3 != null && (c45498HtO = abstractC45488HtE3.LJLJI) != null) {
            ((ArrayList) c45498HtO.LJLJJLL).remove(myMediaModel);
            c45498HtO.LLFZ();
        }
        if (myMediaModel.libraryState != null && (tm0 = this.LIZ.LJJIIZ) != null && (c45800HyG2 = tm0.LLFII) != null) {
            myMediaModel.selectIndex = -1;
            c45800HyG2.notifyItemChanged(myMediaModel.mediaIndex, new Object());
            Iterator it2 = ((ArrayList) c45800HyG2.LJLJJI.LJJJJLI).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (o.LJ(((MediaModel) next2).id, myMediaModel.id)) {
                    if (next2 != null) {
                        ((ArrayList) c45800HyG2.LJLJJI.LJJJJLI).remove(next2);
                    }
                }
            }
        }
        AbstractC45488HtE abstractC45488HtE4 = this.LIZ.LJJIII;
        if (abstractC45488HtE4 != null) {
            abstractC45488HtE4.LLJJIJI();
        }
        AbstractC45488HtE abstractC45488HtE5 = this.LIZ.LJJIIJ;
        if (abstractC45488HtE5 != null) {
            abstractC45488HtE5.LLJJIJI();
        }
        AbstractC45488HtE abstractC45488HtE6 = this.LIZ.LJJIIJZLJL;
        if (abstractC45488HtE6 != null) {
            abstractC45488HtE6.LLJJIJI();
        }
        TM0 tm02 = this.LIZ.LJJIIZ;
        if (tm02 != null && (c45800HyG = tm02.LLFII) != null) {
            c45800HyG.LJZL();
        }
        InterfaceC43977HNt interfaceC43977HNt = this.LIZ.LJIILLIIL;
        if (interfaceC43977HNt != null) {
            interfaceC43977HNt.LIZ(myMediaModel);
        }
        boolean LJI = myMediaModel.LJI();
        boolean z = this.LIZIZ;
        boolean z2 = this.LIZ.LJJ;
        C145995oB LIZ = C45493HtJ.LIZ(LJI);
        LIZ.LIZ(z ? 1 : 0, "is_editor_pro");
        LIZ.LIZ(z2 ? 1 : 0, "is_pip");
        FMX.LJIIL("edit_clip_delete", LIZ.LIZ);
    }

    public C45476Ht2(C45473Hsz c45473Hsz, boolean z) {
        this.LIZ = c45473Hsz;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC43977HNt
    public final void LIZIZ(MyMediaModel myMediaModel, View view) {
        C45495HtL c45495HtL;
        if (myMediaModel != null && (c45495HtL = myMediaModel.libraryState) != null) {
            C45473Hsz c45473Hsz = this.LIZ;
            if (c45495HtL.isFailed()) {
                myMediaModel.libraryState.setLastDownloadFailed(true);
                ChooseMediaViewModel chooseMediaViewModel = c45473Hsz.LJJIJLIJ;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.Nv0(myMediaModel);
                }
                AbstractC43973HNp abstractC43973HNp = c45473Hsz.LIZLLL;
                if (abstractC43973HNp != null) {
                    abstractC43973HNp.notifyItemChanged(myMediaModel.selectIndex - 1);
                } else {
                    o.LJIJI("videoImageMixedAdapter");
                    throw null;
                }
            }
        }
        InterfaceC43977HNt interfaceC43977HNt = this.LIZ.LJIILLIIL;
        if (interfaceC43977HNt != null) {
            interfaceC43977HNt.LIZIZ(myMediaModel, view);
        }
        if (myMediaModel != null) {
            C145995oB LIZ = C45493HtJ.LIZ(myMediaModel.LJI());
            LIZ.LJI("edit_way", "click");
            FMX.LJIIL("edit_clip_preview", LIZ.LIZ);
        }
    }

    @Override // X.InterfaceC43977HNt
    public final void LJFF(int i, int i2) {
        this.LIZ.LJJJI(i, i2, false);
    }
}
