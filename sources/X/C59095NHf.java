package X;

import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;

/* renamed from: X.NHf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59095NHf implements InterfaceC59094NHe {
    public final /* synthetic */ C59096NHg LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ PhotoCarouselProductStruct LIZJ;

    @Override // X.InterfaceC59094NHe
    public final C59062NFy LIZIZ() {
        C59062NFy[] c59062NFyArr = this.LIZ.LJLJI;
        return c59062NFyArr[this.LIZIZ % c59062NFyArr.length];
    }

    @Override // X.InterfaceC59094NHe
    public final PhotoCarouselProductStruct LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC59094NHe
    public final int LIZJ() {
        return this.LIZIZ;
    }

    public C59095NHf(C59096NHg c59096NHg, int i, PhotoCarouselProductStruct photoCarouselProductStruct) {
        this.LIZ = c59096NHg;
        this.LIZIZ = i;
        this.LIZJ = photoCarouselProductStruct;
    }
}
