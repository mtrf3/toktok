package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;

/* renamed from: X.Hsx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45471Hsx implements InterfaceC43977HNt {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    @Override // X.InterfaceC43977HNt
    public final void LJFF(int i, int i2) {
    }

    public C45471Hsx(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC43977HNt
    public final void LIZ(MyMediaModel myMediaModel) {
        List<MyMediaModel> LJI;
        boolean z;
        C45498HtO c45498HtO;
        C45498HtO c45498HtO2;
        C45500HtQ c45500HtQ = this.LIZ.LLIIJLIL;
        if (c45500HtQ != null && (c45498HtO2 = c45500HtQ.LJLJI) != null) {
            c45498HtO2.LLII(myMediaModel);
        }
        C45501HtR c45501HtR = this.LIZ.LLIIIL;
        if (c45501HtR != null && (c45498HtO = c45501HtR.LJLJI) != null) {
            c45498HtO.LLII(myMediaModel);
        }
        InterfaceC45480Ht6 interfaceC45480Ht6 = this.LIZ.LLLLIILLL;
        if (interfaceC45480Ht6 != null && (LJI = interfaceC45480Ht6.LJI()) != null) {
            int size = LJI.size();
            MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
            mvChoosePhotoScene.LLZLI(size);
            if (size > 0) {
                z = true;
            } else {
                z = false;
            }
            mvChoosePhotoScene.e(z);
        }
    }

    @Override // X.InterfaceC43977HNt
    public final void LIZIZ(MyMediaModel myMediaModel, View view) {
        List<MyMediaModel> LJI;
        ArrayList<MyMediaModel> LJIIJ;
        ChooseMediaViewModel chooseMediaViewModel;
        InterfaceC45480Ht6 interfaceC45480Ht6;
        ArrayList<MyMediaModel> LJIIIZ;
        ChooseMediaViewModel chooseMediaViewModel2;
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        if (mvChoosePhotoScene.m && mvChoosePhotoScene.LLLLZLLLI()) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
        mvChoosePhotoScene2.m = true;
        if (myMediaModel != null && view != null) {
            if (!C45508HtY.LIZIZ(myMediaModel.fileLocalUriPath, true)) {
                mvChoosePhotoScene2.m = false;
                return;
            }
            InterfaceC45480Ht6 interfaceC45480Ht62 = mvChoosePhotoScene2.LLLLIILLL;
            if (interfaceC45480Ht62 != null && (LJI = interfaceC45480Ht62.LJI()) != null) {
                if (mvChoosePhotoScene2.LLZIL.LJFF.showDockInPreviewPage && (interfaceC45480Ht6 = mvChoosePhotoScene2.LLLLIILLL) != null && (LJIIIZ = interfaceC45480Ht6.LJIIIZ()) != null && (chooseMediaViewModel2 = mvChoosePhotoScene2.LLLLLIL) != null) {
                    chooseMediaViewModel2.setState(new AqS173S0100000_7((ArrayList) LJIIIZ, (ArrayList<MyMediaModel>) 271));
                }
                if (mvChoosePhotoScene2.LLLLZLLIL() || mvChoosePhotoScene2.LLLLZLLLI() || mvChoosePhotoScene2.LLLLLLJ()) {
                    InterfaceC45480Ht6 interfaceC45480Ht63 = mvChoosePhotoScene2.LLLLIILLL;
                    if (interfaceC45480Ht63 != null && (LJIIJ = interfaceC45480Ht63.LJIIJ()) != null && (chooseMediaViewModel = mvChoosePhotoScene2.LLLLLIL) != null) {
                        ArrayList<MyMediaModel> arrayList = new ArrayList<>(LJIIJ);
                        chooseMediaViewModel.LJLLJ = 0;
                        chooseMediaViewModel.Rv0(arrayList);
                    }
                } else {
                    ChooseMediaViewModel chooseMediaViewModel3 = mvChoosePhotoScene2.LLLLLIL;
                    if (chooseMediaViewModel3 != null) {
                        ArrayList<MyMediaModel> arrayList2 = new ArrayList<>(LJI);
                        chooseMediaViewModel3.LJLLJ = 0;
                        chooseMediaViewModel3.Rv0(arrayList2);
                    }
                }
                mvChoosePhotoScene2.LLLLIIIILLL = myMediaModel.selectIndex - 1;
                mvChoosePhotoScene2.LLLLIIL = true;
                C45628HvU.LLJILJIL = new C45469Hsv(mvChoosePhotoScene2, myMediaModel, myMediaModel);
                mvChoosePhotoScene2.LLLZZIL(C45628HvU.class, true);
            }
        }
    }
}
