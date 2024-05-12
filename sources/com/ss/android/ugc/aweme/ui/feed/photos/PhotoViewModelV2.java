package com.ss.android.ugc.aweme.ui.feed.photos;

import X.AbstractC65781Prl;
import X.C188727au;
import X.C202777xZ;
import X.C203117y7;
import X.C203127y8;
import X.C203297yP;
import X.C203307yQ;
import X.C203317yR;
import X.C2045581b;
import X.C2045681c;
import X.C2045881e;
import X.C2045981f;
import X.C2046481k;
import X.C2047581v;
import X.C33Q;
import X.C38995FSd;
import X.C64386POs;
import X.C65429Pm5;
import X.C78920UyC;
import X.C78963Uyt;
import X.C81D;
import X.C81Z;
import X.C82S;
import X.FMX;
import X.HG3;
import X.RBX;
import X.V16;
import Y.ARunnableS0S1210000_3;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class PhotoViewModelV2 extends FeedBaseViewModel<C203127y8> implements C82S {
    public final C81Z LJLJLLL;
    public final C2045581b LJLL;
    public VideoItemParams LJLLI;
    public int LJLLILLLL;
    public long LJLLJ;
    public AbstractC65781Prl LJLLL;
    public final C2045681c LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public Boolean LJZL;
    public Aweme LL;
    public boolean LLD;
    public boolean LLF;

    public PhotoViewModelV2() {
        this(null, 3);
    }

    public boolean nv0() {
        return false;
    }

    public final void tv0() {
        this.LJZI = true;
        setState(C202777xZ.LJLIL);
        C2045681c c2045681c = this.LJLLLL;
        Aweme aweme = c2045681c.LJ;
        if (aweme != null && V16.LJJIFFI(aweme) == 1) {
            c2045681c.LIZLLL = true;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C203127y8(0);
    }

    public final void kv0() {
        setState(C2046481k.LJLIL);
    }

    public final void lv0() {
        setState(C203307yQ.LJLIL);
    }

    public final int mv0() {
        Aweme aweme = this.LL;
        if (aweme != null) {
            return V16.LJJIFFI(aweme);
        }
        return 0;
    }

    public void qv0() {
        withState(new C2045981f(this));
    }

    public final void sv0() {
        setState(C203297yP.LJLIL);
        withState(new AqS169S0100000_3(this, 516));
        C65429Pm5.LJ("photo_mode_user_has_swiped|", ((RBX) HG3.LJIILL()).getCurUserId(), C81D.LIZ, true);
    }

    @Override // X.C82S
    public final boolean Vf() {
        return nv0();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLLLL.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C82S
    public final boolean or0() {
        return ((C203127y8) getState()).LJLJJL;
    }

    public final void rv0() {
        qv0();
        setState(C203317yR.LJLIL);
        C2045681c c2045681c = this.LJLLLL;
        if (!this.LJLLLLLL) {
            c2045681c.LIZ();
        } else {
            c2045681c.getClass();
        }
    }

    @Override // X.C82S
    public final VideoItemParams Ig() {
        return this.LJLLI;
    }

    @Override // X.C82S
    public final boolean Sd() {
        return this.LJZI;
    }

    public final void onPageSelected(int i) {
        Integer num;
        boolean z;
        int i2;
        if (!this.LLD) {
            return;
        }
        withState(new AqS93S0101000_3(i, this, 10));
        C2045581b c2045581b = this.LJLL;
        c2045581b.LIZ(i);
        c2045581b.LJIIIZ = Long.valueOf(System.currentTimeMillis());
        C2045881e c2045881e = c2045581b.LJIIJJI;
        if (c2045881e != null) {
            num = c2045881e.LIZLLL;
        } else {
            num = null;
        }
        int i3 = 0;
        if (num == null && i == 0) {
            z = true;
        } else {
            z = false;
        }
        c2045581b.LIZIZ(i, z);
        C2045681c c2045681c = this.LJLLLL;
        Aweme aweme = c2045681c.LJ;
        if (aweme != null) {
            i2 = V16.LJJIFFI(aweme);
        } else {
            i2 = 0;
        }
        if (i == i2 - 1) {
            if (!c2045681c.LIZLLL) {
                c2045681c.LIZ.invoke();
            }
            c2045681c.LIZLLL = true;
            return;
        }
        if (i != 0) {
            Aweme aweme2 = c2045681c.LJ;
            if (aweme2 != null) {
                i3 = V16.LJJIFFI(aweme2);
            }
            if (i != i3 - 2) {
                return;
            }
        }
        if (!c2045681c.LIZLLL) {
            return;
        }
        c2045681c.LIZIZ.invoke();
    }

    public final void ov0(VideoItemParams videoItemParams) {
        Aweme aweme;
        String str;
        Aweme aweme2;
        String str2;
        this.LJLLI = videoItemParams;
        this.LJZL = Boolean.valueOf(C78963Uyt.LJJII(videoItemParams));
        Aweme aweme3 = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        this.LL = aweme;
        this.LJZI = false;
        this.LJZ = false;
        C2045581b c2045581b = this.LJLL;
        ((LinkedHashMap) c2045581b.LJFF).clear();
        ((LinkedHashMap) c2045581b.LJI).clear();
        ((LinkedHashMap) c2045581b.LJII).clear();
        ((LinkedHashMap) c2045581b.LJIIIIZZ).clear();
        c2045581b.LJIIJ = false;
        c2045581b.LJIIJJI = new C2045881e();
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        c2045581b.LIZLLL = str;
        if (videoItemParams != null) {
            aweme2 = videoItemParams.getAweme();
        } else {
            aweme2 = null;
        }
        c2045581b.LIZJ = aweme2;
        C81Z c81z = this.LJLJLLL;
        c81z.getClass();
        if (videoItemParams != null && (str2 = videoItemParams.mEventType) != null) {
            str3 = str2;
        }
        c81z.LIZLLL = str3;
        if (videoItemParams != null) {
            aweme3 = videoItemParams.getAweme();
        }
        c81z.LJ = aweme3;
        c81z.LJFF = -1;
        C2045681c c2045681c = this.LJLLLL;
        c2045681c.getClass();
        if (videoItemParams != null) {
            String str4 = videoItemParams.mEventType;
            o.LJIIIIZZ(str4, "p.eventType");
            c2045681c.LJFF = str4;
            c2045681c.LJ = videoItemParams.getAweme();
            String str5 = videoItemParams.mEnterMethodValue;
            o.LJIIIIZZ(str5, "p.enterMethodValue");
            c2045681c.LJI = str5;
            c2045681c.LJII = videoItemParams.currentPosition;
        }
    }

    public final void pv0(SlidesImageLoadParams slidesImageLoadParams) {
        Object obj;
        boolean z;
        int i;
        Map<Integer, SlidesImageLoadParams> map;
        Map<Integer, SlidesImageLoadParams> map2;
        setState(C203117y7.LJLIL);
        C2045581b c2045581b = this.LJLL;
        boolean z2 = this.LLD;
        nv0();
        c2045581b.getClass();
        C2045881e c2045881e = c2045581b.LJIIJJI;
        String str = null;
        if (c2045881e != null && (map2 = c2045881e.LIZIZ) != null) {
            obj = ((LinkedHashMap) map2).get(Integer.valueOf(slidesImageLoadParams.index));
        } else {
            obj = null;
        }
        int i2 = 0;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        C38995FSd.LIZJ().execute(new ARunnableS0S1210000_3(c2045581b, C64386POs.LIZIZ.LIZIZ(null), slidesImageLoadParams, z, 1));
        C2045881e c2045881e2 = c2045581b.LJIIJJI;
        if (c2045881e2 != null && (map = c2045881e2.LIZIZ) != null) {
            map.put(Integer.valueOf(slidesImageLoadParams.index), slidesImageLoadParams);
        }
        C2045881e c2045881e3 = c2045581b.LJIIJJI;
        if (c2045881e3 != null && z2) {
            if (c2045881e3.LIZ) {
                c2045881e3.LIZ = false;
            }
            Integer num = c2045881e3.LIZLLL;
            int i3 = slidesImageLoadParams.index;
            if (num != null && num.intValue() == i3) {
                c2045881e3.LJFF = 1;
                if (c2045881e3.LJ < 0) {
                    c2045881e3.LJ = (int) slidesImageLoadParams.duration;
                }
            }
        }
        String str2 = c2045581b.LIZLLL;
        Aweme aweme = c2045581b.LIZJ;
        if (aweme != null) {
            str = aweme.getAid();
        }
        long j = slidesImageLoadParams.duration;
        String str3 = slidesImageLoadParams.photoLoaderType;
        C188727au LIZJ = C78920UyC.LIZJ(1, "success");
        if (str == null) {
            str = "";
        }
        LIZJ.LJIIIZ("group_id", str);
        LIZJ.LJ(j, "duration");
        LIZJ.LJIIIZ("photo_loader_type", str3);
        LIZJ.LJIIIZ("enter_from", str2);
        FMX.LJIIL("feed_photo_loading_result", LIZJ.LIZ);
        int i4 = slidesImageLoadParams.index;
        Integer num2 = slidesImageLoadParams.width;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        Integer num3 = slidesImageLoadParams.height;
        if (num3 != null) {
            i2 = num3.intValue();
        }
        C2047581v c2047581v = new C2047581v(i, i2);
        long j2 = slidesImageLoadParams.duration;
        boolean z3 = slidesImageLoadParams.isImageCached;
        c2045581b.LJII.put(Integer.valueOf(i4), c2047581v);
        if (!c2045581b.LJI.containsKey(Integer.valueOf(i4))) {
            c2045581b.LJI.put(Integer.valueOf(i4), Long.valueOf(j2));
        }
        if (!c2045581b.LJIIIIZZ.containsKey(Integer.valueOf(i4))) {
            c2045581b.LJIIIIZZ.put(Integer.valueOf(i4), Boolean.valueOf(z3));
        }
    }

    public PhotoViewModelV2(C81Z photoSlidesTracker, int i) {
        C2045581b imagePlayTracker;
        photoSlidesTracker = (i & 1) != 0 ? new C81Z(false) : photoSlidesTracker;
        if ((i & 2) != 0) {
            imagePlayTracker = new C2045581b();
        } else {
            imagePlayTracker = null;
        }
        o.LJIIIZ(photoSlidesTracker, "photoSlidesTracker");
        o.LJIIIZ(imagePlayTracker, "imagePlayTracker");
        this.LJLJLLL = photoSlidesTracker;
        this.LJLL = imagePlayTracker;
        this.LJLLILLLL = -1;
        this.LJLLJ = -1L;
        C2045681c c2045681c = new C2045681c(new AqS153S0100000_3(this, 1739), new AqS153S0100000_3(this, 1740));
        c2045681c.LJIIJ = new AqS153S0100000_3(this, 1741);
        this.LJLLLL = c2045681c;
    }
}
