package Y;

import X.AbstractC57829Mmn;
import X.ActivityC45651qj;
import X.C55714Ltm;
import X.C57148Mbo;
import X.C57338Mes;
import X.C57346Mf0;
import X.C57575Mih;
import X.C58004Mpc;
import X.C70692q1;
import X.C76800UCe;
import X.C77216USe;
import X.C77217USf;
import X.C78613UtF;
import X.C78977Uz7;
import X.EnumC55722Ltu;
import X.EnumC78982UzC;
import X.FMX;
import X.InterfaceC57784Mm4;
import X.InterfaceC57841Mmz;
import X.InterfaceC57927MoN;
import X.InterfaceC64672gJ;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.L10;
import X.ORZ;
import X.OSZ;
import X.UQ0;
import X.URP;
import X.XGT;
import X.XGW;
import X.XGX;
import X.XKX;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS175S0100000_9;

/* loaded from: classes10.dex */
public class IDfS130S0100000_9 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64672gJ
    public final Object emit(URP urp, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, urp, interfaceC67352kd);
            case 1:
                return emit$1(this, urp, interfaceC67352kd);
            case 2:
                return emit$2(this, urp, interfaceC67352kd);
            case 3:
                return emit$3(this, urp, interfaceC67352kd);
            case 4:
                return emit$4(this, urp, interfaceC67352kd);
            case 5:
                return emit$5(this, urp, interfaceC67352kd);
            case 6:
                return emit$6(this, urp, interfaceC67352kd);
            case 7:
                return emit$7(this, urp, interfaceC67352kd);
            case 8:
                return emit$8(this, urp, interfaceC67352kd);
            case 9:
                return emit$9(this, urp, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS130S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(IDfS130S0100000_9 iDfS130S0100000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        URP urp = (URP) obj;
        if (urp.LJLJL == EnumC55722Ltu.START_AUTH_PIPELINE && !urp.LJLIL) {
            FindFriendsPageActivity findFriendsPageActivity = (FindFriendsPageActivity) iDfS130S0100000_9.l0;
            findFriendsPageActivity.getClass();
            if (L10.LIZ()) {
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(findFriendsPageActivity), C78613UtF.LIZJ, null, new C70692q1(findFriendsPageActivity, null), 2);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$1(IDfS130S0100000_9 iDfS130S0100000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        UserCardListViewModel userCardListViewModel = (UserCardListViewModel) iDfS130S0100000_9.l0;
        List LLJI = ORZ.LLJI((Iterable) userCardListViewModel.LJLLL.getValue());
        ArrayList arrayList = new ArrayList();
        for (InterfaceC57927MoN interfaceC57927MoN : (List) obj) {
            Iterator it = LLJI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC57829Mmn<? extends InterfaceC57927MoN> LIZ = ((InterfaceC57841Mmz) it.next()).LIZ(interfaceC57927MoN);
                if (LIZ != null) {
                    arrayList.add(LIZ);
                    break;
                }
            }
        }
        userCardListViewModel.setState(new AqS140S0200000_9(userCardListViewModel, (UserCardListViewModel) arrayList, (List<? extends InterfaceC57784Mm4>) 0));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.IDfS130S0100000_9 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C57981MpF
            if (r0 == 0) goto L3a
            r4 = r7
            X.MpF r4 = (X.C57981MpF) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L40
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r1 = r5.l0
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            X.Mp3 r6 = (X.C57969Mp3) r6
            java.util.List<X.MoN> r0 = r6.LJ
            if (r0 != 0) goto L31
            goto L20
        L31:
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L20
            return r3
        L3a:
            X.MpF r4 = new X.MpF
            r4.<init>(r5, r7)
            goto L12
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS130S0100000_9.emit$2(Y.IDfS130S0100000_9, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$3(IDfS130S0100000_9 iDfS130S0100000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        Music music;
        XGX xgx = (XGX) obj;
        if (xgx instanceof XGW) {
            MusicDetail musicDetail = ((C57346Mf0) ((XGW) xgx).LJ).LIZ;
            if (musicDetail != null) {
                if (C78977Uz7.LJJJJI(xgx.LIZJ) == EnumC78982UzC.Net && (music = musicDetail.music) != null) {
                    ((MusicDetailViewModel) iDfS130S0100000_9.l0).getClass();
                    MusicDetailViewModel.hv0(music);
                    FMX.LJIILL("music_detail_trace", new OSZ("music_net_resp", "stage"), new OSZ(new Long(SystemClock.elapsedRealtime() - ((MusicDetailViewModel) iDfS130S0100000_9.l0).LJLJLJ), "duration"));
                }
                ((MusicDetailViewModel) iDfS130S0100000_9.l0).setState(new AqS175S0100000_9(musicDetail, 143));
            }
        } else if (xgx instanceof XGT) {
            ((MusicDetailViewModel) iDfS130S0100000_9.l0).setState(new AqS175S0100000_9(xgx, (XGX<C57346Mf0>) 144));
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$4(IDfS130S0100000_9 iDfS130S0100000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        Music music;
        XGX xgx = (XGX) obj;
        if (xgx instanceof XGW) {
            MusicDetail musicDetail = ((C57338Mes) ((XGW) xgx).LJ).LIZ;
            if (musicDetail != null) {
                if (C78977Uz7.LJJJJI(xgx.LIZJ) == EnumC78982UzC.Net && (music = musicDetail.music) != null) {
                    ((MusicDetailViewModel) iDfS130S0100000_9.l0).getClass();
                    MusicDetailViewModel.hv0(music);
                    FMX.LJIILL("music_detail_trace", new OSZ("music_net_resp", "stage"), new OSZ(new Long(SystemClock.elapsedRealtime() - ((MusicDetailViewModel) iDfS130S0100000_9.l0).LJLJLJ), "duration"));
                }
                ((MusicDetailViewModel) iDfS130S0100000_9.l0).setState(new AqS175S0100000_9(musicDetail, 145));
            }
        } else if (xgx instanceof XGT) {
            ((MusicDetailViewModel) iDfS130S0100000_9.l0).setState(new AqS175S0100000_9(xgx, (XGX<C57346Mf0>) 146));
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$5(IDfS130S0100000_9 iDfS130S0100000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        if (c77216USe.LJLILLLLZI == UQ0.SYNC && c77216USe.LJLIL.LJLJI) {
            ((InterfaceC65784Pro) iDfS130S0100000_9.l0).invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$6(IDfS130S0100000_9 iDfS130S0100000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        boolean z;
        C77216USe c77216USe = ((C57148Mbo) obj).LIZ;
        if (c77216USe.LJLILLLLZI == UQ0.SYNC) {
            MultiViewModel multiViewModel = (MultiViewModel) iDfS130S0100000_9.l0;
            C77217USf c77217USf = c77216USe.LJLIL;
            if (c77217USf.LJLJI && !c77217USf.LJLILLLLZI) {
                z = true;
            } else {
                z = false;
            }
            multiViewModel.nv0(z);
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$7(IDfS130S0100000_9 iDfS130S0100000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        if (C58004Mpc.LIZ[c77216USe.LJLILLLLZI.ordinal()] == 1 && c77216USe.LJLIL.LJLJI) {
            ((InterfaceC65784Pro) iDfS130S0100000_9.l0).invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$8(IDfS130S0100000_9 iDfS130S0100000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        if (C57575Mih.LIZ[c77216USe.LJLILLLLZI.ordinal()] == 1) {
            ((InterfaceC88472Yns) iDfS130S0100000_9.l0).invoke(Boolean.valueOf(c77216USe.LJLIL.LJLJI));
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$9(IDfS130S0100000_9 iDfS130S0100000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        URP urp = (URP) obj;
        if (urp.LJLJL == EnumC55722Ltu.START_AUTH_PIPELINE && !urp.LJLIL) {
            C55714Ltm.LIZIZ((ActivityC45651qj) iDfS130S0100000_9.l0);
        }
        return C76800UCe.LIZ;
    }
}
