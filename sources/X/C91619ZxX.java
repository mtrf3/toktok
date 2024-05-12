package X;

import com.ss.android.ugc.aweme.dsp.v2.TTDspFragmentV2;

/* renamed from: X.ZxX, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final /* synthetic */ class C91619ZxX extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C91619ZxX(Object obj) {
        super(0, obj, TTDspFragmentV2.class, "selectFavorites", "selectFavorites()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        TTDspFragmentV2 tTDspFragmentV2 = (TTDspFragmentV2) this.receiver;
        LPU Jl = tTDspFragmentV2.Jl();
        if (Jl != null) {
            Jl.setCurrentItem(0, false);
        }
        tTDspFragmentV2.Ml("LIBRARY V2");
        return C76800UCe.LIZ;
    }
}
