package com.ss.android.ugc.aweme.feed.assem;

import X.C178726zs;
import X.C200707uE;
import X.C2064388h;
import X.C212428Vi;
import X.C214348b8;
import X.C214368bA;
import X.C220858ld;
import X.C221108m2;
import X.C2K0;
import X.C35183DrP;
import X.C37179EiV;
import X.C51029K0z;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C5H3;
import X.C62623Ohv;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C74220TAy;
import X.C79488VHo;
import X.C8K4;
import X.C8MQ;
import X.C8V7;
import X.C8VK;
import X.C8VR;
import X.C8W0;
import X.InterfaceC200587u2;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService;
import com.ss.android.ugc.aweme.commercialize.feed.AdAssemServiceImpl;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerAssem;
import com.ss.android.ugc.aweme.feed.assem.contentclassificationmask.ContentClassificationMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimAssem;
import com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class FeedVideoAssem extends BaseCellContentComponent implements ILazyLoadAbility, InterfaceC55102Lju {
    public static final /* synthetic */ int LLI = 0;
    public final BaseFeedPageParams LL;
    public final InterfaceC65784Pro<Long> LLD;
    public final Set<C8K4> LLF;
    public final C5H3 LLFF;
    public final C62822Ol8 LLFFF;
    public final C74220TAy LLFII;
    public final RightAreaContainerAssem LLFZ;

    @Override // X.InterfaceC55102Lju
    public C2K0 provideAbility(String str) {
        if (str.hashCode() != -959555912) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ILazyLoadAbility
    public final void Tv() {
        C8VR.LIZJ(this, C62623Ohv.LIZIZ.LJIIL());
    }

    public final InterfaceC200587u2 c4() {
        return (InterfaceC200587u2) this.LLFFF.getValue();
    }

    public final void g4() {
        if (this.LLFII.LIZIZ()) {
            return;
        }
        if (C79488VHo.LIZIZ()) {
            if (C178726zs.LIZLLL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                C8VR.LIZJ(this, C65352Pkq.LIZ(EmojiAnimAssem.class));
            }
        } else {
            if (!C178726zs.LIZLLL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                return;
            }
            C8VR.LIZJ(this, C65352Pkq.LIZ(EmojiAnimAssem.class));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LLIILZL();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    public static C8VK b4(C8VK mode) {
        o.LJIIIZ(mode, "mode");
        C8VK c8vk = C8VK.LAZY;
        if (mode == c8vk) {
            return c8vk;
        }
        return C8VK.IMMEDIATE;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIII(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIII(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIJIIJIL(i);
            }
        }
    }

    @Override // X.C8XO
    /* renamed from: e4, reason: merged with bridge method [inline-methods] */
    public void q4(VideoItemParams item) {
        IAdAssemService LIZLLL;
        C65776Prg LIZIZ;
        o.LJIIIZ(item, "item");
        if (this.LLFII.LIZJ(23) && o.LJ(item.getAweme().getContentClassificationMaskInfo().getShowMask(), Boolean.TRUE)) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(ContentClassificationMaskAssem.class));
        }
        if (this.LLFII.LIZJ(7) && C220858ld.LJIIIZ(item.getAweme())) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(GeneralVideoMaskAssem.class));
        }
        if (this.LLFII.LIZJ(8) && C220858ld.LJIIJJI(item.getAweme())) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(ReportVideoMaskAssem.class));
        }
        if (this.LLFII.LIZJ(9) && C220858ld.LJIIJ(item.getAweme())) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(PhotosensitiveVideoMaskAssem.class));
        }
        if (item.getAweme().isAd() && (LIZLLL = AdAssemServiceImpl.LIZLLL()) != null && (LIZIZ = LIZLLL.LIZIZ()) != null) {
            C8VR.LIZJ(this, LIZIZ);
        }
        g4();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8V7 c8v7 = C214368bA.LIZIZ;
        if (c8v7 != null) {
            c8v7.log("AssemList", "reusedUiSlotAssem onViewCreated");
        }
        C8VR.LIZ(this, new AqS134S0200000_3(this, view, 77));
        if (((Boolean) C35183DrP.LJIIL.getValue()).booleanValue()) {
            if (!C54838Lfe.LJJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                C37179EiV.LIZ().postAtFrontOfQueue(new ARunnableS39S0100000_3(this, 53));
            } else {
                C8VR.LIZ(this, new AqS169S0100000_3(this, 180));
            }
        }
        if (((Boolean) C35183DrP.LJIILIIL.getValue()).booleanValue()) {
            if (!C54838Lfe.LJJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                C37179EiV.LIZ().postAtFrontOfQueue(new ARunnableS22S0200000_3(this, view, 13));
            } else {
                C8VR.LIZ(this, new AqS134S0200000_3(this, view, 79));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).B2(i, aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).v0(i, aweme);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedVideoAssem(BaseFeedPageParams params, InterfaceC65784Pro<Long> infoProvider, int i, Set<? extends C8K4> set) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(infoProvider, "infoProvider");
        new LinkedHashMap();
        this.LL = params;
        this.LLD = infoProvider;
        this.LLF = set;
        this.LLFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C2064388h.INSTANCE);
        this.LLFFF = C221108m2.LIZIZ(C200707uE.LJLIL);
        C74220TAy c74220TAy = new C74220TAy(i);
        this.LLFII = c74220TAy;
        this.LLFZ = new RightAreaContainerAssem(c74220TAy, params, infoProvider);
    }
}
