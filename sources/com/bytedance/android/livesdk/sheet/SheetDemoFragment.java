package com.bytedance.android.livesdk.sheet;

import X.C03880Dg;
import X.C0CM;
import X.C0KB;
import X.C0KG;
import X.C0KH;
import X.C0KI;
import X.C0KJ;
import X.C0KK;
import X.C0KL;
import X.C0KM;
import X.C15380j0;
import X.C16880lQ;
import X.C17230lz;
import X.C17240m0;
import X.C19K;
import X.C23010vJ;
import X.C259710f;
import X.C2A6;
import X.C2A7;
import X.C30101Gc;
import X.C30111Gd;
import X.C30161Gi;
import X.C41021jG;
import X.C41031jH;
import X.C47261Igj;
import X.C48690J9a;
import X.C65300Pk0;
import X.C76800UCe;
import X.C77363UXv;
import X.C77364UXw;
import X.C77365UXx;
import X.C77366UXy;
import X.C77367UXz;
import X.C80133Vcf;
import X.GQA;
import X.InterfaceC30442Bx8;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.UY0;
import X.UY1;
import X.UY2;
import X.UY3;
import X.UY4;
import X.UY5;
import X.UY6;
import X.UY7;
import X.UY8;
import X.UY9;
import X.UYA;
import X.ViewOnClickListenerC77360UXs;
import X.ViewOnClickListenerC77361UXt;
import X.ViewOnClickListenerC77362UXu;
import Y.ACListenerS22S0210000_13;
import Y.ACListenerS33S0100000_13;
import Y.ACListenerS38S0300000_13;
import Y.ACListenerS47S0200000_13;
import Y.IDCListenerS10S0101000;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class SheetDemoFragment extends LiveSheetFragment {
    public boolean LLD;
    public boolean LLFF;
    public boolean LLFFF;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();
    public int LLF = -1;
    public final ArrayList<TextIconItem> LLFII = new ArrayList<>();
    public final ArrayList<TextIconItem> LLFZ = new ArrayList<>();
    public final ArrayList<TextIconItem> LLI = new ArrayList<>();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIFFJFJJ).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIFFJFJJ;
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

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C17230lz Il() {
        C17230lz c17230lz = new C17230lz();
        int i = this.LLF;
        if (i == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "By creating a TikTok Promote you agree to TikTok's ");
            C23010vJ.LJFF(spannableStringBuilder, 0, spannableStringBuilder.length(), 33, LiveChatShowDelayForHotLiveSetting.DEFAULT);
            spannableStringBuilder.append((CharSequence) "Terms");
            C23010vJ.LJFF(spannableStringBuilder, spannableStringBuilder.length() - 5, spannableStringBuilder.length(), 33, 600);
            spannableStringBuilder.append((CharSequence) " and ");
            C23010vJ.LJFF(spannableStringBuilder, spannableStringBuilder.length() - 5, spannableStringBuilder.length(), 33, LiveChatShowDelayForHotLiveSetting.DEFAULT);
            spannableStringBuilder.append((CharSequence) "Advertising Terms of Service");
            C23010vJ.LJFF(spannableStringBuilder, spannableStringBuilder.length() - 28, spannableStringBuilder.length(), 33, 600);
            c17230lz.LIZIZ = spannableStringBuilder;
            c17230lz.LIZJ = 0;
            c17230lz.LIZ(C47261Igj.LJJIJIIJI(new C17240m0("Learn more", R.style.a3a, UY5.LIZ), new C17240m0("Turn on", R.style.a2z, UY6.LIZ)));
        } else if (i == 1) {
            c17230lz.LIZJ = 1;
            c17230lz.LIZ(C47261Igj.LJJIJIIJI(new C17240m0("Button", R.style.a2z, UY7.LIZ), new C17240m0("Not interested", R.style.a30, UY8.LIZ)));
        }
        return this.LJLLLL;
    }

    public final Bundle Ql() {
        int i;
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_back_icon", ((CompoundButton) _$_findCachedViewById(R.id.jzo)).isChecked());
        bundle.putBoolean("show_close_icon", ((CompoundButton) _$_findCachedViewById(R.id.jzr)).isChecked());
        bundle.putBoolean("dark_theme", ((CompoundButton) _$_findCachedViewById(R.id.c3i)).isChecked());
        Object tag = _$_findCachedViewById(R.id.apx).getTag();
        if (o.LJ(tag, Integer.valueOf(R.id.apv))) {
            i = 0;
        } else if (o.LJ(tag, Integer.valueOf(R.id.apw))) {
            i = 1;
        } else {
            i = -1;
        }
        bundle.putInt("bottom_function_style", i);
        bundle.putBoolean("bottom_function_visible_when_keyboard_show", ((CompoundButton) _$_findCachedViewById(R.id.jzp)).isChecked());
        bundle.putString("title", String.valueOf(((C19K) _$_findCachedViewById(R.id.l_s)).getText()));
        bundle.putString("subtitle", String.valueOf(((C19K) _$_findCachedViewById(R.id.kry)).getText()));
        bundle.putParcelableArrayList("tab_items", this.LLFII);
        bundle.putString("start_text", String.valueOf(((C19K) _$_findCachedViewById(R.id.kdo)).getText()));
        bundle.putString("end_text", String.valueOf(((C19K) _$_findCachedViewById(R.id.cwr)).getText()));
        bundle.putParcelableArrayList("start_icon_items", this.LLFZ);
        bundle.putParcelableArrayList("end_icon_items", this.LLI);
        bundle.putBoolean("showSeparator", ((CompoundButton) _$_findCachedViewById(R.id.jor)).isChecked());
        return bundle;
    }

    public final SheetOptions Rl() {
        SheetOptions sheetOptions = new SheetOptions();
        if (!o.LJ(_$_findCachedViewById(R.id.e4z).getTag(), -1)) {
            Object tag = _$_findCachedViewById(R.id.e4z).getTag();
            if (o.LJ(tag, Integer.valueOf(R.id.e4y))) {
                sheetOptions.LIZIZ(0);
            } else if (o.LJ(tag, Integer.valueOf(R.id.e4x))) {
                sheetOptions.LIZIZ(1);
            }
        }
        sheetOptions.fullscreenEnabled = ((CompoundButton) _$_findCachedViewById(R.id.dpv)).isChecked();
        sheetOptions.isHeaderFloating = ((CompoundButton) _$_findCachedViewById(R.id.dj6)).isChecked();
        return sheetOptions;
    }

    public boolean Sl() {
        return !this.LLFFF;
    }

    public final void Tl() {
        if (this.LLI.isEmpty()) {
            _$_findCachedViewById(R.id.cws).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.cws).setVisibility(8);
            ((TextView) _$_findCachedViewById(R.id.cwr)).setText((CharSequence) null);
        }
    }

    public final void Vl() {
        if (this.LLFZ.isEmpty()) {
            _$_findCachedViewById(R.id.kdp).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.kdp).setVisibility(8);
            ((TextView) _$_findCachedViewById(R.id.kdo)).setText((CharSequence) null);
        }
    }

    public final void Wl() {
        if (this.LLFII.isEmpty()) {
            _$_findCachedViewById(R.id.la4).setVisibility(0);
            _$_findCachedViewById(R.id.ks3).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.la4).setVisibility(8);
            _$_findCachedViewById(R.id.ks3).setVisibility(8);
            ((TextView) _$_findCachedViewById(R.id.l_s)).setText((CharSequence) null);
            ((TextView) _$_findCachedViewById(R.id.kry)).setText((CharSequence) null);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        boolean z;
        C0CM c0cm;
        SheetDemoFragment sheetDemoFragment;
        C30161Gi c30161Gi;
        Bundle arguments = getArguments();
        if (arguments != null) {
            C0KB c0kb = new C0KB();
            String string = arguments.getString("title");
            if (string != null && !ujb.o.LJJJJJL(string)) {
                c0kb.LIZ(string);
            }
            String string2 = arguments.getString("subtitle");
            if (string2 == null || ujb.o.LJJJJJL(string2)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                c0kb.LIZIZ = string2;
                c0kb.LJII = null;
                c0kb.LJIIIIZZ = null;
                c0kb.LJIIIZ = -1;
            }
            c0kb.LJI = arguments.getBoolean("showSeparator");
            String string3 = arguments.getString("start_text");
            if (string3 != null && string3.length() > 0) {
                C0KL c0kl = new C0KL();
                c0kl.LIZIZ = arguments.getString("start_text");
                c0kl.LIZ = C0KM.PRIMARY;
                c0kl.LIZLLL = UY9.LJLIL;
                c0kb.LIZJ = c0kl;
            }
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("start_icon_items");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    TextIconItem textIconItem = (TextIconItem) it.next();
                    Integer num = textIconItem.id;
                    if (num != null) {
                        int intValue = num.intValue();
                        if (intValue == R.raw.icon_chevron_left_offset_ltr) {
                            arrayList.add(Gl());
                        } else {
                            arrayList.add(new C0KJ(intValue, new ACListenerS33S0100000_13(textIconItem, 88)));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    c0kb.LJ = arrayList;
                }
            }
            String string4 = arguments.getString("end_text");
            if (string4 != null && string4.length() > 0) {
                C0KL c0kl2 = new C0KL();
                c0kl2.LIZIZ = arguments.getString("end_text");
                c0kl2.LIZ = C0KM.PRIMARY;
                c0kl2.LIZLLL = UYA.LJLIL;
                c0kb.LIZLLL = c0kl2;
            }
            ArrayList parcelableArrayList2 = arguments.getParcelableArrayList("end_icon_items");
            if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = parcelableArrayList2.iterator();
                while (it2.hasNext()) {
                    TextIconItem textIconItem2 = (TextIconItem) it2.next();
                    Integer num2 = textIconItem2.id;
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        if (intValue2 == R.raw.icon_x_mark_small) {
                            if (this.LJLZ == null) {
                                c30161Gi = null;
                            } else {
                                c30161Gi = new C30161Gi(R.attr.aw3, new IDCListenerS10S0101000(0, this, 5));
                            }
                            arrayList2.add(c30161Gi);
                        } else {
                            arrayList2.add(new C0KJ(intValue2, new ACListenerS33S0100000_13(textIconItem2, 89)));
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    c0kb.LJFF = arrayList2;
                }
            }
            View view = getView();
            if (view != null) {
                c0cm = (C0CM) view.findViewById(R.id.nb6);
            } else {
                c0cm = null;
            }
            ArrayList parcelableArrayList3 = arguments.getParcelableArrayList("tab_items");
            if (parcelableArrayList3 != null && !parcelableArrayList3.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = parcelableArrayList3.iterator();
                while (it3.hasNext()) {
                    TextIconItem textIconItem3 = (TextIconItem) it3.next();
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null && o.LJ(C16880lQ.LLJJIII(arguments2, "is_lorem"), Boolean.TRUE)) {
                        sheetDemoFragment = new SheetLoremFragment();
                    } else {
                        sheetDemoFragment = new SheetDemoFragment();
                    }
                    String str = textIconItem3.text;
                    if (str != null) {
                        arrayList3.add(new C0KK(sheetDemoFragment, str));
                    }
                    Integer num3 = textIconItem3.id;
                    if (num3 != null) {
                        arrayList3.add(new C0KK(num3.intValue(), sheetDemoFragment));
                    }
                }
                c0kb.LJII = arrayList3;
                c0kb.LJIIIIZZ = c0cm;
                c0kb.LIZ = null;
                c0kb.LIZIZ = null;
            }
            return c0kb;
        }
        return new C0KB();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final boolean Dl() {
        return this.LLFF;
    }

    public final void Ol(InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> interfaceC88471Ynr) {
        C0KH c0kh = new C0KH();
        C41021jG c41021jG = new C41021jG();
        c41021jG.LIZ(R.raw.icon_chevron_left_offset_ltr, requireContext());
        c41021jG.LIZ = "Back";
        c41021jG.LIZJ = new C77364UXw(interfaceC88471Ynr);
        c0kh.LIZ(new C41031jH(c41021jG));
        C41021jG c41021jG2 = new C41021jG();
        c41021jG2.LIZ(R.raw.icon_x_mark_small, requireContext());
        c41021jG2.LIZ = "Close";
        c41021jG2.LIZJ = new C77365UXx(interfaceC88471Ynr);
        c0kh.LIZ(new C41031jH(c41021jG2));
        C41021jG c41021jG3 = new C41021jG();
        c41021jG3.LIZ(R.raw.icon_bookmark, requireContext());
        c41021jG3.LIZ = "Bookmark";
        c41021jG3.LIZJ = new C77366UXy(interfaceC88471Ynr);
        c0kh.LIZ(new C41031jH(c41021jG3));
        C41021jG c41021jG4 = new C41021jG();
        c41021jG4.LIZ(R.raw.icon_paperplane, requireContext());
        c41021jG4.LIZ = "Paperplane";
        c41021jG4.LIZJ = new C77367UXz(interfaceC88471Ynr);
        c0kh.LIZ(new C41031jH(c41021jG4));
        C41021jG c41021jG5 = new C41021jG();
        c41021jG5.LIZ(R.raw.icon_house_play, requireContext());
        c41021jG5.LIZ = "House play";
        c41021jG5.LIZJ = new UY0(interfaceC88471Ynr);
        c0kh.LIZ(new C41031jH(c41021jG5));
        C41021jG c41021jG6 = new C41021jG();
        c41021jG6.LIZ(R.raw.icon_star_ring, requireContext());
        c41021jG6.LIZ = "Star ring";
        c41021jG6.LIZJ = new UY1(interfaceC88471Ynr);
        c0kh.LIZ(new C41031jH(c41021jG6));
        C41021jG c41021jG7 = new C41021jG();
        c41021jG7.LIZ(R.raw.icon_heart, requireContext());
        c41021jG7.LIZ = "Heart";
        c41021jG7.LIZJ = new UY2(interfaceC88471Ynr);
        c0kh.LIZ(new C41031jH(c41021jG7));
        C41021jG c41021jG8 = new C41021jG();
        c41021jG8.LIZ(R.raw.icon_misc, requireContext());
        c41021jG8.LIZ = "Misc";
        c41021jG8.LIZJ = new UY3(interfaceC88471Ynr);
        c0kh.LIZ(new C41031jH(c41021jG8));
        C41021jG c41021jG9 = new C41021jG();
        c41021jG9.LIZ(R.raw.icon_magnifying_glass, requireContext());
        c41021jG9.LIZ = "Magnifying glass";
        c41021jG9.LIZJ = new UY4(interfaceC88471Ynr);
        c0kh.LIZ(new C41031jH(c41021jG9));
        C41021jG c41021jG10 = new C41021jG();
        c41021jG10.LIZ(R.raw.icon_live, requireContext());
        c41021jG10.LIZ = "LIVE";
        c41021jG10.LIZJ = new C77363UXv(interfaceC88471Ynr);
        c0kh.LIZ(new C41031jH(c41021jG10));
        C0KI c0ki = new C0KI(c0kh);
        C2A6 c2a6 = new C2A6(requireContext());
        if (!TextUtils.isEmpty("Cancel")) {
            C30101Gc c30101Gc = new C30101Gc();
            c30101Gc.LIZ = "Cancel";
            c2a6.LIZLLL = new C30111Gd(c30101Gc);
        }
        List<C0KG> list = c0ki.LIZIZ;
        if (list != null && !list.isEmpty()) {
            ((ArrayList) c2a6.LIZJ).add(c0ki);
        }
        LiveActionSheetDialog LIZ = c2a6.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/view/sheet/action/LiveActionSheetDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-5653372111708614353")).LIZ) {
            return;
        }
        LIZ.show();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final int getThemeOverlay(Context context) {
        o.LJIIIZ(context, "context");
        if (this.LLD) {
            return C259710f.LIZ.LIZJ();
        }
        return C48690J9a.LIZIZ(context);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final boolean isLight(Context context) {
        o.LJIIIZ(context, "context");
        return !this.LLD;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            arguments.getBoolean("show_back_icon", true);
            arguments.getBoolean("show_close_icon", false);
            this.LLD = arguments.getBoolean("dark_theme", false);
            this.LLF = arguments.getInt("bottom_function_style", -1);
            this.LLFF = arguments.getBoolean("bottom_function_visible_when_keyboard_show", false);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (parcelableArrayList = arguments2.getParcelableArrayList("tab_items")) == null || parcelableArrayList.isEmpty()) {
            z = true;
        }
        this.LLFFF = !z;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public View Jl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        if (this.LLFFF) {
            View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.axg, viewGroup, false);
            o.LJIIIIZZ(LLLLIILL, "{\n            inflater.i…ntainer, false)\n        }");
            return LLLLIILL;
        }
        View LLLLIILL2 = C16880lQ.LLLLIILL(inflater, R.layout.bml, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL2, "{\n            inflater.i…ntainer, false)\n        }");
        return LLLLIILL2;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (Sl()) {
            C80133Vcf height_mode_selector = (C80133Vcf) _$_findCachedViewById(R.id.e4z);
            o.LJIIIIZZ(height_mode_selector, "height_mode_selector");
            Nl(height_mode_selector, true, null);
            C80133Vcf bottom_function_style_selector = (C80133Vcf) _$_findCachedViewById(R.id.apx);
            o.LJIIIIZZ(bottom_function_style_selector, "bottom_function_style_selector");
            Nl(bottom_function_style_selector, false, null);
            LiveEditText title_edit_text = (LiveEditText) _$_findCachedViewById(R.id.l_s);
            o.LJIIIIZZ(title_edit_text, "title_edit_text");
            LiveIconView title_clear_icon = (LiveIconView) _$_findCachedViewById(R.id.l_g);
            o.LJIIIIZZ(title_clear_icon, "title_clear_icon");
            Ml(title_edit_text, title_clear_icon, new AqS179S0100000_13(this, 335));
            LiveEditText subtitle_edit_text = (LiveEditText) _$_findCachedViewById(R.id.kry);
            o.LJIIIIZZ(subtitle_edit_text, "subtitle_edit_text");
            LiveIconView subtitle_clear_icon = (LiveIconView) _$_findCachedViewById(R.id.kru);
            o.LJIIIIZZ(subtitle_clear_icon, "subtitle_clear_icon");
            Ml(subtitle_edit_text, subtitle_clear_icon, new AqS179S0100000_13(this, 332));
            LiveEditText tabs_title_edit_text = (LiveEditText) _$_findCachedViewById(R.id.kzi);
            o.LJIIIIZZ(tabs_title_edit_text, "tabs_title_edit_text");
            LiveIconView tabs_title_clear_icon = (LiveIconView) _$_findCachedViewById(R.id.kzh);
            o.LJIIIIZZ(tabs_title_clear_icon, "tabs_title_clear_icon");
            Ml(tabs_title_edit_text, tabs_title_clear_icon, null);
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.kzj), new ACListenerS33S0100000_13(this, UserLevelGeckoUpdateSetting.DEFAULT));
            C80133Vcf c80133Vcf = (C80133Vcf) _$_findCachedViewById(R.id.kyr);
            GradientDrawable gradientDrawable = new GradientDrawable();
            int LIZ = C15380j0.LIZ(4.0f);
            gradientDrawable.setSize(LIZ, LIZ);
            c80133Vcf.setDividerDrawable(gradientDrawable);
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.kzf), new ACListenerS33S0100000_13(this, 141));
            LiveEditText start_text_edit_text = (LiveEditText) _$_findCachedViewById(R.id.kdo);
            o.LJIIIIZZ(start_text_edit_text, "start_text_edit_text");
            LiveIconView start_text_clear_icon = (LiveIconView) _$_findCachedViewById(R.id.kdn);
            o.LJIIIIZZ(start_text_clear_icon, "start_text_clear_icon");
            Ml(start_text_edit_text, start_text_clear_icon, new AqS179S0100000_13(this, 396));
            C80133Vcf c80133Vcf2 = (C80133Vcf) _$_findCachedViewById(R.id.kd0);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            int LIZ2 = C15380j0.LIZ(4.0f);
            gradientDrawable2.setSize(LIZ2, LIZ2);
            c80133Vcf2.setDividerDrawable(gradientDrawable2);
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.kcy), new ACListenerS33S0100000_13(this, 139));
            LiveEditText end_text_edit_text = (LiveEditText) _$_findCachedViewById(R.id.cwr);
            o.LJIIIIZZ(end_text_edit_text, "end_text_edit_text");
            LiveIconView end_text_clear_icon = (LiveIconView) _$_findCachedViewById(R.id.cwp);
            o.LJIIIIZZ(end_text_clear_icon, "end_text_clear_icon");
            Ml(end_text_edit_text, end_text_clear_icon, new AqS179S0100000_13(this, 395));
            C80133Vcf c80133Vcf3 = (C80133Vcf) _$_findCachedViewById(R.id.cwk);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            int LIZ3 = C15380j0.LIZ(4.0f);
            gradientDrawable3.setSize(LIZ3, LIZ3);
            c80133Vcf3.setDividerDrawable(gradientDrawable3);
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.cwi), new ACListenerS33S0100000_13(this, 138));
            LiveEditText spark_loading_height_edit_text = (LiveEditText) _$_findCachedViewById(R.id.k8u);
            o.LJIIIIZZ(spark_loading_height_edit_text, "spark_loading_height_edit_text");
            LiveIconView spark_loading_height_clear_icon = (LiveIconView) _$_findCachedViewById(R.id.k8t);
            o.LJIIIIZZ(spark_loading_height_clear_icon, "spark_loading_height_clear_icon");
            Ml(spark_loading_height_edit_text, spark_loading_height_clear_icon, null);
            C80133Vcf spark_loading_height_selector = (C80133Vcf) _$_findCachedViewById(R.id.k8v);
            o.LJIIIIZZ(spark_loading_height_selector, "spark_loading_height_selector");
            Nl(spark_loading_height_selector, true, new AqS179S0100000_13(this, 333));
            LiveEditText spark_offline_loading_height_edit_text = (LiveEditText) _$_findCachedViewById(R.id.k90);
            o.LJIIIIZZ(spark_offline_loading_height_edit_text, "spark_offline_loading_height_edit_text");
            LiveIconView spark_offline_loading_height_clear_icon = (LiveIconView) _$_findCachedViewById(R.id.k8z);
            o.LJIIIIZZ(spark_offline_loading_height_clear_icon, "spark_offline_loading_height_clear_icon");
            Ml(spark_offline_loading_height_edit_text, spark_offline_loading_height_clear_icon, null);
            C80133Vcf spark_offline_loading_height_selector = (C80133Vcf) _$_findCachedViewById(R.id.k91);
            o.LJIIIIZZ(spark_offline_loading_height_selector, "spark_offline_loading_height_selector");
            Nl(spark_offline_loading_height_selector, true, new AqS179S0100000_13(this, 334));
            LiveEditText schema_edit_text = (LiveEditText) _$_findCachedViewById(R.id.jbs);
            o.LJIIIIZZ(schema_edit_text, "schema_edit_text");
            LiveIconView schema_clear_icon = (LiveIconView) _$_findCachedViewById(R.id.jbr);
            o.LJIIIIZZ(schema_clear_icon, "schema_clear_icon");
            Ml(schema_edit_text, schema_clear_icon, null);
            String LIZJ = InterfaceC30442Bx8.v2.LIZJ();
            if (LIZJ != null && !ujb.o.LJJJJJL(LIZJ)) {
                ((TextView) _$_findCachedViewById(R.id.jbs)).setText(LIZJ);
                ((EditText) _$_findCachedViewById(R.id.jbs)).setSelection(LIZJ.length());
            }
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.jbt), new ACListenerS33S0100000_13(this, 86));
            LiveEditText lorem_text_edit_text = (LiveEditText) _$_findCachedViewById(R.id.g_s);
            o.LJIIIIZZ(lorem_text_edit_text, "lorem_text_edit_text");
            LiveIconView lorem_text_clear_icon = (LiveIconView) _$_findCachedViewById(R.id.g_r);
            o.LJIIIIZZ(lorem_text_clear_icon, "lorem_text_clear_icon");
            Ml(lorem_text_edit_text, lorem_text_clear_icon, null);
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.heu), new ACListenerS47S0200000_13(view, this, 4));
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.gya), new ACListenerS47S0200000_13(view, this, 5));
            String valueOf = String.valueOf(((C19K) _$_findCachedViewById(R.id.k8u)).getText());
            if (ujb.o.LJJJJJL(valueOf)) {
                valueOf = "";
            }
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.k94), new ViewOnClickListenerC77360UXs(valueOf, this));
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.k8w), new ACListenerS33S0100000_13(this, 87));
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.k93), new ACListenerS33S0100000_13(this, 90));
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.k92), new ACListenerS33S0100000_13(this, 91));
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.g_q), new ViewOnClickListenerC77361UXt(view, this));
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.g_p), new ViewOnClickListenerC77362UXu(view, this));
        }
    }

    public static void Ml(LiveEditText liveEditText, LiveIconView liveIconView, InterfaceC88472Yns interfaceC88472Yns) {
        liveEditText.addTextChangedListener(new GQA(liveIconView, interfaceC88472Yns));
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(liveEditText, 137), liveIconView);
    }

    public static void Nl(C80133Vcf c80133Vcf, boolean z, InterfaceC88472Yns interfaceC88472Yns) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int LIZ = C15380j0.LIZ(4.0f);
        gradientDrawable.setSize(LIZ, LIZ);
        c80133Vcf.setDividerDrawable(gradientDrawable);
        int childCount = c80133Vcf.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c80133Vcf.getChildAt(i);
            o.LJIIIIZZ(childAt, "getChildAt(index)");
            C16880lQ.LJIIJ(new ACListenerS22S0210000_13(c80133Vcf, interfaceC88472Yns, z, 0), childAt);
        }
    }

    public final View Pl(TextIconItem textIconItem, InterfaceC88471Ynr<? super TextIconItem, ? super View, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super TextIconItem, ? super View, C76800UCe> interfaceC88471Ynr2) {
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.d9t, getLayoutInflater(), null);
        o.LJIIIIZZ(LLLZIIL, "layoutInflater.inflate(R…_item_text_or_icon, null)");
        TextView textView = (TextView) LLLZIIL.findViewById(R.id.ev9);
        LiveIconView liveIconView = (LiveIconView) LLLZIIL.findViewById(R.id.eu5);
        View findViewById = LLLZIIL.findViewById(R.id.c6d);
        String str = textIconItem.text;
        if (str != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        Integer num = textIconItem.id;
        if (num != null) {
            liveIconView.setIcon(num.intValue());
            liveIconView.setVisibility(0);
        }
        C16880lQ.LJIIJ(new ACListenerS38S0300000_13(interfaceC88471Ynr2, textIconItem, LLLZIIL, 2), findViewById);
        interfaceC88471Ynr.invoke(textIconItem, LLLZIIL);
        return LLLZIIL;
    }
}
