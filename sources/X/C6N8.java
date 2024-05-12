package X;

import android.view.View;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6N8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6N8 extends AbstractC29891Fh<InterfaceC148865so> implements InterfaceC148865so, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final C82622Wbi LJLIL;
    public final InterfaceC148865so LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C29901Fi<C76800UCe> LJLJL;
    public final LiveEvent<C76800UCe> LJLJLJ;
    public final C29901Fi<C76800UCe> LJLJLLL;
    public final LiveEvent<C76800UCe> LJLL;
    public final C29901Fi<C76800UCe> LJLLI;
    public final LiveEvent<C76800UCe> LJLLILLLL;

    static {
        TBT tbt = new TBT(C6N8.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C6N8.class, "judge", "getJudge()Lcom/ss/android/ugc/gamora/editor/exit/IJudgeHasEditedForImageMode;", 0, c65351Pkp), C61845OOz.LIZJ(C6N8.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC148865so
    public void Zd() {
    }

    private final C6N7 LJJLIIIIJ() {
        return (C6N7) this.LJLJJLL.getValue();
    }

    private final C6NE LJJLIIIJJI() {
        return (C6NE) this.LJLJJI.LIZ(this, LJLLJ[1]);
    }

    public final VideoPublishEditModel LJJLIIIJILLIZJL() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLLJ[0]);
    }

    public final AbstractC42651GoZ LJJLIIIJJIZ() {
        return (AbstractC42651GoZ) this.LJLJJL.LIZ(this, LJLLJ[2]);
    }

    @Override // X.InterfaceC148865so
    public void Vd0() {
        this.LJLJLLL.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC148865so
    public boolean D1() {
        return LJJLIIIJJI().D1();
    }

    public final void LJJLI() {
        LJJLIIIJILLIZJL().creativeModel.draftInfoModel.fromDraftPopup = true;
        this.LJLJL.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC148865so
    public boolean jw() {
        C6NJ c6nj = LJJLIIIIJ().LJIIJ;
        if (c6nj != null && c6nj.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC148865so
    public LiveEvent<C76800UCe> e2() {
        return this.LJLJLJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC148865so getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC148865so
    public LiveEvent<C76800UCe> o70() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC148865so
    public LiveEvent<C76800UCe> ve0() {
        return this.LJLL;
    }

    public C6N8(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), C6NE.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 376));
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLJL = c29901Fi;
        this.LJLJLJ = c29901Fi;
        C29901Fi<C76800UCe> c29901Fi2 = new C29901Fi<>();
        this.LJLJLLL = c29901Fi2;
        this.LJLL = c29901Fi2;
        C29901Fi<C76800UCe> c29901Fi3 = new C29901Fi<>();
        this.LJLLI = c29901Fi3;
        this.LJLLILLLL = c29901Fi3;
    }

    @Override // X.InterfaceC148865so
    public boolean yV(View view) {
        o.LJIIIZ(view, "view");
        LJJLIIIIJ().LIZIZ = view;
        LJJLIIIJJI().LIZ();
        if (!LJJLIIIJILLIZJL().mIsFromDraft) {
            LJJLIIIIJ().LJFF(R.raw.icon_trash_bin, R.string.e32, new AqS152S0100000_2(this, 377), new AqS152S0100000_2(this, 378));
            return true;
        }
        if (!LJJLIIIJJI().D1()) {
            this.LJLJLLL.LJII(C76800UCe.LIZ);
            return true;
        }
        LJJLIIIIJ().LJFF(R.raw.icon_x_mark_circle, R.string.e2u, new AqS152S0100000_2(this, 379), new AqS152S0100000_2(this, 380));
        return true;
    }

    @Override // X.InterfaceC148865so
    public void Rd0(boolean z, String saveScene) {
        o.LJIIIZ(saveScene, "saveScene");
        LJJLIIIIJ().LIZLLL(z, "clickPopupFromEdit");
    }
}
