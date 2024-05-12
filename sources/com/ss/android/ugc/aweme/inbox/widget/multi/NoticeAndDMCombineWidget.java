package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC029409q;
import X.AbstractC56676MMe;
import X.AbstractC73672Svk;
import X.AbstractC73946T0k;
import X.C116294hN;
import X.C16880lQ;
import X.C221018lt;
import X.C221108m2;
import X.C35382Duc;
import X.C35885E6n;
import X.C35887E6p;
import X.C3ML;
import X.C3SL;
import X.C53352Kwm;
import X.C53432Ky4;
import X.C54265LRl;
import X.C54362LVe;
import X.C56204M4a;
import X.C61878OQg;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73542Ste;
import X.C73969T1h;
import X.C78983UzD;
import X.C96533qb;
import X.EnumC94693nd;
import X.InterfaceC109664Sc;
import X.LAA;
import X.MLD;
import X.MLE;
import X.MLG;
import X.MMD;
import X.MMN;
import X.ORS;
import X.OSZ;
import X.T16;
import X.X1D;
import Y.ARunnableS45S0100000_9;
import Y.ARunnableS8S0210000_9;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.InboxFragmentVM;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeAndDMCombineWidget extends InboxAdapterWidget implements MLG {
    public static final /* synthetic */ int LLIIL = 0;
    public volatile EnumC94693nd LJLJL;
    public volatile EnumC94693nd LJLJLJ;
    public final MutableLiveData<EnumC94693nd> LJLJLLL;
    public final AbstractC73946T0k LJLL;
    public final AbstractC73946T0k LJLLI;
    public final C73318Sq2 LJLLILLLL;
    public final boolean LJLLJ;
    public final InboxFragmentVM LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public volatile long LJZL;
    public boolean LL;
    public final AtomicBoolean LLD;
    public final MultiAdapterWidget LLF;
    public final InboxAdapterWidget LLFF;
    public final C62822Ol8 LLFFF;
    public volatile List<C3ML> LLFII;
    public volatile OSZ<? extends List<C3ML>, Boolean> LLFZ;
    public volatile List<C3ML> LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public int LLII;
    public volatile C73411SrX LLIIII;
    public volatile boolean LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public volatile ARunnableS8S0210000_9 LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public final C62822Ol8 LLIIJLIL;

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        AbstractC73672Svk observable;
        this.LLIIIILZ = false;
        C56204M4a.LIZLLL("life-creator_onStart_observerVM");
        this.LJLLILLLL.LIZ(C73542Ste.LJIIIIZZ(this.LLF.LIZJ(), new AqS175S0100000_9(this, 433), null, new AqS175S0100000_9(this, 434), 2));
        MLD mld = (MLD) this.LLFFF.getValue();
        if (mld != null) {
            if (LJIIZILJ().LIZ) {
                observable = mld.LIZJ();
            } else {
                observable = mld.LIZJ().LJIIJJI(200L, TimeUnit.MILLISECONDS);
            }
            o.LJIIIIZZ(observable, "observable");
            this.LJLLILLLL.LIZ(C73542Ste.LJIIIIZZ(observable, new AqS175S0100000_9(this, 435), null, new AqS175S0100000_9(this, 436), 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_START) {
            onStart();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.C3SW
    public final void LIZ() {
        InboxAdapterWidget inboxAdapterWidget = this.LLFF;
        if (inboxAdapterWidget != null) {
            inboxAdapterWidget.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.MLD
    public final void LJ() {
        EnumC94693nd enumC94693nd = EnumC94693nd.LOADING;
        this.LJLJL = enumC94693nd;
        if (C53352Kwm.LIZ()) {
            this.LJLJLJ = enumC94693nd;
        }
        LJJ(null);
        int i = this.LLIIIZ;
        if (i == 0 || i == 1) {
            this.LLF.LJ();
        }
        if (this.LLIIIZ == 2 || this.LLIIJI > 0) {
            ((Handler) this.LLIIJLIL.getValue()).postDelayed(new ARunnableS45S0100000_9(this, 154), 1500L);
        }
        MLD mld = (MLD) this.LLFFF.getValue();
        if (mld != null) {
            mld.LJ();
        }
    }

    public final MMD LJIILLIIL() {
        return (MMD) this.LLIFFJFJJ.getValue();
    }

    public final MLE LJIIZILJ() {
        return (MLE) this.LJLLLLLL.getValue();
    }

    public final IImInboxDmService LJIJ() {
        return (IImInboxDmService) this.LJLLLL.getValue();
    }

    public final Handler LJIJI() {
        return (Handler) this.LLIIIJ.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C56204M4a.LIZLLL("life-creator_onCreate");
        getLifecycle().addObserver(this.LLF);
        InboxAdapterWidget inboxAdapterWidget = this.LLFF;
        if (inboxAdapterWidget != null) {
            getLifecycle().addObserver(inboxAdapterWidget);
        }
        MMD LJIILLIIL = LJIILLIIL();
        LJIILLIIL.getClass();
        LJIILLIIL.LJLLI = this;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        C56204M4a.LIZLLL("life-creator_onResume");
        LJIL();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        C56204M4a.LIZLLL("life-creator_onStop");
        this.LJLLILLLL.LIZLLL();
        C73411SrX c73411SrX = this.LLIIII;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        ARunnableS8S0210000_9 aRunnableS8S0210000_9 = this.LLIIIL;
        if (aRunnableS8S0210000_9 != null) {
            LJIJI().removeCallbacks(aRunnableS8S0210000_9);
        }
        this.LLIIIILZ = true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final AbstractC029409q<?> LJIIJ() {
        return LJIILLIIL();
    }

    public final List<C3ML> LJIJJLI() {
        List<C3ML> list;
        int i;
        AbstractC56676MMe abstractC56676MMe;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handle data sorted thread = ");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        LIZ.append(", dmState=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", noticeState=");
        LIZ.append(this.LJLJL);
        C221018lt.LJFF("NoticeAndDMCombineWidget", X1D.LIZIZ(LIZ));
        if (this.LLFZ == null && this.LLFII == null) {
            return C61878OQg.INSTANCE;
        }
        int i2 = 1;
        ArrayList arrayList = null;
        if (this.LLFZ != null && this.LLFII != null) {
            List list2 = this.LLFII;
            if (list2 != null) {
                if (C53432Ky4.LIZLLL()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list2) {
                        C3ML c3ml = (C3ML) obj;
                        Object obj2 = c3ml.LJLJJL;
                        if (!(obj2 instanceof AbstractC56676MMe) || (abstractC56676MMe = (AbstractC56676MMe) obj2) == null || !abstractC56676MMe.isSkeleton || c3ml.LJLIL > 0) {
                            arrayList2.add(obj);
                        }
                    }
                    list2 = arrayList2;
                }
            } else {
                list2 = C61878OQg.INSTANCE;
            }
            OSZ<? extends List<C3ML>, Boolean> osz = this.LLFZ;
            if (osz == null || (list = osz.getFirst()) == null) {
                list = C61878OQg.INSTANCE;
            }
            OSZ<? extends List<C3ML>, Boolean> osz2 = this.LLFZ;
            if (osz2 != null) {
                osz2.getSecond().booleanValue();
            }
            ArrayList arrayList3 = new ArrayList();
            int size = list2.size();
            int size2 = list.size();
            int i3 = 0;
            int i4 = 0;
            while (i3 < size && i4 < size2) {
                C3ML c3ml2 = (C3ML) ListProtector.get(list2, i3);
                C3ML c3ml3 = (C3ML) ListProtector.get(list, i4);
                int i5 = c3ml2.LJLIL;
                int i6 = c3ml3.LJLIL;
                if (i5 == i6) {
                    long j = c3ml2.LJLILLLLZI;
                    long j2 = c3ml3.LJLILLLLZI;
                    if (j == j2) {
                        i = i3 + 1;
                        arrayList3.add(ListProtector.get(list2, i3));
                        arrayList3.add(ListProtector.get(list, i4));
                        i4++;
                        i3 = i;
                    } else if (j > j2) {
                        i = i3 + 1;
                        arrayList3.add(ListProtector.get(list2, i3));
                        i3 = i;
                    } else {
                        arrayList3.add(ListProtector.get(list, i4));
                        i4++;
                    }
                } else if (i5 > i6) {
                    i = i3 + 1;
                    arrayList3.add(ListProtector.get(list2, i3));
                    i3 = i;
                } else {
                    arrayList3.add(ListProtector.get(list, i4));
                    i4++;
                }
            }
            if (i3 < size) {
                arrayList3.addAll(list2.subList(i3, size));
            }
            if (i4 >= size2) {
                return arrayList3;
            }
            arrayList3.addAll(list.subList(i4, size2));
            return arrayList3;
        }
        if (this.LLFZ != null) {
            OSZ<? extends List<C3ML>, Boolean> osz3 = this.LLFZ;
            if (osz3 != null) {
                return osz3.getFirst();
            }
        } else {
            List<C3ML> list3 = this.LLFII;
            if (list3 == null) {
                C78983UzD.LJIILJJIL();
                return C61878OQg.INSTANCE;
            }
            if (!C53432Ky4.LIZLLL() || this.LJLLJ) {
                return list3;
            }
            arrayList = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (C3ML c3ml4 : list3) {
                if (c3ml4.LJLIL > 0) {
                    arrayList4.add(c3ml4);
                }
            }
            arrayList.addAll(arrayList4);
            int LIZIZ = C53432Ky4.LIZIZ();
            if (1 <= LIZIZ) {
                while (true) {
                    arrayList.add(new C3ML(0, 0L, 101, true, new Object()));
                    if (i2 == LIZIZ) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return arrayList;
    }

    public final void LJIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifySelectionChange start,currentTabType= ");
        LIZ.append(this.LLIIIZ);
        LIZ.append(",currentFilterType =");
        LIZ.append(this.LLIIJI);
        C56204M4a.LJ(X1D.LIZIZ(LIZ));
        MLD mld = (MLD) this.LLFFF.getValue();
        if (mld != null) {
            mld.I0(this.LLIIIZ, this.LLIIJI);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        MMD LJIILLIIL = LJIILLIIL();
        LJIILLIIL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("detach delegate ");
        LIZ.append(((ArrayList) LJIILLIIL.LJLJL).size());
        C221018lt.LJFF("NoticeAndDMCombineAdapter", X1D.LIZIZ(LIZ));
        Iterator it = ((ArrayList) LJIILLIIL.LJLJL).iterator();
        while (it.hasNext()) {
            ((MMN) it.next()).onDetach();
        }
        ORS.LJJLIL(C35382Duc.LJLIL, LJIILLIIL.LJLJL);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final /* bridge */ /* synthetic */ LiveData LJIILIIL() {
        return this.LJLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int LJIIIZ(int i) {
        List<C3ML> currentList = LJIILLIIL().getCurrentList();
        o.LJIIIIZZ(currentList, "adapter.currentList");
        if (i < 0) {
            return -1;
        }
        int size = currentList.size();
        while (i < size) {
            if (((C3ML) ListProtector.get(currentList, i)).LJLJJI) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void LJJ(EnumC94693nd enumC94693nd) {
        if (enumC94693nd == null) {
            EnumC94693nd enumC94693nd2 = this.LJLJL;
            enumC94693nd = EnumC94693nd.LOADING;
            if (enumC94693nd2 != enumC94693nd || this.LJLJLJ != enumC94693nd) {
                EnumC94693nd enumC94693nd3 = this.LJLJL;
                enumC94693nd = EnumC94693nd.EMPTY;
                if (enumC94693nd3 != enumC94693nd || this.LJLJLJ != enumC94693nd) {
                    EnumC94693nd enumC94693nd4 = this.LJLJL;
                    enumC94693nd = EnumC94693nd.FAIL;
                    if (enumC94693nd4 != enumC94693nd || this.LJLJLJ != enumC94693nd) {
                        enumC94693nd = EnumC94693nd.SUCCESS;
                    }
                }
            }
        }
        this.LJLJLLL.postValue(enumC94693nd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeAndDMCombineWidget(InboxFragment fragment, LiveData parentWidgetState) {
        super(fragment, parentWidgetState);
        InterfaceC109664Sc inboxAdapterService;
        InboxAdapterWidget LJIIIZ;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(parentWidgetState, "parentWidgetState");
        EnumC94693nd enumC94693nd = EnumC94693nd.LOADING;
        this.LJLJL = enumC94693nd;
        this.LJLJLJ = enumC94693nd;
        this.LJLJLLL = new MutableLiveData<>(enumC94693nd);
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        o.LJIIIIZZ(abstractC73946T0k, "computation()");
        this.LJLL = abstractC73946T0k;
        this.LJLLI = C73969T1h.LIZIZ();
        this.LJLLILLLL = new C73318Sq2();
        boolean LIZIZ = C54362LVe.LJI().LIZIZ();
        this.LJLLJ = LIZIZ;
        this.LJLLL = (InboxFragmentVM) ViewModelProviders.of(fragment).get(InboxFragmentVM.class);
        this.LJLLLL = C221108m2.LIZIZ(C54265LRl.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(C116294hN.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(C3SL.LJLIL);
        this.LLD = new AtomicBoolean(false);
        this.LLF = new MultiAdapterWidget(fragment, parentWidgetState, true);
        if (LIZIZ || (inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService()) == null) {
            LJIIIZ = null;
        } else {
            LJIIIZ = inboxAdapterService.LJIIIZ(fragment, parentWidgetState, true);
        }
        this.LLFF = LJIIIZ;
        this.LLFFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 840));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS156S0200000_9(fragment, this, 73));
        this.LLIIIJ = C221108m2.LIZIZ(C35885E6n.INSTANCE);
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(LAA.LJLIL);
        this.LLIIIZ = ((Number) ((OSZ) LIZIZ2.getValue()).getFirst()).intValue();
        this.LLIIJI = ((Number) ((OSZ) LIZIZ2.getValue()).getSecond()).intValue();
        this.LLIIJLIL = C221108m2.LIZIZ(C35887E6p.INSTANCE);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final void LJII(int i, C96533qb uiStyleConfig) {
        o.LJIIIZ(uiStyleConfig, "uiStyleConfig");
        MMD LJIILLIIL = LJIILLIIL();
        LJIILLIIL.getClass();
        LJIILLIIL.LJLJJL.put(i, uiStyleConfig);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb A[Catch: all -> 0x024f, TryCatch #0 {, blocks: (B:10:0x0014, B:12:0x001c, B:15:0x0031, B:17:0x0035, B:20:0x003d, B:25:0x0047, B:27:0x004b, B:29:0x0053, B:31:0x005b, B:33:0x0060, B:36:0x006c, B:38:0x0072, B:40:0x007a, B:42:0x007f, B:46:0x0093, B:48:0x00bb, B:51:0x00c4, B:53:0x00de, B:55:0x00e6, B:56:0x00f0, B:58:0x0108, B:59:0x010f, B:61:0x011d, B:65:0x012a, B:66:0x0139, B:68:0x0088), top: B:9:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de A[Catch: all -> 0x024f, TryCatch #0 {, blocks: (B:10:0x0014, B:12:0x001c, B:15:0x0031, B:17:0x0035, B:20:0x003d, B:25:0x0047, B:27:0x004b, B:29:0x0053, B:31:0x005b, B:33:0x0060, B:36:0x006c, B:38:0x0072, B:40:0x007a, B:42:0x007f, B:46:0x0093, B:48:0x00bb, B:51:0x00c4, B:53:0x00de, B:55:0x00e6, B:56:0x00f0, B:58:0x0108, B:59:0x010f, B:61:0x011d, B:65:0x012a, B:66:0x0139, B:68:0x0088), top: B:9:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108 A[Catch: all -> 0x024f, TryCatch #0 {, blocks: (B:10:0x0014, B:12:0x001c, B:15:0x0031, B:17:0x0035, B:20:0x003d, B:25:0x0047, B:27:0x004b, B:29:0x0053, B:31:0x005b, B:33:0x0060, B:36:0x006c, B:38:0x0072, B:40:0x007a, B:42:0x007f, B:46:0x0093, B:48:0x00bb, B:51:0x00c4, B:53:0x00de, B:55:0x00e6, B:56:0x00f0, B:58:0x0108, B:59:0x010f, B:61:0x011d, B:65:0x012a, B:66:0x0139, B:68:0x0088), top: B:9:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d A[Catch: all -> 0x024f, TryCatch #0 {, blocks: (B:10:0x0014, B:12:0x001c, B:15:0x0031, B:17:0x0035, B:20:0x003d, B:25:0x0047, B:27:0x004b, B:29:0x0053, B:31:0x005b, B:33:0x0060, B:36:0x006c, B:38:0x0072, B:40:0x007a, B:42:0x007f, B:46:0x0093, B:48:0x00bb, B:51:0x00c4, B:53:0x00de, B:55:0x00e6, B:56:0x00f0, B:58:0x0108, B:59:0x010f, B:61:0x011d, B:65:0x012a, B:66:0x0139, B:68:0x0088), top: B:9:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(int r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.NoticeAndDMCombineWidget.LJIJJ(int, java.lang.Object):void");
    }

    public final void LJJI(List<C3ML> list, boolean z) {
        if (this.LLIIIILZ) {
            return;
        }
        this.LLI = list;
        C56204M4a.LJ("submitListFinal");
        LJIILLIIL().submitList(list, new ARunnableS8S0210000_9(this, list, z, 2));
        LJJ(null);
    }
}
