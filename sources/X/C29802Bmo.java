package X;

import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.Bmo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29802Bmo<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ UserLevelViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI = "enter_room";
    public final /* synthetic */ C29800Bmm LJLJI;
    public final /* synthetic */ long LJLJJI;

    public C29802Bmo(long j, C29800Bmm c29800Bmm, UserLevelViewModel userLevelViewModel) {
        this.LJLIL = userLevelViewModel;
        this.LJLJI = c29800Bmm;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        C28467BFf<m> it = (C28467BFf) obj;
        o.LJIIIZ(it, "it");
        return this.LJLIL.gv0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, it);
    }
}
