package X;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.T6v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74113T6v extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, EnumC74116T6y, C76800UCe> {
    public final /* synthetic */ ViewPager LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74113T6v(ViewPager viewPager, int i) {
        super(2);
        this.LJLIL = viewPager;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem selectSubscribe, EnumC74116T6y event) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(event, "event");
        if (event == EnumC74116T6y.PUBLISH_SUCCEED) {
            this.LJLIL.setCurrentItem(this.LJLILLLLZI, true);
        }
        return C76800UCe.LIZ;
    }
}
