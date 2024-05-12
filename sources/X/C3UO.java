package X;

import Y.ARunnableS37S0100000_1;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter;
import com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3UO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UO {
    public final LifecycleOwner LIZ;
    public final ViewGroup LIZIZ;
    public final VWD LIZJ;
    public InterfaceC105334Bl LIZLLL;
    public final C105534Cf LJ;
    public final int LJFF;
    public final C3UR LJI;
    public final InterfaceC70422pa LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final ImageView LJIIJ;
    public final C73305Spp LJIIJJI;
    public final C223338pd LJIIL;
    public BaseEmojiGridAdapter<C105454Bx> LJIILIIL;
    public XKQ LJIILJJIL;
    public boolean LJIILL;
    public final C4CB LJIILLIIL;
    public final C62822Ol8 LJIIZILJ;
    public boolean LJIJ;

    public final View LIZJ() {
        Object value = this.LJIIIIZZ.getValue();
        o.LJIIIIZZ(value, "<get-contentView>(...)");
        return (View) value;
    }

    public final void LJ() {
        XKQ xkq = this.LJIILJJIL;
        XKQ xkq2 = null;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        InterfaceC70422pa interfaceC70422pa = this.LJII;
        if (interfaceC70422pa != null) {
            xkq2 = XKX.LIZLLL(interfaceC70422pa, C78613UtF.LIZJ, null, new C72022sA(this, null), 2);
        }
        this.LJIILJJIL = xkq2;
    }

    public final C4CM LJFF() {
        return (C4CM) this.LJIIIZ.getValue();
    }

    public final C73306Spq LIZLLL() {
        if (C113644d6.LIZIZ()) {
            C73306Spq c73306Spq = new C73306Spq();
            Drawable LIZIZ = C04270Et.LIZIZ(LIZJ().getContext(), R.drawable.ash);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZ = LIZIZ;
            String string = LIZJ().getContext().getString(R.string.rnt);
            o.LJIIIIZZ(string, "contentView.context.getS…ticker_consume_fav_blank)");
            c73306Spq.LJI = string;
            c73306Spq.LJIIIIZZ = new AqS167S0100000_1(this, 384);
            return c73306Spq;
        }
        C73306Spq c73306Spq2 = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_2pt_sticker;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq2.LIZJ = 0;
        c73306Spq2.LIZIZ = c2068389v;
        String string2 = LIZJ().getContext().getString(R.string.rni);
        o.LJIIIIZZ(string2, "contentView.context.getS…sume_add_fav_empty_state)");
        c73306Spq2.LJI = string2;
        return c73306Spq2;
    }

    public final void LIZ(InterfaceC105334Bl emojiType) {
        o.LJIIIZ(emojiType, "emojiType");
        this.LIZLLL = emojiType;
        LJI(false);
        LJIIIIZZ(emojiType.LJIIJJI());
    }

    public final void LIZIZ(C0AC c0ac) {
        String str;
        C72422so c72422so;
        StickerSetInfo stickerSetInfo;
        if (c0ac.LIZIZ() > 0 && this.LJIJ) {
            this.LJIJ = false;
            InterfaceC105334Bl interfaceC105334Bl = this.LIZLLL;
            Long l = null;
            if ((interfaceC105334Bl instanceof C72422so) && (c72422so = (C72422so) interfaceC105334Bl) != null && (stickerSetInfo = c72422so.LIZIZ) != null) {
                l = stickerSetInfo.getSetId();
            }
            int LJ = this.LIZLLL.LJ();
            if (LJ != 2) {
                if (LJ != 5) {
                    if (LJ != 7) {
                        if (LJ != 9) {
                            str = "";
                        } else {
                            str = "sticker_set";
                        }
                    } else {
                        str = "fav_sticker";
                    }
                } else {
                    str = "system_emoji";
                }
            } else {
                str = "navi";
            }
            IMService.createIIMServicebyMonsterPlugin(false).getPerformanceService().LIZJ().LIZ(new C3UP(Integer.valueOf(this.LIZLLL.LJ()), l), new C84393Sx(str, l));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJI(boolean r18) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3UO.LJI(boolean):android.view.View");
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    public final void LJII(Long l) {
        BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter;
        List<C105454Bx> data;
        List<C105454Bx> data2;
        List<C105454Bx> data3;
        List<C105454Bx> data4;
        List<C105454Bx> data5;
        List<C105454Bx> data6;
        C105454Bx c105454Bx;
        PopularStickerListManager popularStickerListManager;
        Long l2;
        Long l3;
        if (this.LIZLLL.LJ() == 7) {
            BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter2 = this.LJIILIIL;
            Object obj = null;
            if (baseEmojiGridAdapter2 != null && (data4 = baseEmojiGridAdapter2.getData()) != null) {
                Iterator<C105454Bx> it = data4.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        C105454Bx next = it.next();
                        SetSticker setSticker = next.LJ;
                        if (setSticker != null) {
                            l2 = setSticker.getStickerId();
                        } else {
                            l2 = null;
                        }
                        if (o.LJ(l2, l)) {
                            break;
                        }
                        VideoSticker videoSticker = next.LJFF;
                        if (videoSticker != null) {
                            l3 = videoSticker.getVideoStickerId();
                        } else {
                            l3 = null;
                        }
                        if (o.LJ(l3, l)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf.intValue() >= C113644d6.LIZIZ()) {
                    int intValue = valueOf.intValue();
                    BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter3 = this.LJIILIIL;
                    if (baseEmojiGridAdapter3 != null && (data6 = baseEmojiGridAdapter3.getData()) != null && (c105454Bx = (C105454Bx) ORZ.LJLLLLLL(intValue, data6)) != null && o.LJ(c105454Bx.LJII, Boolean.TRUE) && l != null && (popularStickerListManager = (PopularStickerListManager) this.LJIIZILJ.getValue()) != null) {
                        popularStickerListManager.LIZJ(l.longValue());
                    }
                    BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter4 = this.LJIILIIL;
                    if (baseEmojiGridAdapter4 != null && (data5 = baseEmojiGridAdapter4.getData()) != null) {
                        ListProtector.remove(data5, intValue);
                    }
                    BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter5 = this.LJIILIIL;
                    if (baseEmojiGridAdapter5 != null) {
                        baseEmojiGridAdapter5.notifyItemRemoved(intValue);
                    }
                    LJFF().post(new ARunnableS37S0100000_1(this, 98));
                }
            }
            BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter6 = this.LJIILIIL;
            if (baseEmojiGridAdapter6 != null && (data3 = baseEmojiGridAdapter6.getData()) != null && data3.size() == C113644d6.LIZIZ()) {
                LJFF().setVisibility(8);
                C73305Spp c73305Spp = this.LJIIJJI;
                c73305Spp.setTopMargin(C32151Nz.LJIIZILJ(46));
                c73305Spp.findViewById(R.id.message_tv).setTranslationY(C32151Nz.LJIIZILJ(-12));
                c73305Spp.setStatus(LIZLLL());
                c73305Spp.setVisibility(0);
                this.LJIIL.setVisibility(8);
            }
            BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter7 = this.LJIILIIL;
            if (baseEmojiGridAdapter7 != null && (data2 = baseEmojiGridAdapter7.getData()) != null) {
                obj = ORZ.LLFII(data2);
            }
            if ((obj instanceof C72042sC) && (baseEmojiGridAdapter = this.LJIILIIL) != null && (data = baseEmojiGridAdapter.getData()) != null) {
                ORS.LJJLL(data);
                BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter8 = this.LJIILIIL;
                if (baseEmojiGridAdapter8 != null) {
                    baseEmojiGridAdapter8.notifyItemRemoved(data.size() - 1);
                }
            }
        }
    }

    public final void LJIIIIZZ(List<? extends C105454Bx> list) {
        List<C105454Bx> arrayList;
        List<C105454Bx> data;
        List<C105454Bx> data2;
        List<C105454Bx> data3;
        if (list != null) {
            arrayList = ORZ.LLJILJILJ(list);
        } else {
            arrayList = new ArrayList<>();
        }
        BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter = this.LJIILIIL;
        if (baseEmojiGridAdapter != null) {
            baseEmojiGridAdapter.setData(arrayList);
        }
        if (this.LIZLLL instanceof C72432sp) {
            if (C71512rL.LJII.LJI) {
                BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter2 = this.LJIILIIL;
                if (baseEmojiGridAdapter2 != null) {
                    baseEmojiGridAdapter2.setLoadMoreListener(new AqS151S0100000_1(this, 962));
                }
                BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter3 = this.LJIILIIL;
                if (baseEmojiGridAdapter3 != null && (data3 = baseEmojiGridAdapter3.getData()) != null) {
                    LJIIJ(data3);
                    return;
                }
                return;
            }
            BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter4 = this.LJIILIIL;
            if (baseEmojiGridAdapter4 != null) {
                baseEmojiGridAdapter4.setLoadMoreListener((InterfaceC191547fS) null);
            }
            BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter5 = this.LJIILIIL;
            if (baseEmojiGridAdapter5 != null) {
                baseEmojiGridAdapter5.setShowFooter(false);
            }
            BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter6 = this.LJIILIIL;
            if (baseEmojiGridAdapter6 != null && (data2 = baseEmojiGridAdapter6.getData()) != null) {
                LJIIJ(data2);
            }
            LJ();
            return;
        }
        BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter7 = this.LJIILIIL;
        if (baseEmojiGridAdapter7 == null || (data = baseEmojiGridAdapter7.getData()) == null) {
            return;
        }
        LJIIJ(data);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (r5.intValue() != r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (X.C88963eO.LIZIZ() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (X.C88963eO.LIZJ() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r2 = r6.LJIIJJI;
        r2.setTopMargin(X.C32151Nz.LJIIZILJ(46));
        r2.findViewById(com.zhiliaoapp.musically.R.id.message_tv).setTranslationY(X.C32151Nz.LJIIZILJ(-12));
        r2.setStatus(LIZLLL());
        r2.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r6.LIZLLL.LJIIJJI().isEmpty() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.EnumC71872rv r7) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3UO.LJIIIZ(X.2rv):void");
    }

    public final void LJIIJ(List<? extends C105454Bx> emojis) {
        if (this.LIZLLL.LJ() == 2 || this.LIZLLL.LJ() == 7 || this.LIZLLL.LJ() == 9) {
            C4CB c4cb = this.LJIILLIIL;
            C4CM rv = LJFF();
            o.LJIIIIZZ(rv, "rv");
            VWD vwd = this.LIZJ;
            Integer valueOf = Integer.valueOf(this.LIZLLL.LJ());
            c4cb.getClass();
            o.LJIIIZ(emojis, "emojis");
            c4cb.LJIJJ = rv;
            c4cb.LJIJJLI = vwd;
            c4cb.LJIL = emojis;
            c4cb.LJJ = valueOf;
            LJFF().setPopHelper(this.LJIILLIIL);
        }
    }

    public C3UO(LifecycleOwner lifecycleOwner, ViewGroup anchorView, VWD viewPager, InterfaceC105334Bl interfaceC105334Bl, C105534Cf c105534Cf, int i, C3UR c3ur, InterfaceC70422pa interfaceC70422pa) {
        o.LJIIIZ(anchorView, "anchorView");
        o.LJIIIZ(viewPager, "viewPager");
        this.LIZ = lifecycleOwner;
        this.LIZIZ = anchorView;
        this.LIZJ = viewPager;
        this.LIZLLL = interfaceC105334Bl;
        this.LJ = c105534Cf;
        this.LJFF = i;
        this.LJI = c3ur;
        this.LJII = interfaceC70422pa;
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 959));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 961));
        View findViewById = LIZJ().findViewById(R.id.c69);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.delete_btn)");
        this.LJIIJ = (ImageView) findViewById;
        View findViewById2 = LIZJ().findViewById(R.id.cu9);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById…d.emoji_grid_page_status)");
        this.LJIIJJI = (C73305Spp) findViewById2;
        View findViewById3 = LIZJ().findViewById(R.id.cu8);
        o.LJIIIIZZ(findViewById3, "contentView.findViewById….emoji_grid_page_loading)");
        this.LJIIL = (C223338pd) findViewById3;
        this.LJIILLIIL = new C4CB(new AqS167S0100000_1(this, 385), interfaceC70422pa);
        this.LJIIZILJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 960));
    }
}
