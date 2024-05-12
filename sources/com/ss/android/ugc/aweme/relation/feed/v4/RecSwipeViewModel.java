package com.ss.android.ugc.aweme.relation.feed.v4;

import X.AT9;
import X.C221018lt;
import X.C221108m2;
import X.C26045AKb;
import X.C2TH;
import X.C2U8;
import X.C30581Hy;
import X.C53014KrK;
import X.C53576L0y;
import X.C55206Lla;
import X.C57362MfG;
import X.C57629MjZ;
import X.C57643Mjn;
import X.C57687MkV;
import X.C57688MkW;
import X.C57693Mkb;
import X.C57695Mkd;
import X.C61996OUu;
import X.C62822Ol8;
import X.C72912tb;
import X.C73318Sq2;
import X.C78580Usi;
import X.C78613UtF;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.EnumC57597Mj3;
import X.HWL;
import X.K72;
import X.K74;
import X.OQN;
import X.ORS;
import X.ORZ;
import X.OSZ;
import X.W5F;
import X.W5U;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS62S1100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecSwipeViewModel extends AssemViewModel<C57629MjZ> {
    public Aweme LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public boolean LJLJL;
    public long LJLJLLL;
    public Integer LJLLLLLL;
    public RecUser LJLZ;
    public String LJLJJLL = "";
    public boolean LJLJLJ = true;
    public final C73318Sq2 LJLL = new C73318Sq2();
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 526));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(C57643Mjn.LJLIL);
    public final List<RecUser> LJLLJ = new ArrayList();
    public final List<RecUser> LJLLL = new ArrayList();
    public final boolean LJLLLL = C53576L0y.LIZIZ();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C57629MjZ defaultState() {
        return new C57629MjZ(0);
    }

    public final void jv0() {
        RecUser recUser = getState().LJLJI;
        if (recUser != null) {
            C221018lt.LIZ("RecSwipeViewModel", "[dislikeThisUser] dislike this user");
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C57693Mkb(this, recUser, null), 2);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLL.LIZLLL();
    }

    public final void qv0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[previous fypCardList] size is ");
        LIZ.append(((ArrayList) this.LJLLJ).size());
        C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZ));
        rv0("no_fyp_feed", this.LJLLJ);
        rv0("homepage_hot", this.LJLLL);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[new fypCardList] size is ");
        LIZ2.append(((ArrayList) this.LJLLJ).size());
        C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZ2));
    }

    public final void gv0(EnumC57597Mj3 actionType) {
        o.LJIIIZ(actionType, "actionType");
        setState(new AqS175S0100000_9(actionType, 238));
    }

    public final void hv0(List<RecUser> list) {
        List LLJILJILJ = ORZ.LLJILJILJ(list);
        List LLJILJILJ2 = ORZ.LLJILJILJ(list);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[before filter]tempFYPData size is ");
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        LIZ.append(arrayList.size());
        C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZ));
        if (this.LJLLLL) {
            rv0("no_fyp_feed", LLJILJILJ);
            rv0("homepage_hot", LLJILJILJ2);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[after filter]tempFYPData size is ");
        LIZ2.append(arrayList.size());
        C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZ2));
        ((ArrayList) this.LJLLJ).addAll(LLJILJILJ);
        ((ArrayList) this.LJLLL).addAll(LLJILJILJ2);
    }

    public final void iv0(Integer num) {
        if (num != null) {
            num.intValue();
            if (num.intValue() < kv0(this.LJLJJLL).size()) {
                ListProtector.remove(kv0(this.LJLJJLL), num.intValue());
                setState(new AqS175S0100000_9(num, 239));
            }
        }
    }

    public final List<RecUser> kv0(String ownEventType) {
        o.LJIIIZ(ownEventType, "ownEventType");
        if (o.LJ(ownEventType, "homepage_hot")) {
            return this.LJLLJ;
        }
        return this.LJLLL;
    }

    public final boolean mv0(String str) {
        Integer num;
        boolean z;
        if (this.LJLLLL) {
            qv0();
        }
        List<RecUser> kv0 = kv0(str);
        List<RecUser> LIZ = getState().LJLJJI.LIZ();
        if (LIZ != null) {
            num = Integer.valueOf(LIZ.size());
        } else {
            num = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("real data size is ");
        LIZ2.append(num);
        C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("current list size is ");
        LIZ3.append(kv0.size());
        C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("getState().listState is ");
        LIZ4.append(getState().LJLJJI);
        LIZ4.append(", SystemClock.elapsedRealtime is ");
        if (System.currentTimeMillis() < this.LJLJLLL) {
            z = true;
        } else {
            z = false;
        }
        LIZ4.append(z);
        C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZ4));
        if (!(getState().LJLJJI instanceof C72912tb) || kv0.size() <= 0 || System.currentTimeMillis() >= this.LJLJLLL) {
            return false;
        }
        return true;
    }

    public final void ov0(List<RecUser> users) {
        o.LJIIIZ(users, "users");
        C57688MkW c57688MkW = (C57688MkW) this.LJLLI.getValue();
        c57688MkW.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<RecUser> it = users.iterator();
        while (it.hasNext()) {
            OSZ LJI = OQN.LJI(it.next());
            if (LJI != null) {
                arrayList.add(LJI);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("total user size is ");
        LIZ.append(users.size());
        LIZ.append(", while valid size is ");
        LIZ.append(arrayList.size());
        C221018lt.LIZ("RecSwipeFlyMainColorManager", X1D.LIZIZ(LIZ));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            OSZ osz = (OSZ) it2.next();
            String str = (String) osz.getFirst();
            String str2 = (String) osz.getSecond();
            if (!c57688MkW.LIZIZ.containsKey(str)) {
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                LJIIIIZZ.LIZIZ("RecSwipeFlyMainColorManager");
                c57688MkW.LIZ.LIZ(new HWL(LJIIIIZZ.LJIIL(new C57687MkV(str2, c57688MkW, str))));
            }
        }
    }

    public final void sv0(EnumC57365MfJ actionType) {
        Aweme aweme;
        o.LJIIIZ(actionType, "actionType");
        Aweme aweme2 = this.LJLIL;
        User user = null;
        if ((aweme2 == null || aweme2.getAuthor() == null) && (aweme = this.LJLIL) != null) {
            aweme.setAuthor(getState().LJLJI);
        }
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI(this.LJLJJLL);
        c57362MfG.LJJLI = EnumC57366MfK.CARD;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = actionType;
        c57362MfG.LJJIIZ(this.LJLIL);
        Aweme aweme3 = this.LJLIL;
        if (aweme3 != null) {
            user = aweme3.getAuthor();
        }
        c57362MfG.LJJJJIZL(user);
        c57362MfG.LJLI = true;
        c57362MfG.LJIILIIL();
    }

    public static boolean lv0(RecUser recUser, String checkedEventType) {
        o.LJIIIZ(recUser, "recUser");
        o.LJIIIZ(checkedEventType, "checkedEventType");
        String uid = recUser.getUid();
        o.LJIIIIZZ(uid, "recUser.uid");
        if (C78580Usi.LIZIZ(checkedEventType, uid, C2TH.LIZ(), -1L) > System.currentTimeMillis() - K72.LJ(C30581Hy.LJJJI(((Number) C53014KrK.LIZ.getValue()).intValue(), K74.HOURS))) {
            return true;
        }
        return false;
    }

    public final void nv0(Context context, View view) {
        o.LJIIIZ(view, "view");
        new C61996OUu(context).LIZ(0);
        gv0(EnumC57597Mj3.CLICK_LONG_PRESS);
        C221018lt.LIZ("RecSwipeViewModel", "[onLongPress]");
        new AT9(view, context, this.LJLJJLL, new AqS156S0200000_9(view, this, 35)).LIZIZ();
    }

    public final void pv0(EnumC57597Mj3 actionType, View view) {
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(view, "view");
        C221018lt.LIZ("RecSwipeViewModel", "[dislikeThisFeature] dislike this feature");
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C57695Mkd(this, null), 2);
        gv0(actionType);
        C26045AKb c26045AKb = new C26045AKb(view);
        c26045AKb.LJIIIIZZ(R.string.gms);
        c26045AKb.LJIIJ();
        C2U8.LIZ(new C55206Lla());
    }

    public final void rv0(String str, List list) {
        AqS62S1100000_9 aqS62S1100000_9 = new AqS62S1100000_9(this, str, 12);
        o.LJIIIZ(list, "<this>");
        ORS.LJJLIIIJLLLLLLLZ(list, aqS62S1100000_9, false);
    }
}
