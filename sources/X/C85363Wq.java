package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.3Wq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85363Wq extends C81929WDl {
    public final String LJLJLJ;
    public final int LJLJLLL;
    public final boolean LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85363Wq(String uid, int i, boolean z) {
        super("InboxDMAvatarLoadHelper", false, null, null, null, 60);
        o.LJIIIZ(uid, "uid");
        this.LJLJLJ = uid;
        this.LJLJLLL = i;
        this.LJLL = z;
    }

    @Override // X.C81929WDl, X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        super.s2(uri, view, th);
        C31A c31a = C31A.LIZ;
        int i = this.LJLJLLL;
        String uid = this.LJLJLJ;
        boolean z = this.LJLL;
        o.LJIIIZ(uid, "uid");
        C31A.LIZIZ(c31a, false, uid, "inbox_old", i, false, true, z);
    }

    @Override // X.C81929WDl, X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        super.U0(uri, view, c2047581v, animatable);
        C31A c31a = C31A.LIZ;
        int i = this.LJLJLLL;
        String uid = this.LJLJLJ;
        boolean z = this.LJLL;
        o.LJIIIZ(uid, "uid");
        C31A.LIZIZ(c31a, true, uid, "inbox_old", i, false, true, z);
    }
}
