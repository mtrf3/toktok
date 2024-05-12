package X;

import Y.AfS17S0001000_5;
import Y.AfS57S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.model.FeedItem;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.BNy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC28694BNy extends AbstractC42141l4<FeedItem> {
    public final C73893SzJ<FeedItem> LJZ;
    public final C73893SzJ<Object> LJZI;
    public final C73893SzJ<Object> LJZL;
    public final C73893SzJ<Boolean> LL;
    public final C73893SzJ<Object> LLD;
    public boolean LLF;
    public boolean LLFF;
    public final java.util.Map<Integer, InterfaceC28689BNt> LLFFF;
    public Object[] LLFII;

    public AbstractC28694BNy(java.util.Map<Integer, InterfaceC28689BNt> map) {
        super(new C28695BNz(0));
        C73893SzJ<FeedItem> c73893SzJ = new C73893SzJ<>();
        this.LJZ = c73893SzJ;
        this.LJZI = new C73893SzJ<>();
        this.LJZL = new C73893SzJ<>();
        this.LL = new C73893SzJ<>();
        this.LLD = new C73893SzJ<>();
        this.LLFF = true;
        this.LLFFF = map;
        c73893SzJ.LJJJLIIL(new AfS57S0100000_5(this, 343), new AfS17S0001000_5(1, 16));
    }

    @Override // X.AbstractC42141l4
    public final int LL(Object obj) {
        FeedItem feedItem = (FeedItem) obj;
        if (feedItem != null) {
            int i = feedItem.type;
            if (i != 1) {
                if (i != 6 && i != 1001) {
                    if (i == 1005) {
                        return R.layout.djj;
                    }
                } else {
                    return R.layout.djv;
                }
            } else {
                return R.layout.d77;
            }
        }
        return -8888;
    }

    @Override // X.AbstractC42141l4, X.AbstractC029409q
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (this.LLF) {
            return;
        }
        EnumC12790ep enumC12790ep = EnumC12790ep.LiveFeedInit;
        String cls = viewHolder.getClass().toString();
        HashMap hashMap = new HashMap();
        hashMap.put("viewholder", cls);
        C12800eq.LJ(enumC12790ep, hashMap);
    }

    @Override // X.AbstractC42141l4
    public final RecyclerView.ViewHolder LLII(int i, final ViewGroup viewGroup) {
        InterfaceC28689BNt interfaceC28689BNt = this.LLFFF.get(Integer.valueOf(i));
        if (interfaceC28689BNt == null) {
            return new BNR<Object>(viewGroup) { // from class: X.1l2
                public final ViewGroup LJLJI;

                {
                    super(new View(viewGroup.getContext()));
                    this.LJLJI = viewGroup;
                }

                @Override // X.BNR
                public final void bind(Object obj, int i2) {
                    this.itemView.setLayoutParams(new RecyclerView.LayoutParams(this.LJLJI.getMeasuredWidth(), 1));
                }
            };
        }
        return interfaceC28689BNt.LIZ(viewGroup, this.LLFII);
    }
}
