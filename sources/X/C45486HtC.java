package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LibraryModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HtC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45486HtC implements InterfaceC46114I7y {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    @Override // X.InterfaceC46114I7y
    public final void LIZLLL(int i) {
    }

    @Override // X.InterfaceC46114I7y
    public final void LJ(ViewGroup viewGroup) {
    }

    public C45486HtC(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC46114I7y
    public final void LIZ(String categoryName) {
        CreativeModel creativeModel;
        LibraryModel libraryModel;
        CreativeModel creativeModel2;
        LibraryModel libraryModel2;
        o.LJIIIZ(categoryName, "categoryName");
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        ShortVideoContext shortVideoContext = mvChoosePhotoScene.LLJLLIL;
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (libraryModel2 = creativeModel2.libraryModel) != null) {
            libraryModel2.lastLibraryCategory = categoryName;
        }
        VideoPublishEditModel videoPublishEditModel = mvChoosePhotoScene.LLJZ;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (libraryModel = creativeModel.libraryModel) == null) {
            return;
        }
        libraryModel.lastLibraryCategory = categoryName;
    }

    @Override // X.InterfaceC46114I7y
    public final void LIZIZ(List<OSZ<ProviderEffect, Integer>> dataList) {
        o.LJIIIZ(dataList, "dataList");
    }

    @Override // X.InterfaceC46114I7y
    public final void LIZJ(ProviderEffect data, TEA state, ArrayList arrayList) {
        Object obj;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(state, "state");
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((MediaModel) obj).id, data.getId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MyMediaModel myMediaModel = (MyMediaModel) obj;
            if (myMediaModel == null) {
                return;
            }
            ChooseMediaViewModel chooseMediaViewModel = this.LIZ.LLLLLIL;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.LJLLJ = 0;
                chooseMediaViewModel.Rv0(arrayList);
            }
            MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
            mvChoosePhotoScene.LLLLII = myMediaModel.mediaIndex;
            mvChoosePhotoScene.LLLLIIL = false;
            mvChoosePhotoScene.LLLIIIIL(new AqS157S0100000_7(myMediaModel, 490), DIF.LJLIL, new AqS157S0100000_7(this.LIZ, 495));
            ChooseMediaViewModel chooseMediaViewModel2 = this.LIZ.LLLLLIL;
            if (chooseMediaViewModel2 == null) {
                return;
            }
            chooseMediaViewModel2.Nv0(myMediaModel);
        }
    }
}
