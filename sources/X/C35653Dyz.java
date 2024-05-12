package X;

import Y.ARunnableS5S1300000_8;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.firstlike.FirstLikeToastData;
import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import defpackage.t1;
import kotlin.jvm.internal.o;

/* renamed from: X.Dyz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35653Dyz extends AbstractC73391SrD<E4G> {
    public final /* synthetic */ DiggPanelComponent LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    public C35653Dyz(DiggPanelComponent diggPanelComponent) {
        this.LJLILLLLZI = diggPanelComponent;
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        FirstLikeToastData firstLikeToastData;
        String str;
        ARunnableS5S1300000_8 aRunnableS5S1300000_8;
        E4G plugin = (E4G) obj;
        o.LJIIIZ(plugin, "plugin");
        IPluginService.PluginDataWrapper value = plugin.getValue();
        if (value == null || (firstLikeToastData = value.firstLikeToastdata) == null || (str = firstLikeToastData.text) == null || str.length() == 0) {
            return;
        }
        Integer num = firstLikeToastData.style;
        EnumC35454Dvm enumC35454Dvm = EnumC35454Dvm.TOP_DARK;
        int ordinal = enumC35454Dvm.ordinal();
        if (num == null || num.intValue() != ordinal) {
            enumC35454Dvm = EnumC35454Dvm.MID_DARK;
            int ordinal2 = enumC35454Dvm.ordinal();
            if (num == null || num.intValue() != ordinal2) {
                return;
            }
        }
        C35647Dyt c35647Dyt = new C35647Dyt(firstLikeToastData.text, enumC35454Dvm, firstLikeToastData.showDurationMs);
        String str2 = c35647Dyt.LIZ;
        EnumC35454Dvm enumC35454Dvm2 = c35647Dyt.LIZIZ;
        Long l = c35647Dyt.LIZJ;
        DiggPanelComponent diggPanelComponent = this.LJLILLLLZI;
        diggPanelComponent.LJLLI = new ARunnableS5S1300000_8(diggPanelComponent, l, str2, enumC35454Dvm2, 0);
        if ((IW7.LJ() == 0 && !t1.LJI()) || (aRunnableS5S1300000_8 = this.LJLILLLLZI.LJLLI) == null) {
            return;
        }
        aRunnableS5S1300000_8.run();
        this.LJLILLLLZI.LJLLI = null;
    }
}
