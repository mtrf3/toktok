package X;

import android.content.Context;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.84v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2055384v extends AbstractC65781Prl implements InterfaceC88472Yns<AnonymousClass850, AnonymousClass850> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2055384v(float f, Context context, String str, boolean z) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = f;
        this.LJLJI = str;
        this.LJLJJI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final AnonymousClass850 invoke(AnonymousClass850 anonymousClass850) {
        AnonymousClass850 it = anonymousClass850;
        o.LJIIIZ(it, "it");
        List<Object> list = it.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C8F5) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            it.LIZIZ.removeAll(arrayList);
            List<Object> list2 = it.LIZIZ;
            Context context = this.LJLIL;
            float f = this.LJLILLLLZI;
            Object obj2 = it.LIZLLL;
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.model.TextExtraStruct");
            list2.add(C2054984r.LIZLLL(context, f, (TextExtraStruct) obj2, this.LJLJI, this.LJLJJI));
        }
        return it;
    }
}
