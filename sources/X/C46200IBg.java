package X;

import Y.AfS59S0100000_7;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler;
import com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.IBg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46200IBg extends AbstractC29891Fh<InterfaceC46211IBr> implements InterfaceC46211IBr, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC46211IBr LJLILLLLZI;
    public final C29901Fi<AbstractC82213WOj> LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final ActivityC45651qj LJLJJL;
    public final ShortVideoContext LJLJJLL;
    public F4V LJLJL;
    public final C5H3 LJLJLJ;
    public final C73318Sq2 LJLJLLL;

    static {
        TBT tbt = new TBT(C46200IBg.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt};
    }

    private final InterfaceC82434WWw LJJLI() {
        return (InterfaceC82434WWw) this.LJLJLJ.getValue();
    }

    public final I9W LJJLIIIIJ() {
        return (I9W) this.LJLJJI.LIZ(this, LJLL[0]);
    }

    @Override // X.InterfaceC46211IBr
    public boolean Qa0() {
        View findViewById = this.LJLJJL.findViewById(R.id.fim);
        if (findViewById == null || findViewById.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        ViewModelProvider of;
        super.onCreate();
        WM7 wm7 = (WM7) getDiContainer().LJIIIIZZ(null, AbstractC42651GoZ.class);
        if (wm7 != null) {
            of = C165706es.LJIIIIZZ(wm7, null, null, 6);
        } else {
            of = ViewModelProviders.of(this.LJLJJL);
        }
        C78999UzT.LJFF(LJJLIIIIJ().ua0().LJJJLIIL(new AfS59S0100000_7((GameResultViewModel) of.get(GameResultViewModel.class), 20), C73982T1u.LJLIL), this.LJLJLLL);
        C37143Ehv LIZIZ = LJJLIIIIJ().LLLLL().LJJJJLL().LIZJ().LIZIZ();
        LIZIZ.LIZLLL(C46199IBf.LJLIL);
        ShortVideoContext shortVideoContext = this.LJLJJLL;
        if (shortVideoContext.LJJJI() || CommentUtils.isDataValid(shortVideoContext.commentVideoModel) || shortVideoContext.cameraComponentModel.isRetakeMode || shortVideoContext.LJJIJIIJI() || shortVideoContext.LJJIJIIJIL()) {
            LIZIZ.LIZ(new IBX());
        }
        LIZIZ.LIZIZ();
        InterfaceC46204IBk LLZL = LJJLIIIIJ().LLZL();
        LLZL.LIZLLL(new C46240ICu(this.LJLJJL, LJJLIIIIJ().sF(), this.LJLJJLL, new AqS173S0100000_7(LLZL, 202)));
        InterfaceC46217IBx interfaceC46217IBx = (InterfaceC46217IBx) getDiContainer().LJIIIIZZ(null, InterfaceC46217IBx.class);
        if (interfaceC46217IBx == null) {
            interfaceC46217IBx = new C82437WWz(getDiContainer());
        }
        GameStickerHandler LIZ = interfaceC46217IBx.LIZ(LJJLIIIIJ(), LJJLI());
        this.LJLJL = LIZ;
        if (LIZ != null) {
            LJJLIIIIJ().P2(LIZ);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LJLJLLL.LIZLLL();
        F4V f4v = this.LJLJL;
        if (f4v != null) {
            LJJLIIIIJ().g1(f4v);
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC46211IBr getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC46211IBr
    public /* bridge */ /* synthetic */ LiveEvent t40() {
        return this.LJLJI;
    }

    public C46200IBg(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = new C29901Fi<>();
        this.LJLJJI = UCI.LJI(getDiContainer(), I9W.class, null);
        this.LJLJJL = (ActivityC45651qj) getDiContainer().LJ(ActivityC45651qj.class, null);
        this.LJLJJLL = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 392));
        this.LJLJLLL = new C73318Sq2();
    }
}
