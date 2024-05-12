package X;

import Y.ACListenerS34S0100000_14;
import Y.IDObjectS185S0100000_14;
import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.ugc.effectplatform.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Wqj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83553Wqj extends C83551Wqh {
    public FrameLayout.LayoutParams LJLLILLLL;
    public RecyclerView LJLLJ;
    public C85583Xm LJLLL;
    public final Effect LJLLLL;

    @Override // X.C83551Wqh
    public int getLayout() {
        return R.layout.blw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        if (0 != 0) goto L22;
     */
    @Override // X.C83551Wqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r7 = this;
            X.3Xm r0 = r7.LJLLL
            r6 = 0
            if (r0 == 0) goto L76
            int r0 = r0.getItemCount()
            if (r0 != 0) goto L76
            com.ss.ugc.effectplatform.model.Effect r0 = r7.LJLLLL
            r5 = 0
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.getSdk_extra()
            if (r0 != 0) goto L23
        L16:
            androidx.recyclerview.widget.RecyclerView r1 = r7.LJLLJ
            if (r1 == 0) goto L1f
            r0 = 8
            r1.setVisibility(r0)
        L1f:
            super.LIZLLL()
            return
        L23:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4b
            r1.<init>(r0)     // Catch: org.json.JSONException -> L4b
            java.lang.String r0 = "recommend_tag"
            org.json.JSONArray r4 = r1.optJSONArray(r0)     // Catch: org.json.JSONException -> L4b
            if (r4 == 0) goto L16
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: org.json.JSONException -> L4b
            r3.<init>()     // Catch: org.json.JSONException -> L4b
            int r2 = r4.length()     // Catch: org.json.JSONException -> L4b
            r1 = 0
        L3a:
            if (r1 >= r2) goto L49
            java.lang.String r0 = r4.optString(r1)     // Catch: org.json.JSONException -> L4b
            r0.toString()     // Catch: org.json.JSONException -> L4b
            r3.add(r0)     // Catch: org.json.JSONException -> L4b
            int r1 = r1 + 1
            goto L3a
        L49:
            r5 = r3
            goto L4d
        L4b:
            if (r5 == 0) goto L16
        L4d:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L54
            goto L16
        L54:
            androidx.recyclerview.widget.RecyclerView r0 = r7.LJLLJ
            if (r0 == 0) goto L5b
            r0.setVisibility(r6)
        L5b:
            X.3Xm r1 = r7.LJLLL
            if (r1 == 0) goto L1f
            java.lang.String r0 = "dataList"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.List<java.lang.String> r0 = r1.LJLIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<java.lang.String> r0 = r1.LJLIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r5)
            r1.notifyDataSetChanged()
            goto L1f
        L76:
            androidx.recyclerview.widget.RecyclerView r0 = r7.LJLLJ
            if (r0 == 0) goto L1f
            r0.LJLI(r6)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83553Wqj.LIZLLL():void");
    }

    @Override // X.C83551Wqh
    public TextWatcher getTextWatcher() {
        return new IDObjectS185S0100000_14(this, 6);
    }

    @Override // X.C83551Wqh
    public final void LIZJ() {
        InterfaceC83565Wqv interfaceC83565Wqv;
        LIZ();
        String str = this.LJLJLLL;
        if (str != null && (interfaceC83565Wqv = this.LJLJJLL) != null) {
            interfaceC83565Wqv.LIZ(str);
        }
        setVisibility(8);
    }

    public final C85583Xm getAdapter() {
        return this.LJLLL;
    }

    public final Effect getEffect() {
        return this.LJLLLL;
    }

    public final RecyclerView getMHashList() {
        return this.LJLLJ;
    }

    public final FrameLayout.LayoutParams getParams() {
        return this.LJLLILLLL;
    }

    @Override // X.C83551Wqh
    public final void LIZIZ(C29S c29s) {
        super.LIZIZ(c29s);
        RecyclerView recyclerView = (RecyclerView) this.LJLJI.findViewById(R.id.e2k);
        this.LJLLJ = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        }
        C85583Xm c85583Xm = new C85583Xm();
        this.LJLLL = c85583Xm;
        c85583Xm.LJLILLLLZI = new C83557Wqn(this);
        RecyclerView recyclerView2 = this.LJLLJ;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c85583Xm);
        }
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS34S0100000_14(this, 94)));
    }

    @Override // X.C83551Wqh
    public final void LJ(int i) {
        EditText editText = this.LJLIL;
        if (editText != null) {
            FrameLayout.LayoutParams layoutParams = this.LJLLILLLL;
            Context context = editText.getContext();
            o.LJIIIIZZ(context, "it.context");
            layoutParams.bottomMargin = (int) (C74275TDb.LIZIZ(context, 14.0f) + i);
            editText.setLayoutParams(this.LJLLILLLL);
        }
        RecyclerView recyclerView = this.LJLLJ;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            if (layoutParams2 != null) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                Context context2 = recyclerView.getContext();
                o.LJIIIIZZ(context2, "it.context");
                layoutParams3.bottomMargin = (int) (C74275TDb.LIZIZ(context2, 61.0f) + i);
                recyclerView.setLayoutParams(layoutParams3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        InterfaceC65784Pro<Integer> interfaceC65784Pro = this.LJLL;
        if (interfaceC65784Pro != null) {
            View titleLayout = this.LJLJJI;
            o.LJIIIIZZ(titleLayout, "titleLayout");
            ViewGroup.LayoutParams layoutParams4 = titleLayout.getLayoutParams();
            if (layoutParams4 != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                Integer invoke = interfaceC65784Pro.invoke();
                o.LJIIIIZZ(invoke, "it()");
                layoutParams5.topMargin = invoke.intValue();
                View titleLayout2 = this.LJLJJI;
                o.LJIIIIZZ(titleLayout2, "titleLayout");
                titleLayout2.setLayoutParams(layoutParams5);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public final void setAdapter(C85583Xm c85583Xm) {
        this.LJLLL = c85583Xm;
    }

    public final void setMHashList(RecyclerView recyclerView) {
        this.LJLLJ = recyclerView;
    }

    public final void setParams(FrameLayout.LayoutParams layoutParams) {
        o.LJIIIZ(layoutParams, "<set-?>");
        this.LJLLILLLL = layoutParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83553Wqj(C29S context, com.ss.android.ugc.effectmanager.effect.model.Effect effect) {
        super(context, null);
        o.LJIIIZ(context, "context");
        this.LJLLLL = effect;
        EditText editView = this.LJLIL;
        o.LJIIIIZZ(editView, "editView");
        ViewGroup.LayoutParams layoutParams = editView.getLayoutParams();
        if (layoutParams != null) {
            this.LJLLILLLL = (FrameLayout.LayoutParams) layoutParams;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
