package Y;

import X.ActivityC45651qj;
import X.C10I;
import X.C10K;
import X.C1DH;
import X.C5S1;
import X.C73411SrX;
import X.C76800UCe;
import X.C77116UOi;
import X.C82544WaS;
import X.EnumC77147UPn;
import X.UC0;
import X.UTK;
import X.UUQ;
import X.UUR;
import X.UUS;
import X.UUT;
import X.UUU;
import X.UUV;
import X.UUW;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.api.SocialRelationDataCheckResponse;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveContactsUnit;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveFBFriendsUnit;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveMLBBFriendsUnit;
import com.zhiliaoapp.musically.R;
import ujb.o;

/* loaded from: classes14.dex */
public class AgS129S0100000_13 implements C10I {
    public final int $t;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            default:
                return null;
        }
    }

    public AgS129S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(AgS129S0100000_13 agS129S0100000_13, C10K c10k) {
        if (!C82544WaS.LJ(c10k) || o.LJJJJIZL("error", ((BaseResponse) c10k.LJIIJJI()).message, true)) {
            RemoveFBFriendsUnit removeFBFriendsUnit = (RemoveFBFriendsUnit) agS129S0100000_13.l0;
            removeFBFriendsUnit.LJLJJLL = true;
            removeFBFriendsUnit.LJIIJ(UUV.LJLIL);
            return Boolean.FALSE;
        }
        if (((SocialRelationDataCheckResponse) c10k.LJIIJJI()).getHasRemainingData()) {
            if (UC0.LJJIIZ()) {
                RemoveFBFriendsUnit removeFBFriendsUnit2 = (RemoveFBFriendsUnit) agS129S0100000_13.l0;
                removeFBFriendsUnit2.getClass();
                C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(1, removeFBFriendsUnit2, 21));
                RemoveFBFriendsUnit removeFBFriendsUnit3 = (RemoveFBFriendsUnit) agS129S0100000_13.l0;
                removeFBFriendsUnit3.LJLJJLL = false;
                removeFBFriendsUnit3.LJIIJ(UUU.LJLIL);
            } else {
                RemoveFBFriendsUnit removeFBFriendsUnit4 = (RemoveFBFriendsUnit) agS129S0100000_13.l0;
                removeFBFriendsUnit4.getClass();
                C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(0, removeFBFriendsUnit4, 21));
                RemoveFBFriendsUnit removeFBFriendsUnit5 = (RemoveFBFriendsUnit) agS129S0100000_13.l0;
                removeFBFriendsUnit5.LJLJJLL = true;
                removeFBFriendsUnit5.LJIIJ(UUV.LJLIL);
            }
            return Boolean.FALSE;
        }
        C73411SrX c73411SrX = ((RemoveFBFriendsUnit) agS129S0100000_13.l0).LJLLLLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        RemoveFBFriendsUnit removeFBFriendsUnit6 = (RemoveFBFriendsUnit) agS129S0100000_13.l0;
        removeFBFriendsUnit6.LJLJJLL = false;
        removeFBFriendsUnit6.LJIIJ(UUU.LJLIL);
        boolean LJJIIZ = UC0.LJJIIZ();
        Keva.getRepo("facebook_sync_repo").storeBoolean("facebook_sync_is_removing", false);
        RemoveFBFriendsUnit removeFBFriendsUnit7 = (RemoveFBFriendsUnit) agS129S0100000_13.l0;
        removeFBFriendsUnit7.getClass();
        C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(0, removeFBFriendsUnit7, 21));
        return Boolean.valueOf(LJJIIZ);
    }

    public static final Object then$1(AgS129S0100000_13 agS129S0100000_13, C10K c10k) {
        Object LJIIJJI = c10k.LJIIJJI();
        kotlin.jvm.internal.o.LJIIIIZZ(LJIIJJI, "it.result");
        if (((Boolean) LJIIJJI).booleanValue()) {
            C5S1 c5s1 = new C5S1(((RemoveFBFriendsUnit) agS129S0100000_13.l0).LJIILLIIL());
            c5s1.LIZJ(R.string.v9);
            c5s1.LJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS129S0100000_13 agS129S0100000_13, C10K c10k) {
        if (c10k.LJIILIIL() && c10k.LJIIJJI() != null) {
            C77116UOi c77116UOi = (C77116UOi) c10k.LJIIJJI();
            if (c77116UOi != null) {
                ((UUW) agS129S0100000_13.l0).LIZ(c77116UOi);
                return null;
            }
            ((UUW) agS129S0100000_13.l0).onError();
            return null;
        }
        ((UUW) agS129S0100000_13.l0).onError();
        return null;
    }

    public static final Object then$3(AgS129S0100000_13 agS129S0100000_13, C10K c10k) {
        ActivityC45651qj mo49getActivity;
        if (!C82544WaS.LJ(c10k) || o.LJJJJIZL("error", ((BaseResponse) c10k.LJIIJJI()).message, true)) {
            RemoveMLBBFriendsUnit removeMLBBFriendsUnit = (RemoveMLBBFriendsUnit) agS129S0100000_13.l0;
            removeMLBBFriendsUnit.LJLJLJ = true;
            removeMLBBFriendsUnit.LJIIJ(UUR.LJLIL);
        } else if (((SocialRelationDataCheckResponse) c10k.LJIIJJI()).getHasRemainingData()) {
            if (UC0.LJJIJIIJI()) {
                RemoveMLBBFriendsUnit removeMLBBFriendsUnit2 = (RemoveMLBBFriendsUnit) agS129S0100000_13.l0;
                removeMLBBFriendsUnit2.getClass();
                C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(1, removeMLBBFriendsUnit2, 19));
                RemoveMLBBFriendsUnit removeMLBBFriendsUnit3 = (RemoveMLBBFriendsUnit) agS129S0100000_13.l0;
                removeMLBBFriendsUnit3.LJLJLJ = false;
                removeMLBBFriendsUnit3.LJIIJ(UUQ.LJLIL);
            } else {
                RemoveMLBBFriendsUnit removeMLBBFriendsUnit4 = (RemoveMLBBFriendsUnit) agS129S0100000_13.l0;
                removeMLBBFriendsUnit4.getClass();
                C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(0, removeMLBBFriendsUnit4, 19));
                RemoveMLBBFriendsUnit removeMLBBFriendsUnit5 = (RemoveMLBBFriendsUnit) agS129S0100000_13.l0;
                removeMLBBFriendsUnit5.LJLJLJ = true;
                removeMLBBFriendsUnit5.LJIIJ(UUR.LJLIL);
            }
        } else {
            C73411SrX c73411SrX = ((RemoveMLBBFriendsUnit) agS129S0100000_13.l0).LJLJJLL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            if (UC0.LJJIJIIJI() && (mo49getActivity = ((RemoveMLBBFriendsUnit) agS129S0100000_13.l0).LJLJJL.mo49getActivity()) != null) {
                mo49getActivity.runOnUiThread(new ARunnableS49S0100000_13((RemoveMLBBFriendsUnit) agS129S0100000_13.l0, 241));
            }
            RemoveMLBBFriendsUnit removeMLBBFriendsUnit6 = (RemoveMLBBFriendsUnit) agS129S0100000_13.l0;
            removeMLBBFriendsUnit6.LJLJLJ = false;
            removeMLBBFriendsUnit6.LJIIJ(UUQ.LJLIL);
            Keva.getRepo("mlbb_sync_repo").storeBoolean("mlbb_sync_is_removing", false);
            RemoveMLBBFriendsUnit removeMLBBFriendsUnit7 = (RemoveMLBBFriendsUnit) agS129S0100000_13.l0;
            removeMLBBFriendsUnit7.getClass();
            C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(0, removeMLBBFriendsUnit7, 19));
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$4(AgS129S0100000_13 agS129S0100000_13, C10K c10k) {
        ActivityC45651qj mo49getActivity;
        if (!C82544WaS.LJ(c10k) || o.LJJJJIZL("error", ((BaseResponse) c10k.LJIIJJI()).message, true)) {
            RemoveContactsUnit removeContactsUnit = (RemoveContactsUnit) agS129S0100000_13.l0;
            removeContactsUnit.LJLJJLL = true;
            removeContactsUnit.LJIIJ(UUT.LJLIL);
        } else if (((SocialRelationDataCheckResponse) c10k.LJIIJJI()).getHasRemainingData()) {
            if (UC0.LJJIJIIJIL()) {
                RemoveContactsUnit removeContactsUnit2 = (RemoveContactsUnit) agS129S0100000_13.l0;
                removeContactsUnit2.getClass();
                C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(1, removeContactsUnit2, 20));
                RemoveContactsUnit removeContactsUnit3 = (RemoveContactsUnit) agS129S0100000_13.l0;
                removeContactsUnit3.LJLJJLL = false;
                removeContactsUnit3.LJIIJ(UUS.LJLIL);
            } else {
                RemoveContactsUnit removeContactsUnit4 = (RemoveContactsUnit) agS129S0100000_13.l0;
                removeContactsUnit4.getClass();
                C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(0, removeContactsUnit4, 20));
                RemoveContactsUnit removeContactsUnit5 = (RemoveContactsUnit) agS129S0100000_13.l0;
                removeContactsUnit5.LJLJJLL = true;
                removeContactsUnit5.LJIIJ(UUT.LJLIL);
            }
        } else {
            C73411SrX c73411SrX = ((RemoveContactsUnit) agS129S0100000_13.l0).LJLLJ;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            if (UC0.LJJIJIIJIL() && (mo49getActivity = ((RemoveContactsUnit) agS129S0100000_13.l0).LJLJJL.mo49getActivity()) != null) {
                mo49getActivity.runOnUiThread(new ARunnableS40S0100000_4((RemoveContactsUnit) agS129S0100000_13.l0, 155));
            }
            if (UTK.LIZIZ.LIZLLL(EnumC77147UPn.EMAIL).LIZ()) {
                RemoveContactsUnit removeContactsUnit6 = (RemoveContactsUnit) agS129S0100000_13.l0;
                removeContactsUnit6.LJLJJLL = true;
                removeContactsUnit6.LJIIJ(UUT.LJLIL);
            } else {
                RemoveContactsUnit removeContactsUnit7 = (RemoveContactsUnit) agS129S0100000_13.l0;
                removeContactsUnit7.LJLJJLL = false;
                removeContactsUnit7.LJIIJ(UUS.LJLIL);
            }
            Keva.getRepo("contacts_sync_repo").storeBoolean("contacts_sync_is_removing", false);
            RemoveContactsUnit removeContactsUnit8 = (RemoveContactsUnit) agS129S0100000_13.l0;
            removeContactsUnit8.getClass();
            C1DH.LJJIJIIJI(new ARunnableS17S0101000_13(0, removeContactsUnit8, 20));
        }
        return C76800UCe.LIZ;
    }
}
