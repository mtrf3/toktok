package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Jb7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC49461Jb7<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ long LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ String LJLL;

    public CallableC49461Jb7(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
        this.LJLJL = str7;
        this.LJLJLJ = j;
        this.LJLJLLL = i;
        this.LJLL = str8;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        C49458Jb4 c49458Jb4 = new C49458Jb4("search");
        c49458Jb4.LJIIZILJ("impr_id", this.LJLIL);
        c49458Jb4.LJIJI(this.LJLILLLLZI);
        String str2 = this.LJLJI;
        if (C78685UuP.LJJJZ(str2)) {
            c49458Jb4.LIZLLL("enter_from_sub", str2);
        }
        c49458Jb4.LJIIZILJ("search_type", this.LJLJJI);
        c49458Jb4.LJIIZILJ("enter_method", this.LJLJJL);
        c49458Jb4.LJIIZILJ("search_keyword", this.LJLJJLL);
        c49458Jb4.LJIIZILJ("group_id", this.LJLJL);
        c49458Jb4.LJIIZILJ("duration", String.valueOf(SystemClock.elapsedRealtime() - this.LJLJLJ));
        c49458Jb4.LJIIZILJ("group_id", C50293JoX.LJFF());
        if (this.LJLJLLL == 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c49458Jb4.LJIIZILJ("is_success", str);
        String imprId = this.LJLL;
        o.LJIIIZ(imprId, "imprId");
        c49458Jb4.LJIIZILJ("pre_click_id", imprId);
        c49458Jb4.LJIILIIL();
        return C76800UCe.LIZ;
    }
}
