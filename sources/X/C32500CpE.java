package X;

import Y.ACListenerS41S1100000_1;
import Y.ARunnableS16S0300000_5;
import Y.AUListenerS96S0200000_4;
import Y.IDAListenerS5S0300000_4;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftColorSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelShowOptSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelEnableSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS109S0300000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CpE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32500CpE extends AbstractC32517CpV {
    public final java.util.Set<View> LJLJLLL;
    public View LJLL;
    public C32174Cjy LJLLI;
    public C31478CXa LJLLILLLL;
    public C8SI LJLLJ;
    public C32505CpJ LJLLL;
    public C32501CpF LJLLLL;
    public C32510CpO LJLLLLLL;
    public C28287B8h LJLZ;
    public C32316CmG LJZ;
    public C8SH LJZI;
    public C8SJ LJZL;
    public C28963BYh LL;
    public C76930UHe LLD;
    public Room LLF;
    public final C73318Sq2 LLFF;
    public final int LLFFF;
    public final int LLFII;
    public AbstractC32698CsQ<? extends C30896CAq> LLFZ;
    public final C32514CpS LLI;
    public GiftListResult LLIFFJFJJ;
    public final C32504CpI LLII;

    public final GiftPanelLeafViewModel LJJIII() {
        Fragment fragment;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW == null || (fragment = c32580CqW.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftPanelLeafViewModel) ViewModelProviders.of(fragment).get(GiftPanelLeafViewModel.class);
    }

    public final GiftLeafRootViewModel LJJIIJ() {
        Fragment fragment;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW == null || (fragment = c32580CqW.getFragment()) == null) {
            return null;
        }
        if (fragment.isAdded()) {
            return (GiftLeafRootViewModel) ViewModelProviders.of(fragment).get(GiftLeafRootViewModel.class);
        }
        C78983UzD.LJIILL("GiftPanelTopLeaf cannot get ViewModel");
        return null;
    }

    public final C31563Ca7 LJJIIZ() {
        C32676Cs4 c32676Cs4;
        AbstractC32579CqV abstractC32579CqV = this.LJLJLJ;
        if (!(abstractC32579CqV instanceof C32676Cs4) || (c32676Cs4 = (C32676Cs4) abstractC32579CqV) == null) {
            return null;
        }
        return c32676Cs4.LLJLLIL;
    }

    @Override // X.AbstractC32579CqV
    public final void LJIILL() {
        Room room;
        C76930UHe c76930UHe;
        C32174Cjy c32174Cjy;
        C31478CXa c31478CXa;
        C8SI c8si;
        C32505CpJ c32505CpJ;
        C32316CmG c32316CmG;
        C32501CpF c32501CpF;
        C32510CpO c32510CpO;
        C28287B8h c28287B8h;
        C8SH c8sh;
        C28963BYh c28963BYh;
        C8SJ c8sj;
        C32506CpK<AbstractC32523Cpb> c32506CpK;
        DataChannel dataChannel;
        C31563Ca7 c31563Ca7;
        C32676Cs4 c32676Cs4;
        int childCount;
        DataChannel dataChannel2;
        GiftLeafRootViewModel LJJIIJ = LJJIIJ();
        DataChannel dataChannel3 = null;
        if (LJJIIJ != null && (dataChannel2 = LJJIIJ.LJLIL) != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLF = room;
        View view = this.LJLJJI;
        if (view instanceof C76930UHe) {
            c76930UHe = (C76930UHe) view;
        } else {
            c76930UHe = null;
        }
        this.LLD = c76930UHe;
        if (c76930UHe != null) {
            c32174Cjy = (C32174Cjy) c76930UHe.findViewById(R.id.ilx);
        } else {
            c32174Cjy = null;
        }
        this.LJLLI = c32174Cjy;
        C76930UHe c76930UHe2 = this.LLD;
        if (c76930UHe2 != null) {
            c31478CXa = (C31478CXa) c76930UHe2.findViewById(R.id.kxy);
        } else {
            c31478CXa = null;
        }
        this.LJLLILLLL = c31478CXa;
        C76930UHe c76930UHe3 = this.LLD;
        if (c76930UHe3 != null) {
            c8si = (C8SI) c76930UHe3.findViewById(R.id.as8);
        } else {
            c8si = null;
        }
        this.LJLLJ = c8si;
        C76930UHe c76930UHe4 = this.LLD;
        if (c76930UHe4 != null) {
            c32505CpJ = (C32505CpJ) c76930UHe4.findViewById(R.id.fq2);
        } else {
            c32505CpJ = null;
        }
        this.LJLLL = c32505CpJ;
        C76930UHe c76930UHe5 = this.LLD;
        if (c76930UHe5 != null) {
            c32316CmG = (C32316CmG) c76930UHe5.findViewById(R.id.dau);
        } else {
            c32316CmG = null;
        }
        this.LJZ = c32316CmG;
        C76930UHe c76930UHe6 = this.LLD;
        if (c76930UHe6 != null) {
            c32501CpF = (C32501CpF) c76930UHe6.findViewById(R.id.h39);
        } else {
            c32501CpF = null;
        }
        this.LJLLLL = c32501CpF;
        C76930UHe c76930UHe7 = this.LLD;
        if (c76930UHe7 != null) {
            c32510CpO = (C32510CpO) c76930UHe7.findViewById(R.id.h3_);
        } else {
            c32510CpO = null;
        }
        this.LJLLLLLL = c32510CpO;
        C76930UHe c76930UHe8 = this.LLD;
        if (c76930UHe8 != null) {
            c28287B8h = (C28287B8h) c76930UHe8.findViewById(R.id.dab);
        } else {
            c28287B8h = null;
        }
        this.LJLZ = c28287B8h;
        C76930UHe c76930UHe9 = this.LLD;
        if (c76930UHe9 != null) {
            c8sh = (C8SH) c76930UHe9.findViewById(R.id.afe);
        } else {
            c8sh = null;
        }
        this.LJZI = c8sh;
        C76930UHe c76930UHe10 = this.LLD;
        if (c76930UHe10 != null) {
            c28963BYh = (C28963BYh) c76930UHe10.findViewById(R.id.ds9);
        } else {
            c28963BYh = null;
        }
        this.LL = c28963BYh;
        this.LJLL = this.LJLLJ;
        C76930UHe c76930UHe11 = this.LLD;
        if (c76930UHe11 != null) {
            c8sj = (C8SJ) c76930UHe11.findViewById(R.id.lln);
        } else {
            c8sj = null;
        }
        this.LJZL = c8sj;
        C76930UHe c76930UHe12 = this.LLD;
        if (!(c76930UHe12 instanceof ViewGroup)) {
            c76930UHe12 = null;
        }
        if (c76930UHe12 != null && (childCount = c76930UHe12.getChildCount()) >= 0) {
            int i = 0;
            while (true) {
                View childAt = c76930UHe12.getChildAt(i);
                if (childAt instanceof InterfaceC76931UHf) {
                    this.LJLJLLL.add(childAt);
                }
                if (i == childCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        C76930UHe c76930UHe13 = this.LLD;
        if (c76930UHe13 != null && (c31563Ca7 = (C31563Ca7) c76930UHe13.findViewById(R.id.mz9)) != null) {
            AbstractC32579CqV abstractC32579CqV = this.LJLJLJ;
            if ((abstractC32579CqV instanceof C32676Cs4) && (c32676Cs4 = (C32676Cs4) abstractC32579CqV) != null) {
                c32676Cs4.LLJLLIL = c31563Ca7;
            }
        }
        C31563Ca7 LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            GiftLeafRootViewModel LJJIIJ2 = LJJIIJ();
            if (LJJIIJ2 != null) {
                dataChannel3 = LJJIIJ2.LJLIL;
            }
            LJJIIZ.setDatachannel(dataChannel3);
        }
        GiftLeafRootViewModel LJJIIJ3 = LJJIIJ();
        if (LJJIIJ3 != null && (dataChannel = LJJIIJ3.LJLIL) != null && C29306Beo.LJJII(dataChannel)) {
            C8SJ c8sj2 = this.LJZL;
            if (c8sj2 != null) {
                C29306Beo.LJJLJLI(c8sj2);
            }
            C8SI c8si2 = this.LJLLJ;
            if (c8si2 != null) {
                C29306Beo.LJI(c8si2);
                return;
            }
            return;
        }
        C8SJ c8sj3 = this.LJZL;
        if (c8sj3 != null) {
            C29306Beo.LJI(c8sj3);
        }
        C8SI c8si3 = this.LJLLJ;
        if (c8si3 != null) {
            C29306Beo.LJJLJLI(c8si3);
        }
        C32543Cpv c32543Cpv = this.LJLJL;
        if (c32543Cpv != null) {
            c32543Cpv.LIZ(new C32512CpQ(this));
        }
        GiftLeafRootViewModel LJJIIJ4 = LJJIIJ();
        if (LJJIIJ4 != null && (c32506CpK = LJJIIJ4.LJLJJI) != null) {
            c32506CpK.LIZJ(this.LJLJI, this.LLI);
        }
        GiftManager.inst().registerGiftListListener(this.LLII);
    }

    @Override // X.AbstractC32579CqV
    public final void LJIJJ() {
        C32506CpK<AbstractC32523Cpb> c32506CpK;
        super.LJIJJ();
        GiftManager.inst().unRegisterGiftListListener(this.LLII);
        GiftLeafRootViewModel LJJIIJ = LJJIIJ();
        if (LJJIIJ != null && (c32506CpK = LJJIIJ.LJLJJI) != null) {
            C32514CpS observer = this.LLI;
            o.LJIIIZ(observer, "observer");
            C62819Ol5.LJIIJ("removeObserver");
            c32506CpK.LIZ.remove(observer);
        }
    }

    public final LinkedList<AbstractC32698CsQ<? extends C30896CAq>> LJJIFFI() {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        GiftPanelLeafViewModel LJJIII = LJJIII();
        if (LJJIII != null && (mutableLiveData = LJJIII.LJLILLLLZI) != null) {
            return mutableLiveData.getValue();
        }
        return null;
    }

    public final long LJJII() {
        Long l;
        MutableLiveData<Long> mutableLiveData;
        GiftPanelLeafViewModel LJJIII = LJJIII();
        if (LJJIII == null || (mutableLiveData = LJJIII.LJLJJLL) == null || (l = mutableLiveData.getValue()) == null) {
            l = 0L;
        }
        return l.longValue();
    }

    public C32500CpE(Context context) {
        super(context, EnumC32750CtG.GIFT_PANEL_SUB.getZIndex());
        this.LJLJLLL = new LinkedHashSet();
        this.LLFF = new C73318Sq2();
        this.LLFFF = (int) C87277YNd.LJIIJ(48);
        this.LLFII = R.layout.dol;
        this.LLI = new C32514CpS(this);
        this.LLII = new C32504CpI(this);
    }

    public final AbstractC32698CsQ<? extends C30896CAq> LJJIIJZLJL(Long l) {
        Long l2;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> LJJIFFI = LJJIFFI();
        if (LJJIFFI != null) {
            Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = LJJIFFI.iterator();
            while (it.hasNext()) {
                AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                if (next != null) {
                    l2 = Long.valueOf(next.LIZJ());
                } else {
                    l2 = null;
                }
                if (o.LJ(l2, l)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d9, code lost:
    
        if (r20 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02d5, code lost:
    
        if (r0.LJFF == 2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r7 == (-1)) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(X.AbstractC32698CsQ<? extends X.C30896CAq> r20) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32500CpE.LJJIIZI(X.CsQ):void");
    }

    public final void LJJIJ(C32507CpL c32507CpL, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ) {
        boolean z;
        C32676Cs4 c32676Cs4;
        DataChannel dataChannel;
        Boolean bool;
        C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
        C29800Bmm gr2 = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
        GiftLeafRootViewModel LJJIIJ = LJJIIJ();
        if (LJJIIJ != null && (dataChannel = LJJIIJ.LJLIL) != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if ((gr2 != null && gr2.LJFF == 2) || z || !UserLevelEnableSetting.INSTANCE.getValue()) {
            LJJIJIL(this.LJLLJ, c32507CpL, abstractC32698CsQ);
            return;
        }
        LJJIJIL(LJJIIZ(), c32507CpL, abstractC32698CsQ);
        C31563Ca7 LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            LJJIIZ.postDelayed(new ARunnableS16S0300000_5(this, gr, c32507CpL, 0), 300L);
        }
        AbstractC32579CqV abstractC32579CqV = this.LJLJLJ;
        if (!(abstractC32579CqV instanceof C32676Cs4) || (c32676Cs4 = (C32676Cs4) abstractC32579CqV) == null) {
            return;
        }
        c32676Cs4.LLJJJJ = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x044a, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r5, r12.bannerLynxUrl) != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x06c2, code lost:
    
        if (r31 == null) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x06c8, code lost:
    
        if (r31.LJIIL() == false) goto L316;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(X.C32507CpL r30, X.AbstractC32698CsQ<? extends X.C30896CAq> r31) {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32500CpE.LJJIJIIJIL(X.CpL, X.CsQ):void");
    }

    @Override // X.AbstractC32579CqV
    public final OSZ<View, C018905p> LJIJJLI(Context context, ViewGroup parent, LayoutInflater layoutInflater) {
        DataChannel dataChannel;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        View LJIIIZ = C20910rv.LJIIIZ(this.LLFII);
        if (LJIIIZ == null && (LJIIIZ = C16880lQ.LLLLIILL(layoutInflater, this.LLFII, parent, false)) == null) {
            return null;
        }
        this.LJLJJI = LJIIIZ;
        C018905p c018905p = new C018905p(-1, -1);
        GiftLeafRootViewModel LJJIIJ = LJJIIJ();
        if (LJJIIJ != null && (dataChannel = LJJIIJ.LJLIL) != null && C29306Beo.LJJII(dataChannel)) {
            C8SJ c8sj = this.LJZL;
            if (c8sj != null) {
                C29306Beo.LJJLJLI(c8sj);
            }
            C8SI c8si = this.LJLLJ;
            if (c8si != null) {
                C29306Beo.LJI(c8si);
            }
        }
        View view = this.LJLJJI;
        o.LJI(view);
        return new OSZ<>(view, c018905p);
    }

    public final void LJJI(long j, boolean z, boolean z2) {
        int value;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> LJJIFFI;
        ImageModel imageModel;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        Object obj;
        List<GiftColorInfo> arrayList;
        C32676Cs4 c32676Cs4;
        C32681Cs9 c32681Cs9;
        C32676Cs4 c32676Cs42;
        Gift gift;
        if (LiveGiftPanelShowOptSetting.INSTANCE.getEnable()) {
            value = LiveGiftColorSetting.INSTANCE.getStickValue();
        } else {
            value = LiveGiftColorSetting.INSTANCE.getValue();
        }
        if (value == 0 || (LJJIFFI = LJJIFFI()) == null) {
            return;
        }
        Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = LJJIFFI.iterator();
        int i = 0;
        while (true) {
            imageModel = null;
            if (it.hasNext()) {
                int i2 = i + 1;
                abstractC32698CsQ = it.next();
                if (abstractC32698CsQ != null && abstractC32698CsQ.LIZJ() == LJJII()) {
                    abstractC32698CsQ.LJ = null;
                    abstractC32698CsQ.LJFF = null;
                    obj = abstractC32698CsQ.LIZIZ;
                    break;
                }
                i = i2;
            } else {
                abstractC32698CsQ = null;
                i = 0;
                obj = null;
                break;
            }
        }
        if (!(obj instanceof Gift) || (gift = (Gift) obj) == null || (arrayList = gift.colorInfos) == null) {
            arrayList = new ArrayList();
        }
        for (GiftColorInfo giftColorInfo : arrayList) {
            Long l = giftColorInfo.colorId;
            if (l != null && l.longValue() == j) {
                imageModel = giftColorInfo.giftImage;
            }
        }
        if (imageModel != null) {
            if (abstractC32698CsQ != null) {
                abstractC32698CsQ.LJFF = imageModel;
                abstractC32698CsQ.LJI = z2;
                if (abstractC32698CsQ.LJIIL == j) {
                    return;
                } else {
                    abstractC32698CsQ.LJIIL = j;
                }
            }
            if (z) {
                if (abstractC32698CsQ != null) {
                    abstractC32698CsQ.LJ = imageModel;
                }
                AbstractC32579CqV abstractC32579CqV = this.LJLJLJ;
                if ((abstractC32579CqV instanceof C32676Cs4) && (c32676Cs42 = (C32676Cs4) abstractC32579CqV) != null) {
                    c32676Cs42.LJJL();
                }
                AbstractC32579CqV abstractC32579CqV2 = this.LJLJLJ;
                if ((abstractC32579CqV2 instanceof C32676Cs4) && (c32676Cs4 = (C32676Cs4) abstractC32579CqV2) != null && (c32681Cs9 = c32676Cs4.LJZ) != null) {
                    c32681Cs9.notifyItemChanged(i, abstractC32698CsQ);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJIL(View view, C32507CpL c32507CpL, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ) {
        C76930UHe c76930UHe = this.LLD;
        if (c76930UHe != null) {
            c76930UHe.setOnBoxClickListener$livegift_impl_release(new AqS109S0300000_5(c32507CpL, (C32507CpL) abstractC32698CsQ, (AbstractC32698CsQ<? extends C30896CAq>) this, (C32500CpE) 0));
        }
        C76930UHe c76930UHe2 = this.LLD;
        if (c76930UHe2 != null) {
            c76930UHe2.setBoxShowListener$livegift_impl_release(new AqS171S0100000_5(c32507CpL, 3));
        }
        View view2 = this.LJLL;
        boolean z = true;
        if (view2 == null) {
            C76930UHe c76930UHe3 = this.LLD;
            if (c76930UHe3 != null && c76930UHe3.getVisibility() != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                ViewGroup.LayoutParams layoutParams = c76930UHe3.getLayoutParams();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, this.LLFFF);
                ofInt.setDuration(30L);
                ofInt.addUpdateListener(new AUListenerS96S0200000_4(layoutParams, c76930UHe3, 0));
                ofInt.addListener(new IDAListenerS5S0300000_4(this, c76930UHe3, view, 0));
                ofInt.addListener(new C32524Cpc());
                animatorSet.playTogether(ofInt);
                animatorSet.start();
            }
            C76930UHe c76930UHe4 = this.LLD;
            if (c76930UHe4 != null) {
                C32496CpA c32496CpA = c32507CpL.LJI;
                o.LJII(view, "null cannot be cast to non-null type com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.IGiftTopPanel");
                c76930UHe4.LIZLLL(c32496CpA, (InterfaceC76931UHf) view, null, new AqS155S0100000_5(view, 3));
            }
        } else if (!o.LJ(view2, view)) {
            View view3 = this.LJLL;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            View view4 = this.LJLL;
            if (view4 != null) {
                C78609UtB.LJJIJL(view4, false);
            }
            C76930UHe c76930UHe5 = this.LLD;
            if (c76930UHe5 != null) {
                C32496CpA c32496CpA2 = c32507CpL.LJI;
                o.LJII(view, "null cannot be cast to non-null type com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.IGiftTopPanel");
                KeyEvent.Callback callback = this.LJLL;
                o.LJII(callback, "null cannot be cast to non-null type com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.IGiftTopPanel");
                c76930UHe5.LIZLLL(c32496CpA2, (InterfaceC76931UHf) view, (InterfaceC76931UHf) callback, new AqS155S0100000_5(view, 4));
            }
        } else {
            C76930UHe c76930UHe6 = this.LLD;
            if (c76930UHe6 != null) {
                C32496CpA c32496CpA3 = c32507CpL.LJI;
                o.LJII(view, "null cannot be cast to non-null type com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.IGiftTopPanel");
                c76930UHe6.LIZLLL(c32496CpA3, (InterfaceC76931UHf) view, null, new AqS155S0100000_5(view, 5));
            }
        }
        this.LJLL = view;
        C31563Ca7 LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            boolean LJ = o.LJ(this.LJLL, LJJIIZ());
            if (LJJIIZ.LLII || !LJ) {
                z = false;
            }
            C31563Ca7.LJJZZIII(z);
            LJJIIZ.LLII = LJ;
        }
    }

    public final void LJJIJIIJI(GiftPanelBanner giftPanelBanner, C32507CpL c32507CpL, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2) {
        C32676Cs4 c32676Cs4;
        C32496CpA c32496CpA;
        C32501CpF c32501CpF = this.LJLLLL;
        if (c32501CpF != null) {
            c32501CpF.setData(giftPanelBanner);
        }
        C32501CpF c32501CpF2 = this.LJLLLL;
        if (c32501CpF2 != null) {
            c32501CpF2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS41S1100000_1(new AqS94S0300000_5(giftPanelBanner, this, c32507CpL, 0), giftPanelBanner.schemaUrl, 6)));
        }
        LJJIJIL(this.LJLLLL, c32507CpL, abstractC32698CsQ);
        C32501CpF c32501CpF3 = this.LJLLLL;
        if (c32501CpF3 != null && ((c32496CpA = c32507CpL.LJI) == null || !c32496CpA.LIZ)) {
            C78609UtB.LJJIJIL(0, c32501CpF3);
            c32501CpF3.requestLayout();
        }
        AbstractC32579CqV abstractC32579CqV = this.LJLJLJ;
        if ((abstractC32579CqV instanceof C32676Cs4) && (c32676Cs4 = (C32676Cs4) abstractC32579CqV) != null && c32676Cs4.LLIZ && !o.LJ(abstractC32698CsQ2, abstractC32698CsQ)) {
            C28994BZm.LIZ(c32507CpL.LJFF);
        }
    }
}
