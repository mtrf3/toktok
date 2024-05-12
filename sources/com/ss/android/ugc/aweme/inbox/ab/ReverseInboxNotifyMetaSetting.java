package com.ss.android.ugc.aweme.inbox.ab;

import X.AnonymousClass942;
import X.C221108m2;
import X.C47261Igj;
import X.C53407Kxf;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ReverseInboxNotifyMetaSetting {
    public static final ReverseInboxNotifyMetaSetting LIZ = new ReverseInboxNotifyMetaSetting();
    public static final Meta LIZIZ = new Meta(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C53407Kxf.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(AnonymousClass942.LJLIL);

    /* loaded from: classes10.dex */
    public static final class Meta {

        @InterfaceC65349Pkn("interact_group")
        public final List<Integer> groups;

        @InterfaceC65349Pkn("interact_type")
        public final List<Integer> types;

        /* JADX WARN: Multi-variable type inference failed */
        public Meta() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public Meta(List<Integer> groups, List<Integer> types) {
            o.LJIIIZ(groups, "groups");
            o.LJIIIZ(types, "types");
            this.groups = groups;
            this.types = types;
        }

        public /* synthetic */ Meta(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C47261Igj.LJJIJIIJI(7, 233, 12, 13, 2, 231, 3, 241, 6) : list, (i & 2) != 0 ? C47261Igj.LJJIJIIJI(33, 233, 13, 23, 31, 231, 1003, 41, 241, 45) : list2);
        }
    }
}
