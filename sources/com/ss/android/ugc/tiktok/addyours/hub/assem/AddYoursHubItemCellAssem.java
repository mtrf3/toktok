package com.ss.android.ugc.tiktok.addyours.hub.assem;

import X.C16880lQ;
import X.C17N;
import X.C214348b8;
import X.C219618jd;
import X.C219628je;
import X.C221108m2;
import X.C26338AVi;
import X.C32151Nz;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73411SrX;
import X.C8XO;
import X.InterfaceC115514g7;
import X.InterfaceC65350Pko;
import X.InterfaceC74236TBo;
import X.O6R;
import X.TBT;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class AddYoursHubItemCellAssem extends ReusedUISlotAssem<AddYoursHubItemCellAssem> implements C8XO<C219618jd>, ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public C73411SrX LLFFF;
    public final InterfaceC115514g7 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public int LLFF = -1;
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1423));

    static {
        TBT tbt = new TBT(AddYoursHubItemCellAssem.class, "hubListVM", "getHubListVM()Lcom/ss/android/ugc/tiktok/addyours/hub/viewmodel/AddYoursHubListViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.gk;
    }

    public final View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this.LLII;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public AddYoursHubItemCellAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursHubListViewModel.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, null, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 762), null, C219628je.INSTANCE, null, null);
        this.LLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 761));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 763));
    }

    public final void p4() {
        int i = this.LLFF;
        if (i <= 1) {
            View video_cover = _$_findCachedViewById(R.id.n4v);
            o.LJIIIIZZ(video_cover, "video_cover");
            C26338AVi.LJI(video_cover, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, null, false, 29);
        } else if (i <= 2) {
            View video_cover2 = _$_findCachedViewById(R.id.n4v);
            o.LJIIIIZZ(video_cover2, "video_cover");
            C26338AVi.LJI(video_cover2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(3))), null, null, false, 29);
        } else {
            View video_cover3 = _$_findCachedViewById(R.id.n4v);
            o.LJIIIIZZ(video_cover3, "video_cover");
            C26338AVi.LJI(video_cover3, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5))), null, null, false, 29);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C73411SrX c73411SrX;
        _$_findCachedViewById(R.id.lht).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C73411SrX c73411SrX2 = this.LLFFF;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LLFFF) != null) {
            c73411SrX.dispose();
        }
    }

    public final void n4() {
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.jxr);
        C17N.LJJLIIIJJI(tuxIconView);
        tuxIconView.setImageDrawable((Drawable) this.LLI.getValue());
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 26, 42), tuxIconView);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (_$_findCachedViewById(R.id.lht).getWidth() <= 0) {
            return;
        }
        this.LLFF = ((TextView) _$_findCachedViewById(R.id.lht)).getLineCount();
        p4();
        _$_findCachedViewById(R.id.lht).getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4(com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem r17) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem.m4(com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x027a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L52;
     */
    @Override // X.C8XO
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q4(X.C219618jd r15) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem.q4(java.lang.Object):void");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C219618jd c219618jd) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        _$_findCachedViewById(R.id.eru).getClass();
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C219618jd c219618jd) {
    }
}
