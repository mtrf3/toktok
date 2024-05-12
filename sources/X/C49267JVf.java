package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JVf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49267JVf implements InterfaceC49264JVc {
    public final int LIZIZ;
    public final InterfaceC65784Pro<Integer> LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C8YF<InterfaceC212998Xn<?, ?>, C8RL> LJ;
    public final ISearchCardProtocol<InterfaceC49871Jhj> LJFF;

    @Override // X.InterfaceC49264JVc
    public final int LIZJ() {
        int i = C49271JVj.LIZ[this.LJFF.getConfig().LIZIZ().ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return this.LIZJ.invoke().intValue();
        }
        throw new C162476Zf();
    }

    @Override // X.InterfaceC49264JVc
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC49264JVc
    public final ISearchCardProtocol<InterfaceC49871Jhj> getProtocol() {
        return this.LJFF;
    }

    @Override // X.InterfaceC49264JVc
    public final SearchCardViewHolder LIZIZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        LifecycleOwner lifecycleOwner = this.LIZLLL;
        C8YF<InterfaceC212998Xn<?, ?>, C8RL> proxyer = this.LJ;
        ISearchCardProtocol<InterfaceC49871Jhj> protocol = this.LJFF;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(proxyer, "proxyer");
        o.LJIIIZ(protocol, "protocol");
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.cfa, parent, false);
        o.LJIIIIZZ(itemView, "itemView");
        return new SearchCardViewHolder(itemView, lifecycleOwner, proxyer, protocol);
    }

    @Override // X.InterfaceC49264JVc
    public final boolean LJJLIL(InterfaceC49871Jhj interfaceC49871Jhj) {
        InterfaceC49871Jhj interfaceC49871Jhj2 = (InterfaceC49871Jhj) T2R.LJIL(interfaceC49871Jhj, this.LJFF.LLLIZZ());
        if (interfaceC49871Jhj2 != null) {
            return this.LJFF.LJJLIL(interfaceC49871Jhj2);
        }
        return false;
    }

    public C49267JVf(int i, InterfaceC65784Pro fullSpanCountFetcher, Fragment lifecycleOwner, C8YF proxyer, ISearchCardProtocol protocol) {
        o.LJIIIZ(fullSpanCountFetcher, "fullSpanCountFetcher");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(proxyer, "proxyer");
        o.LJIIIZ(protocol, "protocol");
        this.LIZIZ = i;
        this.LIZJ = fullSpanCountFetcher;
        this.LIZLLL = lifecycleOwner;
        this.LJ = proxyer;
        this.LJFF = protocol;
    }
}
