package X;

import Y.IDObjectS0S0101000;
import Y.IDrS41S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.keva.Keva;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IProfileNaviService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.NaviStatusCode;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.emoji.navi.NaviCreationSignal;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMNaviAnalyticsImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.zhiliaoapp.musically.R;
import djb.IDaS20S0000000_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.4BU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4BU extends AbstractC105384Bq implements InterfaceC106614Gj, C4FT, InterfaceC71562rQ, InterfaceC71602rU, InterfaceC71462rG {
    public final InterfaceC105124Aq LJLJI;
    public final C105394Br LJLJJI;
    public final LifecycleOwner LJLJJL;
    public final LinearLayoutManager LJLJJLL;
    public final C64962gm LJLJL;
    public final C4BX LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public int LJLLJ;
    public final C4BV LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;

    @Override // X.InterfaceC71602rU
    public final void Ge() {
        LJIILL(false);
    }

    @Override // X.InterfaceC106614Gj
    public final C59678NbW LIZ() {
        return null;
    }

    public final long LJFF() {
        InterfaceC105334Bl interfaceC105334Bl = this.LJLJLJ.LIZIZ;
        if (interfaceC105334Bl != null && interfaceC105334Bl.LJ() == 2) {
            o.LJII(interfaceC105334Bl, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.systembigemoji.EmojiType");
            Resources resources = ((C4BZ) interfaceC105334Bl).LIZJ;
            if (resources != null) {
                return resources.getId();
            }
            return -1L;
        }
        return -1L;
    }

    public final VWD LJI() {
        return (VWD) this.LJLJLLL.getValue();
    }

    public final ImageView LJII() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-emojiSelectGif>(...)");
        return (ImageView) value;
    }

    public final TuxAlertBadgeLayout LJIIIIZZ() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-emojiSelectStickerStoreRedDot>(...)");
        return (TuxAlertBadgeLayout) value;
    }

    public final RecyclerView LJIIIZ() {
        return (RecyclerView) this.LJLL.getValue();
    }

    public final void LJIIJJI() {
        StickerSetInfo stickerSetInfo;
        Long setId;
        if (this.LJLJJI.LIZ) {
            ((ArrayList) C4FF.LJLJL).remove(this);
        }
        if (this.LJLJJI.LIZJ) {
            C71512rL.LJII.LJIJ(this);
        }
        if (this.LJLJJI.LJ) {
            C71572rR.LJII.LJIJ(this);
            C71442rE.LJII.LJIJ(this);
        }
        C48841JEv.LIZJ(this.LJLJL, null);
        XKQ xkq = C4FF.LJLJJLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        InterfaceC105334Bl interfaceC105334Bl = this.LJLJLJ.LIZIZ;
        if (interfaceC105334Bl != null) {
            int LJ = interfaceC105334Bl.LJ();
            Keva kevaRepo = C91093hp.LIZLLL();
            o.LJIIIIZZ(kevaRepo, "kevaRepo");
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("emoji_type");
            LIZ.append(curUserId);
            kevaRepo.storeInt(X1D.LIZIZ(LIZ), LJ);
            if ((interfaceC105334Bl instanceof C72422so) && (stickerSetInfo = ((C72422so) interfaceC105334Bl).LIZIZ) != null && (setId = stickerSetInfo.getSetId()) != null) {
                long longValue = setId.longValue();
                Keva kevaRepo2 = C91093hp.LIZLLL();
                o.LJIIIIZZ(kevaRepo2, "kevaRepo");
                String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
                o.LJIIIIZZ(curUserId2, "userService().curUserId");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("sticker_set_id");
                LIZ2.append(curUserId2);
                kevaRepo2.storeLong(X1D.LIZIZ(LIZ2), longValue);
            }
        }
        LJIILJJIL();
        C71512rL.LJII.getClass();
        if (C71512rL.LJIIIIZZ && C91093hp.LJ()) {
            C91093hp.LJIIJ(false);
            C2U8.LIZ(new C72092sH(false));
        }
        C42625Go9.LIZJ(this);
    }

    public final void LJIIL() {
        String str;
        C72422so c72422so;
        StickerSetInfo stickerSetInfo;
        Integer valueOf;
        InterfaceC105334Bl interfaceC105334Bl = this.LJLJLJ.LIZIZ;
        Long l = null;
        if (interfaceC105334Bl != null && (valueOf = Integer.valueOf(interfaceC105334Bl.LJ())) != null) {
            if (valueOf.intValue() == 5) {
                str = "emoji";
            } else if (valueOf.intValue() == 8) {
                str = "giphy";
            } else if (valueOf.intValue() == 7) {
                str = "favourites";
            } else if (valueOf.intValue() == 6) {
                str = "navi_intro";
            } else if (valueOf.intValue() == 2) {
                str = "navi";
            } else if (valueOf.intValue() == 9) {
                str = "set";
            }
            if ((interfaceC105334Bl instanceof C72422so) && (c72422so = (C72422so) interfaceC105334Bl) != null && (stickerSetInfo = c72422so.LIZIZ) != null) {
                l = stickerSetInfo.getSetId();
            }
            String valueOf2 = String.valueOf(l);
            C85323Wm LIZ = C772831o.LIZ();
            C1HQ LIZ2 = C111074Xn.LIZ(LIZ, "onEventV3", "enter_from", "chat", "enter_method", "click");
            LIZ2.put("panel_type", str);
            LIZ2.put("sticker_set_id", valueOf2);
            LIZ.LIZIZ("show_dm_sticker_panel", LIZ2);
        }
        str = null;
        if (interfaceC105334Bl instanceof C72422so) {
            l = stickerSetInfo.getSetId();
        }
        String valueOf22 = String.valueOf(l);
        C85323Wm LIZ3 = C772831o.LIZ();
        C1HQ LIZ22 = C111074Xn.LIZ(LIZ3, "onEventV3", "enter_from", "chat", "enter_method", "click");
        LIZ22.put("panel_type", str);
        LIZ22.put("sticker_set_id", valueOf22);
        LIZ3.LIZIZ("show_dm_sticker_panel", LIZ22);
    }

    public final void LJIILIIL() {
        boolean z;
        int i;
        int i2;
        AbstractC029409q adapter;
        AbstractC029409q adapter2;
        if (this.LJLLJ != this.LJLJLJ.LJII) {
            AbstractC029409q adapter3 = LJIIIZ().getAdapter();
            if (adapter3 != null) {
                i = adapter3.getItemCount();
            } else {
                i = 0;
            }
            int i3 = this.LJLLJ;
            if (i3 >= 0 && i3 < i && (adapter2 = LJIIIZ().getAdapter()) != null) {
                adapter2.notifyItemChanged(this.LJLLJ);
            }
            AbstractC029409q adapter4 = LJIIIZ().getAdapter();
            if (adapter4 != null) {
                i2 = adapter4.getItemCount();
            } else {
                i2 = 0;
            }
            int i4 = this.LJLJLJ.LJII;
            if (i4 >= 0 && i4 < i2 && (adapter = LJIIIZ().getAdapter()) != null) {
                adapter.notifyItemChanged(this.LJLJLJ.LJII);
            }
            this.LJLLJ = this.LJLJLJ.LJII;
        }
        int LLILL = this.LJLJJLL.LLILL();
        int LLILLJJLI = this.LJLJJLL.LLILLJJLI();
        if (!this.LJLZ) {
            return;
        }
        int i5 = this.LJLJLJ.LJII;
        if (LLILL > i5 || LLILLJJLI < i5) {
            if (LLILL > i5 && this.LJLLLL) {
                this.LJLLLLLL = true;
            }
            z = true;
        } else {
            z = false;
        }
        View LJJIJIL = this.LJLJJLL.LJJIJIL(LLILL);
        if (LLILL == this.LJLJLJ.LJII && LJJIJIL != null && LJ(LJJIJIL, true)) {
            if (this.LJLLLL) {
                this.LJLLLLLL = true;
            }
            z = true;
        }
        View LJJIJIL2 = this.LJLJJLL.LJJIJIL(LLILLJJLI);
        if ((LLILLJJLI == this.LJLJLJ.LJII && LJJIJIL2 != null && LJ(LJJIJIL2, false)) || z) {
            if (this.LJLLLL) {
                LJIIIZ().LJLIL(this.LJLJLJ.LJII);
            } else {
                LJIIIZ().LJLI(this.LJLJLJ.LJII);
            }
        }
        this.LJLLLL = false;
    }

    public final void LJIILJJIL() {
        int LIZ;
        int LLIL = this.LJLJJLL.LLIL();
        View LJJIJIL = this.LJLJJLL.LJJIJIL(LLIL);
        if (LJJIJIL == null) {
            return;
        }
        Context context = LJIIIZ().getContext();
        o.LJIIIIZZ(context, "emojiTab.context");
        if (C26338AVi.LIZJ(context)) {
            LIZ = C47135Ieh.LIZ(12, LJIIIZ().getWidth() - LJJIJIL.getRight());
        } else {
            LIZ = C47135Ieh.LIZ(12, LJJIJIL.getLeft());
        }
        Keva kevaRepo = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("scroll_offset");
        LIZ2.append(curUserId);
        kevaRepo.storeInt(X1D.LIZIZ(LIZ2), LIZ);
        Keva kevaRepo2 = C91093hp.LIZLLL();
        o.LJIIIIZZ(kevaRepo2, "kevaRepo");
        String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId2, "userService().curUserId");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("scroll_position");
        LIZ3.append(curUserId2);
        kevaRepo2.storeInt(X1D.LIZIZ(LIZ3), LLIL);
    }

    public final void LJIIJ() {
        long LJFF = LJFF();
        InterfaceC105334Bl interfaceC105334Bl = this.LJLJLJ.LIZIZ;
        if (LJFF > 0 && interfaceC105334Bl != null && interfaceC105334Bl.LIZLLL()) {
            C84683Ua.LJFF.LIZ(new C3UV(LJFF), new C4G7(0));
        }
    }

    @Override // X.InterfaceC71562rQ
    public final void ih0() {
        C3UO c3uo;
        VWD emojiPager = LJI();
        o.LJIIIIZZ(emojiPager, "emojiPager");
        Iterator<View> it = C78924UyG.LIZLLL(emojiPager).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                Object tag = ((View) iDObjectS0S0101000.next()).getTag(R.id.fdt);
                if ((tag instanceof C3UO) && (c3uo = (C3UO) tag) != null && c3uo.LIZLLL.LJ() == 7) {
                    c3uo.LIZ(c3uo.LIZLLL);
                }
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC71562rQ
    public final void BO(long j) {
        C3UO c3uo;
        VWD emojiPager = LJI();
        o.LJIIIIZZ(emojiPager, "emojiPager");
        Iterator<View> it = C78924UyG.LIZLLL(emojiPager).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                Object tag = ((View) iDObjectS0S0101000.next()).getTag(R.id.fdt);
                if ((tag instanceof C3UO) && (c3uo = (C3UO) tag) != null && c3uo.LIZLLL.LJ() == 7) {
                    c3uo.LJII(Long.valueOf(j));
                }
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC71602rU
    public final void Cs0(StickerSetInfo info) {
        o.LJIIIZ(info, "info");
        LJIILL(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    @Override // X.InterfaceC71562rQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void JS(com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct r9) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4BU.JS(com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct):void");
    }

    @Override // X.C4FT
    public final void LIZJ(C105734Cz emojiData) {
        o.LJIIIZ(emojiData, "emojiData");
        LJIILL(false);
        if (emojiData.LIZ == NaviStatusCode.SUCCESS) {
            onPageSelected(this.LJLJLJ.LJII);
            IMNaviAnalyticsImpl.LJLJI.LIZJ(true);
        }
    }

    public final void LIZLLL(int i) {
        boolean z;
        C4BX c4bx = this.LJLJLJ;
        if (c4bx.LJII == -1) {
            z = true;
        } else {
            z = false;
        }
        c4bx.LIZLLL(i);
        LJI().setCurrentItem(this.LJLJLJ.LJII, false);
        if (z) {
            LJIILIIL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x002b, code lost:
    
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0029, code lost:
    
        if (r0.isEmpty() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(boolean r16) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4BU.LJIILL(boolean):void");
    }

    @Override // X.InterfaceC71462rG
    public final void Pd(List<Long> setIdList) {
        C3UO c3uo;
        C72422so c72422so;
        StickerSetInfo stickerSetInfo;
        o.LJIIIZ(setIdList, "setIdList");
        VWD emojiPager = LJI();
        o.LJIIIIZZ(emojiPager, "emojiPager");
        Iterator<View> it = C78924UyG.LIZLLL(emojiPager).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                Object tag = ((View) iDObjectS0S0101000.next()).getTag(R.id.fdt);
                Long l = null;
                if ((tag instanceof C3UO) && (c3uo = (C3UO) tag) != null) {
                    InterfaceC105334Bl interfaceC105334Bl = c3uo.LIZLLL;
                    if ((interfaceC105334Bl instanceof C72422so) && (c72422so = (C72422so) interfaceC105334Bl) != null && (stickerSetInfo = c72422so.LIZIZ) != null) {
                        l = stickerSetInfo.getSetId();
                    }
                    if (ORZ.LJLJJI(l, setIdList)) {
                        c3uo.LIZ(c3uo.LIZLLL);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC71602rU
    public final void hi(List<StickerSetInfo> list) {
        LJIILL(false);
    }

    @Override // X.InterfaceC71602rU
    public final void kI(StickerSetInfo stickerSetInfo) {
        Long l;
        this.LJLLLL = true;
        int LIZJ = this.LJLJLJ.LIZJ();
        for (int i = 0; i < LIZJ; i++) {
            InterfaceC105334Bl LIZIZ = this.LJLJLJ.LIZIZ(i);
            if (LIZIZ instanceof C72422so) {
                StickerSetInfo stickerSetInfo2 = ((C72422so) LIZIZ).LIZIZ;
                Long l2 = null;
                if (stickerSetInfo2 != null) {
                    l = stickerSetInfo2.getSetId();
                } else {
                    l = null;
                }
                if (stickerSetInfo != null) {
                    l2 = stickerSetInfo.getSetId();
                }
                if (o.LJ(l, l2)) {
                    if (this.LJLJLJ.LJII != i) {
                        LJI().setCurrentItem(i, false);
                        return;
                    } else {
                        LJIILIIL();
                        return;
                    }
                }
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowRedDot(C72092sH event) {
        InterfaceC105334Bl interfaceC105334Bl;
        o.LJIIIZ(event, "event");
        if (event.LJLIL && (interfaceC105334Bl = this.LJLJLJ.LIZIZ) != null && interfaceC105334Bl.LJ() == 7 && this.LJLJI.getPanelType() == 1) {
            C71512rL.LJII.getClass();
            C71512rL.LJIIIIZZ = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C4FT
    public final void LIZIZ(Resources resources, List<? extends Emoji> list) {
        o.LJIIIZ(resources, "resources");
        if (!C79004UzY.LJJIFFI(list)) {
            int LIZJ = this.LJLJLJ.LIZJ();
            for (int i = 0; i < LIZJ; i++) {
                InterfaceC105334Bl LIZIZ = this.LJLJLJ.LIZIZ(i);
                if (LIZIZ.LJ() == 2) {
                    C4BZ c4bz = (C4BZ) LIZIZ;
                    if (o.LJ(c4bz.LIZJ, resources)) {
                        c4bz.LIZIZ = list;
                        C4BX c4bx = this.LJLJLJ;
                        c4bx.LIZLLL(c4bx.LJII);
                        PagerAdapter adapter = LJI().getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                        }
                        LJI().setCurrentItem(this.LJLJLJ.LJII, false);
                        LJIIJ();
                        return;
                    }
                }
            }
        }
    }

    public final boolean LJ(View view, boolean z) {
        if (!z ? !(!C72704Sg8.LIZIZ(view, "view.context") ? view.getRight() <= LJIIIZ().getWidth() : view.getLeft() >= 0) : !(!C72704Sg8.LIZIZ(view, "view.context") ? view.getLeft() >= 0 : view.getRight() <= LJIIIZ().getWidth())) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C4BU(InterfaceC105124Aq interfaceC105124Aq, C105394Br c105394Br, LifecycleOwner lifecycleOwner, ViewGroup viewGroup) {
        this(interfaceC105124Aq, c105394Br, lifecycleOwner, viewGroup, C1FL.LIZIZ(viewGroup, R.layout.b6v, viewGroup, false, "from(parentContainer.con…, parentContainer, false)"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0C3, X.4BV] */
    public C4BU(InterfaceC105124Aq inputView, C105394Br panelParams, LifecycleOwner lifecycleOwner, ViewGroup parentContainer, View preloadPanelView) {
        super(preloadPanelView, parentContainer);
        int i;
        boolean z;
        boolean z2;
        o.LJIIIZ(inputView, "inputView");
        o.LJIIIZ(panelParams, "panelParams");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(parentContainer, "parentContainer");
        o.LJIIIZ(preloadPanelView, "preloadPanelView");
        this.LJLJI = inputView;
        this.LJLJJI = panelParams;
        this.LJLJJL = lifecycleOwner;
        this.LJLIL.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.LJLJJLL = linearLayoutManager;
        C64962gm LIZ = C48841JEv.LIZ(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 19));
        this.LJLJL = LIZ;
        C221108m2.LIZIZ(new AqS148S0200000_1(this, parentContainer, 41));
        this.LJLJLJ = new C4BX(panelParams);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 931));
        this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 934));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 935));
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 932));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 933));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS151S0100000_1(this, 936));
        ?? r4 = new C1CZ() { // from class: X.4BV
            @Override // X.C1CZ, X.C0C3
            public final void onPageSelected(int i2) {
                C72422so c72422so;
                StickerSetInfo stickerSetInfo;
                Long setId;
                C3UO c3uo;
                C72422so c72422so2;
                StickerSetInfo stickerSetInfo2;
                Long setId2;
                List<C105454Bx> data;
                Activity LIZ2;
                C4BZ c4bz;
                Resources resources;
                C4BU.this.LJLJLJ.LIZLLL(i2);
                InterfaceC105334Bl interfaceC105334Bl = C4BU.this.LJLJLJ.LIZIZ;
                if (interfaceC105334Bl != null && interfaceC105334Bl.LJ() == 7 && C91093hp.LJ()) {
                    C71512rL.LJII.getClass();
                    C71512rL.LJIIIIZZ = true;
                } else {
                    C71512rL.LJII.getClass();
                    if (C71512rL.LJIIIIZZ && C91093hp.LJ()) {
                        C91093hp.LJIIJ(false);
                        C2U8.LIZ(new C72092sH(false));
                    }
                }
                long LJFF = C4BU.this.LJFF();
                if (LJFF > 0) {
                    C84683Ua.LJFF.LIZIZ(new C3UV(LJFF), true);
                }
                C4BU.this.LJIILIIL();
                C4BU c4bu = C4BU.this;
                InterfaceC105334Bl interfaceC105334Bl2 = c4bu.LJLJLJ.LIZIZ;
                String str = null;
                if (interfaceC105334Bl2 != null) {
                    Integer valueOf = Integer.valueOf(interfaceC105334Bl2.LJ());
                    if (valueOf.intValue() == 2) {
                        valueOf.intValue();
                        if (!interfaceC105334Bl2.LIZLLL()) {
                            Resources resources2 = ((C4BZ) interfaceC105334Bl2).LIZJ;
                            o.LJIIIIZZ(resources2, "emojiType as EmojiType).resourcesModel");
                            C4FD.LJLIL.LJ(resources2);
                        } else {
                            c4bu.LJIIJ();
                        }
                    }
                }
                InterfaceC105334Bl interfaceC105334Bl3 = C4BU.this.LJLJLJ.LIZIZ;
                if (interfaceC105334Bl3 != null) {
                    if ((interfaceC105334Bl3 instanceof C4BZ) && (c4bz = (C4BZ) interfaceC105334Bl3) != null && (resources = c4bz.LIZJ) != null) {
                        str = resources.getType();
                    }
                    if (o.LJ(str, "STICKER_NAVI")) {
                        IMService.createIIMServicebyMonsterPlugin(false).getImNaviAnalytics().LIZ("chat");
                    }
                }
                C4BU c4bu2 = C4BU.this;
                InterfaceC105334Bl interfaceC105334Bl4 = c4bu2.LJLJLJ.LIZIZ;
                NaviCreationSignal.SingleLiveData singleLiveData = NaviCreationSignal.LIZ;
                if (interfaceC105334Bl4 != null && (interfaceC105334Bl4 instanceof C89133ef) && (LIZ2 = FT5.LIZ(c4bu2.LJLIL, "panelLayout.context")) != null) {
                    IProfileNaviService LJIIL = ProfileNaviServiceImpl.LJIIL();
                    o.LJIIIIZZ(LJIIL, "get()\n            .getSe…eNaviService::class.java)");
                    OOL LIZ3 = LJIIL.LIZ(LIZ2, new C61658OHu(false, false, singleLiveData));
                    LIZ3.LJJI(new AqS151S0100000_1(LIZ3, 937));
                }
                C4BU c4bu3 = C4BU.this;
                InterfaceC105334Bl interfaceC105334Bl5 = c4bu3.LJLJLJ.LIZIZ;
                if ((interfaceC105334Bl5 instanceof C72422so) && (c72422so = (C72422so) interfaceC105334Bl5) != null && (stickerSetInfo = c72422so.LIZIZ) != null && (setId = stickerSetInfo.getSetId()) != null) {
                    long longValue = setId.longValue();
                    VWD emojiPager = c4bu3.LJI();
                    o.LJIIIIZZ(emojiPager, "emojiPager");
                    Iterator<View> it = C78924UyG.LIZLLL(emojiPager).iterator();
                    while (true) {
                        IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                        if (!iDObjectS0S0101000.hasNext()) {
                            break;
                        }
                        Object tag = ((View) iDObjectS0S0101000.next()).getTag(R.id.fdt);
                        if ((tag instanceof C3UO) && (c3uo = (C3UO) tag) != null) {
                            InterfaceC105334Bl interfaceC105334Bl6 = c3uo.LIZLLL;
                            if ((interfaceC105334Bl6 instanceof C72422so) && (c72422so2 = (C72422so) interfaceC105334Bl6) != null && (stickerSetInfo2 = c72422so2.LIZIZ) != null && (setId2 = stickerSetInfo2.getSetId()) != null && setId2.longValue() == longValue) {
                                BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter = c3uo.LJIILIIL;
                                if (baseEmojiGridAdapter == null || (data = baseEmojiGridAdapter.getData()) == null || data.isEmpty()) {
                                    AbstractC71812rp.LJIIJJI(C71442rE.LJII, C47261Igj.LJJIJ(Long.valueOf(longValue)), false, 2);
                                } else {
                                    C35U.LIZJ("sticker_set_detail", "memory_cache_hit", String.valueOf(longValue));
                                }
                            }
                        }
                    }
                }
                C4BU.this.LJIIL();
            }
        };
        this.LJLLL = r4;
        IDrS41S0100000_1 iDrS41S0100000_1 = new IDrS41S0100000_1(this, 9);
        VWD LJI = LJI();
        VWD emojiPager = LJI();
        o.LJIIIIZZ(emojiPager, "emojiPager");
        C1045248i c1045248i = C49R.LIZ;
        LJI.setAdapter(new C4BW(inputView, emojiPager, this, lifecycleOwner, c1045248i.LJFF, LIZ));
        LJIIIZ().setLayoutManager(linearLayoutManager);
        LJIIIZ().setAdapter(new C105254Bd(this));
        LJIIIZ().LJIIJJI(iDrS41S0100000_1);
        LJI().addOnPageChangeListener(r4);
        View view = (View) LIZIZ.getValue();
        if (panelParams.LJFF) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        Context context = ((View) LIZIZ.getValue()).getContext();
        o.LJIIIIZZ(context, "emojiTabLayout.context");
        Integer LJI2 = C79045V0n.LJI(c1045248i.LJ, context);
        if (LJI2 != null) {
            ((View) LIZIZ.getValue()).setBackgroundColor(LJI2.intValue());
        }
        PagerAdapter adapter = LJI().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        if (C113634d5.LIZ()) {
            LJII().setVisibility(8);
            LJIIIIZZ().setVisibility(0);
            Object value = LIZIZ2.getValue();
            o.LJIIIIZZ(value, "<get-verticalSeparator>(...)");
            ((View) value).setVisibility(8);
            if (C113644d6.LIZIZ()) {
                z2 = C91093hp.LIZJ();
            } else {
                Keva kevaRepo = C91093hp.LIZLLL();
                o.LJIIIIZZ(kevaRepo, "kevaRepo");
                z2 = kevaRepo.getBoolean("has_enter_sticker_store", false);
            }
            if (z2) {
                LJIIIIZZ().LIZIZ();
            } else {
                LJIIIIZZ().LIZJ();
            }
            RecyclerView emojiTab = LJIIIZ();
            o.LJIIIIZZ(emojiTab, "emojiTab");
            C26338AVi.LJI(emojiTab, 0, null, null, null, false, 30);
            LJIIIZ().setClipToPadding(false);
            if (C88963eO.LJFF()) {
                RecyclerView LJIIIZ = LJIIIZ();
                final Context context2 = LJIIIZ().getContext();
                o.LJIIIIZZ(context2, "emojiTab.context");
                LJIIIZ.LJII(new AbstractC030309z(context2) { // from class: X.4D0
                    public final Paint LJLIL;
                    public final int LJLILLLLZI;
                    public final int LJLJI;
                    public final int LJLJJI;
                    public final boolean LJLJJL;

                    {
                        Paint paint = new Paint();
                        this.LJLIL = paint;
                        this.LJLILLLLZI = C7MY.LIZIZ(12);
                        this.LJLJI = C7MY.LIZIZ(1);
                        this.LJLJJI = C7MY.LIZIZ(6);
                        this.LJLJJL = C90193gN.LIZIZ(context2);
                        Integer LJI3 = C79045V0n.LJI(R.attr.dz, context2);
                        if (LJI3 != null) {
                            paint.setColor(LJI3.intValue());
                        }
                    }

                    @Override // X.AbstractC030309z
                    public final void LJFF(Canvas canvas, RecyclerView parent, C0AC state) {
                        int left;
                        int i2;
                        o.LJIIIZ(canvas, "canvas");
                        o.LJIIIZ(parent, "parent");
                        o.LJIIIZ(state, "state");
                        AbstractC029409q adapter2 = parent.getAdapter();
                        if (adapter2 != null) {
                            int itemCount = adapter2.getItemCount();
                            for (int i3 = 0; i3 < itemCount; i3++) {
                                View childAt = parent.getChildAt(i3);
                                if (childAt != null && RecyclerView.LJJJJIZL(childAt) == 0) {
                                    if (this.LJLJJL) {
                                        left = childAt.getRight() + this.LJLILLLLZI;
                                        i2 = this.LJLJI;
                                    } else {
                                        left = childAt.getLeft() - this.LJLILLLLZI;
                                        i2 = this.LJLJI;
                                    }
                                    canvas.drawRect(left - i2, childAt.getTop() + this.LJLJJI, i2 + r4, childAt.getBottom() - this.LJLJJI, this.LJLIL);
                                    return;
                                }
                            }
                        }
                    }

                    @Override // X.AbstractC030309z
                    public final void LJ(Rect rect, View view2, RecyclerView recyclerView, C0AC c0ac) {
                        if (C1JX.LIZJ(rect, "outRect", view2, "view", recyclerView, "parent", c0ac, "state", view2) == 0) {
                            rect.left = this.LJLILLLLZI + this.LJLJI;
                        } else {
                            rect.left = 0;
                        }
                        if (this.LJLJJL) {
                            int i2 = rect.left;
                            rect.left = rect.right;
                            rect.right = i2;
                        }
                    }
                }, -1);
                TuxIconView tuxIconView = (TuxIconView) this.LJLIL.findViewById(R.id.cun);
                if (tuxIconView != null) {
                    tuxIconView.LIZ();
                    tuxIconView.setIconRes(R.raw.icon_color_sticker);
                }
            } else {
                RecyclerView emojiTab2 = LJIIIZ();
                o.LJIIIIZZ(emojiTab2, "emojiTab");
                C26338AVi.LJIIIZ(emojiTab2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), null, null, null, 30);
            }
        } else {
            LJII().setVisibility(0);
            LJIIIIZZ().setVisibility(8);
            Object value2 = LIZIZ2.getValue();
            o.LJIIIIZZ(value2, "<get-verticalSeparator>(...)");
            ((View) value2).setVisibility(0);
        }
        C42625Go9.LIZIZ(this);
        if (panelParams.LIZ) {
            ArrayList arrayList = (ArrayList) C4FF.LJLJL;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            z = false;
            C4FF.LIZ(false, false);
        } else {
            z = false;
        }
        if (panelParams.LIZJ) {
            C71512rL c71512rL = C71512rL.LJII;
            c71512rL.LIZ(this);
            AbstractC71812rp.LJIIJJI(c71512rL, null, z, 3);
        }
        if (panelParams.LJ) {
            C71572rR c71572rR = C71572rR.LJII;
            c71572rR.LIZ(this);
            AbstractC71812rp.LJIIJJI(c71572rR, null, z, 3);
            C71442rE.LJII.LIZ(this);
        }
    }
}
