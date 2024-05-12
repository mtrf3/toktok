package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.internal.IMediaCacheService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hsq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45464Hsq implements InterfaceC45510Hta {
    public final /* synthetic */ MvChoosePhotoScene LJLIL;

    @Override // X.InterfaceC45510Hta
    public final boolean LJIIJJI(MyMediaModel myMediaModel) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0036 A[ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC45510Hta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r4 = this;
            X.Gw5 r1 = X.C43117Gw5.LIZ
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r4.LJLIL
            int r0 = r0.LJLLJ
            r1.getClass()
            r3 = 0
            boolean r0 = X.C43117Gw5.LJ(r0, r3)
            if (r0 != 0) goto L18
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r2 = r4.LJLIL
            int r1 = r2.LJLLJ
            r0 = 15
            if (r1 != r0) goto L38
        L18:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r4.LJLIL
            X.Ht6 r0 = r0.LLLLIILLL
            if (r0 == 0) goto L37
            java.util.List r1 = r0.LJI()
            if (r1 == 0) goto L37
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r0 = r4.LJLIL
            int r1 = r1.size()
            int r0 = r0.LLIZ
            if (r1 < r0) goto L37
        L36:
            r3 = 1
        L37:
            return r3
        L38:
            int r1 = r2.LLLL
            int r0 = r2.LLIZ
            if (r1 < r0) goto L37
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45464Hsq.LIZIZ():boolean");
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

    public C45464Hsq(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LJLIL = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC45510Hta
    public final boolean LJII(MyMediaModel myMediaModel) {
        if (!C6KD.LIZ()) {
            Context requireSceneContext = this.LJLIL.requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            if (C6KC.LIZJ(requireSceneContext, C44694HgQ.LJIIL(myMediaModel), "video_upload", false, 24)) {
                return false;
            }
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        InterfaceC45496HtM interfaceC45496HtM = mvChoosePhotoScene.LLLLLILLIL;
        if (interfaceC45496HtM != null) {
            return interfaceC45496HtM.LIZLLL(mvChoosePhotoScene.getApplicationContext(), this.LJLIL.LLLLIILLL, myMediaModel);
        }
        return true;
    }

    @Override // X.InterfaceC45510Hta
    public final void LJIIL(MediaModel mediaModel) {
        if (mediaModel != null) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
            MyMediaModel.Companion.getClass();
            MyMediaModel LIZIZ = C43966HNi.LIZIZ(mediaModel);
            mvChoosePhotoScene.LLL(C47261Igj.LJJIJIL(C43966HNi.LIZIZ(mediaModel)), EnumC44979Hl1.THUMBNAIL, LIZIZ.mediaRatio, new Size(LIZIZ.width, LIZIZ.height));
            MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
            java.util.Map<String, String> map = mvChoosePhotoScene2.LLL;
            String str = mediaModel.id;
            o.LJIIIIZZ(str, "it.id");
            map.put(str, mvChoosePhotoScene2.LLLILZLLLI());
        }
        this.LJLIL.LLJILJIL.clear();
        if (mediaModel != null) {
            this.LJLIL.LLJILJIL.add(mediaModel);
        }
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LJLIL;
        mvChoosePhotoScene3.LLLILZ = 2;
        mvChoosePhotoScene3.LLLILZ();
        this.LJLIL.LLLZZ();
    }

    @Override // X.InterfaceC45510Hta
    public final int LIZJ(MyMediaModel myMediaModel, boolean z) {
        this.LJLIL.LLLILZ();
        if (myMediaModel != null) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
            java.util.Map<String, String> map = mvChoosePhotoScene.LLL;
            String str = myMediaModel.id;
            o.LJIIIIZZ(str, "it.id");
            map.put(str, "videos");
            if (HOA.LIZ() && mvChoosePhotoScene.LJLLJ == 0 && !z && (myMediaModel.startTime != 0 || myMediaModel.endTime != 0)) {
                myMediaModel.startTime = 0;
                myMediaModel.endTime = 0;
                ChooseMediaViewModel chooseMediaViewModel = mvChoosePhotoScene.LLLLLIL;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.Ov0(myMediaModel);
                }
                IMediaCacheService LJIIZILJ = C60903NvH.LJIIJJI().LJIIZILJ();
                String str2 = myMediaModel.fileLocalUriPath;
                o.LJIIIIZZ(str2, "it.fileLocalUriPath");
                LJIIZILJ.removeTargetMediaBlurThumbnailCache(str2);
            }
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.LJLIL.LLLLLIL;
        if (chooseMediaViewModel2 != null) {
            chooseMediaViewModel2.setState(C45568HuW.LJLIL);
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
        InterfaceC45480Ht6 interfaceC45480Ht6 = mvChoosePhotoScene2.LLLLIILLL;
        if (interfaceC45480Ht6 != null) {
            if (mvChoosePhotoScene2.LLLII() && myMediaModel != null) {
                C45501HtR c45501HtR = mvChoosePhotoScene2.LLIIIL;
                if (c45501HtR != null) {
                    c45501HtR.LLJJI(myMediaModel, z);
                }
                return interfaceC45480Ht6.LJIJ(myMediaModel, z, true);
            }
            C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
            int i = mvChoosePhotoScene2.LJLLJ;
            c43117Gw5.getClass();
            if (C43117Gw5.LJ(i, false) && myMediaModel != null) {
                return interfaceC45480Ht6.LJIJ(myMediaModel, z, true);
            }
        }
        List<MyMediaModel> list = this.LJLIL.LLLJIL;
        if (list == null || !(!list.isEmpty())) {
            return 1;
        }
        return list.size();
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
            chooseMediaViewModel2.LJLLJ = 2;
            chooseMediaViewModel2.Rv0(chooseMediaViewModel2.LJLJL);
        }
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LJLIL;
        mvChoosePhotoScene3.LLLLII = mvChoosePhotoScene3.LLLIIIL(myMediaModel);
        MvChoosePhotoScene mvChoosePhotoScene4 = this.LJLIL;
        mvChoosePhotoScene4.LLLLIIL = false;
        mvChoosePhotoScene4.LLLIIIIL(new AqS157S0100000_7(myMediaModel, 482), new AqS157S0100000_7(this.LJLIL, 483), new AqS157S0100000_7(this.LJLIL, 484));
    }

    @Override // X.InterfaceC45510Hta
    public final void LJIILL(List<MyMediaModel> list, EnumC44979Hl1 enumC44979Hl1, MyMediaModel myMediaModel) {
        int i;
        String str;
        boolean z = false;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        if (mvChoosePhotoScene.LLLL < i) {
            Size size = null;
            if (myMediaModel != null) {
                str = myMediaModel.mediaRatio;
                size = new Size(myMediaModel.width, myMediaModel.height);
            } else {
                str = null;
            }
            mvChoosePhotoScene.LLL(list, enumC44979Hl1, str, size);
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
        mvChoosePhotoScene2.LLLL = i;
        mvChoosePhotoScene2.LLLJIL = list;
        if (mvChoosePhotoScene2.LLLJL > 0 || i > 0) {
            z = true;
        }
        mvChoosePhotoScene2.e(z);
        this.LJLIL.LLZLL(list);
        this.LJLIL.LLZLI(i);
    }
}
