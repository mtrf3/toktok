package androidx.fragment.app;

import X.ActivityC45651qj;
import X.C025408c;
import X.C10A;
import X.C141335gf;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import Y.IDRunnableS85S0100000;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class ListFragment extends Fragment {
    public final Handler LJLIL = new Handler();
    public final IDRunnableS85S0100000 LJLILLLLZI = new IDRunnableS85S0100000(this, 20);
    public final C025408c LJLJI = new AdapterView.OnItemClickListener() { // from class: X.08c
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ListFragment.this.getClass();
        }
    };
    public ListAdapter LJLJJI;
    public ListView LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public boolean LJLJLLL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LJLIL.removeCallbacks(this.LJLILLLLZI);
        this.LJLJJL = null;
        this.LJLJLLL = false;
        this.LJLJLJ = null;
        this.LJLJL = null;
        this.LJLJJLL = null;
        super.onDestroyView();
    }

    public final void vl() {
        if (this.LJLJJL != null) {
            return;
        }
        View view = getView();
        if (view != null) {
            if (view instanceof ListView) {
                this.LJLJJL = (ListView) view;
            } else {
                View findViewById = view.findViewById(16711681);
                if (findViewById == null) {
                    this.LJLJJLL = view.findViewById(R.id.empty);
                } else {
                    findViewById.setVisibility(8);
                }
                this.LJLJL = view.findViewById(16711682);
                this.LJLJLJ = view.findViewById(16711683);
                View findViewById2 = view.findViewById(R.id.list);
                if (!(findViewById2 instanceof ListView)) {
                    if (findViewById2 == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                ListView listView = (ListView) findViewById2;
                this.LJLJJL = listView;
                View view2 = this.LJLJJLL;
                if (view2 != null) {
                    listView.setEmptyView(view2);
                }
            }
            this.LJLJLLL = true;
            this.LJLJJL.setOnItemClickListener(this.LJLJI);
            ListAdapter listAdapter = this.LJLJJI;
            boolean z = false;
            if (listAdapter != null) {
                this.LJLJJI = listAdapter;
                ListView listView2 = this.LJLJJL;
                if (listView2 != null) {
                    listView2.setAdapter(listAdapter);
                    if (!this.LJLJLLL) {
                        if (requireView().getWindowToken() != null) {
                            z = true;
                        }
                        wl(true, z);
                    }
                }
            } else if (this.LJLJL != null) {
                wl(false, false);
            }
            this.LJLIL.post(this.LJLILLLLZI);
            return;
        }
        throw new IllegalStateException("Content view not yet created");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        vl();
    }

    public final void wl(boolean z, boolean z2) {
        vl();
        View view = this.LJLJL;
        if (view != null) {
            if (this.LJLJLLL == z) {
                return;
            }
            this.LJLJLLL = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                    this.LJLJLJ.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
                } else {
                    view.clearAnimation();
                    this.LJLJLJ.clearAnimation();
                }
                this.LJLJL.setVisibility(8);
                this.LJLJLJ.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
                this.LJLJLJ.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
            } else {
                view.clearAnimation();
                this.LJLJLJ.clearAnimation();
            }
            this.LJLJL.setVisibility(0);
            this.LJLJLJ.setVisibility(8);
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        C29S c29s = null;
        linearLayout.addView(new ProgressBar(requireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            C10A.LIZIZ(frameLayout, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return frameLayout;
    }
}
