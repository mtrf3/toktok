package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5g1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140935g1 extends AbstractC29891Fh<InterfaceC145815nt> implements InterfaceC145815nt, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC145815nt LJLJJI;

    static {
        TBT tbt = new TBT(C140935g1.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C140935g1.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC145815nt
    public void Ye(AbstractC147425qU operation, InterfaceC153045zY interfaceC153045zY) {
        o.LJIIIZ(operation, "operation");
    }

    private final VideoPublishEditModel LJJLI() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LJLJJL[0]);
    }

    private final AbstractC42651GoZ LJJLIIIIJ() {
        return (AbstractC42651GoZ) this.LJLJI.LIZ(this, LJLJJL[1]);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC145815nt getApiComponent() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C140935g1(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJLJJI = this;
    }

    @Override // X.InterfaceC145815nt
    public void ap(String reason) {
        o.LJIIIZ(reason, "reason");
        C60903NvH.LJIIJJI().getPublishService().LJJIZ(LJJLI(), reason);
    }

    @Override // X.InterfaceC145815nt
    public void wj0(InterfaceC153045zY interfaceC153045zY) {
        C60903NvH.LJIIJJI().getPublishService().LJIJ(LJJLIIIIJ(), C78688UuS.LJIJJ(this), LJJLI(), interfaceC153045zY);
    }

    @Override // X.InterfaceC145815nt
    public void x30(Intent intent, InterfaceC153045zY interfaceC153045zY, boolean z) {
        C60903NvH.LJIIJJI().getPublishService().LJIJJ(LJJLI(), intent, interfaceC153045zY, z);
    }
}
