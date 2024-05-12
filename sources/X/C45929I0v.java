package X;

import Y.AObjectS86S0100000_7;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.gamora.editor.EditCommentStickerState;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I0v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45929I0v extends I1J {
    public final WMH LLILZIL;
    public final int LLILZLL;
    public final VideoPublishEditModel LLIZ;
    public boolean LLIZLLLIL;
    public final C5H3 LLJ;
    public EditCommentStickerViewModel LLJI;
    public boolean LLJIJIL;

    private final InterfaceC143655kP LJLJJL() {
        return (InterfaceC143655kP) this.LLJ.getValue();
    }

    @Override // X.I1J, X.InterfaceC81454Vxy
    public void W9() {
        if (!this.LLJIJIL && !I20.LIZ()) {
            x00(C45933I0z.LJLIL);
            this.LLJIJIL = true;
        }
        LJLJJL().U2(false, false, false);
        EditCommentStickerViewModel editCommentStickerViewModel = this.LLJI;
        if (editCommentStickerViewModel != null) {
            editCommentStickerViewModel.LJIL(0.3137255f);
            super.W9();
        } else {
            o.LJIJI("commentStickerViewModel");
            throw null;
        }
    }

    @Override // X.I1J, X.InterfaceC81454Vxy
    public void s2() {
        if (!this.LLJIJIL && I20.LIZ()) {
            x00(C45933I0z.LJLIL);
            this.LLIIL.setValue(Boolean.TRUE);
            this.LLJIJIL = true;
        }
    }

    @Override // X.I1J, X.InterfaceC81454Vxy
    public void hidePanel() {
        LJLJJL().U2(true, false, true);
        EditCommentStickerViewModel editCommentStickerViewModel = this.LLJI;
        if (editCommentStickerViewModel != null) {
            editCommentStickerViewModel.LJIL(1.0f);
            super.hidePanel();
        } else {
            o.LJIJI("commentStickerViewModel");
            throw null;
        }
    }

    @Override // X.I1J, X.AbstractC29891Fh
    public void onCreate() {
        C165626ek LIZIZ;
        super.onCreate();
        LIZIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(r0), this.LLILZIL);
        JediViewModel LIZ = LIZIZ.LIZ(EditCommentStickerViewModel.class);
        o.LJIIIIZZ(LIZ, "SAAJediViewModelProvider…kerViewModel::class.java]");
        EditCommentStickerViewModel editCommentStickerViewModel = (EditCommentStickerViewModel) LIZ;
        this.LLJI = editCommentStickerViewModel;
        BaseJediViewModel.Lv0(editCommentStickerViewModel, this, new TBT() { // from class: X.6Az
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditCommentStickerState) obj).getHasCommentSticker();
            }
        }, new AqS173S0100000_7(this, 314));
        LJJLIIJ().LJLLLLLL.LIZLLL(this, new AObjectS86S0100000_7(this, 247));
        ee().LIZLLL(this, new AObjectS86S0100000_7(this, 248));
        gk0().LIZLLL(this, new AObjectS86S0100000_7(this, 249));
    }

    @Override // X.I1J
    public int LJJLJLI() {
        return this.LLILZLL;
    }

    @Override // X.I1J
    public void LJJLIIIIJ(CommentVideoModel selectedStickerModel) {
        C0IB<C63K> Pq0;
        C63K LIZ;
        o.LJIIIZ(selectedStickerModel, "selectedStickerModel");
        InterfaceC142515iZ interfaceC142515iZ = (InterfaceC142515iZ) getDiContainer().LJIIIIZZ(null, InterfaceC142515iZ.class);
        if (interfaceC142515iZ != null && (Pq0 = interfaceC142515iZ.Pq0()) != null && (LIZ = Pq0.LIZ()) != null && LIZ.LJIJJLI()) {
            i50(selectedStickerModel, L10().getTabName());
            qd0(2);
            C26227ARb c26227ARb = new C26227ARb(C78688UuS.LJJIII(this));
            c26227ARb.LJFF(C78688UuS.LJJIII(this).getString(R.string.pqn));
            c26227ARb.LIZIZ(C78688UuS.LJJIII(this).getString(R.string.pqm));
            UC0.LIZJ(c26227ARb, new AqS111S0300000_7(selectedStickerModel, this, LIZ, 27));
            c26227ARb.LJI().LIZLLL();
            return;
        }
        super.LJJLIIIIJ(selectedStickerModel);
    }

    @Override // X.I1J
    public void LJJLIIIJILLIZJL(QaStruct selectedStickerModel) {
        C0IB<C63K> Pq0;
        o.LJIIIZ(selectedStickerModel, "selectedStickerModel");
        C63K c63k = null;
        InterfaceC142515iZ interfaceC142515iZ = (InterfaceC142515iZ) getDiContainer().LJIIIIZZ(null, InterfaceC142515iZ.class);
        if (interfaceC142515iZ != null && (Pq0 = interfaceC142515iZ.Pq0()) != null && (c63k = Pq0.LIZ()) != null && c63k.LJIJJLI()) {
            c63k.LJJIII();
            c63k.I4(selectedStickerModel);
            hidePanel();
        } else {
            if (this.LLIZLLLIL) {
                C26227ARb c26227ARb = new C26227ARb(C78688UuS.LJJIII(this));
                c26227ARb.LJFF(C78688UuS.LJJIII(this).getString(R.string.pqn));
                c26227ARb.LIZIZ(C78688UuS.LJJIII(this).getString(R.string.pqm));
                UC0.LIZJ(c26227ARb, new AqS111S0300000_7(this, c63k, selectedStickerModel, 28));
                c26227ARb.LJI().LIZLLL();
                return;
            }
            if (c63k != null) {
                c63k.I4(selectedStickerModel);
            }
            hidePanel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45929I0v(C82622Wbi objectContainer, WMH parentScene, int i, VideoPublishEditModel mVideoPublishEditModel) {
        super(objectContainer, parentScene, i, mVideoPublishEditModel.commentVideoModel, C6IE.EDIT_PAGE_PANEL, new I1L(null, mVideoPublishEditModel, false, 1));
        o.LJIIIZ(objectContainer, "objectContainer");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(mVideoPublishEditModel, "mVideoPublishEditModel");
        this.LLILZIL = parentScene;
        this.LLILZLL = i;
        this.LLIZ = mVideoPublishEditModel;
        this.LLJ = C269113v.LIZ(this, InterfaceC143655kP.class);
        mVideoPublishEditModel.getCreationId();
    }
}
