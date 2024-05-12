package X;

import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* renamed from: X.Zth, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91381Zth<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C91382Zti LJLJI;

    public C91381Zth(String str, String str2, C91382Zti c91382Zti) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = c91382Zti;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        int i;
        String json = (String) obj;
        o.LJIIIZ(json, "json");
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        this.LJLJI.getClass();
        if (ActivityStack.isAppBackGround()) {
            i = 2;
        } else {
            i = 1;
        }
        return C91086Zow.LIZJ(str, false, false, str2, i, json, 22);
    }
}
