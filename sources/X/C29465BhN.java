package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.usercard.profilev3.UserCardPreloadViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.BhN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29465BhN {
    public static final /* synthetic */ int LJI = 0;
    public final C29475BhX LIZ;
    public final C29456BhE LIZIZ;
    public final MutableLiveData<C29488Bhk<C29473BhV>> LIZJ = new MutableLiveData<>();
    public C29471BhT LIZLLL;
    public final UserCardPreloadViewModel LJ;
    public final C29470BhS LJFF;

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(3:(1:(1:12)(2:16|17))(2:18|19)|13|14)(2:20|21))(2:26|(2:28|29)(3:30|31|(2:33|34)(1:35)))|22|(2:24|25)|13|14))|42|6|7|(0)(0)|22|(0)|13|14|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C29468BhQ
            if (r0 == 0) goto L7a
            r8 = r10
            X.BhQ r8 = (X.C29468BhQ) r8
            int r2 = r8.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r8.LJLJJI = r2
        L12:
            java.lang.Object r7 = r8.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJI
            r5 = 3
            r4 = 2
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L37
            if (r0 == r1) goto L34
            if (r0 == r4) goto L2e
            if (r0 != r5) goto L80
            X.BhN r2 = r8.LJLIL
            X.C141335gf.LIZJ(r7)
        L29:
            r2.LIZLLL = r3
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2e:
            X.BhN r2 = r8.LJLIL
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Throwable -> L67
            goto L29
        L34:
            X.BhN r2 = r8.LJLIL
            goto L4e
        L37:
            X.C141335gf.LIZJ(r7)
            X.BhT r0 = r9.LIZLLL
            if (r0 != 0) goto L41
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L41:
            r8.LJLIL = r9     // Catch: java.lang.Throwable -> L66
            r8.LJLJJI = r1     // Catch: java.lang.Throwable -> L66
            java.lang.Object r7 = r0.LIZ(r8)     // Catch: java.lang.Throwable -> L66
            if (r7 != r6) goto L4c
            goto L88
        L4c:
            r2 = r9
            goto L51
        L4e:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Throwable -> L67
        L51:
            X.BhV r7 = (X.C29473BhV) r7     // Catch: java.lang.Throwable -> L67
            X.UtN r1 = X.C36636EZk.LIZ     // Catch: java.lang.Throwable -> L67
            X.BhH r0 = new X.BhH     // Catch: java.lang.Throwable -> L67
            r0.<init>(r7, r2, r3)     // Catch: java.lang.Throwable -> L67
            r8.LJLIL = r2     // Catch: java.lang.Throwable -> L67
            r8.LJLJJI = r4     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r8)     // Catch: java.lang.Throwable -> L67
            if (r0 != r6) goto L29
            goto L89
        L66:
            r2 = r9
        L67:
            X.UtN r1 = X.C36636EZk.LIZ
            X.BhG r0 = new X.BhG
            r0.<init>(r2, r3)
            r8.LJLIL = r2
            r8.LJLJJI = r5
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r8)
            if (r0 != r6) goto L29
            return r6
        L7a:
            X.BhQ r8 = new X.BhQ
            r8.<init>(r9, r10)
            goto L12
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L88:
            return r6
        L89:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29465BhN.LIZJ(X.2kd):java.lang.Object");
    }

    public C29465BhN(C29475BhX c29475BhX, C29456BhE c29456BhE) {
        ActivityC45651qj activityC45651qj;
        this.LIZ = c29475BhX;
        this.LIZIZ = c29456BhE;
        Context context = c29475BhX.LIZ;
        UserCardPreloadViewModel userCardPreloadViewModel = null;
        if ((context instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) context) != null) {
            userCardPreloadViewModel = (UserCardPreloadViewModel) ViewModelProviders.of(activityC45651qj).get(UserCardPreloadViewModel.class);
        }
        this.LJ = userCardPreloadViewModel;
        this.LJFF = new C29470BhS(CoroutineExceptionHandler.LJJJJIZL, this);
    }

    public final C29471BhT LIZ(LifecycleCoroutineScope scope, List list, boolean z) {
        o.LJIIIZ(scope, "scope");
        C84661XKn LIZIZ = XKX.LIZIZ(scope, C78613UtF.LIZJ, null, new C29455BhD(this, z, null), 2);
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(next, XKX.LIZIZ(scope, C78613UtF.LIZJ, null, new C28768BQu((AbstractC29482Bhe) next, null), 2));
        }
        return new C29471BhT(LIZIZ, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009d A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:12:0x008e, B:13:0x0091, B:14:0x0099, B:16:0x009d, B:18:0x00a1, B:20:0x00ef, B:22:0x00f7, B:23:0x00b6, B:25:0x00be, B:27:0x00c2, B:28:0x00e4, B:32:0x00fa, B:36:0x0094, B:37:0x0097), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #0 {all -> 0x0107, blocks: (B:12:0x008e, B:13:0x0091, B:14:0x0099, B:16:0x009d, B:18:0x00a1, B:20:0x00ef, B:22:0x00f7, B:23:0x00b6, B:25:0x00be, B:27:0x00c2, B:28:0x00e4, B:32:0x00fa, B:36:0x0094, B:37:0x0097), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C29471BhT r14, long r15, X.InterfaceC67352kd<? super X.C76800UCe> r17) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29465BhN.LIZIZ(X.BhT, long, X.2kd):java.lang.Object");
    }
}
