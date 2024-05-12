package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C16880lQ;
import X.C214348b8;
import X.C5H3;
import X.C65352Pkq;
import X.C68322mC;
import X.C78915Uy7;
import X.C8YN;
import X.EBF;
import X.EBH;
import X.OMN;
import X.OMO;
import X.OMP;
import X.TBT;
import X.ViewTreeObserverOnPreDrawListenerC16840lM;
import X.X1D;
import Y.ACListenerS17S1300000_10;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PoiReTagBottomBarAssem extends BaseCellSlotComponent<PoiReTagBottomBarAssem> {
    public ViewGroup LLFII;
    public TuxTextView LLFZ;
    public FrameLayout LLI;
    public Aweme LLIFFJFJJ;
    public final C5H3 LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public final AqS160S0100000_10 LLIIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.adx;
    }

    public PoiReTagBottomBarAssem() {
        new LinkedHashMap();
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), OMN.INSTANCE);
        this.LLIIIL = new AqS160S0100000_10(this, 369);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        ViewGroup viewGroup;
        if (this.LLIIII && (viewGroup = this.LLFII) != null && viewGroup.getVisibility() == 0) {
            EBF.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        T t;
        Resources resources;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLIFFJFJJ = item.getAweme();
        if (C78915Uy7.LJJI(item.getAweme())) {
            this.LLIIIILZ = true;
            this.LLIIIL.invoke();
            ViewGroup viewGroup = this.LLFII;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            Aweme aweme = item.getAweme();
            o.LJIIIIZZ(aweme, "item.aweme");
            String str = item.mEventType;
            final C68322mC c68322mC = new C68322mC();
            Context context = getContext();
            String str2 = null;
            str2 = null;
            if (context != null && (resources = context.getResources()) != null) {
                str2 = resources.getString(R.string.p0z);
            }
            String str3 = "";
            T t2 = str2;
            if (str2 == null) {
                t2 = "";
            }
            c68322mC.element = t2;
            final C68322mC c68322mC2 = new C68322mC();
            String poiReTagText = aweme.getPoiReTagText();
            if (poiReTagText == null || poiReTagText.length() == 0) {
                Context context2 = getContext();
                t = str3;
                if (context2 != null) {
                    Resources resources2 = context2.getResources();
                    t = str3;
                    if (resources2 != null) {
                        String string = resources2.getString(R.string.p1d);
                        t = str3;
                        if (string != null) {
                            t = string;
                        }
                    }
                }
            } else {
                t = aweme.getPoiReTagText();
            }
            c68322mC2.element = t;
            StringBuilder LIZ = X1D.LIZ();
            c68322mC2.element = q.LIZIZ(LIZ, (String) c68322mC2.element, ' ', LIZ);
            final TuxTextView tuxTextView = this.LLFZ;
            if (tuxTextView != null) {
                ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(tuxTextView, new Runnable() { // from class: X.4Yi
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v54, types: [T, java.lang.String] */
                    public final void LIZ() {
                        int i;
                        int width = tuxTextView.getWidth();
                        float measureText = tuxTextView.getPaint().measureText((String) c68322mC2.element);
                        C2055284u.LIZJ(tuxTextView, 63);
                        float measureText2 = tuxTextView.getPaint().measureText((String) c68322mC.element);
                        C2055284u.LIZJ(tuxTextView, 62);
                        float f = width;
                        if (measureText <= f && measureText + measureText2 > f) {
                            C68322mC c68322mC3 = c68322mC;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append('\n');
                            LIZ2.append((String) c68322mC.element);
                            c68322mC3.element = X1D.LIZIZ(LIZ2);
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append((String) c68322mC2.element);
                        LIZ3.append((String) c68322mC.element);
                        SpannableString spannableString = new SpannableString(X1D.LIZIZ(LIZ3));
                        Integer LIZJ = C72972SkS.LIZJ(tuxTextView, "titleTv.context", R.attr.eb);
                        if (LIZJ != null) {
                            i = LIZJ.intValue();
                        } else {
                            i = 0;
                        }
                        spannableString.setSpan(new ForegroundColorSpan(i), ((String) c68322mC2.element).length(), ((String) c68322mC.element).length() + ((String) c68322mC2.element).length(), 17);
                        spannableString.setSpan(C2055284u.LIZIZ(6, 63, false, false), ((String) c68322mC2.element).length(), ((String) c68322mC.element).length() + ((String) c68322mC2.element).length(), 17);
                        tuxTextView.setText(spannableString);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ2;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                });
            }
            FrameLayout frameLayout = this.LLI;
            if (frameLayout != null) {
                C16880lQ.LJIILJJIL(frameLayout, new EBH(this, str, aweme));
            }
            C16880lQ.LJIIJ(new ACListenerS17S1300000_10(this, str, aweme, item, 1), Y3());
            return;
        }
        ViewGroup viewGroup2 = this.LLFII;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLIIII = false;
        this.LLIIIILZ = false;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.hut);
        this.LLFII = viewGroup;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        this.LLFZ = (TuxTextView) view.findViewById(R.id.huu);
        this.LLI = (FrameLayout) view.findViewById(R.id.hur);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.OMQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, OMO.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.OMR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, OMP.LJLIL, 6);
    }
}
