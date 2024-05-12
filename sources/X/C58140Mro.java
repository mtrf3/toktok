package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.kids.liked.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.kids.liked.api.IFavoriteService;

/* renamed from: X.Mro, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58140Mro extends AbstractC65781Prl implements InterfaceC65784Pro<Fragment> {
    public static final C58140Mro LJLIL = new C58140Mro();

    public C58140Mro() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Fragment invoke() {
        IFavoriteService iFavoriteService;
        Object LIZ = C58096Mr6.LIZ(IFavoriteService.class, false);
        if (LIZ != null) {
            iFavoriteService = (IFavoriteService) LIZ;
        } else {
            if (C58096Mr6.N1 == null) {
                synchronized (IFavoriteService.class) {
                    if (C58096Mr6.N1 == null) {
                        C58096Mr6.N1 = new FavoriteServiceImpl();
                    }
                }
            }
            iFavoriteService = C58096Mr6.N1;
        }
        return iFavoriteService.LIZ();
    }
}
