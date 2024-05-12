package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4MS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MS extends AbstractC116824iE<C4MT, Emoji> {
    public AqS183S0100000_1 LJLILLLLZI;

    public C4MS() {
        super(null);
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJII(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.ui.adapter.GreetEmojiViewHolder");
        C4MT c4mt = (C4MT) viewHolder;
        Emoji item = getItem(i);
        if (item != null) {
            C4AS.LIZIZ(c4mt.LJLIL, item.getAnimateUrl(), null, 0, 0, 0, 0, null, 508);
            c4mt.LJLILLLLZI = this.LJLILLLLZI;
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        return new C4MT(parent);
    }
}
