package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8gi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217808gi extends F9E {
    public C217798gh LJLIL;
    public final List<Y9G> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C217808gi(C217798gh entityExtraInfo, List<Y9G> mentionUserList) {
        o.LJIIIZ(entityExtraInfo, "entityExtraInfo");
        o.LJIIIZ(mentionUserList, "mentionUserList");
        this.LJLIL = entityExtraInfo;
        this.LJLILLLLZI = mentionUserList;
    }
}
