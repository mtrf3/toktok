package X;

import Y.ACallableS79S0101000_7;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.ss.android.ugc.aweme.api.resp.AnchorSelectionResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42779Gqd extends AbstractC51036K1g<Object, AnchorSelectionResponse> {
    public final int LJLIL;
    public int LJLILLLLZI = 1;
    public final List<Object> LJLJI = new ArrayList();
    public final List<AnchorModule> LJLJJI = new ArrayList();
    public final List<Object> LJLJJL = new ArrayList();
    public boolean LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;

    public final int LJIIIZ() {
        Integer num;
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof AnchorModule) || (num = ((AnchorModule) next).type) == null || num.intValue() != 2) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC51036K1g
    public final List<Object> getItems() {
        return this.LJLJI;
    }

    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        return this.LJLJJLL;
    }

    public C42779Gqd(int i) {
        this.LJLIL = i;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x017b, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d9, code lost:
    
        if (r0 != null) goto L51;
     */
    @Override // X.C8BS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42779Gqd.handleData(java.lang.Object):void");
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS79S0101000_7(this.LJLILLLLZI, this, 5), 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS79S0101000_7(0, this, 5), 0);
    }
}
