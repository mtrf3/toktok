package X;

import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* renamed from: X.Ztm, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91386Ztm<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ C91382Zti LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public C91386Ztm(C91382Zti c91382Zti, String str, boolean z) {
        this.LJLIL = c91382Zti;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        int i;
        String json = (String) obj;
        o.LJIIIZ(json, "json");
        this.LJLIL.getClass();
        if (ActivityStack.isAppBackGround()) {
            i = 2;
        } else {
            i = 1;
        }
        return C91086Zow.LIZJ(this.LJLILLLLZI, true, this.LJLJI, null, i, json, 24);
    }
}
