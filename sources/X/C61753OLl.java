package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OLl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61753OLl implements InterfaceC31687Cc7 {
    public final /* synthetic */ C61751OLj LIZ;

    public C61753OLl(C61751OLj c61751OLj) {
        this.LIZ = c61751OLj;
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View view, String str) {
        MutableLiveData<Boolean> mutableLiveData;
        C61751OLj c61751OLj = this.LIZ;
        if (c61751OLj.LJLJJLL == null) {
            c61751OLj.LJLJJLL = C40334FsI.LIZ(EnumC40336FsK.BeforeLive, new AqS176S0100000_10(c61751OLj, 233));
        }
        C61751OLj c61751OLj2 = this.LIZ;
        A72 a72 = c61751OLj2.LJLJJI;
        if (a72 != null) {
            AbstractC40333FsH abstractC40333FsH = c61751OLj2.LJLJJLL;
            if (abstractC40333FsH != null) {
                ActivityC45651qj context = a72.getContext();
                o.LJIIIIZZ(context, "it.context");
                abstractC40333FsH.LIZIZ(context);
            }
            java.util.Map<String, String> map = null;
            if (o.LJ(str, "before_live")) {
                C188727au c188727au = c61751OLj2.LJLLI;
                if (c188727au != null) {
                    c188727au.LJIIIZ("type", "toolbar");
                    map = c188727au.LIZ;
                }
                FMX.LJIIL("livesdk_add_links_click", map);
            } else if (o.LJ(str, "before_live_dialog_item")) {
                C188727au c188727au2 = c61751OLj2.LJLLI;
                if (c188727au2 != null) {
                    c188727au2.LJIIIZ("type", "subpage");
                    map = c188727au2.LIZ;
                }
                FMX.LJIIL("livesdk_add_links_click", map);
            }
            int i = c61751OLj2.LJLJI.getInt("business_links_before_live_red_click_times", 0);
            if (i == 0) {
                c61751OLj2.LJLJI.storeInt("business_links_before_live_icon_display_times", 6);
                IIconSlot.SlotViewModel slotViewModel = c61751OLj2.LJLJJL;
                if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLJJL) != null) {
                    mutableLiveData.setValue(Boolean.FALSE);
                }
            }
            c61751OLj2.LJLJI.storeInt("business_links_before_live_red_click_times", i + 1);
        }
    }
}
