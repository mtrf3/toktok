package X;

import Y.AgS72S0300000_2;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156226Be extends AbstractC156246Bg<User, C63I> implements C63I {
    public static final C156236Bf LJLLILLLL = new Object() { // from class: X.6Bf
    };
    public final WMH LJLLI;

    public C63I LJJLJ() {
        return this;
    }

    @Override // X.AbstractC156246Bg, X.C6BV, X.C63I
    public void show() {
        if (this.LJLLI.isAdded(LJJLIIIIJ())) {
            return;
        }
        this.LJLLI.add(R.id.l5i, LJJLIIIIJ(), "EditMentionStickerScene");
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        LJJLJ();
        return this;
    }

    @Override // X.AbstractC156246Bg
    public C6BU<User> LJJLI(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        return new C6BU<User>(diContainer, this) { // from class: X.6Ba
            public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZL;
            public final C62822Ol8 LJZ;
            public final C82632Wbs LJZI;

            static {
                TBT tbt = new TBT(C156186Ba.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
                C65352Pkq.LIZ.getClass();
                LJZL = new InterfaceC74236TBo[]{tbt};
            }

            @Override // X.C6BU
            public final int LLJJIII() {
                return 8;
            }

            @Override // X.C6BU
            public final void LLJILJIL() {
                AbstractC156286Bk<T> abstractC156286Bk = this.LJLJJLL;
                AbstractC156316Bn<T> abstractC156316Bn = (AbstractC156316Bn) this.LJZ.getValue();
                if (abstractC156286Bk.LLIIII != null) {
                    return;
                }
                abstractC156286Bk.LLIIII = abstractC156316Bn;
                if (abstractC156316Bn != 0) {
                    abstractC156316Bn.setVisibility(8);
                }
                AbstractC156316Bn<T> abstractC156316Bn2 = abstractC156286Bk.LLIIII;
                if (abstractC156316Bn2 == 0) {
                    return;
                }
                abstractC156316Bn2.setMEditingListener(abstractC156286Bk);
            }

            @Override // X.C6BU
            public final AbstractC156286Bk<User> LLJJ() {
                return new C156356Br(LLJJIJI(), this.LJLIL);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(diContainer, this);
                o.LJIIIZ(diContainer, "diContainer");
                o.LJIIIZ(this, "baseSocialStickerApi");
                this.LJZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 393));
                this.LJZI = UCI.LJI(this.LJLIL, VideoPublishEditModel.class, null);
            }

            @Override // X.InterfaceC1547265k
            public final C10K<C76800UCe> LJJIJIL(InterfaceC153045zY editor, InterfaceC137115Zr compileCallback, InterfaceC88471Ynr<? super String, ? super EnumC43649HBd, String> interfaceC88471Ynr) {
                String LJJJJJ;
                o.LJIIIZ(editor, "editor");
                o.LJIIIZ(compileCallback, "compileCallback");
                if (this.LJLJJLL.LJIILLIIL()) {
                    if (interfaceC88471Ynr == null || (LJJJJJ = interfaceC88471Ynr.invoke("mention_sticker", EnumC43649HBd.MENTION_STICKER)) == null) {
                        InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
                        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJZI.LIZ(this, LJZL[0]);
                        String LJIILL = this.LJLJJLL.LJIILL();
                        o.LJIIIIZZ(LJIILL, "stickerController.stickerPath");
                        LJJJJJ = LIZIZ.LJJJJJ(videoPublishEditModel, LJIILL, "");
                    }
                    C10K<C76800UCe> LJIILLIIL = LLJILJILJ(compileCallback.LJLLL().LIZLLL(), compileCallback.LJLLL().LJI(), editor.LLILZ().width, editor.LLILZ().height, LJJJJJ).LJIILLIIL(new AgS72S0300000_2(editor, this, compileCallback, 2), C10K.LJIIIIZZ);
                    o.LJIIIIZZ(LJIILLIIL, "override fun getInteract…ult(Unit)\n        }\n    }");
                    return LJIILLIIL;
                }
                C10K<C76800UCe> LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
                o.LJIIIIZZ(LJIIIZ, "{\n            Task.forResult(Unit)\n        }");
                return LJIIIZ;
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156226Be(WMH parentScene, C82622Wbi oc) {
        super(parentScene, oc);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(oc, "oc");
        this.LJLLI = parentScene;
    }
}
