package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AEY;
import X.AI8;
import X.AI9;
import X.AKC;
import X.ActivityC45651qj;
import X.C00F;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C19N;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C25600zU;
import X.C25991AHz;
import X.C26048AKe;
import X.C26338AVi;
import X.C29S;
import X.C3C5;
import X.C42188Gh6;
import X.C44172HVg;
import X.C44423Hc3;
import X.C60903NvH;
import X.C62822Ol8;
import X.C62E;
import X.C6EZ;
import X.C76800UCe;
import X.C79045V0n;
import X.C7MY;
import X.C90903hW;
import X.C9KF;
import X.FMX;
import X.G9B;
import X.G9C;
import X.G9D;
import X.G9F;
import X.G9H;
import X.G9P;
import X.InterfaceC219588ja;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.SY4;
import X.T5R;
import X.WM7;
import X.X1D;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS27S0100000_7;
import Y.AObserverS75S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.privacy.EditPageDefaultPrivacySettingFragment;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public class PublishDefaultPermissionFragment extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public PermissionConfigure LJLIL;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public G9B LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public VideoPublishEditModel LJLJLLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final Map<Integer, AI8> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new G9H(this));

    static {
        new G9F();
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final PermissionConfigure Al() {
        PermissionConfigure permissionConfigure = this.LJLIL;
        if (permissionConfigure != null) {
            return permissionConfigure;
        }
        o.LJIJI("permissionConfigure");
        throw null;
    }

    public C235119Kp createNavActions() {
        Integer LJI;
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 293));
        int i = 0;
        c235119Kp.LIZIZ(LIZJ);
        C9KF c9kf = new C9KF();
        String string = getString(R.string.tvk);
        o.LJIIIIZZ(string, "getString(R.string.watchvideo_privacy_title)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZLLL = false;
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.c9, context)) != null) {
            i = LJI.intValue();
        }
        c235119Kp.LIZJ(i);
        return c235119Kp;
    }

    public int xl() {
        VideoPublishEditModel videoPublishEditModel = this.LJLJLLL;
        if (videoPublishEditModel != null && C62E.LIZ(videoPublishEditModel) && G9D.LIZ() == 4) {
            return G9D.LIZJ();
        }
        return G9D.LIZ();
    }

    public void Gl() {
        int i;
        PostBtnConfigure postBtnConfigure = Al().getPostBtnConfigure();
        if (postBtnConfigure != null) {
            SY4 sy4 = (SY4) _$_findCachedViewById(R.id.jlx);
            if (postBtnConfigure.getEnable()) {
                i = 0;
            } else {
                i = 8;
            }
            sy4.setVisibility(i);
            C16880lQ.LJJIZ(sy4, new ACListenerS27S0100000_7(this, 51));
            String btnText = postBtnConfigure.getBtnText();
            if (btnText.length() > 0) {
                sy4.setText(btnText);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        String str;
        String str2;
        super.onResume();
        C188727au c188727au = new C188727au();
        if (this instanceof EditPageDefaultPrivacySettingFragment) {
            str = "video_edit_page";
        } else {
            str = "video_post_page";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("current_status", vl(Al().getCurrentPermission(), true));
        c188727au.LJIIIZ("default_status", vl(xl(), true));
        if (((Boolean) this.LJLL.getValue()).booleanValue()) {
            str2 = "auto";
        } else {
            str2 = "click";
        }
        c188727au.LJIIIZ("show_way", str2);
        FMX.LJIIL("show_private_setting_popup", c188727au.LIZ);
    }

    public final String Dl(int i) {
        String string;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return "";
                    }
                    String string2 = C60903NvH.LJ.getString(R.string.dz_);
                    o.LJIIIIZZ(string2, "{\n                Camera…Sheet_body)\n            }");
                    return string2;
                }
                String string3 = getResources().getString(R.string.gn_);
                o.LJIIIIZZ(string3, "{\n                resour…mission_2)\n\n            }");
                return string3;
            }
            String string4 = getResources().getString(R.string.dz9);
            o.LJIIIIZZ(string4, "{\n                resour…Sheet_body)\n            }");
            return string4;
        }
        C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
        if (currentUser != null && currentUser.LJIILIIL()) {
            string = getResources().getString(R.string.pig);
        } else {
            string = getResources().getString(R.string.blo);
        }
        o.LJIIIIZZ(string, "{\n                val us…         }\n\n            }");
        return string;
    }

    public void Hl(Context context) {
        WM7 wm7;
        AI8 ai8;
        MusicObject musicObject;
        ICreativeSAAService LIZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (LIZ = SAAService.LIZ()) != null) {
            wm7 = LIZ.getCurrentScene(mo49getActivity);
        } else {
            wm7 = null;
        }
        if (wm7 instanceof VideoEditContainerScene) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.hm9);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(8);
                return;
            }
            return;
        }
        VideoPublishEditModel videoPublishEditModel = Al().getVideoPublishEditModel();
        if (videoPublishEditModel != null && (ai8 = (AI8) _$_findCachedViewById(R.id.hm9)) != null) {
            if (C62E.LIZ(videoPublishEditModel)) {
                ai8.setVisibility(8);
            } else if (C6EZ.LIZ() && (musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music) != null && !musicObject.isCommerceMusic) {
                ai8.setVisibility(0);
                ai8.setCellEnabled(false);
            } else {
                ai8.setVisibility(0);
                ai8.setCellEnabled(true);
            }
            Ll(ai8, 4, context);
            AI9 accessory = ai8.getAccessory();
            o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
            ((AEY) accessory).LJIILJJIL(new AqS157S0100000_7(this, 294));
            this.LJLJJI.put(4, ai8);
        }
    }

    public final void Il(boolean z) {
        boolean z2;
        String str;
        String str2;
        if (G9P.LIZIZ() || G9P.LIZJ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C188727au c188727au = new C188727au();
        if (z) {
            str = "video_edit_page";
        } else {
            str = "video_post_page";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("from_status", vl(Al().getCurrentPermission(), true));
        c188727au.LJIIIZ("to_status", vl(this.LJLJL, true));
        if (z2) {
            c188727au.LJIIIZ("default_status", vl(xl(), true));
            if (this.LJLJLJ) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("is_default_set", str2);
        }
        FMX.LJIIL("confirm_private_setting_popup", c188727au.LIZ);
    }

    public void Jl(View view) {
        int i;
        Integer valueOf;
        o.LJIIIZ(view, "view");
        this.LJLJLJ = true;
        int xl = xl();
        G9D.LJ(this.LJLJL);
        int i2 = this.LJLJL;
        if (xl != i2) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            AI8 ai8 = (AI8) ((LinkedHashMap) this.LJLJJI).get(Integer.valueOf(xl));
            if (ai8 == null) {
                return;
            }
            AI8 ai82 = (AI8) ((LinkedHashMap) this.LJLJJI).get(Integer.valueOf(i2));
            if (ai82 == null) {
                return;
            }
            ai8.setTitle(Dl(xl));
            Kl(ai82, Dl(i2), context);
            return;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        return;
                    } else {
                        valueOf = Integer.valueOf(R.string.dzc);
                    }
                } else {
                    valueOf = Integer.valueOf(R.string.dze);
                }
            } else {
                valueOf = Integer.valueOf(R.string.dzf);
            }
        } else {
            C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
            if (currentUser != null && currentUser.LJIILIIL()) {
                i = R.string.dzg;
            } else {
                i = R.string.dzd;
            }
            valueOf = Integer.valueOf(i);
        }
        if (valueOf == null) {
            return;
        }
        int intValue = valueOf.intValue();
        C26048AKe c26048AKe = new C26048AKe(view);
        c26048AKe.LJFF(intValue);
        c26048AKe.LJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        PermissionConfigure permissionConfigure;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (permissionConfigure = (PermissionConfigure) arguments.getParcelable("extra_permission_configure")) == null) {
            permissionConfigure = new PermissionConfigure(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }
        this.LJLIL = permissionConfigure;
        this.LJLJLLL = Al().getVideoPublishEditModel();
        this.LJLJL = Al().getCurrentPermission();
    }

    public void wl(int i) {
        G9B g9b = this.LJLJJL;
        if (g9b != null) {
            g9b.LIZJ(i);
        }
        if (_$_findCachedViewById(R.id.jlx).getVisibility() == 0) {
            ((SY4) _$_findCachedViewById(R.id.jlx)).setEnabled(true);
        }
    }

    public static String vl(int i, boolean z) {
        if (i != 0) {
            if (i != 2) {
                if (i != 4) {
                    if (z) {
                        return "private";
                    }
                    return "only me";
                }
                return "only_subscriber";
            }
            return "friends";
        }
        if (C44172HVg.LJIJ.getCurrentUser() != null) {
            C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
            if (currentUser != null) {
                if (currentUser.LJIILIIL()) {
                    return "followers";
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (z) {
            return "public";
        }
        return "everyone";
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AEY aey;
        AEY aey2;
        AEY aey3;
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        PrivacySettingsAgreementRecord LJII = a.LJIILIIL().LJII("video_visibility_select");
        if (LJII != null && 1 == LJII.status) {
            ((TextView) _$_findCachedViewById(R.id.hma)).setText(getString(R.string.pid));
        }
        Context context = getContext();
        if (context != null) {
            this.LJLJJLL = xl();
            if (G9P.LIZJ() && G9D.LIZ.getInt(G9D.LIZLLL("privacy_setting_default_permission"), -1) == -1) {
                G9D.LJ(this.LJLJJLL);
            }
            AI8 ai8 = (AI8) _$_findCachedViewById(R.id.hlz);
            if (ai8 != null) {
                Ll(ai8, 0, context);
                AI9 accessory = ai8.getAccessory();
                if ((accessory instanceof C25991AHz) && (aey3 = (AEY) accessory) != null) {
                    aey3.LJIILJJIL(new AqS157S0100000_7(this, 316));
                }
                this.LJLJJI.put(0, ai8);
            }
            AI8 ai82 = (AI8) _$_findCachedViewById(R.id.hm4);
            if (ai82 != null) {
                Ll(ai82, 2, context);
                AI9 accessory2 = ai82.getAccessory();
                if ((accessory2 instanceof C25991AHz) && (aey2 = (AEY) accessory2) != null) {
                    aey2.LJIILJJIL(new AqS157S0100000_7(this, 317));
                }
                this.LJLJJI.put(2, ai82);
            }
            AI8 ai83 = (AI8) _$_findCachedViewById(R.id.hm_);
            if (ai83 != null) {
                Ll(ai83, 1, context);
                AI9 accessory3 = ai83.getAccessory();
                if ((accessory3 instanceof C25991AHz) && (aey = (AEY) accessory3) != null) {
                    aey.LJIILJJIL(new AqS157S0100000_7(this, 318));
                }
                this.LJLJJI.put(1, ai83);
            }
            Hl(context);
        }
        Context context2 = getContext();
        if (context2 != null) {
            G9B g9b = new G9B(context2, Al());
            this.LJLJJL = g9b;
            g9b.LJFF.observe(this, new AObserverS75S0100000_7(this, 40));
            g9b.LIZLLL.observe(this, new G9C(this));
        }
        Gl();
        PrivacySettingsAgreementRecord LJII2 = a.LJIILIIL().LJII("video_visibility_select");
        if (LJII2 != null && 1 == LJII2.status) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.e5i).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.e5i)).setText(getString(R.string.pib));
        } else if (G9P.LIZ()) {
            Keva keva = G9D.LIZ;
            if (keva.getInt("default_permission_show_times", 0) >= C00F.LIZ(31744, 5, "creation_privacy_setting_default_panel_show_times", true)) {
                TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.emg);
                tuxIconView.setVisibility(0);
                C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(tuxIconView, 117));
                _$_findCachedViewById(R.id.e5i).setVisibility(8);
            } else {
                _$_findCachedViewById(R.id.e5i).setVisibility(0);
                ((ImageView) _$_findCachedViewById(R.id.emg)).setVisibility(8);
            }
            C19N.LIZJ(keva, "default_permission_show_times", 0, 1, "default_permission_show_times");
        }
        if (G9P.LIZ()) {
            _$_findCachedViewById(R.id.jqb).setVisibility(0);
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.jqb), new ACListenerS27S0100000_7(this, 57));
        }
        if (((Boolean) this.LJLL.getValue()).booleanValue()) {
            G9D.LIZ.storeBoolean(G9D.LIZLLL("auto_show_in_edit_page"), true);
        }
    }

    public static void Kl(AI8 ai8, String str, Context context) {
        String string = context.getString(R.string.dz5);
        o.LJIIIIZZ(string, "context.getString(R.stri…_defaultBottomSheet_body)");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(' ');
        LIZ.append(string);
        String LIZIZ = X1D.LIZIZ(LIZ);
        T5R t5r = new T5R(LIZIZ);
        t5r.LIZ(101);
        t5r.setSpan(new C42188Gh6(C7MY.LIZIZ(4)), str.length(), str.length() + 1, 33);
        Integer LJI = C79045V0n.LJI(R.attr.gp, context);
        if (LJI != null) {
            t5r.setSpan(new ForegroundColorSpan(LJI.intValue()), str.length() + 1, LIZIZ.length(), 33);
        }
        ai8.setTitle(t5r);
    }

    public final void Ll(AI8 ai8, int i, Context context) {
        String Dl = Dl(i);
        if (Dl.length() == 0) {
            return;
        }
        String str = "";
        if (i != 0) {
            if (i == 2) {
                str = getResources().getString(R.string.gnc);
                o.LJIIIIZZ(str, "{\n                resour…ion_text_3)\n            }");
            }
        } else {
            C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
            if (currentUser != null && currentUser.LJIILIIL()) {
                str = getResources().getString(R.string.tdz);
            } else {
                PrivacySettingsAgreementRecord LJII = a.LJIILIIL().LJII("visibility_everyone_subtitle");
                if (LJII != null && 1 == LJII.status) {
                    str = getString(R.string.pic);
                }
            }
            o.LJIIIIZZ(str, "{\n                val us…          }\n            }");
        }
        if (G9P.LIZ() && i == this.LJLJJLL) {
            Kl(ai8, Dl, context);
        } else {
            T5R t5r = new T5R(Dl);
            t5r.LIZ(101);
            ai8.setTitle(t5r);
        }
        if (str.length() > 0) {
            ai8.setSubtitle(str);
        }
        AKC startInset = AKC.PADDING_28;
        AKC endInset = AKC.PADDING_16;
        o.LJIIIZ(startInset, "startInset");
        o.LJIIIZ(endInset, "endInset");
        if (startInset == endInset) {
            ai8.setInset(startInset);
        } else {
            ai8.setInset(null);
            int px = startInset.toPx();
            int px2 = endInset.toPx();
            View cell_container = ai8.LIZ(R.id.b86);
            o.LJIIIIZZ(cell_container, "cell_container");
            C26338AVi.LJIIIZ(cell_container, Integer.valueOf(px), null, Integer.valueOf(px2), null, 26);
        }
        ai8.setCellEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(new C25600zU(getContext(), R.style.kp)), R.layout.ax7, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
