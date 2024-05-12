package X;

import Y.ACListenerS27S0100000_7;
import Y.AObjectS84S0100000_2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.61s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1537661s extends WMH implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLIL;
    public final java.util.Map<Integer, C1536261e> LJLILLLLZI;
    public final C82631Wbr LJLJI;
    public final C82631Wbr LJLJJI;
    public final C82632Wbs LJLJJL;
    public LinearLayout LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public ViewGroup LJLJLLL;
    public SY4 LJLL;
    public View LJLLI;

    static {
        TBT tbt = new TBT(C1537661s.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C1537661s.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1537661s.class, "replaceMusicToolbarApi", "getReplaceMusicToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/ReplaceMusicToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1537661s.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C1537661s.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    public final void LLJILJIL() {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().getClass();
        Intent intent = new Intent(this.mActivity, (Class<?>) SplashActivity.class);
        intent.addFlags(603979776);
        C16880lQ.LIZIZ(requireActivity(), intent);
    }

    public final VideoPublishEditModel LLJILJILJ() {
        return (VideoPublishEditModel) this.LJLJLJ.LIZ(this, LJLLILLLL[4]);
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJL.LIZ(this, LJLLILLLL[3]);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C1537661s(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = new LinkedHashMap();
        this.LJLJI = UCI.LJII(diContainer, InterfaceC153275zv.class, null);
        this.LJLJJI = UCI.LJII(diContainer, InterfaceC153185zm.class, null);
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC145315n5.class, null);
        this.LJLJL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
    }

    public static void LLJJ(C1536261e c1536261e) {
        ViewGroup.LayoutParams iconLayoutParams = c1536261e.getIconLayoutParams();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZJ = iconLayoutParams.height;
        c2068389v.LIZIZ = iconLayoutParams.width;
        c2068389v.LIZ = R.raw.icon_music_note_s_alt;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        Context context = c1536261e.getContext();
        o.LJIIIIZZ(context, "item.context");
        c1536261e.setIcon(c2068389v.LIZ(context));
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        SY4 sy4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.aeg);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.back)");
        this.LJLLI = requireViewById;
        if (this.mParentScene instanceof C147295qH) {
            ViewGroup.LayoutParams layoutParams = requireViewById.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C7MY.LIZIZ(32);
            View view2 = this.LJLLI;
            if (view2 != null) {
                view2.setLayoutParams(marginLayoutParams);
            } else {
                o.LJIJI("backView");
                throw null;
            }
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
        if (MEX.LJ() || H7R.LJJJJL(LLJILJILJ())) {
            View requireViewById2 = requireViewById(R.id.hyn);
            o.LJIIIIZZ(requireViewById2, "{\n            requireVie…ost_button_new)\n        }");
            sy4 = (SY4) requireViewById2;
        } else {
            View requireViewById3 = requireViewById(R.id.hym);
            o.LJIIIIZZ(requireViewById3, "{\n            requireVie…id.post_button)\n        }");
            sy4 = (SY4) requireViewById3;
        }
        this.LJLL = sy4;
        if (C42000Ge4.LJIIL(LLJILJILJ())) {
            SY4 sy42 = this.LJLL;
            if (sy42 != null) {
                sy42.setText(R.string.jkq);
            } else {
                o.LJIJI("postButton");
                throw null;
            }
        }
        SY4 sy43 = this.LJLL;
        if (sy43 != null) {
            sy43.setVisibility(0);
            View view3 = this.LJLLI;
            if (view3 != null) {
                C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.61u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View it) {
                        o.LJIIIIZZ(it, "it");
                        AbstractC42651GoZ LJIIL = C78840Uwu.LJIIL(it);
                        if (LJIIL != null) {
                            LJIIL.LLJJI();
                        }
                    }
                }, view3);
                LLJILJILJ().musicVolume = 0.0f;
                SY4 sy44 = this.LJLL;
                if (sy44 != null) {
                    C16880lQ.LJJIZ(sy44, new ACListenerS27S0100000_7(this, 79));
                    if (!C42000Ge4.LJIIL(LLJILJILJ())) {
                        getEditPreviewApi().Kh().observe(this, new AObjectS84S0100000_2(this, 227));
                    }
                    C82632Wbs c82632Wbs = this.LJLJJL;
                    InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLILLLL;
                    ((InterfaceC145315n5) c82632Wbs.LIZ(this, interfaceC74236TBoArr[2])).Lb().LIZLLL(this, new AObjectS84S0100000_2(this, 228));
                    ((InterfaceC145315n5) this.LJLJJL.LIZ(this, interfaceC74236TBoArr[2])).pF().LIZLLL(this, new AObjectS84S0100000_2(this, 229));
                    getEditPreviewApi().Zq0().observe(this, new AObjectS84S0100000_2(this, 230));
                    InterfaceC153185zm interfaceC153185zm = (InterfaceC153185zm) this.LJLJJI.LIZ(this, interfaceC74236TBoArr[1]);
                    if (interfaceC153185zm != null) {
                        interfaceC153185zm.lz(this, new AqS168S0100000_2(this, 387));
                    }
                    InterfaceC153275zv interfaceC153275zv = (InterfaceC153275zv) this.LJLJI.LIZ(this, interfaceC74236TBoArr[0]);
                    if (interfaceC153275zv != null) {
                        interfaceC153275zv.wc(this, new AqS168S0100000_2(this, 388));
                    }
                    C41658GWo.LIZLLL().LJFF = C78983UzD.LJJJJJL(LLJILJILJ());
                    return;
                }
                o.LJIJI("postButton");
                throw null;
            }
            o.LJIJI("backView");
            throw null;
        }
        o.LJIJI("postButton");
        throw null;
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cea, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        this.LJLJLLL = viewGroup2;
        return viewGroup2;
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
