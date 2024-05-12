package X;

import android.content.Context;
import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hp7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45233Hp7 implements InterfaceC83472WpQ, InterfaceC135635Tz {
    public static final C45113HnB LJLJLJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C82632Wbs LJLJJL;
    public final Context LJLJJLL;
    public final C62822Ol8 LJLJL;

    static {
        TBT tbt = new TBT(C45233Hp7.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, new TBT(C45233Hp7.class, "autoEditApi", "getAutoEditApi()Lcom/ss/android/ugc/aweme/actionai/action/microaction/template/ActionAIAutoCutEditApi;", 0), new TBT(C45233Hp7.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0)};
        LJLJLJ = new C45113HnB();
    }

    @Override // X.InterfaceC83472WpQ
    public final String LIZIZ() {
        return "apply_template";
    }

    public final VideoPublishEditModel LIZLLL() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LJLJLLL[0]);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C45233Hp7(Context context, C82622Wbi diContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJI = UCI.LJI(diContainer, InterfaceC136985Ze.class, null);
        this.LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 51));
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC44717Hgn.class, null);
        this.LJLJJLL = C5L7.LIZ();
        this.LJLJL = C221108m2.LIZIZ(C45235Hp9.LJLIL);
        C45161Hnx.LIZIZ(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C45241HpF r31, X.InterfaceC67352kd r32) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45233Hp7.LIZJ(X.HpF, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC83472WpQ
    public final /* bridge */ /* synthetic */ Object LIZ(ExecutionContext executionContext, ActionExecuteCallback actionExecuteCallback, Object obj, InterfaceC67352kd interfaceC67352kd) {
        return LIZJ((C45241HpF) obj, interfaceC67352kd);
    }
}
