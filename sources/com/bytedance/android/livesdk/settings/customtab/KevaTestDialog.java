package com.bytedance.android.livesdk.settings.customtab;

import X.C09650Zl;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C28507BGt;
import X.C29306Beo;
import X.C2A7;
import X.C48459J0d;
import X.ORZ;
import X.UFA;
import X.X1D;
import Y.ACListenerS33S0100000_13;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes14.dex */
public class KevaTestDialog extends LiveDialogFragment {
    public static final Gson LJLJJL;
    public static C48459J0d<?> LJLJJLL;
    public UFA LJLIL;
    public C2A7 LJLILLLLZI;
    public LiveEditText LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    static {
        Gson gson = C09650Zl.LIZIZ;
        o.LJIIIIZZ(gson, "get()");
        LJLJJL = gson;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d_l);
        c28507BGt.LJIILIIL = 48;
        c28507BGt.LJII = 17;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    public final void vl() {
        LiveEditText liveEditText = this.LJLJI;
        if (liveEditText != null) {
            C29306Beo.LJII(liveEditText);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Object LIZJ;
        Object LIZJ2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.m_5);
        TextView textView2 = (TextView) view.findViewById(R.id.mq3);
        LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.d00);
        this.LJLJI = liveEditText;
        C48459J0d<?> c48459J0d = LJLJJLL;
        Class<?> cls = null;
        if (c48459J0d != null && (LIZJ2 = c48459J0d.LIZJ()) != null) {
            cls = LIZJ2.getClass();
        }
        Object LLFF = ORZ.LLFF(s.LJLJJL(String.valueOf(cls), new String[]{"."}, 0, 6));
        Object obj = "";
        if (textView != null) {
            Object[] objArr = new Object[1];
            C48459J0d<?> c48459J0d2 = LJLJJLL;
            if (c48459J0d2 == null || (str = c48459J0d2.LIZJ) == null) {
                str = "";
            }
            objArr[0] = str;
            textView.setText(C15380j0.LJIILL(R.string.t0w, objArr));
        }
        if (textView2 != null) {
            textView2.setText(C15380j0.LJIILL(R.string.t0y, LLFF));
        }
        C48459J0d<?> c48459J0d3 = LJLJJLL;
        if (c48459J0d3 != null && (LIZJ = c48459J0d3.LIZJ()) != null) {
            obj = LIZJ;
        }
        if (!(obj instanceof Object[]) && !(obj instanceof Integer) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Long) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof String) && !(obj instanceof HashMap)) {
            try {
                Object LJIILL = LJLJJL.LJIILL(obj);
                o.LJIIIIZZ(LJIILL, "gson.toJson(value)");
                obj = LJIILL;
            } catch (Exception unused) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("parse to json error. value is ");
                LIZ.append(obj);
                C0NB.LJ("KevaDebugFragment", X1D.LIZIZ(LIZ));
            }
        }
        if (liveEditText != null) {
            liveEditText.setText(String.valueOf(obj));
        }
        this.LJLILLLLZI = (C2A7) view.findViewById(R.id.ayr);
        C2A7 c2a7 = (C2A7) view.findViewById(R.id.av8);
        C2A7 c2a72 = this.LJLILLLLZI;
        if (c2a72 != null) {
            C16880lQ.LJJIII(c2a72, new ACListenerS33S0100000_13(this, 119));
        }
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS33S0100000_13(this, 85));
        }
    }
}
