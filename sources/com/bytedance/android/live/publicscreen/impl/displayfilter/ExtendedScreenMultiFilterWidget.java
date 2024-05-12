package com.bytedance.android.live.publicscreen.impl.displayfilter;

import X.AbstractC029409q;
import X.AbstractC03120Ai;
import X.BPX;
import X.C03200Aq;
import X.C0W8;
import X.C15380j0;
import X.C16880lQ;
import X.C1Z0;
import X.C221108m2;
import X.C29541Bib;
import X.C32I;
import X.C35011Yz;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65777Prh;
import X.C9YY;
import X.InterfaceC21110sF;
import Y.ACListenerS25S0100000_5;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.api.ExtendedPublicScreenFilterTypeChannel;
import com.bytedance.android.live.publicscreen.impl.displayfilter.ExtendedScreenMultiFilterWidget;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ExtendedScreenMultiFilterWidget extends LiveRecyclableWidget {
    public final List<C9YY> LJLIL;
    public final List<C9YY> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dal;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public ExtendedScreenMultiFilterWidget() {
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.mzq);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_me…filter_host_gifts_option)");
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.mzp);
        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_me…lter_host_gifters_option)");
        String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.mzr);
        o.LJIIIIZZ(LJIILJJIL3, "getString(R.string.pm_me…_host_subscribers_option)");
        String LJIILJJIL4 = C15380j0.LJIILJJIL(R.string.mzs);
        o.LJIIIIZZ(LJIILJJIL4, "getString(R.string.pm_me…r_host_sucomments_option)");
        this.LJLIL = C47261Igj.LJJIJIIJI(new C9YY(1, LJIILJJIL), new C9YY(2, LJIILJJIL2), new C9YY(4, LJIILJJIL3), new C9YY(8, LJIILJJIL4));
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 19));
    }

    public final C1Z0 LJZ(final int i) {
        C35011Yz c35011Yz = new C35011Yz();
        c35011Yz.LIZ = new C0W8(LJZI(i).LJLILLLLZI);
        c35011Yz.LIZLLL = LJZL(i);
        c35011Yz.LIZJ = new InterfaceC21110sF() { // from class: X.9Ya
            @Override // X.InterfaceC21110sF
            public final void LIZ(View view, C21120sG c21120sG) {
                String str;
                o.LJIIIZ(view, "<anonymous parameter 0>");
                if (c21120sG instanceof C1Z0) {
                    C1Z0 c1z0 = (C1Z0) c21120sG;
                    ExtendedScreenMultiFilterWidget.this.LJLZ(i, c1z0.LIZLLL);
                    DataChannel dataChannel = ExtendedScreenMultiFilterWidget.this.dataChannel;
                    o.LJIIIIZZ(dataChannel, "dataChannel");
                    int i2 = i;
                    List<C9YY> list = ExtendedScreenMultiFilterWidget.this.LJLILLLLZI;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C9YY) it.next()).LJLIL));
                    }
                    if (!c1z0.LIZLLL) {
                        str = "filter_panel_close";
                    } else {
                        str = "";
                    }
                    BPX.LIZIZ(dataChannel, "filter_panel", i2, arrayList, str);
                }
            }
        };
        return new C1Z0(c35011Yz);
    }

    public final C9YY LJZI(int i) {
        for (C9YY c9yy : this.LJLIL) {
            if (c9yy.LJLIL == i) {
                return c9yy;
            }
        }
        return new C9YY(1, "");
    }

    public final boolean LJZL(int i) {
        Iterator<C9YY> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            if (it.next().LJLIL == i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.lol);
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.LLJJIII(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter((AbstractC029409q) this.LJLJI.getValue());
        recyclerView.LJII(new C29541Bib(recyclerView), -1);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 33), findViewById(R.id.lok));
        this.dataChannel.ov0(this, LiveExtendedScreenStatus.class, new AqS171S0100000_5(this, 83));
    }

    public final void LJLZ(int i, boolean z) {
        C9YY c9yy;
        if (!((ArrayList) this.LJLILLLLZI).isEmpty()) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJJI;
            List<C9YY> list = this.LJLILLLLZI;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C9YY) it.next()).LJLIL));
            }
            BPX.LIZLLL(dataChannel, elapsedRealtime, arrayList);
        }
        final ArrayList arrayList2 = new ArrayList(this.LJLILLLLZI);
        this.LJLJJI = SystemClock.elapsedRealtime();
        if (LJZL(i) && !z) {
            List<C9YY> list2 = this.LJLILLLLZI;
            Iterator it2 = ((ArrayList) list2).iterator();
            while (true) {
                if (it2.hasNext()) {
                    c9yy = (C9YY) it2.next();
                    if (c9yy.LJLIL == i) {
                        break;
                    }
                } else {
                    c9yy = null;
                    break;
                }
            }
            C65777Prh.LIZ(list2).remove(c9yy);
        } else if (!LJZL(i) && z) {
            ((ArrayList) this.LJLILLLLZI).add(LJZI(i));
        }
        C03200Aq.LIZ(new AbstractC03120Ai() { // from class: X.9YZ
            @Override // X.AbstractC03120Ai
            public final int LIZLLL() {
                return ((ArrayList) this.LJLILLLLZI).size();
            }

            @Override // X.AbstractC03120Ai
            public final int LJ() {
                return arrayList2.size();
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZ(int i2, int i3) {
                if (((C9YY) ListProtector.get(arrayList2, i2)).LJLIL == ((C9YY) ListProtector.get(this.LJLILLLLZI, i3)).LJLIL) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC03120Ai
            public final boolean LIZIZ(int i2, int i3) {
                if (((C9YY) ListProtector.get(arrayList2, i2)).LJLIL == ((C9YY) ListProtector.get(this.LJLILLLLZI, i3)).LJLIL) {
                    return true;
                }
                return false;
            }
        }, true).LIZJ((AbstractC029409q) this.LJLJI.getValue());
        Iterator it3 = ((ArrayList) this.LJLILLLLZI).iterator();
        int i2 = 0;
        while (it3.hasNext()) {
            i2 |= ((C9YY) it3.next()).LJLIL;
        }
        this.dataChannel.rv0(ExtendedPublicScreenFilterTypeChannel.class, Integer.valueOf(i2));
    }
}
