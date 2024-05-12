package X;

import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.ui.ImageEditRootScene$saveDraft$1$1", f = "ImageEditRootScene.kt", l = {1698}, m = "invokeSuspend")
/* renamed from: X.5va, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150585va extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ImageEditRootScene LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C150585va(ImageEditRootScene imageEditRootScene, boolean z, InterfaceC67352kd<? super C150585va> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = imageEditRootScene;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C150585va(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        GI1 gi1;
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            VideoPublishEditModel videoPublishEditModel = this.LJLILLLLZI.LJLLJ;
            if (videoPublishEditModel != null) {
                this.LJLIL = 1;
                Object LJI = XKX.LJI(C78613UtF.LIZJ, new C150775vt(videoPublishEditModel, null), this);
                if (LJI != obj2) {
                    LJI = C76800UCe.LIZ;
                }
                if (LJI == obj2) {
                    return obj2;
                }
            } else {
                o.LJIJI("mModel");
                throw null;
            }
        }
        C60903NvH.LJIIJJI().getPublishService().LJIJI();
        VideoPublishEditModel videoPublishEditModel2 = this.LJLILLLLZI.LJLLJ;
        if (videoPublishEditModel2 != null) {
            C41021G8b c41021G8b = new C41021G8b(videoPublishEditModel2, new GLI("ImageEditRootScene", 5));
            if (this.LJLJI) {
                gi1 = this.LJLILLLLZI.LLJILLL;
            } else {
                gi1 = this.LJLILLLLZI.LLJILJILJ;
            }
            GSL.LJIILJJIL(c41021G8b, gi1);
            return C76800UCe.LIZ;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
