package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85928Xnw extends C25860ACy implements InterfaceC85949XoH {
    public final PushItem LJLJJL;

    @Override // X.InterfaceC85949XoH
    public final void LJ(Context context) {
    }

    @Override // X.C25860ACy
    /* renamed from: LJIIJJI */
    public final C25859ACx LJIIIIZZ() {
        C2068389v c2068389v;
        String str = this.LJLJJL.display.title;
        String string = EF7.LIZIZ().getString(R.string.r12);
        if (this.LJLJJL.display.LIZ()) {
            c2068389v = C85926Xnu.LIZLLL(this.LJLJJL.display.icon);
        } else {
            c2068389v = null;
        }
        return new C25859ACx(str, c2068389v, new ACListenerS24S0100000_4(this, 239), null, !C40322Fs6.LIZJ(EF7.LIZIZ()), null, null, string, false, false, null, this.LJLJJL.display.description, false, false, null, null, null, 8384360);
    }

    @Override // X.C25860ACy, X.AG6
    public final /* bridge */ /* synthetic */ C25859ACx LJIIIIZZ() {
        return LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85928Xnw(PushItem pushItem) {
        super(null);
        o.LJIIIZ(pushItem, "pushItem");
        this.LJLJJL = pushItem;
    }

    @Override // X.InterfaceC85949XoH
    public final void LIZIZ(boolean z) {
        LJIIIZ(!z);
    }

    @Override // X.InterfaceC85949XoH
    public final void LIZLLL(int i, String otherItemId) {
        o.LJIIIZ(otherItemId, "otherItemId");
    }
}
