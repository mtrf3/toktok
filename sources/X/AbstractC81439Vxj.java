package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Vxj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81439Vxj extends WMH {
    public ViewGroup LJLIL;
    public LayoutInflater LJLILLLLZI;
    public Context LJLJI;
    public int LJLJJI = -1;
    public int LJLJJL = -1;

    public abstract ViewGroup LLJILJIL();

    @Override // X.WM7
    public final LayoutInflater onGetLayoutInflater() {
        if (this.mActivity != null) {
            LayoutInflater layoutInflater = this.LJLILLLLZI;
            if (layoutInflater != null) {
                return layoutInflater;
            }
            return super.onGetLayoutInflater();
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Scene is attached to the Activity.");
    }

    @Override // X.WM7
    public final Context onGetSceneContext() {
        Context context = this.LJLJI;
        if (context != null) {
            return context;
        }
        return super.onGetSceneContext();
    }

    @Override // X.WM7
    public final void onAttach() {
        super.onAttach();
        int i = this.LJLJJI;
        if (i == -1 && this.LJLJJL == -1) {
            return;
        }
        if (i != requireActivity().hashCode() || this.LJLJJL != requireActivity().getTheme().hashCode()) {
            this.LJLIL = null;
            this.LJLILLLLZI = null;
            this.LJLJI = null;
        }
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLJJI = requireActivity().hashCode();
        this.LJLJJL = requireActivity().getTheme().hashCode();
        this.LJLILLLLZI = getLayoutInflater();
        this.LJLJI = requireSceneContext();
        this.LJLIL = (ViewGroup) this.mView;
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = this.LJLIL;
        if (viewGroup2 == null || viewGroup2.getParent() == null) {
            ViewGroup viewGroup3 = this.LJLIL;
            if (viewGroup3 != null) {
                return viewGroup3;
            }
            return LLJILJIL();
        }
        throw new IllegalArgumentException("ReuseGroupScene reuseView already have parent");
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
