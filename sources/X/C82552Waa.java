package X;

import Y.ACListenerS52S0000000_5;
import Y.ALAdapterS11S0100000_14;
import Y.AObjectS45S0101000_13;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ViewStubCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.Waa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82552Waa implements InterfaceC82571Wat, C5HC {
    public final C82622Wbi LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final ViewStubCompat LJLJI;
    public C82553Wab LJLJJI;
    public InterfaceC84498XEg LJLJJL;
    public Effect LJLJJLL;
    public String LJLJL;
    public ShortVideoContext LJLJLJ;
    public final String LJLJLLL;
    public boolean LJLL;
    public String LJLLI;
    public int LJLLILLLL;
    public C173166qu LJLLJ = new C173166qu();
    public String LJLLL = "";
    public String LJLLLL;
    public final InterfaceC45540Hu4 LJLLLLLL;
    public final WMH LJLZ;

    public final boolean LIZ() {
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        if (activityC45651qj == null || activityC45651qj.isFinishing()) {
            return false;
        }
        if (!C2NU.LIZ.LIZIZ()) {
            return false;
        }
        if (this.LJLJJL == null) {
            this.LJLJJL = EffectService.getInstance().createMvEffectPlatform(this.LJLILLLLZI.getApplication());
            return true;
        }
        return true;
    }

    public final void LIZJ() {
        if (LJ(this.LJLJLJ)) {
            ((InterfaceC45979I2t) this.LJLIL.LJ(InterfaceC45979I2t.class, null)).mvBackToRecordPage();
            return;
        }
        LIZLLL();
        HXE hxe = (HXE) this.LJLIL.LJIIIIZZ(null, HXE.class);
        if (hxe == null) {
            return;
        }
        hxe.qm("click_cross", System.currentTimeMillis());
    }

    public final void LIZLLL() {
        C82561Waj c82561Waj;
        C82553Wab c82553Wab = this.LJLJJI;
        if (c82553Wab != null) {
            if (c82553Wab.getVisibility() != 8) {
                ObjectAnimator objectAnimator = c82553Wab.LLFII;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c82553Wab.LJLJLJ, "alpha", 1.0f, 0.0f);
                c82553Wab.LLFZ = ofFloat;
                ofFloat.setDuration(300L);
                c82553Wab.LLFZ.addListener(new ALAdapterS11S0100000_14(c82553Wab, 23));
                c82553Wab.LLFZ.start();
                C82547WaV LIZIZ = c82553Wab.LIZIZ(c82553Wab.LJLLILLLL);
                if (LIZIZ != null && (c82561Waj = LIZIZ.LJLJLLL) != null) {
                    c82561Waj.stop();
                    LIZIZ.LLJJIJI(2, 0, "");
                    LIZIZ.LJLLILLLL = false;
                    W5X w5x = LIZIZ.LJLIL;
                    if (w5x != null) {
                        w5x.setVisibility(0);
                    }
                }
            }
            EventBus.LIZJ().LJIJ(this.LJLJJI);
            InterfaceC45540Hu4 interfaceC45540Hu4 = this.LJLLLLLL;
            if (interfaceC45540Hu4 != null) {
                interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(this);
            }
        }
    }

    public final boolean LJIIIIZZ() {
        C82553Wab c82553Wab;
        C170736mz c170736mz;
        if (this.LJLJJI != null) {
            return true;
        }
        ViewStubCompat viewStubCompat = this.LJLJI;
        if (viewStubCompat == null || viewStubCompat.getParent() == null) {
            return false;
        }
        C82553Wab c82553Wab2 = (C82553Wab) this.LJLJI.LIZ();
        this.LJLJJI = c82553Wab2;
        WMH wmh = this.LJLZ;
        c82553Wab2.getClass();
        C82550WaY c82550WaY = new C82550WaY(wmh, c82553Wab2);
        c82553Wab2.LJZL = c82550WaY;
        c82553Wab2.LJZI.setAdapter(c82550WaY);
        this.LJLJJI.setDiContainer(this.LJLIL);
        this.LJLJJI.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS52S0000000_5(1)));
        this.LJLJJI.setMvThemeClickListener(this);
        if (this.LJLJJL == null) {
            this.LJLJJL = EffectService.getInstance().createMvEffectPlatform(this.LJLILLLLZI.getApplication());
        }
        this.LJLJJI.setMvEffectPlatform(this.LJLJJL);
        if (LJIIIIZZ() && (c170736mz = (c82553Wab = this.LJLJJI).LJLLLLLL) != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c170736mz.getLayoutParams();
            layoutParams.topMargin = (int) (KL2.LIZJ(c82553Wab.getContext(), 24.5f) + C81184Vtc.LJFF(c82553Wab.getContext()));
            c82553Wab.LJLLLLLL.setLayoutParams(layoutParams);
        }
        if (this.LJLL) {
            LJIILIIL(true);
        }
        if (LJ(this.LJLJLJ)) {
            this.LJLJJI.LJLLLLLL.setImageDrawable(this.LJLILLLLZI.getDrawable(R.drawable.ay7));
        }
        return true;
    }

    public final C145995oB LJIIJ() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", this.LJLLLL);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("content_type", "mv");
        c145995oB.LJI("creation_id", this.LJLLI);
        int i = this.LJLLILLLL;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        if (!TextUtils.isEmpty(this.LJLLL)) {
            c145995oB.LIZLLL("new_draft_id", this.LJLLL);
        }
        return c145995oB;
    }

    public final void LJFF() {
        if (!LIZ()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.LJLJJL.LJIILJJIL("mv", true, "all", new C82558Wag(this, this.LJLLJ.LIZ(), elapsedRealtime));
    }

    public final void LJI() {
        if (C60903NvH.LJIIJJI().LIZIZ().LJI()) {
            if (!LIZ()) {
                return;
            }
            HEU.LIZJ(this.LJLLJ, new C82555Wad(4, this), new AObjectS45S0101000_13(1, this, 2));
            return;
        }
        LJFF();
    }

    public static boolean LJ(ShortVideoContext shortVideoContext) {
        if (C00F.LIZ(31744, 0, "Exit_templates_page_stay_shooting_page", true) != 1) {
            return false;
        }
        if (shortVideoContext.isSpecialPlusIcon == 1 && !TextUtils.isEmpty(shortVideoContext.mBindMovieId)) {
            return false;
        }
        return true;
    }

    public final void LJIIIZ(String str) {
        int i;
        C82553Wab c82553Wab = this.LJLJJI;
        int i2 = 0;
        if (c82553Wab != null && c82553Wab.getCurTemplateType() == EnumC43998HOo.CUT_SAME.getValue()) {
            i = 1;
        } else {
            i = 0;
        }
        C145995oB LJIIJ = LJIIJ();
        LJIIJ.LJI("content_source", "upload");
        LJIIJ.LJI("content_type", "mv");
        LJIIJ.LJI("enter_method", HJC.LIZ);
        LJIIJ.LJI("template_id", str);
        LJIIJ.LJI("mv_id", str);
        LJIIJ.LIZ(i, "is_capcut");
        ShortVideoContext shortVideoContext = this.LJLJLJ;
        if (shortVideoContext != null) {
            i2 = shortVideoContext.isSpecialPlusIcon;
        }
        LJIIJ.LIZ(i2, "is_special_icon");
        FMX.LJIIL("enter_mv_shoot_page", LJIIJ.LIZ);
        HJC.LIZ = "change_mode";
    }

    public final void LJIILIIL(boolean z) {
        float LIZJ;
        this.LJLL = z;
        C82553Wab c82553Wab = this.LJLJJI;
        if (c82553Wab != null) {
            Boolean valueOf = Boolean.valueOf(z);
            int LIZJ2 = (int) KL2.LIZJ(c82553Wab.getContext(), 16.0f);
            C81290VvK c81290VvK = c82553Wab.LJLL;
            if (c81290VvK != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c81290VvK.getLayoutParams();
                if (valueOf.booleanValue()) {
                    LIZJ = KL2.LIZJ(c82553Wab.getContext(), 65.0f) + LIZJ2;
                } else {
                    LIZJ = KL2.LIZJ(c82553Wab.getContext(), 65.0f);
                }
                layoutParams.bottomMargin = (int) LIZJ;
                c82553Wab.LJLL.setLayoutParams(layoutParams);
            }
        }
    }

    public final boolean LJII(List<Effect> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        for (Effect effect : list) {
            MvThemeData mvThemeData = new MvThemeData();
            mvThemeData.LJIILJJIL(effect);
            mvThemeData.urlPrefixList = list2;
            arrayList.add(mvThemeData);
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        Effect effect2 = this.LJLJJLL;
        if (effect2 != null && !TextUtils.isEmpty(effect2.getEffectId())) {
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (this.LJLJJLL.getEffectId().equals(((MvThemeData) ListProtector.get(arrayList, i)).LJIIJJI())) {
                    ListProtector.add(arrayList, 0, ListProtector.remove(arrayList, i));
                    break;
                }
                i++;
            }
        }
        if (LJIIIIZZ()) {
            C78855Ux9.LJLJL = "loki";
            this.LJLJJI.LIZLLL(arrayList);
            this.LJLJJI.LJ();
            LJIIIZ(this.LJLJJI.getCurTemplateId());
            return true;
        }
        return true;
    }

    public final void LJIIJJI(InterfaceC82548WaW interfaceC82548WaW, int i) {
        int i2;
        if (interfaceC82548WaW == null) {
            return;
        }
        if (interfaceC82548WaW.LJII() == EnumC43998HOo.CUT_SAME) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C145995oB LJIIJ = LJIIJ();
        LJIIJ.LJI("mv_id", interfaceC82548WaW.LIZIZ());
        LJIIJ.LJI("mv_name", interfaceC82548WaW.LJIIIIZZ());
        LJIIJ.LIZ(i2, "is_capcut");
        LJIIJ.LIZ(i + 1, "impr_position");
        FMX.LJIIL("mv_show", LJIIJ.LIZ);
    }

    public final void LJIIL(InterfaceC82548WaW interfaceC82548WaW, int i) {
        int i2;
        if (interfaceC82548WaW == null) {
            return;
        }
        if (interfaceC82548WaW.LJII() == EnumC43998HOo.CUT_SAME) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C145995oB LJIIJ = LJIIJ();
        LJIIJ.LJI("mv_id", interfaceC82548WaW.LIZIZ());
        LJIIJ.LJI("mv_name", interfaceC82548WaW.LJIIIIZZ());
        LJIIJ.LIZ(i2, "is_capcut");
        LJIIJ.LIZ(i + 1, "impr_position");
        C78880UxY.LJIJ(LJIIJ);
        FMX.LJIIL("select_mv", LJIIJ.LIZ);
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        LIZJ();
        return true;
    }

    public C82552Waa(WMH wmh, ViewStubCompat viewStubCompat, C82622Wbi c82622Wbi) {
        this.LJLLLLLL = null;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) wmh.requireActivity();
        if (activityC45651qj == null || activityC45651qj.isFinishing()) {
            return;
        }
        this.LJLZ = wmh;
        this.LJLIL = c82622Wbi;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = viewStubCompat;
        this.LJLJJL = EffectService.getInstance().createMvEffectPlatform(activityC45651qj.getApplication());
        this.LJLJLLL = activityC45651qj.getResources().getString(R.string.g5t);
        this.LJLLLLLL = (InterfaceC45540Hu4) c82622Wbi.LJIIIIZZ(null, InterfaceC45540Hu4.class);
    }

    public final void LIZIZ(InterfaceC82548WaW interfaceC82548WaW, int i, int i2) {
        if (i == 2) {
            LIZJ();
            return;
        }
        if (i == 1) {
            if (LJIIIIZZ() && this.LJLJJI.getVisibility() != 0) {
                return;
            }
            if (interfaceC82548WaW.LJII() == EnumC43998HOo.MV_TEMPLATE) {
                HJ5.LIZ(this.LJLILLLLZI, (MvThemeData) interfaceC82548WaW, this.LJLJLJ);
                LJIIL(interfaceC82548WaW, i2);
            } else {
                C78934UyQ.LJLIL.LIZIZ().LJFF(this.LJLILLLLZI, (CutsameDataItem) interfaceC82548WaW, this.LJLJLJ);
            }
            if (!C43118Gw6.LIZ() || interfaceC82548WaW.LJII() != EnumC43998HOo.CUT_SAME) {
                return;
            }
            LJIIL(interfaceC82548WaW, i2);
            return;
        }
        if (i != 3) {
            return;
        }
        if (interfaceC82548WaW.LJII() == EnumC43998HOo.MV_TEMPLATE) {
            LJIIJJI(interfaceC82548WaW, i2);
        }
        if (!C43118Gw6.LIZ() || interfaceC82548WaW.LJII() != EnumC43998HOo.CUT_SAME) {
            return;
        }
        LJIIJJI(interfaceC82548WaW, i2);
    }
}
