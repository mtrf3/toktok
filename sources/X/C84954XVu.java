package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: X.XVu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84954XVu<T> implements InterfaceC86003Zc {
    public final /* synthetic */ MusicModel LJLIL;
    public final /* synthetic */ C84868XSm LJLILLLLZI;
    public final /* synthetic */ AbstractC73851Syd<C84768XOq> LJLJI;

    public C84954XVu(C84868XSm c84868XSm, MusicModel musicModel, C73893SzJ c73893SzJ) {
        this.LJLIL = musicModel;
        this.LJLILLLLZI = c84868XSm;
        this.LJLJI = c73893SzJ;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C84767XOp> interfaceC73573Su9) {
        MusicModel musicModel = this.LJLIL;
        if (musicModel == null) {
            interfaceC73573Su9.onNext(new C84767XOp(null, null, -103, null, null, null, null, 123));
            interfaceC73573Su9.onComplete();
        } else if (!this.LJLILLLLZI.LIZJ(musicModel, new C84955XVv(this.LJLJI, (C73433Srt) interfaceC73573Su9), true, true)) {
            interfaceC73573Su9.onNext(new C84767XOp(null, null, -103, new XSX(-1, "don`t start download music"), null, null, null, 115));
            interfaceC73573Su9.onComplete();
        }
    }
}
