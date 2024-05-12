package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.57A, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57A implements InterfaceC84517XEz<ResourceItem> {
    public final /* synthetic */ AnonymousClass574 LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ AnonymousClass551 LIZJ;
    public final /* synthetic */ boolean LIZLLL;

    @Override // X.InterfaceC84517XEz
    public final void onStart() {
        this.LIZ.LJIIIZ();
    }

    @Override // X.InterfaceC84517XEz
    public final void LIZ(C57M c57m) {
        AnonymousClass573 anonymousClass573 = this.LIZ.LJLJL;
        if (anonymousClass573 != null) {
            anonymousClass573.LIZIZ(false, System.currentTimeMillis() - this.LIZIZ, c57m.LIZ, Integer.valueOf(c57m.LIZIZ));
        }
        this.LIZ.LIZLLL();
        this.LIZ.LJIIIIZZ();
        C57U c57u = this.LIZ.LJLJJL;
        if (c57u != null) {
            c57u.LIZ(false, this.LIZLLL);
        }
    }

    @Override // X.InterfaceC84517XEz
    public final void onSuccess(List<? extends ResourceItem> dataList) {
        o.LJIIIZ(dataList, "dataList");
        AnonymousClass573 anonymousClass573 = this.LIZ.LJLJL;
        if (anonymousClass573 != null) {
            anonymousClass573.LIZIZ(true, System.currentTimeMillis() - this.LIZIZ, null, null);
        }
        this.LIZ.LIZLLL();
        AnonymousClass574 anonymousClass574 = this.LIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(dataList, 10));
        Iterator<? extends ResourceItem> it = dataList.iterator();
        while (it.hasNext()) {
            arrayList.add(new AnonymousClass572(it.next(), 30));
        }
        anonymousClass574.setupList(arrayList);
        if (this.LIZJ.LJIIJJI.LJLIL) {
            this.LIZ.getClass();
        }
        C57U c57u = this.LIZ.LJLJJL;
        if (c57u != null) {
            c57u.LIZ(true, this.LIZLLL);
        }
    }

    public C57A(AnonymousClass574 anonymousClass574, long j, AnonymousClass551 anonymousClass551, boolean z) {
        this.LIZ = anonymousClass574;
        this.LIZIZ = j;
        this.LIZJ = anonymousClass551;
        this.LIZLLL = z;
    }
}
