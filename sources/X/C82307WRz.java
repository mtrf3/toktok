package X;

import Y.ARunnableS37S0100000_1;
import android.graphics.Bitmap;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WRz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82307WRz extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ AtomicBoolean LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C82306WRy LJLJI;
    public final /* synthetic */ Bitmap LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82307WRz(AtomicBoolean atomicBoolean, int i, C82306WRy c82306WRy, Bitmap bitmap, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.LJLIL = atomicBoolean;
        this.LJLILLLLZI = i;
        this.LJLJI = c82306WRy;
        this.LJLJJI = bitmap;
        this.LJLJJL = z;
        this.LJLJJLL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (!this.LJLIL.get()) {
            if (this.LJLILLLLZI == 0) {
                C82306WRy c82306WRy = this.LJLJI;
                Bitmap bitmap = this.LJLJJI;
                o.LJIIIIZZ(bitmap, "bitmap");
                c82306WRy.LJJLL(bitmap, this.LJLJJL, new AqS161S0200000_14(this.LJLJI, (C82306WRy) this.LJLJJLL, (InterfaceC65784Pro<C76800UCe>) 13));
            } else {
                this.LJLJI.LJLJJLL();
                SceneExtensionsKt.LIZIZ(this.LJLJI.LJLIL, new ARunnableS37S0100000_1(this.LJLJJLL, (InterfaceC65784Pro<C76800UCe>) 46));
            }
        }
        return C76800UCe.LIZ;
    }
}
