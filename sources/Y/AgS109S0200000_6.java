package Y;

import X.AXW;
import X.C10I;
import X.C10K;
import X.C34K;
import X.C36004EBc;
import X.C37548EoS;
import X.C37619Epb;
import X.C38919FPf;
import X.C76800UCe;
import X.InterfaceC26386AXe;
import X.InterfaceC73573Su9;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.QDX;
import X.X1D;
import android.app.job.JobParameters;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.account.login.trusted.LoginHistoryFeatureStateResponse;
import com.ss.android.ugc.aweme.choosemusic.model.MusicPickResponse;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.compliance.business.statemachine.PNSUserStateManager;
import com.ss.android.ugc.aweme.effect.EffectCompatJobService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultShopViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AgS109S0200000_6 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 5:
                return then$5(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS109S0200000_6 agS109S0200000_6, C10K c10k) {
        if (!c10k.LJIILJJIL() && !c10k.LJIIL()) {
            PNSUserStateManager pNSUserStateManager = (PNSUserStateManager) agS109S0200000_6.l0;
            User user = (User) agS109S0200000_6.l1;
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "task.result");
            int intValue = ((Number) LJIIJJI).intValue();
            HashSet<String> hashSet = pNSUserStateManager.LJLILLLLZI;
            if (hashSet != null) {
                if (hashSet.size() < intValue) {
                    Iterator<UserStateHandler> it = pNSUserStateManager.LJLJI.iterator();
                    while (it.hasNext()) {
                        UserStateHandler next = it.next();
                        if (next.LIZ() == PNSUserStateManager.LIZJ()) {
                            next.LJFF(user);
                            PNSUserStateManager.LJFF("state_machine_user_add", next.key());
                        }
                    }
                    pNSUserStateManager.LJI();
                } else {
                    HashSet<String> hashSet2 = pNSUserStateManager.LJLILLLLZI;
                    if (hashSet2 != null) {
                        if (hashSet2.size() > intValue) {
                            User user2 = pNSUserStateManager.LJLIL;
                            if (user2 != null) {
                                pNSUserStateManager.LIZLLL(user2);
                                pNSUserStateManager.LJI();
                            } else {
                                o.LJIJI("lastLoggedInUser");
                                throw null;
                            }
                        } else {
                            String uid = user.getUid();
                            User user3 = pNSUserStateManager.LJLIL;
                            if (user3 != null) {
                                if (o.LJ(uid, user3.getUid())) {
                                    Iterator<UserStateHandler> it2 = pNSUserStateManager.LJLJI.iterator();
                                    while (it2.hasNext()) {
                                        UserStateHandler next2 = it2.next();
                                        if (next2.LIZ() == PNSUserStateManager.LIZJ()) {
                                            next2.LIZJ(user);
                                            PNSUserStateManager.LJFF("state_machine_user_update", next2.key());
                                        }
                                    }
                                } else {
                                    HashSet<String> hashSet3 = pNSUserStateManager.LJLILLLLZI;
                                    if (hashSet3 != null) {
                                        if (hashSet3.contains(user.getUid())) {
                                            User user4 = pNSUserStateManager.LJLIL;
                                            if (user4 != null) {
                                                Iterator<UserStateHandler> it3 = pNSUserStateManager.LJLJI.iterator();
                                                while (it3.hasNext()) {
                                                    UserStateHandler next3 = it3.next();
                                                    if (next3.LIZ() == PNSUserStateManager.LIZJ()) {
                                                        next3.LJ(user4);
                                                        PNSUserStateManager.LJFF("state_machine_user_deactivate", next3.key());
                                                    }
                                                }
                                                Iterator<UserStateHandler> it4 = pNSUserStateManager.LJLJI.iterator();
                                                while (it4.hasNext()) {
                                                    UserStateHandler next4 = it4.next();
                                                    if (next4.LIZ() == PNSUserStateManager.LIZJ()) {
                                                        next4.LJI(user);
                                                        PNSUserStateManager.LJFF("state_machine_user_activate", next4.key());
                                                    }
                                                }
                                                pNSUserStateManager.LJI();
                                            } else {
                                                o.LJIJI("lastLoggedInUser");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        o.LJIJI("allLoggedInUserIds");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("lastLoggedInUser");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("allLoggedInUserIds");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("allLoggedInUserIds");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS109S0200000_6 agS109S0200000_6, C10K c10k) {
        EffectCompatJobService effectCompatJobService = (EffectCompatJobService) agS109S0200000_6.l0;
        JobParameters jobParameters = (JobParameters) agS109S0200000_6.l1;
        effectCompatJobService.getClass();
        InterfaceC26386AXe interfaceC26386AXe = (InterfaceC26386AXe) AXW.LIZ(effectCompatJobService, InterfaceC26386AXe.class);
        interfaceC26386AXe.LJ(System.currentTimeMillis());
        interfaceC26386AXe.LIZ();
        effectCompatJobService.jobFinished(jobParameters, false);
        EffectCompatJobService.LJLIL = false;
        return null;
    }

    public static final Object then$2(AgS109S0200000_6 agS109S0200000_6, C10K c10k) {
        C34K c34k = new C34K();
        c34k.element = true;
        C34K c34k2 = new C34K();
        QDX qdx = (QDX) c10k.LJIIJJI();
        if (qdx == null) {
            ((EcSearchResultShopViewModel) agS109S0200000_6.l0).setState(new AqS172S0100000_6(new Throwable("Response null error"), 34));
        } else {
            qdx.LIZIZ(new C36004EBc((EcSearchResultShopViewModel) agS109S0200000_6.l0, c34k2, (SearchResultParam) agS109S0200000_6.l1, c34k));
        }
        return c10k;
    }

    public static final Object then$3(AgS109S0200000_6 agS109S0200000_6, C10K c10k) {
        if (c10k.LJIILIIL()) {
            InterfaceC73573Su9 interfaceC73573Su9 = (InterfaceC73573Su9) agS109S0200000_6.l0;
            C37619Epb c37619Epb = (C37619Epb) agS109S0200000_6.l1;
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "it.result");
            interfaceC73573Su9.onNext(new C37548EoS(c37619Epb, (MusicPickResponse) LJIIJJI));
        } else if (c10k.LJIIL()) {
            InterfaceC73573Su9 interfaceC73573Su92 = (InterfaceC73573Su9) agS109S0200000_6.l0;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("query music canceled: ");
            LIZ.append((C37619Epb) agS109S0200000_6.l1);
            interfaceC73573Su92.onError(new IllegalStateException(X1D.LIZIZ(LIZ)));
        } else if (c10k.LJIILJJIL()) {
            InterfaceC73573Su9 interfaceC73573Su93 = (InterfaceC73573Su9) agS109S0200000_6.l0;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("query music faulted: ");
            LIZ2.append((C37619Epb) agS109S0200000_6.l1);
            interfaceC73573Su93.onError(new IllegalStateException(X1D.LIZIZ(LIZ2)));
        } else {
            InterfaceC73573Su9 interfaceC73573Su94 = (InterfaceC73573Su9) agS109S0200000_6.l0;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("query music unknown: ");
            LIZ3.append((C37619Epb) agS109S0200000_6.l1);
            interfaceC73573Su94.onError(new IllegalStateException(X1D.LIZIZ(LIZ3)));
        }
        ((InterfaceC73573Su9) agS109S0200000_6.l0).onComplete();
        return C76800UCe.LIZ;
    }

    public static final Object then$4(AgS109S0200000_6 agS109S0200000_6, C10K c10k) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) agS109S0200000_6.l0;
        if (lifecycleOwner == null) {
            ((InterfaceC88472Yns) agS109S0200000_6.l1).invoke(c10k.LJIIJJI());
        } else {
            AqS153S0200000_6 aqS153S0200000_6 = new AqS153S0200000_6((InterfaceC88472Yns) agS109S0200000_6.l1, (InterfaceC88472Yns<? super LoginHistoryFeatureStateResponse, C76800UCe>) c10k, (C10K<LoginHistoryFeatureStateResponse>) 29);
            if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                aqS153S0200000_6.invoke();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$5(AgS109S0200000_6 agS109S0200000_6, C10K task) {
        JSONObject LIZIZ;
        o.LJIIIZ(task, "task");
        try {
            if (task.LJIILIIL() && !TextUtils.isEmpty((CharSequence) task.LJIIJJI())) {
                C38919FPf c38919FPf = (C38919FPf) agS109S0200000_6.l0;
                Object LJIIJJI = task.LJIIJJI();
                o.LJIIIIZZ(LJIIJJI, "task.result");
                c38919FPf.getClass();
                LIZIZ = C38919FPf.LIZIZ((String) LJIIJJI);
            } else {
                ((C38919FPf) agS109S0200000_6.l0).getClass();
                LIZIZ = C38919FPf.LIZIZ("null");
            }
            return LIZIZ;
        } catch (Exception e) {
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) agS109S0200000_6.l1;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("task has error: ");
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "unknown error";
            }
            LIZ.append(localizedMessage);
            interfaceC88471Ynr.invoke(2, X1D.LIZIZ(LIZ));
            return new JSONObject();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS109S0200000_6(Object obj, LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super LoginHistoryFeatureStateResponse, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = obj;
        this.l1 = lifecycleOwner;
    }
}
