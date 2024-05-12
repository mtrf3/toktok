package X;

import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.internal.IMediaCacheService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hsr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45465Hsr implements InterfaceC45510Hta {
    public final /* synthetic */ MvChoosePhotoScene LJLIL;
    public final /* synthetic */ C45464Hsq LJLILLLLZI;
    public final /* synthetic */ C45462Hso LJLJI;

    @Override // X.InterfaceC45510Hta
    public final boolean LJIIJJI(MyMediaModel myMediaModel) {
        return true;
    }

    @Override // X.InterfaceC45510Hta
    public final boolean LIZIZ() {
        List<MyMediaModel> LJI;
        InterfaceC45480Ht6 interfaceC45480Ht6 = this.LJLIL.LLLLIILLL;
        if (interfaceC45480Ht6 == null || (LJI = interfaceC45480Ht6.LJI()) == null) {
            return false;
        }
        if (LJI.size() < this.LJLIL.LLILZIL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC45510Hta
    public final boolean LJ() {
        List<MyMediaModel> LJI;
        InterfaceC45480Ht6 interfaceC45480Ht6 = this.LJLIL.LLLLIILLL;
        if (interfaceC45480Ht6 == null || (LJI = interfaceC45480Ht6.LJI()) == null) {
            return false;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        ArrayList arrayList = new ArrayList();
        for (MyMediaModel myMediaModel : LJI) {
            if (myMediaModel.LJI()) {
                arrayList.add(myMediaModel);
            }
        }
        if (arrayList.size() < mvChoosePhotoScene.LLIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC45510Hta
    public final boolean LJIILIIL() {
        return this.LJLIL.LLZZZZ();
    }

    @Override // X.InterfaceC45510Hta
    public final boolean LJIILJJIL() {
        List<MyMediaModel> LJI;
        InterfaceC45480Ht6 interfaceC45480Ht6 = this.LJLIL.LLLLIILLL;
        if (interfaceC45480Ht6 == null || (LJI = interfaceC45480Ht6.LJI()) == null) {
            return false;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        ArrayList arrayList = new ArrayList();
        for (MyMediaModel myMediaModel : LJI) {
            if (myMediaModel.LJI()) {
                arrayList.add(myMediaModel);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (MyMediaModel myMediaModel2 : LJI) {
            if (myMediaModel2.LJ()) {
                arrayList2.add(myMediaModel2);
            }
        }
        if (arrayList2.size() < mvChoosePhotoScene.LLILZIL - size) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC45510Hta
    public final boolean LJII(MyMediaModel myMediaModel) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        InterfaceC45496HtM interfaceC45496HtM = mvChoosePhotoScene.LLLLLILLIL;
        if (interfaceC45496HtM != null) {
            return interfaceC45496HtM.LIZLLL(mvChoosePhotoScene.getApplicationContext(), this.LJLIL.LLLLIILLL, myMediaModel);
        }
        return true;
    }

    @Override // X.InterfaceC45510Hta
    public final void LJIIL(MediaModel mediaModel) {
        if (!this.LJLIL.LLLLZIL()) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
            if (!mvChoosePhotoScene.LLZL && !mvChoosePhotoScene.LLLLZLLIL() && !this.LJLIL.LLLLZLLLI() && !this.LJLIL.LLLLLLJ()) {
                MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
                if (mvChoosePhotoScene2.LJLLJ != 31 && !mvChoosePhotoScene2.LLLLLLL() && !C43326GzS.LIZ() && !this.LJLIL.LLLLLLLLL()) {
                    return;
                }
            }
        }
        if (mediaModel != null && mediaModel.LJI()) {
            this.LJLILLLLZI.LJIIL(mediaModel);
        } else {
            this.LJLJI.LJIIL(mediaModel);
        }
    }

    @Override // X.InterfaceC45510Hta
    public final int LIZJ(MyMediaModel myMediaModel, boolean z) {
        this.LJLIL.LLLILZ();
        ChooseMediaViewModel chooseMediaViewModel = this.LJLIL.LLLLLIL;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.setState(C45568HuW.LJLIL);
        }
        boolean z2 = true;
        if (myMediaModel != null && myMediaModel.LJI()) {
            C45500HtQ c45500HtQ = this.LJLIL.LLIIJLIL;
            if (c45500HtQ != null) {
                c45500HtQ.LLJJI(myMediaModel, z);
            }
        } else {
            C45499HtP c45499HtP = this.LJLIL.LLIIIZ;
            if (c45499HtP != null) {
                c45499HtP.LLJJI(myMediaModel, z);
            }
        }
        if (myMediaModel != null) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
            java.util.Map<String, String> map = mvChoosePhotoScene.LLL;
            String str = myMediaModel.id;
            o.LJIIIIZZ(str, "it.id");
            map.put(str, "all");
            if (HOA.LIZ() && mvChoosePhotoScene.LJLLJ == 0 && myMediaModel.LJI() && !z && (myMediaModel.startTime != 0 || myMediaModel.endTime != 0)) {
                myMediaModel.startTime = 0;
                myMediaModel.endTime = 0;
                ChooseMediaViewModel chooseMediaViewModel2 = mvChoosePhotoScene.LLLLLIL;
                if (chooseMediaViewModel2 != null) {
                    chooseMediaViewModel2.Ov0(myMediaModel);
                }
                IMediaCacheService LJIIZILJ = C60903NvH.LJIIJJI().LJIIZILJ();
                String str2 = myMediaModel.fileLocalUriPath;
                o.LJIIIIZZ(str2, "it.fileLocalUriPath");
                LJIIZILJ.removeTargetMediaBlurThumbnailCache(str2);
            }
        }
        InterfaceC45480Ht6 interfaceC45480Ht6 = this.LJLIL.LLLLIILLL;
        o.LJI(interfaceC45480Ht6);
        if (myMediaModel == null || !myMediaModel.LJI()) {
            z2 = false;
        }
        return interfaceC45480Ht6.LJIJ(myMediaModel, z, z2);
    }

    @Override // X.InterfaceC45510Hta
    public final void LIZLLL(MyMediaModel myMediaModel, View view) {
        if (myMediaModel == null || view == null) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        if (mvChoosePhotoScene.m && mvChoosePhotoScene.LLLLZLLLI()) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
        mvChoosePhotoScene2.m = true;
        if (mvChoosePhotoScene2.LLLLLZL()) {
            Bundle bundle = this.LJLIL.mArguments;
            long j = -1;
            if (bundle != null) {
                j = bundle.getLong("Key_replace_item_duration", -1L);
            }
            ChooseMediaViewModel chooseMediaViewModel = this.LJLIL.LLLLLIL;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.Mv0(j);
            }
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.LJLIL.LLLLLIL;
        if (chooseMediaViewModel2 != null) {
            chooseMediaViewModel2.LJLLJ = 1;
            chooseMediaViewModel2.Rv0(chooseMediaViewModel2.LJLJLJ);
        }
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LJLIL;
        mvChoosePhotoScene3.LLLLII = mvChoosePhotoScene3.LLLIIIL(myMediaModel);
        MvChoosePhotoScene mvChoosePhotoScene4 = this.LJLIL;
        mvChoosePhotoScene4.LLLLIIL = false;
        mvChoosePhotoScene4.LLLIIIIL(new AqS157S0100000_7(myMediaModel, 476), C45546HuA.LJLIL, new AqS157S0100000_7(this.LJLIL, 477));
    }

    public C45465Hsr(MvChoosePhotoScene mvChoosePhotoScene, C45464Hsq c45464Hsq, C45462Hso c45462Hso) {
        this.LJLIL = mvChoosePhotoScene;
        this.LJLILLLLZI = c45464Hsq;
        this.LJLJI = c45462Hso;
    }

    @Override // X.InterfaceC45510Hta
    public final void LJIILL(List<MyMediaModel> list, EnumC44979Hl1 enumC44979Hl1, MyMediaModel myMediaModel) {
        int i;
        int i2;
        int i3;
        boolean z;
        String str;
        String str2;
        boolean z2 = false;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        if (mvChoosePhotoScene.LLLJL + mvChoosePhotoScene.LLLL < i) {
            if (list != null) {
                z = ((MediaModel) ListProtector.get(list, C47261Igj.LJJI(list))).LJI();
            } else {
                z = false;
            }
            Size size = null;
            if (z) {
                MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
                if (myMediaModel != null) {
                    str2 = myMediaModel.mediaRatio;
                    size = new Size(myMediaModel.width, myMediaModel.height);
                } else {
                    str2 = null;
                }
                mvChoosePhotoScene2.LLL(list, enumC44979Hl1, str2, size);
            } else {
                MvChoosePhotoScene mvChoosePhotoScene3 = this.LJLIL;
                if (myMediaModel != null) {
                    str = myMediaModel.mediaRatio;
                    size = new Size(myMediaModel.width, myMediaModel.height);
                } else {
                    str = null;
                }
                mvChoosePhotoScene3.LLLZIIL(enumC44979Hl1, str, size, i, C79081V1x.LJJIJL(myMediaModel));
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            i2 = 0;
            i3 = 0;
            for (MyMediaModel myMediaModel2 : list) {
                if (myMediaModel2.LJI()) {
                    i2++;
                    arrayList2.add(myMediaModel2);
                } else {
                    i3++;
                    arrayList.add(myMediaModel2);
                }
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        MvChoosePhotoScene mvChoosePhotoScene4 = this.LJLIL;
        mvChoosePhotoScene4.LLLJL = i3;
        mvChoosePhotoScene4.LLLL = i2;
        mvChoosePhotoScene4.LLLJ = arrayList;
        mvChoosePhotoScene4.LLLJIL = arrayList2;
        if (i3 > 0 || i2 > 0) {
            z2 = true;
        }
        mvChoosePhotoScene4.e(z2);
        this.LJLIL.LLZLL(list);
        this.LJLIL.LLZLI(i);
        TextView textView = this.LJLIL.LLD;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
