package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6oO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171606oO extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public final /* synthetic */ C171726oa LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ List<C171726oa> LJLJJL;
    public final /* synthetic */ C171566oK LJLJJLL;
    public final /* synthetic */ Context LJLJL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJLJ;
    public final /* synthetic */ InterfaceC88472Yns<Float, C76800UCe> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C171606oO(C171726oa c171726oa, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, List<C171726oa> list, C171566oK c171566oK, Context context, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns2) {
        super(1);
        this.LJLIL = c171726oa;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = i;
        this.LJLJJL = list;
        this.LJLJJLL = c171566oK;
        this.LJLJL = context;
        this.LJLJLJ = interfaceC88472Yns;
        this.LJLJLLL = interfaceC88472Yns2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        if (num.intValue() == 0) {
            C171726oa c171726oa = this.LJLIL;
            String newPath = this.LJLILLLLZI;
            c171726oa.getClass();
            o.LJIIIZ(newPath, "newPath");
            c171726oa.LIZJ = true;
            c171726oa.LIZ = newPath;
            C171596oN.LIZ.LIZ(this.LJLILLLLZI);
            this.LJLJI.invoke();
            int i = this.LJLJJI + 1;
            if (i < this.LJLJJL.size()) {
                this.LJLJJLL.LIZ(i, this.LJLJL, this.LJLJJL, this.LJLJI, this.LJLJLJ, this.LJLJLLL);
            } else {
                this.LJLJLJ.invoke(Boolean.TRUE);
            }
        } else {
            this.LJLJLJ.invoke(Boolean.FALSE);
        }
        return C76800UCe.LIZ;
    }
}
