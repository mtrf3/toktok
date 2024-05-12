package com.ss.android.ugc.aweme.photo;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C43877HJx;
import X.C47261Igj;
import X.C5Z5;
import X.C60903NvH;
import X.C73969T1h;
import X.HD2;
import X.HD7;
import X.HD8;
import X.InterfaceC48038ItG;
import X.InterfaceC83865Wvl;
import X.InterfaceC86003Zc;
import X.X1D;
import Y.ACallableS6S1000000_7;
import Y.AObjectS40S0201000_7;
import Y.ARunnableS15S0101000_11;
import Y.AfS38S0101000_10;
import Y.AfS5S0100100_7;
import Y.IDhS11S1100000_7;
import android.graphics.Bitmap;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import java.util.List;

/* loaded from: classes8.dex */
public class PhotoModule implements GenericLifecycleObserver, HD8 {
    public static final int[] LJLJL = {C43877HJx.LIZ, C43877HJx.LIZIZ};
    public static final int[] LJLJLJ = {1080, 1920};
    public final InterfaceC83865Wvl LJLIL;
    public final HD7 LJLILLLLZI;
    public final HD2 LJLJI;
    public boolean LJLJJI;
    public final SafeHandler LJLJJL;
    public List<String> LJLJJLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public static boolean LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoModuleisPhotoMv1080P = ");
        LIZ.append(C47261Igj.LJIJI());
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
        return C47261Igj.LJIJI();
    }

    @Override // X.HD8
    public final void LIZ(String str) {
        this.LJLJI.LIZJ(str);
    }

    @Override // X.HD8
    public final void LIZIZ(final int i, final int i2, final boolean z) {
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        this.LJLJI.LIZJ = Bitmap.CompressFormat.PNG;
        if (i == 0) {
            if (LIZJ()) {
                i = LJLJLJ[0];
            } else {
                i = LJLJL[0];
            }
        }
        if (i2 == 0) {
            if (LIZJ()) {
                i2 = LJLJLJ[1];
            } else {
                i2 = LJLJL[1];
            }
        }
        this.LJLJJL.post(new ARunnableS15S0101000_11(3, this, 15));
        AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.HJw
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                PhotoModule photoModule = PhotoModule.this;
                int i3 = i;
                int i4 = i2;
                final String LIZ = photoModule.LJLJI.LIZ();
                final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
                photoModule.LJLIL.LLLII(LIZ, i3, i4, new InterfaceC88472Yns() { // from class: X.HJy
                    @Override // X.InterfaceC88472Yns
                    public final Object invoke(Object obj) {
                        InterfaceC73573Su9 interfaceC73573Su92 = c73433Srt;
                        interfaceC73573Su92.onNext(LIZ);
                        interfaceC73573Su92.onComplete();
                        return C76800UCe.LIZ;
                    }
                });
            }
        }).LJJIII(new InterfaceC48038ItG() { // from class: X.HJv
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                final PhotoModule photoModule = PhotoModule.this;
                boolean z2 = z;
                final int i3 = i;
                final int i4 = i2;
                String str = (String) obj;
                photoModule.getClass();
                if (z2) {
                    return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.HJr
                        @Override // X.InterfaceC86003Zc
                        public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                            PhotoModule photoModule2 = PhotoModule.this;
                            int i5 = i3;
                            int i6 = i4;
                            String LIZIZ = photoModule2.LJLJI.LIZIZ();
                            C44687HgJ.LJIILJJIL(LIZIZ);
                            int i7 = C54846Lfm.LJLJJI[0];
                            if (i7 < i5) {
                                i6 = (int) (((i6 * 1.0d) / i5) * i7);
                            } else {
                                i7 = i5;
                            }
                            photoModule2.LJLIL.LLLZZIL(LIZIZ, i7, i6, false, Bitmap.CompressFormat.JPEG, new AObjectS40S0201000_7(0, interfaceC73573Su9, LIZIZ, 2), false);
                        }
                    }).LJJIJL(new IDhS11S1100000_7(photoModule, str, 0));
                }
                return AbstractC73672Svk.LJJIIJZLJL(new ACallableS6S1000000_7(str, 3));
            }
        }, false).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS5S0100100_7(System.currentTimeMillis(), this, 0), new AfS38S0101000_10(2, this, 0));
    }

    public PhotoModule(ActivityC45651qj activityC45651qj, InterfaceC83865Wvl interfaceC83865Wvl, HD7 hd7, CreativeInfo creativeInfo) {
        this.LJLIL = interfaceC83865Wvl;
        this.LJLILLLLZI = hd7;
        this.LJLJI = new HD2(creativeInfo);
        LifecycleOwner LIZ = C60903NvH.LJIIJJI().LJIL().LIZ(activityC45651qj);
        LIZ.getLifecycle().addObserver(this);
        this.LJLJJL = new SafeHandler(LIZ);
    }
}
