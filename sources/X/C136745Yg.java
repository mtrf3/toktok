package X;

import Y.AObjectS84S0100000_2;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS0S0120000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136745Yg extends AbstractC29891Fh<C5LI> implements C5LI, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final C29901Fi<Boolean> LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;

    static {
        TBT tbt = new TBT(C136745Yg.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C136745Yg.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C136745Yg.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0, c65351Pkp), C61845OOz.LIZJ(C136745Yg.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp)};
    }

    public C5LI LJJLI() {
        return this;
    }

    private final InterfaceC153275zv LJJLIIIJILLIZJL() {
        return (InterfaceC153275zv) this.LJLJJLL.LIZ(this, LJLJL[3]);
    }

    private final InterfaceC136115Vv LJJLIIIJJI() {
        return (InterfaceC136115Vv) this.LJLJJL.LIZ(this, LJLJL[2]);
    }

    public final InterfaceC143655kP LJJLIIIIJ() {
        return (InterfaceC143655kP) this.LJLILLLLZI.LIZ(this, LJLJL[0]);
    }

    public final VideoPublishEditModel LJJLIIIJJIZ() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJL[1]);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        boolean z;
        InterfaceC136115Vv LJJLIIIJJI;
        LiveEvent<C76800UCe> id;
        ActivityC45651qj activityC45651qj;
        super.onCreate();
        String str = null;
        Bundle bundle = ((WM7) getDiContainer().LJ(AbstractC42651GoZ.class, null)).mArguments;
        if (bundle != null) {
            str = bundle.getString("editor_pro_anchor_type");
        }
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!LJJLIIIJJIZ().getEditorProModel().getFromEditorProEntranceInAlbum() || H7R.LJJJI(LJJLIIIJJIZ())) {
            z2 = true;
        }
        if (C132385Hm.LJII == null) {
            Activity LJIJJ = C78688UuS.LJIJJ(this);
            if ((LJIJJ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIJJ) != null) {
                C132385Hm.LJII = new C156916Dv(activityC45651qj, LJJLIIIJJIZ(), LJJLIIIJILLIZJL());
                String LIZJ = C77339UWx.LIZJ();
                C156916Dv c156916Dv = C132385Hm.LJII;
                if (c156916Dv != null) {
                    c156916Dv.LJ = Boolean.valueOf(!C135125Sa.LIZJ(LIZJ));
                }
            }
        }
        C156916Dv c156916Dv2 = C132385Hm.LJII;
        if (c156916Dv2 != null) {
            c156916Dv2.LIZIZ(new AqS0S0120000_2(this, z, z2, 0));
        }
        if (!z && (LJJLIIIJJI = LJJLIIIJJI()) != null && (id = LJJLIIIJJI.id()) != null) {
            id.LIZLLL(this, new AObjectS84S0100000_2(this, 51));
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C5LI getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.C5LI
    public LiveEvent<Boolean> kf0() {
        return this.LJLJJI;
    }

    public C136745Yg(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = new C29901Fi<>();
        this.LJLJJL = UCI.LJII(getDiContainer(), InterfaceC136115Vv.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC153275zv.class, null);
    }

    @Override // X.C5LI
    public void ms(boolean z) {
        this.LJLJJI.LJII(Boolean.valueOf(z));
    }
}
