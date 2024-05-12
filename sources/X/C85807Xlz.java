package X;

import Y.ACListenerS21S0100000_1;
import Y.AObjectS132S0100000_2;
import Y.AObjectS54S0101000_9;
import Y.AObjectS55S0101000_10;
import Y.IDCListenerS286S0100000_11;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS181S0100000_15;

/* renamed from: X.Xlz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C85807Xlz implements InterfaceC29911Fj {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ BaseScreenAdaptScene LJLILLLLZI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.LJLIL) {
            case 0:
                VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) this.LJLILLLLZI;
                C85808Xm0 c85808Xm0 = (C85808Xm0) obj;
                videoEditContainerScene.getClass();
                int i = c85808Xm0.LIZ;
                int i2 = c85808Xm0.LIZIZ;
                boolean z = c85808Xm0.LIZJ;
                boolean z2 = c85808Xm0.LIZLLL;
                C6FS LLLIILIL = videoEditContainerScene.LLLIILIL();
                if (LLLIILIL == null) {
                    return;
                }
                AObjectS54S0101000_9 aObjectS54S0101000_9 = new AObjectS54S0101000_9(4, LLLIILIL, 0);
                AObjectS55S0101000_10 aObjectS55S0101000_10 = new AObjectS55S0101000_10(3, LLLIILIL, 1);
                AObjectS132S0100000_2 aObjectS132S0100000_2 = new AObjectS132S0100000_2(LLLIILIL, 2);
                C64894PdS c64894PdS = new C64894PdS(3, LLLIILIL);
                FragmentManager supportFragmentManager = ((ActivityC45651qj) videoEditContainerScene.mActivity).getSupportFragmentManager();
                ArrayList arrayList = new ArrayList();
                if (!z) {
                    C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.ezn);
                    LIZIZ.LIZJ = 0;
                    LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS180S0100000_14(aObjectS55S0101000_10, 152), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                    arrayList.add(LIZIZ);
                    C252669vq c252669vq = new C252669vq();
                    c252669vq.LIZ(R.string.ezk);
                    c252669vq.LIZJ = 0;
                    c252669vq.LJ = new ACListenerS21S0100000_1(new AqS181S0100000_15(aObjectS132S0100000_2, 150), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                    arrayList.add(c252669vq);
                }
                if (z2) {
                    C252669vq LIZIZ2 = C06530Nl.LIZIZ(i);
                    LIZIZ2.LIZJ = 0;
                    LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS170S0100000_4(aObjectS54S0101000_9, 785), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                    if (i2 != -1) {
                        LIZIZ2.LJI = Integer.valueOf(i2);
                    }
                    arrayList.add(LIZIZ2);
                }
                C245319jz c245319jz = new C245319jz();
                C252669vq[] c252669vqArr = (C252669vq[]) arrayList.toArray(new C252669vq[0]);
                c245319jz.LIZIZ((C252669vq[]) Arrays.copyOf(c252669vqArr, c252669vqArr.length));
                c245319jz.LIZLLL(R.string.ezj);
                c245319jz.LIZ.LJLIL = new IDCListenerS286S0100000_11(c64894PdS, 1);
                if (supportFragmentManager == null) {
                    return;
                }
                c245319jz.LIZJ().show(supportFragmentManager, "test");
                return;
            default:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) this.LJLILLLLZI;
                videoRecordNewScene.getClass();
                if (((Boolean) obj).booleanValue()) {
                    videoRecordNewScene.LLLLLILLIL(false, videoRecordNewScene.getString(R.string.hvo), EnumC42288Gii.GONE);
                    return;
                }
                ProgressDialogC43239Gy3 progressDialogC43239Gy3 = videoRecordNewScene.LLFF;
                if (progressDialogC43239Gy3 == null || !progressDialogC43239Gy3.isShowing()) {
                    return;
                }
                videoRecordNewScene.LLFF.dismiss();
                videoRecordNewScene.LLFF = null;
                return;
        }
    }

    public /* synthetic */ C85807Xlz(BaseScreenAdaptScene baseScreenAdaptScene, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = baseScreenAdaptScene;
    }
}
