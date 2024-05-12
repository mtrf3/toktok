package X;

import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215998dn extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuPresentAssem, C43I<? extends C215958dj>, C76800UCe> {
    public static final C215998dn LJLIL = new C215998dn();

    public C215998dn() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuPresentAssem danmakuPresentAssem, C43I<? extends C215958dj> c43i) {
        C215958dj c215958dj;
        DanmakuPresentAssem selectSubscribe = danmakuPresentAssem;
        C43I<? extends C215958dj> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c215958dj = (C215958dj) c43i2.LIZ) != null) {
            C216678et c216678et = selectSubscribe.LLIIIILZ;
            if (c216678et != null) {
                C216678et.LJ(c216678et, 1002, c215958dj);
            }
            c215958dj.LIZ(false);
            selectSubscribe.u4().invalidate();
        }
        return C76800UCe.LIZ;
    }
}
