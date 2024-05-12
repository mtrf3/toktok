package X;

import Y.ARunnableS29S0200000_10;
import android.widget.FrameLayout;
import com.bytedance.ies.bullet.service.popup.BulletPopUpFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Nnq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60442Nnq extends AbstractC40529FvR {
    public final /* synthetic */ BulletPopUpFragment LIZ;

    @Override // X.AbstractC40529FvR, X.InterfaceC60298NlW
    public final void LJFF(C60292NlQ instance) {
        o.LJIIJ(instance, "instance");
    }

    public C60442Nnq(BulletPopUpFragment bulletPopUpFragment) {
        this.LIZ = bulletPopUpFragment;
    }

    @Override // X.InterfaceC60298NlW
    public final void LIZIZ(C60292NlQ api) {
        o.LJIIJ(api, "api");
        BulletPopUpFragment bulletPopUpFragment = this.LIZ;
        FrameLayout Gl = bulletPopUpFragment.Gl();
        if (Gl != null) {
            Gl.post(new ARunnableS29S0200000_10(bulletPopUpFragment, api, 0));
        }
    }
}
