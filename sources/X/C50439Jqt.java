package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jqt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50439Jqt extends AbstractC65781Prl implements InterfaceC88471Ynr<C50429Jqj, C50297Job, C50429Jqj> {
    public static final C50439Jqt LJLIL = new C50439Jqt();

    public C50439Jqt() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50429Jqj invoke(C50429Jqj c50429Jqj, C50297Job c50297Job) {
        C50429Jqj lastState = c50429Jqj;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(c50297Job, "<anonymous parameter 1>");
        java.util.Map<String, String> extraLogParams = lastState.LJLIL;
        String enterCommentId = lastState.LJLILLLLZI;
        String isFromPhoto = lastState.LJLJJI;
        String sourceId = lastState.LJLJJL;
        o.LJIIIZ(extraLogParams, "extraLogParams");
        o.LJIIIZ(enterCommentId, "enterCommentId");
        o.LJIIIZ(isFromPhoto, "isFromPhoto");
        o.LJIIIZ(sourceId, "sourceId");
        return new C50429Jqj(enterCommentId, isFromPhoto, sourceId, (java.util.Map) extraLogParams, false);
    }
}
