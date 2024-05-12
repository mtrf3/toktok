package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C63057Oov;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.XW8;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class AqS0S4541000_15 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i13;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public boolean z10;
    public boolean z11;
    public boolean z12;
    public boolean z9;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S4541000_15 aqS0S4541000_15) {
        FragmentManager fragmentManager = (FragmentManager) aqS0S4541000_15.l4;
        C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
        LIZ.LJIIIIZZ(R.id.dm8, 1, XW8.LLJJIJIIJIL((XW8) aqS0S4541000_15.l5, aqS0S4541000_15.s0, (MusicModel) aqS0S4541000_15.l6, aqS0S4541000_15.z9, aqS0S4541000_15.z10, (Bundle) aqS0S4541000_15.l7, aqS0S4541000_15.s1, aqS0S4541000_15.s2, aqS0S4541000_15.z11, aqS0S4541000_15.s3, (UrlModel) aqS0S4541000_15.l8, aqS0S4541000_15.i13, aqS0S4541000_15.z12), "choose_music_fragment_tag");
        LIZ.LJIILLIIL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S4541000_15 aqS0S4541000_15) {
        if (((XW8) aqS0S4541000_15.l4).LLJJI().LJLILLLLZI) {
            AVExternalServiceImpl.LIZ().publishService().setCurMusic(null, 0);
        }
        ((XW8) aqS0S4541000_15.l4).LLJJIII();
        BaseChooseMusicFragment baseChooseMusicFragment = (BaseChooseMusicFragment) ((FragmentManager) aqS0S4541000_15.l5).LJJJI(R.id.dm8);
        if (baseChooseMusicFragment != null) {
            if (baseChooseMusicFragment.LJLJJLL) {
                baseChooseMusicFragment.LJLJJLL = false;
                FrameLayout frameLayout = baseChooseMusicFragment.LJLJLLL.LJ;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                baseChooseMusicFragment.getChildFragmentManager();
                try {
                    baseChooseMusicFragment.getChildFragmentManager().LJJLIIIJL();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (C63057Oov.LIZ()) {
                    baseChooseMusicFragment.Hl(Boolean.FALSE);
                }
                if (baseChooseMusicFragment.xl() != null) {
                    baseChooseMusicFragment.xl().getClass();
                }
            }
            FragmentManager fragmentManager = (FragmentManager) aqS0S4541000_15.l5;
            C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
            LIZ.LJIIJ(XW8.LLJJIJIIJIL((XW8) aqS0S4541000_15.l4, aqS0S4541000_15.s0, (MusicModel) aqS0S4541000_15.l6, aqS0S4541000_15.z9, aqS0S4541000_15.z10, (Bundle) aqS0S4541000_15.l7, aqS0S4541000_15.s1, aqS0S4541000_15.s2, aqS0S4541000_15.z11, aqS0S4541000_15.s3, (UrlModel) aqS0S4541000_15.l8, aqS0S4541000_15.i13, aqS0S4541000_15.z12), "choose_music_fragment_tag", R.id.dm8);
            LIZ.LJIILJJIL();
        } else {
            FragmentManager fragmentManager2 = (FragmentManager) aqS0S4541000_15.l5;
            C1B3 LIZ2 = C1B6.LIZ(fragmentManager2, fragmentManager2);
            LIZ2.LJIIIIZZ(R.id.dm8, 1, XW8.LLJJIJIIJIL((XW8) aqS0S4541000_15.l4, aqS0S4541000_15.s0, (MusicModel) aqS0S4541000_15.l6, aqS0S4541000_15.z9, aqS0S4541000_15.z10, (Bundle) aqS0S4541000_15.l7, aqS0S4541000_15.s1, aqS0S4541000_15.s2, aqS0S4541000_15.z11, aqS0S4541000_15.s3, (UrlModel) aqS0S4541000_15.l8, aqS0S4541000_15.i13, aqS0S4541000_15.z12), "choose_music_fragment_tag");
            LIZ2.LJIILJJIL();
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS0S4541000_15(int r3, android.os.Bundle r4, androidx.fragment.app.FragmentManager r5, com.ss.android.ugc.aweme.base.model.UrlModel r6, X.XW8 r7, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14, boolean r15, boolean r16, int r17) {
        /*
            r2 = this;
            r1 = r17
            r2.$t = r1
            r0 = r16
            switch(r1) {
                case 0: goto L2b;
                default: goto L9;
            }
        L9:
            r1 = r2
            r1.l4 = r7
            r1.l5 = r5
            r1.s0 = r9
            r1.l6 = r8
            r1.z9 = r13
            r1.z10 = r14
            r1.l7 = r4
            r1.s1 = r10
            r1.s2 = r11
            r1.z11 = r15
            r1.s3 = r12
            r1.l8 = r6
            r1.i13 = r3
            r1.z12 = r0
            r0 = 0
        L27:
            r1.<init>(r0)
            return
        L2b:
            r1 = r2
            r1.l4 = r5
            r1.l5 = r7
            r1.s0 = r9
            r1.l6 = r8
            r1.z9 = r13
            r1.z10 = r14
            r1.l7 = r4
            r1.s1 = r10
            r1.s2 = r11
            r1.z11 = r15
            r1.s3 = r12
            r1.l8 = r6
            r1.i13 = r3
            r1.z12 = r0
            r0 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS0S4541000_15.<init>(int, android.os.Bundle, androidx.fragment.app.FragmentManager, com.ss.android.ugc.aweme.base.model.UrlModel, X.XW8, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, int):void");
    }
}
