package X;

import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.LHa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53994LHa implements InterfaceC53995LHb {
    public final InterfaceC53995LHb LJLIL;

    @Override // X.InterfaceC53995LHb
    public final void Bt0(Throwable th, EnumC36206EIw source) {
        o.LJIIIZ(source, "source");
        this.LJLIL.Bt0(th, source);
    }

    @Override // X.InterfaceC53995LHb
    public final void D10() {
        this.LJLIL.D10();
    }

    @Override // X.InterfaceC53995LHb
    public final OSZ<Boolean, String> D20() {
        return this.LJLIL.D20();
    }

    @Override // X.InterfaceC53995LHb
    public final void Go0() {
        this.LJLIL.Go0();
    }

    @Override // X.InterfaceC53995LHb
    public final int KY(String tag) {
        o.LJIIIZ(tag, "tag");
        return this.LJLIL.KY(tag);
    }

    @Override // X.InterfaceC53995LHb
    public final void Ng0(NewContentResponse response, EnumC36206EIw enumC36206EIw) {
        o.LJIIIZ(response, "response");
        this.LJLIL.Ng0(response, enumC36206EIw);
    }

    @Override // X.InterfaceC53995LHb
    public final boolean PT() {
        return this.LJLIL.PT();
    }

    @Override // X.InterfaceC53995LHb
    public final void St0() {
        this.LJLIL.St0();
    }

    @Override // X.InterfaceC53995LHb
    public final C35585Dxt Yi() {
        return this.LJLIL.Yi();
    }

    @Override // X.InterfaceC53995LHb
    public final void Zk(String str, String str2) {
        this.LJLIL.Zk(str, str2);
    }

    @Override // X.LHX
    public final void ag(String fromTag, String str) {
        o.LJIIIZ(fromTag, "fromTag");
        this.LJLIL.ag(fromTag, str);
    }

    @Override // X.InterfaceC53995LHb
    public final LIV getSocialTabNoticeData() {
        return this.LJLIL.getSocialTabNoticeData();
    }

    @Override // X.InterfaceC53995LHb
    public final void pX(boolean z) {
        this.LJLIL.pX(z);
    }

    @Override // X.InterfaceC53995LHb
    public final ArrayList<Integer> sv() {
        return this.LJLIL.sv();
    }

    @Override // X.InterfaceC53995LHb
    public final ArrayList<SingleTabCounter> wE() {
        return this.LJLIL.wE();
    }

    @Override // X.InterfaceC53995LHb
    public final void ym(int i, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL.ym(i, aweme);
    }

    @Override // X.InterfaceC53995LHb
    public final InterfaceC54017LHx zA() {
        return this.LJLIL.zA();
    }

    public C53994LHa(BaseRedDotImpl baseRedDotImpl) {
        this.LJLIL = baseRedDotImpl;
    }
}
