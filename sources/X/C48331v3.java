package X;

import android.text.BidiFormatter;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1v3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48331v3 extends AbstractC65781Prl implements InterfaceC88471Ynr<LiveEffect, AnonymousClass018, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C05900La LJLILLLLZI;
    public final /* synthetic */ LiveEffect LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48331v3(long j, C05900La c05900La, LiveEffect liveEffect) {
        super(2);
        this.LJLIL = j;
        this.LJLILLLLZI = c05900La;
        this.LJLJI = liveEffect;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(LiveEffect requestedEffect, AnonymousClass018 anonymousClass018) {
        AnonymousClass018 anonymousClass0182 = anonymousClass018;
        o.LJIIIZ(requestedEffect, "requestedEffect");
        C28289B8j.LIZJ(System.currentTimeMillis(), this.LJLIL, C28787BRn.LIZ("EffectAuthorInfoView"), "time");
        if (o.LJ(requestedEffect, this.LJLILLLLZI.LJLILLLLZI)) {
            C05900La c05900La = this.LJLILLLLZI;
            if (!c05900La.LJLJJLL) {
                if (anonymousClass0182 == null) {
                    ((TextView) c05900La.LIZ(R.id.cse)).setText(R.string.kzg);
                } else {
                    c05900La.LJLJJI = true;
                    ((TextView) c05900La.LIZ(R.id.cse)).setText(C15380j0.LJIILL(R.string.kzf, BidiFormatter.getInstance(CCJ.LIZ(this.LJLILLLLZI.getContext())).unicodeWrap(this.LJLJI.getName()), BidiFormatter.getInstance(CCJ.LIZ(this.LJLILLLLZI.getContext())).unicodeWrap(anonymousClass0182.LIZIZ)));
                }
                ((CL0) this.LJLILLLLZI.LIZ(R.id.cse)).LJJIJLIJ();
                this.LJLILLLLZI.LIZLLL();
                C05900La c05900La2 = this.LJLILLLLZI;
                c05900La2.LJLJL.removeCallbacks(c05900La2.LJLJLJ);
                c05900La2.LJLJJLL = false;
                this.LJLILLLLZI.LIZIZ();
                return C76800UCe.LIZ;
            }
        }
        C05900La c05900La3 = this.LJLILLLLZI;
        c05900La3.LJLJL.removeCallbacks(c05900La3.LJLJLJ);
        c05900La3.LJLJJLL = false;
        return C76800UCe.LIZ;
    }
}
