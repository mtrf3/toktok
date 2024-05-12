package X;

import com.bytedance.android.live.broadcast.mirror.widget.GameCastWidget;

/* renamed from: X.1rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46191rb extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ GameCastWidget LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46191rb(GameCastWidget gameCastWidget, boolean z) {
        super(0);
        this.LJLIL = gameCastWidget;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LJZI(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
