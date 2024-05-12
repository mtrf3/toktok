package X;

import Y.IDhS93S0100000;
import com.bytedance.android.live.broadcast.api.GestureFilterPanelChannel;
import com.bytedance.android.live.effect.FilterPanelFetchSuccessChannel;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33771Uf implements InterfaceC08070Tj<FilterModel> {
    public static final /* synthetic */ int LJFF = 0;
    public final List<FilterModel> LIZ;
    public final EffectManager LIZIZ;
    public final List<InterfaceC08060Ti> LIZJ;
    public final java.util.Map<String, Double> LIZLLL;
    public final List<InterfaceC08050Th> LJ = new ArrayList();

    @Override // X.InterfaceC08070Tj
    public final void release() {
    }

    static {
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIJI;
        if (c48459J0d.LIZJ().intValue() < 0) {
            c48459J0d.LIZ(0);
        }
    }

    public final boolean LJIIJ() {
        List<FilterModel> list = this.LIZ;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                if (((LiveEffect) it.next()).isNew) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void LJIILJJIL() {
        if (((ArrayList) this.LIZ).isEmpty()) {
            return;
        }
        InterfaceC30442Bx8.LJJ.LIZ(Boolean.FALSE);
        int LIZ = C15760jc.LIZ(this.LIZ);
        if (LIZ < 0 || LIZ >= ((ArrayList) this.LIZ).size()) {
            LIZ = 0;
        }
        LJFF(LIZ);
        Iterator it = ((ArrayList) this.LJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC08050Th) it.next()).LIZIZ(LIZ);
        }
    }

    public final void LJIILL() {
        List<FilterModel> list = this.LIZ;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                LiveEffect liveEffect = (LiveEffect) it.next();
                if (liveEffect.getEffect() != null && liveEffect.isNew) {
                    liveEffect.isNew = false;
                    String id = liveEffect.getEffect().getId();
                    String tagsUpdatedAt = liveEffect.getEffect().getTagsUpdatedAt();
                    EffectManager effectManager = this.LIZIZ;
                    if (effectManager != null) {
                        effectManager.updateTag(id, tagsUpdatedAt, null);
                    }
                }
            }
        }
    }

    public C33771Uf() {
        this.LIZLLL = new HashMap();
        InterfaceC30442Bx8.LJIJI.LIZJ().intValue();
        this.LIZIZ = ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).LJLJJLL();
        this.LIZJ = new ArrayList();
        this.LIZ = new ArrayList();
        this.LIZLLL = InterfaceC30442Bx8.LLLZZ.LIZJ();
    }

    @Override // X.InterfaceC08070Tj
    public final List<FilterModel> LIZ() {
        return this.LIZ;
    }

    public static final boolean LJIIJJI(LiveEffect liveEffect) {
        FilterModel filterModel = (FilterModel) liveEffect;
        if (filterModel == null) {
            return false;
        }
        if (filterModel.getFilterType() != 2) {
            return true;
        }
        return C1KJ.LJIIL(filterModel.getEffect());
    }

    @Override // X.InterfaceC08070Tj
    public final void LIZIZ(InterfaceC08060Ti interfaceC08060Ti) {
        ((ArrayList) this.LIZJ).add(interfaceC08060Ti);
    }

    @Override // X.InterfaceC08070Tj
    public final void LIZJ(InterfaceC08050Th interfaceC08050Th) {
        ((ArrayList) this.LJ).add(interfaceC08050Th);
    }

    @Override // X.InterfaceC08070Tj
    public final void LIZLLL(InterfaceC08060Ti interfaceC08060Ti) {
        ((ArrayList) this.LIZJ).remove(interfaceC08060Ti);
    }

    @Override // X.InterfaceC08070Tj
    public final void LJ(InterfaceC08050Th interfaceC08050Th) {
        ((ArrayList) this.LJ).remove(interfaceC08050Th);
    }

    @Override // X.InterfaceC08070Tj
    public final void LJFF(int i) {
        C15760jc.LIZIZ(i, this.LIZ);
    }

    @Override // X.InterfaceC08070Tj
    public final float LJI(int i) {
        FilterModel filterModel;
        if (i >= 0 && i < ((ArrayList) this.LIZ).size()) {
            filterModel = (FilterModel) ListProtector.get(this.LIZ, i);
        } else {
            filterModel = null;
        }
        return LJIIIZ(filterModel);
    }

    public final void LJIIIIZZ(LiveEffect liveEffect) {
        final FilterModel filterModel = (FilterModel) liveEffect;
        if (filterModel.getFilterType() != 2) {
            return;
        }
        ((ArrayList) this.LIZ).indexOf(filterModel);
        if (filterModel.getEffect() == null) {
            return;
        }
        C15380j0.LIZLLL();
        try {
            if (!C2NU.LIZ.LIZIZ()) {
                return;
            }
            this.LIZIZ.fetchEffect(filterModel.getEffect(), new IFetchEffectListener() { // from class: X.1mo
                public final long LIZ = System.currentTimeMillis();

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect) {
                    C33771Uf c33771Uf = C33771Uf.this;
                    long j = this.LIZ;
                    FilterModel filterModel2 = filterModel;
                    c33771Uf.getClass();
                    C70657RoD.LJJI(0.001d, new C43211mn(j, filterModel2, true));
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    C33771Uf c33771Uf = C33771Uf.this;
                    long j = this.LIZ;
                    FilterModel filterModel2 = filterModel;
                    c33771Uf.getClass();
                    C70657RoD.LJJI(0.001d, new C43211mn(j, filterModel2, false));
                }
            });
        } catch (Exception unused) {
        }
    }

    public final float LJIIIZ(FilterModel filterModel) {
        if (filterModel == null) {
            return 1.0f;
        }
        if (this.LIZLLL.containsKey(filterModel.getResourceId())) {
            return this.LIZLLL.get(filterModel.getResourceId()).floatValue();
        }
        if (this.LIZLLL.containsKey(filterModel.getFilterId())) {
            return this.LIZLLL.get(filterModel.getFilterId()).floatValue();
        }
        C0L1 c0l1 = filterModel.filterConfig;
        return C12920f2.LJFF(c0l1.LIZ, c0l1.LIZIZ, c0l1.LIZJ);
    }

    public final void LJIIL(final DataChannel dataChannel) {
        C0WO<FilterModel> c0wo = new C0WO<FilterModel>(dataChannel) { // from class: X.1Ue
            public final WeakReference<DataChannel> LIZ;

            @Override // X.C0WO
            public final void onFail() {
                C33771Uf.this.LJIILIIL(false);
            }

            @Override // X.C0WO
            public final void onSuccess(List<C1QC> list) {
                if (!list.isEmpty()) {
                    List<Object> list2 = ((C1QC) ListProtector.get(list, 0)).LJLILLLLZI;
                    ((ArrayList) C33771Uf.this.LIZ).clear();
                    ((ArrayList) C33771Uf.this.LIZ).addAll(list2);
                    C33771Uf c33771Uf = C33771Uf.this;
                    c33771Uf.getClass();
                    C73454SsE LJJJ = AbstractC73672Svk.LJJIIZ(list2).LJJIFFI(new i0()).LJJIII(new IDhS93S0100000(c33771Uf, 1), false).LJJJ(C73969T1h.LIZIZ());
                    C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
                    LJJJ.LJJJLL(c42222Ghe, c42222Ghe, new C33741Uc(0, c33771Uf));
                    C33771Uf.this.LJIILIIL(true);
                    DataChannel dataChannel2 = this.LIZ.get();
                    if (dataChannel2 != null) {
                        dataChannel2.rv0(FilterPanelFetchSuccessChannel.class, list2);
                        dataChannel2.rv0(GestureFilterPanelChannel.class, list2);
                    }
                }
            }

            {
                this.LIZ = new WeakReference<>(dataChannel);
            }
        };
        String LIVE_FILTER_PANEL = C0TY.LJ;
        o.LJIIIIZZ(LIVE_FILTER_PANEL, "LIVE_FILTER_PANEL");
        C1KJ.LJIIJ(LIVE_FILTER_PANEL, new C73340SqO(), new C0WP<FilterModel>() { // from class: X.1UT
            @Override // X.C0WP
            public final List<C1QC> LJIIZILJ(List<C1QC> effectPanelList) {
                o.LJIIIZ(effectPanelList, "effectPanelList");
                Iterator<Object> it = ORZ.LJLIIIL(effectPanelList).iterator();
                while (it.hasNext()) {
                    Iterator<Object> it2 = ((C1QC) it.next()).LJLILLLLZI.iterator();
                    while (it2.hasNext()) {
                        final FilterModel filterModel = (FilterModel) it2.next();
                        C1KJ c1kj = C1KJ.LIZ;
                        if (!C1KJ.LJIIL(filterModel.getEffect())) {
                            c1kj.LIZLLL(filterModel.getEffect(), new C0WN() { // from class: X.1US
                                public final long LIZ = System.currentTimeMillis();

                                @Override // X.C0WN
                                public final void LJFF(int i, Effect effect) {
                                }

                                @Override // X.C0WN
                                public final void onStart(Effect effect) {
                                }

                                @Override // X.C0WN
                                public final void LJI(Effect effect) {
                                    C1UT c1ut = C1UT.this;
                                    long j = this.LIZ;
                                    FilterModel filterModel2 = filterModel;
                                    c1ut.getClass();
                                    C70657RoD.LJJI(0.01d, new C518921x(j, filterModel2, false));
                                }

                                @Override // X.C0WN
                                public final void onSuccess(Effect effect) {
                                    C1UT c1ut = C1UT.this;
                                    long j = this.LIZ;
                                    FilterModel filterModel2 = filterModel;
                                    c1ut.getClass();
                                    C70657RoD.LJJI(0.01d, new C518921x(j, filterModel2, true));
                                }
                            });
                        }
                    }
                }
                C1QC c1qc = (C1QC) ORZ.LJLLLL(effectPanelList);
                if (c1qc != null) {
                    List<Object> filterList = c1qc.LJLILLLLZI;
                    o.LJIIIZ(filterList, "filterList");
                    C15760jc.LIZIZ(C15760jc.LIZ(filterList), filterList);
                }
                return effectPanelList;
            }
        }, c0wo);
    }

    public final void LJIILIIL(boolean z) {
        if (C32151Nz.LJJIIJZLJL(this.LIZJ)) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC08060Ti) it.next()).LIZIZ(z);
        }
    }

    public final void LJII(DataChannel dataChannel, int i, boolean z, boolean z2) {
        if (((ArrayList) this.LIZ).isEmpty()) {
            return;
        }
        if (i < 0 || i >= ((ArrayList) this.LIZ).size()) {
            i = 0;
        }
        LJFF(i);
        Iterator it = ((ArrayList) this.LJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC08050Th) it.next()).LIZIZ(i);
        }
        AnonymousClass030.LJFF(InterfaceC30442Bx8.LLLZLZ);
        if (z) {
            C32021Nm c32021Nm = C32021Nm.LIZ;
            c32021Nm.LIZJ("LiveFilterManager#changeFilter", false);
            c32021Nm.LJI(dataChannel, "LiveFilterManager#changeFilter", true, true);
            C32021Nm.LJFF(dataChannel, "LiveFilterManager#changeFilter", true, true);
            C32021Nm.LIZ("LiveFilterManager#changeFilter");
        }
    }
}
