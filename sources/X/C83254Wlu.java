package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wlu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83254Wlu extends AbstractC83313Wmr<C83160WkO, Void> {
    public final InterfaceC84497XEf LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83254Wlu(InterfaceC84497XEf effectDownloader) {
        super(0);
        o.LJIIIZ(effectDownloader, "effectDownloader");
        this.LIZIZ = effectDownloader;
    }

    @Override // X.AbstractC83313Wmr
    public final AbstractC83312Wmq<C83160WkO, Void> LIZ(C83160WkO c83160WkO, String taskID) {
        C83160WkO param = c83160WkO;
        o.LJIIIZ(param, "param");
        o.LJIIIZ(taskID, "taskID");
        return new C83217WlJ(taskID, param, this.LIZIZ);
    }
}
