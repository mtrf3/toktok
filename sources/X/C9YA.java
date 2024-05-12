package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.model.Keyword;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9YA, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9YA extends RecyclerView.ViewHolder {
    public final InterfaceC88472Yns<Keyword, C76800UCe> LJLIL;
    public final InterfaceC88472Yns<Keyword, C76800UCe> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9YA(View view, InterfaceC88472Yns<? super Keyword, C76800UCe> deleteKeyword, InterfaceC88472Yns<? super Keyword, C76800UCe> updateKeyword) {
        super(view);
        o.LJIIIZ(deleteKeyword, "deleteKeyword");
        o.LJIIIZ(updateKeyword, "updateKeyword");
        this.LJLIL = deleteKeyword;
        this.LJLILLLLZI = updateKeyword;
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(view, 1129));
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(view, 1130));
        this.LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(view, 1127));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(view, 1128));
    }
}
