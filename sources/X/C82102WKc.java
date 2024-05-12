package X;

import Y.AObjectS89S0100000_14;
import Y.IDrS52S0100000_14;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WKc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82102WKc extends AbstractC56012Ht<C82105WKf, C82091WJr> {
    public C57185McP LJLIL;
    public C57185McP LJLILLLLZI;
    public LinearLayout LJLJI;
    public FrameLayout LJLJJI;
    public ImageView LJLJJL;
    public View LJLJJLL;
    public C82036WHo LJLJL;
    public C82037WHp LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public final AObjectS89S0100000_14 LJLLILLLL = new AObjectS89S0100000_14(this, 407);

    public int LLJILJILJ() {
        return 0;
    }

    public final void LLJJJIL() {
        LLJJJJ();
        getUiStates().LJ.LIZIZ.LJIIIZ().observeForever(this.LJLLILLLL);
        getUiStates().LJ.LIZIZ.LJIIL(true);
        LLJJIJIL().LJIIJJI(new IDrS52S0100000_14(this, 3));
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WKw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82105WKf) obj).LJFF;
            }
        }, null, new AqS180S0100000_14(this, 275), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WL3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82105WKf) obj).LJIIJJI;
            }
        }, null, new AqS180S0100000_14(this, 276), 2, null);
    }

    public void LLJJJJ() {
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WKo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82105WKf) obj).LJIIIIZZ;
            }
        }, null, new AqS180S0100000_14(this, 277), 2, null);
    }

    public final C82036WHo LLJILJIL() {
        C82036WHo c82036WHo = this.LJLJL;
        if (c82036WHo != null) {
            return c82036WHo;
        }
        o.LJIJI("adapter");
        throw null;
    }

    public final C82037WHp LLJJ() {
        C82037WHp c82037WHp = this.LJLJLJ;
        if (c82037WHp != null) {
            return c82037WHp;
        }
        o.LJIJI("fixedAdapter");
        throw null;
    }

    public final C57185McP LLJJI() {
        C57185McP c57185McP = this.LJLILLLLZI;
        if (c57185McP != null) {
            return c57185McP;
        }
        o.LJIJI("fixedRegion");
        throw null;
    }

    public final View LLJJIII() {
        View view = this.LJLJJLL;
        if (view != null) {
            return view;
        }
        o.LJIJI("line");
        throw null;
    }

    public final ImageView LLJJIJIIJIL() {
        ImageView imageView = this.LJLJJL;
        if (imageView != null) {
            return imageView;
        }
        o.LJIJI("moreIcon");
        throw null;
    }

    public final C57185McP LLJJIJIL() {
        C57185McP c57185McP = this.LJLIL;
        if (c57185McP != null) {
            return c57185McP;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    public final LinearLayout LLJJJ() {
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("toolbarContainer");
        throw null;
    }

    public final int LLJJIJI() {
        int LIZIZ;
        if (LLJJJ().getHeight() > 0) {
            LIZIZ = LLJJJ().getHeight();
        } else {
            LIZIZ = ((C81184Vtc.LIZIZ(requireSceneContext()) - C81184Vtc.LIZJ(requireSceneContext())) - this.LJLJLLL) - this.LJLL;
        }
        return LIZIZ - LLJILJILJ();
    }

    @Override // X.WM7
    public void onDestroy() {
        super.onDestroy();
        getUiStates().LJ.LIZIZ.LJIIL(false);
        getUiStates().LJ.LIZIZ.LJIIIZ().removeObserver(this.LJLLILLLL);
    }

    public final void LLJJL(String str) {
        if (getUiStates().LJ.LIZ.getPanelType() == 1) {
            ShortVideoContext shortVideoContext = getUiStates().LJ.LJIIIZ;
            if (shortVideoContext != null) {
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("creation_id", shortVideoContext.LJI());
                c145995oB.LJI("content_type", shortVideoContext.LIZLLL().getContentType());
                c145995oB.LJI("content_source", shortVideoContext.LIZLLL().getContentSource());
                c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
                c145995oB.LJI("enter_from", "video_shoot_page");
                GXR.LIZ(str, c145995oB.LIZ);
                return;
            }
            return;
        }
        VideoPublishEditModel videoPublishEditModel = getUiStates().LJ.LJIIJ;
        if (videoPublishEditModel == null) {
            return;
        }
        C145995oB c145995oB2 = new C145995oB();
        c145995oB2.LJI("creation_id", videoPublishEditModel.getCreationId());
        c145995oB2.LJI("content_type", videoPublishEditModel.getAvetParameter().getContentType());
        c145995oB2.LJI("content_source", videoPublishEditModel.getAvetParameter().getContentSource());
        c145995oB2.LJI("shoot_way", videoPublishEditModel.mShootWay);
        c145995oB2.LJI("enter_from", "video_edit_page");
        GXR.LIZ(str, c145995oB2.LIZ);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public void onActivityCreated(Bundle bundle) {
        float LIZIZ;
        float LIZIZ2;
        super.onActivityCreated(bundle);
        if (getUiStates().LJ.LIZ.getPanelType() == 1) {
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            LIZIZ = C74275TDb.LIZIZ(requireSceneContext, 32.0f);
        } else {
            Context requireSceneContext2 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
            LIZIZ = C74275TDb.LIZIZ(requireSceneContext2, 24.0f);
        }
        this.LJLJLLL = (int) LIZIZ;
        if (getUiStates().LJ.LIZ.getPanelType() == 1) {
            Context requireSceneContext3 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext3, "requireSceneContext()");
            LIZIZ2 = C74275TDb.LIZIZ(requireSceneContext3, 170.0f);
        } else {
            Context requireSceneContext4 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext4, "requireSceneContext()");
            LIZIZ2 = C74275TDb.LIZIZ(requireSceneContext4, 100.0f);
        }
        int i = (int) LIZIZ2;
        this.LJLLI = i;
        this.LJLL = i;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (getUiStates().LJ.LIZ.getPanelType() == 1) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.crv, container, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cs7, container, false);
        }
        View findViewById = LLLLIILL.findViewById(R.id.g7k);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.load_more_container)");
        this.LJLJJI = (FrameLayout) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.k4h);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.slide_region)");
        this.LJLIL = (C57185McP) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.dbj);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.fixed_region)");
        this.LJLILLLLZI = (C57185McP) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.fs0);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.line_between)");
        this.LJLJJLL = findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.ldk);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.toolbar_more_icon)");
        this.LJLJJL = (ImageView) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.lcv);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.toolbar_container)");
        this.LJLJI = (LinearLayout) findViewById6;
        return (ViewGroup) LLLLIILL;
    }
}
