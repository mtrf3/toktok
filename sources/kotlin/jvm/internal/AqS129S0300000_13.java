package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass057;
import X.B83;
import X.C03720Cq;
import X.C07720Sa;
import X.C07730Sb;
import X.C09290Yb;
import X.C09330Yf;
import X.C0YW;
import X.C0YX;
import X.C14480hY;
import X.C17280m4;
import X.C17480mO;
import X.C1M1;
import X.C244309iM;
import X.C24440xc;
import X.C24830yF;
import X.C25740zi;
import X.C29374Bfu;
import X.C2A4;
import X.C31621Ly;
import X.C33611Tp;
import X.C34077DYz;
import X.C39687Fhr;
import X.C39849FkT;
import X.C40431iJ;
import X.C44031o7;
import X.C45871r5;
import X.C45881r6;
import X.C45891r7;
import X.C45911r9;
import X.C46041rM;
import X.C56509MFt;
import X.C68322mC;
import X.C70657RoD;
import X.C74987Tbr;
import X.C76800UCe;
import X.C76846UDy;
import X.C76863UEp;
import X.C76864UEq;
import X.C78840Uwu;
import X.C78929UyL;
import X.C79053V0v;
import X.C79057V0z;
import X.C79212V6y;
import X.InterfaceC015404g;
import X.InterfaceC03730Cr;
import X.InterfaceC07760Se;
import X.InterfaceC07790Sh;
import X.InterfaceC24420xa;
import X.InterfaceC24520xk;
import X.InterfaceC25720zg;
import X.InterfaceC273215k;
import X.InterfaceC88471Ynr;
import X.OSZ;
import X.TV3;
import X.V1I;
import X.V2G;
import X.V2I;
import X.V5H;
import X.V5J;
import X.V5K;
import Y.ARunnableS32S0200000_13;
import android.app.Application;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionCell;
import com.ss.android.ugc.aweme.favorites.business.playlist.model.MixInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes14.dex */
public class AqS129S0300000_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS129S0300000_13 aqS129S0300000_13, Object obj, Object obj2) {
        C76846UDy c76846UDy = (C76846UDy) aqS129S0300000_13.l0;
        c76846UDy.LIZIZ.LJJIJIL().post(new ARunnableS32S0200000_13(c76846UDy, (C2A4) aqS129S0300000_13.l1, 22));
        C33611Tp c33611Tp = (C33611Tp) aqS129S0300000_13.l2;
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        C14480hY.LIZIZ(c33611Tp, 4, 1, 2, TV3.LJIIIIZZ(LJ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS129S0300000_13 aqS129S0300000_13, Object obj, Object obj2) {
        int i;
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC07790Sh LJIJJ = C70657RoD.LJIJJ(C07720Sa.LIZLLL(C09290Yb.LJII(C09290Yb.LJIIIIZZ(c1m1, 80)), new AqS92S0300000_3((Context) aqS129S0300000_13.l0, (MixInfo) aqS129S0300000_13.l1, (PlaylistCollectionCell) aqS129S0300000_13.l2, 2)), 16, 0.0f, 2);
            InterfaceC07760Se.LJJJ.getClass();
            C31621Ly c31621Ly = C07730Sb.LJIIJJI;
            MixInfo mixInfo = (MixInfo) aqS129S0300000_13.l1;
            interfaceC24520xk.LJJIIJ(693286680);
            InterfaceC273215k LIZ = C0YX.LIZ(C0YW.LIZ, c31621Ly, interfaceC24520xk);
            interfaceC24520xk.LJJIIJ(-1323940314);
            C44031o7 c44031o7 = AnonymousClass057.LJ;
            Object LJIILLIIL = interfaceC24520xk.LJIILLIIL(c44031o7);
            C44031o7 c44031o72 = AnonymousClass057.LJIIJ;
            Object LJIILLIIL2 = interfaceC24520xk.LJIILLIIL(c44031o72);
            C44031o7 c44031o73 = AnonymousClass057.LJIILJJIL;
            InterfaceC015404g interfaceC015404g = (InterfaceC015404g) interfaceC24520xk.LJIILLIIL(c44031o73);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(LJIJJ);
            if (interfaceC24520xk.LJJ() instanceof InterfaceC24420xa) {
                interfaceC24520xk.LJIJI();
                if (interfaceC24520xk.LJIJJLI()) {
                    interfaceC24520xk.LJJI(c46041rM);
                } else {
                    interfaceC24520xk.LIZIZ();
                }
                interfaceC24520xk.LJJIIZI();
                C45891r7 c45891r7 = C03720Cq.LJ;
                C24830yF.LIZ(interfaceC24520xk, LIZ, c45891r7);
                C45871r5 c45871r5 = C03720Cq.LIZLLL;
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL, c45871r5);
                C45881r6 c45881r6 = C03720Cq.LJFF;
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL2, c45881r6);
                C45911r9 c45911r9 = C03720Cq.LJI;
                C17280m4.LIZIZ(0, LJIIL, V1I.LIZIZ(interfaceC24520xk, interfaceC015404g, c45911r9, interfaceC24520xk), interfaceC24520xk, 2058660585, -678309503);
                InterfaceC07790Sh LJI = C78840Uwu.LJI(C09290Yb.LJIIJJI(c1m1, 64), C17480mO.LIZ(8));
                String str = mixInfo.coverUrl;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                V2G.LIZ(new V2I(str), null, LJI, null, null, 0.0f, new C76864UEq(R.drawable.amr, null), new C76863UEp(), null, interfaceC24520xk, 48, 312);
                C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, 12), interfaceC24520xk, 6);
                interfaceC24520xk.LJJIIJ(-483455358);
                InterfaceC273215k LIZ2 = C09330Yf.LIZ(C0YW.LIZJ, C07730Sb.LJIILIIL, interfaceC24520xk);
                interfaceC24520xk.LJJIIJ(-1323940314);
                Object LJIILLIIL3 = interfaceC24520xk.LJIILLIIL(c44031o7);
                Object LJIILLIIL4 = interfaceC24520xk.LJIILLIIL(c44031o72);
                Object LJIILLIIL5 = interfaceC24520xk.LJIILLIIL(c44031o73);
                C40431iJ LJIIL2 = C56509MFt.LJIIL(c1m1);
                if (interfaceC24520xk.LJJ() instanceof InterfaceC24420xa) {
                    interfaceC24520xk.LJIJI();
                    if (interfaceC24520xk.LJIJJLI()) {
                        interfaceC24520xk.LJJI(c46041rM);
                    } else {
                        interfaceC24520xk.LIZIZ();
                    }
                    interfaceC24520xk.LJJIIZI();
                    C24830yF.LIZ(interfaceC24520xk, LIZ2, c45891r7);
                    C24830yF.LIZ(interfaceC24520xk, LJIILLIIL3, c45871r5);
                    C24830yF.LIZ(interfaceC24520xk, LJIILLIIL4, c45881r6);
                    C24830yF.LIZ(interfaceC24520xk, LJIILLIIL5, c45911r9);
                    interfaceC24520xk.LJIIIIZZ();
                    C17280m4.LIZIZ(0, LJIIL2, new C24440xc(interfaceC24520xk), interfaceC24520xk, 2058660585, -1163856341);
                    String str3 = mixInfo.name;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    C79053V0v.LIZIZ(str2, null, 0L, C79212V6y.LIZIZ(interfaceC24520xk).LJIIJ, 0L, null, 0, false, 0, false, null, null, null, interfaceC24520xk, 0, 0, 8182);
                    Integer num = mixInfo.totalVideoCount;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    String quantityString = C70657RoD.LJJ(interfaceC24520xk).getQuantityString(R.plurals.as, i, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                    o.LJIIIIZZ(quantityString, "resources.getQuantityStr…g(id, count, *formatArgs)");
                    Integer num2 = mixInfo.updatedVideoCount;
                    interfaceC24520xk.LJJIIJ(1707673423);
                    if (C34077DYz.LIZ && num2 != null && num2.intValue() > 0) {
                        quantityString = C70657RoD.LJJ(interfaceC24520xk).getQuantityString(R.plurals.at, num2.intValue(), Arrays.copyOf(new Object[]{quantityString, num2}, 2));
                        o.LJIIIIZZ(quantityString, "resources.getQuantityStr…g(id, count, *formatArgs)");
                    }
                    interfaceC24520xk.LJJIJIIJIL();
                    C79053V0v.LIZIZ(quantityString, null, 0L, C79212V6y.LIZIZ(interfaceC24520xk).LJIIZILJ, 0L, null, 0, false, 0, false, null, null, null, interfaceC24520xk, 0, 0, 8182);
                    interfaceC24520xk.LJJIJIIJIL();
                    interfaceC24520xk.LJJIJIIJIL();
                    interfaceC24520xk.LJIJ();
                    interfaceC24520xk.LJJIJIIJIL();
                    interfaceC24520xk.LJJIJIIJIL();
                    interfaceC24520xk.LJJIJIIJIL();
                    interfaceC24520xk.LJJIJIIJIL();
                    interfaceC24520xk.LJIJ();
                    interfaceC24520xk.LJJIJIIJIL();
                    interfaceC24520xk.LJJIJIIJIL();
                } else {
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.OSZ] */
    public static final Object invoke$2(AqS129S0300000_13 aqS129S0300000_13, Object obj, Object obj2) {
        boolean z;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        long longValue = ((Number) obj2).longValue();
        ((C68322mC) aqS129S0300000_13.l0).element = ((CropActivity) aqS129S0300000_13.l1).LLIZLLLIL();
        Application LIZ = C39849FkT.LIZ();
        long LJ = C39687Fhr.LJ(C39849FkT.LIZ());
        CharSequence charSequence = (CharSequence) ((OSZ) ((C68322mC) aqS129S0300000_13.l0).element).getFirst();
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C244309iM.LIZJ(LIZ, "checkAndHandleSaveFile clean finish", Long.valueOf(longValue), Boolean.valueOf(booleanValue), LJ, Boolean.valueOf(!z));
        ((CountDownLatch) aqS129S0300000_13.l2).countDown();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS129S0300000_13 aqS129S0300000_13, Object obj, Object obj2) {
        C74987Tbr.LIZJ("anchor_shared_bg", "show quick apply dialog, download image fail");
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) aqS129S0300000_13.l0;
        multiGuestSharedBgAnchorViewModel.runOnUIThread(new AqS117S0300000_13(multiGuestSharedBgAnchorViewModel, (Context) aqS129S0300000_13.l1, (DataChannel) aqS129S0300000_13.l2, 7));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS129S0300000_13 aqS129S0300000_13, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            V5H.LIZ((Aweme) aqS129S0300000_13.l0, C25740zi.LIZ(C09290Yb.LJI(InterfaceC07790Sh.LJJJI), (InterfaceC25720zg) aqS129S0300000_13.l1, null), new AqS163S0100000_13((V5J) aqS129S0300000_13.l2, 544), interfaceC24520xk, 8, 0);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS129S0300000_13(C2A4 c2a4, C33611Tp c33611Tp, C76846UDy c76846UDy, int i) {
        super(2);
        this.$t = i;
        this.l0 = c76846UDy;
        this.l1 = c2a4;
        this.l2 = c33611Tp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS129S0300000_13(C68322mC c68322mC, C68322mC<OSZ<String, Integer>> c68322mC2, CropActivity cropActivity, CountDownLatch countDownLatch) {
        super(2);
        this.$t = countDownLatch;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
        this.l2 = cropActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS129S0300000_13(Context context, MixInfo mixInfo, PlaylistCollectionCell playlistCollectionCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = mixInfo;
        this.l2 = playlistCollectionCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS129S0300000_13(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, Context context, DataChannel dataChannel, int i) {
        super(2);
        this.$t = i;
        this.l0 = multiGuestSharedBgAnchorViewModel;
        this.l1 = context;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS129S0300000_13(Aweme aweme, V5K v5k, V5J v5j, int i) {
        super(2);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = v5k;
        this.l2 = v5j;
    }
}
