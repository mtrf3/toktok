package X;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PlDataBean;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.vesdk.VEImageDetectUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hso, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45462Hso implements InterfaceC45510Hta {
    public final /* synthetic */ MvChoosePhotoScene LJLIL;

    @Override // X.InterfaceC45510Hta
    public final boolean LJII(MyMediaModel myMediaModel) {
        return true;
    }

    @Override // X.InterfaceC45510Hta
    public final boolean LIZIZ() {
        List<MyMediaModel> LJI;
        C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        int i = mvChoosePhotoScene.LJLLJ;
        boolean z = mvChoosePhotoScene.LLZLLIL;
        c43117Gw5.getClass();
        if (!C43117Gw5.LJ(i, z)) {
            MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
            if (mvChoosePhotoScene2.LJLLJ != 15) {
                if (mvChoosePhotoScene2.LLLJL >= mvChoosePhotoScene2.LLILZIL) {
                    return true;
                }
                return false;
            }
        }
        InterfaceC45480Ht6 interfaceC45480Ht6 = this.LJLIL.LLLLIILLL;
        if (interfaceC45480Ht6 != null && (LJI = interfaceC45480Ht6.LJI()) != null && (!LJI.isEmpty())) {
            if (LJI.size() >= this.LJLIL.LLILZIL) {
                return true;
            }
        }
        return false;
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

    public C45462Hso(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LJLIL = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC45510Hta
    public final boolean LJIIJJI(MyMediaModel myMediaModel) {
        String str;
        String str2;
        SdkExtraInfo sdkExtraInfo;
        PlDataBean pl;
        List<String> alg;
        if (myMediaModel == null) {
            return false;
        }
        SdkExtraInfo sdkExtraInfo2 = this.LJLIL.LLJILJILJ;
        if (sdkExtraInfo2 == null || !sdkExtraInfo2.isLegal()) {
            return true;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        if (myMediaModel.height < mvChoosePhotoScene.LLJ || myMediaModel.width < mvChoosePhotoScene.LLIZLLLIL) {
            C5S1 c5s1 = new C5S1(mvChoosePhotoScene.requireSceneContext());
            String str3 = mvChoosePhotoScene.LLJI;
            if (str3 == null) {
                str3 = "";
            }
            c5s1.LIZLLL(str3);
            c5s1.LJ();
            return false;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
        String str4 = mvChoosePhotoScene2.LLJIJIL;
        if (str4 != null && (str2 = myMediaModel.fileLocalUriPath) != null && (sdkExtraInfo = mvChoosePhotoScene2.LLJILJILJ) != null && (pl = sdkExtraInfo.getPl()) != null && (alg = pl.getAlg()) != null) {
            C45600Hv2 c45600Hv2 = mvChoosePhotoScene2.LLLLJI;
            C45543Hu7 c45543Hu7 = new C45543Hu7(atomicBoolean);
            synchronized (c45600Hv2) {
                VEImageDetectUtils vEImageDetectUtils = new VEImageDetectUtils();
                c45600Hv2.LIZ = vEImageDetectUtils;
                vEImageDetectUtils.init();
                c45600Hv2.LIZ.setDetectImageContentListener(c45543Hu7);
                c45600Hv2.LIZ.detectImageContent(str4, str2, alg, 1280, 1280);
                c45600Hv2.LIZ.destroy();
            }
        }
        if (!atomicBoolean.get()) {
            C5S1 c5s12 = new C5S1(this.LJLIL.requireSceneContext());
            SdkExtraInfo sdkExtraInfo3 = this.LJLIL.LLJILJILJ;
            if (sdkExtraInfo3 == null || (str = sdkExtraInfo3.getMvAlgorithmHint()) == null) {
                str = "";
            }
            c5s12.LIZLLL(str);
            c5s12.LJ();
        }
        return atomicBoolean.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0217, code lost:
    
        if (r14 != null) goto L86;
     */
    @Override // X.InterfaceC45510Hta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r14) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45462Hso.LJIIL(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel):void");
    }

    @Override // X.InterfaceC45510Hta
    public final int LIZJ(MyMediaModel myMediaModel, boolean z) {
        List<MyMediaModel> list;
        MediaModel mediaModel;
        List<MyMediaModel> list2;
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        if (mvChoosePhotoScene.LJLLJ != 10 && mvChoosePhotoScene.LLLFFI(myMediaModel)) {
            return 0;
        }
        this.LJLIL.LLLILZ();
        if (myMediaModel != null) {
            java.util.Map<String, String> map = this.LJLIL.LLL;
            String str = myMediaModel.id;
            o.LJIIIIZZ(str, "it.id");
            map.put(str, "photos");
        }
        ChooseMediaViewModel chooseMediaViewModel = this.LJLIL.LLLLLIL;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.setState(C45568HuW.LJLIL);
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
        InterfaceC45480Ht6 interfaceC45480Ht6 = mvChoosePhotoScene2.LLLLIILLL;
        if (interfaceC45480Ht6 != null) {
            if (mvChoosePhotoScene2.LLLII() && myMediaModel != null) {
                C45501HtR c45501HtR = mvChoosePhotoScene2.LLIIIL;
                if (c45501HtR != null) {
                    c45501HtR.LLJJI(myMediaModel, z);
                }
                return interfaceC45480Ht6.LJIJ(myMediaModel, z, false);
            }
            C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
            int i = mvChoosePhotoScene2.LJLLJ;
            boolean z2 = mvChoosePhotoScene2.LLZLLIL;
            c43117Gw5.getClass();
            if (C43117Gw5.LJ(i, z2) && myMediaModel != null) {
                return interfaceC45480Ht6.LJIJ(myMediaModel, z, false);
            }
        }
        String str2 = null;
        if (myMediaModel != null) {
            MvChoosePhotoScene mvChoosePhotoScene3 = this.LJLIL;
            if (z) {
                List<MyMediaModel> list3 = mvChoosePhotoScene3.LLLJ;
                if ((list3 != null && list3.size() == 1) || (list2 = mvChoosePhotoScene3.LLLJ) == null || list2.isEmpty()) {
                    String str3 = myMediaModel.fileLocalUriPath;
                    o.LJIIIIZZ(str3, "mediaModel.fileLocalUriPath");
                    C151425ww.LIZIZ(mvChoosePhotoScene3.LLLLLZ, str3);
                }
                C151535x7 c151535x7 = C151535x7.LIZ;
                CreativeInfo creativeInfo = mvChoosePhotoScene3.LLLLLZ;
                c151535x7.getClass();
                C151535x7.LJIIIZ(creativeInfo, myMediaModel);
            } else {
                mvChoosePhotoScene3.getClass();
                C151535x7 c151535x72 = C151535x7.LIZ;
                CreativeInfo creativeInfo2 = mvChoosePhotoScene3.LLLLLZ;
                c151535x72.getClass();
                C151535x7.LIZIZ(creativeInfo2, myMediaModel);
                String str4 = myMediaModel.fileLocalUriPath;
                OSJ<String, String, ? extends WeakReference<Bitmap>> osj = C151425ww.LIZIZ;
                if (osj != null) {
                    str2 = osj.getFirst();
                }
                if (o.LJ(str4, str2) && (list = mvChoosePhotoScene3.LLLJ) != null && (mediaModel = (MediaModel) ORZ.LJLLLLLL(0, list)) != null) {
                    String str5 = mediaModel.fileLocalUriPath;
                    o.LJIIIIZZ(str5, "it.fileLocalUriPath");
                    C151425ww.LIZIZ(mvChoosePhotoScene3.LLLLLZ, str5);
                }
            }
        }
        List<MyMediaModel> list4 = this.LJLIL.LLLJ;
        if (list4 == null || !(!list4.isEmpty())) {
            return 1;
        }
        return list4.size();
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
        ChooseMediaViewModel chooseMediaViewModel = mvChoosePhotoScene2.LLLLLIL;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.LJLLJ = 3;
            chooseMediaViewModel.Rv0(chooseMediaViewModel.LJLJJLL);
        }
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LJLIL;
        mvChoosePhotoScene3.LLLLII = mvChoosePhotoScene3.LLLIIIL(myMediaModel);
        MvChoosePhotoScene mvChoosePhotoScene4 = this.LJLIL;
        mvChoosePhotoScene4.LLLLIIL = false;
        mvChoosePhotoScene4.LLLIIIIL(new AqS157S0100000_7(myMediaModel, 478), new AqS157S0100000_7(this.LJLIL, 479), new AqS157S0100000_7(this.LJLIL, 480));
    }

    @Override // X.InterfaceC45510Hta
    public final void LJIILL(List<MyMediaModel> list, EnumC44979Hl1 enumC44979Hl1, MyMediaModel myMediaModel) {
        int i;
        String str;
        if (myMediaModel != null) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
            if (mvChoosePhotoScene.LLJJ && (myMediaModel.height < mvChoosePhotoScene.LLJ || myMediaModel.width < mvChoosePhotoScene.LLIZLLLIL)) {
                return;
            }
        }
        boolean z = false;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
        if (mvChoosePhotoScene2.LLLJL < i) {
            Size size = null;
            if (myMediaModel != null) {
                str = myMediaModel.mediaRatio;
                size = new Size(myMediaModel.width, myMediaModel.height);
            } else {
                str = null;
            }
            mvChoosePhotoScene2.LLLZIIL(enumC44979Hl1, str, size, i, C79081V1x.LJJIJL(myMediaModel));
        }
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LJLIL;
        mvChoosePhotoScene3.LLLJL = i;
        mvChoosePhotoScene3.LLLJ = list;
        if (i > 0 || mvChoosePhotoScene3.LLLL > 0) {
            z = true;
        }
        mvChoosePhotoScene3.e(z);
        this.LJLIL.LLZLL(list);
        this.LJLIL.LLZLI(i);
    }
}
