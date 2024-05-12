package X;

import android.content.Context;
import com.ss.android.ugc.aweme.kids.setting.items.language.langitem.LanguageResponse;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.FdF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39401FdF implements InterfaceC116954iR<LanguageResponse> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        a.LJI().LJIIZILJ(this.LJLIL);
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        AFJ.LIZ(-1, -1, this.LJLILLLLZI, "kids_api_language_edit");
        a.LJI().LJIIZILJ(this.LJLIL);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(LanguageResponse t) {
        o.LJIIIZ(t, "t");
        AFJ.LIZ(-1, 0, this.LJLILLLLZI, "kids_api_language_edit");
    }

    public C39401FdF(Context context, long j) {
        this.LJLIL = context;
        this.LJLILLLLZI = j;
    }
}
