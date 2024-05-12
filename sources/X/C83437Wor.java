package X;

import android.content.Context;
import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wor, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83437Wor implements InterfaceC83472WpQ, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;

    static {
        TBT tbt = new TBT(C83437Wor.class, "actionAIApi", "getActionAIApi()Lcom/ss/android/ugc/aweme/actionai/bot/ActionAIApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C83437Wor.class, "autoEditApi", "getAutoEditApi()Lcom/ss/android/ugc/aweme/actionai/action/microaction/template/ActionAIAutoCutEditApi;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC83472WpQ
    public final String LIZIZ() {
        return "recommend_template";
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C83437Wor(Context context, C82622Wbi diContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, InterfaceC83402WoI.class, null);
        this.LJLJI = UCI.LJI(diContainer, InterfaceC136985Ze.class, null);
        C45161Hnx.LIZIZ(null);
        this.LJLJJI = C221108m2.LIZIZ(C173346rC.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 49));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01bd, code lost:
    
        if (r3 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e0, code lost:
    
        if (r3 == null) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.bytedance.ies.actionai.jni.ExecutionContext r21, java.lang.String r22, X.InterfaceC67352kd r23) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83437Wor.LIZJ(com.bytedance.ies.actionai.jni.ExecutionContext, java.lang.String, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC83472WpQ
    public final /* bridge */ /* synthetic */ Object LIZ(ExecutionContext executionContext, ActionExecuteCallback actionExecuteCallback, Object obj, InterfaceC67352kd interfaceC67352kd) {
        return LIZJ(executionContext, (String) obj, interfaceC67352kd);
    }
}
