package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29831Fb extends F9E {
    public final Class<? extends C0I6> LJLIL;
    public final List<Class<? extends C0I6>> LJLILLLLZI;
    public final List<Class<? extends C0I6>> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C29831Fb(Class<? extends C0I6> apiComponentClass, List<? extends Class<? extends C0I6>> parentApiComponentClassList, List<? extends Class<? extends C0I6>> totalTrackClassList) {
        o.LJIIIZ(apiComponentClass, "apiComponentClass");
        o.LJIIIZ(parentApiComponentClassList, "parentApiComponentClassList");
        o.LJIIIZ(totalTrackClassList, "totalTrackClassList");
        this.LJLIL = apiComponentClass;
        this.LJLILLLLZI = parentApiComponentClassList;
        this.LJLJI = totalTrackClassList;
    }
}
