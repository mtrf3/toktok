package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.5vg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150645vg implements InterfaceC150695vl, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final C150635vf LJLJI = new C150635vf(this);
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;

    static {
        TBT tbt = new TBT(C150645vg.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C150645vg.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C150645vg.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C150645vg.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC150695vl
    public final void refresh() {
    }

    public final InterfaceC153185zm LIZ() {
        return (InterfaceC153185zm) this.LJLJJL.LIZ(this, LJLJJLL[3]);
    }

    public final InterfaceC153275zv LIZIZ() {
        return (InterfaceC153275zv) this.LJLJJI.LIZ(this, LJLJJLL[2]);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C150645vg(ActivityC45651qj activityC45651qj, C82622Wbi c82622Wbi) {
        this.LJLIL = c82622Wbi;
        this.LJLILLLLZI = UCI.LJI(c82622Wbi, VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJI(c82622Wbi, InterfaceC153275zv.class, null);
        this.LJLJJL = UCI.LJI(c82622Wbi, InterfaceC153185zm.class, null);
    }

    @Override // X.InterfaceC150695vl
    public final void U2(boolean z, boolean z2, boolean z3) {
        InterfaceC140385f8 interfaceC140385f8;
        MutableLiveData<Boolean> A10;
        if (!z2 && (interfaceC140385f8 = (InterfaceC140385f8) this.LJLJI.LIZ(this, LJLJJLL[1])) != null && (A10 = interfaceC140385f8.A10()) != null) {
            A10.setValue(Boolean.valueOf(z3));
        }
        LIZIZ().ot(z);
        LIZ().xD(z);
        LIZIZ().r3();
        LIZ().yd(z);
        if (((BaseShortVideoContext) this.LJLILLLLZI.LIZ(this, LJLJJLL[0])).mIsFromDraft && !C153255zt.LIZ()) {
            LIZ().V10(z);
        }
        LIZIZ().fg0(1, true);
        LIZIZ().b2(5, z);
        LIZ().du(z);
        LIZIZ().b2(1, z);
        LIZIZ().b2(4, z);
        LIZIZ().b2(3, z);
    }
}
