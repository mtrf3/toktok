package Y;

import X.AbstractC029409q;
import X.C31413CUn;
import X.CV6;
import X.CY0;
import X.CY2;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class ARunnableS1S0220000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ((OnlineAudienceRankWidget) this.l0).LJZL();
        OnlineAudienceRankWidget onlineAudienceRankWidget = (OnlineAudienceRankWidget) this.l0;
        LinearLayout linearLayout = onlineAudienceRankWidget.LLIIIILZ;
        if (linearLayout != null) {
            List<CV6> list = (List) this.l1;
            boolean z = this.z2;
            boolean z2 = this.z3;
            boolean z3 = false;
            linearLayout.setVisibility(0);
            int i = onlineAudienceRankWidget.LLF;
            if (i != 0) {
                if (i != 1) {
                    DataChannel dataChannel = onlineAudienceRankWidget.dataChannel;
                    if (list.size() > 0) {
                        z3 = true;
                    }
                    CY0.LIZJ(list.size(), dataChannel, z3);
                    onlineAudienceRankWidget.LJLL = list.size();
                } else if (list.size() >= 1) {
                    if (z || !z2 || onlineAudienceRankWidget.LLFF().size() <= 0 || onlineAudienceRankWidget.LJLL != 1 || ((CV6) ListProtector.get(onlineAudienceRankWidget.LLFF(), 0)).LIZ.getId() != ((CV6) ListProtector.get(list, 0)).LIZ.getId() || ((CV6) ListProtector.get(onlineAudienceRankWidget.LLFF(), 0)).LIZIZ != ((CV6) ListProtector.get(list, 0)).LIZIZ) {
                        CY0.LIZJ(1, onlineAudienceRankWidget.dataChannel, true);
                        onlineAudienceRankWidget.LJLL = 1;
                        list = list.subList(0, 1);
                    }
                } else {
                    CY0.LIZJ(0, onlineAudienceRankWidget.dataChannel, false);
                    onlineAudienceRankWidget.LJLL = 0;
                    list = new ArrayList<>(0);
                }
            } else {
                CY0.LIZJ(0, onlineAudienceRankWidget.dataChannel, false);
                onlineAudienceRankWidget.LJLL = 0;
                list = new ArrayList<>(0);
            }
            CY2 cy2 = onlineAudienceRankWidget.LLIIIJ;
            if (cy2 != null) {
                cy2.LIZJ(list);
            }
        }
        OnlineAudienceRankWidget onlineAudienceRankWidget2 = (OnlineAudienceRankWidget) this.l0;
        List list2 = (List) this.l1;
        onlineAudienceRankWidget2.LLFF().clear();
        onlineAudienceRankWidget2.LLFF().addAll(list2);
    }

    public final void LIZ$1() {
        AbstractC029409q abstractC029409q;
        boolean z;
        ((OnlineAudienceRankWidget) this.l0).LJZL();
        RecyclerView recyclerView = ((OnlineAudienceRankWidget) this.l0).LJLJLJ;
        C31413CUn c31413CUn = null;
        if (recyclerView != null) {
            abstractC029409q = recyclerView.getAdapter();
        } else {
            abstractC029409q = null;
        }
        if (abstractC029409q instanceof C31413CUn) {
            c31413CUn = (C31413CUn) abstractC029409q;
        }
        if (c31413CUn != null) {
            OnlineAudienceRankWidget onlineAudienceRankWidget = (OnlineAudienceRankWidget) this.l0;
            List<?> list = (List) this.l1;
            boolean z2 = this.z2;
            boolean z3 = this.z3;
            RecyclerView recyclerView2 = onlineAudienceRankWidget.LJLJLJ;
            if (recyclerView2 == null || !recyclerView2.LJJJLL()) {
                ImageView imageView = (ImageView) onlineAudienceRankWidget.LJLJJLL.getValue();
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                RecyclerView recyclerView3 = onlineAudienceRankWidget.LJLJLJ;
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                }
                int i = onlineAudienceRankWidget.LLF;
                if (i != 0) {
                    if (i != 1) {
                        c31413CUn.LJZ(list);
                        DataChannel dataChannel = onlineAudienceRankWidget.dataChannel;
                        if (list.size() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        CY0.LIZJ(list.size(), dataChannel, z);
                        onlineAudienceRankWidget.LJLL = list.size();
                    } else if (list.size() >= 1) {
                        if (z2 || !z3 || onlineAudienceRankWidget.LLFF().size() <= 0 || onlineAudienceRankWidget.LJLL != 1 || ((CV6) ListProtector.get(onlineAudienceRankWidget.LLFF(), 0)).LIZ.getId() != ((CV6) ListProtector.get(list, 0)).LIZ.getId() || ((CV6) ListProtector.get(onlineAudienceRankWidget.LLFF(), 0)).LIZIZ != ((CV6) ListProtector.get(list, 0)).LIZIZ) {
                            c31413CUn.LJZ(list.subList(0, 1));
                            CY0.LIZJ(1, onlineAudienceRankWidget.dataChannel, true);
                            onlineAudienceRankWidget.LJLL = 1;
                        }
                    } else {
                        c31413CUn.LJZ(new ArrayList(0));
                        CY0.LIZJ(0, onlineAudienceRankWidget.dataChannel, false);
                        onlineAudienceRankWidget.LJLL = 0;
                    }
                } else {
                    c31413CUn.LJZ(new ArrayList(0));
                    CY0.LIZJ(0, onlineAudienceRankWidget.dataChannel, false);
                    onlineAudienceRankWidget.LJLL = 0;
                }
                c31413CUn.notifyDataSetChanged();
            }
        }
        OnlineAudienceRankWidget onlineAudienceRankWidget2 = (OnlineAudienceRankWidget) this.l0;
        List list2 = (List) this.l1;
        RecyclerView recyclerView4 = onlineAudienceRankWidget2.LJLJLJ;
        if (recyclerView4 != null && recyclerView4.LJJJLL()) {
            return;
        }
        onlineAudienceRankWidget2.LLFF().clear();
        onlineAudienceRankWidget2.LLFF().addAll(list2);
    }

    public static final void run$0(ARunnableS1S0220000_5 aRunnableS1S0220000_5) {
        boolean LIZ;
        try {
            aRunnableS1S0220000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S0220000_5 aRunnableS1S0220000_5) {
        boolean LIZ;
        try {
            aRunnableS1S0220000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS1S0220000_5(OnlineAudienceRankWidget onlineAudienceRankWidget, OnlineAudienceRankWidget onlineAudienceRankWidget2, List<CV6> list, boolean z, boolean z2) {
        this.$t = z2 ? 1 : 0;
        this.l0 = onlineAudienceRankWidget;
        this.l1 = onlineAudienceRankWidget2;
        this.z2 = list;
        this.z3 = z;
    }
}
