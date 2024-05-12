package X;

import android.view.View;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MSX extends C56906MVa {
    public final CreatorNoticeResultVM LJLIL;
    public final C73305Spp LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    public final void onClick(View view) {
        super.onClick(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MSX(View view, CreatorNoticeResultVM creatorVM) {
        super(view);
        o.LJIIIZ(creatorVM, "creatorVM");
        this.LJLIL = creatorVM;
        View findViewById = view.findViewById(R.id.cvo);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.empty_status_view)");
        this.LJLILLLLZI = (C73305Spp) findViewById;
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 929));
    }
}
