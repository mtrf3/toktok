package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import com.ss.android.ugc.aweme.relation.recuser.dm.LegacyDMRecUserCompatImpl;
import com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget;
import com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardAdapterWidget;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mlk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57764Mlk implements InterfaceC57702Mkk {
    public static final C57764Mlk LIZIZ = new C57764Mlk();

    @Override // X.InterfaceC57702Mkk
    public final InterfaceC98113t9 LIZJ() {
        return new LegacyDMRecUserCompatImpl(0);
    }

    @Override // X.InterfaceC57702Mkk
    public final AbstractC029409q<?> LIZIZ(C57838Mmw c57838Mmw) {
        Object LIZJ;
        AbstractC57781Mm1 abstractC57781Mm1;
        Object LIZJ2;
        AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9(c57838Mmw, 450);
        Fragment fragment = c57838Mmw.LIZ;
        int i = 5;
        if (fragment != null) {
            C57858MnG c57858MnG = new C57858MnG(null, fragment, 1);
            aqS175S0100000_9.invoke(c57858MnG);
            IRelationUserCardInternalService.LIZ.getClass();
            IRelationUserCardInternalService LIZ = C57930MoQ.LIZ();
            C57867MnP c57867MnP = c57858MnG.LIZLLL;
            if (c57867MnP.LIZLLL == -1) {
                int i2 = c57858MnG.LJFF.LIZJ - 10;
                if (i2 >= 5) {
                    i = i2;
                }
                c57867MnP.LIZLLL = i;
            }
            C65776Prg LIZ2 = C65352Pkq.LIZ(AbstractC57781Mm1.class);
            if (!o.LJ(LIZ2, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ2, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
                C57866MnO c57866MnO = c57858MnG.LJFF;
                if (c57866MnO.LJIILJJIL == null) {
                    c57866MnO.LJIILJJIL = Boolean.TRUE;
                }
            }
            C57859MnH c57859MnH = new C57859MnH(c57858MnG.LIZ, c57858MnG.LIZIZ, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null);
            C65776Prg LIZ3 = C65352Pkq.LIZ(AbstractC57781Mm1.class);
            if (o.LJ(LIZ3, C65352Pkq.LIZ(C25771A9n.class))) {
                LIZJ2 = C94293mz.LIZ(LIZ, c57859MnH, 2).getLayout();
            } else if (o.LJ(LIZ3, C65352Pkq.LIZ(C25770A9m.class))) {
                LIZJ2 = LIZ.LIZIZ(c57859MnH, 0).getLayout();
            } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC58014Mpm.class))) {
                LIZJ2 = LIZ.LIZ(c57859MnH);
            } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC57781Mm1.class))) {
                LIZJ2 = LIZ.LIZJ(c57859MnH);
            } else {
                "type is error!".toString();
                throw new IllegalStateException("type is error!");
            }
            if (LIZJ2 != null) {
                abstractC57781Mm1 = (AbstractC57781Mm1) LIZJ2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardAdapter");
            }
        } else {
            ActivityC45651qj activityC45651qj = c57838Mmw.LIZIZ;
            if (activityC45651qj != null) {
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(activityC45651qj);
                if (LJJIFFI != null) {
                    C57858MnG c57858MnG2 = new C57858MnG(LJJIFFI, null, 2);
                    aqS175S0100000_9.invoke(c57858MnG2);
                    IRelationUserCardInternalService.LIZ.getClass();
                    IRelationUserCardInternalService LIZ4 = C57930MoQ.LIZ();
                    C57867MnP c57867MnP2 = c57858MnG2.LIZLLL;
                    if (c57867MnP2.LIZLLL == -1) {
                        int i3 = c57858MnG2.LJFF.LIZJ - 10;
                        if (i3 >= 5) {
                            i = i3;
                        }
                        c57867MnP2.LIZLLL = i;
                    }
                    C65776Prg LIZ5 = C65352Pkq.LIZ(AbstractC57781Mm1.class);
                    if (!o.LJ(LIZ5, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ5, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ5, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ5, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
                        C57866MnO c57866MnO2 = c57858MnG2.LJFF;
                        if (c57866MnO2.LJIILJJIL == null) {
                            c57866MnO2.LJIILJJIL = Boolean.TRUE;
                        }
                    }
                    C57859MnH c57859MnH2 = new C57859MnH(c57858MnG2.LIZ, c57858MnG2.LIZIZ, c57858MnG2.LIZJ, c57858MnG2.LIZLLL, c57858MnG2.LJ, c57858MnG2.LJFF, null);
                    C65776Prg LIZ6 = C65352Pkq.LIZ(AbstractC57781Mm1.class);
                    if (o.LJ(LIZ6, C65352Pkq.LIZ(C25771A9n.class))) {
                        LIZJ = C94293mz.LIZ(LIZ4, c57859MnH2, 2).getLayout();
                    } else if (o.LJ(LIZ6, C65352Pkq.LIZ(C25770A9m.class))) {
                        LIZJ = LIZ4.LIZIZ(c57859MnH2, 0).getLayout();
                    } else if (o.LJ(LIZ6, C65352Pkq.LIZ(AbstractC58014Mpm.class))) {
                        LIZJ = LIZ4.LIZ(c57859MnH2);
                    } else if (o.LJ(LIZ6, C65352Pkq.LIZ(AbstractC57781Mm1.class))) {
                        LIZJ = LIZ4.LIZJ(c57859MnH2);
                    } else {
                        "type is error!".toString();
                        throw new IllegalStateException("type is error!");
                    }
                    if (LIZJ != null) {
                        abstractC57781Mm1 = (AbstractC57781Mm1) LIZJ;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardAdapter");
                    }
                } else {
                    "current context is not fragmentActivity!".toString();
                    throw new IllegalStateException("current context is not fragmentActivity!");
                }
            } else {
                "config not attach host!".toString();
                throw new IllegalStateException("config not attach host!");
            }
        }
        ((C57780Mm0) abstractC57781Mm1).LJIILL(null);
        C57780Mm0 c57780Mm0 = (C57780Mm0) abstractC57781Mm1;
        c57780Mm0.LJLJLJ(false);
        c57780Mm0.W7(new C57766Mlm(c57838Mmw));
        return c57780Mm0;
    }

    @Override // X.InterfaceC57702Mkk
    public final void LIZLLL(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return;
        }
        int i = 0;
        L0A.LJ.putAll(C113554cx.LJJL(new OSZ(Integer.valueOf(R.layout.cau), "relation_usercard_title_item"), new OSZ(Integer.valueOf(R.layout.cai), "relation_rec_user_card_rectangle")));
        int[] iArr = {R.layout.cau, R.layout.cai, R.layout.cai, R.layout.cai};
        if (!L0A.LIZIZ() || activityC45651qj.isFinishing()) {
            return;
        }
        do {
            int i2 = iArr[i];
            C16970lZ.LJ(i2, activityC45651qj);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("preInflate layout id = ");
            LIZ.append((String) ((LinkedHashMap) L0A.LJ).get(Integer.valueOf(i2)));
            C221018lt.LJFF("InboxJankOptimizationV3", X1D.LIZIZ(LIZ));
            i++;
        } while (i < 4);
    }

    @Override // X.InterfaceC57702Mkk
    public final FrameLayout LJ(ActivityC45651qj activityC45651qj, String enterFrom, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C118244kW c118244kW = new C118244kW(activityC45651qj);
        TuxTextView tuxTextView = c118244kW.LJLIL;
        if (tuxTextView != null) {
            LKE lke = LKE.LIZIZ;
            Context context = c118244kW.getContext();
            o.LJIIIIZZ(context, "context");
            tuxTextView.setText(AT7.LIZ(lke, context, null, null, 72, enterFrom, z ? 1 : 0, null, 334));
            return c118244kW;
        }
        o.LJIJI("privacyTextView");
        throw null;
    }

    @Override // X.InterfaceC57702Mkk
    public final Object LIZ(User user, EnumC57876MnY enumC57876MnY, int i, int i2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LIZ = MafUserApiService.LIZIZ.LIZ(user, enumC57876MnY, i, i2, interfaceC67352kd);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC57702Mkk
    public final AbsUserCardInboxWidget LJI(Fragment fragment, int i, LiveData<EnumC94693nd> liveData, AbstractC57896Mns authCardStrategy, int i2) {
        LiveData<EnumC94693nd> liveData2 = liveData;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(authCardStrategy, "authCardStrategy");
        if (liveData2 == null) {
            liveData2 = new MutableLiveData<>();
        }
        return new UserCardAdapterWidget(fragment, i, liveData2, authCardStrategy, i2);
    }

    @Override // X.InterfaceC57702Mkk
    public final void LJFF(Context context, User user, String enterFrom, String str, String previousPage, String enterMethod, String str2) {
        EnumC57366MfK enumC57366MfK;
        o.LJIIIZ(user, "user");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(enterMethod, "enterMethod");
        EnumC57366MfK[] values = EnumC57366MfK.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC57366MfK = values[i];
                if (o.LJ(enumC57366MfK.getType(), str2)) {
                    break;
                } else {
                    i++;
                }
            } else {
                enumC57366MfK = null;
                break;
            }
        }
        C57581Min.LJ(user, context, enterFrom, str, previousPage, enterMethod, enumC57366MfK, false, null, null, null, null, false, null, null, false, 65472);
    }
}
