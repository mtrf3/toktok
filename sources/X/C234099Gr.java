package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import kotlin.jvm.internal.AqS13S1101000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9Gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234099Gr extends AbstractC65781Prl implements InterfaceC88472Yns<Assembler, C76800UCe> {
    public final /* synthetic */ HeaderBaseContainerComponent LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C234109Gs LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ ProfileComponents LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C234099Gr(HeaderBaseContainerComponent headerBaseContainerComponent, String str, String str2, C234109Gs c234109Gs, int i, ProfileComponents profileComponents) {
        super(1);
        this.LJLIL = headerBaseContainerComponent;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = c234109Gs;
        this.LJLJJL = i;
        this.LJLJJLL = profileComponents;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Assembler assembler) {
        Assembler assemble = assembler;
        o.LJIIIZ(assemble, "$this$assemble");
        if (!this.LJLIL.F3(this.LJLILLLLZI)) {
            this.LJLIL.P3(this.LJLJI, this.LJLJJI.LIZIZ);
        } else {
            this.LJLIL.LJLJJL.put(this.LJLJI, Integer.valueOf(this.LJLJJL));
            if (this.LJLIL.LJLJJI.contains(this.LJLJI)) {
                this.LJLIL.H3(this.LJLJJL, this.LJLJJLL, this.LJLJI);
            } else {
                assemble.nv0(this.LJLIL, new AqS13S1101000_4(this.LJLJJL, this.LJLJJLL, this.LJLJI, 7));
                this.LJLIL.LJLJJI.add(this.LJLJI);
                this.LJLIL.O3(this.LJLJI);
                HeaderBaseContainerComponent headerBaseContainerComponent = this.LJLIL;
                assemble.wv0(headerBaseContainerComponent, new AqS47S1200000_4(this.LJLJJI, this.LJLJI, headerBaseContainerComponent, 43));
            }
        }
        return C76800UCe.LIZ;
    }
}
