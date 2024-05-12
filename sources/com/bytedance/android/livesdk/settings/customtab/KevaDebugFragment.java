package com.bytedance.android.livesdk.settings.customtab;

import X.ActivityC45651qj;
import X.C023107f;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C259910h;
import X.C29S;
import X.C2A7;
import X.C30554Byw;
import X.C3C5;
import X.C47121t6;
import X.C48459J0d;
import X.C76800UCe;
import X.C78920UyC;
import X.C90903hW;
import X.InterfaceC30442Bx8;
import X.UF6;
import X.UF8;
import X.X1D;
import Y.ACListenerS30S0100000_10;
import Y.IDObjectS184S0100000_13;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes14.dex */
public final class KevaDebugFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJL = 0;
    public RecyclerView LJLIL;
    public LiveEditText LJLILLLLZI;
    public C2A7 LJLJI;
    public UF6 LJLJJI;
    public final List<UF8> LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public KevaDebugFragment() {
        ArrayList arrayList = new ArrayList();
        Field[] fs = InterfaceC30442Bx8.class.getDeclaredFields();
        o.LJIIIIZZ(fs, "fs");
        for (Field field : fs) {
            field.setAccessible(true);
            Object obj = field.get(InterfaceC30442Bx8.class);
            if (obj instanceof C48459J0d) {
                C48459J0d c48459J0d = (C48459J0d) obj;
                String str = c48459J0d.LIZJ;
                o.LJIIIIZZ(str, "fieldObj.name");
                Object LIZJ = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ, "fieldObj.value");
                T t = c48459J0d.LJFF;
                o.LJIIIIZZ(t, "fieldObj.defaultValue");
                arrayList.add(new UF8(LIZJ, t, str));
            }
            if (obj instanceof C30554Byw) {
                C48459J0d<HashMap<String, V>> c48459J0d2 = ((C30554Byw) obj).LIZ;
                String str2 = c48459J0d2.LIZJ;
                o.LJIIIIZZ(str2, "pluginProperty.name");
                Object LIZJ2 = c48459J0d2.LIZJ();
                o.LJIIIIZZ(LIZJ2, "pluginProperty.value");
                T t2 = c48459J0d2.LJFF;
                o.LJIIIIZZ(t2, "pluginProperty.defaultValue");
                arrayList.add(new UF8(LIZJ2, t2, str2));
            }
        }
        this.LJLJJL = arrayList;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public final void vl(Editable editable) {
        if (editable == null) {
            return;
        }
        String charSequence = s.LJZI(String.valueOf(editable)).toString();
        List<UF8> list = this.LJLJJL;
        ArrayList arrayList = new ArrayList();
        for (UF8 uf8 : list) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("(?i)");
            LIZ.append(Pattern.quote(charSequence));
            Pattern compile = PatternProtector.compile(X1D.LIZIZ(LIZ));
            String str = uf8.LIZ;
            if (str == null) {
                str = "";
            }
            if (compile.matcher(str).find()) {
                arrayList.add(uf8);
            }
        }
        UF6 uf6 = this.LJLJJI;
        if (uf6 != null) {
            uf6.LJLIL = arrayList;
            uf6.notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("EnterFrom")) == null) {
            str = "enter_live_setting";
        }
        C78920UyC.LJI("keva_manager_use", str, "enter_from");
        C2A7 c2a7 = this.LJLJI;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS30S0100000_10(this, 8));
        }
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = (LiveEditText) view.findViewWithTag("search_view");
        }
        LiveEditText liveEditText = this.LJLILLLLZI;
        if (liveEditText != null) {
            liveEditText.addTextChangedListener(new IDObjectS184S0100000_13(this, 0));
        }
        if (this.LJLIL == null) {
            this.LJLIL = (RecyclerView) view.findViewWithTag("recycler_view");
        }
        this.LJLJJI = new UF6(this.LJLJJL, new AqS195S0100000_13(this, 19));
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        RecyclerView recyclerView2 = this.LJLIL;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.setAdapter(this.LJLJJI);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        o.LJIIIZ(inflater, "inflater");
        LinearLayout linearLayout = new LinearLayout(inflater.getContext());
        linearLayout.setBackground(C15380j0.LJI(R.drawable.cgp));
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C29S c29s = null;
        C47121t6 c47121t6 = new C47121t6(inflater.getContext(), null);
        C023107f.LJII(c47121t6, R.style.ok);
        c47121t6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c47121t6.setPadding(C15380j0.LIZ(16.0f), C15380j0.LIZ(8.0f), C15380j0.LIZ(16.0f), C15380j0.LIZ(8.0f));
        c47121t6.setText(C15380j0.LJIILJJIL(R.string.t10));
        c47121t6.setBackgroundColor(ColorProtector.parseColor("#55112233"));
        c47121t6.setTextColor(-1);
        linearLayout.addView(c47121t6);
        C2A7 c2a7 = new C2A7(inflater.getContext(), null);
        c2a7.setText("Reset all");
        c2a7.LJJLL(R.style.a2z);
        this.LJLJI = c2a7;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C15380j0.LIZ(50.0f));
        layoutParams.leftMargin = C15380j0.LIZ(20.0f);
        layoutParams.rightMargin = C15380j0.LIZ(20.0f);
        layoutParams.topMargin = C15380j0.LIZ(20.0f);
        layoutParams.bottomMargin = C15380j0.LIZ(20.0f);
        c2a7.setLayoutParams(layoutParams);
        linearLayout.addView(this.LJLJI);
        LiveEditText liveEditText = new LiveEditText(inflater.getContext(), null);
        this.LJLILLLLZI = liveEditText;
        C023107f.LJII(liveEditText, R.style.on);
        liveEditText.setTag("search_view");
        liveEditText.setLayoutParams(new LinearLayout.LayoutParams(-1, C15380j0.LIZ(50.0f)));
        liveEditText.setPadding(C15380j0.LIZ(16.0f), 0, C15380j0.LIZ(16.0f), 0);
        liveEditText.setMaxLines(1);
        liveEditText.setGravity(16);
        liveEditText.setHint("input search keywords");
        liveEditText.setSingleLine();
        liveEditText.setFocusable(true);
        liveEditText.setFocusableInTouchMode(true);
        linearLayout.addView(this.LJLILLLLZI);
        liveEditText.setBackgroundColor(C259910h.LIZIZ(R.attr.bm8, liveEditText.getContext()));
        liveEditText.setImeOptions(3);
        liveEditText.requestFocus();
        RecyclerView recyclerView2 = new RecyclerView(inflater.getContext(), null);
        this.LJLIL = recyclerView2;
        recyclerView2.setTag("recycler_view");
        RecyclerView recyclerView3 = this.LJLIL;
        if (recyclerView3 != null) {
            recyclerView3.setScrollBarSize(C15380j0.LIZ(3.0f));
        }
        if (Build.VERSION.SDK_INT >= 29 && (recyclerView = this.LJLIL) != null) {
            recyclerView.setVerticalScrollbarThumbDrawable(new ColorDrawable(-7829368));
        }
        RecyclerView recyclerView4 = this.LJLIL;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        }
        linearLayout.addView(this.LJLIL);
        try {
            ViewTreeLifecycleOwner.set(linearLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(linearLayout, this);
            C10A.LIZIZ(linearLayout, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return linearLayout;
    }
}
