package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC76473Tzp;
import X.B5G;
import X.C04750Gp;
import X.C0GY;
import X.C0NB;
import X.C47261Igj;
import X.C75768ToS;
import X.C75883TqJ;
import X.C76244Tw8;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76286Two;
import X.C76469Tzl;
import X.C76472Tzo;
import X.C76732zl;
import X.C76800UCe;
import X.C8E;
import X.CN1;
import X.InterfaceC88472Yns;
import X.JBR;
import X.UXN;
import X.UXR;
import X.V1K;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.hotword.HotWordGiftViewModel;
import com.bytedance.android.livesdk.hotword.ui.HotWordGiftConfirmDialogFragment;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import com.ss.android.ugc.aweme.tools.music.MusicServiceImpl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public class AqS62S0201000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS62S0201000_13 aqS62S0201000_13, Object obj) {
        Fragment it = (Fragment) obj;
        o.LJIIIZ(it, "it");
        IMusicService iMusicService = ((MusicServiceImpl) aqS62S0201000_13.l0).LIZ;
        int i = aqS62S0201000_13.i2;
        V1K v1k = (V1K) aqS62S0201000_13.l1;
        iMusicService.openChooseMusicPage(it, i, v1k.LIZ, v1k.LIZIZ, v1k.LJIIZILJ, v1k.LIZJ, v1k.LIZLLL, v1k.LJ, v1k.LJFF, v1k.LJI, v1k.LJII, v1k.LJIIIIZZ, v1k.LJIIJ, v1k.LJIIJJI, v1k.LJIIL, v1k.LJIILJJIL, v1k.LJIILIIL, v1k.LJIILL, v1k.LJIILLIIL, v1k.LJIIIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS62S0201000_13 aqS62S0201000_13, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            StringBuilder LJI = JBR.LJI("Start Battle Delay - changePoc- = ", booleanValue, " --- armies size ");
            LJI.append(((List) aqS62S0201000_13.l0).size());
            C0NB.LIZIZ("MultiMatchAudienceViewP", X1D.LIZIZ(LJI));
            C76271TwZ.LJJLIIIJ(C76271TwZ.LIZ, C76265TwT.LIZ.LIZIZ(), B5G.LIZIZ().LJFF);
            ((C76286Two) aqS62S0201000_13.l1).LJFF(aqS62S0201000_13.i2, (List) aqS62S0201000_13.l0);
            C76286Two.LJJ((C76286Two) aqS62S0201000_13.l1, (List) aqS62S0201000_13.l0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS62S0201000_13 aqS62S0201000_13, Object obj) {
        List<TeamUsersInfo> list;
        TeamUsersInfo teamUsersInfo;
        TeamUsersInfo teamUsersInfo2;
        List<Long> list2;
        ImageModel imageModel;
        Bitmap decodeFile;
        C75768ToS c75768ToS;
        List<Long> list3;
        ImageModel imageModel2;
        Bitmap decodeFile2;
        C75768ToS c75768ToS2;
        C0GY result = (C0GY) obj;
        o.LJIIIZ(result, "result");
        Map<String, C04750Gp> map = result.LIZLLL;
        long j = C76265TwT.LIZ.LJJJJJ;
        long j2 = 1;
        if (j == 1) {
            j2 = 2;
        }
        WIDGET widget = ((C76469Tzl) aqS62S0201000_13.l0).LJLIL;
        if (widget != 0 && (list = ((C76244Tw8) widget.LJZI(C76244Tw8.class)).LJIILL) != null) {
            C76469Tzl c76469Tzl = (C76469Tzl) aqS62S0201000_13.l0;
            int i = aqS62S0201000_13.i2;
            C76732zl c76732zl = (C76732zl) aqS62S0201000_13.l1;
            Iterator<TeamUsersInfo> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    teamUsersInfo = it.next();
                    if (teamUsersInfo.teamId == j) {
                        break;
                    }
                } else {
                    teamUsersInfo = null;
                    break;
                }
            }
            TeamUsersInfo teamUsersInfo3 = teamUsersInfo;
            if (teamUsersInfo3 != null && (list3 = teamUsersInfo3.userIds) != null) {
                int i2 = 0;
                for (Long l : list3) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        Long id = l;
                        try {
                            IMultiHostService LIZLLL = C8E.LIZLLL();
                            o.LJIIIIZZ(id, "id");
                            try {
                                C75883TqJ LJI = LIZLLL.LJI(id.longValue());
                                if (LJI != null && (c75768ToS2 = LJI.LJIIZILJ) != null) {
                                    imageModel2 = c75768ToS2.LIZJ;
                                } else {
                                    imageModel2 = null;
                                }
                                String rM = ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).rM(imageModel2);
                                o.LJIIIIZZ(rM, "getService(IHostFrescoHe…ImageFilePath(imageModel)");
                                decodeFile2 = BitmapFactory.decodeFile(rM);
                                c76469Tzl.getClass();
                            } catch (Exception e) {
                                e = e;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        try {
                            C04750Gp c04750Gp = map.get(AbstractC76473Tzp.LJJJJJ(i2, i, 0));
                            if (decodeFile2 != null) {
                                c76732zl.element++;
                            }
                            C76469Tzl.LJLIL(decodeFile2, c04750Gp, i);
                        } catch (Exception e3) {
                            e = e3;
                            C0NB.LJFF("MultiMatchView", "start vs animal self ", e);
                            i2 = i3;
                        }
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            Iterator<TeamUsersInfo> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    teamUsersInfo2 = it2.next();
                    if (teamUsersInfo2.teamId == j2) {
                        break;
                    }
                } else {
                    teamUsersInfo2 = null;
                    break;
                }
            }
            TeamUsersInfo teamUsersInfo4 = teamUsersInfo2;
            if (teamUsersInfo4 != null && (list2 = teamUsersInfo4.userIds) != null) {
                int i4 = 0;
                for (Long l2 : list2) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        Long id2 = l2;
                        try {
                            IMultiHostService LIZLLL2 = C8E.LIZLLL();
                            o.LJIIIIZZ(id2, "id");
                            C75883TqJ LJI2 = LIZLLL2.LJI(id2.longValue());
                            if (LJI2 != null && (c75768ToS = LJI2.LJIIZILJ) != null) {
                                imageModel = c75768ToS.LIZJ;
                            } else {
                                imageModel = null;
                            }
                            String rM2 = ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).rM(imageModel);
                            o.LJIIIIZZ(rM2, "getService(IHostFrescoHe…ImageFilePath(imageModel)");
                            decodeFile = BitmapFactory.decodeFile(rM2);
                            c76469Tzl.getClass();
                        } catch (Exception e4) {
                            e = e4;
                        }
                        try {
                            C04750Gp c04750Gp2 = map.get(AbstractC76473Tzp.LJJJJJ(i4, i, 1));
                            if (decodeFile != null) {
                                c76732zl.element++;
                            }
                            C76469Tzl.LJLIL(decodeFile, c04750Gp2, i);
                        } catch (Exception e5) {
                            e = e5;
                            C0NB.LJFF("MultiMatchView", "start vs animal rival ", e);
                            i4 = i5;
                        }
                        i4 = i5;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS62S0201000_13 aqS62S0201000_13, Object obj) {
        List<TeamUsersInfo> list;
        TeamUsersInfo teamUsersInfo;
        TeamUsersInfo teamUsersInfo2;
        List<Long> list2;
        ImageModel imageModel;
        Bitmap decodeFile;
        C75768ToS c75768ToS;
        List<Long> list3;
        ImageModel imageModel2;
        Bitmap decodeFile2;
        C75768ToS c75768ToS2;
        C0GY result = (C0GY) obj;
        o.LJIIIZ(result, "result");
        Map<String, C04750Gp> map = result.LIZLLL;
        long j = C76265TwT.LIZ.LJJJJJ;
        long j2 = 1;
        if (j == 1) {
            j2 = 2;
        }
        WIDGET widget = ((C76472Tzo) aqS62S0201000_13.l0).LJLIL;
        if (widget != 0 && (list = ((C76244Tw8) widget.LJZI(C76244Tw8.class)).LJIILL) != null) {
            C76472Tzo c76472Tzo = (C76472Tzo) aqS62S0201000_13.l0;
            int i = aqS62S0201000_13.i2;
            C76732zl c76732zl = (C76732zl) aqS62S0201000_13.l1;
            Iterator<TeamUsersInfo> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    teamUsersInfo = it.next();
                    if (teamUsersInfo.teamId == j) {
                        break;
                    }
                } else {
                    teamUsersInfo = null;
                    break;
                }
            }
            TeamUsersInfo teamUsersInfo3 = teamUsersInfo;
            if (teamUsersInfo3 != null && (list3 = teamUsersInfo3.userIds) != null) {
                int i2 = 0;
                for (Long l : list3) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        Long id = l;
                        try {
                            IMultiHostService LIZLLL = C8E.LIZLLL();
                            o.LJIIIIZZ(id, "id");
                            try {
                                C75883TqJ LJI = LIZLLL.LJI(id.longValue());
                                if (LJI != null && (c75768ToS2 = LJI.LJIIZILJ) != null) {
                                    imageModel2 = c75768ToS2.LIZJ;
                                } else {
                                    imageModel2 = null;
                                }
                                String rM = ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).rM(imageModel2);
                                o.LJIIIIZZ(rM, "getService(IHostFrescoHe…ImageFilePath(imageModel)");
                                decodeFile2 = BitmapFactory.decodeFile(rM);
                                c76472Tzo.getClass();
                            } catch (Exception e) {
                                e = e;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        try {
                            C04750Gp c04750Gp = map.get(AbstractC76473Tzp.LJJJJJ(i2, i, 0));
                            if (decodeFile2 != null) {
                                c76732zl.element++;
                            }
                            C76472Tzo.LJJLL(decodeFile2, c04750Gp, i);
                        } catch (Exception e3) {
                            e = e3;
                            C0NB.LJFF("MultiMatchAudienceWidge", "start vs animal self ", e);
                            i2 = i3;
                        }
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            Iterator<TeamUsersInfo> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    teamUsersInfo2 = it2.next();
                    if (teamUsersInfo2.teamId == j2) {
                        break;
                    }
                } else {
                    teamUsersInfo2 = null;
                    break;
                }
            }
            TeamUsersInfo teamUsersInfo4 = teamUsersInfo2;
            if (teamUsersInfo4 != null && (list2 = teamUsersInfo4.userIds) != null) {
                int i4 = 0;
                for (Long l2 : list2) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        Long id2 = l2;
                        try {
                            IMultiHostService LIZLLL2 = C8E.LIZLLL();
                            o.LJIIIIZZ(id2, "id");
                            C75883TqJ LJI2 = LIZLLL2.LJI(id2.longValue());
                            if (LJI2 != null && (c75768ToS = LJI2.LJIIZILJ) != null) {
                                imageModel = c75768ToS.LIZJ;
                            } else {
                                imageModel = null;
                            }
                            String rM2 = ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).rM(imageModel);
                            o.LJIIIIZZ(rM2, "getService(IHostFrescoHe…ImageFilePath(imageModel)");
                            decodeFile = BitmapFactory.decodeFile(rM2);
                            c76472Tzo.getClass();
                        } catch (Exception e4) {
                            e = e4;
                        }
                        try {
                            C04750Gp c04750Gp2 = map.get(AbstractC76473Tzp.LJJJJJ(i4, i, 1));
                            if (decodeFile != null) {
                                c76732zl.element++;
                            }
                            C76472Tzo.LJJLL(decodeFile, c04750Gp2, i);
                        } catch (Exception e5) {
                            e = e5;
                            C0NB.LJFF("MultiMatchAudienceWidge", "start vs animal rival ", e);
                            i4 = i5;
                        }
                        i4 = i5;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS62S0201000_13 aqS62S0201000_13, Object it) {
        o.LJIIIZ(it, "it");
        int i = aqS62S0201000_13.i2;
        if (i != 1) {
            if (i == 2) {
                UXN uxn = ((HotWordGiftViewModel) aqS62S0201000_13.l0).LJLJI;
                if (uxn != null) {
                    uxn.LIZLLL(UXR.LIZ());
                } else {
                    o.LJIJI("userRepository");
                    throw null;
                }
            }
        } else {
            UXN uxn2 = ((HotWordGiftViewModel) aqS62S0201000_13.l0).LJLJI;
            if (uxn2 != null) {
                uxn2.LJI(UXR.LIZ());
            } else {
                o.LJIJI("userRepository");
                throw null;
            }
        }
        HotWordGiftConfirmDialogFragment hotWordGiftConfirmDialogFragment = (HotWordGiftConfirmDialogFragment) aqS62S0201000_13.l1;
        hotWordGiftConfirmDialogFragment.LJLLLL = true;
        hotWordGiftConfirmDialogFragment.dismiss();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S0201000_13(MusicServiceImpl musicServiceImpl, V1K v1k, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicServiceImpl;
        this.i2 = 110;
        this.l1 = v1k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S0201000_13(int i, HotWordGiftViewModel hotWordGiftViewModel, HotWordGiftConfirmDialogFragment hotWordGiftConfirmDialogFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = hotWordGiftViewModel;
        this.l1 = hotWordGiftConfirmDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S0201000_13(C76469Tzl c76469Tzl, int i, C76732zl c76732zl, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c76469Tzl;
        this.i2 = i;
        this.l1 = c76732zl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S0201000_13(C76472Tzo c76472Tzo, int i, C76732zl c76732zl, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c76472Tzo;
        this.i2 = i;
        this.l1 = c76732zl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS62S0201000_13(List list, List<BattleTeamUserArmies> list2, C76286Two c76286Two, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.i2 = c76286Two;
    }
}
