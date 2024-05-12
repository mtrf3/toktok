package X;

import Y.ACListenerS24S0201000_7;
import Y.AObjectS127S0200000_7;
import Y.IDTListenerS116S0100000_7;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.IDqS432S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GrR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42829GrR extends AbstractC42838Gra<RecommendHashtag> {
    public final InterfaceC88473Ynt<Integer, Integer, RecommendHashtag, C76800UCe> LJLL;
    public final InterfaceC88471Ynr<Integer, RecommendHashtag, C76800UCe> LJLLI;
    public final ViewModelStoreOwner LJLLILLLL;
    public List<String> LJLLJ;
    public final List<String> LJLLL;
    public String LJLLLL;
    public final List<RecommendHashtag> LJLLLLLL;
    public RecyclerView LJLZ;

    public final int LJLLLLLL(String str) {
        List<String> list = this.LJLLJ;
        if (list != null && list.contains(str)) {
            List<String> list2 = this.LJLLJ;
            if (list2 != null) {
                return list2.indexOf(str);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C60903NvH.LJIIJJI().LJJIIJ();
        C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getOriginRank error, cachedData: ");
        LIZ.append(this.LJLLJ);
        LIZ.append(", item: ");
        LIZ.append(str);
        LJJ.LIZJ("RECOMMEND_HASHTAG", X1D.LIZIZ(LIZ));
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJLZ(String challenge) {
        int LJLLLLLL;
        o.LJIIIZ(challenge, "challenge");
        if (!((ArrayList) this.LJLLL).contains(challenge) && (LJLLLLLL = LJLLLLLL(challenge)) != -1 && ((ArrayList) this.LJLLLLLL).size() > LJLLLLLL) {
            ((ArrayList) this.LJLLL).add(challenge);
            InterfaceC88471Ynr<Integer, RecommendHashtag, C76800UCe> interfaceC88471Ynr = this.LJLLI;
            Integer valueOf = Integer.valueOf(LJLLLLLL);
            Object obj = ListProtector.get(this.LJLLLLLL, LJLLLLLL);
            ((RecommendHashtag) obj).setLogId(this.LJLLLL);
            interfaceC88471Ynr.invoke(valueOf, obj);
        }
    }

    @Override // X.AbstractC42840Grc, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLZ = recyclerView;
    }

    public final void setData(List<RecommendHashtag> list) {
        ((ArrayList) this.LJLLLLLL).addAll(list);
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<RecommendHashtag> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getChallengeName());
        }
        this.LJLLJ = arrayList;
        C43045Guv.LIZLLL(new AObjectS127S0200000_7(this, list, 4), 0L);
    }

    @Override // X.AbstractC42841Grd
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C42830GrS) {
            C42830GrS c42830GrS = (C42830GrS) viewHolder;
            int LJLLLLLL = LJLLLLLL(((RecommendHashtag) ListProtector.get(this.LJLJLJ, i)).getChallengeName());
            Object obj = ListProtector.get(this.LJLJLJ, i);
            o.LJIIIIZZ(obj, "mItems[position]");
            RecommendHashtag recommendHashtag = (RecommendHashtag) obj;
            AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this, 366);
            c42830GrS.getClass();
            ViewModelStoreOwner viewModelStoreOwner = c42830GrS.LJLILLLLZI;
            o.LJII(viewModelStoreOwner, "null cannot be cast to non-null type com.bytedance.scene.Scene");
            c42830GrS.LJLJI = (HashTagMobHelper) C165706es.LJIIIIZZ((WM7) viewModelStoreOwner, null, null, 6).get(HashTagMobHelper.class);
            ((TextView) c42830GrS.itemView.findViewById(R.id.b8l)).setText(QZZ.LIZIZ('#', recommendHashtag.getChallengeName()));
            C16880lQ.LJIIJ(new ACListenerS24S0201000_7(LJLLLLLL, c42830GrS, recommendHashtag, 7), c42830GrS.itemView);
            c42830GrS.itemView.setOnTouchListener(new IDTListenerS116S0100000_7(c42830GrS, 12));
            c42830GrS.itemView.setOnLongClickListener(new ViewOnLongClickListenerC42832GrU(c42830GrS, recommendHashtag, aqS173S0100000_7));
        }
    }

    @Override // X.AbstractC42841Grd
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        ViewModelStoreOwner viewModelStoreOwner = this.LJLLILLLL;
        IDqS432S0100000_7 iDqS432S0100000_7 = new IDqS432S0100000_7(this, 11);
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        boolean z = true;
        if (((Number) C42887GsN.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        if (z) {
            return new C42830GrS(C1FL.LIZIZ(parent, R.layout.bdr, parent, false, "from(parent.context)\n   …ackground, parent, false)"), iDqS432S0100000_7, viewModelStoreOwner);
        }
        return new C42830GrS(C1FL.LIZIZ(parent, R.layout.bds, parent, false, "from(parent.context)\n   …ackground, parent, false)"), iDqS432S0100000_7, viewModelStoreOwner);
    }

    public C42829GrR(IDqS432S0100000_7 iDqS432S0100000_7, AqS189S0100000_7 aqS189S0100000_7, ViewModelStoreOwner viewModelStoreOwner) {
        o.LJIIIZ(viewModelStoreOwner, "viewModelStoreOwner");
        this.LJLL = iDqS432S0100000_7;
        this.LJLLI = aqS189S0100000_7;
        this.LJLLILLLL = viewModelStoreOwner;
        this.LJLLL = new ArrayList();
        this.LJLLLL = "";
        this.LJLLLLLL = new ArrayList();
        if (this.LJLIL) {
            this.LJLIL = false;
            onShowFooterChanged(false);
        }
    }
}
