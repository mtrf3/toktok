package X;

import java.util.concurrent.Callable;

/* renamed from: X.La3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC54491La3<V> implements Callable {
    public final /* synthetic */ Long LJLIL;
    public final /* synthetic */ Long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public CallableC54491La3(Long l, Long l2, boolean z, int i, String str) {
        this.LJLIL = l;
        this.LJLILLLLZI = l2;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j;
        EnumC54493La5 enumC54493La5;
        C188727au c188727au = new C188727au();
        Long l = this.LJLIL;
        long j2 = -1;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        c188727au.LJ(j, "time_from_launch_to_following_feed");
        Long l2 = this.LJLILLLLZI;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        c188727au.LJ(j2, "duration");
        if (this.LJLJI) {
            enumC54493La5 = EnumC54493La5.SUCCESS;
        } else {
            enumC54493La5 = EnumC54493La5.FAIL;
        }
        c188727au.LJFF(enumC54493La5, "result");
        c188727au.LJIIIZ("status_code", String.valueOf(this.LJLJJI));
        c188727au.LJIIIZ("status_msg", this.LJLJJL);
        FMX.LJIIL("preload_follow_feed_request", c188727au.LIZ);
        return C76800UCe.LIZ;
    }
}
