package com.bytedance.android.livesdk.comp.impl.game.ui;

import X.BJM;
import X.C05590Jv;
import X.C0NB;
import X.C113554cx;
import X.C141335gf;
import X.C15380j0;
import X.C15650jR;
import X.C16880lQ;
import X.C28507BGt;
import X.C29306Beo;
import X.C29682Bks;
import X.C29683Bkt;
import X.C2A7;
import X.C38350F3i;
import X.C3C5;
import X.C47121t6;
import X.C72818Shy;
import X.C76800UCe;
import X.C78720Uuy;
import X.C78924UyG;
import X.C792939h;
import X.CN1;
import X.InterfaceC06390Mx;
import X.InterfaceC60761Nsz;
import X.OSZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.UHC;
import X.UHE;
import X.UZG;
import X.UZI;
import X.VUI;
import X.X1D;
import Y.ACListenerS33S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.IDqS7S1000000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class GameShortVideoAdDetailPageDialogFragment extends LiveDialogFragment {
    public static final float LLIFFJFJJ;
    public static final int LLII;
    public static final int LLIIII;
    public static final int LLIIIILZ;
    public static final int LLIIIJ;
    public float LJLIL;
    public LiveIconView LJLILLLLZI;
    public C2A7 LJLJI;
    public BottomSheetBehavior<?> LJLJJI;
    public int LJLJJL;
    public View LJLJJLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJL;
    public UZI LJLJLJ;
    public VUI LJLJLLL;
    public WebKitView LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public ViewGroup LJLLJ;
    public View LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public boolean LJZ;
    public int LJZI;
    public float LLD;
    public C47121t6 LLFF;
    public long LLFFF;
    public final Map<Integer, View> LLI = new LinkedHashMap();
    public String LJZL = "";
    public String LL = "{}";
    public String LLF = "";
    public final UHE LLFII = new UHE();
    public final UZG LLFZ = new UZG(this);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLI;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d0s);
        c28507BGt.LIZIZ = 1;
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJIIIZ = -1;
        return c28507BGt;
    }

    public final void xl() {
        float f;
        View view = this.LJLLL;
        if (view != null) {
            f = view.getAlpha();
        } else {
            f = 0.0f;
        }
        if (f > 0.1f) {
            C29306Beo.LJJLJLI(this.LJLILLLLZI);
            View view2 = this.LJLLILLLL;
            if (view2 != null) {
                C29306Beo.LJIIIZ(view2);
            }
            LiveIconView liveIconView = this.LJLILLLLZI;
            if (liveIconView != null) {
                liveIconView.setIconTint(C15380j0.LIZIZ(R.color.ey));
                return;
            }
            return;
        }
        View view3 = this.LJLLI;
        if (view3 != null && view3.getAlpha() > 0.1f) {
            C29306Beo.LJJLJLI(this.LJLILLLLZI);
            View view4 = this.LJLLILLLL;
            if (view4 != null) {
                C29306Beo.LJJLJLI(view4);
            }
            LiveIconView liveIconView2 = this.LJLILLLLZI;
            if (liveIconView2 != null) {
                liveIconView2.setIconTint(C15380j0.LIZIZ(R.color.acm));
                return;
            }
            return;
        }
        View view5 = this.LJLLILLLL;
        if (view5 != null) {
            C29306Beo.LJIIIZ(view5);
        }
        C29306Beo.LJIIIZ(this.LJLILLLLZI);
    }

    static {
        C15380j0.LJIIJJI();
        C15380j0.LJIILIIL();
        LLIFFJFJJ = (C15380j0.LJIIJJI() - C15380j0.LJIILIIL()) * 0.1f;
        int LIZ = C15380j0.LIZ(44.0f) * 2;
        LLII = LIZ;
        LLIIII = LIZ * 2;
        LLIIIILZ = C15380j0.LIZ(210.0f);
        LLIIIJ = C15380j0.LIZ(14.0f);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("updateNavBarPartnershipDownloadButton", this.LLFZ);
        C72818Shy.LJII("loadHeaderImage", this.LLFZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC60761Nsz kitView;
        super.onPause();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.LJIIIZ("viewDisappeared", null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC60761Nsz kitView;
        super.onResume();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.LJIIIZ("viewAppeared", null);
        }
    }

    public static VUI vl(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0 || !(C78924UyG.LIZJ(viewGroup) instanceof ViewGroup)) {
            return null;
        }
        if (C78924UyG.LIZJ(viewGroup) instanceof VUI) {
            return (VUI) C78924UyG.LIZJ(viewGroup);
        }
        return vl((ViewGroup) C78924UyG.LIZJ(viewGroup));
    }

    public final void Al(float f) {
        View childAt;
        ViewGroup viewGroup = this.LJLLJ;
        if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
            childAt.setAlpha(f);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateHeaderCoverAlpha = ");
        LIZ.append(f);
        C0NB.LIZIZ("GameShortVideoAdDetailFragment", X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        float f;
        String str2;
        Float LJJIJLIJ;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str3 = "";
        if (arguments == null || (str = arguments.getString("lynx_schema")) == null) {
            str = "";
        }
        C29682Bks LIZ = C29683Bkt.LIZ(str);
        String LIZIZ = LIZ.LIZIZ("initial_height_ratio");
        if (LIZIZ != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(LIZIZ)) != null) {
            f = LJJIJLIJ.floatValue();
        } else {
            f = 0.0f;
        }
        this.LLD = f;
        String LIZIZ2 = LIZ.LIZIZ("header_image_url");
        if (LIZIZ2 == null) {
            LIZIZ2 = "";
        }
        this.LLF = LIZIZ2;
        String LIZIZ3 = LIZ.LIZIZ("log_extra_str");
        if (LIZIZ3 != null) {
            str3 = LIZIZ3;
        }
        if (str3.length() > 0) {
            try {
                new JSONObject(str3);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        LIZ.LJJI("is_new_game_container", "1");
        if (LIZ.LIZJ("fallback_url") && LIZ.LIZJ("fallback_url")) {
            ((HashMap) LIZ.LIZ).remove("fallback_url");
        }
        String uri = LIZ.LIZ().toString();
        o.LJIIIIZZ(uri, "schema.build().toString()");
        this.LJZL = uri;
        float f2 = this.LLD;
        if (f2 < 0.2d) {
            f2 = 0.6f;
        }
        this.LJLIL = (C15380j0.LJIIJJI() - C15380j0.LJIILIIL()) * f2;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("initial_data")) == null) {
            str2 = "{}";
        }
        this.LL = str2;
    }

    public final void wl(String str) {
        if (str.length() == 0) {
            return;
        }
        C78720Uuy LJ = C15650jR.LIZ().LJ(this.LLFII);
        LJ.setUrl(str);
        LJ.LJIJ = true;
        LJ.LJIIJJI(this.LJLLI);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLLI = view.findViewById(R.id.dqi);
        this.LJLILLLLZI = (LiveIconView) view.findViewById(R.id.e95);
        this.LJLJI = (C2A7) view.findViewById(R.id.cfp);
        LiveIconView liveIconView = this.LJLILLLLZI;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS33S0100000_13(this, 143));
        }
        C2A7 c2a7 = this.LJLJI;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS33S0100000_13(this, 144));
        }
        this.LLFF = (C47121t6) view.findViewById(R.id.m_1);
        this.LJLLILLLL = view.findViewById(R.id.e97);
        this.LJLJJLL = view.findViewById(R.id.el3);
        C792939h c792939h = (C792939h) view.findViewById(R.id.dqc);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.dqj);
        this.LJLLJ = viewGroup;
        if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            layoutParams.height = LLIIIILZ;
        }
        this.LJLLL = view.findViewById(R.id.dqb);
        BottomSheetBehavior<?> from = BottomSheetBehavior.from(c792939h);
        this.LJLJJI = from;
        if (from != null) {
            from.setHideable(true);
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LJLJJI;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setPeekHeight((int) this.LJLIL);
        }
        ViewGroup viewGroup2 = this.LJLLJ;
        if (viewGroup2 != null) {
            i = viewGroup2.getScrollY();
        } else {
            i = 0;
        }
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.LJLJJI;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.addBottomSheetCallback(new UHC(this, view, i));
        }
        if (c792939h != null) {
            c792939h.setClickActionListener(new AqS144S0200000_13(this, c792939h, 33));
        }
        View view2 = this.LJLLL;
        if (view2 != null) {
            view2.setAlpha(0.0f);
        }
        Al(0.0f);
        View view3 = this.LJLLILLLL;
        if (view3 != null) {
            C29306Beo.LJIIIZ(view3);
        }
        C29306Beo.LJIIIZ(this.LJLILLLLZI);
        C2A7 c2a72 = this.LJLJI;
        if (c2a72 != null) {
            C29306Beo.LJIIIZ(c2a72);
        }
        C47121t6 c47121t6 = this.LLFF;
        if (c47121t6 != null) {
            C29306Beo.LJIIIZ(c47121t6);
        }
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.gba);
        if (viewGroup3 != null) {
            Context context = viewGroup3.getContext();
            o.LJIIIIZZ(context, "pageContainer.context");
            String schema = this.LJZL;
            Map LJJL = C113554cx.LJJL(new OSZ("is_host", CardStruct.IStatusCode.DEFAULT), new OSZ("action_type", BJM.LIZLLL()), new OSZ("enter_method", BJM.LJIIIIZZ()), new OSZ("enter_from_merge", BJM.LJFF()), new OSZ("is_landscape", CardStruct.IStatusCode.DEFAULT), new OSZ("page_from", "icon"));
            String initialData = this.LL;
            o.LJIIIZ(schema, "schema");
            o.LJIIIZ(initialData, "initialData");
            C29682Bks LIZ = C29683Bkt.LIZ(schema);
            LIZ.LJJIFFI(LJJL);
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ2, "getService(IHybridContainerService::class.java)");
            String uri = LIZ.LIZ().toString();
            o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = C05590Jv.LIZIZ((IHybridContainerService) LIZ2, context, uri, false, new IDqS7S1000000(initialData, 4), 4);
            this.LJLJL = LIZIZ;
            viewGroup3.addView(LIZIZ, new ViewGroup.LayoutParams(-1, -1));
            wl(this.LLF);
        }
        C72818Shy.LIZLLL("updateNavBarPartnershipDownloadButton", this.LLFZ);
        C72818Shy.LIZLLL("loadHeaderImage", this.LLFZ);
    }
}
