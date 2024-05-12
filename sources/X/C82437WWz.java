package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler;
import kotlin.jvm.internal.AqS103S0300000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WWz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82437WWz implements InterfaceC46217IBx, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final C82622Wbi LJLIL;
    public final C29S LJLILLLLZI;
    public final InterfaceC82086WJm LJLJI;
    public final C82632Wbs LJLJJI;

    static {
        TBT tbt = new TBT(C82437WWz.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C82437WWz(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = (C29S) diContainer.LJ(C29S.class, null);
        this.LJLJI = (InterfaceC82086WJm) diContainer.LJ(InterfaceC82086WJm.class, null);
        this.LJLJJI = UCI.LJI(diContainer, I3X.class, null);
    }

    @Override // X.InterfaceC46217IBx
    public final GameStickerHandler LIZ(I9W stickerApiComponent, InterfaceC82434WWw listener) {
        o.LJIIIZ(stickerApiComponent, "stickerApiComponent");
        o.LJIIIZ(listener, "listener");
        return new GameStickerHandler((LifecycleOwner) this.LJLIL.LJ(LifecycleOwner.class, null), C221108m2.LIZIZ(new AqS103S0300000_14(this, stickerApiComponent, listener, 4)), new AqS164S0100000_14(stickerApiComponent, 356));
    }
}
