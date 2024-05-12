package X;

import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.livesdk.livesetting.other.LiveBadgeLoadOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AqS25S0310000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CbH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31635CbH extends AbstractC31476CWy<C31646CbS> implements InterfaceC29517BiD {
    public final int LIZLLL;
    public final BadgeStruct LJ;
    public final Context LJFF;
    public final C31647CbT LJI;
    public final C31642CbO LJII;
    public final Runnable LJIIIIZZ;
    public Bitmap LJIIIZ;
    public Bitmap LJIIJ;
    public Bitmap LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public C73318Sq2 LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;

    @Override // X.AbstractC31476CWy
    public final void LJ() {
        this.LJIIL = false;
        this.LJIILIIL = false;
        C73318Sq2 c73318Sq2 = this.LJIJ;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZLLL();
        }
        this.LJIJ = null;
    }

    @Override // X.AbstractC31476CWy
    public final void LJFF() {
        File LIZJ;
        Integer num;
        Integer num2;
        CombineBadgeStruct combineBadgeStruct;
        C73318Sq2 c73318Sq2;
        File LIZJ2;
        Integer num3;
        Integer num4;
        String str;
        CombineBadgeStruct combineBadgeStruct2;
        C73318Sq2 c73318Sq22;
        File LIZJ3;
        Integer num5;
        Integer num6;
        String str2;
        CombineBadgeStruct combineBadgeStruct3;
        C73318Sq2 c73318Sq23;
        this.LJIJJ = false;
        LiveBadgeLoadOptSetting liveBadgeLoadOptSetting = LiveBadgeLoadOptSetting.INSTANCE;
        if (liveBadgeLoadOptSetting.diskCacheOpt() && (((!this.LJIILL && !this.LJIIL) || ((!this.LJIILLIIL && !this.LJIILIIL) || (!this.LJIIZILJ && !this.LJIILJJIL))) && this.LJIJ == null)) {
            this.LJIJ = new C73318Sq2();
        }
        String str3 = null;
        if (!this.LJIILL && !this.LJIIL) {
            this.LJIIL = true;
            C31639CbL c31639CbL = new C31639CbL(this);
            if (liveBadgeLoadOptSetting.diskCacheOpt()) {
                ImageModel imageModel = this.LJII.LIZ;
                BadgeStruct badgeStruct = this.LJ;
                C73411SrX LIZ = C31666Cbm.LIZ(imageModel, c31639CbL);
                if (LIZ != null && (c73318Sq23 = this.LJIJ) != null) {
                    c73318Sq23.LIZ(LIZ);
                }
            } else {
                Context context = this.LJFF;
                if (context != null && (LIZJ3 = C15420j4.LIZJ(context)) != null) {
                    ImageModel imageModel2 = this.LJII.LIZ;
                    C31647CbT c31647CbT = this.LJI;
                    if (c31647CbT != null) {
                        num5 = Integer.valueOf(c31647CbT.LJLLLL);
                    } else {
                        num5 = null;
                    }
                    BadgeStruct badgeStruct2 = this.LJ;
                    if (badgeStruct2 != null) {
                        num6 = Integer.valueOf(badgeStruct2.badgeScene);
                    } else {
                        num6 = null;
                    }
                    Boolean bool = Boolean.FALSE;
                    Boolean bool2 = Boolean.TRUE;
                    BadgeStruct badgeStruct3 = this.LJ;
                    if (badgeStruct3 != null && (combineBadgeStruct3 = badgeStruct3.combineBadgeStruct) != null) {
                        str2 = combineBadgeStruct3.str;
                    } else {
                        str2 = null;
                    }
                    C31663Cbj.LIZ(imageModel2, c31639CbL, LIZJ3, num5, num6, bool, bool2, str2);
                }
            }
        }
        if (!this.LJIILLIIL && !this.LJIILIIL) {
            this.LJIILIIL = true;
            C31640CbM c31640CbM = new C31640CbM(this);
            if (liveBadgeLoadOptSetting.diskCacheOpt()) {
                ImageModel imageModel3 = this.LJII.LIZLLL;
                BadgeStruct badgeStruct4 = this.LJ;
                C73411SrX LIZ2 = C31666Cbm.LIZ(imageModel3, c31640CbM);
                if (LIZ2 != null && (c73318Sq22 = this.LJIJ) != null) {
                    c73318Sq22.LIZ(LIZ2);
                }
            } else {
                Context context2 = this.LJFF;
                if (context2 != null && (LIZJ2 = C15420j4.LIZJ(context2)) != null) {
                    ImageModel imageModel4 = this.LJII.LIZLLL;
                    C31647CbT c31647CbT2 = this.LJI;
                    if (c31647CbT2 != null) {
                        num3 = Integer.valueOf(c31647CbT2.LJLLLL);
                    } else {
                        num3 = null;
                    }
                    BadgeStruct badgeStruct5 = this.LJ;
                    if (badgeStruct5 != null) {
                        num4 = Integer.valueOf(badgeStruct5.badgeScene);
                    } else {
                        num4 = null;
                    }
                    Boolean bool3 = Boolean.FALSE;
                    Boolean bool4 = Boolean.TRUE;
                    BadgeStruct badgeStruct6 = this.LJ;
                    if (badgeStruct6 != null && (combineBadgeStruct2 = badgeStruct6.combineBadgeStruct) != null) {
                        str = combineBadgeStruct2.str;
                    } else {
                        str = null;
                    }
                    C31663Cbj.LIZ(imageModel4, c31640CbM, LIZJ2, num3, num4, bool3, bool4, str);
                }
            }
        }
        if (!this.LJIIZILJ && !this.LJIILJJIL) {
            this.LJIILJJIL = true;
            C31641CbN c31641CbN = new C31641CbN(this);
            if (liveBadgeLoadOptSetting.diskCacheOpt()) {
                ImageModel imageModel5 = this.LJII.LJ;
                BadgeStruct badgeStruct7 = this.LJ;
                C73411SrX LIZ3 = C31666Cbm.LIZ(imageModel5, c31641CbN);
                if (LIZ3 != null && (c73318Sq2 = this.LJIJ) != null) {
                    c73318Sq2.LIZ(LIZ3);
                }
            } else {
                Context context3 = this.LJFF;
                if (context3 != null && (LIZJ = C15420j4.LIZJ(context3)) != null) {
                    ImageModel imageModel6 = this.LJII.LJ;
                    C31647CbT c31647CbT3 = this.LJI;
                    if (c31647CbT3 != null) {
                        num = Integer.valueOf(c31647CbT3.LJLLLL);
                    } else {
                        num = null;
                    }
                    BadgeStruct badgeStruct8 = this.LJ;
                    if (badgeStruct8 != null) {
                        num2 = Integer.valueOf(badgeStruct8.badgeScene);
                    } else {
                        num2 = null;
                    }
                    Boolean bool5 = Boolean.FALSE;
                    BadgeStruct badgeStruct9 = this.LJ;
                    if (badgeStruct9 != null && (combineBadgeStruct = badgeStruct9.combineBadgeStruct) != null) {
                        str3 = combineBadgeStruct.str;
                    }
                    C31663Cbj.LIZ(imageModel6, c31641CbN, LIZJ, num, num2, bool5, bool5, str3);
                }
            }
        }
        LJI();
        this.LJIJJ = true;
    }

    @Override // X.AbstractC31462CWk
    public final AbstractC31467CWp LIZLLL() {
        String str;
        CharSequence LIZ = C30793C6r.LIZ(this.LJII.LIZIZ);
        if (LIZ == null || LIZ.length() == 0) {
            LIZ = this.LJII.LIZJ;
        }
        Context context = this.LJFF;
        Bitmap bitmap = this.LJIIIZ;
        Bitmap bitmap2 = this.LJIIJ;
        Bitmap bitmap3 = this.LJIIJJI;
        if (LIZ == null || (str = LIZ.toString()) == null) {
            str = "";
        }
        C31646CbS c31646CbS = new C31646CbS(context, bitmap, bitmap2, bitmap3, str, this.LJI);
        Runnable runnable = this.LJIIIIZZ;
        if (runnable != null) {
            c31646CbS.LJ = runnable;
        }
        return c31646CbS;
    }

    public final void LJI() {
        if (this.LJIILL && this.LJIILLIIL && this.LJIIZILJ && !this.LJIJI) {
            this.LJIJI = true;
            InterfaceC88471Ynr<AbstractC31476CWy<T>, Boolean, C76800UCe> interfaceC88471Ynr = this.LIZJ;
            if (interfaceC88471Ynr != 0) {
                interfaceC88471Ynr.invoke(this, Boolean.valueOf(this.LJIJJ));
            }
        }
    }

    @Override // X.InterfaceC29517BiD
    public final BadgeStruct LIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC31462CWk
    public final int LIZJ() {
        return this.LIZLLL;
    }

    public final void LJIIIIZZ(Runnable runnable) {
        if (LiveBadgeLoadOptSetting.INSTANCE.diskCacheOpt()) {
            runnable.run();
        } else {
            this.LIZIZ.post(new ARunnableS41S0100000_5(runnable, 226));
        }
    }

    public final void LJII(int i, boolean z) {
        String str;
        List<String> urls;
        String str2;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_badge_load_result", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
            return;
        }
        String str3 = "";
        if (i != 1) {
            if (i != 6) {
                str = "";
            } else {
                str = "user_level_avatar";
            }
        } else {
            str = "user_level_badge";
        }
        ImageModel imageModel = this.LJII.LIZ;
        if (imageModel != null && (urls = imageModel.getUrls()) != null && (str2 = (String) ORZ.LJLLLLLL(0, urls)) != null) {
            str3 = str2;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_user_level_badge_load_result");
        KNV.LJ(z ? 1 : 0, LIZ, "status", str3, "uri");
        LIZ.LJIJJ(str, WM7.SCENE_SERVICE);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJI();
            LIZ.LJJIIZI();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31635CbH(int i, Handler handler, AqS25S0310000_5 aqS25S0310000_5, BadgeStruct badgeStruct, Context context, C31647CbT c31647CbT, C31642CbO c31642CbO, ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
        super(handler, aqS25S0310000_5);
        boolean z;
        boolean z2;
        o.LJIIIZ(context, "context");
        this.LIZLLL = i;
        this.LJ = badgeStruct;
        this.LJFF = context;
        this.LJI = c31647CbT;
        this.LJII = c31642CbO;
        this.LJIIIIZZ = aRunnableS24S0200000_5;
        if (!c31647CbT.LJLIL) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILL = z;
        if (!c31647CbT.LJLJJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIILLIIL = z2;
        this.LJIIZILJ = c31647CbT.LJLJI ? false : true;
    }
}
