package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;

/* renamed from: X.UkL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78061UkL implements R47 {
    public final /* synthetic */ C78461Uqn LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ EnterRoomConfig LIZLLL;
    public final /* synthetic */ List<Long> LJ;
    public final /* synthetic */ String LJFF;

    public C78061UkL(Context context, EnterRoomConfig enterRoomConfig, C78461Uqn c78461Uqn, String str, String str2, List list) {
        this.LIZ = c78461Uqn;
        this.LIZIZ = context;
        this.LIZJ = str;
        this.LIZLLL = enterRoomConfig;
        this.LJ = list;
        this.LJFF = str2;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i2 == 1) {
            this.LIZ.LJIJ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
        }
    }
}
