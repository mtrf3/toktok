package Y;

import X.C141185gQ;
import X.C141205gS;
import X.C141225gU;
import X.C141235gV;
import X.C141455gr;
import X.C32I;
import X.C73305Spp;
import X.InterfaceC42845Grh;
import X.InterfaceC64592gB;
import X.ORZ;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.gamora.editorpro.soundeffect.data.SoundEffectListApiResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AfS34S0101000_2 implements InterfaceC64592gB {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.5gV] */
    public static final void accept$0(AfS34S0101000_2 afS34S0101000_2, Object obj) {
        boolean z;
        int i;
        int i2;
        SoundEffectListApiResponse soundEffectListApiResponse = (SoundEffectListApiResponse) obj;
        ArrayList<SoundEffect> arrayList = soundEffectListApiResponse.list;
        if (arrayList != null) {
            final C141185gQ c141185gQ = (C141185gQ) afS34S0101000_2.l0;
            int i3 = afS34S0101000_2.i1;
            Integer num = soundEffectListApiResponse.LJLIL;
            o.LJI(num);
            c141185gQ.LJII = num.intValue();
            Integer num2 = soundEffectListApiResponse.hasMore;
            if (num2 == null || num2.intValue() != 1 || arrayList.size() < 20) {
                z = false;
            } else {
                z = true;
            }
            c141185gQ.LJIIIIZZ = z;
            C141455gr c141455gr = c141185gQ.LJ;
            if (c141455gr == null || i3 == 0) {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator<SoundEffect> it = arrayList.iterator();
                while (it.hasNext()) {
                    SoundEffect next = it.next();
                    int i4 = next.collectStatus;
                    if (next.isLocalFileExist) {
                        i = 3;
                    } else {
                        i = 1;
                    }
                    arrayList2.add(new C141225gU(next, i, i4));
                }
                c141185gQ.LJFF.clear();
                c141185gQ.LJFF.addAll(arrayList2);
                C141455gr c141455gr2 = new C141455gr(c141185gQ.LIZ, (C141205gS) c141185gQ.LJIILL.getValue());
                c141185gQ.LJ = c141455gr2;
                c141455gr2.LJLJI = c141185gQ.LIZLLL;
                c141455gr2.setData(ORZ.LLJILJILJ(arrayList2));
                c141185gQ.LIZIZ();
                WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
                RecyclerView recyclerView = c141185gQ.LJIILIIL;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(wrapLinearLayoutManager);
                }
                RecyclerView recyclerView2 = c141185gQ.LJIILIIL;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(c141185gQ.LJ);
                }
                RecyclerView recyclerView3 = c141185gQ.LJIILIIL;
                if (recyclerView3 != null) {
                    recyclerView3.setItemAnimator(null);
                }
                if (!c141185gQ.LJIIIIZZ) {
                    C141455gr c141455gr3 = c141185gQ.LJ;
                    if (c141455gr3 != null) {
                        c141455gr3.setShowFooter(false);
                        return;
                    }
                    return;
                }
                C141455gr c141455gr4 = c141185gQ.LJ;
                if (c141455gr4 != null) {
                    c141455gr4.setLoadMoreListener(new AqS152S0100000_2((C141235gV) new InterfaceC42845Grh() { // from class: X.5gV
                        @Override // X.InterfaceC42845Grh
                        public final void LJIIJJI() {
                            C141455gr c141455gr5 = C141185gQ.this.LJ;
                            if (c141455gr5 != null) {
                                c141455gr5.showLoadMoreLoading();
                            }
                            C141185gQ c141185gQ2 = C141185gQ.this;
                            c141185gQ2.LIZ(c141185gQ2.LJII);
                        }
                    }, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT));
                    return;
                }
                return;
            }
            ArrayList<C141225gU> arrayList3 = c141185gQ.LJFF;
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator<SoundEffect> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                SoundEffect next2 = it2.next();
                int i5 = next2.collectStatus;
                if (next2.isLocalFileExist) {
                    i2 = 3;
                } else {
                    i2 = 1;
                }
                arrayList4.add(new C141225gU(next2, i2, i5));
            }
            arrayList3.addAll(arrayList4);
            c141455gr.setDataAfterLoadMore(c141185gQ.LJFF);
            if (c141185gQ.LJIIIIZZ) {
                c141455gr.resetLoadMoreState();
            } else {
                c141455gr.setShowFooter(false);
            }
        }
    }

    public static final void accept$1(AfS34S0101000_2 afS34S0101000_2, Object obj) {
        Throwable th = (Throwable) obj;
        C141455gr c141455gr = ((C141185gQ) afS34S0101000_2.l0).LJ;
        if (c141455gr == null || afS34S0101000_2.i1 == 0) {
            if (o.LJ(th.getMessage(), "error_msg_empty")) {
                C141185gQ c141185gQ = (C141185gQ) afS34S0101000_2.l0;
                c141185gQ.LJIIIZ = true;
                c141185gQ.LJII = 0;
                c141185gQ.LIZIZ();
                C141455gr c141455gr2 = c141185gQ.LJ;
                if (c141455gr2 != null) {
                    c141455gr2.clearData();
                }
                C141455gr c141455gr3 = c141185gQ.LJ;
                if (c141455gr3 != null) {
                    c141455gr3.notifyDataSetChanged();
                }
                View view = c141185gQ.LJIIJ;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = c141185gQ.LJIIJJI;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                TextView textView = c141185gQ.LJIIL;
                if (textView != null) {
                    textView.setText(R.string.fnr);
                    return;
                }
                return;
            }
            C141185gQ c141185gQ2 = (C141185gQ) afS34S0101000_2.l0;
            C141455gr c141455gr4 = c141185gQ2.LJ;
            if (c141455gr4 != null) {
                c141455gr4.clearData();
            }
            c141185gQ2.LJII = 0;
            c141185gQ2.LJIIIZ = false;
            C73305Spp c73305Spp = c141185gQ2.LJIILJJIL;
            if (c73305Spp != null) {
                c73305Spp.setVisibility(8);
            }
            View view3 = c141185gQ2.LJIIJ;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = c141185gQ2.LJIIJJI;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            TextView textView2 = c141185gQ2.LJIIL;
            if (textView2 == null) {
                return;
            }
            textView2.setText(R.string.dte);
            return;
        }
        c141455gr.setShowFooter(false);
    }

    public AfS34S0101000_2(C141185gQ c141185gQ, int i, int i2) {
        this.$t = i2;
        this.l0 = c141185gQ;
        this.i1 = i;
    }
}
