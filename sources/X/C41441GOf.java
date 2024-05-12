package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.scheduler.story.DefaultStoryGroupTaskPublisher$startPublish$publishJob$1", f = "DefaultStoryGroupTaskPublisher.kt", l = {111}, m = "invokeSuspend")
/* renamed from: X.GOf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41441GOf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public /* synthetic */ Object LJLJLLL;
    public final /* synthetic */ VideoPublishEditModel LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ Activity LJLLILLLL;
    public final /* synthetic */ int LJLLJ;
    public final /* synthetic */ boolean LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41441GOf(VideoPublishEditModel videoPublishEditModel, String str, Activity activity, int i, boolean z, InterfaceC67352kd<? super C41441GOf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLL = videoPublishEditModel;
        this.LJLLI = str;
        this.LJLLILLLL = activity;
        this.LJLLJ = i;
        this.LJLLL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41441GOf c41441GOf = new C41441GOf(this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, interfaceC67352kd);
        c41441GOf.LJLJLLL = obj;
        return c41441GOf;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x034c  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object[], java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.OQg] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0069 -> B:5:0x0024). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41441GOf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
