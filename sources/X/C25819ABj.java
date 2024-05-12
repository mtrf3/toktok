package X;

import com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.ss.android.ugc.aweme.internal.ICrossLanguageUserService;

/* renamed from: X.ABj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25819ABj extends AbstractC65781Prl implements InterfaceC65784Pro<ICrossLanguageUserService> {
    public static final C25819ABj LJLIL = new C25819ABj();

    public C25819ABj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ICrossLanguageUserService invoke() {
        return CrossLanguageUserExperiment.LIZJ();
    }
}
