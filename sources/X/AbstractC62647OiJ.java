package X;

import Y.ACListenerS30S0100000_10;
import Y.ACListenerS36S0300000_10;
import Y.ARunnableS21S0300000_10;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.silent.SilentSharePopupWindow;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OiJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC62647OiJ extends G5I {
    public final Context LJLJI;
    public final C62822Ol8 LJLJJI;
    public boolean LJLJJL;
    public final List<OSZ<EnumC62419Oed, C63046Ook>> LJLJJLL;
    public TextView LJLJL;
    public View LJLJLJ;
    public SilentSharePopupWindow LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public TuxIconView LJLLL;
    public final DialogC25756A8y LJLLLL;
    public boolean LJLLLLLL;

    @Override // X.G5I
    public final void LIZ(C40945G5d c40945G5d) {
    }

    @Override // X.G5I
    public final void LIZLLL() {
    }

    @Override // X.G5I
    public final boolean LJ() {
        return false;
    }

    @Override // X.G5I
    public final void LJFF() {
    }

    @Override // X.G5I
    public final void LJI(boolean z) {
    }

    public abstract void LJIIJ();

    public void LJIIL(C63046Ook c63046Ook) {
    }

    public abstract void LJIILIIL();

    public abstract int getLayoutResId();

    @Override // X.G5I
    public void setSaveLocalEnabled(boolean z) {
    }

    @Override // X.G5I
    public final String LJII() {
        ArrayList arrayList = new ArrayList();
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return C30581Hy.LJJIIZ(arrayList);
    }

    public final void LJIIIIZZ() {
        TuxIconView tuxIconView;
        if (!(getContext() instanceof Activity)) {
            return;
        }
        C62418Oec c62418Oec = EnumC62419Oed.Companion;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        o.LJI(LJIJJ);
        c62418Oec.getClass();
        List LIZ = C62418Oec.LIZ(LJIJJ);
        if (LIZ.isEmpty()) {
            LJIIIZ();
            return;
        }
        List LLILLL = ORZ.LLILLL(LIZ, 5);
        ArrayList arrayList = new ArrayList();
        for (Object obj : LLILLL) {
            if (true ^ o.LJ(((EnumC62419Oed) obj).getKey(), EnumC62419Oed.LEMON8.getKey())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EnumC62419Oed enumC62419Oed = (EnumC62419Oed) it.next();
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cm0, getRadioGroup(), false);
            o.LJII(LLLLIILL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton");
            C63046Ook c63046Ook = (C63046Ook) LLLLIILL;
            c63046Ook.setTag(enumC62419Oed);
            int i = this.LJLLJ;
            o.LJ(enumC62419Oed.getKey(), "facebook");
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            c63046Ook.setBackground(C62417Oeb.LIZ(context2, enumC62419Oed.getUncheckedIconRes(), enumC62419Oed.getCheckedIconRes(), this.LJLLILLLL, i));
            c63046Ook.setId(View.generateViewId());
            LJIIL(c63046Ook);
            c63046Ook.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS30S0100000_10(this, 118)));
            getRadioGroup().addView(c63046Ook);
            ((ArrayList) this.LJLJJLL).add(new OSZ(enumC62419Oed, c63046Ook));
        }
        if (C62628Oi0.LIZIZ(LIZ) && (tuxIconView = (TuxIconView) findViewById(R.id.fq0)) != null) {
            this.LJLLL = tuxIconView;
            EnumC62419Oed enumC62419Oed2 = EnumC62419Oed.LEMON8;
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            tuxIconView.setBackground(C62417Oeb.LIZIZ(enumC62419Oed2.getUncheckedIconRes(), enumC62419Oed2.getCheckedIconRes(), this.LJLLILLLL, this.LJLLJ, context3, C62628Oi0.LIZ()));
            this.LJLLLL.LIZIZ(R.string.rjz);
            if (C62628Oi0.LIZLLL().getBoolean("fist_show_lemon8", true)) {
                C62628Oi0.LIZLLL().storeBoolean("fist_show_lemon8", false);
                Context context4 = getContext();
                o.LJIIIIZZ(context4, "context");
                Drawable LIZIZ = C62417Oeb.LIZIZ(enumC62419Oed2.getUncheckedIconRes(), enumC62419Oed2.getCheckedIconRes(), this.LJLLILLLL, this.LJLLJ, context4, true);
                Context context5 = getContext();
                o.LJIIIIZZ(context5, "context");
                Drawable LIZIZ2 = C62417Oeb.LIZIZ(enumC62419Oed2.getUncheckedIconRes(), enumC62419Oed2.getCheckedIconRes(), this.LJLLILLLL, this.LJLLJ, context5, false);
                tuxIconView.setVisibility(0);
                tuxIconView.postDelayed(new ARunnableS21S0300000_10(tuxIconView, LIZIZ, LIZIZ2, 13), 500L);
            } else {
                tuxIconView.setVisibility(0);
            }
            C16880lQ.LJJJ(tuxIconView, new ACListenerS36S0300000_10(this, tuxIconView, enumC62419Oed2, 3));
        }
        int LIZ2 = C1A7.LJIIL().LIZ(0, "key_silent_share_save");
        Iterator it2 = ((ArrayList) this.LJLJJLL).iterator();
        while (it2.hasNext()) {
            OSZ osz = (OSZ) it2.next();
            if (((EnumC62419Oed) osz.getFirst()).getSaveType() == LIZ2) {
                ((CompoundButton) osz.getSecond()).setChecked(true);
                this.LJLLI = ((View) osz.getSecond()).getId();
            }
        }
        LJIILIIL();
        getRadioGroup().setOnCheckedChangeListener(new C62649OiL(this));
    }

    public final void LJIIIZ() {
        C62418Oec c62418Oec = EnumC62419Oed.Companion;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        o.LJI(C45804HyK.LJIJJ(context));
        c62418Oec.getClass();
        if (!C62418Oec.LIZ(r0).isEmpty()) {
            return;
        }
        setVisibility(8);
        TextView textView = this.LJLJL;
        if (textView != null) {
            textView.setVisibility(8);
        }
        getRadioGroup().setVisibility(8);
    }

    public final OSZ<EnumC62419Oed, C63046Ook> getCurrentChannelPair() {
        Iterator it = ((ArrayList) this.LJLJJLL).iterator();
        while (it.hasNext()) {
            OSZ<EnumC62419Oed, C63046Ook> osz = (OSZ) it.next();
            if (osz.getSecond().getId() == getRadioGroup().getCheckedRadioButtonId()) {
                return osz;
            }
        }
        return null;
    }

    public final View getLayoutRoot() {
        View view = this.LJLJLJ;
        if (view != null) {
            return view;
        }
        o.LJIJI("layoutRoot");
        throw null;
    }

    @Override // X.G5I
    public Boolean getLemon8ButtonStatus() {
        return Boolean.valueOf(C62629Oi1.LJIIIIZZ);
    }

    public final RadioGroup getRadioGroup() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-radioGroup>(...)");
        return (RadioGroup) value;
    }

    @Override // X.G5I
    public int getSaveUploadType() {
        EnumC62419Oed first;
        OSZ<EnumC62419Oed, C63046Ook> currentChannelPair = getCurrentChannelPair();
        if (currentChannelPair != null && (first = currentChannelPair.getFirst()) != null) {
            return first.getSaveType();
        }
        return 0;
    }

    public final List<OSZ<EnumC62419Oed, C63046Ook>> getButtonPairList() {
        return this.LJLJJLL;
    }

    @Override // X.G5I
    public DialogC25756A8y getLemon8AuthLoadingHUD() {
        return this.LJLLLL;
    }

    @Override // X.G5I
    public TuxIconView getLemon8ButtonView() {
        return this.LJLLL;
    }

    public final TextView getSyncTitle() {
        return this.LJLJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC62647OiJ(Context context) {
        super(context);
        a1.LJFF(context, "ctx");
        this.LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 450));
        this.LJLJJLL = new ArrayList();
        this.LJLL = 2;
        this.LJLLI = -1;
        this.LJLLILLLL = 44;
        this.LJLLJ = 30;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        this.LJLLLL = new DialogC25756A8y(context2);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), getLayoutResId(), this, true);
        o.LJIIIIZZ(LLLLIILL, "from(ctx)\n            .i…ayoutResId(), this, true)");
        setLayoutRoot(LLLLIILL);
        this.LJLJI = context;
        LJIIJ();
    }

    @Override // X.G5I
    public final void LIZIZ(int i) {
        boolean z;
        TuxIconView tuxIconView;
        int i2 = 0;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        SharePrefCache.inst().getIsAwemePrivate().LIZLLL(Boolean.valueOf(z));
        ShareDependService.LIZ.getClass();
        ShareDependService LIZ = C44498HdG.LIZ();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        LIZ.LJIJI(context, z);
        if (z) {
            if (getRadioGroup().getCheckedRadioButtonId() != -1) {
                getRadioGroup().check(-1);
            }
            Iterator it = ((ArrayList) this.LJLJJLL).iterator();
            while (it.hasNext()) {
                ((C63046Ook) ((OSZ) it.next()).getSecond()).setCanChecked(false);
            }
            TuxIconView tuxIconView2 = this.LJLLL;
            if (tuxIconView2 != null) {
                this.LJLLLLLL = C62629Oi1.LJIIIIZZ;
                C62628Oi0.LJFF(tuxIconView2, EnumC62419Oed.LEMON8, false);
            }
        } else {
            int LIZ2 = C1A7.LJIIL().LIZ(0, "key_silent_share_save");
            Iterator it2 = ((ArrayList) this.LJLJJLL).iterator();
            while (it2.hasNext()) {
                OSZ osz = (OSZ) it2.next();
                ((C63046Ook) osz.getSecond()).setCanChecked(true);
                if (((EnumC62419Oed) osz.getFirst()).getSaveType() == LIZ2) {
                    ((CompoundButton) osz.getSecond()).setChecked(true);
                    this.LJLLI = ((View) osz.getSecond()).getId();
                }
            }
            if (this.LJLLLLLL && (tuxIconView = this.LJLLL) != null) {
                C62628Oi0.LJFF(tuxIconView, EnumC62419Oed.LEMON8, true);
            }
        }
        LJIILIIL();
        TextView textView = this.LJLJL;
        if (textView != null) {
            if (z && !C53316KwC.LIZ()) {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
        LJIIIZ();
    }

    public final void setLayoutRoot(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLJLJ = view;
    }

    @Override // X.G5I
    public void setSyncIconSize(int i) {
        Iterator it = ((ArrayList) this.LJLJJLL).iterator();
        while (it.hasNext()) {
            ViewGroup.LayoutParams layoutParams = ((View) ((OSZ) it.next()).getSecond()).getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = i;
        }
    }

    @Override // X.G5I
    public void setSyncShareViewTextColor(int i) {
        TextView textView = this.LJLJL;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Override // X.G5I
    public void setSyncShareViewTextSize(float f) {
        TextView textView = this.LJLJL;
        if (textView == null) {
            return;
        }
        textView.setTextSize(f);
    }

    @Override // X.G5I
    public void setSyncShareViewTitle(String str) {
        TextView textView = this.LJLJL;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    public final void setSyncTitle(TextView textView) {
        this.LJLJL = textView;
    }

    public final void LJIIJJI(String str, boolean z) {
        java.util.Map map;
        String str2;
        String str3;
        String str4;
        String str5;
        String obj;
        Object tag = getTag();
        if (!(tag instanceof java.util.Map) || (map = (java.util.Map) tag) == null) {
            return;
        }
        if (z) {
            str2 = "publish_share_confirm";
        } else {
            str2 = "publish_share_cancel";
        }
        C188727au c188727au = new C188727au();
        Object obj2 = map.get("creation_id");
        String str6 = "";
        if (obj2 == null || (str3 = obj2.toString()) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("creation_id", str3);
        Object obj3 = map.get("enter_from");
        if (obj3 == null || (str4 = obj3.toString()) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("enter_from", str4);
        Object obj4 = map.get("content_type");
        if (obj4 == null || (str5 = obj4.toString()) == null) {
            str5 = "";
        }
        c188727au.LJIIIZ("content_type", str5);
        Object obj5 = map.get("shoot_way");
        if (obj5 != null && (obj = obj5.toString()) != null) {
            str6 = obj;
        }
        c188727au.LJIIIZ("shoot_way", str6);
        c188727au.LJIIIZ("share_to", str);
        FMX.LJIIL(str2, c188727au.LIZ);
        if (z) {
            LIZJ();
        }
        LJIILIIL();
    }
}
