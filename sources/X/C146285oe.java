package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5oe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146285oe extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLJI;
    public final C148195rj LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C62822Ol8 LJLJL;

    static {
        TBT tbt = new TBT(C146285oe.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C146285oe.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return new C148185ri();
    }

    @Override // X.WJB
    public final void LJFF() {
        if (((C63C) this.LJLJL.getValue()).LLL().EC()) {
            ((InterfaceC153275zv) this.LJLJJL.LIZ(this, LJLJLJ[0])).b2(3, false);
        } else {
            ((C63C) this.LJLJL.getValue()).LLLL();
            H8F.LJJIIZI((VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLJLJ[1]), "click_button", 0, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        return C151965xo.LIZJ((VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLJLJ[1]));
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    public C146285oe(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = diContainer;
        this.LJLJJI = config;
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC153275zv.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 689));
    }
}
