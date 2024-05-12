package o53;

import X.C49612JdY;
import X.C51446KHa;
import X.C51553KLd;
import X.C51588KMm;
import X.C78857UxB;
import X.C81831W9r;
import X.InterfaceC81599W0t;
import X.JJY;
import X.W4V;
import X.W5O;
import X.W68;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import com.ss.android.ugc.aweme.vision.background.PhotoSearchBackgroundFragment;
import java.util.Map;

/* loaded from: classes9.dex */
public class IDdS475S0100000_8 extends W4V {
    public final int $t;
    public Object l0;

    public static final void LJ$0(IDdS475S0100000_8 iDdS475S0100000_8, String str, Throwable th) {
    }

    public static final void LJI$0(IDdS475S0100000_8 iDdS475S0100000_8, Object obj, String str) {
    }

    @Override // X.W4V, X.W4Z
    public final void LIZIZ(String str, Throwable th) {
        switch (this.$t) {
            case 3:
                LIZIZ$0(this, str, th);
                return;
            default:
                super.LIZIZ(str, th);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LIZJ(String str) {
        switch (this.$t) {
            case 1:
                LIZJ$0(this, str);
                return;
            case 2:
            default:
                super.LIZJ(str);
                return;
            case 3:
                LIZJ$1(this, str);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LIZLLL(Object obj, String str) {
        switch (this.$t) {
            case 1:
                LIZLLL$0(this, obj, str);
                return;
            case 2:
            default:
                super.LIZLLL(obj, str);
                return;
            case 3:
                LIZLLL$1(this, obj, str);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, th);
                return;
            case 1:
                LJ$1(this, str, th);
                return;
            case 2:
                LJ$2(this, str, th);
                return;
            case 3:
                LJ$3(this, str, th);
                return;
            default:
                super.LJ(str, th);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, str, obj, animatable);
                return;
            case 1:
                LJFF$1(this, str, obj, animatable);
                return;
            case 2:
                LJFF$2(this, str, obj, animatable);
                return;
            case 3:
                LJFF$3(this, str, obj, animatable);
                return;
            default:
                super.LJFF(str, obj, animatable);
                return;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJI(Object obj, String str) {
        switch (this.$t) {
            case 0:
                LJI$0(this, obj, str);
                return;
            case 1:
            case 2:
            default:
                super.LJI(obj, str);
                return;
            case 3:
                LJI$1(this, obj, str);
                return;
        }
    }

    @Override // X.W4V
    public final void LJII(W5O w5o, long j) {
        switch (this.$t) {
            case 3:
                LJII$0(this, w5o, j);
                return;
            default:
                super.LJII(w5o, j);
                return;
        }
    }

    @Override // X.W4V
    public final void LJIIIZ(String str, Object obj, Animatable animatable, W5O w5o, Map map) {
        switch (this.$t) {
            case 3:
                LJIIIZ$0(this, str, obj, animatable, w5o, map);
                return;
            default:
                super.LJIIIZ(str, obj, animatable, w5o, map);
                return;
        }
    }

    public IDdS475S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZJ$0(IDdS475S0100000_8 iDdS475S0100000_8, String str) {
        ((C51588KMm) iDdS475S0100000_8.l0).LJLJJI = false;
    }

    public static final void LIZJ$1(IDdS475S0100000_8 iDdS475S0100000_8, String str) {
    }

    public static final void LIZLLL$0(IDdS475S0100000_8 iDdS475S0100000_8, Object obj, String str) {
        ((C51588KMm) iDdS475S0100000_8.l0).LJLJJI = false;
    }

    public static final void LJ$1(IDdS475S0100000_8 iDdS475S0100000_8, String str, Throwable th) {
        ((C51588KMm) iDdS475S0100000_8.l0).LJLJJI = false;
    }

    public static final void LJ$2(IDdS475S0100000_8 iDdS475S0100000_8, String str, Throwable th) {
        MutableLiveData<InterfaceC81599W0t> mutableLiveData;
        PhotoSearchViewModel photoSearchViewModel = ((PhotoSearchBackgroundFragment) iDdS475S0100000_8.l0).LJLJJI;
        if (photoSearchViewModel != null && (mutableLiveData = photoSearchViewModel.LJLJI) != null) {
            mutableLiveData.setValue(null);
        }
        C78857UxB.LJJJJIZL("image_load_start", "image_load_fail", null, null, 252);
    }

    public static final void LJ$3(IDdS475S0100000_8 iDdS475S0100000_8, String str, Throwable th) {
        IDdS475S0100000_8 iDdS475S0100000_82 = ((C51446KHa) iDdS475S0100000_8.l0).LJ;
        if (iDdS475S0100000_82 != null) {
            iDdS475S0100000_82.LJ(str, th);
        }
    }

    public static final void LIZIZ$0(IDdS475S0100000_8 iDdS475S0100000_8, String str, Throwable th) {
    }

    public static final void LIZLLL$1(IDdS475S0100000_8 iDdS475S0100000_8, Object obj, String str) {
    }

    public static final void LJI$1(IDdS475S0100000_8 iDdS475S0100000_8, Object obj, String str) {
    }

    public static final void LJII$0(IDdS475S0100000_8 iDdS475S0100000_8, W5O w5o, long j) {
    }

    public static final void LJFF$0(IDdS475S0100000_8 iDdS475S0100000_8, String str, Object obj, Animatable animatable) {
        C51553KLd c51553KLd = (C51553KLd) iDdS475S0100000_8.l0;
        JJY jjy = c51553KLd.LJLILLLLZI;
        if (jjy != null) {
            jjy.LJIIJ(c51553KLd.getLayoutPosition());
        }
    }

    public static final void LJFF$1(IDdS475S0100000_8 iDdS475S0100000_8, String str, Object obj, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        String url = ((C51588KMm) iDdS475S0100000_8.l0).getUrl();
        if (!TextUtils.isEmpty(url)) {
            W68 w68 = C49612JdY.LIZ;
            if (w68.LIZJ(url) == null && (interfaceC81599W0t instanceof C81831W9r)) {
                w68.LIZ(url, (C81831W9r) interfaceC81599W0t);
            }
        }
        if (animatable != null) {
            C51588KMm c51588KMm = (C51588KMm) iDdS475S0100000_8.l0;
            c51588KMm.LJLJJI = true;
            if (c51588KMm.LJLJI) {
                c51588KMm.LIZIZ();
                return;
            }
            return;
        }
        ((C51588KMm) iDdS475S0100000_8.l0).LJLJJI = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF$2(o53.IDdS475S0100000_8 r9, java.lang.String r10, java.lang.Object r11, android.graphics.drawable.Animatable r12) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o53.IDdS475S0100000_8.LJFF$2(o53.IDdS475S0100000_8, java.lang.String, java.lang.Object, android.graphics.drawable.Animatable):void");
    }

    public static final void LJFF$3(IDdS475S0100000_8 iDdS475S0100000_8, String str, Object obj, Animatable animatable) {
        IDdS475S0100000_8 iDdS475S0100000_82 = ((C51446KHa) iDdS475S0100000_8.l0).LJ;
        if (iDdS475S0100000_82 != null) {
            iDdS475S0100000_82.LJFF(str, obj, animatable);
        }
    }

    public static final void LJIIIZ$0(IDdS475S0100000_8 iDdS475S0100000_8, String str, Object obj, Animatable animatable, W5O w5o, Map map) {
        IDdS475S0100000_8 iDdS475S0100000_82 = ((C51446KHa) iDdS475S0100000_8.l0).LJ;
        if (iDdS475S0100000_82 != null) {
            iDdS475S0100000_82.LJFF(str, obj, animatable);
        }
    }
}
