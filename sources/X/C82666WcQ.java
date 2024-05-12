package X;

import Y.IDTListenerS122S0100000_14;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WcQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82666WcQ extends AbstractC56012Ht<C82655WcF, C82652WcC> {
    public ViewGroup LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public RecyclerView LJLJJLL;
    public View LJLJL;
    public TuxTextView LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public ViewGroup LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public float LJLZ;
    public float LJZ;
    public float LJZI;
    public float LJZL;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public AbstractC82670WcU LJLLLLLL = C82675WcZ.LIZJ;
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 149));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(C82669WcT.LJLIL);
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS164S0100000_14(this, 148));

    public final InterfaceC88472Yns<AbstractC82670WcU, Integer> LLJILJIL() {
        return (InterfaceC88472Yns) this.LLF.getValue();
    }

    public final float LLJILJILJ() {
        long j;
        C45584Hum<String> invoke = getUiActions().LJLJJL.invoke();
        String str = ((MediaModel) getUiStates().LIZ(new TBT() { // from class: X.WcO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82655WcF) obj).LIZ;
            }
        }).LIZ()).id;
        o.LJIIIIZZ(str, "uiStates[PreviewVideoCli…rrentMediaModel].value.id");
        MediaModel mediaModel = (MediaModel) ((LinkedHashMap) invoke.LIZ).get(str);
        if (mediaModel != null) {
            j = mediaModel.duration;
        } else {
            j = ((MediaModel) getUiStates().LIZ(new TBT() { // from class: X.WcP
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82655WcF) obj).LIZ;
                }
            }).LIZ()).duration;
        }
        return (float) j;
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        RecyclerView recyclerView = this.LJLJJLL;
        if (recyclerView != null) {
            AbstractC029409q adapter = recyclerView.getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoClipFrameThumbnailsAdapter");
            ((C45700Hwe) adapter).LJLJLJ.LIZLLL();
            return;
        }
        o.LJIJI("videoFrameThumbnailsRecyclerView");
        throw null;
    }

    public final String LLJJ(AbstractC82671WcV abstractC82671WcV) {
        if (o.LJ(abstractC82671WcV, C82672WcW.LIZIZ)) {
            float max = Math.max(C82672WcW.LIZJ, 0.0f);
            C82672WcW.LIZJ = max;
            float LLJILJILJ = (LLJILJILJ() * (max / this.LJLLJ)) / 1000;
            float f = 60;
            int LJJIIZ = O6R.LJJIIZ(LLJILJILJ % f);
            int LJJIIZ2 = O6R.LJJIIZ((LLJILJILJ - LJJIIZ) / f);
            StringBuilder LIZ = X1D.LIZ();
            String LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%01d", Arrays.copyOf(new Object[]{Integer.valueOf(LJJIIZ2)}, 1));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            LIZ.append(LLLZI);
            LIZ.append(':');
            String LLLZI2 = C16880lQ.LLLZI(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(LJJIIZ)}, 1));
            o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
            LIZ.append(LLLZI2);
            StringBuilder LJFF = C72972SkS.LJFF(X1D.LIZIZ(LIZ), '/');
            LJFF.append(LLJJI(this, abstractC82671WcV.LIZ));
            return X1D.LIZIZ(LJFF);
        }
        if (o.LJ(abstractC82671WcV, C82673WcX.LIZIZ)) {
            int LJJIIZ3 = O6R.LJJIIZ((LLJILJILJ() * (abstractC82671WcV.LIZ / this.LJLLJ)) / 1000);
            if (LJJIIZ3 > 60) {
                String string = getString(R.string.ia4, LLJJI(this, abstractC82671WcV.LIZ));
                o.LJIIIIZZ(string, "{\n                    ge…gthPX))\n                }");
                return string;
            }
            String string2 = getString(R.string.ia4, C63144OqK.LIZIZ(new Object[]{Integer.valueOf(LJJIIZ3)}, 1, Locale.getDefault(), "%01d", "format(locale, format, *args)"));
            o.LJIIIIZZ(string2, "{\n                    va…ration)\n                }");
            return string2;
        }
        throw new C162476Zf();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        float f;
        super.onActivityCreated(bundle);
        View view = this.LJLJL;
        if (view != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
            c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(3.0f)));
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            view.setBackground(c110614Vt.LIZ(requireSceneContext));
            if (((Boolean) this.LL.getValue()).booleanValue()) {
                View view2 = this.LJLILLLLZI;
                if (view2 != null) {
                    view2.setBackgroundResource(R.drawable.ar7);
                    View view3 = this.LJLJI;
                    if (view3 != null) {
                        view3.setBackgroundResource(R.drawable.ar4);
                    } else {
                        o.LJIJI("endHandleBar");
                        throw null;
                    }
                } else {
                    o.LJIJI("startHandleBar");
                    throw null;
                }
            }
            o.LJIIIIZZ(requireSceneContext(), "requireSceneContext()");
            this.LJLLJ = ((C63081OpJ.LJJJJL(r1) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(24.0f)))) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(24.0f)))) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(14.0f))) * 2);
            this.LJLLL = (1000.0f / LLJILJILJ()) * this.LJLLJ;
            this.LJLLLL = (100.0f / LLJILJILJ()) * this.LJLLJ;
            ViewGroup viewGroup = this.LJLLILLLL;
            if (viewGroup != null) {
                C110614Vt c110614Vt2 = new C110614Vt();
                c110614Vt2.LIZIZ = Integer.valueOf(R.attr.dg);
                c110614Vt2.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(2.0f)));
                Context context = this.mView.getContext();
                o.LJIIIIZZ(context, "view.context");
                viewGroup.setBackground(c110614Vt2.LIZ(context));
                RecyclerView recyclerView = this.LJLJJLL;
                if (recyclerView != null) {
                    requireSceneContext();
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoClipScene$initUISettings$3$1
                        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                        public final boolean LJIJJLI() {
                            return false;
                        }
                    };
                    linearLayoutManager.LLJJIII(0);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    int LJIIZILJ = (int) (this.LJLLJ / C32151Nz.LJIIZILJ(Float.valueOf(25.0f)));
                    if (this.LJLLJ % C278817o.LIZ(25.0f) < C278817o.LIZ(25.0f) / 2.0f) {
                        f = this.LJLLJ;
                    } else {
                        LJIIZILJ++;
                        f = this.LJLLJ;
                    }
                    Context requireSceneContext2 = requireSceneContext();
                    Lifecycle lifecycle = getLifecycle();
                    C45584Hum<String> invoke = getUiActions().LJLJJL.invoke();
                    o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
                    o.LJIIIIZZ(lifecycle, "lifecycle");
                    recyclerView.setAdapter(new C45700Hwe(false, f / LJIIZILJ, LJIIZILJ, invoke, requireSceneContext2, lifecycle, 9));
                    C40171ht c40171ht = new C40171ht();
                    c40171ht.LJFF = 300L;
                    recyclerView.setItemAnimator(c40171ht);
                    View view4 = this.LJLJLLL;
                    if (view4 != null) {
                        C110614Vt c110614Vt3 = new C110614Vt();
                        c110614Vt3.LIZ = Integer.valueOf(C04330Ez.LIZIZ(this.mView.getContext(), R.color.v3));
                        c110614Vt3.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(2.0f)));
                        C71313Ryn.LIZIZ(this.mView, "view.context", c110614Vt3, view4);
                        View view5 = this.LJLL;
                        if (view5 != null) {
                            C110614Vt c110614Vt4 = new C110614Vt();
                            c110614Vt4.LIZ = Integer.valueOf(C04330Ez.LIZIZ(this.mView.getContext(), R.color.v3));
                            c110614Vt4.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(2.0f)));
                            C71313Ryn.LIZIZ(this.mView, "view.context", c110614Vt4, view5);
                            ViewGroup viewGroup2 = this.LJLIL;
                            if (viewGroup2 != null) {
                                viewGroup2.setOnTouchListener(new IDTListenerS122S0100000_14(this, 2));
                                getUiStates().LIZ(new TBT() { // from class: X.WcL
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return ((C82655WcF) obj).LIZ;
                                    }
                                }).LJIIIIZZ(this, Lifecycle.State.STARTED, new AqS180S0100000_14(this, 160));
                                AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WcM
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return ((C82655WcF) obj).LIZJ;
                                    }
                                }, null, new AqS173S0100000_7(this, 137), 2, null);
                                AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WcI
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return ((C82655WcF) obj).LIZLLL;
                                    }
                                }, null, new AqS180S0100000_14(this, 161), 2, null);
                                AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WcJ
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return ((C82655WcF) obj).LJ;
                                    }
                                }, null, new AqS173S0100000_7(this, 139), 2, null);
                                AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WcH
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return Integer.valueOf(((C82655WcF) obj).LJFF);
                                    }
                                }, null, new AqS180S0100000_14(this, 158), 2, null);
                                AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WcN
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return Integer.valueOf(((C82655WcF) obj).LJI);
                                    }
                                }, null, new AqS180S0100000_14(this, 159), 2, null);
                                AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WcG
                                    @Override // X.TBT, X.TBZ, X.TBW
                                    public final Object get(Object obj) {
                                        return Boolean.valueOf(((C82655WcF) obj).LJII);
                                    }
                                }, null, new AqS173S0100000_7(this, 136), 2, null);
                                return;
                            }
                            o.LJIJI("clipVideoFrameContainer");
                            throw null;
                        }
                        o.LJIJI("endMaskView");
                        throw null;
                    }
                    o.LJIJI("startMaskView");
                    throw null;
                }
                o.LJIJI("videoFrameThumbnailsRecyclerView");
                throw null;
            }
            o.LJIJI("recyclerViewContainer");
            throw null;
        }
        o.LJIJI("slider");
        throw null;
    }

    public static final String LLJJI(C82666WcQ c82666WcQ, float f) {
        int LJJIIZ = O6R.LJJIIZ((c82666WcQ.LLJILJILJ() * (f / c82666WcQ.LJLLJ)) / 1000);
        int i = LJJIIZ % 60;
        StringBuilder LIZ = X1D.LIZ();
        String LLLZI = C16880lQ.LLLZI(Locale.getDefault(), "%01d", Arrays.copyOf(new Object[]{Integer.valueOf((LJJIIZ - i) / 60)}, 1));
        o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
        LIZ.append(LLLZI);
        LIZ.append(':');
        String LLLZI2 = C16880lQ.LLLZI(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
        LIZ.append(LLLZI2);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireView = requireView();
        View findViewById = requireView.findViewById(R.id.i2h);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.previe…ip_video_frame_container)");
        this.LJLIL = (ViewGroup) findViewById;
        View findViewById2 = requireView.findViewById(R.id.i2e);
        findViewById2.setTag(EnumC82668WcS.START_HANDLE);
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = requireView.findViewById(R.id.i2_);
        findViewById3.setTag(EnumC82668WcS.END_HANDLE);
        this.LJLJI = findViewById3;
        View findViewById4 = requireView.findViewById(R.id.i2g);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.preview_clip_top_border)");
        this.LJLJJI = findViewById4;
        View findViewById5 = requireView.findViewById(R.id.i28);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.preview_clip_bottom_border)");
        this.LJLJJL = findViewById5;
        View findViewById6 = requireView.findViewById(R.id.i2i);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.previe…ideo_frame_recycler_view)");
        this.LJLJJLL = (RecyclerView) findViewById6;
        View findViewById7 = requireView.findViewById(R.id.i2d);
        findViewById7.setTag(EnumC82668WcS.SLIDER);
        this.LJLJL = findViewById7;
        View findViewById8 = requireView.findViewById(R.id.i2c);
        findViewById8.setTag(EnumC82668WcS.TIME);
        o.LJIIIIZZ(findViewById8, "findViewById<TuxTextView…UITags.TIME\n            }");
        this.LJLJLJ = (TuxTextView) findViewById8;
        View findViewById9 = requireView.findViewById(R.id.i2f);
        findViewById9.setTag(EnumC82668WcS.START_MASK);
        this.LJLJLLL = findViewById9;
        View findViewById10 = requireView.findViewById(R.id.i2a);
        findViewById10.setTag(EnumC82668WcS.END_MASK);
        this.LJLL = findViewById10;
        View findViewById11 = requireView.findViewById(R.id.i2j);
        o.LJIIIIZZ(findViewById11, "findViewById(R.id.preview_clip_whole_mask)");
        this.LJLLI = findViewById11;
        View findViewById12 = requireView.findViewById(R.id.i2b);
        o.LJIIIIZZ(findViewById12, "findViewById(R.id.previe…_recycler_view_container)");
        this.LJLLILLLL = (ViewGroup) findViewById12;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.jn, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
