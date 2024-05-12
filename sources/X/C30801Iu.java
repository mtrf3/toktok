package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30801Iu extends PagerAdapter {
    public final DataChannel LJLILLLLZI;
    public final String LJLJI;
    public final C0WF LJLJJI;
    public final StickerEffectViewModel LJLJJL;
    public final List<C32001Nk> LJLJJLL;
    public C0PQ LJLJL;
    public LiveEffect LJLJLJ;
    public final RecyclerView.RecycledViewPool LJLJLLL;
    public C29581Ec LJLL;
    public C29571Eb LJLLI;
    public final List<C0G1> LJLLILLLL;
    public C0G1 LJLLJ;
    public Integer LJLLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object item) {
        o.LJIIIZ(item, "item");
        return -2;
    }

    public final void LJJIIJ() {
        for (C0G1 c0g1 : this.LJLLILLLL) {
            c0g1.LJIIIIZZ.LLJ();
            C76104Tts c76104Tts = c0g1.LJIILIIL;
            if (c76104Tts != null) {
                c76104Tts.LIZIZ();
            }
        }
    }

    public final void LJJIIJZLJL() {
        for (C0G1 c0g1 : this.LJLLILLLL) {
            c0g1.LJIIIIZZ.LLJI();
            C76104Tts c76104Tts = c0g1.LJIILIIL;
            if (c76104Tts != null) {
                c76104Tts.LIZJ(true);
            }
        }
    }

    public final void LJJIIZI() {
        LiveEffect liveEffect;
        List<LiveEffect> LIZ;
        C0WF c0wf = this.LJLJJI;
        if (c0wf != null && (LIZ = c0wf.LIZ(this.LJLJI)) != null) {
            liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ);
        } else {
            liveEffect = null;
        }
        this.LJLJLJ = liveEffect;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLJJLL).size();
    }

    public final void LJJIII(LiveEffect liveEffect) {
        C0PQ c0pq = this.LJLJL;
        if (c0pq != null) {
            c0pq.LIZ(this.LJLJLJ, liveEffect);
        }
        this.LJLJLJ = liveEffect;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            if (liveEffect == null) {
                liveEffect = new LiveEffect();
            }
            dataChannel.rv0(StickerSelectChannel.class, liveEffect);
        }
    }

    public final void LJJIIZ(int i) {
        Object obj;
        C0G1 c0g1;
        String str;
        Integer num = this.LJLLL;
        if (num == null || num.intValue() != i) {
            if (i >= ((ArrayList) this.LJLJJLL).size()) {
                HashMap LIZJ = C03660Ck.LIZJ("error_type", "onPanelSelected_IndexOutOfBoundsException");
                HashMap hashMap = new HashMap();
                hashMap.put("position", Integer.valueOf(i));
                hashMap.put("dataList", ORZ.LLD(this.LJLJJLL, ",", null, null, null, 62));
                String stackTraceString = android.util.Log.getStackTraceString(new Exception());
                o.LJIIIIZZ(stackTraceString, "getStackTraceString(Exception())");
                hashMap.put("error_stack", stackTraceString);
                C0K2.LJFF("ttlive_quality_stability_error", LIZJ, null, hashMap);
                return;
            }
            Iterator it = ((ArrayList) this.LJLLILLLL).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    C32001Nk c32001Nk = ((C0G1) obj).LIZJ;
                    if (c32001Nk != null) {
                        str = c32001Nk.LJLILLLLZI;
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, ((C32001Nk) ListProtector.get(this.LJLJJLL, i)).LJLILLLLZI)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C0G1 c0g12 = (C0G1) obj;
            if (c0g12 != null) {
                this.LJLLL = Integer.valueOf(i);
                C0G1 c0g13 = this.LJLLJ;
                if (c0g13 != null && c0g13.LJIIIZ) {
                    c0g13.LIZLLL();
                    c0g13.LJIIIZ = false;
                    C76104Tts c76104Tts = c0g13.LJIILIIL;
                    if (c76104Tts != null) {
                        c76104Tts.LIZIZ();
                    }
                    c0g13.LJIIIIZZ.LLJ();
                }
                this.LJLLJ = c0g12;
                if (C29306Beo.LJIILLIIL(Boolean.valueOf(c0g12.LIZIZ)) && (c0g1 = this.LJLLJ) != null) {
                    c0g1.LIZ();
                    c0g1.LIZIZ = true;
                    C40771ir c40771ir = c0g1.LJIIIIZZ;
                    c40771ir.LJLLLLLL = true;
                    LiveEffect liveEffect = c40771ir.LJLJJLL;
                    if (liveEffect != null) {
                        c40771ir.LLIL(liveEffect);
                    }
                    if (c40771ir.LJLJL) {
                        c40771ir.LLFZ(c40771ir.LJLJJL);
                        c40771ir.LJLJJL = null;
                    }
                }
                C0G1 c0g14 = this.LJLLJ;
                if (c0g14 != null && !c0g14.LJIIIZ) {
                    c0g14.LIZJ();
                    c0g14.LJIIIZ = true;
                    C76104Tts c76104Tts2 = c0g14.LJIILIIL;
                    if (c76104Tts2 != null) {
                        c76104Tts2.LIZJ(true);
                    }
                    c0g14.LJIIIIZZ.LLJI();
                }
            }
        }
    }

    public final void setData(List<C32001Nk> dataList) {
        o.LJIIIZ(dataList, "dataList");
        ((ArrayList) this.LJLJJLL).clear();
        ((ArrayList) this.LJLJJLL).addAll(dataList);
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        C0G1 c29561Ea;
        boolean z;
        o.LJIIIZ(container, "container");
        C32001Nk c32001Nk = (C32001Nk) ListProtector.get(this.LJLJJLL, i);
        if (o.LJ(c32001Nk.LJLIL, "favorite")) {
            c29561Ea = this.LJLL;
            if (c29561Ea == null) {
                DataChannel dataChannel = this.LJLILLLLZI;
                c29561Ea = new C29581Ec(container, this.LJLJLLL, this.LJLJJI, this.LJLJJL, dataChannel);
            }
        } else if (o.LJ(c32001Nk.LJLILLLLZI, "Recents")) {
            c29561Ea = this.LJLLI;
            if (c29561Ea == null) {
                DataChannel dataChannel2 = this.LJLILLLLZI;
                c29561Ea = new C29571Eb(container, this.LJLJLLL, this.LJLJJI, this.LJLJJL, dataChannel2);
            }
        } else {
            c29561Ea = new C29561Ea(container, this.LJLJLLL, this.LJLJJI, this.LJLJJL, this.LJLILLLLZI);
        }
        c29561Ea.LJIIIIZZ.LLJILJIL();
        if (i == this.LJLJJL.sv0().size()) {
            z = true;
        } else {
            z = false;
        }
        c29561Ea.LJFF(c32001Nk, z, this.LJLJI, new IDqS416S0100000(this, 134));
        container.addView(c29561Ea.LIZLLL);
        if (!((ArrayList) this.LJLLILLLL).contains(c29561Ea)) {
            ((ArrayList) this.LJLLILLLL).add(c29561Ea);
        }
        LJJIIZ(i);
        return c29561Ea;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object item) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(item, "item");
        if (item instanceof C0G1) {
            return o.LJ(((C0G1) item).LIZLLL, view);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object item) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(item, "item");
        if (item instanceof C0G1) {
            C0G1 c0g1 = (C0G1) item;
            c0g1.LIZIZ();
            c0g1.LJIIIIZZ.LLJILJILJ();
            C16880lQ.LJLLL(c0g1.LIZLLL, container);
        }
        if (item instanceof C29561Ea) {
            ((ArrayList) this.LJLLILLLL).remove(item);
        } else if (item instanceof C29581Ec) {
            this.LJLL = (C29581Ec) item;
        } else {
            if (!(item instanceof C29571Eb)) {
                return;
            }
            this.LJLLI = (C29571Eb) item;
        }
    }

    public C30801Iu(DataChannel dataChannel, String str, C0WF c0wf, Context context, StickerEffectViewModel viewModel) {
        LiveEffect liveEffect;
        List<LiveEffect> LIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = str;
        this.LJLJJI = c0wf;
        this.LJLJJL = viewModel;
        this.LJLJJLL = new ArrayList();
        if (c0wf != null && (LIZ = c0wf.LIZ(str)) != null) {
            liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ);
        } else {
            liveEffect = null;
        }
        this.LJLJLJ = liveEffect;
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(C6NP.NORMAL.getValue(), 20);
        this.LJLJLLL = recycledViewPool;
        this.LJLLILLLL = new ArrayList();
        new LinkedHashMap();
        new LinkedHashMap();
    }
}
