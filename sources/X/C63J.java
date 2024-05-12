package X;

import androidx.lifecycle.LiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.nature.EditNatureStickerViewModel;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.63J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63J extends AbstractC29891Fh<InterfaceC147775r3> implements InterfaceC147775r3, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public EditNatureStickerViewModel LJLJJLL;
    public EditCommentStickerViewModel LJLJL;
    public EditDonationStickerViewModel LJLJLJ;

    static {
        TBT tbt = new TBT(C63J.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C63J.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp), C61845OOz.LIZJ(C63J.class, "editHashTagStickerApi", "getEditHashTagStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/hashtag/EditHashTagStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C63J.class, "editMentionStickerApi", "getEditMentionStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/mention/EditMentionStickerApi;", 0, c65351Pkp)};
    }

    public InterfaceC147775r3 LJJLI() {
        return this;
    }

    @Override // X.InterfaceC147775r3
    public void hide() {
        LLFII(false);
    }

    @Override // X.InterfaceC147775r3
    public void show() {
        LLFII(true);
    }

    private final C63H LJJLIIIIJ() {
        return (C63H) this.LJLJJI.LIZ(this, LJLJLLL[2]);
    }

    private final C63I LJJLIIIJILLIZJL() {
        return (C63I) this.LJLJJL.LIZ(this, LJLJLLL[3]);
    }

    private final InterfaceC147865rC LJJLIIIJJI() {
        return (InterfaceC147865rC) this.LJLILLLLZI.LIZ(this, LJLJLLL[0]);
    }

    private final AbstractC42651GoZ LJJLIIIJJIZ() {
        return (AbstractC42651GoZ) this.LJLJI.LIZ(this, LJLJLLL[1]);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        C165626ek LIZIZ;
        C165626ek LIZIZ2;
        C165626ek LIZIZ3;
        super.onCreate();
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), LJJLIIIJJIZ());
        JediViewModel LIZ = LIZIZ.LIZ(EditNatureStickerViewModel.class);
        o.LJIIIIZZ(LIZ, "SAAJediViewModelProvider…kerViewModel::class.java]");
        this.LJLJJLL = (EditNatureStickerViewModel) LIZ;
        LIZIZ2 = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), LJJLIIIJJIZ());
        JediViewModel LIZ2 = LIZIZ2.LIZ(EditCommentStickerViewModel.class);
        o.LJIIIIZZ(LIZ2, "SAAJediViewModelProvider…kerViewModel::class.java]");
        this.LJLJL = (EditCommentStickerViewModel) LIZ2;
        LIZIZ3 = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), LJJLIIIJJIZ());
        JediViewModel LIZ3 = LIZIZ3.LIZ(EditDonationStickerViewModel.class);
        o.LJIIIIZZ(LIZ3, "SAAJediViewModelProvider…kerViewModel::class.java]");
        this.LJLJLJ = (EditDonationStickerViewModel) LIZ3;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC147775r3 getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C63J(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), InterfaceC147865rC.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), C63H.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), C63I.class, null);
    }

    private final void LLFII(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        C63R c63r = (C63R) findReadyComponent(this, C63R.class);
        if (c63r != null) {
            c63r.LJIL(f);
        }
        C63K c63k = (C63K) findReadyComponent(this, C63K.class);
        if (c63k != null) {
            c63k.LJIL(f);
        }
        C63Q c63q = (C63Q) findReadyComponent(this, C63Q.class);
        if (c63q != null) {
            c63q.LJIL(f);
        }
        C63L c63l = (C63L) findReadyComponent(this, C63L.class);
        if (c63l != null) {
            c63l.LJIL(f);
        }
        if (C143125jY.LIZ()) {
            LJJLIIIJJI().Wd0(f);
        }
        EditCommentStickerViewModel editCommentStickerViewModel = this.LJLJL;
        if (editCommentStickerViewModel != null) {
            editCommentStickerViewModel.LJIL(f);
            EditDonationStickerViewModel editDonationStickerViewModel = this.LJLJLJ;
            if (editDonationStickerViewModel != null) {
                ((LiveData) editDonationStickerViewModel.LJLJL.getValue()).setValue(Float.valueOf(f));
                LJJLIIIIJ().LJIL(f);
                LJJLIIIJILLIZJL().LJIL(f);
                EditNatureStickerViewModel editNatureStickerViewModel = this.LJLJJLL;
                if (editNatureStickerViewModel != null) {
                    ((LiveData) editNatureStickerViewModel.LJLJJLL.getValue()).setValue(Float.valueOf(f));
                    return;
                } else {
                    o.LJIJI("natureStickerViewModel");
                    throw null;
                }
            }
            o.LJIJI("donationStickerViewModel");
            throw null;
        }
        o.LJIJI("commentStickerViewModel");
        throw null;
    }
}
