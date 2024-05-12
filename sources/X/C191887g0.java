package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteFragment;

/* renamed from: X.7g0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191887g0 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ AllFavoriteFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C191887g0(AllFavoriteFragment allFavoriteFragment) {
        super(0);
        this.LJLIL = allFavoriteFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = true;
        if (arguments != null) {
            z = arguments.getBoolean("is_show_navbar", true);
        }
        return Boolean.valueOf(z);
    }
}
