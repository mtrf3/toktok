package X;

import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.ui.VoiceSearchHelper$performVoiceSearch$job$1$1$other$2;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.IDqS10S0400000_42;

/* renamed from: X.acB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94139acB implements InterfaceC93759aW3 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ ActivityC45651qj LIZIZ;
    public final /* synthetic */ HashMap<String, String> LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ K55 LJ;
    public final /* synthetic */ C93906aYQ LJFF;

    @Override // X.InterfaceC93759aW3
    public final void LIZ() {
        KJB LIZ = C93678aUk.LIZ(this.LIZ);
        if (LIZ != null) {
            LIZ.LIZLLL(this.LIZIZ, this.LIZJ, this.LIZ, this.LIZLLL, this.LJ);
        }
    }

    @Override // X.InterfaceC93759aW3
    public final void LIZIZ() {
        C93906aYQ c93906aYQ = this.LJFF;
        HashMap<String, String> hashMap = this.LIZJ;
        c93906aYQ.getClass();
        C93906aYQ.LIZ("", hashMap, false);
        C93906aYQ c93906aYQ2 = this.LJFF;
        C26227ARb c26227ARb = new C26227ARb(this.LIZIZ);
        c26227ARb.LJ(R.string.tsh);
        c26227ARb.LIZ(R.string.tsg);
        UC0.LIZJ(c26227ARb, new IDqS10S0400000_42(this.LJFF, (C93906aYQ) this.LIZJ, (HashMap<String, String>) this.LIZIZ, (ActivityC45651qj) this.LJ, (K55) 1));
        c93906aYQ2.LIZ = c26227ARb.LJI();
        C26231ARf c26231ARf = this.LJFF.LIZ;
        if (c26231ARf != null) {
            c26231ARf.LIZLLL();
        }
        this.LIZIZ.getLifecycle().addObserver(new VoiceSearchHelper$performVoiceSearch$job$1$1$other$2(this.LJFF, this.LIZIZ));
    }

    public C94139acB(String str, ActivityC45651qj activityC45651qj, HashMap<String, String> hashMap, int i, K55 k55, C93906aYQ c93906aYQ) {
        this.LIZ = str;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = hashMap;
        this.LIZLLL = i;
        this.LJ = k55;
        this.LJFF = c93906aYQ;
    }
}
