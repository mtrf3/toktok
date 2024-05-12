package X;

import X.C2K3;
import X.C8BS;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7uH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C200737uH<T extends C8BS, K extends C2K3> extends C8BR<T, K> {
    public List<Object> LJLJJI;

    @Override // X.C8BR
    public boolean LJIILL(Object... objArr) {
        this.LJLJJI = new ArrayList();
        for (Object obj : objArr) {
            this.LJLJJI.add(obj);
        }
        return super.LJIILL(objArr);
    }
}
