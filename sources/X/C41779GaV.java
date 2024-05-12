package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.GaV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41779GaV extends AbstractC41873Gc1 {
    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41779GaV(String publisherTag) {
        super(publisherTag, 2);
        o.LJIIIZ(publisherTag, "publisherTag");
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43458H3u) {
                if (next != null) {
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof InterfaceC43387H1b) {
                            if (next2 != null) {
                                InterfaceC43387H1b interfaceC43387H1b = (InterfaceC43387H1b) next2;
                                interfaceC43387H1b.LJIIIIZZ();
                                interfaceC43387H1b.LJFF().getClass();
                                return;
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
    }
}
