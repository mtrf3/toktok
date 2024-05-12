package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.effectmanager.IFetchModelListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS54S0400000_8;
import kotlin.jvm.internal.AqS56S1200000_1;
import kotlin.jvm.internal.AqS58S1200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.Ins, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47704Ins implements FA1, InterfaceC62930Oms, InterfaceC47037Id7, RTU, InterfaceC73592SuS, IFetchModelListener {
    public static long LJLIL;
    public static long LJLILLLLZI;
    public static final C47704Ins LJLJI = new C47704Ins();
    public static final C47704Ins LJLJJI = new C47704Ins();

    @Override // X.InterfaceC62930Oms
    public void onError() {
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
    public void onFailed(Exception exc) {
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
    public void onSuccess(String[] strArr) {
    }

    public static long LIZIZ() {
        String str;
        long j = LJLIL;
        if (j == 0) {
            if (C47705Int.LIZIZ == null) {
                synchronized (C47705Int.class) {
                    if (C47705Int.LIZIZ == null) {
                        C47705Int.LIZIZ = new C47705Int();
                    }
                }
            }
            C47705Int c47705Int = C47705Int.LIZIZ;
            c47705Int.getClass();
            try {
                Object LIZ = c47705Int.LIZ();
                str = (String) LIZ.getClass().getMethod("get", String.class).invoke(LIZ, "log.tag.push.timestamp");
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (Throwable unused) {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                LJLIL = -1L;
            } else {
                try {
                    LJLIL = CastLongProtector.parseLong(str);
                } catch (Throwable unused2) {
                    LJLIL = -1L;
                }
                LJLILLLLZI = System.currentTimeMillis();
                return LJLIL;
            }
        } else if (j != -1) {
            return (System.currentTimeMillis() - LJLILLLLZI) + j;
        }
        return System.currentTimeMillis();
    }

    @Override // X.InterfaceC62930Oms
    public void onSuccess() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            AnonymousClass114.LIZ(LJIIIIZZ, R.string.p8_);
        }
    }

    public static void LJI(int i) {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        int i2 = C92J.LIZ.LIZJ;
        if (i2 == 1) {
            FFL.LJIIIZ().getClass();
            repo.storeInt("zl_perflock_qcom", FFL.LJIIJ(31744, 1, "zl_perflock_qcom", true));
            FFL.LJIIIZ().getClass();
            repo.storeString("zl_perflock_param", FFL.LJIILJJIL(31744, "zl_perflock_param", "", true));
        } else if (i2 == 2) {
            FFL.LJIIIZ().getClass();
            repo.storeInt("zl_perflock_mtk", FFL.LJIIJ(31744, 1, "zl_perflock_mtk", true));
            FFL.LJIIIZ().getClass();
            repo.storeString("zl_mtk_param", FFL.LJIILJJIL(31744, "zl_mtk_param", "", true));
        } else if (i2 == 3) {
            FFL.LJIIIZ().getClass();
            repo.storeInt("zl_perflock_kirin", FFL.LJIIJ(31744, 1, "zl_perflock_kirin", true));
        }
        repo.storeInt("perflock_data", i);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        return !TextUtils.isEmpty(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC47037Id7
    public void LIZ(C47039Id9 c47039Id9, Object obj) {
        IX7 ix7;
        C47007Icd put = (C47007Icd) obj;
        o.LJIIIZ(put, "put");
        String msg = o.LJIILLIIL(c47039Id9, "start pool trim | pool : \n");
        o.LJIIIZ(msg, "msg");
        C34K c34k = new C34K();
        C68322mC c68322mC = new C68322mC();
        c47039Id9.LIZ(new AqS54S0400000_8(put, (C47007Icd) c34k, (C34K) new ArrayList(3), (ArrayList<Integer>) c68322mC, (C68322mC<C47007Icd>) 3));
        if (c34k.element) {
            return;
        }
        T t = c68322mC.element;
        if (t != 0) {
            c47039Id9.LIZIZ(t);
            IX7 ix72 = (IX7) c68322mC.element;
            if (ix72 != null) {
                ix72.LJFF();
            }
        }
        if (c47039Id9.LIZJ() != 1 || (ix7 = (IX7) c47039Id9.LIZLLL()) == null) {
            return;
        }
        ix7.LJFF();
    }

    @Override // X.RTU
    public Object apply(Object obj, Object info) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(info, "info");
        return info;
    }

    public static final AqS58S1200000_3 LIZJ(C8W0 c8w0, Class cls, String str) {
        o.LJIIIZ(c8w0, "<this>");
        return new AqS58S1200000_3(c8w0, (C8W0) cls, (Class<Object>) str, (String) 11);
    }

    public static final AqS56S1200000_1 LIZLLL(AssemViewModel assemViewModel, Class cls, String str) {
        o.LJIIIZ(assemViewModel, "<this>");
        return new AqS56S1200000_1(assemViewModel, (AssemViewModel<Object>) cls, (Class<Object>) str, (String) 3);
    }

    public static final AqS58S1200000_3 LJ(C8W0 c8w0, Class cls, String str) {
        o.LJIIIZ(c8w0, "<this>");
        return new AqS58S1200000_3(c8w0, (C8W0) cls, (Class<Object>) str, (String) 12);
    }

    public static final AqS58S1200000_3 LJFF(AssemViewModel assemViewModel, Class cls, String str) {
        o.LJIIIZ(assemViewModel, "<this>");
        return new AqS58S1200000_3(assemViewModel, (AssemViewModel<Object>) cls, (Class<Object>) str, (String) 13);
    }
}
