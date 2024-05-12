package com.bytedance.android.livesdk.broadcast.trymode;

import X.B83;
import X.C06490Nh;
import X.C10A;
import X.C16880lQ;
import X.C1B6;
import X.C28507BGt;
import X.C28787BRn;
import X.C29306Beo;
import X.C2A7;
import X.C2A8;
import X.C31824CeK;
import X.C32564CqG;
import X.C41081jM;
import X.C47061t0;
import X.C5S0;
import X.C61712OJw;
import X.C61713OJx;
import X.C78983UzD;
import X.C81705W4v;
import X.EnumC31874Cf8;
import X.InterfaceC30442Bx8;
import X.W5I;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TryModeEducationDialogFragment extends AbTryModeEducationDialogFragment {
    public String LJLILLLLZI;
    public View.OnClickListener LJLJI;
    public C47061t0 LJLJJI;
    public C2A8 LJLJJL;
    public LinearLayout LJLJJLL;
    public C41081jM LJLJL;
    public C2A8 LJLJLJ;
    public LinearLayout LJLJLLL;
    public C41081jM LJLL;
    public C2A8 LJLLI;
    public C2A7 LJLLILLLL;
    public C2A8 LJLLJ;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final String LJLLL = String.valueOf(B83.LIZ().LIZIZ().LJ().getId());

    @Override // com.bytedance.android.livesdk.broadcast.trymode.AbTryModeEducationDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.broadcast.trymode.AbTryModeEducationDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
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

    @Override // com.bytedance.android.livesdk.broadcast.trymode.AbTryModeEducationDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.dje);
        c28507BGt.LIZJ = R.style.ad2;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJIILIIL = 3;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        if (C29306Beo.LIZIZ(getContext()) != null) {
            C61713OJx LIZ = C61712OJw.LIZ(this);
            LIZ.LIZIZ(false, false);
            LIZ.LIZIZ.LJIIL();
            LIZ.LJFF(-16777216);
            LIZ.LIZIZ.LJII(false);
            LIZ.LIZJ();
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("WebpFileName")) == null) {
            str = "";
        }
        this.LJLILLLLZI = str;
    }

    public final void vl(String str) {
        String LJJIIJZLJL = C78983UzD.LJJIIJZLJL(new C31824CeK(i0.LJFF(str, ".webp"), EnumC31874Cf8.TRY_MODE_WEBP, null, null, "", null, false, 0, false, 1004));
        if (C1B6.LIZIZ(LJJIIJZLJL)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file://");
            LIZ.append(LJJIIJZLJL);
            Uri parse = UriProtector.parse(X1D.LIZIZ(LIZ));
            C47061t0 c47061t0 = this.LJLJJI;
            if (c47061t0 != null) {
                C81705W4v LIZJ = W5I.LIZJ();
                LIZJ.LJI(parse);
                LIZJ.LJII = new C32564CqG();
                LIZJ.LJIIJ = false;
                C47061t0 c47061t02 = this.LJLJJI;
                if (c47061t02 != null) {
                    LIZJ.LJIIL = c47061t02.getController();
                    c47061t0.setController(LIZJ.LIZ());
                    return;
                } else {
                    o.LJIJI("webpView");
                    throw null;
                }
            }
            o.LJIJI("webpView");
            throw null;
        }
        dismiss();
        View.OnClickListener onClickListener = this.LJLJI;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        } else {
            o.LJIJI("clickListener");
            throw null;
        }
    }

    public final void wl(String str) {
        C06490Nh.LIZLLL(C28787BRn.LIZ("practice_edu_click"), this.LJLLL, "anchor_id", str, "function");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 122), view.findViewById(R.id.cbx));
        View findViewById = view.findViewById(R.id.nic);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.webp_view)");
        this.LJLJJI = (C47061t0) findViewById;
        View findViewById2 = view.findViewById(R.id.cr6);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.education_sheet_title)");
        this.LJLJJL = (C2A8) findViewById2;
        View findViewById3 = view.findViewById(R.id.c87);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.description_1)");
        this.LJLJJLL = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.c88);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.description_1_icon)");
        this.LJLJL = (C41081jM) findViewById4;
        View findViewById5 = view.findViewById(R.id.c89);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.description_1_text)");
        this.LJLJLJ = (C2A8) findViewById5;
        View findViewById6 = view.findViewById(R.id.c8_);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.description_2)");
        this.LJLJLLL = (LinearLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.c8a);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.description_2_icon)");
        this.LJLL = (C41081jM) findViewById7;
        View findViewById8 = view.findViewById(R.id.c8b);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.description_2_text)");
        this.LJLLI = (C2A8) findViewById8;
        View findViewById9 = view.findViewById(R.id.c8c);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.description_3_text)");
        this.LJLLJ = (C2A8) findViewById9;
        View findViewById10 = view.findViewById(R.id.dxz);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.got_it_button)");
        this.LJLLILLLL = (C2A7) findViewById10;
        String str = this.LJLILLLLZI;
        if (str != null) {
            switch (str.hashCode()) {
                case 3172656:
                    if (!str.equals("gift")) {
                        return;
                    }
                    C47061t0 c47061t0 = this.LJLJJI;
                    if (c47061t0 != null) {
                        C29306Beo.LJJJJLI(C5S0.LIZ(220.0f), c47061t0);
                        C47061t0 c47061t02 = this.LJLJJI;
                        if (c47061t02 != null) {
                            C29306Beo.LJJLIIIJILLIZJL(C5S0.LIZ(0.0f), c47061t02);
                            C2A8 c2a8 = this.LJLJJL;
                            if (c2a8 != null) {
                                c2a8.setText(R.string.mcy);
                                LinearLayout linearLayout = this.LJLJJLL;
                                if (linearLayout != null) {
                                    C29306Beo.LJI(linearLayout);
                                    LinearLayout linearLayout2 = this.LJLJLLL;
                                    if (linearLayout2 != null) {
                                        C29306Beo.LJI(linearLayout2);
                                        C2A8 c2a82 = this.LJLLJ;
                                        if (c2a82 != null) {
                                            C29306Beo.LJJLJLI(c2a82);
                                            C2A8 c2a83 = this.LJLLJ;
                                            if (c2a83 != null) {
                                                c2a83.setText(R.string.mcw);
                                                vl("gift");
                                                C2A7 c2a7 = this.LJLLILLLL;
                                                if (c2a7 != null) {
                                                    C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 271));
                                                    InterfaceC30442Bx8.v3.LIZ(Boolean.FALSE);
                                                    return;
                                                } else {
                                                    o.LJIJI("liveButton");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("descriptionThreeText");
                                            throw null;
                                        }
                                        o.LJIJI("descriptionThreeText");
                                        throw null;
                                    }
                                    o.LJIJI("descriptionTwo");
                                    throw null;
                                }
                                o.LJIJI("descriptionOne");
                                throw null;
                            }
                            o.LJIJI("sheetTitle");
                            throw null;
                        }
                        o.LJIJI("webpView");
                        throw null;
                    }
                    o.LJIJI("webpView");
                    throw null;
                case 71620434:
                    if (!str.equals("multi_guest")) {
                        return;
                    }
                    C2A8 c2a84 = this.LJLJJL;
                    if (c2a84 != null) {
                        c2a84.setText(R.string.md_);
                        C41081jM c41081jM = this.LJLJL;
                        if (c41081jM != null) {
                            c41081jM.setImageResource(R.drawable.dc3);
                            C2A8 c2a85 = this.LJLJLJ;
                            if (c2a85 != null) {
                                c2a85.setText(R.string.md5);
                                C41081jM c41081jM2 = this.LJLL;
                                if (c41081jM2 != null) {
                                    c41081jM2.setImageResource(R.drawable.dc2);
                                    C2A8 c2a86 = this.LJLLI;
                                    if (c2a86 != null) {
                                        c2a86.setText(R.string.md6);
                                        vl("multi_guest");
                                        C2A7 c2a72 = this.LJLLILLLL;
                                        if (c2a72 != null) {
                                            C16880lQ.LJJIII(c2a72, new ACListenerS25S0100000_5(this, 274));
                                            InterfaceC30442Bx8.t3.LIZ(Boolean.FALSE);
                                            return;
                                        } else {
                                            o.LJIJI("liveButton");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("descriptionTwoText");
                                    throw null;
                                }
                                o.LJIJI("descriptionTwoIcon");
                                throw null;
                            }
                            o.LJIJI("descriptionOneText");
                            throw null;
                        }
                        o.LJIJI("descriptionOneIcon");
                        throw null;
                    }
                    o.LJIJI("sheetTitle");
                    throw null;
                case 103668165:
                    if (!str.equals("match")) {
                        return;
                    }
                    break;
                case 570398262:
                    if (!str.equals("interact")) {
                        return;
                    }
                    C47061t0 c47061t03 = this.LJLJJI;
                    if (c47061t03 != null) {
                        C29306Beo.LJJJJLI(C5S0.LIZ(212.0f), c47061t03);
                        C47061t0 c47061t04 = this.LJLJJI;
                        if (c47061t04 != null) {
                            C29306Beo.LJJLIIIJILLIZJL(C5S0.LIZ(0.0f), c47061t04);
                            C2A8 c2a87 = this.LJLJJL;
                            if (c2a87 != null) {
                                c2a87.setText(R.string.md1);
                                LinearLayout linearLayout3 = this.LJLJJLL;
                                if (linearLayout3 != null) {
                                    C29306Beo.LJI(linearLayout3);
                                    LinearLayout linearLayout4 = this.LJLJLLL;
                                    if (linearLayout4 != null) {
                                        C29306Beo.LJI(linearLayout4);
                                        C2A8 c2a88 = this.LJLLJ;
                                        if (c2a88 != null) {
                                            C29306Beo.LJJLJLI(c2a88);
                                            C2A8 c2a89 = this.LJLLJ;
                                            if (c2a89 != null) {
                                                c2a89.setText(R.string.mcz);
                                                vl("interact");
                                                C2A7 c2a73 = this.LJLLILLLL;
                                                if (c2a73 != null) {
                                                    C16880lQ.LJJIII(c2a73, new ACListenerS25S0100000_5(this, 272));
                                                    InterfaceC30442Bx8.u3.LIZ(Boolean.FALSE);
                                                    return;
                                                } else {
                                                    o.LJIJI("liveButton");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("descriptionThreeText");
                                            throw null;
                                        }
                                        o.LJIJI("descriptionThreeText");
                                        throw null;
                                    }
                                    o.LJIJI("descriptionTwo");
                                    throw null;
                                }
                                o.LJIJI("descriptionOne");
                                throw null;
                            }
                            o.LJIJI("sheetTitle");
                            throw null;
                        }
                        o.LJIJI("webpView");
                        throw null;
                    }
                    o.LJIJI("webpView");
                    throw null;
                case 937330075:
                    if (!str.equals("co_host")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            C2A8 c2a810 = this.LJLJJL;
            if (c2a810 != null) {
                c2a810.setText(R.string.mcv);
                C41081jM c41081jM3 = this.LJLJL;
                if (c41081jM3 != null) {
                    c41081jM3.setImageResource(R.drawable.dc0);
                    C2A8 c2a811 = this.LJLJLJ;
                    if (c2a811 != null) {
                        c2a811.setText(R.string.mcr);
                        C41081jM c41081jM4 = this.LJLL;
                        if (c41081jM4 != null) {
                            c41081jM4.setImageResource(R.drawable.dby);
                            C2A8 c2a812 = this.LJLLI;
                            if (c2a812 != null) {
                                c2a812.setText(R.string.mcs);
                                C2A7 c2a74 = this.LJLLILLLL;
                                if (c2a74 != null) {
                                    c2a74.setText(R.string.mda);
                                    vl("co_host");
                                    C2A7 c2a75 = this.LJLLILLLL;
                                    if (c2a75 != null) {
                                        C16880lQ.LJJIII(c2a75, new ACListenerS25S0100000_5(this, 270));
                                        InterfaceC30442Bx8.s3.LIZ(Boolean.FALSE);
                                        return;
                                    } else {
                                        o.LJIJI("liveButton");
                                        throw null;
                                    }
                                }
                                o.LJIJI("liveButton");
                                throw null;
                            }
                            o.LJIJI("descriptionTwoText");
                            throw null;
                        }
                        o.LJIJI("descriptionTwoIcon");
                        throw null;
                    }
                    o.LJIJI("descriptionOneText");
                    throw null;
                }
                o.LJIJI("descriptionOneIcon");
                throw null;
            }
            o.LJIJI("sheetTitle");
            throw null;
        }
        o.LJIJI("webpScene");
        throw null;
    }
}
