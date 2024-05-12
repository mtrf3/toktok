package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5rB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147855rB extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C62822Ol8 LJLJL;

    static {
        TBT tbt = new TBT(C147855rB.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C147855rB.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLJLJ[0]);
        return new WI1(videoPublishEditModel) { // from class: X.60d
            public final int LJIIIZ;
            public final C6MP LJIIJ;

            @Override // X.WI1
            public final WI0 LIZJ() {
                return new WI0(null, this.LJIIIZ, false, 5);
            }

            @Override // X.WI1
            public final int LJFF() {
                return C6UX.LIZ();
            }

            @Override // X.WI1
            public final int LJI() {
                return C6UX.LIZ();
            }

            @Override // X.WI1
            public final int LJII() {
                return C6UX.LIZIZ();
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return this.LJIIJ;
            }

            {
                o.LJIIIZ(videoPublishEditModel, "model");
                C151975xp.LIZ(videoPublishEditModel);
                this.LJIIIZ = 65;
                this.LJIIJ = C6MP.ADD_YOURS;
            }
        };
    }

    @Override // X.WJB
    public final void LJFF() {
        C82632Wbs c82632Wbs = this.LJLJJLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLJLJ;
        InterfaceC139535dl fB = ((InterfaceC147865rC) c82632Wbs.LIZ(this, interfaceC74236TBoArr[1])).fB();
        if (fB != null) {
            C139545dm.LIZ(fB, null, null, 3);
        }
        AnonymousClass643 fe0 = ((InterfaceC147865rC) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[1])).fe0();
        if (fe0 != null) {
            fe0.ft0("edit_page_entrance");
        }
        C161226Uk.LIZLLL(this.LJLJJL.LIZ(this, interfaceC74236TBoArr[0]));
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        return ((Boolean) this.LJLJL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C147855rB(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC147865rC.class, null);
        this.LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 675));
    }
}
