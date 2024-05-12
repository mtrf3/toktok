package com.zhihu.matisse.internal.ui;

import X.ActivityC45651qj;
import X.C09N;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29680Bkq;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C81038VrG;
import X.C81046VrO;
import X.C81055VrX;
import X.C90903hW;
import X.InterfaceC81042VrK;
import X.InterfaceC81045VrN;
import X.InterfaceC81048VrQ;
import X.InterfaceC81049VrR;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class MediaSelectionFragment extends Fragment implements InterfaceC81048VrQ, InterfaceC81045VrN, InterfaceC81042VrK {
    public final C81046VrO LJLIL = new C81046VrO();
    public RecyclerView LJLILLLLZI;
    public C81038VrG LJLJI;
    public InterfaceC81049VrR LJLJJI;
    public InterfaceC81045VrN LJLJJL;
    public InterfaceC81042VrK LJLJJLL;

    @Override // X.InterfaceC81045VrN
    public final void LJIILLIIL() {
        InterfaceC81045VrN interfaceC81045VrN = this.LJLJJL;
        if (interfaceC81045VrN != null) {
            interfaceC81045VrN.LJIILLIIL();
        }
    }

    @Override // X.InterfaceC81048VrQ
    public final void i3() {
        this.LJLJI.LJLLLLLL(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C81046VrO c81046VrO = this.LJLIL;
        C09N c09n = c81046VrO.LIZIZ;
        if (c09n != null) {
            c09n.LIZ(2);
        }
        c81046VrO.LIZJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Parcelable parcelable = getArguments().getParcelable("extra_album");
        C81038VrG c81038VrG = new C81038VrG(getContext(), this.LJLJJI.LJJJI(), this.LJLILLLLZI);
        this.LJLJI = c81038VrG;
        c81038VrG.LJLJJL = this;
        c81038VrG.LJLJJLL = this;
        this.LJLILLLLZI.setHasFixedSize(true);
        int i = C81055VrX.LIZ.LJIIIIZZ;
        RecyclerView recyclerView = this.LJLILLLLZI;
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(i));
        this.LJLILLLLZI.LJII(new C29680Bkq(i, getResources().getDimensionPixelSize(R.dimen.z_)), -1);
        this.LJLILLLLZI.setAdapter(this.LJLJI);
        C81046VrO c81046VrO = this.LJLIL;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c81046VrO.getClass();
        c81046VrO.LIZ = new WeakReference<>(mo49getActivity);
        c81046VrO.LIZIZ = mo49getActivity.getSupportLoaderManager();
        c81046VrO.LIZJ = this;
        C81046VrO c81046VrO2 = this.LJLIL;
        c81046VrO2.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("args_album", parcelable);
        bundle2.putBoolean("args_enable_capture", false);
        c81046VrO2.LIZIZ.LIZJ(2, bundle2, c81046VrO2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InterfaceC81049VrR) {
            this.LJLJJI = (InterfaceC81049VrR) context;
            if (context instanceof InterfaceC81045VrN) {
                this.LJLJJL = (InterfaceC81045VrN) context;
            }
            if (context instanceof InterfaceC81042VrK) {
                this.LJLJJLL = (InterfaceC81042VrK) context;
                return;
            }
            return;
        }
        throw new IllegalStateException("Context must implement SelectionProvider.");
    }

    @Override // X.InterfaceC81048VrQ
    public final void rd(Cursor cursor) {
        this.LJLJI.LJLLLLLL(cursor);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LJLILLLLZI = (RecyclerView) view.findViewById(R.id.ist);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awn, viewGroup, false);
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

    @Override // X.InterfaceC81042VrK
    public final void rf(Album album, Item item, int i) {
        InterfaceC81042VrK interfaceC81042VrK = this.LJLJJLL;
        if (interfaceC81042VrK != null) {
            interfaceC81042VrK.rf((Album) getArguments().getParcelable("extra_album"), item, i);
        }
    }
}
