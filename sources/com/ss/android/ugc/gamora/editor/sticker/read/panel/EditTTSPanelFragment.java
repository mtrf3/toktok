package com.ss.android.ugc.gamora.editor.sticker.read.panel;

import X.ActivityC45651qj;
import X.C0A2;
import X.C10A;
import X.C141335gf;
import X.C158786La;
import X.C161806Wq;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C6LY;
import X.C76800UCe;
import X.C90903hW;
import Y.ARunnableS38S0100000_2;
import Y.IDrS42S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditTTSPanelFragment extends Fragment {
    public static final /* synthetic */ int LJLJL = 0;
    public C161806Wq LJLIL;
    public C6LY LJLJI;
    public C158786La LJLJJI;
    public IDrS42S0100000_2 LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final List<ReadTextEffectBean> LJLILLLLZI = new ArrayList();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        IDrS42S0100000_2 iDrS42S0100000_2 = this.LJLJJL;
        if (iDrS42S0100000_2 != null) {
            C161806Wq c161806Wq = this.LJLIL;
            if (c161806Wq != null) {
                c161806Wq.LJJLL(iDrS42S0100000_2);
            } else {
                o.LJIJI("recycleView");
                throw null;
            }
        }
        this.LJLJJL = null;
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    public final void vl(boolean z) {
        Bundle arguments;
        C161806Wq c161806Wq = this.LJLIL;
        if (c161806Wq != null && (c161806Wq.getLayoutManager() instanceof GridLayoutManager)) {
            C161806Wq c161806Wq2 = this.LJLIL;
            if (c161806Wq2 != null) {
                C0A2 layoutManager = c161806Wq2.getLayoutManager();
                o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int LLILL = linearLayoutManager.LLILL();
                int LLILLJJLI = linearLayoutManager.LLILLJJLI();
                if (LLILL >= 0 && LLILLJJLI < ((ArrayList) this.LJLILLLLZI).size() && (arguments = getArguments()) != null) {
                    ArrayList<ReadTextEffectBean> arrayList = new ArrayList<>(((ArrayList) this.LJLILLLLZI).subList(LLILL, LLILLJJLI + 1));
                    C6LY c6ly = this.LJLJI;
                    if (c6ly != null) {
                        c6ly.LLIIII(arrayList, arguments.getInt("POSITION"), z);
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("recycleView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList arrayList;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (getArguments() != null && ((ArrayList) this.LJLILLLLZI).isEmpty()) {
            List<ReadTextEffectBean> list = this.LJLILLLLZI;
            Bundle arguments = getArguments();
            if (arguments == null || (arrayList = arguments.getParcelableArrayList("DATA")) == null) {
                arrayList = new ArrayList();
            }
            ((ArrayList) list).addAll(arrayList);
        }
        View findViewById = view.findViewById(R.id.lt1);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tts_panel_rv)");
        this.LJLIL = (C161806Wq) findViewById;
        if (((ArrayList) this.LJLILLLLZI).isEmpty()) {
            C161806Wq c161806Wq = this.LJLIL;
            if (c161806Wq != null) {
                c161806Wq.setVisibility(8);
                return;
            } else {
                o.LJIJI("recycleView");
                throw null;
            }
        }
        C161806Wq c161806Wq2 = this.LJLIL;
        if (c161806Wq2 != null) {
            getContext();
            c161806Wq2.setLayoutManager(new GridLayoutManager(2));
            C158786La c158786La = new C158786La(this);
            this.LJLJJI = c158786La;
            c158786La.setHasStableIds(true);
            C161806Wq c161806Wq3 = this.LJLIL;
            if (c161806Wq3 != null) {
                c161806Wq3.setAdapter(this.LJLJJI);
                C161806Wq c161806Wq4 = this.LJLIL;
                if (c161806Wq4 != null) {
                    c161806Wq4.setItemAnimator(null);
                    IDrS42S0100000_2 iDrS42S0100000_2 = new IDrS42S0100000_2(this, 1);
                    this.LJLJJL = iDrS42S0100000_2;
                    C161806Wq c161806Wq5 = this.LJLIL;
                    if (c161806Wq5 != null) {
                        c161806Wq5.LJIIJJI(iDrS42S0100000_2);
                        C161806Wq c161806Wq6 = this.LJLIL;
                        if (c161806Wq6 != null) {
                            c161806Wq6.post(new ARunnableS38S0100000_2(this, 111));
                            return;
                        } else {
                            o.LJIJI("recycleView");
                            throw null;
                        }
                    }
                    o.LJIJI("recycleView");
                    throw null;
                }
                o.LJIJI("recycleView");
                throw null;
            }
            o.LJIJI("recycleView");
            throw null;
        }
        o.LJIJI("recycleView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cct, viewGroup, false);
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
