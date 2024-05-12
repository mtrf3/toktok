package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.Uqr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78465Uqr implements R47 {
    public final /* synthetic */ C78461Uqn LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ EnterRoomConfig LIZJ;
    public final /* synthetic */ Aweme LIZLLL;
    public final /* synthetic */ List<Aweme> LJ;
    public final /* synthetic */ InterfaceC54958Lha LJFF;
    public final /* synthetic */ InterfaceC78468Uqu LJI;

    public C78465Uqr(C78461Uqn c78461Uqn, Context context, EnterRoomConfig enterRoomConfig, Aweme aweme, List<Aweme> list, InterfaceC54958Lha interfaceC54958Lha, InterfaceC78468Uqu interfaceC78468Uqu) {
        this.LIZ = c78461Uqn;
        this.LIZIZ = context;
        this.LIZJ = enterRoomConfig;
        this.LIZLLL = aweme;
        this.LJ = list;
        this.LJFF = interfaceC54958Lha;
        this.LJI = interfaceC78468Uqu;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i2 == 1) {
            this.LIZ.LIZJ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
        }
    }
}
