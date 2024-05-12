package X;

import Y.ARunnableS24S0200000_5;
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

/* renamed from: X.CbG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31634CbG extends AbstractC31476CWy<C31580CaO> implements InterfaceC29517BiD {
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
    public C31580CaO LJIJJ;

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
        C31580CaO c31580CaO = new C31580CaO(context, bitmap, bitmap2, bitmap3, str, this.LJI);
        this.LJIJJ = c31580CaO;
        Runnable runnable = this.LJIIIIZZ;
        if (runnable != null) {
            c31580CaO.LJ = runnable;
        }
        return c31580CaO;
    }

    @Override // X.AbstractC31476CWy
    public final void LJFF() {
        C73318Sq2 c73318Sq2;
        File LIZJ;
        Integer num;
        Integer num2;
        CombineBadgeStruct combineBadgeStruct;
        C73318Sq2 c73318Sq22;
        File LIZJ2;
        Integer num3;
        Integer num4;
        String str;
        CombineBadgeStruct combineBadgeStruct2;
        C73318Sq2 c73318Sq23;
        LiveBadgeLoadOptSetting liveBadgeLoadOptSetting = LiveBadgeLoadOptSetting.INSTANCE;
        if (liveBadgeLoadOptSetting.diskCacheOpt() && (((!this.LJIILL && !this.LJIIL) || ((!this.LJIILLIIL && !this.LJIILIIL) || (!this.LJIIZILJ && !this.LJIILJJIL))) && this.LJIJ == null)) {
            this.LJIJ = new C73318Sq2();
        }
        String str2 = null;
        if (!this.LJIILL && !this.LJIIL) {
            this.LJIIL = true;
            C31636CbI c31636CbI = new C31636CbI(this);
            if (liveBadgeLoadOptSetting.diskCacheOpt()) {
                ImageModel imageModel = this.LJII.LIZ;
                BadgeStruct badgeStruct = this.LJ;
                C73411SrX LIZ = C31666Cbm.LIZ(imageModel, c31636CbI);
                if (LIZ != null && (c73318Sq23 = this.LJIJ) != null) {
                    c73318Sq23.LIZ(LIZ);
                }
            } else {
                Context context = this.LJFF;
                if (context != null && (LIZJ2 = C15420j4.LIZJ(context)) != null) {
                    ImageModel imageModel2 = this.LJII.LIZ;
                    C31647CbT c31647CbT = this.LJI;
                    if (c31647CbT != null) {
                        num3 = Integer.valueOf(c31647CbT.LJLLLL);
                    } else {
                        num3 = null;
                    }
                    BadgeStruct badgeStruct2 = this.LJ;
                    if (badgeStruct2 != null) {
                        num4 = Integer.valueOf(badgeStruct2.badgeScene);
                    } else {
                        num4 = null;
                    }
                    Boolean bool = Boolean.FALSE;
                    Boolean bool2 = Boolean.TRUE;
                    BadgeStruct badgeStruct3 = this.LJ;
                    if (badgeStruct3 != null && (combineBadgeStruct2 = badgeStruct3.combineBadgeStruct) != null) {
                        str = combineBadgeStruct2.str;
                    } else {
                        str = null;
                    }
                    C31663Cbj.LIZ(imageModel2, c31636CbI, LIZJ2, num3, num4, bool, bool2, str);
                }
            }
        }
        if (!this.LJIILLIIL && !this.LJIILIIL) {
            this.LJIILIIL = true;
            C31637CbJ c31637CbJ = new C31637CbJ(this);
            if (liveBadgeLoadOptSetting.diskCacheOpt()) {
                ImageModel imageModel3 = this.LJII.LIZLLL;
                BadgeStruct badgeStruct4 = this.LJ;
                C73411SrX LIZ2 = C31666Cbm.LIZ(imageModel3, c31637CbJ);
                if (LIZ2 != null && (c73318Sq22 = this.LJIJ) != null) {
                    c73318Sq22.LIZ(LIZ2);
                }
            } else {
                Context context2 = this.LJFF;
                if (context2 != null && (LIZJ = C15420j4.LIZJ(context2)) != null) {
                    ImageModel imageModel4 = this.LJII.LIZLLL;
                    C31647CbT c31647CbT2 = this.LJI;
                    if (c31647CbT2 != null) {
                        num = Integer.valueOf(c31647CbT2.LJLLLL);
                    } else {
                        num = null;
                    }
                    BadgeStruct badgeStruct5 = this.LJ;
                    if (badgeStruct5 != null) {
                        num2 = Integer.valueOf(badgeStruct5.badgeScene);
                    } else {
                        num2 = null;
                    }
                    Boolean bool3 = Boolean.FALSE;
                    BadgeStruct badgeStruct6 = this.LJ;
                    if (badgeStruct6 != null && (combineBadgeStruct = badgeStruct6.combineBadgeStruct) != null) {
                        str2 = combineBadgeStruct.str;
                    }
                    C31663Cbj.LIZ(imageModel4, c31637CbJ, LIZJ, num, num2, bool3, bool3, str2);
                }
            }
        }
        if (!this.LJIIZILJ && !this.LJIILJJIL) {
            this.LJIILJJIL = true;
            C31638CbK c31638CbK = new C31638CbK(this);
            if (liveBadgeLoadOptSetting.diskCacheOpt()) {
                C73411SrX LIZ3 = C31666Cbm.LIZ(this.LJII.LJ, c31638CbK);
                if (LIZ3 != null && (c73318Sq2 = this.LJIJ) != null) {
                    c73318Sq2.LIZ(LIZ3);
                }
            } else {
                File fileDir = C15420j4.LIZJ(this.LJFF);
                ImageModel imageModel5 = this.LJII.LJ;
                o.LJIIIIZZ(fileDir, "fileDir");
                Boolean bool4 = Boolean.FALSE;
                C31663Cbj.LIZ(imageModel5, c31638CbK, fileDir, -1, 0, bool4, bool4, null);
            }
        }
        LJI();
    }

    public final void LJI() {
        if (this.LJIILL && this.LJIILLIIL && !this.LJIJI) {
            this.LJIJI = true;
            InterfaceC88471Ynr<AbstractC31476CWy<T>, Boolean, C76800UCe> interfaceC88471Ynr = this.LIZJ;
            if (interfaceC88471Ynr != 0) {
                interfaceC88471Ynr.invoke(this, Boolean.TRUE);
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

    public final void LJII(int i, boolean z) {
        String str;
        List<String> urls;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_badge_load_result", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
            return;
        }
        ImageModel imageModel = this.LJII.LIZ;
        String str2 = "";
        if (imageModel == null || (urls = imageModel.getUrls()) == null || (str = (String) ORZ.LJLLLLLL(0, urls)) == null) {
            str = "";
        }
        if (i != 1) {
            if (i == 6) {
                str2 = "user_level_avatar";
            }
        } else {
            str2 = "user_level_badge";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_user_level_badge_load_result");
        KNV.LJ(z ? 1 : 0, LIZ, "status", str, "uri");
        LIZ.LJIJJ(str2, WM7.SCENE_SERVICE);
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
    public C31634CbG(int i, Handler handler, AqS25S0310000_5 aqS25S0310000_5, BadgeStruct badgeStruct, Context context, C31647CbT c31647CbT, C31642CbO c31642CbO, ARunnableS24S0200000_5 aRunnableS24S0200000_5) {
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
