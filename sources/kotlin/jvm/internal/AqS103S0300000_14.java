package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C29S;
import X.C62Q;
import X.C72787ShT;
import X.C72869Sin;
import X.C76800UCe;
import X.C81574Vzu;
import X.C82432WWu;
import X.C82435WWx;
import X.C82436WWy;
import X.C82437WWz;
import X.C83146WkA;
import X.C83310Wmo;
import X.C83935Wwt;
import X.I3X;
import X.I9W;
import X.InterfaceC45540Hu4;
import X.InterfaceC65784Pro;
import X.InterfaceC82086WJm;
import X.InterfaceC82434WWw;
import X.InterfaceC83314Wms;
import X.V3N;
import X.VJ6;
import X.WRL;
import X.WRN;
import X.X1D;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public class AqS103S0300000_14 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS103S0300000_14 aqS103S0300000_14) {
        C83146WkA c83146WkA = (C83146WkA) aqS103S0300000_14.l0;
        View selectedIcon = ((C62Q) aqS103S0300000_14.l1).getSelectedIcon();
        Integer visibility = (Integer) aqS103S0300000_14.l2;
        o.LJIIIIZZ(visibility, "visibility");
        V3N.LJJIJL(c83146WkA, selectedIcon, visibility.intValue());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS103S0300000_14 r6) {
        /*
            java.lang.Object r1 = r6.l0
            X.29S r1 = (X.C29S) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity
            if (r0 == 0) goto L97
            r0 = 1
        L9:
            r2 = 0
            if (r0 == 0) goto L7e
        Lc:
            java.lang.String r0 = "VideoRecordNewActivity"
        Le:
            X.WRK r1 = X.C43909HLd.LIZ(r0)
            X.WRb r0 = new X.WRb
            r0.<init>()
            X.TMK r3 = X.C73312Spw.LJ(r1, r0)
            java.lang.Object r0 = r6.l1
            X.WRN r0 = (X.WRN) r0
            androidx.lifecycle.MutableLiveData<java.util.List<X.WPD>> r0 = r0.filterSources
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L52
            java.util.Iterator r5 = r0.iterator()
        L2d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r4 = r5.next()
            r1 = r4
            X.WPD r1 = (X.WPD) r1
            java.lang.String r0 = "$this$isBuildIn"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r1 = r1.LJLIL
            java.lang.String r0 = "build_in"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L2d
            r2 = r4
        L4a:
            X.WPD r2 = (X.WPD) r2
            if (r2 == 0) goto L52
            X.5i6 r1 = r2.LJLJI
            if (r1 != 0) goto L72
        L52:
            java.lang.Object r0 = r6.l2
            X.WRL r0 = (X.WRL) r0
            X.5sm r2 = r0.LIZIZ
            java.lang.Object r0 = r6.l1
            X.WRN r0 = (X.WRN) r0
            X.WJm r0 = r0.getCameraApiComponent()
            X.WtX r1 = r0.getEffectController()
            java.lang.String r0 = "$this$asDefaultIntensityGetter"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.Hfp r0 = new X.Hfp
            r0.<init>(r1)
            X.TMK r1 = X.C73312Spw.LJ(r2, r0)
        L72:
            X.WR3 r2 = new X.WR3
            java.lang.Object r0 = r6.l2
            X.WRL r0 = (X.WRL) r0
            X.WRc r0 = r0.LIZJ
            r2.<init>(r3, r1, r0)
        L7d:
            return r2
        L7e:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity
            if (r0 == 0) goto L85
            java.lang.String r0 = "TTEPEffectPreviewActivity"
            goto Le
        L85:
            java.lang.Object r0 = r6.l1
            X.WRN r0 = (X.WRN) r0
            X.Wbi r1 = r0.getDiContainer()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene> r0 = com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene.class
            java.lang.Object r0 = r1.LJIIIIZZ(r2, r0)
            if (r0 == 0) goto L7d
            goto Lc
        L97:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS103S0300000_14.invoke$1(kotlin.jvm.internal.AqS103S0300000_14):java.lang.Object");
    }

    public static final Object invoke$2(AqS103S0300000_14 aqS103S0300000_14) {
        if (((C72787ShT) aqS103S0300000_14.l0).getVisibility() != 0) {
            ((C72787ShT) aqS103S0300000_14.l0).setVisibility(0);
        }
        C81574Vzu c81574Vzu = (C81574Vzu) aqS103S0300000_14.l1;
        Activity activity = c81574Vzu.mActivity;
        if (activity != null) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            c81574Vzu.LJLJJLL = attributes.screenBrightness;
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
            c81574Vzu.LJLJL = true;
            ((C81574Vzu) aqS103S0300000_14.l1).LLJILJILJ(((VJ6) aqS103S0300000_14.l2).LJLJI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS103S0300000_14 aqS103S0300000_14) {
        return Boolean.valueOf(((C83310Wmo) aqS103S0300000_14.l0).LJ().remove(aqS103S0300000_14.l1, (InterfaceC83314Wms) aqS103S0300000_14.l2));
    }

    public static final Object invoke$4(AqS103S0300000_14 aqS103S0300000_14) {
        C82437WWz c82437WWz = (C82437WWz) aqS103S0300000_14.l0;
        C29S c29s = c82437WWz.LJLILLLLZI;
        InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) c82437WWz.LJLIL.LJ(InterfaceC45540Hu4.class, null);
        C82437WWz c82437WWz2 = (C82437WWz) aqS103S0300000_14.l0;
        InterfaceC82086WJm interfaceC82086WJm = c82437WWz2.LJLJI;
        I3X i3x = (I3X) c82437WWz2.LJLJJI.LIZ(c82437WWz2, C82437WWz.LJLJJL[0]);
        I9W i9w = (I9W) aqS103S0300000_14.l1;
        FrameLayout frameLayout = (FrameLayout) ((C82437WWz) aqS103S0300000_14.l0).LJLILLLLZI.findViewById(R.id.fim);
        return new C82432WWu(c29s, interfaceC45540Hu4, interfaceC82086WJm, new C72869Sin(frameLayout), new C82436WWy(interfaceC82086WJm, i9w), new C82435WWx(i3x, i9w), (InterfaceC82434WWw) aqS103S0300000_14.l2, ((C82437WWz) aqS103S0300000_14.l0).LJLIL);
    }

    public static final Object invoke$5(AqS103S0300000_14 aqS103S0300000_14) {
        boolean z;
        String str;
        if (((C83935Wwt) aqS103S0300000_14.l1) != ((C83935Wwt) aqS103S0300000_14.l0)) {
            z = true;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("from [");
            LIZ.append((C83935Wwt) aqS103S0300000_14.l1);
            LIZ.append("]\n to [");
            LIZ.append((C83935Wwt) aqS103S0300000_14.l0);
            LIZ.append("], \n source: [");
            LIZ.append((C83935Wwt) aqS103S0300000_14.l2);
            LIZ.append(']');
            str = X1D.LIZIZ(LIZ);
        } else {
            z = false;
            str = "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("context changed: ");
        LIZ2.append(z);
        LIZ2.append(" after copy; \n ");
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0300000_14(C29S c29s, WRN wrn, WRL wrl, int i) {
        super(0);
        this.$t = i;
        this.l0 = c29s;
        this.l1 = wrn;
        this.l2 = wrl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0300000_14(C72787ShT c72787ShT, C81574Vzu c81574Vzu, VJ6 vj6, int i) {
        super(0);
        this.$t = i;
        this.l0 = c72787ShT;
        this.l1 = c81574Vzu;
        this.l2 = vj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0300000_14(C82437WWz c82437WWz, I9W i9w, InterfaceC82434WWw interfaceC82434WWw, int i) {
        super(0);
        this.$t = i;
        this.l0 = c82437WWz;
        this.l1 = i9w;
        this.l2 = interfaceC82434WWw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0300000_14(C83146WkA c83146WkA, C62Q c62q, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83146WkA;
        this.l1 = c62q;
        this.l2 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0300000_14(C83310Wmo c83310Wmo, Object obj, InterfaceC83314Wms interfaceC83314Wms, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83310Wmo;
        this.l1 = obj;
        this.l2 = interfaceC83314Wms;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS103S0300000_14(C83935Wwt c83935Wwt, C83935Wwt c83935Wwt2, C83935Wwt c83935Wwt3, int i) {
        super(0);
        this.$t = i;
        this.l0 = c83935Wwt;
        this.l1 = c83935Wwt2;
        this.l2 = c83935Wwt3;
    }
}
