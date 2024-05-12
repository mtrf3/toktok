package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.a1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JHC extends C48887JGp {
    public volatile boolean LJLLJ;
    public JON LJLLL;
    public final C62822Ol8 LJLLLL;
    public InterfaceC207288Bo LJLLLLLL;
    public final C62822Ol8 LJLZ;

    private final JH0 getPhotoMob() {
        return (JH0) this.LJLZ.getValue();
    }

    private final JHD getPhotoSlide() {
        return (JHD) this.LJLLLL.getValue();
    }

    @Override // X.C48887JGp, X.JGK, X.InterfaceC48907JHj
    public final void LLLJIL() {
        String str;
        Aweme aweme;
        String str2;
        int i;
        String str3;
        JON jon;
        Aweme aweme2;
        C48880JGi LJI;
        Aweme aweme3;
        super.LLLJIL();
        C50321Joz c50321Joz = getPhotoMob().LJLILLLLZI;
        if (c50321Joz != null) {
            C48881JGj dataProvider = getDataProvider();
            if (dataProvider == null || (aweme = dataProvider.LIZJ) == null || (str = C78939UyV.LJIILJJIL(aweme)) == null) {
                str = "";
            }
            c50321Joz.setLastPlayItemId(str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("playMedia, aid: ");
        C48881JGj dataProvider2 = getDataProvider();
        Aweme aweme4 = null;
        if (dataProvider2 != null && (aweme3 = dataProvider2.LIZJ) != null) {
            str2 = aweme3.getAid();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(", isPlaying: ");
        LIZ.append(this.LJLLJ);
        X1D.LIZIZ(LIZ);
        if (this.LJLLJ) {
            return;
        }
        this.LJLLJ = true;
        C48881JGj dataProvider3 = getDataProvider();
        if (dataProvider3 == null || (LJI = dataProvider3.LJI()) == null || (i = LJI.LJ) < 0) {
            i = 0;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("playPhoto, aid: ");
        C48881JGj dataProvider4 = getDataProvider();
        if (dataProvider4 != null && (aweme2 = dataProvider4.LIZJ) != null) {
            str3 = aweme2.getAid();
        } else {
            str3 = null;
        }
        LIZ2.append(str3);
        LIZ2.append(", position: ");
        LIZ2.append(i);
        X1D.LIZIZ(LIZ2);
        LIZIZ();
        if (C46314IFq.LIZIZ()) {
            JHK jhk = EnumC48916JHs.Companion;
            J1C.LJ();
            int i2 = J1C.LIZIZ;
            jhk.getClass();
            EnumC48916JHs LIZ3 = JHK.LIZ(i2);
            if (LIZ3 != null && (jon = this.LJLLL) != null) {
                jon.LIZ(LIZ3, false);
            }
            JON jon2 = this.LJLLL;
            if (jon2 != null) {
                jon2.setVisibility(0);
            }
        }
        JGI core = getCore();
        if (core != null) {
            C48881JGj dataProvider5 = getDataProvider();
            if (dataProvider5 != null) {
                aweme4 = dataProvider5.LIZJ;
            }
            core.setMute(J1C.LIZ(C46314IFq.LIZIZ() ? 1 : 0, 1, aweme4));
        }
        JHD photoSlide = getPhotoSlide();
        if (photoSlide == null) {
            return;
        }
        photoSlide.LJFF(Integer.valueOf(i));
    }

    @Override // X.C48887JGp, X.JGK, X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        String str;
        JHD photoSlide;
        C48880JGi LJI;
        Aweme aweme;
        JON jon;
        Aweme aweme2;
        super.LLLLLJLJLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pauseMedia, aid: ");
        C48881JGj dataProvider = getDataProvider();
        String str2 = null;
        if (dataProvider != null && (aweme2 = dataProvider.LIZJ) != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", isPlaying: ");
        LIZ.append(this.LJLLJ);
        X1D.LIZIZ(LIZ);
        if (this.LJLLJ) {
            if (C46314IFq.LIZIZ() && (jon = this.LJLLL) != null) {
                jon.setVisibility(8);
            }
            JHD photoSlide2 = getPhotoSlide();
            if (photoSlide2 != null) {
                Integer valueOf = Integer.valueOf(photoSlide2.LIZIZ());
                if (valueOf.intValue() >= 0) {
                    int intValue = valueOf.intValue();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("pausePhoto, aid: ");
                    C48881JGj dataProvider2 = getDataProvider();
                    if (dataProvider2 != null && (aweme = dataProvider2.LIZJ) != null) {
                        str2 = aweme.getAid();
                    }
                    C0EH.LIZLLL(LIZ2, str2, ", position: ", intValue, ", isAttached: ");
                    LIZ2.append(isAttachedToWindow());
                    X1D.LIZIZ(LIZ2);
                    C48881JGj dataProvider3 = getDataProvider();
                    if (dataProvider3 != null && (LJI = dataProvider3.LJI()) != null) {
                        LJI.LJ = intValue;
                    }
                }
            }
            this.LJLLJ = false;
            if (!isAttachedToWindow() && (photoSlide = getPhotoSlide()) != null) {
                photoSlide.onCleared();
            }
        }
    }

    public final int getCount() {
        JHD photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            return photoSlide.LIZLLL();
        }
        return -1;
    }

    public final int getPosition() {
        JHD photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            return photoSlide.getCurrentPosition();
        }
        return -1;
    }

    @Override // X.C48887JGp, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        JHD photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            photoSlide.LIZJ(getPhotoMob());
        }
    }

    @Override // X.C48887JGp, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        JHD photoSlide;
        JHD photoSlide2;
        super.onDetachedFromWindow();
        JHD photoSlide3 = getPhotoSlide();
        if (photoSlide3 != null) {
            photoSlide3.LJII(getPhotoMob());
        }
        InterfaceC207288Bo interfaceC207288Bo = this.LJLLLLLL;
        if (interfaceC207288Bo != null && (photoSlide2 = getPhotoSlide()) != null) {
            photoSlide2.LJII(interfaceC207288Bo);
        }
        if (!this.LJLLJ && (photoSlide = getPhotoSlide()) != null) {
            photoSlide.onCleared();
        }
    }

    public final InterfaceC207288Bo getPhotoPlayerCompleteListener() {
        return this.LJLLLLLL;
    }

    public final JON getPhotoSoundIcon() {
        return this.LJLLL;
    }

    @Override // X.C48887JGp
    public final void LIZ(Aweme aweme) {
        C48880JGi LJI;
        o.LJIIIZ(aweme, "aweme");
        super.LIZ(aweme);
        JHD photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            photoSlide.setData(aweme);
        }
        C48881JGj dataProvider = getDataProvider();
        if (dataProvider != null && (LJI = dataProvider.LJI()) != null) {
            int i = LJI.LJ;
            JHD photoSlide2 = getPhotoSlide();
            if (photoSlide2 != null) {
                if (i < 0) {
                    i = 0;
                }
                photoSlide2.LJ(i);
            }
        }
        this.LJLLJ = false;
    }

    public final void setExtraParams(java.util.Map<String, String> map) {
        JHD photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            photoSlide.LIZ(map);
        }
    }

    public final void setPhotoPlayerCompleteListener(InterfaceC207288Bo interfaceC207288Bo) {
        JHD photoSlide;
        this.LJLLLLLL = interfaceC207288Bo;
        if (interfaceC207288Bo != null && (photoSlide = getPhotoSlide()) != null) {
            photoSlide.LIZJ(interfaceC207288Bo);
        }
    }

    public final void setPhotoSoundIcon(JON jon) {
        this.LJLLL = jon;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JHC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C207278Bn LJI;
        a1.LJFF(context, "context");
        this.LJLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1543));
        this.LJLZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 577));
        JHD photoSlide = getPhotoSlide();
        if (photoSlide != null && (LJI = photoSlide.LJI()) != null) {
            addView(LJI);
        }
        JGI core = getCore();
        if (core == null) {
            return;
        }
        core.setMVideoMobListener(getPhotoMob());
    }
}
